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
 * Immutable implementation of {@link RoleConfigJsonService.RoleConfigListDto}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableRoleConfigListDto.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "RoleConfigJsonService.RoleConfigListDto"})
@Immutable
final class ImmutableRoleConfigListDto extends RoleConfigJsonService.RoleConfigListDto {
  private final String name;
  private final String version;

  private ImmutableRoleConfigListDto(String name, String version) {
    this.name = name;
    this.version = version;
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @JsonProperty("name")
  @Override
  String name() {
    return name;
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
   * Copy the current immutable object by setting a value for the {@link RoleConfigJsonService.RoleConfigListDto#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRoleConfigListDto withName(String value) {
    if (this.name.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "name");
    return new ImmutableRoleConfigListDto(newValue, this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link RoleConfigJsonService.RoleConfigListDto#version() version} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for version
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRoleConfigListDto withVersion(String value) {
    if (this.version.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "version");
    return new ImmutableRoleConfigListDto(this.name, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableRoleConfigListDto} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableRoleConfigListDto
        && equalTo((ImmutableRoleConfigListDto) another);
  }

  private boolean equalTo(ImmutableRoleConfigListDto another) {
    return name.equals(another.name)
        && version.equals(another.version);
  }

  /**
   * Computes a hash code from attributes: {@code name}, {@code version}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + name.hashCode();
    h += (h << 5) + version.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code RoleConfigListDto} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("RoleConfigListDto")
        .omitNullValues()
        .add("name", name)
        .add("version", version)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends RoleConfigJsonService.RoleConfigListDto {
    @Nullable String name;
    @Nullable String version;
    @JsonProperty("name")
    public void setName(String name) {
      this.name = name;
    }
    @JsonProperty("version")
    public void setVersion(String version) {
      this.version = version;
    }
    @Override
    String name() { throw new UnsupportedOperationException(); }
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
  static ImmutableRoleConfigListDto fromJson(Json json) {
    ImmutableRoleConfigListDto.Builder builder = ImmutableRoleConfigListDto.builder();
    if (json.name != null) {
      builder.name(json.name);
    }
    if (json.version != null) {
      builder.version(json.version);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link RoleConfigJsonService.RoleConfigListDto} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable RoleConfigListDto instance
   */
  public static ImmutableRoleConfigListDto copyOf(RoleConfigJsonService.RoleConfigListDto instance) {
    if (instance instanceof ImmutableRoleConfigListDto) {
      return (ImmutableRoleConfigListDto) instance;
    }
    return ImmutableRoleConfigListDto.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableRoleConfigListDto ImmutableRoleConfigListDto}.
   * @return A new ImmutableRoleConfigListDto builder
   */
  public static ImmutableRoleConfigListDto.Builder builder() {
    return new ImmutableRoleConfigListDto.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableRoleConfigListDto ImmutableRoleConfigListDto}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_NAME = 0x1L;
    private static final long INIT_BIT_VERSION = 0x2L;
    private long initBits = 0x3L;

    private @Nullable String name;
    private @Nullable String version;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code RoleConfigListDto} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(RoleConfigJsonService.RoleConfigListDto instance) {
      Preconditions.checkNotNull(instance, "instance");
      name(instance.name());
      version(instance.version());
      return this;
    }

    /**
     * Initializes the value for the {@link RoleConfigJsonService.RoleConfigListDto#name() name} attribute.
     * @param name The value for name 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder name(String name) {
      this.name = Preconditions.checkNotNull(name, "name");
      initBits &= ~INIT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link RoleConfigJsonService.RoleConfigListDto#version() version} attribute.
     * @param version The value for version 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder version(String version) {
      this.version = Preconditions.checkNotNull(version, "version");
      initBits &= ~INIT_BIT_VERSION;
      return this;
    }

    /**
     * Builds a new {@link ImmutableRoleConfigListDto ImmutableRoleConfigListDto}.
     * @return An immutable instance of RoleConfigListDto
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableRoleConfigListDto build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableRoleConfigListDto(name, version);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      if ((initBits & INIT_BIT_VERSION) != 0) attributes.add("version");
      return "Cannot build RoleConfigListDto, some of required attributes are not set " + attributes;
    }
  }
}
