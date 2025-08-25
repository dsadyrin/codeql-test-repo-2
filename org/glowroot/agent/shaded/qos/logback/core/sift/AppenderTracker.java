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
package org.glowroot.agent.shaded.qos.logback.core.sift;

import org.glowroot.agent.shaded.qos.logback.core.Appender;
import org.glowroot.agent.shaded.qos.logback.core.Context;
import org.glowroot.agent.shaded.qos.logback.core.CoreConstants;
import org.glowroot.agent.shaded.qos.logback.core.helpers.NOPAppender;
import org.glowroot.agent.shaded.qos.logback.core.joran.spi.JoranException;
import org.glowroot.agent.shaded.qos.logback.core.spi.AbstractComponentTracker;
import org.glowroot.agent.shaded.qos.logback.core.spi.ContextAwareImpl;

/**
 * Track appenders by key. When an appender is not used for
 * longer than {@link #DEFAULT_TIMEOUT} it is stopped and removed.
 *
 * @author Tommy Becker
 * @author Ceki Gulcu
 * @author David Roussel
 */
public class AppenderTracker<E> extends AbstractComponentTracker<Appender<E>> {

    int nopaWarningCount = 0;

    final Context context;
    final AppenderFactory<E> appenderFactory;
    final ContextAwareImpl contextAware;

    public AppenderTracker(Context context, AppenderFactory<E> appenderFactory) {
        super();
        this.context = context;
        this.appenderFactory = appenderFactory;
        this.contextAware = new ContextAwareImpl(context, this);
    }

    @Override
    protected void processPriorToRemoval(Appender<E> component) {
        component.stop();
    }

    @Override
    protected Appender<E> buildComponent(String key) {
        Appender<E> appender = null;
        try {
            appender = appenderFactory.buildAppender(context, key);
        } catch (JoranException je) {
            contextAware.addError("Error while building appender with discriminating value [" + key + "]");
        }
        if (appender == null) {
            appender = buildNOPAppender(key);
        }

        return appender;
    }

    private NOPAppender<E> buildNOPAppender(String key) {
        if (nopaWarningCount < CoreConstants.MAX_ERROR_COUNT) {
            nopaWarningCount++;
            contextAware.addError("Building NOPAppender for discriminating value [" + key + "]");
        }
        NOPAppender<E> nopa = new NOPAppender<E>();
        nopa.setContext(context);
        nopa.start();
        return nopa;
    }

    @Override
    protected boolean isComponentStale(Appender<E> appender) {
        return !appender.isStarted();
    }

}
