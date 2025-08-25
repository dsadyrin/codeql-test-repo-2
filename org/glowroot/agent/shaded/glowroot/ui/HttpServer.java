/*
 * Copyright 2011-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.glowroot.agent.shaded.glowroot.ui;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.InetSocketAddress;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

import javax.annotation.Nullable;

import org.glowroot.agent.shaded.google.common.base.Supplier;
import org.glowroot.agent.shaded.google.common.util.concurrent.ThreadFactoryBuilder;
import org.glowroot.agent.shaded.netty.bootstrap.ServerBootstrap;
import org.glowroot.agent.shaded.netty.channel.Channel;
import org.glowroot.agent.shaded.netty.channel.ChannelInitializer;
import org.glowroot.agent.shaded.netty.channel.ChannelPipeline;
import org.glowroot.agent.shaded.netty.channel.EventLoopGroup;
import org.glowroot.agent.shaded.netty.channel.nio.NioEventLoopGroup;
import org.glowroot.agent.shaded.netty.channel.socket.SocketChannel;
import org.glowroot.agent.shaded.netty.channel.socket.nio.NioServerSocketChannel;
import org.glowroot.agent.shaded.netty.handler.codec.http.HttpObjectAggregator;
import org.glowroot.agent.shaded.netty.handler.codec.http.HttpServerCodec;
import org.glowroot.agent.shaded.netty.handler.ssl.SslContext;
import org.glowroot.agent.shaded.netty.handler.ssl.SslContextBuilder;
import org.glowroot.agent.shaded.netty.handler.stream.ChunkedWriteHandler;
import org.glowroot.agent.shaded.netty.util.internal.logging.InternalLoggerFactory;
import org.glowroot.agent.shaded.netty.util.internal.logging.Slf4JLoggerFactory;
import org.checkerframework.checker.nullness.qual.MonotonicNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.glowroot.agent.shaded.slf4j.Logger;
import org.glowroot.agent.shaded.slf4j.LoggerFactory;

import static org.glowroot.agent.shaded.google.common.base.Preconditions.checkNotNull;

class HttpServer {

    private static final Logger logger = LoggerFactory.getLogger(HttpServer.class);

    // log startup messages using logger name "org.glowroot"
    private static final Logger startupLogger = LoggerFactory.getLogger("org.glowroot");

    private final ServerBootstrap bootstrap;
    private final HttpServerHandler handler;
    private final EventLoopGroup bossGroup;
    private final EventLoopGroup workerGroup;

    private final String bindAddress;
    private final File confDir;
    private final @Nullable File sharedConfDir;

    private volatile @Nullable SslContext sslContext;
    private volatile @MonotonicNonNull Channel serverChannel;
    private volatile @MonotonicNonNull Integer port;

    HttpServer(String bindAddress, boolean https, Supplier<String> contextPathSupplier,
            int numWorkerThreads, CommonHandler commonHandler, File confDir,
            @Nullable File sharedConfDir) throws Exception {

        InternalLoggerFactory.setDefaultFactory(Slf4JLoggerFactory.INSTANCE);

        ThreadFactory bossThreadFactory = new ThreadFactoryBuilder()
                .setDaemon(true)
                .setNameFormat("Glowroot-Http-Boss")
                .build();
        ThreadFactory workerThreadFactory = new ThreadFactoryBuilder()
                .setDaemon(true)
                .setNameFormat("Glowroot-Http-Worker-%d")
                .build();
        bossGroup = new NioEventLoopGroup(1, bossThreadFactory);
        workerGroup = new NioEventLoopGroup(numWorkerThreads, workerThreadFactory);

        final HttpServerHandler handler = new HttpServerHandler(contextPathSupplier, commonHandler);

        if (https) {
            sslContext = SslContextBuilder
                    .forServer(getHttpsConfFile(confDir, sharedConfDir, "certificate.pem"),
                            getHttpsConfFile(confDir, sharedConfDir, "private.pem"))
                    .build();
        }
        this.confDir = confDir;
        this.sharedConfDir = sharedConfDir;

        bootstrap = new ServerBootstrap();
        bootstrap.group(bossGroup, workerGroup).channel(NioServerSocketChannel.class)
                .childHandler(new ChannelInitializer<SocketChannel>() {
                    @Override
                    protected void initChannel(SocketChannel ch) throws Exception {
                        ChannelPipeline p = ch.pipeline();
                        SslContext sslContextLocal = sslContext;
                        if (sslContextLocal != null) {
                            p.addLast(sslContextLocal.newHandler(ch.alloc()));
                        }
                        // bumping maxInitialLineLength (first arg below) from default 4096 to 32768
                        // in order to handle long urls on /jvm/gauges view
                        // bumping maxHeaderSize (second arg below) from default 8192 to 32768 for
                        // same reason due to "Referer" header once url becomes huge
                        // leaving maxChunkSize (third arg below) at default 8192
                        p.addLast(new HttpServerCodec(32768, 32768, 8192));
                        p.addLast(new HttpObjectAggregator(1048576));
                        p.addLast(new ConditionalHttpContentCompressor());
                        p.addLast(new ChunkedWriteHandler());
                        p.addLast(handler);
                    }
                });
        this.handler = handler;
        this.bindAddress = bindAddress;
    }

    void bindEventually(int port) {
        try {
            serverChannel =
                    bootstrap.bind(new InetSocketAddress(bindAddress, port)).sync().channel();
            onBindSuccess();
        } catch (Exception e) {
            // FailedChannelFuture.sync() is using UNSAFE to re-throw checked exceptions
            logger.debug(e.getMessage(), e);
            startupLogger.error("Error binding to {}:{}, the UI is not available (will keep trying"
                    + " to bind...): {}", bindAddress, port, e.getMessage());
            ThreadFactory threadFactory = new ThreadFactoryBuilder()
                    .setDaemon(true)
                    .setNameFormat("Glowroot-Init-Bind")
                    .build();
            Executors.newSingleThreadExecutor(threadFactory).execute(new BindEventually(port));
        }
    }

    @RequiresNonNull("serverChannel")
    private void onBindSuccess() {
        port = ((InetSocketAddress) serverChannel.localAddress()).getPort();
        if (bindAddress.equals("127.0.0.1")) {
            startupLogger.info("UI listening on {}:{} (to access the UI from remote machines,"
                    + " change the bind address to 0.0.0.0, either in the Glowroot UI under"
                    + " Configuration > Web or directly in the admin.json file, and then restart"
                    + " JVM to take effect)", bindAddress, port);
        } else {
            startupLogger.info("UI listening on {}:{}", bindAddress, port);
        }
    }

    String getBindAddress() {
        return bindAddress;
    }

    @Nullable
    Integer getPort() {
        return port;
    }

    boolean getHttps() {
        return sslContext != null;
    }

    void changePort(int newPort) throws Exception {
        checkNotNull(serverChannel);
        Channel previousServerChannel = serverChannel;
        InetSocketAddress localAddress = new InetSocketAddress(bindAddress, newPort);
        try {
            serverChannel = bootstrap.bind(localAddress).sync().channel();
        } catch (Exception e) {
            // FailedChannelFuture.sync() is using UNSAFE to re-throw checked exceptions
            throw new PortChangeFailedException(e);
        }
        port = newPort;
        previousServerChannel.close();
        handler.closeAllButCurrent();
    }

    void changeProtocol(boolean https) throws Exception {
        if (https) {
            sslContext = SslContextBuilder
                    .forServer(getHttpsConfFile(confDir, sharedConfDir, "certificate.pem"),
                            getHttpsConfFile(confDir, sharedConfDir, "private.pem"))
                    .build();
        } else {
            sslContext = null;
        }
        handler.closeAllButCurrent();
    }

    // used by tests and by central ui
    void close() {
        logger.debug("close(): stopping http server");
        workerGroup.shutdownGracefully();
        bossGroup.shutdownGracefully();
        logger.debug("close(): http server stopped");
    }

    private static File getHttpsConfFile(File confDir, @Nullable File sharedConfDir,
            String fileName) throws FileNotFoundException {
        File confFile = new File(confDir, fileName);
        if (confFile.exists()) {
            return confFile;
        }
        if (sharedConfDir == null) {
            throw new FileNotFoundException("https is enabled, but " + fileName
                    + " was not found under '" + confDir.getAbsolutePath() + "'");
        } else {
            File sharedConfFile = new File(sharedConfDir, fileName);
            if (sharedConfFile.exists()) {
                return sharedConfFile;
            }
            throw new FileNotFoundException("https is enabled, but " + fileName
                    + " was not found under either '" + confDir.getAbsolutePath() + "' or '"
                    + sharedConfFile.getAbsolutePath() + "'");
        }
    }

    private class BindEventually implements Runnable {

        private final int port;

        private BindEventually(int port) {
            this.port = port;
        }

        @Override
        public void run() {
            long backoffMillis = 1000;
            while (true) {
                try {
                    Thread.sleep(backoffMillis);
                } catch (InterruptedException f) {
                    Thread.currentThread().interrupt();
                    return;
                }
                backoffMillis = Math.min(backoffMillis * 2, 60000);
                try {
                    serverChannel = bootstrap.bind(new InetSocketAddress(bindAddress, port)).sync()
                            .channel();
                    onBindSuccess();
                    return;
                } catch (Exception e) {
                    startupLogger.error("Error binding to {}:{}, the UI is not available (will keep"
                            + " trying to bind...): {}", bindAddress, port, e.getMessage());
                    // FailedChannelFuture.sync() is using UNSAFE to re-throw checked exceptions
                    logger.debug(e.getMessage(), e);
                }
            }
        }
    }

    @SuppressWarnings("serial")
    static class PortChangeFailedException extends Exception {
        private PortChangeFailedException(Exception cause) {
            super(cause);
        }
    }
}
