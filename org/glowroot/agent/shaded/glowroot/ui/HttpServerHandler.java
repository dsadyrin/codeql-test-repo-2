/*
 * Copyright 2013-2017 the original author or authors.
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

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.annotation.Nullable;

import org.glowroot.agent.shaded.google.common.annotations.VisibleForTesting;
import org.glowroot.agent.shaded.google.common.base.Charsets;
import org.glowroot.agent.shaded.google.common.base.Strings;
import org.glowroot.agent.shaded.google.common.base.Supplier;
import org.glowroot.agent.shaded.google.common.collect.ImmutableList;
import org.glowroot.agent.shaded.google.common.net.MediaType;
import org.glowroot.agent.shaded.netty.buffer.ByteBuf;
import org.glowroot.agent.shaded.netty.channel.Channel;
import org.glowroot.agent.shaded.netty.channel.ChannelFuture;
import org.glowroot.agent.shaded.netty.channel.ChannelFutureListener;
import org.glowroot.agent.shaded.netty.channel.ChannelHandler.Sharable;
import org.glowroot.agent.shaded.netty.channel.ChannelHandlerContext;
import org.glowroot.agent.shaded.netty.channel.ChannelInboundHandlerAdapter;
import org.glowroot.agent.shaded.netty.channel.group.ChannelGroup;
import org.glowroot.agent.shaded.netty.channel.group.DefaultChannelGroup;
import org.glowroot.agent.shaded.netty.handler.codec.http.DefaultFullHttpResponse;
import org.glowroot.agent.shaded.netty.handler.codec.http.DefaultHttpResponse;
import org.glowroot.agent.shaded.netty.handler.codec.http.EmptyHttpHeaders;
import org.glowroot.agent.shaded.netty.handler.codec.http.FullHttpRequest;
import org.glowroot.agent.shaded.netty.handler.codec.http.FullHttpResponse;
import org.glowroot.agent.shaded.netty.handler.codec.http.HttpContent;
import org.glowroot.agent.shaded.netty.handler.codec.http.HttpHeaderNames;
import org.glowroot.agent.shaded.netty.handler.codec.http.HttpHeaderValues;
import org.glowroot.agent.shaded.netty.handler.codec.http.HttpResponse;
import org.glowroot.agent.shaded.netty.handler.codec.http.HttpUtil;
import org.glowroot.agent.shaded.netty.handler.codec.http.QueryStringDecoder;
import org.glowroot.agent.shaded.netty.handler.stream.ChunkedInput;
import org.glowroot.agent.shaded.netty.util.concurrent.GlobalEventExecutor;
import org.glowroot.agent.shaded.slf4j.Logger;
import org.glowroot.agent.shaded.slf4j.LoggerFactory;

import org.glowroot.agent.shaded.glowroot.ui.CommonHandler.CommonRequest;
import org.glowroot.agent.shaded.glowroot.ui.CommonHandler.CommonResponse;

import static org.glowroot.agent.shaded.netty.handler.codec.http.HttpResponseStatus.BAD_REQUEST;
import static org.glowroot.agent.shaded.netty.handler.codec.http.HttpResponseStatus.FOUND;
import static org.glowroot.agent.shaded.netty.handler.codec.http.HttpResponseStatus.INTERNAL_SERVER_ERROR;
import static org.glowroot.agent.shaded.netty.handler.codec.http.HttpResponseStatus.OK;
import static org.glowroot.agent.shaded.netty.handler.codec.http.HttpVersion.HTTP_1_1;

@Sharable
class HttpServerHandler extends ChannelInboundHandlerAdapter {

    private static final Logger logger = LoggerFactory.getLogger(HttpServerHandler.class);

    private final ChannelGroup allChannels;

    private final Supplier<String> contextPathSupplier;

    private final CommonHandler commonHandler;

    private final ThreadLocal</*@Nullable*/ Channel> currentChannel =
            new ThreadLocal</*@Nullable*/ Channel>();

    HttpServerHandler(Supplier<String> contextPathSupplier, CommonHandler commonHandler) {
        this.contextPathSupplier = contextPathSupplier;
        this.commonHandler = commonHandler;
        allChannels = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        allChannels.add(ctx.channel());
        super.channelActive(ctx);
    }

    void closeAllButCurrent() throws InterruptedException {
        Channel current = currentChannel.get();
        for (Channel channel : allChannels) {
            if (channel != current) {
                channel.close().await();
            }
        }
    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) {
        ctx.flush();
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        FullHttpRequest request = (FullHttpRequest) msg;
        if (request.decoderResult().isFailure()) {
            CommonResponse response = new CommonResponse(BAD_REQUEST, MediaType.PLAIN_TEXT_UTF_8,
                    Strings.nullToEmpty(request.decoderResult().cause().getMessage()));
            sendResponse(ctx, request, response, false);
            return;
        }
        String uri = request.uri();
        logger.debug("channelRead(): request.uri={}", uri);
        Channel channel = ctx.channel();
        currentChannel.set(channel);
        try {
            String contextPath = contextPathSupplier.get();
            boolean keepAlive = HttpUtil.isKeepAlive(request);
            if (!uri.startsWith(contextPath)) {
                DefaultFullHttpResponse response = new DefaultFullHttpResponse(HTTP_1_1, FOUND);
                response.headers().set(HttpHeaderNames.LOCATION, contextPath);
                sendFullResponse(ctx, request, response, keepAlive);
                return;
            }
            QueryStringDecoder decoder = new QueryStringDecoder(stripContextPath(uri, contextPath));
            CommonRequest commonRequest = new NettyRequest(request, contextPath, decoder);
            CommonResponse response = commonHandler.handle(commonRequest);
            if (response.isCloseConnectionAfterPortChange()) {
                response.setHeader("Connection", "close");
                keepAlive = false;
            }
            sendResponse(ctx, request, response, keepAlive);
        } catch (Exception e) {
            logger.error("error handling request {}: {}", uri, e.getMessage(), e);
            CommonResponse response =
                    CommonHandler.newHttpResponseWithStackTrace(e, INTERNAL_SERVER_ERROR, null);
            sendResponse(ctx, request, response, false);
        } finally {
            currentChannel.remove();
            request.release();
        }
    }

    private void sendResponse(ChannelHandlerContext ctx, FullHttpRequest request,
            CommonResponse response, boolean keepAlive) throws IOException {
        Object content = response.getContent();
        if (content instanceof ByteBuf) {
            FullHttpResponse resp = new DefaultFullHttpResponse(HTTP_1_1, response.getStatus(),
                    (ByteBuf) content, response.getHeaders(), EmptyHttpHeaders.INSTANCE);
            sendFullResponse(ctx, request, resp, keepAlive);
        } else if (content instanceof ChunkSource) {
            HttpResponse resp = new DefaultHttpResponse(HTTP_1_1, OK, response.getHeaders());
            resp.headers().set(HttpHeaderNames.TRANSFER_ENCODING, HttpHeaderValues.CHUNKED);
            ctx.write(resp);
            ChunkSource chunkSource = (ChunkSource) content;
            ChunkedInput<HttpContent> chunkedInput;
            String zipFileName = response.getZipFileName();
            if (zipFileName == null) {
                chunkedInput = ChunkedInputs.create(chunkSource);
            } else {
                chunkedInput = ChunkedInputs.createZipFileDownload(chunkSource, zipFileName);
            }
            ChannelFuture future = ctx.write(chunkedInput);
            HttpServices.addErrorListener(future);
            if (!keepAlive) {
                HttpServices.addCloseListener(future);
            }
        } else {
            throw new IllegalStateException("Unexpected content: " + content.getClass().getName());
        }
    }

    @SuppressWarnings("argument.type.incompatible")
    private void sendFullResponse(ChannelHandlerContext ctx, FullHttpRequest request,
            FullHttpResponse response, boolean keepAlive) {
        response.headers().add(HttpHeaderNames.CONTENT_LENGTH, response.content().readableBytes());
        if (keepAlive && !request.protocolVersion().isKeepAliveDefault()) {
            response.headers().set(HttpHeaderNames.CONNECTION, HttpHeaderValues.KEEP_ALIVE);
        }
        ChannelFuture f = ctx.write(response);
        if (!keepAlive) {
            f.addListener(ChannelFutureListener.CLOSE);
        }
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        if (HttpServices.shouldLogException(cause)) {
            logger.warn(cause.getMessage(), cause);
        }
        ctx.close();
    }

    @VisibleForTesting
    static String stripContextPath(String path, String contextPath) {
        if (contextPath.equals("/")) {
            return path;
        }
        if (path.equals(contextPath)) {
            return "/";
        }
        return path.substring(contextPath.length());
    }

    private static class NettyRequest implements CommonRequest {

        private final FullHttpRequest request;
        private final String contextPath;
        private final QueryStringDecoder decoder;

        NettyRequest(FullHttpRequest request, String contextPath, QueryStringDecoder decoder) {
            this.request = request;
            this.contextPath = contextPath;
            this.decoder = decoder;
        }

        @Override
        public String getMethod() {
            return request.method().name();
        }

        // includes context path
        @Override
        public String getUri() {
            return request.uri();
        }

        @Override
        public String getContextPath() {
            return contextPath;
        }

        // does not include context path
        @Override
        public String getPath() {
            return decoder.path();
        }

        @Override
        public @Nullable String getHeader(CharSequence name) {
            return request.headers().getAsString(name);
        }

        @Override
        public Map<String, List<String>> getParameters() {
            return decoder.parameters();
        }

        @Override
        public List<String> getParameters(String name) {
            List<String> params = decoder.parameters().get(name);
            if (params == null) {
                return ImmutableList.of();
            } else {
                return params;
            }
        }

        @Override
        public String getContent() {
            return request.content().toString(Charsets.UTF_8);
        }
    }
}
