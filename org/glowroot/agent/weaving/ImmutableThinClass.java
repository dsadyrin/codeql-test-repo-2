package org.glowroot.agent.weaving;

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
 * Immutable implementation of {@link ThinClassVisitor.ThinClass}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableThinClass.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "ThinClassVisitor.ThinClass"})
@Immutable
final class ImmutableThinClass implements ThinClassVisitor.ThinClass {
  private final int access;
  private final String name;
  private final @Nullable String superName;
  private final ImmutableList<String> interfaces;
  private final ImmutableList<String> annotations;
  private final ImmutableList<ThinClassVisitor.ThinMethod> nonBridgeMethods;
  private final ImmutableList<ThinClassVisitor.ThinMethod> bridgeMethods;

  private ImmutableThinClass(
      int access,
      String name,
      @Nullable String superName,
      ImmutableList<String> interfaces,
      ImmutableList<String> annotations,
      ImmutableList<ThinClassVisitor.ThinMethod> nonBridgeMethods,
      ImmutableList<ThinClassVisitor.ThinMethod> bridgeMethods) {
    this.access = access;
    this.name = name;
    this.superName = superName;
    this.interfaces = interfaces;
    this.annotations = annotations;
    this.nonBridgeMethods = nonBridgeMethods;
    this.bridgeMethods = bridgeMethods;
  }

  /**
   * @return The value of the {@code access} attribute
   */
  @JsonProperty("access")
  @Override
  public int access() {
    return access;
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
   * @return The value of the {@code superName} attribute
   */
  @JsonProperty("superName")
  @Override
  public @Nullable String superName() {
    return superName;
  }

  /**
   * @return The value of the {@code interfaces} attribute
   */
  @JsonProperty("interfaces")
  @Override
  public ImmutableList<String> interfaces() {
    return interfaces;
  }

  /**
   * @return The value of the {@code annotations} attribute
   */
  @JsonProperty("annotations")
  @Override
  public ImmutableList<String> annotations() {
    return annotations;
  }

  /**
   * @return The value of the {@code nonBridgeMethods} attribute
   */
  @JsonProperty("nonBridgeMethods")
  @Override
  public ImmutableList<ThinClassVisitor.ThinMethod> nonBridgeMethods() {
    return nonBridgeMethods;
  }

  /**
   * @return The value of the {@code bridgeMethods} attribute
   */
  @JsonProperty("bridgeMethods")
  @Override
  public ImmutableList<ThinClassVisitor.ThinMethod> bridgeMethods() {
    return bridgeMethods;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ThinClassVisitor.ThinClass#access() access} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for access
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableThinClass withAccess(int value) {
    if (this.access == value) return this;
    return new ImmutableThinClass(
        value,
        this.name,
        this.superName,
        this.interfaces,
        this.annotations,
        this.nonBridgeMethods,
        this.bridgeMethods);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ThinClassVisitor.ThinClass#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableThinClass withName(String value) {
    if (this.name.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "name");
    return new ImmutableThinClass(
        this.access,
        newValue,
        this.superName,
        this.interfaces,
        this.annotations,
        this.nonBridgeMethods,
        this.bridgeMethods);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ThinClassVisitor.ThinClass#superName() superName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for superName (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableThinClass withSuperName(@Nullable String value) {
    if (Objects.equal(this.superName, value)) return this;
    return new ImmutableThinClass(
        this.access,
        this.name,
        value,
        this.interfaces,
        this.annotations,
        this.nonBridgeMethods,
        this.bridgeMethods);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ThinClassVisitor.ThinClass#interfaces() interfaces}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableThinClass withInterfaces(String... elements) {
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableThinClass(
        this.access,
        this.name,
        this.superName,
        newValue,
        this.annotations,
        this.nonBridgeMethods,
        this.bridgeMethods);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ThinClassVisitor.ThinClass#interfaces() interfaces}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of interfaces elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableThinClass withInterfaces(Iterable<String> elements) {
    if (this.interfaces == elements) return this;
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableThinClass(
        this.access,
        this.name,
        this.superName,
        newValue,
        this.annotations,
        this.nonBridgeMethods,
        this.bridgeMethods);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ThinClassVisitor.ThinClass#annotations() annotations}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableThinClass withAnnotations(String... elements) {
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableThinClass(
        this.access,
        this.name,
        this.superName,
        this.interfaces,
        newValue,
        this.nonBridgeMethods,
        this.bridgeMethods);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ThinClassVisitor.ThinClass#annotations() annotations}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of annotations elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableThinClass withAnnotations(Iterable<String> elements) {
    if (this.annotations == elements) return this;
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableThinClass(
        this.access,
        this.name,
        this.superName,
        this.interfaces,
        newValue,
        this.nonBridgeMethods,
        this.bridgeMethods);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ThinClassVisitor.ThinClass#nonBridgeMethods() nonBridgeMethods}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableThinClass withNonBridgeMethods(ThinClassVisitor.ThinMethod... elements) {
    ImmutableList<ThinClassVisitor.ThinMethod> newValue = ImmutableList.copyOf(elements);
    return new ImmutableThinClass(
        this.access,
        this.name,
        this.superName,
        this.interfaces,
        this.annotations,
        newValue,
        this.bridgeMethods);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ThinClassVisitor.ThinClass#nonBridgeMethods() nonBridgeMethods}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of nonBridgeMethods elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableThinClass withNonBridgeMethods(Iterable<? extends ThinClassVisitor.ThinMethod> elements) {
    if (this.nonBridgeMethods == elements) return this;
    ImmutableList<ThinClassVisitor.ThinMethod> newValue = ImmutableList.copyOf(elements);
    return new ImmutableThinClass(
        this.access,
        this.name,
        this.superName,
        this.interfaces,
        this.annotations,
        newValue,
        this.bridgeMethods);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ThinClassVisitor.ThinClass#bridgeMethods() bridgeMethods}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableThinClass withBridgeMethods(ThinClassVisitor.ThinMethod... elements) {
    ImmutableList<ThinClassVisitor.ThinMethod> newValue = ImmutableList.copyOf(elements);
    return new ImmutableThinClass(
        this.access,
        this.name,
        this.superName,
        this.interfaces,
        this.annotations,
        this.nonBridgeMethods,
        newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ThinClassVisitor.ThinClass#bridgeMethods() bridgeMethods}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of bridgeMethods elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableThinClass withBridgeMethods(Iterable<? extends ThinClassVisitor.ThinMethod> elements) {
    if (this.bridgeMethods == elements) return this;
    ImmutableList<ThinClassVisitor.ThinMethod> newValue = ImmutableList.copyOf(elements);
    return new ImmutableThinClass(
        this.access,
        this.name,
        this.superName,
        this.interfaces,
        this.annotations,
        this.nonBridgeMethods,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableThinClass} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableThinClass
        && equalTo((ImmutableThinClass) another);
  }

  private boolean equalTo(ImmutableThinClass another) {
    return access == another.access
        && name.equals(another.name)
        && Objects.equal(superName, another.superName)
        && interfaces.equals(another.interfaces)
        && annotations.equals(another.annotations)
        && nonBridgeMethods.equals(another.nonBridgeMethods)
        && bridgeMethods.equals(another.bridgeMethods);
  }

  /**
   * Computes a hash code from attributes: {@code access}, {@code name}, {@code superName}, {@code interfaces}, {@code annotations}, {@code nonBridgeMethods}, {@code bridgeMethods}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + access;
    h += (h << 5) + name.hashCode();
    h += (h << 5) + Objects.hashCode(superName);
    h += (h << 5) + interfaces.hashCode();
    h += (h << 5) + annotations.hashCode();
    h += (h << 5) + nonBridgeMethods.hashCode();
    h += (h << 5) + bridgeMethods.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code ThinClass} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("ThinClass")
        .omitNullValues()
        .add("access", access)
        .add("name", name)
        .add("superName", superName)
        .add("interfaces", interfaces)
        .add("annotations", annotations)
        .add("nonBridgeMethods", nonBridgeMethods)
        .add("bridgeMethods", bridgeMethods)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ThinClassVisitor.ThinClass {
    int access;
    boolean accessIsSet;
    @Nullable String name;
    @Nullable String superName;
    List<String> interfaces = ImmutableList.of();
    List<String> annotations = ImmutableList.of();
    List<ThinClassVisitor.ThinMethod> nonBridgeMethods = ImmutableList.of();
    List<ThinClassVisitor.ThinMethod> bridgeMethods = ImmutableList.of();
    @JsonProperty("access")
    public void setAccess(int access) {
      this.access = access;
      this.accessIsSet = true;
    }
    @JsonProperty("name")
    public void setName(String name) {
      this.name = name;
    }
    @JsonProperty("superName")
    public void setSuperName(@Nullable String superName) {
      this.superName = superName;
    }
    @JsonProperty("interfaces")
    public void setInterfaces(List<String> interfaces) {
      this.interfaces = interfaces;
    }
    @JsonProperty("annotations")
    public void setAnnotations(List<String> annotations) {
      this.annotations = annotations;
    }
    @JsonProperty("nonBridgeMethods")
    public void setNonBridgeMethods(List<ThinClassVisitor.ThinMethod> nonBridgeMethods) {
      this.nonBridgeMethods = nonBridgeMethods;
    }
    @JsonProperty("bridgeMethods")
    public void setBridgeMethods(List<ThinClassVisitor.ThinMethod> bridgeMethods) {
      this.bridgeMethods = bridgeMethods;
    }
    @Override
    public int access() { throw new UnsupportedOperationException(); }
    @Override
    public String name() { throw new UnsupportedOperationException(); }
    @Override
    public String superName() { throw new UnsupportedOperationException(); }
    @Override
    public List<String> interfaces() { throw new UnsupportedOperationException(); }
    @Override
    public List<String> annotations() { throw new UnsupportedOperationException(); }
    @Override
    public List<ThinClassVisitor.ThinMethod> nonBridgeMethods() { throw new UnsupportedOperationException(); }
    @Override
    public List<ThinClassVisitor.ThinMethod> bridgeMethods() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableThinClass fromJson(Json json) {
    ImmutableThinClass.Builder builder = ImmutableThinClass.builder();
    if (json.accessIsSet) {
      builder.access(json.access);
    }
    if (json.name != null) {
      builder.name(json.name);
    }
    if (json.superName != null) {
      builder.superName(json.superName);
    }
    if (json.interfaces != null) {
      builder.addAllInterfaces(json.interfaces);
    }
    if (json.annotations != null) {
      builder.addAllAnnotations(json.annotations);
    }
    if (json.nonBridgeMethods != null) {
      builder.addAllNonBridgeMethods(json.nonBridgeMethods);
    }
    if (json.bridgeMethods != null) {
      builder.addAllBridgeMethods(json.bridgeMethods);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ThinClassVisitor.ThinClass} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ThinClass instance
   */
  public static ImmutableThinClass copyOf(ThinClassVisitor.ThinClass instance) {
    if (instance instanceof ImmutableThinClass) {
      return (ImmutableThinClass) instance;
    }
    return ImmutableThinClass.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableThinClass ImmutableThinClass}.
   * @return A new ImmutableThinClass builder
   */
  public static ImmutableThinClass.Builder builder() {
    return new ImmutableThinClass.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableThinClass ImmutableThinClass}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_ACCESS = 0x1L;
    private static final long INIT_BIT_NAME = 0x2L;
    private long initBits = 0x3L;

    private int access;
    private @Nullable String name;
    private @Nullable String superName;
    private ImmutableList.Builder<String> interfaces = ImmutableList.builder();
    private ImmutableList.Builder<String> annotations = ImmutableList.builder();
    private ImmutableList.Builder<ThinClassVisitor.ThinMethod> nonBridgeMethods = ImmutableList.builder();
    private ImmutableList.Builder<ThinClassVisitor.ThinMethod> bridgeMethods = ImmutableList.builder();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code ThinClass} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(ThinClassVisitor.ThinClass instance) {
      Preconditions.checkNotNull(instance, "instance");
      access(instance.access());
      name(instance.name());
      @Nullable String superNameValue = instance.superName();
      if (superNameValue != null) {
        superName(superNameValue);
      }
      addAllInterfaces(instance.interfaces());
      addAllAnnotations(instance.annotations());
      addAllNonBridgeMethods(instance.nonBridgeMethods());
      addAllBridgeMethods(instance.bridgeMethods());
      return this;
    }

    /**
     * Initializes the value for the {@link ThinClassVisitor.ThinClass#access() access} attribute.
     * @param access The value for access 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder access(int access) {
      this.access = access;
      initBits &= ~INIT_BIT_ACCESS;
      return this;
    }

    /**
     * Initializes the value for the {@link ThinClassVisitor.ThinClass#name() name} attribute.
     * @param name The value for name 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder name(String name) {
      this.name = Preconditions.checkNotNull(name, "name");
      initBits &= ~INIT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link ThinClassVisitor.ThinClass#superName() superName} attribute.
     * @param superName The value for superName (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder superName(@Nullable String superName) {
      this.superName = superName;
      return this;
    }

    /**
     * Adds one element to {@link ThinClassVisitor.ThinClass#interfaces() interfaces} list.
     * @param element A interfaces element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addInterfaces(String element) {
      this.interfaces.add(element);
      return this;
    }

    /**
     * Adds elements to {@link ThinClassVisitor.ThinClass#interfaces() interfaces} list.
     * @param elements An array of interfaces elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addInterfaces(String... elements) {
      this.interfaces.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link ThinClassVisitor.ThinClass#interfaces() interfaces} list.
     * @param elements An iterable of interfaces elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder interfaces(Iterable<String> elements) {
      this.interfaces = ImmutableList.builder();
      return addAllInterfaces(elements);
    }

    /**
     * Adds elements to {@link ThinClassVisitor.ThinClass#interfaces() interfaces} list.
     * @param elements An iterable of interfaces elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllInterfaces(Iterable<String> elements) {
      this.interfaces.addAll(elements);
      return this;
    }

    /**
     * Adds one element to {@link ThinClassVisitor.ThinClass#annotations() annotations} list.
     * @param element A annotations element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAnnotations(String element) {
      this.annotations.add(element);
      return this;
    }

    /**
     * Adds elements to {@link ThinClassVisitor.ThinClass#annotations() annotations} list.
     * @param elements An array of annotations elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAnnotations(String... elements) {
      this.annotations.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link ThinClassVisitor.ThinClass#annotations() annotations} list.
     * @param elements An iterable of annotations elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder annotations(Iterable<String> elements) {
      this.annotations = ImmutableList.builder();
      return addAllAnnotations(elements);
    }

    /**
     * Adds elements to {@link ThinClassVisitor.ThinClass#annotations() annotations} list.
     * @param elements An iterable of annotations elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllAnnotations(Iterable<String> elements) {
      this.annotations.addAll(elements);
      return this;
    }

    /**
     * Adds one element to {@link ThinClassVisitor.ThinClass#nonBridgeMethods() nonBridgeMethods} list.
     * @param element A nonBridgeMethods element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addNonBridgeMethods(ThinClassVisitor.ThinMethod element) {
      this.nonBridgeMethods.add(element);
      return this;
    }

    /**
     * Adds elements to {@link ThinClassVisitor.ThinClass#nonBridgeMethods() nonBridgeMethods} list.
     * @param elements An array of nonBridgeMethods elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addNonBridgeMethods(ThinClassVisitor.ThinMethod... elements) {
      this.nonBridgeMethods.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link ThinClassVisitor.ThinClass#nonBridgeMethods() nonBridgeMethods} list.
     * @param elements An iterable of nonBridgeMethods elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder nonBridgeMethods(Iterable<? extends ThinClassVisitor.ThinMethod> elements) {
      this.nonBridgeMethods = ImmutableList.builder();
      return addAllNonBridgeMethods(elements);
    }

    /**
     * Adds elements to {@link ThinClassVisitor.ThinClass#nonBridgeMethods() nonBridgeMethods} list.
     * @param elements An iterable of nonBridgeMethods elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllNonBridgeMethods(Iterable<? extends ThinClassVisitor.ThinMethod> elements) {
      this.nonBridgeMethods.addAll(elements);
      return this;
    }

    /**
     * Adds one element to {@link ThinClassVisitor.ThinClass#bridgeMethods() bridgeMethods} list.
     * @param element A bridgeMethods element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addBridgeMethods(ThinClassVisitor.ThinMethod element) {
      this.bridgeMethods.add(element);
      return this;
    }

    /**
     * Adds elements to {@link ThinClassVisitor.ThinClass#bridgeMethods() bridgeMethods} list.
     * @param elements An array of bridgeMethods elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addBridgeMethods(ThinClassVisitor.ThinMethod... elements) {
      this.bridgeMethods.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link ThinClassVisitor.ThinClass#bridgeMethods() bridgeMethods} list.
     * @param elements An iterable of bridgeMethods elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder bridgeMethods(Iterable<? extends ThinClassVisitor.ThinMethod> elements) {
      this.bridgeMethods = ImmutableList.builder();
      return addAllBridgeMethods(elements);
    }

    /**
     * Adds elements to {@link ThinClassVisitor.ThinClass#bridgeMethods() bridgeMethods} list.
     * @param elements An iterable of bridgeMethods elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllBridgeMethods(Iterable<? extends ThinClassVisitor.ThinMethod> elements) {
      this.bridgeMethods.addAll(elements);
      return this;
    }

    /**
     * Builds a new {@link ImmutableThinClass ImmutableThinClass}.
     * @return An immutable instance of ThinClass
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableThinClass build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableThinClass(
          access,
          name,
          superName,
          interfaces.build(),
          annotations.build(),
          nonBridgeMethods.build(),
          bridgeMethods.build());
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_ACCESS) != 0) attributes.add("access");
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      return "Cannot build ThinClass, some of required attributes are not set " + attributes;
    }
  }
}
