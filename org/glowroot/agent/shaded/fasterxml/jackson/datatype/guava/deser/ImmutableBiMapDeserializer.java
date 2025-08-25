package org.glowroot.agent.shaded.fasterxml.jackson.datatype.guava.deser;

import org.glowroot.agent.shaded.fasterxml.jackson.databind.JsonDeserializer;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.KeyDeserializer;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.type.MapType;
import org.glowroot.agent.shaded.google.common.collect.ImmutableBiMap;
import org.glowroot.agent.shaded.google.common.collect.ImmutableMap.Builder;

public class ImmutableBiMapDeserializer extends GuavaImmutableMapDeserializer<ImmutableBiMap<Object, Object>> {
    public ImmutableBiMapDeserializer(MapType type, KeyDeserializer keyDeser, TypeDeserializer typeDeser,
            JsonDeserializer<?> deser) {
        super(type, keyDeser, typeDeser, deser);
    }

    @Override
    protected Builder<Object, Object> createBuilder() {
        return ImmutableBiMap.builder();
    }

    @Override
    public GuavaMapDeserializer<ImmutableBiMap<Object, Object>> withResolved(KeyDeserializer keyDeser,
            TypeDeserializer typeDeser, JsonDeserializer<?> valueDeser) {
        return new ImmutableBiMapDeserializer(_mapType, keyDeser, typeDeser, valueDeser);
    }
}
