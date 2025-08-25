package org.glowroot.agent.shaded.glowroot.ui;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
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
 * Immutable implementation of {@link UserConfigJsonService.UserConfigResponse}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableUserConfigResponse.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "UserConfigJsonService.UserConfigResponse"})
@Immutable
final class ImmutableUserConfigResponse
    implements UserConfigJsonService.UserConfigResponse {
  private final UserConfigJsonService.UserConfigDto config;
  private final ImmutableList<String> allRoles;
  private final boolean ldapAvailable;

  private ImmutableUserConfigResponse(
      UserConfigJsonService.UserConfigDto config,
      ImmutableList<String> allRoles,
      boolean ldapAvailable) {
    this.config = config;
    this.allRoles = allRoles;
    this.ldapAvailable = ldapAvailable;
  }

  /**
   * @return The value of the {@code config} attribute
   */
  @JsonProperty("config")
  @Override
  public UserConfigJsonService.UserConfigDto config() {
    return config;
  }

  /**
   * @return The value of the {@code allRoles} attribute
   */
  @JsonProperty("allRoles")
  @Override
  public ImmutableList<String> allRoles() {
    return allRoles;
  }

  /**
   * @return The value of the {@code ldapAvailable} attribute
   */
  @JsonProperty("ldapAvailable")
  @Override
  public boolean ldapAvailable() {
    return ldapAvailable;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link UserConfigJsonService.UserConfigResponse#config() config} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for config
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableUserConfigResponse withConfig(UserConfigJsonService.UserConfigDto value) {
    if (this.config == value) return this;
    UserConfigJsonService.UserConfigDto newValue = Preconditions.checkNotNull(value, "config");
    return new ImmutableUserConfigResponse(newValue, this.allRoles, this.ldapAvailable);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link UserConfigJsonService.UserConfigResponse#allRoles() allRoles}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUserConfigResponse withAllRoles(String... elements) {
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableUserConfigResponse(this.config, newValue, this.ldapAvailable);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link UserConfigJsonService.UserConfigResponse#allRoles() allRoles}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of allRoles elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUserConfigResponse withAllRoles(Iterable<String> elements) {
    if (this.allRoles == elements) return this;
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableUserConfigResponse(this.config, newValue, this.ldapAvailable);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link UserConfigJsonService.UserConfigResponse#ldapAvailable() ldapAvailable} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for ldapAvailable
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableUserConfigResponse withLdapAvailable(boolean value) {
    if (this.ldapAvailable == value) return this;
    return new ImmutableUserConfigResponse(this.config, this.allRoles, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableUserConfigResponse} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableUserConfigResponse
        && equalTo((ImmutableUserConfigResponse) another);
  }

  private boolean equalTo(ImmutableUserConfigResponse another) {
    return config.equals(another.config)
        && allRoles.equals(another.allRoles)
        && ldapAvailable == another.ldapAvailable;
  }

  /**
   * Computes a hash code from attributes: {@code config}, {@code allRoles}, {@code ldapAvailable}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + config.hashCode();
    h += (h << 5) + allRoles.hashCode();
    h += (h << 5) + Booleans.hashCode(ldapAvailable);
    return h;
  }

  /**
   * Prints the immutable value {@code UserConfigResponse} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("UserConfigResponse")
        .omitNullValues()
        .add("config", config)
        .add("allRoles", allRoles)
        .add("ldapAvailable", ldapAvailable)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements UserConfigJsonService.UserConfigResponse {
    @Nullable UserConfigJsonService.UserConfigDto config;
    ImmutableList<String> allRoles = ImmutableList.of();
    boolean ldapAvailable;
    boolean ldapAvailableIsSet;
    @JsonProperty("config")
    public void setConfig(UserConfigJsonService.UserConfigDto config) {
      this.config = config;
    }
    @JsonProperty("allRoles")
    public void setAllRoles(ImmutableList<String> allRoles) {
      this.allRoles = allRoles;
    }
    @JsonProperty("ldapAvailable")
    public void setLdapAvailable(boolean ldapAvailable) {
      this.ldapAvailable = ldapAvailable;
      this.ldapAvailableIsSet = true;
    }
    @Override
    public UserConfigJsonService.UserConfigDto config() { throw new UnsupportedOperationException(); }
    @Override
    public ImmutableList<String> allRoles() { throw new UnsupportedOperationException(); }
    @Override
    public boolean ldapAvailable() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableUserConfigResponse fromJson(Json json) {
    ImmutableUserConfigResponse.Builder builder = ImmutableUserConfigResponse.builder();
    if (json.config != null) {
      builder.config(json.config);
    }
    if (json.allRoles != null) {
      builder.addAllAllRoles(json.allRoles);
    }
    if (json.ldapAvailableIsSet) {
      builder.ldapAvailable(json.ldapAvailable);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link UserConfigJsonService.UserConfigResponse} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable UserConfigResponse instance
   */
  public static ImmutableUserConfigResponse copyOf(UserConfigJsonService.UserConfigResponse instance) {
    if (instance instanceof ImmutableUserConfigResponse) {
      return (ImmutableUserConfigResponse) instance;
    }
    return ImmutableUserConfigResponse.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableUserConfigResponse ImmutableUserConfigResponse}.
   * @return A new ImmutableUserConfigResponse builder
   */
  public static ImmutableUserConfigResponse.Builder builder() {
    return new ImmutableUserConfigResponse.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableUserConfigResponse ImmutableUserConfigResponse}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_CONFIG = 0x1L;
    private static final long INIT_BIT_LDAP_AVAILABLE = 0x2L;
    private long initBits = 0x3L;

    private @Nullable UserConfigJsonService.UserConfigDto config;
    private ImmutableList.Builder<String> allRoles = ImmutableList.builder();
    private boolean ldapAvailable;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code UserConfigResponse} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(UserConfigJsonService.UserConfigResponse instance) {
      Preconditions.checkNotNull(instance, "instance");
      config(instance.config());
      addAllAllRoles(instance.allRoles());
      ldapAvailable(instance.ldapAvailable());
      return this;
    }

    /**
     * Initializes the value for the {@link UserConfigJsonService.UserConfigResponse#config() config} attribute.
     * @param config The value for config 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder config(UserConfigJsonService.UserConfigDto config) {
      this.config = Preconditions.checkNotNull(config, "config");
      initBits &= ~INIT_BIT_CONFIG;
      return this;
    }

    /**
     * Adds one element to {@link UserConfigJsonService.UserConfigResponse#allRoles() allRoles} list.
     * @param element A allRoles element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllRoles(String element) {
      this.allRoles.add(element);
      return this;
    }

    /**
     * Adds elements to {@link UserConfigJsonService.UserConfigResponse#allRoles() allRoles} list.
     * @param elements An array of allRoles elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllRoles(String... elements) {
      this.allRoles.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link UserConfigJsonService.UserConfigResponse#allRoles() allRoles} list.
     * @param elements An iterable of allRoles elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder allRoles(Iterable<String> elements) {
      this.allRoles = ImmutableList.builder();
      return addAllAllRoles(elements);
    }

    /**
     * Adds elements to {@link UserConfigJsonService.UserConfigResponse#allRoles() allRoles} list.
     * @param elements An iterable of allRoles elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllAllRoles(Iterable<String> elements) {
      this.allRoles.addAll(elements);
      return this;
    }

    /**
     * Initializes the value for the {@link UserConfigJsonService.UserConfigResponse#ldapAvailable() ldapAvailable} attribute.
     * @param ldapAvailable The value for ldapAvailable 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder ldapAvailable(boolean ldapAvailable) {
      this.ldapAvailable = ldapAvailable;
      initBits &= ~INIT_BIT_LDAP_AVAILABLE;
      return this;
    }

    /**
     * Builds a new {@link ImmutableUserConfigResponse ImmutableUserConfigResponse}.
     * @return An immutable instance of UserConfigResponse
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableUserConfigResponse build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableUserConfigResponse(config, allRoles.build(), ldapAvailable);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_CONFIG) != 0) attributes.add("config");
      if ((initBits & INIT_BIT_LDAP_AVAILABLE) != 0) attributes.add("ldapAvailable");
      return "Cannot build UserConfigResponse, some of required attributes are not set " + attributes;
    }
  }
}
