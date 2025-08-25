package org.glowroot.agent.init;

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
 * Immutable implementation of {@link GaugeCollector.RawCounterValue}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableRawCounterValue.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code ImmutableRawCounterValue.of()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "GaugeCollector.RawCounterValue"})
@Immutable
final class ImmutableRawCounterValue implements GaugeCollector.RawCounterValue {
  private final double value;
  private final long captureTick;

  private ImmutableRawCounterValue(double value, long captureTick) {
    this.value = value;
    this.captureTick = captureTick;
  }

  /**
   * @return The value of the {@code value} attribute
   */
  @JsonProperty("value")
  @Override
  public double value() {
    return value;
  }

  /**
   * @return The value of the {@code captureTick} attribute
   */
  @JsonProperty("captureTick")
  @Override
  public long captureTick() {
    return captureTick;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link GaugeCollector.RawCounterValue#value() value} attribute.
   * A value strict bits equality used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for value
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRawCounterValue withValue(double value) {
    if (Double.doubleToLongBits(this.value) == Double.doubleToLongBits(value)) return this;
    return new ImmutableRawCounterValue(value, this.captureTick);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link GaugeCollector.RawCounterValue#captureTick() captureTick} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for captureTick
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRawCounterValue withCaptureTick(long value) {
    if (this.captureTick == value) return this;
    return new ImmutableRawCounterValue(this.value, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableRawCounterValue} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableRawCounterValue
        && equalTo((ImmutableRawCounterValue) another);
  }

  private boolean equalTo(ImmutableRawCounterValue another) {
    return Double.doubleToLongBits(value) == Double.doubleToLongBits(another.value)
        && captureTick == another.captureTick;
  }

  /**
   * Computes a hash code from attributes: {@code value}, {@code captureTick}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Doubles.hashCode(value);
    h += (h << 5) + Longs.hashCode(captureTick);
    return h;
  }

  /**
   * Prints the immutable value {@code RawCounterValue} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("RawCounterValue")
        .omitNullValues()
        .add("value", value)
        .add("captureTick", captureTick)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements GaugeCollector.RawCounterValue {
    double value;
    boolean valueIsSet;
    long captureTick;
    boolean captureTickIsSet;
    @JsonProperty("value")
    public void setValue(double value) {
      this.value = value;
      this.valueIsSet = true;
    }
    @JsonProperty("captureTick")
    public void setCaptureTick(long captureTick) {
      this.captureTick = captureTick;
      this.captureTickIsSet = true;
    }
    @Override
    public double value() { throw new UnsupportedOperationException(); }
    @Override
    public long captureTick() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableRawCounterValue fromJson(Json json) {
    ImmutableRawCounterValue.Builder builder = ImmutableRawCounterValue.builder();
    if (json.valueIsSet) {
      builder.value(json.value);
    }
    if (json.captureTickIsSet) {
      builder.captureTick(json.captureTick);
    }
    return builder.build();
  }

  /**
   * Construct a new immutable {@code RawCounterValue} instance.
   * @param value The value for the {@code value} attribute
   * @param captureTick The value for the {@code captureTick} attribute
   * @return An immutable RawCounterValue instance
   */
  public static ImmutableRawCounterValue of(double value, long captureTick) {
    return new ImmutableRawCounterValue(value, captureTick);
  }

  /**
   * Creates an immutable copy of a {@link GaugeCollector.RawCounterValue} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable RawCounterValue instance
   */
  public static ImmutableRawCounterValue copyOf(GaugeCollector.RawCounterValue instance) {
    if (instance instanceof ImmutableRawCounterValue) {
      return (ImmutableRawCounterValue) instance;
    }
    return ImmutableRawCounterValue.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableRawCounterValue ImmutableRawCounterValue}.
   * @return A new ImmutableRawCounterValue builder
   */
  public static ImmutableRawCounterValue.Builder builder() {
    return new ImmutableRawCounterValue.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableRawCounterValue ImmutableRawCounterValue}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_VALUE = 0x1L;
    private static final long INIT_BIT_CAPTURE_TICK = 0x2L;
    private long initBits = 0x3L;

    private double value;
    private long captureTick;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code RawCounterValue} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(GaugeCollector.RawCounterValue instance) {
      Preconditions.checkNotNull(instance, "instance");
      value(instance.value());
      captureTick(instance.captureTick());
      return this;
    }

    /**
     * Initializes the value for the {@link GaugeCollector.RawCounterValue#value() value} attribute.
     * @param value The value for value 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder value(double value) {
      this.value = value;
      initBits &= ~INIT_BIT_VALUE;
      return this;
    }

    /**
     * Initializes the value for the {@link GaugeCollector.RawCounterValue#captureTick() captureTick} attribute.
     * @param captureTick The value for captureTick 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder captureTick(long captureTick) {
      this.captureTick = captureTick;
      initBits &= ~INIT_BIT_CAPTURE_TICK;
      return this;
    }

    /**
     * Builds a new {@link ImmutableRawCounterValue ImmutableRawCounterValue}.
     * @return An immutable instance of RawCounterValue
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableRawCounterValue build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableRawCounterValue(value, captureTick);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_VALUE) != 0) attributes.add("value");
      if ((initBits & INIT_BIT_CAPTURE_TICK) != 0) attributes.add("captureTick");
      return "Cannot build RawCounterValue, some of required attributes are not set " + attributes;
    }
  }
}
