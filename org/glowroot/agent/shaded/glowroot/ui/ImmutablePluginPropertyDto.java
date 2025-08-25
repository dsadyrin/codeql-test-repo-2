package org.glowroot.agent.shaded.glowroot.ui;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Objects;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import org.glowroot.agent.shaded.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link ConfigJsonService.PluginPropertyDto}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePluginPropertyDto.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "ConfigJsonService.PluginPropertyDto"})
@Immutable
final class ImmutablePluginPropertyDto extends ConfigJsonService.PluginPropertyDto {
  private final String name;
  private final ConfigJsonService.PropertyType type;
  private final @Nullable Object value;
  private final @Nullable Object defaultValue;
  private final @Nullable String label;
  private final @Nullable String checkboxLabel;
  private final @Nullable String description;

  private ImmutablePluginPropertyDto(
      String name,
      ConfigJsonService.PropertyType type,
      @Nullable Object value,
      @Nullable Object defaultValue,
      @Nullable String label,
      @Nullable String checkboxLabel,
      @Nullable String description) {
    this.name = name;
    this.type = type;
    this.value = value;
    this.defaultValue = defaultValue;
    this.label = label;
    this.checkboxLabel = checkboxLabel;
    this.description = description;
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
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  ConfigJsonService.PropertyType type() {
    return type;
  }

  /**
   * @return The value of the {@code value} attribute
   */
  @JsonProperty("value")
  @Override
  @Nullable Object value() {
    return value;
  }

  /**
   * @return The value of the {@code defaultValue} attribute
   */
  @JsonProperty("defaultValue")
  @Override
  @Nullable Object defaultValue() {
    return defaultValue;
  }

  /**
   * @return The value of the {@code label} attribute
   */
  @JsonProperty("label")
  @Override
  @Nullable String label() {
    return label;
  }

  /**
   * @return The value of the {@code checkboxLabel} attribute
   */
  @JsonProperty("checkboxLabel")
  @Override
  @Nullable String checkboxLabel() {
    return checkboxLabel;
  }

  /**
   * @return The value of the {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  @Nullable String description() {
    return description;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ConfigJsonService.PluginPropertyDto#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePluginPropertyDto withName(String value) {
    if (this.name.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "name");
    return new ImmutablePluginPropertyDto(
        newValue,
        this.type,
        this.value,
        this.defaultValue,
        this.label,
        this.checkboxLabel,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ConfigJsonService.PluginPropertyDto#type() type} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for type
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePluginPropertyDto withType(ConfigJsonService.PropertyType value) {
    if (this.type == value) return this;
    ConfigJsonService.PropertyType newValue = Preconditions.checkNotNull(value, "type");
    return new ImmutablePluginPropertyDto(
        this.name,
        newValue,
        this.value,
        this.defaultValue,
        this.label,
        this.checkboxLabel,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ConfigJsonService.PluginPropertyDto#value() value} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for value (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePluginPropertyDto withValue(@Nullable Object value) {
    if (this.value == value) return this;
    return new ImmutablePluginPropertyDto(
        this.name,
        this.type,
        value,
        this.defaultValue,
        this.label,
        this.checkboxLabel,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ConfigJsonService.PluginPropertyDto#defaultValue() defaultValue} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for defaultValue (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePluginPropertyDto withDefaultValue(@Nullable Object value) {
    if (this.defaultValue == value) return this;
    return new ImmutablePluginPropertyDto(this.name, this.type, this.value, value, this.label, this.checkboxLabel, this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ConfigJsonService.PluginPropertyDto#label() label} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for label (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePluginPropertyDto withLabel(@Nullable String value) {
    if (Objects.equal(this.label, value)) return this;
    return new ImmutablePluginPropertyDto(
        this.name,
        this.type,
        this.value,
        this.defaultValue,
        value,
        this.checkboxLabel,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ConfigJsonService.PluginPropertyDto#checkboxLabel() checkboxLabel} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for checkboxLabel (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePluginPropertyDto withCheckboxLabel(@Nullable String value) {
    if (Objects.equal(this.checkboxLabel, value)) return this;
    return new ImmutablePluginPropertyDto(this.name, this.type, this.value, this.defaultValue, this.label, value, this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ConfigJsonService.PluginPropertyDto#description() description} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for description (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePluginPropertyDto withDescription(@Nullable String value) {
    if (Objects.equal(this.description, value)) return this;
    return new ImmutablePluginPropertyDto(this.name, this.type, this.value, this.defaultValue, this.label, this.checkboxLabel, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePluginPropertyDto} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePluginPropertyDto
        && equalTo((ImmutablePluginPropertyDto) another);
  }

  private boolean equalTo(ImmutablePluginPropertyDto another) {
    return name.equals(another.name)
        && type.equals(another.type)
        && Objects.equal(value, another.value)
        && Objects.equal(defaultValue, another.defaultValue)
        && Objects.equal(label, another.label)
        && Objects.equal(checkboxLabel, another.checkboxLabel)
        && Objects.equal(description, another.description);
  }

  /**
   * Computes a hash code from attributes: {@code name}, {@code type}, {@code value}, {@code defaultValue}, {@code label}, {@code checkboxLabel}, {@code description}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + name.hashCode();
    h += (h << 5) + type.hashCode();
    h += (h << 5) + Objects.hashCode(value);
    h += (h << 5) + Objects.hashCode(defaultValue);
    h += (h << 5) + Objects.hashCode(label);
    h += (h << 5) + Objects.hashCode(checkboxLabel);
    h += (h << 5) + Objects.hashCode(description);
    return h;
  }

  /**
   * Prints the immutable value {@code PluginPropertyDto} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("PluginPropertyDto")
        .omitNullValues()
        .add("name", name)
        .add("type", type)
        .add("value", value)
        .add("defaultValue", defaultValue)
        .add("label", label)
        .add("checkboxLabel", checkboxLabel)
        .add("description", description)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends ConfigJsonService.PluginPropertyDto {
    @Nullable String name;
    @Nullable ConfigJsonService.PropertyType type;
    @Nullable Object value;
    @Nullable Object defaultValue;
    @Nullable String label;
    @Nullable String checkboxLabel;
    @Nullable String description;
    @JsonProperty("name")
    public void setName(String name) {
      this.name = name;
    }
    @JsonProperty("type")
    public void setType(ConfigJsonService.PropertyType type) {
      this.type = type;
    }
    @JsonProperty("value")
    public void setValue(@Nullable Object value) {
      this.value = value;
    }
    @JsonProperty("defaultValue")
    public void setDefaultValue(@Nullable Object defaultValue) {
      this.defaultValue = defaultValue;
    }
    @JsonProperty("label")
    public void setLabel(@Nullable String label) {
      this.label = label;
    }
    @JsonProperty("checkboxLabel")
    public void setCheckboxLabel(@Nullable String checkboxLabel) {
      this.checkboxLabel = checkboxLabel;
    }
    @JsonProperty("description")
    public void setDescription(@Nullable String description) {
      this.description = description;
    }
    @Override
    String name() { throw new UnsupportedOperationException(); }
    @Override
    ConfigJsonService.PropertyType type() { throw new UnsupportedOperationException(); }
    @Override
    Object value() { throw new UnsupportedOperationException(); }
    @Override
    Object defaultValue() { throw new UnsupportedOperationException(); }
    @Override
    String label() { throw new UnsupportedOperationException(); }
    @Override
    String checkboxLabel() { throw new UnsupportedOperationException(); }
    @Override
    String description() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutablePluginPropertyDto fromJson(Json json) {
    ImmutablePluginPropertyDto.Builder builder = ImmutablePluginPropertyDto.builder();
    if (json.name != null) {
      builder.name(json.name);
    }
    if (json.type != null) {
      builder.type(json.type);
    }
    if (json.value != null) {
      builder.value(json.value);
    }
    if (json.defaultValue != null) {
      builder.defaultValue(json.defaultValue);
    }
    if (json.label != null) {
      builder.label(json.label);
    }
    if (json.checkboxLabel != null) {
      builder.checkboxLabel(json.checkboxLabel);
    }
    if (json.description != null) {
      builder.description(json.description);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ConfigJsonService.PluginPropertyDto} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable PluginPropertyDto instance
   */
  public static ImmutablePluginPropertyDto copyOf(ConfigJsonService.PluginPropertyDto instance) {
    if (instance instanceof ImmutablePluginPropertyDto) {
      return (ImmutablePluginPropertyDto) instance;
    }
    return ImmutablePluginPropertyDto.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutablePluginPropertyDto ImmutablePluginPropertyDto}.
   * @return A new ImmutablePluginPropertyDto builder
   */
  public static ImmutablePluginPropertyDto.Builder builder() {
    return new ImmutablePluginPropertyDto.Builder();
  }

  /**
   * Builds instances of type {@link ImmutablePluginPropertyDto ImmutablePluginPropertyDto}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_NAME = 0x1L;
    private static final long INIT_BIT_TYPE = 0x2L;
    private long initBits = 0x3L;

    private @Nullable String name;
    private @Nullable ConfigJsonService.PropertyType type;
    private @Nullable Object value;
    private @Nullable Object defaultValue;
    private @Nullable String label;
    private @Nullable String checkboxLabel;
    private @Nullable String description;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code PluginPropertyDto} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(ConfigJsonService.PluginPropertyDto instance) {
      Preconditions.checkNotNull(instance, "instance");
      name(instance.name());
      type(instance.type());
      @Nullable Object valueValue = instance.value();
      if (valueValue != null) {
        value(valueValue);
      }
      @Nullable Object defaultValueValue = instance.defaultValue();
      if (defaultValueValue != null) {
        defaultValue(defaultValueValue);
      }
      @Nullable String labelValue = instance.label();
      if (labelValue != null) {
        label(labelValue);
      }
      @Nullable String checkboxLabelValue = instance.checkboxLabel();
      if (checkboxLabelValue != null) {
        checkboxLabel(checkboxLabelValue);
      }
      @Nullable String descriptionValue = instance.description();
      if (descriptionValue != null) {
        description(descriptionValue);
      }
      return this;
    }

    /**
     * Initializes the value for the {@link ConfigJsonService.PluginPropertyDto#name() name} attribute.
     * @param name The value for name 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder name(String name) {
      this.name = Preconditions.checkNotNull(name, "name");
      initBits &= ~INIT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link ConfigJsonService.PluginPropertyDto#type() type} attribute.
     * @param type The value for type 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder type(ConfigJsonService.PropertyType type) {
      this.type = Preconditions.checkNotNull(type, "type");
      initBits &= ~INIT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the value for the {@link ConfigJsonService.PluginPropertyDto#value() value} attribute.
     * @param value The value for value (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder value(@Nullable Object value) {
      this.value = value;
      return this;
    }

    /**
     * Initializes the value for the {@link ConfigJsonService.PluginPropertyDto#defaultValue() defaultValue} attribute.
     * @param defaultValue The value for defaultValue (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder defaultValue(@Nullable Object defaultValue) {
      this.defaultValue = defaultValue;
      return this;
    }

    /**
     * Initializes the value for the {@link ConfigJsonService.PluginPropertyDto#label() label} attribute.
     * @param label The value for label (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder label(@Nullable String label) {
      this.label = label;
      return this;
    }

    /**
     * Initializes the value for the {@link ConfigJsonService.PluginPropertyDto#checkboxLabel() checkboxLabel} attribute.
     * @param checkboxLabel The value for checkboxLabel (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder checkboxLabel(@Nullable String checkboxLabel) {
      this.checkboxLabel = checkboxLabel;
      return this;
    }

    /**
     * Initializes the value for the {@link ConfigJsonService.PluginPropertyDto#description() description} attribute.
     * @param description The value for description (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder description(@Nullable String description) {
      this.description = description;
      return this;
    }

    /**
     * Builds a new {@link ImmutablePluginPropertyDto ImmutablePluginPropertyDto}.
     * @return An immutable instance of PluginPropertyDto
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutablePluginPropertyDto build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutablePluginPropertyDto(name, type, value, defaultValue, label, checkboxLabel, description);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      if ((initBits & INIT_BIT_TYPE) != 0) attributes.add("type");
      return "Cannot build PluginPropertyDto, some of required attributes are not set " + attributes;
    }
  }
}
