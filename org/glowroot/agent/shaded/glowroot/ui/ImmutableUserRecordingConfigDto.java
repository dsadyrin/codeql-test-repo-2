package org.glowroot.agent.shaded.glowroot.ui;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Objects;
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
 * Immutable implementation of {@link ConfigJsonService.UserRecordingConfigDto}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableUserRecordingConfigDto.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "ConfigJsonService.UserRecordingConfigDto"})
@Immutable
final class ImmutableUserRecordingConfigDto
    extends ConfigJsonService.UserRecordingConfigDto {
  private final ImmutableList<String> users;
  private final @Nullable Integer profilingIntervalMillis;
  private final String version;

  private ImmutableUserRecordingConfigDto(
      ImmutableList<String> users,
      @Nullable Integer profilingIntervalMillis,
      String version) {
    this.users = users;
    this.profilingIntervalMillis = profilingIntervalMillis;
    this.version = version;
  }

  /**
   * @return The value of the {@code users} attribute
   */
  @JsonProperty("users")
  @Override
  ImmutableList<String> users() {
    return users;
  }

  /**
   * @return The value of the {@code profilingIntervalMillis} attribute
   */
  @JsonProperty("profilingIntervalMillis")
  @Override
  @Nullable Integer profilingIntervalMillis() {
    return profilingIntervalMillis;
  }

  /**
   * @return The value of the {@code version} attribute
   */
  @JsonProperty("version")
  @Override
  String version() {
    return version;
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ConfigJsonService.UserRecordingConfigDto#users() users}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUserRecordingConfigDto withUsers(String... elements) {
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableUserRecordingConfigDto(newValue, this.profilingIntervalMillis, this.version);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ConfigJsonService.UserRecordingConfigDto#users() users}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of users elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUserRecordingConfigDto withUsers(Iterable<String> elements) {
    if (this.users == elements) return this;
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableUserRecordingConfigDto(newValue, this.profilingIntervalMillis, this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ConfigJsonService.UserRecordingConfigDto#profilingIntervalMillis() profilingIntervalMillis} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for profilingIntervalMillis (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableUserRecordingConfigDto withProfilingIntervalMillis(@Nullable Integer value) {
    if (Objects.equal(this.profilingIntervalMillis, value)) return this;
    return new ImmutableUserRecordingConfigDto(this.users, value, this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ConfigJsonService.UserRecordingConfigDto#version() version} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for version
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableUserRecordingConfigDto withVersion(String value) {
    if (this.version.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "version");
    return new ImmutableUserRecordingConfigDto(this.users, this.profilingIntervalMillis, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableUserRecordingConfigDto} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableUserRecordingConfigDto
        && equalTo((ImmutableUserRecordingConfigDto) another);
  }

  private boolean equalTo(ImmutableUserRecordingConfigDto another) {
    return users.equals(another.users)
        && Objects.equal(profilingIntervalMillis, another.profilingIntervalMillis)
        && version.equals(another.version);
  }

  /**
   * Computes a hash code from attributes: {@code users}, {@code profilingIntervalMillis}, {@code version}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + users.hashCode();
    h += (h << 5) + Objects.hashCode(profilingIntervalMillis);
    h += (h << 5) + version.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code UserRecordingConfigDto} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("UserRecordingConfigDto")
        .omitNullValues()
        .add("users", users)
        .add("profilingIntervalMillis", profilingIntervalMillis)
        .add("version", version)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends ConfigJsonService.UserRecordingConfigDto {
    ImmutableList<String> users = ImmutableList.of();
    @Nullable Integer profilingIntervalMillis;
    @Nullable String version;
    @JsonProperty("users")
    public void setUsers(ImmutableList<String> users) {
      this.users = users;
    }
    @JsonProperty("profilingIntervalMillis")
    public void setProfilingIntervalMillis(@Nullable Integer profilingIntervalMillis) {
      this.profilingIntervalMillis = profilingIntervalMillis;
    }
    @JsonProperty("version")
    public void setVersion(String version) {
      this.version = version;
    }
    @Override
    ImmutableList<String> users() { throw new UnsupportedOperationException(); }
    @Override
    Integer profilingIntervalMillis() { throw new UnsupportedOperationException(); }
    @Override
    String version() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableUserRecordingConfigDto fromJson(Json json) {
    ImmutableUserRecordingConfigDto.Builder builder = ImmutableUserRecordingConfigDto.builder();
    if (json.users != null) {
      builder.addAllUsers(json.users);
    }
    if (json.profilingIntervalMillis != null) {
      builder.profilingIntervalMillis(json.profilingIntervalMillis);
    }
    if (json.version != null) {
      builder.version(json.version);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ConfigJsonService.UserRecordingConfigDto} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable UserRecordingConfigDto instance
   */
  public static ImmutableUserRecordingConfigDto copyOf(ConfigJsonService.UserRecordingConfigDto instance) {
    if (instance instanceof ImmutableUserRecordingConfigDto) {
      return (ImmutableUserRecordingConfigDto) instance;
    }
    return ImmutableUserRecordingConfigDto.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableUserRecordingConfigDto ImmutableUserRecordingConfigDto}.
   * @return A new ImmutableUserRecordingConfigDto builder
   */
  public static ImmutableUserRecordingConfigDto.Builder builder() {
    return new ImmutableUserRecordingConfigDto.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableUserRecordingConfigDto ImmutableUserRecordingConfigDto}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_VERSION = 0x1L;
    private long initBits = 0x1L;

    private ImmutableList.Builder<String> users = ImmutableList.builder();
    private @Nullable Integer profilingIntervalMillis;
    private @Nullable String version;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code UserRecordingConfigDto} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(ConfigJsonService.UserRecordingConfigDto instance) {
      Preconditions.checkNotNull(instance, "instance");
      addAllUsers(instance.users());
      @Nullable Integer profilingIntervalMillisValue = instance.profilingIntervalMillis();
      if (profilingIntervalMillisValue != null) {
        profilingIntervalMillis(profilingIntervalMillisValue);
      }
      version(instance.version());
      return this;
    }

    /**
     * Adds one element to {@link ConfigJsonService.UserRecordingConfigDto#users() users} list.
     * @param element A users element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addUsers(String element) {
      this.users.add(element);
      return this;
    }

    /**
     * Adds elements to {@link ConfigJsonService.UserRecordingConfigDto#users() users} list.
     * @param elements An array of users elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addUsers(String... elements) {
      this.users.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link ConfigJsonService.UserRecordingConfigDto#users() users} list.
     * @param elements An iterable of users elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder users(Iterable<String> elements) {
      this.users = ImmutableList.builder();
      return addAllUsers(elements);
    }

    /**
     * Adds elements to {@link ConfigJsonService.UserRecordingConfigDto#users() users} list.
     * @param elements An iterable of users elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllUsers(Iterable<String> elements) {
      this.users.addAll(elements);
      return this;
    }

    /**
     * Initializes the value for the {@link ConfigJsonService.UserRecordingConfigDto#profilingIntervalMillis() profilingIntervalMillis} attribute.
     * @param profilingIntervalMillis The value for profilingIntervalMillis (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder profilingIntervalMillis(@Nullable Integer profilingIntervalMillis) {
      this.profilingIntervalMillis = profilingIntervalMillis;
      return this;
    }

    /**
     * Initializes the value for the {@link ConfigJsonService.UserRecordingConfigDto#version() version} attribute.
     * @param version The value for version 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder version(String version) {
      this.version = Preconditions.checkNotNull(version, "version");
      initBits &= ~INIT_BIT_VERSION;
      return this;
    }

    /**
     * Builds a new {@link ImmutableUserRecordingConfigDto ImmutableUserRecordingConfigDto}.
     * @return An immutable instance of UserRecordingConfigDto
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableUserRecordingConfigDto build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableUserRecordingConfigDto(users.build(), profilingIntervalMillis, version);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_VERSION) != 0) attributes.add("version");
      return "Cannot build UserRecordingConfigDto, some of required attributes are not set " + attributes;
    }
  }
}
