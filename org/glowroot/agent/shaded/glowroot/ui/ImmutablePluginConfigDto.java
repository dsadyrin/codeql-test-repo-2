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
 * Immutable implementation of {@link ConfigJsonService.PluginConfigDto}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePluginConfigDto.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "ConfigJsonService.PluginConfigDto"})
@Immutable
final class ImmutablePluginConfigDto extends ConfigJsonService.PluginConfigDto {
  private final String name;
  private final ImmutableList<ImmutablePluginPropertyDto> properties;
  private final String version;

  private ImmutablePluginConfigDto(
      String name,
      ImmutableList<ImmutablePluginPropertyDto> properties,
      String version) {
    this.name = name;
    this.properties = properties;
    this.version = version;
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @JsonProperty("name")
  @Override
  String name() {
    return name;
  }

  /**
   * @return The value of the {@code properties} attribute
   */
  @JsonProperty("properties")
  @Override
  ImmutableList<ImmutablePluginPropertyDto> properties() {
    return properties;
  }

  /**
   * @return The value of the {@code version} attribute
   */
  @JsonProperty("version")
  @Override
  String version() {
    return version;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ConfigJsonService.PluginConfigDto#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePluginConfigDto withName(String value) {
    if (this.name.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "name");
    return new ImmutablePluginConfigDto(newValue, this.properties, this.version);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ConfigJsonService.PluginConfigDto#properties() properties}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePluginConfigDto withProperties(ImmutablePluginPropertyDto... elements) {
    ImmutableList<ImmutablePluginPropertyDto> newValue = ImmutableList.copyOf(elements);
    return new ImmutablePluginConfigDto(this.name, newValue, this.version);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ConfigJsonService.PluginConfigDto#properties() properties}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of properties elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePluginConfigDto withProperties(Iterable<? extends ImmutablePluginPropertyDto> elements) {
    if (this.properties == elements) return this;
    ImmutableList<ImmutablePluginPropertyDto> newValue = ImmutableList.copyOf(elements);
    return new ImmutablePluginConfigDto(this.name, newValue, this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ConfigJsonService.PluginConfigDto#version() version} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for version
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePluginConfigDto withVersion(String value) {
    if (this.version.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "version");
    return new ImmutablePluginConfigDto(this.name, this.properties, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePluginConfigDto} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePluginConfigDto
        && equalTo((ImmutablePluginConfigDto) another);
  }

  private boolean equalTo(ImmutablePluginConfigDto another) {
    return name.equals(another.name)
        && properties.equals(another.properties)
        && version.equals(another.version);
  }

  /**
   * Computes a hash code from attributes: {@code name}, {@code properties}, {@code version}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + name.hashCode();
    h += (h << 5) + properties.hashCode();
    h += (h << 5) + version.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code PluginConfigDto} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("PluginConfigDto")
        .omitNullValues()
        .add("name", name)
        .add("properties", properties)
        .add("version", version)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends ConfigJsonService.PluginConfigDto {
    @Nullable String name;
    List<ImmutablePluginPropertyDto> properties = ImmutableList.of();
    @Nullable String version;
    @JsonProperty("name")
    public void setName(String name) {
      this.name = name;
    }
    @JsonProperty("properties")
    public void setProperties(List<ImmutablePluginPropertyDto> properties) {
      this.properties = properties;
    }
    @JsonProperty("version")
    public void setVersion(String version) {
      this.version = version;
    }
    @Override
    String name() { throw new UnsupportedOperationException(); }
    @Override
    List<ImmutablePluginPropertyDto> properties() { throw new UnsupportedOperationException(); }
    @Override
    String version() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutablePluginConfigDto fromJson(Json json) {
    ImmutablePluginConfigDto.Builder builder = ImmutablePluginConfigDto.builder();
    if (json.name != null) {
      builder.name(json.name);
    }
    if (json.properties != null) {
      builder.addAllProperties(json.properties);
    }
    if (json.version != null) {
      builder.version(json.version);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ConfigJsonService.PluginConfigDto} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable PluginConfigDto instance
   */
  public static ImmutablePluginConfigDto copyOf(ConfigJsonService.PluginConfigDto instance) {
    if (instance instanceof ImmutablePluginConfigDto) {
      return (ImmutablePluginConfigDto) instance;
    }
    return ImmutablePluginConfigDto.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutablePluginConfigDto ImmutablePluginConfigDto}.
   * @return A new ImmutablePluginConfigDto builder
   */
  public static ImmutablePluginConfigDto.Builder builder() {
    return new ImmutablePluginConfigDto.Builder();
  }

  /**
   * Builds instances of type {@link ImmutablePluginConfigDto ImmutablePluginConfigDto}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_NAME = 0x1L;
    private static final long INIT_BIT_VERSION = 0x2L;
    private long initBits = 0x3L;

    private @Nullable String name;
    private ImmutableList.Builder<ImmutablePluginPropertyDto> properties = ImmutableList.builder();
    private @Nullable String version;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code PluginConfigDto} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(ConfigJsonService.PluginConfigDto instance) {
      Preconditions.checkNotNull(instance, "instance");
      name(instance.name());
      addAllProperties(instance.properties());
      version(instance.version());
      return this;
    }

    /**
     * Initializes the value for the {@link ConfigJsonService.PluginConfigDto#name() name} attribute.
     * @param name The value for name 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder name(String name) {
      this.name = Preconditions.checkNotNull(name, "name");
      initBits &= ~INIT_BIT_NAME;
      return this;
    }

    /**
     * Adds one element to {@link ConfigJsonService.PluginConfigDto#properties() properties} list.
     * @param element A properties element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addProperties(ImmutablePluginPropertyDto element) {
      this.properties.add(element);
      return this;
    }

    /**
     * Adds elements to {@link ConfigJsonService.PluginConfigDto#properties() properties} list.
     * @param elements An array of properties elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addProperties(ImmutablePluginPropertyDto... elements) {
      this.properties.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link ConfigJsonService.PluginConfigDto#properties() properties} list.
     * @param elements An iterable of properties elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder properties(Iterable<? extends ImmutablePluginPropertyDto> elements) {
      this.properties = ImmutableList.builder();
      return addAllProperties(elements);
    }

    /**
     * Adds elements to {@link ConfigJsonService.PluginConfigDto#properties() properties} list.
     * @param elements An iterable of properties elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllProperties(Iterable<? extends ImmutablePluginPropertyDto> elements) {
      this.properties.addAll(elements);
      return this;
    }

    /**
     * Initializes the value for the {@link ConfigJsonService.PluginConfigDto#version() version} attribute.
     * @param version The value for version 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder version(String version) {
      this.version = Preconditions.checkNotNull(version, "version");
      initBits &= ~INIT_BIT_VERSION;
      return this;
    }

    /**
     * Builds a new {@link ImmutablePluginConfigDto ImmutablePluginConfigDto}.
     * @return An immutable instance of PluginConfigDto
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutablePluginConfigDto build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutablePluginConfigDto(name, properties.build(), version);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      if ((initBits & INIT_BIT_VERSION) != 0) attributes.add("version");
      return "Cannot build PluginConfigDto, some of required attributes are not set " + attributes;
    }
  }
}
