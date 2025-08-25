package org.glowroot.agent.shaded.fasterxml.jackson.datatype.guava.deser;

import org.glowroot.agent.shaded.fasterxml.jackson.databind.JsonDeserializer;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.type.CollectionType;
import org.glowroot.agent.shaded.google.common.collect.ImmutableCollection.Builder;
import org.glowroot.agent.shaded.google.common.collect.ImmutableMultiset;

public class ImmutableMultisetDeserializer extends GuavaImmutableCollectionDeserializer<ImmutableMultiset<Object>>
{
    private static final long serialVersionUID = 1L;

    public ImmutableMultisetDeserializer(CollectionType type, TypeDeserializer typeDeser, JsonDeserializer<?> deser) {
        super(type, typeDeser, deser);
    }

    @Override
    protected Builder<Object> createBuilder() {
        return ImmutableMultiset.builder();
    }

    @Override
    public GuavaCollectionDeserializer<ImmutableMultiset<Object>> withResolved(TypeDeserializer typeDeser,
            JsonDeserializer<?> valueDeser) {
        return new ImmutableMultisetDeserializer(_containerType, typeDeser, valueDeser);
    }
}
