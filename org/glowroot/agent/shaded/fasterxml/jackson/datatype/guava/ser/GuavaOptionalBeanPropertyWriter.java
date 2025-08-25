package org.glowroot.agent.shaded.fasterxml.jackson.datatype.guava.ser;

import org.glowroot.agent.shaded.fasterxml.jackson.core.JsonGenerator;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.PropertyName;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.SerializerProvider;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.util.NameTransformer;
import org.glowroot.agent.shaded.google.common.base.Optional;

public class GuavaOptionalBeanPropertyWriter extends BeanPropertyWriter
{
    protected GuavaOptionalBeanPropertyWriter(BeanPropertyWriter base) {
        super(base);
    }

    protected GuavaOptionalBeanPropertyWriter(BeanPropertyWriter base, PropertyName newName) {
        super(base, newName);
    }

    // !!! TODO: in 2.7, no need to override
    @Override
    public BeanPropertyWriter rename(NameTransformer transformer) {
        String newName = transformer.transform(_name.getValue());
        if (newName.equals(_name.toString())) {
            return this;
        }
        return _new(PropertyName.construct(newName));
    }

    // NOTE: 
//    @Override
    protected BeanPropertyWriter _new(PropertyName newName) {
        return new GuavaOptionalBeanPropertyWriter(this, newName);
    }

    @Override
    public BeanPropertyWriter unwrappingWriter(NameTransformer unwrapper) {
        return new GuavaUnwrappingOptionalBeanPropertyWriter(this, unwrapper);
    }

    @Override
    public void serializeAsField(Object bean, JsonGenerator gen, SerializerProvider prov) throws Exception
    {
        if (_nullSerializer == null) {
            Object value = get(bean);
            if (value == null || Optional.absent().equals(value)) {
                return;
            }
        }
        super.serializeAsField(bean, gen, prov);
    }
}
