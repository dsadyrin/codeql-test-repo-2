package org.glowroot.agent.shaded.glowroot.ui;

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
 * Immutable implementation of {@link AlertConfigJsonService.AlertConfigDto.HeartbeatConditionDto}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableHeartbeatConditionDto.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "AlertConfigJsonService.AlertConfigDto.HeartbeatConditionDto"})
@Immutable
public final class ImmutableHeartbeatConditionDto
    implements AlertConfigJsonService.AlertConfigDto.HeartbeatConditionDto {
  private final int timePeriodSeconds;

  private ImmutableHeartbeatConditionDto(int timePeriodSeconds) {
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
   * Copy the current immutable object by setting a value for the {@link AlertConfigJsonService.AlertConfigDto.HeartbeatConditionDto#timePeriodSeconds() timePeriodSeconds} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for timePeriodSeconds
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableHeartbeatConditionDto withTimePeriodSeconds(int value) {
    if (this.timePeriodSeconds == value) return this;
    return new ImmutableHeartbeatConditionDto(value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableHeartbeatConditionDto} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableHeartbeatConditionDto
        && equalTo((ImmutableHeartbeatConditionDto) another);
  }

  private boolean equalTo(ImmutableHeartbeatConditionDto another) {
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
   * Prints the immutable value {@code HeartbeatConditionDto} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("HeartbeatConditionDto")
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
  static final class Json
      implements AlertConfigJsonService.AlertConfigDto.HeartbeatConditionDto {
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
  static ImmutableHeartbeatConditionDto fromJson(Json json) {
    ImmutableHeartbeatConditionDto.Builder builder = ImmutableHeartbeatConditionDto.builder();
    if (json.timePeriodSecondsIsSet) {
      builder.timePeriodSeconds(json.timePeriodSeconds);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link AlertConfigJsonService.AlertConfigDto.HeartbeatConditionDto} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable HeartbeatConditionDto instance
   */
  public static ImmutableHeartbeatConditionDto copyOf(AlertConfigJsonService.AlertConfigDto.HeartbeatConditionDto instance) {
    if (instance instanceof ImmutableHeartbeatConditionDto) {
      return (ImmutableHeartbeatConditionDto) instance;
    }
    return ImmutableHeartbeatConditionDto.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableHeartbeatConditionDto ImmutableHeartbeatConditionDto}.
   * @return A new ImmutableHeartbeatConditionDto builder
   */
  public static ImmutableHeartbeatConditionDto.Builder builder() {
    return new ImmutableHeartbeatConditionDto.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableHeartbeatConditionDto ImmutableHeartbeatConditionDto}.
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
     * Fill a builder with attribute values from the provided {@code HeartbeatConditionDto} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(AlertConfigJsonService.AlertConfigDto.HeartbeatConditionDto instance) {
      Preconditions.checkNotNull(instance, "instance");
      timePeriodSeconds(instance.timePeriodSeconds());
      return this;
    }

    /**
     * Initializes the value for the {@link AlertConfigJsonService.AlertConfigDto.HeartbeatConditionDto#timePeriodSeconds() timePeriodSeconds} attribute.
     * @param timePeriodSeconds The value for timePeriodSeconds 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder timePeriodSeconds(int timePeriodSeconds) {
      this.timePeriodSeconds = timePeriodSeconds;
      initBits &= ~INIT_BIT_TIME_PERIOD_SECONDS;
      return this;
    }

    /**
     * Builds a new {@link ImmutableHeartbeatConditionDto ImmutableHeartbeatConditionDto}.
     * @return An immutable instance of HeartbeatConditionDto
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableHeartbeatConditionDto build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableHeartbeatConditionDto(timePeriodSeconds);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_TIME_PERIOD_SECONDS) != 0) attributes.add("timePeriodSeconds");
      return "Cannot build HeartbeatConditionDto, some of required attributes are not set " + attributes;
    }
  }
}
