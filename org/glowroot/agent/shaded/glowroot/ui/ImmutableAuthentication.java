package org.glowroot.agent.shaded.glowroot.ui;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import org.glowroot.agent.shaded.google.common.collect.ImmutableSet;
import org.glowroot.agent.shaded.google.common.collect.Lists;
import org.glowroot.agent.shaded.google.common.primitives.Booleans;
import java.util.List;
import java.util.Set;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.glowroot.agent.shaded.glowroot.common.repo.ConfigRepository;

/**
 * Immutable implementation of {@link HttpSessionManager.Authentication}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAuthentication.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "HttpSessionManager.Authentication"})
@Immutable
final class ImmutableAuthentication extends HttpSessionManager.Authentication {
  private final boolean central;
  private final boolean offline;
  private final boolean anonymous;
  private final boolean ldap;
  private final String caseAmbiguousUsername;
  private final ImmutableSet<String> roles;
  private final ConfigRepository configRepository;

  private ImmutableAuthentication(
      boolean central,
      boolean offline,
      boolean anonymous,
      boolean ldap,
      String caseAmbiguousUsername,
      ImmutableSet<String> roles,
      ConfigRepository configRepository) {
    this.central = central;
    this.offline = offline;
    this.anonymous = anonymous;
    this.ldap = ldap;
    this.caseAmbiguousUsername = caseAmbiguousUsername;
    this.roles = roles;
    this.configRepository = configRepository;
  }

  /**
   * @return The value of the {@code central} attribute
   */
  @JsonProperty("central")
  @Override
  boolean central() {
    return central;
  }

  /**
   * @return The value of the {@code offline} attribute
   */
  @JsonProperty("offline")
  @Override
  boolean offline() {
    return offline;
  }

  /**
   * @return The value of the {@code anonymous} attribute
   */
  @JsonProperty("anonymous")
  @Override
  boolean anonymous() {
    return anonymous;
  }

  /**
   * @return The value of the {@code ldap} attribute
   */
  @JsonProperty("ldap")
  @Override
  boolean ldap() {
    return ldap;
  }

  /**
   * @return The value of the {@code caseAmbiguousUsername} attribute
   */
  @JsonProperty("caseAmbiguousUsername")
  @Override
  String caseAmbiguousUsername() {
    return caseAmbiguousUsername;
  }

  /**
   * @return The value of the {@code roles} attribute
   */
  @JsonProperty("roles")
  @Override
  ImmutableSet<String> roles() {
    return roles;
  }

  /**
   * @return The value of the {@code configRepository} attribute
   */
  @JsonProperty("configRepository")
  @Override
  ConfigRepository configRepository() {
    return configRepository;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link HttpSessionManager.Authentication#central() central} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for central
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAuthentication withCentral(boolean value) {
    if (this.central == value) return this;
    return new ImmutableAuthentication(
        value,
        this.offline,
        this.anonymous,
        this.ldap,
        this.caseAmbiguousUsername,
        this.roles,
        this.configRepository);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link HttpSessionManager.Authentication#offline() offline} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for offline
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAuthentication withOffline(boolean value) {
    if (this.offline == value) return this;
    return new ImmutableAuthentication(
        this.central,
        value,
        this.anonymous,
        this.ldap,
        this.caseAmbiguousUsername,
        this.roles,
        this.configRepository);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link HttpSessionManager.Authentication#anonymous() anonymous} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for anonymous
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAuthentication withAnonymous(boolean value) {
    if (this.anonymous == value) return this;
    return new ImmutableAuthentication(
        this.central,
        this.offline,
        value,
        this.ldap,
        this.caseAmbiguousUsername,
        this.roles,
        this.configRepository);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link HttpSessionManager.Authentication#ldap() ldap} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for ldap
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAuthentication withLdap(boolean value) {
    if (this.ldap == value) return this;
    return new ImmutableAuthentication(
        this.central,
        this.offline,
        this.anonymous,
        value,
        this.caseAmbiguousUsername,
        this.roles,
        this.configRepository);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link HttpSessionManager.Authentication#caseAmbiguousUsername() caseAmbiguousUsername} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for caseAmbiguousUsername
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAuthentication withCaseAmbiguousUsername(String value) {
    if (this.caseAmbiguousUsername.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "caseAmbiguousUsername");
    return new ImmutableAuthentication(
        this.central,
        this.offline,
        this.anonymous,
        this.ldap,
        newValue,
        this.roles,
        this.configRepository);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link HttpSessionManager.Authentication#roles() roles}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuthentication withRoles(String... elements) {
    ImmutableSet<String> newValue = ImmutableSet.copyOf(elements);
    return new ImmutableAuthentication(
        this.central,
        this.offline,
        this.anonymous,
        this.ldap,
        this.caseAmbiguousUsername,
        newValue,
        this.configRepository);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link HttpSessionManager.Authentication#roles() roles}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of roles elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuthentication withRoles(Iterable<String> elements) {
    if (this.roles == elements) return this;
    ImmutableSet<String> newValue = ImmutableSet.copyOf(elements);
    return new ImmutableAuthentication(
        this.central,
        this.offline,
        this.anonymous,
        this.ldap,
        this.caseAmbiguousUsername,
        newValue,
        this.configRepository);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link HttpSessionManager.Authentication#configRepository() configRepository} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for configRepository
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAuthentication withConfigRepository(ConfigRepository value) {
    if (this.configRepository == value) return this;
    ConfigRepository newValue = Preconditions.checkNotNull(value, "configRepository");
    return new ImmutableAuthentication(
        this.central,
        this.offline,
        this.anonymous,
        this.ldap,
        this.caseAmbiguousUsername,
        this.roles,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAuthentication} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAuthentication
        && equalTo((ImmutableAuthentication) another);
  }

  private boolean equalTo(ImmutableAuthentication another) {
    return central == another.central
        && offline == another.offline
        && anonymous == another.anonymous
        && ldap == another.ldap
        && caseAmbiguousUsername.equals(another.caseAmbiguousUsername)
        && roles.equals(another.roles)
        && configRepository.equals(another.configRepository);
  }

  /**
   * Computes a hash code from attributes: {@code central}, {@code offline}, {@code anonymous}, {@code ldap}, {@code caseAmbiguousUsername}, {@code roles}, {@code configRepository}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Booleans.hashCode(central);
    h += (h << 5) + Booleans.hashCode(offline);
    h += (h << 5) + Booleans.hashCode(anonymous);
    h += (h << 5) + Booleans.hashCode(ldap);
    h += (h << 5) + caseAmbiguousUsername.hashCode();
    h += (h << 5) + roles.hashCode();
    h += (h << 5) + configRepository.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Authentication} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("Authentication")
        .omitNullValues()
        .add("central", central)
        .add("offline", offline)
        .add("anonymous", anonymous)
        .add("ldap", ldap)
        .add("caseAmbiguousUsername", caseAmbiguousUsername)
        .add("roles", roles)
        .add("configRepository", configRepository)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends HttpSessionManager.Authentication {
    boolean central;
    boolean centralIsSet;
    boolean offline;
    boolean offlineIsSet;
    boolean anonymous;
    boolean anonymousIsSet;
    boolean ldap;
    boolean ldapIsSet;
    @Nullable String caseAmbiguousUsername;
    Set<String> roles = ImmutableSet.of();
    @Nullable ConfigRepository configRepository;
    @JsonProperty("central")
    public void setCentral(boolean central) {
      this.central = central;
      this.centralIsSet = true;
    }
    @JsonProperty("offline")
    public void setOffline(boolean offline) {
      this.offline = offline;
      this.offlineIsSet = true;
    }
    @JsonProperty("anonymous")
    public void setAnonymous(boolean anonymous) {
      this.anonymous = anonymous;
      this.anonymousIsSet = true;
    }
    @JsonProperty("ldap")
    public void setLdap(boolean ldap) {
      this.ldap = ldap;
      this.ldapIsSet = true;
    }
    @JsonProperty("caseAmbiguousUsername")
    public void setCaseAmbiguousUsername(String caseAmbiguousUsername) {
      this.caseAmbiguousUsername = caseAmbiguousUsername;
    }
    @JsonProperty("roles")
    public void setRoles(Set<String> roles) {
      this.roles = roles;
    }
    @JsonProperty("configRepository")
    public void setConfigRepository(ConfigRepository configRepository) {
      this.configRepository = configRepository;
    }
    @Override
    boolean central() { throw new UnsupportedOperationException(); }
    @Override
    boolean offline() { throw new UnsupportedOperationException(); }
    @Override
    boolean anonymous() { throw new UnsupportedOperationException(); }
    @Override
    boolean ldap() { throw new UnsupportedOperationException(); }
    @Override
    String caseAmbiguousUsername() { throw new UnsupportedOperationException(); }
    @Override
    Set<String> roles() { throw new UnsupportedOperationException(); }
    @Override
    ConfigRepository configRepository() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableAuthentication fromJson(Json json) {
    ImmutableAuthentication.Builder builder = ImmutableAuthentication.builder();
    if (json.centralIsSet) {
      builder.central(json.central);
    }
    if (json.offlineIsSet) {
      builder.offline(json.offline);
    }
    if (json.anonymousIsSet) {
      builder.anonymous(json.anonymous);
    }
    if (json.ldapIsSet) {
      builder.ldap(json.ldap);
    }
    if (json.caseAmbiguousUsername != null) {
      builder.caseAmbiguousUsername(json.caseAmbiguousUsername);
    }
    if (json.roles != null) {
      builder.addAllRoles(json.roles);
    }
    if (json.configRepository != null) {
      builder.configRepository(json.configRepository);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link HttpSessionManager.Authentication} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Authentication instance
   */
  public static ImmutableAuthentication copyOf(HttpSessionManager.Authentication instance) {
    if (instance instanceof ImmutableAuthentication) {
      return (ImmutableAuthentication) instance;
    }
    return ImmutableAuthentication.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableAuthentication ImmutableAuthentication}.
   * @return A new ImmutableAuthentication builder
   */
  public static ImmutableAuthentication.Builder builder() {
    return new ImmutableAuthentication.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableAuthentication ImmutableAuthentication}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_CENTRAL = 0x1L;
    private static final long INIT_BIT_OFFLINE = 0x2L;
    private static final long INIT_BIT_ANONYMOUS = 0x4L;
    private static final long INIT_BIT_LDAP = 0x8L;
    private static final long INIT_BIT_CASE_AMBIGUOUS_USERNAME = 0x10L;
    private static final long INIT_BIT_CONFIG_REPOSITORY = 0x20L;
    private long initBits = 0x3fL;

    private boolean central;
    private boolean offline;
    private boolean anonymous;
    private boolean ldap;
    private @Nullable String caseAmbiguousUsername;
    private ImmutableSet.Builder<String> roles = ImmutableSet.builder();
    private @Nullable ConfigRepository configRepository;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Authentication} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(HttpSessionManager.Authentication instance) {
      Preconditions.checkNotNull(instance, "instance");
      central(instance.central());
      offline(instance.offline());
      anonymous(instance.anonymous());
      ldap(instance.ldap());
      caseAmbiguousUsername(instance.caseAmbiguousUsername());
      addAllRoles(instance.roles());
      configRepository(instance.configRepository());
      return this;
    }

    /**
     * Initializes the value for the {@link HttpSessionManager.Authentication#central() central} attribute.
     * @param central The value for central 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder central(boolean central) {
      this.central = central;
      initBits &= ~INIT_BIT_CENTRAL;
      return this;
    }

    /**
     * Initializes the value for the {@link HttpSessionManager.Authentication#offline() offline} attribute.
     * @param offline The value for offline 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder offline(boolean offline) {
      this.offline = offline;
      initBits &= ~INIT_BIT_OFFLINE;
      return this;
    }

    /**
     * Initializes the value for the {@link HttpSessionManager.Authentication#anonymous() anonymous} attribute.
     * @param anonymous The value for anonymous 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder anonymous(boolean anonymous) {
      this.anonymous = anonymous;
      initBits &= ~INIT_BIT_ANONYMOUS;
      return this;
    }

    /**
     * Initializes the value for the {@link HttpSessionManager.Authentication#ldap() ldap} attribute.
     * @param ldap The value for ldap 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder ldap(boolean ldap) {
      this.ldap = ldap;
      initBits &= ~INIT_BIT_LDAP;
      return this;
    }

    /**
     * Initializes the value for the {@link HttpSessionManager.Authentication#caseAmbiguousUsername() caseAmbiguousUsername} attribute.
     * @param caseAmbiguousUsername The value for caseAmbiguousUsername 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder caseAmbiguousUsername(String caseAmbiguousUsername) {
      this.caseAmbiguousUsername = Preconditions.checkNotNull(caseAmbiguousUsername, "caseAmbiguousUsername");
      initBits &= ~INIT_BIT_CASE_AMBIGUOUS_USERNAME;
      return this;
    }

    /**
     * Adds one element to {@link HttpSessionManager.Authentication#roles() roles} set.
     * @param element A roles element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addRoles(String element) {
      this.roles.add(element);
      return this;
    }

    /**
     * Adds elements to {@link HttpSessionManager.Authentication#roles() roles} set.
     * @param elements An array of roles elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addRoles(String... elements) {
      this.roles.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link HttpSessionManager.Authentication#roles() roles} set.
     * @param elements An iterable of roles elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder roles(Iterable<String> elements) {
      this.roles = ImmutableSet.builder();
      return addAllRoles(elements);
    }

    /**
     * Adds elements to {@link HttpSessionManager.Authentication#roles() roles} set.
     * @param elements An iterable of roles elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllRoles(Iterable<String> elements) {
      this.roles.addAll(elements);
      return this;
    }

    /**
     * Initializes the value for the {@link HttpSessionManager.Authentication#configRepository() configRepository} attribute.
     * @param configRepository The value for configRepository 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder configRepository(ConfigRepository configRepository) {
      this.configRepository = Preconditions.checkNotNull(configRepository, "configRepository");
      initBits &= ~INIT_BIT_CONFIG_REPOSITORY;
      return this;
    }

    /**
     * Builds a new {@link ImmutableAuthentication ImmutableAuthentication}.
     * @return An immutable instance of Authentication
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableAuthentication build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableAuthentication(central, offline, anonymous, ldap, caseAmbiguousUsername, roles.build(), configRepository);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_CENTRAL) != 0) attributes.add("central");
      if ((initBits & INIT_BIT_OFFLINE) != 0) attributes.add("offline");
      if ((initBits & INIT_BIT_ANONYMOUS) != 0) attributes.add("anonymous");
      if ((initBits & INIT_BIT_LDAP) != 0) attributes.add("ldap");
      if ((initBits & INIT_BIT_CASE_AMBIGUOUS_USERNAME) != 0) attributes.add("caseAmbiguousUsername");
      if ((initBits & INIT_BIT_CONFIG_REPOSITORY) != 0) attributes.add("configRepository");
      return "Cannot build Authentication, some of required attributes are not set " + attributes;
    }
  }
}
