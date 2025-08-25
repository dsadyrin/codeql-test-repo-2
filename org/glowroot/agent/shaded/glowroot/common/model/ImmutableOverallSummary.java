package org.glowroot.agent.shaded.glowroot.common.model;

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

/**
 * Immutable implementation of {@link OverallSummaryCollector.OverallSummary}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableOverallSummary.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "OverallSummaryCollector.OverallSummary"})
@Immutable
public final class ImmutableOverallSummary
    implements OverallSummaryCollector.OverallSummary {
  private final double totalDurationNanos;
  private final long transactionCount;

  private ImmutableOverallSummary(double totalDurationNanos, long transactionCount) {
    this.totalDurationNanos = totalDurationNanos;
    this.transactionCount = transactionCount;
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
   * Copy the current immutable object by setting a value for the {@link OverallSummaryCollector.OverallSummary#totalDurationNanos() totalDurationNanos} attribute.
   * A value strict bits equality used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for totalDurationNanos
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableOverallSummary withTotalDurationNanos(double value) {
    if (Double.doubleToLongBits(this.totalDurationNanos) == Double.doubleToLongBits(value)) return this;
    return new ImmutableOverallSummary(value, this.transactionCount);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link OverallSummaryCollector.OverallSummary#transactionCount() transactionCount} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for transactionCount
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableOverallSummary withTransactionCount(long value) {
    if (this.transactionCount == value) return this;
    return new ImmutableOverallSummary(this.totalDurationNanos, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableOverallSummary} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableOverallSummary
        && equalTo((ImmutableOverallSummary) another);
  }

  private boolean equalTo(ImmutableOverallSummary another) {
    return Double.doubleToLongBits(totalDurationNanos) == Double.doubleToLongBits(another.totalDurationNanos)
        && transactionCount == another.transactionCount;
  }

  /**
   * Computes a hash code from attributes: {@code totalDurationNanos}, {@code transactionCount}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Doubles.hashCode(totalDurationNanos);
    h += (h << 5) + Longs.hashCode(transactionCount);
    return h;
  }

  /**
   * Prints the immutable value {@code OverallSummary} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("OverallSummary")
        .omitNullValues()
        .add("totalDurationNanos", totalDurationNanos)
        .add("transactionCount", transactionCount)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements OverallSummaryCollector.OverallSummary {
    double totalDurationNanos;
    boolean totalDurationNanosIsSet;
    long transactionCount;
    boolean transactionCountIsSet;
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
    @Override
    public double totalDurationNanos() { throw new UnsupportedOperationException(); }
    @Override
    public long transactionCount() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableOverallSummary fromJson(Json json) {
    ImmutableOverallSummary.Builder builder = ImmutableOverallSummary.builder();
    if (json.totalDurationNanosIsSet) {
      builder.totalDurationNanos(json.totalDurationNanos);
    }
    if (json.transactionCountIsSet) {
      builder.transactionCount(json.transactionCount);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link OverallSummaryCollector.OverallSummary} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable OverallSummary instance
   */
  public static ImmutableOverallSummary copyOf(OverallSummaryCollector.OverallSummary instance) {
    if (instance instanceof ImmutableOverallSummary) {
      return (ImmutableOverallSummary) instance;
    }
    return ImmutableOverallSummary.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableOverallSummary ImmutableOverallSummary}.
   * @return A new ImmutableOverallSummary builder
   */
  public static ImmutableOverallSummary.Builder builder() {
    return new ImmutableOverallSummary.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableOverallSummary ImmutableOverallSummary}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_TOTAL_DURATION_NANOS = 0x1L;
    private static final long INIT_BIT_TRANSACTION_COUNT = 0x2L;
    private long initBits = 0x3L;

    private double totalDurationNanos;
    private long transactionCount;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code OverallSummary} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(OverallSummaryCollector.OverallSummary instance) {
      Preconditions.checkNotNull(instance, "instance");
      totalDurationNanos(instance.totalDurationNanos());
      transactionCount(instance.transactionCount());
      return this;
    }

    /**
     * Initializes the value for the {@link OverallSummaryCollector.OverallSummary#totalDurationNanos() totalDurationNanos} attribute.
     * @param totalDurationNanos The value for totalDurationNanos 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder totalDurationNanos(double totalDurationNanos) {
      this.totalDurationNanos = totalDurationNanos;
      initBits &= ~INIT_BIT_TOTAL_DURATION_NANOS;
      return this;
    }

    /**
     * Initializes the value for the {@link OverallSummaryCollector.OverallSummary#transactionCount() transactionCount} attribute.
     * @param transactionCount The value for transactionCount 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder transactionCount(long transactionCount) {
      this.transactionCount = transactionCount;
      initBits &= ~INIT_BIT_TRANSACTION_COUNT;
      return this;
    }

    /**
     * Builds a new {@link ImmutableOverallSummary ImmutableOverallSummary}.
     * @return An immutable instance of OverallSummary
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableOverallSummary build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableOverallSummary(totalDurationNanos, transactionCount);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_TOTAL_DURATION_NANOS) != 0) attributes.add("totalDurationNanos");
      if ((initBits & INIT_BIT_TRANSACTION_COUNT) != 0) attributes.add("transactionCount");
      return "Cannot build OverallSummary, some of required attributes are not set " + attributes;
    }
  }
}
