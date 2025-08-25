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
package org.glowroot.agent.shaded.qos.logback.classic.jul;

import org.glowroot.agent.shaded.qos.logback.classic.Level;
import org.glowroot.agent.shaded.qos.logback.classic.Logger;

public class JULHelper {

    static public final boolean isRegularNonRootLogger(org.glowroot.agent.jul.Logger julLogger) {
        if (julLogger == null)
            return false;
        return !julLogger.getName().equals("");
    }

    static public final boolean isRoot(org.glowroot.agent.jul.Logger julLogger) {
        if (julLogger == null)
            return false;
        return julLogger.getName().equals("");
    }

    static public org.glowroot.agent.jul.Level asJULLevel(Level lbLevel) {
        if (lbLevel == null)
            throw new IllegalArgumentException("Unexpected level [null]");

        switch (lbLevel.levelInt) {
        case Level.ALL_INT:
            return org.glowroot.agent.jul.Level.ALL;
        case Level.TRACE_INT:
            return org.glowroot.agent.jul.Level.FINEST;
        case Level.DEBUG_INT:
            return org.glowroot.agent.jul.Level.FINE;
        case Level.INFO_INT:
            return org.glowroot.agent.jul.Level.INFO;
        case Level.WARN_INT:
            return org.glowroot.agent.jul.Level.WARNING;
        case Level.ERROR_INT:
            return org.glowroot.agent.jul.Level.SEVERE;
        case Level.OFF_INT:
            return org.glowroot.agent.jul.Level.OFF;
        default:
            throw new IllegalArgumentException("Unexpected level [" + lbLevel + "]");
        }
    }

    static public String asJULLoggerName(String loggerName) {
        if (Logger.ROOT_LOGGER_NAME.equals(loggerName))
            return "";
        else
            return loggerName;
    }

    static public org.glowroot.agent.jul.Logger asJULLogger(String loggerName) {
        String julLoggerName = asJULLoggerName(loggerName);
        return org.glowroot.agent.jul.Logger.getLogger(julLoggerName);
    }

    static public org.glowroot.agent.jul.Logger asJULLogger(Logger logger) {
        return asJULLogger(logger.getName());
    }

}
