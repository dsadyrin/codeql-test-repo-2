package org.glowroot.agent.shaded.glowroot.common.config;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import org.glowroot.agent.shaded.google.common.collect.ImmutableList;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link RoleConfig.SimplePermission}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSimplePermission.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "RoleConfig.SimplePermission"})
@Immutable
public final class ImmutableSimplePermission extends RoleConfig.SimplePermission {
  private final ImmutableList<String> agentIds;
  private final ImmutableList<String> parts;

  private ImmutableSimplePermission(
      ImmutableList<String> agentIds,
      ImmutableList<String> parts) {
    this.agentIds = agentIds;
    this.parts = parts;
  }

  /**
   * @return The value of the {@code agentIds} attribute
   */
  @JsonProperty("agentIds")
  @Override
  public ImmutableList<String> agentIds() {
    return agentIds;
  }

  /**
   * @return The value of the {@code parts} attribute
   */
  @JsonProperty("parts")
  @Override
  public ImmutableList<String> parts() {
    return parts;
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link RoleConfig.SimplePermission#agentIds() agentIds}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSimplePermission withAgentIds(String... elements) {
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableSimplePermission(newValue, this.parts);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link RoleConfig.SimplePermission#agentIds() agentIds}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of agentIds elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSimplePermission withAgentIds(Iterable<String> elements) {
    if (this.agentIds == elements) return this;
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableSimplePermission(newValue, this.parts);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link RoleConfig.SimplePermission#parts() parts}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSimplePermission withParts(String... elements) {
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableSimplePermission(this.agentIds, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link RoleConfig.SimplePermission#parts() parts}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of parts elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSimplePermission withParts(Iterable<String> elements) {
    if (this.parts == elements) return this;
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableSimplePermission(this.agentIds, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSimplePermission} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSimplePermission
        && equalTo((ImmutableSimplePermission) another);
  }

  private boolean equalTo(ImmutableSimplePermission another) {
    return agentIds.equals(another.agentIds)
        && parts.equals(another.parts);
  }

  /**
   * Computes a hash code from attributes: {@code agentIds}, {@code parts}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + agentIds.hashCode();
    h += (h << 5) + parts.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code SimplePermission} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("SimplePermission")
        .omitNullValues()
        .add("agentIds", agentIds)
        .add("parts", parts)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends RoleConfig.SimplePermission {
    List<String> agentIds = ImmutableList.of();
    List<String> parts = ImmutableList.of();
    @JsonProperty("agentIds")
    public void setAgentIds(List<String> agentIds) {
      this.agentIds = agentIds;
    }
    @JsonProperty("parts")
    public void setParts(List<String> parts) {
      this.parts = parts;
    }
    @Override
    public List<String> agentIds() { throw new UnsupportedOperationException(); }
    @Override
    public List<String> parts() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableSimplePermission fromJson(Json json) {
    ImmutableSimplePermission.Builder builder = ImmutableSimplePermission.builder();
    if (json.agentIds != null) {
      builder.addAllAgentIds(json.agentIds);
    }
    if (json.parts != null) {
      builder.addAllParts(json.parts);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link RoleConfig.SimplePermission} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SimplePermission instance
   */
  public static ImmutableSimplePermission copyOf(RoleConfig.SimplePermission instance) {
    if (instance instanceof ImmutableSimplePermission) {
      return (ImmutableSimplePermission) instance;
    }
    return ImmutableSimplePermission.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableSimplePermission ImmutableSimplePermission}.
   * @return A new ImmutableSimplePermission builder
   */
  public static ImmutableSimplePermission.Builder builder() {
    return new ImmutableSimplePermission.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableSimplePermission ImmutableSimplePermission}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private ImmutableList.Builder<String> agentIds = ImmutableList.builder();
    private ImmutableList.Builder<String> parts = ImmutableList.builder();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code SimplePermission} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(RoleConfig.SimplePermission instance) {
      Preconditions.checkNotNull(instance, "instance");
      addAllAgentIds(instance.agentIds());
      addAllParts(instance.parts());
      return this;
    }

    /**
     * Adds one element to {@link RoleConfig.SimplePermission#agentIds() agentIds} list.
     * @param element A agentIds element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAgentIds(String element) {
      this.agentIds.add(element);
      return this;
    }

    /**
     * Adds elements to {@link RoleConfig.SimplePermission#agentIds() agentIds} list.
     * @param elements An array of agentIds elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAgentIds(String... elements) {
      this.agentIds.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link RoleConfig.SimplePermission#agentIds() agentIds} list.
     * @param elements An iterable of agentIds elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder agentIds(Iterable<String> elements) {
      this.agentIds = ImmutableList.builder();
      return addAllAgentIds(elements);
    }

    /**
     * Adds elements to {@link RoleConfig.SimplePermission#agentIds() agentIds} list.
     * @param elements An iterable of agentIds elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllAgentIds(Iterable<String> elements) {
      this.agentIds.addAll(elements);
      return this;
    }

    /**
     * Adds one element to {@link RoleConfig.SimplePermission#parts() parts} list.
     * @param element A parts element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addParts(String element) {
      this.parts.add(element);
      return this;
    }

    /**
     * Adds elements to {@link RoleConfig.SimplePermission#parts() parts} list.
     * @param elements An array of parts elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addParts(String... elements) {
      this.parts.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link RoleConfig.SimplePermission#parts() parts} list.
     * @param elements An iterable of parts elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder parts(Iterable<String> elements) {
      this.parts = ImmutableList.builder();
      return addAllParts(elements);
    }

    /**
     * Adds elements to {@link RoleConfig.SimplePermission#parts() parts} list.
     * @param elements An iterable of parts elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllParts(Iterable<String> elements) {
      this.parts.addAll(elements);
      return this;
    }

    /**
     * Builds a new {@link ImmutableSimplePermission ImmutableSimplePermission}.
     * @return An immutable instance of SimplePermission
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableSimplePermission build() {
      return new ImmutableSimplePermission(agentIds.build(), parts.build());
    }
  }
}
