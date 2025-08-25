package org.glowroot.agent.shaded.fasterxml.jackson.datatype.guava.deser;

import java.io.IOException;

import org.glowroot.agent.shaded.fasterxml.jackson.core.JsonParser;
import org.glowroot.agent.shaded.fasterxml.jackson.core.JsonProcessingException;
import org.glowroot.agent.shaded.fasterxml.jackson.core.JsonToken;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.DeserializationContext;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.JsonDeserializer;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.type.CollectionType;
import org.glowroot.agent.shaded.google.common.collect.ImmutableCollection;

abstract class GuavaImmutableCollectionDeserializer<T extends ImmutableCollection<Object>>
        extends GuavaCollectionDeserializer<T>
{
    private static final long serialVersionUID = 1L;

    GuavaImmutableCollectionDeserializer(CollectionType type,
            TypeDeserializer typeDeser, JsonDeserializer<?> deser) {
        super(type, typeDeser, deser);
    }

    protected abstract ImmutableCollection.Builder<Object> createBuilder();

    @Override
    protected T _deserializeContents(JsonParser jp, DeserializationContext ctxt)
            throws IOException, JsonProcessingException {
        JsonDeserializer<?> valueDes = _valueDeserializer;
        JsonToken t;
        final TypeDeserializer typeDeser = _typeDeserializerForValue;
        // No way to pass actual type parameter; but does not matter, just
        // compiler-time fluff:
        ImmutableCollection.Builder<Object> builder = createBuilder();

        while ((t = jp.nextToken()) != JsonToken.END_ARRAY) {
            Object value;

            if (t == JsonToken.VALUE_NULL) {
                value = null;
            } else if (typeDeser == null) {
                value = valueDes.deserialize(jp, ctxt);
            } else {
                value = valueDes.deserializeWithType(jp, ctxt, typeDeser);
            }
            builder.add(value);
        }
        // No class outside of the package will be able to subclass us,
        // and we provide the proper builder for the subclasses we implement.
        @SuppressWarnings("unchecked")
        T collection = (T) builder.build();
        return collection;
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
        @SuppressWarnings("unchecked")
        T result = (T) createBuilder().add(value).build();
        return result;
    }
}