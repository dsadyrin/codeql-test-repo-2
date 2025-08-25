package org.glowroot.agent.shaded.glowroot.ui;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import org.glowroot.agent.shaded.google.common.collect.ImmutableList;
import org.glowroot.agent.shaded.google.common.collect.ImmutableMap;
import org.glowroot.agent.shaded.google.common.collect.Lists;
import org.glowroot.agent.shaded.google.common.primitives.Booleans;
import org.glowroot.agent.shaded.google.common.primitives.Doubles;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link LayoutService.AgentRollupLayout}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAgentRollupLayout.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "LayoutService.AgentRollupLayout"})
@Immutable
final class ImmutableAgentRollupLayout implements LayoutService.AgentRollupLayout {
  private final String display;
  private final int depth;
  private final boolean agent;
  private final LayoutService.Permissions permissions;
  private final ImmutableList<String> transactionTypes;
  private final ImmutableMap<String, List<String>> traceAttributeNames;
  private final String defaultDisplayedTransactionType;
  private final ImmutableList<Double> defaultDisplayedPercentiles;

  private ImmutableAgentRollupLayout(
      String display,
      int depth,
      boolean agent,
      LayoutService.Permissions permissions,
      ImmutableList<String> transactionTypes,
      ImmutableMap<String, List<String>> traceAttributeNames,
      String defaultDisplayedTransactionType,
      ImmutableList<Double> defaultDisplayedPercentiles) {
    this.display = display;
    this.depth = depth;
    this.agent = agent;
    this.permissions = permissions;
    this.transactionTypes = transactionTypes;
    this.traceAttributeNames = traceAttributeNames;
    this.defaultDisplayedTransactionType = defaultDisplayedTransactionType;
    this.defaultDisplayedPercentiles = defaultDisplayedPercentiles;
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
   * @return The value of the {@code depth} attribute
   */
  @JsonProperty("depth")
  @Override
  public int depth() {
    return depth;
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
   * @return The value of the {@code transactionTypes} attribute
   */
  @JsonProperty("transactionTypes")
  @Override
  public ImmutableList<String> transactionTypes() {
    return transactionTypes;
  }

  /**
   * @return The value of the {@code traceAttributeNames} attribute
   */
  @JsonProperty("traceAttributeNames")
  @Override
  public ImmutableMap<String, List<String>> traceAttributeNames() {
    return traceAttributeNames;
  }

  /**
   * @return The value of the {@code defaultDisplayedTransactionType} attribute
   */
  @JsonProperty("defaultDisplayedTransactionType")
  @Override
  public String defaultDisplayedTransactionType() {
    return defaultDisplayedTransactionType;
  }

  /**
   * @return The value of the {@code defaultDisplayedPercentiles} attribute
   */
  @JsonProperty("defaultDisplayedPercentiles")
  @Override
  public ImmutableList<Double> defaultDisplayedPercentiles() {
    return defaultDisplayedPercentiles;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LayoutService.AgentRollupLayout#display() display} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for display
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAgentRollupLayout withDisplay(String value) {
    if (this.display.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "display");
    return new ImmutableAgentRollupLayout(
        newValue,
        this.depth,
        this.agent,
        this.permissions,
        this.transactionTypes,
        this.traceAttributeNames,
        this.defaultDisplayedTransactionType,
        this.defaultDisplayedPercentiles);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LayoutService.AgentRollupLayout#depth() depth} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for depth
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAgentRollupLayout withDepth(int value) {
    if (this.depth == value) return this;
    return new ImmutableAgentRollupLayout(
        this.display,
        value,
        this.agent,
        this.permissions,
        this.transactionTypes,
        this.traceAttributeNames,
        this.defaultDisplayedTransactionType,
        this.defaultDisplayedPercentiles);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LayoutService.AgentRollupLayout#agent() agent} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for agent
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAgentRollupLayout withAgent(boolean value) {
    if (this.agent == value) return this;
    return new ImmutableAgentRollupLayout(
        this.display,
        this.depth,
        value,
        this.permissions,
        this.transactionTypes,
        this.traceAttributeNames,
        this.defaultDisplayedTransactionType,
        this.defaultDisplayedPercentiles);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LayoutService.AgentRollupLayout#permissions() permissions} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for permissions
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAgentRollupLayout withPermissions(LayoutService.Permissions value) {
    if (this.permissions == value) return this;
    LayoutService.Permissions newValue = Preconditions.checkNotNull(value, "permissions");
    return new ImmutableAgentRollupLayout(
        this.display,
        this.depth,
        this.agent,
        newValue,
        this.transactionTypes,
        this.traceAttributeNames,
        this.defaultDisplayedTransactionType,
        this.defaultDisplayedPercentiles);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link LayoutService.AgentRollupLayout#transactionTypes() transactionTypes}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAgentRollupLayout withTransactionTypes(String... elements) {
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableAgentRollupLayout(
        this.display,
        this.depth,
        this.agent,
        this.permissions,
        newValue,
        this.traceAttributeNames,
        this.defaultDisplayedTransactionType,
        this.defaultDisplayedPercentiles);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link LayoutService.AgentRollupLayout#transactionTypes() transactionTypes}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of transactionTypes elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAgentRollupLayout withTransactionTypes(Iterable<String> elements) {
    if (this.transactionTypes == elements) return this;
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableAgentRollupLayout(
        this.display,
        this.depth,
        this.agent,
        this.permissions,
        newValue,
        this.traceAttributeNames,
        this.defaultDisplayedTransactionType,
        this.defaultDisplayedPercentiles);
  }

  /**
   * Copy the current immutable object by replacing the {@link LayoutService.AgentRollupLayout#traceAttributeNames() traceAttributeNames} map with the specified map.
   * Nulls are not permitted as keys or values.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param entries The entries to be added to the traceAttributeNames map
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAgentRollupLayout withTraceAttributeNames(Map<String, ? extends List<String>> entries) {
    if (this.traceAttributeNames == entries) return this;
    ImmutableMap<String, List<String>> newValue = ImmutableMap.copyOf(entries);
    return new ImmutableAgentRollupLayout(
        this.display,
        this.depth,
        this.agent,
        this.permissions,
        this.transactionTypes,
        newValue,
        this.defaultDisplayedTransactionType,
        this.defaultDisplayedPercentiles);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LayoutService.AgentRollupLayout#defaultDisplayedTransactionType() defaultDisplayedTransactionType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for defaultDisplayedTransactionType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAgentRollupLayout withDefaultDisplayedTransactionType(String value) {
    if (this.defaultDisplayedTransactionType.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "defaultDisplayedTransactionType");
    return new ImmutableAgentRollupLayout(
        this.display,
        this.depth,
        this.agent,
        this.permissions,
        this.transactionTypes,
        this.traceAttributeNames,
        newValue,
        this.defaultDisplayedPercentiles);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link LayoutService.AgentRollupLayout#defaultDisplayedPercentiles() defaultDisplayedPercentiles}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAgentRollupLayout withDefaultDisplayedPercentiles(double... elements) {
    ImmutableList<Double> newValue = ImmutableList.copyOf(Doubles.asList(elements));
    return new ImmutableAgentRollupLayout(
        this.display,
        this.depth,
        this.agent,
        this.permissions,
        this.transactionTypes,
        this.traceAttributeNames,
        this.defaultDisplayedTransactionType,
        newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link LayoutService.AgentRollupLayout#defaultDisplayedPercentiles() defaultDisplayedPercentiles}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of defaultDisplayedPercentiles elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAgentRollupLayout withDefaultDisplayedPercentiles(Iterable<Double> elements) {
    if (this.defaultDisplayedPercentiles == elements) return this;
    ImmutableList<Double> newValue = ImmutableList.copyOf(elements);
    return new ImmutableAgentRollupLayout(
        this.display,
        this.depth,
        this.agent,
        this.permissions,
        this.transactionTypes,
        this.traceAttributeNames,
        this.defaultDisplayedTransactionType,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAgentRollupLayout} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAgentRollupLayout
        && equalTo((ImmutableAgentRollupLayout) another);
  }

  private boolean equalTo(ImmutableAgentRollupLayout another) {
    return display.equals(another.display)
        && depth == another.depth
        && agent == another.agent
        && permissions.equals(another.permissions)
        && transactionTypes.equals(another.transactionTypes)
        && traceAttributeNames.equals(another.traceAttributeNames)
        && defaultDisplayedTransactionType.equals(another.defaultDisplayedTransactionType)
        && defaultDisplayedPercentiles.equals(another.defaultDisplayedPercentiles);
  }

  /**
   * Computes a hash code from attributes: {@code display}, {@code depth}, {@code agent}, {@code permissions}, {@code transactionTypes}, {@code traceAttributeNames}, {@code defaultDisplayedTransactionType}, {@code defaultDisplayedPercentiles}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + display.hashCode();
    h += (h << 5) + depth;
    h += (h << 5) + Booleans.hashCode(agent);
    h += (h << 5) + permissions.hashCode();
    h += (h << 5) + transactionTypes.hashCode();
    h += (h << 5) + traceAttributeNames.hashCode();
    h += (h << 5) + defaultDisplayedTransactionType.hashCode();
    h += (h << 5) + defaultDisplayedPercentiles.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code AgentRollupLayout} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("AgentRollupLayout")
        .omitNullValues()
        .add("display", display)
        .add("depth", depth)
        .add("agent", agent)
        .add("permissions", permissions)
        .add("transactionTypes", transactionTypes)
        .add("traceAttributeNames", traceAttributeNames)
        .add("defaultDisplayedTransactionType", defaultDisplayedTransactionType)
        .add("defaultDisplayedPercentiles", defaultDisplayedPercentiles)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements LayoutService.AgentRollupLayout {
    @Nullable String display;
    int depth;
    boolean depthIsSet;
    boolean agent;
    boolean agentIsSet;
    @Nullable LayoutService.Permissions permissions;
    List<String> transactionTypes = ImmutableList.of();
    @Nullable Map<String, List<String>> traceAttributeNames;
    @Nullable String defaultDisplayedTransactionType;
    List<Double> defaultDisplayedPercentiles = ImmutableList.of();
    @JsonProperty("display")
    public void setDisplay(String display) {
      this.display = display;
    }
    @JsonProperty("depth")
    public void setDepth(int depth) {
      this.depth = depth;
      this.depthIsSet = true;
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
    @JsonProperty("transactionTypes")
    public void setTransactionTypes(List<String> transactionTypes) {
      this.transactionTypes = transactionTypes;
    }
    @JsonProperty("traceAttributeNames")
    public void setTraceAttributeNames(Map<String, List<String>> traceAttributeNames) {
      this.traceAttributeNames = traceAttributeNames;
    }
    @JsonProperty("defaultDisplayedTransactionType")
    public void setDefaultDisplayedTransactionType(String defaultDisplayedTransactionType) {
      this.defaultDisplayedTransactionType = defaultDisplayedTransactionType;
    }
    @JsonProperty("defaultDisplayedPercentiles")
    public void setDefaultDisplayedPercentiles(List<Double> defaultDisplayedPercentiles) {
      this.defaultDisplayedPercentiles = defaultDisplayedPercentiles;
    }
    @Override
    public String display() { throw new UnsupportedOperationException(); }
    @Override
    public int depth() { throw new UnsupportedOperationException(); }
    @Override
    public boolean agent() { throw new UnsupportedOperationException(); }
    @Override
    public LayoutService.Permissions permissions() { throw new UnsupportedOperationException(); }
    @Override
    public List<String> transactionTypes() { throw new UnsupportedOperationException(); }
    @Override
    public Map<String, List<String>> traceAttributeNames() { throw new UnsupportedOperationException(); }
    @Override
    public String defaultDisplayedTransactionType() { throw new UnsupportedOperationException(); }
    @Override
    public List<Double> defaultDisplayedPercentiles() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableAgentRollupLayout fromJson(Json json) {
    ImmutableAgentRollupLayout.Builder builder = ImmutableAgentRollupLayout.builder();
    if (json.display != null) {
      builder.display(json.display);
    }
    if (json.depthIsSet) {
      builder.depth(json.depth);
    }
    if (json.agentIsSet) {
      builder.agent(json.agent);
    }
    if (json.permissions != null) {
      builder.permissions(json.permissions);
    }
    if (json.transactionTypes != null) {
      builder.addAllTransactionTypes(json.transactionTypes);
    }
    if (json.traceAttributeNames != null) {
      builder.putAllTraceAttributeNames(json.traceAttributeNames);
    }
    if (json.defaultDisplayedTransactionType != null) {
      builder.defaultDisplayedTransactionType(json.defaultDisplayedTransactionType);
    }
    if (json.defaultDisplayedPercentiles != null) {
      builder.addAllDefaultDisplayedPercentiles(json.defaultDisplayedPercentiles);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link LayoutService.AgentRollupLayout} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable AgentRollupLayout instance
   */
  public static ImmutableAgentRollupLayout copyOf(LayoutService.AgentRollupLayout instance) {
    if (instance instanceof ImmutableAgentRollupLayout) {
      return (ImmutableAgentRollupLayout) instance;
    }
    return ImmutableAgentRollupLayout.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableAgentRollupLayout ImmutableAgentRollupLayout}.
   * @return A new ImmutableAgentRollupLayout builder
   */
  public static ImmutableAgentRollupLayout.Builder builder() {
    return new ImmutableAgentRollupLayout.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableAgentRollupLayout ImmutableAgentRollupLayout}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_DISPLAY = 0x1L;
    private static final long INIT_BIT_DEPTH = 0x2L;
    private static final long INIT_BIT_AGENT = 0x4L;
    private static final long INIT_BIT_PERMISSIONS = 0x8L;
    private static final long INIT_BIT_DEFAULT_DISPLAYED_TRANSACTION_TYPE = 0x10L;
    private long initBits = 0x1fL;

    private @Nullable String display;
    private int depth;
    private boolean agent;
    private @Nullable LayoutService.Permissions permissions;
    private ImmutableList.Builder<String> transactionTypes = ImmutableList.builder();
    private ImmutableMap.Builder<String, List<String>> traceAttributeNames = ImmutableMap.builder();
    private @Nullable String defaultDisplayedTransactionType;
    private ImmutableList.Builder<Double> defaultDisplayedPercentiles = ImmutableList.builder();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code AgentRollupLayout} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(LayoutService.AgentRollupLayout instance) {
      Preconditions.checkNotNull(instance, "instance");
      display(instance.display());
      depth(instance.depth());
      agent(instance.agent());
      permissions(instance.permissions());
      addAllTransactionTypes(instance.transactionTypes());
      putAllTraceAttributeNames(instance.traceAttributeNames());
      defaultDisplayedTransactionType(instance.defaultDisplayedTransactionType());
      addAllDefaultDisplayedPercentiles(instance.defaultDisplayedPercentiles());
      return this;
    }

    /**
     * Initializes the value for the {@link LayoutService.AgentRollupLayout#display() display} attribute.
     * @param display The value for display 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder display(String display) {
      this.display = Preconditions.checkNotNull(display, "display");
      initBits &= ~INIT_BIT_DISPLAY;
      return this;
    }

    /**
     * Initializes the value for the {@link LayoutService.AgentRollupLayout#depth() depth} attribute.
     * @param depth The value for depth 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder depth(int depth) {
      this.depth = depth;
      initBits &= ~INIT_BIT_DEPTH;
      return this;
    }

    /**
     * Initializes the value for the {@link LayoutService.AgentRollupLayout#agent() agent} attribute.
     * @param agent The value for agent 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder agent(boolean agent) {
      this.agent = agent;
      initBits &= ~INIT_BIT_AGENT;
      return this;
    }

    /**
     * Initializes the value for the {@link LayoutService.AgentRollupLayout#permissions() permissions} attribute.
     * @param permissions The value for permissions 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder permissions(LayoutService.Permissions permissions) {
      this.permissions = Preconditions.checkNotNull(permissions, "permissions");
      initBits &= ~INIT_BIT_PERMISSIONS;
      return this;
    }

    /**
     * Adds one element to {@link LayoutService.AgentRollupLayout#transactionTypes() transactionTypes} list.
     * @param element A transactionTypes element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addTransactionTypes(String element) {
      this.transactionTypes.add(element);
      return this;
    }

    /**
     * Adds elements to {@link LayoutService.AgentRollupLayout#transactionTypes() transactionTypes} list.
     * @param elements An array of transactionTypes elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addTransactionTypes(String... elements) {
      this.transactionTypes.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link LayoutService.AgentRollupLayout#transactionTypes() transactionTypes} list.
     * @param elements An iterable of transactionTypes elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder transactionTypes(Iterable<String> elements) {
      this.transactionTypes = ImmutableList.builder();
      return addAllTransactionTypes(elements);
    }

    /**
     * Adds elements to {@link LayoutService.AgentRollupLayout#transactionTypes() transactionTypes} list.
     * @param elements An iterable of transactionTypes elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllTransactionTypes(Iterable<String> elements) {
      this.transactionTypes.addAll(elements);
      return this;
    }

    /**
     * Put one entry to the {@link LayoutService.AgentRollupLayout#traceAttributeNames() traceAttributeNames} map.
     * @param key The key in the traceAttributeNames map
     * @param value The associated value in the traceAttributeNames map
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder putTraceAttributeNames(String key, List<String> value) {
      this.traceAttributeNames.put(key, value);
      return this;
    }

    /**
     * Put one entry to the {@link LayoutService.AgentRollupLayout#traceAttributeNames() traceAttributeNames} map. Nulls are not permitted
     * @param entry The key and value entry
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder putTraceAttributeNames(Map.Entry<String, ? extends List<String>> entry) {
      this.traceAttributeNames.put(entry);
      return this;
    }

    /**
     * Sets or replaces all mappings from the specified map as entries for the {@link LayoutService.AgentRollupLayout#traceAttributeNames() traceAttributeNames} map. Nulls are not permitted
     * @param traceAttributeNames The entries that will be added to the traceAttributeNames map
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder traceAttributeNames(Map<String, ? extends List<String>> traceAttributeNames) {
      this.traceAttributeNames = ImmutableMap.builder();
      return putAllTraceAttributeNames(traceAttributeNames);
    }

    /**
     * Put all mappings from the specified map as entries to {@link LayoutService.AgentRollupLayout#traceAttributeNames() traceAttributeNames} map. Nulls are not permitted
     * @param traceAttributeNames The entries that will be added to the traceAttributeNames map
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder putAllTraceAttributeNames(Map<String, ? extends List<String>> traceAttributeNames) {
      this.traceAttributeNames.putAll(traceAttributeNames);
      return this;
    }

    /**
     * Initializes the value for the {@link LayoutService.AgentRollupLayout#defaultDisplayedTransactionType() defaultDisplayedTransactionType} attribute.
     * @param defaultDisplayedTransactionType The value for defaultDisplayedTransactionType 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder defaultDisplayedTransactionType(String defaultDisplayedTransactionType) {
      this.defaultDisplayedTransactionType = Preconditions.checkNotNull(defaultDisplayedTransactionType, "defaultDisplayedTransactionType");
      initBits &= ~INIT_BIT_DEFAULT_DISPLAYED_TRANSACTION_TYPE;
      return this;
    }

    /**
     * Adds one element to {@link LayoutService.AgentRollupLayout#defaultDisplayedPercentiles() defaultDisplayedPercentiles} list.
     * @param element A defaultDisplayedPercentiles element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addDefaultDisplayedPercentiles(double element) {
      this.defaultDisplayedPercentiles.add(element);
      return this;
    }

    /**
     * Adds elements to {@link LayoutService.AgentRollupLayout#defaultDisplayedPercentiles() defaultDisplayedPercentiles} list.
     * @param elements An array of defaultDisplayedPercentiles elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addDefaultDisplayedPercentiles(double... elements) {
      this.defaultDisplayedPercentiles.addAll(Doubles.asList(elements));
      return this;
    }

    /**
     * Sets or replaces all elements for {@link LayoutService.AgentRollupLayout#defaultDisplayedPercentiles() defaultDisplayedPercentiles} list.
     * @param elements An iterable of defaultDisplayedPercentiles elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder defaultDisplayedPercentiles(Iterable<Double> elements) {
      this.defaultDisplayedPercentiles = ImmutableList.builder();
      return addAllDefaultDisplayedPercentiles(elements);
    }

    /**
     * Adds elements to {@link LayoutService.AgentRollupLayout#defaultDisplayedPercentiles() defaultDisplayedPercentiles} list.
     * @param elements An iterable of defaultDisplayedPercentiles elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllDefaultDisplayedPercentiles(Iterable<Double> elements) {
      this.defaultDisplayedPercentiles.addAll(elements);
      return this;
    }

    /**
     * Builds a new {@link ImmutableAgentRollupLayout ImmutableAgentRollupLayout}.
     * @return An immutable instance of AgentRollupLayout
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableAgentRollupLayout build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableAgentRollupLayout(
          display,
          depth,
          agent,
          permissions,
          transactionTypes.build(),
          traceAttributeNames.build(),
          defaultDisplayedTransactionType,
          defaultDisplayedPercentiles.build());
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_DISPLAY) != 0) attributes.add("display");
      if ((initBits & INIT_BIT_DEPTH) != 0) attributes.add("depth");
      if ((initBits & INIT_BIT_AGENT) != 0) attributes.add("agent");
      if ((initBits & INIT_BIT_PERMISSIONS) != 0) attributes.add("permissions");
      if ((initBits & INIT_BIT_DEFAULT_DISPLAYED_TRANSACTION_TYPE) != 0) attributes.add("defaultDisplayedTransactionType");
      return "Cannot build AgentRollupLayout, some of required attributes are not set " + attributes;
    }
  }
}
