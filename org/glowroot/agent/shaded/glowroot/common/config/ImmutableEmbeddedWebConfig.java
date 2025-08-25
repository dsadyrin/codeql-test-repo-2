package org.glowroot.agent.shaded.glowroot.common.config;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonIgnore;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonInclude;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import org.glowroot.agent.shaded.google.common.collect.Lists;
import org.glowroot.agent.shaded.google.common.primitives.Booleans;
import java.util.ArrayList;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link EmbeddedWebConfig}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableEmbeddedWebConfig.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "EmbeddedWebConfig"})
@Immutable
public final class ImmutableEmbeddedWebConfig extends EmbeddedWebConfig {
  private final int port;
  private final String bindAddress;
  private final boolean https;
  private final String contextPath;
  private final int sessionTimeoutMinutes;
  private final String sessionCookieName;
  private final String version;

  private ImmutableEmbeddedWebConfig(ImmutableEmbeddedWebConfig.Builder builder) {
    if (builder.portIsSet()) {
      initShim.port(builder.port);
    }
    if (builder.bindAddress != null) {
      initShim.bindAddress(builder.bindAddress);
    }
    if (builder.httpsIsSet()) {
      initShim.https(builder.https);
    }
    if (builder.contextPath != null) {
      initShim.contextPath(builder.contextPath);
    }
    if (builder.sessionTimeoutMinutesIsSet()) {
      initShim.sessionTimeoutMinutes(builder.sessionTimeoutMinutes);
    }
    if (builder.sessionCookieName != null) {
      initShim.sessionCookieName(builder.sessionCookieName);
    }
    this.port = initShim.port();
    this.bindAddress = initShim.bindAddress();
    this.https = initShim.https();
    this.contextPath = initShim.contextPath();
    this.sessionTimeoutMinutes = initShim.sessionTimeoutMinutes();
    this.sessionCookieName = initShim.sessionCookieName();
    this.version = initShim.version();
    this.initShim = null;
  }

  private ImmutableEmbeddedWebConfig(
      int port,
      String bindAddress,
      boolean https,
      String contextPath,
      int sessionTimeoutMinutes,
      String sessionCookieName) {
    this.port = port;
    this.bindAddress = bindAddress;
    this.https = https;
    this.contextPath = contextPath;
    this.sessionTimeoutMinutes = sessionTimeoutMinutes;
    this.sessionCookieName = sessionCookieName;
    initShim.port(this.port);
    initShim.bindAddress(this.bindAddress);
    initShim.https(this.https);
    initShim.contextPath(this.contextPath);
    initShim.sessionTimeoutMinutes(this.sessionTimeoutMinutes);
    initShim.sessionCookieName(this.sessionCookieName);
    this.version = initShim.version();
    this.initShim = null;
  }

  private static final int STAGE_INITIALIZING = -1;
  private static final int STAGE_UNINITIALIZED = 0;
  private static final int STAGE_INITIALIZED = 1;
  private transient volatile InitShim initShim = new InitShim();

  private final class InitShim {
    private int port;
    private int portBuildStage;

    int port() {
      if (portBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (portBuildStage == STAGE_UNINITIALIZED) {
        portBuildStage = STAGE_INITIALIZING;
        this.port = ImmutableEmbeddedWebConfig.super.port();
        portBuildStage = STAGE_INITIALIZED;
      }
      return this.port;
    }

    void port(int port) {
      this.port = port;
      portBuildStage = STAGE_INITIALIZED;
    }
    private String bindAddress;
    private int bindAddressBuildStage;

    String bindAddress() {
      if (bindAddressBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (bindAddressBuildStage == STAGE_UNINITIALIZED) {
        bindAddressBuildStage = STAGE_INITIALIZING;
        this.bindAddress = Preconditions.checkNotNull(ImmutableEmbeddedWebConfig.super.bindAddress(), "bindAddress");
        bindAddressBuildStage = STAGE_INITIALIZED;
      }
      return this.bindAddress;
    }

    void bindAddress(String bindAddress) {
      this.bindAddress = bindAddress;
      bindAddressBuildStage = STAGE_INITIALIZED;
    }
    private boolean https;
    private int httpsBuildStage;

    boolean https() {
      if (httpsBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (httpsBuildStage == STAGE_UNINITIALIZED) {
        httpsBuildStage = STAGE_INITIALIZING;
        this.https = ImmutableEmbeddedWebConfig.super.https();
        httpsBuildStage = STAGE_INITIALIZED;
      }
      return this.https;
    }

    void https(boolean https) {
      this.https = https;
      httpsBuildStage = STAGE_INITIALIZED;
    }
    private String contextPath;
    private int contextPathBuildStage;

    String contextPath() {
      if (contextPathBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (contextPathBuildStage == STAGE_UNINITIALIZED) {
        contextPathBuildStage = STAGE_INITIALIZING;
        this.contextPath = Preconditions.checkNotNull(ImmutableEmbeddedWebConfig.super.contextPath(), "contextPath");
        contextPathBuildStage = STAGE_INITIALIZED;
      }
      return this.contextPath;
    }

    void contextPath(String contextPath) {
      this.contextPath = contextPath;
      contextPathBuildStage = STAGE_INITIALIZED;
    }
    private int sessionTimeoutMinutes;
    private int sessionTimeoutMinutesBuildStage;

    int sessionTimeoutMinutes() {
      if (sessionTimeoutMinutesBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (sessionTimeoutMinutesBuildStage == STAGE_UNINITIALIZED) {
        sessionTimeoutMinutesBuildStage = STAGE_INITIALIZING;
        this.sessionTimeoutMinutes = ImmutableEmbeddedWebConfig.super.sessionTimeoutMinutes();
        sessionTimeoutMinutesBuildStage = STAGE_INITIALIZED;
      }
      return this.sessionTimeoutMinutes;
    }

    void sessionTimeoutMinutes(int sessionTimeoutMinutes) {
      this.sessionTimeoutMinutes = sessionTimeoutMinutes;
      sessionTimeoutMinutesBuildStage = STAGE_INITIALIZED;
    }
    private String sessionCookieName;
    private int sessionCookieNameBuildStage;

    String sessionCookieName() {
      if (sessionCookieNameBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (sessionCookieNameBuildStage == STAGE_UNINITIALIZED) {
        sessionCookieNameBuildStage = STAGE_INITIALIZING;
        this.sessionCookieName = Preconditions.checkNotNull(ImmutableEmbeddedWebConfig.super.sessionCookieName(), "sessionCookieName");
        sessionCookieNameBuildStage = STAGE_INITIALIZED;
      }
      return this.sessionCookieName;
    }

    void sessionCookieName(String sessionCookieName) {
      this.sessionCookieName = sessionCookieName;
      sessionCookieNameBuildStage = STAGE_INITIALIZED;
    }
    private String version;
    private int versionBuildStage;

    String version() {
      if (versionBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (versionBuildStage == STAGE_UNINITIALIZED) {
        versionBuildStage = STAGE_INITIALIZING;
        this.version = Preconditions.checkNotNull(ImmutableEmbeddedWebConfig.super.version(), "version");
        versionBuildStage = STAGE_INITIALIZED;
      }
      return this.version;
    }

    private String formatInitCycleMessage() {
      ArrayList<String> attributes = Lists.newArrayList();
      if (portBuildStage == STAGE_INITIALIZING) attributes.add("port");
      if (bindAddressBuildStage == STAGE_INITIALIZING) attributes.add("bindAddress");
      if (httpsBuildStage == STAGE_INITIALIZING) attributes.add("https");
      if (contextPathBuildStage == STAGE_INITIALIZING) attributes.add("contextPath");
      if (sessionTimeoutMinutesBuildStage == STAGE_INITIALIZING) attributes.add("sessionTimeoutMinutes");
      if (sessionCookieNameBuildStage == STAGE_INITIALIZING) attributes.add("sessionCookieName");
      if (versionBuildStage == STAGE_INITIALIZING) attributes.add("version");
      return "Cannot build EmbeddedWebConfig, attribute initializers form cycle" + attributes;
    }
  }

  /**
   * @return The value of the {@code port} attribute
   */
  @JsonProperty("port")
  @Override
  public int port() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.port()
        : this.port;
  }

  /**
   * @return The value of the {@code bindAddress} attribute
   */
  @JsonProperty("bindAddress")
  @Override
  public String bindAddress() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.bindAddress()
        : this.bindAddress;
  }

  /**
   * @return The value of the {@code https} attribute
   */
  @JsonProperty("https")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @Override
  public boolean https() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.https()
        : this.https;
  }

  /**
   * @return The value of the {@code contextPath} attribute
   */
  @JsonProperty("contextPath")
  @Override
  public String contextPath() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.contextPath()
        : this.contextPath;
  }

  /**
   * @return The value of the {@code sessionTimeoutMinutes} attribute
   */
  @JsonProperty("sessionTimeoutMinutes")
  @Override
  public int sessionTimeoutMinutes() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.sessionTimeoutMinutes()
        : this.sessionTimeoutMinutes;
  }

  /**
   * @return The value of the {@code sessionCookieName} attribute
   */
  @JsonProperty("sessionCookieName")
  @Override
  public String sessionCookieName() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.sessionCookieName()
        : this.sessionCookieName;
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
   * Copy the current immutable object by setting a value for the {@link EmbeddedWebConfig#port() port} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for port
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEmbeddedWebConfig withPort(int value) {
    if (this.port == value) return this;
    return new ImmutableEmbeddedWebConfig(
        value,
        this.bindAddress,
        this.https,
        this.contextPath,
        this.sessionTimeoutMinutes,
        this.sessionCookieName);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EmbeddedWebConfig#bindAddress() bindAddress} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for bindAddress
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEmbeddedWebConfig withBindAddress(String value) {
    if (this.bindAddress.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "bindAddress");
    return new ImmutableEmbeddedWebConfig(
        this.port,
        newValue,
        this.https,
        this.contextPath,
        this.sessionTimeoutMinutes,
        this.sessionCookieName);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EmbeddedWebConfig#https() https} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for https
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEmbeddedWebConfig withHttps(boolean value) {
    if (this.https == value) return this;
    return new ImmutableEmbeddedWebConfig(
        this.port,
        this.bindAddress,
        value,
        this.contextPath,
        this.sessionTimeoutMinutes,
        this.sessionCookieName);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EmbeddedWebConfig#contextPath() contextPath} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for contextPath
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEmbeddedWebConfig withContextPath(String value) {
    if (this.contextPath.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "contextPath");
    return new ImmutableEmbeddedWebConfig(
        this.port,
        this.bindAddress,
        this.https,
        newValue,
        this.sessionTimeoutMinutes,
        this.sessionCookieName);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EmbeddedWebConfig#sessionTimeoutMinutes() sessionTimeoutMinutes} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for sessionTimeoutMinutes
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEmbeddedWebConfig withSessionTimeoutMinutes(int value) {
    if (this.sessionTimeoutMinutes == value) return this;
    return new ImmutableEmbeddedWebConfig(this.port, this.bindAddress, this.https, this.contextPath, value, this.sessionCookieName);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EmbeddedWebConfig#sessionCookieName() sessionCookieName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for sessionCookieName
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEmbeddedWebConfig withSessionCookieName(String value) {
    if (this.sessionCookieName.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "sessionCookieName");
    return new ImmutableEmbeddedWebConfig(this.port, this.bindAddress, this.https, this.contextPath, this.sessionTimeoutMinutes, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableEmbeddedWebConfig} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableEmbeddedWebConfig
        && equalTo((ImmutableEmbeddedWebConfig) another);
  }

  private boolean equalTo(ImmutableEmbeddedWebConfig another) {
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
   * Prints the immutable value {@code EmbeddedWebConfig} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("EmbeddedWebConfig")
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
  static final class Json extends EmbeddedWebConfig {
    int port;
    boolean portIsSet;
    @Nullable String bindAddress;
    boolean https;
    boolean httpsIsSet;
    @Nullable String contextPath;
    int sessionTimeoutMinutes;
    boolean sessionTimeoutMinutesIsSet;
    @Nullable String sessionCookieName;
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
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
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
    @Override
    public int port() { throw new UnsupportedOperationException(); }
    @Override
    public String bindAddress() { throw new UnsupportedOperationException(); }
    @Override
    public boolean https() { throw new UnsupportedOperationException(); }
    @Override
    public String contextPath() { throw new UnsupportedOperationException(); }
    @Override
    public int sessionTimeoutMinutes() { throw new UnsupportedOperationException(); }
    @Override
    public String sessionCookieName() { throw new UnsupportedOperationException(); }
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
  static ImmutableEmbeddedWebConfig fromJson(Json json) {
    ImmutableEmbeddedWebConfig.Builder builder = ImmutableEmbeddedWebConfig.builder();
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
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link EmbeddedWebConfig} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable EmbeddedWebConfig instance
   */
  public static ImmutableEmbeddedWebConfig copyOf(EmbeddedWebConfig instance) {
    if (instance instanceof ImmutableEmbeddedWebConfig) {
      return (ImmutableEmbeddedWebConfig) instance;
    }
    return ImmutableEmbeddedWebConfig.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableEmbeddedWebConfig ImmutableEmbeddedWebConfig}.
   * @return A new ImmutableEmbeddedWebConfig builder
   */
  public static ImmutableEmbeddedWebConfig.Builder builder() {
    return new ImmutableEmbeddedWebConfig.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableEmbeddedWebConfig ImmutableEmbeddedWebConfig}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_PORT = 0x1L;
    private static final long OPT_BIT_HTTPS = 0x2L;
    private static final long OPT_BIT_SESSION_TIMEOUT_MINUTES = 0x4L;
    private long optBits;

    private int port;
    private @Nullable String bindAddress;
    private boolean https;
    private @Nullable String contextPath;
    private int sessionTimeoutMinutes;
    private @Nullable String sessionCookieName;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code org.glowroot.agent.shaded.glowroot.common.config.EmbeddedWebConfig} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(EmbeddedWebConfig instance) {
      Preconditions.checkNotNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    /**
     * Fill a builder with attribute values from the provided {@code org.glowroot.agent.shaded.glowroot.common.config.WebConfig} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(WebConfig instance) {
      Preconditions.checkNotNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    private void from(Object object) {
      long bits = 0;
      if (object instanceof EmbeddedWebConfig) {
        EmbeddedWebConfig instance = (EmbeddedWebConfig) object;
        contextPath(instance.contextPath());
        https(instance.https());
        if ((bits & 0x1L) == 0) {
          sessionTimeoutMinutes(instance.sessionTimeoutMinutes());
          bits |= 0x1L;
        }
        if ((bits & 0x2L) == 0) {
          sessionCookieName(instance.sessionCookieName());
          bits |= 0x2L;
        }
        port(instance.port());
        bindAddress(instance.bindAddress());
      }
      if (object instanceof WebConfig) {
        WebConfig instance = (WebConfig) object;
        if ((bits & 0x2L) == 0) {
          sessionCookieName(instance.sessionCookieName());
          bits |= 0x2L;
        }
        if ((bits & 0x1L) == 0) {
          sessionTimeoutMinutes(instance.sessionTimeoutMinutes());
          bits |= 0x1L;
        }
      }
    }

    /**
     * Initializes the value for the {@link EmbeddedWebConfig#port() port} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link EmbeddedWebConfig#port() port}.</em>
     * @param port The value for port 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder port(int port) {
      this.port = port;
      optBits |= OPT_BIT_PORT;
      return this;
    }

    /**
     * Initializes the value for the {@link EmbeddedWebConfig#bindAddress() bindAddress} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link EmbeddedWebConfig#bindAddress() bindAddress}.</em>
     * @param bindAddress The value for bindAddress 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder bindAddress(String bindAddress) {
      this.bindAddress = Preconditions.checkNotNull(bindAddress, "bindAddress");
      return this;
    }

    /**
     * Initializes the value for the {@link EmbeddedWebConfig#https() https} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link EmbeddedWebConfig#https() https}.</em>
     * @param https The value for https 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder https(boolean https) {
      this.https = https;
      optBits |= OPT_BIT_HTTPS;
      return this;
    }

    /**
     * Initializes the value for the {@link EmbeddedWebConfig#contextPath() contextPath} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link EmbeddedWebConfig#contextPath() contextPath}.</em>
     * @param contextPath The value for contextPath 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder contextPath(String contextPath) {
      this.contextPath = Preconditions.checkNotNull(contextPath, "contextPath");
      return this;
    }

    /**
     * Initializes the value for the {@link EmbeddedWebConfig#sessionTimeoutMinutes() sessionTimeoutMinutes} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link EmbeddedWebConfig#sessionTimeoutMinutes() sessionTimeoutMinutes}.</em>
     * @param sessionTimeoutMinutes The value for sessionTimeoutMinutes 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder sessionTimeoutMinutes(int sessionTimeoutMinutes) {
      this.sessionTimeoutMinutes = sessionTimeoutMinutes;
      optBits |= OPT_BIT_SESSION_TIMEOUT_MINUTES;
      return this;
    }

    /**
     * Initializes the value for the {@link EmbeddedWebConfig#sessionCookieName() sessionCookieName} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link EmbeddedWebConfig#sessionCookieName() sessionCookieName}.</em>
     * @param sessionCookieName The value for sessionCookieName 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder sessionCookieName(String sessionCookieName) {
      this.sessionCookieName = Preconditions.checkNotNull(sessionCookieName, "sessionCookieName");
      return this;
    }

    /**
     * Builds a new {@link ImmutableEmbeddedWebConfig ImmutableEmbeddedWebConfig}.
     * @return An immutable instance of EmbeddedWebConfig
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableEmbeddedWebConfig build() {
      return new ImmutableEmbeddedWebConfig(this);
    }

    private boolean portIsSet() {
      return (optBits & OPT_BIT_PORT) != 0;
    }

    private boolean httpsIsSet() {
      return (optBits & OPT_BIT_HTTPS) != 0;
    }

    private boolean sessionTimeoutMinutesIsSet() {
      return (optBits & OPT_BIT_SESSION_TIMEOUT_MINUTES) != 0;
    }
  }
}
