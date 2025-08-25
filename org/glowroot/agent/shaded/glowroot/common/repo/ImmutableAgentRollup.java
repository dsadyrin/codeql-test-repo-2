package org.glowroot.agent.shaded.glowroot.common.repo;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Objects;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import org.glowroot.agent.shaded.google.common.collect.ImmutableList;
import org.glowroot.agent.shaded.google.common.collect.Lists;
import org.glowroot.agent.shaded.google.common.primitives.Booleans;
import java.util.Date;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link AgentRollupRepository.AgentRollup}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAgentRollup.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code ImmutableAgentRollup.of()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "AgentRollupRepository.AgentRollup"})
@Immutable
public final class ImmutableAgentRollup implements AgentRollupRepository.AgentRollup {
  private final String id;
  private final String display;
  private final boolean agent;
  private final @Nullable Date lastCaptureTime;
  private final ImmutableList<AgentRollupRepository.AgentRollup> children;

  private ImmutableAgentRollup(
      String id,
      String display,
      boolean agent,
      @Nullable Date lastCaptureTime,
      Iterable<? extends AgentRollupRepository.AgentRollup> children) {
    this.id = Preconditions.checkNotNull(id, "id");
    this.display = Preconditions.checkNotNull(display, "display");
    this.agent = agent;
    this.lastCaptureTime = lastCaptureTime;
    this.children = ImmutableList.copyOf(children);
  }

  private ImmutableAgentRollup(
      ImmutableAgentRollup original,
      String id,
      String display,
      boolean agent,
      @Nullable Date lastCaptureTime,
      ImmutableList<AgentRollupRepository.AgentRollup> children) {
    this.id = id;
    this.display = display;
    this.agent = agent;
    this.lastCaptureTime = lastCaptureTime;
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
   * @return The value of the {@code lastCaptureTime} attribute
   */
  @JsonProperty("lastCaptureTime")
  @Override
  public @Nullable Date lastCaptureTime() {
    return lastCaptureTime;
  }

  /**
   * @return The value of the {@code children} attribute
   */
  @JsonProperty("children")
  @Override
  public ImmutableList<AgentRollupRepository.AgentRollup> children() {
    return children;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AgentRollupRepository.AgentRollup#id() id} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for id
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAgentRollup withId(String value) {
    if (this.id.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "id");
    return new ImmutableAgentRollup(this, newValue, this.display, this.agent, this.lastCaptureTime, this.children);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AgentRollupRepository.AgentRollup#display() display} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for display
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAgentRollup withDisplay(String value) {
    if (this.display.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "display");
    return new ImmutableAgentRollup(this, this.id, newValue, this.agent, this.lastCaptureTime, this.children);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AgentRollupRepository.AgentRollup#agent() agent} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for agent
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAgentRollup withAgent(boolean value) {
    if (this.agent == value) return this;
    return new ImmutableAgentRollup(this, this.id, this.display, value, this.lastCaptureTime, this.children);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AgentRollupRepository.AgentRollup#lastCaptureTime() lastCaptureTime} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lastCaptureTime (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAgentRollup withLastCaptureTime(@Nullable Date value) {
    if (this.lastCaptureTime == value) return this;
    return new ImmutableAgentRollup(this, this.id, this.display, this.agent, value, this.children);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link AgentRollupRepository.AgentRollup#children() children}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAgentRollup withChildren(AgentRollupRepository.AgentRollup... elements) {
    ImmutableList<AgentRollupRepository.AgentRollup> newValue = ImmutableList.copyOf(elements);
    return new ImmutableAgentRollup(this, this.id, this.display, this.agent, this.lastCaptureTime, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link AgentRollupRepository.AgentRollup#children() children}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of children elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAgentRollup withChildren(Iterable<? extends AgentRollupRepository.AgentRollup> elements) {
    if (this.children == elements) return this;
    ImmutableList<AgentRollupRepository.AgentRollup> newValue = ImmutableList.copyOf(elements);
    return new ImmutableAgentRollup(this, this.id, this.display, this.agent, this.lastCaptureTime, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAgentRollup} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAgentRollup
        && equalTo((ImmutableAgentRollup) another);
  }

  private boolean equalTo(ImmutableAgentRollup another) {
    return id.equals(another.id)
        && display.equals(another.display)
        && agent == another.agent
        && Objects.equal(lastCaptureTime, another.lastCaptureTime)
        && children.equals(another.children);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code display}, {@code agent}, {@code lastCaptureTime}, {@code children}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + id.hashCode();
    h += (h << 5) + display.hashCode();
    h += (h << 5) + Booleans.hashCode(agent);
    h += (h << 5) + Objects.hashCode(lastCaptureTime);
    h += (h << 5) + children.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code AgentRollup} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("AgentRollup")
        .omitNullValues()
        .add("id", id)
        .add("display", display)
        .add("agent", agent)
        .add("lastCaptureTime", lastCaptureTime)
        .add("children", children)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements AgentRollupRepository.AgentRollup {
    @Nullable String id;
    @Nullable String display;
    boolean agent;
    boolean agentIsSet;
    @Nullable Date lastCaptureTime;
    List<AgentRollupRepository.AgentRollup> children = ImmutableList.of();
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
    @JsonProperty("lastCaptureTime")
    public void setLastCaptureTime(@Nullable Date lastCaptureTime) {
      this.lastCaptureTime = lastCaptureTime;
    }
    @JsonProperty("children")
    public void setChildren(List<AgentRollupRepository.AgentRollup> children) {
      this.children = children;
    }
    @Override
    public String id() { throw new UnsupportedOperationException(); }
    @Override
    public String display() { throw new UnsupportedOperationException(); }
    @Override
    public boolean agent() { throw new UnsupportedOperationException(); }
    @Override
    public Date lastCaptureTime() { throw new UnsupportedOperationException(); }
    @Override
    public List<AgentRollupRepository.AgentRollup> children() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableAgentRollup fromJson(Json json) {
    ImmutableAgentRollup.Builder builder = ImmutableAgentRollup.builder();
    if (json.id != null) {
      builder.id(json.id);
    }
    if (json.display != null) {
      builder.display(json.display);
    }
    if (json.agentIsSet) {
      builder.agent(json.agent);
    }
    if (json.lastCaptureTime != null) {
      builder.lastCaptureTime(json.lastCaptureTime);
    }
    if (json.children != null) {
      builder.addAllChildren(json.children);
    }
    return builder.build();
  }

  /**
   * Construct a new immutable {@code AgentRollup} instance.
   * @param id The value for the {@code id} attribute
   * @param display The value for the {@code display} attribute
   * @param agent The value for the {@code agent} attribute
   * @param lastCaptureTime The value for the {@code lastCaptureTime} attribute
   * @param children The value for the {@code children} attribute
   * @return An immutable AgentRollup instance
   */
  public static ImmutableAgentRollup of(String id, String display, boolean agent, @Nullable Date lastCaptureTime, List<AgentRollupRepository.AgentRollup> children) {
    return of(id, display, agent, lastCaptureTime, (Iterable<? extends AgentRollupRepository.AgentRollup>) children);
  }

  /**
   * Construct a new immutable {@code AgentRollup} instance.
   * @param id The value for the {@code id} attribute
   * @param display The value for the {@code display} attribute
   * @param agent The value for the {@code agent} attribute
   * @param lastCaptureTime The value for the {@code lastCaptureTime} attribute
   * @param children The value for the {@code children} attribute
   * @return An immutable AgentRollup instance
   */
  public static ImmutableAgentRollup of(String id, String display, boolean agent, @Nullable Date lastCaptureTime, Iterable<? extends AgentRollupRepository.AgentRollup> children) {
    return new ImmutableAgentRollup(id, display, agent, lastCaptureTime, children);
  }

  /**
   * Creates an immutable copy of a {@link AgentRollupRepository.AgentRollup} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable AgentRollup instance
   */
  public static ImmutableAgentRollup copyOf(AgentRollupRepository.AgentRollup instance) {
    if (instance instanceof ImmutableAgentRollup) {
      return (ImmutableAgentRollup) instance;
    }
    return ImmutableAgentRollup.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableAgentRollup ImmutableAgentRollup}.
   * @return A new ImmutableAgentRollup builder
   */
  public static ImmutableAgentRollup.Builder builder() {
    return new ImmutableAgentRollup.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableAgentRollup ImmutableAgentRollup}.
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
    private long initBits = 0x7L;

    private @Nullable String id;
    private @Nullable String display;
    private boolean agent;
    private @Nullable Date lastCaptureTime;
    private ImmutableList.Builder<AgentRollupRepository.AgentRollup> children = ImmutableList.builder();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code AgentRollup} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(AgentRollupRepository.AgentRollup instance) {
      Preconditions.checkNotNull(instance, "instance");
      id(instance.id());
      display(instance.display());
      agent(instance.agent());
      @Nullable Date lastCaptureTimeValue = instance.lastCaptureTime();
      if (lastCaptureTimeValue != null) {
        lastCaptureTime(lastCaptureTimeValue);
      }
      addAllChildren(instance.children());
      return this;
    }

    /**
     * Initializes the value for the {@link AgentRollupRepository.AgentRollup#id() id} attribute.
     * @param id The value for id 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder id(String id) {
      this.id = Preconditions.checkNotNull(id, "id");
      initBits &= ~INIT_BIT_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link AgentRollupRepository.AgentRollup#display() display} attribute.
     * @param display The value for display 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder display(String display) {
      this.display = Preconditions.checkNotNull(display, "display");
      initBits &= ~INIT_BIT_DISPLAY;
      return this;
    }

    /**
     * Initializes the value for the {@link AgentRollupRepository.AgentRollup#agent() agent} attribute.
     * @param agent The value for agent 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder agent(boolean agent) {
      this.agent = agent;
      initBits &= ~INIT_BIT_AGENT;
      return this;
    }

    /**
     * Initializes the value for the {@link AgentRollupRepository.AgentRollup#lastCaptureTime() lastCaptureTime} attribute.
     * @param lastCaptureTime The value for lastCaptureTime (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder lastCaptureTime(@Nullable Date lastCaptureTime) {
      this.lastCaptureTime = lastCaptureTime;
      return this;
    }

    /**
     * Adds one element to {@link AgentRollupRepository.AgentRollup#children() children} list.
     * @param element A children element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addChildren(AgentRollupRepository.AgentRollup element) {
      this.children.add(element);
      return this;
    }

    /**
     * Adds elements to {@link AgentRollupRepository.AgentRollup#children() children} list.
     * @param elements An array of children elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addChildren(AgentRollupRepository.AgentRollup... elements) {
      this.children.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link AgentRollupRepository.AgentRollup#children() children} list.
     * @param elements An iterable of children elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder children(Iterable<? extends AgentRollupRepository.AgentRollup> elements) {
      this.children = ImmutableList.builder();
      return addAllChildren(elements);
    }

    /**
     * Adds elements to {@link AgentRollupRepository.AgentRollup#children() children} list.
     * @param elements An iterable of children elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllChildren(Iterable<? extends AgentRollupRepository.AgentRollup> elements) {
      this.children.addAll(elements);
      return this;
    }

    /**
     * Builds a new {@link ImmutableAgentRollup ImmutableAgentRollup}.
     * @return An immutable instance of AgentRollup
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableAgentRollup build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableAgentRollup(null, id, display, agent, lastCaptureTime, children.build());
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_ID) != 0) attributes.add("id");
      if ((initBits & INIT_BIT_DISPLAY) != 0) attributes.add("display");
      if ((initBits & INIT_BIT_AGENT) != 0) attributes.add("agent");
      return "Cannot build AgentRollup, some of required attributes are not set " + attributes;
    }
  }
}
