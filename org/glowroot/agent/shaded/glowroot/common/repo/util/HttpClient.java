/*
 * Copyright 2017 the original author or authors.
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
package org.glowroot.agent.shaded.glowroot.common.repo.util;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.URI;

import javax.annotation.Nullable;

import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.netty.bootstrap.Bootstrap;
import org.glowroot.agent.shaded.netty.buffer.Unpooled;
import org.glowroot.agent.shaded.netty.channel.Channel;
import org.glowroot.agent.shaded.netty.channel.ChannelHandlerContext;
import org.glowroot.agent.shaded.netty.channel.ChannelInitializer;
import org.glowroot.agent.shaded.netty.channel.ChannelPipeline;
import org.glowroot.agent.shaded.netty.channel.EventLoopGroup;
import org.glowroot.agent.shaded.netty.channel.SimpleChannelInboundHandler;
import org.glowroot.agent.shaded.netty.channel.nio.NioEventLoopGroup;
import org.glowroot.agent.shaded.netty.channel.socket.SocketChannel;
import org.glowroot.agent.shaded.netty.channel.socket.nio.NioSocketChannel;
import org.glowroot.agent.shaded.netty.handler.codec.http.DefaultFullHttpRequest;
import org.glowroot.agent.shaded.netty.handler.codec.http.HttpClientCodec;
import org.glowroot.agent.shaded.netty.handler.codec.http.HttpContent;
import org.glowroot.agent.shaded.netty.handler.codec.http.HttpHeaderNames;
import org.glowroot.agent.shaded.netty.handler.codec.http.HttpHeaderValues;
import org.glowroot.agent.shaded.netty.handler.codec.http.HttpMethod;
import org.glowroot.agent.shaded.netty.handler.codec.http.HttpObject;
import org.glowroot.agent.shaded.netty.handler.codec.http.HttpObjectAggregator;
import org.glowroot.agent.shaded.netty.handler.codec.http.HttpRequest;
import org.glowroot.agent.shaded.netty.handler.codec.http.HttpResponse;
import org.glowroot.agent.shaded.netty.handler.codec.http.HttpResponseStatus;
import org.glowroot.agent.shaded.netty.handler.codec.http.HttpVersion;
import org.glowroot.agent.shaded.netty.handler.proxy.HttpProxyHandler;
import org.glowroot.agent.shaded.netty.handler.ssl.SslContext;
import org.glowroot.agent.shaded.netty.handler.ssl.SslContextBuilder;
import org.glowroot.agent.shaded.netty.util.CharsetUtil;
import org.checkerframework.checker.nullness.qual.MonotonicNonNull;
import org.glowroot.agent.shaded.slf4j.Logger;
import org.glowroot.agent.shaded.slf4j.LoggerFactory;

import org.glowroot.agent.shaded.glowroot.common.config.HttpProxyConfig;
import org.glowroot.agent.shaded.glowroot.common.repo.ConfigRepository;

import static org.glowroot.agent.shaded.google.common.base.Preconditions.checkNotNull;

public class HttpClient {

    private static final Logger logger = LoggerFactory.getLogger(HttpClient.class);

    private final ConfigRepository configRepository;

    public HttpClient(ConfigRepository configRepository) {
        this.configRepository = configRepository;
    }

    public void get(String url) throws Exception {
        postOrGet(url, null, null, configRepository.getHttpProxyConfig(), null);
    }

    // optional passwordOverride can be passed in to test HTTP proxy from
    // AdminJsonService.sentTestHttpProxyRequest() without possibility of throwing
    // org.glowroot.agent.shaded.glowroot.common.repo.util.LazySecretKey.SymmetricEncryptionKeyMissingException
    public String getWithHttpProxyConfigOverride(String url,
            HttpProxyConfig httpProxyConfig, @Nullable String passwordOverride) throws Exception {
        return postOrGet(url, null, null, httpProxyConfig, passwordOverride);
    }

    void post(String url, byte[] content, String contentType) throws Exception {
        postOrGet(url, content, contentType, configRepository.getHttpProxyConfig(), null);
    }

    private String postOrGet(String url, byte /*@Nullable*/ [] content,
            @Nullable String contentType, final HttpProxyConfig httpProxyConfig,
            final @Nullable String passwordOverride) throws Exception {
        URI uri = new URI(url);
        String scheme = checkNotNull(uri.getScheme());
        final boolean ssl = scheme.equalsIgnoreCase("https");
        final String host = checkNotNull(uri.getHost());
        final int port;
        if (uri.getPort() == -1) {
            port = ssl ? 443 : 80;
        } else {
            port = uri.getPort();
        }
        EventLoopGroup group = new NioEventLoopGroup();
        try {
            Bootstrap bootstrap = new Bootstrap();
            final HttpClientHandler handler = new HttpClientHandler();
            bootstrap.group(group)
                    .channel(NioSocketChannel.class)
                    .handler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        protected void initChannel(SocketChannel ch) throws Exception {
                            ChannelPipeline p = ch.pipeline();
                            addProxyHandlerIfNeeded(p, httpProxyConfig, passwordOverride);
                            if (ssl) {
                                SslContext sslContext = SslContextBuilder.forClient().build();
                                p.addLast(sslContext.newHandler(ch.alloc(), host, port));
                            }
                            p.addLast(new HttpClientCodec());
                            p.addLast(new HttpObjectAggregator(1048576));
                            p.addLast(handler);
                        }
                    });
            HttpRequest request;
            if (content == null) {
                request = new DefaultFullHttpRequest(HttpVersion.HTTP_1_1, HttpMethod.GET,
                        uri.getRawPath());
            } else {
                request = new DefaultFullHttpRequest(HttpVersion.HTTP_1_1, HttpMethod.POST,
                        uri.getRawPath(), Unpooled.wrappedBuffer(content));
                request.headers().set(HttpHeaderNames.CONTENT_TYPE, checkNotNull(contentType));
                request.headers().set(HttpHeaderNames.CONTENT_LENGTH, content.length);
            }
            request.headers().set(HttpHeaderNames.HOST, host);
            request.headers().set(HttpHeaderNames.CONNECTION, HttpHeaderValues.CLOSE);
            Channel ch = bootstrap.connect(host, port).sync().channel();
            ch.writeAndFlush(request);
            ch.closeFuture().sync();

            String unexpectedErrorMessage = handler.unexpectedErrorMessage;
            if (unexpectedErrorMessage != null) {
                throw new IOException(unexpectedErrorMessage);
            }
            HttpResponseStatus responseStatus = checkNotNull(handler.responseStatus);
            int statusCode = responseStatus.code();
            if (statusCode < 200 || statusCode >= 300) {
                throw new IOException("Unexpected response status code: " + statusCode);
            }
            return checkNotNull(handler.responseContent);
        } finally {
            group.shutdownGracefully();
        }
    }

    private void addProxyHandlerIfNeeded(ChannelPipeline pipeline, HttpProxyConfig httpProxyConfig,
            @Nullable String passwordOverride) throws Exception {
        String proxyHost = httpProxyConfig.host();
        if (proxyHost.isEmpty()) {
            return;
        }
        int proxyPort = MoreObjects.firstNonNull(httpProxyConfig.port(), 80);
        SocketAddress proxyAddress = new InetSocketAddress(proxyHost, proxyPort);
        String username = httpProxyConfig.username();
        if (username.isEmpty()) {
            pipeline.addLast(new HttpProxyHandler(proxyAddress));
        } else {
            String password = getPassword(httpProxyConfig, passwordOverride);
            pipeline.addLast(new HttpProxyHandler(proxyAddress, username, password));
        }
    }

    private String getPassword(HttpProxyConfig httpProxyConfig, @Nullable String passwordOverride)
            throws Exception {
        if (passwordOverride != null) {
            return passwordOverride;
        }
        String password = httpProxyConfig.password();
        if (password.isEmpty()) {
            return "";
        }
        return Encryption.decrypt(password, configRepository.getLazySecretKey());
    }

    private static class HttpClientHandler extends SimpleChannelInboundHandler<HttpObject> {

        private volatile @MonotonicNonNull HttpResponseStatus responseStatus;
        private volatile @Nullable String responseContent;
        private volatile @Nullable String unexpectedErrorMessage;

        @Override
        public void channelRead0(ChannelHandlerContext ctx, HttpObject msg) {
            if (msg instanceof HttpResponse && msg instanceof HttpContent) {
                responseStatus = ((HttpResponse) msg).status();
                responseContent = ((HttpContent) msg).content().toString(CharsetUtil.UTF_8);
            } else {
                unexpectedErrorMessage = "Unexpected response message class: " + msg.getClass();
            }
        }

        @Override
        public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
            logger.error(cause.getMessage(), cause);
            unexpectedErrorMessage = cause.getMessage();
            ctx.close();
        }
    }
}
