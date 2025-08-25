package org.glowroot.agent.shaded.fasterxml.jackson.datatype.guava.ser;

import org.glowroot.agent.shaded.fasterxml.jackson.core.JsonGenerator;
import org.glowroot.agent.shaded.fasterxml.jackson.core.io.SerializedString;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.SerializerProvider;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.util.NameTransformer;
import org.glowroot.agent.shaded.google.common.base.Optional;

public class GuavaUnwrappingOptionalBeanPropertyWriter extends UnwrappingBeanPropertyWriter
{
    public GuavaUnwrappingOptionalBeanPropertyWriter(BeanPropertyWriter base,
            NameTransformer transformer) {
        super(base, transformer);
    }

    protected GuavaUnwrappingOptionalBeanPropertyWriter(UnwrappingBeanPropertyWriter base,
            NameTransformer transformer, SerializedString name) {
        // 26-Jun-2015, tatu: TODO! call this ctor instead:
//        super(base, transformer, name);
        super(base, transformer);
    }

    // TODO: In 2.7, should not need to override this method, just _new(...)
    @Override
    public UnwrappingBeanPropertyWriter rename(NameTransformer transformer)
    {
        String oldName = _name.getValue();
        String newName = transformer.transform(oldName);

        // important: combine transformers:
        transformer = NameTransformer.chainedTransformer(transformer, _nameTransformer);
    
        return _new(transformer, new SerializedString(newName));
    }

    // NOTE: was added in one of later 2.6.0 RCs; uncomment once available
//    @Override
    protected UnwrappingBeanPropertyWriter _new(NameTransformer transformer, SerializedString newName)
    {
        return new GuavaUnwrappingOptionalBeanPropertyWriter(this, transformer, newName);
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
