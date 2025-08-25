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
 * Immutable implementation of {@link AlertConfigJsonService.AlertConfigDto.SyntheticMonitorConditionDto}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSyntheticMonitorConditionDto.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "AlertConfigJsonService.AlertConfigDto.SyntheticMonitorConditionDto"})
@Immutable
public final class ImmutableSyntheticMonitorConditionDto
    implements AlertConfigJsonService.AlertConfigDto.SyntheticMonitorConditionDto {
  private final String syntheticMonitorId;
  private final int thresholdMillis;

  private ImmutableSyntheticMonitorConditionDto(String syntheticMonitorId, int thresholdMillis) {
    this.syntheticMonitorId = syntheticMonitorId;
    this.thresholdMillis = thresholdMillis;
  }

  /**
   * @return The value of the {@code syntheticMonitorId} attribute
   */
  @JsonProperty("syntheticMonitorId")
  @Override
  public String syntheticMonitorId() {
    return syntheticMonitorId;
  }

  /**
   * @return The value of the {@code thresholdMillis} attribute
   */
  @JsonProperty("thresholdMillis")
  @Override
  public int thresholdMillis() {
    return thresholdMillis;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AlertConfigJsonService.AlertConfigDto.SyntheticMonitorConditionDto#syntheticMonitorId() syntheticMonitorId} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for syntheticMonitorId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSyntheticMonitorConditionDto withSyntheticMonitorId(String value) {
    if (this.syntheticMonitorId.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "syntheticMonitorId");
    return new ImmutableSyntheticMonitorConditionDto(newValue, this.thresholdMillis);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AlertConfigJsonService.AlertConfigDto.SyntheticMonitorConditionDto#thresholdMillis() thresholdMillis} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for thresholdMillis
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSyntheticMonitorConditionDto withThresholdMillis(int value) {
    if (this.thresholdMillis == value) return this;
    return new ImmutableSyntheticMonitorConditionDto(this.syntheticMonitorId, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSyntheticMonitorConditionDto} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSyntheticMonitorConditionDto
        && equalTo((ImmutableSyntheticMonitorConditionDto) another);
  }

  private boolean equalTo(ImmutableSyntheticMonitorConditionDto another) {
    return syntheticMonitorId.equals(another.syntheticMonitorId)
        && thresholdMillis == another.thresholdMillis;
  }

  /**
   * Computes a hash code from attributes: {@code syntheticMonitorId}, {@code thresholdMillis}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + syntheticMonitorId.hashCode();
    h += (h << 5) + thresholdMillis;
    return h;
  }

  /**
   * Prints the immutable value {@code SyntheticMonitorConditionDto} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("SyntheticMonitorConditionDto")
        .omitNullValues()
        .add("syntheticMonitorId", syntheticMonitorId)
        .add("thresholdMillis", thresholdMillis)
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
      implements AlertConfigJsonService.AlertConfigDto.SyntheticMonitorConditionDto {
    @Nullable String syntheticMonitorId;
    int thresholdMillis;
    boolean thresholdMillisIsSet;
    @JsonProperty("syntheticMonitorId")
    public void setSyntheticMonitorId(String syntheticMonitorId) {
      this.syntheticMonitorId = syntheticMonitorId;
    }
    @JsonProperty("thresholdMillis")
    public void setThresholdMillis(int thresholdMillis) {
      this.thresholdMillis = thresholdMillis;
      this.thresholdMillisIsSet = true;
    }
    @Override
    public String syntheticMonitorId() { throw new UnsupportedOperationException(); }
    @Override
    public int thresholdMillis() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableSyntheticMonitorConditionDto fromJson(Json json) {
    ImmutableSyntheticMonitorConditionDto.Builder builder = ImmutableSyntheticMonitorConditionDto.builder();
    if (json.syntheticMonitorId != null) {
      builder.syntheticMonitorId(json.syntheticMonitorId);
    }
    if (json.thresholdMillisIsSet) {
      builder.thresholdMillis(json.thresholdMillis);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link AlertConfigJsonService.AlertConfigDto.SyntheticMonitorConditionDto} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SyntheticMonitorConditionDto instance
   */
  public static ImmutableSyntheticMonitorConditionDto copyOf(AlertConfigJsonService.AlertConfigDto.SyntheticMonitorConditionDto instance) {
    if (instance instanceof ImmutableSyntheticMonitorConditionDto) {
      return (ImmutableSyntheticMonitorConditionDto) instance;
    }
    return ImmutableSyntheticMonitorConditionDto.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableSyntheticMonitorConditionDto ImmutableSyntheticMonitorConditionDto}.
   * @return A new ImmutableSyntheticMonitorConditionDto builder
   */
  public static ImmutableSyntheticMonitorConditionDto.Builder builder() {
    return new ImmutableSyntheticMonitorConditionDto.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableSyntheticMonitorConditionDto ImmutableSyntheticMonitorConditionDto}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_SYNTHETIC_MONITOR_ID = 0x1L;
    private static final long INIT_BIT_THRESHOLD_MILLIS = 0x2L;
    private long initBits = 0x3L;

    private @Nullable String syntheticMonitorId;
    private int thresholdMillis;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code SyntheticMonitorConditionDto} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(AlertConfigJsonService.AlertConfigDto.SyntheticMonitorConditionDto instance) {
      Preconditions.checkNotNull(instance, "instance");
      syntheticMonitorId(instance.syntheticMonitorId());
      thresholdMillis(instance.thresholdMillis());
      return this;
    }

    /**
     * Initializes the value for the {@link AlertConfigJsonService.AlertConfigDto.SyntheticMonitorConditionDto#syntheticMonitorId() syntheticMonitorId} attribute.
     * @param syntheticMonitorId The value for syntheticMonitorId 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder syntheticMonitorId(String syntheticMonitorId) {
      this.syntheticMonitorId = Preconditions.checkNotNull(syntheticMonitorId, "syntheticMonitorId");
      initBits &= ~INIT_BIT_SYNTHETIC_MONITOR_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link AlertConfigJsonService.AlertConfigDto.SyntheticMonitorConditionDto#thresholdMillis() thresholdMillis} attribute.
     * @param thresholdMillis The value for thresholdMillis 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder thresholdMillis(int thresholdMillis) {
      this.thresholdMillis = thresholdMillis;
      initBits &= ~INIT_BIT_THRESHOLD_MILLIS;
      return this;
    }

    /**
     * Builds a new {@link ImmutableSyntheticMonitorConditionDto ImmutableSyntheticMonitorConditionDto}.
     * @return An immutable instance of SyntheticMonitorConditionDto
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableSyntheticMonitorConditionDto build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableSyntheticMonitorConditionDto(syntheticMonitorId, thresholdMillis);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_SYNTHETIC_MONITOR_ID) != 0) attributes.add("syntheticMonitorId");
      if ((initBits & INIT_BIT_THRESHOLD_MILLIS) != 0) attributes.add("thresholdMillis");
      return "Cannot build SyntheticMonitorConditionDto, some of required attributes are not set " + attributes;
    }
  }
}
