package org.glowroot.agent.shaded.fasterxml.jackson.datatype.guava.deser;

import org.glowroot.agent.shaded.fasterxml.jackson.databind.JsonDeserializer;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.type.CollectionType;
import org.glowroot.agent.shaded.google.common.collect.TreeMultiset;

public class TreeMultisetDeserializer extends GuavaMultisetDeserializer<TreeMultiset<Object>>
{
    private static final long serialVersionUID = 1L;

    public TreeMultisetDeserializer(CollectionType type, TypeDeserializer typeDeser, JsonDeserializer<?> deser) {
        super(type, typeDeser, deser);
    }

    @SuppressWarnings("unchecked")
    @Override
    protected TreeMultiset<Object> createMultiset() {
        @SuppressWarnings("rawtypes")
        TreeMultiset<?> naturalOrder = TreeMultiset.<Comparable> create();
        return (TreeMultiset<Object>) naturalOrder;
    }

    @Override
    public GuavaCollectionDeserializer<TreeMultiset<Object>> withResolved(TypeDeserializer typeDeser,
            JsonDeserializer<?> valueDeser) {
        return new TreeMultisetDeserializer(_containerType, typeDeser, valueDeser);
    }
}
