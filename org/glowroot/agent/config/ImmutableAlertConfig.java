package org.glowroot.agent.config;

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

/**
 * Immutable implementation of {@link AlertConfig}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAlertConfig.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "AlertConfig"})
@Immutable
public final class ImmutableAlertConfig extends AlertConfig {
  private final AlertConfig.AlertCondition condition;
  private final @Nullable ImmutableEmailNotification emailNotification;
  private final @Nullable ImmutablePagerDutyNotification pagerDutyNotification;

  private ImmutableAlertConfig(
      AlertConfig.AlertCondition condition,
      @Nullable ImmutableEmailNotification emailNotification,
      @Nullable ImmutablePagerDutyNotification pagerDutyNotification) {
    this.condition = condition;
    this.emailNotification = emailNotification;
    this.pagerDutyNotification = pagerDutyNotification;
  }

  /**
   * @return The value of the {@code condition} attribute
   */
  @JsonProperty("condition")
  @Override
  public AlertConfig.AlertCondition condition() {
    return condition;
  }

  /**
   * @return The value of the {@code emailNotification} attribute
   */
  @JsonProperty("emailNotification")
  @Override
  public @Nullable ImmutableEmailNotification emailNotification() {
    return emailNotification;
  }

  /**
   * @return The value of the {@code pagerDutyNotification} attribute
   */
  @JsonProperty("pagerDutyNotification")
  @Override
  public @Nullable ImmutablePagerDutyNotification pagerDutyNotification() {
    return pagerDutyNotification;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AlertConfig#condition() condition} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for condition
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAlertConfig withCondition(AlertConfig.AlertCondition value) {
    if (this.condition == value) return this;
    AlertConfig.AlertCondition newValue = Preconditions.checkNotNull(value, "condition");
    return new ImmutableAlertConfig(newValue, this.emailNotification, this.pagerDutyNotification);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AlertConfig#emailNotification() emailNotification} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for emailNotification (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAlertConfig withEmailNotification(@Nullable ImmutableEmailNotification value) {
    if (this.emailNotification == value) return this;
    return new ImmutableAlertConfig(this.condition, value, this.pagerDutyNotification);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AlertConfig#pagerDutyNotification() pagerDutyNotification} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for pagerDutyNotification (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAlertConfig withPagerDutyNotification(@Nullable ImmutablePagerDutyNotification value) {
    if (this.pagerDutyNotification == value) return this;
    return new ImmutableAlertConfig(this.condition, this.emailNotification, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAlertConfig} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAlertConfig
        && equalTo((ImmutableAlertConfig) another);
  }

  private boolean equalTo(ImmutableAlertConfig another) {
    return condition.equals(another.condition)
        && Objects.equal(emailNotification, another.emailNotification)
        && Objects.equal(pagerDutyNotification, another.pagerDutyNotification);
  }

  /**
   * Computes a hash code from attributes: {@code condition}, {@code emailNotification}, {@code pagerDutyNotification}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + condition.hashCode();
    h += (h << 5) + Objects.hashCode(emailNotification);
    h += (h << 5) + Objects.hashCode(pagerDutyNotification);
    return h;
  }

  /**
   * Prints the immutable value {@code AlertConfig} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("AlertConfig")
        .omitNullValues()
        .add("condition", condition)
        .add("emailNotification", emailNotification)
        .add("pagerDutyNotification", pagerDutyNotification)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends AlertConfig {
    @Nullable AlertConfig.AlertCondition condition;
    @Nullable ImmutableEmailNotification emailNotification;
    @Nullable ImmutablePagerDutyNotification pagerDutyNotification;
    @JsonProperty("condition")
    public void setCondition(AlertConfig.AlertCondition condition) {
      this.condition = condition;
    }
    @JsonProperty("emailNotification")
    public void setEmailNotification(@Nullable ImmutableEmailNotification emailNotification) {
      this.emailNotification = emailNotification;
    }
    @JsonProperty("pagerDutyNotification")
    public void setPagerDutyNotification(@Nullable ImmutablePagerDutyNotification pagerDutyNotification) {
      this.pagerDutyNotification = pagerDutyNotification;
    }
    @Override
    public AlertConfig.AlertCondition condition() { throw new UnsupportedOperationException(); }
    @Override
    public ImmutableEmailNotification emailNotification() { throw new UnsupportedOperationException(); }
    @Override
    public ImmutablePagerDutyNotification pagerDutyNotification() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableAlertConfig fromJson(Json json) {
    ImmutableAlertConfig.Builder builder = ImmutableAlertConfig.builder();
    if (json.condition != null) {
      builder.condition(json.condition);
    }
    if (json.emailNotification != null) {
      builder.emailNotification(json.emailNotification);
    }
    if (json.pagerDutyNotification != null) {
      builder.pagerDutyNotification(json.pagerDutyNotification);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link AlertConfig} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable AlertConfig instance
   */
  public static ImmutableAlertConfig copyOf(AlertConfig instance) {
    if (instance instanceof ImmutableAlertConfig) {
      return (ImmutableAlertConfig) instance;
    }
    return ImmutableAlertConfig.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableAlertConfig ImmutableAlertConfig}.
   * @return A new ImmutableAlertConfig builder
   */
  public static ImmutableAlertConfig.Builder builder() {
    return new ImmutableAlertConfig.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableAlertConfig ImmutableAlertConfig}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_CONDITION = 0x1L;
    private long initBits = 0x1L;

    private @Nullable AlertConfig.AlertCondition condition;
    private @Nullable ImmutableEmailNotification emailNotification;
    private @Nullable ImmutablePagerDutyNotification pagerDutyNotification;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code AlertConfig} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(AlertConfig instance) {
      Preconditions.checkNotNull(instance, "instance");
      condition(instance.condition());
      @Nullable ImmutableEmailNotification emailNotificationValue = instance.emailNotification();
      if (emailNotificationValue != null) {
        emailNotification(emailNotificationValue);
      }
      @Nullable ImmutablePagerDutyNotification pagerDutyNotificationValue = instance.pagerDutyNotification();
      if (pagerDutyNotificationValue != null) {
        pagerDutyNotification(pagerDutyNotificationValue);
      }
      return this;
    }

    /**
     * Initializes the value for the {@link AlertConfig#condition() condition} attribute.
     * @param condition The value for condition 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder condition(AlertConfig.AlertCondition condition) {
      this.condition = Preconditions.checkNotNull(condition, "condition");
      initBits &= ~INIT_BIT_CONDITION;
      return this;
    }

    /**
     * Initializes the value for the {@link AlertConfig#emailNotification() emailNotification} attribute.
     * @param emailNotification The value for emailNotification (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder emailNotification(@Nullable ImmutableEmailNotification emailNotification) {
      this.emailNotification = emailNotification;
      return this;
    }

    /**
     * Initializes the value for the {@link AlertConfig#pagerDutyNotification() pagerDutyNotification} attribute.
     * @param pagerDutyNotification The value for pagerDutyNotification (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder pagerDutyNotification(@Nullable ImmutablePagerDutyNotification pagerDutyNotification) {
      this.pagerDutyNotification = pagerDutyNotification;
      return this;
    }

    /**
     * Builds a new {@link ImmutableAlertConfig ImmutableAlertConfig}.
     * @return An immutable instance of AlertConfig
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableAlertConfig build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableAlertConfig(condition, emailNotification, pagerDutyNotification);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_CONDITION) != 0) attributes.add("condition");
      return "Cannot build AlertConfig, some of required attributes are not set " + attributes;
    }
  }
}
