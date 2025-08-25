package org.glowroot.agent.shaded.glowroot.common.live;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import org.glowroot.agent.shaded.google.common.collect.Lists;
import org.glowroot.agent.shaded.google.common.primitives.Booleans;
import org.glowroot.agent.shaded.google.common.primitives.Longs;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link LiveTraceRepository.TracePoint}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTracePoint.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "LiveTraceRepository.TracePoint"})
@Immutable
public final class ImmutableTracePoint implements LiveTraceRepository.TracePoint {
  private final String agentId;
  private final String traceId;
  private final long captureTime;
  private final long durationNanos;
  private final boolean partial;
  private final boolean error;

  private ImmutableTracePoint(
      String agentId,
      String traceId,
      long captureTime,
      long durationNanos,
      boolean partial,
      boolean error) {
    this.agentId = agentId;
    this.traceId = traceId;
    this.captureTime = captureTime;
    this.durationNanos = durationNanos;
    this.partial = partial;
    this.error = error;
  }

  /**
   * @return The value of the {@code agentId} attribute
   */
  @JsonProperty("agentId")
  @Override
  public String agentId() {
    return agentId;
  }

  /**
   * @return The value of the {@code traceId} attribute
   */
  @JsonProperty("traceId")
  @Override
  public String traceId() {
    return traceId;
  }

  /**
   * @return The value of the {@code captureTime} attribute
   */
  @JsonProperty("captureTime")
  @Override
  public long captureTime() {
    return captureTime;
  }

  /**
   * @return The value of the {@code durationNanos} attribute
   */
  @JsonProperty("durationNanos")
  @Override
  public long durationNanos() {
    return durationNanos;
  }

  /**
   * @return The value of the {@code partial} attribute
   */
  @JsonProperty("partial")
  @Override
  public boolean partial() {
    return partial;
  }

  /**
   * @return The value of the {@code error} attribute
   */
  @JsonProperty("error")
  @Override
  public boolean error() {
    return error;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LiveTraceRepository.TracePoint#agentId() agentId} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for agentId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTracePoint withAgentId(String value) {
    if (this.agentId.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "agentId");
    return new ImmutableTracePoint(newValue, this.traceId, this.captureTime, this.durationNanos, this.partial, this.error);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LiveTraceRepository.TracePoint#traceId() traceId} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for traceId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTracePoint withTraceId(String value) {
    if (this.traceId.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "traceId");
    return new ImmutableTracePoint(this.agentId, newValue, this.captureTime, this.durationNanos, this.partial, this.error);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LiveTraceRepository.TracePoint#captureTime() captureTime} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for captureTime
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTracePoint withCaptureTime(long value) {
    if (this.captureTime == value) return this;
    return new ImmutableTracePoint(this.agentId, this.traceId, value, this.durationNanos, this.partial, this.error);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LiveTraceRepository.TracePoint#durationNanos() durationNanos} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for durationNanos
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTracePoint withDurationNanos(long value) {
    if (this.durationNanos == value) return this;
    return new ImmutableTracePoint(this.agentId, this.traceId, this.captureTime, value, this.partial, this.error);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LiveTraceRepository.TracePoint#partial() partial} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for partial
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTracePoint withPartial(boolean value) {
    if (this.partial == value) return this;
    return new ImmutableTracePoint(this.agentId, this.traceId, this.captureTime, this.durationNanos, value, this.error);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LiveTraceRepository.TracePoint#error() error} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for error
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTracePoint withError(boolean value) {
    if (this.error == value) return this;
    return new ImmutableTracePoint(this.agentId, this.traceId, this.captureTime, this.durationNanos, this.partial, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTracePoint} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTracePoint
        && equalTo((ImmutableTracePoint) another);
  }

  private boolean equalTo(ImmutableTracePoint another) {
    return agentId.equals(another.agentId)
        && traceId.equals(another.traceId)
        && captureTime == another.captureTime
        && durationNanos == another.durationNanos
        && partial == another.partial
        && error == another.error;
  }

  /**
   * Computes a hash code from attributes: {@code agentId}, {@code traceId}, {@code captureTime}, {@code durationNanos}, {@code partial}, {@code error}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + agentId.hashCode();
    h += (h << 5) + traceId.hashCode();
    h += (h << 5) + Longs.hashCode(captureTime);
    h += (h << 5) + Longs.hashCode(durationNanos);
    h += (h << 5) + Booleans.hashCode(partial);
    h += (h << 5) + Booleans.hashCode(error);
    return h;
  }

  /**
   * Prints the immutable value {@code TracePoint} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("TracePoint")
        .omitNullValues()
        .add("agentId", agentId)
        .add("traceId", traceId)
        .add("captureTime", captureTime)
        .add("durationNanos", durationNanos)
        .add("partial", partial)
        .add("error", error)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements LiveTraceRepository.TracePoint {
    @Nullable String agentId;
    @Nullable String traceId;
    long captureTime;
    boolean captureTimeIsSet;
    long durationNanos;
    boolean durationNanosIsSet;
    boolean partial;
    boolean partialIsSet;
    boolean error;
    boolean errorIsSet;
    @JsonProperty("agentId")
    public void setAgentId(String agentId) {
      this.agentId = agentId;
    }
    @JsonProperty("traceId")
    public void setTraceId(String traceId) {
      this.traceId = traceId;
    }
    @JsonProperty("captureTime")
    public void setCaptureTime(long captureTime) {
      this.captureTime = captureTime;
      this.captureTimeIsSet = true;
    }
    @JsonProperty("durationNanos")
    public void setDurationNanos(long durationNanos) {
      this.durationNanos = durationNanos;
      this.durationNanosIsSet = true;
    }
    @JsonProperty("partial")
    public void setPartial(boolean partial) {
      this.partial = partial;
      this.partialIsSet = true;
    }
    @JsonProperty("error")
    public void setError(boolean error) {
      this.error = error;
      this.errorIsSet = true;
    }
    @Override
    public String agentId() { throw new UnsupportedOperationException(); }
    @Override
    public String traceId() { throw new UnsupportedOperationException(); }
    @Override
    public long captureTime() { throw new UnsupportedOperationException(); }
    @Override
    public long durationNanos() { throw new UnsupportedOperationException(); }
    @Override
    public boolean partial() { throw new UnsupportedOperationException(); }
    @Override
    public boolean error() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableTracePoint fromJson(Json json) {
    ImmutableTracePoint.Builder builder = ImmutableTracePoint.builder();
    if (json.agentId != null) {
      builder.agentId(json.agentId);
    }
    if (json.traceId != null) {
      builder.traceId(json.traceId);
    }
    if (json.captureTimeIsSet) {
      builder.captureTime(json.captureTime);
    }
    if (json.durationNanosIsSet) {
      builder.durationNanos(json.durationNanos);
    }
    if (json.partialIsSet) {
      builder.partial(json.partial);
    }
    if (json.errorIsSet) {
      builder.error(json.error);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link LiveTraceRepository.TracePoint} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable TracePoint instance
   */
  public static ImmutableTracePoint copyOf(LiveTraceRepository.TracePoint instance) {
    if (instance instanceof ImmutableTracePoint) {
      return (ImmutableTracePoint) instance;
    }
    return ImmutableTracePoint.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableTracePoint ImmutableTracePoint}.
   * @return A new ImmutableTracePoint builder
   */
  public static ImmutableTracePoint.Builder builder() {
    return new ImmutableTracePoint.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableTracePoint ImmutableTracePoint}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_AGENT_ID = 0x1L;
    private static final long INIT_BIT_TRACE_ID = 0x2L;
    private static final long INIT_BIT_CAPTURE_TIME = 0x4L;
    private static final long INIT_BIT_DURATION_NANOS = 0x8L;
    private static final long INIT_BIT_PARTIAL = 0x10L;
    private static final long INIT_BIT_ERROR = 0x20L;
    private long initBits = 0x3fL;

    private @Nullable String agentId;
    private @Nullable String traceId;
    private long captureTime;
    private long durationNanos;
    private boolean partial;
    private boolean error;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code TracePoint} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(LiveTraceRepository.TracePoint instance) {
      Preconditions.checkNotNull(instance, "instance");
      agentId(instance.agentId());
      traceId(instance.traceId());
      captureTime(instance.captureTime());
      durationNanos(instance.durationNanos());
      partial(instance.partial());
      error(instance.error());
      return this;
    }

    /**
     * Initializes the value for the {@link LiveTraceRepository.TracePoint#agentId() agentId} attribute.
     * @param agentId The value for agentId 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder agentId(String agentId) {
      this.agentId = Preconditions.checkNotNull(agentId, "agentId");
      initBits &= ~INIT_BIT_AGENT_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link LiveTraceRepository.TracePoint#traceId() traceId} attribute.
     * @param traceId The value for traceId 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder traceId(String traceId) {
      this.traceId = Preconditions.checkNotNull(traceId, "traceId");
      initBits &= ~INIT_BIT_TRACE_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link LiveTraceRepository.TracePoint#captureTime() captureTime} attribute.
     * @param captureTime The value for captureTime 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder captureTime(long captureTime) {
      this.captureTime = captureTime;
      initBits &= ~INIT_BIT_CAPTURE_TIME;
      return this;
    }

    /**
     * Initializes the value for the {@link LiveTraceRepository.TracePoint#durationNanos() durationNanos} attribute.
     * @param durationNanos The value for durationNanos 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder durationNanos(long durationNanos) {
      this.durationNanos = durationNanos;
      initBits &= ~INIT_BIT_DURATION_NANOS;
      return this;
    }

    /**
     * Initializes the value for the {@link LiveTraceRepository.TracePoint#partial() partial} attribute.
     * @param partial The value for partial 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder partial(boolean partial) {
      this.partial = partial;
      initBits &= ~INIT_BIT_PARTIAL;
      return this;
    }

    /**
     * Initializes the value for the {@link LiveTraceRepository.TracePoint#error() error} attribute.
     * @param error The value for error 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder error(boolean error) {
      this.error = error;
      initBits &= ~INIT_BIT_ERROR;
      return this;
    }

    /**
     * Builds a new {@link ImmutableTracePoint ImmutableTracePoint}.
     * @return An immutable instance of TracePoint
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableTracePoint build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableTracePoint(agentId, traceId, captureTime, durationNanos, partial, error);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_AGENT_ID) != 0) attributes.add("agentId");
      if ((initBits & INIT_BIT_TRACE_ID) != 0) attributes.add("traceId");
      if ((initBits & INIT_BIT_CAPTURE_TIME) != 0) attributes.add("captureTime");
      if ((initBits & INIT_BIT_DURATION_NANOS) != 0) attributes.add("durationNanos");
      if ((initBits & INIT_BIT_PARTIAL) != 0) attributes.add("partial");
      if ((initBits & INIT_BIT_ERROR) != 0) attributes.add("error");
      return "Cannot build TracePoint, some of required attributes are not set " + attributes;
    }
  }
}
