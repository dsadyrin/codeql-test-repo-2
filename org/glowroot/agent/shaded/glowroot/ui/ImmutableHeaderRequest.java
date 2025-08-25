package org.glowroot.agent.shaded.glowroot.ui;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import org.glowroot.agent.shaded.google.common.collect.Lists;
import org.glowroot.agent.shaded.google.common.primitives.Booleans;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link TraceJsonService.HeaderRequest}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableHeaderRequest.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "TraceJsonService.HeaderRequest"})
@Immutable
final class ImmutableHeaderRequest extends TraceJsonService.HeaderRequest {
  private final String agentId;
  private final String traceId;
  private final boolean checkLiveTraces;

  private ImmutableHeaderRequest(ImmutableHeaderRequest.Builder builder) {
    this.agentId = builder.agentId;
    this.traceId = builder.traceId;
    this.checkLiveTraces = builder.checkLiveTracesIsSet()
        ? builder.checkLiveTraces
        : super.checkLiveTraces();
  }

  private ImmutableHeaderRequest(String agentId, String traceId, boolean checkLiveTraces) {
    this.agentId = agentId;
    this.traceId = traceId;
    this.checkLiveTraces = checkLiveTraces;
  }

  /**
   * @return The value of the {@code agentId} attribute
   */
  @JsonProperty("agentId")
  @Override
  String agentId() {
    return agentId;
  }

  /**
   * @return The value of the {@code traceId} attribute
   */
  @JsonProperty("traceId")
  @Override
  String traceId() {
    return traceId;
  }

  /**
   * @return The value of the {@code checkLiveTraces} attribute
   */
  @JsonProperty("checkLiveTraces")
  @Override
  boolean checkLiveTraces() {
    return checkLiveTraces;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TraceJsonService.HeaderRequest#agentId() agentId} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for agentId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableHeaderRequest withAgentId(String value) {
    if (this.agentId.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "agentId");
    return new ImmutableHeaderRequest(newValue, this.traceId, this.checkLiveTraces);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TraceJsonService.HeaderRequest#traceId() traceId} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for traceId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableHeaderRequest withTraceId(String value) {
    if (this.traceId.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "traceId");
    return new ImmutableHeaderRequest(this.agentId, newValue, this.checkLiveTraces);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TraceJsonService.HeaderRequest#checkLiveTraces() checkLiveTraces} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for checkLiveTraces
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableHeaderRequest withCheckLiveTraces(boolean value) {
    if (this.checkLiveTraces == value) return this;
    return new ImmutableHeaderRequest(this.agentId, this.traceId, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableHeaderRequest} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableHeaderRequest
        && equalTo((ImmutableHeaderRequest) another);
  }

  private boolean equalTo(ImmutableHeaderRequest another) {
    return agentId.equals(another.agentId)
        && traceId.equals(another.traceId)
        && checkLiveTraces == another.checkLiveTraces;
  }

  /**
   * Computes a hash code from attributes: {@code agentId}, {@code traceId}, {@code checkLiveTraces}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + agentId.hashCode();
    h += (h << 5) + traceId.hashCode();
    h += (h << 5) + Booleans.hashCode(checkLiveTraces);
    return h;
  }

  /**
   * Prints the immutable value {@code HeaderRequest} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("HeaderRequest")
        .omitNullValues()
        .add("agentId", agentId)
        .add("traceId", traceId)
        .add("checkLiveTraces", checkLiveTraces)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends TraceJsonService.HeaderRequest {
    @Nullable String agentId;
    @Nullable String traceId;
    boolean checkLiveTraces;
    boolean checkLiveTracesIsSet;
    @JsonProperty("agentId")
    public void setAgentId(String agentId) {
      this.agentId = agentId;
    }
    @JsonProperty("traceId")
    public void setTraceId(String traceId) {
      this.traceId = traceId;
    }
    @JsonProperty("checkLiveTraces")
    public void setCheckLiveTraces(boolean checkLiveTraces) {
      this.checkLiveTraces = checkLiveTraces;
      this.checkLiveTracesIsSet = true;
    }
    @Override
    String agentId() { throw new UnsupportedOperationException(); }
    @Override
    String traceId() { throw new UnsupportedOperationException(); }
    @Override
    boolean checkLiveTraces() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableHeaderRequest fromJson(Json json) {
    ImmutableHeaderRequest.Builder builder = ImmutableHeaderRequest.builder();
    if (json.agentId != null) {
      builder.agentId(json.agentId);
    }
    if (json.traceId != null) {
      builder.traceId(json.traceId);
    }
    if (json.checkLiveTracesIsSet) {
      builder.checkLiveTraces(json.checkLiveTraces);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link TraceJsonService.HeaderRequest} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable HeaderRequest instance
   */
  public static ImmutableHeaderRequest copyOf(TraceJsonService.HeaderRequest instance) {
    if (instance instanceof ImmutableHeaderRequest) {
      return (ImmutableHeaderRequest) instance;
    }
    return ImmutableHeaderRequest.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableHeaderRequest ImmutableHeaderRequest}.
   * @return A new ImmutableHeaderRequest builder
   */
  public static ImmutableHeaderRequest.Builder builder() {
    return new ImmutableHeaderRequest.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableHeaderRequest ImmutableHeaderRequest}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_AGENT_ID = 0x1L;
    private static final long INIT_BIT_TRACE_ID = 0x2L;
    private static final long OPT_BIT_CHECK_LIVE_TRACES = 0x1L;
    private long initBits = 0x3L;
    private long optBits;

    private @Nullable String agentId;
    private @Nullable String traceId;
    private boolean checkLiveTraces;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code HeaderRequest} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(TraceJsonService.HeaderRequest instance) {
      Preconditions.checkNotNull(instance, "instance");
      agentId(instance.agentId());
      traceId(instance.traceId());
      checkLiveTraces(instance.checkLiveTraces());
      return this;
    }

    /**
     * Initializes the value for the {@link TraceJsonService.HeaderRequest#agentId() agentId} attribute.
     * @param agentId The value for agentId 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder agentId(String agentId) {
      this.agentId = Preconditions.checkNotNull(agentId, "agentId");
      initBits &= ~INIT_BIT_AGENT_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link TraceJsonService.HeaderRequest#traceId() traceId} attribute.
     * @param traceId The value for traceId 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder traceId(String traceId) {
      this.traceId = Preconditions.checkNotNull(traceId, "traceId");
      initBits &= ~INIT_BIT_TRACE_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link TraceJsonService.HeaderRequest#checkLiveTraces() checkLiveTraces} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link TraceJsonService.HeaderRequest#checkLiveTraces() checkLiveTraces}.</em>
     * @param checkLiveTraces The value for checkLiveTraces 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder checkLiveTraces(boolean checkLiveTraces) {
      this.checkLiveTraces = checkLiveTraces;
      optBits |= OPT_BIT_CHECK_LIVE_TRACES;
      return this;
    }

    /**
     * Builds a new {@link ImmutableHeaderRequest ImmutableHeaderRequest}.
     * @return An immutable instance of HeaderRequest
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableHeaderRequest build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableHeaderRequest(this);
    }

    private boolean checkLiveTracesIsSet() {
      return (optBits & OPT_BIT_CHECK_LIVE_TRACES) != 0;
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_AGENT_ID) != 0) attributes.add("agentId");
      if ((initBits & INIT_BIT_TRACE_ID) != 0) attributes.add("traceId");
      return "Cannot build HeaderRequest, some of required attributes are not set " + attributes;
    }
  }
}
