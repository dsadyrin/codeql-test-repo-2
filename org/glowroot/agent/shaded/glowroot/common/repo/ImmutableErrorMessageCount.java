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
 * Immutable implementation of {@link TraceRepository.ErrorMessageCount}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableErrorMessageCount.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code ImmutableErrorMessageCount.of()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "TraceRepository.ErrorMessageCount"})
@Immutable
public final class ImmutableErrorMessageCount
    implements TraceRepository.ErrorMessageCount {
  private final String message;
  private final long count;

  private ImmutableErrorMessageCount(String message, long count) {
    this.message = Preconditions.checkNotNull(message, "message");
    this.count = count;
  }

  private ImmutableErrorMessageCount(ImmutableErrorMessageCount original, String message, long count) {
    this.message = message;
    this.count = count;
  }

  /**
   * @return The value of the {@code message} attribute
   */
  @JsonProperty("message")
  @Override
  public String message() {
    return message;
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
   * Copy the current immutable object by setting a value for the {@link TraceRepository.ErrorMessageCount#message() message} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for message
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableErrorMessageCount withMessage(String value) {
    if (this.message.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "message");
    return new ImmutableErrorMessageCount(this, newValue, this.count);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TraceRepository.ErrorMessageCount#count() count} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for count
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableErrorMessageCount withCount(long value) {
    if (this.count == value) return this;
    return new ImmutableErrorMessageCount(this, this.message, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableErrorMessageCount} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableErrorMessageCount
        && equalTo((ImmutableErrorMessageCount) another);
  }

  private boolean equalTo(ImmutableErrorMessageCount another) {
    return message.equals(another.message)
        && count == another.count;
  }

  /**
   * Computes a hash code from attributes: {@code message}, {@code count}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + message.hashCode();
    h += (h << 5) + Longs.hashCode(count);
    return h;
  }

  /**
   * Prints the immutable value {@code ErrorMessageCount} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("ErrorMessageCount")
        .omitNullValues()
        .add("message", message)
        .add("count", count)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements TraceRepository.ErrorMessageCount {
    @Nullable String message;
    long count;
    boolean countIsSet;
    @JsonProperty("message")
    public void setMessage(String message) {
      this.message = message;
    }
    @JsonProperty("count")
    public void setCount(long count) {
      this.count = count;
      this.countIsSet = true;
    }
    @Override
    public String message() { throw new UnsupportedOperationException(); }
    @Override
    public long count() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableErrorMessageCount fromJson(Json json) {
    ImmutableErrorMessageCount.Builder builder = ImmutableErrorMessageCount.builder();
    if (json.message != null) {
      builder.message(json.message);
    }
    if (json.countIsSet) {
      builder.count(json.count);
    }
    return builder.build();
  }

  /**
   * Construct a new immutable {@code ErrorMessageCount} instance.
   * @param message The value for the {@code message} attribute
   * @param count The value for the {@code count} attribute
   * @return An immutable ErrorMessageCount instance
   */
  public static ImmutableErrorMessageCount of(String message, long count) {
    return new ImmutableErrorMessageCount(message, count);
  }

  /**
   * Creates an immutable copy of a {@link TraceRepository.ErrorMessageCount} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ErrorMessageCount instance
   */
  public static ImmutableErrorMessageCount copyOf(TraceRepository.ErrorMessageCount instance) {
    if (instance instanceof ImmutableErrorMessageCount) {
      return (ImmutableErrorMessageCount) instance;
    }
    return ImmutableErrorMessageCount.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableErrorMessageCount ImmutableErrorMessageCount}.
   * @return A new ImmutableErrorMessageCount builder
   */
  public static ImmutableErrorMessageCount.Builder builder() {
    return new ImmutableErrorMessageCount.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableErrorMessageCount ImmutableErrorMessageCount}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_MESSAGE = 0x1L;
    private static final long INIT_BIT_COUNT = 0x2L;
    private long initBits = 0x3L;

    private @Nullable String message;
    private long count;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code ErrorMessageCount} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(TraceRepository.ErrorMessageCount instance) {
      Preconditions.checkNotNull(instance, "instance");
      message(instance.message());
      count(instance.count());
      return this;
    }

    /**
     * Initializes the value for the {@link TraceRepository.ErrorMessageCount#message() message} attribute.
     * @param message The value for message 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder message(String message) {
      this.message = Preconditions.checkNotNull(message, "message");
      initBits &= ~INIT_BIT_MESSAGE;
      return this;
    }

    /**
     * Initializes the value for the {@link TraceRepository.ErrorMessageCount#count() count} attribute.
     * @param count The value for count 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder count(long count) {
      this.count = count;
      initBits &= ~INIT_BIT_COUNT;
      return this;
    }

    /**
     * Builds a new {@link ImmutableErrorMessageCount ImmutableErrorMessageCount}.
     * @return An immutable instance of ErrorMessageCount
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableErrorMessageCount build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableErrorMessageCount(null, message, count);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_MESSAGE) != 0) attributes.add("message");
      if ((initBits & INIT_BIT_COUNT) != 0) attributes.add("count");
      return "Cannot build ErrorMessageCount, some of required attributes are not set " + attributes;
    }
  }
}
