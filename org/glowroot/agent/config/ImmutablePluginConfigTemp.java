package org.glowroot.agent.config;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import org.glowroot.agent.shaded.google.common.collect.ImmutableMap;
import org.glowroot.agent.shaded.google.common.collect.Lists;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link ConfigService.PluginConfigTemp}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePluginConfigTemp.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "ConfigService.PluginConfigTemp"})
@Immutable
final class ImmutablePluginConfigTemp
    implements ConfigService.PluginConfigTemp {
  private final String id;
  private final ImmutableMap<String, PropertyValue> properties;

  private ImmutablePluginConfigTemp(
      String id,
      ImmutableMap<String, PropertyValue> properties) {
    this.id = id;
    this.properties = properties;
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
   * @return The value of the {@code properties} attribute
   */
  @JsonProperty("properties")
  @Override
  public ImmutableMap<String, PropertyValue> properties() {
    return properties;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ConfigService.PluginConfigTemp#id() id} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for id
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePluginConfigTemp withId(String value) {
    if (this.id.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "id");
    return new ImmutablePluginConfigTemp(newValue, this.properties);
  }

  /**
   * Copy the current immutable object by replacing the {@link ConfigService.PluginConfigTemp#properties() properties} map with the specified map.
   * Nulls are not permitted as keys or values.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param entries The entries to be added to the properties map
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePluginConfigTemp withProperties(Map<String, ? extends PropertyValue> entries) {
    if (this.properties == entries) return this;
    ImmutableMap<String, PropertyValue> newValue = ImmutableMap.copyOf(entries);
    return new ImmutablePluginConfigTemp(this.id, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePluginConfigTemp} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePluginConfigTemp
        && equalTo((ImmutablePluginConfigTemp) another);
  }

  private boolean equalTo(ImmutablePluginConfigTemp another) {
    return id.equals(another.id)
        && properties.equals(another.properties);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code properties}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + id.hashCode();
    h += (h << 5) + properties.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code PluginConfigTemp} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("PluginConfigTemp")
        .omitNullValues()
        .add("id", id)
        .add("properties", properties)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ConfigService.PluginConfigTemp {
    @Nullable String id;
    @Nullable Map<String, PropertyValue> properties;
    @JsonProperty("id")
    public void setId(String id) {
      this.id = id;
    }
    @JsonProperty("properties")
    public void setProperties(Map<String, PropertyValue> properties) {
      this.properties = properties;
    }
    @Override
    public String id() { throw new UnsupportedOperationException(); }
    @Override
    public Map<String, PropertyValue> properties() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutablePluginConfigTemp fromJson(Json json) {
    ImmutablePluginConfigTemp.Builder builder = ImmutablePluginConfigTemp.builder();
    if (json.id != null) {
      builder.id(json.id);
    }
    if (json.properties != null) {
      builder.putAllProperties(json.properties);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ConfigService.PluginConfigTemp} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable PluginConfigTemp instance
   */
  public static ImmutablePluginConfigTemp copyOf(ConfigService.PluginConfigTemp instance) {
    if (instance instanceof ImmutablePluginConfigTemp) {
      return (ImmutablePluginConfigTemp) instance;
    }
    return ImmutablePluginConfigTemp.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutablePluginConfigTemp ImmutablePluginConfigTemp}.
   * @return A new ImmutablePluginConfigTemp builder
   */
  public static ImmutablePluginConfigTemp.Builder builder() {
    return new ImmutablePluginConfigTemp.Builder();
  }

  /**
   * Builds instances of type {@link ImmutablePluginConfigTemp ImmutablePluginConfigTemp}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_ID = 0x1L;
    private long initBits = 0x1L;

    private @Nullable String id;
    private ImmutableMap.Builder<String, PropertyValue> properties = ImmutableMap.builder();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code PluginConfigTemp} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(ConfigService.PluginConfigTemp instance) {
      Preconditions.checkNotNull(instance, "instance");
      id(instance.id());
      putAllProperties(instance.properties());
      return this;
    }

    /**
     * Initializes the value for the {@link ConfigService.PluginConfigTemp#id() id} attribute.
     * @param id The value for id 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder id(String id) {
      this.id = Preconditions.checkNotNull(id, "id");
      initBits &= ~INIT_BIT_ID;
      return this;
    }

    /**
     * Put one entry to the {@link ConfigService.PluginConfigTemp#properties() properties} map.
     * @param key The key in the properties map
     * @param value The associated value in the properties map
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder putProperties(String key, PropertyValue value) {
      this.properties.put(key, value);
      return this;
    }

    /**
     * Put one entry to the {@link ConfigService.PluginConfigTemp#properties() properties} map. Nulls are not permitted
     * @param entry The key and value entry
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder putProperties(Map.Entry<String, ? extends PropertyValue> entry) {
      this.properties.put(entry);
      return this;
    }

    /**
     * Sets or replaces all mappings from the specified map as entries for the {@link ConfigService.PluginConfigTemp#properties() properties} map. Nulls are not permitted
     * @param properties The entries that will be added to the properties map
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder properties(Map<String, ? extends PropertyValue> properties) {
      this.properties = ImmutableMap.builder();
      return putAllProperties(properties);
    }

    /**
     * Put all mappings from the specified map as entries to {@link ConfigService.PluginConfigTemp#properties() properties} map. Nulls are not permitted
     * @param properties The entries that will be added to the properties map
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder putAllProperties(Map<String, ? extends PropertyValue> properties) {
      this.properties.putAll(properties);
      return this;
    }

    /**
     * Builds a new {@link ImmutablePluginConfigTemp ImmutablePluginConfigTemp}.
     * @return An immutable instance of PluginConfigTemp
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutablePluginConfigTemp build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutablePluginConfigTemp(id, properties.build());
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_ID) != 0) attributes.add("id");
      return "Cannot build PluginConfigTemp, some of required attributes are not set " + attributes;
    }
  }
}
