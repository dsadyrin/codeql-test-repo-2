package org.glowroot.agent.config;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonInclude;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import org.glowroot.agent.shaded.google.common.collect.Lists;
import org.glowroot.agent.shaded.google.common.primitives.Booleans;
import java.util.ArrayList;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link AdvancedConfig}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAdvancedConfig.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "AdvancedConfig"})
@Immutable
public final class ImmutableAdvancedConfig extends AdvancedConfig {
  private final boolean weavingTimer;
  private final int immediatePartialStoreThresholdSeconds;
  private final int maxAggregateTransactionsPerType;
  private final int maxAggregateQueriesPerType;
  private final int maxAggregateServiceCallsPerType;
  private final int maxTraceEntriesPerTransaction;
  private final int maxStackTraceSamplesPerTransaction;
  private final int mbeanGaugeNotFoundDelaySeconds;

  private ImmutableAdvancedConfig(ImmutableAdvancedConfig.Builder builder) {
    if (builder.weavingTimerIsSet()) {
      initShim.weavingTimer(builder.weavingTimer);
    }
    if (builder.immediatePartialStoreThresholdSecondsIsSet()) {
      initShim.immediatePartialStoreThresholdSeconds(builder.immediatePartialStoreThresholdSeconds);
    }
    if (builder.maxAggregateTransactionsPerTypeIsSet()) {
      initShim.maxAggregateTransactionsPerType(builder.maxAggregateTransactionsPerType);
    }
    if (builder.maxAggregateQueriesPerTypeIsSet()) {
      initShim.maxAggregateQueriesPerType(builder.maxAggregateQueriesPerType);
    }
    if (builder.maxAggregateServiceCallsPerTypeIsSet()) {
      initShim.maxAggregateServiceCallsPerType(builder.maxAggregateServiceCallsPerType);
    }
    if (builder.maxTraceEntriesPerTransactionIsSet()) {
      initShim.maxTraceEntriesPerTransaction(builder.maxTraceEntriesPerTransaction);
    }
    if (builder.maxStackTraceSamplesPerTransactionIsSet()) {
      initShim.maxStackTraceSamplesPerTransaction(builder.maxStackTraceSamplesPerTransaction);
    }
    if (builder.mbeanGaugeNotFoundDelaySecondsIsSet()) {
      initShim.mbeanGaugeNotFoundDelaySeconds(builder.mbeanGaugeNotFoundDelaySeconds);
    }
    this.weavingTimer = initShim.weavingTimer();
    this.immediatePartialStoreThresholdSeconds = initShim.immediatePartialStoreThresholdSeconds();
    this.maxAggregateTransactionsPerType = initShim.maxAggregateTransactionsPerType();
    this.maxAggregateQueriesPerType = initShim.maxAggregateQueriesPerType();
    this.maxAggregateServiceCallsPerType = initShim.maxAggregateServiceCallsPerType();
    this.maxTraceEntriesPerTransaction = initShim.maxTraceEntriesPerTransaction();
    this.maxStackTraceSamplesPerTransaction = initShim.maxStackTraceSamplesPerTransaction();
    this.mbeanGaugeNotFoundDelaySeconds = initShim.mbeanGaugeNotFoundDelaySeconds();
    this.initShim = null;
  }

  private ImmutableAdvancedConfig(
      boolean weavingTimer,
      int immediatePartialStoreThresholdSeconds,
      int maxAggregateTransactionsPerType,
      int maxAggregateQueriesPerType,
      int maxAggregateServiceCallsPerType,
      int maxTraceEntriesPerTransaction,
      int maxStackTraceSamplesPerTransaction,
      int mbeanGaugeNotFoundDelaySeconds) {
    this.weavingTimer = weavingTimer;
    this.immediatePartialStoreThresholdSeconds = immediatePartialStoreThresholdSeconds;
    this.maxAggregateTransactionsPerType = maxAggregateTransactionsPerType;
    this.maxAggregateQueriesPerType = maxAggregateQueriesPerType;
    this.maxAggregateServiceCallsPerType = maxAggregateServiceCallsPerType;
    this.maxTraceEntriesPerTransaction = maxTraceEntriesPerTransaction;
    this.maxStackTraceSamplesPerTransaction = maxStackTraceSamplesPerTransaction;
    this.mbeanGaugeNotFoundDelaySeconds = mbeanGaugeNotFoundDelaySeconds;
    this.initShim = null;
  }

  private static final int STAGE_INITIALIZING = -1;
  private static final int STAGE_UNINITIALIZED = 0;
  private static final int STAGE_INITIALIZED = 1;
  private transient volatile InitShim initShim = new InitShim();

  private final class InitShim {
    private boolean weavingTimer;
    private int weavingTimerBuildStage;

    boolean weavingTimer() {
      if (weavingTimerBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (weavingTimerBuildStage == STAGE_UNINITIALIZED) {
        weavingTimerBuildStage = STAGE_INITIALIZING;
        this.weavingTimer = ImmutableAdvancedConfig.super.weavingTimer();
        weavingTimerBuildStage = STAGE_INITIALIZED;
      }
      return this.weavingTimer;
    }

    void weavingTimer(boolean weavingTimer) {
      this.weavingTimer = weavingTimer;
      weavingTimerBuildStage = STAGE_INITIALIZED;
    }
    private int immediatePartialStoreThresholdSeconds;
    private int immediatePartialStoreThresholdSecondsBuildStage;

    int immediatePartialStoreThresholdSeconds() {
      if (immediatePartialStoreThresholdSecondsBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (immediatePartialStoreThresholdSecondsBuildStage == STAGE_UNINITIALIZED) {
        immediatePartialStoreThresholdSecondsBuildStage = STAGE_INITIALIZING;
        this.immediatePartialStoreThresholdSeconds = ImmutableAdvancedConfig.super.immediatePartialStoreThresholdSeconds();
        immediatePartialStoreThresholdSecondsBuildStage = STAGE_INITIALIZED;
      }
      return this.immediatePartialStoreThresholdSeconds;
    }

    void immediatePartialStoreThresholdSeconds(int immediatePartialStoreThresholdSeconds) {
      this.immediatePartialStoreThresholdSeconds = immediatePartialStoreThresholdSeconds;
      immediatePartialStoreThresholdSecondsBuildStage = STAGE_INITIALIZED;
    }
    private int maxAggregateTransactionsPerType;
    private int maxAggregateTransactionsPerTypeBuildStage;

    int maxAggregateTransactionsPerType() {
      if (maxAggregateTransactionsPerTypeBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (maxAggregateTransactionsPerTypeBuildStage == STAGE_UNINITIALIZED) {
        maxAggregateTransactionsPerTypeBuildStage = STAGE_INITIALIZING;
        this.maxAggregateTransactionsPerType = ImmutableAdvancedConfig.super.maxAggregateTransactionsPerType();
        maxAggregateTransactionsPerTypeBuildStage = STAGE_INITIALIZED;
      }
      return this.maxAggregateTransactionsPerType;
    }

    void maxAggregateTransactionsPerType(int maxAggregateTransactionsPerType) {
      this.maxAggregateTransactionsPerType = maxAggregateTransactionsPerType;
      maxAggregateTransactionsPerTypeBuildStage = STAGE_INITIALIZED;
    }
    private int maxAggregateQueriesPerType;
    private int maxAggregateQueriesPerTypeBuildStage;

    int maxAggregateQueriesPerType() {
      if (maxAggregateQueriesPerTypeBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (maxAggregateQueriesPerTypeBuildStage == STAGE_UNINITIALIZED) {
        maxAggregateQueriesPerTypeBuildStage = STAGE_INITIALIZING;
        this.maxAggregateQueriesPerType = ImmutableAdvancedConfig.super.maxAggregateQueriesPerType();
        maxAggregateQueriesPerTypeBuildStage = STAGE_INITIALIZED;
      }
      return this.maxAggregateQueriesPerType;
    }

    void maxAggregateQueriesPerType(int maxAggregateQueriesPerType) {
      this.maxAggregateQueriesPerType = maxAggregateQueriesPerType;
      maxAggregateQueriesPerTypeBuildStage = STAGE_INITIALIZED;
    }
    private int maxAggregateServiceCallsPerType;
    private int maxAggregateServiceCallsPerTypeBuildStage;

    int maxAggregateServiceCallsPerType() {
      if (maxAggregateServiceCallsPerTypeBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (maxAggregateServiceCallsPerTypeBuildStage == STAGE_UNINITIALIZED) {
        maxAggregateServiceCallsPerTypeBuildStage = STAGE_INITIALIZING;
        this.maxAggregateServiceCallsPerType = ImmutableAdvancedConfig.super.maxAggregateServiceCallsPerType();
        maxAggregateServiceCallsPerTypeBuildStage = STAGE_INITIALIZED;
      }
      return this.maxAggregateServiceCallsPerType;
    }

    void maxAggregateServiceCallsPerType(int maxAggregateServiceCallsPerType) {
      this.maxAggregateServiceCallsPerType = maxAggregateServiceCallsPerType;
      maxAggregateServiceCallsPerTypeBuildStage = STAGE_INITIALIZED;
    }
    private int maxTraceEntriesPerTransaction;
    private int maxTraceEntriesPerTransactionBuildStage;

    int maxTraceEntriesPerTransaction() {
      if (maxTraceEntriesPerTransactionBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (maxTraceEntriesPerTransactionBuildStage == STAGE_UNINITIALIZED) {
        maxTraceEntriesPerTransactionBuildStage = STAGE_INITIALIZING;
        this.maxTraceEntriesPerTransaction = ImmutableAdvancedConfig.super.maxTraceEntriesPerTransaction();
        maxTraceEntriesPerTransactionBuildStage = STAGE_INITIALIZED;
      }
      return this.maxTraceEntriesPerTransaction;
    }

    void maxTraceEntriesPerTransaction(int maxTraceEntriesPerTransaction) {
      this.maxTraceEntriesPerTransaction = maxTraceEntriesPerTransaction;
      maxTraceEntriesPerTransactionBuildStage = STAGE_INITIALIZED;
    }
    private int maxStackTraceSamplesPerTransaction;
    private int maxStackTraceSamplesPerTransactionBuildStage;

    int maxStackTraceSamplesPerTransaction() {
      if (maxStackTraceSamplesPerTransactionBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (maxStackTraceSamplesPerTransactionBuildStage == STAGE_UNINITIALIZED) {
        maxStackTraceSamplesPerTransactionBuildStage = STAGE_INITIALIZING;
        this.maxStackTraceSamplesPerTransaction = ImmutableAdvancedConfig.super.maxStackTraceSamplesPerTransaction();
        maxStackTraceSamplesPerTransactionBuildStage = STAGE_INITIALIZED;
      }
      return this.maxStackTraceSamplesPerTransaction;
    }

    void maxStackTraceSamplesPerTransaction(int maxStackTraceSamplesPerTransaction) {
      this.maxStackTraceSamplesPerTransaction = maxStackTraceSamplesPerTransaction;
      maxStackTraceSamplesPerTransactionBuildStage = STAGE_INITIALIZED;
    }
    private int mbeanGaugeNotFoundDelaySeconds;
    private int mbeanGaugeNotFoundDelaySecondsBuildStage;

    int mbeanGaugeNotFoundDelaySeconds() {
      if (mbeanGaugeNotFoundDelaySecondsBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (mbeanGaugeNotFoundDelaySecondsBuildStage == STAGE_UNINITIALIZED) {
        mbeanGaugeNotFoundDelaySecondsBuildStage = STAGE_INITIALIZING;
        this.mbeanGaugeNotFoundDelaySeconds = ImmutableAdvancedConfig.super.mbeanGaugeNotFoundDelaySeconds();
        mbeanGaugeNotFoundDelaySecondsBuildStage = STAGE_INITIALIZED;
      }
      return this.mbeanGaugeNotFoundDelaySeconds;
    }

    void mbeanGaugeNotFoundDelaySeconds(int mbeanGaugeNotFoundDelaySeconds) {
      this.mbeanGaugeNotFoundDelaySeconds = mbeanGaugeNotFoundDelaySeconds;
      mbeanGaugeNotFoundDelaySecondsBuildStage = STAGE_INITIALIZED;
    }

    private String formatInitCycleMessage() {
      ArrayList<String> attributes = Lists.newArrayList();
      if (weavingTimerBuildStage == STAGE_INITIALIZING) attributes.add("weavingTimer");
      if (immediatePartialStoreThresholdSecondsBuildStage == STAGE_INITIALIZING) attributes.add("immediatePartialStoreThresholdSeconds");
      if (maxAggregateTransactionsPerTypeBuildStage == STAGE_INITIALIZING) attributes.add("maxAggregateTransactionsPerType");
      if (maxAggregateQueriesPerTypeBuildStage == STAGE_INITIALIZING) attributes.add("maxAggregateQueriesPerType");
      if (maxAggregateServiceCallsPerTypeBuildStage == STAGE_INITIALIZING) attributes.add("maxAggregateServiceCallsPerType");
      if (maxTraceEntriesPerTransactionBuildStage == STAGE_INITIALIZING) attributes.add("maxTraceEntriesPerTransaction");
      if (maxStackTraceSamplesPerTransactionBuildStage == STAGE_INITIALIZING) attributes.add("maxStackTraceSamplesPerTransaction");
      if (mbeanGaugeNotFoundDelaySecondsBuildStage == STAGE_INITIALIZING) attributes.add("mbeanGaugeNotFoundDelaySeconds");
      return "Cannot build AdvancedConfig, attribute initializers form cycle" + attributes;
    }
  }

  /**
   * @return The value of the {@code weavingTimer} attribute
   */
  @JsonProperty("weavingTimer")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @Override
  public boolean weavingTimer() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.weavingTimer()
        : this.weavingTimer;
  }

  /**
   * @return The value of the {@code immediatePartialStoreThresholdSeconds} attribute
   */
  @JsonProperty("immediatePartialStoreThresholdSeconds")
  @Override
  public int immediatePartialStoreThresholdSeconds() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.immediatePartialStoreThresholdSeconds()
        : this.immediatePartialStoreThresholdSeconds;
  }

  /**
   * @return The value of the {@code maxAggregateTransactionsPerType} attribute
   */
  @JsonProperty("maxAggregateTransactionsPerType")
  @Override
  public int maxAggregateTransactionsPerType() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.maxAggregateTransactionsPerType()
        : this.maxAggregateTransactionsPerType;
  }

  /**
   * @return The value of the {@code maxAggregateQueriesPerType} attribute
   */
  @JsonProperty("maxAggregateQueriesPerType")
  @Override
  public int maxAggregateQueriesPerType() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.maxAggregateQueriesPerType()
        : this.maxAggregateQueriesPerType;
  }

  /**
   * @return The value of the {@code maxAggregateServiceCallsPerType} attribute
   */
  @JsonProperty("maxAggregateServiceCallsPerType")
  @Override
  public int maxAggregateServiceCallsPerType() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.maxAggregateServiceCallsPerType()
        : this.maxAggregateServiceCallsPerType;
  }

  /**
   * @return The value of the {@code maxTraceEntriesPerTransaction} attribute
   */
  @JsonProperty("maxTraceEntriesPerTransaction")
  @Override
  public int maxTraceEntriesPerTransaction() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.maxTraceEntriesPerTransaction()
        : this.maxTraceEntriesPerTransaction;
  }

  /**
   * @return The value of the {@code maxStackTraceSamplesPerTransaction} attribute
   */
  @JsonProperty("maxStackTraceSamplesPerTransaction")
  @Override
  public int maxStackTraceSamplesPerTransaction() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.maxStackTraceSamplesPerTransaction()
        : this.maxStackTraceSamplesPerTransaction;
  }

  /**
   * @return The value of the {@code mbeanGaugeNotFoundDelaySeconds} attribute
   */
  @JsonProperty("mbeanGaugeNotFoundDelaySeconds")
  @Override
  public int mbeanGaugeNotFoundDelaySeconds() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.mbeanGaugeNotFoundDelaySeconds()
        : this.mbeanGaugeNotFoundDelaySeconds;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AdvancedConfig#weavingTimer() weavingTimer} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for weavingTimer
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAdvancedConfig withWeavingTimer(boolean value) {
    if (this.weavingTimer == value) return this;
    return new ImmutableAdvancedConfig(
        value,
        this.immediatePartialStoreThresholdSeconds,
        this.maxAggregateTransactionsPerType,
        this.maxAggregateQueriesPerType,
        this.maxAggregateServiceCallsPerType,
        this.maxTraceEntriesPerTransaction,
        this.maxStackTraceSamplesPerTransaction,
        this.mbeanGaugeNotFoundDelaySeconds);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AdvancedConfig#immediatePartialStoreThresholdSeconds() immediatePartialStoreThresholdSeconds} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for immediatePartialStoreThresholdSeconds
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAdvancedConfig withImmediatePartialStoreThresholdSeconds(int value) {
    if (this.immediatePartialStoreThresholdSeconds == value) return this;
    return new ImmutableAdvancedConfig(
        this.weavingTimer,
        value,
        this.maxAggregateTransactionsPerType,
        this.maxAggregateQueriesPerType,
        this.maxAggregateServiceCallsPerType,
        this.maxTraceEntriesPerTransaction,
        this.maxStackTraceSamplesPerTransaction,
        this.mbeanGaugeNotFoundDelaySeconds);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AdvancedConfig#maxAggregateTransactionsPerType() maxAggregateTransactionsPerType} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for maxAggregateTransactionsPerType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAdvancedConfig withMaxAggregateTransactionsPerType(int value) {
    if (this.maxAggregateTransactionsPerType == value) return this;
    return new ImmutableAdvancedConfig(
        this.weavingTimer,
        this.immediatePartialStoreThresholdSeconds,
        value,
        this.maxAggregateQueriesPerType,
        this.maxAggregateServiceCallsPerType,
        this.maxTraceEntriesPerTransaction,
        this.maxStackTraceSamplesPerTransaction,
        this.mbeanGaugeNotFoundDelaySeconds);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AdvancedConfig#maxAggregateQueriesPerType() maxAggregateQueriesPerType} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for maxAggregateQueriesPerType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAdvancedConfig withMaxAggregateQueriesPerType(int value) {
    if (this.maxAggregateQueriesPerType == value) return this;
    return new ImmutableAdvancedConfig(
        this.weavingTimer,
        this.immediatePartialStoreThresholdSeconds,
        this.maxAggregateTransactionsPerType,
        value,
        this.maxAggregateServiceCallsPerType,
        this.maxTraceEntriesPerTransaction,
        this.maxStackTraceSamplesPerTransaction,
        this.mbeanGaugeNotFoundDelaySeconds);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AdvancedConfig#maxAggregateServiceCallsPerType() maxAggregateServiceCallsPerType} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for maxAggregateServiceCallsPerType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAdvancedConfig withMaxAggregateServiceCallsPerType(int value) {
    if (this.maxAggregateServiceCallsPerType == value) return this;
    return new ImmutableAdvancedConfig(
        this.weavingTimer,
        this.immediatePartialStoreThresholdSeconds,
        this.maxAggregateTransactionsPerType,
        this.maxAggregateQueriesPerType,
        value,
        this.maxTraceEntriesPerTransaction,
        this.maxStackTraceSamplesPerTransaction,
        this.mbeanGaugeNotFoundDelaySeconds);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AdvancedConfig#maxTraceEntriesPerTransaction() maxTraceEntriesPerTransaction} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for maxTraceEntriesPerTransaction
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAdvancedConfig withMaxTraceEntriesPerTransaction(int value) {
    if (this.maxTraceEntriesPerTransaction == value) return this;
    return new ImmutableAdvancedConfig(
        this.weavingTimer,
        this.immediatePartialStoreThresholdSeconds,
        this.maxAggregateTransactionsPerType,
        this.maxAggregateQueriesPerType,
        this.maxAggregateServiceCallsPerType,
        value,
        this.maxStackTraceSamplesPerTransaction,
        this.mbeanGaugeNotFoundDelaySeconds);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AdvancedConfig#maxStackTraceSamplesPerTransaction() maxStackTraceSamplesPerTransaction} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for maxStackTraceSamplesPerTransaction
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAdvancedConfig withMaxStackTraceSamplesPerTransaction(int value) {
    if (this.maxStackTraceSamplesPerTransaction == value) return this;
    return new ImmutableAdvancedConfig(
        this.weavingTimer,
        this.immediatePartialStoreThresholdSeconds,
        this.maxAggregateTransactionsPerType,
        this.maxAggregateQueriesPerType,
        this.maxAggregateServiceCallsPerType,
        this.maxTraceEntriesPerTransaction,
        value,
        this.mbeanGaugeNotFoundDelaySeconds);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AdvancedConfig#mbeanGaugeNotFoundDelaySeconds() mbeanGaugeNotFoundDelaySeconds} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for mbeanGaugeNotFoundDelaySeconds
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAdvancedConfig withMbeanGaugeNotFoundDelaySeconds(int value) {
    if (this.mbeanGaugeNotFoundDelaySeconds == value) return this;
    return new ImmutableAdvancedConfig(
        this.weavingTimer,
        this.immediatePartialStoreThresholdSeconds,
        this.maxAggregateTransactionsPerType,
        this.maxAggregateQueriesPerType,
        this.maxAggregateServiceCallsPerType,
        this.maxTraceEntriesPerTransaction,
        this.maxStackTraceSamplesPerTransaction,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAdvancedConfig} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAdvancedConfig
        && equalTo((ImmutableAdvancedConfig) another);
  }

  private boolean equalTo(ImmutableAdvancedConfig another) {
    return weavingTimer == another.weavingTimer
        && immediatePartialStoreThresholdSeconds == another.immediatePartialStoreThresholdSeconds
        && maxAggregateTransactionsPerType == another.maxAggregateTransactionsPerType
        && maxAggregateQueriesPerType == another.maxAggregateQueriesPerType
        && maxAggregateServiceCallsPerType == another.maxAggregateServiceCallsPerType
        && maxTraceEntriesPerTransaction == another.maxTraceEntriesPerTransaction
        && maxStackTraceSamplesPerTransaction == another.maxStackTraceSamplesPerTransaction
        && mbeanGaugeNotFoundDelaySeconds == another.mbeanGaugeNotFoundDelaySeconds;
  }

  /**
   * Computes a hash code from attributes: {@code weavingTimer}, {@code immediatePartialStoreThresholdSeconds}, {@code maxAggregateTransactionsPerType}, {@code maxAggregateQueriesPerType}, {@code maxAggregateServiceCallsPerType}, {@code maxTraceEntriesPerTransaction}, {@code maxStackTraceSamplesPerTransaction}, {@code mbeanGaugeNotFoundDelaySeconds}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Booleans.hashCode(weavingTimer);
    h += (h << 5) + immediatePartialStoreThresholdSeconds;
    h += (h << 5) + maxAggregateTransactionsPerType;
    h += (h << 5) + maxAggregateQueriesPerType;
    h += (h << 5) + maxAggregateServiceCallsPerType;
    h += (h << 5) + maxTraceEntriesPerTransaction;
    h += (h << 5) + maxStackTraceSamplesPerTransaction;
    h += (h << 5) + mbeanGaugeNotFoundDelaySeconds;
    return h;
  }

  /**
   * Prints the immutable value {@code AdvancedConfig} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("AdvancedConfig")
        .omitNullValues()
        .add("weavingTimer", weavingTimer)
        .add("immediatePartialStoreThresholdSeconds", immediatePartialStoreThresholdSeconds)
        .add("maxAggregateTransactionsPerType", maxAggregateTransactionsPerType)
        .add("maxAggregateQueriesPerType", maxAggregateQueriesPerType)
        .add("maxAggregateServiceCallsPerType", maxAggregateServiceCallsPerType)
        .add("maxTraceEntriesPerTransaction", maxTraceEntriesPerTransaction)
        .add("maxStackTraceSamplesPerTransaction", maxStackTraceSamplesPerTransaction)
        .add("mbeanGaugeNotFoundDelaySeconds", mbeanGaugeNotFoundDelaySeconds)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends AdvancedConfig {
    boolean weavingTimer;
    boolean weavingTimerIsSet;
    int immediatePartialStoreThresholdSeconds;
    boolean immediatePartialStoreThresholdSecondsIsSet;
    int maxAggregateTransactionsPerType;
    boolean maxAggregateTransactionsPerTypeIsSet;
    int maxAggregateQueriesPerType;
    boolean maxAggregateQueriesPerTypeIsSet;
    int maxAggregateServiceCallsPerType;
    boolean maxAggregateServiceCallsPerTypeIsSet;
    int maxTraceEntriesPerTransaction;
    boolean maxTraceEntriesPerTransactionIsSet;
    int maxStackTraceSamplesPerTransaction;
    boolean maxStackTraceSamplesPerTransactionIsSet;
    int mbeanGaugeNotFoundDelaySeconds;
    boolean mbeanGaugeNotFoundDelaySecondsIsSet;
    @JsonProperty("weavingTimer")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public void setWeavingTimer(boolean weavingTimer) {
      this.weavingTimer = weavingTimer;
      this.weavingTimerIsSet = true;
    }
    @JsonProperty("immediatePartialStoreThresholdSeconds")
    public void setImmediatePartialStoreThresholdSeconds(int immediatePartialStoreThresholdSeconds) {
      this.immediatePartialStoreThresholdSeconds = immediatePartialStoreThresholdSeconds;
      this.immediatePartialStoreThresholdSecondsIsSet = true;
    }
    @JsonProperty("maxAggregateTransactionsPerType")
    public void setMaxAggregateTransactionsPerType(int maxAggregateTransactionsPerType) {
      this.maxAggregateTransactionsPerType = maxAggregateTransactionsPerType;
      this.maxAggregateTransactionsPerTypeIsSet = true;
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
    public void setMaxTraceEntriesPerTransaction(int maxTraceEntriesPerTransaction) {
      this.maxTraceEntriesPerTransaction = maxTraceEntriesPerTransaction;
      this.maxTraceEntriesPerTransactionIsSet = true;
    }
    @JsonProperty("maxStackTraceSamplesPerTransaction")
    public void setMaxStackTraceSamplesPerTransaction(int maxStackTraceSamplesPerTransaction) {
      this.maxStackTraceSamplesPerTransaction = maxStackTraceSamplesPerTransaction;
      this.maxStackTraceSamplesPerTransactionIsSet = true;
    }
    @JsonProperty("mbeanGaugeNotFoundDelaySeconds")
    public void setMbeanGaugeNotFoundDelaySeconds(int mbeanGaugeNotFoundDelaySeconds) {
      this.mbeanGaugeNotFoundDelaySeconds = mbeanGaugeNotFoundDelaySeconds;
      this.mbeanGaugeNotFoundDelaySecondsIsSet = true;
    }
    @Override
    public boolean weavingTimer() { throw new UnsupportedOperationException(); }
    @Override
    public int immediatePartialStoreThresholdSeconds() { throw new UnsupportedOperationException(); }
    @Override
    public int maxAggregateTransactionsPerType() { throw new UnsupportedOperationException(); }
    @Override
    public int maxAggregateQueriesPerType() { throw new UnsupportedOperationException(); }
    @Override
    public int maxAggregateServiceCallsPerType() { throw new UnsupportedOperationException(); }
    @Override
    public int maxTraceEntriesPerTransaction() { throw new UnsupportedOperationException(); }
    @Override
    public int maxStackTraceSamplesPerTransaction() { throw new UnsupportedOperationException(); }
    @Override
    public int mbeanGaugeNotFoundDelaySeconds() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableAdvancedConfig fromJson(Json json) {
    ImmutableAdvancedConfig.Builder builder = ImmutableAdvancedConfig.builder();
    if (json.weavingTimerIsSet) {
      builder.weavingTimer(json.weavingTimer);
    }
    if (json.immediatePartialStoreThresholdSecondsIsSet) {
      builder.immediatePartialStoreThresholdSeconds(json.immediatePartialStoreThresholdSeconds);
    }
    if (json.maxAggregateTransactionsPerTypeIsSet) {
      builder.maxAggregateTransactionsPerType(json.maxAggregateTransactionsPerType);
    }
    if (json.maxAggregateQueriesPerTypeIsSet) {
      builder.maxAggregateQueriesPerType(json.maxAggregateQueriesPerType);
    }
    if (json.maxAggregateServiceCallsPerTypeIsSet) {
      builder.maxAggregateServiceCallsPerType(json.maxAggregateServiceCallsPerType);
    }
    if (json.maxTraceEntriesPerTransactionIsSet) {
      builder.maxTraceEntriesPerTransaction(json.maxTraceEntriesPerTransaction);
    }
    if (json.maxStackTraceSamplesPerTransactionIsSet) {
      builder.maxStackTraceSamplesPerTransaction(json.maxStackTraceSamplesPerTransaction);
    }
    if (json.mbeanGaugeNotFoundDelaySecondsIsSet) {
      builder.mbeanGaugeNotFoundDelaySeconds(json.mbeanGaugeNotFoundDelaySeconds);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link AdvancedConfig} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable AdvancedConfig instance
   */
  public static ImmutableAdvancedConfig copyOf(AdvancedConfig instance) {
    if (instance instanceof ImmutableAdvancedConfig) {
      return (ImmutableAdvancedConfig) instance;
    }
    return ImmutableAdvancedConfig.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableAdvancedConfig ImmutableAdvancedConfig}.
   * @return A new ImmutableAdvancedConfig builder
   */
  public static ImmutableAdvancedConfig.Builder builder() {
    return new ImmutableAdvancedConfig.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableAdvancedConfig ImmutableAdvancedConfig}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_WEAVING_TIMER = 0x1L;
    private static final long OPT_BIT_IMMEDIATE_PARTIAL_STORE_THRESHOLD_SECONDS = 0x2L;
    private static final long OPT_BIT_MAX_AGGREGATE_TRANSACTIONS_PER_TYPE = 0x4L;
    private static final long OPT_BIT_MAX_AGGREGATE_QUERIES_PER_TYPE = 0x8L;
    private static final long OPT_BIT_MAX_AGGREGATE_SERVICE_CALLS_PER_TYPE = 0x10L;
    private static final long OPT_BIT_MAX_TRACE_ENTRIES_PER_TRANSACTION = 0x20L;
    private static final long OPT_BIT_MAX_STACK_TRACE_SAMPLES_PER_TRANSACTION = 0x40L;
    private static final long OPT_BIT_MBEAN_GAUGE_NOT_FOUND_DELAY_SECONDS = 0x80L;
    private long optBits;

    private boolean weavingTimer;
    private int immediatePartialStoreThresholdSeconds;
    private int maxAggregateTransactionsPerType;
    private int maxAggregateQueriesPerType;
    private int maxAggregateServiceCallsPerType;
    private int maxTraceEntriesPerTransaction;
    private int maxStackTraceSamplesPerTransaction;
    private int mbeanGaugeNotFoundDelaySeconds;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code AdvancedConfig} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(AdvancedConfig instance) {
      Preconditions.checkNotNull(instance, "instance");
      weavingTimer(instance.weavingTimer());
      immediatePartialStoreThresholdSeconds(instance.immediatePartialStoreThresholdSeconds());
      maxAggregateTransactionsPerType(instance.maxAggregateTransactionsPerType());
      maxAggregateQueriesPerType(instance.maxAggregateQueriesPerType());
      maxAggregateServiceCallsPerType(instance.maxAggregateServiceCallsPerType());
      maxTraceEntriesPerTransaction(instance.maxTraceEntriesPerTransaction());
      maxStackTraceSamplesPerTransaction(instance.maxStackTraceSamplesPerTransaction());
      mbeanGaugeNotFoundDelaySeconds(instance.mbeanGaugeNotFoundDelaySeconds());
      return this;
    }

    /**
     * Initializes the value for the {@link AdvancedConfig#weavingTimer() weavingTimer} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link AdvancedConfig#weavingTimer() weavingTimer}.</em>
     * @param weavingTimer The value for weavingTimer 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder weavingTimer(boolean weavingTimer) {
      this.weavingTimer = weavingTimer;
      optBits |= OPT_BIT_WEAVING_TIMER;
      return this;
    }

    /**
     * Initializes the value for the {@link AdvancedConfig#immediatePartialStoreThresholdSeconds() immediatePartialStoreThresholdSeconds} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link AdvancedConfig#immediatePartialStoreThresholdSeconds() immediatePartialStoreThresholdSeconds}.</em>
     * @param immediatePartialStoreThresholdSeconds The value for immediatePartialStoreThresholdSeconds 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder immediatePartialStoreThresholdSeconds(int immediatePartialStoreThresholdSeconds) {
      this.immediatePartialStoreThresholdSeconds = immediatePartialStoreThresholdSeconds;
      optBits |= OPT_BIT_IMMEDIATE_PARTIAL_STORE_THRESHOLD_SECONDS;
      return this;
    }

    /**
     * Initializes the value for the {@link AdvancedConfig#maxAggregateTransactionsPerType() maxAggregateTransactionsPerType} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link AdvancedConfig#maxAggregateTransactionsPerType() maxAggregateTransactionsPerType}.</em>
     * @param maxAggregateTransactionsPerType The value for maxAggregateTransactionsPerType 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder maxAggregateTransactionsPerType(int maxAggregateTransactionsPerType) {
      this.maxAggregateTransactionsPerType = maxAggregateTransactionsPerType;
      optBits |= OPT_BIT_MAX_AGGREGATE_TRANSACTIONS_PER_TYPE;
      return this;
    }

    /**
     * Initializes the value for the {@link AdvancedConfig#maxAggregateQueriesPerType() maxAggregateQueriesPerType} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link AdvancedConfig#maxAggregateQueriesPerType() maxAggregateQueriesPerType}.</em>
     * @param maxAggregateQueriesPerType The value for maxAggregateQueriesPerType 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder maxAggregateQueriesPerType(int maxAggregateQueriesPerType) {
      this.maxAggregateQueriesPerType = maxAggregateQueriesPerType;
      optBits |= OPT_BIT_MAX_AGGREGATE_QUERIES_PER_TYPE;
      return this;
    }

    /**
     * Initializes the value for the {@link AdvancedConfig#maxAggregateServiceCallsPerType() maxAggregateServiceCallsPerType} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link AdvancedConfig#maxAggregateServiceCallsPerType() maxAggregateServiceCallsPerType}.</em>
     * @param maxAggregateServiceCallsPerType The value for maxAggregateServiceCallsPerType 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder maxAggregateServiceCallsPerType(int maxAggregateServiceCallsPerType) {
      this.maxAggregateServiceCallsPerType = maxAggregateServiceCallsPerType;
      optBits |= OPT_BIT_MAX_AGGREGATE_SERVICE_CALLS_PER_TYPE;
      return this;
    }

    /**
     * Initializes the value for the {@link AdvancedConfig#maxTraceEntriesPerTransaction() maxTraceEntriesPerTransaction} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link AdvancedConfig#maxTraceEntriesPerTransaction() maxTraceEntriesPerTransaction}.</em>
     * @param maxTraceEntriesPerTransaction The value for maxTraceEntriesPerTransaction 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder maxTraceEntriesPerTransaction(int maxTraceEntriesPerTransaction) {
      this.maxTraceEntriesPerTransaction = maxTraceEntriesPerTransaction;
      optBits |= OPT_BIT_MAX_TRACE_ENTRIES_PER_TRANSACTION;
      return this;
    }

    /**
     * Initializes the value for the {@link AdvancedConfig#maxStackTraceSamplesPerTransaction() maxStackTraceSamplesPerTransaction} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link AdvancedConfig#maxStackTraceSamplesPerTransaction() maxStackTraceSamplesPerTransaction}.</em>
     * @param maxStackTraceSamplesPerTransaction The value for maxStackTraceSamplesPerTransaction 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder maxStackTraceSamplesPerTransaction(int maxStackTraceSamplesPerTransaction) {
      this.maxStackTraceSamplesPerTransaction = maxStackTraceSamplesPerTransaction;
      optBits |= OPT_BIT_MAX_STACK_TRACE_SAMPLES_PER_TRANSACTION;
      return this;
    }

    /**
     * Initializes the value for the {@link AdvancedConfig#mbeanGaugeNotFoundDelaySeconds() mbeanGaugeNotFoundDelaySeconds} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link AdvancedConfig#mbeanGaugeNotFoundDelaySeconds() mbeanGaugeNotFoundDelaySeconds}.</em>
     * @param mbeanGaugeNotFoundDelaySeconds The value for mbeanGaugeNotFoundDelaySeconds 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder mbeanGaugeNotFoundDelaySeconds(int mbeanGaugeNotFoundDelaySeconds) {
      this.mbeanGaugeNotFoundDelaySeconds = mbeanGaugeNotFoundDelaySeconds;
      optBits |= OPT_BIT_MBEAN_GAUGE_NOT_FOUND_DELAY_SECONDS;
      return this;
    }

    /**
     * Builds a new {@link ImmutableAdvancedConfig ImmutableAdvancedConfig}.
     * @return An immutable instance of AdvancedConfig
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableAdvancedConfig build() {
      return new ImmutableAdvancedConfig(this);
    }

    private boolean weavingTimerIsSet() {
      return (optBits & OPT_BIT_WEAVING_TIMER) != 0;
    }

    private boolean immediatePartialStoreThresholdSecondsIsSet() {
      return (optBits & OPT_BIT_IMMEDIATE_PARTIAL_STORE_THRESHOLD_SECONDS) != 0;
    }

    private boolean maxAggregateTransactionsPerTypeIsSet() {
      return (optBits & OPT_BIT_MAX_AGGREGATE_TRANSACTIONS_PER_TYPE) != 0;
    }

    private boolean maxAggregateQueriesPerTypeIsSet() {
      return (optBits & OPT_BIT_MAX_AGGREGATE_QUERIES_PER_TYPE) != 0;
    }

    private boolean maxAggregateServiceCallsPerTypeIsSet() {
      return (optBits & OPT_BIT_MAX_AGGREGATE_SERVICE_CALLS_PER_TYPE) != 0;
    }

    private boolean maxTraceEntriesPerTransactionIsSet() {
      return (optBits & OPT_BIT_MAX_TRACE_ENTRIES_PER_TRANSACTION) != 0;
    }

    private boolean maxStackTraceSamplesPerTransactionIsSet() {
      return (optBits & OPT_BIT_MAX_STACK_TRACE_SAMPLES_PER_TRANSACTION) != 0;
    }

    private boolean mbeanGaugeNotFoundDelaySecondsIsSet() {
      return (optBits & OPT_BIT_MBEAN_GAUGE_NOT_FOUND_DELAY_SECONDS) != 0;
    }
  }
}
