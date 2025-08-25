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
 * Immutable implementation of {@link AdminJsonService.HealthchecksIoConfigDto}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableHealthchecksIoConfigDto.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "AdminJsonService.HealthchecksIoConfigDto"})
@Immutable
final class ImmutableHealthchecksIoConfigDto
    extends AdminJsonService.HealthchecksIoConfigDto {
  private final String pingUrl;
  private final String version;

  private ImmutableHealthchecksIoConfigDto(String pingUrl, String version) {
    this.pingUrl = pingUrl;
    this.version = version;
  }

  /**
   * @return The value of the {@code pingUrl} attribute
   */
  @JsonProperty("pingUrl")
  @Override
  String pingUrl() {
    return pingUrl;
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
   * Copy the current immutable object by setting a value for the {@link AdminJsonService.HealthchecksIoConfigDto#pingUrl() pingUrl} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for pingUrl
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableHealthchecksIoConfigDto withPingUrl(String value) {
    if (this.pingUrl.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "pingUrl");
    return new ImmutableHealthchecksIoConfigDto(newValue, this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AdminJsonService.HealthchecksIoConfigDto#version() version} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for version
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableHealthchecksIoConfigDto withVersion(String value) {
    if (this.version.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "version");
    return new ImmutableHealthchecksIoConfigDto(this.pingUrl, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableHealthchecksIoConfigDto} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableHealthchecksIoConfigDto
        && equalTo((ImmutableHealthchecksIoConfigDto) another);
  }

  private boolean equalTo(ImmutableHealthchecksIoConfigDto another) {
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
   * Prints the immutable value {@code HealthchecksIoConfigDto} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("HealthchecksIoConfigDto")
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
  static final class Json extends AdminJsonService.HealthchecksIoConfigDto {
    @Nullable String pingUrl;
    @Nullable String version;
    @JsonProperty("pingUrl")
    public void setPingUrl(String pingUrl) {
      this.pingUrl = pingUrl;
    }
    @JsonProperty("version")
    public void setVersion(String version) {
      this.version = version;
    }
    @Override
    String pingUrl() { throw new UnsupportedOperationException(); }
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
  static ImmutableHealthchecksIoConfigDto fromJson(Json json) {
    ImmutableHealthchecksIoConfigDto.Builder builder = ImmutableHealthchecksIoConfigDto.builder();
    if (json.pingUrl != null) {
      builder.pingUrl(json.pingUrl);
    }
    if (json.version != null) {
      builder.version(json.version);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link AdminJsonService.HealthchecksIoConfigDto} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable HealthchecksIoConfigDto instance
   */
  public static ImmutableHealthchecksIoConfigDto copyOf(AdminJsonService.HealthchecksIoConfigDto instance) {
    if (instance instanceof ImmutableHealthchecksIoConfigDto) {
      return (ImmutableHealthchecksIoConfigDto) instance;
    }
    return ImmutableHealthchecksIoConfigDto.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableHealthchecksIoConfigDto ImmutableHealthchecksIoConfigDto}.
   * @return A new ImmutableHealthchecksIoConfigDto builder
   */
  public static ImmutableHealthchecksIoConfigDto.Builder builder() {
    return new ImmutableHealthchecksIoConfigDto.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableHealthchecksIoConfigDto ImmutableHealthchecksIoConfigDto}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_PING_URL = 0x1L;
    private static final long INIT_BIT_VERSION = 0x2L;
    private long initBits = 0x3L;

    private @Nullable String pingUrl;
    private @Nullable String version;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code HealthchecksIoConfigDto} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(AdminJsonService.HealthchecksIoConfigDto instance) {
      Preconditions.checkNotNull(instance, "instance");
      pingUrl(instance.pingUrl());
      version(instance.version());
      return this;
    }

    /**
     * Initializes the value for the {@link AdminJsonService.HealthchecksIoConfigDto#pingUrl() pingUrl} attribute.
     * @param pingUrl The value for pingUrl 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder pingUrl(String pingUrl) {
      this.pingUrl = Preconditions.checkNotNull(pingUrl, "pingUrl");
      initBits &= ~INIT_BIT_PING_URL;
      return this;
    }

    /**
     * Initializes the value for the {@link AdminJsonService.HealthchecksIoConfigDto#version() version} attribute.
     * @param version The value for version 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder version(String version) {
      this.version = Preconditions.checkNotNull(version, "version");
      initBits &= ~INIT_BIT_VERSION;
      return this;
    }

    /**
     * Builds a new {@link ImmutableHealthchecksIoConfigDto ImmutableHealthchecksIoConfigDto}.
     * @return An immutable instance of HealthchecksIoConfigDto
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableHealthchecksIoConfigDto build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableHealthchecksIoConfigDto(pingUrl, version);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_PING_URL) != 0) attributes.add("pingUrl");
      if ((initBits & INIT_BIT_VERSION) != 0) attributes.add("version");
      return "Cannot build HealthchecksIoConfigDto, some of required attributes are not set " + attributes;
    }
  }
}
