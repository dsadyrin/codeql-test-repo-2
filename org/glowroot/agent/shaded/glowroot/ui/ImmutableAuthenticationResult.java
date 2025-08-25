package org.glowroot.agent.shaded.glowroot.ui;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import org.glowroot.agent.shaded.google.common.collect.ImmutableSet;
import org.glowroot.agent.shaded.google.common.collect.Lists;
import java.util.List;
import java.util.Set;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link LdapAuthentication.AuthenticationResult}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAuthenticationResult.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "LdapAuthentication.AuthenticationResult"})
@Immutable
final class ImmutableAuthenticationResult
    implements LdapAuthentication.AuthenticationResult {
  private final String userDn;
  private final ImmutableSet<String> ldapGroupDns;

  private ImmutableAuthenticationResult(String userDn, ImmutableSet<String> ldapGroupDns) {
    this.userDn = userDn;
    this.ldapGroupDns = ldapGroupDns;
  }

  /**
   * @return The value of the {@code userDn} attribute
   */
  @JsonProperty("userDn")
  @Override
  public String userDn() {
    return userDn;
  }

  /**
   * @return The value of the {@code ldapGroupDns} attribute
   */
  @JsonProperty("ldapGroupDns")
  @Override
  public ImmutableSet<String> ldapGroupDns() {
    return ldapGroupDns;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LdapAuthentication.AuthenticationResult#userDn() userDn} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for userDn
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAuthenticationResult withUserDn(String value) {
    if (this.userDn.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "userDn");
    return new ImmutableAuthenticationResult(newValue, this.ldapGroupDns);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link LdapAuthentication.AuthenticationResult#ldapGroupDns() ldapGroupDns}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuthenticationResult withLdapGroupDns(String... elements) {
    ImmutableSet<String> newValue = ImmutableSet.copyOf(elements);
    return new ImmutableAuthenticationResult(this.userDn, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link LdapAuthentication.AuthenticationResult#ldapGroupDns() ldapGroupDns}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of ldapGroupDns elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuthenticationResult withLdapGroupDns(Iterable<String> elements) {
    if (this.ldapGroupDns == elements) return this;
    ImmutableSet<String> newValue = ImmutableSet.copyOf(elements);
    return new ImmutableAuthenticationResult(this.userDn, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAuthenticationResult} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAuthenticationResult
        && equalTo((ImmutableAuthenticationResult) another);
  }

  private boolean equalTo(ImmutableAuthenticationResult another) {
    return userDn.equals(another.userDn)
        && ldapGroupDns.equals(another.ldapGroupDns);
  }

  /**
   * Computes a hash code from attributes: {@code userDn}, {@code ldapGroupDns}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + userDn.hashCode();
    h += (h << 5) + ldapGroupDns.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code AuthenticationResult} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("AuthenticationResult")
        .omitNullValues()
        .add("userDn", userDn)
        .add("ldapGroupDns", ldapGroupDns)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements LdapAuthentication.AuthenticationResult {
    @Nullable String userDn;
    Set<String> ldapGroupDns = ImmutableSet.of();
    @JsonProperty("userDn")
    public void setUserDn(String userDn) {
      this.userDn = userDn;
    }
    @JsonProperty("ldapGroupDns")
    public void setLdapGroupDns(Set<String> ldapGroupDns) {
      this.ldapGroupDns = ldapGroupDns;
    }
    @Override
    public String userDn() { throw new UnsupportedOperationException(); }
    @Override
    public Set<String> ldapGroupDns() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableAuthenticationResult fromJson(Json json) {
    ImmutableAuthenticationResult.Builder builder = ImmutableAuthenticationResult.builder();
    if (json.userDn != null) {
      builder.userDn(json.userDn);
    }
    if (json.ldapGroupDns != null) {
      builder.addAllLdapGroupDns(json.ldapGroupDns);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link LdapAuthentication.AuthenticationResult} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable AuthenticationResult instance
   */
  public static ImmutableAuthenticationResult copyOf(LdapAuthentication.AuthenticationResult instance) {
    if (instance instanceof ImmutableAuthenticationResult) {
      return (ImmutableAuthenticationResult) instance;
    }
    return ImmutableAuthenticationResult.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableAuthenticationResult ImmutableAuthenticationResult}.
   * @return A new ImmutableAuthenticationResult builder
   */
  public static ImmutableAuthenticationResult.Builder builder() {
    return new ImmutableAuthenticationResult.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableAuthenticationResult ImmutableAuthenticationResult}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_USER_DN = 0x1L;
    private long initBits = 0x1L;

    private @Nullable String userDn;
    private ImmutableSet.Builder<String> ldapGroupDns = ImmutableSet.builder();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code AuthenticationResult} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(LdapAuthentication.AuthenticationResult instance) {
      Preconditions.checkNotNull(instance, "instance");
      userDn(instance.userDn());
      addAllLdapGroupDns(instance.ldapGroupDns());
      return this;
    }

    /**
     * Initializes the value for the {@link LdapAuthentication.AuthenticationResult#userDn() userDn} attribute.
     * @param userDn The value for userDn 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder userDn(String userDn) {
      this.userDn = Preconditions.checkNotNull(userDn, "userDn");
      initBits &= ~INIT_BIT_USER_DN;
      return this;
    }

    /**
     * Adds one element to {@link LdapAuthentication.AuthenticationResult#ldapGroupDns() ldapGroupDns} set.
     * @param element A ldapGroupDns element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addLdapGroupDns(String element) {
      this.ldapGroupDns.add(element);
      return this;
    }

    /**
     * Adds elements to {@link LdapAuthentication.AuthenticationResult#ldapGroupDns() ldapGroupDns} set.
     * @param elements An array of ldapGroupDns elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addLdapGroupDns(String... elements) {
      this.ldapGroupDns.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link LdapAuthentication.AuthenticationResult#ldapGroupDns() ldapGroupDns} set.
     * @param elements An iterable of ldapGroupDns elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder ldapGroupDns(Iterable<String> elements) {
      this.ldapGroupDns = ImmutableSet.builder();
      return addAllLdapGroupDns(elements);
    }

    /**
     * Adds elements to {@link LdapAuthentication.AuthenticationResult#ldapGroupDns() ldapGroupDns} set.
     * @param elements An iterable of ldapGroupDns elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllLdapGroupDns(Iterable<String> elements) {
      this.ldapGroupDns.addAll(elements);
      return this;
    }

    /**
     * Builds a new {@link ImmutableAuthenticationResult ImmutableAuthenticationResult}.
     * @return An immutable instance of AuthenticationResult
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableAuthenticationResult build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableAuthenticationResult(userDn, ldapGroupDns.build());
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_USER_DN) != 0) attributes.add("userDn");
      return "Cannot build AuthenticationResult, some of required attributes are not set " + attributes;
    }
  }
}
