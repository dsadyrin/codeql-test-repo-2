package org.glowroot.agent.shaded.glowroot.ui;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import org.glowroot.agent.shaded.google.common.collect.ImmutableList;
import org.glowroot.agent.shaded.google.common.collect.Lists;
import org.glowroot.agent.shaded.google.common.primitives.Booleans;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link InstrumentationConfigJsonService.InstrumentationConfigResponse}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableInstrumentationConfigResponse.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "InstrumentationConfigJsonService.InstrumentationConfigResponse"})
@Immutable
final class ImmutableInstrumentationConfigResponse
    implements InstrumentationConfigJsonService.InstrumentationConfigResponse {
  private final boolean agentNotConnected;
  private final InstrumentationConfigJsonService.InstrumentationConfigDto config;
  private final ImmutableList<InstrumentationConfigJsonService.MethodSignatureDto> methodSignatures;

  private ImmutableInstrumentationConfigResponse(
      boolean agentNotConnected,
      InstrumentationConfigJsonService.InstrumentationConfigDto config,
      ImmutableList<InstrumentationConfigJsonService.MethodSignatureDto> methodSignatures) {
    this.agentNotConnected = agentNotConnected;
    this.config = config;
    this.methodSignatures = methodSignatures;
  }

  /**
   * @return The value of the {@code agentNotConnected} attribute
   */
  @JsonProperty("agentNotConnected")
  @Override
  public boolean agentNotConnected() {
    return agentNotConnected;
  }

  /**
   * @return The value of the {@code config} attribute
   */
  @JsonProperty("config")
  @Override
  public InstrumentationConfigJsonService.InstrumentationConfigDto config() {
    return config;
  }

  /**
   * @return The value of the {@code methodSignatures} attribute
   */
  @JsonProperty("methodSignatures")
  @Override
  public ImmutableList<InstrumentationConfigJsonService.MethodSignatureDto> methodSignatures() {
    return methodSignatures;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link InstrumentationConfigJsonService.InstrumentationConfigResponse#agentNotConnected() agentNotConnected} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for agentNotConnected
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableInstrumentationConfigResponse withAgentNotConnected(boolean value) {
    if (this.agentNotConnected == value) return this;
    return new ImmutableInstrumentationConfigResponse(value, this.config, this.methodSignatures);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link InstrumentationConfigJsonService.InstrumentationConfigResponse#config() config} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for config
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableInstrumentationConfigResponse withConfig(InstrumentationConfigJsonService.InstrumentationConfigDto value) {
    if (this.config == value) return this;
    InstrumentationConfigJsonService.InstrumentationConfigDto newValue = Preconditions.checkNotNull(value, "config");
    return new ImmutableInstrumentationConfigResponse(this.agentNotConnected, newValue, this.methodSignatures);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link InstrumentationConfigJsonService.InstrumentationConfigResponse#methodSignatures() methodSignatures}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInstrumentationConfigResponse withMethodSignatures(InstrumentationConfigJsonService.MethodSignatureDto... elements) {
    ImmutableList<InstrumentationConfigJsonService.MethodSignatureDto> newValue = ImmutableList.copyOf(elements);
    return new ImmutableInstrumentationConfigResponse(this.agentNotConnected, this.config, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link InstrumentationConfigJsonService.InstrumentationConfigResponse#methodSignatures() methodSignatures}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of methodSignatures elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInstrumentationConfigResponse withMethodSignatures(Iterable<? extends InstrumentationConfigJsonService.MethodSignatureDto> elements) {
    if (this.methodSignatures == elements) return this;
    ImmutableList<InstrumentationConfigJsonService.MethodSignatureDto> newValue = ImmutableList.copyOf(elements);
    return new ImmutableInstrumentationConfigResponse(this.agentNotConnected, this.config, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableInstrumentationConfigResponse} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableInstrumentationConfigResponse
        && equalTo((ImmutableInstrumentationConfigResponse) another);
  }

  private boolean equalTo(ImmutableInstrumentationConfigResponse another) {
    return agentNotConnected == another.agentNotConnected
        && config.equals(another.config)
        && methodSignatures.equals(another.methodSignatures);
  }

  /**
   * Computes a hash code from attributes: {@code agentNotConnected}, {@code config}, {@code methodSignatures}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Booleans.hashCode(agentNotConnected);
    h += (h << 5) + config.hashCode();
    h += (h << 5) + methodSignatures.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code InstrumentationConfigResponse} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("InstrumentationConfigResponse")
        .omitNullValues()
        .add("agentNotConnected", agentNotConnected)
        .add("config", config)
        .add("methodSignatures", methodSignatures)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json
      implements InstrumentationConfigJsonService.InstrumentationConfigResponse {
    boolean agentNotConnected;
    boolean agentNotConnectedIsSet;
    @Nullable InstrumentationConfigJsonService.InstrumentationConfigDto config;
    ImmutableList<InstrumentationConfigJsonService.MethodSignatureDto> methodSignatures = ImmutableList.of();
    @JsonProperty("agentNotConnected")
    public void setAgentNotConnected(boolean agentNotConnected) {
      this.agentNotConnected = agentNotConnected;
      this.agentNotConnectedIsSet = true;
    }
    @JsonProperty("config")
    public void setConfig(InstrumentationConfigJsonService.InstrumentationConfigDto config) {
      this.config = config;
    }
    @JsonProperty("methodSignatures")
    public void setMethodSignatures(ImmutableList<InstrumentationConfigJsonService.MethodSignatureDto> methodSignatures) {
      this.methodSignatures = methodSignatures;
    }
    @Override
    public boolean agentNotConnected() { throw new UnsupportedOperationException(); }
    @Override
    public InstrumentationConfigJsonService.InstrumentationConfigDto config() { throw new UnsupportedOperationException(); }
    @Override
    public ImmutableList<InstrumentationConfigJsonService.MethodSignatureDto> methodSignatures() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableInstrumentationConfigResponse fromJson(Json json) {
    ImmutableInstrumentationConfigResponse.Builder builder = ImmutableInstrumentationConfigResponse.builder();
    if (json.agentNotConnectedIsSet) {
      builder.agentNotConnected(json.agentNotConnected);
    }
    if (json.config != null) {
      builder.config(json.config);
    }
    if (json.methodSignatures != null) {
      builder.addAllMethodSignatures(json.methodSignatures);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link InstrumentationConfigJsonService.InstrumentationConfigResponse} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable InstrumentationConfigResponse instance
   */
  public static ImmutableInstrumentationConfigResponse copyOf(InstrumentationConfigJsonService.InstrumentationConfigResponse instance) {
    if (instance instanceof ImmutableInstrumentationConfigResponse) {
      return (ImmutableInstrumentationConfigResponse) instance;
    }
    return ImmutableInstrumentationConfigResponse.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableInstrumentationConfigResponse ImmutableInstrumentationConfigResponse}.
   * @return A new ImmutableInstrumentationConfigResponse builder
   */
  public static ImmutableInstrumentationConfigResponse.Builder builder() {
    return new ImmutableInstrumentationConfigResponse.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableInstrumentationConfigResponse ImmutableInstrumentationConfigResponse}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_AGENT_NOT_CONNECTED = 0x1L;
    private static final long INIT_BIT_CONFIG = 0x2L;
    private long initBits = 0x3L;

    private boolean agentNotConnected;
    private @Nullable InstrumentationConfigJsonService.InstrumentationConfigDto config;
    private ImmutableList.Builder<InstrumentationConfigJsonService.MethodSignatureDto> methodSignatures = ImmutableList.builder();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code InstrumentationConfigResponse} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(InstrumentationConfigJsonService.InstrumentationConfigResponse instance) {
      Preconditions.checkNotNull(instance, "instance");
      agentNotConnected(instance.agentNotConnected());
      config(instance.config());
      addAllMethodSignatures(instance.methodSignatures());
      return this;
    }

    /**
     * Initializes the value for the {@link InstrumentationConfigJsonService.InstrumentationConfigResponse#agentNotConnected() agentNotConnected} attribute.
     * @param agentNotConnected The value for agentNotConnected 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder agentNotConnected(boolean agentNotConnected) {
      this.agentNotConnected = agentNotConnected;
      initBits &= ~INIT_BIT_AGENT_NOT_CONNECTED;
      return this;
    }

    /**
     * Initializes the value for the {@link InstrumentationConfigJsonService.InstrumentationConfigResponse#config() config} attribute.
     * @param config The value for config 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder config(InstrumentationConfigJsonService.InstrumentationConfigDto config) {
      this.config = Preconditions.checkNotNull(config, "config");
      initBits &= ~INIT_BIT_CONFIG;
      return this;
    }

    /**
     * Adds one element to {@link InstrumentationConfigJsonService.InstrumentationConfigResponse#methodSignatures() methodSignatures} list.
     * @param element A methodSignatures element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addMethodSignatures(InstrumentationConfigJsonService.MethodSignatureDto element) {
      this.methodSignatures.add(element);
      return this;
    }

    /**
     * Adds elements to {@link InstrumentationConfigJsonService.InstrumentationConfigResponse#methodSignatures() methodSignatures} list.
     * @param elements An array of methodSignatures elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addMethodSignatures(InstrumentationConfigJsonService.MethodSignatureDto... elements) {
      this.methodSignatures.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link InstrumentationConfigJsonService.InstrumentationConfigResponse#methodSignatures() methodSignatures} list.
     * @param elements An iterable of methodSignatures elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder methodSignatures(Iterable<? extends InstrumentationConfigJsonService.MethodSignatureDto> elements) {
      this.methodSignatures = ImmutableList.builder();
      return addAllMethodSignatures(elements);
    }

    /**
     * Adds elements to {@link InstrumentationConfigJsonService.InstrumentationConfigResponse#methodSignatures() methodSignatures} list.
     * @param elements An iterable of methodSignatures elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllMethodSignatures(Iterable<? extends InstrumentationConfigJsonService.MethodSignatureDto> elements) {
      this.methodSignatures.addAll(elements);
      return this;
    }

    /**
     * Builds a new {@link ImmutableInstrumentationConfigResponse ImmutableInstrumentationConfigResponse}.
     * @return An immutable instance of InstrumentationConfigResponse
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableInstrumentationConfigResponse build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableInstrumentationConfigResponse(agentNotConnected, config, methodSignatures.build());
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_AGENT_NOT_CONNECTED) != 0) attributes.add("agentNotConnected");
      if ((initBits & INIT_BIT_CONFIG) != 0) attributes.add("config");
      return "Cannot build InstrumentationConfigResponse, some of required attributes are not set " + attributes;
    }
  }
}
