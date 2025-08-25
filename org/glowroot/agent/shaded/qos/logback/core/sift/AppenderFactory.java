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
import org.glowroot.agent.shaded.qos.logback.core.joran.spi.JoranException;

/**
 * Created with IntelliJ IDEA.
 * User: ceki
 * Date: 25.04.13
 * Time: 19:00
 * To change this template use File | Settings | File Templates.
 */
public interface AppenderFactory<E> {
    Appender<E> buildAppender(Context context, String discriminatingValue) throws JoranException;
}
