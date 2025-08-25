package org.glowroot.agent.shaded.glowroot.ui;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import org.glowroot.agent.shaded.google.common.collect.ImmutableSet;
import org.glowroot.agent.shaded.google.common.collect.Lists;
import org.glowroot.agent.shaded.google.common.primitives.Booleans;
import org.glowroot.agent.shaded.google.common.primitives.Longs;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link HttpSessionManager.Session}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSession.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "HttpSessionManager.Session"})
@Immutable
final class ImmutableSession
    extends HttpSessionManager.Session
    implements Serializable {
  private final String caseAmbiguousUsername;
  private final boolean ldap;
  private final ImmutableSet<String> roles;
  private final long lastRequest;

  private ImmutableSession(
      String caseAmbiguousUsername,
      boolean ldap,
      ImmutableSet<String> roles,
      long lastRequest) {
    this.caseAmbiguousUsername = caseAmbiguousUsername;
    this.ldap = ldap;
    this.roles = roles;
    this.lastRequest = lastRequest;
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
   * @return The value of the {@code ldap} attribute
   */
  @JsonProperty("ldap")
  @Override
  boolean ldap() {
    return ldap;
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
   * @return The value of the {@code lastRequest} attribute
   */
  @JsonProperty("lastRequest")
  @Override
  long lastRequest() {
    return lastRequest;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link HttpSessionManager.Session#caseAmbiguousUsername() caseAmbiguousUsername} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for caseAmbiguousUsername
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSession withCaseAmbiguousUsername(String value) {
    if (this.caseAmbiguousUsername.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "caseAmbiguousUsername");
    return new ImmutableSession(newValue, this.ldap, this.roles, this.lastRequest);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link HttpSessionManager.Session#ldap() ldap} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for ldap
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSession withLdap(boolean value) {
    if (this.ldap == value) return this;
    return new ImmutableSession(this.caseAmbiguousUsername, value, this.roles, this.lastRequest);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link HttpSessionManager.Session#roles() roles}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSession withRoles(String... elements) {
    ImmutableSet<String> newValue = ImmutableSet.copyOf(elements);
    return new ImmutableSession(this.caseAmbiguousUsername, this.ldap, newValue, this.lastRequest);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link HttpSessionManager.Session#roles() roles}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of roles elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSession withRoles(Iterable<String> elements) {
    if (this.roles == elements) return this;
    ImmutableSet<String> newValue = ImmutableSet.copyOf(elements);
    return new ImmutableSession(this.caseAmbiguousUsername, this.ldap, newValue, this.lastRequest);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link HttpSessionManager.Session#lastRequest() lastRequest} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lastRequest
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSession withLastRequest(long value) {
    if (this.lastRequest == value) return this;
    return new ImmutableSession(this.caseAmbiguousUsername, this.ldap, this.roles, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSession} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSession
        && equalTo((ImmutableSession) another);
  }

  private boolean equalTo(ImmutableSession another) {
    return caseAmbiguousUsername.equals(another.caseAmbiguousUsername)
        && ldap == another.ldap
        && roles.equals(another.roles)
        && lastRequest == another.lastRequest;
  }

  /**
   * Computes a hash code from attributes: {@code caseAmbiguousUsername}, {@code ldap}, {@code roles}, {@code lastRequest}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + caseAmbiguousUsername.hashCode();
    h += (h << 5) + Booleans.hashCode(ldap);
    h += (h << 5) + roles.hashCode();
    h += (h << 5) + Longs.hashCode(lastRequest);
    return h;
  }

  /**
   * Prints the immutable value {@code Session} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("Session")
        .omitNullValues()
        .add("caseAmbiguousUsername", caseAmbiguousUsername)
        .add("ldap", ldap)
        .add("roles", roles)
        .add("lastRequest", lastRequest)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends HttpSessionManager.Session implements Serializable {
    @Nullable String caseAmbiguousUsername;
    boolean ldap;
    boolean ldapIsSet;
    Set<String> roles = ImmutableSet.of();
    long lastRequest;
    boolean lastRequestIsSet;
    @JsonProperty("caseAmbiguousUsername")
    public void setCaseAmbiguousUsername(String caseAmbiguousUsername) {
      this.caseAmbiguousUsername = caseAmbiguousUsername;
    }
    @JsonProperty("ldap")
    public void setLdap(boolean ldap) {
      this.ldap = ldap;
      this.ldapIsSet = true;
    }
    @JsonProperty("roles")
    public void setRoles(Set<String> roles) {
      this.roles = roles;
    }
    @JsonProperty("lastRequest")
    public void setLastRequest(long lastRequest) {
      this.lastRequest = lastRequest;
      this.lastRequestIsSet = true;
    }
    @Override
    String caseAmbiguousUsername() { throw new UnsupportedOperationException(); }
    @Override
    boolean ldap() { throw new UnsupportedOperationException(); }
    @Override
    Set<String> roles() { throw new UnsupportedOperationException(); }
    @Override
    long lastRequest() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableSession fromJson(Json json) {
    ImmutableSession.Builder builder = ImmutableSession.builder();
    if (json.caseAmbiguousUsername != null) {
      builder.caseAmbiguousUsername(json.caseAmbiguousUsername);
    }
    if (json.ldapIsSet) {
      builder.ldap(json.ldap);
    }
    if (json.roles != null) {
      builder.addAllRoles(json.roles);
    }
    if (json.lastRequestIsSet) {
      builder.lastRequest(json.lastRequest);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link HttpSessionManager.Session} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Session instance
   */
  public static ImmutableSession copyOf(HttpSessionManager.Session instance) {
    if (instance instanceof ImmutableSession) {
      return (ImmutableSession) instance;
    }
    return ImmutableSession.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * The serialized form captures the structural content of the value object,
   * providing the ability to reconstruct values with the capability to migrate
   * data. Uses optional, nullable, and provides flexible handling of
   * collection attributes.
   */
  private static class SerialForm implements Serializable {
    private static final long serialVersionUID = 0L;
    private final String[] names;
    private final Object[] values;
    SerialForm(ImmutableSession instance) {
      List<String> names = new ArrayList<String>(4);
      List<Object> values = new ArrayList<Object>(4);
      names.add("caseAmbiguousUsername");
      values.add(instance.caseAmbiguousUsername());
      names.add("ldap");
      values.add(instance.ldap());
      if (!instance.roles().isEmpty()) {
        names.add("roles");
        values.add(instance.roles().toArray());
      }
      names.add("lastRequest");
      values.add(instance.lastRequest());
      this.names = names.toArray(new String[names.size()]);
      this.values = values.toArray();
    }

    Object readResolve() {
      ImmutableSession.Builder builder = ImmutableSession.builder();

      for (int i = 0; i < names.length; i++) {
        String name = names[i];
        if ("caseAmbiguousUsername".equals(name)) {
          builder.caseAmbiguousUsername((String) toSingle("caseAmbiguousUsername", values[i]));
          continue;
        }
        if ("ldap".equals(name)) {
          builder.ldap((Boolean) toSingle("ldap", values[i]));
          continue;
        }
        if ("roles".equals(name)) {
          for (Object e : toArray(values[i])) {
            builder.addRoles((String) e);
          }
          continue;
        }
        if ("lastRequest".equals(name)) {
          builder.lastRequest((Long) toSingle("lastRequest", values[i]));
          continue;
        }
      }
      return builder.build();
    }

    private static Object toSingle(String attribute, Object value) {
      if (value instanceof Object[]) {
        Object[] elements = (Object[]) value;
        if (elements.length == 1) {
          return elements[0];
        }
        throw new IllegalStateException("Cannot extract scalar value for attribute '"
            + attribute + "' from array of length " + elements.length);
      }
      return value;
    }

    private static Object[] toArray(@Nullable  Object value) {
      if (value == null) {
        return new Object[]{};
      }
      if (value instanceof Object[]) {
        return (Object[]) value;
      }
      return new Object[]{ value };
    }
  }

  private Object writeReplace() {
    return new SerialForm(this);
  }

  /**
   * Creates a builder for {@link ImmutableSession ImmutableSession}.
   * @return A new ImmutableSession builder
   */
  public static ImmutableSession.Builder builder() {
    return new ImmutableSession.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableSession ImmutableSession}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_CASE_AMBIGUOUS_USERNAME = 0x1L;
    private static final long INIT_BIT_LDAP = 0x2L;
    private static final long INIT_BIT_LAST_REQUEST = 0x4L;
    private long initBits = 0x7L;

    private @Nullable String caseAmbiguousUsername;
    private boolean ldap;
    private ImmutableSet.Builder<String> roles = ImmutableSet.builder();
    private long lastRequest;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Session} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(HttpSessionManager.Session instance) {
      Preconditions.checkNotNull(instance, "instance");
      caseAmbiguousUsername(instance.caseAmbiguousUsername());
      ldap(instance.ldap());
      addAllRoles(instance.roles());
      lastRequest(instance.lastRequest());
      return this;
    }

    /**
     * Initializes the value for the {@link HttpSessionManager.Session#caseAmbiguousUsername() caseAmbiguousUsername} attribute.
     * @param caseAmbiguousUsername The value for caseAmbiguousUsername 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder caseAmbiguousUsername(String caseAmbiguousUsername) {
      this.caseAmbiguousUsername = Preconditions.checkNotNull(caseAmbiguousUsername, "caseAmbiguousUsername");
      initBits &= ~INIT_BIT_CASE_AMBIGUOUS_USERNAME;
      return this;
    }

    /**
     * Initializes the value for the {@link HttpSessionManager.Session#ldap() ldap} attribute.
     * @param ldap The value for ldap 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder ldap(boolean ldap) {
      this.ldap = ldap;
      initBits &= ~INIT_BIT_LDAP;
      return this;
    }

    /**
     * Adds one element to {@link HttpSessionManager.Session#roles() roles} set.
     * @param element A roles element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addRoles(String element) {
      this.roles.add(element);
      return this;
    }

    /**
     * Adds elements to {@link HttpSessionManager.Session#roles() roles} set.
     * @param elements An array of roles elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addRoles(String... elements) {
      this.roles.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link HttpSessionManager.Session#roles() roles} set.
     * @param elements An iterable of roles elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder roles(Iterable<String> elements) {
      this.roles = ImmutableSet.builder();
      return addAllRoles(elements);
    }

    /**
     * Adds elements to {@link HttpSessionManager.Session#roles() roles} set.
     * @param elements An iterable of roles elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllRoles(Iterable<String> elements) {
      this.roles.addAll(elements);
      return this;
    }

    /**
     * Initializes the value for the {@link HttpSessionManager.Session#lastRequest() lastRequest} attribute.
     * @param lastRequest The value for lastRequest 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder lastRequest(long lastRequest) {
      this.lastRequest = lastRequest;
      initBits &= ~INIT_BIT_LAST_REQUEST;
      return this;
    }

    /**
     * Builds a new {@link ImmutableSession ImmutableSession}.
     * @return An immutable instance of Session
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableSession build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableSession(caseAmbiguousUsername, ldap, roles.build(), lastRequest);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_CASE_AMBIGUOUS_USERNAME) != 0) attributes.add("caseAmbiguousUsername");
      if ((initBits & INIT_BIT_LDAP) != 0) attributes.add("ldap");
      if ((initBits & INIT_BIT_LAST_REQUEST) != 0) attributes.add("lastRequest");
      return "Cannot build Session, some of required attributes are not set " + attributes;
    }
  }
}
