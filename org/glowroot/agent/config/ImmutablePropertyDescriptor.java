package org.glowroot.agent.config;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Objects;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import org.glowroot.agent.shaded.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link PropertyDescriptor}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePropertyDescriptor.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "PropertyDescriptor"})
@Immutable
public final class ImmutablePropertyDescriptor extends PropertyDescriptor {
  private final String name;
  private final PropertyValue.PropertyType type;
  private final @Nullable PropertyValue defaultValue;
  private final String label;
  private final String checkboxLabel;
  private final String description;

  private ImmutablePropertyDescriptor(ImmutablePropertyDescriptor.Builder builder) {
    this.name = builder.name;
    this.type = builder.type;
    this.defaultValue = builder.defaultValue;
    this.label = builder.label;
    if (builder.checkboxLabel != null) {
      initShim.checkboxLabel(builder.checkboxLabel);
    }
    if (builder.description != null) {
      initShim.description(builder.description);
    }
    this.checkboxLabel = initShim.checkboxLabel();
    this.description = initShim.description();
    this.initShim = null;
  }

  private ImmutablePropertyDescriptor(
      String name,
      PropertyValue.PropertyType type,
      @Nullable PropertyValue defaultValue,
      String label,
      String checkboxLabel,
      String description) {
    this.name = name;
    this.type = type;
    this.defaultValue = defaultValue;
    this.label = label;
    this.checkboxLabel = checkboxLabel;
    this.description = description;
    this.initShim = null;
  }

  private static final int STAGE_INITIALIZING = -1;
  private static final int STAGE_UNINITIALIZED = 0;
  private static final int STAGE_INITIALIZED = 1;
  private transient volatile InitShim initShim = new InitShim();

  private final class InitShim {
    private String checkboxLabel;
    private int checkboxLabelBuildStage;

    String checkboxLabel() {
      if (checkboxLabelBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (checkboxLabelBuildStage == STAGE_UNINITIALIZED) {
        checkboxLabelBuildStage = STAGE_INITIALIZING;
        this.checkboxLabel = Preconditions.checkNotNull(ImmutablePropertyDescriptor.super.checkboxLabel(), "checkboxLabel");
        checkboxLabelBuildStage = STAGE_INITIALIZED;
      }
      return this.checkboxLabel;
    }

    void checkboxLabel(String checkboxLabel) {
      this.checkboxLabel = checkboxLabel;
      checkboxLabelBuildStage = STAGE_INITIALIZED;
    }
    private String description;
    private int descriptionBuildStage;

    String description() {
      if (descriptionBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (descriptionBuildStage == STAGE_UNINITIALIZED) {
        descriptionBuildStage = STAGE_INITIALIZING;
        this.description = Preconditions.checkNotNull(ImmutablePropertyDescriptor.super.description(), "description");
        descriptionBuildStage = STAGE_INITIALIZED;
      }
      return this.description;
    }

    void description(String description) {
      this.description = description;
      descriptionBuildStage = STAGE_INITIALIZED;
    }

    private String formatInitCycleMessage() {
      ArrayList<String> attributes = Lists.newArrayList();
      if (checkboxLabelBuildStage == STAGE_INITIALIZING) attributes.add("checkboxLabel");
      if (descriptionBuildStage == STAGE_INITIALIZING) attributes.add("description");
      return "Cannot build PropertyDescriptor, attribute initializers form cycle" + attributes;
    }
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
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public PropertyValue.PropertyType type() {
    return type;
  }

  /**
   * @return The value of the {@code defaultValue} attribute
   */
  @JsonProperty("default")
  @Override
  public @Nullable PropertyValue defaultValue() {
    return defaultValue;
  }

  /**
   * @return The value of the {@code label} attribute
   */
  @JsonProperty("label")
  @Override
  public String label() {
    return label;
  }

  /**
   * @return The value of the {@code checkboxLabel} attribute
   */
  @JsonProperty("checkboxLabel")
  @Override
  public String checkboxLabel() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.checkboxLabel()
        : this.checkboxLabel;
  }

  /**
   * @return The value of the {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  public String description() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.description()
        : this.description;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PropertyDescriptor#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePropertyDescriptor withName(String value) {
    if (this.name.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "name");
    return new ImmutablePropertyDescriptor(newValue, this.type, this.defaultValue, this.label, this.checkboxLabel, this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PropertyDescriptor#type() type} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for type
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePropertyDescriptor withType(PropertyValue.PropertyType value) {
    if (this.type == value) return this;
    PropertyValue.PropertyType newValue = Preconditions.checkNotNull(value, "type");
    return new ImmutablePropertyDescriptor(this.name, newValue, this.defaultValue, this.label, this.checkboxLabel, this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PropertyDescriptor#defaultValue() defaultValue} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for defaultValue (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePropertyDescriptor withDefaultValue(@Nullable PropertyValue value) {
    if (this.defaultValue == value) return this;
    return new ImmutablePropertyDescriptor(this.name, this.type, value, this.label, this.checkboxLabel, this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PropertyDescriptor#label() label} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for label
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePropertyDescriptor withLabel(String value) {
    if (this.label.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "label");
    return new ImmutablePropertyDescriptor(this.name, this.type, this.defaultValue, newValue, this.checkboxLabel, this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PropertyDescriptor#checkboxLabel() checkboxLabel} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for checkboxLabel
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePropertyDescriptor withCheckboxLabel(String value) {
    if (this.checkboxLabel.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "checkboxLabel");
    return new ImmutablePropertyDescriptor(this.name, this.type, this.defaultValue, this.label, newValue, this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PropertyDescriptor#description() description} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for description
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePropertyDescriptor withDescription(String value) {
    if (this.description.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "description");
    return new ImmutablePropertyDescriptor(this.name, this.type, this.defaultValue, this.label, this.checkboxLabel, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePropertyDescriptor} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePropertyDescriptor
        && equalTo((ImmutablePropertyDescriptor) another);
  }

  private boolean equalTo(ImmutablePropertyDescriptor another) {
    return name.equals(another.name)
        && type.equals(another.type)
        && Objects.equal(defaultValue, another.defaultValue)
        && label.equals(another.label)
        && checkboxLabel.equals(another.checkboxLabel)
        && description.equals(another.description);
  }

  /**
   * Computes a hash code from attributes: {@code name}, {@code type}, {@code defaultValue}, {@code label}, {@code checkboxLabel}, {@code description}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + name.hashCode();
    h += (h << 5) + type.hashCode();
    h += (h << 5) + Objects.hashCode(defaultValue);
    h += (h << 5) + label.hashCode();
    h += (h << 5) + checkboxLabel.hashCode();
    h += (h << 5) + description.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code PropertyDescriptor} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("PropertyDescriptor")
        .omitNullValues()
        .add("name", name)
        .add("type", type)
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
  static final class Json extends PropertyDescriptor {
    @Nullable String name;
    @Nullable PropertyValue.PropertyType type;
    @Nullable PropertyValue defaultValue;
    @Nullable String label;
    @Nullable String checkboxLabel;
    @Nullable String description;
    @JsonProperty("name")
    public void setName(String name) {
      this.name = name;
    }
    @JsonProperty("type")
    public void setType(PropertyValue.PropertyType type) {
      this.type = type;
    }
    @JsonProperty("default")
    public void setDefaultValue(@Nullable PropertyValue defaultValue) {
      this.defaultValue = defaultValue;
    }
    @JsonProperty("label")
    public void setLabel(String label) {
      this.label = label;
    }
    @JsonProperty("checkboxLabel")
    public void setCheckboxLabel(String checkboxLabel) {
      this.checkboxLabel = checkboxLabel;
    }
    @JsonProperty("description")
    public void setDescription(String description) {
      this.description = description;
    }
    @Override
    public String name() { throw new UnsupportedOperationException(); }
    @Override
    public PropertyValue.PropertyType type() { throw new UnsupportedOperationException(); }
    @Override
    public PropertyValue defaultValue() { throw new UnsupportedOperationException(); }
    @Override
    public String label() { throw new UnsupportedOperationException(); }
    @Override
    public String checkboxLabel() { throw new UnsupportedOperationException(); }
    @Override
    public String description() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutablePropertyDescriptor fromJson(Json json) {
    ImmutablePropertyDescriptor.Builder builder = ImmutablePropertyDescriptor.builder();
    if (json.name != null) {
      builder.name(json.name);
    }
    if (json.type != null) {
      builder.type(json.type);
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
   * Creates an immutable copy of a {@link PropertyDescriptor} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable PropertyDescriptor instance
   */
  public static ImmutablePropertyDescriptor copyOf(PropertyDescriptor instance) {
    if (instance instanceof ImmutablePropertyDescriptor) {
      return (ImmutablePropertyDescriptor) instance;
    }
    return ImmutablePropertyDescriptor.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutablePropertyDescriptor ImmutablePropertyDescriptor}.
   * @return A new ImmutablePropertyDescriptor builder
   */
  public static ImmutablePropertyDescriptor.Builder builder() {
    return new ImmutablePropertyDescriptor.Builder();
  }

  /**
   * Builds instances of type {@link ImmutablePropertyDescriptor ImmutablePropertyDescriptor}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_NAME = 0x1L;
    private static final long INIT_BIT_TYPE = 0x2L;
    private static final long INIT_BIT_LABEL = 0x4L;
    private long initBits = 0x7L;

    private @Nullable String name;
    private @Nullable PropertyValue.PropertyType type;
    private @Nullable PropertyValue defaultValue;
    private @Nullable String label;
    private @Nullable String checkboxLabel;
    private @Nullable String description;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code PropertyDescriptor} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(PropertyDescriptor instance) {
      Preconditions.checkNotNull(instance, "instance");
      name(instance.name());
      type(instance.type());
      @Nullable PropertyValue defaultValueValue = instance.defaultValue();
      if (defaultValueValue != null) {
        defaultValue(defaultValueValue);
      }
      label(instance.label());
      checkboxLabel(instance.checkboxLabel());
      description(instance.description());
      return this;
    }

    /**
     * Initializes the value for the {@link PropertyDescriptor#name() name} attribute.
     * @param name The value for name 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder name(String name) {
      this.name = Preconditions.checkNotNull(name, "name");
      initBits &= ~INIT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link PropertyDescriptor#type() type} attribute.
     * @param type The value for type 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder type(PropertyValue.PropertyType type) {
      this.type = Preconditions.checkNotNull(type, "type");
      initBits &= ~INIT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the value for the {@link PropertyDescriptor#defaultValue() defaultValue} attribute.
     * @param defaultValue The value for defaultValue (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder defaultValue(@Nullable PropertyValue defaultValue) {
      this.defaultValue = defaultValue;
      return this;
    }

    /**
     * Initializes the value for the {@link PropertyDescriptor#label() label} attribute.
     * @param label The value for label 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder label(String label) {
      this.label = Preconditions.checkNotNull(label, "label");
      initBits &= ~INIT_BIT_LABEL;
      return this;
    }

    /**
     * Initializes the value for the {@link PropertyDescriptor#checkboxLabel() checkboxLabel} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link PropertyDescriptor#checkboxLabel() checkboxLabel}.</em>
     * @param checkboxLabel The value for checkboxLabel 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder checkboxLabel(String checkboxLabel) {
      this.checkboxLabel = Preconditions.checkNotNull(checkboxLabel, "checkboxLabel");
      return this;
    }

    /**
     * Initializes the value for the {@link PropertyDescriptor#description() description} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link PropertyDescriptor#description() description}.</em>
     * @param description The value for description 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder description(String description) {
      this.description = Preconditions.checkNotNull(description, "description");
      return this;
    }

    /**
     * Builds a new {@link ImmutablePropertyDescriptor ImmutablePropertyDescriptor}.
     * @return An immutable instance of PropertyDescriptor
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutablePropertyDescriptor build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutablePropertyDescriptor(this);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      if ((initBits & INIT_BIT_TYPE) != 0) attributes.add("type");
      if ((initBits & INIT_BIT_LABEL) != 0) attributes.add("label");
      return "Cannot build PropertyDescriptor, some of required attributes are not set " + attributes;
    }
  }
}
