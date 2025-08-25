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

package org.glowroot.agent.it.harness.shaded.google.instrumentation.trace;

import org.glowroot.agent.it.harness.shaded.google.instrumentation.common.NonThrowingCloseable;

/**
 * Defines a scope of code where the given {@link Span} is in the current context. The scope is
 * exited when the object is closed and the previous context is restored. When the scope exits the
 * given {@code Span} will be ended using {@link Span#end}.
 *
 * <p>Supports try-with-resource idiom.
 */
final class ScopedSpanHandle implements NonThrowingCloseable {
  private final Span span;
  private final NonThrowingCloseable withSpan;

  /**
   * Creates a {@code ScopedSpanHandle}
   *
   * @param span The span that will be installed in the current context.
   */
  ScopedSpanHandle(Span span) {
    this.span = span;
    this.withSpan = ContextUtils.withSpan(span);
  }

  /**
   * Uninstalls the {@code Span} from the current context and ends it by calling {@link Span#end()}.
   */
  @Override
  public void close() {
    withSpan.close();
    span.end();
  }
}
