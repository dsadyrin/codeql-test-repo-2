package org.glowroot.agent.shaded.glowroot.common.repo;

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
 * Immutable implementation of {@link GaugeValueRepository.Gauge}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableGauge.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code ImmutableGauge.of()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "GaugeValueRepository.Gauge"})
@Immutable
public final class ImmutableGauge implements GaugeValueRepository.Gauge {
  private final String name;
  private final String display;
  private final ImmutableList<String> displayPath;
  private final boolean counter;
  private final String unit;
  private final String grouping;

  private ImmutableGauge(
      String name,
      String display,
      Iterable<String> displayPath,
      boolean counter,
      String unit,
      String grouping) {
    this.name = Preconditions.checkNotNull(name, "name");
    this.display = Preconditions.checkNotNull(display, "display");
    this.displayPath = ImmutableList.copyOf(displayPath);
    this.counter = counter;
    this.unit = Preconditions.checkNotNull(unit, "unit");
    this.grouping = Preconditions.checkNotNull(grouping, "grouping");
  }

  private ImmutableGauge(
      ImmutableGauge original,
      String name,
      String display,
      ImmutableList<String> displayPath,
      boolean counter,
      String unit,
      String grouping) {
    this.name = name;
    this.display = display;
    this.displayPath = displayPath;
    this.counter = counter;
    this.unit = unit;
    this.grouping = grouping;
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @JsonProperty("name")
  @Override
  public String name() {
    return name;
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
   * @return The value of the {@code displayPath} attribute
   */
  @JsonProperty("displayPath")
  @Override
  public ImmutableList<String> displayPath() {
    return displayPath;
  }

  /**
   * @return The value of the {@code counter} attribute
   */
  @JsonProperty("counter")
  @Override
  public boolean counter() {
    return counter;
  }

  /**
   * @return The value of the {@code unit} attribute
   */
  @JsonProperty("unit")
  @Override
  public String unit() {
    return unit;
  }

  /**
   * @return The value of the {@code grouping} attribute
   */
  @JsonProperty("grouping")
  @Override
  public String grouping() {
    return grouping;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link GaugeValueRepository.Gauge#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableGauge withName(String value) {
    if (this.name.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "name");
    return new ImmutableGauge(this, newValue, this.display, this.displayPath, this.counter, this.unit, this.grouping);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link GaugeValueRepository.Gauge#display() display} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for display
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableGauge withDisplay(String value) {
    if (this.display.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "display");
    return new ImmutableGauge(this, this.name, newValue, this.displayPath, this.counter, this.unit, this.grouping);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link GaugeValueRepository.Gauge#displayPath() displayPath}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGauge withDisplayPath(String... elements) {
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableGauge(this, this.name, this.display, newValue, this.counter, this.unit, this.grouping);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link GaugeValueRepository.Gauge#displayPath() displayPath}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of displayPath elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGauge withDisplayPath(Iterable<String> elements) {
    if (this.displayPath == elements) return this;
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableGauge(this, this.name, this.display, newValue, this.counter, this.unit, this.grouping);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link GaugeValueRepository.Gauge#counter() counter} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for counter
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableGauge withCounter(boolean value) {
    if (this.counter == value) return this;
    return new ImmutableGauge(this, this.name, this.display, this.displayPath, value, this.unit, this.grouping);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link GaugeValueRepository.Gauge#unit() unit} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for unit
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableGauge withUnit(String value) {
    if (this.unit.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "unit");
    return new ImmutableGauge(this, this.name, this.display, this.displayPath, this.counter, newValue, this.grouping);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link GaugeValueRepository.Gauge#grouping() grouping} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for grouping
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableGauge withGrouping(String value) {
    if (this.grouping.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "grouping");
    return new ImmutableGauge(this, this.name, this.display, this.displayPath, this.counter, this.unit, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableGauge} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableGauge
        && equalTo((ImmutableGauge) another);
  }

  private boolean equalTo(ImmutableGauge another) {
    return name.equals(another.name)
        && display.equals(another.display)
        && displayPath.equals(another.displayPath)
        && counter == another.counter
        && unit.equals(another.unit)
        && grouping.equals(another.grouping);
  }

  /**
   * Computes a hash code from attributes: {@code name}, {@code display}, {@code displayPath}, {@code counter}, {@code unit}, {@code grouping}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + name.hashCode();
    h += (h << 5) + display.hashCode();
    h += (h << 5) + displayPath.hashCode();
    h += (h << 5) + Booleans.hashCode(counter);
    h += (h << 5) + unit.hashCode();
    h += (h << 5) + grouping.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Gauge} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("Gauge")
        .omitNullValues()
        .add("name", name)
        .add("display", display)
        .add("displayPath", displayPath)
        .add("counter", counter)
        .add("unit", unit)
        .add("grouping", grouping)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements GaugeValueRepository.Gauge {
    @Nullable String name;
    @Nullable String display;
    List<String> displayPath = ImmutableList.of();
    boolean counter;
    boolean counterIsSet;
    @Nullable String unit;
    @Nullable String grouping;
    @JsonProperty("name")
    public void setName(String name) {
      this.name = name;
    }
    @JsonProperty("display")
    public void setDisplay(String display) {
      this.display = display;
    }
    @JsonProperty("displayPath")
    public void setDisplayPath(List<String> displayPath) {
      this.displayPath = displayPath;
    }
    @JsonProperty("counter")
    public void setCounter(boolean counter) {
      this.counter = counter;
      this.counterIsSet = true;
    }
    @JsonProperty("unit")
    public void setUnit(String unit) {
      this.unit = unit;
    }
    @JsonProperty("grouping")
    public void setGrouping(String grouping) {
      this.grouping = grouping;
    }
    @Override
    public String name() { throw new UnsupportedOperationException(); }
    @Override
    public String display() { throw new UnsupportedOperationException(); }
    @Override
    public List<String> displayPath() { throw new UnsupportedOperationException(); }
    @Override
    public boolean counter() { throw new UnsupportedOperationException(); }
    @Override
    public String unit() { throw new UnsupportedOperationException(); }
    @Override
    public String grouping() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableGauge fromJson(Json json) {
    ImmutableGauge.Builder builder = ImmutableGauge.builder();
    if (json.name != null) {
      builder.name(json.name);
    }
    if (json.display != null) {
      builder.display(json.display);
    }
    if (json.displayPath != null) {
      builder.addAllDisplayPath(json.displayPath);
    }
    if (json.counterIsSet) {
      builder.counter(json.counter);
    }
    if (json.unit != null) {
      builder.unit(json.unit);
    }
    if (json.grouping != null) {
      builder.grouping(json.grouping);
    }
    return builder.build();
  }

  /**
   * Construct a new immutable {@code Gauge} instance.
   * @param name The value for the {@code name} attribute
   * @param display The value for the {@code display} attribute
   * @param displayPath The value for the {@code displayPath} attribute
   * @param counter The value for the {@code counter} attribute
   * @param unit The value for the {@code unit} attribute
   * @param grouping The value for the {@code grouping} attribute
   * @return An immutable Gauge instance
   */
  public static ImmutableGauge of(String name, String display, List<String> displayPath, boolean counter, String unit, String grouping) {
    return of(name, display, (Iterable<String>) displayPath, counter, unit, grouping);
  }

  /**
   * Construct a new immutable {@code Gauge} instance.
   * @param name The value for the {@code name} attribute
   * @param display The value for the {@code display} attribute
   * @param displayPath The value for the {@code displayPath} attribute
   * @param counter The value for the {@code counter} attribute
   * @param unit The value for the {@code unit} attribute
   * @param grouping The value for the {@code grouping} attribute
   * @return An immutable Gauge instance
   */
  public static ImmutableGauge of(String name, String display, Iterable<String> displayPath, boolean counter, String unit, String grouping) {
    return new ImmutableGauge(name, display, displayPath, counter, unit, grouping);
  }

  /**
   * Creates an immutable copy of a {@link GaugeValueRepository.Gauge} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Gauge instance
   */
  public static ImmutableGauge copyOf(GaugeValueRepository.Gauge instance) {
    if (instance instanceof ImmutableGauge) {
      return (ImmutableGauge) instance;
    }
    return ImmutableGauge.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableGauge ImmutableGauge}.
   * @return A new ImmutableGauge builder
   */
  public static ImmutableGauge.Builder builder() {
    return new ImmutableGauge.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableGauge ImmutableGauge}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_NAME = 0x1L;
    private static final long INIT_BIT_DISPLAY = 0x2L;
    private static final long INIT_BIT_COUNTER = 0x4L;
    private static final long INIT_BIT_UNIT = 0x8L;
    private static final long INIT_BIT_GROUPING = 0x10L;
    private long initBits = 0x1fL;

    private @Nullable String name;
    private @Nullable String display;
    private ImmutableList.Builder<String> displayPath = ImmutableList.builder();
    private boolean counter;
    private @Nullable String unit;
    private @Nullable String grouping;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Gauge} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(GaugeValueRepository.Gauge instance) {
      Preconditions.checkNotNull(instance, "instance");
      name(instance.name());
      display(instance.display());
      addAllDisplayPath(instance.displayPath());
      counter(instance.counter());
      unit(instance.unit());
      grouping(instance.grouping());
      return this;
    }

    /**
     * Initializes the value for the {@link GaugeValueRepository.Gauge#name() name} attribute.
     * @param name The value for name 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder name(String name) {
      this.name = Preconditions.checkNotNull(name, "name");
      initBits &= ~INIT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link GaugeValueRepository.Gauge#display() display} attribute.
     * @param display The value for display 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder display(String display) {
      this.display = Preconditions.checkNotNull(display, "display");
      initBits &= ~INIT_BIT_DISPLAY;
      return this;
    }

    /**
     * Adds one element to {@link GaugeValueRepository.Gauge#displayPath() displayPath} list.
     * @param element A displayPath element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addDisplayPath(String element) {
      this.displayPath.add(element);
      return this;
    }

    /**
     * Adds elements to {@link GaugeValueRepository.Gauge#displayPath() displayPath} list.
     * @param elements An array of displayPath elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addDisplayPath(String... elements) {
      this.displayPath.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link GaugeValueRepository.Gauge#displayPath() displayPath} list.
     * @param elements An iterable of displayPath elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder displayPath(Iterable<String> elements) {
      this.displayPath = ImmutableList.builder();
      return addAllDisplayPath(elements);
    }

    /**
     * Adds elements to {@link GaugeValueRepository.Gauge#displayPath() displayPath} list.
     * @param elements An iterable of displayPath elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllDisplayPath(Iterable<String> elements) {
      this.displayPath.addAll(elements);
      return this;
    }

    /**
     * Initializes the value for the {@link GaugeValueRepository.Gauge#counter() counter} attribute.
     * @param counter The value for counter 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder counter(boolean counter) {
      this.counter = counter;
      initBits &= ~INIT_BIT_COUNTER;
      return this;
    }

    /**
     * Initializes the value for the {@link GaugeValueRepository.Gauge#unit() unit} attribute.
     * @param unit The value for unit 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder unit(String unit) {
      this.unit = Preconditions.checkNotNull(unit, "unit");
      initBits &= ~INIT_BIT_UNIT;
      return this;
    }

    /**
     * Initializes the value for the {@link GaugeValueRepository.Gauge#grouping() grouping} attribute.
     * @param grouping The value for grouping 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder grouping(String grouping) {
      this.grouping = Preconditions.checkNotNull(grouping, "grouping");
      initBits &= ~INIT_BIT_GROUPING;
      return this;
    }

    /**
     * Builds a new {@link ImmutableGauge ImmutableGauge}.
     * @return An immutable instance of Gauge
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableGauge build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableGauge(null, name, display, displayPath.build(), counter, unit, grouping);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      if ((initBits & INIT_BIT_DISPLAY) != 0) attributes.add("display");
      if ((initBits & INIT_BIT_COUNTER) != 0) attributes.add("counter");
      if ((initBits & INIT_BIT_UNIT) != 0) attributes.add("unit");
      if ((initBits & INIT_BIT_GROUPING) != 0) attributes.add("grouping");
      return "Cannot build Gauge, some of required attributes are not set " + attributes;
    }
  }
}
