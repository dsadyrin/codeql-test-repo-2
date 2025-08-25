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
 * Immutable implementation of {@link GaugeConfigJsonService.GaugeResponse}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableGaugeResponse.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "GaugeConfigJsonService.GaugeResponse"})
@Immutable
final class ImmutableGaugeResponse implements GaugeConfigJsonService.GaugeResponse {
  private final GaugeConfigJsonService.GaugeConfigDto config;
  private final boolean agentNotConnected;
  private final boolean mbeanUnavailable;
  private final boolean mbeanUnmatched;
  private final ImmutableList<String> mbeanAvailableAttributeNames;

  private ImmutableGaugeResponse(
      GaugeConfigJsonService.GaugeConfigDto config,
      boolean agentNotConnected,
      boolean mbeanUnavailable,
      boolean mbeanUnmatched,
      ImmutableList<String> mbeanAvailableAttributeNames) {
    this.config = config;
    this.agentNotConnected = agentNotConnected;
    this.mbeanUnavailable = mbeanUnavailable;
    this.mbeanUnmatched = mbeanUnmatched;
    this.mbeanAvailableAttributeNames = mbeanAvailableAttributeNames;
  }

  /**
   * @return The value of the {@code config} attribute
   */
  @JsonProperty("config")
  @Override
  public GaugeConfigJsonService.GaugeConfigDto config() {
    return config;
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
   * @return The value of the {@code mbeanUnavailable} attribute
   */
  @JsonProperty("mbeanUnavailable")
  @Override
  public boolean mbeanUnavailable() {
    return mbeanUnavailable;
  }

  /**
   * @return The value of the {@code mbeanUnmatched} attribute
   */
  @JsonProperty("mbeanUnmatched")
  @Override
  public boolean mbeanUnmatched() {
    return mbeanUnmatched;
  }

  /**
   * @return The value of the {@code mbeanAvailableAttributeNames} attribute
   */
  @JsonProperty("mbeanAvailableAttributeNames")
  @Override
  public ImmutableList<String> mbeanAvailableAttributeNames() {
    return mbeanAvailableAttributeNames;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link GaugeConfigJsonService.GaugeResponse#config() config} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for config
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableGaugeResponse withConfig(GaugeConfigJsonService.GaugeConfigDto value) {
    if (this.config == value) return this;
    GaugeConfigJsonService.GaugeConfigDto newValue = Preconditions.checkNotNull(value, "config");
    return new ImmutableGaugeResponse(
        newValue,
        this.agentNotConnected,
        this.mbeanUnavailable,
        this.mbeanUnmatched,
        this.mbeanAvailableAttributeNames);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link GaugeConfigJsonService.GaugeResponse#agentNotConnected() agentNotConnected} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for agentNotConnected
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableGaugeResponse withAgentNotConnected(boolean value) {
    if (this.agentNotConnected == value) return this;
    return new ImmutableGaugeResponse(
        this.config,
        value,
        this.mbeanUnavailable,
        this.mbeanUnmatched,
        this.mbeanAvailableAttributeNames);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link GaugeConfigJsonService.GaugeResponse#mbeanUnavailable() mbeanUnavailable} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for mbeanUnavailable
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableGaugeResponse withMbeanUnavailable(boolean value) {
    if (this.mbeanUnavailable == value) return this;
    return new ImmutableGaugeResponse(
        this.config,
        this.agentNotConnected,
        value,
        this.mbeanUnmatched,
        this.mbeanAvailableAttributeNames);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link GaugeConfigJsonService.GaugeResponse#mbeanUnmatched() mbeanUnmatched} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for mbeanUnmatched
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableGaugeResponse withMbeanUnmatched(boolean value) {
    if (this.mbeanUnmatched == value) return this;
    return new ImmutableGaugeResponse(
        this.config,
        this.agentNotConnected,
        this.mbeanUnavailable,
        value,
        this.mbeanAvailableAttributeNames);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link GaugeConfigJsonService.GaugeResponse#mbeanAvailableAttributeNames() mbeanAvailableAttributeNames}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGaugeResponse withMbeanAvailableAttributeNames(String... elements) {
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableGaugeResponse(this.config, this.agentNotConnected, this.mbeanUnavailable, this.mbeanUnmatched, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link GaugeConfigJsonService.GaugeResponse#mbeanAvailableAttributeNames() mbeanAvailableAttributeNames}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of mbeanAvailableAttributeNames elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGaugeResponse withMbeanAvailableAttributeNames(Iterable<String> elements) {
    if (this.mbeanAvailableAttributeNames == elements) return this;
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableGaugeResponse(this.config, this.agentNotConnected, this.mbeanUnavailable, this.mbeanUnmatched, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableGaugeResponse} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableGaugeResponse
        && equalTo((ImmutableGaugeResponse) another);
  }

  private boolean equalTo(ImmutableGaugeResponse another) {
    return config.equals(another.config)
        && agentNotConnected == another.agentNotConnected
        && mbeanUnavailable == another.mbeanUnavailable
        && mbeanUnmatched == another.mbeanUnmatched
        && mbeanAvailableAttributeNames.equals(another.mbeanAvailableAttributeNames);
  }

  /**
   * Computes a hash code from attributes: {@code config}, {@code agentNotConnected}, {@code mbeanUnavailable}, {@code mbeanUnmatched}, {@code mbeanAvailableAttributeNames}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + config.hashCode();
    h += (h << 5) + Booleans.hashCode(agentNotConnected);
    h += (h << 5) + Booleans.hashCode(mbeanUnavailable);
    h += (h << 5) + Booleans.hashCode(mbeanUnmatched);
    h += (h << 5) + mbeanAvailableAttributeNames.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code GaugeResponse} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("GaugeResponse")
        .omitNullValues()
        .add("config", config)
        .add("agentNotConnected", agentNotConnected)
        .add("mbeanUnavailable", mbeanUnavailable)
        .add("mbeanUnmatched", mbeanUnmatched)
        .add("mbeanAvailableAttributeNames", mbeanAvailableAttributeNames)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements GaugeConfigJsonService.GaugeResponse {
    @Nullable GaugeConfigJsonService.GaugeConfigDto config;
    boolean agentNotConnected;
    boolean agentNotConnectedIsSet;
    boolean mbeanUnavailable;
    boolean mbeanUnavailableIsSet;
    boolean mbeanUnmatched;
    boolean mbeanUnmatchedIsSet;
    ImmutableList<String> mbeanAvailableAttributeNames = ImmutableList.of();
    @JsonProperty("config")
    public void setConfig(GaugeConfigJsonService.GaugeConfigDto config) {
      this.config = config;
    }
    @JsonProperty("agentNotConnected")
    public void setAgentNotConnected(boolean agentNotConnected) {
      this.agentNotConnected = agentNotConnected;
      this.agentNotConnectedIsSet = true;
    }
    @JsonProperty("mbeanUnavailable")
    public void setMbeanUnavailable(boolean mbeanUnavailable) {
      this.mbeanUnavailable = mbeanUnavailable;
      this.mbeanUnavailableIsSet = true;
    }
    @JsonProperty("mbeanUnmatched")
    public void setMbeanUnmatched(boolean mbeanUnmatched) {
      this.mbeanUnmatched = mbeanUnmatched;
      this.mbeanUnmatchedIsSet = true;
    }
    @JsonProperty("mbeanAvailableAttributeNames")
    public void setMbeanAvailableAttributeNames(ImmutableList<String> mbeanAvailableAttributeNames) {
      this.mbeanAvailableAttributeNames = mbeanAvailableAttributeNames;
    }
    @Override
    public GaugeConfigJsonService.GaugeConfigDto config() { throw new UnsupportedOperationException(); }
    @Override
    public boolean agentNotConnected() { throw new UnsupportedOperationException(); }
    @Override
    public boolean mbeanUnavailable() { throw new UnsupportedOperationException(); }
    @Override
    public boolean mbeanUnmatched() { throw new UnsupportedOperationException(); }
    @Override
    public ImmutableList<String> mbeanAvailableAttributeNames() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableGaugeResponse fromJson(Json json) {
    ImmutableGaugeResponse.Builder builder = ImmutableGaugeResponse.builder();
    if (json.config != null) {
      builder.config(json.config);
    }
    if (json.agentNotConnectedIsSet) {
      builder.agentNotConnected(json.agentNotConnected);
    }
    if (json.mbeanUnavailableIsSet) {
      builder.mbeanUnavailable(json.mbeanUnavailable);
    }
    if (json.mbeanUnmatchedIsSet) {
      builder.mbeanUnmatched(json.mbeanUnmatched);
    }
    if (json.mbeanAvailableAttributeNames != null) {
      builder.addAllMbeanAvailableAttributeNames(json.mbeanAvailableAttributeNames);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link GaugeConfigJsonService.GaugeResponse} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable GaugeResponse instance
   */
  public static ImmutableGaugeResponse copyOf(GaugeConfigJsonService.GaugeResponse instance) {
    if (instance instanceof ImmutableGaugeResponse) {
      return (ImmutableGaugeResponse) instance;
    }
    return ImmutableGaugeResponse.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableGaugeResponse ImmutableGaugeResponse}.
   * @return A new ImmutableGaugeResponse builder
   */
  public static ImmutableGaugeResponse.Builder builder() {
    return new ImmutableGaugeResponse.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableGaugeResponse ImmutableGaugeResponse}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_CONFIG = 0x1L;
    private static final long INIT_BIT_AGENT_NOT_CONNECTED = 0x2L;
    private static final long INIT_BIT_MBEAN_UNAVAILABLE = 0x4L;
    private static final long INIT_BIT_MBEAN_UNMATCHED = 0x8L;
    private long initBits = 0xfL;

    private @Nullable GaugeConfigJsonService.GaugeConfigDto config;
    private boolean agentNotConnected;
    private boolean mbeanUnavailable;
    private boolean mbeanUnmatched;
    private ImmutableList.Builder<String> mbeanAvailableAttributeNames = ImmutableList.builder();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code GaugeResponse} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(GaugeConfigJsonService.GaugeResponse instance) {
      Preconditions.checkNotNull(instance, "instance");
      config(instance.config());
      agentNotConnected(instance.agentNotConnected());
      mbeanUnavailable(instance.mbeanUnavailable());
      mbeanUnmatched(instance.mbeanUnmatched());
      addAllMbeanAvailableAttributeNames(instance.mbeanAvailableAttributeNames());
      return this;
    }

    /**
     * Initializes the value for the {@link GaugeConfigJsonService.GaugeResponse#config() config} attribute.
     * @param config The value for config 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder config(GaugeConfigJsonService.GaugeConfigDto config) {
      this.config = Preconditions.checkNotNull(config, "config");
      initBits &= ~INIT_BIT_CONFIG;
      return this;
    }

    /**
     * Initializes the value for the {@link GaugeConfigJsonService.GaugeResponse#agentNotConnected() agentNotConnected} attribute.
     * @param agentNotConnected The value for agentNotConnected 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder agentNotConnected(boolean agentNotConnected) {
      this.agentNotConnected = agentNotConnected;
      initBits &= ~INIT_BIT_AGENT_NOT_CONNECTED;
      return this;
    }

    /**
     * Initializes the value for the {@link GaugeConfigJsonService.GaugeResponse#mbeanUnavailable() mbeanUnavailable} attribute.
     * @param mbeanUnavailable The value for mbeanUnavailable 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder mbeanUnavailable(boolean mbeanUnavailable) {
      this.mbeanUnavailable = mbeanUnavailable;
      initBits &= ~INIT_BIT_MBEAN_UNAVAILABLE;
      return this;
    }

    /**
     * Initializes the value for the {@link GaugeConfigJsonService.GaugeResponse#mbeanUnmatched() mbeanUnmatched} attribute.
     * @param mbeanUnmatched The value for mbeanUnmatched 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder mbeanUnmatched(boolean mbeanUnmatched) {
      this.mbeanUnmatched = mbeanUnmatched;
      initBits &= ~INIT_BIT_MBEAN_UNMATCHED;
      return this;
    }

    /**
     * Adds one element to {@link GaugeConfigJsonService.GaugeResponse#mbeanAvailableAttributeNames() mbeanAvailableAttributeNames} list.
     * @param element A mbeanAvailableAttributeNames element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addMbeanAvailableAttributeNames(String element) {
      this.mbeanAvailableAttributeNames.add(element);
      return this;
    }

    /**
     * Adds elements to {@link GaugeConfigJsonService.GaugeResponse#mbeanAvailableAttributeNames() mbeanAvailableAttributeNames} list.
     * @param elements An array of mbeanAvailableAttributeNames elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addMbeanAvailableAttributeNames(String... elements) {
      this.mbeanAvailableAttributeNames.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link GaugeConfigJsonService.GaugeResponse#mbeanAvailableAttributeNames() mbeanAvailableAttributeNames} list.
     * @param elements An iterable of mbeanAvailableAttributeNames elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder mbeanAvailableAttributeNames(Iterable<String> elements) {
      this.mbeanAvailableAttributeNames = ImmutableList.builder();
      return addAllMbeanAvailableAttributeNames(elements);
    }

    /**
     * Adds elements to {@link GaugeConfigJsonService.GaugeResponse#mbeanAvailableAttributeNames() mbeanAvailableAttributeNames} list.
     * @param elements An iterable of mbeanAvailableAttributeNames elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllMbeanAvailableAttributeNames(Iterable<String> elements) {
      this.mbeanAvailableAttributeNames.addAll(elements);
      return this;
    }

    /**
     * Builds a new {@link ImmutableGaugeResponse ImmutableGaugeResponse}.
     * @return An immutable instance of GaugeResponse
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableGaugeResponse build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableGaugeResponse(
          config,
          agentNotConnected,
          mbeanUnavailable,
          mbeanUnmatched,
          mbeanAvailableAttributeNames.build());
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_CONFIG) != 0) attributes.add("config");
      if ((initBits & INIT_BIT_AGENT_NOT_CONNECTED) != 0) attributes.add("agentNotConnected");
      if ((initBits & INIT_BIT_MBEAN_UNAVAILABLE) != 0) attributes.add("mbeanUnavailable");
      if ((initBits & INIT_BIT_MBEAN_UNMATCHED) != 0) attributes.add("mbeanUnmatched");
      return "Cannot build GaugeResponse, some of required attributes are not set " + attributes;
    }
  }
}
