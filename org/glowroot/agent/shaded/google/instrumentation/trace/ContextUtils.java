/*
 * Copyright 2017, Google Inc.
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

import org.glowroot.agent.shaded.google.instrumentation.common.NonThrowingCloseable;
import org.glowroot.agent.shaded.grpc.Context;

/**
 * Util methods/functionality to interact with the {@link org.glowroot.agent.shaded.grpc.Context}.
 *
 * <p>Users must interact with the current Context via the public APIs in {@link Tracer} and avoid
 * usages of the {@link #CONTEXT_SPAN_KEY} directly.
 */
public final class ContextUtils {
  /** The {@link org.glowroot.agent.shaded.grpc.Context.Key} used to interact with {@link org.glowroot.agent.shaded.grpc.Context}. */
  public static final Context.Key<Span> CONTEXT_SPAN_KEY = Context.key("instrumentation-trace-key");

  // No instance of this class.
  private ContextUtils() {}

  /**
   * Returns The {@link Span} from the current context.
   *
   * @return The {@code Span} from the current context.
   */
  static Span getCurrentSpan() {
    return CONTEXT_SPAN_KEY.get(Context.current());
  }

  /**
   * Enters the scope of code where the given {@link Span} is in the current context, and returns an
   * object that represents that scope. The scope is exited when the returned object is closed.
   *
   * <p>Supports try-with-resource idiom.
   *
   * @param span The {@code Span} to be set to the current context.
   * @return An object that defines a scope where the given {@code Span} is set to the current
   *     context.
   */
  static NonThrowingCloseable withSpan(Span span) {
    return new WithSpan(span, CONTEXT_SPAN_KEY);
  }

  // Defines an arbitrary scope of code as a traceable operation. Supports try-with-resources idiom.
  private static final class WithSpan implements NonThrowingCloseable {
    private final Context origContext;

    /**
     * Constructs a new {@link WithSpan}.
     *
     * @param span is the {@code Span} to be added to the current {@code org.glowroot.agent.shaded.grpc.Context}.
     * @param contextKey is the {@code Context.Key} used to set/get {@code Span} from the {@code
     *     Context}.
     */
    WithSpan(Span span, Context.Key<Span> contextKey) {
      origContext = Context.current().withValue(contextKey, span).attach();
    }

    @Override
    public void close() {
      Context.current().detach(origContext);
    }
  }
}
