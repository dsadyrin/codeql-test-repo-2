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

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import javax.annotation.concurrent.Immutable;

/**
 * A link to a {@link Span} from a different trace.
 *
 * <p>It requires a {@link Type} which describes the relationship with the linked {@code Span} and
 * the identifiers of the linked {@code Span}.
 *
 * <p>Used (for example) in batching operations, where a single batch handler processes multiple
 * requests from different traces.
 */
@Immutable
public final class Link {
  /** The relationship with the linked {@code Span} relative to the current {@code Span}. */
  public enum Type {
    /** When the linked {@code Span} is a child of the current {@code Span}. */
    CHILD,
    /** When the linked {@code Span} is a parent of the current {@code Span}. */
    PARENT
  }

  private final TraceId traceId;
  private final SpanId spanId;
  private final Type type;

  /**
   * Returns a new {@code Link}.
   *
   * @param context the context of the linked {@code Span}.
   * @param type the type of the relationship with the linked {@code Span}.
   * @return a new {@code Link}.
   */
  public static Link fromSpanContext(SpanContext context, Type type) {
    return new Link(context.getTraceId(), context.getSpanId(), type);
  }

  /**
   * Returns the {@code TraceId}.
   *
   * @return the {@code TraceId}.
   */
  public TraceId getTraceId() {
    return traceId;
  }

  /**
   * Returns the {@code SpanId}.
   *
   * @return the {@code SpanId}
   */
  public SpanId getSpanId() {
    return spanId;
  }

  /**
   * Returns the {@code Type}.
   *
   * @return the {@code Type}.
   */
  public Type getType() {
    return type;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }

    if (!(obj instanceof Link)) {
      return false;
    }

    Link that = (Link) obj;
    return Objects.equal(traceId, that.traceId)
        && Objects.equal(spanId, that.spanId)
        && Objects.equal(type, that.type);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(traceId, spanId, type);
  }

  @Override
  public String toString() {
    return MoreObjects.toStringHelper(this)
        .add("traceId", traceId)
        .add("spanId", spanId)
        .add("type", type)
        .toString();
  }

  private Link(TraceId traceId, SpanId spanId, Type type) {
    this.traceId = traceId;
    this.spanId = spanId;
    this.type = type;
  }
}
