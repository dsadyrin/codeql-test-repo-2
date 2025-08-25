package org.glowroot.agent.shaded.glowroot.ui;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import org.glowroot.agent.shaded.google.common.collect.ImmutableList;
import org.glowroot.agent.shaded.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link RoleConfigJsonService.RoleConfigResponse}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableRoleConfigResponse.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "RoleConfigJsonService.RoleConfigResponse"})
@Immutable
final class ImmutableRoleConfigResponse
    implements RoleConfigJsonService.RoleConfigResponse {
  private final RoleConfigJsonService.RoleConfigDto config;
  private final ImmutableList<RoleConfigJsonService.FlattenedAgentRollup> allAgentRollups;

  private ImmutableRoleConfigResponse(
      RoleConfigJsonService.RoleConfigDto config,
      ImmutableList<RoleConfigJsonService.FlattenedAgentRollup> allAgentRollups) {
    this.config = config;
    this.allAgentRollups = allAgentRollups;
  }

  /**
   * @return The value of the {@code config} attribute
   */
  @JsonProperty("config")
  @Override
  public RoleConfigJsonService.RoleConfigDto config() {
    return config;
  }

  /**
   * @return The value of the {@code allAgentRollups} attribute
   */
  @JsonProperty("allAgentRollups")
  @Override
  public ImmutableList<RoleConfigJsonService.FlattenedAgentRollup> allAgentRollups() {
    return allAgentRollups;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link RoleConfigJsonService.RoleConfigResponse#config() config} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for config
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRoleConfigResponse withConfig(RoleConfigJsonService.RoleConfigDto value) {
    if (this.config == value) return this;
    RoleConfigJsonService.RoleConfigDto newValue = Preconditions.checkNotNull(value, "config");
    return new ImmutableRoleConfigResponse(newValue, this.allAgentRollups);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link RoleConfigJsonService.RoleConfigResponse#allAgentRollups() allAgentRollups}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRoleConfigResponse withAllAgentRollups(RoleConfigJsonService.FlattenedAgentRollup... elements) {
    ImmutableList<RoleConfigJsonService.FlattenedAgentRollup> newValue = ImmutableList.copyOf(elements);
    return new ImmutableRoleConfigResponse(this.config, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link RoleConfigJsonService.RoleConfigResponse#allAgentRollups() allAgentRollups}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of allAgentRollups elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRoleConfigResponse withAllAgentRollups(Iterable<? extends RoleConfigJsonService.FlattenedAgentRollup> elements) {
    if (this.allAgentRollups == elements) return this;
    ImmutableList<RoleConfigJsonService.FlattenedAgentRollup> newValue = ImmutableList.copyOf(elements);
    return new ImmutableRoleConfigResponse(this.config, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableRoleConfigResponse} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableRoleConfigResponse
        && equalTo((ImmutableRoleConfigResponse) another);
  }

  private boolean equalTo(ImmutableRoleConfigResponse another) {
    return config.equals(another.config)
        && allAgentRollups.equals(another.allAgentRollups);
  }

  /**
   * Computes a hash code from attributes: {@code config}, {@code allAgentRollups}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + config.hashCode();
    h += (h << 5) + allAgentRollups.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code RoleConfigResponse} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("RoleConfigResponse")
        .omitNullValues()
        .add("config", config)
        .add("allAgentRollups", allAgentRollups)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements RoleConfigJsonService.RoleConfigResponse {
    @Nullable RoleConfigJsonService.RoleConfigDto config;
    ImmutableList<RoleConfigJsonService.FlattenedAgentRollup> allAgentRollups = ImmutableList.of();
    @JsonProperty("config")
    public void setConfig(RoleConfigJsonService.RoleConfigDto config) {
      this.config = config;
    }
    @JsonProperty("allAgentRollups")
    public void setAllAgentRollups(ImmutableList<RoleConfigJsonService.FlattenedAgentRollup> allAgentRollups) {
      this.allAgentRollups = allAgentRollups;
    }
    @Override
    public RoleConfigJsonService.RoleConfigDto config() { throw new UnsupportedOperationException(); }
    @Override
    public ImmutableList<RoleConfigJsonService.FlattenedAgentRollup> allAgentRollups() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableRoleConfigResponse fromJson(Json json) {
    ImmutableRoleConfigResponse.Builder builder = ImmutableRoleConfigResponse.builder();
    if (json.config != null) {
      builder.config(json.config);
    }
    if (json.allAgentRollups != null) {
      builder.addAllAllAgentRollups(json.allAgentRollups);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link RoleConfigJsonService.RoleConfigResponse} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable RoleConfigResponse instance
   */
  public static ImmutableRoleConfigResponse copyOf(RoleConfigJsonService.RoleConfigResponse instance) {
    if (instance instanceof ImmutableRoleConfigResponse) {
      return (ImmutableRoleConfigResponse) instance;
    }
    return ImmutableRoleConfigResponse.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableRoleConfigResponse ImmutableRoleConfigResponse}.
   * @return A new ImmutableRoleConfigResponse builder
   */
  public static ImmutableRoleConfigResponse.Builder builder() {
    return new ImmutableRoleConfigResponse.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableRoleConfigResponse ImmutableRoleConfigResponse}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_CONFIG = 0x1L;
    private long initBits = 0x1L;

    private @Nullable RoleConfigJsonService.RoleConfigDto config;
    private ImmutableList.Builder<RoleConfigJsonService.FlattenedAgentRollup> allAgentRollups = ImmutableList.builder();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code RoleConfigResponse} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(RoleConfigJsonService.RoleConfigResponse instance) {
      Preconditions.checkNotNull(instance, "instance");
      config(instance.config());
      addAllAllAgentRollups(instance.allAgentRollups());
      return this;
    }

    /**
     * Initializes the value for the {@link RoleConfigJsonService.RoleConfigResponse#config() config} attribute.
     * @param config The value for config 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder config(RoleConfigJsonService.RoleConfigDto config) {
      this.config = Preconditions.checkNotNull(config, "config");
      initBits &= ~INIT_BIT_CONFIG;
      return this;
    }

    /**
     * Adds one element to {@link RoleConfigJsonService.RoleConfigResponse#allAgentRollups() allAgentRollups} list.
     * @param element A allAgentRollups element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllAgentRollups(RoleConfigJsonService.FlattenedAgentRollup element) {
      this.allAgentRollups.add(element);
      return this;
    }

    /**
     * Adds elements to {@link RoleConfigJsonService.RoleConfigResponse#allAgentRollups() allAgentRollups} list.
     * @param elements An array of allAgentRollups elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllAgentRollups(RoleConfigJsonService.FlattenedAgentRollup... elements) {
      this.allAgentRollups.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link RoleConfigJsonService.RoleConfigResponse#allAgentRollups() allAgentRollups} list.
     * @param elements An iterable of allAgentRollups elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder allAgentRollups(Iterable<? extends RoleConfigJsonService.FlattenedAgentRollup> elements) {
      this.allAgentRollups = ImmutableList.builder();
      return addAllAllAgentRollups(elements);
    }

    /**
     * Adds elements to {@link RoleConfigJsonService.RoleConfigResponse#allAgentRollups() allAgentRollups} list.
     * @param elements An iterable of allAgentRollups elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllAllAgentRollups(Iterable<? extends RoleConfigJsonService.FlattenedAgentRollup> elements) {
      this.allAgentRollups.addAll(elements);
      return this;
    }

    /**
     * Builds a new {@link ImmutableRoleConfigResponse ImmutableRoleConfigResponse}.
     * @return An immutable instance of RoleConfigResponse
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableRoleConfigResponse build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableRoleConfigResponse(config, allAgentRollups.build());
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_CONFIG) != 0) attributes.add("config");
      return "Cannot build RoleConfigResponse, some of required attributes are not set " + attributes;
    }
  }
}
