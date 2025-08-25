package org.glowroot.agent.it.harness.impl;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link TraceCollector.ExpectedLogMessage}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableExpectedLogMessage.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code ImmutableExpectedLogMessage.of()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "TraceCollector.ExpectedLogMessage"})
@Immutable
final class ImmutableExpectedLogMessage
    implements TraceCollector.ExpectedLogMessage {
  private final String loggerName;
  private final String partialMessage;

  private ImmutableExpectedLogMessage(String loggerName, String partialMessage) {
    this.loggerName = Preconditions.checkNotNull(loggerName, "loggerName");
    this.partialMessage = Preconditions.checkNotNull(partialMessage, "partialMessage");
  }

  private ImmutableExpectedLogMessage(ImmutableExpectedLogMessage original, String loggerName, String partialMessage) {
    this.loggerName = loggerName;
    this.partialMessage = partialMessage;
  }

  /**
   * @return The value of the {@code loggerName} attribute
   */
  @Override
  public String loggerName() {
    return loggerName;
  }

  /**
   * @return The value of the {@code partialMessage} attribute
   */
  @Override
  public String partialMessage() {
    return partialMessage;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TraceCollector.ExpectedLogMessage#loggerName() loggerName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for loggerName
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableExpectedLogMessage withLoggerName(String value) {
    if (this.loggerName.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "loggerName");
    return new ImmutableExpectedLogMessage(this, newValue, this.partialMessage);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TraceCollector.ExpectedLogMessage#partialMessage() partialMessage} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for partialMessage
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableExpectedLogMessage withPartialMessage(String value) {
    if (this.partialMessage.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "partialMessage");
    return new ImmutableExpectedLogMessage(this, this.loggerName, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableExpectedLogMessage} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableExpectedLogMessage
        && equalTo((ImmutableExpectedLogMessage) another);
  }

  private boolean equalTo(ImmutableExpectedLogMessage another) {
    return loggerName.equals(another.loggerName)
        && partialMessage.equals(another.partialMessage);
  }

  /**
   * Computes a hash code from attributes: {@code loggerName}, {@code partialMessage}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + loggerName.hashCode();
    h += (h << 5) + partialMessage.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code ExpectedLogMessage} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("ExpectedLogMessage")
        .omitNullValues()
        .add("loggerName", loggerName)
        .add("partialMessage", partialMessage)
        .toString();
  }

  /**
   * Construct a new immutable {@code ExpectedLogMessage} instance.
   * @param loggerName The value for the {@code loggerName} attribute
   * @param partialMessage The value for the {@code partialMessage} attribute
   * @return An immutable ExpectedLogMessage instance
   */
  public static ImmutableExpectedLogMessage of(String loggerName, String partialMessage) {
    return new ImmutableExpectedLogMessage(loggerName, partialMessage);
  }

  /**
   * Creates an immutable copy of a {@link TraceCollector.ExpectedLogMessage} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ExpectedLogMessage instance
   */
  public static ImmutableExpectedLogMessage copyOf(TraceCollector.ExpectedLogMessage instance) {
    if (instance instanceof ImmutableExpectedLogMessage) {
      return (ImmutableExpectedLogMessage) instance;
    }
    return ImmutableExpectedLogMessage.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableExpectedLogMessage ImmutableExpectedLogMessage}.
   * @return A new ImmutableExpectedLogMessage builder
   */
  public static ImmutableExpectedLogMessage.Builder builder() {
    return new ImmutableExpectedLogMessage.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableExpectedLogMessage ImmutableExpectedLogMessage}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_LOGGER_NAME = 0x1L;
    private static final long INIT_BIT_PARTIAL_MESSAGE = 0x2L;
    private long initBits = 0x3L;

    private @Nullable String loggerName;
    private @Nullable String partialMessage;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code ExpectedLogMessage} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(TraceCollector.ExpectedLogMessage instance) {
      Preconditions.checkNotNull(instance, "instance");
      loggerName(instance.loggerName());
      partialMessage(instance.partialMessage());
      return this;
    }

    /**
     * Initializes the value for the {@link TraceCollector.ExpectedLogMessage#loggerName() loggerName} attribute.
     * @param loggerName The value for loggerName 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder loggerName(String loggerName) {
      this.loggerName = Preconditions.checkNotNull(loggerName, "loggerName");
      initBits &= ~INIT_BIT_LOGGER_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link TraceCollector.ExpectedLogMessage#partialMessage() partialMessage} attribute.
     * @param partialMessage The value for partialMessage 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder partialMessage(String partialMessage) {
      this.partialMessage = Preconditions.checkNotNull(partialMessage, "partialMessage");
      initBits &= ~INIT_BIT_PARTIAL_MESSAGE;
      return this;
    }

    /**
     * Builds a new {@link ImmutableExpectedLogMessage ImmutableExpectedLogMessage}.
     * @return An immutable instance of ExpectedLogMessage
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableExpectedLogMessage build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableExpectedLogMessage(null, loggerName, partialMessage);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_LOGGER_NAME) != 0) attributes.add("loggerName");
      if ((initBits & INIT_BIT_PARTIAL_MESSAGE) != 0) attributes.add("partialMessage");
      return "Cannot build ExpectedLogMessage, some of required attributes are not set " + attributes;
    }
  }
}
