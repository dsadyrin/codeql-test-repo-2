package org.glowroot.agent.model;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Objects;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import org.glowroot.agent.shaded.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.glowroot.agent.shaded.glowroot.wire.api.model.Proto;

/**
 * Immutable implementation of {@link ErrorMessage}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableErrorMessage.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code ImmutableErrorMessage.of()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "ErrorMessage"})
@Immutable
public final class ImmutableErrorMessage extends ErrorMessage {
  private final String message;
  private final @Nullable Proto.Throwable throwable;

  private ImmutableErrorMessage(
      String message,
      @Nullable Proto.Throwable throwable) {
    this.message = Preconditions.checkNotNull(message, "message");
    this.throwable = throwable;
  }

  private ImmutableErrorMessage(
      ImmutableErrorMessage original,
      String message,
      @Nullable Proto.Throwable throwable) {
    this.message = message;
    this.throwable = throwable;
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
   * @return The value of the {@code throwable} attribute
   */
  @JsonProperty("throwable")
  @Override
  public @Nullable Proto.Throwable throwable() {
    return throwable;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ErrorMessage#message() message} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for message
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableErrorMessage withMessage(String value) {
    if (this.message.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "message");
    return new ImmutableErrorMessage(this, newValue, this.throwable);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ErrorMessage#throwable() throwable} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for throwable (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableErrorMessage withThrowable(@Nullable Proto.Throwable value) {
    if (this.throwable == value) return this;
    return new ImmutableErrorMessage(this, this.message, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableErrorMessage} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableErrorMessage
        && equalTo((ImmutableErrorMessage) another);
  }

  private boolean equalTo(ImmutableErrorMessage another) {
    return message.equals(another.message)
        && Objects.equal(throwable, another.throwable);
  }

  /**
   * Computes a hash code from attributes: {@code message}, {@code throwable}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + message.hashCode();
    h += (h << 5) + Objects.hashCode(throwable);
    return h;
  }

  /**
   * Prints the immutable value {@code ErrorMessage} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("ErrorMessage")
        .omitNullValues()
        .add("message", message)
        .add("throwable", throwable)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends ErrorMessage {
    @Nullable String message;
    @Nullable Proto.Throwable throwable;
    @JsonProperty("message")
    public void setMessage(String message) {
      this.message = message;
    }
    @JsonProperty("throwable")
    public void setThrowable(@Nullable Proto.Throwable throwable) {
      this.throwable = throwable;
    }
    @Override
    public String message() { throw new UnsupportedOperationException(); }
    @Override
    public Proto.Throwable throwable() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableErrorMessage fromJson(Json json) {
    ImmutableErrorMessage.Builder builder = ImmutableErrorMessage.builder();
    if (json.message != null) {
      builder.message(json.message);
    }
    if (json.throwable != null) {
      builder.throwable(json.throwable);
    }
    return builder.build();
  }

  /**
   * Construct a new immutable {@code ErrorMessage} instance.
   * @param message The value for the {@code message} attribute
   * @param throwable The value for the {@code throwable} attribute
   * @return An immutable ErrorMessage instance
   */
  public static ImmutableErrorMessage of(String message, @Nullable Proto.Throwable throwable) {
    return new ImmutableErrorMessage(message, throwable);
  }

  /**
   * Creates an immutable copy of a {@link ErrorMessage} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ErrorMessage instance
   */
  public static ImmutableErrorMessage copyOf(ErrorMessage instance) {
    if (instance instanceof ImmutableErrorMessage) {
      return (ImmutableErrorMessage) instance;
    }
    return ImmutableErrorMessage.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableErrorMessage ImmutableErrorMessage}.
   * @return A new ImmutableErrorMessage builder
   */
  public static ImmutableErrorMessage.Builder builder() {
    return new ImmutableErrorMessage.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableErrorMessage ImmutableErrorMessage}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_MESSAGE = 0x1L;
    private long initBits = 0x1L;

    private @Nullable String message;
    private @Nullable Proto.Throwable throwable;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code ErrorMessage} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(ErrorMessage instance) {
      Preconditions.checkNotNull(instance, "instance");
      message(instance.message());
      @Nullable Proto.Throwable throwableValue = instance.throwable();
      if (throwableValue != null) {
        throwable(throwableValue);
      }
      return this;
    }

    /**
     * Initializes the value for the {@link ErrorMessage#message() message} attribute.
     * @param message The value for message 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder message(String message) {
      this.message = Preconditions.checkNotNull(message, "message");
      initBits &= ~INIT_BIT_MESSAGE;
      return this;
    }

    /**
     * Initializes the value for the {@link ErrorMessage#throwable() throwable} attribute.
     * @param throwable The value for throwable (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder throwable(@Nullable Proto.Throwable throwable) {
      this.throwable = throwable;
      return this;
    }

    /**
     * Builds a new {@link ImmutableErrorMessage ImmutableErrorMessage}.
     * @return An immutable instance of ErrorMessage
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableErrorMessage build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableErrorMessage(null, message, throwable);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_MESSAGE) != 0) attributes.add("message");
      return "Cannot build ErrorMessage, some of required attributes are not set " + attributes;
    }
  }
}
