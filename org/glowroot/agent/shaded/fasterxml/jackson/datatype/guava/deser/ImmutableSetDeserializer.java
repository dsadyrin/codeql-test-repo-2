package org.glowroot.agent.shaded.fasterxml.jackson.datatype.guava.deser;

import org.glowroot.agent.shaded.fasterxml.jackson.databind.JsonDeserializer;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.type.CollectionType;
import org.glowroot.agent.shaded.google.common.collect.ImmutableCollection.Builder;
import org.glowroot.agent.shaded.google.common.collect.ImmutableSet;

public class ImmutableSetDeserializer extends GuavaImmutableCollectionDeserializer<ImmutableSet<Object>>
{
    private static final long serialVersionUID = 1L;

    public ImmutableSetDeserializer(CollectionType type,
            TypeDeserializer typeDeser, JsonDeserializer<?> deser)
    {
        super(type, typeDeser, deser);
    }

    @Override
    public ImmutableSetDeserializer withResolved(TypeDeserializer typeDeser,
            JsonDeserializer<?> valueDeser) {
        return new ImmutableSetDeserializer(_containerType,
                typeDeser, valueDeser);
    }
    
    @Override
    protected Builder<Object> createBuilder() {
        return ImmutableSet.builder();
    }
}
