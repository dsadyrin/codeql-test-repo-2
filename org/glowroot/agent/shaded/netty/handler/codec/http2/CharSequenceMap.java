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
package org.glowroot.agent.shaded.netty.handler.codec.http2;

import org.glowroot.agent.shaded.netty.handler.codec.DefaultHeaders;
import org.glowroot.agent.shaded.netty.handler.codec.UnsupportedValueConverter;
import org.glowroot.agent.shaded.netty.handler.codec.ValueConverter;
import org.glowroot.agent.shaded.netty.util.internal.UnstableApi;

import static org.glowroot.agent.shaded.netty.util.AsciiString.CASE_INSENSITIVE_HASHER;
import static org.glowroot.agent.shaded.netty.util.AsciiString.CASE_SENSITIVE_HASHER;

/**
 * Internal use only!
 */
@UnstableApi
public final class CharSequenceMap<V> extends DefaultHeaders<CharSequence, V, CharSequenceMap<V>> {
    public CharSequenceMap() {
        this(true);
    }

    public CharSequenceMap(boolean caseSensitive) {
        this(caseSensitive, UnsupportedValueConverter.<V>instance());
    }

    public CharSequenceMap(boolean caseSensitive, ValueConverter<V> valueConverter) {
        super(caseSensitive ? CASE_SENSITIVE_HASHER : CASE_INSENSITIVE_HASHER, valueConverter);
    }

    @SuppressWarnings("unchecked")
    public CharSequenceMap(boolean caseSensitive, ValueConverter<V> valueConverter, int arraySizeHint) {
        super(caseSensitive ? CASE_SENSITIVE_HASHER : CASE_INSENSITIVE_HASHER, valueConverter,
                NameValidator.NOT_NULL, arraySizeHint);
    }
}
