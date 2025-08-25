package org.glowroot.agent.shaded.fasterxml.jackson.databind.ser.std;

import java.io.IOException;
import java.lang.reflect.Type;

import org.glowroot.agent.shaded.fasterxml.jackson.core.JsonGenerator;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.JavaType;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.JsonMappingException;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.JsonNode;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.SerializerProvider;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.jsonFormatVisitors.JsonArrayFormatVisitor;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.jsontype.TypeSerializer;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.node.ObjectNode;

/**
 * Unlike other integral number array serializers, we do not just print out byte values
 * as numbers. Instead, we assume that it would make more sense to output content
 * as base64 encoded bytes (using default base64 encoding).
 *<p>
 * NOTE: since it is NOT serialized as an array, can not use AsArraySerializer as base
 *<p>
 * NOTE: since 2.6, has been a main-level class; earlier was embedded in
 * {@link StdArraySerializers}.
 */
@JacksonStdImpl
public class ByteArraySerializer extends StdSerializer<byte[]>
{
    private static final long serialVersionUID = 1L;

    public ByteArraySerializer() {
        super(byte[].class);
    }
    
    @Override
    public boolean isEmpty(SerializerProvider prov, byte[] value) {
        return (value == null) || (value.length == 0);
    }
    
    @Override
    public void serialize(byte[] value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException
    {
        jgen.writeBinary(provider.getConfig().getBase64Variant(),
                value, 0, value.length);
    }

    @Override
    public void serializeWithType(byte[] value, JsonGenerator jgen, SerializerProvider provider,
            TypeSerializer typeSer)
        throws IOException
    {
        typeSer.writeTypePrefixForScalar(value, jgen);
        jgen.writeBinary(provider.getConfig().getBase64Variant(),
                value, 0, value.length);
        typeSer.writeTypeSuffixForScalar(value, jgen);
    }
    
    @Override
    public JsonNode getSchema(SerializerProvider provider, Type typeHint)
    {
        ObjectNode o = createSchemaNode("array", true);
        ObjectNode itemSchema = createSchemaNode("string"); //binary values written as strings?
        return o.set("items", itemSchema);
    }
    
    @Override
    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper visitor, JavaType typeHint)
            throws JsonMappingException
    {
        if (visitor != null) {
            JsonArrayFormatVisitor v2 = visitor.expectArrayFormat(typeHint);
            if (v2 != null) {
                v2.itemsFormat(JsonFormatTypes.STRING);
            }
        }
    }
}