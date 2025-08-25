package org.glowroot.agent.config;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import org.glowroot.agent.shaded.google.common.collect.ImmutableList;
import org.glowroot.agent.shaded.google.common.collect.Lists;
import org.glowroot.agent.shaded.google.common.primitives.Doubles;
import java.util.ArrayList;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link UiConfig}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableUiConfig.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "UiConfig"})
@Immutable
public final class ImmutableUiConfig extends UiConfig {
  private final String defaultDisplayedTransactionType;
  private final ImmutableList<Double> defaultDisplayedPercentiles;

  private ImmutableUiConfig(ImmutableUiConfig.Builder builder) {
    if (builder.defaultDisplayedTransactionType != null) {
      initShim.defaultDisplayedTransactionType(builder.defaultDisplayedTransactionType);
    }
    if (builder.defaultDisplayedPercentilesIsSet()) {
      initShim.defaultDisplayedPercentiles(builder.defaultDisplayedPercentiles.build());
    }
    this.defaultDisplayedTransactionType = initShim.defaultDisplayedTransactionType();
    this.defaultDisplayedPercentiles = initShim.defaultDisplayedPercentiles();
    this.initShim = null;
  }

  private ImmutableUiConfig(
      String defaultDisplayedTransactionType,
      ImmutableList<Double> defaultDisplayedPercentiles) {
    this.defaultDisplayedTransactionType = defaultDisplayedTransactionType;
    this.defaultDisplayedPercentiles = defaultDisplayedPercentiles;
    this.initShim = null;
  }

  private static final int STAGE_INITIALIZING = -1;
  private static final int STAGE_UNINITIALIZED = 0;
  private static final int STAGE_INITIALIZED = 1;
  private transient volatile InitShim initShim = new InitShim();

  private final class InitShim {
    private String defaultDisplayedTransactionType;
    private int defaultDisplayedTransactionTypeBuildStage;

    String defaultDisplayedTransactionType() {
      if (defaultDisplayedTransactionTypeBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (defaultDisplayedTransactionTypeBuildStage == STAGE_UNINITIALIZED) {
        defaultDisplayedTransactionTypeBuildStage = STAGE_INITIALIZING;
        this.defaultDisplayedTransactionType = Preconditions.checkNotNull(ImmutableUiConfig.super.defaultDisplayedTransactionType(), "defaultDisplayedTransactionType");
        defaultDisplayedTransactionTypeBuildStage = STAGE_INITIALIZED;
      }
      return this.defaultDisplayedTransactionType;
    }

    void defaultDisplayedTransactionType(String defaultDisplayedTransactionType) {
      this.defaultDisplayedTransactionType = defaultDisplayedTransactionType;
      defaultDisplayedTransactionTypeBuildStage = STAGE_INITIALIZED;
    }
    private ImmutableList<Double> defaultDisplayedPercentiles;
    private int defaultDisplayedPercentilesBuildStage;

    ImmutableList<Double> defaultDisplayedPercentiles() {
      if (defaultDisplayedPercentilesBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (defaultDisplayedPercentilesBuildStage == STAGE_UNINITIALIZED) {
        defaultDisplayedPercentilesBuildStage = STAGE_INITIALIZING;
        this.defaultDisplayedPercentiles = Preconditions.checkNotNull(ImmutableUiConfig.super.defaultDisplayedPercentiles(), "defaultDisplayedPercentiles");
        defaultDisplayedPercentilesBuildStage = STAGE_INITIALIZED;
      }
      return this.defaultDisplayedPercentiles;
    }

    void defaultDisplayedPercentiles(ImmutableList<Double> defaultDisplayedPercentiles) {
      this.defaultDisplayedPercentiles = defaultDisplayedPercentiles;
      defaultDisplayedPercentilesBuildStage = STAGE_INITIALIZED;
    }

    private String formatInitCycleMessage() {
      ArrayList<String> attributes = Lists.newArrayList();
      if (defaultDisplayedTransactionTypeBuildStage == STAGE_INITIALIZING) attributes.add("defaultDisplayedTransactionType");
      if (defaultDisplayedPercentilesBuildStage == STAGE_INITIALIZING) attributes.add("defaultDisplayedPercentiles");
      return "Cannot build UiConfig, attribute initializers form cycle" + attributes;
    }
  }

  /**
   * @return The value of the {@code defaultDisplayedTransactionType} attribute
   */
  @JsonProperty("defaultDisplayedTransactionType")
  @Override
  public String defaultDisplayedTransactionType() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.defaultDisplayedTransactionType()
        : this.defaultDisplayedTransactionType;
  }

  /**
   * @return The value of the {@code defaultDisplayedPercentiles} attribute
   */
  @JsonProperty("defaultDisplayedPercentiles")
  @Override
  public ImmutableList<Double> defaultDisplayedPercentiles() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.defaultDisplayedPercentiles()
        : this.defaultDisplayedPercentiles;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link UiConfig#defaultDisplayedTransactionType() defaultDisplayedTransactionType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for defaultDisplayedTransactionType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableUiConfig withDefaultDisplayedTransactionType(String value) {
    if (this.defaultDisplayedTransactionType.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "defaultDisplayedTransactionType");
    return new ImmutableUiConfig(newValue, this.defaultDisplayedPercentiles);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link UiConfig#defaultDisplayedPercentiles() defaultDisplayedPercentiles}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUiConfig withDefaultDisplayedPercentiles(double... elements) {
    ImmutableList<Double> newValue = ImmutableList.copyOf(Doubles.asList(elements));
    return new ImmutableUiConfig(this.defaultDisplayedTransactionType, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link UiConfig#defaultDisplayedPercentiles() defaultDisplayedPercentiles}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of defaultDisplayedPercentiles elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUiConfig withDefaultDisplayedPercentiles(Iterable<Double> elements) {
    if (this.defaultDisplayedPercentiles == elements) return this;
    ImmutableList<Double> newValue = ImmutableList.copyOf(elements);
    return new ImmutableUiConfig(this.defaultDisplayedTransactionType, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableUiConfig} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableUiConfig
        && equalTo((ImmutableUiConfig) another);
  }

  private boolean equalTo(ImmutableUiConfig another) {
    return defaultDisplayedTransactionType.equals(another.defaultDisplayedTransactionType)
        && defaultDisplayedPercentiles.equals(another.defaultDisplayedPercentiles);
  }

  /**
   * Computes a hash code from attributes: {@code defaultDisplayedTransactionType}, {@code defaultDisplayedPercentiles}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + defaultDisplayedTransactionType.hashCode();
    h += (h << 5) + defaultDisplayedPercentiles.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code UiConfig} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("UiConfig")
        .omitNullValues()
        .add("defaultDisplayedTransactionType", defaultDisplayedTransactionType)
        .add("defaultDisplayedPercentiles", defaultDisplayedPercentiles)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends UiConfig {
    @Nullable String defaultDisplayedTransactionType;
    ImmutableList<Double> defaultDisplayedPercentiles = ImmutableList.of();
    boolean defaultDisplayedPercentilesIsSet;
    @JsonProperty("defaultDisplayedTransactionType")
    public void setDefaultDisplayedTransactionType(String defaultDisplayedTransactionType) {
      this.defaultDisplayedTransactionType = defaultDisplayedTransactionType;
    }
    @JsonProperty("defaultDisplayedPercentiles")
    public void setDefaultDisplayedPercentiles(ImmutableList<Double> defaultDisplayedPercentiles) {
      this.defaultDisplayedPercentiles = defaultDisplayedPercentiles;
      this.defaultDisplayedPercentilesIsSet = true;
    }
    @Override
    public String defaultDisplayedTransactionType() { throw new UnsupportedOperationException(); }
    @Override
    public ImmutableList<Double> defaultDisplayedPercentiles() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableUiConfig fromJson(Json json) {
    ImmutableUiConfig.Builder builder = ImmutableUiConfig.builder();
    if (json.defaultDisplayedTransactionType != null) {
      builder.defaultDisplayedTransactionType(json.defaultDisplayedTransactionType);
    }
    if (json.defaultDisplayedPercentilesIsSet) {
      builder.defaultDisplayedPercentiles(json.defaultDisplayedPercentiles);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link UiConfig} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable UiConfig instance
   */
  public static ImmutableUiConfig copyOf(UiConfig instance) {
    if (instance instanceof ImmutableUiConfig) {
      return (ImmutableUiConfig) instance;
    }
    return ImmutableUiConfig.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableUiConfig ImmutableUiConfig}.
   * @return A new ImmutableUiConfig builder
   */
  public static ImmutableUiConfig.Builder builder() {
    return new ImmutableUiConfig.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableUiConfig ImmutableUiConfig}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_DEFAULT_DISPLAYED_PERCENTILES = 0x1L;
    private long optBits;

    private @Nullable String defaultDisplayedTransactionType;
    private ImmutableList.Builder<Double> defaultDisplayedPercentiles = ImmutableList.builder();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code UiConfig} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(UiConfig instance) {
      Preconditions.checkNotNull(instance, "instance");
      defaultDisplayedTransactionType(instance.defaultDisplayedTransactionType());
      addAllDefaultDisplayedPercentiles(instance.defaultDisplayedPercentiles());
      return this;
    }

    /**
     * Initializes the value for the {@link UiConfig#defaultDisplayedTransactionType() defaultDisplayedTransactionType} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link UiConfig#defaultDisplayedTransactionType() defaultDisplayedTransactionType}.</em>
     * @param defaultDisplayedTransactionType The value for defaultDisplayedTransactionType 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder defaultDisplayedTransactionType(String defaultDisplayedTransactionType) {
      this.defaultDisplayedTransactionType = Preconditions.checkNotNull(defaultDisplayedTransactionType, "defaultDisplayedTransactionType");
      return this;
    }

    /**
     * Adds one element to {@link UiConfig#defaultDisplayedPercentiles() defaultDisplayedPercentiles} list.
     * @param element A defaultDisplayedPercentiles element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addDefaultDisplayedPercentiles(double element) {
      this.defaultDisplayedPercentiles.add(element);
      optBits |= OPT_BIT_DEFAULT_DISPLAYED_PERCENTILES;
      return this;
    }

    /**
     * Adds elements to {@link UiConfig#defaultDisplayedPercentiles() defaultDisplayedPercentiles} list.
     * @param elements An array of defaultDisplayedPercentiles elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addDefaultDisplayedPercentiles(double... elements) {
      this.defaultDisplayedPercentiles.addAll(Doubles.asList(elements));
      optBits |= OPT_BIT_DEFAULT_DISPLAYED_PERCENTILES;
      return this;
    }

    /**
     * Sets or replaces all elements for {@link UiConfig#defaultDisplayedPercentiles() defaultDisplayedPercentiles} list.
     * @param elements An iterable of defaultDisplayedPercentiles elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder defaultDisplayedPercentiles(Iterable<Double> elements) {
      this.defaultDisplayedPercentiles = ImmutableList.builder();
      return addAllDefaultDisplayedPercentiles(elements);
    }

    /**
     * Adds elements to {@link UiConfig#defaultDisplayedPercentiles() defaultDisplayedPercentiles} list.
     * @param elements An iterable of defaultDisplayedPercentiles elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllDefaultDisplayedPercentiles(Iterable<Double> elements) {
      this.defaultDisplayedPercentiles.addAll(elements);
      optBits |= OPT_BIT_DEFAULT_DISPLAYED_PERCENTILES;
      return this;
    }

    /**
     * Builds a new {@link ImmutableUiConfig ImmutableUiConfig}.
     * @return An immutable instance of UiConfig
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableUiConfig build() {
      return new ImmutableUiConfig(this);
    }

    private boolean defaultDisplayedPercentilesIsSet() {
      return (optBits & OPT_BIT_DEFAULT_DISPLAYED_PERCENTILES) != 0;
    }
  }
}
