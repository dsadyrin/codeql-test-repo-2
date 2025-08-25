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
 * Immutable implementation of {@link AggregateMerging.PercentileValue}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePercentileValue.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code ImmutablePercentileValue.of()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "AggregateMerging.PercentileValue"})
@Immutable
final class ImmutablePercentileValue implements AggregateMerging.PercentileValue {
  private final String dataSeriesName;
  private final long value;

  private ImmutablePercentileValue(String dataSeriesName, long value) {
    this.dataSeriesName = Preconditions.checkNotNull(dataSeriesName, "dataSeriesName");
    this.value = value;
  }

  private ImmutablePercentileValue(ImmutablePercentileValue original, String dataSeriesName, long value) {
    this.dataSeriesName = dataSeriesName;
    this.value = value;
  }

  /**
   * @return The value of the {@code dataSeriesName} attribute
   */
  @JsonProperty("dataSeriesName")
  @Override
  public String dataSeriesName() {
    return dataSeriesName;
  }

  /**
   * @return The value of the {@code value} attribute
   */
  @JsonProperty("value")
  @Override
  public long value() {
    return value;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AggregateMerging.PercentileValue#dataSeriesName() dataSeriesName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for dataSeriesName
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePercentileValue withDataSeriesName(String value) {
    if (this.dataSeriesName.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "dataSeriesName");
    return new ImmutablePercentileValue(this, newValue, this.value);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AggregateMerging.PercentileValue#value() value} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for value
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePercentileValue withValue(long value) {
    if (this.value == value) return this;
    return new ImmutablePercentileValue(this, this.dataSeriesName, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePercentileValue} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePercentileValue
        && equalTo((ImmutablePercentileValue) another);
  }

  private boolean equalTo(ImmutablePercentileValue another) {
    return dataSeriesName.equals(another.dataSeriesName)
        && value == another.value;
  }

  /**
   * Computes a hash code from attributes: {@code dataSeriesName}, {@code value}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + dataSeriesName.hashCode();
    h += (h << 5) + Longs.hashCode(value);
    return h;
  }

  /**
   * Prints the immutable value {@code PercentileValue} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("PercentileValue")
        .omitNullValues()
        .add("dataSeriesName", dataSeriesName)
        .add("value", value)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements AggregateMerging.PercentileValue {
    @Nullable String dataSeriesName;
    long value;
    boolean valueIsSet;
    @JsonProperty("dataSeriesName")
    public void setDataSeriesName(String dataSeriesName) {
      this.dataSeriesName = dataSeriesName;
    }
    @JsonProperty("value")
    public void setValue(long value) {
      this.value = value;
      this.valueIsSet = true;
    }
    @Override
    public String dataSeriesName() { throw new UnsupportedOperationException(); }
    @Override
    public long value() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutablePercentileValue fromJson(Json json) {
    ImmutablePercentileValue.Builder builder = ImmutablePercentileValue.builder();
    if (json.dataSeriesName != null) {
      builder.dataSeriesName(json.dataSeriesName);
    }
    if (json.valueIsSet) {
      builder.value(json.value);
    }
    return builder.build();
  }

  /**
   * Construct a new immutable {@code PercentileValue} instance.
   * @param dataSeriesName The value for the {@code dataSeriesName} attribute
   * @param value The value for the {@code value} attribute
   * @return An immutable PercentileValue instance
   */
  public static ImmutablePercentileValue of(String dataSeriesName, long value) {
    return new ImmutablePercentileValue(dataSeriesName, value);
  }

  /**
   * Creates an immutable copy of a {@link AggregateMerging.PercentileValue} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable PercentileValue instance
   */
  public static ImmutablePercentileValue copyOf(AggregateMerging.PercentileValue instance) {
    if (instance instanceof ImmutablePercentileValue) {
      return (ImmutablePercentileValue) instance;
    }
    return ImmutablePercentileValue.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutablePercentileValue ImmutablePercentileValue}.
   * @return A new ImmutablePercentileValue builder
   */
  public static ImmutablePercentileValue.Builder builder() {
    return new ImmutablePercentileValue.Builder();
  }

  /**
   * Builds instances of type {@link ImmutablePercentileValue ImmutablePercentileValue}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_DATA_SERIES_NAME = 0x1L;
    private static final long INIT_BIT_VALUE = 0x2L;
    private long initBits = 0x3L;

    private @Nullable String dataSeriesName;
    private long value;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code PercentileValue} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(AggregateMerging.PercentileValue instance) {
      Preconditions.checkNotNull(instance, "instance");
      dataSeriesName(instance.dataSeriesName());
      value(instance.value());
      return this;
    }

    /**
     * Initializes the value for the {@link AggregateMerging.PercentileValue#dataSeriesName() dataSeriesName} attribute.
     * @param dataSeriesName The value for dataSeriesName 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder dataSeriesName(String dataSeriesName) {
      this.dataSeriesName = Preconditions.checkNotNull(dataSeriesName, "dataSeriesName");
      initBits &= ~INIT_BIT_DATA_SERIES_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link AggregateMerging.PercentileValue#value() value} attribute.
     * @param value The value for value 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder value(long value) {
      this.value = value;
      initBits &= ~INIT_BIT_VALUE;
      return this;
    }

    /**
     * Builds a new {@link ImmutablePercentileValue ImmutablePercentileValue}.
     * @return An immutable instance of PercentileValue
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutablePercentileValue build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutablePercentileValue(null, dataSeriesName, value);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_DATA_SERIES_NAME) != 0) attributes.add("dataSeriesName");
      if ((initBits & INIT_BIT_VALUE) != 0) attributes.add("value");
      return "Cannot build PercentileValue, some of required attributes are not set " + attributes;
    }
  }
}
