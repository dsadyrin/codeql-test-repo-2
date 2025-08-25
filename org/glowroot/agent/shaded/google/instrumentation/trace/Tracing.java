/*
 * Copyright 2016, Google Inc.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.glowroot.agent.shaded.google.instrumentation.trace;

import org.glowroot.agent.shaded.google.common.annotations.VisibleForTesting;
import org.glowroot.agent.shaded.google.instrumentation.common.Provider;
import org.glowroot.agent.jul.Level;
import org.glowroot.agent.jul.Logger;

/** Class that manages a global instance of the {@link TraceComponent}. */
public final class Tracing {
  private static final Logger logger = Logger.getLogger(Tracer.class.getName());
  private static final TraceComponent traceComponent =
      loadTraceComponent(Provider.getCorrectClassLoader(TraceComponent.class));

  /**
   * Returns the global {@link Tracer}.
   *
   * @return the global {@code Tracer}.
   */
  public static Tracer getTracer() {
    return traceComponent.getTracer();
  }

  /**
   * Returns the global {@link BinaryPropagationHandler}.
   *
   * @return the global {@code BinaryPropagationHandler}.
   */
  public static BinaryPropagationHandler getBinaryPropagationHandler() {
    return traceComponent.getBinaryPropagationHandler();
  }

  // Any provider that may be used for TraceComponent can be added here.
  @VisibleForTesting
  static TraceComponent loadTraceComponent(ClassLoader classLoader) {
    try {
      // Call Class.forName with literal string name of the class to help shading tools.
      return Provider.createInstance(
          Class.forName("org.glowroot.agent.shaded.google.instrumentation.trace.TraceComponentImpl", true, classLoader),
          TraceComponent.class);
    } catch (ClassNotFoundException e) {
      logger.log(Level.FINE, "Using default implementation for TraceComponent.", e);
    }
    return TraceComponent.getNoopTraceComponent();
  }

  // No instance of this class.
  private Tracing() {}
}
