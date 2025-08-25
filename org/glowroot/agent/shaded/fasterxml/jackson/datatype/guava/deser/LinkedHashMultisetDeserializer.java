package org.glowroot.agent.shaded.fasterxml.jackson.datatype.guava.deser;

import org.glowroot.agent.shaded.fasterxml.jackson.databind.JsonDeserializer;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.type.CollectionType;
import org.glowroot.agent.shaded.google.common.collect.LinkedHashMultiset;

public class LinkedHashMultisetDeserializer extends GuavaMultisetDeserializer<LinkedHashMultiset<Object>>
{
    private static final long serialVersionUID = 1L;

    public LinkedHashMultisetDeserializer(CollectionType type, TypeDeserializer typeDeser, JsonDeserializer<?> deser) {
        super(type, typeDeser, deser);
    }

    @Override
    protected LinkedHashMultiset<Object> createMultiset() {
        return LinkedHashMultiset.create();
    }

    @Override
    public GuavaCollectionDeserializer<LinkedHashMultiset<Object>> withResolved(TypeDeserializer typeDeser,
            JsonDeserializer<?> valueDeser) {
        return new LinkedHashMultisetDeserializer(_containerType, typeDeser, valueDeser);
    }
}
