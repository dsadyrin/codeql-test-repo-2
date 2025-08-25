package org.glowroot.agent.shaded.glowroot.common.config;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonIgnore;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonInclude;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import org.glowroot.agent.shaded.google.common.collect.ImmutableSet;
import org.glowroot.agent.shaded.google.common.collect.Lists;
import org.glowroot.agent.shaded.google.common.primitives.Booleans;
import java.util.ArrayList;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link UserConfig}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableUserConfig.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "UserConfig"})
@Immutable
public final class ImmutableUserConfig extends UserConfig {
  private final String username;
  private final String passwordHash;
  private final boolean ldap;
  private final ImmutableSet<String> roles;
  private final String version;

  private ImmutableUserConfig(ImmutableUserConfig.Builder builder) {
    this.roles = builder.roles.build();
    if (builder.username != null) {
      initShim.username(builder.username);
    }
    if (builder.passwordHash != null) {
      initShim.passwordHash(builder.passwordHash);
    }
    if (builder.ldapIsSet()) {
      initShim.ldap(builder.ldap);
    }
    this.username = initShim.username();
    this.passwordHash = initShim.passwordHash();
    this.ldap = initShim.ldap();
    this.version = initShim.version();
    this.initShim = null;
  }

  private ImmutableUserConfig(
      String username,
      String passwordHash,
      boolean ldap,
      ImmutableSet<String> roles) {
    this.username = username;
    this.passwordHash = passwordHash;
    this.ldap = ldap;
    this.roles = roles;
    initShim.username(this.username);
    initShim.passwordHash(this.passwordHash);
    initShim.ldap(this.ldap);
    this.version = initShim.version();
    this.initShim = null;
  }

  private static final int STAGE_INITIALIZING = -1;
  private static final int STAGE_UNINITIALIZED = 0;
  private static final int STAGE_INITIALIZED = 1;
  private transient volatile InitShim initShim = new InitShim();

  private final class InitShim {
    private String username;
    private int usernameBuildStage;

    String username() {
      if (usernameBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (usernameBuildStage == STAGE_UNINITIALIZED) {
        usernameBuildStage = STAGE_INITIALIZING;
        this.username = Preconditions.checkNotNull(ImmutableUserConfig.super.username(), "username");
        usernameBuildStage = STAGE_INITIALIZED;
      }
      return this.username;
    }

    void username(String username) {
      this.username = username;
      usernameBuildStage = STAGE_INITIALIZED;
    }
    private String passwordHash;
    private int passwordHashBuildStage;

    String passwordHash() {
      if (passwordHashBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (passwordHashBuildStage == STAGE_UNINITIALIZED) {
        passwordHashBuildStage = STAGE_INITIALIZING;
        this.passwordHash = Preconditions.checkNotNull(ImmutableUserConfig.super.passwordHash(), "passwordHash");
        passwordHashBuildStage = STAGE_INITIALIZED;
      }
      return this.passwordHash;
    }

    void passwordHash(String passwordHash) {
      this.passwordHash = passwordHash;
      passwordHashBuildStage = STAGE_INITIALIZED;
    }
    private boolean ldap;
    private int ldapBuildStage;

    boolean ldap() {
      if (ldapBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (ldapBuildStage == STAGE_UNINITIALIZED) {
        ldapBuildStage = STAGE_INITIALIZING;
        this.ldap = ImmutableUserConfig.super.ldap();
        ldapBuildStage = STAGE_INITIALIZED;
      }
      return this.ldap;
    }

    void ldap(boolean ldap) {
      this.ldap = ldap;
      ldapBuildStage = STAGE_INITIALIZED;
    }
    private String version;
    private int versionBuildStage;

    String version() {
      if (versionBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (versionBuildStage == STAGE_UNINITIALIZED) {
        versionBuildStage = STAGE_INITIALIZING;
        this.version = Preconditions.checkNotNull(ImmutableUserConfig.super.version(), "version");
        versionBuildStage = STAGE_INITIALIZED;
      }
      return this.version;
    }

    private String formatInitCycleMessage() {
      ArrayList<String> attributes = Lists.newArrayList();
      if (usernameBuildStage == STAGE_INITIALIZING) attributes.add("username");
      if (passwordHashBuildStage == STAGE_INITIALIZING) attributes.add("passwordHash");
      if (ldapBuildStage == STAGE_INITIALIZING) attributes.add("ldap");
      if (versionBuildStage == STAGE_INITIALIZING) attributes.add("version");
      return "Cannot build UserConfig, attribute initializers form cycle" + attributes;
    }
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
   * @return The value of the {@code passwordHash} attribute
   */
  @JsonProperty("passwordHash")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @Override
  public String passwordHash() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.passwordHash()
        : this.passwordHash;
  }

  /**
   * @return The value of the {@code ldap} attribute
   */
  @JsonProperty("ldap")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @Override
  public boolean ldap() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.ldap()
        : this.ldap;
  }

  /**
   * @return The value of the {@code roles} attribute
   */
  @JsonProperty("roles")
  @Override
  public ImmutableSet<String> roles() {
    return roles;
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
   * Copy the current immutable object by setting a value for the {@link UserConfig#username() username} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for username
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableUserConfig withUsername(String value) {
    if (this.username.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "username");
    return new ImmutableUserConfig(newValue, this.passwordHash, this.ldap, this.roles);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link UserConfig#passwordHash() passwordHash} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for passwordHash
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableUserConfig withPasswordHash(String value) {
    if (this.passwordHash.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "passwordHash");
    return new ImmutableUserConfig(this.username, newValue, this.ldap, this.roles);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link UserConfig#ldap() ldap} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for ldap
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableUserConfig withLdap(boolean value) {
    if (this.ldap == value) return this;
    return new ImmutableUserConfig(this.username, this.passwordHash, value, this.roles);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link UserConfig#roles() roles}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUserConfig withRoles(String... elements) {
    ImmutableSet<String> newValue = ImmutableSet.copyOf(elements);
    return new ImmutableUserConfig(this.username, this.passwordHash, this.ldap, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link UserConfig#roles() roles}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of roles elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUserConfig withRoles(Iterable<String> elements) {
    if (this.roles == elements) return this;
    ImmutableSet<String> newValue = ImmutableSet.copyOf(elements);
    return new ImmutableUserConfig(this.username, this.passwordHash, this.ldap, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableUserConfig} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableUserConfig
        && equalTo((ImmutableUserConfig) another);
  }

  private boolean equalTo(ImmutableUserConfig another) {
    return username.equals(another.username)
        && passwordHash.equals(another.passwordHash)
        && ldap == another.ldap
        && roles.equals(another.roles)
        && version.equals(another.version);
  }

  /**
   * Computes a hash code from attributes: {@code username}, {@code passwordHash}, {@code ldap}, {@code roles}, {@code version}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + username.hashCode();
    h += (h << 5) + passwordHash.hashCode();
    h += (h << 5) + Booleans.hashCode(ldap);
    h += (h << 5) + roles.hashCode();
    h += (h << 5) + version.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code UserConfig} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("UserConfig")
        .omitNullValues()
        .add("username", username)
        .add("passwordHash", passwordHash)
        .add("ldap", ldap)
        .add("roles", roles)
        .add("version", version)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends UserConfig {
    @Nullable String username;
    @Nullable String passwordHash;
    boolean ldap;
    boolean ldapIsSet;
    ImmutableSet<String> roles = ImmutableSet.of();
    @JsonProperty("username")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public void setUsername(String username) {
      this.username = username;
    }
    @JsonProperty("passwordHash")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public void setPasswordHash(String passwordHash) {
      this.passwordHash = passwordHash;
    }
    @JsonProperty("ldap")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public void setLdap(boolean ldap) {
      this.ldap = ldap;
      this.ldapIsSet = true;
    }
    @JsonProperty("roles")
    public void setRoles(ImmutableSet<String> roles) {
      this.roles = roles;
    }
    @Override
    public String username() { throw new UnsupportedOperationException(); }
    @Override
    public String passwordHash() { throw new UnsupportedOperationException(); }
    @Override
    public boolean ldap() { throw new UnsupportedOperationException(); }
    @Override
    public ImmutableSet<String> roles() { throw new UnsupportedOperationException(); }
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
  static ImmutableUserConfig fromJson(Json json) {
    ImmutableUserConfig.Builder builder = ImmutableUserConfig.builder();
    if (json.username != null) {
      builder.username(json.username);
    }
    if (json.passwordHash != null) {
      builder.passwordHash(json.passwordHash);
    }
    if (json.ldapIsSet) {
      builder.ldap(json.ldap);
    }
    if (json.roles != null) {
      builder.addAllRoles(json.roles);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link UserConfig} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable UserConfig instance
   */
  public static ImmutableUserConfig copyOf(UserConfig instance) {
    if (instance instanceof ImmutableUserConfig) {
      return (ImmutableUserConfig) instance;
    }
    return ImmutableUserConfig.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableUserConfig ImmutableUserConfig}.
   * @return A new ImmutableUserConfig builder
   */
  public static ImmutableUserConfig.Builder builder() {
    return new ImmutableUserConfig.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableUserConfig ImmutableUserConfig}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_LDAP = 0x1L;
    private long optBits;

    private @Nullable String username;
    private @Nullable String passwordHash;
    private boolean ldap;
    private ImmutableSet.Builder<String> roles = ImmutableSet.builder();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code UserConfig} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(UserConfig instance) {
      Preconditions.checkNotNull(instance, "instance");
      username(instance.username());
      passwordHash(instance.passwordHash());
      ldap(instance.ldap());
      addAllRoles(instance.roles());
      return this;
    }

    /**
     * Initializes the value for the {@link UserConfig#username() username} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link UserConfig#username() username}.</em>
     * @param username The value for username 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder username(String username) {
      this.username = Preconditions.checkNotNull(username, "username");
      return this;
    }

    /**
     * Initializes the value for the {@link UserConfig#passwordHash() passwordHash} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link UserConfig#passwordHash() passwordHash}.</em>
     * @param passwordHash The value for passwordHash 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder passwordHash(String passwordHash) {
      this.passwordHash = Preconditions.checkNotNull(passwordHash, "passwordHash");
      return this;
    }

    /**
     * Initializes the value for the {@link UserConfig#ldap() ldap} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link UserConfig#ldap() ldap}.</em>
     * @param ldap The value for ldap 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder ldap(boolean ldap) {
      this.ldap = ldap;
      optBits |= OPT_BIT_LDAP;
      return this;
    }

    /**
     * Adds one element to {@link UserConfig#roles() roles} set.
     * @param element A roles element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addRoles(String element) {
      this.roles.add(element);
      return this;
    }

    /**
     * Adds elements to {@link UserConfig#roles() roles} set.
     * @param elements An array of roles elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addRoles(String... elements) {
      this.roles.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link UserConfig#roles() roles} set.
     * @param elements An iterable of roles elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder roles(Iterable<String> elements) {
      this.roles = ImmutableSet.builder();
      return addAllRoles(elements);
    }

    /**
     * Adds elements to {@link UserConfig#roles() roles} set.
     * @param elements An iterable of roles elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllRoles(Iterable<String> elements) {
      this.roles.addAll(elements);
      return this;
    }

    /**
     * Builds a new {@link ImmutableUserConfig ImmutableUserConfig}.
     * @return An immutable instance of UserConfig
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableUserConfig build() {
      return new ImmutableUserConfig(this);
    }

    private boolean ldapIsSet() {
      return (optBits & OPT_BIT_LDAP) != 0;
    }
  }
}
