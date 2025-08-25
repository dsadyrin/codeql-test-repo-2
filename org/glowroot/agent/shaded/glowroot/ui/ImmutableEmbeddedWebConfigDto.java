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
 * Immutable implementation of {@link AdminJsonService.EmbeddedWebConfigDto}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableEmbeddedWebConfigDto.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "AdminJsonService.EmbeddedWebConfigDto"})
@Immutable
final class ImmutableEmbeddedWebConfigDto extends AdminJsonService.EmbeddedWebConfigDto {
  private final int port;
  private final String bindAddress;
  private final boolean https;
  private final String contextPath;
  private final int sessionTimeoutMinutes;
  private final String sessionCookieName;
  private final String version;

  private ImmutableEmbeddedWebConfigDto(
      int port,
      String bindAddress,
      boolean https,
      String contextPath,
      int sessionTimeoutMinutes,
      String sessionCookieName,
      String version) {
    this.port = port;
    this.bindAddress = bindAddress;
    this.https = https;
    this.contextPath = contextPath;
    this.sessionTimeoutMinutes = sessionTimeoutMinutes;
    this.sessionCookieName = sessionCookieName;
    this.version = version;
  }

  /**
   * @return The value of the {@code port} attribute
   */
  @JsonProperty("port")
  @Override
  int port() {
    return port;
  }

  /**
   * @return The value of the {@code bindAddress} attribute
   */
  @JsonProperty("bindAddress")
  @Override
  String bindAddress() {
    return bindAddress;
  }

  /**
   * @return The value of the {@code https} attribute
   */
  @JsonProperty("https")
  @Override
  boolean https() {
    return https;
  }

  /**
   * @return The value of the {@code contextPath} attribute
   */
  @JsonProperty("contextPath")
  @Override
  String contextPath() {
    return contextPath;
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
   * Copy the current immutable object by setting a value for the {@link AdminJsonService.EmbeddedWebConfigDto#port() port} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for port
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEmbeddedWebConfigDto withPort(int value) {
    if (this.port == value) return this;
    return new ImmutableEmbeddedWebConfigDto(
        value,
        this.bindAddress,
        this.https,
        this.contextPath,
        this.sessionTimeoutMinutes,
        this.sessionCookieName,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AdminJsonService.EmbeddedWebConfigDto#bindAddress() bindAddress} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for bindAddress
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEmbeddedWebConfigDto withBindAddress(String value) {
    if (this.bindAddress.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "bindAddress");
    return new ImmutableEmbeddedWebConfigDto(
        this.port,
        newValue,
        this.https,
        this.contextPath,
        this.sessionTimeoutMinutes,
        this.sessionCookieName,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AdminJsonService.EmbeddedWebConfigDto#https() https} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for https
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEmbeddedWebConfigDto withHttps(boolean value) {
    if (this.https == value) return this;
    return new ImmutableEmbeddedWebConfigDto(
        this.port,
        this.bindAddress,
        value,
        this.contextPath,
        this.sessionTimeoutMinutes,
        this.sessionCookieName,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AdminJsonService.EmbeddedWebConfigDto#contextPath() contextPath} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for contextPath
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEmbeddedWebConfigDto withContextPath(String value) {
    if (this.contextPath.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "contextPath");
    return new ImmutableEmbeddedWebConfigDto(
        this.port,
        this.bindAddress,
        this.https,
        newValue,
        this.sessionTimeoutMinutes,
        this.sessionCookieName,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AdminJsonService.EmbeddedWebConfigDto#sessionTimeoutMinutes() sessionTimeoutMinutes} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for sessionTimeoutMinutes
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEmbeddedWebConfigDto withSessionTimeoutMinutes(int value) {
    if (this.sessionTimeoutMinutes == value) return this;
    return new ImmutableEmbeddedWebConfigDto(
        this.port,
        this.bindAddress,
        this.https,
        this.contextPath,
        value,
        this.sessionCookieName,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AdminJsonService.EmbeddedWebConfigDto#sessionCookieName() sessionCookieName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for sessionCookieName
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEmbeddedWebConfigDto withSessionCookieName(String value) {
    if (this.sessionCookieName.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "sessionCookieName");
    return new ImmutableEmbeddedWebConfigDto(
        this.port,
        this.bindAddress,
        this.https,
        this.contextPath,
        this.sessionTimeoutMinutes,
        newValue,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AdminJsonService.EmbeddedWebConfigDto#version() version} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for version
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEmbeddedWebConfigDto withVersion(String value) {
    if (this.version.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "version");
    return new ImmutableEmbeddedWebConfigDto(
        this.port,
        this.bindAddress,
        this.https,
        this.contextPath,
        this.sessionTimeoutMinutes,
        this.sessionCookieName,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableEmbeddedWebConfigDto} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableEmbeddedWebConfigDto
        && equalTo((ImmutableEmbeddedWebConfigDto) another);
  }

  private boolean equalTo(ImmutableEmbeddedWebConfigDto another) {
    return port == another.port
        && bindAddress.equals(another.bindAddress)
        && https == another.https
        && contextPath.equals(another.contextPath)
        && sessionTimeoutMinutes == another.sessionTimeoutMinutes
        && sessionCookieName.equals(another.sessionCookieName)
        && version.equals(another.version);
  }

  /**
   * Computes a hash code from attributes: {@code port}, {@code bindAddress}, {@code https}, {@code contextPath}, {@code sessionTimeoutMinutes}, {@code sessionCookieName}, {@code version}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + port;
    h += (h << 5) + bindAddress.hashCode();
    h += (h << 5) + Booleans.hashCode(https);
    h += (h << 5) + contextPath.hashCode();
    h += (h << 5) + sessionTimeoutMinutes;
    h += (h << 5) + sessionCookieName.hashCode();
    h += (h << 5) + version.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code EmbeddedWebConfigDto} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("EmbeddedWebConfigDto")
        .omitNullValues()
        .add("port", port)
        .add("bindAddress", bindAddress)
        .add("https", https)
        .add("contextPath", contextPath)
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
  static final class Json extends AdminJsonService.EmbeddedWebConfigDto {
    int port;
    boolean portIsSet;
    @Nullable String bindAddress;
    boolean https;
    boolean httpsIsSet;
    @Nullable String contextPath;
    int sessionTimeoutMinutes;
    boolean sessionTimeoutMinutesIsSet;
    @Nullable String sessionCookieName;
    @Nullable String version;
    @JsonProperty("port")
    public void setPort(int port) {
      this.port = port;
      this.portIsSet = true;
    }
    @JsonProperty("bindAddress")
    public void setBindAddress(String bindAddress) {
      this.bindAddress = bindAddress;
    }
    @JsonProperty("https")
    public void setHttps(boolean https) {
      this.https = https;
      this.httpsIsSet = true;
    }
    @JsonProperty("contextPath")
    public void setContextPath(String contextPath) {
      this.contextPath = contextPath;
    }
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
    int port() { throw new UnsupportedOperationException(); }
    @Override
    String bindAddress() { throw new UnsupportedOperationException(); }
    @Override
    boolean https() { throw new UnsupportedOperationException(); }
    @Override
    String contextPath() { throw new UnsupportedOperationException(); }
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
  static ImmutableEmbeddedWebConfigDto fromJson(Json json) {
    ImmutableEmbeddedWebConfigDto.Builder builder = ImmutableEmbeddedWebConfigDto.builder();
    if (json.portIsSet) {
      builder.port(json.port);
    }
    if (json.bindAddress != null) {
      builder.bindAddress(json.bindAddress);
    }
    if (json.httpsIsSet) {
      builder.https(json.https);
    }
    if (json.contextPath != null) {
      builder.contextPath(json.contextPath);
    }
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
   * Creates an immutable copy of a {@link AdminJsonService.EmbeddedWebConfigDto} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable EmbeddedWebConfigDto instance
   */
  public static ImmutableEmbeddedWebConfigDto copyOf(AdminJsonService.EmbeddedWebConfigDto instance) {
    if (instance instanceof ImmutableEmbeddedWebConfigDto) {
      return (ImmutableEmbeddedWebConfigDto) instance;
    }
    return ImmutableEmbeddedWebConfigDto.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableEmbeddedWebConfigDto ImmutableEmbeddedWebConfigDto}.
   * @return A new ImmutableEmbeddedWebConfigDto builder
   */
  public static ImmutableEmbeddedWebConfigDto.Builder builder() {
    return new ImmutableEmbeddedWebConfigDto.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableEmbeddedWebConfigDto ImmutableEmbeddedWebConfigDto}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_PORT = 0x1L;
    private static final long INIT_BIT_BIND_ADDRESS = 0x2L;
    private static final long INIT_BIT_HTTPS = 0x4L;
    private static final long INIT_BIT_CONTEXT_PATH = 0x8L;
    private static final long INIT_BIT_SESSION_TIMEOUT_MINUTES = 0x10L;
    private static final long INIT_BIT_SESSION_COOKIE_NAME = 0x20L;
    private static final long INIT_BIT_VERSION = 0x40L;
    private long initBits = 0x7fL;

    private int port;
    private @Nullable String bindAddress;
    private boolean https;
    private @Nullable String contextPath;
    private int sessionTimeoutMinutes;
    private @Nullable String sessionCookieName;
    private @Nullable String version;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code EmbeddedWebConfigDto} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(AdminJsonService.EmbeddedWebConfigDto instance) {
      Preconditions.checkNotNull(instance, "instance");
      port(instance.port());
      bindAddress(instance.bindAddress());
      https(instance.https());
      contextPath(instance.contextPath());
      sessionTimeoutMinutes(instance.sessionTimeoutMinutes());
      sessionCookieName(instance.sessionCookieName());
      version(instance.version());
      return this;
    }

    /**
     * Initializes the value for the {@link AdminJsonService.EmbeddedWebConfigDto#port() port} attribute.
     * @param port The value for port 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder port(int port) {
      this.port = port;
      initBits &= ~INIT_BIT_PORT;
      return this;
    }

    /**
     * Initializes the value for the {@link AdminJsonService.EmbeddedWebConfigDto#bindAddress() bindAddress} attribute.
     * @param bindAddress The value for bindAddress 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder bindAddress(String bindAddress) {
      this.bindAddress = Preconditions.checkNotNull(bindAddress, "bindAddress");
      initBits &= ~INIT_BIT_BIND_ADDRESS;
      return this;
    }

    /**
     * Initializes the value for the {@link AdminJsonService.EmbeddedWebConfigDto#https() https} attribute.
     * @param https The value for https 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder https(boolean https) {
      this.https = https;
      initBits &= ~INIT_BIT_HTTPS;
      return this;
    }

    /**
     * Initializes the value for the {@link AdminJsonService.EmbeddedWebConfigDto#contextPath() contextPath} attribute.
     * @param contextPath The value for contextPath 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder contextPath(String contextPath) {
      this.contextPath = Preconditions.checkNotNull(contextPath, "contextPath");
      initBits &= ~INIT_BIT_CONTEXT_PATH;
      return this;
    }

    /**
     * Initializes the value for the {@link AdminJsonService.EmbeddedWebConfigDto#sessionTimeoutMinutes() sessionTimeoutMinutes} attribute.
     * @param sessionTimeoutMinutes The value for sessionTimeoutMinutes 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder sessionTimeoutMinutes(int sessionTimeoutMinutes) {
      this.sessionTimeoutMinutes = sessionTimeoutMinutes;
      initBits &= ~INIT_BIT_SESSION_TIMEOUT_MINUTES;
      return this;
    }

    /**
     * Initializes the value for the {@link AdminJsonService.EmbeddedWebConfigDto#sessionCookieName() sessionCookieName} attribute.
     * @param sessionCookieName The value for sessionCookieName 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder sessionCookieName(String sessionCookieName) {
      this.sessionCookieName = Preconditions.checkNotNull(sessionCookieName, "sessionCookieName");
      initBits &= ~INIT_BIT_SESSION_COOKIE_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link AdminJsonService.EmbeddedWebConfigDto#version() version} attribute.
     * @param version The value for version 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder version(String version) {
      this.version = Preconditions.checkNotNull(version, "version");
      initBits &= ~INIT_BIT_VERSION;
      return this;
    }

    /**
     * Builds a new {@link ImmutableEmbeddedWebConfigDto ImmutableEmbeddedWebConfigDto}.
     * @return An immutable instance of EmbeddedWebConfigDto
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableEmbeddedWebConfigDto build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableEmbeddedWebConfigDto(port, bindAddress, https, contextPath, sessionTimeoutMinutes, sessionCookieName, version);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_PORT) != 0) attributes.add("port");
      if ((initBits & INIT_BIT_BIND_ADDRESS) != 0) attributes.add("bindAddress");
      if ((initBits & INIT_BIT_HTTPS) != 0) attributes.add("https");
      if ((initBits & INIT_BIT_CONTEXT_PATH) != 0) attributes.add("contextPath");
      if ((initBits & INIT_BIT_SESSION_TIMEOUT_MINUTES) != 0) attributes.add("sessionTimeoutMinutes");
      if ((initBits & INIT_BIT_SESSION_COOKIE_NAME) != 0) attributes.add("sessionCookieName");
      if ((initBits & INIT_BIT_VERSION) != 0) attributes.add("version");
      return "Cannot build EmbeddedWebConfigDto, some of required attributes are not set " + attributes;
    }
  }
}
