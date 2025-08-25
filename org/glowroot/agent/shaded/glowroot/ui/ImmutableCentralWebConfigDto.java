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
 * Immutable implementation of {@link AdminJsonService.CentralWebConfigDto}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCentralWebConfigDto.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "AdminJsonService.CentralWebConfigDto"})
@Immutable
final class ImmutableCentralWebConfigDto extends AdminJsonService.CentralWebConfigDto {
  private final int sessionTimeoutMinutes;
  private final String sessionCookieName;
  private final String version;

  private ImmutableCentralWebConfigDto(int sessionTimeoutMinutes, String sessionCookieName, String version) {
    this.sessionTimeoutMinutes = sessionTimeoutMinutes;
    this.sessionCookieName = sessionCookieName;
    this.version = version;
  }

  /**
   * @return The value of the {@code sessionTimeoutMinutes} attribute
   */
  @JsonProperty("sessionTimeoutMinutes")
  @Override
  int sessionTimeoutMinutes() {
    return sessionTimeoutMinutes;
  }

  /**
   * @return The value of the {@code sessionCookieName} attribute
   */
  @JsonProperty("sessionCookieName")
  @Override
  String sessionCookieName() {
    return sessionCookieName;
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
   * Copy the current immutable object by setting a value for the {@link AdminJsonService.CentralWebConfigDto#sessionTimeoutMinutes() sessionTimeoutMinutes} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for sessionTimeoutMinutes
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCentralWebConfigDto withSessionTimeoutMinutes(int value) {
    if (this.sessionTimeoutMinutes == value) return this;
    return new ImmutableCentralWebConfigDto(value, this.sessionCookieName, this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AdminJsonService.CentralWebConfigDto#sessionCookieName() sessionCookieName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for sessionCookieName
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCentralWebConfigDto withSessionCookieName(String value) {
    if (this.sessionCookieName.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "sessionCookieName");
    return new ImmutableCentralWebConfigDto(this.sessionTimeoutMinutes, newValue, this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AdminJsonService.CentralWebConfigDto#version() version} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for version
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCentralWebConfigDto withVersion(String value) {
    if (this.version.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "version");
    return new ImmutableCentralWebConfigDto(this.sessionTimeoutMinutes, this.sessionCookieName, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCentralWebConfigDto} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCentralWebConfigDto
        && equalTo((ImmutableCentralWebConfigDto) another);
  }

  private boolean equalTo(ImmutableCentralWebConfigDto another) {
    return sessionTimeoutMinutes == another.sessionTimeoutMinutes
        && sessionCookieName.equals(another.sessionCookieName)
        && version.equals(another.version);
  }

  /**
   * Computes a hash code from attributes: {@code sessionTimeoutMinutes}, {@code sessionCookieName}, {@code version}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + sessionTimeoutMinutes;
    h += (h << 5) + sessionCookieName.hashCode();
    h += (h << 5) + version.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code CentralWebConfigDto} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("CentralWebConfigDto")
        .omitNullValues()
        .add("sessionTimeoutMinutes", sessionTimeoutMinutes)
        .add("sessionCookieName", sessionCookieName)
        .add("version", version)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends AdminJsonService.CentralWebConfigDto {
    int sessionTimeoutMinutes;
    boolean sessionTimeoutMinutesIsSet;
    @Nullable String sessionCookieName;
    @Nullable String version;
    @JsonProperty("sessionTimeoutMinutes")
    public void setSessionTimeoutMinutes(int sessionTimeoutMinutes) {
      this.sessionTimeoutMinutes = sessionTimeoutMinutes;
      this.sessionTimeoutMinutesIsSet = true;
    }
    @JsonProperty("sessionCookieName")
    public void setSessionCookieName(String sessionCookieName) {
      this.sessionCookieName = sessionCookieName;
    }
    @JsonProperty("version")
    public void setVersion(String version) {
      this.version = version;
    }
    @Override
    int sessionTimeoutMinutes() { throw new UnsupportedOperationException(); }
    @Override
    String sessionCookieName() { throw new UnsupportedOperationException(); }
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
  static ImmutableCentralWebConfigDto fromJson(Json json) {
    ImmutableCentralWebConfigDto.Builder builder = ImmutableCentralWebConfigDto.builder();
    if (json.sessionTimeoutMinutesIsSet) {
      builder.sessionTimeoutMinutes(json.sessionTimeoutMinutes);
    }
    if (json.sessionCookieName != null) {
      builder.sessionCookieName(json.sessionCookieName);
    }
    if (json.version != null) {
      builder.version(json.version);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link AdminJsonService.CentralWebConfigDto} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable CentralWebConfigDto instance
   */
  public static ImmutableCentralWebConfigDto copyOf(AdminJsonService.CentralWebConfigDto instance) {
    if (instance instanceof ImmutableCentralWebConfigDto) {
      return (ImmutableCentralWebConfigDto) instance;
    }
    return ImmutableCentralWebConfigDto.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableCentralWebConfigDto ImmutableCentralWebConfigDto}.
   * @return A new ImmutableCentralWebConfigDto builder
   */
  public static ImmutableCentralWebConfigDto.Builder builder() {
    return new ImmutableCentralWebConfigDto.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableCentralWebConfigDto ImmutableCentralWebConfigDto}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_SESSION_TIMEOUT_MINUTES = 0x1L;
    private static final long INIT_BIT_SESSION_COOKIE_NAME = 0x2L;
    private static final long INIT_BIT_VERSION = 0x4L;
    private long initBits = 0x7L;

    private int sessionTimeoutMinutes;
    private @Nullable String sessionCookieName;
    private @Nullable String version;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code CentralWebConfigDto} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(AdminJsonService.CentralWebConfigDto instance) {
      Preconditions.checkNotNull(instance, "instance");
      sessionTimeoutMinutes(instance.sessionTimeoutMinutes());
      sessionCookieName(instance.sessionCookieName());
      version(instance.version());
      return this;
    }

    /**
     * Initializes the value for the {@link AdminJsonService.CentralWebConfigDto#sessionTimeoutMinutes() sessionTimeoutMinutes} attribute.
     * @param sessionTimeoutMinutes The value for sessionTimeoutMinutes 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder sessionTimeoutMinutes(int sessionTimeoutMinutes) {
      this.sessionTimeoutMinutes = sessionTimeoutMinutes;
      initBits &= ~INIT_BIT_SESSION_TIMEOUT_MINUTES;
      return this;
    }

    /**
     * Initializes the value for the {@link AdminJsonService.CentralWebConfigDto#sessionCookieName() sessionCookieName} attribute.
     * @param sessionCookieName The value for sessionCookieName 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder sessionCookieName(String sessionCookieName) {
      this.sessionCookieName = Preconditions.checkNotNull(sessionCookieName, "sessionCookieName");
      initBits &= ~INIT_BIT_SESSION_COOKIE_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link AdminJsonService.CentralWebConfigDto#version() version} attribute.
     * @param version The value for version 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder version(String version) {
      this.version = Preconditions.checkNotNull(version, "version");
      initBits &= ~INIT_BIT_VERSION;
      return this;
    }

    /**
     * Builds a new {@link ImmutableCentralWebConfigDto ImmutableCentralWebConfigDto}.
     * @return An immutable instance of CentralWebConfigDto
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableCentralWebConfigDto build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableCentralWebConfigDto(sessionTimeoutMinutes, sessionCookieName, version);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_SESSION_TIMEOUT_MINUTES) != 0) attributes.add("sessionTimeoutMinutes");
      if ((initBits & INIT_BIT_SESSION_COOKIE_NAME) != 0) attributes.add("sessionCookieName");
      if ((initBits & INIT_BIT_VERSION) != 0) attributes.add("version");
      return "Cannot build CentralWebConfigDto, some of required attributes are not set " + attributes;
    }
  }
}
