package org.glowroot.agent.shaded.glowroot.common.config;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonIgnore;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonInclude;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Objects;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import org.glowroot.agent.shaded.google.common.collect.Lists;
import java.util.ArrayList;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link HttpProxyConfig}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableHttpProxyConfig.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "HttpProxyConfig"})
@Immutable
public final class ImmutableHttpProxyConfig extends HttpProxyConfig {
  private final String host;
  private final @Nullable Integer port;
  private final String username;
  private final String password;
  private final String version;

  private ImmutableHttpProxyConfig(ImmutableHttpProxyConfig.Builder builder) {
    this.port = builder.port;
    if (builder.host != null) {
      initShim.host(builder.host);
    }
    if (builder.username != null) {
      initShim.username(builder.username);
    }
    if (builder.password != null) {
      initShim.password(builder.password);
    }
    this.host = initShim.host();
    this.username = initShim.username();
    this.password = initShim.password();
    this.version = initShim.version();
    this.initShim = null;
  }

  private ImmutableHttpProxyConfig(
      String host,
      @Nullable Integer port,
      String username,
      String password) {
    this.host = host;
    this.port = port;
    this.username = username;
    this.password = password;
    initShim.host(this.host);
    initShim.username(this.username);
    initShim.password(this.password);
    this.version = initShim.version();
    this.initShim = null;
  }

  private static final int STAGE_INITIALIZING = -1;
  private static final int STAGE_UNINITIALIZED = 0;
  private static final int STAGE_INITIALIZED = 1;
  private transient volatile InitShim initShim = new InitShim();

  private final class InitShim {
    private String host;
    private int hostBuildStage;

    String host() {
      if (hostBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (hostBuildStage == STAGE_UNINITIALIZED) {
        hostBuildStage = STAGE_INITIALIZING;
        this.host = Preconditions.checkNotNull(ImmutableHttpProxyConfig.super.host(), "host");
        hostBuildStage = STAGE_INITIALIZED;
      }
      return this.host;
    }

    void host(String host) {
      this.host = host;
      hostBuildStage = STAGE_INITIALIZED;
    }
    private String username;
    private int usernameBuildStage;

    String username() {
      if (usernameBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (usernameBuildStage == STAGE_UNINITIALIZED) {
        usernameBuildStage = STAGE_INITIALIZING;
        this.username = Preconditions.checkNotNull(ImmutableHttpProxyConfig.super.username(), "username");
        usernameBuildStage = STAGE_INITIALIZED;
      }
      return this.username;
    }

    void username(String username) {
      this.username = username;
      usernameBuildStage = STAGE_INITIALIZED;
    }
    private String password;
    private int passwordBuildStage;

    String password() {
      if (passwordBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (passwordBuildStage == STAGE_UNINITIALIZED) {
        passwordBuildStage = STAGE_INITIALIZING;
        this.password = Preconditions.checkNotNull(ImmutableHttpProxyConfig.super.password(), "password");
        passwordBuildStage = STAGE_INITIALIZED;
      }
      return this.password;
    }

    void password(String password) {
      this.password = password;
      passwordBuildStage = STAGE_INITIALIZED;
    }
    private String version;
    private int versionBuildStage;

    String version() {
      if (versionBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (versionBuildStage == STAGE_UNINITIALIZED) {
        versionBuildStage = STAGE_INITIALIZING;
        this.version = Preconditions.checkNotNull(ImmutableHttpProxyConfig.super.version(), "version");
        versionBuildStage = STAGE_INITIALIZED;
      }
      return this.version;
    }

    private String formatInitCycleMessage() {
      ArrayList<String> attributes = Lists.newArrayList();
      if (hostBuildStage == STAGE_INITIALIZING) attributes.add("host");
      if (usernameBuildStage == STAGE_INITIALIZING) attributes.add("username");
      if (passwordBuildStage == STAGE_INITIALIZING) attributes.add("password");
      if (versionBuildStage == STAGE_INITIALIZING) attributes.add("version");
      return "Cannot build HttpProxyConfig, attribute initializers form cycle" + attributes;
    }
  }

  /**
   * @return The value of the {@code host} attribute
   */
  @JsonProperty("host")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @Override
  public String host() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.host()
        : this.host;
  }

  /**
   * @return The value of the {@code port} attribute
   */
  @JsonProperty("port")
  @JsonInclude(JsonInclude.Include.NON_NULL)
  @Override
  public @Nullable Integer port() {
    return port;
  }

  /**
   * @return The value of the {@code username} attribute
   */
  @JsonProperty("username")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @Override
  public String username() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.username()
        : this.username;
  }

  /**
   * @return The value of the {@code password} attribute
   */
  @JsonProperty("password")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @Override
  public String password() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.password()
        : this.password;
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
   * Copy the current immutable object by setting a value for the {@link HttpProxyConfig#host() host} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for host
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableHttpProxyConfig withHost(String value) {
    if (this.host.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "host");
    return new ImmutableHttpProxyConfig(newValue, this.port, this.username, this.password);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link HttpProxyConfig#port() port} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for port (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableHttpProxyConfig withPort(@Nullable Integer value) {
    if (Objects.equal(this.port, value)) return this;
    return new ImmutableHttpProxyConfig(this.host, value, this.username, this.password);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link HttpProxyConfig#username() username} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for username
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableHttpProxyConfig withUsername(String value) {
    if (this.username.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "username");
    return new ImmutableHttpProxyConfig(this.host, this.port, newValue, this.password);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link HttpProxyConfig#password() password} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for password
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableHttpProxyConfig withPassword(String value) {
    if (this.password.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "password");
    return new ImmutableHttpProxyConfig(this.host, this.port, this.username, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableHttpProxyConfig} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableHttpProxyConfig
        && equalTo((ImmutableHttpProxyConfig) another);
  }

  private boolean equalTo(ImmutableHttpProxyConfig another) {
    return host.equals(another.host)
        && Objects.equal(port, another.port)
        && username.equals(another.username)
        && password.equals(another.password)
        && version.equals(another.version);
  }

  /**
   * Computes a hash code from attributes: {@code host}, {@code port}, {@code username}, {@code password}, {@code version}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + host.hashCode();
    h += (h << 5) + Objects.hashCode(port);
    h += (h << 5) + username.hashCode();
    h += (h << 5) + password.hashCode();
    h += (h << 5) + version.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code HttpProxyConfig} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("HttpProxyConfig")
        .omitNullValues()
        .add("host", host)
        .add("port", port)
        .add("username", username)
        .add("password", password)
        .add("version", version)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends HttpProxyConfig {
    @Nullable String host;
    @Nullable Integer port;
    @Nullable String username;
    @Nullable String password;
    @JsonProperty("host")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public void setHost(String host) {
      this.host = host;
    }
    @JsonProperty("port")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public void setPort(@Nullable Integer port) {
      this.port = port;
    }
    @JsonProperty("username")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public void setUsername(String username) {
      this.username = username;
    }
    @JsonProperty("password")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public void setPassword(String password) {
      this.password = password;
    }
    @Override
    public String host() { throw new UnsupportedOperationException(); }
    @Override
    public Integer port() { throw new UnsupportedOperationException(); }
    @Override
    public String username() { throw new UnsupportedOperationException(); }
    @Override
    public String password() { throw new UnsupportedOperationException(); }
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
  static ImmutableHttpProxyConfig fromJson(Json json) {
    ImmutableHttpProxyConfig.Builder builder = ImmutableHttpProxyConfig.builder();
    if (json.host != null) {
      builder.host(json.host);
    }
    if (json.port != null) {
      builder.port(json.port);
    }
    if (json.username != null) {
      builder.username(json.username);
    }
    if (json.password != null) {
      builder.password(json.password);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link HttpProxyConfig} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable HttpProxyConfig instance
   */
  public static ImmutableHttpProxyConfig copyOf(HttpProxyConfig instance) {
    if (instance instanceof ImmutableHttpProxyConfig) {
      return (ImmutableHttpProxyConfig) instance;
    }
    return ImmutableHttpProxyConfig.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableHttpProxyConfig ImmutableHttpProxyConfig}.
   * @return A new ImmutableHttpProxyConfig builder
   */
  public static ImmutableHttpProxyConfig.Builder builder() {
    return new ImmutableHttpProxyConfig.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableHttpProxyConfig ImmutableHttpProxyConfig}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private @Nullable String host;
    private @Nullable Integer port;
    private @Nullable String username;
    private @Nullable String password;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code HttpProxyConfig} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(HttpProxyConfig instance) {
      Preconditions.checkNotNull(instance, "instance");
      host(instance.host());
      @Nullable Integer portValue = instance.port();
      if (portValue != null) {
        port(portValue);
      }
      username(instance.username());
      password(instance.password());
      return this;
    }

    /**
     * Initializes the value for the {@link HttpProxyConfig#host() host} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link HttpProxyConfig#host() host}.</em>
     * @param host The value for host 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder host(String host) {
      this.host = Preconditions.checkNotNull(host, "host");
      return this;
    }

    /**
     * Initializes the value for the {@link HttpProxyConfig#port() port} attribute.
     * @param port The value for port (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder port(@Nullable Integer port) {
      this.port = port;
      return this;
    }

    /**
     * Initializes the value for the {@link HttpProxyConfig#username() username} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link HttpProxyConfig#username() username}.</em>
     * @param username The value for username 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder username(String username) {
      this.username = Preconditions.checkNotNull(username, "username");
      return this;
    }

    /**
     * Initializes the value for the {@link HttpProxyConfig#password() password} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link HttpProxyConfig#password() password}.</em>
     * @param password The value for password 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder password(String password) {
      this.password = Preconditions.checkNotNull(password, "password");
      return this;
    }

    /**
     * Builds a new {@link ImmutableHttpProxyConfig ImmutableHttpProxyConfig}.
     * @return An immutable instance of HttpProxyConfig
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableHttpProxyConfig build() {
      return new ImmutableHttpProxyConfig(this);
    }
  }
}
