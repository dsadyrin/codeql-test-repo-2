package org.glowroot.agent.shaded.glowroot.ui;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import org.glowroot.agent.shaded.google.common.collect.ImmutableList;
import org.glowroot.agent.shaded.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link AdminJsonService.LdapConfigResponse}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableLdapConfigResponse.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "AdminJsonService.LdapConfigResponse"})
@Immutable
final class ImmutableLdapConfigResponse implements AdminJsonService.LdapConfigResponse {
  private final AdminJsonService.LdapConfigDto config;
  private final ImmutableList<String> allGlowrootRoles;

  private ImmutableLdapConfigResponse(
      AdminJsonService.LdapConfigDto config,
      ImmutableList<String> allGlowrootRoles) {
    this.config = config;
    this.allGlowrootRoles = allGlowrootRoles;
  }

  /**
   * @return The value of the {@code config} attribute
   */
  @JsonProperty("config")
  @Override
  public AdminJsonService.LdapConfigDto config() {
    return config;
  }

  /**
   * @return The value of the {@code allGlowrootRoles} attribute
   */
  @JsonProperty("allGlowrootRoles")
  @Override
  public ImmutableList<String> allGlowrootRoles() {
    return allGlowrootRoles;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AdminJsonService.LdapConfigResponse#config() config} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for config
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLdapConfigResponse withConfig(AdminJsonService.LdapConfigDto value) {
    if (this.config == value) return this;
    AdminJsonService.LdapConfigDto newValue = Preconditions.checkNotNull(value, "config");
    return new ImmutableLdapConfigResponse(newValue, this.allGlowrootRoles);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link AdminJsonService.LdapConfigResponse#allGlowrootRoles() allGlowrootRoles}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLdapConfigResponse withAllGlowrootRoles(String... elements) {
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableLdapConfigResponse(this.config, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link AdminJsonService.LdapConfigResponse#allGlowrootRoles() allGlowrootRoles}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of allGlowrootRoles elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLdapConfigResponse withAllGlowrootRoles(Iterable<String> elements) {
    if (this.allGlowrootRoles == elements) return this;
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableLdapConfigResponse(this.config, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableLdapConfigResponse} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableLdapConfigResponse
        && equalTo((ImmutableLdapConfigResponse) another);
  }

  private boolean equalTo(ImmutableLdapConfigResponse another) {
    return config.equals(another.config)
        && allGlowrootRoles.equals(another.allGlowrootRoles);
  }

  /**
   * Computes a hash code from attributes: {@code config}, {@code allGlowrootRoles}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + config.hashCode();
    h += (h << 5) + allGlowrootRoles.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code LdapConfigResponse} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("LdapConfigResponse")
        .omitNullValues()
        .add("config", config)
        .add("allGlowrootRoles", allGlowrootRoles)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements AdminJsonService.LdapConfigResponse {
    @Nullable AdminJsonService.LdapConfigDto config;
    List<String> allGlowrootRoles = ImmutableList.of();
    @JsonProperty("config")
    public void setConfig(AdminJsonService.LdapConfigDto config) {
      this.config = config;
    }
    @JsonProperty("allGlowrootRoles")
    public void setAllGlowrootRoles(List<String> allGlowrootRoles) {
      this.allGlowrootRoles = allGlowrootRoles;
    }
    @Override
    public AdminJsonService.LdapConfigDto config() { throw new UnsupportedOperationException(); }
    @Override
    public List<String> allGlowrootRoles() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableLdapConfigResponse fromJson(Json json) {
    ImmutableLdapConfigResponse.Builder builder = ImmutableLdapConfigResponse.builder();
    if (json.config != null) {
      builder.config(json.config);
    }
    if (json.allGlowrootRoles != null) {
      builder.addAllAllGlowrootRoles(json.allGlowrootRoles);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link AdminJsonService.LdapConfigResponse} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable LdapConfigResponse instance
   */
  public static ImmutableLdapConfigResponse copyOf(AdminJsonService.LdapConfigResponse instance) {
    if (instance instanceof ImmutableLdapConfigResponse) {
      return (ImmutableLdapConfigResponse) instance;
    }
    return ImmutableLdapConfigResponse.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableLdapConfigResponse ImmutableLdapConfigResponse}.
   * @return A new ImmutableLdapConfigResponse builder
   */
  public static ImmutableLdapConfigResponse.Builder builder() {
    return new ImmutableLdapConfigResponse.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableLdapConfigResponse ImmutableLdapConfigResponse}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_CONFIG = 0x1L;
    private long initBits = 0x1L;

    private @Nullable AdminJsonService.LdapConfigDto config;
    private ImmutableList.Builder<String> allGlowrootRoles = ImmutableList.builder();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code LdapConfigResponse} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(AdminJsonService.LdapConfigResponse instance) {
      Preconditions.checkNotNull(instance, "instance");
      config(instance.config());
      addAllAllGlowrootRoles(instance.allGlowrootRoles());
      return this;
    }

    /**
     * Initializes the value for the {@link AdminJsonService.LdapConfigResponse#config() config} attribute.
     * @param config The value for config 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder config(AdminJsonService.LdapConfigDto config) {
      this.config = Preconditions.checkNotNull(config, "config");
      initBits &= ~INIT_BIT_CONFIG;
      return this;
    }

    /**
     * Adds one element to {@link AdminJsonService.LdapConfigResponse#allGlowrootRoles() allGlowrootRoles} list.
     * @param element A allGlowrootRoles element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllGlowrootRoles(String element) {
      this.allGlowrootRoles.add(element);
      return this;
    }

    /**
     * Adds elements to {@link AdminJsonService.LdapConfigResponse#allGlowrootRoles() allGlowrootRoles} list.
     * @param elements An array of allGlowrootRoles elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllGlowrootRoles(String... elements) {
      this.allGlowrootRoles.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link AdminJsonService.LdapConfigResponse#allGlowrootRoles() allGlowrootRoles} list.
     * @param elements An iterable of allGlowrootRoles elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder allGlowrootRoles(Iterable<String> elements) {
      this.allGlowrootRoles = ImmutableList.builder();
      return addAllAllGlowrootRoles(elements);
    }

    /**
     * Adds elements to {@link AdminJsonService.LdapConfigResponse#allGlowrootRoles() allGlowrootRoles} list.
     * @param elements An iterable of allGlowrootRoles elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllAllGlowrootRoles(Iterable<String> elements) {
      this.allGlowrootRoles.addAll(elements);
      return this;
    }

    /**
     * Builds a new {@link ImmutableLdapConfigResponse ImmutableLdapConfigResponse}.
     * @return An immutable instance of LdapConfigResponse
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableLdapConfigResponse build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableLdapConfigResponse(config, allGlowrootRoles.build());
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_CONFIG) != 0) attributes.add("config");
      return "Cannot build LdapConfigResponse, some of required attributes are not set " + attributes;
    }
  }
}
