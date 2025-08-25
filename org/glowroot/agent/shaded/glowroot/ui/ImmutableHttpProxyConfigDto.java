package org.glowroot.agent.shaded.glowroot.ui;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Objects;
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
 * Immutable implementation of {@link AdminJsonService.HttpProxyConfigDto}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableHttpProxyConfigDto.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "AdminJsonService.HttpProxyConfigDto"})
@Immutable
final class ImmutableHttpProxyConfigDto extends AdminJsonService.HttpProxyConfigDto {
  private final String host;
  private final @Nullable Integer port;
  private final String username;
  private final boolean passwordExists;
  private final String newPassword;
  private final @Nullable String testUrl;
  private final String version;

  private ImmutableHttpProxyConfigDto(ImmutableHttpProxyConfigDto.Builder builder) {
    this.host = builder.host;
    this.port = builder.port;
    this.username = builder.username;
    this.passwordExists = builder.passwordExists;
    this.testUrl = builder.testUrl;
    this.version = builder.version;
    this.newPassword = builder.newPassword != null
        ? builder.newPassword
        : Preconditions.checkNotNull(super.newPassword(), "newPassword");
  }

  private ImmutableHttpProxyConfigDto(
      String host,
      @Nullable Integer port,
      String username,
      boolean passwordExists,
      String newPassword,
      @Nullable String testUrl,
      String version) {
    this.host = host;
    this.port = port;
    this.username = username;
    this.passwordExists = passwordExists;
    this.newPassword = newPassword;
    this.testUrl = testUrl;
    this.version = version;
  }

  /**
   * @return The value of the {@code host} attribute
   */
  @JsonProperty("host")
  @Override
  String host() {
    return host;
  }

  /**
   * @return The value of the {@code port} attribute
   */
  @JsonProperty("port")
  @Override
  @Nullable Integer port() {
    return port;
  }

  /**
   * @return The value of the {@code username} attribute
   */
  @JsonProperty("username")
  @Override
  String username() {
    return username;
  }

  /**
   * @return The value of the {@code passwordExists} attribute
   */
  @JsonProperty("passwordExists")
  @Override
  boolean passwordExists() {
    return passwordExists;
  }

  /**
   * @return The value of the {@code newPassword} attribute
   */
  @JsonProperty("newPassword")
  @Override
  String newPassword() {
    return newPassword;
  }

  /**
   * @return The value of the {@code testUrl} attribute
   */
  @JsonProperty("testUrl")
  @Override
  @Nullable String testUrl() {
    return testUrl;
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
   * Copy the current immutable object by setting a value for the {@link AdminJsonService.HttpProxyConfigDto#host() host} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for host
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableHttpProxyConfigDto withHost(String value) {
    if (this.host.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "host");
    return new ImmutableHttpProxyConfigDto(
        newValue,
        this.port,
        this.username,
        this.passwordExists,
        this.newPassword,
        this.testUrl,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AdminJsonService.HttpProxyConfigDto#port() port} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for port (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableHttpProxyConfigDto withPort(@Nullable Integer value) {
    if (Objects.equal(this.port, value)) return this;
    return new ImmutableHttpProxyConfigDto(
        this.host,
        value,
        this.username,
        this.passwordExists,
        this.newPassword,
        this.testUrl,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AdminJsonService.HttpProxyConfigDto#username() username} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for username
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableHttpProxyConfigDto withUsername(String value) {
    if (this.username.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "username");
    return new ImmutableHttpProxyConfigDto(
        this.host,
        this.port,
        newValue,
        this.passwordExists,
        this.newPassword,
        this.testUrl,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AdminJsonService.HttpProxyConfigDto#passwordExists() passwordExists} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for passwordExists
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableHttpProxyConfigDto withPasswordExists(boolean value) {
    if (this.passwordExists == value) return this;
    return new ImmutableHttpProxyConfigDto(this.host, this.port, this.username, value, this.newPassword, this.testUrl, this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AdminJsonService.HttpProxyConfigDto#newPassword() newPassword} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for newPassword
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableHttpProxyConfigDto withNewPassword(String value) {
    if (this.newPassword.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "newPassword");
    return new ImmutableHttpProxyConfigDto(this.host, this.port, this.username, this.passwordExists, newValue, this.testUrl, this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AdminJsonService.HttpProxyConfigDto#testUrl() testUrl} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for testUrl (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableHttpProxyConfigDto withTestUrl(@Nullable String value) {
    if (Objects.equal(this.testUrl, value)) return this;
    return new ImmutableHttpProxyConfigDto(this.host, this.port, this.username, this.passwordExists, this.newPassword, value, this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AdminJsonService.HttpProxyConfigDto#version() version} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for version
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableHttpProxyConfigDto withVersion(String value) {
    if (this.version.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "version");
    return new ImmutableHttpProxyConfigDto(
        this.host,
        this.port,
        this.username,
        this.passwordExists,
        this.newPassword,
        this.testUrl,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableHttpProxyConfigDto} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableHttpProxyConfigDto
        && equalTo((ImmutableHttpProxyConfigDto) another);
  }

  private boolean equalTo(ImmutableHttpProxyConfigDto another) {
    return host.equals(another.host)
        && Objects.equal(port, another.port)
        && username.equals(another.username)
        && passwordExists == another.passwordExists
        && newPassword.equals(another.newPassword)
        && Objects.equal(testUrl, another.testUrl)
        && version.equals(another.version);
  }

  /**
   * Computes a hash code from attributes: {@code host}, {@code port}, {@code username}, {@code passwordExists}, {@code newPassword}, {@code testUrl}, {@code version}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + host.hashCode();
    h += (h << 5) + Objects.hashCode(port);
    h += (h << 5) + username.hashCode();
    h += (h << 5) + Booleans.hashCode(passwordExists);
    h += (h << 5) + newPassword.hashCode();
    h += (h << 5) + Objects.hashCode(testUrl);
    h += (h << 5) + version.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code HttpProxyConfigDto} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("HttpProxyConfigDto")
        .omitNullValues()
        .add("host", host)
        .add("port", port)
        .add("username", username)
        .add("passwordExists", passwordExists)
        .add("newPassword", newPassword)
        .add("testUrl", testUrl)
        .add("version", version)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends AdminJsonService.HttpProxyConfigDto {
    @Nullable String host;
    @Nullable Integer port;
    @Nullable String username;
    boolean passwordExists;
    boolean passwordExistsIsSet;
    @Nullable String newPassword;
    @Nullable String testUrl;
    @Nullable String version;
    @JsonProperty("host")
    public void setHost(String host) {
      this.host = host;
    }
    @JsonProperty("port")
    public void setPort(@Nullable Integer port) {
      this.port = port;
    }
    @JsonProperty("username")
    public void setUsername(String username) {
      this.username = username;
    }
    @JsonProperty("passwordExists")
    public void setPasswordExists(boolean passwordExists) {
      this.passwordExists = passwordExists;
      this.passwordExistsIsSet = true;
    }
    @JsonProperty("newPassword")
    public void setNewPassword(String newPassword) {
      this.newPassword = newPassword;
    }
    @JsonProperty("testUrl")
    public void setTestUrl(@Nullable String testUrl) {
      this.testUrl = testUrl;
    }
    @JsonProperty("version")
    public void setVersion(String version) {
      this.version = version;
    }
    @Override
    String host() { throw new UnsupportedOperationException(); }
    @Override
    Integer port() { throw new UnsupportedOperationException(); }
    @Override
    String username() { throw new UnsupportedOperationException(); }
    @Override
    boolean passwordExists() { throw new UnsupportedOperationException(); }
    @Override
    String newPassword() { throw new UnsupportedOperationException(); }
    @Override
    String testUrl() { throw new UnsupportedOperationException(); }
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
  static ImmutableHttpProxyConfigDto fromJson(Json json) {
    ImmutableHttpProxyConfigDto.Builder builder = ImmutableHttpProxyConfigDto.builder();
    if (json.host != null) {
      builder.host(json.host);
    }
    if (json.port != null) {
      builder.port(json.port);
    }
    if (json.username != null) {
      builder.username(json.username);
    }
    if (json.passwordExistsIsSet) {
      builder.passwordExists(json.passwordExists);
    }
    if (json.newPassword != null) {
      builder.newPassword(json.newPassword);
    }
    if (json.testUrl != null) {
      builder.testUrl(json.testUrl);
    }
    if (json.version != null) {
      builder.version(json.version);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link AdminJsonService.HttpProxyConfigDto} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable HttpProxyConfigDto instance
   */
  public static ImmutableHttpProxyConfigDto copyOf(AdminJsonService.HttpProxyConfigDto instance) {
    if (instance instanceof ImmutableHttpProxyConfigDto) {
      return (ImmutableHttpProxyConfigDto) instance;
    }
    return ImmutableHttpProxyConfigDto.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableHttpProxyConfigDto ImmutableHttpProxyConfigDto}.
   * @return A new ImmutableHttpProxyConfigDto builder
   */
  public static ImmutableHttpProxyConfigDto.Builder builder() {
    return new ImmutableHttpProxyConfigDto.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableHttpProxyConfigDto ImmutableHttpProxyConfigDto}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_HOST = 0x1L;
    private static final long INIT_BIT_USERNAME = 0x2L;
    private static final long INIT_BIT_PASSWORD_EXISTS = 0x4L;
    private static final long INIT_BIT_VERSION = 0x8L;
    private long initBits = 0xfL;

    private @Nullable String host;
    private @Nullable Integer port;
    private @Nullable String username;
    private boolean passwordExists;
    private @Nullable String newPassword;
    private @Nullable String testUrl;
    private @Nullable String version;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code HttpProxyConfigDto} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(AdminJsonService.HttpProxyConfigDto instance) {
      Preconditions.checkNotNull(instance, "instance");
      host(instance.host());
      @Nullable Integer portValue = instance.port();
      if (portValue != null) {
        port(portValue);
      }
      username(instance.username());
      passwordExists(instance.passwordExists());
      newPassword(instance.newPassword());
      @Nullable String testUrlValue = instance.testUrl();
      if (testUrlValue != null) {
        testUrl(testUrlValue);
      }
      version(instance.version());
      return this;
    }

    /**
     * Initializes the value for the {@link AdminJsonService.HttpProxyConfigDto#host() host} attribute.
     * @param host The value for host 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder host(String host) {
      this.host = Preconditions.checkNotNull(host, "host");
      initBits &= ~INIT_BIT_HOST;
      return this;
    }

    /**
     * Initializes the value for the {@link AdminJsonService.HttpProxyConfigDto#port() port} attribute.
     * @param port The value for port (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder port(@Nullable Integer port) {
      this.port = port;
      return this;
    }

    /**
     * Initializes the value for the {@link AdminJsonService.HttpProxyConfigDto#username() username} attribute.
     * @param username The value for username 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder username(String username) {
      this.username = Preconditions.checkNotNull(username, "username");
      initBits &= ~INIT_BIT_USERNAME;
      return this;
    }

    /**
     * Initializes the value for the {@link AdminJsonService.HttpProxyConfigDto#passwordExists() passwordExists} attribute.
     * @param passwordExists The value for passwordExists 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder passwordExists(boolean passwordExists) {
      this.passwordExists = passwordExists;
      initBits &= ~INIT_BIT_PASSWORD_EXISTS;
      return this;
    }

    /**
     * Initializes the value for the {@link AdminJsonService.HttpProxyConfigDto#newPassword() newPassword} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link AdminJsonService.HttpProxyConfigDto#newPassword() newPassword}.</em>
     * @param newPassword The value for newPassword 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder newPassword(String newPassword) {
      this.newPassword = Preconditions.checkNotNull(newPassword, "newPassword");
      return this;
    }

    /**
     * Initializes the value for the {@link AdminJsonService.HttpProxyConfigDto#testUrl() testUrl} attribute.
     * @param testUrl The value for testUrl (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder testUrl(@Nullable String testUrl) {
      this.testUrl = testUrl;
      return this;
    }

    /**
     * Initializes the value for the {@link AdminJsonService.HttpProxyConfigDto#version() version} attribute.
     * @param version The value for version 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder version(String version) {
      this.version = Preconditions.checkNotNull(version, "version");
      initBits &= ~INIT_BIT_VERSION;
      return this;
    }

    /**
     * Builds a new {@link ImmutableHttpProxyConfigDto ImmutableHttpProxyConfigDto}.
     * @return An immutable instance of HttpProxyConfigDto
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableHttpProxyConfigDto build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableHttpProxyConfigDto(this);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_HOST) != 0) attributes.add("host");
      if ((initBits & INIT_BIT_USERNAME) != 0) attributes.add("username");
      if ((initBits & INIT_BIT_PASSWORD_EXISTS) != 0) attributes.add("passwordExists");
      if ((initBits & INIT_BIT_VERSION) != 0) attributes.add("version");
      return "Cannot build HttpProxyConfigDto, some of required attributes are not set " + attributes;
    }
  }
}
