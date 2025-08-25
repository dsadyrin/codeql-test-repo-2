package org.glowroot.agent.shaded.glowroot.ui;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Objects;
import org.glowroot.agent.shaded.google.common.base.Optional;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import org.glowroot.agent.shaded.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link AlertConfigJsonService.AlertConfigDto}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAlertConfigDto.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "AlertConfigJsonService.AlertConfigDto"})
@Immutable
final class ImmutableAlertConfigDto extends AlertConfigJsonService.AlertConfigDto {
  private final AlertConfigJsonService.AlertConfigDto.AlertConditionDto condition;
  private final @Nullable ImmutableEmailNotificationDto emailNotification;
  private final @Nullable ImmutablePagerDutyNotificationDto pagerDutyNotification;
  private final Optional<String> version;

  private ImmutableAlertConfigDto(
      AlertConfigJsonService.AlertConfigDto.AlertConditionDto condition,
      @Nullable ImmutableEmailNotificationDto emailNotification,
      @Nullable ImmutablePagerDutyNotificationDto pagerDutyNotification,
      Optional<String> version) {
    this.condition = condition;
    this.emailNotification = emailNotification;
    this.pagerDutyNotification = pagerDutyNotification;
    this.version = version;
  }

  /**
   * @return The value of the {@code condition} attribute
   */
  @JsonProperty("condition")
  @Override
  public AlertConfigJsonService.AlertConfigDto.AlertConditionDto condition() {
    return condition;
  }

  /**
   * @return The value of the {@code emailNotification} attribute
   */
  @JsonProperty("emailNotification")
  @Override
  public @Nullable ImmutableEmailNotificationDto emailNotification() {
    return emailNotification;
  }

  /**
   * @return The value of the {@code pagerDutyNotification} attribute
   */
  @JsonProperty("pagerDutyNotification")
  @Override
  public @Nullable ImmutablePagerDutyNotificationDto pagerDutyNotification() {
    return pagerDutyNotification;
  }

  /**
   * @return The value of the {@code version} attribute
   */
  @JsonProperty("version")
  @Override
  Optional<String> version() {
    return version;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AlertConfigJsonService.AlertConfigDto#condition() condition} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for condition
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAlertConfigDto withCondition(AlertConfigJsonService.AlertConfigDto.AlertConditionDto value) {
    if (this.condition == value) return this;
    AlertConfigJsonService.AlertConfigDto.AlertConditionDto newValue = Preconditions.checkNotNull(value, "condition");
    return new ImmutableAlertConfigDto(newValue, this.emailNotification, this.pagerDutyNotification, this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AlertConfigJsonService.AlertConfigDto#emailNotification() emailNotification} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for emailNotification (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAlertConfigDto withEmailNotification(@Nullable ImmutableEmailNotificationDto value) {
    if (this.emailNotification == value) return this;
    return new ImmutableAlertConfigDto(this.condition, value, this.pagerDutyNotification, this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AlertConfigJsonService.AlertConfigDto#pagerDutyNotification() pagerDutyNotification} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for pagerDutyNotification (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAlertConfigDto withPagerDutyNotification(@Nullable ImmutablePagerDutyNotificationDto value) {
    if (this.pagerDutyNotification == value) return this;
    return new ImmutableAlertConfigDto(this.condition, this.emailNotification, value, this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AlertConfigJsonService.AlertConfigDto#version() version} attribute.
   * @param value The value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAlertConfigDto withVersion(String value) {
    Optional<String> newValue = Optional.of(value);
    if (this.version.equals(newValue)) return this;
    return new ImmutableAlertConfigDto(this.condition, this.emailNotification, this.pagerDutyNotification, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AlertConfigJsonService.AlertConfigDto#version() version} attribute.
   * An equality check is used to prevent copying of the same value by returning {@code this}.
   * @param optional A value for version
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAlertConfigDto withVersion(Optional<String> optional) {
    Optional<String> value = (Optional<String>) optional;
    if (this.version.equals(value)) return this;
    return new ImmutableAlertConfigDto(this.condition, this.emailNotification, this.pagerDutyNotification, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAlertConfigDto} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAlertConfigDto
        && equalTo((ImmutableAlertConfigDto) another);
  }

  private boolean equalTo(ImmutableAlertConfigDto another) {
    return condition.equals(another.condition)
        && Objects.equal(emailNotification, another.emailNotification)
        && Objects.equal(pagerDutyNotification, another.pagerDutyNotification)
        && version.equals(another.version);
  }

  /**
   * Computes a hash code from attributes: {@code condition}, {@code emailNotification}, {@code pagerDutyNotification}, {@code version}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + condition.hashCode();
    h += (h << 5) + Objects.hashCode(emailNotification);
    h += (h << 5) + Objects.hashCode(pagerDutyNotification);
    h += (h << 5) + version.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code AlertConfigDto} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("AlertConfigDto")
        .omitNullValues()
        .add("condition", condition)
        .add("emailNotification", emailNotification)
        .add("pagerDutyNotification", pagerDutyNotification)
        .add("version", version.orNull())
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends AlertConfigJsonService.AlertConfigDto {
    @Nullable AlertConfigJsonService.AlertConfigDto.AlertConditionDto condition;
    @Nullable ImmutableEmailNotificationDto emailNotification;
    @Nullable ImmutablePagerDutyNotificationDto pagerDutyNotification;
    Optional<String> version = Optional.absent();
    @JsonProperty("condition")
    public void setCondition(AlertConfigJsonService.AlertConfigDto.AlertConditionDto condition) {
      this.condition = condition;
    }
    @JsonProperty("emailNotification")
    public void setEmailNotification(@Nullable ImmutableEmailNotificationDto emailNotification) {
      this.emailNotification = emailNotification;
    }
    @JsonProperty("pagerDutyNotification")
    public void setPagerDutyNotification(@Nullable ImmutablePagerDutyNotificationDto pagerDutyNotification) {
      this.pagerDutyNotification = pagerDutyNotification;
    }
    @JsonProperty("version")
    public void setVersion(Optional<String> version) {
      this.version = version;
    }
    @Override
    public AlertConfigJsonService.AlertConfigDto.AlertConditionDto condition() { throw new UnsupportedOperationException(); }
    @Override
    public ImmutableEmailNotificationDto emailNotification() { throw new UnsupportedOperationException(); }
    @Override
    public ImmutablePagerDutyNotificationDto pagerDutyNotification() { throw new UnsupportedOperationException(); }
    @Override
    Optional<String> version() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableAlertConfigDto fromJson(Json json) {
    ImmutableAlertConfigDto.Builder builder = ImmutableAlertConfigDto.builder();
    if (json.condition != null) {
      builder.condition(json.condition);
    }
    if (json.emailNotification != null) {
      builder.emailNotification(json.emailNotification);
    }
    if (json.pagerDutyNotification != null) {
      builder.pagerDutyNotification(json.pagerDutyNotification);
    }
    if (json.version != null) {
      builder.version(json.version);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link AlertConfigJsonService.AlertConfigDto} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable AlertConfigDto instance
   */
  public static ImmutableAlertConfigDto copyOf(AlertConfigJsonService.AlertConfigDto instance) {
    if (instance instanceof ImmutableAlertConfigDto) {
      return (ImmutableAlertConfigDto) instance;
    }
    return ImmutableAlertConfigDto.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableAlertConfigDto ImmutableAlertConfigDto}.
   * @return A new ImmutableAlertConfigDto builder
   */
  public static ImmutableAlertConfigDto.Builder builder() {
    return new ImmutableAlertConfigDto.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableAlertConfigDto ImmutableAlertConfigDto}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_CONDITION = 0x1L;
    private long initBits = 0x1L;

    private @Nullable AlertConfigJsonService.AlertConfigDto.AlertConditionDto condition;
    private @Nullable ImmutableEmailNotificationDto emailNotification;
    private @Nullable ImmutablePagerDutyNotificationDto pagerDutyNotification;
    private Optional<String> version = Optional.absent();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code AlertConfigDto} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(AlertConfigJsonService.AlertConfigDto instance) {
      Preconditions.checkNotNull(instance, "instance");
      condition(instance.condition());
      @Nullable ImmutableEmailNotificationDto emailNotificationValue = instance.emailNotification();
      if (emailNotificationValue != null) {
        emailNotification(emailNotificationValue);
      }
      @Nullable ImmutablePagerDutyNotificationDto pagerDutyNotificationValue = instance.pagerDutyNotification();
      if (pagerDutyNotificationValue != null) {
        pagerDutyNotification(pagerDutyNotificationValue);
      }
      Optional<String> versionOptional = instance.version();
      if (versionOptional.isPresent()) {
        version(versionOptional);
      }
      return this;
    }

    /**
     * Initializes the value for the {@link AlertConfigJsonService.AlertConfigDto#condition() condition} attribute.
     * @param condition The value for condition 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder condition(AlertConfigJsonService.AlertConfigDto.AlertConditionDto condition) {
      this.condition = Preconditions.checkNotNull(condition, "condition");
      initBits &= ~INIT_BIT_CONDITION;
      return this;
    }

    /**
     * Initializes the value for the {@link AlertConfigJsonService.AlertConfigDto#emailNotification() emailNotification} attribute.
     * @param emailNotification The value for emailNotification (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder emailNotification(@Nullable ImmutableEmailNotificationDto emailNotification) {
      this.emailNotification = emailNotification;
      return this;
    }

    /**
     * Initializes the value for the {@link AlertConfigJsonService.AlertConfigDto#pagerDutyNotification() pagerDutyNotification} attribute.
     * @param pagerDutyNotification The value for pagerDutyNotification (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder pagerDutyNotification(@Nullable ImmutablePagerDutyNotificationDto pagerDutyNotification) {
      this.pagerDutyNotification = pagerDutyNotification;
      return this;
    }

    /**
     * Initializes the optional value {@link AlertConfigJsonService.AlertConfigDto#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    public final Builder version(String version) {
      this.version = Optional.of(version);
      return this;
    }

    /**
     * Initializes the optional value {@link AlertConfigJsonService.AlertConfigDto#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    @SuppressWarnings("unchecked") // safe covariant cast
    public final Builder version(Optional<String> version) {
      this.version = (Optional<String>) version;
      return this;
    }

    /**
     * Builds a new {@link ImmutableAlertConfigDto ImmutableAlertConfigDto}.
     * @return An immutable instance of AlertConfigDto
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableAlertConfigDto build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableAlertConfigDto(condition, emailNotification, pagerDutyNotification, version);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_CONDITION) != 0) attributes.add("condition");
      return "Cannot build AlertConfigDto, some of required attributes are not set " + attributes;
    }
  }
}
