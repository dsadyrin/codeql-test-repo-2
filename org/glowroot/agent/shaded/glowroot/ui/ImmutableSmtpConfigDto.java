package org.glowroot.agent.shaded.glowroot.ui;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Objects;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import org.glowroot.agent.shaded.google.common.collect.ImmutableMap;
import org.glowroot.agent.shaded.google.common.collect.Lists;
import org.glowroot.agent.shaded.google.common.primitives.Booleans;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.glowroot.agent.shaded.glowroot.common.config.SmtpConfig;

/**
 * Immutable implementation of {@link AdminJsonService.SmtpConfigDto}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSmtpConfigDto.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "AdminJsonService.SmtpConfigDto"})
@Immutable
final class ImmutableSmtpConfigDto extends AdminJsonService.SmtpConfigDto {
  private final String host;
  private final @Nullable Integer port;
  private final @Nullable SmtpConfig.ConnectionSecurity connectionSecurity;
  private final String username;
  private final boolean passwordExists;
  private final String newPassword;
  private final ImmutableMap<String, String> additionalProperties;
  private final String fromEmailAddress;
  private final String fromDisplayName;
  private final @Nullable String testEmailRecipient;
  private final String version;

  private ImmutableSmtpConfigDto(ImmutableSmtpConfigDto.Builder builder) {
    this.host = builder.host;
    this.port = builder.port;
    this.connectionSecurity = builder.connectionSecurity;
    this.username = builder.username;
    this.passwordExists = builder.passwordExists;
    this.additionalProperties = builder.additionalProperties.build();
    this.fromEmailAddress = builder.fromEmailAddress;
    this.fromDisplayName = builder.fromDisplayName;
    this.testEmailRecipient = builder.testEmailRecipient;
    this.version = builder.version;
    this.newPassword = builder.newPassword != null
        ? builder.newPassword
        : Preconditions.checkNotNull(super.newPassword(), "newPassword");
  }

  private ImmutableSmtpConfigDto(
      String host,
      @Nullable Integer port,
      @Nullable SmtpConfig.ConnectionSecurity connectionSecurity,
      String username,
      boolean passwordExists,
      String newPassword,
      ImmutableMap<String, String> additionalProperties,
      String fromEmailAddress,
      String fromDisplayName,
      @Nullable String testEmailRecipient,
      String version) {
    this.host = host;
    this.port = port;
    this.connectionSecurity = connectionSecurity;
    this.username = username;
    this.passwordExists = passwordExists;
    this.newPassword = newPassword;
    this.additionalProperties = additionalProperties;
    this.fromEmailAddress = fromEmailAddress;
    this.fromDisplayName = fromDisplayName;
    this.testEmailRecipient = testEmailRecipient;
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
   * @return The value of the {@code connectionSecurity} attribute
   */
  @JsonProperty("connectionSecurity")
  @Override
  @Nullable SmtpConfig.ConnectionSecurity connectionSecurity() {
    return connectionSecurity;
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
   * @return The value of the {@code additionalProperties} attribute
   */
  @JsonProperty("additionalProperties")
  @Override
  ImmutableMap<String, String> additionalProperties() {
    return additionalProperties;
  }

  /**
   * @return The value of the {@code fromEmailAddress} attribute
   */
  @JsonProperty("fromEmailAddress")
  @Override
  String fromEmailAddress() {
    return fromEmailAddress;
  }

  /**
   * @return The value of the {@code fromDisplayName} attribute
   */
  @JsonProperty("fromDisplayName")
  @Override
  String fromDisplayName() {
    return fromDisplayName;
  }

  /**
   * @return The value of the {@code testEmailRecipient} attribute
   */
  @JsonProperty("testEmailRecipient")
  @Override
  @Nullable String testEmailRecipient() {
    return testEmailRecipient;
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
   * Copy the current immutable object by setting a value for the {@link AdminJsonService.SmtpConfigDto#host() host} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for host
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSmtpConfigDto withHost(String value) {
    if (this.host.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "host");
    return new ImmutableSmtpConfigDto(
        newValue,
        this.port,
        this.connectionSecurity,
        this.username,
        this.passwordExists,
        this.newPassword,
        this.additionalProperties,
        this.fromEmailAddress,
        this.fromDisplayName,
        this.testEmailRecipient,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AdminJsonService.SmtpConfigDto#port() port} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for port (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSmtpConfigDto withPort(@Nullable Integer value) {
    if (Objects.equal(this.port, value)) return this;
    return new ImmutableSmtpConfigDto(
        this.host,
        value,
        this.connectionSecurity,
        this.username,
        this.passwordExists,
        this.newPassword,
        this.additionalProperties,
        this.fromEmailAddress,
        this.fromDisplayName,
        this.testEmailRecipient,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AdminJsonService.SmtpConfigDto#connectionSecurity() connectionSecurity} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for connectionSecurity (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSmtpConfigDto withConnectionSecurity(@Nullable SmtpConfig.ConnectionSecurity value) {
    if (this.connectionSecurity == value) return this;
    return new ImmutableSmtpConfigDto(
        this.host,
        this.port,
        value,
        this.username,
        this.passwordExists,
        this.newPassword,
        this.additionalProperties,
        this.fromEmailAddress,
        this.fromDisplayName,
        this.testEmailRecipient,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AdminJsonService.SmtpConfigDto#username() username} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for username
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSmtpConfigDto withUsername(String value) {
    if (this.username.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "username");
    return new ImmutableSmtpConfigDto(
        this.host,
        this.port,
        this.connectionSecurity,
        newValue,
        this.passwordExists,
        this.newPassword,
        this.additionalProperties,
        this.fromEmailAddress,
        this.fromDisplayName,
        this.testEmailRecipient,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AdminJsonService.SmtpConfigDto#passwordExists() passwordExists} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for passwordExists
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSmtpConfigDto withPasswordExists(boolean value) {
    if (this.passwordExists == value) return this;
    return new ImmutableSmtpConfigDto(
        this.host,
        this.port,
        this.connectionSecurity,
        this.username,
        value,
        this.newPassword,
        this.additionalProperties,
        this.fromEmailAddress,
        this.fromDisplayName,
        this.testEmailRecipient,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AdminJsonService.SmtpConfigDto#newPassword() newPassword} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for newPassword
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSmtpConfigDto withNewPassword(String value) {
    if (this.newPassword.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "newPassword");
    return new ImmutableSmtpConfigDto(
        this.host,
        this.port,
        this.connectionSecurity,
        this.username,
        this.passwordExists,
        newValue,
        this.additionalProperties,
        this.fromEmailAddress,
        this.fromDisplayName,
        this.testEmailRecipient,
        this.version);
  }

  /**
   * Copy the current immutable object by replacing the {@link AdminJsonService.SmtpConfigDto#additionalProperties() additionalProperties} map with the specified map.
   * Nulls are not permitted as keys or values.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param entries The entries to be added to the additionalProperties map
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSmtpConfigDto withAdditionalProperties(Map<String, ? extends String> entries) {
    if (this.additionalProperties == entries) return this;
    ImmutableMap<String, String> newValue = ImmutableMap.copyOf(entries);
    return new ImmutableSmtpConfigDto(
        this.host,
        this.port,
        this.connectionSecurity,
        this.username,
        this.passwordExists,
        this.newPassword,
        newValue,
        this.fromEmailAddress,
        this.fromDisplayName,
        this.testEmailRecipient,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AdminJsonService.SmtpConfigDto#fromEmailAddress() fromEmailAddress} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for fromEmailAddress
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSmtpConfigDto withFromEmailAddress(String value) {
    if (this.fromEmailAddress.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "fromEmailAddress");
    return new ImmutableSmtpConfigDto(
        this.host,
        this.port,
        this.connectionSecurity,
        this.username,
        this.passwordExists,
        this.newPassword,
        this.additionalProperties,
        newValue,
        this.fromDisplayName,
        this.testEmailRecipient,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AdminJsonService.SmtpConfigDto#fromDisplayName() fromDisplayName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for fromDisplayName
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSmtpConfigDto withFromDisplayName(String value) {
    if (this.fromDisplayName.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "fromDisplayName");
    return new ImmutableSmtpConfigDto(
        this.host,
        this.port,
        this.connectionSecurity,
        this.username,
        this.passwordExists,
        this.newPassword,
        this.additionalProperties,
        this.fromEmailAddress,
        newValue,
        this.testEmailRecipient,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AdminJsonService.SmtpConfigDto#testEmailRecipient() testEmailRecipient} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for testEmailRecipient (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSmtpConfigDto withTestEmailRecipient(@Nullable String value) {
    if (Objects.equal(this.testEmailRecipient, value)) return this;
    return new ImmutableSmtpConfigDto(
        this.host,
        this.port,
        this.connectionSecurity,
        this.username,
        this.passwordExists,
        this.newPassword,
        this.additionalProperties,
        this.fromEmailAddress,
        this.fromDisplayName,
        value,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AdminJsonService.SmtpConfigDto#version() version} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for version
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSmtpConfigDto withVersion(String value) {
    if (this.version.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "version");
    return new ImmutableSmtpConfigDto(
        this.host,
        this.port,
        this.connectionSecurity,
        this.username,
        this.passwordExists,
        this.newPassword,
        this.additionalProperties,
        this.fromEmailAddress,
        this.fromDisplayName,
        this.testEmailRecipient,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSmtpConfigDto} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSmtpConfigDto
        && equalTo((ImmutableSmtpConfigDto) another);
  }

  private boolean equalTo(ImmutableSmtpConfigDto another) {
    return host.equals(another.host)
        && Objects.equal(port, another.port)
        && Objects.equal(connectionSecurity, another.connectionSecurity)
        && username.equals(another.username)
        && passwordExists == another.passwordExists
        && newPassword.equals(another.newPassword)
        && additionalProperties.equals(another.additionalProperties)
        && fromEmailAddress.equals(another.fromEmailAddress)
        && fromDisplayName.equals(another.fromDisplayName)
        && Objects.equal(testEmailRecipient, another.testEmailRecipient)
        && version.equals(another.version);
  }

  /**
   * Computes a hash code from attributes: {@code host}, {@code port}, {@code connectionSecurity}, {@code username}, {@code passwordExists}, {@code newPassword}, {@code additionalProperties}, {@code fromEmailAddress}, {@code fromDisplayName}, {@code testEmailRecipient}, {@code version}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + host.hashCode();
    h += (h << 5) + Objects.hashCode(port);
    h += (h << 5) + Objects.hashCode(connectionSecurity);
    h += (h << 5) + username.hashCode();
    h += (h << 5) + Booleans.hashCode(passwordExists);
    h += (h << 5) + newPassword.hashCode();
    h += (h << 5) + additionalProperties.hashCode();
    h += (h << 5) + fromEmailAddress.hashCode();
    h += (h << 5) + fromDisplayName.hashCode();
    h += (h << 5) + Objects.hashCode(testEmailRecipient);
    h += (h << 5) + version.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code SmtpConfigDto} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("SmtpConfigDto")
        .omitNullValues()
        .add("host", host)
        .add("port", port)
        .add("connectionSecurity", connectionSecurity)
        .add("username", username)
        .add("passwordExists", passwordExists)
        .add("newPassword", newPassword)
        .add("additionalProperties", additionalProperties)
        .add("fromEmailAddress", fromEmailAddress)
        .add("fromDisplayName", fromDisplayName)
        .add("testEmailRecipient", testEmailRecipient)
        .add("version", version)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends AdminJsonService.SmtpConfigDto {
    @Nullable String host;
    @Nullable Integer port;
    @Nullable SmtpConfig.ConnectionSecurity connectionSecurity;
    @Nullable String username;
    boolean passwordExists;
    boolean passwordExistsIsSet;
    @Nullable String newPassword;
    @Nullable Map<String, String> additionalProperties;
    @Nullable String fromEmailAddress;
    @Nullable String fromDisplayName;
    @Nullable String testEmailRecipient;
    @Nullable String version;
    @JsonProperty("host")
    public void setHost(String host) {
      this.host = host;
    }
    @JsonProperty("port")
    public void setPort(@Nullable Integer port) {
      this.port = port;
    }
    @JsonProperty("connectionSecurity")
    public void setConnectionSecurity(@Nullable SmtpConfig.ConnectionSecurity connectionSecurity) {
      this.connectionSecurity = connectionSecurity;
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
    @JsonProperty("additionalProperties")
    public void setAdditionalProperties(Map<String, String> additionalProperties) {
      this.additionalProperties = additionalProperties;
    }
    @JsonProperty("fromEmailAddress")
    public void setFromEmailAddress(String fromEmailAddress) {
      this.fromEmailAddress = fromEmailAddress;
    }
    @JsonProperty("fromDisplayName")
    public void setFromDisplayName(String fromDisplayName) {
      this.fromDisplayName = fromDisplayName;
    }
    @JsonProperty("testEmailRecipient")
    public void setTestEmailRecipient(@Nullable String testEmailRecipient) {
      this.testEmailRecipient = testEmailRecipient;
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
    SmtpConfig.ConnectionSecurity connectionSecurity() { throw new UnsupportedOperationException(); }
    @Override
    String username() { throw new UnsupportedOperationException(); }
    @Override
    boolean passwordExists() { throw new UnsupportedOperationException(); }
    @Override
    String newPassword() { throw new UnsupportedOperationException(); }
    @Override
    Map<String, String> additionalProperties() { throw new UnsupportedOperationException(); }
    @Override
    String fromEmailAddress() { throw new UnsupportedOperationException(); }
    @Override
    String fromDisplayName() { throw new UnsupportedOperationException(); }
    @Override
    String testEmailRecipient() { throw new UnsupportedOperationException(); }
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
  static ImmutableSmtpConfigDto fromJson(Json json) {
    ImmutableSmtpConfigDto.Builder builder = ImmutableSmtpConfigDto.builder();
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
    if (json.passwordExistsIsSet) {
      builder.passwordExists(json.passwordExists);
    }
    if (json.newPassword != null) {
      builder.newPassword(json.newPassword);
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
    if (json.testEmailRecipient != null) {
      builder.testEmailRecipient(json.testEmailRecipient);
    }
    if (json.version != null) {
      builder.version(json.version);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link AdminJsonService.SmtpConfigDto} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SmtpConfigDto instance
   */
  public static ImmutableSmtpConfigDto copyOf(AdminJsonService.SmtpConfigDto instance) {
    if (instance instanceof ImmutableSmtpConfigDto) {
      return (ImmutableSmtpConfigDto) instance;
    }
    return ImmutableSmtpConfigDto.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableSmtpConfigDto ImmutableSmtpConfigDto}.
   * @return A new ImmutableSmtpConfigDto builder
   */
  public static ImmutableSmtpConfigDto.Builder builder() {
    return new ImmutableSmtpConfigDto.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableSmtpConfigDto ImmutableSmtpConfigDto}.
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
    private static final long INIT_BIT_FROM_EMAIL_ADDRESS = 0x8L;
    private static final long INIT_BIT_FROM_DISPLAY_NAME = 0x10L;
    private static final long INIT_BIT_VERSION = 0x20L;
    private long initBits = 0x3fL;

    private @Nullable String host;
    private @Nullable Integer port;
    private @Nullable SmtpConfig.ConnectionSecurity connectionSecurity;
    private @Nullable String username;
    private boolean passwordExists;
    private @Nullable String newPassword;
    private ImmutableMap.Builder<String, String> additionalProperties = ImmutableMap.builder();
    private @Nullable String fromEmailAddress;
    private @Nullable String fromDisplayName;
    private @Nullable String testEmailRecipient;
    private @Nullable String version;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code SmtpConfigDto} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(AdminJsonService.SmtpConfigDto instance) {
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
      passwordExists(instance.passwordExists());
      newPassword(instance.newPassword());
      putAllAdditionalProperties(instance.additionalProperties());
      fromEmailAddress(instance.fromEmailAddress());
      fromDisplayName(instance.fromDisplayName());
      @Nullable String testEmailRecipientValue = instance.testEmailRecipient();
      if (testEmailRecipientValue != null) {
        testEmailRecipient(testEmailRecipientValue);
      }
      version(instance.version());
      return this;
    }

    /**
     * Initializes the value for the {@link AdminJsonService.SmtpConfigDto#host() host} attribute.
     * @param host The value for host 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder host(String host) {
      this.host = Preconditions.checkNotNull(host, "host");
      initBits &= ~INIT_BIT_HOST;
      return this;
    }

    /**
     * Initializes the value for the {@link AdminJsonService.SmtpConfigDto#port() port} attribute.
     * @param port The value for port (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder port(@Nullable Integer port) {
      this.port = port;
      return this;
    }

    /**
     * Initializes the value for the {@link AdminJsonService.SmtpConfigDto#connectionSecurity() connectionSecurity} attribute.
     * @param connectionSecurity The value for connectionSecurity (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder connectionSecurity(@Nullable SmtpConfig.ConnectionSecurity connectionSecurity) {
      this.connectionSecurity = connectionSecurity;
      return this;
    }

    /**
     * Initializes the value for the {@link AdminJsonService.SmtpConfigDto#username() username} attribute.
     * @param username The value for username 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder username(String username) {
      this.username = Preconditions.checkNotNull(username, "username");
      initBits &= ~INIT_BIT_USERNAME;
      return this;
    }

    /**
     * Initializes the value for the {@link AdminJsonService.SmtpConfigDto#passwordExists() passwordExists} attribute.
     * @param passwordExists The value for passwordExists 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder passwordExists(boolean passwordExists) {
      this.passwordExists = passwordExists;
      initBits &= ~INIT_BIT_PASSWORD_EXISTS;
      return this;
    }

    /**
     * Initializes the value for the {@link AdminJsonService.SmtpConfigDto#newPassword() newPassword} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link AdminJsonService.SmtpConfigDto#newPassword() newPassword}.</em>
     * @param newPassword The value for newPassword 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder newPassword(String newPassword) {
      this.newPassword = Preconditions.checkNotNull(newPassword, "newPassword");
      return this;
    }

    /**
     * Put one entry to the {@link AdminJsonService.SmtpConfigDto#additionalProperties() additionalProperties} map.
     * @param key The key in the additionalProperties map
     * @param value The associated value in the additionalProperties map
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder putAdditionalProperties(String key, String value) {
      this.additionalProperties.put(key, value);
      return this;
    }

    /**
     * Put one entry to the {@link AdminJsonService.SmtpConfigDto#additionalProperties() additionalProperties} map. Nulls are not permitted
     * @param entry The key and value entry
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder putAdditionalProperties(Map.Entry<String, ? extends String> entry) {
      this.additionalProperties.put(entry);
      return this;
    }

    /**
     * Sets or replaces all mappings from the specified map as entries for the {@link AdminJsonService.SmtpConfigDto#additionalProperties() additionalProperties} map. Nulls are not permitted
     * @param additionalProperties The entries that will be added to the additionalProperties map
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder additionalProperties(Map<String, ? extends String> additionalProperties) {
      this.additionalProperties = ImmutableMap.builder();
      return putAllAdditionalProperties(additionalProperties);
    }

    /**
     * Put all mappings from the specified map as entries to {@link AdminJsonService.SmtpConfigDto#additionalProperties() additionalProperties} map. Nulls are not permitted
     * @param additionalProperties The entries that will be added to the additionalProperties map
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder putAllAdditionalProperties(Map<String, ? extends String> additionalProperties) {
      this.additionalProperties.putAll(additionalProperties);
      return this;
    }

    /**
     * Initializes the value for the {@link AdminJsonService.SmtpConfigDto#fromEmailAddress() fromEmailAddress} attribute.
     * @param fromEmailAddress The value for fromEmailAddress 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder fromEmailAddress(String fromEmailAddress) {
      this.fromEmailAddress = Preconditions.checkNotNull(fromEmailAddress, "fromEmailAddress");
      initBits &= ~INIT_BIT_FROM_EMAIL_ADDRESS;
      return this;
    }

    /**
     * Initializes the value for the {@link AdminJsonService.SmtpConfigDto#fromDisplayName() fromDisplayName} attribute.
     * @param fromDisplayName The value for fromDisplayName 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder fromDisplayName(String fromDisplayName) {
      this.fromDisplayName = Preconditions.checkNotNull(fromDisplayName, "fromDisplayName");
      initBits &= ~INIT_BIT_FROM_DISPLAY_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link AdminJsonService.SmtpConfigDto#testEmailRecipient() testEmailRecipient} attribute.
     * @param testEmailRecipient The value for testEmailRecipient (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder testEmailRecipient(@Nullable String testEmailRecipient) {
      this.testEmailRecipient = testEmailRecipient;
      return this;
    }

    /**
     * Initializes the value for the {@link AdminJsonService.SmtpConfigDto#version() version} attribute.
     * @param version The value for version 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder version(String version) {
      this.version = Preconditions.checkNotNull(version, "version");
      initBits &= ~INIT_BIT_VERSION;
      return this;
    }

    /**
     * Builds a new {@link ImmutableSmtpConfigDto ImmutableSmtpConfigDto}.
     * @return An immutable instance of SmtpConfigDto
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableSmtpConfigDto build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableSmtpConfigDto(this);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_HOST) != 0) attributes.add("host");
      if ((initBits & INIT_BIT_USERNAME) != 0) attributes.add("username");
      if ((initBits & INIT_BIT_PASSWORD_EXISTS) != 0) attributes.add("passwordExists");
      if ((initBits & INIT_BIT_FROM_EMAIL_ADDRESS) != 0) attributes.add("fromEmailAddress");
      if ((initBits & INIT_BIT_FROM_DISPLAY_NAME) != 0) attributes.add("fromDisplayName");
      if ((initBits & INIT_BIT_VERSION) != 0) attributes.add("version");
      return "Cannot build SmtpConfigDto, some of required attributes are not set " + attributes;
    }
  }
}
