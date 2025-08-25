package org.glowroot.agent.config;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonIgnore;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Optional;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import org.glowroot.agent.shaded.google.common.collect.ImmutableMap;
import org.glowroot.agent.shaded.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link PluginConfig}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePluginConfig.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "PluginConfig"})
@Immutable
public final class ImmutablePluginConfig extends PluginConfig {
  private final PluginDescriptor pluginDescriptor;
  private final String id;
  private final ImmutableMap<String, PropertyValue> properties;
  private final ImmutableMap<String, Boolean> booleanProperties;
  private final ImmutableMap<String, String> stringProperties;
  private final ImmutableMap<String, Optional<Double>> doubleProperties;

  private ImmutablePluginConfig(
      PluginDescriptor pluginDescriptor,
      ImmutableMap<String, PropertyValue> properties) {
    this.pluginDescriptor = pluginDescriptor;
    this.properties = properties;
    this.id = initShim.id();
    this.booleanProperties = initShim.booleanProperties();
    this.stringProperties = initShim.stringProperties();
    this.doubleProperties = initShim.doubleProperties();
    this.initShim = null;
  }

  private static final int STAGE_INITIALIZING = -1;
  private static final int STAGE_UNINITIALIZED = 0;
  private static final int STAGE_INITIALIZED = 1;
  private transient volatile InitShim initShim = new InitShim();

  private final class InitShim {
    private String id;
    private int idBuildStage;

    String id() {
      if (idBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (idBuildStage == STAGE_UNINITIALIZED) {
        idBuildStage = STAGE_INITIALIZING;
        this.id = Preconditions.checkNotNull(ImmutablePluginConfig.super.id(), "id");
        idBuildStage = STAGE_INITIALIZED;
      }
      return this.id;
    }
    private ImmutableMap<String, Boolean> booleanProperties;
    private int booleanPropertiesBuildStage;

    ImmutableMap<String, Boolean> booleanProperties() {
      if (booleanPropertiesBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (booleanPropertiesBuildStage == STAGE_UNINITIALIZED) {
        booleanPropertiesBuildStage = STAGE_INITIALIZING;
        this.booleanProperties = Preconditions.checkNotNull(ImmutablePluginConfig.super.booleanProperties(), "booleanProperties");
        booleanPropertiesBuildStage = STAGE_INITIALIZED;
      }
      return this.booleanProperties;
    }
    private ImmutableMap<String, String> stringProperties;
    private int stringPropertiesBuildStage;

    ImmutableMap<String, String> stringProperties() {
      if (stringPropertiesBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (stringPropertiesBuildStage == STAGE_UNINITIALIZED) {
        stringPropertiesBuildStage = STAGE_INITIALIZING;
        this.stringProperties = Preconditions.checkNotNull(ImmutablePluginConfig.super.stringProperties(), "stringProperties");
        stringPropertiesBuildStage = STAGE_INITIALIZED;
      }
      return this.stringProperties;
    }
    private ImmutableMap<String, Optional<Double>> doubleProperties;
    private int doublePropertiesBuildStage;

    ImmutableMap<String, Optional<Double>> doubleProperties() {
      if (doublePropertiesBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (doublePropertiesBuildStage == STAGE_UNINITIALIZED) {
        doublePropertiesBuildStage = STAGE_INITIALIZING;
        this.doubleProperties = Preconditions.checkNotNull(ImmutablePluginConfig.super.doubleProperties(), "doubleProperties");
        doublePropertiesBuildStage = STAGE_INITIALIZED;
      }
      return this.doubleProperties;
    }

    private String formatInitCycleMessage() {
      ArrayList<String> attributes = Lists.newArrayList();
      if (idBuildStage == STAGE_INITIALIZING) attributes.add("id");
      if (booleanPropertiesBuildStage == STAGE_INITIALIZING) attributes.add("booleanProperties");
      if (stringPropertiesBuildStage == STAGE_INITIALIZING) attributes.add("stringProperties");
      if (doublePropertiesBuildStage == STAGE_INITIALIZING) attributes.add("doubleProperties");
      return "Cannot build PluginConfig, attribute initializers form cycle" + attributes;
    }
  }

  /**
   * @return The value of the {@code pluginDescriptor} attribute
   */
  @JsonProperty("pluginDescriptor")
  @JsonIgnore
  @Override
  public PluginDescriptor pluginDescriptor() {
    return pluginDescriptor;
  }

  /**
   * @return The computed-at-construction value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public String id() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.id()
        : this.id;
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
   * @return The computed-at-construction value of the {@code booleanProperties} attribute
   */
  @JsonProperty("booleanProperties")
  @JsonIgnore
  @Override
  ImmutableMap<String, Boolean> booleanProperties() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.booleanProperties()
        : this.booleanProperties;
  }

  /**
   * @return The computed-at-construction value of the {@code stringProperties} attribute
   */
  @JsonProperty("stringProperties")
  @JsonIgnore
  @Override
  ImmutableMap<String, String> stringProperties() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.stringProperties()
        : this.stringProperties;
  }

  /**
   * @return The computed-at-construction value of the {@code doubleProperties} attribute
   */
  @JsonProperty("doubleProperties")
  @JsonIgnore
  @Override
  ImmutableMap<String, Optional<Double>> doubleProperties() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.doubleProperties()
        : this.doubleProperties;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PluginConfig#pluginDescriptor() pluginDescriptor} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for pluginDescriptor
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePluginConfig withPluginDescriptor(PluginDescriptor value) {
    if (this.pluginDescriptor == value) return this;
    PluginDescriptor newValue = Preconditions.checkNotNull(value, "pluginDescriptor");
    return new ImmutablePluginConfig(newValue, this.properties);
  }

  /**
   * Copy the current immutable object by replacing the {@link PluginConfig#properties() properties} map with the specified map.
   * Nulls are not permitted as keys or values.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param entries The entries to be added to the properties map
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePluginConfig withProperties(Map<String, ? extends PropertyValue> entries) {
    if (this.properties == entries) return this;
    ImmutableMap<String, PropertyValue> newValue = ImmutableMap.copyOf(entries);
    return new ImmutablePluginConfig(this.pluginDescriptor, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePluginConfig} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePluginConfig
        && equalTo((ImmutablePluginConfig) another);
  }

  private boolean equalTo(ImmutablePluginConfig another) {
    return pluginDescriptor.equals(another.pluginDescriptor)
        && id.equals(another.id)
        && properties.equals(another.properties)
        && booleanProperties.equals(another.booleanProperties)
        && stringProperties.equals(another.stringProperties)
        && doubleProperties.equals(another.doubleProperties);
  }

  /**
   * Computes a hash code from attributes: {@code pluginDescriptor}, {@code id}, {@code properties}, {@code booleanProperties}, {@code stringProperties}, {@code doubleProperties}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + pluginDescriptor.hashCode();
    h += (h << 5) + id.hashCode();
    h += (h << 5) + properties.hashCode();
    h += (h << 5) + booleanProperties.hashCode();
    h += (h << 5) + stringProperties.hashCode();
    h += (h << 5) + doubleProperties.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code PluginConfig} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("PluginConfig")
        .omitNullValues()
        .add("pluginDescriptor", pluginDescriptor)
        .add("id", id)
        .add("properties", properties)
        .add("booleanProperties", booleanProperties)
        .add("stringProperties", stringProperties)
        .add("doubleProperties", doubleProperties)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends PluginConfig {
    @Nullable PluginDescriptor pluginDescriptor;
    @Nullable Map<String, PropertyValue> properties;
    @JsonProperty("pluginDescriptor")
    @JsonIgnore
    public void setPluginDescriptor(PluginDescriptor pluginDescriptor) {
      this.pluginDescriptor = pluginDescriptor;
    }
    @JsonProperty("properties")
    public void setProperties(Map<String, PropertyValue> properties) {
      this.properties = properties;
    }
    @Override
    public PluginDescriptor pluginDescriptor() { throw new UnsupportedOperationException(); }
    @Override
    public String id() { throw new UnsupportedOperationException(); }
    @Override
    public Map<String, PropertyValue> properties() { throw new UnsupportedOperationException(); }
    @Override
    ImmutableMap<String, Boolean> booleanProperties() { throw new UnsupportedOperationException(); }
    @Override
    ImmutableMap<String, String> stringProperties() { throw new UnsupportedOperationException(); }
    @Override
    ImmutableMap<String, Optional<Double>> doubleProperties() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutablePluginConfig fromJson(Json json) {
    ImmutablePluginConfig.Builder builder = ImmutablePluginConfig.builder();
    if (json.pluginDescriptor != null) {
      builder.pluginDescriptor(json.pluginDescriptor);
    }
    if (json.properties != null) {
      builder.putAllProperties(json.properties);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link PluginConfig} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable PluginConfig instance
   */
  public static ImmutablePluginConfig copyOf(PluginConfig instance) {
    if (instance instanceof ImmutablePluginConfig) {
      return (ImmutablePluginConfig) instance;
    }
    return ImmutablePluginConfig.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutablePluginConfig ImmutablePluginConfig}.
   * @return A new ImmutablePluginConfig builder
   */
  public static ImmutablePluginConfig.Builder builder() {
    return new ImmutablePluginConfig.Builder();
  }

  /**
   * Builds instances of type {@link ImmutablePluginConfig ImmutablePluginConfig}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_PLUGIN_DESCRIPTOR = 0x1L;
    private long initBits = 0x1L;

    private @Nullable PluginDescriptor pluginDescriptor;
    private ImmutableMap.Builder<String, PropertyValue> properties = ImmutableMap.builder();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code PluginConfig} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(PluginConfig instance) {
      Preconditions.checkNotNull(instance, "instance");
      pluginDescriptor(instance.pluginDescriptor());
      putAllProperties(instance.properties());
      return this;
    }

    /**
     * Initializes the value for the {@link PluginConfig#pluginDescriptor() pluginDescriptor} attribute.
     * @param pluginDescriptor The value for pluginDescriptor 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder pluginDescriptor(PluginDescriptor pluginDescriptor) {
      this.pluginDescriptor = Preconditions.checkNotNull(pluginDescriptor, "pluginDescriptor");
      initBits &= ~INIT_BIT_PLUGIN_DESCRIPTOR;
      return this;
    }

    /**
     * Put one entry to the {@link PluginConfig#properties() properties} map.
     * @param key The key in the properties map
     * @param value The associated value in the properties map
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder putProperties(String key, PropertyValue value) {
      this.properties.put(key, value);
      return this;
    }

    /**
     * Put one entry to the {@link PluginConfig#properties() properties} map. Nulls are not permitted
     * @param entry The key and value entry
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder putProperties(Map.Entry<String, ? extends PropertyValue> entry) {
      this.properties.put(entry);
      return this;
    }

    /**
     * Sets or replaces all mappings from the specified map as entries for the {@link PluginConfig#properties() properties} map. Nulls are not permitted
     * @param properties The entries that will be added to the properties map
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder properties(Map<String, ? extends PropertyValue> properties) {
      this.properties = ImmutableMap.builder();
      return putAllProperties(properties);
    }

    /**
     * Put all mappings from the specified map as entries to {@link PluginConfig#properties() properties} map. Nulls are not permitted
     * @param properties The entries that will be added to the properties map
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder putAllProperties(Map<String, ? extends PropertyValue> properties) {
      this.properties.putAll(properties);
      return this;
    }

    /**
     * Builds a new {@link ImmutablePluginConfig ImmutablePluginConfig}.
     * @return An immutable instance of PluginConfig
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutablePluginConfig build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutablePluginConfig(pluginDescriptor, properties.build());
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_PLUGIN_DESCRIPTOR) != 0) attributes.add("pluginDescriptor");
      return "Cannot build PluginConfig, some of required attributes are not set " + attributes;
    }
  }
}
