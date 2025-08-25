package org.glowroot.agent.shaded.fasterxml.jackson.databind.ser.std;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;

import org.glowroot.agent.shaded.fasterxml.jackson.core.JsonGenerator;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.JavaType;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.JsonMappingException;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.JsonNode;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.SerializerProvider;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;

/**
 * For now, File objects get serialized by just outputting
 * absolute (but not canonical) name as String value
 */
@SuppressWarnings("serial")
public class FileSerializer
    extends StdScalarSerializer<File>
{
    public FileSerializer() { super(File.class); }

    @Override
    public void serialize(File value, JsonGenerator jgen, SerializerProvider provider) throws IOException {
        jgen.writeString(value.getAbsolutePath());
    }

    @Override
    public JsonNode getSchema(SerializerProvider provider, Type typeHint) {
        return createSchemaNode("string", true);
    }
    
    @Override
    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper visitor, JavaType typeHint)
            throws JsonMappingException
    {
        visitor.expectStringFormat(typeHint);
    }
}