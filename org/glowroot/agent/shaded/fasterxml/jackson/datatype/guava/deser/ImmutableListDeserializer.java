package org.glowroot.agent.shaded.fasterxml.jackson.datatype.guava.deser;

import org.glowroot.agent.shaded.google.common.collect.ImmutableList;

import org.glowroot.agent.shaded.fasterxml.jackson.databind.*;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.type.CollectionType;

public class ImmutableListDeserializer extends
        GuavaImmutableCollectionDeserializer<ImmutableList<Object>>
{
    private static final long serialVersionUID = 1L;

    public ImmutableListDeserializer(CollectionType type,
            TypeDeserializer typeDeser, JsonDeserializer<?> deser) {
        super(type, typeDeser, deser);
    }

    @Override
    public ImmutableListDeserializer withResolved(TypeDeserializer typeDeser,
            JsonDeserializer<?> valueDeser) {
        return new ImmutableListDeserializer(_containerType, typeDeser,
                valueDeser);
    }

    /*
    /**********************************************************
    /* Deserialization
    /**********************************************************
     */

    @Override
    protected ImmutableList.Builder<Object> createBuilder() {
        ImmutableList.Builder<Object> builder = ImmutableList.builder();
        return builder;
    }
}
