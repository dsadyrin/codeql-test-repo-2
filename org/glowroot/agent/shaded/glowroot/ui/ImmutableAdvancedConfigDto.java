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
 * Immutable implementation of {@link ConfigJsonService.AdvancedConfigDto}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAdvancedConfigDto.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "ConfigJsonService.AdvancedConfigDto"})
@Immutable
final class ImmutableAdvancedConfigDto extends ConfigJsonService.AdvancedConfigDto {
  private final @Nullable Boolean weavingTimer;
  private final @Nullable Integer immediatePartialStoreThresholdSeconds;
  private final @Nullable Integer maxAggregateTransactionsPerType;
  private final int maxAggregateQueriesPerType;
  private final int maxAggregateServiceCallsPerType;
  private final @Nullable Integer maxTraceEntriesPerTransaction;
  private final @Nullable Integer maxStackTraceSamplesPerTransaction;
  private final @Nullable Integer mbeanGaugeNotFoundDelaySeconds;
  private final String version;

  private ImmutableAdvancedConfigDto(
      @Nullable Boolean weavingTimer,
      @Nullable Integer immediatePartialStoreThresholdSeconds,
      @Nullable Integer maxAggregateTransactionsPerType,
      int maxAggregateQueriesPerType,
      int maxAggregateServiceCallsPerType,
      @Nullable Integer maxTraceEntriesPerTransaction,
      @Nullable Integer maxStackTraceSamplesPerTransaction,
      @Nullable Integer mbeanGaugeNotFoundDelaySeconds,
      String version) {
    this.weavingTimer = weavingTimer;
    this.immediatePartialStoreThresholdSeconds = immediatePartialStoreThresholdSeconds;
    this.maxAggregateTransactionsPerType = maxAggregateTransactionsPerType;
    this.maxAggregateQueriesPerType = maxAggregateQueriesPerType;
    this.maxAggregateServiceCallsPerType = maxAggregateServiceCallsPerType;
    this.maxTraceEntriesPerTransaction = maxTraceEntriesPerTransaction;
    this.maxStackTraceSamplesPerTransaction = maxStackTraceSamplesPerTransaction;
    this.mbeanGaugeNotFoundDelaySeconds = mbeanGaugeNotFoundDelaySeconds;
    this.version = version;
  }

  /**
   * @return The value of the {@code weavingTimer} attribute
   */
  @JsonProperty("weavingTimer")
  @Override
  @Nullable Boolean weavingTimer() {
    return weavingTimer;
  }

  /**
   * @return The value of the {@code immediatePartialStoreThresholdSeconds} attribute
   */
  @JsonProperty("immediatePartialStoreThresholdSeconds")
  @Override
  @Nullable Integer immediatePartialStoreThresholdSeconds() {
    return immediatePartialStoreThresholdSeconds;
  }

  /**
   * @return The value of the {@code maxAggregateTransactionsPerType} attribute
   */
  @JsonProperty("maxAggregateTransactionsPerType")
  @Override
  @Nullable Integer maxAggregateTransactionsPerType() {
    return maxAggregateTransactionsPerType;
  }

  /**
   * @return The value of the {@code maxAggregateQueriesPerType} attribute
   */
  @JsonProperty("maxAggregateQueriesPerType")
  @Override
  int maxAggregateQueriesPerType() {
    return maxAggregateQueriesPerType;
  }

  /**
   * @return The value of the {@code maxAggregateServiceCallsPerType} attribute
   */
  @JsonProperty("maxAggregateServiceCallsPerType")
  @Override
  int maxAggregateServiceCallsPerType() {
    return maxAggregateServiceCallsPerType;
  }

  /**
   * @return The value of the {@code maxTraceEntriesPerTransaction} attribute
   */
  @JsonProperty("maxTraceEntriesPerTransaction")
  @Override
  @Nullable Integer maxTraceEntriesPerTransaction() {
    return maxTraceEntriesPerTransaction;
  }

  /**
   * @return The value of the {@code maxStackTraceSamplesPerTransaction} attribute
   */
  @JsonProperty("maxStackTraceSamplesPerTransaction")
  @Override
  @Nullable Integer maxStackTraceSamplesPerTransaction() {
    return maxStackTraceSamplesPerTransaction;
  }

  /**
   * @return The value of the {@code mbeanGaugeNotFoundDelaySeconds} attribute
   */
  @JsonProperty("mbeanGaugeNotFoundDelaySeconds")
  @Override
  @Nullable Integer mbeanGaugeNotFoundDelaySeconds() {
    return mbeanGaugeNotFoundDelaySeconds;
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
   * Copy the current immutable object by setting a value for the {@link ConfigJsonService.AdvancedConfigDto#weavingTimer() weavingTimer} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for weavingTimer (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAdvancedConfigDto withWeavingTimer(@Nullable Boolean value) {
    if (Objects.equal(this.weavingTimer, value)) return this;
    return new ImmutableAdvancedConfigDto(
        value,
        this.immediatePartialStoreThresholdSeconds,
        this.maxAggregateTransactionsPerType,
        this.maxAggregateQueriesPerType,
        this.maxAggregateServiceCallsPerType,
        this.maxTraceEntriesPerTransaction,
        this.maxStackTraceSamplesPerTransaction,
        this.mbeanGaugeNotFoundDelaySeconds,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ConfigJsonService.AdvancedConfigDto#immediatePartialStoreThresholdSeconds() immediatePartialStoreThresholdSeconds} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for immediatePartialStoreThresholdSeconds (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAdvancedConfigDto withImmediatePartialStoreThresholdSeconds(@Nullable Integer value) {
    if (Objects.equal(this.immediatePartialStoreThresholdSeconds, value)) return this;
    return new ImmutableAdvancedConfigDto(
        this.weavingTimer,
        value,
        this.maxAggregateTransactionsPerType,
        this.maxAggregateQueriesPerType,
        this.maxAggregateServiceCallsPerType,
        this.maxTraceEntriesPerTransaction,
        this.maxStackTraceSamplesPerTransaction,
        this.mbeanGaugeNotFoundDelaySeconds,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ConfigJsonService.AdvancedConfigDto#maxAggregateTransactionsPerType() maxAggregateTransactionsPerType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for maxAggregateTransactionsPerType (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAdvancedConfigDto withMaxAggregateTransactionsPerType(@Nullable Integer value) {
    if (Objects.equal(this.maxAggregateTransactionsPerType, value)) return this;
    return new ImmutableAdvancedConfigDto(
        this.weavingTimer,
        this.immediatePartialStoreThresholdSeconds,
        value,
        this.maxAggregateQueriesPerType,
        this.maxAggregateServiceCallsPerType,
        this.maxTraceEntriesPerTransaction,
        this.maxStackTraceSamplesPerTransaction,
        this.mbeanGaugeNotFoundDelaySeconds,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ConfigJsonService.AdvancedConfigDto#maxAggregateQueriesPerType() maxAggregateQueriesPerType} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for maxAggregateQueriesPerType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAdvancedConfigDto withMaxAggregateQueriesPerType(int value) {
    if (this.maxAggregateQueriesPerType == value) return this;
    return new ImmutableAdvancedConfigDto(
        this.weavingTimer,
        this.immediatePartialStoreThresholdSeconds,
        this.maxAggregateTransactionsPerType,
        value,
        this.maxAggregateServiceCallsPerType,
        this.maxTraceEntriesPerTransaction,
        this.maxStackTraceSamplesPerTransaction,
        this.mbeanGaugeNotFoundDelaySeconds,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ConfigJsonService.AdvancedConfigDto#maxAggregateServiceCallsPerType() maxAggregateServiceCallsPerType} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for maxAggregateServiceCallsPerType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAdvancedConfigDto withMaxAggregateServiceCallsPerType(int value) {
    if (this.maxAggregateServiceCallsPerType == value) return this;
    return new ImmutableAdvancedConfigDto(
        this.weavingTimer,
        this.immediatePartialStoreThresholdSeconds,
        this.maxAggregateTransactionsPerType,
        this.maxAggregateQueriesPerType,
        value,
        this.maxTraceEntriesPerTransaction,
        this.maxStackTraceSamplesPerTransaction,
        this.mbeanGaugeNotFoundDelaySeconds,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ConfigJsonService.AdvancedConfigDto#maxTraceEntriesPerTransaction() maxTraceEntriesPerTransaction} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for maxTraceEntriesPerTransaction (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAdvancedConfigDto withMaxTraceEntriesPerTransaction(@Nullable Integer value) {
    if (Objects.equal(this.maxTraceEntriesPerTransaction, value)) return this;
    return new ImmutableAdvancedConfigDto(
        this.weavingTimer,
        this.immediatePartialStoreThresholdSeconds,
        this.maxAggregateTransactionsPerType,
        this.maxAggregateQueriesPerType,
        this.maxAggregateServiceCallsPerType,
        value,
        this.maxStackTraceSamplesPerTransaction,
        this.mbeanGaugeNotFoundDelaySeconds,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ConfigJsonService.AdvancedConfigDto#maxStackTraceSamplesPerTransaction() maxStackTraceSamplesPerTransaction} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for maxStackTraceSamplesPerTransaction (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAdvancedConfigDto withMaxStackTraceSamplesPerTransaction(@Nullable Integer value) {
    if (Objects.equal(this.maxStackTraceSamplesPerTransaction, value)) return this;
    return new ImmutableAdvancedConfigDto(
        this.weavingTimer,
        this.immediatePartialStoreThresholdSeconds,
        this.maxAggregateTransactionsPerType,
        this.maxAggregateQueriesPerType,
        this.maxAggregateServiceCallsPerType,
        this.maxTraceEntriesPerTransaction,
        value,
        this.mbeanGaugeNotFoundDelaySeconds,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ConfigJsonService.AdvancedConfigDto#mbeanGaugeNotFoundDelaySeconds() mbeanGaugeNotFoundDelaySeconds} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for mbeanGaugeNotFoundDelaySeconds (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAdvancedConfigDto withMbeanGaugeNotFoundDelaySeconds(@Nullable Integer value) {
    if (Objects.equal(this.mbeanGaugeNotFoundDelaySeconds, value)) return this;
    return new ImmutableAdvancedConfigDto(
        this.weavingTimer,
        this.immediatePartialStoreThresholdSeconds,
        this.maxAggregateTransactionsPerType,
        this.maxAggregateQueriesPerType,
        this.maxAggregateServiceCallsPerType,
        this.maxTraceEntriesPerTransaction,
        this.maxStackTraceSamplesPerTransaction,
        value,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ConfigJsonService.AdvancedConfigDto#version() version} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for version
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAdvancedConfigDto withVersion(String value) {
    if (this.version.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "version");
    return new ImmutableAdvancedConfigDto(
        this.weavingTimer,
        this.immediatePartialStoreThresholdSeconds,
        this.maxAggregateTransactionsPerType,
        this.maxAggregateQueriesPerType,
        this.maxAggregateServiceCallsPerType,
        this.maxTraceEntriesPerTransaction,
        this.maxStackTraceSamplesPerTransaction,
        this.mbeanGaugeNotFoundDelaySeconds,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAdvancedConfigDto} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAdvancedConfigDto
        && equalTo((ImmutableAdvancedConfigDto) another);
  }

  private boolean equalTo(ImmutableAdvancedConfigDto another) {
    return Objects.equal(weavingTimer, another.weavingTimer)
        && Objects.equal(immediatePartialStoreThresholdSeconds, another.immediatePartialStoreThresholdSeconds)
        && Objects.equal(maxAggregateTransactionsPerType, another.maxAggregateTransactionsPerType)
        && maxAggregateQueriesPerType == another.maxAggregateQueriesPerType
        && maxAggregateServiceCallsPerType == another.maxAggregateServiceCallsPerType
        && Objects.equal(maxTraceEntriesPerTransaction, another.maxTraceEntriesPerTransaction)
        && Objects.equal(maxStackTraceSamplesPerTransaction, another.maxStackTraceSamplesPerTransaction)
        && Objects.equal(mbeanGaugeNotFoundDelaySeconds, another.mbeanGaugeNotFoundDelaySeconds)
        && version.equals(another.version);
  }

  /**
   * Computes a hash code from attributes: {@code weavingTimer}, {@code immediatePartialStoreThresholdSeconds}, {@code maxAggregateTransactionsPerType}, {@code maxAggregateQueriesPerType}, {@code maxAggregateServiceCallsPerType}, {@code maxTraceEntriesPerTransaction}, {@code maxStackTraceSamplesPerTransaction}, {@code mbeanGaugeNotFoundDelaySeconds}, {@code version}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(weavingTimer);
    h += (h << 5) + Objects.hashCode(immediatePartialStoreThresholdSeconds);
    h += (h << 5) + Objects.hashCode(maxAggregateTransactionsPerType);
    h += (h << 5) + maxAggregateQueriesPerType;
    h += (h << 5) + maxAggregateServiceCallsPerType;
    h += (h << 5) + Objects.hashCode(maxTraceEntriesPerTransaction);
    h += (h << 5) + Objects.hashCode(maxStackTraceSamplesPerTransaction);
    h += (h << 5) + Objects.hashCode(mbeanGaugeNotFoundDelaySeconds);
    h += (h << 5) + version.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code AdvancedConfigDto} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("AdvancedConfigDto")
        .omitNullValues()
        .add("weavingTimer", weavingTimer)
        .add("immediatePartialStoreThresholdSeconds", immediatePartialStoreThresholdSeconds)
        .add("maxAggregateTransactionsPerType", maxAggregateTransactionsPerType)
        .add("maxAggregateQueriesPerType", maxAggregateQueriesPerType)
        .add("maxAggregateServiceCallsPerType", maxAggregateServiceCallsPerType)
        .add("maxTraceEntriesPerTransaction", maxTraceEntriesPerTransaction)
        .add("maxStackTraceSamplesPerTransaction", maxStackTraceSamplesPerTransaction)
        .add("mbeanGaugeNotFoundDelaySeconds", mbeanGaugeNotFoundDelaySeconds)
        .add("version", version)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends ConfigJsonService.AdvancedConfigDto {
    @Nullable Boolean weavingTimer;
    @Nullable Integer immediatePartialStoreThresholdSeconds;
    @Nullable Integer maxAggregateTransactionsPerType;
    int maxAggregateQueriesPerType;
    boolean maxAggregateQueriesPerTypeIsSet;
    int maxAggregateServiceCallsPerType;
    boolean maxAggregateServiceCallsPerTypeIsSet;
    @Nullable Integer maxTraceEntriesPerTransaction;
    @Nullable Integer maxStackTraceSamplesPerTransaction;
    @Nullable Integer mbeanGaugeNotFoundDelaySeconds;
    @Nullable String version;
    @JsonProperty("weavingTimer")
    public void setWeavingTimer(@Nullable Boolean weavingTimer) {
      this.weavingTimer = weavingTimer;
    }
    @JsonProperty("immediatePartialStoreThresholdSeconds")
    public void setImmediatePartialStoreThresholdSeconds(@Nullable Integer immediatePartialStoreThresholdSeconds) {
      this.immediatePartialStoreThresholdSeconds = immediatePartialStoreThresholdSeconds;
    }
    @JsonProperty("maxAggregateTransactionsPerType")
    public void setMaxAggregateTransactionsPerType(@Nullable Integer maxAggregateTransactionsPerType) {
      this.maxAggregateTransactionsPerType = maxAggregateTransactionsPerType;
    }
    @JsonProperty("maxAggregateQueriesPerType")
    public void setMaxAggregateQueriesPerType(int maxAggregateQueriesPerType) {
      this.maxAggregateQueriesPerType = maxAggregateQueriesPerType;
      this.maxAggregateQueriesPerTypeIsSet = true;
    }
    @JsonProperty("maxAggregateServiceCallsPerType")
    public void setMaxAggregateServiceCallsPerType(int maxAggregateServiceCallsPerType) {
      this.maxAggregateServiceCallsPerType = maxAggregateServiceCallsPerType;
      this.maxAggregateServiceCallsPerTypeIsSet = true;
    }
    @JsonProperty("maxTraceEntriesPerTransaction")
    public void setMaxTraceEntriesPerTransaction(@Nullable Integer maxTraceEntriesPerTransaction) {
      this.maxTraceEntriesPerTransaction = maxTraceEntriesPerTransaction;
    }
    @JsonProperty("maxStackTraceSamplesPerTransaction")
    public void setMaxStackTraceSamplesPerTransaction(@Nullable Integer maxStackTraceSamplesPerTransaction) {
      this.maxStackTraceSamplesPerTransaction = maxStackTraceSamplesPerTransaction;
    }
    @JsonProperty("mbeanGaugeNotFoundDelaySeconds")
    public void setMbeanGaugeNotFoundDelaySeconds(@Nullable Integer mbeanGaugeNotFoundDelaySeconds) {
      this.mbeanGaugeNotFoundDelaySeconds = mbeanGaugeNotFoundDelaySeconds;
    }
    @JsonProperty("version")
    public void setVersion(String version) {
      this.version = version;
    }
    @Override
    Boolean weavingTimer() { throw new UnsupportedOperationException(); }
    @Override
    Integer immediatePartialStoreThresholdSeconds() { throw new UnsupportedOperationException(); }
    @Override
    Integer maxAggregateTransactionsPerType() { throw new UnsupportedOperationException(); }
    @Override
    int maxAggregateQueriesPerType() { throw new UnsupportedOperationException(); }
    @Override
    int maxAggregateServiceCallsPerType() { throw new UnsupportedOperationException(); }
    @Override
    Integer maxTraceEntriesPerTransaction() { throw new UnsupportedOperationException(); }
    @Override
    Integer maxStackTraceSamplesPerTransaction() { throw new UnsupportedOperationException(); }
    @Override
    Integer mbeanGaugeNotFoundDelaySeconds() { throw new UnsupportedOperationException(); }
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
  static ImmutableAdvancedConfigDto fromJson(Json json) {
    ImmutableAdvancedConfigDto.Builder builder = ImmutableAdvancedConfigDto.builder();
    if (json.weavingTimer != null) {
      builder.weavingTimer(json.weavingTimer);
    }
    if (json.immediatePartialStoreThresholdSeconds != null) {
      builder.immediatePartialStoreThresholdSeconds(json.immediatePartialStoreThresholdSeconds);
    }
    if (json.maxAggregateTransactionsPerType != null) {
      builder.maxAggregateTransactionsPerType(json.maxAggregateTransactionsPerType);
    }
    if (json.maxAggregateQueriesPerTypeIsSet) {
      builder.maxAggregateQueriesPerType(json.maxAggregateQueriesPerType);
    }
    if (json.maxAggregateServiceCallsPerTypeIsSet) {
      builder.maxAggregateServiceCallsPerType(json.maxAggregateServiceCallsPerType);
    }
    if (json.maxTraceEntriesPerTransaction != null) {
      builder.maxTraceEntriesPerTransaction(json.maxTraceEntriesPerTransaction);
    }
    if (json.maxStackTraceSamplesPerTransaction != null) {
      builder.maxStackTraceSamplesPerTransaction(json.maxStackTraceSamplesPerTransaction);
    }
    if (json.mbeanGaugeNotFoundDelaySeconds != null) {
      builder.mbeanGaugeNotFoundDelaySeconds(json.mbeanGaugeNotFoundDelaySeconds);
    }
    if (json.version != null) {
      builder.version(json.version);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ConfigJsonService.AdvancedConfigDto} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable AdvancedConfigDto instance
   */
  public static ImmutableAdvancedConfigDto copyOf(ConfigJsonService.AdvancedConfigDto instance) {
    if (instance instanceof ImmutableAdvancedConfigDto) {
      return (ImmutableAdvancedConfigDto) instance;
    }
    return ImmutableAdvancedConfigDto.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableAdvancedConfigDto ImmutableAdvancedConfigDto}.
   * @return A new ImmutableAdvancedConfigDto builder
   */
  public static ImmutableAdvancedConfigDto.Builder builder() {
    return new ImmutableAdvancedConfigDto.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableAdvancedConfigDto ImmutableAdvancedConfigDto}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_MAX_AGGREGATE_QUERIES_PER_TYPE = 0x1L;
    private static final long INIT_BIT_MAX_AGGREGATE_SERVICE_CALLS_PER_TYPE = 0x2L;
    private static final long INIT_BIT_VERSION = 0x4L;
    private long initBits = 0x7L;

    private @Nullable Boolean weavingTimer;
    private @Nullable Integer immediatePartialStoreThresholdSeconds;
    private @Nullable Integer maxAggregateTransactionsPerType;
    private int maxAggregateQueriesPerType;
    private int maxAggregateServiceCallsPerType;
    private @Nullable Integer maxTraceEntriesPerTransaction;
    private @Nullable Integer maxStackTraceSamplesPerTransaction;
    private @Nullable Integer mbeanGaugeNotFoundDelaySeconds;
    private @Nullable String version;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code AdvancedConfigDto} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(ConfigJsonService.AdvancedConfigDto instance) {
      Preconditions.checkNotNull(instance, "instance");
      @Nullable Boolean weavingTimerValue = instance.weavingTimer();
      if (weavingTimerValue != null) {
        weavingTimer(weavingTimerValue);
      }
      @Nullable Integer immediatePartialStoreThresholdSecondsValue = instance.immediatePartialStoreThresholdSeconds();
      if (immediatePartialStoreThresholdSecondsValue != null) {
        immediatePartialStoreThresholdSeconds(immediatePartialStoreThresholdSecondsValue);
      }
      @Nullable Integer maxAggregateTransactionsPerTypeValue = instance.maxAggregateTransactionsPerType();
      if (maxAggregateTransactionsPerTypeValue != null) {
        maxAggregateTransactionsPerType(maxAggregateTransactionsPerTypeValue);
      }
      maxAggregateQueriesPerType(instance.maxAggregateQueriesPerType());
      maxAggregateServiceCallsPerType(instance.maxAggregateServiceCallsPerType());
      @Nullable Integer maxTraceEntriesPerTransactionValue = instance.maxTraceEntriesPerTransaction();
      if (maxTraceEntriesPerTransactionValue != null) {
        maxTraceEntriesPerTransaction(maxTraceEntriesPerTransactionValue);
      }
      @Nullable Integer maxStackTraceSamplesPerTransactionValue = instance.maxStackTraceSamplesPerTransaction();
      if (maxStackTraceSamplesPerTransactionValue != null) {
        maxStackTraceSamplesPerTransaction(maxStackTraceSamplesPerTransactionValue);
      }
      @Nullable Integer mbeanGaugeNotFoundDelaySecondsValue = instance.mbeanGaugeNotFoundDelaySeconds();
      if (mbeanGaugeNotFoundDelaySecondsValue != null) {
        mbeanGaugeNotFoundDelaySeconds(mbeanGaugeNotFoundDelaySecondsValue);
      }
      version(instance.version());
      return this;
    }

    /**
     * Initializes the value for the {@link ConfigJsonService.AdvancedConfigDto#weavingTimer() weavingTimer} attribute.
     * @param weavingTimer The value for weavingTimer (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder weavingTimer(@Nullable Boolean weavingTimer) {
      this.weavingTimer = weavingTimer;
      return this;
    }

    /**
     * Initializes the value for the {@link ConfigJsonService.AdvancedConfigDto#immediatePartialStoreThresholdSeconds() immediatePartialStoreThresholdSeconds} attribute.
     * @param immediatePartialStoreThresholdSeconds The value for immediatePartialStoreThresholdSeconds (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder immediatePartialStoreThresholdSeconds(@Nullable Integer immediatePartialStoreThresholdSeconds) {
      this.immediatePartialStoreThresholdSeconds = immediatePartialStoreThresholdSeconds;
      return this;
    }

    /**
     * Initializes the value for the {@link ConfigJsonService.AdvancedConfigDto#maxAggregateTransactionsPerType() maxAggregateTransactionsPerType} attribute.
     * @param maxAggregateTransactionsPerType The value for maxAggregateTransactionsPerType (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder maxAggregateTransactionsPerType(@Nullable Integer maxAggregateTransactionsPerType) {
      this.maxAggregateTransactionsPerType = maxAggregateTransactionsPerType;
      return this;
    }

    /**
     * Initializes the value for the {@link ConfigJsonService.AdvancedConfigDto#maxAggregateQueriesPerType() maxAggregateQueriesPerType} attribute.
     * @param maxAggregateQueriesPerType The value for maxAggregateQueriesPerType 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder maxAggregateQueriesPerType(int maxAggregateQueriesPerType) {
      this.maxAggregateQueriesPerType = maxAggregateQueriesPerType;
      initBits &= ~INIT_BIT_MAX_AGGREGATE_QUERIES_PER_TYPE;
      return this;
    }

    /**
     * Initializes the value for the {@link ConfigJsonService.AdvancedConfigDto#maxAggregateServiceCallsPerType() maxAggregateServiceCallsPerType} attribute.
     * @param maxAggregateServiceCallsPerType The value for maxAggregateServiceCallsPerType 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder maxAggregateServiceCallsPerType(int maxAggregateServiceCallsPerType) {
      this.maxAggregateServiceCallsPerType = maxAggregateServiceCallsPerType;
      initBits &= ~INIT_BIT_MAX_AGGREGATE_SERVICE_CALLS_PER_TYPE;
      return this;
    }

    /**
     * Initializes the value for the {@link ConfigJsonService.AdvancedConfigDto#maxTraceEntriesPerTransaction() maxTraceEntriesPerTransaction} attribute.
     * @param maxTraceEntriesPerTransaction The value for maxTraceEntriesPerTransaction (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder maxTraceEntriesPerTransaction(@Nullable Integer maxTraceEntriesPerTransaction) {
      this.maxTraceEntriesPerTransaction = maxTraceEntriesPerTransaction;
      return this;
    }

    /**
     * Initializes the value for the {@link ConfigJsonService.AdvancedConfigDto#maxStackTraceSamplesPerTransaction() maxStackTraceSamplesPerTransaction} attribute.
     * @param maxStackTraceSamplesPerTransaction The value for maxStackTraceSamplesPerTransaction (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder maxStackTraceSamplesPerTransaction(@Nullable Integer maxStackTraceSamplesPerTransaction) {
      this.maxStackTraceSamplesPerTransaction = maxStackTraceSamplesPerTransaction;
      return this;
    }

    /**
     * Initializes the value for the {@link ConfigJsonService.AdvancedConfigDto#mbeanGaugeNotFoundDelaySeconds() mbeanGaugeNotFoundDelaySeconds} attribute.
     * @param mbeanGaugeNotFoundDelaySeconds The value for mbeanGaugeNotFoundDelaySeconds (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder mbeanGaugeNotFoundDelaySeconds(@Nullable Integer mbeanGaugeNotFoundDelaySeconds) {
      this.mbeanGaugeNotFoundDelaySeconds = mbeanGaugeNotFoundDelaySeconds;
      return this;
    }

    /**
     * Initializes the value for the {@link ConfigJsonService.AdvancedConfigDto#version() version} attribute.
     * @param version The value for version 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder version(String version) {
      this.version = Preconditions.checkNotNull(version, "version");
      initBits &= ~INIT_BIT_VERSION;
      return this;
    }

    /**
     * Builds a new {@link ImmutableAdvancedConfigDto ImmutableAdvancedConfigDto}.
     * @return An immutable instance of AdvancedConfigDto
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableAdvancedConfigDto build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableAdvancedConfigDto(
          weavingTimer,
          immediatePartialStoreThresholdSeconds,
          maxAggregateTransactionsPerType,
          maxAggregateQueriesPerType,
          maxAggregateServiceCallsPerType,
          maxTraceEntriesPerTransaction,
          maxStackTraceSamplesPerTransaction,
          mbeanGaugeNotFoundDelaySeconds,
          version);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_MAX_AGGREGATE_QUERIES_PER_TYPE) != 0) attributes.add("maxAggregateQueriesPerType");
      if ((initBits & INIT_BIT_MAX_AGGREGATE_SERVICE_CALLS_PER_TYPE) != 0) attributes.add("maxAggregateServiceCallsPerType");
      if ((initBits & INIT_BIT_VERSION) != 0) attributes.add("version");
      return "Cannot build AdvancedConfigDto, some of required attributes are not set " + attributes;
    }
  }
}
