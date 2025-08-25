package org.glowroot.agent.shaded.glowroot.common.repo;

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
 * Immutable implementation of {@link SyntheticResultRepository.SyntheticResult}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSyntheticResult.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "SyntheticResultRepository.SyntheticResult"})
@Immutable
public final class ImmutableSyntheticResult
    implements SyntheticResultRepository.SyntheticResult {
  private final long captureTime;
  private final double totalDurationNanos;
  private final long executionCount;
  private final long errorCount;

  private ImmutableSyntheticResult(long captureTime, double totalDurationNanos, long executionCount, long errorCount) {
    this.captureTime = captureTime;
    this.totalDurationNanos = totalDurationNanos;
    this.executionCount = executionCount;
    this.errorCount = errorCount;
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
   * @return The value of the {@code executionCount} attribute
   */
  @JsonProperty("executionCount")
  @Override
  public long executionCount() {
    return executionCount;
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
   * Copy the current immutable object by setting a value for the {@link SyntheticResultRepository.SyntheticResult#captureTime() captureTime} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for captureTime
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSyntheticResult withCaptureTime(long value) {
    if (this.captureTime == value) return this;
    return new ImmutableSyntheticResult(value, this.totalDurationNanos, this.executionCount, this.errorCount);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SyntheticResultRepository.SyntheticResult#totalDurationNanos() totalDurationNanos} attribute.
   * A value strict bits equality used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for totalDurationNanos
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSyntheticResult withTotalDurationNanos(double value) {
    if (Double.doubleToLongBits(this.totalDurationNanos) == Double.doubleToLongBits(value)) return this;
    return new ImmutableSyntheticResult(this.captureTime, value, this.executionCount, this.errorCount);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SyntheticResultRepository.SyntheticResult#executionCount() executionCount} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for executionCount
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSyntheticResult withExecutionCount(long value) {
    if (this.executionCount == value) return this;
    return new ImmutableSyntheticResult(this.captureTime, this.totalDurationNanos, value, this.errorCount);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SyntheticResultRepository.SyntheticResult#errorCount() errorCount} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for errorCount
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSyntheticResult withErrorCount(long value) {
    if (this.errorCount == value) return this;
    return new ImmutableSyntheticResult(this.captureTime, this.totalDurationNanos, this.executionCount, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSyntheticResult} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSyntheticResult
        && equalTo((ImmutableSyntheticResult) another);
  }

  private boolean equalTo(ImmutableSyntheticResult another) {
    return captureTime == another.captureTime
        && Double.doubleToLongBits(totalDurationNanos) == Double.doubleToLongBits(another.totalDurationNanos)
        && executionCount == another.executionCount
        && errorCount == another.errorCount;
  }

  /**
   * Computes a hash code from attributes: {@code captureTime}, {@code totalDurationNanos}, {@code executionCount}, {@code errorCount}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Longs.hashCode(captureTime);
    h += (h << 5) + Doubles.hashCode(totalDurationNanos);
    h += (h << 5) + Longs.hashCode(executionCount);
    h += (h << 5) + Longs.hashCode(errorCount);
    return h;
  }

  /**
   * Prints the immutable value {@code SyntheticResult} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("SyntheticResult")
        .omitNullValues()
        .add("captureTime", captureTime)
        .add("totalDurationNanos", totalDurationNanos)
        .add("executionCount", executionCount)
        .add("errorCount", errorCount)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements SyntheticResultRepository.SyntheticResult {
    long captureTime;
    boolean captureTimeIsSet;
    double totalDurationNanos;
    boolean totalDurationNanosIsSet;
    long executionCount;
    boolean executionCountIsSet;
    long errorCount;
    boolean errorCountIsSet;
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
    @JsonProperty("executionCount")
    public void setExecutionCount(long executionCount) {
      this.executionCount = executionCount;
      this.executionCountIsSet = true;
    }
    @JsonProperty("errorCount")
    public void setErrorCount(long errorCount) {
      this.errorCount = errorCount;
      this.errorCountIsSet = true;
    }
    @Override
    public long captureTime() { throw new UnsupportedOperationException(); }
    @Override
    public double totalDurationNanos() { throw new UnsupportedOperationException(); }
    @Override
    public long executionCount() { throw new UnsupportedOperationException(); }
    @Override
    public long errorCount() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableSyntheticResult fromJson(Json json) {
    ImmutableSyntheticResult.Builder builder = ImmutableSyntheticResult.builder();
    if (json.captureTimeIsSet) {
      builder.captureTime(json.captureTime);
    }
    if (json.totalDurationNanosIsSet) {
      builder.totalDurationNanos(json.totalDurationNanos);
    }
    if (json.executionCountIsSet) {
      builder.executionCount(json.executionCount);
    }
    if (json.errorCountIsSet) {
      builder.errorCount(json.errorCount);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SyntheticResultRepository.SyntheticResult} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SyntheticResult instance
   */
  public static ImmutableSyntheticResult copyOf(SyntheticResultRepository.SyntheticResult instance) {
    if (instance instanceof ImmutableSyntheticResult) {
      return (ImmutableSyntheticResult) instance;
    }
    return ImmutableSyntheticResult.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableSyntheticResult ImmutableSyntheticResult}.
   * @return A new ImmutableSyntheticResult builder
   */
  public static ImmutableSyntheticResult.Builder builder() {
    return new ImmutableSyntheticResult.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableSyntheticResult ImmutableSyntheticResult}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_CAPTURE_TIME = 0x1L;
    private static final long INIT_BIT_TOTAL_DURATION_NANOS = 0x2L;
    private static final long INIT_BIT_EXECUTION_COUNT = 0x4L;
    private static final long INIT_BIT_ERROR_COUNT = 0x8L;
    private long initBits = 0xfL;

    private long captureTime;
    private double totalDurationNanos;
    private long executionCount;
    private long errorCount;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code SyntheticResult} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(SyntheticResultRepository.SyntheticResult instance) {
      Preconditions.checkNotNull(instance, "instance");
      captureTime(instance.captureTime());
      totalDurationNanos(instance.totalDurationNanos());
      executionCount(instance.executionCount());
      errorCount(instance.errorCount());
      return this;
    }

    /**
     * Initializes the value for the {@link SyntheticResultRepository.SyntheticResult#captureTime() captureTime} attribute.
     * @param captureTime The value for captureTime 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder captureTime(long captureTime) {
      this.captureTime = captureTime;
      initBits &= ~INIT_BIT_CAPTURE_TIME;
      return this;
    }

    /**
     * Initializes the value for the {@link SyntheticResultRepository.SyntheticResult#totalDurationNanos() totalDurationNanos} attribute.
     * @param totalDurationNanos The value for totalDurationNanos 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder totalDurationNanos(double totalDurationNanos) {
      this.totalDurationNanos = totalDurationNanos;
      initBits &= ~INIT_BIT_TOTAL_DURATION_NANOS;
      return this;
    }

    /**
     * Initializes the value for the {@link SyntheticResultRepository.SyntheticResult#executionCount() executionCount} attribute.
     * @param executionCount The value for executionCount 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder executionCount(long executionCount) {
      this.executionCount = executionCount;
      initBits &= ~INIT_BIT_EXECUTION_COUNT;
      return this;
    }

    /**
     * Initializes the value for the {@link SyntheticResultRepository.SyntheticResult#errorCount() errorCount} attribute.
     * @param errorCount The value for errorCount 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder errorCount(long errorCount) {
      this.errorCount = errorCount;
      initBits &= ~INIT_BIT_ERROR_COUNT;
      return this;
    }

    /**
     * Builds a new {@link ImmutableSyntheticResult ImmutableSyntheticResult}.
     * @return An immutable instance of SyntheticResult
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableSyntheticResult build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableSyntheticResult(captureTime, totalDurationNanos, executionCount, errorCount);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_CAPTURE_TIME) != 0) attributes.add("captureTime");
      if ((initBits & INIT_BIT_TOTAL_DURATION_NANOS) != 0) attributes.add("totalDurationNanos");
      if ((initBits & INIT_BIT_EXECUTION_COUNT) != 0) attributes.add("executionCount");
      if ((initBits & INIT_BIT_ERROR_COUNT) != 0) attributes.add("errorCount");
      return "Cannot build SyntheticResult, some of required attributes are not set " + attributes;
    }
  }
}
