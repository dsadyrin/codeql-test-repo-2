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
import org.glowroot.agent.shaded.google.common.primitives.Booleans;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link LdapConfig}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableLdapConfig.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "LdapConfig"})
@Immutable
public final class ImmutableLdapConfig extends LdapConfig {
  private final String host;
  private final @Nullable Integer port;
  private final boolean ssl;
  private final String username;
  private final String password;
  private final String userBaseDn;
  private final String userSearchFilter;
  private final String groupBaseDn;
  private final String groupSearchFilter;
  private final ImmutableMap<String, List<String>> roleMappings;
  private final String version;
  private final String url;

  private ImmutableLdapConfig(ImmutableLdapConfig.Builder builder) {
    this.port = builder.port;
    this.roleMappings = builder.roleMappings.build();
    if (builder.host != null) {
      initShim.host(builder.host);
    }
    if (builder.sslIsSet()) {
      initShim.ssl(builder.ssl);
    }
    if (builder.username != null) {
      initShim.username(builder.username);
    }
    if (builder.password != null) {
      initShim.password(builder.password);
    }
    if (builder.userBaseDn != null) {
      initShim.userBaseDn(builder.userBaseDn);
    }
    if (builder.userSearchFilter != null) {
      initShim.userSearchFilter(builder.userSearchFilter);
    }
    if (builder.groupBaseDn != null) {
      initShim.groupBaseDn(builder.groupBaseDn);
    }
    if (builder.groupSearchFilter != null) {
      initShim.groupSearchFilter(builder.groupSearchFilter);
    }
    this.host = initShim.host();
    this.ssl = initShim.ssl();
    this.username = initShim.username();
    this.password = initShim.password();
    this.userBaseDn = initShim.userBaseDn();
    this.userSearchFilter = initShim.userSearchFilter();
    this.groupBaseDn = initShim.groupBaseDn();
    this.groupSearchFilter = initShim.groupSearchFilter();
    this.version = initShim.version();
    this.url = initShim.url();
    this.initShim = null;
  }

  private ImmutableLdapConfig(
      String host,
      @Nullable Integer port,
      boolean ssl,
      String username,
      String password,
      String userBaseDn,
      String userSearchFilter,
      String groupBaseDn,
      String groupSearchFilter,
      ImmutableMap<String, List<String>> roleMappings) {
    this.host = host;
    this.port = port;
    this.ssl = ssl;
    this.username = username;
    this.password = password;
    this.userBaseDn = userBaseDn;
    this.userSearchFilter = userSearchFilter;
    this.groupBaseDn = groupBaseDn;
    this.groupSearchFilter = groupSearchFilter;
    this.roleMappings = roleMappings;
    initShim.host(this.host);
    initShim.ssl(this.ssl);
    initShim.username(this.username);
    initShim.password(this.password);
    initShim.userBaseDn(this.userBaseDn);
    initShim.userSearchFilter(this.userSearchFilter);
    initShim.groupBaseDn(this.groupBaseDn);
    initShim.groupSearchFilter(this.groupSearchFilter);
    this.version = initShim.version();
    this.url = initShim.url();
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
        this.host = Preconditions.checkNotNull(ImmutableLdapConfig.super.host(), "host");
        hostBuildStage = STAGE_INITIALIZED;
      }
      return this.host;
    }

    void host(String host) {
      this.host = host;
      hostBuildStage = STAGE_INITIALIZED;
    }
    private boolean ssl;
    private int sslBuildStage;

    boolean ssl() {
      if (sslBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (sslBuildStage == STAGE_UNINITIALIZED) {
        sslBuildStage = STAGE_INITIALIZING;
        this.ssl = ImmutableLdapConfig.super.ssl();
        sslBuildStage = STAGE_INITIALIZED;
      }
      return this.ssl;
    }

    void ssl(boolean ssl) {
      this.ssl = ssl;
      sslBuildStage = STAGE_INITIALIZED;
    }
    private String username;
    private int usernameBuildStage;

    String username() {
      if (usernameBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (usernameBuildStage == STAGE_UNINITIALIZED) {
        usernameBuildStage = STAGE_INITIALIZING;
        this.username = Preconditions.checkNotNull(ImmutableLdapConfig.super.username(), "username");
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
        this.password = Preconditions.checkNotNull(ImmutableLdapConfig.super.password(), "password");
        passwordBuildStage = STAGE_INITIALIZED;
      }
      return this.password;
    }

    void password(String password) {
      this.password = password;
      passwordBuildStage = STAGE_INITIALIZED;
    }
    private String userBaseDn;
    private int userBaseDnBuildStage;

    String userBaseDn() {
      if (userBaseDnBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (userBaseDnBuildStage == STAGE_UNINITIALIZED) {
        userBaseDnBuildStage = STAGE_INITIALIZING;
        this.userBaseDn = Preconditions.checkNotNull(ImmutableLdapConfig.super.userBaseDn(), "userBaseDn");
        userBaseDnBuildStage = STAGE_INITIALIZED;
      }
      return this.userBaseDn;
    }

    void userBaseDn(String userBaseDn) {
      this.userBaseDn = userBaseDn;
      userBaseDnBuildStage = STAGE_INITIALIZED;
    }
    private String userSearchFilter;
    private int userSearchFilterBuildStage;

    String userSearchFilter() {
      if (userSearchFilterBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (userSearchFilterBuildStage == STAGE_UNINITIALIZED) {
        userSearchFilterBuildStage = STAGE_INITIALIZING;
        this.userSearchFilter = Preconditions.checkNotNull(ImmutableLdapConfig.super.userSearchFilter(), "userSearchFilter");
        userSearchFilterBuildStage = STAGE_INITIALIZED;
      }
      return this.userSearchFilter;
    }

    void userSearchFilter(String userSearchFilter) {
      this.userSearchFilter = userSearchFilter;
      userSearchFilterBuildStage = STAGE_INITIALIZED;
    }
    private String groupBaseDn;
    private int groupBaseDnBuildStage;

    String groupBaseDn() {
      if (groupBaseDnBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (groupBaseDnBuildStage == STAGE_UNINITIALIZED) {
        groupBaseDnBuildStage = STAGE_INITIALIZING;
        this.groupBaseDn = Preconditions.checkNotNull(ImmutableLdapConfig.super.groupBaseDn(), "groupBaseDn");
        groupBaseDnBuildStage = STAGE_INITIALIZED;
      }
      return this.groupBaseDn;
    }

    void groupBaseDn(String groupBaseDn) {
      this.groupBaseDn = groupBaseDn;
      groupBaseDnBuildStage = STAGE_INITIALIZED;
    }
    private String groupSearchFilter;
    private int groupSearchFilterBuildStage;

    String groupSearchFilter() {
      if (groupSearchFilterBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (groupSearchFilterBuildStage == STAGE_UNINITIALIZED) {
        groupSearchFilterBuildStage = STAGE_INITIALIZING;
        this.groupSearchFilter = Preconditions.checkNotNull(ImmutableLdapConfig.super.groupSearchFilter(), "groupSearchFilter");
        groupSearchFilterBuildStage = STAGE_INITIALIZED;
      }
      return this.groupSearchFilter;
    }

    void groupSearchFilter(String groupSearchFilter) {
      this.groupSearchFilter = groupSearchFilter;
      groupSearchFilterBuildStage = STAGE_INITIALIZED;
    }
    private String version;
    private int versionBuildStage;

    String version() {
      if (versionBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (versionBuildStage == STAGE_UNINITIALIZED) {
        versionBuildStage = STAGE_INITIALIZING;
        this.version = Preconditions.checkNotNull(ImmutableLdapConfig.super.version(), "version");
        versionBuildStage = STAGE_INITIALIZED;
      }
      return this.version;
    }
    private String url;
    private int urlBuildStage;

    String url() {
      if (urlBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (urlBuildStage == STAGE_UNINITIALIZED) {
        urlBuildStage = STAGE_INITIALIZING;
        this.url = Preconditions.checkNotNull(ImmutableLdapConfig.super.url(), "url");
        urlBuildStage = STAGE_INITIALIZED;
      }
      return this.url;
    }

    private String formatInitCycleMessage() {
      ArrayList<String> attributes = Lists.newArrayList();
      if (hostBuildStage == STAGE_INITIALIZING) attributes.add("host");
      if (sslBuildStage == STAGE_INITIALIZING) attributes.add("ssl");
      if (usernameBuildStage == STAGE_INITIALIZING) attributes.add("username");
      if (passwordBuildStage == STAGE_INITIALIZING) attributes.add("password");
      if (userBaseDnBuildStage == STAGE_INITIALIZING) attributes.add("userBaseDn");
      if (userSearchFilterBuildStage == STAGE_INITIALIZING) attributes.add("userSearchFilter");
      if (groupBaseDnBuildStage == STAGE_INITIALIZING) attributes.add("groupBaseDn");
      if (groupSearchFilterBuildStage == STAGE_INITIALIZING) attributes.add("groupSearchFilter");
      if (versionBuildStage == STAGE_INITIALIZING) attributes.add("version");
      if (urlBuildStage == STAGE_INITIALIZING) attributes.add("url");
      return "Cannot build LdapConfig, attribute initializers form cycle" + attributes;
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
   * @return The value of the {@code ssl} attribute
   */
  @JsonProperty("ssl")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @Override
  public boolean ssl() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.ssl()
        : this.ssl;
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
   * @return The value of the {@code userBaseDn} attribute
   */
  @JsonProperty("userBaseDn")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @Override
  public String userBaseDn() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.userBaseDn()
        : this.userBaseDn;
  }

  /**
   * @return The value of the {@code userSearchFilter} attribute
   */
  @JsonProperty("userSearchFilter")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @Override
  public String userSearchFilter() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.userSearchFilter()
        : this.userSearchFilter;
  }

  /**
   * @return The value of the {@code groupBaseDn} attribute
   */
  @JsonProperty("groupBaseDn")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @Override
  public String groupBaseDn() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.groupBaseDn()
        : this.groupBaseDn;
  }

  /**
   * @return The value of the {@code groupSearchFilter} attribute
   */
  @JsonProperty("groupSearchFilter")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @Override
  public String groupSearchFilter() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.groupSearchFilter()
        : this.groupSearchFilter;
  }

  /**
   * @return The value of the {@code roleMappings} attribute
   */
  @JsonProperty("roleMappings")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @Override
  public ImmutableMap<String, List<String>> roleMappings() {
    return roleMappings;
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
   * @return The computed-at-construction value of the {@code url} attribute
   */
  @JsonProperty("url")
  @JsonIgnore
  @Override
  public String url() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.url()
        : this.url;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LdapConfig#host() host} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for host
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLdapConfig withHost(String value) {
    if (this.host.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "host");
    return new ImmutableLdapConfig(
        newValue,
        this.port,
        this.ssl,
        this.username,
        this.password,
        this.userBaseDn,
        this.userSearchFilter,
        this.groupBaseDn,
        this.groupSearchFilter,
        this.roleMappings);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LdapConfig#port() port} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for port (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLdapConfig withPort(@Nullable Integer value) {
    if (Objects.equal(this.port, value)) return this;
    return new ImmutableLdapConfig(
        this.host,
        value,
        this.ssl,
        this.username,
        this.password,
        this.userBaseDn,
        this.userSearchFilter,
        this.groupBaseDn,
        this.groupSearchFilter,
        this.roleMappings);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LdapConfig#ssl() ssl} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for ssl
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLdapConfig withSsl(boolean value) {
    if (this.ssl == value) return this;
    return new ImmutableLdapConfig(
        this.host,
        this.port,
        value,
        this.username,
        this.password,
        this.userBaseDn,
        this.userSearchFilter,
        this.groupBaseDn,
        this.groupSearchFilter,
        this.roleMappings);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LdapConfig#username() username} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for username
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLdapConfig withUsername(String value) {
    if (this.username.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "username");
    return new ImmutableLdapConfig(
        this.host,
        this.port,
        this.ssl,
        newValue,
        this.password,
        this.userBaseDn,
        this.userSearchFilter,
        this.groupBaseDn,
        this.groupSearchFilter,
        this.roleMappings);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LdapConfig#password() password} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for password
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLdapConfig withPassword(String value) {
    if (this.password.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "password");
    return new ImmutableLdapConfig(
        this.host,
        this.port,
        this.ssl,
        this.username,
        newValue,
        this.userBaseDn,
        this.userSearchFilter,
        this.groupBaseDn,
        this.groupSearchFilter,
        this.roleMappings);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LdapConfig#userBaseDn() userBaseDn} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for userBaseDn
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLdapConfig withUserBaseDn(String value) {
    if (this.userBaseDn.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "userBaseDn");
    return new ImmutableLdapConfig(
        this.host,
        this.port,
        this.ssl,
        this.username,
        this.password,
        newValue,
        this.userSearchFilter,
        this.groupBaseDn,
        this.groupSearchFilter,
        this.roleMappings);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LdapConfig#userSearchFilter() userSearchFilter} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for userSearchFilter
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLdapConfig withUserSearchFilter(String value) {
    if (this.userSearchFilter.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "userSearchFilter");
    return new ImmutableLdapConfig(
        this.host,
        this.port,
        this.ssl,
        this.username,
        this.password,
        this.userBaseDn,
        newValue,
        this.groupBaseDn,
        this.groupSearchFilter,
        this.roleMappings);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LdapConfig#groupBaseDn() groupBaseDn} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for groupBaseDn
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLdapConfig withGroupBaseDn(String value) {
    if (this.groupBaseDn.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "groupBaseDn");
    return new ImmutableLdapConfig(
        this.host,
        this.port,
        this.ssl,
        this.username,
        this.password,
        this.userBaseDn,
        this.userSearchFilter,
        newValue,
        this.groupSearchFilter,
        this.roleMappings);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LdapConfig#groupSearchFilter() groupSearchFilter} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for groupSearchFilter
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLdapConfig withGroupSearchFilter(String value) {
    if (this.groupSearchFilter.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "groupSearchFilter");
    return new ImmutableLdapConfig(
        this.host,
        this.port,
        this.ssl,
        this.username,
        this.password,
        this.userBaseDn,
        this.userSearchFilter,
        this.groupBaseDn,
        newValue,
        this.roleMappings);
  }

  /**
   * Copy the current immutable object by replacing the {@link LdapConfig#roleMappings() roleMappings} map with the specified map.
   * Nulls are not permitted as keys or values.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param entries The entries to be added to the roleMappings map
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLdapConfig withRoleMappings(Map<String, ? extends List<String>> entries) {
    if (this.roleMappings == entries) return this;
    ImmutableMap<String, List<String>> newValue = ImmutableMap.copyOf(entries);
    return new ImmutableLdapConfig(
        this.host,
        this.port,
        this.ssl,
        this.username,
        this.password,
        this.userBaseDn,
        this.userSearchFilter,
        this.groupBaseDn,
        this.groupSearchFilter,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableLdapConfig} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableLdapConfig
        && equalTo((ImmutableLdapConfig) another);
  }

  private boolean equalTo(ImmutableLdapConfig another) {
    return host.equals(another.host)
        && Objects.equal(port, another.port)
        && ssl == another.ssl
        && username.equals(another.username)
        && password.equals(another.password)
        && userBaseDn.equals(another.userBaseDn)
        && userSearchFilter.equals(another.userSearchFilter)
        && groupBaseDn.equals(another.groupBaseDn)
        && groupSearchFilter.equals(another.groupSearchFilter)
        && roleMappings.equals(another.roleMappings)
        && version.equals(another.version)
        && url.equals(another.url);
  }

  /**
   * Computes a hash code from attributes: {@code host}, {@code port}, {@code ssl}, {@code username}, {@code password}, {@code userBaseDn}, {@code userSearchFilter}, {@code groupBaseDn}, {@code groupSearchFilter}, {@code roleMappings}, {@code version}, {@code url}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + host.hashCode();
    h += (h << 5) + Objects.hashCode(port);
    h += (h << 5) + Booleans.hashCode(ssl);
    h += (h << 5) + username.hashCode();
    h += (h << 5) + password.hashCode();
    h += (h << 5) + userBaseDn.hashCode();
    h += (h << 5) + userSearchFilter.hashCode();
    h += (h << 5) + groupBaseDn.hashCode();
    h += (h << 5) + groupSearchFilter.hashCode();
    h += (h << 5) + roleMappings.hashCode();
    h += (h << 5) + version.hashCode();
    h += (h << 5) + url.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code LdapConfig} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("LdapConfig")
        .omitNullValues()
        .add("host", host)
        .add("port", port)
        .add("ssl", ssl)
        .add("username", username)
        .add("password", password)
        .add("userBaseDn", userBaseDn)
        .add("userSearchFilter", userSearchFilter)
        .add("groupBaseDn", groupBaseDn)
        .add("groupSearchFilter", groupSearchFilter)
        .add("roleMappings", roleMappings)
        .add("version", version)
        .add("url", url)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends LdapConfig {
    @Nullable String host;
    @Nullable Integer port;
    boolean ssl;
    boolean sslIsSet;
    @Nullable String username;
    @Nullable String password;
    @Nullable String userBaseDn;
    @Nullable String userSearchFilter;
    @Nullable String groupBaseDn;
    @Nullable String groupSearchFilter;
    @Nullable Map<String, List<String>> roleMappings;
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
    @JsonProperty("ssl")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public void setSsl(boolean ssl) {
      this.ssl = ssl;
      this.sslIsSet = true;
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
    @JsonProperty("userBaseDn")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public void setUserBaseDn(String userBaseDn) {
      this.userBaseDn = userBaseDn;
    }
    @JsonProperty("userSearchFilter")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public void setUserSearchFilter(String userSearchFilter) {
      this.userSearchFilter = userSearchFilter;
    }
    @JsonProperty("groupBaseDn")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public void setGroupBaseDn(String groupBaseDn) {
      this.groupBaseDn = groupBaseDn;
    }
    @JsonProperty("groupSearchFilter")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public void setGroupSearchFilter(String groupSearchFilter) {
      this.groupSearchFilter = groupSearchFilter;
    }
    @JsonProperty("roleMappings")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public void setRoleMappings(Map<String, List<String>> roleMappings) {
      this.roleMappings = roleMappings;
    }
    @Override
    public String host() { throw new UnsupportedOperationException(); }
    @Override
    public Integer port() { throw new UnsupportedOperationException(); }
    @Override
    public boolean ssl() { throw new UnsupportedOperationException(); }
    @Override
    public String username() { throw new UnsupportedOperationException(); }
    @Override
    public String password() { throw new UnsupportedOperationException(); }
    @Override
    public String userBaseDn() { throw new UnsupportedOperationException(); }
    @Override
    public String userSearchFilter() { throw new UnsupportedOperationException(); }
    @Override
    public String groupBaseDn() { throw new UnsupportedOperationException(); }
    @Override
    public String groupSearchFilter() { throw new UnsupportedOperationException(); }
    @Override
    public Map<String, List<String>> roleMappings() { throw new UnsupportedOperationException(); }
    @Override
    public String version() { throw new UnsupportedOperationException(); }
    @Override
    public String url() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableLdapConfig fromJson(Json json) {
    ImmutableLdapConfig.Builder builder = ImmutableLdapConfig.builder();
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
    if (json.password != null) {
      builder.password(json.password);
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
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link LdapConfig} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable LdapConfig instance
   */
  public static ImmutableLdapConfig copyOf(LdapConfig instance) {
    if (instance instanceof ImmutableLdapConfig) {
      return (ImmutableLdapConfig) instance;
    }
    return ImmutableLdapConfig.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableLdapConfig ImmutableLdapConfig}.
   * @return A new ImmutableLdapConfig builder
   */
  public static ImmutableLdapConfig.Builder builder() {
    return new ImmutableLdapConfig.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableLdapConfig ImmutableLdapConfig}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_SSL = 0x1L;
    private long optBits;

    private @Nullable String host;
    private @Nullable Integer port;
    private boolean ssl;
    private @Nullable String username;
    private @Nullable String password;
    private @Nullable String userBaseDn;
    private @Nullable String userSearchFilter;
    private @Nullable String groupBaseDn;
    private @Nullable String groupSearchFilter;
    private ImmutableMap.Builder<String, List<String>> roleMappings = ImmutableMap.builder();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code LdapConfig} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(LdapConfig instance) {
      Preconditions.checkNotNull(instance, "instance");
      host(instance.host());
      @Nullable Integer portValue = instance.port();
      if (portValue != null) {
        port(portValue);
      }
      ssl(instance.ssl());
      username(instance.username());
      password(instance.password());
      userBaseDn(instance.userBaseDn());
      userSearchFilter(instance.userSearchFilter());
      groupBaseDn(instance.groupBaseDn());
      groupSearchFilter(instance.groupSearchFilter());
      putAllRoleMappings(instance.roleMappings());
      return this;
    }

    /**
     * Initializes the value for the {@link LdapConfig#host() host} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link LdapConfig#host() host}.</em>
     * @param host The value for host 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder host(String host) {
      this.host = Preconditions.checkNotNull(host, "host");
      return this;
    }

    /**
     * Initializes the value for the {@link LdapConfig#port() port} attribute.
     * @param port The value for port (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder port(@Nullable Integer port) {
      this.port = port;
      return this;
    }

    /**
     * Initializes the value for the {@link LdapConfig#ssl() ssl} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link LdapConfig#ssl() ssl}.</em>
     * @param ssl The value for ssl 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder ssl(boolean ssl) {
      this.ssl = ssl;
      optBits |= OPT_BIT_SSL;
      return this;
    }

    /**
     * Initializes the value for the {@link LdapConfig#username() username} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link LdapConfig#username() username}.</em>
     * @param username The value for username 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder username(String username) {
      this.username = Preconditions.checkNotNull(username, "username");
      return this;
    }

    /**
     * Initializes the value for the {@link LdapConfig#password() password} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link LdapConfig#password() password}.</em>
     * @param password The value for password 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder password(String password) {
      this.password = Preconditions.checkNotNull(password, "password");
      return this;
    }

    /**
     * Initializes the value for the {@link LdapConfig#userBaseDn() userBaseDn} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link LdapConfig#userBaseDn() userBaseDn}.</em>
     * @param userBaseDn The value for userBaseDn 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder userBaseDn(String userBaseDn) {
      this.userBaseDn = Preconditions.checkNotNull(userBaseDn, "userBaseDn");
      return this;
    }

    /**
     * Initializes the value for the {@link LdapConfig#userSearchFilter() userSearchFilter} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link LdapConfig#userSearchFilter() userSearchFilter}.</em>
     * @param userSearchFilter The value for userSearchFilter 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder userSearchFilter(String userSearchFilter) {
      this.userSearchFilter = Preconditions.checkNotNull(userSearchFilter, "userSearchFilter");
      return this;
    }

    /**
     * Initializes the value for the {@link LdapConfig#groupBaseDn() groupBaseDn} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link LdapConfig#groupBaseDn() groupBaseDn}.</em>
     * @param groupBaseDn The value for groupBaseDn 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder groupBaseDn(String groupBaseDn) {
      this.groupBaseDn = Preconditions.checkNotNull(groupBaseDn, "groupBaseDn");
      return this;
    }

    /**
     * Initializes the value for the {@link LdapConfig#groupSearchFilter() groupSearchFilter} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link LdapConfig#groupSearchFilter() groupSearchFilter}.</em>
     * @param groupSearchFilter The value for groupSearchFilter 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder groupSearchFilter(String groupSearchFilter) {
      this.groupSearchFilter = Preconditions.checkNotNull(groupSearchFilter, "groupSearchFilter");
      return this;
    }

    /**
     * Put one entry to the {@link LdapConfig#roleMappings() roleMappings} map.
     * @param key The key in the roleMappings map
     * @param value The associated value in the roleMappings map
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder putRoleMappings(String key, List<String> value) {
      this.roleMappings.put(key, value);
      return this;
    }

    /**
     * Put one entry to the {@link LdapConfig#roleMappings() roleMappings} map. Nulls are not permitted
     * @param entry The key and value entry
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder putRoleMappings(Map.Entry<String, ? extends List<String>> entry) {
      this.roleMappings.put(entry);
      return this;
    }

    /**
     * Sets or replaces all mappings from the specified map as entries for the {@link LdapConfig#roleMappings() roleMappings} map. Nulls are not permitted
     * @param roleMappings The entries that will be added to the roleMappings map
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder roleMappings(Map<String, ? extends List<String>> roleMappings) {
      this.roleMappings = ImmutableMap.builder();
      return putAllRoleMappings(roleMappings);
    }

    /**
     * Put all mappings from the specified map as entries to {@link LdapConfig#roleMappings() roleMappings} map. Nulls are not permitted
     * @param roleMappings The entries that will be added to the roleMappings map
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder putAllRoleMappings(Map<String, ? extends List<String>> roleMappings) {
      this.roleMappings.putAll(roleMappings);
      return this;
    }

    /**
     * Builds a new {@link ImmutableLdapConfig ImmutableLdapConfig}.
     * @return An immutable instance of LdapConfig
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableLdapConfig build() {
      return new ImmutableLdapConfig(this);
    }

    private boolean sslIsSet() {
      return (optBits & OPT_BIT_SSL) != 0;
    }
  }
}
