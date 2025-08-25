package org.glowroot.agent.shaded.glowroot.common.model;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import org.glowroot.agent.shaded.google.common.collect.Lists;
import org.glowroot.agent.shaded.google.common.primitives.Longs;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link OverallErrorSummaryCollector.OverallErrorSummary}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableOverallErrorSummary.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "OverallErrorSummaryCollector.OverallErrorSummary"})
@Immutable
public final class ImmutableOverallErrorSummary
    implements OverallErrorSummaryCollector.OverallErrorSummary {
  private final long errorCount;
  private final long transactionCount;

  private ImmutableOverallErrorSummary(long errorCount, long transactionCount) {
    this.errorCount = errorCount;
    this.transactionCount = transactionCount;
  }

  /**
   * @return The value of the {@code errorCount} attribute
   */
  @JsonProperty("errorCount")
  @Override
  public long errorCount() {
    return errorCount;
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
   * Copy the current immutable object by setting a value for the {@link OverallErrorSummaryCollector.OverallErrorSummary#errorCount() errorCount} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for errorCount
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableOverallErrorSummary withErrorCount(long value) {
    if (this.errorCount == value) return this;
    return new ImmutableOverallErrorSummary(value, this.transactionCount);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link OverallErrorSummaryCollector.OverallErrorSummary#transactionCount() transactionCount} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for transactionCount
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableOverallErrorSummary withTransactionCount(long value) {
    if (this.transactionCount == value) return this;
    return new ImmutableOverallErrorSummary(this.errorCount, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableOverallErrorSummary} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableOverallErrorSummary
        && equalTo((ImmutableOverallErrorSummary) another);
  }

  private boolean equalTo(ImmutableOverallErrorSummary another) {
    return errorCount == another.errorCount
        && transactionCount == another.transactionCount;
  }

  /**
   * Computes a hash code from attributes: {@code errorCount}, {@code transactionCount}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Longs.hashCode(errorCount);
    h += (h << 5) + Longs.hashCode(transactionCount);
    return h;
  }

  /**
   * Prints the immutable value {@code OverallErrorSummary} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("OverallErrorSummary")
        .omitNullValues()
        .add("errorCount", errorCount)
        .add("transactionCount", transactionCount)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json
      implements OverallErrorSummaryCollector.OverallErrorSummary {
    long errorCount;
    boolean errorCountIsSet;
    long transactionCount;
    boolean transactionCountIsSet;
    @JsonProperty("errorCount")
    public void setErrorCount(long errorCount) {
      this.errorCount = errorCount;
      this.errorCountIsSet = true;
    }
    @JsonProperty("transactionCount")
    public void setTransactionCount(long transactionCount) {
      this.transactionCount = transactionCount;
      this.transactionCountIsSet = true;
    }
    @Override
    public long errorCount() { throw new UnsupportedOperationException(); }
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
  static ImmutableOverallErrorSummary fromJson(Json json) {
    ImmutableOverallErrorSummary.Builder builder = ImmutableOverallErrorSummary.builder();
    if (json.errorCountIsSet) {
      builder.errorCount(json.errorCount);
    }
    if (json.transactionCountIsSet) {
      builder.transactionCount(json.transactionCount);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link OverallErrorSummaryCollector.OverallErrorSummary} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable OverallErrorSummary instance
   */
  public static ImmutableOverallErrorSummary copyOf(OverallErrorSummaryCollector.OverallErrorSummary instance) {
    if (instance instanceof ImmutableOverallErrorSummary) {
      return (ImmutableOverallErrorSummary) instance;
    }
    return ImmutableOverallErrorSummary.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableOverallErrorSummary ImmutableOverallErrorSummary}.
   * @return A new ImmutableOverallErrorSummary builder
   */
  public static ImmutableOverallErrorSummary.Builder builder() {
    return new ImmutableOverallErrorSummary.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableOverallErrorSummary ImmutableOverallErrorSummary}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_ERROR_COUNT = 0x1L;
    private static final long INIT_BIT_TRANSACTION_COUNT = 0x2L;
    private long initBits = 0x3L;

    private long errorCount;
    private long transactionCount;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code OverallErrorSummary} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(OverallErrorSummaryCollector.OverallErrorSummary instance) {
      Preconditions.checkNotNull(instance, "instance");
      errorCount(instance.errorCount());
      transactionCount(instance.transactionCount());
      return this;
    }

    /**
     * Initializes the value for the {@link OverallErrorSummaryCollector.OverallErrorSummary#errorCount() errorCount} attribute.
     * @param errorCount The value for errorCount 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder errorCount(long errorCount) {
      this.errorCount = errorCount;
      initBits &= ~INIT_BIT_ERROR_COUNT;
      return this;
    }

    /**
     * Initializes the value for the {@link OverallErrorSummaryCollector.OverallErrorSummary#transactionCount() transactionCount} attribute.
     * @param transactionCount The value for transactionCount 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder transactionCount(long transactionCount) {
      this.transactionCount = transactionCount;
      initBits &= ~INIT_BIT_TRANSACTION_COUNT;
      return this;
    }

    /**
     * Builds a new {@link ImmutableOverallErrorSummary ImmutableOverallErrorSummary}.
     * @return An immutable instance of OverallErrorSummary
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableOverallErrorSummary build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableOverallErrorSummary(errorCount, transactionCount);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_ERROR_COUNT) != 0) attributes.add("errorCount");
      if ((initBits & INIT_BIT_TRANSACTION_COUNT) != 0) attributes.add("transactionCount");
      return "Cannot build OverallErrorSummary, some of required attributes are not set " + attributes;
    }
  }
}
