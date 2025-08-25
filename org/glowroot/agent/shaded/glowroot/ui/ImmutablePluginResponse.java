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
 * Immutable implementation of {@link ConfigJsonService.PluginResponse}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePluginResponse.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "ConfigJsonService.PluginResponse"})
@Immutable
final class ImmutablePluginResponse implements ConfigJsonService.PluginResponse {
  private final String id;
  private final String name;
  private final boolean hasConfig;

  private ImmutablePluginResponse(String id, String name, boolean hasConfig) {
    this.id = id;
    this.name = name;
    this.hasConfig = hasConfig;
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public String id() {
    return id;
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @JsonProperty("name")
  @Override
  public String name() {
    return name;
  }

  /**
   * @return The value of the {@code hasConfig} attribute
   */
  @JsonProperty("hasConfig")
  @Override
  public boolean hasConfig() {
    return hasConfig;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ConfigJsonService.PluginResponse#id() id} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for id
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePluginResponse withId(String value) {
    if (this.id.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "id");
    return new ImmutablePluginResponse(newValue, this.name, this.hasConfig);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ConfigJsonService.PluginResponse#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePluginResponse withName(String value) {
    if (this.name.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "name");
    return new ImmutablePluginResponse(this.id, newValue, this.hasConfig);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ConfigJsonService.PluginResponse#hasConfig() hasConfig} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for hasConfig
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePluginResponse withHasConfig(boolean value) {
    if (this.hasConfig == value) return this;
    return new ImmutablePluginResponse(this.id, this.name, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePluginResponse} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePluginResponse
        && equalTo((ImmutablePluginResponse) another);
  }

  private boolean equalTo(ImmutablePluginResponse another) {
    return id.equals(another.id)
        && name.equals(another.name)
        && hasConfig == another.hasConfig;
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code name}, {@code hasConfig}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + id.hashCode();
    h += (h << 5) + name.hashCode();
    h += (h << 5) + Booleans.hashCode(hasConfig);
    return h;
  }

  /**
   * Prints the immutable value {@code PluginResponse} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("PluginResponse")
        .omitNullValues()
        .add("id", id)
        .add("name", name)
        .add("hasConfig", hasConfig)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ConfigJsonService.PluginResponse {
    @Nullable String id;
    @Nullable String name;
    boolean hasConfig;
    boolean hasConfigIsSet;
    @JsonProperty("id")
    public void setId(String id) {
      this.id = id;
    }
    @JsonProperty("name")
    public void setName(String name) {
      this.name = name;
    }
    @JsonProperty("hasConfig")
    public void setHasConfig(boolean hasConfig) {
      this.hasConfig = hasConfig;
      this.hasConfigIsSet = true;
    }
    @Override
    public String id() { throw new UnsupportedOperationException(); }
    @Override
    public String name() { throw new UnsupportedOperationException(); }
    @Override
    public boolean hasConfig() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutablePluginResponse fromJson(Json json) {
    ImmutablePluginResponse.Builder builder = ImmutablePluginResponse.builder();
    if (json.id != null) {
      builder.id(json.id);
    }
    if (json.name != null) {
      builder.name(json.name);
    }
    if (json.hasConfigIsSet) {
      builder.hasConfig(json.hasConfig);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ConfigJsonService.PluginResponse} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable PluginResponse instance
   */
  public static ImmutablePluginResponse copyOf(ConfigJsonService.PluginResponse instance) {
    if (instance instanceof ImmutablePluginResponse) {
      return (ImmutablePluginResponse) instance;
    }
    return ImmutablePluginResponse.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutablePluginResponse ImmutablePluginResponse}.
   * @return A new ImmutablePluginResponse builder
   */
  public static ImmutablePluginResponse.Builder builder() {
    return new ImmutablePluginResponse.Builder();
  }

  /**
   * Builds instances of type {@link ImmutablePluginResponse ImmutablePluginResponse}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_ID = 0x1L;
    private static final long INIT_BIT_NAME = 0x2L;
    private static final long INIT_BIT_HAS_CONFIG = 0x4L;
    private long initBits = 0x7L;

    private @Nullable String id;
    private @Nullable String name;
    private boolean hasConfig;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code PluginResponse} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(ConfigJsonService.PluginResponse instance) {
      Preconditions.checkNotNull(instance, "instance");
      id(instance.id());
      name(instance.name());
      hasConfig(instance.hasConfig());
      return this;
    }

    /**
     * Initializes the value for the {@link ConfigJsonService.PluginResponse#id() id} attribute.
     * @param id The value for id 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder id(String id) {
      this.id = Preconditions.checkNotNull(id, "id");
      initBits &= ~INIT_BIT_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link ConfigJsonService.PluginResponse#name() name} attribute.
     * @param name The value for name 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder name(String name) {
      this.name = Preconditions.checkNotNull(name, "name");
      initBits &= ~INIT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link ConfigJsonService.PluginResponse#hasConfig() hasConfig} attribute.
     * @param hasConfig The value for hasConfig 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder hasConfig(boolean hasConfig) {
      this.hasConfig = hasConfig;
      initBits &= ~INIT_BIT_HAS_CONFIG;
      return this;
    }

    /**
     * Builds a new {@link ImmutablePluginResponse ImmutablePluginResponse}.
     * @return An immutable instance of PluginResponse
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutablePluginResponse build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutablePluginResponse(id, name, hasConfig);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_ID) != 0) attributes.add("id");
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      if ((initBits & INIT_BIT_HAS_CONFIG) != 0) attributes.add("hasConfig");
      return "Cannot build PluginResponse, some of required attributes are not set " + attributes;
    }
  }
}
