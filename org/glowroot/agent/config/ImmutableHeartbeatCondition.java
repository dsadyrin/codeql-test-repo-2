package org.glowroot.agent.config;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonTypeInfo;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import org.glowroot.agent.shaded.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link AlertConfig.HeartbeatCondition}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableHeartbeatCondition.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "AlertConfig.HeartbeatCondition"})
@Immutable
final class ImmutableHeartbeatCondition
    implements AlertConfig.HeartbeatCondition {
  private final int timePeriodSeconds;

  private ImmutableHeartbeatCondition(int timePeriodSeconds) {
    this.timePeriodSeconds = timePeriodSeconds;
  }

  /**
   * @return The value of the {@code timePeriodSeconds} attribute
   */
  @JsonProperty("timePeriodSeconds")
  @Override
  public int timePeriodSeconds() {
    return timePeriodSeconds;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AlertConfig.HeartbeatCondition#timePeriodSeconds() timePeriodSeconds} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for timePeriodSeconds
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableHeartbeatCondition withTimePeriodSeconds(int value) {
    if (this.timePeriodSeconds == value) return this;
    return new ImmutableHeartbeatCondition(value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableHeartbeatCondition} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableHeartbeatCondition
        && equalTo((ImmutableHeartbeatCondition) another);
  }

  private boolean equalTo(ImmutableHeartbeatCondition another) {
    return timePeriodSeconds == another.timePeriodSeconds;
  }

  /**
   * Computes a hash code from attributes: {@code timePeriodSeconds}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + timePeriodSeconds;
    return h;
  }

  /**
   * Prints the immutable value {@code HeartbeatCondition} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("HeartbeatCondition")
        .omitNullValues()
        .add("timePeriodSeconds", timePeriodSeconds)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonTypeInfo(use=JsonTypeInfo.Id.NONE)
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements AlertConfig.HeartbeatCondition {
    int timePeriodSeconds;
    boolean timePeriodSecondsIsSet;
    @JsonProperty("timePeriodSeconds")
    public void setTimePeriodSeconds(int timePeriodSeconds) {
      this.timePeriodSeconds = timePeriodSeconds;
      this.timePeriodSecondsIsSet = true;
    }
    @Override
    public int timePeriodSeconds() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableHeartbeatCondition fromJson(Json json) {
    ImmutableHeartbeatCondition.Builder builder = ImmutableHeartbeatCondition.builder();
    if (json.timePeriodSecondsIsSet) {
      builder.timePeriodSeconds(json.timePeriodSeconds);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link AlertConfig.HeartbeatCondition} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable HeartbeatCondition instance
   */
  public static ImmutableHeartbeatCondition copyOf(AlertConfig.HeartbeatCondition instance) {
    if (instance instanceof ImmutableHeartbeatCondition) {
      return (ImmutableHeartbeatCondition) instance;
    }
    return ImmutableHeartbeatCondition.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableHeartbeatCondition ImmutableHeartbeatCondition}.
   * @return A new ImmutableHeartbeatCondition builder
   */
  public static ImmutableHeartbeatCondition.Builder builder() {
    return new ImmutableHeartbeatCondition.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableHeartbeatCondition ImmutableHeartbeatCondition}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_TIME_PERIOD_SECONDS = 0x1L;
    private long initBits = 0x1L;

    private int timePeriodSeconds;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code HeartbeatCondition} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(AlertConfig.HeartbeatCondition instance) {
      Preconditions.checkNotNull(instance, "instance");
      timePeriodSeconds(instance.timePeriodSeconds());
      return this;
    }

    /**
     * Initializes the value for the {@link AlertConfig.HeartbeatCondition#timePeriodSeconds() timePeriodSeconds} attribute.
     * @param timePeriodSeconds The value for timePeriodSeconds 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder timePeriodSeconds(int timePeriodSeconds) {
      this.timePeriodSeconds = timePeriodSeconds;
      initBits &= ~INIT_BIT_TIME_PERIOD_SECONDS;
      return this;
    }

    /**
     * Builds a new {@link ImmutableHeartbeatCondition ImmutableHeartbeatCondition}.
     * @return An immutable instance of HeartbeatCondition
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableHeartbeatCondition build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableHeartbeatCondition(timePeriodSeconds);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_TIME_PERIOD_SECONDS) != 0) attributes.add("timePeriodSeconds");
      return "Cannot build HeartbeatCondition, some of required attributes are not set " + attributes;
    }
  }
}
