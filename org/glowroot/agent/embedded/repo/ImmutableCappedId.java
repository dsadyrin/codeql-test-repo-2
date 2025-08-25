package org.glowroot.agent.embedded.repo;

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
 * Immutable implementation of {@link AggregateDao.CappedId}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCappedId.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code ImmutableCappedId.of()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "AggregateDao.CappedId"})
@Immutable
final class ImmutableCappedId implements AggregateDao.CappedId {
  private final long captureTime;
  private final long cappedId;

  private ImmutableCappedId(long captureTime, long cappedId) {
    this.captureTime = captureTime;
    this.cappedId = cappedId;
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
   * @return The value of the {@code cappedId} attribute
   */
  @JsonProperty("cappedId")
  @Override
  public long cappedId() {
    return cappedId;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AggregateDao.CappedId#captureTime() captureTime} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for captureTime
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCappedId withCaptureTime(long value) {
    if (this.captureTime == value) return this;
    return new ImmutableCappedId(value, this.cappedId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AggregateDao.CappedId#cappedId() cappedId} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for cappedId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCappedId withCappedId(long value) {
    if (this.cappedId == value) return this;
    return new ImmutableCappedId(this.captureTime, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCappedId} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCappedId
        && equalTo((ImmutableCappedId) another);
  }

  private boolean equalTo(ImmutableCappedId another) {
    return captureTime == another.captureTime
        && cappedId == another.cappedId;
  }

  /**
   * Computes a hash code from attributes: {@code captureTime}, {@code cappedId}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Longs.hashCode(captureTime);
    h += (h << 5) + Longs.hashCode(cappedId);
    return h;
  }

  /**
   * Prints the immutable value {@code CappedId} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("CappedId")
        .omitNullValues()
        .add("captureTime", captureTime)
        .add("cappedId", cappedId)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements AggregateDao.CappedId {
    long captureTime;
    boolean captureTimeIsSet;
    long cappedId;
    boolean cappedIdIsSet;
    @JsonProperty("captureTime")
    public void setCaptureTime(long captureTime) {
      this.captureTime = captureTime;
      this.captureTimeIsSet = true;
    }
    @JsonProperty("cappedId")
    public void setCappedId(long cappedId) {
      this.cappedId = cappedId;
      this.cappedIdIsSet = true;
    }
    @Override
    public long captureTime() { throw new UnsupportedOperationException(); }
    @Override
    public long cappedId() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableCappedId fromJson(Json json) {
    ImmutableCappedId.Builder builder = ImmutableCappedId.builder();
    if (json.captureTimeIsSet) {
      builder.captureTime(json.captureTime);
    }
    if (json.cappedIdIsSet) {
      builder.cappedId(json.cappedId);
    }
    return builder.build();
  }

  /**
   * Construct a new immutable {@code CappedId} instance.
   * @param captureTime The value for the {@code captureTime} attribute
   * @param cappedId The value for the {@code cappedId} attribute
   * @return An immutable CappedId instance
   */
  public static ImmutableCappedId of(long captureTime, long cappedId) {
    return new ImmutableCappedId(captureTime, cappedId);
  }

  /**
   * Creates an immutable copy of a {@link AggregateDao.CappedId} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable CappedId instance
   */
  public static ImmutableCappedId copyOf(AggregateDao.CappedId instance) {
    if (instance instanceof ImmutableCappedId) {
      return (ImmutableCappedId) instance;
    }
    return ImmutableCappedId.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableCappedId ImmutableCappedId}.
   * @return A new ImmutableCappedId builder
   */
  public static ImmutableCappedId.Builder builder() {
    return new ImmutableCappedId.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableCappedId ImmutableCappedId}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_CAPTURE_TIME = 0x1L;
    private static final long INIT_BIT_CAPPED_ID = 0x2L;
    private long initBits = 0x3L;

    private long captureTime;
    private long cappedId;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code CappedId} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(AggregateDao.CappedId instance) {
      Preconditions.checkNotNull(instance, "instance");
      captureTime(instance.captureTime());
      cappedId(instance.cappedId());
      return this;
    }

    /**
     * Initializes the value for the {@link AggregateDao.CappedId#captureTime() captureTime} attribute.
     * @param captureTime The value for captureTime 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder captureTime(long captureTime) {
      this.captureTime = captureTime;
      initBits &= ~INIT_BIT_CAPTURE_TIME;
      return this;
    }

    /**
     * Initializes the value for the {@link AggregateDao.CappedId#cappedId() cappedId} attribute.
     * @param cappedId The value for cappedId 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder cappedId(long cappedId) {
      this.cappedId = cappedId;
      initBits &= ~INIT_BIT_CAPPED_ID;
      return this;
    }

    /**
     * Builds a new {@link ImmutableCappedId ImmutableCappedId}.
     * @return An immutable instance of CappedId
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableCappedId build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableCappedId(captureTime, cappedId);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_CAPTURE_TIME) != 0) attributes.add("captureTime");
      if ((initBits & INIT_BIT_CAPPED_ID) != 0) attributes.add("cappedId");
      return "Cannot build CappedId, some of required attributes are not set " + attributes;
    }
  }
}
