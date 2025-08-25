/*
 * Copyright 2015 The Netty Project
 *
 * The Netty Project licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package org.glowroot.agent.shaded.netty.handler.codec.rtsp;

import static org.glowroot.agent.shaded.netty.handler.codec.http.HttpConstants.CR;
import static org.glowroot.agent.shaded.netty.handler.codec.http.HttpConstants.LF;
import static org.glowroot.agent.shaded.netty.handler.codec.http.HttpConstants.SP;
import org.glowroot.agent.shaded.netty.buffer.ByteBuf;
import org.glowroot.agent.shaded.netty.handler.codec.UnsupportedMessageTypeException;
import org.glowroot.agent.shaded.netty.handler.codec.http.HttpContent;
import org.glowroot.agent.shaded.netty.handler.codec.http.HttpHeaders;
import org.glowroot.agent.shaded.netty.handler.codec.http.HttpMessage;
import org.glowroot.agent.shaded.netty.handler.codec.http.HttpObjectEncoder;
import org.glowroot.agent.shaded.netty.handler.codec.http.HttpRequest;
import org.glowroot.agent.shaded.netty.handler.codec.http.HttpResponse;
import org.glowroot.agent.shaded.netty.util.CharsetUtil;
import org.glowroot.agent.shaded.netty.util.internal.StringUtil;

/**
 * Encodes an RTSP message represented in {@link HttpMessage} or an {@link HttpContent} into
 * a {@link ByteBuf}.
 */
public class RtspEncoder extends HttpObjectEncoder<HttpMessage> {
    /**
     * Constant for CRLF.
     */
    private static final byte[] CRLF = {CR, LF};

    @Override
    public boolean acceptOutboundMessage(final Object msg)
           throws Exception {
        return super.acceptOutboundMessage(msg) && ((msg instanceof HttpRequest) || (msg instanceof HttpResponse));
    }

    @Override
    protected void encodeInitialLine(final ByteBuf buf, final HttpMessage message)
           throws Exception {
        if (message instanceof HttpRequest) {
            HttpRequest request = (HttpRequest) message;
            HttpHeaders.encodeAscii(request.method().toString(), buf);
            buf.writeByte(SP);
            buf.writeBytes(request.uri().getBytes(CharsetUtil.UTF_8));
            buf.writeByte(SP);
            HttpHeaders.encodeAscii(request.protocolVersion().toString(), buf);
            buf.writeBytes(CRLF);
        } else if (message instanceof HttpResponse) {
            HttpResponse response = (HttpResponse) message;
            HttpHeaders.encodeAscii(response.protocolVersion().toString(),
                                    buf);
            buf.writeByte(SP);
            buf.writeBytes(String.valueOf(response.status().code())
                                 .getBytes(CharsetUtil.US_ASCII));
            buf.writeByte(SP);
            HttpHeaders.encodeAscii(String.valueOf(response.status().reasonPhrase()),
                                    buf);
            buf.writeBytes(CRLF);
        } else {
            throw new UnsupportedMessageTypeException("Unsupported type "
                                + StringUtil.simpleClassName(message));
        }
    }
}
