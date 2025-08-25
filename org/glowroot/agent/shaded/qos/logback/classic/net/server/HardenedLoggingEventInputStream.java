package org.glowroot.agent.shaded.qos.logback.classic.net.server;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.glowroot.agent.shaded.slf4j.helpers.BasicMarker;

import org.glowroot.agent.shaded.qos.logback.classic.Level;
import org.glowroot.agent.shaded.qos.logback.classic.Logger;
import org.glowroot.agent.shaded.qos.logback.classic.spi.ClassPackagingData;
import org.glowroot.agent.shaded.qos.logback.classic.spi.IThrowableProxy;
import org.glowroot.agent.shaded.qos.logback.classic.spi.LoggerContextVO;
import org.glowroot.agent.shaded.qos.logback.classic.spi.LoggerRemoteView;
import org.glowroot.agent.shaded.qos.logback.classic.spi.LoggingEventVO;
import org.glowroot.agent.shaded.qos.logback.classic.spi.StackTraceElementProxy;
import org.glowroot.agent.shaded.qos.logback.classic.spi.ThrowableProxy;
import org.glowroot.agent.shaded.qos.logback.classic.spi.ThrowableProxyVO;
import org.glowroot.agent.shaded.qos.logback.core.net.HardenedObjectInputStream;

public class HardenedLoggingEventInputStream extends HardenedObjectInputStream {

    static final String ARRAY_PREFIX = "[L";
    
    static public List<String> getWhilelist() {
        List<String> whitelist = new ArrayList<String>();
        whitelist.add(LoggingEventVO.class.getName());
        whitelist.add(LoggerContextVO.class.getName());
        whitelist.add(LoggerRemoteView.class.getName());
        whitelist.add(ThrowableProxyVO.class.getName());
        whitelist.add(BasicMarker.class.getName());
        whitelist.add(Level.class.getName());
        whitelist.add(Logger.class.getName());
        whitelist.add(StackTraceElement.class.getName());
        whitelist.add(StackTraceElement[].class.getName());
        whitelist.add(ThrowableProxy.class.getName());
        whitelist.add(ThrowableProxy[].class.getName());
        whitelist.add(IThrowableProxy.class.getName());
        whitelist.add(IThrowableProxy[].class.getName());
        whitelist.add(StackTraceElementProxy.class.getName());
        whitelist.add(StackTraceElementProxy[].class.getName());
        whitelist.add(ClassPackagingData.class.getName());

        return whitelist;
    }
   
    public HardenedLoggingEventInputStream(InputStream is) throws IOException {
        super(is, getWhilelist());
    }
    
    public HardenedLoggingEventInputStream(InputStream is, List<String> additionalAuthorizedClasses) throws IOException {
        this(is);
        super.addToWhitelist(additionalAuthorizedClasses);
    }
}
