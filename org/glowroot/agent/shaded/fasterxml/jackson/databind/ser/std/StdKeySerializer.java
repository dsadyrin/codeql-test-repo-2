package org.glowroot.agent.shaded.fasterxml.jackson.databind.ser.std;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Date;

import org.glowroot.agent.shaded.fasterxml.jackson.core.*;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.JavaType;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.JsonMappingException;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.JsonNode;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.SerializationFeature;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.SerializerProvider;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;

/**
 * Specialized serializer that can be used as the generic key
 * serializer, when serializing {@link java.util.Map}s to JSON
 * Objects.
 */
@SuppressWarnings("serial")
public class StdKeySerializer extends StdSerializer<Object>
{
    public StdKeySerializer() { super(Object.class); }

    @Override
    public void serialize(Object value, JsonGenerator g, SerializerProvider provider) throws IOException {
        String str;
        Class<?> cls = value.getClass();

        if (cls == String.class) {
            str = (String) value;
        } else if (cls.isEnum()) {
            // 24-Sep-2015, tatu: Minor improvement over older (2.6.2 and before) code: at least
            //     use name/toString() variation for as per configuration
            Enum<?> en = (Enum<?>) value;

            if (provider.isEnabled(SerializationFeature.WRITE_ENUMS_USING_TO_STRING)) {
                str = en.toString();
            } else {
                str = en.name();
            }
        } else if (value instanceof Date) {
            provider.defaultSerializeDateKey((Date) value, g);
            return;
        } else if (cls == Class.class) {
            str = ((Class<?>) value).getName();
        } else {
            str = value.toString();
        }
        g.writeFieldName(str);
    }

    @Override
    public JsonNode getSchema(SerializerProvider provider, Type typeHint) throws JsonMappingException {
        return createSchemaNode("string");
    }

    @Override
    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper visitor, JavaType typeHint) throws JsonMappingException {
        visitor.expectStringFormat(typeHint);
    }
}
