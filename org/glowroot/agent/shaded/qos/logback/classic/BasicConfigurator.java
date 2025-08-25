/**
 * Logback: the reliable, generic, fast and flexible logging framework.
 * Copyright (C) 1999-2015, QOS.ch. All rights reserved.
 *
 * This program and the accompanying materials are dual-licensed under
 * either the terms of the Eclipse Public License v1.0 as published by
 * the Eclipse Foundation
 *
 *   or (per the licensee's choosing)
 *
 * under the terms of the GNU Lesser General Public License version 2.1
 * as published by the Free Software Foundation.
 */
package org.glowroot.agent.shaded.qos.logback.classic;

import org.glowroot.agent.shaded.qos.logback.classic.layout.TTLLLayout;
import org.glowroot.agent.shaded.qos.logback.classic.spi.Configurator;
import org.glowroot.agent.shaded.qos.logback.classic.spi.ILoggingEvent;
import org.glowroot.agent.shaded.qos.logback.core.ConsoleAppender;
import org.glowroot.agent.shaded.qos.logback.core.encoder.LayoutWrappingEncoder;
import org.glowroot.agent.shaded.qos.logback.core.spi.ContextAwareBase;

/**
 * BasicConfigurator configures logback-classic by attaching a 
 * {@link ConsoleAppender} to the root logger. The console appender's layout 
 * is set to a {@link org.glowroot.agent.shaded.qos.logback.classic.layout.TTLLLayout TTLLLayout}.
 * 
 * @author Ceki G&uuml;lc&uuml;
 */
public class BasicConfigurator extends ContextAwareBase implements Configurator {

    public BasicConfigurator() {
    }

    public void configure(LoggerContext lc) {
        addInfo("Setting up default configuration.");
        
        ConsoleAppender<ILoggingEvent> ca = new ConsoleAppender<ILoggingEvent>();
        ca.setContext(lc);
        ca.setName("console");
        LayoutWrappingEncoder<ILoggingEvent> encoder = new LayoutWrappingEncoder<ILoggingEvent>();
        encoder.setContext(lc);
        
 
        // same as 
        // PatternLayout layout = new PatternLayout();
        // layout.setPattern("%d{HH:mm:ss.SSS} [%thread] %-5level %logger{36} - %msg%n");
        TTLLLayout layout = new TTLLLayout();
 
        layout.setContext(lc);
        layout.start();
        encoder.setLayout(layout);
        
        ca.setEncoder(encoder);
        ca.start();
        
        Logger rootLogger = lc.getLogger(Logger.ROOT_LOGGER_NAME);
        rootLogger.addAppender(ca);
    }
}
