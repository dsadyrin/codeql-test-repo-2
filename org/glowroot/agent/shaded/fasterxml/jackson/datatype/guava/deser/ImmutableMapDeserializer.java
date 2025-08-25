package org.glowroot.agent.shaded.fasterxml.jackson.datatype.guava.deser;


import org.glowroot.agent.shaded.fasterxml.jackson.databind.JsonDeserializer;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.KeyDeserializer;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.type.MapType;
import org.glowroot.agent.shaded.google.common.collect.ImmutableMap;

public class ImmutableMapDeserializer
 extends GuavaImmutableMapDeserializer<ImmutableMap<Object, Object>>
{
    public ImmutableMapDeserializer(MapType type, KeyDeserializer keyDeser,
            TypeDeserializer typeDeser, JsonDeserializer<?> deser)
    {
        super(type, keyDeser, typeDeser, deser);
    }

    @Override
    public ImmutableMapDeserializer withResolved(KeyDeserializer keyDeser,
            TypeDeserializer typeDeser, JsonDeserializer<?> valueDeser) {
        return new ImmutableMapDeserializer(_mapType, keyDeser,
                typeDeser, valueDeser);
    }
    
    @Override
    protected ImmutableMap.Builder<Object, Object> createBuilder() {
        return ImmutableMap.builder();
    }

}
