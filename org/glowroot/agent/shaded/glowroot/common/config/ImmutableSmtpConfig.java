package org.glowroot.agent.shaded.glowroot.common.config;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonIgnore;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonInclude;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Objects;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import org.glowroot.agent.shaded.google.common.collect.ImmutableMap;
import org.glowroot.agent.shaded.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Map;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link SmtpConfig}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSmtpConfig.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "SmtpConfig"})
@Immutable
public final class ImmutableSmtpConfig extends SmtpConfig {
  private final String host;
  private final @Nullable Integer port;
  private final @Nullable SmtpConfig.ConnectionSecurity connectionSecurity;
  private final String username;
  private final String password;
  private final ImmutableMap<String, String> additionalProperties;
  private final String fromEmailAddress;
  private final String fromDisplayName;
  private final String version;

  private ImmutableSmtpConfig(ImmutableSmtpConfig.Builder builder) {
    this.port = builder.port;
    this.connectionSecurity = builder.connectionSecurity;
    this.additionalProperties = builder.additionalProperties.build();
    if (builder.host != null) {
      initShim.host(builder.host);
    }
    if (builder.username != null) {
      initShim.username(builder.username);
    }
    if (builder.password != null) {
      initShim.password(builder.password);
    }
    if (builder.fromEmailAddress != null) {
      initShim.fromEmailAddress(builder.fromEmailAddress);
    }
    if (builder.fromDisplayName != null) {
      initShim.fromDisplayName(builder.fromDisplayName);
    }
    this.host = initShim.host();
    this.username = initShim.username();
    this.password = initShim.password();
    this.fromEmailAddress = initShim.fromEmailAddress();
    this.fromDisplayName = initShim.fromDisplayName();
    this.version = initShim.version();
    this.initShim = null;
  }

  private ImmutableSmtpConfig(
      String host,
      @Nullable Integer port,
      @Nullable SmtpConfig.ConnectionSecurity connectionSecurity,
      String username,
      String password,
      ImmutableMap<String, String> additionalProperties,
      String fromEmailAddress,
      String fromDisplayName) {
    this.host = host;
    this.port = port;
    this.connectionSecurity = connectionSecurity;
    this.username = username;
    this.password = password;
    this.additionalProperties = additionalProperties;
    this.fromEmailAddress = fromEmailAddress;
    this.fromDisplayName = fromDisplayName;
    initShim.host(this.host);
    initShim.username(this.username);
    initShim.password(this.password);
    initShim.fromEmailAddress(this.fromEmailAddress);
    initShim.fromDisplayName(this.fromDisplayName);
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
        this.host = Preconditions.checkNotNull(ImmutableSmtpConfig.super.host(), "host");
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
        this.username = Preconditions.checkNotNull(ImmutableSmtpConfig.super.username(), "username");
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
        this.password = Preconditions.checkNotNull(ImmutableSmtpConfig.super.password(), "password");
        passwordBuildStage = STAGE_INITIALIZED;
      }
      return this.password;
    }

    void password(String password) {
      this.password = password;
      passwordBuildStage = STAGE_INITIALIZED;
    }
    private String fromEmailAddress;
    private int fromEmailAddressBuildStage;

    String fromEmailAddress() {
      if (fromEmailAddressBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (fromEmailAddressBuildStage == STAGE_UNINITIALIZED) {
        fromEmailAddressBuildStage = STAGE_INITIALIZING;
        this.fromEmailAddress = Preconditions.checkNotNull(ImmutableSmtpConfig.super.fromEmailAddress(), "fromEmailAddress");
        fromEmailAddressBuildStage = STAGE_INITIALIZED;
      }
      return this.fromEmailAddress;
    }

    void fromEmailAddress(String fromEmailAddress) {
      this.fromEmailAddress = fromEmailAddress;
      fromEmailAddressBuildStage = STAGE_INITIALIZED;
    }
    private String fromDisplayName;
    private int fromDisplayNameBuildStage;

    String fromDisplayName() {
      if (fromDisplayNameBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (fromDisplayNameBuildStage == STAGE_UNINITIALIZED) {
        fromDisplayNameBuildStage = STAGE_INITIALIZING;
        this.fromDisplayName = Preconditions.checkNotNull(ImmutableSmtpConfig.super.fromDisplayName(), "fromDisplayName");
        fromDisplayNameBuildStage = STAGE_INITIALIZED;
      }
      return this.fromDisplayName;
    }

    void fromDisplayName(String fromDisplayName) {
      this.fromDisplayName = fromDisplayName;
      fromDisplayNameBuildStage = STAGE_INITIALIZED;
    }
    private String version;
    private int versionBuildStage;

    String version() {
      if (versionBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (versionBuildStage == STAGE_UNINITIALIZED) {
        versionBuildStage = STAGE_INITIALIZING;
        this.version = Preconditions.checkNotNull(ImmutableSmtpConfig.super.version(), "version");
        versionBuildStage = STAGE_INITIALIZED;
      }
      return this.version;
    }

    private String formatInitCycleMessage() {
      ArrayList<String> attributes = Lists.newArrayList();
      if (hostBuildStage == STAGE_INITIALIZING) attributes.add("host");
      if (usernameBuildStage == STAGE_INITIALIZING) attributes.add("username");
      if (passwordBuildStage == STAGE_INITIALIZING) attributes.add("password");
      if (fromEmailAddressBuildStage == STAGE_INITIALIZING) attributes.add("fromEmailAddress");
      if (fromDisplayNameBuildStage == STAGE_INITIALIZING) attributes.add("fromDisplayName");
      if (versionBuildStage == STAGE_INITIALIZING) attributes.add("version");
      return "Cannot build SmtpConfig, attribute initializers form cycle" + attributes;
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
   * @return The value of the {@code connectionSecurity} attribute
   */
  @JsonProperty("connectionSecurity")
  @JsonInclude(JsonInclude.Include.NON_NULL)
  @Override
  public @Nullable SmtpConfig.ConnectionSecurity connectionSecurity() {
    return connectionSecurity;
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
   * @return The value of the {@code additionalProperties} attribute
   */
  @JsonProperty("additionalProperties")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @Override
  public ImmutableMap<String, String> additionalProperties() {
    return additionalProperties;
  }

  /**
   * @return The value of the {@code fromEmailAddress} attribute
   */
  @JsonProperty("fromEmailAddress")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @Override
  public String fromEmailAddress() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.fromEmailAddress()
        : this.fromEmailAddress;
  }

  /**
   * @return The value of the {@code fromDisplayName} attribute
   */
  @JsonProperty("fromDisplayName")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @Override
  public String fromDisplayName() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.fromDisplayName()
        : this.fromDisplayName;
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
   * Copy the current immutable object by setting a value for the {@link SmtpConfig#host() host} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for host
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSmtpConfig withHost(String value) {
    if (this.host.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "host");
    return new ImmutableSmtpConfig(
        newValue,
        this.port,
        this.connectionSecurity,
        this.username,
        this.password,
        this.additionalProperties,
        this.fromEmailAddress,
        this.fromDisplayName);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SmtpConfig#port() port} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for port (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSmtpConfig withPort(@Nullable Integer value) {
    if (Objects.equal(this.port, value)) return this;
    return new ImmutableSmtpConfig(
        this.host,
        value,
        this.connectionSecurity,
        this.username,
        this.password,
        this.additionalProperties,
        this.fromEmailAddress,
        this.fromDisplayName);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SmtpConfig#connectionSecurity() connectionSecurity} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for connectionSecurity (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSmtpConfig withConnectionSecurity(@Nullable SmtpConfig.ConnectionSecurity value) {
    if (this.connectionSecurity == value) return this;
    return new ImmutableSmtpConfig(
        this.host,
        this.port,
        value,
        this.username,
        this.password,
        this.additionalProperties,
        this.fromEmailAddress,
        this.fromDisplayName);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SmtpConfig#username() username} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for username
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSmtpConfig withUsername(String value) {
    if (this.username.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "username");
    return new ImmutableSmtpConfig(
        this.host,
        this.port,
        this.connectionSecurity,
        newValue,
        this.password,
        this.additionalProperties,
        this.fromEmailAddress,
        this.fromDisplayName);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SmtpConfig#password() password} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for password
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSmtpConfig withPassword(String value) {
    if (this.password.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "password");
    return new ImmutableSmtpConfig(
        this.host,
        this.port,
        this.connectionSecurity,
        this.username,
        newValue,
        this.additionalProperties,
        this.fromEmailAddress,
        this.fromDisplayName);
  }

  /**
   * Copy the current immutable object by replacing the {@link SmtpConfig#additionalProperties() additionalProperties} map with the specified map.
   * Nulls are not permitted as keys or values.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param entries The entries to be added to the additionalProperties map
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSmtpConfig withAdditionalProperties(Map<String, ? extends String> entries) {
    if (this.additionalProperties == entries) return this;
    ImmutableMap<String, String> newValue = ImmutableMap.copyOf(entries);
    return new ImmutableSmtpConfig(
        this.host,
        this.port,
        this.connectionSecurity,
        this.username,
        this.password,
        newValue,
        this.fromEmailAddress,
        this.fromDisplayName);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SmtpConfig#fromEmailAddress() fromEmailAddress} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for fromEmailAddress
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSmtpConfig withFromEmailAddress(String value) {
    if (this.fromEmailAddress.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "fromEmailAddress");
    return new ImmutableSmtpConfig(
        this.host,
        this.port,
        this.connectionSecurity,
        this.username,
        this.password,
        this.additionalProperties,
        newValue,
        this.fromDisplayName);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SmtpConfig#fromDisplayName() fromDisplayName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for fromDisplayName
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSmtpConfig withFromDisplayName(String value) {
    if (this.fromDisplayName.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "fromDisplayName");
    return new ImmutableSmtpConfig(
        this.host,
        this.port,
        this.connectionSecurity,
        this.username,
        this.password,
        this.additionalProperties,
        this.fromEmailAddress,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSmtpConfig} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSmtpConfig
        && equalTo((ImmutableSmtpConfig) another);
  }

  private boolean equalTo(ImmutableSmtpConfig another) {
    return host.equals(another.host)
        && Objects.equal(port, another.port)
        && Objects.equal(connectionSecurity, another.connectionSecurity)
        && username.equals(another.username)
        && password.equals(another.password)
        && additionalProperties.equals(another.additionalProperties)
        && fromEmailAddress.equals(another.fromEmailAddress)
        && fromDisplayName.equals(another.fromDisplayName)
        && version.equals(another.version);
  }

  /**
   * Computes a hash code from attributes: {@code host}, {@code port}, {@code connectionSecurity}, {@code username}, {@code password}, {@code additionalProperties}, {@code fromEmailAddress}, {@code fromDisplayName}, {@code version}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + host.hashCode();
    h += (h << 5) + Objects.hashCode(port);
    h += (h << 5) + Objects.hashCode(connectionSecurity);
    h += (h << 5) + username.hashCode();
    h += (h << 5) + password.hashCode();
    h += (h << 5) + additionalProperties.hashCode();
    h += (h << 5) + fromEmailAddress.hashCode();
    h += (h << 5) + fromDisplayName.hashCode();
    h += (h << 5) + version.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code SmtpConfig} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("SmtpConfig")
        .omitNullValues()
        .add("host", host)
        .add("port", port)
        .add("connectionSecurity", connectionSecurity)
        .add("username", username)
        .add("password", password)
        .add("additionalProperties", additionalProperties)
        .add("fromEmailAddress", fromEmailAddress)
        .add("fromDisplayName", fromDisplayName)
        .add("version", version)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends SmtpConfig {
    @Nullable String host;
    @Nullable Integer port;
    @Nullable SmtpConfig.ConnectionSecurity connectionSecurity;
    @Nullable String username;
    @Nullable String password;
    @Nullable Map<String, String> additionalProperties;
    @Nullable String fromEmailAddress;
    @Nullable String fromDisplayName;
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
    @JsonProperty("connectionSecurity")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public void setConnectionSecurity(@Nullable SmtpConfig.ConnectionSecurity connectionSecurity) {
      this.connectionSecurity = connectionSecurity;
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
    @JsonProperty("additionalProperties")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public void setAdditionalProperties(Map<String, String> additionalProperties) {
      this.additionalProperties = additionalProperties;
    }
    @JsonProperty("fromEmailAddress")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public void setFromEmailAddress(String fromEmailAddress) {
      this.fromEmailAddress = fromEmailAddress;
    }
    @JsonProperty("fromDisplayName")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public void setFromDisplayName(String fromDisplayName) {
      this.fromDisplayName = fromDisplayName;
    }
    @Override
    public String host() { throw new UnsupportedOperationException(); }
    @Override
    public Integer port() { throw new UnsupportedOperationException(); }
    @Override
    public SmtpConfig.ConnectionSecurity connectionSecurity() { throw new UnsupportedOperationException(); }
    @Override
    public String username() { throw new UnsupportedOperationException(); }
    @Override
    public String password() { throw new UnsupportedOperationException(); }
    @Override
    public Map<String, String> additionalProperties() { throw new UnsupportedOperationException(); }
    @Override
    public String fromEmailAddress() { throw new UnsupportedOperationException(); }
    @Override
    public String fromDisplayName() { throw new UnsupportedOperationException(); }
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
  static ImmutableSmtpConfig fromJson(Json json) {
    ImmutableSmtpConfig.Builder builder = ImmutableSmtpConfig.builder();
    if (json.host != null) {
      builder.host(json.host);
    }
    if (json.port != null) {
      builder.port(json.port);
    }
    if (json.connectionSecurity != null) {
      builder.connectionSecurity(json.connectionSecurity);
    }
    if (json.username != null) {
      builder.username(json.username);
    }
    if (json.password != null) {
      builder.password(json.password);
    }
    if (json.additionalProperties != null) {
      builder.putAllAdditionalProperties(json.additionalProperties);
    }
    if (json.fromEmailAddress != null) {
      builder.fromEmailAddress(json.fromEmailAddress);
    }
    if (json.fromDisplayName != null) {
      builder.fromDisplayName(json.fromDisplayName);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SmtpConfig} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SmtpConfig instance
   */
  public static ImmutableSmtpConfig copyOf(SmtpConfig instance) {
    if (instance instanceof ImmutableSmtpConfig) {
      return (ImmutableSmtpConfig) instance;
    }
    return ImmutableSmtpConfig.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableSmtpConfig ImmutableSmtpConfig}.
   * @return A new ImmutableSmtpConfig builder
   */
  public static ImmutableSmtpConfig.Builder builder() {
    return new ImmutableSmtpConfig.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableSmtpConfig ImmutableSmtpConfig}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private @Nullable String host;
    private @Nullable Integer port;
    private @Nullable SmtpConfig.ConnectionSecurity connectionSecurity;
    private @Nullable String username;
    private @Nullable String password;
    private ImmutableMap.Builder<String, String> additionalProperties = ImmutableMap.builder();
    private @Nullable String fromEmailAddress;
    private @Nullable String fromDisplayName;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code SmtpConfig} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(SmtpConfig instance) {
      Preconditions.checkNotNull(instance, "instance");
      host(instance.host());
      @Nullable Integer portValue = instance.port();
      if (portValue != null) {
        port(portValue);
      }
      @Nullable SmtpConfig.ConnectionSecurity connectionSecurityValue = instance.connectionSecurity();
      if (connectionSecurityValue != null) {
        connectionSecurity(connectionSecurityValue);
      }
      username(instance.username());
      password(instance.password());
      putAllAdditionalProperties(instance.additionalProperties());
      fromEmailAddress(instance.fromEmailAddress());
      fromDisplayName(instance.fromDisplayName());
      return this;
    }

    /**
     * Initializes the value for the {@link SmtpConfig#host() host} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link SmtpConfig#host() host}.</em>
     * @param host The value for host 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder host(String host) {
      this.host = Preconditions.checkNotNull(host, "host");
      return this;
    }

    /**
     * Initializes the value for the {@link SmtpConfig#port() port} attribute.
     * @param port The value for port (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder port(@Nullable Integer port) {
      this.port = port;
      return this;
    }

    /**
     * Initializes the value for the {@link SmtpConfig#connectionSecurity() connectionSecurity} attribute.
     * @param connectionSecurity The value for connectionSecurity (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder connectionSecurity(@Nullable SmtpConfig.ConnectionSecurity connectionSecurity) {
      this.connectionSecurity = connectionSecurity;
      return this;
    }

    /**
     * Initializes the value for the {@link SmtpConfig#username() username} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link SmtpConfig#username() username}.</em>
     * @param username The value for username 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder username(String username) {
      this.username = Preconditions.checkNotNull(username, "username");
      return this;
    }

    /**
     * Initializes the value for the {@link SmtpConfig#password() password} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link SmtpConfig#password() password}.</em>
     * @param password The value for password 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder password(String password) {
      this.password = Preconditions.checkNotNull(password, "password");
      return this;
    }

    /**
     * Put one entry to the {@link SmtpConfig#additionalProperties() additionalProperties} map.
     * @param key The key in the additionalProperties map
     * @param value The associated value in the additionalProperties map
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder putAdditionalProperties(String key, String value) {
      this.additionalProperties.put(key, value);
      return this;
    }

    /**
     * Put one entry to the {@link SmtpConfig#additionalProperties() additionalProperties} map. Nulls are not permitted
     * @param entry The key and value entry
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder putAdditionalProperties(Map.Entry<String, ? extends String> entry) {
      this.additionalProperties.put(entry);
      return this;
    }

    /**
     * Sets or replaces all mappings from the specified map as entries for the {@link SmtpConfig#additionalProperties() additionalProperties} map. Nulls are not permitted
     * @param additionalProperties The entries that will be added to the additionalProperties map
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder additionalProperties(Map<String, ? extends String> additionalProperties) {
      this.additionalProperties = ImmutableMap.builder();
      return putAllAdditionalProperties(additionalProperties);
    }

    /**
     * Put all mappings from the specified map as entries to {@link SmtpConfig#additionalProperties() additionalProperties} map. Nulls are not permitted
     * @param additionalProperties The entries that will be added to the additionalProperties map
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder putAllAdditionalProperties(Map<String, ? extends String> additionalProperties) {
      this.additionalProperties.putAll(additionalProperties);
      return this;
    }

    /**
     * Initializes the value for the {@link SmtpConfig#fromEmailAddress() fromEmailAddress} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link SmtpConfig#fromEmailAddress() fromEmailAddress}.</em>
     * @param fromEmailAddress The value for fromEmailAddress 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder fromEmailAddress(String fromEmailAddress) {
      this.fromEmailAddress = Preconditions.checkNotNull(fromEmailAddress, "fromEmailAddress");
      return this;
    }

    /**
     * Initializes the value for the {@link SmtpConfig#fromDisplayName() fromDisplayName} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link SmtpConfig#fromDisplayName() fromDisplayName}.</em>
     * @param fromDisplayName The value for fromDisplayName 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder fromDisplayName(String fromDisplayName) {
      this.fromDisplayName = Preconditions.checkNotNull(fromDisplayName, "fromDisplayName");
      return this;
    }

    /**
     * Builds a new {@link ImmutableSmtpConfig ImmutableSmtpConfig}.
     * @return An immutable instance of SmtpConfig
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableSmtpConfig build() {
      return new ImmutableSmtpConfig(this);
    }
  }
}
