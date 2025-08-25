package org.glowroot.agent.shaded.glowroot.ui;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import org.glowroot.agent.shaded.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link CommonHandler.Credentials}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCredentials.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "CommonHandler.Credentials"})
@Immutable
final class ImmutableCredentials implements CommonHandler.Credentials {
  private final String username;
  private final String password;

  private ImmutableCredentials(String username, String password) {
    this.username = username;
    this.password = password;
  }

  /**
   * @return The value of the {@code username} attribute
   */
  @JsonProperty("username")
  @Override
  public String username() {
    return username;
  }

  /**
   * @return The value of the {@code password} attribute
   */
  @JsonProperty("password")
  @Override
  public String password() {
    return password;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CommonHandler.Credentials#username() username} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for username
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCredentials withUsername(String value) {
    if (this.username.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "username");
    return new ImmutableCredentials(newValue, this.password);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CommonHandler.Credentials#password() password} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for password
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCredentials withPassword(String value) {
    if (this.password.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "password");
    return new ImmutableCredentials(this.username, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCredentials} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCredentials
        && equalTo((ImmutableCredentials) another);
  }

  private boolean equalTo(ImmutableCredentials another) {
    return username.equals(another.username)
        && password.equals(another.password);
  }

  /**
   * Computes a hash code from attributes: {@code username}, {@code password}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + username.hashCode();
    h += (h << 5) + password.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Credentials} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("Credentials")
        .omitNullValues()
        .add("username", username)
        .add("password", password)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements CommonHandler.Credentials {
    @Nullable String username;
    @Nullable String password;
    @JsonProperty("username")
    public void setUsername(String username) {
      this.username = username;
    }
    @JsonProperty("password")
    public void setPassword(String password) {
      this.password = password;
    }
    @Override
    public String username() { throw new UnsupportedOperationException(); }
    @Override
    public String password() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableCredentials fromJson(Json json) {
    ImmutableCredentials.Builder builder = ImmutableCredentials.builder();
    if (json.username != null) {
      builder.username(json.username);
    }
    if (json.password != null) {
      builder.password(json.password);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link CommonHandler.Credentials} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Credentials instance
   */
  public static ImmutableCredentials copyOf(CommonHandler.Credentials instance) {
    if (instance instanceof ImmutableCredentials) {
      return (ImmutableCredentials) instance;
    }
    return ImmutableCredentials.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableCredentials ImmutableCredentials}.
   * @return A new ImmutableCredentials builder
   */
  public static ImmutableCredentials.Builder builder() {
    return new ImmutableCredentials.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableCredentials ImmutableCredentials}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_USERNAME = 0x1L;
    private static final long INIT_BIT_PASSWORD = 0x2L;
    private long initBits = 0x3L;

    private @Nullable String username;
    private @Nullable String password;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Credentials} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(CommonHandler.Credentials instance) {
      Preconditions.checkNotNull(instance, "instance");
      username(instance.username());
      password(instance.password());
      return this;
    }

    /**
     * Initializes the value for the {@link CommonHandler.Credentials#username() username} attribute.
     * @param username The value for username 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder username(String username) {
      this.username = Preconditions.checkNotNull(username, "username");
      initBits &= ~INIT_BIT_USERNAME;
      return this;
    }

    /**
     * Initializes the value for the {@link CommonHandler.Credentials#password() password} attribute.
     * @param password The value for password 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder password(String password) {
      this.password = Preconditions.checkNotNull(password, "password");
      initBits &= ~INIT_BIT_PASSWORD;
      return this;
    }

    /**
     * Builds a new {@link ImmutableCredentials ImmutableCredentials}.
     * @return An immutable instance of Credentials
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableCredentials build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableCredentials(username, password);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_USERNAME) != 0) attributes.add("username");
      if ((initBits & INIT_BIT_PASSWORD) != 0) attributes.add("password");
      return "Cannot build Credentials, some of required attributes are not set " + attributes;
    }
  }
}
