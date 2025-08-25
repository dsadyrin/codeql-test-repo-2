package org.glowroot.agent.shaded.fasterxml.jackson.datatype.guava.deser.multimap.set;

import org.glowroot.agent.shaded.fasterxml.jackson.databind.JsonDeserializer;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.KeyDeserializer;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.type.MapLikeType;
import org.glowroot.agent.shaded.fasterxml.jackson.datatype.guava.deser.multimap.GuavaMultimapDeserializer;
import org.glowroot.agent.shaded.google.common.collect.HashMultimap;

import java.lang.reflect.Method;

/**
 * Provides deserialization for the Guava HashMultimap class.
 *
 * @author mvolkhart
 */
public class HashMultimapDeserializer extends GuavaMultimapDeserializer<HashMultimap<Object,
        Object>> {

    public HashMultimapDeserializer(MapLikeType type, KeyDeserializer keyDeserializer,
            TypeDeserializer elementTypeDeserializer, JsonDeserializer<?> elementDeserializer) {
        super(type, keyDeserializer, elementTypeDeserializer, elementDeserializer);
    }

    public HashMultimapDeserializer(MapLikeType type, KeyDeserializer keyDeserializer,
            TypeDeserializer elementTypeDeserializer, JsonDeserializer<?> elementDeserializer,
            Method creatorMethod) {
        super(type, keyDeserializer, elementTypeDeserializer, elementDeserializer, creatorMethod);
    }

    @Override
    protected HashMultimap<Object, Object> createMultimap() {
        return HashMultimap.create();
    }

    @Override
    protected JsonDeserializer<?> _createContextual(MapLikeType type,
            KeyDeserializer keyDeserializer, TypeDeserializer typeDeserializer,
            JsonDeserializer<?> elementDeserializer, Method method) {
        return new HashMultimapDeserializer(type, keyDeserializer, typeDeserializer,
                elementDeserializer, method);
    }
}
