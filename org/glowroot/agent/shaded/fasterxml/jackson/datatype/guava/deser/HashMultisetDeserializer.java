package org.glowroot.agent.shaded.fasterxml.jackson.datatype.guava.deser;


import org.glowroot.agent.shaded.fasterxml.jackson.databind.JsonDeserializer;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.type.CollectionType;
import org.glowroot.agent.shaded.google.common.collect.HashMultiset;

public class HashMultisetDeserializer
    extends GuavaMultisetDeserializer<HashMultiset<Object>>
{
    private static final long serialVersionUID = 1L;

    public HashMultisetDeserializer(CollectionType type,
            TypeDeserializer typeDeser, JsonDeserializer<?> deser)
    {
        super(type, typeDeser, deser);
    }

    @Override
    public HashMultisetDeserializer withResolved(TypeDeserializer typeDeser,
            JsonDeserializer<?> valueDeser) {
        return new HashMultisetDeserializer(_containerType,
                typeDeser, valueDeser);
    }
    
    @Override
    protected HashMultiset<Object> createMultiset() {
        return HashMultiset.<Object> create();
    }
}
