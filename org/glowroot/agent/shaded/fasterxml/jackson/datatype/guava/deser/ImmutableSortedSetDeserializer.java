package org.glowroot.agent.shaded.fasterxml.jackson.datatype.guava.deser;

import org.glowroot.agent.shaded.fasterxml.jackson.databind.JsonDeserializer;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.type.CollectionType;
import org.glowroot.agent.shaded.google.common.collect.ImmutableCollection.Builder;
import org.glowroot.agent.shaded.google.common.collect.ImmutableSortedSet;

public class ImmutableSortedSetDeserializer extends GuavaImmutableCollectionDeserializer<ImmutableSortedSet<Object>>
{
    private static final long serialVersionUID = 1L;

    public ImmutableSortedSetDeserializer(CollectionType type,
            TypeDeserializer typeDeser, JsonDeserializer<?> deser)
    {
        super(type, typeDeser, deser);
    }

    @Override
    public ImmutableSortedSetDeserializer withResolved(TypeDeserializer typeDeser,
            JsonDeserializer<?> valueDeser) {
        return new ImmutableSortedSetDeserializer(_containerType,
                typeDeser, valueDeser);
    }
    
    @SuppressWarnings("unchecked")
    @Override
    protected Builder<Object> createBuilder() {
        /* Not quite sure what to do with sorting/ordering; may require better support either
         * via annotations, or via custom serialization (bean style that includes ordering
         * aspects)
         */
        @SuppressWarnings("rawtypes")
        ImmutableSortedSet.Builder<?> builderComp = ImmutableSortedSet.<Comparable> naturalOrder();
        ImmutableSortedSet.Builder<Object> builder = (ImmutableSortedSet.Builder<Object>) builderComp;
        return builder;
    }
}
