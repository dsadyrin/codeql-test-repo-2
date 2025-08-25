package org.glowroot.agent.config;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonInclude;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Objects;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import org.glowroot.agent.shaded.google.common.collect.ImmutableList;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link UserRecordingConfig}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableUserRecordingConfig.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "UserRecordingConfig"})
@Immutable
public final class ImmutableUserRecordingConfig extends UserRecordingConfig {
  private final ImmutableList<String> users;
  private final @Nullable Integer profilingIntervalMillis;

  private ImmutableUserRecordingConfig(
      ImmutableList<String> users,
      @Nullable Integer profilingIntervalMillis) {
    this.users = users;
    this.profilingIntervalMillis = profilingIntervalMillis;
  }

  /**
   * @return The value of the {@code users} attribute
   */
  @JsonProperty("users")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @Override
  public ImmutableList<String> users() {
    return users;
  }

  /**
   * @return The value of the {@code profilingIntervalMillis} attribute
   */
  @JsonProperty("profilingIntervalMillis")
  @JsonInclude(JsonInclude.Include.NON_NULL)
  @Override
  public @Nullable Integer profilingIntervalMillis() {
    return profilingIntervalMillis;
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link UserRecordingConfig#users() users}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUserRecordingConfig withUsers(String... elements) {
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableUserRecordingConfig(newValue, this.profilingIntervalMillis);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link UserRecordingConfig#users() users}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of users elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUserRecordingConfig withUsers(Iterable<String> elements) {
    if (this.users == elements) return this;
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableUserRecordingConfig(newValue, this.profilingIntervalMillis);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link UserRecordingConfig#profilingIntervalMillis() profilingIntervalMillis} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for profilingIntervalMillis (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableUserRecordingConfig withProfilingIntervalMillis(@Nullable Integer value) {
    if (Objects.equal(this.profilingIntervalMillis, value)) return this;
    return new ImmutableUserRecordingConfig(this.users, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableUserRecordingConfig} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableUserRecordingConfig
        && equalTo((ImmutableUserRecordingConfig) another);
  }

  private boolean equalTo(ImmutableUserRecordingConfig another) {
    return users.equals(another.users)
        && Objects.equal(profilingIntervalMillis, another.profilingIntervalMillis);
  }

  /**
   * Computes a hash code from attributes: {@code users}, {@code profilingIntervalMillis}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + users.hashCode();
    h += (h << 5) + Objects.hashCode(profilingIntervalMillis);
    return h;
  }

  /**
   * Prints the immutable value {@code UserRecordingConfig} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("UserRecordingConfig")
        .omitNullValues()
        .add("users", users)
        .add("profilingIntervalMillis", profilingIntervalMillis)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends UserRecordingConfig {
    ImmutableList<String> users = ImmutableList.of();
    @Nullable Integer profilingIntervalMillis;
    @JsonProperty("users")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public void setUsers(ImmutableList<String> users) {
      this.users = users;
    }
    @JsonProperty("profilingIntervalMillis")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public void setProfilingIntervalMillis(@Nullable Integer profilingIntervalMillis) {
      this.profilingIntervalMillis = profilingIntervalMillis;
    }
    @Override
    public ImmutableList<String> users() { throw new UnsupportedOperationException(); }
    @Override
    public Integer profilingIntervalMillis() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableUserRecordingConfig fromJson(Json json) {
    ImmutableUserRecordingConfig.Builder builder = ImmutableUserRecordingConfig.builder();
    if (json.users != null) {
      builder.addAllUsers(json.users);
    }
    if (json.profilingIntervalMillis != null) {
      builder.profilingIntervalMillis(json.profilingIntervalMillis);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link UserRecordingConfig} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable UserRecordingConfig instance
   */
  public static ImmutableUserRecordingConfig copyOf(UserRecordingConfig instance) {
    if (instance instanceof ImmutableUserRecordingConfig) {
      return (ImmutableUserRecordingConfig) instance;
    }
    return ImmutableUserRecordingConfig.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableUserRecordingConfig ImmutableUserRecordingConfig}.
   * @return A new ImmutableUserRecordingConfig builder
   */
  public static ImmutableUserRecordingConfig.Builder builder() {
    return new ImmutableUserRecordingConfig.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableUserRecordingConfig ImmutableUserRecordingConfig}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private ImmutableList.Builder<String> users = ImmutableList.builder();
    private @Nullable Integer profilingIntervalMillis;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code UserRecordingConfig} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(UserRecordingConfig instance) {
      Preconditions.checkNotNull(instance, "instance");
      addAllUsers(instance.users());
      @Nullable Integer profilingIntervalMillisValue = instance.profilingIntervalMillis();
      if (profilingIntervalMillisValue != null) {
        profilingIntervalMillis(profilingIntervalMillisValue);
      }
      return this;
    }

    /**
     * Adds one element to {@link UserRecordingConfig#users() users} list.
     * @param element A users element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addUsers(String element) {
      this.users.add(element);
      return this;
    }

    /**
     * Adds elements to {@link UserRecordingConfig#users() users} list.
     * @param elements An array of users elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addUsers(String... elements) {
      this.users.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link UserRecordingConfig#users() users} list.
     * @param elements An iterable of users elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder users(Iterable<String> elements) {
      this.users = ImmutableList.builder();
      return addAllUsers(elements);
    }

    /**
     * Adds elements to {@link UserRecordingConfig#users() users} list.
     * @param elements An iterable of users elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllUsers(Iterable<String> elements) {
      this.users.addAll(elements);
      return this;
    }

    /**
     * Initializes the value for the {@link UserRecordingConfig#profilingIntervalMillis() profilingIntervalMillis} attribute.
     * @param profilingIntervalMillis The value for profilingIntervalMillis (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder profilingIntervalMillis(@Nullable Integer profilingIntervalMillis) {
      this.profilingIntervalMillis = profilingIntervalMillis;
      return this;
    }

    /**
     * Builds a new {@link ImmutableUserRecordingConfig ImmutableUserRecordingConfig}.
     * @return An immutable instance of UserRecordingConfig
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableUserRecordingConfig build() {
      return new ImmutableUserRecordingConfig(users.build(), profilingIntervalMillis);
    }
  }
}
