package org.glowroot.agent.shaded.glowroot.ui;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Optional;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import org.glowroot.agent.shaded.google.common.collect.ImmutableList;
import org.glowroot.agent.shaded.google.common.collect.Lists;
import org.glowroot.agent.shaded.google.common.primitives.Booleans;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link UserConfigJsonService.UserConfigDto}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableUserConfigDto.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "UserConfigJsonService.UserConfigDto"})
@Immutable
final class ImmutableUserConfigDto extends UserConfigJsonService.UserConfigDto {
  private final String username;
  private final boolean ldap;
  private final String newPassword;
  private final ImmutableList<String> roles;
  private final Optional<String> version;

  private ImmutableUserConfigDto(ImmutableUserConfigDto.Builder builder) {
    this.username = builder.username;
    this.ldap = builder.ldap;
    this.roles = builder.roles.build();
    this.version = builder.version;
    this.newPassword = builder.newPassword != null
        ? builder.newPassword
        : Preconditions.checkNotNull(super.newPassword(), "newPassword");
  }

  private ImmutableUserConfigDto(
      String username,
      boolean ldap,
      String newPassword,
      ImmutableList<String> roles,
      Optional<String> version) {
    this.username = username;
    this.ldap = ldap;
    this.newPassword = newPassword;
    this.roles = roles;
    this.version = version;
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
   * @return The value of the {@code ldap} attribute
   */
  @JsonProperty("ldap")
  @Override
  boolean ldap() {
    return ldap;
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
   * @return The value of the {@code roles} attribute
   */
  @JsonProperty("roles")
  @Override
  ImmutableList<String> roles() {
    return roles;
  }

  /**
   * @return The value of the {@code version} attribute
   */
  @JsonProperty("version")
  @Override
  Optional<String> version() {
    return version;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link UserConfigJsonService.UserConfigDto#username() username} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for username
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableUserConfigDto withUsername(String value) {
    if (this.username.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "username");
    return new ImmutableUserConfigDto(newValue, this.ldap, this.newPassword, this.roles, this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link UserConfigJsonService.UserConfigDto#ldap() ldap} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for ldap
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableUserConfigDto withLdap(boolean value) {
    if (this.ldap == value) return this;
    return new ImmutableUserConfigDto(this.username, value, this.newPassword, this.roles, this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link UserConfigJsonService.UserConfigDto#newPassword() newPassword} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for newPassword
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableUserConfigDto withNewPassword(String value) {
    if (this.newPassword.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "newPassword");
    return new ImmutableUserConfigDto(this.username, this.ldap, newValue, this.roles, this.version);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link UserConfigJsonService.UserConfigDto#roles() roles}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUserConfigDto withRoles(String... elements) {
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableUserConfigDto(this.username, this.ldap, this.newPassword, newValue, this.version);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link UserConfigJsonService.UserConfigDto#roles() roles}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of roles elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUserConfigDto withRoles(Iterable<String> elements) {
    if (this.roles == elements) return this;
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableUserConfigDto(this.username, this.ldap, this.newPassword, newValue, this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link UserConfigJsonService.UserConfigDto#version() version} attribute.
   * @param value The value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUserConfigDto withVersion(String value) {
    Optional<String> newValue = Optional.of(value);
    if (this.version.equals(newValue)) return this;
    return new ImmutableUserConfigDto(this.username, this.ldap, this.newPassword, this.roles, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link UserConfigJsonService.UserConfigDto#version() version} attribute.
   * An equality check is used to prevent copying of the same value by returning {@code this}.
   * @param optional A value for version
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableUserConfigDto withVersion(Optional<String> optional) {
    Optional<String> value = (Optional<String>) optional;
    if (this.version.equals(value)) return this;
    return new ImmutableUserConfigDto(this.username, this.ldap, this.newPassword, this.roles, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableUserConfigDto} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableUserConfigDto
        && equalTo((ImmutableUserConfigDto) another);
  }

  private boolean equalTo(ImmutableUserConfigDto another) {
    return username.equals(another.username)
        && ldap == another.ldap
        && newPassword.equals(another.newPassword)
        && roles.equals(another.roles)
        && version.equals(another.version);
  }

  /**
   * Computes a hash code from attributes: {@code username}, {@code ldap}, {@code newPassword}, {@code roles}, {@code version}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + username.hashCode();
    h += (h << 5) + Booleans.hashCode(ldap);
    h += (h << 5) + newPassword.hashCode();
    h += (h << 5) + roles.hashCode();
    h += (h << 5) + version.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code UserConfigDto} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("UserConfigDto")
        .omitNullValues()
        .add("username", username)
        .add("ldap", ldap)
        .add("newPassword", newPassword)
        .add("roles", roles)
        .add("version", version.orNull())
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends UserConfigJsonService.UserConfigDto {
    @Nullable String username;
    boolean ldap;
    boolean ldapIsSet;
    @Nullable String newPassword;
    ImmutableList<String> roles = ImmutableList.of();
    Optional<String> version = Optional.absent();
    @JsonProperty("username")
    public void setUsername(String username) {
      this.username = username;
    }
    @JsonProperty("ldap")
    public void setLdap(boolean ldap) {
      this.ldap = ldap;
      this.ldapIsSet = true;
    }
    @JsonProperty("newPassword")
    public void setNewPassword(String newPassword) {
      this.newPassword = newPassword;
    }
    @JsonProperty("roles")
    public void setRoles(ImmutableList<String> roles) {
      this.roles = roles;
    }
    @JsonProperty("version")
    public void setVersion(Optional<String> version) {
      this.version = version;
    }
    @Override
    String username() { throw new UnsupportedOperationException(); }
    @Override
    boolean ldap() { throw new UnsupportedOperationException(); }
    @Override
    String newPassword() { throw new UnsupportedOperationException(); }
    @Override
    ImmutableList<String> roles() { throw new UnsupportedOperationException(); }
    @Override
    Optional<String> version() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableUserConfigDto fromJson(Json json) {
    ImmutableUserConfigDto.Builder builder = ImmutableUserConfigDto.builder();
    if (json.username != null) {
      builder.username(json.username);
    }
    if (json.ldapIsSet) {
      builder.ldap(json.ldap);
    }
    if (json.newPassword != null) {
      builder.newPassword(json.newPassword);
    }
    if (json.roles != null) {
      builder.addAllRoles(json.roles);
    }
    if (json.version != null) {
      builder.version(json.version);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link UserConfigJsonService.UserConfigDto} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable UserConfigDto instance
   */
  public static ImmutableUserConfigDto copyOf(UserConfigJsonService.UserConfigDto instance) {
    if (instance instanceof ImmutableUserConfigDto) {
      return (ImmutableUserConfigDto) instance;
    }
    return ImmutableUserConfigDto.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableUserConfigDto ImmutableUserConfigDto}.
   * @return A new ImmutableUserConfigDto builder
   */
  public static ImmutableUserConfigDto.Builder builder() {
    return new ImmutableUserConfigDto.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableUserConfigDto ImmutableUserConfigDto}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_USERNAME = 0x1L;
    private static final long INIT_BIT_LDAP = 0x2L;
    private long initBits = 0x3L;

    private @Nullable String username;
    private boolean ldap;
    private @Nullable String newPassword;
    private ImmutableList.Builder<String> roles = ImmutableList.builder();
    private Optional<String> version = Optional.absent();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code UserConfigDto} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(UserConfigJsonService.UserConfigDto instance) {
      Preconditions.checkNotNull(instance, "instance");
      username(instance.username());
      ldap(instance.ldap());
      newPassword(instance.newPassword());
      addAllRoles(instance.roles());
      Optional<String> versionOptional = instance.version();
      if (versionOptional.isPresent()) {
        version(versionOptional);
      }
      return this;
    }

    /**
     * Initializes the value for the {@link UserConfigJsonService.UserConfigDto#username() username} attribute.
     * @param username The value for username 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder username(String username) {
      this.username = Preconditions.checkNotNull(username, "username");
      initBits &= ~INIT_BIT_USERNAME;
      return this;
    }

    /**
     * Initializes the value for the {@link UserConfigJsonService.UserConfigDto#ldap() ldap} attribute.
     * @param ldap The value for ldap 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder ldap(boolean ldap) {
      this.ldap = ldap;
      initBits &= ~INIT_BIT_LDAP;
      return this;
    }

    /**
     * Initializes the value for the {@link UserConfigJsonService.UserConfigDto#newPassword() newPassword} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link UserConfigJsonService.UserConfigDto#newPassword() newPassword}.</em>
     * @param newPassword The value for newPassword 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder newPassword(String newPassword) {
      this.newPassword = Preconditions.checkNotNull(newPassword, "newPassword");
      return this;
    }

    /**
     * Adds one element to {@link UserConfigJsonService.UserConfigDto#roles() roles} list.
     * @param element A roles element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addRoles(String element) {
      this.roles.add(element);
      return this;
    }

    /**
     * Adds elements to {@link UserConfigJsonService.UserConfigDto#roles() roles} list.
     * @param elements An array of roles elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addRoles(String... elements) {
      this.roles.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link UserConfigJsonService.UserConfigDto#roles() roles} list.
     * @param elements An iterable of roles elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder roles(Iterable<String> elements) {
      this.roles = ImmutableList.builder();
      return addAllRoles(elements);
    }

    /**
     * Adds elements to {@link UserConfigJsonService.UserConfigDto#roles() roles} list.
     * @param elements An iterable of roles elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllRoles(Iterable<String> elements) {
      this.roles.addAll(elements);
      return this;
    }

    /**
     * Initializes the optional value {@link UserConfigJsonService.UserConfigDto#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    public final Builder version(String version) {
      this.version = Optional.of(version);
      return this;
    }

    /**
     * Initializes the optional value {@link UserConfigJsonService.UserConfigDto#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    @SuppressWarnings("unchecked") // safe covariant cast
    public final Builder version(Optional<String> version) {
      this.version = (Optional<String>) version;
      return this;
    }

    /**
     * Builds a new {@link ImmutableUserConfigDto ImmutableUserConfigDto}.
     * @return An immutable instance of UserConfigDto
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableUserConfigDto build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableUserConfigDto(this);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_USERNAME) != 0) attributes.add("username");
      if ((initBits & INIT_BIT_LDAP) != 0) attributes.add("ldap");
      return "Cannot build UserConfigDto, some of required attributes are not set " + attributes;
    }
  }
}
