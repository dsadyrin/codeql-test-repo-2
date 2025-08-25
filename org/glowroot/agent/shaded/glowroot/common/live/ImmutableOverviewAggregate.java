package org.glowroot.agent.shaded.glowroot.common.live;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Objects;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import org.glowroot.agent.shaded.google.common.collect.ImmutableList;
import org.glowroot.agent.shaded.google.common.collect.Lists;
import org.glowroot.agent.shaded.google.common.primitives.Booleans;
import org.glowroot.agent.shaded.google.common.primitives.Doubles;
import org.glowroot.agent.shaded.google.common.primitives.Longs;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.glowroot.agent.shaded.glowroot.wire.api.model.AggregateOuterClass;

/**
 * Immutable implementation of {@link LiveAggregateRepository.OverviewAggregate}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableOverviewAggregate.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "LiveAggregateRepository.OverviewAggregate"})
@Immutable
public final class ImmutableOverviewAggregate
    implements LiveAggregateRepository.OverviewAggregate {
  private final long captureTime;
  private final double totalDurationNanos;
  private final long transactionCount;
  private final boolean asyncTransactions;
  private final ImmutableList<AggregateOuterClass.Aggregate.Timer> mainThreadRootTimers;
  private final ImmutableList<AggregateOuterClass.Aggregate.Timer> auxThreadRootTimers;
  private final ImmutableList<AggregateOuterClass.Aggregate.Timer> asyncTimers;
  private final @Nullable AggregateOuterClass.Aggregate.ThreadStats mainThreadStats;
  private final @Nullable AggregateOuterClass.Aggregate.ThreadStats auxThreadStats;

  private ImmutableOverviewAggregate(
      long captureTime,
      double totalDurationNanos,
      long transactionCount,
      boolean asyncTransactions,
      ImmutableList<AggregateOuterClass.Aggregate.Timer> mainThreadRootTimers,
      ImmutableList<AggregateOuterClass.Aggregate.Timer> auxThreadRootTimers,
      ImmutableList<AggregateOuterClass.Aggregate.Timer> asyncTimers,
      @Nullable AggregateOuterClass.Aggregate.ThreadStats mainThreadStats,
      @Nullable AggregateOuterClass.Aggregate.ThreadStats auxThreadStats) {
    this.captureTime = captureTime;
    this.totalDurationNanos = totalDurationNanos;
    this.transactionCount = transactionCount;
    this.asyncTransactions = asyncTransactions;
    this.mainThreadRootTimers = mainThreadRootTimers;
    this.auxThreadRootTimers = auxThreadRootTimers;
    this.asyncTimers = asyncTimers;
    this.mainThreadStats = mainThreadStats;
    this.auxThreadStats = auxThreadStats;
  }

  /**
   * @return The value of the {@code captureTime} attribute
   */
  @JsonProperty("captureTime")
  @Override
  public long captureTime() {
    return captureTime;
  }

  /**
   * @return The value of the {@code totalDurationNanos} attribute
   */
  @JsonProperty("totalDurationNanos")
  @Override
  public double totalDurationNanos() {
    return totalDurationNanos;
  }

  /**
   * @return The value of the {@code transactionCount} attribute
   */
  @JsonProperty("transactionCount")
  @Override
  public long transactionCount() {
    return transactionCount;
  }

  /**
   * @return The value of the {@code asyncTransactions} attribute
   */
  @JsonProperty("asyncTransactions")
  @Override
  public boolean asyncTransactions() {
    return asyncTransactions;
  }

  /**
   * @return The value of the {@code mainThreadRootTimers} attribute
   */
  @JsonProperty("mainThreadRootTimers")
  @Override
  public ImmutableList<AggregateOuterClass.Aggregate.Timer> mainThreadRootTimers() {
    return mainThreadRootTimers;
  }

  /**
   * @return The value of the {@code auxThreadRootTimers} attribute
   */
  @JsonProperty("auxThreadRootTimers")
  @Override
  public ImmutableList<AggregateOuterClass.Aggregate.Timer> auxThreadRootTimers() {
    return auxThreadRootTimers;
  }

  /**
   * @return The value of the {@code asyncTimers} attribute
   */
  @JsonProperty("asyncTimers")
  @Override
  public ImmutableList<AggregateOuterClass.Aggregate.Timer> asyncTimers() {
    return asyncTimers;
  }

  /**
   * @return The value of the {@code mainThreadStats} attribute
   */
  @JsonProperty("mainThreadStats")
  @Override
  public @Nullable AggregateOuterClass.Aggregate.ThreadStats mainThreadStats() {
    return mainThreadStats;
  }

  /**
   * @return The value of the {@code auxThreadStats} attribute
   */
  @JsonProperty("auxThreadStats")
  @Override
  public @Nullable AggregateOuterClass.Aggregate.ThreadStats auxThreadStats() {
    return auxThreadStats;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LiveAggregateRepository.OverviewAggregate#captureTime() captureTime} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for captureTime
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableOverviewAggregate withCaptureTime(long value) {
    if (this.captureTime == value) return this;
    return new ImmutableOverviewAggregate(
        value,
        this.totalDurationNanos,
        this.transactionCount,
        this.asyncTransactions,
        this.mainThreadRootTimers,
        this.auxThreadRootTimers,
        this.asyncTimers,
        this.mainThreadStats,
        this.auxThreadStats);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LiveAggregateRepository.OverviewAggregate#totalDurationNanos() totalDurationNanos} attribute.
   * A value strict bits equality used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for totalDurationNanos
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableOverviewAggregate withTotalDurationNanos(double value) {
    if (Double.doubleToLongBits(this.totalDurationNanos) == Double.doubleToLongBits(value)) return this;
    return new ImmutableOverviewAggregate(
        this.captureTime,
        value,
        this.transactionCount,
        this.asyncTransactions,
        this.mainThreadRootTimers,
        this.auxThreadRootTimers,
        this.asyncTimers,
        this.mainThreadStats,
        this.auxThreadStats);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LiveAggregateRepository.OverviewAggregate#transactionCount() transactionCount} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for transactionCount
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableOverviewAggregate withTransactionCount(long value) {
    if (this.transactionCount == value) return this;
    return new ImmutableOverviewAggregate(
        this.captureTime,
        this.totalDurationNanos,
        value,
        this.asyncTransactions,
        this.mainThreadRootTimers,
        this.auxThreadRootTimers,
        this.asyncTimers,
        this.mainThreadStats,
        this.auxThreadStats);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LiveAggregateRepository.OverviewAggregate#asyncTransactions() asyncTransactions} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for asyncTransactions
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableOverviewAggregate withAsyncTransactions(boolean value) {
    if (this.asyncTransactions == value) return this;
    return new ImmutableOverviewAggregate(
        this.captureTime,
        this.totalDurationNanos,
        this.transactionCount,
        value,
        this.mainThreadRootTimers,
        this.auxThreadRootTimers,
        this.asyncTimers,
        this.mainThreadStats,
        this.auxThreadStats);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link LiveAggregateRepository.OverviewAggregate#mainThreadRootTimers() mainThreadRootTimers}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOverviewAggregate withMainThreadRootTimers(AggregateOuterClass.Aggregate.Timer... elements) {
    ImmutableList<AggregateOuterClass.Aggregate.Timer> newValue = ImmutableList.copyOf(elements);
    return new ImmutableOverviewAggregate(
        this.captureTime,
        this.totalDurationNanos,
        this.transactionCount,
        this.asyncTransactions,
        newValue,
        this.auxThreadRootTimers,
        this.asyncTimers,
        this.mainThreadStats,
        this.auxThreadStats);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link LiveAggregateRepository.OverviewAggregate#mainThreadRootTimers() mainThreadRootTimers}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of mainThreadRootTimers elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOverviewAggregate withMainThreadRootTimers(Iterable<? extends AggregateOuterClass.Aggregate.Timer> elements) {
    if (this.mainThreadRootTimers == elements) return this;
    ImmutableList<AggregateOuterClass.Aggregate.Timer> newValue = ImmutableList.copyOf(elements);
    return new ImmutableOverviewAggregate(
        this.captureTime,
        this.totalDurationNanos,
        this.transactionCount,
        this.asyncTransactions,
        newValue,
        this.auxThreadRootTimers,
        this.asyncTimers,
        this.mainThreadStats,
        this.auxThreadStats);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link LiveAggregateRepository.OverviewAggregate#auxThreadRootTimers() auxThreadRootTimers}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOverviewAggregate withAuxThreadRootTimers(AggregateOuterClass.Aggregate.Timer... elements) {
    ImmutableList<AggregateOuterClass.Aggregate.Timer> newValue = ImmutableList.copyOf(elements);
    return new ImmutableOverviewAggregate(
        this.captureTime,
        this.totalDurationNanos,
        this.transactionCount,
        this.asyncTransactions,
        this.mainThreadRootTimers,
        newValue,
        this.asyncTimers,
        this.mainThreadStats,
        this.auxThreadStats);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link LiveAggregateRepository.OverviewAggregate#auxThreadRootTimers() auxThreadRootTimers}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of auxThreadRootTimers elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOverviewAggregate withAuxThreadRootTimers(Iterable<? extends AggregateOuterClass.Aggregate.Timer> elements) {
    if (this.auxThreadRootTimers == elements) return this;
    ImmutableList<AggregateOuterClass.Aggregate.Timer> newValue = ImmutableList.copyOf(elements);
    return new ImmutableOverviewAggregate(
        this.captureTime,
        this.totalDurationNanos,
        this.transactionCount,
        this.asyncTransactions,
        this.mainThreadRootTimers,
        newValue,
        this.asyncTimers,
        this.mainThreadStats,
        this.auxThreadStats);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link LiveAggregateRepository.OverviewAggregate#asyncTimers() asyncTimers}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOverviewAggregate withAsyncTimers(AggregateOuterClass.Aggregate.Timer... elements) {
    ImmutableList<AggregateOuterClass.Aggregate.Timer> newValue = ImmutableList.copyOf(elements);
    return new ImmutableOverviewAggregate(
        this.captureTime,
        this.totalDurationNanos,
        this.transactionCount,
        this.asyncTransactions,
        this.mainThreadRootTimers,
        this.auxThreadRootTimers,
        newValue,
        this.mainThreadStats,
        this.auxThreadStats);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link LiveAggregateRepository.OverviewAggregate#asyncTimers() asyncTimers}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of asyncTimers elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOverviewAggregate withAsyncTimers(Iterable<? extends AggregateOuterClass.Aggregate.Timer> elements) {
    if (this.asyncTimers == elements) return this;
    ImmutableList<AggregateOuterClass.Aggregate.Timer> newValue = ImmutableList.copyOf(elements);
    return new ImmutableOverviewAggregate(
        this.captureTime,
        this.totalDurationNanos,
        this.transactionCount,
        this.asyncTransactions,
        this.mainThreadRootTimers,
        this.auxThreadRootTimers,
        newValue,
        this.mainThreadStats,
        this.auxThreadStats);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LiveAggregateRepository.OverviewAggregate#mainThreadStats() mainThreadStats} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for mainThreadStats (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableOverviewAggregate withMainThreadStats(@Nullable AggregateOuterClass.Aggregate.ThreadStats value) {
    if (this.mainThreadStats == value) return this;
    return new ImmutableOverviewAggregate(
        this.captureTime,
        this.totalDurationNanos,
        this.transactionCount,
        this.asyncTransactions,
        this.mainThreadRootTimers,
        this.auxThreadRootTimers,
        this.asyncTimers,
        value,
        this.auxThreadStats);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LiveAggregateRepository.OverviewAggregate#auxThreadStats() auxThreadStats} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for auxThreadStats (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableOverviewAggregate withAuxThreadStats(@Nullable AggregateOuterClass.Aggregate.ThreadStats value) {
    if (this.auxThreadStats == value) return this;
    return new ImmutableOverviewAggregate(
        this.captureTime,
        this.totalDurationNanos,
        this.transactionCount,
        this.asyncTransactions,
        this.mainThreadRootTimers,
        this.auxThreadRootTimers,
        this.asyncTimers,
        this.mainThreadStats,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableOverviewAggregate} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableOverviewAggregate
        && equalTo((ImmutableOverviewAggregate) another);
  }

  private boolean equalTo(ImmutableOverviewAggregate another) {
    return captureTime == another.captureTime
        && Double.doubleToLongBits(totalDurationNanos) == Double.doubleToLongBits(another.totalDurationNanos)
        && transactionCount == another.transactionCount
        && asyncTransactions == another.asyncTransactions
        && mainThreadRootTimers.equals(another.mainThreadRootTimers)
        && auxThreadRootTimers.equals(another.auxThreadRootTimers)
        && asyncTimers.equals(another.asyncTimers)
        && Objects.equal(mainThreadStats, another.mainThreadStats)
        && Objects.equal(auxThreadStats, another.auxThreadStats);
  }

  /**
   * Computes a hash code from attributes: {@code captureTime}, {@code totalDurationNanos}, {@code transactionCount}, {@code asyncTransactions}, {@code mainThreadRootTimers}, {@code auxThreadRootTimers}, {@code asyncTimers}, {@code mainThreadStats}, {@code auxThreadStats}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Longs.hashCode(captureTime);
    h += (h << 5) + Doubles.hashCode(totalDurationNanos);
    h += (h << 5) + Longs.hashCode(transactionCount);
    h += (h << 5) + Booleans.hashCode(asyncTransactions);
    h += (h << 5) + mainThreadRootTimers.hashCode();
    h += (h << 5) + auxThreadRootTimers.hashCode();
    h += (h << 5) + asyncTimers.hashCode();
    h += (h << 5) + Objects.hashCode(mainThreadStats);
    h += (h << 5) + Objects.hashCode(auxThreadStats);
    return h;
  }

  /**
   * Prints the immutable value {@code OverviewAggregate} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("OverviewAggregate")
        .omitNullValues()
        .add("captureTime", captureTime)
        .add("totalDurationNanos", totalDurationNanos)
        .add("transactionCount", transactionCount)
        .add("asyncTransactions", asyncTransactions)
        .add("mainThreadRootTimers", mainThreadRootTimers)
        .add("auxThreadRootTimers", auxThreadRootTimers)
        .add("asyncTimers", asyncTimers)
        .add("mainThreadStats", mainThreadStats)
        .add("auxThreadStats", auxThreadStats)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements LiveAggregateRepository.OverviewAggregate {
    long captureTime;
    boolean captureTimeIsSet;
    double totalDurationNanos;
    boolean totalDurationNanosIsSet;
    long transactionCount;
    boolean transactionCountIsSet;
    boolean asyncTransactions;
    boolean asyncTransactionsIsSet;
    List<AggregateOuterClass.Aggregate.Timer> mainThreadRootTimers = ImmutableList.of();
    List<AggregateOuterClass.Aggregate.Timer> auxThreadRootTimers = ImmutableList.of();
    List<AggregateOuterClass.Aggregate.Timer> asyncTimers = ImmutableList.of();
    @Nullable AggregateOuterClass.Aggregate.ThreadStats mainThreadStats;
    @Nullable AggregateOuterClass.Aggregate.ThreadStats auxThreadStats;
    @JsonProperty("captureTime")
    public void setCaptureTime(long captureTime) {
      this.captureTime = captureTime;
      this.captureTimeIsSet = true;
    }
    @JsonProperty("totalDurationNanos")
    public void setTotalDurationNanos(double totalDurationNanos) {
      this.totalDurationNanos = totalDurationNanos;
      this.totalDurationNanosIsSet = true;
    }
    @JsonProperty("transactionCount")
    public void setTransactionCount(long transactionCount) {
      this.transactionCount = transactionCount;
      this.transactionCountIsSet = true;
    }
    @JsonProperty("asyncTransactions")
    public void setAsyncTransactions(boolean asyncTransactions) {
      this.asyncTransactions = asyncTransactions;
      this.asyncTransactionsIsSet = true;
    }
    @JsonProperty("mainThreadRootTimers")
    public void setMainThreadRootTimers(List<AggregateOuterClass.Aggregate.Timer> mainThreadRootTimers) {
      this.mainThreadRootTimers = mainThreadRootTimers;
    }
    @JsonProperty("auxThreadRootTimers")
    public void setAuxThreadRootTimers(List<AggregateOuterClass.Aggregate.Timer> auxThreadRootTimers) {
      this.auxThreadRootTimers = auxThreadRootTimers;
    }
    @JsonProperty("asyncTimers")
    public void setAsyncTimers(List<AggregateOuterClass.Aggregate.Timer> asyncTimers) {
      this.asyncTimers = asyncTimers;
    }
    @JsonProperty("mainThreadStats")
    public void setMainThreadStats(@Nullable AggregateOuterClass.Aggregate.ThreadStats mainThreadStats) {
      this.mainThreadStats = mainThreadStats;
    }
    @JsonProperty("auxThreadStats")
    public void setAuxThreadStats(@Nullable AggregateOuterClass.Aggregate.ThreadStats auxThreadStats) {
      this.auxThreadStats = auxThreadStats;
    }
    @Override
    public long captureTime() { throw new UnsupportedOperationException(); }
    @Override
    public double totalDurationNanos() { throw new UnsupportedOperationException(); }
    @Override
    public long transactionCount() { throw new UnsupportedOperationException(); }
    @Override
    public boolean asyncTransactions() { throw new UnsupportedOperationException(); }
    @Override
    public List<AggregateOuterClass.Aggregate.Timer> mainThreadRootTimers() { throw new UnsupportedOperationException(); }
    @Override
    public List<AggregateOuterClass.Aggregate.Timer> auxThreadRootTimers() { throw new UnsupportedOperationException(); }
    @Override
    public List<AggregateOuterClass.Aggregate.Timer> asyncTimers() { throw new UnsupportedOperationException(); }
    @Override
    public AggregateOuterClass.Aggregate.ThreadStats mainThreadStats() { throw new UnsupportedOperationException(); }
    @Override
    public AggregateOuterClass.Aggregate.ThreadStats auxThreadStats() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableOverviewAggregate fromJson(Json json) {
    ImmutableOverviewAggregate.Builder builder = ImmutableOverviewAggregate.builder();
    if (json.captureTimeIsSet) {
      builder.captureTime(json.captureTime);
    }
    if (json.totalDurationNanosIsSet) {
      builder.totalDurationNanos(json.totalDurationNanos);
    }
    if (json.transactionCountIsSet) {
      builder.transactionCount(json.transactionCount);
    }
    if (json.asyncTransactionsIsSet) {
      builder.asyncTransactions(json.asyncTransactions);
    }
    if (json.mainThreadRootTimers != null) {
      builder.addAllMainThreadRootTimers(json.mainThreadRootTimers);
    }
    if (json.auxThreadRootTimers != null) {
      builder.addAllAuxThreadRootTimers(json.auxThreadRootTimers);
    }
    if (json.asyncTimers != null) {
      builder.addAllAsyncTimers(json.asyncTimers);
    }
    if (json.mainThreadStats != null) {
      builder.mainThreadStats(json.mainThreadStats);
    }
    if (json.auxThreadStats != null) {
      builder.auxThreadStats(json.auxThreadStats);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link LiveAggregateRepository.OverviewAggregate} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable OverviewAggregate instance
   */
  public static ImmutableOverviewAggregate copyOf(LiveAggregateRepository.OverviewAggregate instance) {
    if (instance instanceof ImmutableOverviewAggregate) {
      return (ImmutableOverviewAggregate) instance;
    }
    return ImmutableOverviewAggregate.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableOverviewAggregate ImmutableOverviewAggregate}.
   * @return A new ImmutableOverviewAggregate builder
   */
  public static ImmutableOverviewAggregate.Builder builder() {
    return new ImmutableOverviewAggregate.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableOverviewAggregate ImmutableOverviewAggregate}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_CAPTURE_TIME = 0x1L;
    private static final long INIT_BIT_TOTAL_DURATION_NANOS = 0x2L;
    private static final long INIT_BIT_TRANSACTION_COUNT = 0x4L;
    private static final long INIT_BIT_ASYNC_TRANSACTIONS = 0x8L;
    private long initBits = 0xfL;

    private long captureTime;
    private double totalDurationNanos;
    private long transactionCount;
    private boolean asyncTransactions;
    private ImmutableList.Builder<AggregateOuterClass.Aggregate.Timer> mainThreadRootTimers = ImmutableList.builder();
    private ImmutableList.Builder<AggregateOuterClass.Aggregate.Timer> auxThreadRootTimers = ImmutableList.builder();
    private ImmutableList.Builder<AggregateOuterClass.Aggregate.Timer> asyncTimers = ImmutableList.builder();
    private @Nullable AggregateOuterClass.Aggregate.ThreadStats mainThreadStats;
    private @Nullable AggregateOuterClass.Aggregate.ThreadStats auxThreadStats;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code OverviewAggregate} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(LiveAggregateRepository.OverviewAggregate instance) {
      Preconditions.checkNotNull(instance, "instance");
      captureTime(instance.captureTime());
      totalDurationNanos(instance.totalDurationNanos());
      transactionCount(instance.transactionCount());
      asyncTransactions(instance.asyncTransactions());
      addAllMainThreadRootTimers(instance.mainThreadRootTimers());
      addAllAuxThreadRootTimers(instance.auxThreadRootTimers());
      addAllAsyncTimers(instance.asyncTimers());
      @Nullable AggregateOuterClass.Aggregate.ThreadStats mainThreadStatsValue = instance.mainThreadStats();
      if (mainThreadStatsValue != null) {
        mainThreadStats(mainThreadStatsValue);
      }
      @Nullable AggregateOuterClass.Aggregate.ThreadStats auxThreadStatsValue = instance.auxThreadStats();
      if (auxThreadStatsValue != null) {
        auxThreadStats(auxThreadStatsValue);
      }
      return this;
    }

    /**
     * Initializes the value for the {@link LiveAggregateRepository.OverviewAggregate#captureTime() captureTime} attribute.
     * @param captureTime The value for captureTime 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder captureTime(long captureTime) {
      this.captureTime = captureTime;
      initBits &= ~INIT_BIT_CAPTURE_TIME;
      return this;
    }

    /**
     * Initializes the value for the {@link LiveAggregateRepository.OverviewAggregate#totalDurationNanos() totalDurationNanos} attribute.
     * @param totalDurationNanos The value for totalDurationNanos 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder totalDurationNanos(double totalDurationNanos) {
      this.totalDurationNanos = totalDurationNanos;
      initBits &= ~INIT_BIT_TOTAL_DURATION_NANOS;
      return this;
    }

    /**
     * Initializes the value for the {@link LiveAggregateRepository.OverviewAggregate#transactionCount() transactionCount} attribute.
     * @param transactionCount The value for transactionCount 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder transactionCount(long transactionCount) {
      this.transactionCount = transactionCount;
      initBits &= ~INIT_BIT_TRANSACTION_COUNT;
      return this;
    }

    /**
     * Initializes the value for the {@link LiveAggregateRepository.OverviewAggregate#asyncTransactions() asyncTransactions} attribute.
     * @param asyncTransactions The value for asyncTransactions 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder asyncTransactions(boolean asyncTransactions) {
      this.asyncTransactions = asyncTransactions;
      initBits &= ~INIT_BIT_ASYNC_TRANSACTIONS;
      return this;
    }

    /**
     * Adds one element to {@link LiveAggregateRepository.OverviewAggregate#mainThreadRootTimers() mainThreadRootTimers} list.
     * @param element A mainThreadRootTimers element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addMainThreadRootTimers(AggregateOuterClass.Aggregate.Timer element) {
      this.mainThreadRootTimers.add(element);
      return this;
    }

    /**
     * Adds elements to {@link LiveAggregateRepository.OverviewAggregate#mainThreadRootTimers() mainThreadRootTimers} list.
     * @param elements An array of mainThreadRootTimers elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addMainThreadRootTimers(AggregateOuterClass.Aggregate.Timer... elements) {
      this.mainThreadRootTimers.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link LiveAggregateRepository.OverviewAggregate#mainThreadRootTimers() mainThreadRootTimers} list.
     * @param elements An iterable of mainThreadRootTimers elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder mainThreadRootTimers(Iterable<? extends AggregateOuterClass.Aggregate.Timer> elements) {
      this.mainThreadRootTimers = ImmutableList.builder();
      return addAllMainThreadRootTimers(elements);
    }

    /**
     * Adds elements to {@link LiveAggregateRepository.OverviewAggregate#mainThreadRootTimers() mainThreadRootTimers} list.
     * @param elements An iterable of mainThreadRootTimers elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllMainThreadRootTimers(Iterable<? extends AggregateOuterClass.Aggregate.Timer> elements) {
      this.mainThreadRootTimers.addAll(elements);
      return this;
    }

    /**
     * Adds one element to {@link LiveAggregateRepository.OverviewAggregate#auxThreadRootTimers() auxThreadRootTimers} list.
     * @param element A auxThreadRootTimers element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAuxThreadRootTimers(AggregateOuterClass.Aggregate.Timer element) {
      this.auxThreadRootTimers.add(element);
      return this;
    }

    /**
     * Adds elements to {@link LiveAggregateRepository.OverviewAggregate#auxThreadRootTimers() auxThreadRootTimers} list.
     * @param elements An array of auxThreadRootTimers elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAuxThreadRootTimers(AggregateOuterClass.Aggregate.Timer... elements) {
      this.auxThreadRootTimers.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link LiveAggregateRepository.OverviewAggregate#auxThreadRootTimers() auxThreadRootTimers} list.
     * @param elements An iterable of auxThreadRootTimers elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder auxThreadRootTimers(Iterable<? extends AggregateOuterClass.Aggregate.Timer> elements) {
      this.auxThreadRootTimers = ImmutableList.builder();
      return addAllAuxThreadRootTimers(elements);
    }

    /**
     * Adds elements to {@link LiveAggregateRepository.OverviewAggregate#auxThreadRootTimers() auxThreadRootTimers} list.
     * @param elements An iterable of auxThreadRootTimers elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllAuxThreadRootTimers(Iterable<? extends AggregateOuterClass.Aggregate.Timer> elements) {
      this.auxThreadRootTimers.addAll(elements);
      return this;
    }

    /**
     * Adds one element to {@link LiveAggregateRepository.OverviewAggregate#asyncTimers() asyncTimers} list.
     * @param element A asyncTimers element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAsyncTimers(AggregateOuterClass.Aggregate.Timer element) {
      this.asyncTimers.add(element);
      return this;
    }

    /**
     * Adds elements to {@link LiveAggregateRepository.OverviewAggregate#asyncTimers() asyncTimers} list.
     * @param elements An array of asyncTimers elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAsyncTimers(AggregateOuterClass.Aggregate.Timer... elements) {
      this.asyncTimers.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link LiveAggregateRepository.OverviewAggregate#asyncTimers() asyncTimers} list.
     * @param elements An iterable of asyncTimers elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder asyncTimers(Iterable<? extends AggregateOuterClass.Aggregate.Timer> elements) {
      this.asyncTimers = ImmutableList.builder();
      return addAllAsyncTimers(elements);
    }

    /**
     * Adds elements to {@link LiveAggregateRepository.OverviewAggregate#asyncTimers() asyncTimers} list.
     * @param elements An iterable of asyncTimers elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllAsyncTimers(Iterable<? extends AggregateOuterClass.Aggregate.Timer> elements) {
      this.asyncTimers.addAll(elements);
      return this;
    }

    /**
     * Initializes the value for the {@link LiveAggregateRepository.OverviewAggregate#mainThreadStats() mainThreadStats} attribute.
     * @param mainThreadStats The value for mainThreadStats (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder mainThreadStats(@Nullable AggregateOuterClass.Aggregate.ThreadStats mainThreadStats) {
      this.mainThreadStats = mainThreadStats;
      return this;
    }

    /**
     * Initializes the value for the {@link LiveAggregateRepository.OverviewAggregate#auxThreadStats() auxThreadStats} attribute.
     * @param auxThreadStats The value for auxThreadStats (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder auxThreadStats(@Nullable AggregateOuterClass.Aggregate.ThreadStats auxThreadStats) {
      this.auxThreadStats = auxThreadStats;
      return this;
    }

    /**
     * Builds a new {@link ImmutableOverviewAggregate ImmutableOverviewAggregate}.
     * @return An immutable instance of OverviewAggregate
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableOverviewAggregate build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableOverviewAggregate(
          captureTime,
          totalDurationNanos,
          transactionCount,
          asyncTransactions,
          mainThreadRootTimers.build(),
          auxThreadRootTimers.build(),
          asyncTimers.build(),
          mainThreadStats,
          auxThreadStats);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_CAPTURE_TIME) != 0) attributes.add("captureTime");
      if ((initBits & INIT_BIT_TOTAL_DURATION_NANOS) != 0) attributes.add("totalDurationNanos");
      if ((initBits & INIT_BIT_TRANSACTION_COUNT) != 0) attributes.add("transactionCount");
      if ((initBits & INIT_BIT_ASYNC_TRANSACTIONS) != 0) attributes.add("asyncTransactions");
      return "Cannot build OverviewAggregate, some of required attributes are not set " + attributes;
    }
  }
}
