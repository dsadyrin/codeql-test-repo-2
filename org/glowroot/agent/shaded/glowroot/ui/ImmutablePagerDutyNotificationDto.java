package org.glowroot.agent.shaded.glowroot.ui;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
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
 * Immutable implementation of {@link AlertConfigJsonService.AlertConfigDto.PagerDutyNotificationDto}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePagerDutyNotificationDto.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "AlertConfigJsonService.AlertConfigDto.PagerDutyNotificationDto"})
@Immutable
public final class ImmutablePagerDutyNotificationDto
    implements AlertConfigJsonService.AlertConfigDto.PagerDutyNotificationDto {
  private final String pagerDutyIntegrationKey;

  private ImmutablePagerDutyNotificationDto(String pagerDutyIntegrationKey) {
    this.pagerDutyIntegrationKey = pagerDutyIntegrationKey;
  }

  /**
   * @return The value of the {@code pagerDutyIntegrationKey} attribute
   */
  @JsonProperty("pagerDutyIntegrationKey")
  @Override
  public String pagerDutyIntegrationKey() {
    return pagerDutyIntegrationKey;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AlertConfigJsonService.AlertConfigDto.PagerDutyNotificationDto#pagerDutyIntegrationKey() pagerDutyIntegrationKey} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for pagerDutyIntegrationKey
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePagerDutyNotificationDto withPagerDutyIntegrationKey(String value) {
    if (this.pagerDutyIntegrationKey.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "pagerDutyIntegrationKey");
    return new ImmutablePagerDutyNotificationDto(newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePagerDutyNotificationDto} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePagerDutyNotificationDto
        && equalTo((ImmutablePagerDutyNotificationDto) another);
  }

  private boolean equalTo(ImmutablePagerDutyNotificationDto another) {
    return pagerDutyIntegrationKey.equals(another.pagerDutyIntegrationKey);
  }

  /**
   * Computes a hash code from attributes: {@code pagerDutyIntegrationKey}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + pagerDutyIntegrationKey.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code PagerDutyNotificationDto} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("PagerDutyNotificationDto")
        .omitNullValues()
        .add("pagerDutyIntegrationKey", pagerDutyIntegrationKey)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json
      implements AlertConfigJsonService.AlertConfigDto.PagerDutyNotificationDto {
    @Nullable String pagerDutyIntegrationKey;
    @JsonProperty("pagerDutyIntegrationKey")
    public void setPagerDutyIntegrationKey(String pagerDutyIntegrationKey) {
      this.pagerDutyIntegrationKey = pagerDutyIntegrationKey;
    }
    @Override
    public String pagerDutyIntegrationKey() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutablePagerDutyNotificationDto fromJson(Json json) {
    ImmutablePagerDutyNotificationDto.Builder builder = ImmutablePagerDutyNotificationDto.builder();
    if (json.pagerDutyIntegrationKey != null) {
      builder.pagerDutyIntegrationKey(json.pagerDutyIntegrationKey);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link AlertConfigJsonService.AlertConfigDto.PagerDutyNotificationDto} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable PagerDutyNotificationDto instance
   */
  public static ImmutablePagerDutyNotificationDto copyOf(AlertConfigJsonService.AlertConfigDto.PagerDutyNotificationDto instance) {
    if (instance instanceof ImmutablePagerDutyNotificationDto) {
      return (ImmutablePagerDutyNotificationDto) instance;
    }
    return ImmutablePagerDutyNotificationDto.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutablePagerDutyNotificationDto ImmutablePagerDutyNotificationDto}.
   * @return A new ImmutablePagerDutyNotificationDto builder
   */
  public static ImmutablePagerDutyNotificationDto.Builder builder() {
    return new ImmutablePagerDutyNotificationDto.Builder();
  }

  /**
   * Builds instances of type {@link ImmutablePagerDutyNotificationDto ImmutablePagerDutyNotificationDto}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_PAGER_DUTY_INTEGRATION_KEY = 0x1L;
    private long initBits = 0x1L;

    private @Nullable String pagerDutyIntegrationKey;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code PagerDutyNotificationDto} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(AlertConfigJsonService.AlertConfigDto.PagerDutyNotificationDto instance) {
      Preconditions.checkNotNull(instance, "instance");
      pagerDutyIntegrationKey(instance.pagerDutyIntegrationKey());
      return this;
    }

    /**
     * Initializes the value for the {@link AlertConfigJsonService.AlertConfigDto.PagerDutyNotificationDto#pagerDutyIntegrationKey() pagerDutyIntegrationKey} attribute.
     * @param pagerDutyIntegrationKey The value for pagerDutyIntegrationKey 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder pagerDutyIntegrationKey(String pagerDutyIntegrationKey) {
      this.pagerDutyIntegrationKey = Preconditions.checkNotNull(pagerDutyIntegrationKey, "pagerDutyIntegrationKey");
      initBits &= ~INIT_BIT_PAGER_DUTY_INTEGRATION_KEY;
      return this;
    }

    /**
     * Builds a new {@link ImmutablePagerDutyNotificationDto ImmutablePagerDutyNotificationDto}.
     * @return An immutable instance of PagerDutyNotificationDto
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutablePagerDutyNotificationDto build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutablePagerDutyNotificationDto(pagerDutyIntegrationKey);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_PAGER_DUTY_INTEGRATION_KEY) != 0) attributes.add("pagerDutyIntegrationKey");
      return "Cannot build PagerDutyNotificationDto, some of required attributes are not set " + attributes;
    }
  }
}
