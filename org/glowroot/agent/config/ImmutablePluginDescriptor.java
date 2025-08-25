package org.glowroot.agent.config;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
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
 * Immutable implementation of {@link PluginDescriptor}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePluginDescriptor.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "PluginDescriptor"})
@Immutable
public final class ImmutablePluginDescriptor extends PluginDescriptor {
  private final String id;
  private final String name;
  private final ImmutableList<PropertyDescriptor> properties;
  private final ImmutableList<InstrumentationConfig> instrumentationConfigs;
  private final ImmutableList<String> aspects;

  private ImmutablePluginDescriptor(
      String id,
      String name,
      ImmutableList<PropertyDescriptor> properties,
      ImmutableList<InstrumentationConfig> instrumentationConfigs,
      ImmutableList<String> aspects) {
    this.id = id;
    this.name = name;
    this.properties = properties;
    this.instrumentationConfigs = instrumentationConfigs;
    this.aspects = aspects;
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
   * @return The value of the {@code name} attribute
   */
  @JsonProperty("name")
  @Override
  public String name() {
    return name;
  }

  /**
   * @return The value of the {@code properties} attribute
   */
  @JsonProperty("properties")
  @Override
  public ImmutableList<PropertyDescriptor> properties() {
    return properties;
  }

  /**
   * @return The value of the {@code instrumentationConfigs} attribute
   */
  @JsonProperty("instrumentation")
  @Override
  public ImmutableList<InstrumentationConfig> instrumentationConfigs() {
    return instrumentationConfigs;
  }

  /**
   * @return The value of the {@code aspects} attribute
   */
  @JsonProperty("aspects")
  @Override
  public ImmutableList<String> aspects() {
    return aspects;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PluginDescriptor#id() id} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for id
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePluginDescriptor withId(String value) {
    if (this.id.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "id");
    return new ImmutablePluginDescriptor(newValue, this.name, this.properties, this.instrumentationConfigs, this.aspects);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PluginDescriptor#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePluginDescriptor withName(String value) {
    if (this.name.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "name");
    return new ImmutablePluginDescriptor(this.id, newValue, this.properties, this.instrumentationConfigs, this.aspects);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link PluginDescriptor#properties() properties}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePluginDescriptor withProperties(PropertyDescriptor... elements) {
    ImmutableList<PropertyDescriptor> newValue = ImmutableList.copyOf(elements);
    return new ImmutablePluginDescriptor(this.id, this.name, newValue, this.instrumentationConfigs, this.aspects);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link PluginDescriptor#properties() properties}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of properties elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePluginDescriptor withProperties(Iterable<? extends PropertyDescriptor> elements) {
    if (this.properties == elements) return this;
    ImmutableList<PropertyDescriptor> newValue = ImmutableList.copyOf(elements);
    return new ImmutablePluginDescriptor(this.id, this.name, newValue, this.instrumentationConfigs, this.aspects);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link PluginDescriptor#instrumentationConfigs() instrumentationConfigs}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePluginDescriptor withInstrumentationConfigs(InstrumentationConfig... elements) {
    ImmutableList<InstrumentationConfig> newValue = ImmutableList.copyOf(elements);
    return new ImmutablePluginDescriptor(this.id, this.name, this.properties, newValue, this.aspects);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link PluginDescriptor#instrumentationConfigs() instrumentationConfigs}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of instrumentationConfigs elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePluginDescriptor withInstrumentationConfigs(Iterable<? extends InstrumentationConfig> elements) {
    if (this.instrumentationConfigs == elements) return this;
    ImmutableList<InstrumentationConfig> newValue = ImmutableList.copyOf(elements);
    return new ImmutablePluginDescriptor(this.id, this.name, this.properties, newValue, this.aspects);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link PluginDescriptor#aspects() aspects}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePluginDescriptor withAspects(String... elements) {
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutablePluginDescriptor(this.id, this.name, this.properties, this.instrumentationConfigs, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link PluginDescriptor#aspects() aspects}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of aspects elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePluginDescriptor withAspects(Iterable<String> elements) {
    if (this.aspects == elements) return this;
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutablePluginDescriptor(this.id, this.name, this.properties, this.instrumentationConfigs, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePluginDescriptor} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePluginDescriptor
        && equalTo((ImmutablePluginDescriptor) another);
  }

  private boolean equalTo(ImmutablePluginDescriptor another) {
    return id.equals(another.id)
        && name.equals(another.name)
        && properties.equals(another.properties)
        && instrumentationConfigs.equals(another.instrumentationConfigs)
        && aspects.equals(another.aspects);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code name}, {@code properties}, {@code instrumentationConfigs}, {@code aspects}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + id.hashCode();
    h += (h << 5) + name.hashCode();
    h += (h << 5) + properties.hashCode();
    h += (h << 5) + instrumentationConfigs.hashCode();
    h += (h << 5) + aspects.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code PluginDescriptor} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("PluginDescriptor")
        .omitNullValues()
        .add("id", id)
        .add("name", name)
        .add("properties", properties)
        .add("instrumentationConfigs", instrumentationConfigs)
        .add("aspects", aspects)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends PluginDescriptor {
    @Nullable String id;
    @Nullable String name;
    ImmutableList<PropertyDescriptor> properties = ImmutableList.of();
    ImmutableList<InstrumentationConfig> instrumentationConfigs = ImmutableList.of();
    ImmutableList<String> aspects = ImmutableList.of();
    @JsonProperty("id")
    public void setId(String id) {
      this.id = id;
    }
    @JsonProperty("name")
    public void setName(String name) {
      this.name = name;
    }
    @JsonProperty("properties")
    public void setProperties(ImmutableList<PropertyDescriptor> properties) {
      this.properties = properties;
    }
    @JsonProperty("instrumentation")
    public void setInstrumentationConfigs(ImmutableList<InstrumentationConfig> instrumentationConfigs) {
      this.instrumentationConfigs = instrumentationConfigs;
    }
    @JsonProperty("aspects")
    public void setAspects(ImmutableList<String> aspects) {
      this.aspects = aspects;
    }
    @Override
    public String id() { throw new UnsupportedOperationException(); }
    @Override
    public String name() { throw new UnsupportedOperationException(); }
    @Override
    public ImmutableList<PropertyDescriptor> properties() { throw new UnsupportedOperationException(); }
    @Override
    public ImmutableList<InstrumentationConfig> instrumentationConfigs() { throw new UnsupportedOperationException(); }
    @Override
    public ImmutableList<String> aspects() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutablePluginDescriptor fromJson(Json json) {
    ImmutablePluginDescriptor.Builder builder = ImmutablePluginDescriptor.builder();
    if (json.id != null) {
      builder.id(json.id);
    }
    if (json.name != null) {
      builder.name(json.name);
    }
    if (json.properties != null) {
      builder.addAllProperties(json.properties);
    }
    if (json.instrumentationConfigs != null) {
      builder.addAllInstrumentationConfigs(json.instrumentationConfigs);
    }
    if (json.aspects != null) {
      builder.addAllAspects(json.aspects);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link PluginDescriptor} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable PluginDescriptor instance
   */
  public static ImmutablePluginDescriptor copyOf(PluginDescriptor instance) {
    if (instance instanceof ImmutablePluginDescriptor) {
      return (ImmutablePluginDescriptor) instance;
    }
    return ImmutablePluginDescriptor.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutablePluginDescriptor ImmutablePluginDescriptor}.
   * @return A new ImmutablePluginDescriptor builder
   */
  public static ImmutablePluginDescriptor.Builder builder() {
    return new ImmutablePluginDescriptor.Builder();
  }

  /**
   * Builds instances of type {@link ImmutablePluginDescriptor ImmutablePluginDescriptor}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_ID = 0x1L;
    private static final long INIT_BIT_NAME = 0x2L;
    private long initBits = 0x3L;

    private @Nullable String id;
    private @Nullable String name;
    private ImmutableList.Builder<PropertyDescriptor> properties = ImmutableList.builder();
    private ImmutableList.Builder<InstrumentationConfig> instrumentationConfigs = ImmutableList.builder();
    private ImmutableList.Builder<String> aspects = ImmutableList.builder();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code PluginDescriptor} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(PluginDescriptor instance) {
      Preconditions.checkNotNull(instance, "instance");
      id(instance.id());
      name(instance.name());
      addAllProperties(instance.properties());
      addAllInstrumentationConfigs(instance.instrumentationConfigs());
      addAllAspects(instance.aspects());
      return this;
    }

    /**
     * Initializes the value for the {@link PluginDescriptor#id() id} attribute.
     * @param id The value for id 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder id(String id) {
      this.id = Preconditions.checkNotNull(id, "id");
      initBits &= ~INIT_BIT_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link PluginDescriptor#name() name} attribute.
     * @param name The value for name 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder name(String name) {
      this.name = Preconditions.checkNotNull(name, "name");
      initBits &= ~INIT_BIT_NAME;
      return this;
    }

    /**
     * Adds one element to {@link PluginDescriptor#properties() properties} list.
     * @param element A properties element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addProperties(PropertyDescriptor element) {
      this.properties.add(element);
      return this;
    }

    /**
     * Adds elements to {@link PluginDescriptor#properties() properties} list.
     * @param elements An array of properties elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addProperties(PropertyDescriptor... elements) {
      this.properties.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link PluginDescriptor#properties() properties} list.
     * @param elements An iterable of properties elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder properties(Iterable<? extends PropertyDescriptor> elements) {
      this.properties = ImmutableList.builder();
      return addAllProperties(elements);
    }

    /**
     * Adds elements to {@link PluginDescriptor#properties() properties} list.
     * @param elements An iterable of properties elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllProperties(Iterable<? extends PropertyDescriptor> elements) {
      this.properties.addAll(elements);
      return this;
    }

    /**
     * Adds one element to {@link PluginDescriptor#instrumentationConfigs() instrumentationConfigs} list.
     * @param element A instrumentationConfigs element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addInstrumentationConfigs(InstrumentationConfig element) {
      this.instrumentationConfigs.add(element);
      return this;
    }

    /**
     * Adds elements to {@link PluginDescriptor#instrumentationConfigs() instrumentationConfigs} list.
     * @param elements An array of instrumentationConfigs elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addInstrumentationConfigs(InstrumentationConfig... elements) {
      this.instrumentationConfigs.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link PluginDescriptor#instrumentationConfigs() instrumentationConfigs} list.
     * @param elements An iterable of instrumentationConfigs elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder instrumentationConfigs(Iterable<? extends InstrumentationConfig> elements) {
      this.instrumentationConfigs = ImmutableList.builder();
      return addAllInstrumentationConfigs(elements);
    }

    /**
     * Adds elements to {@link PluginDescriptor#instrumentationConfigs() instrumentationConfigs} list.
     * @param elements An iterable of instrumentationConfigs elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllInstrumentationConfigs(Iterable<? extends InstrumentationConfig> elements) {
      this.instrumentationConfigs.addAll(elements);
      return this;
    }

    /**
     * Adds one element to {@link PluginDescriptor#aspects() aspects} list.
     * @param element A aspects element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAspects(String element) {
      this.aspects.add(element);
      return this;
    }

    /**
     * Adds elements to {@link PluginDescriptor#aspects() aspects} list.
     * @param elements An array of aspects elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAspects(String... elements) {
      this.aspects.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link PluginDescriptor#aspects() aspects} list.
     * @param elements An iterable of aspects elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder aspects(Iterable<String> elements) {
      this.aspects = ImmutableList.builder();
      return addAllAspects(elements);
    }

    /**
     * Adds elements to {@link PluginDescriptor#aspects() aspects} list.
     * @param elements An iterable of aspects elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllAspects(Iterable<String> elements) {
      this.aspects.addAll(elements);
      return this;
    }

    /**
     * Builds a new {@link ImmutablePluginDescriptor ImmutablePluginDescriptor}.
     * @return An immutable instance of PluginDescriptor
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutablePluginDescriptor build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutablePluginDescriptor(id, name, properties.build(), instrumentationConfigs.build(), aspects.build());
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_ID) != 0) attributes.add("id");
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      return "Cannot build PluginDescriptor, some of required attributes are not set " + attributes;
    }
  }
}
