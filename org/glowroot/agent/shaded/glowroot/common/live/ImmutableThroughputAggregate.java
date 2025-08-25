package org.glowroot.agent.shaded.glowroot.common.live;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Objects;
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
 * Immutable implementation of {@link LiveAggregateRepository.ThroughputAggregate}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableThroughputAggregate.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "LiveAggregateRepository.ThroughputAggregate"})
@Immutable
public final class ImmutableThroughputAggregate
    implements LiveAggregateRepository.ThroughputAggregate {
  private final long captureTime;
  private final long transactionCount;
  private final @Nullable Long errorCount;

  private ImmutableThroughputAggregate(long captureTime, long transactionCount, @Nullable Long errorCount) {
    this.captureTime = captureTime;
    this.transactionCount = transactionCount;
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
   * @return The value of the {@code transactionCount} attribute
   */
  @JsonProperty("transactionCount")
  @Override
  public long transactionCount() {
    return transactionCount;
  }

  /**
   * @return The value of the {@code errorCount} attribute
   */
  @JsonProperty("errorCount")
  @Override
  public @Nullable Long errorCount() {
    return errorCount;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LiveAggregateRepository.ThroughputAggregate#captureTime() captureTime} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for captureTime
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableThroughputAggregate withCaptureTime(long value) {
    if (this.captureTime == value) return this;
    return new ImmutableThroughputAggregate(value, this.transactionCount, this.errorCount);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LiveAggregateRepository.ThroughputAggregate#transactionCount() transactionCount} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for transactionCount
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableThroughputAggregate withTransactionCount(long value) {
    if (this.transactionCount == value) return this;
    return new ImmutableThroughputAggregate(this.captureTime, value, this.errorCount);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LiveAggregateRepository.ThroughputAggregate#errorCount() errorCount} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for errorCount (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableThroughputAggregate withErrorCount(@Nullable Long value) {
    if (Objects.equal(this.errorCount, value)) return this;
    return new ImmutableThroughputAggregate(this.captureTime, this.transactionCount, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableThroughputAggregate} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableThroughputAggregate
        && equalTo((ImmutableThroughputAggregate) another);
  }

  private boolean equalTo(ImmutableThroughputAggregate another) {
    return captureTime == another.captureTime
        && transactionCount == another.transactionCount
        && Objects.equal(errorCount, another.errorCount);
  }

  /**
   * Computes a hash code from attributes: {@code captureTime}, {@code transactionCount}, {@code errorCount}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Longs.hashCode(captureTime);
    h += (h << 5) + Longs.hashCode(transactionCount);
    h += (h << 5) + Objects.hashCode(errorCount);
    return h;
  }

  /**
   * Prints the immutable value {@code ThroughputAggregate} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("ThroughputAggregate")
        .omitNullValues()
        .add("captureTime", captureTime)
        .add("transactionCount", transactionCount)
        .add("errorCount", errorCount)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements LiveAggregateRepository.ThroughputAggregate {
    long captureTime;
    boolean captureTimeIsSet;
    long transactionCount;
    boolean transactionCountIsSet;
    @Nullable Long errorCount;
    @JsonProperty("captureTime")
    public void setCaptureTime(long captureTime) {
      this.captureTime = captureTime;
      this.captureTimeIsSet = true;
    }
    @JsonProperty("transactionCount")
    public void setTransactionCount(long transactionCount) {
      this.transactionCount = transactionCount;
      this.transactionCountIsSet = true;
    }
    @JsonProperty("errorCount")
    public void setErrorCount(@Nullable Long errorCount) {
      this.errorCount = errorCount;
    }
    @Override
    public long captureTime() { throw new UnsupportedOperationException(); }
    @Override
    public long transactionCount() { throw new UnsupportedOperationException(); }
    @Override
    public Long errorCount() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableThroughputAggregate fromJson(Json json) {
    ImmutableThroughputAggregate.Builder builder = ImmutableThroughputAggregate.builder();
    if (json.captureTimeIsSet) {
      builder.captureTime(json.captureTime);
    }
    if (json.transactionCountIsSet) {
      builder.transactionCount(json.transactionCount);
    }
    if (json.errorCount != null) {
      builder.errorCount(json.errorCount);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link LiveAggregateRepository.ThroughputAggregate} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ThroughputAggregate instance
   */
  public static ImmutableThroughputAggregate copyOf(LiveAggregateRepository.ThroughputAggregate instance) {
    if (instance instanceof ImmutableThroughputAggregate) {
      return (ImmutableThroughputAggregate) instance;
    }
    return ImmutableThroughputAggregate.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableThroughputAggregate ImmutableThroughputAggregate}.
   * @return A new ImmutableThroughputAggregate builder
   */
  public static ImmutableThroughputAggregate.Builder builder() {
    return new ImmutableThroughputAggregate.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableThroughputAggregate ImmutableThroughputAggregate}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_CAPTURE_TIME = 0x1L;
    private static final long INIT_BIT_TRANSACTION_COUNT = 0x2L;
    private long initBits = 0x3L;

    private long captureTime;
    private long transactionCount;
    private @Nullable Long errorCount;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code ThroughputAggregate} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(LiveAggregateRepository.ThroughputAggregate instance) {
      Preconditions.checkNotNull(instance, "instance");
      captureTime(instance.captureTime());
      transactionCount(instance.transactionCount());
      @Nullable Long errorCountValue = instance.errorCount();
      if (errorCountValue != null) {
        errorCount(errorCountValue);
      }
      return this;
    }

    /**
     * Initializes the value for the {@link LiveAggregateRepository.ThroughputAggregate#captureTime() captureTime} attribute.
     * @param captureTime The value for captureTime 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder captureTime(long captureTime) {
      this.captureTime = captureTime;
      initBits &= ~INIT_BIT_CAPTURE_TIME;
      return this;
    }

    /**
     * Initializes the value for the {@link LiveAggregateRepository.ThroughputAggregate#transactionCount() transactionCount} attribute.
     * @param transactionCount The value for transactionCount 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder transactionCount(long transactionCount) {
      this.transactionCount = transactionCount;
      initBits &= ~INIT_BIT_TRANSACTION_COUNT;
      return this;
    }

    /**
     * Initializes the value for the {@link LiveAggregateRepository.ThroughputAggregate#errorCount() errorCount} attribute.
     * @param errorCount The value for errorCount (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder errorCount(@Nullable Long errorCount) {
      this.errorCount = errorCount;
      return this;
    }

    /**
     * Builds a new {@link ImmutableThroughputAggregate ImmutableThroughputAggregate}.
     * @return An immutable instance of ThroughputAggregate
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableThroughputAggregate build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableThroughputAggregate(captureTime, transactionCount, errorCount);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_CAPTURE_TIME) != 0) attributes.add("captureTime");
      if ((initBits & INIT_BIT_TRANSACTION_COUNT) != 0) attributes.add("transactionCount");
      return "Cannot build ThroughputAggregate, some of required attributes are not set " + attributes;
    }
  }
}
