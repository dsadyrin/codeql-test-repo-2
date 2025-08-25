package org.glowroot.agent.shaded.glowroot.common.repo;

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
 * Immutable implementation of {@link TraceRepository.ErrorMessagePoint}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableErrorMessagePoint.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code ImmutableErrorMessagePoint.of()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "TraceRepository.ErrorMessagePoint"})
@Immutable
public final class ImmutableErrorMessagePoint
    implements TraceRepository.ErrorMessagePoint {
  private final long captureTime;
  private final long errorCount;

  private ImmutableErrorMessagePoint(long captureTime, long errorCount) {
    this.captureTime = captureTime;
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
   * @return The value of the {@code errorCount} attribute
   */
  @JsonProperty("errorCount")
  @Override
  public long errorCount() {
    return errorCount;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TraceRepository.ErrorMessagePoint#captureTime() captureTime} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for captureTime
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableErrorMessagePoint withCaptureTime(long value) {
    if (this.captureTime == value) return this;
    return new ImmutableErrorMessagePoint(value, this.errorCount);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TraceRepository.ErrorMessagePoint#errorCount() errorCount} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for errorCount
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableErrorMessagePoint withErrorCount(long value) {
    if (this.errorCount == value) return this;
    return new ImmutableErrorMessagePoint(this.captureTime, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableErrorMessagePoint} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableErrorMessagePoint
        && equalTo((ImmutableErrorMessagePoint) another);
  }

  private boolean equalTo(ImmutableErrorMessagePoint another) {
    return captureTime == another.captureTime
        && errorCount == another.errorCount;
  }

  /**
   * Computes a hash code from attributes: {@code captureTime}, {@code errorCount}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Longs.hashCode(captureTime);
    h += (h << 5) + Longs.hashCode(errorCount);
    return h;
  }

  /**
   * Prints the immutable value {@code ErrorMessagePoint} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("ErrorMessagePoint")
        .omitNullValues()
        .add("captureTime", captureTime)
        .add("errorCount", errorCount)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements TraceRepository.ErrorMessagePoint {
    long captureTime;
    boolean captureTimeIsSet;
    long errorCount;
    boolean errorCountIsSet;
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
    @Override
    public long captureTime() { throw new UnsupportedOperationException(); }
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
  static ImmutableErrorMessagePoint fromJson(Json json) {
    ImmutableErrorMessagePoint.Builder builder = ImmutableErrorMessagePoint.builder();
    if (json.captureTimeIsSet) {
      builder.captureTime(json.captureTime);
    }
    if (json.errorCountIsSet) {
      builder.errorCount(json.errorCount);
    }
    return builder.build();
  }

  /**
   * Construct a new immutable {@code ErrorMessagePoint} instance.
   * @param captureTime The value for the {@code captureTime} attribute
   * @param errorCount The value for the {@code errorCount} attribute
   * @return An immutable ErrorMessagePoint instance
   */
  public static ImmutableErrorMessagePoint of(long captureTime, long errorCount) {
    return new ImmutableErrorMessagePoint(captureTime, errorCount);
  }

  /**
   * Creates an immutable copy of a {@link TraceRepository.ErrorMessagePoint} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ErrorMessagePoint instance
   */
  public static ImmutableErrorMessagePoint copyOf(TraceRepository.ErrorMessagePoint instance) {
    if (instance instanceof ImmutableErrorMessagePoint) {
      return (ImmutableErrorMessagePoint) instance;
    }
    return ImmutableErrorMessagePoint.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableErrorMessagePoint ImmutableErrorMessagePoint}.
   * @return A new ImmutableErrorMessagePoint builder
   */
  public static ImmutableErrorMessagePoint.Builder builder() {
    return new ImmutableErrorMessagePoint.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableErrorMessagePoint ImmutableErrorMessagePoint}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_CAPTURE_TIME = 0x1L;
    private static final long INIT_BIT_ERROR_COUNT = 0x2L;
    private long initBits = 0x3L;

    private long captureTime;
    private long errorCount;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code ErrorMessagePoint} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(TraceRepository.ErrorMessagePoint instance) {
      Preconditions.checkNotNull(instance, "instance");
      captureTime(instance.captureTime());
      errorCount(instance.errorCount());
      return this;
    }

    /**
     * Initializes the value for the {@link TraceRepository.ErrorMessagePoint#captureTime() captureTime} attribute.
     * @param captureTime The value for captureTime 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder captureTime(long captureTime) {
      this.captureTime = captureTime;
      initBits &= ~INIT_BIT_CAPTURE_TIME;
      return this;
    }

    /**
     * Initializes the value for the {@link TraceRepository.ErrorMessagePoint#errorCount() errorCount} attribute.
     * @param errorCount The value for errorCount 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder errorCount(long errorCount) {
      this.errorCount = errorCount;
      initBits &= ~INIT_BIT_ERROR_COUNT;
      return this;
    }

    /**
     * Builds a new {@link ImmutableErrorMessagePoint ImmutableErrorMessagePoint}.
     * @return An immutable instance of ErrorMessagePoint
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableErrorMessagePoint build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableErrorMessagePoint(captureTime, errorCount);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_CAPTURE_TIME) != 0) attributes.add("captureTime");
      if ((initBits & INIT_BIT_ERROR_COUNT) != 0) attributes.add("errorCount");
      return "Cannot build ErrorMessagePoint, some of required attributes are not set " + attributes;
    }
  }
}
