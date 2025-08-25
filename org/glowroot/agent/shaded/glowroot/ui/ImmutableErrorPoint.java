package org.glowroot.agent.shaded.glowroot.ui;

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
 * Immutable implementation of {@link ErrorJsonService.ErrorPoint}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableErrorPoint.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code ImmutableErrorPoint.of()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "ErrorJsonService.ErrorPoint"})
@Immutable
final class ImmutableErrorPoint implements ErrorJsonService.ErrorPoint {
  private final long captureTime;
  private final long errorCount;
  private final long transactionCount;

  private ImmutableErrorPoint(long captureTime, long errorCount, long transactionCount) {
    this.captureTime = captureTime;
    this.errorCount = errorCount;
    this.transactionCount = transactionCount;
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
   * Copy the current immutable object by setting a value for the {@link ErrorJsonService.ErrorPoint#captureTime() captureTime} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for captureTime
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableErrorPoint withCaptureTime(long value) {
    if (this.captureTime == value) return this;
    return new ImmutableErrorPoint(value, this.errorCount, this.transactionCount);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ErrorJsonService.ErrorPoint#errorCount() errorCount} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for errorCount
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableErrorPoint withErrorCount(long value) {
    if (this.errorCount == value) return this;
    return new ImmutableErrorPoint(this.captureTime, value, this.transactionCount);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ErrorJsonService.ErrorPoint#transactionCount() transactionCount} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for transactionCount
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableErrorPoint withTransactionCount(long value) {
    if (this.transactionCount == value) return this;
    return new ImmutableErrorPoint(this.captureTime, this.errorCount, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableErrorPoint} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableErrorPoint
        && equalTo((ImmutableErrorPoint) another);
  }

  private boolean equalTo(ImmutableErrorPoint another) {
    return captureTime == another.captureTime
        && errorCount == another.errorCount
        && transactionCount == another.transactionCount;
  }

  /**
   * Computes a hash code from attributes: {@code captureTime}, {@code errorCount}, {@code transactionCount}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Longs.hashCode(captureTime);
    h += (h << 5) + Longs.hashCode(errorCount);
    h += (h << 5) + Longs.hashCode(transactionCount);
    return h;
  }

  /**
   * Prints the immutable value {@code ErrorPoint} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("ErrorPoint")
        .omitNullValues()
        .add("captureTime", captureTime)
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
  static final class Json implements ErrorJsonService.ErrorPoint {
    long captureTime;
    boolean captureTimeIsSet;
    long errorCount;
    boolean errorCountIsSet;
    long transactionCount;
    boolean transactionCountIsSet;
    @JsonProperty("captureTime")
    public void setCaptureTime(long captureTime) {
      this.captureTime = captureTime;
      this.captureTimeIsSet = true;
    }
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
    public long captureTime() { throw new UnsupportedOperationException(); }
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
  static ImmutableErrorPoint fromJson(Json json) {
    ImmutableErrorPoint.Builder builder = ImmutableErrorPoint.builder();
    if (json.captureTimeIsSet) {
      builder.captureTime(json.captureTime);
    }
    if (json.errorCountIsSet) {
      builder.errorCount(json.errorCount);
    }
    if (json.transactionCountIsSet) {
      builder.transactionCount(json.transactionCount);
    }
    return builder.build();
  }

  /**
   * Construct a new immutable {@code ErrorPoint} instance.
   * @param captureTime The value for the {@code captureTime} attribute
   * @param errorCount The value for the {@code errorCount} attribute
   * @param transactionCount The value for the {@code transactionCount} attribute
   * @return An immutable ErrorPoint instance
   */
  public static ImmutableErrorPoint of(long captureTime, long errorCount, long transactionCount) {
    return new ImmutableErrorPoint(captureTime, errorCount, transactionCount);
  }

  /**
   * Creates an immutable copy of a {@link ErrorJsonService.ErrorPoint} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ErrorPoint instance
   */
  public static ImmutableErrorPoint copyOf(ErrorJsonService.ErrorPoint instance) {
    if (instance instanceof ImmutableErrorPoint) {
      return (ImmutableErrorPoint) instance;
    }
    return ImmutableErrorPoint.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableErrorPoint ImmutableErrorPoint}.
   * @return A new ImmutableErrorPoint builder
   */
  public static ImmutableErrorPoint.Builder builder() {
    return new ImmutableErrorPoint.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableErrorPoint ImmutableErrorPoint}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_CAPTURE_TIME = 0x1L;
    private static final long INIT_BIT_ERROR_COUNT = 0x2L;
    private static final long INIT_BIT_TRANSACTION_COUNT = 0x4L;
    private long initBits = 0x7L;

    private long captureTime;
    private long errorCount;
    private long transactionCount;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code ErrorPoint} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(ErrorJsonService.ErrorPoint instance) {
      Preconditions.checkNotNull(instance, "instance");
      captureTime(instance.captureTime());
      errorCount(instance.errorCount());
      transactionCount(instance.transactionCount());
      return this;
    }

    /**
     * Initializes the value for the {@link ErrorJsonService.ErrorPoint#captureTime() captureTime} attribute.
     * @param captureTime The value for captureTime 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder captureTime(long captureTime) {
      this.captureTime = captureTime;
      initBits &= ~INIT_BIT_CAPTURE_TIME;
      return this;
    }

    /**
     * Initializes the value for the {@link ErrorJsonService.ErrorPoint#errorCount() errorCount} attribute.
     * @param errorCount The value for errorCount 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder errorCount(long errorCount) {
      this.errorCount = errorCount;
      initBits &= ~INIT_BIT_ERROR_COUNT;
      return this;
    }

    /**
     * Initializes the value for the {@link ErrorJsonService.ErrorPoint#transactionCount() transactionCount} attribute.
     * @param transactionCount The value for transactionCount 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder transactionCount(long transactionCount) {
      this.transactionCount = transactionCount;
      initBits &= ~INIT_BIT_TRANSACTION_COUNT;
      return this;
    }

    /**
     * Builds a new {@link ImmutableErrorPoint ImmutableErrorPoint}.
     * @return An immutable instance of ErrorPoint
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableErrorPoint build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableErrorPoint(captureTime, errorCount, transactionCount);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_CAPTURE_TIME) != 0) attributes.add("captureTime");
      if ((initBits & INIT_BIT_ERROR_COUNT) != 0) attributes.add("errorCount");
      if ((initBits & INIT_BIT_TRANSACTION_COUNT) != 0) attributes.add("transactionCount");
      return "Cannot build ErrorPoint, some of required attributes are not set " + attributes;
    }
  }
}
