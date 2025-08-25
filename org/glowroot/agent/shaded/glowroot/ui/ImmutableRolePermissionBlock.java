package org.glowroot.agent.shaded.glowroot.ui;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import org.glowroot.agent.shaded.google.common.collect.ImmutableList;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link RoleConfigJsonService.RolePermissionBlock}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableRolePermissionBlock.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "RoleConfigJsonService.RolePermissionBlock"})
@Immutable
final class ImmutableRolePermissionBlock
    implements RoleConfigJsonService.RolePermissionBlock {
  private final ImmutableList<String> agentRollupIds;
  private final ImmutableList<String> permissions;

  private ImmutableRolePermissionBlock(
      ImmutableList<String> agentRollupIds,
      ImmutableList<String> permissions) {
    this.agentRollupIds = agentRollupIds;
    this.permissions = permissions;
  }

  /**
   * @return The value of the {@code agentRollupIds} attribute
   */
  @JsonProperty("agentRollupIds")
  @Override
  public ImmutableList<String> agentRollupIds() {
    return agentRollupIds;
  }

  /**
   * @return The value of the {@code permissions} attribute
   */
  @JsonProperty("permissions")
  @Override
  public ImmutableList<String> permissions() {
    return permissions;
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link RoleConfigJsonService.RolePermissionBlock#agentRollupIds() agentRollupIds}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRolePermissionBlock withAgentRollupIds(String... elements) {
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableRolePermissionBlock(newValue, this.permissions);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link RoleConfigJsonService.RolePermissionBlock#agentRollupIds() agentRollupIds}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of agentRollupIds elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRolePermissionBlock withAgentRollupIds(Iterable<String> elements) {
    if (this.agentRollupIds == elements) return this;
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableRolePermissionBlock(newValue, this.permissions);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link RoleConfigJsonService.RolePermissionBlock#permissions() permissions}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRolePermissionBlock withPermissions(String... elements) {
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableRolePermissionBlock(this.agentRollupIds, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link RoleConfigJsonService.RolePermissionBlock#permissions() permissions}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of permissions elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRolePermissionBlock withPermissions(Iterable<String> elements) {
    if (this.permissions == elements) return this;
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableRolePermissionBlock(this.agentRollupIds, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableRolePermissionBlock} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableRolePermissionBlock
        && equalTo((ImmutableRolePermissionBlock) another);
  }

  private boolean equalTo(ImmutableRolePermissionBlock another) {
    return agentRollupIds.equals(another.agentRollupIds)
        && permissions.equals(another.permissions);
  }

  /**
   * Computes a hash code from attributes: {@code agentRollupIds}, {@code permissions}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + agentRollupIds.hashCode();
    h += (h << 5) + permissions.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code RolePermissionBlock} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("RolePermissionBlock")
        .omitNullValues()
        .add("agentRollupIds", agentRollupIds)
        .add("permissions", permissions)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements RoleConfigJsonService.RolePermissionBlock {
    ImmutableList<String> agentRollupIds = ImmutableList.of();
    ImmutableList<String> permissions = ImmutableList.of();
    @JsonProperty("agentRollupIds")
    public void setAgentRollupIds(ImmutableList<String> agentRollupIds) {
      this.agentRollupIds = agentRollupIds;
    }
    @JsonProperty("permissions")
    public void setPermissions(ImmutableList<String> permissions) {
      this.permissions = permissions;
    }
    @Override
    public ImmutableList<String> agentRollupIds() { throw new UnsupportedOperationException(); }
    @Override
    public ImmutableList<String> permissions() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableRolePermissionBlock fromJson(Json json) {
    ImmutableRolePermissionBlock.Builder builder = ImmutableRolePermissionBlock.builder();
    if (json.agentRollupIds != null) {
      builder.addAllAgentRollupIds(json.agentRollupIds);
    }
    if (json.permissions != null) {
      builder.addAllPermissions(json.permissions);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link RoleConfigJsonService.RolePermissionBlock} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable RolePermissionBlock instance
   */
  public static ImmutableRolePermissionBlock copyOf(RoleConfigJsonService.RolePermissionBlock instance) {
    if (instance instanceof ImmutableRolePermissionBlock) {
      return (ImmutableRolePermissionBlock) instance;
    }
    return ImmutableRolePermissionBlock.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableRolePermissionBlock ImmutableRolePermissionBlock}.
   * @return A new ImmutableRolePermissionBlock builder
   */
  public static ImmutableRolePermissionBlock.Builder builder() {
    return new ImmutableRolePermissionBlock.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableRolePermissionBlock ImmutableRolePermissionBlock}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private ImmutableList.Builder<String> agentRollupIds = ImmutableList.builder();
    private ImmutableList.Builder<String> permissions = ImmutableList.builder();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code RolePermissionBlock} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(RoleConfigJsonService.RolePermissionBlock instance) {
      Preconditions.checkNotNull(instance, "instance");
      addAllAgentRollupIds(instance.agentRollupIds());
      addAllPermissions(instance.permissions());
      return this;
    }

    /**
     * Adds one element to {@link RoleConfigJsonService.RolePermissionBlock#agentRollupIds() agentRollupIds} list.
     * @param element A agentRollupIds element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAgentRollupIds(String element) {
      this.agentRollupIds.add(element);
      return this;
    }

    /**
     * Adds elements to {@link RoleConfigJsonService.RolePermissionBlock#agentRollupIds() agentRollupIds} list.
     * @param elements An array of agentRollupIds elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAgentRollupIds(String... elements) {
      this.agentRollupIds.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link RoleConfigJsonService.RolePermissionBlock#agentRollupIds() agentRollupIds} list.
     * @param elements An iterable of agentRollupIds elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder agentRollupIds(Iterable<String> elements) {
      this.agentRollupIds = ImmutableList.builder();
      return addAllAgentRollupIds(elements);
    }

    /**
     * Adds elements to {@link RoleConfigJsonService.RolePermissionBlock#agentRollupIds() agentRollupIds} list.
     * @param elements An iterable of agentRollupIds elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllAgentRollupIds(Iterable<String> elements) {
      this.agentRollupIds.addAll(elements);
      return this;
    }

    /**
     * Adds one element to {@link RoleConfigJsonService.RolePermissionBlock#permissions() permissions} list.
     * @param element A permissions element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addPermissions(String element) {
      this.permissions.add(element);
      return this;
    }

    /**
     * Adds elements to {@link RoleConfigJsonService.RolePermissionBlock#permissions() permissions} list.
     * @param elements An array of permissions elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addPermissions(String... elements) {
      this.permissions.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link RoleConfigJsonService.RolePermissionBlock#permissions() permissions} list.
     * @param elements An iterable of permissions elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder permissions(Iterable<String> elements) {
      this.permissions = ImmutableList.builder();
      return addAllPermissions(elements);
    }

    /**
     * Adds elements to {@link RoleConfigJsonService.RolePermissionBlock#permissions() permissions} list.
     * @param elements An iterable of permissions elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllPermissions(Iterable<String> elements) {
      this.permissions.addAll(elements);
      return this;
    }

    /**
     * Builds a new {@link ImmutableRolePermissionBlock ImmutableRolePermissionBlock}.
     * @return An immutable instance of RolePermissionBlock
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableRolePermissionBlock build() {
      return new ImmutableRolePermissionBlock(agentRollupIds.build(), permissions.build());
    }
  }
}
