package org.glowroot.agent.shaded.fasterxml.jackson.datatype.guava.deser;

import java.io.IOException;

import org.glowroot.agent.shaded.fasterxml.jackson.core.JsonParser;
import org.glowroot.agent.shaded.fasterxml.jackson.core.JsonProcessingException;
import org.glowroot.agent.shaded.fasterxml.jackson.core.JsonToken;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.DeserializationContext;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.JsonDeserializer;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.type.CollectionType;
import org.glowroot.agent.shaded.google.common.collect.Multiset;

abstract class GuavaMultisetDeserializer<T extends Multiset<Object>>
    extends GuavaCollectionDeserializer<T>
{
    private static final long serialVersionUID = 1L;

    GuavaMultisetDeserializer(CollectionType type, TypeDeserializer typeDeser, JsonDeserializer<?> deser) {
        super(type, typeDeser, deser);
    }

    protected abstract T createMultiset();

    @Override
    protected T _deserializeContents(JsonParser jp, DeserializationContext ctxt) throws IOException,
            JsonProcessingException {
        JsonDeserializer<?> valueDes = _valueDeserializer;
        JsonToken t;
        final TypeDeserializer typeDeser = _typeDeserializerForValue;
        T set = createMultiset();
    
        while ((t = jp.nextToken()) != JsonToken.END_ARRAY) {
            Object value;
            
            if (t == JsonToken.VALUE_NULL) {
                value = null;
            } else if (typeDeser == null) {
                value = valueDes.deserialize(jp, ctxt);
            } else {
                value = valueDes.deserializeWithType(jp, ctxt, typeDeser);
            }
            set.add(value);
        }
        return set;
    }

    @Override
    protected T _deserializeFromSingleValue(JsonParser jp, DeserializationContext ctxt)
            throws IOException, JsonProcessingException
    {
        JsonDeserializer<?> valueDes = _valueDeserializer;
        final TypeDeserializer typeDeser = _typeDeserializerForValue;
        JsonToken t = jp.getCurrentToken();

        Object value;
        
        if (t == JsonToken.VALUE_NULL) {
            value = null;
        } else if (typeDeser == null) {
            value = valueDes.deserialize(jp, ctxt);
        } else {
            value = valueDes.deserializeWithType(jp, ctxt, typeDeser);
        }
        T result = createMultiset();
        result.add(value);
        return result;
    }

}