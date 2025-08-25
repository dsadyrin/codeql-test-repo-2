package org.glowroot.agent.shaded.glowroot.ui;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import org.glowroot.agent.shaded.google.common.collect.Lists;
import org.glowroot.agent.shaded.google.common.primitives.Booleans;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link ConfigJsonService.TransactionConfigDto}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTransactionConfigDto.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "ConfigJsonService.TransactionConfigDto"})
@Immutable
final class ImmutableTransactionConfigDto
    extends ConfigJsonService.TransactionConfigDto {
  private final int slowThresholdMillis;
  private final int profilingIntervalMillis;
  private final boolean captureThreadStats;
  private final String version;

  private ImmutableTransactionConfigDto(
      int slowThresholdMillis,
      int profilingIntervalMillis,
      boolean captureThreadStats,
      String version) {
    this.slowThresholdMillis = slowThresholdMillis;
    this.profilingIntervalMillis = profilingIntervalMillis;
    this.captureThreadStats = captureThreadStats;
    this.version = version;
  }

  /**
   * @return The value of the {@code slowThresholdMillis} attribute
   */
  @JsonProperty("slowThresholdMillis")
  @Override
  int slowThresholdMillis() {
    return slowThresholdMillis;
  }

  /**
   * @return The value of the {@code profilingIntervalMillis} attribute
   */
  @JsonProperty("profilingIntervalMillis")
  @Override
  int profilingIntervalMillis() {
    return profilingIntervalMillis;
  }

  /**
   * @return The value of the {@code captureThreadStats} attribute
   */
  @JsonProperty("captureThreadStats")
  @Override
  boolean captureThreadStats() {
    return captureThreadStats;
  }

  /**
   * @return The value of the {@code version} attribute
   */
  @JsonProperty("version")
  @Override
  String version() {
    return version;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ConfigJsonService.TransactionConfigDto#slowThresholdMillis() slowThresholdMillis} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for slowThresholdMillis
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTransactionConfigDto withSlowThresholdMillis(int value) {
    if (this.slowThresholdMillis == value) return this;
    return new ImmutableTransactionConfigDto(value, this.profilingIntervalMillis, this.captureThreadStats, this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ConfigJsonService.TransactionConfigDto#profilingIntervalMillis() profilingIntervalMillis} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for profilingIntervalMillis
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTransactionConfigDto withProfilingIntervalMillis(int value) {
    if (this.profilingIntervalMillis == value) return this;
    return new ImmutableTransactionConfigDto(this.slowThresholdMillis, value, this.captureThreadStats, this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ConfigJsonService.TransactionConfigDto#captureThreadStats() captureThreadStats} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for captureThreadStats
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTransactionConfigDto withCaptureThreadStats(boolean value) {
    if (this.captureThreadStats == value) return this;
    return new ImmutableTransactionConfigDto(this.slowThresholdMillis, this.profilingIntervalMillis, value, this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ConfigJsonService.TransactionConfigDto#version() version} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for version
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTransactionConfigDto withVersion(String value) {
    if (this.version.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "version");
    return new ImmutableTransactionConfigDto(this.slowThresholdMillis, this.profilingIntervalMillis, this.captureThreadStats, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTransactionConfigDto} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTransactionConfigDto
        && equalTo((ImmutableTransactionConfigDto) another);
  }

  private boolean equalTo(ImmutableTransactionConfigDto another) {
    return slowThresholdMillis == another.slowThresholdMillis
        && profilingIntervalMillis == another.profilingIntervalMillis
        && captureThreadStats == another.captureThreadStats
        && version.equals(another.version);
  }

  /**
   * Computes a hash code from attributes: {@code slowThresholdMillis}, {@code profilingIntervalMillis}, {@code captureThreadStats}, {@code version}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + slowThresholdMillis;
    h += (h << 5) + profilingIntervalMillis;
    h += (h << 5) + Booleans.hashCode(captureThreadStats);
    h += (h << 5) + version.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code TransactionConfigDto} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("TransactionConfigDto")
        .omitNullValues()
        .add("slowThresholdMillis", slowThresholdMillis)
        .add("profilingIntervalMillis", profilingIntervalMillis)
        .add("captureThreadStats", captureThreadStats)
        .add("version", version)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends ConfigJsonService.TransactionConfigDto {
    int slowThresholdMillis;
    boolean slowThresholdMillisIsSet;
    int profilingIntervalMillis;
    boolean profilingIntervalMillisIsSet;
    boolean captureThreadStats;
    boolean captureThreadStatsIsSet;
    @Nullable String version;
    @JsonProperty("slowThresholdMillis")
    public void setSlowThresholdMillis(int slowThresholdMillis) {
      this.slowThresholdMillis = slowThresholdMillis;
      this.slowThresholdMillisIsSet = true;
    }
    @JsonProperty("profilingIntervalMillis")
    public void setProfilingIntervalMillis(int profilingIntervalMillis) {
      this.profilingIntervalMillis = profilingIntervalMillis;
      this.profilingIntervalMillisIsSet = true;
    }
    @JsonProperty("captureThreadStats")
    public void setCaptureThreadStats(boolean captureThreadStats) {
      this.captureThreadStats = captureThreadStats;
      this.captureThreadStatsIsSet = true;
    }
    @JsonProperty("version")
    public void setVersion(String version) {
      this.version = version;
    }
    @Override
    int slowThresholdMillis() { throw new UnsupportedOperationException(); }
    @Override
    int profilingIntervalMillis() { throw new UnsupportedOperationException(); }
    @Override
    boolean captureThreadStats() { throw new UnsupportedOperationException(); }
    @Override
    String version() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableTransactionConfigDto fromJson(Json json) {
    ImmutableTransactionConfigDto.Builder builder = ImmutableTransactionConfigDto.builder();
    if (json.slowThresholdMillisIsSet) {
      builder.slowThresholdMillis(json.slowThresholdMillis);
    }
    if (json.profilingIntervalMillisIsSet) {
      builder.profilingIntervalMillis(json.profilingIntervalMillis);
    }
    if (json.captureThreadStatsIsSet) {
      builder.captureThreadStats(json.captureThreadStats);
    }
    if (json.version != null) {
      builder.version(json.version);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ConfigJsonService.TransactionConfigDto} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable TransactionConfigDto instance
   */
  public static ImmutableTransactionConfigDto copyOf(ConfigJsonService.TransactionConfigDto instance) {
    if (instance instanceof ImmutableTransactionConfigDto) {
      return (ImmutableTransactionConfigDto) instance;
    }
    return ImmutableTransactionConfigDto.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableTransactionConfigDto ImmutableTransactionConfigDto}.
   * @return A new ImmutableTransactionConfigDto builder
   */
  public static ImmutableTransactionConfigDto.Builder builder() {
    return new ImmutableTransactionConfigDto.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableTransactionConfigDto ImmutableTransactionConfigDto}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_SLOW_THRESHOLD_MILLIS = 0x1L;
    private static final long INIT_BIT_PROFILING_INTERVAL_MILLIS = 0x2L;
    private static final long INIT_BIT_CAPTURE_THREAD_STATS = 0x4L;
    private static final long INIT_BIT_VERSION = 0x8L;
    private long initBits = 0xfL;

    private int slowThresholdMillis;
    private int profilingIntervalMillis;
    private boolean captureThreadStats;
    private @Nullable String version;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code TransactionConfigDto} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(ConfigJsonService.TransactionConfigDto instance) {
      Preconditions.checkNotNull(instance, "instance");
      slowThresholdMillis(instance.slowThresholdMillis());
      profilingIntervalMillis(instance.profilingIntervalMillis());
      captureThreadStats(instance.captureThreadStats());
      version(instance.version());
      return this;
    }

    /**
     * Initializes the value for the {@link ConfigJsonService.TransactionConfigDto#slowThresholdMillis() slowThresholdMillis} attribute.
     * @param slowThresholdMillis The value for slowThresholdMillis 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder slowThresholdMillis(int slowThresholdMillis) {
      this.slowThresholdMillis = slowThresholdMillis;
      initBits &= ~INIT_BIT_SLOW_THRESHOLD_MILLIS;
      return this;
    }

    /**
     * Initializes the value for the {@link ConfigJsonService.TransactionConfigDto#profilingIntervalMillis() profilingIntervalMillis} attribute.
     * @param profilingIntervalMillis The value for profilingIntervalMillis 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder profilingIntervalMillis(int profilingIntervalMillis) {
      this.profilingIntervalMillis = profilingIntervalMillis;
      initBits &= ~INIT_BIT_PROFILING_INTERVAL_MILLIS;
      return this;
    }

    /**
     * Initializes the value for the {@link ConfigJsonService.TransactionConfigDto#captureThreadStats() captureThreadStats} attribute.
     * @param captureThreadStats The value for captureThreadStats 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder captureThreadStats(boolean captureThreadStats) {
      this.captureThreadStats = captureThreadStats;
      initBits &= ~INIT_BIT_CAPTURE_THREAD_STATS;
      return this;
    }

    /**
     * Initializes the value for the {@link ConfigJsonService.TransactionConfigDto#version() version} attribute.
     * @param version The value for version 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder version(String version) {
      this.version = Preconditions.checkNotNull(version, "version");
      initBits &= ~INIT_BIT_VERSION;
      return this;
    }

    /**
     * Builds a new {@link ImmutableTransactionConfigDto ImmutableTransactionConfigDto}.
     * @return An immutable instance of TransactionConfigDto
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableTransactionConfigDto build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableTransactionConfigDto(slowThresholdMillis, profilingIntervalMillis, captureThreadStats, version);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_SLOW_THRESHOLD_MILLIS) != 0) attributes.add("slowThresholdMillis");
      if ((initBits & INIT_BIT_PROFILING_INTERVAL_MILLIS) != 0) attributes.add("profilingIntervalMillis");
      if ((initBits & INIT_BIT_CAPTURE_THREAD_STATS) != 0) attributes.add("captureThreadStats");
      if ((initBits & INIT_BIT_VERSION) != 0) attributes.add("version");
      return "Cannot build TransactionConfigDto, some of required attributes are not set " + attributes;
    }
  }
}
