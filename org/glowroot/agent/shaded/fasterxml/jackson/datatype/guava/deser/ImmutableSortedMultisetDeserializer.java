package org.glowroot.agent.shaded.fasterxml.jackson.datatype.guava.deser;

import org.glowroot.agent.shaded.fasterxml.jackson.databind.JsonDeserializer;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.type.CollectionType;
import org.glowroot.agent.shaded.google.common.collect.ImmutableCollection.Builder;
import org.glowroot.agent.shaded.google.common.collect.ImmutableSortedMultiset;

public class ImmutableSortedMultisetDeserializer extends GuavaImmutableCollectionDeserializer<ImmutableSortedMultiset<Object>>
{
    private static final long serialVersionUID = 1L;

    public ImmutableSortedMultisetDeserializer(CollectionType type, TypeDeserializer typeDeser, JsonDeserializer<?> deser) {
        super(type, typeDeser, deser);
    }

    @Override
    protected Builder<Object> createBuilder() {
        /* This is suboptimal. See the considerations in ImmutableSortedSetDeserializer. */
        @SuppressWarnings({ "rawtypes", "unchecked" })
        Builder<Object> builder =  (Builder) ImmutableSortedMultiset.naturalOrder();
        return builder;
    }

    @Override
    public GuavaCollectionDeserializer<ImmutableSortedMultiset<Object>> withResolved(TypeDeserializer typeDeser,
            JsonDeserializer<?> valueDeser) {
        return new ImmutableSortedMultisetDeserializer(_containerType, typeDeser, valueDeser);
    }
}
