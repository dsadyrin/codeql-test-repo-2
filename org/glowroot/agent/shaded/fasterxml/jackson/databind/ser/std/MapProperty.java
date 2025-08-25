package org.glowroot.agent.shaded.fasterxml.jackson.databind.ser.std;

import java.io.IOException;
import java.lang.annotation.Annotation;

import org.glowroot.agent.shaded.fasterxml.jackson.core.JsonGenerator;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.BeanProperty;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.JsonMappingException;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.JsonSerializer;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.PropertyName;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.SerializerProvider;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.jsontype.TypeSerializer;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.node.ObjectNode;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.ser.PropertyWriter;

/**
 * Helper class needed to support flexible filtering of Map properties
 * with generic JSON Filter functionality. Since {@link java.util.Map}s
 * are not handled as a collection of properties by Jackson (unlike POJOs),
 * bit more wrapping is required.
 */
public class MapProperty extends PropertyWriter
{
    protected final TypeSerializer _typeSerializer;

    protected final BeanProperty _property;

    protected Object _key;

    protected JsonSerializer<Object> _keySerializer, _valueSerializer;

    /**
     * @deprecated since 2.4
     */
    @Deprecated // since 2.4
    public MapProperty(TypeSerializer typeSer) {
        this(typeSer, null);
    }
    
    public MapProperty(TypeSerializer typeSer, BeanProperty prop)
    {
        _typeSerializer = typeSer;
        _property = prop;
    }

    /**
     * Initialization method that needs to be called before passing
     * property to filter.
     */
    public void reset(Object key,
            JsonSerializer<Object> keySer, JsonSerializer<Object> valueSer)
    {
        _key = key;
        _keySerializer = keySer;
        _valueSerializer = valueSer;
    }
    
    @Override
    public String getName() {
        if (_key instanceof String) {
            return (String) _key;
        }
        return String.valueOf(_key);
    }

    @Override
    public PropertyName getFullName() {
        return new PropertyName(getName());
    }

    @Override
    public <A extends Annotation> A getAnnotation(Class<A> acls) {
        return (_property == null) ? null : _property.getAnnotation(acls);
    }

    @Override
    public <A extends Annotation> A getContextAnnotation(Class<A> acls) {
        return (_property == null) ? null : _property.getContextAnnotation(acls);
    }
    
    @Override
    public void serializeAsField(Object value, JsonGenerator jgen,
            SerializerProvider provider) throws IOException
    {
        _keySerializer.serialize(_key, jgen, provider);
        if (_typeSerializer == null) {
            _valueSerializer.serialize(value, jgen, provider);
        } else {
            _valueSerializer.serializeWithType(value, jgen, provider, _typeSerializer);
        }
    }

    @Override
    public void serializeAsOmittedField(Object value, JsonGenerator jgen,
            SerializerProvider provider) throws Exception
    {
        if (!jgen.canOmitFields()) {
            jgen.writeOmittedField(getName());
        }
    }

    @Override
    public void serializeAsElement(Object value, JsonGenerator jgen,
            SerializerProvider provider) throws Exception
    {
        if (_typeSerializer == null) {
            _valueSerializer.serialize(value, jgen, provider);
        } else {
            _valueSerializer.serializeWithType(value, jgen, provider, _typeSerializer);
        }
    }
    
    @Override
    public void serializeAsPlaceholder(Object value, JsonGenerator jgen,
            SerializerProvider provider) throws Exception
    {
        jgen.writeNull();
    }

    @Override
    public void depositSchemaProperty(JsonObjectFormatVisitor objectVisitor)
        throws JsonMappingException
    {
        // !!! TODO
    }

    @Override
    @Deprecated
    public void depositSchemaProperty(ObjectNode propertiesNode,
            SerializerProvider provider) throws JsonMappingException {
        // !!! TODO
    }
}
