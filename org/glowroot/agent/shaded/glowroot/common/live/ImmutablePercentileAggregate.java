package org.glowroot.agent.shaded.glowroot.common.live;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import org.glowroot.agent.shaded.google.common.collect.Lists;
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
 * Immutable implementation of {@link LiveAggregateRepository.PercentileAggregate}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePercentileAggregate.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "LiveAggregateRepository.PercentileAggregate"})
@Immutable
public final class ImmutablePercentileAggregate
    implements LiveAggregateRepository.PercentileAggregate {
  private final long captureTime;
  private final double totalDurationNanos;
  private final long transactionCount;
  private final AggregateOuterClass.Aggregate.Histogram durationNanosHistogram;

  private ImmutablePercentileAggregate(
      long captureTime,
      double totalDurationNanos,
      long transactionCount,
      AggregateOuterClass.Aggregate.Histogram durationNanosHistogram) {
    this.captureTime = captureTime;
    this.totalDurationNanos = totalDurationNanos;
    this.transactionCount = transactionCount;
    this.durationNanosHistogram = durationNanosHistogram;
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
   * @return The value of the {@code durationNanosHistogram} attribute
   */
  @JsonProperty("durationNanosHistogram")
  @Override
  public AggregateOuterClass.Aggregate.Histogram durationNanosHistogram() {
    return durationNanosHistogram;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LiveAggregateRepository.PercentileAggregate#captureTime() captureTime} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for captureTime
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePercentileAggregate withCaptureTime(long value) {
    if (this.captureTime == value) return this;
    return new ImmutablePercentileAggregate(value, this.totalDurationNanos, this.transactionCount, this.durationNanosHistogram);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LiveAggregateRepository.PercentileAggregate#totalDurationNanos() totalDurationNanos} attribute.
   * A value strict bits equality used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for totalDurationNanos
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePercentileAggregate withTotalDurationNanos(double value) {
    if (Double.doubleToLongBits(this.totalDurationNanos) == Double.doubleToLongBits(value)) return this;
    return new ImmutablePercentileAggregate(this.captureTime, value, this.transactionCount, this.durationNanosHistogram);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LiveAggregateRepository.PercentileAggregate#transactionCount() transactionCount} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for transactionCount
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePercentileAggregate withTransactionCount(long value) {
    if (this.transactionCount == value) return this;
    return new ImmutablePercentileAggregate(this.captureTime, this.totalDurationNanos, value, this.durationNanosHistogram);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LiveAggregateRepository.PercentileAggregate#durationNanosHistogram() durationNanosHistogram} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for durationNanosHistogram
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePercentileAggregate withDurationNanosHistogram(AggregateOuterClass.Aggregate.Histogram value) {
    if (this.durationNanosHistogram == value) return this;
    AggregateOuterClass.Aggregate.Histogram newValue = Preconditions.checkNotNull(value, "durationNanosHistogram");
    return new ImmutablePercentileAggregate(this.captureTime, this.totalDurationNanos, this.transactionCount, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePercentileAggregate} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePercentileAggregate
        && equalTo((ImmutablePercentileAggregate) another);
  }

  private boolean equalTo(ImmutablePercentileAggregate another) {
    return captureTime == another.captureTime
        && Double.doubleToLongBits(totalDurationNanos) == Double.doubleToLongBits(another.totalDurationNanos)
        && transactionCount == another.transactionCount
        && durationNanosHistogram.equals(another.durationNanosHistogram);
  }

  /**
   * Computes a hash code from attributes: {@code captureTime}, {@code totalDurationNanos}, {@code transactionCount}, {@code durationNanosHistogram}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Longs.hashCode(captureTime);
    h += (h << 5) + Doubles.hashCode(totalDurationNanos);
    h += (h << 5) + Longs.hashCode(transactionCount);
    h += (h << 5) + durationNanosHistogram.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code PercentileAggregate} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("PercentileAggregate")
        .omitNullValues()
        .add("captureTime", captureTime)
        .add("totalDurationNanos", totalDurationNanos)
        .add("transactionCount", transactionCount)
        .add("durationNanosHistogram", durationNanosHistogram)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements LiveAggregateRepository.PercentileAggregate {
    long captureTime;
    boolean captureTimeIsSet;
    double totalDurationNanos;
    boolean totalDurationNanosIsSet;
    long transactionCount;
    boolean transactionCountIsSet;
    @Nullable AggregateOuterClass.Aggregate.Histogram durationNanosHistogram;
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
    @JsonProperty("durationNanosHistogram")
    public void setDurationNanosHistogram(AggregateOuterClass.Aggregate.Histogram durationNanosHistogram) {
      this.durationNanosHistogram = durationNanosHistogram;
    }
    @Override
    public long captureTime() { throw new UnsupportedOperationException(); }
    @Override
    public double totalDurationNanos() { throw new UnsupportedOperationException(); }
    @Override
    public long transactionCount() { throw new UnsupportedOperationException(); }
    @Override
    public AggregateOuterClass.Aggregate.Histogram durationNanosHistogram() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutablePercentileAggregate fromJson(Json json) {
    ImmutablePercentileAggregate.Builder builder = ImmutablePercentileAggregate.builder();
    if (json.captureTimeIsSet) {
      builder.captureTime(json.captureTime);
    }
    if (json.totalDurationNanosIsSet) {
      builder.totalDurationNanos(json.totalDurationNanos);
    }
    if (json.transactionCountIsSet) {
      builder.transactionCount(json.transactionCount);
    }
    if (json.durationNanosHistogram != null) {
      builder.durationNanosHistogram(json.durationNanosHistogram);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link LiveAggregateRepository.PercentileAggregate} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable PercentileAggregate instance
   */
  public static ImmutablePercentileAggregate copyOf(LiveAggregateRepository.PercentileAggregate instance) {
    if (instance instanceof ImmutablePercentileAggregate) {
      return (ImmutablePercentileAggregate) instance;
    }
    return ImmutablePercentileAggregate.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutablePercentileAggregate ImmutablePercentileAggregate}.
   * @return A new ImmutablePercentileAggregate builder
   */
  public static ImmutablePercentileAggregate.Builder builder() {
    return new ImmutablePercentileAggregate.Builder();
  }

  /**
   * Builds instances of type {@link ImmutablePercentileAggregate ImmutablePercentileAggregate}.
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
    private static final long INIT_BIT_DURATION_NANOS_HISTOGRAM = 0x8L;
    private long initBits = 0xfL;

    private long captureTime;
    private double totalDurationNanos;
    private long transactionCount;
    private @Nullable AggregateOuterClass.Aggregate.Histogram durationNanosHistogram;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code PercentileAggregate} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(LiveAggregateRepository.PercentileAggregate instance) {
      Preconditions.checkNotNull(instance, "instance");
      captureTime(instance.captureTime());
      totalDurationNanos(instance.totalDurationNanos());
      transactionCount(instance.transactionCount());
      durationNanosHistogram(instance.durationNanosHistogram());
      return this;
    }

    /**
     * Initializes the value for the {@link LiveAggregateRepository.PercentileAggregate#captureTime() captureTime} attribute.
     * @param captureTime The value for captureTime 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder captureTime(long captureTime) {
      this.captureTime = captureTime;
      initBits &= ~INIT_BIT_CAPTURE_TIME;
      return this;
    }

    /**
     * Initializes the value for the {@link LiveAggregateRepository.PercentileAggregate#totalDurationNanos() totalDurationNanos} attribute.
     * @param totalDurationNanos The value for totalDurationNanos 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder totalDurationNanos(double totalDurationNanos) {
      this.totalDurationNanos = totalDurationNanos;
      initBits &= ~INIT_BIT_TOTAL_DURATION_NANOS;
      return this;
    }

    /**
     * Initializes the value for the {@link LiveAggregateRepository.PercentileAggregate#transactionCount() transactionCount} attribute.
     * @param transactionCount The value for transactionCount 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder transactionCount(long transactionCount) {
      this.transactionCount = transactionCount;
      initBits &= ~INIT_BIT_TRANSACTION_COUNT;
      return this;
    }

    /**
     * Initializes the value for the {@link LiveAggregateRepository.PercentileAggregate#durationNanosHistogram() durationNanosHistogram} attribute.
     * @param durationNanosHistogram The value for durationNanosHistogram 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder durationNanosHistogram(AggregateOuterClass.Aggregate.Histogram durationNanosHistogram) {
      this.durationNanosHistogram = Preconditions.checkNotNull(durationNanosHistogram, "durationNanosHistogram");
      initBits &= ~INIT_BIT_DURATION_NANOS_HISTOGRAM;
      return this;
    }

    /**
     * Builds a new {@link ImmutablePercentileAggregate ImmutablePercentileAggregate}.
     * @return An immutable instance of PercentileAggregate
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutablePercentileAggregate build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutablePercentileAggregate(captureTime, totalDurationNanos, transactionCount, durationNanosHistogram);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_CAPTURE_TIME) != 0) attributes.add("captureTime");
      if ((initBits & INIT_BIT_TOTAL_DURATION_NANOS) != 0) attributes.add("totalDurationNanos");
      if ((initBits & INIT_BIT_TRANSACTION_COUNT) != 0) attributes.add("transactionCount");
      if ((initBits & INIT_BIT_DURATION_NANOS_HISTOGRAM) != 0) attributes.add("durationNanosHistogram");
      return "Cannot build PercentileAggregate, some of required attributes are not set " + attributes;
    }
  }
}
