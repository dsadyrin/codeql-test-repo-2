package org.glowroot.agent.model;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import org.glowroot.agent.shaded.google.common.collect.Lists;
import org.glowroot.agent.shaded.google.common.primitives.Booleans;
import org.glowroot.agent.shaded.google.common.primitives.Longs;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link CommonTimerImpl.TimerImplSnapshot}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTimerImplSnapshot.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code ImmutableTimerImplSnapshot.of()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "CommonTimerImpl.TimerImplSnapshot"})
@Immutable
public final class ImmutableTimerImplSnapshot
    implements CommonTimerImpl.TimerImplSnapshot {
  private final long totalNanos;
  private final long count;
  private final boolean active;

  private ImmutableTimerImplSnapshot(long totalNanos, long count, boolean active) {
    this.totalNanos = totalNanos;
    this.count = count;
    this.active = active;
  }

  /**
   * @return The value of the {@code totalNanos} attribute
   */
  @JsonProperty("totalNanos")
  @Override
  public long totalNanos() {
    return totalNanos;
  }

  /**
   * @return The value of the {@code count} attribute
   */
  @JsonProperty("count")
  @Override
  public long count() {
    return count;
  }

  /**
   * @return The value of the {@code active} attribute
   */
  @JsonProperty("active")
  @Override
  public boolean active() {
    return active;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CommonTimerImpl.TimerImplSnapshot#totalNanos() totalNanos} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for totalNanos
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTimerImplSnapshot withTotalNanos(long value) {
    if (this.totalNanos == value) return this;
    return new ImmutableTimerImplSnapshot(value, this.count, this.active);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CommonTimerImpl.TimerImplSnapshot#count() count} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for count
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTimerImplSnapshot withCount(long value) {
    if (this.count == value) return this;
    return new ImmutableTimerImplSnapshot(this.totalNanos, value, this.active);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CommonTimerImpl.TimerImplSnapshot#active() active} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for active
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTimerImplSnapshot withActive(boolean value) {
    if (this.active == value) return this;
    return new ImmutableTimerImplSnapshot(this.totalNanos, this.count, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTimerImplSnapshot} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTimerImplSnapshot
        && equalTo((ImmutableTimerImplSnapshot) another);
  }

  private boolean equalTo(ImmutableTimerImplSnapshot another) {
    return totalNanos == another.totalNanos
        && count == another.count
        && active == another.active;
  }

  /**
   * Computes a hash code from attributes: {@code totalNanos}, {@code count}, {@code active}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Longs.hashCode(totalNanos);
    h += (h << 5) + Longs.hashCode(count);
    h += (h << 5) + Booleans.hashCode(active);
    return h;
  }

  /**
   * Prints the immutable value {@code TimerImplSnapshot} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("TimerImplSnapshot")
        .omitNullValues()
        .add("totalNanos", totalNanos)
        .add("count", count)
        .add("active", active)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements CommonTimerImpl.TimerImplSnapshot {
    long totalNanos;
    boolean totalNanosIsSet;
    long count;
    boolean countIsSet;
    boolean active;
    boolean activeIsSet;
    @JsonProperty("totalNanos")
    public void setTotalNanos(long totalNanos) {
      this.totalNanos = totalNanos;
      this.totalNanosIsSet = true;
    }
    @JsonProperty("count")
    public void setCount(long count) {
      this.count = count;
      this.countIsSet = true;
    }
    @JsonProperty("active")
    public void setActive(boolean active) {
      this.active = active;
      this.activeIsSet = true;
    }
    @Override
    public long totalNanos() { throw new UnsupportedOperationException(); }
    @Override
    public long count() { throw new UnsupportedOperationException(); }
    @Override
    public boolean active() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableTimerImplSnapshot fromJson(Json json) {
    ImmutableTimerImplSnapshot.Builder builder = ImmutableTimerImplSnapshot.builder();
    if (json.totalNanosIsSet) {
      builder.totalNanos(json.totalNanos);
    }
    if (json.countIsSet) {
      builder.count(json.count);
    }
    if (json.activeIsSet) {
      builder.active(json.active);
    }
    return builder.build();
  }

  /**
   * Construct a new immutable {@code TimerImplSnapshot} instance.
   * @param totalNanos The value for the {@code totalNanos} attribute
   * @param count The value for the {@code count} attribute
   * @param active The value for the {@code active} attribute
   * @return An immutable TimerImplSnapshot instance
   */
  public static ImmutableTimerImplSnapshot of(long totalNanos, long count, boolean active) {
    return new ImmutableTimerImplSnapshot(totalNanos, count, active);
  }

  /**
   * Creates an immutable copy of a {@link CommonTimerImpl.TimerImplSnapshot} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable TimerImplSnapshot instance
   */
  public static ImmutableTimerImplSnapshot copyOf(CommonTimerImpl.TimerImplSnapshot instance) {
    if (instance instanceof ImmutableTimerImplSnapshot) {
      return (ImmutableTimerImplSnapshot) instance;
    }
    return ImmutableTimerImplSnapshot.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableTimerImplSnapshot ImmutableTimerImplSnapshot}.
   * @return A new ImmutableTimerImplSnapshot builder
   */
  public static ImmutableTimerImplSnapshot.Builder builder() {
    return new ImmutableTimerImplSnapshot.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableTimerImplSnapshot ImmutableTimerImplSnapshot}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_TOTAL_NANOS = 0x1L;
    private static final long INIT_BIT_COUNT = 0x2L;
    private static final long INIT_BIT_ACTIVE = 0x4L;
    private long initBits = 0x7L;

    private long totalNanos;
    private long count;
    private boolean active;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code TimerImplSnapshot} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(CommonTimerImpl.TimerImplSnapshot instance) {
      Preconditions.checkNotNull(instance, "instance");
      totalNanos(instance.totalNanos());
      count(instance.count());
      active(instance.active());
      return this;
    }

    /**
     * Initializes the value for the {@link CommonTimerImpl.TimerImplSnapshot#totalNanos() totalNanos} attribute.
     * @param totalNanos The value for totalNanos 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder totalNanos(long totalNanos) {
      this.totalNanos = totalNanos;
      initBits &= ~INIT_BIT_TOTAL_NANOS;
      return this;
    }

    /**
     * Initializes the value for the {@link CommonTimerImpl.TimerImplSnapshot#count() count} attribute.
     * @param count The value for count 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder count(long count) {
      this.count = count;
      initBits &= ~INIT_BIT_COUNT;
      return this;
    }

    /**
     * Initializes the value for the {@link CommonTimerImpl.TimerImplSnapshot#active() active} attribute.
     * @param active The value for active 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder active(boolean active) {
      this.active = active;
      initBits &= ~INIT_BIT_ACTIVE;
      return this;
    }

    /**
     * Builds a new {@link ImmutableTimerImplSnapshot ImmutableTimerImplSnapshot}.
     * @return An immutable instance of TimerImplSnapshot
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableTimerImplSnapshot build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableTimerImplSnapshot(totalNanos, count, active);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_TOTAL_NANOS) != 0) attributes.add("totalNanos");
      if ((initBits & INIT_BIT_COUNT) != 0) attributes.add("count");
      if ((initBits & INIT_BIT_ACTIVE) != 0) attributes.add("active");
      return "Cannot build TimerImplSnapshot, some of required attributes are not set " + attributes;
    }
  }
}
