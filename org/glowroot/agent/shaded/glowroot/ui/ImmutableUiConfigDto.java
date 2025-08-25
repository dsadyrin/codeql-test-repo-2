package org.glowroot.agent.shaded.glowroot.ui;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import org.glowroot.agent.shaded.google.common.collect.ImmutableList;
import org.glowroot.agent.shaded.google.common.collect.Lists;
import org.glowroot.agent.shaded.google.common.primitives.Doubles;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link ConfigJsonService.UiConfigDto}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableUiConfigDto.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "ConfigJsonService.UiConfigDto"})
@Immutable
final class ImmutableUiConfigDto extends ConfigJsonService.UiConfigDto {
  private final String defaultDisplayedTransactionType;
  private final ImmutableList<Double> defaultDisplayedPercentiles;
  private final String version;

  private ImmutableUiConfigDto(
      String defaultDisplayedTransactionType,
      ImmutableList<Double> defaultDisplayedPercentiles,
      String version) {
    this.defaultDisplayedTransactionType = defaultDisplayedTransactionType;
    this.defaultDisplayedPercentiles = defaultDisplayedPercentiles;
    this.version = version;
  }

  /**
   * @return The value of the {@code defaultDisplayedTransactionType} attribute
   */
  @JsonProperty("defaultDisplayedTransactionType")
  @Override
  String defaultDisplayedTransactionType() {
    return defaultDisplayedTransactionType;
  }

  /**
   * @return The value of the {@code defaultDisplayedPercentiles} attribute
   */
  @JsonProperty("defaultDisplayedPercentiles")
  @Override
  ImmutableList<Double> defaultDisplayedPercentiles() {
    return defaultDisplayedPercentiles;
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
   * Copy the current immutable object by setting a value for the {@link ConfigJsonService.UiConfigDto#defaultDisplayedTransactionType() defaultDisplayedTransactionType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for defaultDisplayedTransactionType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableUiConfigDto withDefaultDisplayedTransactionType(String value) {
    if (this.defaultDisplayedTransactionType.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "defaultDisplayedTransactionType");
    return new ImmutableUiConfigDto(newValue, this.defaultDisplayedPercentiles, this.version);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ConfigJsonService.UiConfigDto#defaultDisplayedPercentiles() defaultDisplayedPercentiles}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUiConfigDto withDefaultDisplayedPercentiles(double... elements) {
    ImmutableList<Double> newValue = ImmutableList.copyOf(Doubles.asList(elements));
    return new ImmutableUiConfigDto(this.defaultDisplayedTransactionType, newValue, this.version);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ConfigJsonService.UiConfigDto#defaultDisplayedPercentiles() defaultDisplayedPercentiles}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of defaultDisplayedPercentiles elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUiConfigDto withDefaultDisplayedPercentiles(Iterable<Double> elements) {
    if (this.defaultDisplayedPercentiles == elements) return this;
    ImmutableList<Double> newValue = ImmutableList.copyOf(elements);
    return new ImmutableUiConfigDto(this.defaultDisplayedTransactionType, newValue, this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ConfigJsonService.UiConfigDto#version() version} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for version
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableUiConfigDto withVersion(String value) {
    if (this.version.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "version");
    return new ImmutableUiConfigDto(this.defaultDisplayedTransactionType, this.defaultDisplayedPercentiles, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableUiConfigDto} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableUiConfigDto
        && equalTo((ImmutableUiConfigDto) another);
  }

  private boolean equalTo(ImmutableUiConfigDto another) {
    return defaultDisplayedTransactionType.equals(another.defaultDisplayedTransactionType)
        && defaultDisplayedPercentiles.equals(another.defaultDisplayedPercentiles)
        && version.equals(another.version);
  }

  /**
   * Computes a hash code from attributes: {@code defaultDisplayedTransactionType}, {@code defaultDisplayedPercentiles}, {@code version}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + defaultDisplayedTransactionType.hashCode();
    h += (h << 5) + defaultDisplayedPercentiles.hashCode();
    h += (h << 5) + version.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code UiConfigDto} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("UiConfigDto")
        .omitNullValues()
        .add("defaultDisplayedTransactionType", defaultDisplayedTransactionType)
        .add("defaultDisplayedPercentiles", defaultDisplayedPercentiles)
        .add("version", version)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends ConfigJsonService.UiConfigDto {
    @Nullable String defaultDisplayedTransactionType;
    ImmutableList<Double> defaultDisplayedPercentiles = ImmutableList.of();
    @Nullable String version;
    @JsonProperty("defaultDisplayedTransactionType")
    public void setDefaultDisplayedTransactionType(String defaultDisplayedTransactionType) {
      this.defaultDisplayedTransactionType = defaultDisplayedTransactionType;
    }
    @JsonProperty("defaultDisplayedPercentiles")
    public void setDefaultDisplayedPercentiles(ImmutableList<Double> defaultDisplayedPercentiles) {
      this.defaultDisplayedPercentiles = defaultDisplayedPercentiles;
    }
    @JsonProperty("version")
    public void setVersion(String version) {
      this.version = version;
    }
    @Override
    String defaultDisplayedTransactionType() { throw new UnsupportedOperationException(); }
    @Override
    ImmutableList<Double> defaultDisplayedPercentiles() { throw new UnsupportedOperationException(); }
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
  static ImmutableUiConfigDto fromJson(Json json) {
    ImmutableUiConfigDto.Builder builder = ImmutableUiConfigDto.builder();
    if (json.defaultDisplayedTransactionType != null) {
      builder.defaultDisplayedTransactionType(json.defaultDisplayedTransactionType);
    }
    if (json.defaultDisplayedPercentiles != null) {
      builder.addAllDefaultDisplayedPercentiles(json.defaultDisplayedPercentiles);
    }
    if (json.version != null) {
      builder.version(json.version);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ConfigJsonService.UiConfigDto} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable UiConfigDto instance
   */
  public static ImmutableUiConfigDto copyOf(ConfigJsonService.UiConfigDto instance) {
    if (instance instanceof ImmutableUiConfigDto) {
      return (ImmutableUiConfigDto) instance;
    }
    return ImmutableUiConfigDto.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableUiConfigDto ImmutableUiConfigDto}.
   * @return A new ImmutableUiConfigDto builder
   */
  public static ImmutableUiConfigDto.Builder builder() {
    return new ImmutableUiConfigDto.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableUiConfigDto ImmutableUiConfigDto}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_DEFAULT_DISPLAYED_TRANSACTION_TYPE = 0x1L;
    private static final long INIT_BIT_VERSION = 0x2L;
    private long initBits = 0x3L;

    private @Nullable String defaultDisplayedTransactionType;
    private ImmutableList.Builder<Double> defaultDisplayedPercentiles = ImmutableList.builder();
    private @Nullable String version;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code UiConfigDto} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(ConfigJsonService.UiConfigDto instance) {
      Preconditions.checkNotNull(instance, "instance");
      defaultDisplayedTransactionType(instance.defaultDisplayedTransactionType());
      addAllDefaultDisplayedPercentiles(instance.defaultDisplayedPercentiles());
      version(instance.version());
      return this;
    }

    /**
     * Initializes the value for the {@link ConfigJsonService.UiConfigDto#defaultDisplayedTransactionType() defaultDisplayedTransactionType} attribute.
     * @param defaultDisplayedTransactionType The value for defaultDisplayedTransactionType 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder defaultDisplayedTransactionType(String defaultDisplayedTransactionType) {
      this.defaultDisplayedTransactionType = Preconditions.checkNotNull(defaultDisplayedTransactionType, "defaultDisplayedTransactionType");
      initBits &= ~INIT_BIT_DEFAULT_DISPLAYED_TRANSACTION_TYPE;
      return this;
    }

    /**
     * Adds one element to {@link ConfigJsonService.UiConfigDto#defaultDisplayedPercentiles() defaultDisplayedPercentiles} list.
     * @param element A defaultDisplayedPercentiles element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addDefaultDisplayedPercentiles(double element) {
      this.defaultDisplayedPercentiles.add(element);
      return this;
    }

    /**
     * Adds elements to {@link ConfigJsonService.UiConfigDto#defaultDisplayedPercentiles() defaultDisplayedPercentiles} list.
     * @param elements An array of defaultDisplayedPercentiles elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addDefaultDisplayedPercentiles(double... elements) {
      this.defaultDisplayedPercentiles.addAll(Doubles.asList(elements));
      return this;
    }

    /**
     * Sets or replaces all elements for {@link ConfigJsonService.UiConfigDto#defaultDisplayedPercentiles() defaultDisplayedPercentiles} list.
     * @param elements An iterable of defaultDisplayedPercentiles elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder defaultDisplayedPercentiles(Iterable<Double> elements) {
      this.defaultDisplayedPercentiles = ImmutableList.builder();
      return addAllDefaultDisplayedPercentiles(elements);
    }

    /**
     * Adds elements to {@link ConfigJsonService.UiConfigDto#defaultDisplayedPercentiles() defaultDisplayedPercentiles} list.
     * @param elements An iterable of defaultDisplayedPercentiles elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllDefaultDisplayedPercentiles(Iterable<Double> elements) {
      this.defaultDisplayedPercentiles.addAll(elements);
      return this;
    }

    /**
     * Initializes the value for the {@link ConfigJsonService.UiConfigDto#version() version} attribute.
     * @param version The value for version 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder version(String version) {
      this.version = Preconditions.checkNotNull(version, "version");
      initBits &= ~INIT_BIT_VERSION;
      return this;
    }

    /**
     * Builds a new {@link ImmutableUiConfigDto ImmutableUiConfigDto}.
     * @return An immutable instance of UiConfigDto
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableUiConfigDto build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableUiConfigDto(defaultDisplayedTransactionType, defaultDisplayedPercentiles.build(), version);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_DEFAULT_DISPLAYED_TRANSACTION_TYPE) != 0) attributes.add("defaultDisplayedTransactionType");
      if ((initBits & INIT_BIT_VERSION) != 0) attributes.add("version");
      return "Cannot build UiConfigDto, some of required attributes are not set " + attributes;
    }
  }
}
