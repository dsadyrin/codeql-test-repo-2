package org.glowroot.agent.config;

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
 * Immutable implementation of {@link AlertConfig.PagerDutyNotification}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePagerDutyNotification.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "AlertConfig.PagerDutyNotification"})
@Immutable
final class ImmutablePagerDutyNotification
    implements AlertConfig.PagerDutyNotification {
  private final String pagerDutyIntegrationKey;

  private ImmutablePagerDutyNotification(String pagerDutyIntegrationKey) {
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
   * Copy the current immutable object by setting a value for the {@link AlertConfig.PagerDutyNotification#pagerDutyIntegrationKey() pagerDutyIntegrationKey} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for pagerDutyIntegrationKey
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePagerDutyNotification withPagerDutyIntegrationKey(String value) {
    if (this.pagerDutyIntegrationKey.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "pagerDutyIntegrationKey");
    return new ImmutablePagerDutyNotification(newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePagerDutyNotification} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePagerDutyNotification
        && equalTo((ImmutablePagerDutyNotification) another);
  }

  private boolean equalTo(ImmutablePagerDutyNotification another) {
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
   * Prints the immutable value {@code PagerDutyNotification} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("PagerDutyNotification")
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
  static final class Json implements AlertConfig.PagerDutyNotification {
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
  static ImmutablePagerDutyNotification fromJson(Json json) {
    ImmutablePagerDutyNotification.Builder builder = ImmutablePagerDutyNotification.builder();
    if (json.pagerDutyIntegrationKey != null) {
      builder.pagerDutyIntegrationKey(json.pagerDutyIntegrationKey);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link AlertConfig.PagerDutyNotification} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable PagerDutyNotification instance
   */
  public static ImmutablePagerDutyNotification copyOf(AlertConfig.PagerDutyNotification instance) {
    if (instance instanceof ImmutablePagerDutyNotification) {
      return (ImmutablePagerDutyNotification) instance;
    }
    return ImmutablePagerDutyNotification.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutablePagerDutyNotification ImmutablePagerDutyNotification}.
   * @return A new ImmutablePagerDutyNotification builder
   */
  public static ImmutablePagerDutyNotification.Builder builder() {
    return new ImmutablePagerDutyNotification.Builder();
  }

  /**
   * Builds instances of type {@link ImmutablePagerDutyNotification ImmutablePagerDutyNotification}.
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
     * Fill a builder with attribute values from the provided {@code PagerDutyNotification} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(AlertConfig.PagerDutyNotification instance) {
      Preconditions.checkNotNull(instance, "instance");
      pagerDutyIntegrationKey(instance.pagerDutyIntegrationKey());
      return this;
    }

    /**
     * Initializes the value for the {@link AlertConfig.PagerDutyNotification#pagerDutyIntegrationKey() pagerDutyIntegrationKey} attribute.
     * @param pagerDutyIntegrationKey The value for pagerDutyIntegrationKey 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder pagerDutyIntegrationKey(String pagerDutyIntegrationKey) {
      this.pagerDutyIntegrationKey = Preconditions.checkNotNull(pagerDutyIntegrationKey, "pagerDutyIntegrationKey");
      initBits &= ~INIT_BIT_PAGER_DUTY_INTEGRATION_KEY;
      return this;
    }

    /**
     * Builds a new {@link ImmutablePagerDutyNotification ImmutablePagerDutyNotification}.
     * @return An immutable instance of PagerDutyNotification
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutablePagerDutyNotification build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutablePagerDutyNotification(pagerDutyIntegrationKey);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_PAGER_DUTY_INTEGRATION_KEY) != 0) attributes.add("pagerDutyIntegrationKey");
      return "Cannot build PagerDutyNotification, some of required attributes are not set " + attributes;
    }
  }
}
