package org.glowroot.agent.shaded.fasterxml.jackson.databind.deser.impl;

import java.io.IOException;

import org.glowroot.agent.shaded.fasterxml.jackson.core.JsonParser;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.DeserializationContext;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.JsonDeserializer;

/**
 * A deserializer that stores a {@link NoClassDefFoundError} error
 * and throws the stored exception when attempting to deserialize
 * a value. Null and empty values can be deserialized without error.
 * 
 * @since 2.5
 */
public class NoClassDefFoundDeserializer<T> extends JsonDeserializer<T>
{
    private final NoClassDefFoundError _cause;

    public NoClassDefFoundDeserializer(NoClassDefFoundError cause)
    {
        _cause = cause;
    }

    @Override
    public T deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException
    {
        throw _cause;
    }
}
