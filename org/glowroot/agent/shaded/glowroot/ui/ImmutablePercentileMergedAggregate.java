package org.glowroot.agent.shaded.glowroot.ui;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import org.glowroot.agent.shaded.google.common.collect.ImmutableList;
import org.glowroot.agent.shaded.google.common.collect.Lists;
import org.glowroot.agent.shaded.google.common.primitives.Doubles;
import org.glowroot.agent.shaded.google.common.primitives.Longs;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link TransactionJsonService.PercentileMergedAggregate}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePercentileMergedAggregate.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "TransactionJsonService.PercentileMergedAggregate"})
@Immutable
final class ImmutablePercentileMergedAggregate
    implements TransactionJsonService.PercentileMergedAggregate {
  private final long transactionCount;
  private final double totalDurationNanos;
  private final ImmutableList<AggregateMerging.PercentileValue> percentileValues;

  private ImmutablePercentileMergedAggregate(
      long transactionCount,
      double totalDurationNanos,
      ImmutableList<AggregateMerging.PercentileValue> percentileValues) {
    this.transactionCount = transactionCount;
    this.totalDurationNanos = totalDurationNanos;
    this.percentileValues = percentileValues;
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
   * @return The value of the {@code totalDurationNanos} attribute
   */
  @JsonProperty("totalDurationNanos")
  @Override
  public double totalDurationNanos() {
    return totalDurationNanos;
  }

  /**
   * @return The value of the {@code percentileValues} attribute
   */
  @JsonProperty("percentileValues")
  @Override
  public ImmutableList<AggregateMerging.PercentileValue> percentileValues() {
    return percentileValues;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TransactionJsonService.PercentileMergedAggregate#transactionCount() transactionCount} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for transactionCount
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePercentileMergedAggregate withTransactionCount(long value) {
    if (this.transactionCount == value) return this;
    return new ImmutablePercentileMergedAggregate(value, this.totalDurationNanos, this.percentileValues);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TransactionJsonService.PercentileMergedAggregate#totalDurationNanos() totalDurationNanos} attribute.
   * A value strict bits equality used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for totalDurationNanos
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePercentileMergedAggregate withTotalDurationNanos(double value) {
    if (Double.doubleToLongBits(this.totalDurationNanos) == Double.doubleToLongBits(value)) return this;
    return new ImmutablePercentileMergedAggregate(this.transactionCount, value, this.percentileValues);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link TransactionJsonService.PercentileMergedAggregate#percentileValues() percentileValues}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePercentileMergedAggregate withPercentileValues(AggregateMerging.PercentileValue... elements) {
    ImmutableList<AggregateMerging.PercentileValue> newValue = ImmutableList.copyOf(elements);
    return new ImmutablePercentileMergedAggregate(this.transactionCount, this.totalDurationNanos, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link TransactionJsonService.PercentileMergedAggregate#percentileValues() percentileValues}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of percentileValues elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePercentileMergedAggregate withPercentileValues(Iterable<? extends AggregateMerging.PercentileValue> elements) {
    if (this.percentileValues == elements) return this;
    ImmutableList<AggregateMerging.PercentileValue> newValue = ImmutableList.copyOf(elements);
    return new ImmutablePercentileMergedAggregate(this.transactionCount, this.totalDurationNanos, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePercentileMergedAggregate} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePercentileMergedAggregate
        && equalTo((ImmutablePercentileMergedAggregate) another);
  }

  private boolean equalTo(ImmutablePercentileMergedAggregate another) {
    return transactionCount == another.transactionCount
        && Double.doubleToLongBits(totalDurationNanos) == Double.doubleToLongBits(another.totalDurationNanos)
        && percentileValues.equals(another.percentileValues);
  }

  /**
   * Computes a hash code from attributes: {@code transactionCount}, {@code totalDurationNanos}, {@code percentileValues}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Longs.hashCode(transactionCount);
    h += (h << 5) + Doubles.hashCode(totalDurationNanos);
    h += (h << 5) + percentileValues.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code PercentileMergedAggregate} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("PercentileMergedAggregate")
        .omitNullValues()
        .add("transactionCount", transactionCount)
        .add("totalDurationNanos", totalDurationNanos)
        .add("percentileValues", percentileValues)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements TransactionJsonService.PercentileMergedAggregate {
    long transactionCount;
    boolean transactionCountIsSet;
    double totalDurationNanos;
    boolean totalDurationNanosIsSet;
    ImmutableList<AggregateMerging.PercentileValue> percentileValues = ImmutableList.of();
    @JsonProperty("transactionCount")
    public void setTransactionCount(long transactionCount) {
      this.transactionCount = transactionCount;
      this.transactionCountIsSet = true;
    }
    @JsonProperty("totalDurationNanos")
    public void setTotalDurationNanos(double totalDurationNanos) {
      this.totalDurationNanos = totalDurationNanos;
      this.totalDurationNanosIsSet = true;
    }
    @JsonProperty("percentileValues")
    public void setPercentileValues(ImmutableList<AggregateMerging.PercentileValue> percentileValues) {
      this.percentileValues = percentileValues;
    }
    @Override
    public long transactionCount() { throw new UnsupportedOperationException(); }
    @Override
    public double totalDurationNanos() { throw new UnsupportedOperationException(); }
    @Override
    public ImmutableList<AggregateMerging.PercentileValue> percentileValues() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutablePercentileMergedAggregate fromJson(Json json) {
    ImmutablePercentileMergedAggregate.Builder builder = ImmutablePercentileMergedAggregate.builder();
    if (json.transactionCountIsSet) {
      builder.transactionCount(json.transactionCount);
    }
    if (json.totalDurationNanosIsSet) {
      builder.totalDurationNanos(json.totalDurationNanos);
    }
    if (json.percentileValues != null) {
      builder.addAllPercentileValues(json.percentileValues);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link TransactionJsonService.PercentileMergedAggregate} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable PercentileMergedAggregate instance
   */
  public static ImmutablePercentileMergedAggregate copyOf(TransactionJsonService.PercentileMergedAggregate instance) {
    if (instance instanceof ImmutablePercentileMergedAggregate) {
      return (ImmutablePercentileMergedAggregate) instance;
    }
    return ImmutablePercentileMergedAggregate.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutablePercentileMergedAggregate ImmutablePercentileMergedAggregate}.
   * @return A new ImmutablePercentileMergedAggregate builder
   */
  public static ImmutablePercentileMergedAggregate.Builder builder() {
    return new ImmutablePercentileMergedAggregate.Builder();
  }

  /**
   * Builds instances of type {@link ImmutablePercentileMergedAggregate ImmutablePercentileMergedAggregate}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_TRANSACTION_COUNT = 0x1L;
    private static final long INIT_BIT_TOTAL_DURATION_NANOS = 0x2L;
    private long initBits = 0x3L;

    private long transactionCount;
    private double totalDurationNanos;
    private ImmutableList.Builder<AggregateMerging.PercentileValue> percentileValues = ImmutableList.builder();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code PercentileMergedAggregate} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(TransactionJsonService.PercentileMergedAggregate instance) {
      Preconditions.checkNotNull(instance, "instance");
      transactionCount(instance.transactionCount());
      totalDurationNanos(instance.totalDurationNanos());
      addAllPercentileValues(instance.percentileValues());
      return this;
    }

    /**
     * Initializes the value for the {@link TransactionJsonService.PercentileMergedAggregate#transactionCount() transactionCount} attribute.
     * @param transactionCount The value for transactionCount 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder transactionCount(long transactionCount) {
      this.transactionCount = transactionCount;
      initBits &= ~INIT_BIT_TRANSACTION_COUNT;
      return this;
    }

    /**
     * Initializes the value for the {@link TransactionJsonService.PercentileMergedAggregate#totalDurationNanos() totalDurationNanos} attribute.
     * @param totalDurationNanos The value for totalDurationNanos 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder totalDurationNanos(double totalDurationNanos) {
      this.totalDurationNanos = totalDurationNanos;
      initBits &= ~INIT_BIT_TOTAL_DURATION_NANOS;
      return this;
    }

    /**
     * Adds one element to {@link TransactionJsonService.PercentileMergedAggregate#percentileValues() percentileValues} list.
     * @param element A percentileValues element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addPercentileValues(AggregateMerging.PercentileValue element) {
      this.percentileValues.add(element);
      return this;
    }

    /**
     * Adds elements to {@link TransactionJsonService.PercentileMergedAggregate#percentileValues() percentileValues} list.
     * @param elements An array of percentileValues elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addPercentileValues(AggregateMerging.PercentileValue... elements) {
      this.percentileValues.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link TransactionJsonService.PercentileMergedAggregate#percentileValues() percentileValues} list.
     * @param elements An iterable of percentileValues elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder percentileValues(Iterable<? extends AggregateMerging.PercentileValue> elements) {
      this.percentileValues = ImmutableList.builder();
      return addAllPercentileValues(elements);
    }

    /**
     * Adds elements to {@link TransactionJsonService.PercentileMergedAggregate#percentileValues() percentileValues} list.
     * @param elements An iterable of percentileValues elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllPercentileValues(Iterable<? extends AggregateMerging.PercentileValue> elements) {
      this.percentileValues.addAll(elements);
      return this;
    }

    /**
     * Builds a new {@link ImmutablePercentileMergedAggregate ImmutablePercentileMergedAggregate}.
     * @return An immutable instance of PercentileMergedAggregate
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutablePercentileMergedAggregate build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutablePercentileMergedAggregate(transactionCount, totalDurationNanos, percentileValues.build());
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_TRANSACTION_COUNT) != 0) attributes.add("transactionCount");
      if ((initBits & INIT_BIT_TOTAL_DURATION_NANOS) != 0) attributes.add("totalDurationNanos");
      return "Cannot build PercentileMergedAggregate, some of required attributes are not set " + attributes;
    }
  }
}
