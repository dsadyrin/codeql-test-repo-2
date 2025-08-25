package org.glowroot.agent.shaded.glowroot.ui;

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
 * Immutable implementation of {@link TransactionJsonService.ServiceCall}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableServiceCall.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "TransactionJsonService.ServiceCall"})
@Immutable
final class ImmutableServiceCall implements TransactionJsonService.ServiceCall {
  private final String type;
  private final String text;
  private final double totalDurationNanos;
  private final long executionCount;

  private ImmutableServiceCall(String type, String text, double totalDurationNanos, long executionCount) {
    this.type = type;
    this.text = text;
    this.totalDurationNanos = totalDurationNanos;
    this.executionCount = executionCount;
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public String type() {
    return type;
  }

  /**
   * @return The value of the {@code text} attribute
   */
  @JsonProperty("text")
  @Override
  public String text() {
    return text;
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
   * Copy the current immutable object by setting a value for the {@link TransactionJsonService.ServiceCall#type() type} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for type
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableServiceCall withType(String value) {
    if (this.type.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "type");
    return new ImmutableServiceCall(newValue, this.text, this.totalDurationNanos, this.executionCount);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TransactionJsonService.ServiceCall#text() text} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for text
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableServiceCall withText(String value) {
    if (this.text.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "text");
    return new ImmutableServiceCall(this.type, newValue, this.totalDurationNanos, this.executionCount);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TransactionJsonService.ServiceCall#totalDurationNanos() totalDurationNanos} attribute.
   * A value strict bits equality used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for totalDurationNanos
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableServiceCall withTotalDurationNanos(double value) {
    if (Double.doubleToLongBits(this.totalDurationNanos) == Double.doubleToLongBits(value)) return this;
    return new ImmutableServiceCall(this.type, this.text, value, this.executionCount);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TransactionJsonService.ServiceCall#executionCount() executionCount} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for executionCount
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableServiceCall withExecutionCount(long value) {
    if (this.executionCount == value) return this;
    return new ImmutableServiceCall(this.type, this.text, this.totalDurationNanos, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableServiceCall} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableServiceCall
        && equalTo((ImmutableServiceCall) another);
  }

  private boolean equalTo(ImmutableServiceCall another) {
    return type.equals(another.type)
        && text.equals(another.text)
        && Double.doubleToLongBits(totalDurationNanos) == Double.doubleToLongBits(another.totalDurationNanos)
        && executionCount == another.executionCount;
  }

  /**
   * Computes a hash code from attributes: {@code type}, {@code text}, {@code totalDurationNanos}, {@code executionCount}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + type.hashCode();
    h += (h << 5) + text.hashCode();
    h += (h << 5) + Doubles.hashCode(totalDurationNanos);
    h += (h << 5) + Longs.hashCode(executionCount);
    return h;
  }

  /**
   * Prints the immutable value {@code ServiceCall} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("ServiceCall")
        .omitNullValues()
        .add("type", type)
        .add("text", text)
        .add("totalDurationNanos", totalDurationNanos)
        .add("executionCount", executionCount)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements TransactionJsonService.ServiceCall {
    @Nullable String type;
    @Nullable String text;
    double totalDurationNanos;
    boolean totalDurationNanosIsSet;
    long executionCount;
    boolean executionCountIsSet;
    @JsonProperty("type")
    public void setType(String type) {
      this.type = type;
    }
    @JsonProperty("text")
    public void setText(String text) {
      this.text = text;
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
    @Override
    public String type() { throw new UnsupportedOperationException(); }
    @Override
    public String text() { throw new UnsupportedOperationException(); }
    @Override
    public double totalDurationNanos() { throw new UnsupportedOperationException(); }
    @Override
    public long executionCount() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableServiceCall fromJson(Json json) {
    ImmutableServiceCall.Builder builder = ImmutableServiceCall.builder();
    if (json.type != null) {
      builder.type(json.type);
    }
    if (json.text != null) {
      builder.text(json.text);
    }
    if (json.totalDurationNanosIsSet) {
      builder.totalDurationNanos(json.totalDurationNanos);
    }
    if (json.executionCountIsSet) {
      builder.executionCount(json.executionCount);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link TransactionJsonService.ServiceCall} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ServiceCall instance
   */
  public static ImmutableServiceCall copyOf(TransactionJsonService.ServiceCall instance) {
    if (instance instanceof ImmutableServiceCall) {
      return (ImmutableServiceCall) instance;
    }
    return ImmutableServiceCall.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableServiceCall ImmutableServiceCall}.
   * @return A new ImmutableServiceCall builder
   */
  public static ImmutableServiceCall.Builder builder() {
    return new ImmutableServiceCall.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableServiceCall ImmutableServiceCall}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_TYPE = 0x1L;
    private static final long INIT_BIT_TEXT = 0x2L;
    private static final long INIT_BIT_TOTAL_DURATION_NANOS = 0x4L;
    private static final long INIT_BIT_EXECUTION_COUNT = 0x8L;
    private long initBits = 0xfL;

    private @Nullable String type;
    private @Nullable String text;
    private double totalDurationNanos;
    private long executionCount;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code ServiceCall} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(TransactionJsonService.ServiceCall instance) {
      Preconditions.checkNotNull(instance, "instance");
      type(instance.type());
      text(instance.text());
      totalDurationNanos(instance.totalDurationNanos());
      executionCount(instance.executionCount());
      return this;
    }

    /**
     * Initializes the value for the {@link TransactionJsonService.ServiceCall#type() type} attribute.
     * @param type The value for type 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder type(String type) {
      this.type = Preconditions.checkNotNull(type, "type");
      initBits &= ~INIT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the value for the {@link TransactionJsonService.ServiceCall#text() text} attribute.
     * @param text The value for text 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder text(String text) {
      this.text = Preconditions.checkNotNull(text, "text");
      initBits &= ~INIT_BIT_TEXT;
      return this;
    }

    /**
     * Initializes the value for the {@link TransactionJsonService.ServiceCall#totalDurationNanos() totalDurationNanos} attribute.
     * @param totalDurationNanos The value for totalDurationNanos 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder totalDurationNanos(double totalDurationNanos) {
      this.totalDurationNanos = totalDurationNanos;
      initBits &= ~INIT_BIT_TOTAL_DURATION_NANOS;
      return this;
    }

    /**
     * Initializes the value for the {@link TransactionJsonService.ServiceCall#executionCount() executionCount} attribute.
     * @param executionCount The value for executionCount 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder executionCount(long executionCount) {
      this.executionCount = executionCount;
      initBits &= ~INIT_BIT_EXECUTION_COUNT;
      return this;
    }

    /**
     * Builds a new {@link ImmutableServiceCall ImmutableServiceCall}.
     * @return An immutable instance of ServiceCall
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableServiceCall build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableServiceCall(type, text, totalDurationNanos, executionCount);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_TYPE) != 0) attributes.add("type");
      if ((initBits & INIT_BIT_TEXT) != 0) attributes.add("text");
      if ((initBits & INIT_BIT_TOTAL_DURATION_NANOS) != 0) attributes.add("totalDurationNanos");
      if ((initBits & INIT_BIT_EXECUTION_COUNT) != 0) attributes.add("executionCount");
      return "Cannot build ServiceCall, some of required attributes are not set " + attributes;
    }
  }
}
