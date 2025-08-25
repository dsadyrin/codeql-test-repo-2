package org.glowroot.agent.shaded.fasterxml.jackson.datatype.guava.deser;

import java.io.IOException;

import org.glowroot.agent.shaded.google.common.net.InternetDomainName;

import org.glowroot.agent.shaded.fasterxml.jackson.databind.DeserializationContext;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.deser.std.FromStringDeserializer;

public class InternetDomainNameDeserializer extends FromStringDeserializer<InternetDomainName>
{
    private static final long serialVersionUID = 1L;

    public final static InternetDomainNameDeserializer std = new InternetDomainNameDeserializer();
    
    public InternetDomainNameDeserializer() { super(InternetDomainName.class); }

    @Override
    protected InternetDomainName _deserialize(String value, DeserializationContext ctxt)
            throws IOException {
        return InternetDomainName.from(value);
    }
}
