/**
 * 
 */
package org.glowroot.agent.shaded.fasterxml.jackson.databind.jsonFormatVisitors;

import org.glowroot.agent.shaded.fasterxml.jackson.databind.SerializerProvider;

/**
 * @author jphelan
 */
public interface JsonFormatVisitorWithSerializerProvider {
    public SerializerProvider getProvider();
    public abstract void setProvider(SerializerProvider provider);
}
