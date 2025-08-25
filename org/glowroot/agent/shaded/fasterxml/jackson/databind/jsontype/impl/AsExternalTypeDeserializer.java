package org.glowroot.agent.shaded.fasterxml.jackson.databind.jsontype.impl;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonTypeInfo.As;

import org.glowroot.agent.shaded.fasterxml.jackson.databind.BeanProperty;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.JavaType;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.jsontype.TypeIdResolver;

/**
 * Type deserializer used with {@link As#EXTERNAL_PROPERTY} inclusion mechanism.
 * Actual implementation may look bit strange since it depends on comprehensive
 * pre-processing done by {@link org.glowroot.agent.shaded.fasterxml.jackson.databind.deser.BeanDeserializer}
 * to basically transform external type id into structure that looks more like
 * "wrapper-array" style inclusion. This intermediate form is chosen to allow
 * supporting all possible JSON structures.
 */
public class AsExternalTypeDeserializer extends AsArrayTypeDeserializer
{
    private static final long serialVersionUID = 1L;

    public AsExternalTypeDeserializer(JavaType bt, TypeIdResolver idRes,
            String typePropertyName, boolean typeIdVisible, Class<?> defaultImpl)
    {
        super(bt, idRes, typePropertyName, typeIdVisible, defaultImpl);
    }

    public AsExternalTypeDeserializer(AsExternalTypeDeserializer src, BeanProperty property) {
        super(src, property);
    }
    
    @Override
    public TypeDeserializer forProperty(BeanProperty prop) {
        if (prop == _property) { // usually if it's null
            return this;
        }
        return new AsExternalTypeDeserializer(this, prop);
    }
    
    @Override
    public As getTypeInclusion() { return As.EXTERNAL_PROPERTY; }

    // yes, very important distinction...
    @Override
    protected boolean _usesExternalId() {
        return true;
    }
}
