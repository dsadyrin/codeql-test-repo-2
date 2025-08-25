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
 * Immutable implementation of {@link ConfigJsonService.PluginUpdateRequest}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePluginUpdateRequest.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "ConfigJsonService.PluginUpdateRequest"})
@Immutable
final class ImmutablePluginUpdateRequest
    implements ConfigJsonService.PluginUpdateRequest {
  private final String pluginId;
  private final ImmutableList<ImmutablePluginPropertyDto> properties;
  private final String version;

  private ImmutablePluginUpdateRequest(
      String pluginId,
      ImmutableList<ImmutablePluginPropertyDto> properties,
      String version) {
    this.pluginId = pluginId;
    this.properties = properties;
    this.version = version;
  }

  /**
   * @return The value of the {@code pluginId} attribute
   */
  @JsonProperty("pluginId")
  @Override
  public String pluginId() {
    return pluginId;
  }

  /**
   * @return The value of the {@code properties} attribute
   */
  @JsonProperty("properties")
  @Override
  public ImmutableList<ImmutablePluginPropertyDto> properties() {
    return properties;
  }

  /**
   * @return The value of the {@code version} attribute
   */
  @JsonProperty("version")
  @Override
  public String version() {
    return version;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ConfigJsonService.PluginUpdateRequest#pluginId() pluginId} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for pluginId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePluginUpdateRequest withPluginId(String value) {
    if (this.pluginId.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "pluginId");
    return new ImmutablePluginUpdateRequest(newValue, this.properties, this.version);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ConfigJsonService.PluginUpdateRequest#properties() properties}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePluginUpdateRequest withProperties(ImmutablePluginPropertyDto... elements) {
    ImmutableList<ImmutablePluginPropertyDto> newValue = ImmutableList.copyOf(elements);
    return new ImmutablePluginUpdateRequest(this.pluginId, newValue, this.version);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ConfigJsonService.PluginUpdateRequest#properties() properties}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of properties elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePluginUpdateRequest withProperties(Iterable<? extends ImmutablePluginPropertyDto> elements) {
    if (this.properties == elements) return this;
    ImmutableList<ImmutablePluginPropertyDto> newValue = ImmutableList.copyOf(elements);
    return new ImmutablePluginUpdateRequest(this.pluginId, newValue, this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ConfigJsonService.PluginUpdateRequest#version() version} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for version
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePluginUpdateRequest withVersion(String value) {
    if (this.version.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "version");
    return new ImmutablePluginUpdateRequest(this.pluginId, this.properties, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePluginUpdateRequest} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePluginUpdateRequest
        && equalTo((ImmutablePluginUpdateRequest) another);
  }

  private boolean equalTo(ImmutablePluginUpdateRequest another) {
    return pluginId.equals(another.pluginId)
        && properties.equals(another.properties)
        && version.equals(another.version);
  }

  /**
   * Computes a hash code from attributes: {@code pluginId}, {@code properties}, {@code version}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + pluginId.hashCode();
    h += (h << 5) + properties.hashCode();
    h += (h << 5) + version.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code PluginUpdateRequest} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("PluginUpdateRequest")
        .omitNullValues()
        .add("pluginId", pluginId)
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
  static final class Json implements ConfigJsonService.PluginUpdateRequest {
    @Nullable String pluginId;
    List<ImmutablePluginPropertyDto> properties = ImmutableList.of();
    @Nullable String version;
    @JsonProperty("pluginId")
    public void setPluginId(String pluginId) {
      this.pluginId = pluginId;
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
    public String pluginId() { throw new UnsupportedOperationException(); }
    @Override
    public List<ImmutablePluginPropertyDto> properties() { throw new UnsupportedOperationException(); }
    @Override
    public String version() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutablePluginUpdateRequest fromJson(Json json) {
    ImmutablePluginUpdateRequest.Builder builder = ImmutablePluginUpdateRequest.builder();
    if (json.pluginId != null) {
      builder.pluginId(json.pluginId);
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
   * Creates an immutable copy of a {@link ConfigJsonService.PluginUpdateRequest} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable PluginUpdateRequest instance
   */
  public static ImmutablePluginUpdateRequest copyOf(ConfigJsonService.PluginUpdateRequest instance) {
    if (instance instanceof ImmutablePluginUpdateRequest) {
      return (ImmutablePluginUpdateRequest) instance;
    }
    return ImmutablePluginUpdateRequest.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutablePluginUpdateRequest ImmutablePluginUpdateRequest}.
   * @return A new ImmutablePluginUpdateRequest builder
   */
  public static ImmutablePluginUpdateRequest.Builder builder() {
    return new ImmutablePluginUpdateRequest.Builder();
  }

  /**
   * Builds instances of type {@link ImmutablePluginUpdateRequest ImmutablePluginUpdateRequest}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_PLUGIN_ID = 0x1L;
    private static final long INIT_BIT_VERSION = 0x2L;
    private long initBits = 0x3L;

    private @Nullable String pluginId;
    private ImmutableList.Builder<ImmutablePluginPropertyDto> properties = ImmutableList.builder();
    private @Nullable String version;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code PluginUpdateRequest} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(ConfigJsonService.PluginUpdateRequest instance) {
      Preconditions.checkNotNull(instance, "instance");
      pluginId(instance.pluginId());
      addAllProperties(instance.properties());
      version(instance.version());
      return this;
    }

    /**
     * Initializes the value for the {@link ConfigJsonService.PluginUpdateRequest#pluginId() pluginId} attribute.
     * @param pluginId The value for pluginId 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder pluginId(String pluginId) {
      this.pluginId = Preconditions.checkNotNull(pluginId, "pluginId");
      initBits &= ~INIT_BIT_PLUGIN_ID;
      return this;
    }

    /**
     * Adds one element to {@link ConfigJsonService.PluginUpdateRequest#properties() properties} list.
     * @param element A properties element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addProperties(ImmutablePluginPropertyDto element) {
      this.properties.add(element);
      return this;
    }

    /**
     * Adds elements to {@link ConfigJsonService.PluginUpdateRequest#properties() properties} list.
     * @param elements An array of properties elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addProperties(ImmutablePluginPropertyDto... elements) {
      this.properties.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link ConfigJsonService.PluginUpdateRequest#properties() properties} list.
     * @param elements An iterable of properties elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder properties(Iterable<? extends ImmutablePluginPropertyDto> elements) {
      this.properties = ImmutableList.builder();
      return addAllProperties(elements);
    }

    /**
     * Adds elements to {@link ConfigJsonService.PluginUpdateRequest#properties() properties} list.
     * @param elements An iterable of properties elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllProperties(Iterable<? extends ImmutablePluginPropertyDto> elements) {
      this.properties.addAll(elements);
      return this;
    }

    /**
     * Initializes the value for the {@link ConfigJsonService.PluginUpdateRequest#version() version} attribute.
     * @param version The value for version 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder version(String version) {
      this.version = Preconditions.checkNotNull(version, "version");
      initBits &= ~INIT_BIT_VERSION;
      return this;
    }

    /**
     * Builds a new {@link ImmutablePluginUpdateRequest ImmutablePluginUpdateRequest}.
     * @return An immutable instance of PluginUpdateRequest
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutablePluginUpdateRequest build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutablePluginUpdateRequest(pluginId, properties.build(), version);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_PLUGIN_ID) != 0) attributes.add("pluginId");
      if ((initBits & INIT_BIT_VERSION) != 0) attributes.add("version");
      return "Cannot build PluginUpdateRequest, some of required attributes are not set " + attributes;
    }
  }
}
