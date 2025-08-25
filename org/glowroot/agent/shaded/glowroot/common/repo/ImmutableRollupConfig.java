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
 * Immutable implementation of {@link ConfigRepository.RollupConfig}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableRollupConfig.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code ImmutableRollupConfig.of()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "ConfigRepository.RollupConfig"})
@Immutable
public final class ImmutableRollupConfig extends ConfigRepository.RollupConfig {
  private final long intervalMillis;
  private final long viewThresholdMillis;

  private ImmutableRollupConfig(long intervalMillis, long viewThresholdMillis) {
    this.intervalMillis = intervalMillis;
    this.viewThresholdMillis = viewThresholdMillis;
  }

  /**
   * @return The value of the {@code intervalMillis} attribute
   */
  @JsonProperty("intervalMillis")
  @Override
  public long intervalMillis() {
    return intervalMillis;
  }

  /**
   * @return The value of the {@code viewThresholdMillis} attribute
   */
  @JsonProperty("viewThresholdMillis")
  @Override
  public long viewThresholdMillis() {
    return viewThresholdMillis;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ConfigRepository.RollupConfig#intervalMillis() intervalMillis} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for intervalMillis
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRollupConfig withIntervalMillis(long value) {
    if (this.intervalMillis == value) return this;
    return new ImmutableRollupConfig(value, this.viewThresholdMillis);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ConfigRepository.RollupConfig#viewThresholdMillis() viewThresholdMillis} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for viewThresholdMillis
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRollupConfig withViewThresholdMillis(long value) {
    if (this.viewThresholdMillis == value) return this;
    return new ImmutableRollupConfig(this.intervalMillis, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableRollupConfig} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableRollupConfig
        && equalTo((ImmutableRollupConfig) another);
  }

  private boolean equalTo(ImmutableRollupConfig another) {
    return intervalMillis == another.intervalMillis
        && viewThresholdMillis == another.viewThresholdMillis;
  }

  /**
   * Computes a hash code from attributes: {@code intervalMillis}, {@code viewThresholdMillis}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Longs.hashCode(intervalMillis);
    h += (h << 5) + Longs.hashCode(viewThresholdMillis);
    return h;
  }

  /**
   * Prints the immutable value {@code RollupConfig} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("RollupConfig")
        .omitNullValues()
        .add("intervalMillis", intervalMillis)
        .add("viewThresholdMillis", viewThresholdMillis)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends ConfigRepository.RollupConfig {
    long intervalMillis;
    boolean intervalMillisIsSet;
    long viewThresholdMillis;
    boolean viewThresholdMillisIsSet;
    @JsonProperty("intervalMillis")
    public void setIntervalMillis(long intervalMillis) {
      this.intervalMillis = intervalMillis;
      this.intervalMillisIsSet = true;
    }
    @JsonProperty("viewThresholdMillis")
    public void setViewThresholdMillis(long viewThresholdMillis) {
      this.viewThresholdMillis = viewThresholdMillis;
      this.viewThresholdMillisIsSet = true;
    }
    @Override
    public long intervalMillis() { throw new UnsupportedOperationException(); }
    @Override
    public long viewThresholdMillis() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableRollupConfig fromJson(Json json) {
    ImmutableRollupConfig.Builder builder = ImmutableRollupConfig.builder();
    if (json.intervalMillisIsSet) {
      builder.intervalMillis(json.intervalMillis);
    }
    if (json.viewThresholdMillisIsSet) {
      builder.viewThresholdMillis(json.viewThresholdMillis);
    }
    return builder.build();
  }

  /**
   * Construct a new immutable {@code RollupConfig} instance.
   * @param intervalMillis The value for the {@code intervalMillis} attribute
   * @param viewThresholdMillis The value for the {@code viewThresholdMillis} attribute
   * @return An immutable RollupConfig instance
   */
  public static ImmutableRollupConfig of(long intervalMillis, long viewThresholdMillis) {
    return new ImmutableRollupConfig(intervalMillis, viewThresholdMillis);
  }

  /**
   * Creates an immutable copy of a {@link ConfigRepository.RollupConfig} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable RollupConfig instance
   */
  public static ImmutableRollupConfig copyOf(ConfigRepository.RollupConfig instance) {
    if (instance instanceof ImmutableRollupConfig) {
      return (ImmutableRollupConfig) instance;
    }
    return ImmutableRollupConfig.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableRollupConfig ImmutableRollupConfig}.
   * @return A new ImmutableRollupConfig builder
   */
  public static ImmutableRollupConfig.Builder builder() {
    return new ImmutableRollupConfig.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableRollupConfig ImmutableRollupConfig}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_INTERVAL_MILLIS = 0x1L;
    private static final long INIT_BIT_VIEW_THRESHOLD_MILLIS = 0x2L;
    private long initBits = 0x3L;

    private long intervalMillis;
    private long viewThresholdMillis;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code RollupConfig} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(ConfigRepository.RollupConfig instance) {
      Preconditions.checkNotNull(instance, "instance");
      intervalMillis(instance.intervalMillis());
      viewThresholdMillis(instance.viewThresholdMillis());
      return this;
    }

    /**
     * Initializes the value for the {@link ConfigRepository.RollupConfig#intervalMillis() intervalMillis} attribute.
     * @param intervalMillis The value for intervalMillis 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder intervalMillis(long intervalMillis) {
      this.intervalMillis = intervalMillis;
      initBits &= ~INIT_BIT_INTERVAL_MILLIS;
      return this;
    }

    /**
     * Initializes the value for the {@link ConfigRepository.RollupConfig#viewThresholdMillis() viewThresholdMillis} attribute.
     * @param viewThresholdMillis The value for viewThresholdMillis 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder viewThresholdMillis(long viewThresholdMillis) {
      this.viewThresholdMillis = viewThresholdMillis;
      initBits &= ~INIT_BIT_VIEW_THRESHOLD_MILLIS;
      return this;
    }

    /**
     * Builds a new {@link ImmutableRollupConfig ImmutableRollupConfig}.
     * @return An immutable instance of RollupConfig
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableRollupConfig build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableRollupConfig(intervalMillis, viewThresholdMillis);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_INTERVAL_MILLIS) != 0) attributes.add("intervalMillis");
      if ((initBits & INIT_BIT_VIEW_THRESHOLD_MILLIS) != 0) attributes.add("viewThresholdMillis");
      return "Cannot build RollupConfig, some of required attributes are not set " + attributes;
    }
  }
}
