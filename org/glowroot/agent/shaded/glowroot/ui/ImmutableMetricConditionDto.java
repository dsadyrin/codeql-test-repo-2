package org.glowroot.agent.shaded.glowroot.ui;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonInclude;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonTypeInfo;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Objects;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import org.glowroot.agent.shaded.google.common.collect.Lists;
import org.glowroot.agent.shaded.google.common.primitives.Booleans;
import org.glowroot.agent.shaded.google.common.primitives.Doubles;
import org.glowroot.agent.shaded.google.common.primitives.Longs;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link AlertConfigJsonService.AlertConfigDto.MetricConditionDto}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMetricConditionDto.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "AlertConfigJsonService.AlertConfigDto.MetricConditionDto"})
@Immutable
public final class ImmutableMetricConditionDto
    extends AlertConfigJsonService.AlertConfigDto.MetricConditionDto {
  private final String metric;
  private final @Nullable String transactionType;
  private final @Nullable String transactionName;
  private final @Nullable Double percentile;
  private final double threshold;
  private final boolean lowerBoundThreshold;
  private final int timePeriodSeconds;
  private final long minTransactionCount;

  private ImmutableMetricConditionDto(ImmutableMetricConditionDto.Builder builder) {
    this.metric = builder.metric;
    this.transactionType = builder.transactionType;
    this.transactionName = builder.transactionName;
    this.percentile = builder.percentile;
    this.threshold = builder.threshold;
    this.timePeriodSeconds = builder.timePeriodSeconds;
    if (builder.lowerBoundThresholdIsSet()) {
      initShim.lowerBoundThreshold(builder.lowerBoundThreshold);
    }
    if (builder.minTransactionCountIsSet()) {
      initShim.minTransactionCount(builder.minTransactionCount);
    }
    this.lowerBoundThreshold = initShim.lowerBoundThreshold();
    this.minTransactionCount = initShim.minTransactionCount();
    this.initShim = null;
  }

  private ImmutableMetricConditionDto(
      String metric,
      @Nullable String transactionType,
      @Nullable String transactionName,
      @Nullable Double percentile,
      double threshold,
      boolean lowerBoundThreshold,
      int timePeriodSeconds,
      long minTransactionCount) {
    this.metric = metric;
    this.transactionType = transactionType;
    this.transactionName = transactionName;
    this.percentile = percentile;
    this.threshold = threshold;
    this.lowerBoundThreshold = lowerBoundThreshold;
    this.timePeriodSeconds = timePeriodSeconds;
    this.minTransactionCount = minTransactionCount;
    this.initShim = null;
  }

  private static final int STAGE_INITIALIZING = -1;
  private static final int STAGE_UNINITIALIZED = 0;
  private static final int STAGE_INITIALIZED = 1;
  private transient volatile InitShim initShim = new InitShim();

  private final class InitShim {
    private boolean lowerBoundThreshold;
    private int lowerBoundThresholdBuildStage;

    boolean lowerBoundThreshold() {
      if (lowerBoundThresholdBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (lowerBoundThresholdBuildStage == STAGE_UNINITIALIZED) {
        lowerBoundThresholdBuildStage = STAGE_INITIALIZING;
        this.lowerBoundThreshold = ImmutableMetricConditionDto.super.lowerBoundThreshold();
        lowerBoundThresholdBuildStage = STAGE_INITIALIZED;
      }
      return this.lowerBoundThreshold;
    }

    void lowerBoundThreshold(boolean lowerBoundThreshold) {
      this.lowerBoundThreshold = lowerBoundThreshold;
      lowerBoundThresholdBuildStage = STAGE_INITIALIZED;
    }
    private long minTransactionCount;
    private int minTransactionCountBuildStage;

    long minTransactionCount() {
      if (minTransactionCountBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (minTransactionCountBuildStage == STAGE_UNINITIALIZED) {
        minTransactionCountBuildStage = STAGE_INITIALIZING;
        this.minTransactionCount = ImmutableMetricConditionDto.super.minTransactionCount();
        minTransactionCountBuildStage = STAGE_INITIALIZED;
      }
      return this.minTransactionCount;
    }

    void minTransactionCount(long minTransactionCount) {
      this.minTransactionCount = minTransactionCount;
      minTransactionCountBuildStage = STAGE_INITIALIZED;
    }

    private String formatInitCycleMessage() {
      ArrayList<String> attributes = Lists.newArrayList();
      if (lowerBoundThresholdBuildStage == STAGE_INITIALIZING) attributes.add("lowerBoundThreshold");
      if (minTransactionCountBuildStage == STAGE_INITIALIZING) attributes.add("minTransactionCount");
      return "Cannot build MetricConditionDto, attribute initializers form cycle" + attributes;
    }
  }

  /**
   * @return The value of the {@code metric} attribute
   */
  @JsonProperty("metric")
  @Override
  String metric() {
    return metric;
  }

  /**
   * @return The value of the {@code transactionType} attribute
   */
  @JsonProperty("transactionType")
  @Override
  @Nullable String transactionType() {
    return transactionType;
  }

  /**
   * @return The value of the {@code transactionName} attribute
   */
  @JsonProperty("transactionName")
  @Override
  @Nullable String transactionName() {
    return transactionName;
  }

  /**
   * @return The value of the {@code percentile} attribute
   */
  @JsonProperty("percentile")
  @Override
  @Nullable Double percentile() {
    return percentile;
  }

  /**
   * @return The value of the {@code threshold} attribute
   */
  @JsonProperty("threshold")
  @Override
  double threshold() {
    return threshold;
  }

  /**
   * @return The value of the {@code lowerBoundThreshold} attribute
   */
  @JsonProperty("lowerBoundThreshold")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @Override
  boolean lowerBoundThreshold() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.lowerBoundThreshold()
        : this.lowerBoundThreshold;
  }

  /**
   * @return The value of the {@code timePeriodSeconds} attribute
   */
  @JsonProperty("timePeriodSeconds")
  @Override
  int timePeriodSeconds() {
    return timePeriodSeconds;
  }

  /**
   * @return The value of the {@code minTransactionCount} attribute
   */
  @JsonProperty("minTransactionCount")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @Override
  long minTransactionCount() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.minTransactionCount()
        : this.minTransactionCount;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AlertConfigJsonService.AlertConfigDto.MetricConditionDto#metric() metric} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for metric
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMetricConditionDto withMetric(String value) {
    if (this.metric.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "metric");
    return new ImmutableMetricConditionDto(
        newValue,
        this.transactionType,
        this.transactionName,
        this.percentile,
        this.threshold,
        this.lowerBoundThreshold,
        this.timePeriodSeconds,
        this.minTransactionCount);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AlertConfigJsonService.AlertConfigDto.MetricConditionDto#transactionType() transactionType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for transactionType (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMetricConditionDto withTransactionType(@Nullable String value) {
    if (Objects.equal(this.transactionType, value)) return this;
    return new ImmutableMetricConditionDto(
        this.metric,
        value,
        this.transactionName,
        this.percentile,
        this.threshold,
        this.lowerBoundThreshold,
        this.timePeriodSeconds,
        this.minTransactionCount);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AlertConfigJsonService.AlertConfigDto.MetricConditionDto#transactionName() transactionName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for transactionName (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMetricConditionDto withTransactionName(@Nullable String value) {
    if (Objects.equal(this.transactionName, value)) return this;
    return new ImmutableMetricConditionDto(
        this.metric,
        this.transactionType,
        value,
        this.percentile,
        this.threshold,
        this.lowerBoundThreshold,
        this.timePeriodSeconds,
        this.minTransactionCount);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AlertConfigJsonService.AlertConfigDto.MetricConditionDto#percentile() percentile} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for percentile (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMetricConditionDto withPercentile(@Nullable Double value) {
    if (Objects.equal(this.percentile, value)) return this;
    return new ImmutableMetricConditionDto(
        this.metric,
        this.transactionType,
        this.transactionName,
        value,
        this.threshold,
        this.lowerBoundThreshold,
        this.timePeriodSeconds,
        this.minTransactionCount);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AlertConfigJsonService.AlertConfigDto.MetricConditionDto#threshold() threshold} attribute.
   * A value strict bits equality used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for threshold
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMetricConditionDto withThreshold(double value) {
    if (Double.doubleToLongBits(this.threshold) == Double.doubleToLongBits(value)) return this;
    return new ImmutableMetricConditionDto(
        this.metric,
        this.transactionType,
        this.transactionName,
        this.percentile,
        value,
        this.lowerBoundThreshold,
        this.timePeriodSeconds,
        this.minTransactionCount);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AlertConfigJsonService.AlertConfigDto.MetricConditionDto#lowerBoundThreshold() lowerBoundThreshold} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lowerBoundThreshold
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMetricConditionDto withLowerBoundThreshold(boolean value) {
    if (this.lowerBoundThreshold == value) return this;
    return new ImmutableMetricConditionDto(
        this.metric,
        this.transactionType,
        this.transactionName,
        this.percentile,
        this.threshold,
        value,
        this.timePeriodSeconds,
        this.minTransactionCount);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AlertConfigJsonService.AlertConfigDto.MetricConditionDto#timePeriodSeconds() timePeriodSeconds} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for timePeriodSeconds
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMetricConditionDto withTimePeriodSeconds(int value) {
    if (this.timePeriodSeconds == value) return this;
    return new ImmutableMetricConditionDto(
        this.metric,
        this.transactionType,
        this.transactionName,
        this.percentile,
        this.threshold,
        this.lowerBoundThreshold,
        value,
        this.minTransactionCount);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AlertConfigJsonService.AlertConfigDto.MetricConditionDto#minTransactionCount() minTransactionCount} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for minTransactionCount
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMetricConditionDto withMinTransactionCount(long value) {
    if (this.minTransactionCount == value) return this;
    return new ImmutableMetricConditionDto(
        this.metric,
        this.transactionType,
        this.transactionName,
        this.percentile,
        this.threshold,
        this.lowerBoundThreshold,
        this.timePeriodSeconds,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMetricConditionDto} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMetricConditionDto
        && equalTo((ImmutableMetricConditionDto) another);
  }

  private boolean equalTo(ImmutableMetricConditionDto another) {
    return metric.equals(another.metric)
        && Objects.equal(transactionType, another.transactionType)
        && Objects.equal(transactionName, another.transactionName)
        && Objects.equal(percentile, another.percentile)
        && Double.doubleToLongBits(threshold) == Double.doubleToLongBits(another.threshold)
        && lowerBoundThreshold == another.lowerBoundThreshold
        && timePeriodSeconds == another.timePeriodSeconds
        && minTransactionCount == another.minTransactionCount;
  }

  /**
   * Computes a hash code from attributes: {@code metric}, {@code transactionType}, {@code transactionName}, {@code percentile}, {@code threshold}, {@code lowerBoundThreshold}, {@code timePeriodSeconds}, {@code minTransactionCount}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + metric.hashCode();
    h += (h << 5) + Objects.hashCode(transactionType);
    h += (h << 5) + Objects.hashCode(transactionName);
    h += (h << 5) + Objects.hashCode(percentile);
    h += (h << 5) + Doubles.hashCode(threshold);
    h += (h << 5) + Booleans.hashCode(lowerBoundThreshold);
    h += (h << 5) + timePeriodSeconds;
    h += (h << 5) + Longs.hashCode(minTransactionCount);
    return h;
  }

  /**
   * Prints the immutable value {@code MetricConditionDto} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("MetricConditionDto")
        .omitNullValues()
        .add("metric", metric)
        .add("transactionType", transactionType)
        .add("transactionName", transactionName)
        .add("percentile", percentile)
        .add("threshold", threshold)
        .add("lowerBoundThreshold", lowerBoundThreshold)
        .add("timePeriodSeconds", timePeriodSeconds)
        .add("minTransactionCount", minTransactionCount)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonTypeInfo(use=JsonTypeInfo.Id.NONE)
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends AlertConfigJsonService.AlertConfigDto.MetricConditionDto {
    @Nullable String metric;
    @Nullable String transactionType;
    @Nullable String transactionName;
    @Nullable Double percentile;
    double threshold;
    boolean thresholdIsSet;
    boolean lowerBoundThreshold;
    boolean lowerBoundThresholdIsSet;
    int timePeriodSeconds;
    boolean timePeriodSecondsIsSet;
    long minTransactionCount;
    boolean minTransactionCountIsSet;
    @JsonProperty("metric")
    public void setMetric(String metric) {
      this.metric = metric;
    }
    @JsonProperty("transactionType")
    public void setTransactionType(@Nullable String transactionType) {
      this.transactionType = transactionType;
    }
    @JsonProperty("transactionName")
    public void setTransactionName(@Nullable String transactionName) {
      this.transactionName = transactionName;
    }
    @JsonProperty("percentile")
    public void setPercentile(@Nullable Double percentile) {
      this.percentile = percentile;
    }
    @JsonProperty("threshold")
    public void setThreshold(double threshold) {
      this.threshold = threshold;
      this.thresholdIsSet = true;
    }
    @JsonProperty("lowerBoundThreshold")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public void setLowerBoundThreshold(boolean lowerBoundThreshold) {
      this.lowerBoundThreshold = lowerBoundThreshold;
      this.lowerBoundThresholdIsSet = true;
    }
    @JsonProperty("timePeriodSeconds")
    public void setTimePeriodSeconds(int timePeriodSeconds) {
      this.timePeriodSeconds = timePeriodSeconds;
      this.timePeriodSecondsIsSet = true;
    }
    @JsonProperty("minTransactionCount")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public void setMinTransactionCount(long minTransactionCount) {
      this.minTransactionCount = minTransactionCount;
      this.minTransactionCountIsSet = true;
    }
    @Override
    String metric() { throw new UnsupportedOperationException(); }
    @Override
    String transactionType() { throw new UnsupportedOperationException(); }
    @Override
    String transactionName() { throw new UnsupportedOperationException(); }
    @Override
    Double percentile() { throw new UnsupportedOperationException(); }
    @Override
    double threshold() { throw new UnsupportedOperationException(); }
    @Override
    boolean lowerBoundThreshold() { throw new UnsupportedOperationException(); }
    @Override
    int timePeriodSeconds() { throw new UnsupportedOperationException(); }
    @Override
    long minTransactionCount() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableMetricConditionDto fromJson(Json json) {
    ImmutableMetricConditionDto.Builder builder = ImmutableMetricConditionDto.builder();
    if (json.metric != null) {
      builder.metric(json.metric);
    }
    if (json.transactionType != null) {
      builder.transactionType(json.transactionType);
    }
    if (json.transactionName != null) {
      builder.transactionName(json.transactionName);
    }
    if (json.percentile != null) {
      builder.percentile(json.percentile);
    }
    if (json.thresholdIsSet) {
      builder.threshold(json.threshold);
    }
    if (json.lowerBoundThresholdIsSet) {
      builder.lowerBoundThreshold(json.lowerBoundThreshold);
    }
    if (json.timePeriodSecondsIsSet) {
      builder.timePeriodSeconds(json.timePeriodSeconds);
    }
    if (json.minTransactionCountIsSet) {
      builder.minTransactionCount(json.minTransactionCount);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link AlertConfigJsonService.AlertConfigDto.MetricConditionDto} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MetricConditionDto instance
   */
  public static ImmutableMetricConditionDto copyOf(AlertConfigJsonService.AlertConfigDto.MetricConditionDto instance) {
    if (instance instanceof ImmutableMetricConditionDto) {
      return (ImmutableMetricConditionDto) instance;
    }
    return ImmutableMetricConditionDto.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableMetricConditionDto ImmutableMetricConditionDto}.
   * @return A new ImmutableMetricConditionDto builder
   */
  public static ImmutableMetricConditionDto.Builder builder() {
    return new ImmutableMetricConditionDto.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableMetricConditionDto ImmutableMetricConditionDto}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_METRIC = 0x1L;
    private static final long INIT_BIT_THRESHOLD = 0x2L;
    private static final long INIT_BIT_TIME_PERIOD_SECONDS = 0x4L;
    private static final long OPT_BIT_LOWER_BOUND_THRESHOLD = 0x1L;
    private static final long OPT_BIT_MIN_TRANSACTION_COUNT = 0x2L;
    private long initBits = 0x7L;
    private long optBits;

    private @Nullable String metric;
    private @Nullable String transactionType;
    private @Nullable String transactionName;
    private @Nullable Double percentile;
    private double threshold;
    private boolean lowerBoundThreshold;
    private int timePeriodSeconds;
    private long minTransactionCount;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code MetricConditionDto} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(AlertConfigJsonService.AlertConfigDto.MetricConditionDto instance) {
      Preconditions.checkNotNull(instance, "instance");
      metric(instance.metric());
      @Nullable String transactionTypeValue = instance.transactionType();
      if (transactionTypeValue != null) {
        transactionType(transactionTypeValue);
      }
      @Nullable String transactionNameValue = instance.transactionName();
      if (transactionNameValue != null) {
        transactionName(transactionNameValue);
      }
      @Nullable Double percentileValue = instance.percentile();
      if (percentileValue != null) {
        percentile(percentileValue);
      }
      threshold(instance.threshold());
      lowerBoundThreshold(instance.lowerBoundThreshold());
      timePeriodSeconds(instance.timePeriodSeconds());
      minTransactionCount(instance.minTransactionCount());
      return this;
    }

    /**
     * Initializes the value for the {@link AlertConfigJsonService.AlertConfigDto.MetricConditionDto#metric() metric} attribute.
     * @param metric The value for metric 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder metric(String metric) {
      this.metric = Preconditions.checkNotNull(metric, "metric");
      initBits &= ~INIT_BIT_METRIC;
      return this;
    }

    /**
     * Initializes the value for the {@link AlertConfigJsonService.AlertConfigDto.MetricConditionDto#transactionType() transactionType} attribute.
     * @param transactionType The value for transactionType (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder transactionType(@Nullable String transactionType) {
      this.transactionType = transactionType;
      return this;
    }

    /**
     * Initializes the value for the {@link AlertConfigJsonService.AlertConfigDto.MetricConditionDto#transactionName() transactionName} attribute.
     * @param transactionName The value for transactionName (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder transactionName(@Nullable String transactionName) {
      this.transactionName = transactionName;
      return this;
    }

    /**
     * Initializes the value for the {@link AlertConfigJsonService.AlertConfigDto.MetricConditionDto#percentile() percentile} attribute.
     * @param percentile The value for percentile (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder percentile(@Nullable Double percentile) {
      this.percentile = percentile;
      return this;
    }

    /**
     * Initializes the value for the {@link AlertConfigJsonService.AlertConfigDto.MetricConditionDto#threshold() threshold} attribute.
     * @param threshold The value for threshold 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder threshold(double threshold) {
      this.threshold = threshold;
      initBits &= ~INIT_BIT_THRESHOLD;
      return this;
    }

    /**
     * Initializes the value for the {@link AlertConfigJsonService.AlertConfigDto.MetricConditionDto#lowerBoundThreshold() lowerBoundThreshold} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link AlertConfigJsonService.AlertConfigDto.MetricConditionDto#lowerBoundThreshold() lowerBoundThreshold}.</em>
     * @param lowerBoundThreshold The value for lowerBoundThreshold 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder lowerBoundThreshold(boolean lowerBoundThreshold) {
      this.lowerBoundThreshold = lowerBoundThreshold;
      optBits |= OPT_BIT_LOWER_BOUND_THRESHOLD;
      return this;
    }

    /**
     * Initializes the value for the {@link AlertConfigJsonService.AlertConfigDto.MetricConditionDto#timePeriodSeconds() timePeriodSeconds} attribute.
     * @param timePeriodSeconds The value for timePeriodSeconds 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder timePeriodSeconds(int timePeriodSeconds) {
      this.timePeriodSeconds = timePeriodSeconds;
      initBits &= ~INIT_BIT_TIME_PERIOD_SECONDS;
      return this;
    }

    /**
     * Initializes the value for the {@link AlertConfigJsonService.AlertConfigDto.MetricConditionDto#minTransactionCount() minTransactionCount} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link AlertConfigJsonService.AlertConfigDto.MetricConditionDto#minTransactionCount() minTransactionCount}.</em>
     * @param minTransactionCount The value for minTransactionCount 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder minTransactionCount(long minTransactionCount) {
      this.minTransactionCount = minTransactionCount;
      optBits |= OPT_BIT_MIN_TRANSACTION_COUNT;
      return this;
    }

    /**
     * Builds a new {@link ImmutableMetricConditionDto ImmutableMetricConditionDto}.
     * @return An immutable instance of MetricConditionDto
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableMetricConditionDto build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableMetricConditionDto(this);
    }

    private boolean lowerBoundThresholdIsSet() {
      return (optBits & OPT_BIT_LOWER_BOUND_THRESHOLD) != 0;
    }

    private boolean minTransactionCountIsSet() {
      return (optBits & OPT_BIT_MIN_TRANSACTION_COUNT) != 0;
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_METRIC) != 0) attributes.add("metric");
      if ((initBits & INIT_BIT_THRESHOLD) != 0) attributes.add("threshold");
      if ((initBits & INIT_BIT_TIME_PERIOD_SECONDS) != 0) attributes.add("timePeriodSeconds");
      return "Cannot build MetricConditionDto, some of required attributes are not set " + attributes;
    }
  }
}
