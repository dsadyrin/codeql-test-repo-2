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

/**
 * Immutable implementation of {@link AdminJsonService.LdapConfigDto}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableLdapConfigDto.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "AdminJsonService.LdapConfigDto"})
@Immutable
final class ImmutableLdapConfigDto extends AdminJsonService.LdapConfigDto {
  private final String host;
  private final @Nullable Integer port;
  private final boolean ssl;
  private final String username;
  private final boolean passwordExists;
  private final String newPassword;
  private final String userBaseDn;
  private final String userSearchFilter;
  private final String groupBaseDn;
  private final String groupSearchFilter;
  private final ImmutableMap<String, List<String>> roleMappings;
  private final @Nullable String authTestUsername;
  private final @Nullable String authTestPassword;
  private final String version;

  private ImmutableLdapConfigDto(ImmutableLdapConfigDto.Builder builder) {
    this.host = builder.host;
    this.port = builder.port;
    this.ssl = builder.ssl;
    this.username = builder.username;
    this.passwordExists = builder.passwordExists;
    this.userBaseDn = builder.userBaseDn;
    this.userSearchFilter = builder.userSearchFilter;
    this.groupBaseDn = builder.groupBaseDn;
    this.groupSearchFilter = builder.groupSearchFilter;
    this.roleMappings = builder.roleMappings.build();
    this.authTestUsername = builder.authTestUsername;
    this.authTestPassword = builder.authTestPassword;
    this.version = builder.version;
    this.newPassword = builder.newPassword != null
        ? builder.newPassword
        : Preconditions.checkNotNull(super.newPassword(), "newPassword");
  }

  private ImmutableLdapConfigDto(
      String host,
      @Nullable Integer port,
      boolean ssl,
      String username,
      boolean passwordExists,
      String newPassword,
      String userBaseDn,
      String userSearchFilter,
      String groupBaseDn,
      String groupSearchFilter,
      ImmutableMap<String, List<String>> roleMappings,
      @Nullable String authTestUsername,
      @Nullable String authTestPassword,
      String version) {
    this.host = host;
    this.port = port;
    this.ssl = ssl;
    this.username = username;
    this.passwordExists = passwordExists;
    this.newPassword = newPassword;
    this.userBaseDn = userBaseDn;
    this.userSearchFilter = userSearchFilter;
    this.groupBaseDn = groupBaseDn;
    this.groupSearchFilter = groupSearchFilter;
    this.roleMappings = roleMappings;
    this.authTestUsername = authTestUsername;
    this.authTestPassword = authTestPassword;
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
   * @return The value of the {@code ssl} attribute
   */
  @JsonProperty("ssl")
  @Override
  boolean ssl() {
    return ssl;
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
   * @return The value of the {@code userBaseDn} attribute
   */
  @JsonProperty("userBaseDn")
  @Override
  String userBaseDn() {
    return userBaseDn;
  }

  /**
   * @return The value of the {@code userSearchFilter} attribute
   */
  @JsonProperty("userSearchFilter")
  @Override
  String userSearchFilter() {
    return userSearchFilter;
  }

  /**
   * @return The value of the {@code groupBaseDn} attribute
   */
  @JsonProperty("groupBaseDn")
  @Override
  String groupBaseDn() {
    return groupBaseDn;
  }

  /**
   * @return The value of the {@code groupSearchFilter} attribute
   */
  @JsonProperty("groupSearchFilter")
  @Override
  String groupSearchFilter() {
    return groupSearchFilter;
  }

  /**
   * @return The value of the {@code roleMappings} attribute
   */
  @JsonProperty("roleMappings")
  @Override
  ImmutableMap<String, List<String>> roleMappings() {
    return roleMappings;
  }

  /**
   * @return The value of the {@code authTestUsername} attribute
   */
  @JsonProperty("authTestUsername")
  @Override
  @Nullable String authTestUsername() {
    return authTestUsername;
  }

  /**
   * @return The value of the {@code authTestPassword} attribute
   */
  @JsonProperty("authTestPassword")
  @Override
  @Nullable String authTestPassword() {
    return authTestPassword;
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
   * Copy the current immutable object by setting a value for the {@link AdminJsonService.LdapConfigDto#host() host} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for host
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLdapConfigDto withHost(String value) {
    if (this.host.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "host");
    return new ImmutableLdapConfigDto(
        newValue,
        this.port,
        this.ssl,
        this.username,
        this.passwordExists,
        this.newPassword,
        this.userBaseDn,
        this.userSearchFilter,
        this.groupBaseDn,
        this.groupSearchFilter,
        this.roleMappings,
        this.authTestUsername,
        this.authTestPassword,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AdminJsonService.LdapConfigDto#port() port} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for port (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLdapConfigDto withPort(@Nullable Integer value) {
    if (Objects.equal(this.port, value)) return this;
    return new ImmutableLdapConfigDto(
        this.host,
        value,
        this.ssl,
        this.username,
        this.passwordExists,
        this.newPassword,
        this.userBaseDn,
        this.userSearchFilter,
        this.groupBaseDn,
        this.groupSearchFilter,
        this.roleMappings,
        this.authTestUsername,
        this.authTestPassword,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AdminJsonService.LdapConfigDto#ssl() ssl} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for ssl
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLdapConfigDto withSsl(boolean value) {
    if (this.ssl == value) return this;
    return new ImmutableLdapConfigDto(
        this.host,
        this.port,
        value,
        this.username,
        this.passwordExists,
        this.newPassword,
        this.userBaseDn,
        this.userSearchFilter,
        this.groupBaseDn,
        this.groupSearchFilter,
        this.roleMappings,
        this.authTestUsername,
        this.authTestPassword,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AdminJsonService.LdapConfigDto#username() username} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for username
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLdapConfigDto withUsername(String value) {
    if (this.username.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "username");
    return new ImmutableLdapConfigDto(
        this.host,
        this.port,
        this.ssl,
        newValue,
        this.passwordExists,
        this.newPassword,
        this.userBaseDn,
        this.userSearchFilter,
        this.groupBaseDn,
        this.groupSearchFilter,
        this.roleMappings,
        this.authTestUsername,
        this.authTestPassword,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AdminJsonService.LdapConfigDto#passwordExists() passwordExists} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for passwordExists
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLdapConfigDto withPasswordExists(boolean value) {
    if (this.passwordExists == value) return this;
    return new ImmutableLdapConfigDto(
        this.host,
        this.port,
        this.ssl,
        this.username,
        value,
        this.newPassword,
        this.userBaseDn,
        this.userSearchFilter,
        this.groupBaseDn,
        this.groupSearchFilter,
        this.roleMappings,
        this.authTestUsername,
        this.authTestPassword,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AdminJsonService.LdapConfigDto#newPassword() newPassword} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for newPassword
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLdapConfigDto withNewPassword(String value) {
    if (this.newPassword.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "newPassword");
    return new ImmutableLdapConfigDto(
        this.host,
        this.port,
        this.ssl,
        this.username,
        this.passwordExists,
        newValue,
        this.userBaseDn,
        this.userSearchFilter,
        this.groupBaseDn,
        this.groupSearchFilter,
        this.roleMappings,
        this.authTestUsername,
        this.authTestPassword,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AdminJsonService.LdapConfigDto#userBaseDn() userBaseDn} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for userBaseDn
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLdapConfigDto withUserBaseDn(String value) {
    if (this.userBaseDn.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "userBaseDn");
    return new ImmutableLdapConfigDto(
        this.host,
        this.port,
        this.ssl,
        this.username,
        this.passwordExists,
        this.newPassword,
        newValue,
        this.userSearchFilter,
        this.groupBaseDn,
        this.groupSearchFilter,
        this.roleMappings,
        this.authTestUsername,
        this.authTestPassword,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AdminJsonService.LdapConfigDto#userSearchFilter() userSearchFilter} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for userSearchFilter
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLdapConfigDto withUserSearchFilter(String value) {
    if (this.userSearchFilter.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "userSearchFilter");
    return new ImmutableLdapConfigDto(
        this.host,
        this.port,
        this.ssl,
        this.username,
        this.passwordExists,
        this.newPassword,
        this.userBaseDn,
        newValue,
        this.groupBaseDn,
        this.groupSearchFilter,
        this.roleMappings,
        this.authTestUsername,
        this.authTestPassword,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AdminJsonService.LdapConfigDto#groupBaseDn() groupBaseDn} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for groupBaseDn
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLdapConfigDto withGroupBaseDn(String value) {
    if (this.groupBaseDn.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "groupBaseDn");
    return new ImmutableLdapConfigDto(
        this.host,
        this.port,
        this.ssl,
        this.username,
        this.passwordExists,
        this.newPassword,
        this.userBaseDn,
        this.userSearchFilter,
        newValue,
        this.groupSearchFilter,
        this.roleMappings,
        this.authTestUsername,
        this.authTestPassword,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AdminJsonService.LdapConfigDto#groupSearchFilter() groupSearchFilter} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for groupSearchFilter
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLdapConfigDto withGroupSearchFilter(String value) {
    if (this.groupSearchFilter.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "groupSearchFilter");
    return new ImmutableLdapConfigDto(
        this.host,
        this.port,
        this.ssl,
        this.username,
        this.passwordExists,
        this.newPassword,
        this.userBaseDn,
        this.userSearchFilter,
        this.groupBaseDn,
        newValue,
        this.roleMappings,
        this.authTestUsername,
        this.authTestPassword,
        this.version);
  }

  /**
   * Copy the current immutable object by replacing the {@link AdminJsonService.LdapConfigDto#roleMappings() roleMappings} map with the specified map.
   * Nulls are not permitted as keys or values.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param entries The entries to be added to the roleMappings map
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLdapConfigDto withRoleMappings(Map<String, ? extends List<String>> entries) {
    if (this.roleMappings == entries) return this;
    ImmutableMap<String, List<String>> newValue = ImmutableMap.copyOf(entries);
    return new ImmutableLdapConfigDto(
        this.host,
        this.port,
        this.ssl,
        this.username,
        this.passwordExists,
        this.newPassword,
        this.userBaseDn,
        this.userSearchFilter,
        this.groupBaseDn,
        this.groupSearchFilter,
        newValue,
        this.authTestUsername,
        this.authTestPassword,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AdminJsonService.LdapConfigDto#authTestUsername() authTestUsername} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for authTestUsername (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLdapConfigDto withAuthTestUsername(@Nullable String value) {
    if (Objects.equal(this.authTestUsername, value)) return this;
    return new ImmutableLdapConfigDto(
        this.host,
        this.port,
        this.ssl,
        this.username,
        this.passwordExists,
        this.newPassword,
        this.userBaseDn,
        this.userSearchFilter,
        this.groupBaseDn,
        this.groupSearchFilter,
        this.roleMappings,
        value,
        this.authTestPassword,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AdminJsonService.LdapConfigDto#authTestPassword() authTestPassword} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for authTestPassword (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLdapConfigDto withAuthTestPassword(@Nullable String value) {
    if (Objects.equal(this.authTestPassword, value)) return this;
    return new ImmutableLdapConfigDto(
        this.host,
        this.port,
        this.ssl,
        this.username,
        this.passwordExists,
        this.newPassword,
        this.userBaseDn,
        this.userSearchFilter,
        this.groupBaseDn,
        this.groupSearchFilter,
        this.roleMappings,
        this.authTestUsername,
        value,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AdminJsonService.LdapConfigDto#version() version} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for version
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLdapConfigDto withVersion(String value) {
    if (this.version.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "version");
    return new ImmutableLdapConfigDto(
        this.host,
        this.port,
        this.ssl,
        this.username,
        this.passwordExists,
        this.newPassword,
        this.userBaseDn,
        this.userSearchFilter,
        this.groupBaseDn,
        this.groupSearchFilter,
        this.roleMappings,
        this.authTestUsername,
        this.authTestPassword,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableLdapConfigDto} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableLdapConfigDto
        && equalTo((ImmutableLdapConfigDto) another);
  }

  private boolean equalTo(ImmutableLdapConfigDto another) {
    return host.equals(another.host)
        && Objects.equal(port, another.port)
        && ssl == another.ssl
        && username.equals(another.username)
        && passwordExists == another.passwordExists
        && newPassword.equals(another.newPassword)
        && userBaseDn.equals(another.userBaseDn)
        && userSearchFilter.equals(another.userSearchFilter)
        && groupBaseDn.equals(another.groupBaseDn)
        && groupSearchFilter.equals(another.groupSearchFilter)
        && roleMappings.equals(another.roleMappings)
        && Objects.equal(authTestUsername, another.authTestUsername)
        && Objects.equal(authTestPassword, another.authTestPassword)
        && version.equals(another.version);
  }

  /**
   * Computes a hash code from attributes: {@code host}, {@code port}, {@code ssl}, {@code username}, {@code passwordExists}, {@code newPassword}, {@code userBaseDn}, {@code userSearchFilter}, {@code groupBaseDn}, {@code groupSearchFilter}, {@code roleMappings}, {@code authTestUsername}, {@code authTestPassword}, {@code version}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + host.hashCode();
    h += (h << 5) + Objects.hashCode(port);
    h += (h << 5) + Booleans.hashCode(ssl);
    h += (h << 5) + username.hashCode();
    h += (h << 5) + Booleans.hashCode(passwordExists);
    h += (h << 5) + newPassword.hashCode();
    h += (h << 5) + userBaseDn.hashCode();
    h += (h << 5) + userSearchFilter.hashCode();
    h += (h << 5) + groupBaseDn.hashCode();
    h += (h << 5) + groupSearchFilter.hashCode();
    h += (h << 5) + roleMappings.hashCode();
    h += (h << 5) + Objects.hashCode(authTestUsername);
    h += (h << 5) + Objects.hashCode(authTestPassword);
    h += (h << 5) + version.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code LdapConfigDto} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("LdapConfigDto")
        .omitNullValues()
        .add("host", host)
        .add("port", port)
        .add("ssl", ssl)
        .add("username", username)
        .add("passwordExists", passwordExists)
        .add("newPassword", newPassword)
        .add("userBaseDn", userBaseDn)
        .add("userSearchFilter", userSearchFilter)
        .add("groupBaseDn", groupBaseDn)
        .add("groupSearchFilter", groupSearchFilter)
        .add("roleMappings", roleMappings)
        .add("authTestUsername", authTestUsername)
        .add("authTestPassword", authTestPassword)
        .add("version", version)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends AdminJsonService.LdapConfigDto {
    @Nullable String host;
    @Nullable Integer port;
    boolean ssl;
    boolean sslIsSet;
    @Nullable String username;
    boolean passwordExists;
    boolean passwordExistsIsSet;
    @Nullable String newPassword;
    @Nullable String userBaseDn;
    @Nullable String userSearchFilter;
    @Nullable String groupBaseDn;
    @Nullable String groupSearchFilter;
    @Nullable Map<String, List<String>> roleMappings;
    @Nullable String authTestUsername;
    @Nullable String authTestPassword;
    @Nullable String version;
    @JsonProperty("host")
    public void setHost(String host) {
      this.host = host;
    }
    @JsonProperty("port")
    public void setPort(@Nullable Integer port) {
      this.port = port;
    }
    @JsonProperty("ssl")
    public void setSsl(boolean ssl) {
      this.ssl = ssl;
      this.sslIsSet = true;
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
    @JsonProperty("userBaseDn")
    public void setUserBaseDn(String userBaseDn) {
      this.userBaseDn = userBaseDn;
    }
    @JsonProperty("userSearchFilter")
    public void setUserSearchFilter(String userSearchFilter) {
      this.userSearchFilter = userSearchFilter;
    }
    @JsonProperty("groupBaseDn")
    public void setGroupBaseDn(String groupBaseDn) {
      this.groupBaseDn = groupBaseDn;
    }
    @JsonProperty("groupSearchFilter")
    public void setGroupSearchFilter(String groupSearchFilter) {
      this.groupSearchFilter = groupSearchFilter;
    }
    @JsonProperty("roleMappings")
    public void setRoleMappings(Map<String, List<String>> roleMappings) {
      this.roleMappings = roleMappings;
    }
    @JsonProperty("authTestUsername")
    public void setAuthTestUsername(@Nullable String authTestUsername) {
      this.authTestUsername = authTestUsername;
    }
    @JsonProperty("authTestPassword")
    public void setAuthTestPassword(@Nullable String authTestPassword) {
      this.authTestPassword = authTestPassword;
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
    boolean ssl() { throw new UnsupportedOperationException(); }
    @Override
    String username() { throw new UnsupportedOperationException(); }
    @Override
    boolean passwordExists() { throw new UnsupportedOperationException(); }
    @Override
    String newPassword() { throw new UnsupportedOperationException(); }
    @Override
    String userBaseDn() { throw new UnsupportedOperationException(); }
    @Override
    String userSearchFilter() { throw new UnsupportedOperationException(); }
    @Override
    String groupBaseDn() { throw new UnsupportedOperationException(); }
    @Override
    String groupSearchFilter() { throw new UnsupportedOperationException(); }
    @Override
    Map<String, List<String>> roleMappings() { throw new UnsupportedOperationException(); }
    @Override
    String authTestUsername() { throw new UnsupportedOperationException(); }
    @Override
    String authTestPassword() { throw new UnsupportedOperationException(); }
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
  static ImmutableLdapConfigDto fromJson(Json json) {
    ImmutableLdapConfigDto.Builder builder = ImmutableLdapConfigDto.builder();
    if (json.host != null) {
      builder.host(json.host);
    }
    if (json.port != null) {
      builder.port(json.port);
    }
    if (json.sslIsSet) {
      builder.ssl(json.ssl);
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
    if (json.userBaseDn != null) {
      builder.userBaseDn(json.userBaseDn);
    }
    if (json.userSearchFilter != null) {
      builder.userSearchFilter(json.userSearchFilter);
    }
    if (json.groupBaseDn != null) {
      builder.groupBaseDn(json.groupBaseDn);
    }
    if (json.groupSearchFilter != null) {
      builder.groupSearchFilter(json.groupSearchFilter);
    }
    if (json.roleMappings != null) {
      builder.putAllRoleMappings(json.roleMappings);
    }
    if (json.authTestUsername != null) {
      builder.authTestUsername(json.authTestUsername);
    }
    if (json.authTestPassword != null) {
      builder.authTestPassword(json.authTestPassword);
    }
    if (json.version != null) {
      builder.version(json.version);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link AdminJsonService.LdapConfigDto} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable LdapConfigDto instance
   */
  public static ImmutableLdapConfigDto copyOf(AdminJsonService.LdapConfigDto instance) {
    if (instance instanceof ImmutableLdapConfigDto) {
      return (ImmutableLdapConfigDto) instance;
    }
    return ImmutableLdapConfigDto.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableLdapConfigDto ImmutableLdapConfigDto}.
   * @return A new ImmutableLdapConfigDto builder
   */
  public static ImmutableLdapConfigDto.Builder builder() {
    return new ImmutableLdapConfigDto.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableLdapConfigDto ImmutableLdapConfigDto}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_HOST = 0x1L;
    private static final long INIT_BIT_SSL = 0x2L;
    private static final long INIT_BIT_USERNAME = 0x4L;
    private static final long INIT_BIT_PASSWORD_EXISTS = 0x8L;
    private static final long INIT_BIT_USER_BASE_DN = 0x10L;
    private static final long INIT_BIT_USER_SEARCH_FILTER = 0x20L;
    private static final long INIT_BIT_GROUP_BASE_DN = 0x40L;
    private static final long INIT_BIT_GROUP_SEARCH_FILTER = 0x80L;
    private static final long INIT_BIT_VERSION = 0x100L;
    private long initBits = 0x1ffL;

    private @Nullable String host;
    private @Nullable Integer port;
    private boolean ssl;
    private @Nullable String username;
    private boolean passwordExists;
    private @Nullable String newPassword;
    private @Nullable String userBaseDn;
    private @Nullable String userSearchFilter;
    private @Nullable String groupBaseDn;
    private @Nullable String groupSearchFilter;
    private ImmutableMap.Builder<String, List<String>> roleMappings = ImmutableMap.builder();
    private @Nullable String authTestUsername;
    private @Nullable String authTestPassword;
    private @Nullable String version;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code LdapConfigDto} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(AdminJsonService.LdapConfigDto instance) {
      Preconditions.checkNotNull(instance, "instance");
      host(instance.host());
      @Nullable Integer portValue = instance.port();
      if (portValue != null) {
        port(portValue);
      }
      ssl(instance.ssl());
      username(instance.username());
      passwordExists(instance.passwordExists());
      newPassword(instance.newPassword());
      userBaseDn(instance.userBaseDn());
      userSearchFilter(instance.userSearchFilter());
      groupBaseDn(instance.groupBaseDn());
      groupSearchFilter(instance.groupSearchFilter());
      putAllRoleMappings(instance.roleMappings());
      @Nullable String authTestUsernameValue = instance.authTestUsername();
      if (authTestUsernameValue != null) {
        authTestUsername(authTestUsernameValue);
      }
      @Nullable String authTestPasswordValue = instance.authTestPassword();
      if (authTestPasswordValue != null) {
        authTestPassword(authTestPasswordValue);
      }
      version(instance.version());
      return this;
    }

    /**
     * Initializes the value for the {@link AdminJsonService.LdapConfigDto#host() host} attribute.
     * @param host The value for host 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder host(String host) {
      this.host = Preconditions.checkNotNull(host, "host");
      initBits &= ~INIT_BIT_HOST;
      return this;
    }

    /**
     * Initializes the value for the {@link AdminJsonService.LdapConfigDto#port() port} attribute.
     * @param port The value for port (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder port(@Nullable Integer port) {
      this.port = port;
      return this;
    }

    /**
     * Initializes the value for the {@link AdminJsonService.LdapConfigDto#ssl() ssl} attribute.
     * @param ssl The value for ssl 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder ssl(boolean ssl) {
      this.ssl = ssl;
      initBits &= ~INIT_BIT_SSL;
      return this;
    }

    /**
     * Initializes the value for the {@link AdminJsonService.LdapConfigDto#username() username} attribute.
     * @param username The value for username 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder username(String username) {
      this.username = Preconditions.checkNotNull(username, "username");
      initBits &= ~INIT_BIT_USERNAME;
      return this;
    }

    /**
     * Initializes the value for the {@link AdminJsonService.LdapConfigDto#passwordExists() passwordExists} attribute.
     * @param passwordExists The value for passwordExists 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder passwordExists(boolean passwordExists) {
      this.passwordExists = passwordExists;
      initBits &= ~INIT_BIT_PASSWORD_EXISTS;
      return this;
    }

    /**
     * Initializes the value for the {@link AdminJsonService.LdapConfigDto#newPassword() newPassword} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link AdminJsonService.LdapConfigDto#newPassword() newPassword}.</em>
     * @param newPassword The value for newPassword 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder newPassword(String newPassword) {
      this.newPassword = Preconditions.checkNotNull(newPassword, "newPassword");
      return this;
    }

    /**
     * Initializes the value for the {@link AdminJsonService.LdapConfigDto#userBaseDn() userBaseDn} attribute.
     * @param userBaseDn The value for userBaseDn 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder userBaseDn(String userBaseDn) {
      this.userBaseDn = Preconditions.checkNotNull(userBaseDn, "userBaseDn");
      initBits &= ~INIT_BIT_USER_BASE_DN;
      return this;
    }

    /**
     * Initializes the value for the {@link AdminJsonService.LdapConfigDto#userSearchFilter() userSearchFilter} attribute.
     * @param userSearchFilter The value for userSearchFilter 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder userSearchFilter(String userSearchFilter) {
      this.userSearchFilter = Preconditions.checkNotNull(userSearchFilter, "userSearchFilter");
      initBits &= ~INIT_BIT_USER_SEARCH_FILTER;
      return this;
    }

    /**
     * Initializes the value for the {@link AdminJsonService.LdapConfigDto#groupBaseDn() groupBaseDn} attribute.
     * @param groupBaseDn The value for groupBaseDn 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder groupBaseDn(String groupBaseDn) {
      this.groupBaseDn = Preconditions.checkNotNull(groupBaseDn, "groupBaseDn");
      initBits &= ~INIT_BIT_GROUP_BASE_DN;
      return this;
    }

    /**
     * Initializes the value for the {@link AdminJsonService.LdapConfigDto#groupSearchFilter() groupSearchFilter} attribute.
     * @param groupSearchFilter The value for groupSearchFilter 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder groupSearchFilter(String groupSearchFilter) {
      this.groupSearchFilter = Preconditions.checkNotNull(groupSearchFilter, "groupSearchFilter");
      initBits &= ~INIT_BIT_GROUP_SEARCH_FILTER;
      return this;
    }

    /**
     * Put one entry to the {@link AdminJsonService.LdapConfigDto#roleMappings() roleMappings} map.
     * @param key The key in the roleMappings map
     * @param value The associated value in the roleMappings map
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder putRoleMappings(String key, List<String> value) {
      this.roleMappings.put(key, value);
      return this;
    }

    /**
     * Put one entry to the {@link AdminJsonService.LdapConfigDto#roleMappings() roleMappings} map. Nulls are not permitted
     * @param entry The key and value entry
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder putRoleMappings(Map.Entry<String, ? extends List<String>> entry) {
      this.roleMappings.put(entry);
      return this;
    }

    /**
     * Sets or replaces all mappings from the specified map as entries for the {@link AdminJsonService.LdapConfigDto#roleMappings() roleMappings} map. Nulls are not permitted
     * @param roleMappings The entries that will be added to the roleMappings map
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder roleMappings(Map<String, ? extends List<String>> roleMappings) {
      this.roleMappings = ImmutableMap.builder();
      return putAllRoleMappings(roleMappings);
    }

    /**
     * Put all mappings from the specified map as entries to {@link AdminJsonService.LdapConfigDto#roleMappings() roleMappings} map. Nulls are not permitted
     * @param roleMappings The entries that will be added to the roleMappings map
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder putAllRoleMappings(Map<String, ? extends List<String>> roleMappings) {
      this.roleMappings.putAll(roleMappings);
      return this;
    }

    /**
     * Initializes the value for the {@link AdminJsonService.LdapConfigDto#authTestUsername() authTestUsername} attribute.
     * @param authTestUsername The value for authTestUsername (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder authTestUsername(@Nullable String authTestUsername) {
      this.authTestUsername = authTestUsername;
      return this;
    }

    /**
     * Initializes the value for the {@link AdminJsonService.LdapConfigDto#authTestPassword() authTestPassword} attribute.
     * @param authTestPassword The value for authTestPassword (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder authTestPassword(@Nullable String authTestPassword) {
      this.authTestPassword = authTestPassword;
      return this;
    }

    /**
     * Initializes the value for the {@link AdminJsonService.LdapConfigDto#version() version} attribute.
     * @param version The value for version 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder version(String version) {
      this.version = Preconditions.checkNotNull(version, "version");
      initBits &= ~INIT_BIT_VERSION;
      return this;
    }

    /**
     * Builds a new {@link ImmutableLdapConfigDto ImmutableLdapConfigDto}.
     * @return An immutable instance of LdapConfigDto
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableLdapConfigDto build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableLdapConfigDto(this);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_HOST) != 0) attributes.add("host");
      if ((initBits & INIT_BIT_SSL) != 0) attributes.add("ssl");
      if ((initBits & INIT_BIT_USERNAME) != 0) attributes.add("username");
      if ((initBits & INIT_BIT_PASSWORD_EXISTS) != 0) attributes.add("passwordExists");
      if ((initBits & INIT_BIT_USER_BASE_DN) != 0) attributes.add("userBaseDn");
      if ((initBits & INIT_BIT_USER_SEARCH_FILTER) != 0) attributes.add("userSearchFilter");
      if ((initBits & INIT_BIT_GROUP_BASE_DN) != 0) attributes.add("groupBaseDn");
      if ((initBits & INIT_BIT_GROUP_SEARCH_FILTER) != 0) attributes.add("groupSearchFilter");
      if ((initBits & INIT_BIT_VERSION) != 0) attributes.add("version");
      return "Cannot build LdapConfigDto, some of required attributes are not set " + attributes;
    }
  }
}
