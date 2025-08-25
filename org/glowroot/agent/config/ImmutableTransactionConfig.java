package org.glowroot.agent.config;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
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
 * Immutable implementation of {@link TransactionConfig}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTransactionConfig.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "TransactionConfig"})
@Immutable
public final class ImmutableTransactionConfig extends TransactionConfig {
  private final int slowThresholdMillis;
  private final int profilingIntervalMillis;
  private final boolean captureThreadStats;

  private ImmutableTransactionConfig(ImmutableTransactionConfig.Builder builder) {
    if (builder.slowThresholdMillisIsSet()) {
      initShim.slowThresholdMillis(builder.slowThresholdMillis);
    }
    if (builder.profilingIntervalMillisIsSet()) {
      initShim.profilingIntervalMillis(builder.profilingIntervalMillis);
    }
    if (builder.captureThreadStatsIsSet()) {
      initShim.captureThreadStats(builder.captureThreadStats);
    }
    this.slowThresholdMillis = initShim.slowThresholdMillis();
    this.profilingIntervalMillis = initShim.profilingIntervalMillis();
    this.captureThreadStats = initShim.captureThreadStats();
    this.initShim = null;
  }

  private ImmutableTransactionConfig(int slowThresholdMillis, int profilingIntervalMillis, boolean captureThreadStats) {
    this.slowThresholdMillis = slowThresholdMillis;
    this.profilingIntervalMillis = profilingIntervalMillis;
    this.captureThreadStats = captureThreadStats;
    this.initShim = null;
  }

  private static final int STAGE_INITIALIZING = -1;
  private static final int STAGE_UNINITIALIZED = 0;
  private static final int STAGE_INITIALIZED = 1;
  private transient volatile InitShim initShim = new InitShim();

  private final class InitShim {
    private int slowThresholdMillis;
    private int slowThresholdMillisBuildStage;

    int slowThresholdMillis() {
      if (slowThresholdMillisBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (slowThresholdMillisBuildStage == STAGE_UNINITIALIZED) {
        slowThresholdMillisBuildStage = STAGE_INITIALIZING;
        this.slowThresholdMillis = ImmutableTransactionConfig.super.slowThresholdMillis();
        slowThresholdMillisBuildStage = STAGE_INITIALIZED;
      }
      return this.slowThresholdMillis;
    }

    void slowThresholdMillis(int slowThresholdMillis) {
      this.slowThresholdMillis = slowThresholdMillis;
      slowThresholdMillisBuildStage = STAGE_INITIALIZED;
    }
    private int profilingIntervalMillis;
    private int profilingIntervalMillisBuildStage;

    int profilingIntervalMillis() {
      if (profilingIntervalMillisBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (profilingIntervalMillisBuildStage == STAGE_UNINITIALIZED) {
        profilingIntervalMillisBuildStage = STAGE_INITIALIZING;
        this.profilingIntervalMillis = ImmutableTransactionConfig.super.profilingIntervalMillis();
        profilingIntervalMillisBuildStage = STAGE_INITIALIZED;
      }
      return this.profilingIntervalMillis;
    }

    void profilingIntervalMillis(int profilingIntervalMillis) {
      this.profilingIntervalMillis = profilingIntervalMillis;
      profilingIntervalMillisBuildStage = STAGE_INITIALIZED;
    }
    private boolean captureThreadStats;
    private int captureThreadStatsBuildStage;

    boolean captureThreadStats() {
      if (captureThreadStatsBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (captureThreadStatsBuildStage == STAGE_UNINITIALIZED) {
        captureThreadStatsBuildStage = STAGE_INITIALIZING;
        this.captureThreadStats = ImmutableTransactionConfig.super.captureThreadStats();
        captureThreadStatsBuildStage = STAGE_INITIALIZED;
      }
      return this.captureThreadStats;
    }

    void captureThreadStats(boolean captureThreadStats) {
      this.captureThreadStats = captureThreadStats;
      captureThreadStatsBuildStage = STAGE_INITIALIZED;
    }

    private String formatInitCycleMessage() {
      ArrayList<String> attributes = Lists.newArrayList();
      if (slowThresholdMillisBuildStage == STAGE_INITIALIZING) attributes.add("slowThresholdMillis");
      if (profilingIntervalMillisBuildStage == STAGE_INITIALIZING) attributes.add("profilingIntervalMillis");
      if (captureThreadStatsBuildStage == STAGE_INITIALIZING) attributes.add("captureThreadStats");
      return "Cannot build TransactionConfig, attribute initializers form cycle" + attributes;
    }
  }

  /**
   * @return The value of the {@code slowThresholdMillis} attribute
   */
  @JsonProperty("slowThresholdMillis")
  @Override
  public int slowThresholdMillis() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.slowThresholdMillis()
        : this.slowThresholdMillis;
  }

  /**
   * @return The value of the {@code profilingIntervalMillis} attribute
   */
  @JsonProperty("profilingIntervalMillis")
  @Override
  public int profilingIntervalMillis() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.profilingIntervalMillis()
        : this.profilingIntervalMillis;
  }

  /**
   * @return The value of the {@code captureThreadStats} attribute
   */
  @JsonProperty("captureThreadStats")
  @Override
  public boolean captureThreadStats() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.captureThreadStats()
        : this.captureThreadStats;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TransactionConfig#slowThresholdMillis() slowThresholdMillis} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for slowThresholdMillis
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTransactionConfig withSlowThresholdMillis(int value) {
    if (this.slowThresholdMillis == value) return this;
    return new ImmutableTransactionConfig(value, this.profilingIntervalMillis, this.captureThreadStats);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TransactionConfig#profilingIntervalMillis() profilingIntervalMillis} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for profilingIntervalMillis
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTransactionConfig withProfilingIntervalMillis(int value) {
    if (this.profilingIntervalMillis == value) return this;
    return new ImmutableTransactionConfig(this.slowThresholdMillis, value, this.captureThreadStats);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TransactionConfig#captureThreadStats() captureThreadStats} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for captureThreadStats
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTransactionConfig withCaptureThreadStats(boolean value) {
    if (this.captureThreadStats == value) return this;
    return new ImmutableTransactionConfig(this.slowThresholdMillis, this.profilingIntervalMillis, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTransactionConfig} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTransactionConfig
        && equalTo((ImmutableTransactionConfig) another);
  }

  private boolean equalTo(ImmutableTransactionConfig another) {
    return slowThresholdMillis == another.slowThresholdMillis
        && profilingIntervalMillis == another.profilingIntervalMillis
        && captureThreadStats == another.captureThreadStats;
  }

  /**
   * Computes a hash code from attributes: {@code slowThresholdMillis}, {@code profilingIntervalMillis}, {@code captureThreadStats}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + slowThresholdMillis;
    h += (h << 5) + profilingIntervalMillis;
    h += (h << 5) + Booleans.hashCode(captureThreadStats);
    return h;
  }

  /**
   * Prints the immutable value {@code TransactionConfig} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("TransactionConfig")
        .omitNullValues()
        .add("slowThresholdMillis", slowThresholdMillis)
        .add("profilingIntervalMillis", profilingIntervalMillis)
        .add("captureThreadStats", captureThreadStats)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends TransactionConfig {
    int slowThresholdMillis;
    boolean slowThresholdMillisIsSet;
    int profilingIntervalMillis;
    boolean profilingIntervalMillisIsSet;
    boolean captureThreadStats;
    boolean captureThreadStatsIsSet;
    @JsonProperty("slowThresholdMillis")
    public void setSlowThresholdMillis(int slowThresholdMillis) {
      this.slowThresholdMillis = slowThresholdMillis;
      this.slowThresholdMillisIsSet = true;
    }
    @JsonProperty("profilingIntervalMillis")
    public void setProfilingIntervalMillis(int profilingIntervalMillis) {
      this.profilingIntervalMillis = profilingIntervalMillis;
      this.profilingIntervalMillisIsSet = true;
    }
    @JsonProperty("captureThreadStats")
    public void setCaptureThreadStats(boolean captureThreadStats) {
      this.captureThreadStats = captureThreadStats;
      this.captureThreadStatsIsSet = true;
    }
    @Override
    public int slowThresholdMillis() { throw new UnsupportedOperationException(); }
    @Override
    public int profilingIntervalMillis() { throw new UnsupportedOperationException(); }
    @Override
    public boolean captureThreadStats() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableTransactionConfig fromJson(Json json) {
    ImmutableTransactionConfig.Builder builder = ImmutableTransactionConfig.builder();
    if (json.slowThresholdMillisIsSet) {
      builder.slowThresholdMillis(json.slowThresholdMillis);
    }
    if (json.profilingIntervalMillisIsSet) {
      builder.profilingIntervalMillis(json.profilingIntervalMillis);
    }
    if (json.captureThreadStatsIsSet) {
      builder.captureThreadStats(json.captureThreadStats);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link TransactionConfig} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable TransactionConfig instance
   */
  public static ImmutableTransactionConfig copyOf(TransactionConfig instance) {
    if (instance instanceof ImmutableTransactionConfig) {
      return (ImmutableTransactionConfig) instance;
    }
    return ImmutableTransactionConfig.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableTransactionConfig ImmutableTransactionConfig}.
   * @return A new ImmutableTransactionConfig builder
   */
  public static ImmutableTransactionConfig.Builder builder() {
    return new ImmutableTransactionConfig.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableTransactionConfig ImmutableTransactionConfig}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_SLOW_THRESHOLD_MILLIS = 0x1L;
    private static final long OPT_BIT_PROFILING_INTERVAL_MILLIS = 0x2L;
    private static final long OPT_BIT_CAPTURE_THREAD_STATS = 0x4L;
    private long optBits;

    private int slowThresholdMillis;
    private int profilingIntervalMillis;
    private boolean captureThreadStats;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code TransactionConfig} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(TransactionConfig instance) {
      Preconditions.checkNotNull(instance, "instance");
      slowThresholdMillis(instance.slowThresholdMillis());
      profilingIntervalMillis(instance.profilingIntervalMillis());
      captureThreadStats(instance.captureThreadStats());
      return this;
    }

    /**
     * Initializes the value for the {@link TransactionConfig#slowThresholdMillis() slowThresholdMillis} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link TransactionConfig#slowThresholdMillis() slowThresholdMillis}.</em>
     * @param slowThresholdMillis The value for slowThresholdMillis 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder slowThresholdMillis(int slowThresholdMillis) {
      this.slowThresholdMillis = slowThresholdMillis;
      optBits |= OPT_BIT_SLOW_THRESHOLD_MILLIS;
      return this;
    }

    /**
     * Initializes the value for the {@link TransactionConfig#profilingIntervalMillis() profilingIntervalMillis} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link TransactionConfig#profilingIntervalMillis() profilingIntervalMillis}.</em>
     * @param profilingIntervalMillis The value for profilingIntervalMillis 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder profilingIntervalMillis(int profilingIntervalMillis) {
      this.profilingIntervalMillis = profilingIntervalMillis;
      optBits |= OPT_BIT_PROFILING_INTERVAL_MILLIS;
      return this;
    }

    /**
     * Initializes the value for the {@link TransactionConfig#captureThreadStats() captureThreadStats} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link TransactionConfig#captureThreadStats() captureThreadStats}.</em>
     * @param captureThreadStats The value for captureThreadStats 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder captureThreadStats(boolean captureThreadStats) {
      this.captureThreadStats = captureThreadStats;
      optBits |= OPT_BIT_CAPTURE_THREAD_STATS;
      return this;
    }

    /**
     * Builds a new {@link ImmutableTransactionConfig ImmutableTransactionConfig}.
     * @return An immutable instance of TransactionConfig
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableTransactionConfig build() {
      return new ImmutableTransactionConfig(this);
    }

    private boolean slowThresholdMillisIsSet() {
      return (optBits & OPT_BIT_SLOW_THRESHOLD_MILLIS) != 0;
    }

    private boolean profilingIntervalMillisIsSet() {
      return (optBits & OPT_BIT_PROFILING_INTERVAL_MILLIS) != 0;
    }

    private boolean captureThreadStatsIsSet() {
      return (optBits & OPT_BIT_CAPTURE_THREAD_STATS) != 0;
    }
  }
}
