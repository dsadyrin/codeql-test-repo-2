package org.glowroot.agent.shaded.glowroot.ui;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import org.glowroot.agent.shaded.google.common.collect.ImmutableList;
import org.glowroot.agent.shaded.google.common.collect.Lists;
import org.glowroot.agent.shaded.google.common.primitives.Booleans;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link LayoutService.FilteredAgentRollup}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableFilteredAgentRollup.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "LayoutService.FilteredAgentRollup"})
@Immutable
final class ImmutableFilteredAgentRollup implements LayoutService.FilteredAgentRollup {
  private final String id;
  private final String display;
  private final boolean agent;
  private final LayoutService.Permissions permissions;
  private final ImmutableList<LayoutService.FilteredAgentRollup> children;

  private ImmutableFilteredAgentRollup(
      String id,
      String display,
      boolean agent,
      LayoutService.Permissions permissions,
      ImmutableList<LayoutService.FilteredAgentRollup> children) {
    this.id = id;
    this.display = display;
    this.agent = agent;
    this.permissions = permissions;
    this.children = children;
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public String id() {
    return id;
  }

  /**
   * @return The value of the {@code display} attribute
   */
  @JsonProperty("display")
  @Override
  public String display() {
    return display;
  }

  /**
   * @return The value of the {@code agent} attribute
   */
  @JsonProperty("agent")
  @Override
  public boolean agent() {
    return agent;
  }

  /**
   * @return The value of the {@code permissions} attribute
   */
  @JsonProperty("permissions")
  @Override
  public LayoutService.Permissions permissions() {
    return permissions;
  }

  /**
   * @return The value of the {@code children} attribute
   */
  @JsonProperty("children")
  @Override
  public ImmutableList<LayoutService.FilteredAgentRollup> children() {
    return children;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LayoutService.FilteredAgentRollup#id() id} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for id
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableFilteredAgentRollup withId(String value) {
    if (this.id.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "id");
    return new ImmutableFilteredAgentRollup(newValue, this.display, this.agent, this.permissions, this.children);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LayoutService.FilteredAgentRollup#display() display} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for display
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableFilteredAgentRollup withDisplay(String value) {
    if (this.display.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "display");
    return new ImmutableFilteredAgentRollup(this.id, newValue, this.agent, this.permissions, this.children);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LayoutService.FilteredAgentRollup#agent() agent} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for agent
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableFilteredAgentRollup withAgent(boolean value) {
    if (this.agent == value) return this;
    return new ImmutableFilteredAgentRollup(this.id, this.display, value, this.permissions, this.children);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LayoutService.FilteredAgentRollup#permissions() permissions} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for permissions
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableFilteredAgentRollup withPermissions(LayoutService.Permissions value) {
    if (this.permissions == value) return this;
    LayoutService.Permissions newValue = Preconditions.checkNotNull(value, "permissions");
    return new ImmutableFilteredAgentRollup(this.id, this.display, this.agent, newValue, this.children);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link LayoutService.FilteredAgentRollup#children() children}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFilteredAgentRollup withChildren(LayoutService.FilteredAgentRollup... elements) {
    ImmutableList<LayoutService.FilteredAgentRollup> newValue = ImmutableList.copyOf(elements);
    return new ImmutableFilteredAgentRollup(this.id, this.display, this.agent, this.permissions, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link LayoutService.FilteredAgentRollup#children() children}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of children elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFilteredAgentRollup withChildren(Iterable<? extends LayoutService.FilteredAgentRollup> elements) {
    if (this.children == elements) return this;
    ImmutableList<LayoutService.FilteredAgentRollup> newValue = ImmutableList.copyOf(elements);
    return new ImmutableFilteredAgentRollup(this.id, this.display, this.agent, this.permissions, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableFilteredAgentRollup} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableFilteredAgentRollup
        && equalTo((ImmutableFilteredAgentRollup) another);
  }

  private boolean equalTo(ImmutableFilteredAgentRollup another) {
    return id.equals(another.id)
        && display.equals(another.display)
        && agent == another.agent
        && permissions.equals(another.permissions)
        && children.equals(another.children);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code display}, {@code agent}, {@code permissions}, {@code children}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + id.hashCode();
    h += (h << 5) + display.hashCode();
    h += (h << 5) + Booleans.hashCode(agent);
    h += (h << 5) + permissions.hashCode();
    h += (h << 5) + children.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code FilteredAgentRollup} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("FilteredAgentRollup")
        .omitNullValues()
        .add("id", id)
        .add("display", display)
        .add("agent", agent)
        .add("permissions", permissions)
        .add("children", children)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements LayoutService.FilteredAgentRollup {
    @Nullable String id;
    @Nullable String display;
    boolean agent;
    boolean agentIsSet;
    @Nullable LayoutService.Permissions permissions;
    List<LayoutService.FilteredAgentRollup> children = ImmutableList.of();
    @JsonProperty("id")
    public void setId(String id) {
      this.id = id;
    }
    @JsonProperty("display")
    public void setDisplay(String display) {
      this.display = display;
    }
    @JsonProperty("agent")
    public void setAgent(boolean agent) {
      this.agent = agent;
      this.agentIsSet = true;
    }
    @JsonProperty("permissions")
    public void setPermissions(LayoutService.Permissions permissions) {
      this.permissions = permissions;
    }
    @JsonProperty("children")
    public void setChildren(List<LayoutService.FilteredAgentRollup> children) {
      this.children = children;
    }
    @Override
    public String id() { throw new UnsupportedOperationException(); }
    @Override
    public String display() { throw new UnsupportedOperationException(); }
    @Override
    public boolean agent() { throw new UnsupportedOperationException(); }
    @Override
    public LayoutService.Permissions permissions() { throw new UnsupportedOperationException(); }
    @Override
    public List<LayoutService.FilteredAgentRollup> children() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableFilteredAgentRollup fromJson(Json json) {
    ImmutableFilteredAgentRollup.Builder builder = ImmutableFilteredAgentRollup.builder();
    if (json.id != null) {
      builder.id(json.id);
    }
    if (json.display != null) {
      builder.display(json.display);
    }
    if (json.agentIsSet) {
      builder.agent(json.agent);
    }
    if (json.permissions != null) {
      builder.permissions(json.permissions);
    }
    if (json.children != null) {
      builder.addAllChildren(json.children);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link LayoutService.FilteredAgentRollup} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable FilteredAgentRollup instance
   */
  public static ImmutableFilteredAgentRollup copyOf(LayoutService.FilteredAgentRollup instance) {
    if (instance instanceof ImmutableFilteredAgentRollup) {
      return (ImmutableFilteredAgentRollup) instance;
    }
    return ImmutableFilteredAgentRollup.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableFilteredAgentRollup ImmutableFilteredAgentRollup}.
   * @return A new ImmutableFilteredAgentRollup builder
   */
  public static ImmutableFilteredAgentRollup.Builder builder() {
    return new ImmutableFilteredAgentRollup.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableFilteredAgentRollup ImmutableFilteredAgentRollup}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_ID = 0x1L;
    private static final long INIT_BIT_DISPLAY = 0x2L;
    private static final long INIT_BIT_AGENT = 0x4L;
    private static final long INIT_BIT_PERMISSIONS = 0x8L;
    private long initBits = 0xfL;

    private @Nullable String id;
    private @Nullable String display;
    private boolean agent;
    private @Nullable LayoutService.Permissions permissions;
    private ImmutableList.Builder<LayoutService.FilteredAgentRollup> children = ImmutableList.builder();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code FilteredAgentRollup} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(LayoutService.FilteredAgentRollup instance) {
      Preconditions.checkNotNull(instance, "instance");
      id(instance.id());
      display(instance.display());
      agent(instance.agent());
      permissions(instance.permissions());
      addAllChildren(instance.children());
      return this;
    }

    /**
     * Initializes the value for the {@link LayoutService.FilteredAgentRollup#id() id} attribute.
     * @param id The value for id 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder id(String id) {
      this.id = Preconditions.checkNotNull(id, "id");
      initBits &= ~INIT_BIT_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link LayoutService.FilteredAgentRollup#display() display} attribute.
     * @param display The value for display 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder display(String display) {
      this.display = Preconditions.checkNotNull(display, "display");
      initBits &= ~INIT_BIT_DISPLAY;
      return this;
    }

    /**
     * Initializes the value for the {@link LayoutService.FilteredAgentRollup#agent() agent} attribute.
     * @param agent The value for agent 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder agent(boolean agent) {
      this.agent = agent;
      initBits &= ~INIT_BIT_AGENT;
      return this;
    }

    /**
     * Initializes the value for the {@link LayoutService.FilteredAgentRollup#permissions() permissions} attribute.
     * @param permissions The value for permissions 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder permissions(LayoutService.Permissions permissions) {
      this.permissions = Preconditions.checkNotNull(permissions, "permissions");
      initBits &= ~INIT_BIT_PERMISSIONS;
      return this;
    }

    /**
     * Adds one element to {@link LayoutService.FilteredAgentRollup#children() children} list.
     * @param element A children element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addChildren(LayoutService.FilteredAgentRollup element) {
      this.children.add(element);
      return this;
    }

    /**
     * Adds elements to {@link LayoutService.FilteredAgentRollup#children() children} list.
     * @param elements An array of children elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addChildren(LayoutService.FilteredAgentRollup... elements) {
      this.children.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link LayoutService.FilteredAgentRollup#children() children} list.
     * @param elements An iterable of children elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder children(Iterable<? extends LayoutService.FilteredAgentRollup> elements) {
      this.children = ImmutableList.builder();
      return addAllChildren(elements);
    }

    /**
     * Adds elements to {@link LayoutService.FilteredAgentRollup#children() children} list.
     * @param elements An iterable of children elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllChildren(Iterable<? extends LayoutService.FilteredAgentRollup> elements) {
      this.children.addAll(elements);
      return this;
    }

    /**
     * Builds a new {@link ImmutableFilteredAgentRollup ImmutableFilteredAgentRollup}.
     * @return An immutable instance of FilteredAgentRollup
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableFilteredAgentRollup build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableFilteredAgentRollup(id, display, agent, permissions, children.build());
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_ID) != 0) attributes.add("id");
      if ((initBits & INIT_BIT_DISPLAY) != 0) attributes.add("display");
      if ((initBits & INIT_BIT_AGENT) != 0) attributes.add("agent");
      if ((initBits & INIT_BIT_PERMISSIONS) != 0) attributes.add("permissions");
      return "Cannot build FilteredAgentRollup, some of required attributes are not set " + attributes;
    }
  }
}
