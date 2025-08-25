package org.glowroot.agent.shaded.glowroot.ui;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Optional;
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
 * Immutable implementation of {@link RoleConfigJsonService.RoleConfigDto}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableRoleConfigDto.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "RoleConfigJsonService.RoleConfigDto"})
@Immutable
final class ImmutableRoleConfigDto extends RoleConfigJsonService.RoleConfigDto {
  private final String name;
  private final ImmutableList<String> permissions;
  private final ImmutableList<ImmutableRolePermissionBlock> permissionBlocks;
  private final Optional<String> version;

  private ImmutableRoleConfigDto(
      String name,
      ImmutableList<String> permissions,
      ImmutableList<ImmutableRolePermissionBlock> permissionBlocks,
      Optional<String> version) {
    this.name = name;
    this.permissions = permissions;
    this.permissionBlocks = permissionBlocks;
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
   * @return The value of the {@code permissions} attribute
   */
  @JsonProperty("permissions")
  @Override
  ImmutableList<String> permissions() {
    return permissions;
  }

  /**
   * @return The value of the {@code permissionBlocks} attribute
   */
  @JsonProperty("permissionBlocks")
  @Override
  ImmutableList<ImmutableRolePermissionBlock> permissionBlocks() {
    return permissionBlocks;
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
   * Copy the current immutable object by setting a value for the {@link RoleConfigJsonService.RoleConfigDto#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRoleConfigDto withName(String value) {
    if (this.name.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "name");
    return new ImmutableRoleConfigDto(newValue, this.permissions, this.permissionBlocks, this.version);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link RoleConfigJsonService.RoleConfigDto#permissions() permissions}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRoleConfigDto withPermissions(String... elements) {
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableRoleConfigDto(this.name, newValue, this.permissionBlocks, this.version);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link RoleConfigJsonService.RoleConfigDto#permissions() permissions}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of permissions elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRoleConfigDto withPermissions(Iterable<String> elements) {
    if (this.permissions == elements) return this;
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableRoleConfigDto(this.name, newValue, this.permissionBlocks, this.version);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link RoleConfigJsonService.RoleConfigDto#permissionBlocks() permissionBlocks}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRoleConfigDto withPermissionBlocks(ImmutableRolePermissionBlock... elements) {
    ImmutableList<ImmutableRolePermissionBlock> newValue = ImmutableList.copyOf(elements);
    return new ImmutableRoleConfigDto(this.name, this.permissions, newValue, this.version);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link RoleConfigJsonService.RoleConfigDto#permissionBlocks() permissionBlocks}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of permissionBlocks elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRoleConfigDto withPermissionBlocks(Iterable<? extends ImmutableRolePermissionBlock> elements) {
    if (this.permissionBlocks == elements) return this;
    ImmutableList<ImmutableRolePermissionBlock> newValue = ImmutableList.copyOf(elements);
    return new ImmutableRoleConfigDto(this.name, this.permissions, newValue, this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RoleConfigJsonService.RoleConfigDto#version() version} attribute.
   * @param value The value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRoleConfigDto withVersion(String value) {
    Optional<String> newValue = Optional.of(value);
    if (this.version.equals(newValue)) return this;
    return new ImmutableRoleConfigDto(this.name, this.permissions, this.permissionBlocks, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RoleConfigJsonService.RoleConfigDto#version() version} attribute.
   * An equality check is used to prevent copying of the same value by returning {@code this}.
   * @param optional A value for version
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRoleConfigDto withVersion(Optional<String> optional) {
    Optional<String> value = (Optional<String>) optional;
    if (this.version.equals(value)) return this;
    return new ImmutableRoleConfigDto(this.name, this.permissions, this.permissionBlocks, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableRoleConfigDto} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableRoleConfigDto
        && equalTo((ImmutableRoleConfigDto) another);
  }

  private boolean equalTo(ImmutableRoleConfigDto another) {
    return name.equals(another.name)
        && permissions.equals(another.permissions)
        && permissionBlocks.equals(another.permissionBlocks)
        && version.equals(another.version);
  }

  /**
   * Computes a hash code from attributes: {@code name}, {@code permissions}, {@code permissionBlocks}, {@code version}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + name.hashCode();
    h += (h << 5) + permissions.hashCode();
    h += (h << 5) + permissionBlocks.hashCode();
    h += (h << 5) + version.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code RoleConfigDto} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("RoleConfigDto")
        .omitNullValues()
        .add("name", name)
        .add("permissions", permissions)
        .add("permissionBlocks", permissionBlocks)
        .add("version", version.orNull())
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends RoleConfigJsonService.RoleConfigDto {
    @Nullable String name;
    ImmutableList<String> permissions = ImmutableList.of();
    ImmutableList<ImmutableRolePermissionBlock> permissionBlocks = ImmutableList.of();
    Optional<String> version = Optional.absent();
    @JsonProperty("name")
    public void setName(String name) {
      this.name = name;
    }
    @JsonProperty("permissions")
    public void setPermissions(ImmutableList<String> permissions) {
      this.permissions = permissions;
    }
    @JsonProperty("permissionBlocks")
    public void setPermissionBlocks(ImmutableList<ImmutableRolePermissionBlock> permissionBlocks) {
      this.permissionBlocks = permissionBlocks;
    }
    @JsonProperty("version")
    public void setVersion(Optional<String> version) {
      this.version = version;
    }
    @Override
    String name() { throw new UnsupportedOperationException(); }
    @Override
    ImmutableList<String> permissions() { throw new UnsupportedOperationException(); }
    @Override
    ImmutableList<ImmutableRolePermissionBlock> permissionBlocks() { throw new UnsupportedOperationException(); }
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
  static ImmutableRoleConfigDto fromJson(Json json) {
    ImmutableRoleConfigDto.Builder builder = ImmutableRoleConfigDto.builder();
    if (json.name != null) {
      builder.name(json.name);
    }
    if (json.permissions != null) {
      builder.addAllPermissions(json.permissions);
    }
    if (json.permissionBlocks != null) {
      builder.addAllPermissionBlocks(json.permissionBlocks);
    }
    if (json.version != null) {
      builder.version(json.version);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link RoleConfigJsonService.RoleConfigDto} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable RoleConfigDto instance
   */
  public static ImmutableRoleConfigDto copyOf(RoleConfigJsonService.RoleConfigDto instance) {
    if (instance instanceof ImmutableRoleConfigDto) {
      return (ImmutableRoleConfigDto) instance;
    }
    return ImmutableRoleConfigDto.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableRoleConfigDto ImmutableRoleConfigDto}.
   * @return A new ImmutableRoleConfigDto builder
   */
  public static ImmutableRoleConfigDto.Builder builder() {
    return new ImmutableRoleConfigDto.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableRoleConfigDto ImmutableRoleConfigDto}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_NAME = 0x1L;
    private long initBits = 0x1L;

    private @Nullable String name;
    private ImmutableList.Builder<String> permissions = ImmutableList.builder();
    private ImmutableList.Builder<ImmutableRolePermissionBlock> permissionBlocks = ImmutableList.builder();
    private Optional<String> version = Optional.absent();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code RoleConfigDto} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(RoleConfigJsonService.RoleConfigDto instance) {
      Preconditions.checkNotNull(instance, "instance");
      name(instance.name());
      addAllPermissions(instance.permissions());
      addAllPermissionBlocks(instance.permissionBlocks());
      Optional<String> versionOptional = instance.version();
      if (versionOptional.isPresent()) {
        version(versionOptional);
      }
      return this;
    }

    /**
     * Initializes the value for the {@link RoleConfigJsonService.RoleConfigDto#name() name} attribute.
     * @param name The value for name 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder name(String name) {
      this.name = Preconditions.checkNotNull(name, "name");
      initBits &= ~INIT_BIT_NAME;
      return this;
    }

    /**
     * Adds one element to {@link RoleConfigJsonService.RoleConfigDto#permissions() permissions} list.
     * @param element A permissions element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addPermissions(String element) {
      this.permissions.add(element);
      return this;
    }

    /**
     * Adds elements to {@link RoleConfigJsonService.RoleConfigDto#permissions() permissions} list.
     * @param elements An array of permissions elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addPermissions(String... elements) {
      this.permissions.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link RoleConfigJsonService.RoleConfigDto#permissions() permissions} list.
     * @param elements An iterable of permissions elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder permissions(Iterable<String> elements) {
      this.permissions = ImmutableList.builder();
      return addAllPermissions(elements);
    }

    /**
     * Adds elements to {@link RoleConfigJsonService.RoleConfigDto#permissions() permissions} list.
     * @param elements An iterable of permissions elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllPermissions(Iterable<String> elements) {
      this.permissions.addAll(elements);
      return this;
    }

    /**
     * Adds one element to {@link RoleConfigJsonService.RoleConfigDto#permissionBlocks() permissionBlocks} list.
     * @param element A permissionBlocks element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addPermissionBlocks(ImmutableRolePermissionBlock element) {
      this.permissionBlocks.add(element);
      return this;
    }

    /**
     * Adds elements to {@link RoleConfigJsonService.RoleConfigDto#permissionBlocks() permissionBlocks} list.
     * @param elements An array of permissionBlocks elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addPermissionBlocks(ImmutableRolePermissionBlock... elements) {
      this.permissionBlocks.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link RoleConfigJsonService.RoleConfigDto#permissionBlocks() permissionBlocks} list.
     * @param elements An iterable of permissionBlocks elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder permissionBlocks(Iterable<? extends ImmutableRolePermissionBlock> elements) {
      this.permissionBlocks = ImmutableList.builder();
      return addAllPermissionBlocks(elements);
    }

    /**
     * Adds elements to {@link RoleConfigJsonService.RoleConfigDto#permissionBlocks() permissionBlocks} list.
     * @param elements An iterable of permissionBlocks elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllPermissionBlocks(Iterable<? extends ImmutableRolePermissionBlock> elements) {
      this.permissionBlocks.addAll(elements);
      return this;
    }

    /**
     * Initializes the optional value {@link RoleConfigJsonService.RoleConfigDto#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    public final Builder version(String version) {
      this.version = Optional.of(version);
      return this;
    }

    /**
     * Initializes the optional value {@link RoleConfigJsonService.RoleConfigDto#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    @SuppressWarnings("unchecked") // safe covariant cast
    public final Builder version(Optional<String> version) {
      this.version = (Optional<String>) version;
      return this;
    }

    /**
     * Builds a new {@link ImmutableRoleConfigDto ImmutableRoleConfigDto}.
     * @return An immutable instance of RoleConfigDto
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableRoleConfigDto build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableRoleConfigDto(name, permissions.build(), permissionBlocks.build(), version);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      return "Cannot build RoleConfigDto, some of required attributes are not set " + attributes;
    }
  }
}
