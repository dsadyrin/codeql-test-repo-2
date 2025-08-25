package org.glowroot.agent.shaded.fasterxml.jackson.datatype.guava.ser;

import org.glowroot.agent.shaded.fasterxml.jackson.databind.BeanDescription;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.SerializationConfig;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.ser.BeanSerializerModifier;
import org.glowroot.agent.shaded.google.common.base.Optional;

import java.util.List;

/**
 * {@link BeanSerializerModifier} needed to sneak in handler to exclude "absent"
 * optional values iff handling of "absent as nulls" is enabled.
 */
public class GuavaBeanSerializerModifier extends BeanSerializerModifier
{
    @Override
    public List<BeanPropertyWriter> changeProperties(SerializationConfig config,
            BeanDescription beanDesc,
            List<BeanPropertyWriter> beanProperties)
    {
        for (int i = 0; i < beanProperties.size(); ++i) {
            final BeanPropertyWriter writer = beanProperties.get(i);
            if (Optional.class.isAssignableFrom(writer.getPropertyType())) {
                beanProperties.set(i, new GuavaOptionalBeanPropertyWriter(writer));
            }
        }
        return beanProperties;
    }
}
