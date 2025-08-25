package org.glowroot.agent.shaded.glowroot.common.config;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonIgnore;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonInclude;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import org.glowroot.agent.shaded.google.common.collect.Lists;
import java.util.ArrayList;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link HealthchecksIoConfig}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableHealthchecksIoConfig.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "HealthchecksIoConfig"})
@Immutable
public final class ImmutableHealthchecksIoConfig extends HealthchecksIoConfig {
  private final String pingUrl;
  private final String version;

  private ImmutableHealthchecksIoConfig(ImmutableHealthchecksIoConfig.Builder builder) {
    if (builder.pingUrl != null) {
      initShim.pingUrl(builder.pingUrl);
    }
    this.pingUrl = initShim.pingUrl();
    this.version = initShim.version();
    this.initShim = null;
  }

  private ImmutableHealthchecksIoConfig(String pingUrl) {
    this.pingUrl = pingUrl;
    initShim.pingUrl(this.pingUrl);
    this.version = initShim.version();
    this.initShim = null;
  }

  private static final int STAGE_INITIALIZING = -1;
  private static final int STAGE_UNINITIALIZED = 0;
  private static final int STAGE_INITIALIZED = 1;
  private transient volatile InitShim initShim = new InitShim();

  private final class InitShim {
    private String pingUrl;
    private int pingUrlBuildStage;

    String pingUrl() {
      if (pingUrlBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (pingUrlBuildStage == STAGE_UNINITIALIZED) {
        pingUrlBuildStage = STAGE_INITIALIZING;
        this.pingUrl = Preconditions.checkNotNull(ImmutableHealthchecksIoConfig.super.pingUrl(), "pingUrl");
        pingUrlBuildStage = STAGE_INITIALIZED;
      }
      return this.pingUrl;
    }

    void pingUrl(String pingUrl) {
      this.pingUrl = pingUrl;
      pingUrlBuildStage = STAGE_INITIALIZED;
    }
    private String version;
    private int versionBuildStage;

    String version() {
      if (versionBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (versionBuildStage == STAGE_UNINITIALIZED) {
        versionBuildStage = STAGE_INITIALIZING;
        this.version = Preconditions.checkNotNull(ImmutableHealthchecksIoConfig.super.version(), "version");
        versionBuildStage = STAGE_INITIALIZED;
      }
      return this.version;
    }

    private String formatInitCycleMessage() {
      ArrayList<String> attributes = Lists.newArrayList();
      if (pingUrlBuildStage == STAGE_INITIALIZING) attributes.add("pingUrl");
      if (versionBuildStage == STAGE_INITIALIZING) attributes.add("version");
      return "Cannot build HealthchecksIoConfig, attribute initializers form cycle" + attributes;
    }
  }

  /**
   * @return The value of the {@code pingUrl} attribute
   */
  @JsonProperty("pingUrl")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @Override
  public String pingUrl() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.pingUrl()
        : this.pingUrl;
  }

  /**
   * @return The computed-at-construction value of the {@code version} attribute
   */
  @JsonProperty("version")
  @JsonIgnore
  @Override
  public String version() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.version()
        : this.version;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link HealthchecksIoConfig#pingUrl() pingUrl} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for pingUrl
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableHealthchecksIoConfig withPingUrl(String value) {
    if (this.pingUrl.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "pingUrl");
    return new ImmutableHealthchecksIoConfig(newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableHealthchecksIoConfig} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableHealthchecksIoConfig
        && equalTo((ImmutableHealthchecksIoConfig) another);
  }

  private boolean equalTo(ImmutableHealthchecksIoConfig another) {
    return pingUrl.equals(another.pingUrl)
        && version.equals(another.version);
  }

  /**
   * Computes a hash code from attributes: {@code pingUrl}, {@code version}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + pingUrl.hashCode();
    h += (h << 5) + version.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code HealthchecksIoConfig} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("HealthchecksIoConfig")
        .omitNullValues()
        .add("pingUrl", pingUrl)
        .add("version", version)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends HealthchecksIoConfig {
    @Nullable String pingUrl;
    @JsonProperty("pingUrl")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public void setPingUrl(String pingUrl) {
      this.pingUrl = pingUrl;
    }
    @Override
    public String pingUrl() { throw new UnsupportedOperationException(); }
    @Override
    public String version() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableHealthchecksIoConfig fromJson(Json json) {
    ImmutableHealthchecksIoConfig.Builder builder = ImmutableHealthchecksIoConfig.builder();
    if (json.pingUrl != null) {
      builder.pingUrl(json.pingUrl);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link HealthchecksIoConfig} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable HealthchecksIoConfig instance
   */
  public static ImmutableHealthchecksIoConfig copyOf(HealthchecksIoConfig instance) {
    if (instance instanceof ImmutableHealthchecksIoConfig) {
      return (ImmutableHealthchecksIoConfig) instance;
    }
    return ImmutableHealthchecksIoConfig.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableHealthchecksIoConfig ImmutableHealthchecksIoConfig}.
   * @return A new ImmutableHealthchecksIoConfig builder
   */
  public static ImmutableHealthchecksIoConfig.Builder builder() {
    return new ImmutableHealthchecksIoConfig.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableHealthchecksIoConfig ImmutableHealthchecksIoConfig}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private @Nullable String pingUrl;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code HealthchecksIoConfig} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(HealthchecksIoConfig instance) {
      Preconditions.checkNotNull(instance, "instance");
      pingUrl(instance.pingUrl());
      return this;
    }

    /**
     * Initializes the value for the {@link HealthchecksIoConfig#pingUrl() pingUrl} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link HealthchecksIoConfig#pingUrl() pingUrl}.</em>
     * @param pingUrl The value for pingUrl 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder pingUrl(String pingUrl) {
      this.pingUrl = Preconditions.checkNotNull(pingUrl, "pingUrl");
      return this;
    }

    /**
     * Builds a new {@link ImmutableHealthchecksIoConfig ImmutableHealthchecksIoConfig}.
     * @return An immutable instance of HealthchecksIoConfig
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableHealthchecksIoConfig build() {
      return new ImmutableHealthchecksIoConfig(this);
    }
  }
}
