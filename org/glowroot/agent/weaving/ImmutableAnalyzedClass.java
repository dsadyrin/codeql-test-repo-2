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
 * Immutable implementation of {@link AnalyzedClass}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAnalyzedClass.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "AnalyzedClass"})
@Immutable
final class ImmutableAnalyzedClass extends AnalyzedClass {
  private final int modifiers;
  private final String name;
  private final @Nullable String superName;
  private final ImmutableList<String> interfaceNames;
  private final ImmutableList<AnalyzedMethod> analyzedMethods;
  private final ImmutableList<PublicFinalMethod> publicFinalMethods;
  private final ImmutableList<ShimType> shimTypes;
  private final ImmutableList<MixinType> mixinTypes;

  private ImmutableAnalyzedClass(
      int modifiers,
      String name,
      @Nullable String superName,
      ImmutableList<String> interfaceNames,
      ImmutableList<AnalyzedMethod> analyzedMethods,
      ImmutableList<PublicFinalMethod> publicFinalMethods,
      ImmutableList<ShimType> shimTypes,
      ImmutableList<MixinType> mixinTypes) {
    this.modifiers = modifiers;
    this.name = name;
    this.superName = superName;
    this.interfaceNames = interfaceNames;
    this.analyzedMethods = analyzedMethods;
    this.publicFinalMethods = publicFinalMethods;
    this.shimTypes = shimTypes;
    this.mixinTypes = mixinTypes;
  }

  /**
   * @return The value of the {@code modifiers} attribute
   */
  @JsonProperty("modifiers")
  @Override
  int modifiers() {
    return modifiers;
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
   * @return The value of the {@code superName} attribute
   */
  @JsonProperty("superName")
  @Override
  @Nullable String superName() {
    return superName;
  }

  /**
   * @return The value of the {@code interfaceNames} attribute
   */
  @JsonProperty("interfaceNames")
  @Override
  ImmutableList<String> interfaceNames() {
    return interfaceNames;
  }

  /**
   * @return The value of the {@code analyzedMethods} attribute
   */
  @JsonProperty("analyzedMethods")
  @Override
  ImmutableList<AnalyzedMethod> analyzedMethods() {
    return analyzedMethods;
  }

  /**
   * @return The value of the {@code publicFinalMethods} attribute
   */
  @JsonProperty("publicFinalMethods")
  @Override
  ImmutableList<PublicFinalMethod> publicFinalMethods() {
    return publicFinalMethods;
  }

  /**
   * @return The value of the {@code shimTypes} attribute
   */
  @JsonProperty("shimTypes")
  @Override
  ImmutableList<ShimType> shimTypes() {
    return shimTypes;
  }

  /**
   * @return The value of the {@code mixinTypes} attribute
   */
  @JsonProperty("mixinTypes")
  @Override
  ImmutableList<MixinType> mixinTypes() {
    return mixinTypes;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AnalyzedClass#modifiers() modifiers} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for modifiers
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAnalyzedClass withModifiers(int value) {
    if (this.modifiers == value) return this;
    return new ImmutableAnalyzedClass(
        value,
        this.name,
        this.superName,
        this.interfaceNames,
        this.analyzedMethods,
        this.publicFinalMethods,
        this.shimTypes,
        this.mixinTypes);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AnalyzedClass#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAnalyzedClass withName(String value) {
    if (this.name.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "name");
    return new ImmutableAnalyzedClass(
        this.modifiers,
        newValue,
        this.superName,
        this.interfaceNames,
        this.analyzedMethods,
        this.publicFinalMethods,
        this.shimTypes,
        this.mixinTypes);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AnalyzedClass#superName() superName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for superName (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAnalyzedClass withSuperName(@Nullable String value) {
    if (Objects.equal(this.superName, value)) return this;
    return new ImmutableAnalyzedClass(
        this.modifiers,
        this.name,
        value,
        this.interfaceNames,
        this.analyzedMethods,
        this.publicFinalMethods,
        this.shimTypes,
        this.mixinTypes);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link AnalyzedClass#interfaceNames() interfaceNames}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAnalyzedClass withInterfaceNames(String... elements) {
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableAnalyzedClass(
        this.modifiers,
        this.name,
        this.superName,
        newValue,
        this.analyzedMethods,
        this.publicFinalMethods,
        this.shimTypes,
        this.mixinTypes);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link AnalyzedClass#interfaceNames() interfaceNames}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of interfaceNames elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAnalyzedClass withInterfaceNames(Iterable<String> elements) {
    if (this.interfaceNames == elements) return this;
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableAnalyzedClass(
        this.modifiers,
        this.name,
        this.superName,
        newValue,
        this.analyzedMethods,
        this.publicFinalMethods,
        this.shimTypes,
        this.mixinTypes);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link AnalyzedClass#analyzedMethods() analyzedMethods}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAnalyzedClass withAnalyzedMethods(AnalyzedMethod... elements) {
    ImmutableList<AnalyzedMethod> newValue = ImmutableList.copyOf(elements);
    return new ImmutableAnalyzedClass(
        this.modifiers,
        this.name,
        this.superName,
        this.interfaceNames,
        newValue,
        this.publicFinalMethods,
        this.shimTypes,
        this.mixinTypes);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link AnalyzedClass#analyzedMethods() analyzedMethods}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of analyzedMethods elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAnalyzedClass withAnalyzedMethods(Iterable<? extends AnalyzedMethod> elements) {
    if (this.analyzedMethods == elements) return this;
    ImmutableList<AnalyzedMethod> newValue = ImmutableList.copyOf(elements);
    return new ImmutableAnalyzedClass(
        this.modifiers,
        this.name,
        this.superName,
        this.interfaceNames,
        newValue,
        this.publicFinalMethods,
        this.shimTypes,
        this.mixinTypes);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link AnalyzedClass#publicFinalMethods() publicFinalMethods}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAnalyzedClass withPublicFinalMethods(PublicFinalMethod... elements) {
    ImmutableList<PublicFinalMethod> newValue = ImmutableList.copyOf(elements);
    return new ImmutableAnalyzedClass(
        this.modifiers,
        this.name,
        this.superName,
        this.interfaceNames,
        this.analyzedMethods,
        newValue,
        this.shimTypes,
        this.mixinTypes);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link AnalyzedClass#publicFinalMethods() publicFinalMethods}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of publicFinalMethods elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAnalyzedClass withPublicFinalMethods(Iterable<? extends PublicFinalMethod> elements) {
    if (this.publicFinalMethods == elements) return this;
    ImmutableList<PublicFinalMethod> newValue = ImmutableList.copyOf(elements);
    return new ImmutableAnalyzedClass(
        this.modifiers,
        this.name,
        this.superName,
        this.interfaceNames,
        this.analyzedMethods,
        newValue,
        this.shimTypes,
        this.mixinTypes);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link AnalyzedClass#shimTypes() shimTypes}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAnalyzedClass withShimTypes(ShimType... elements) {
    ImmutableList<ShimType> newValue = ImmutableList.copyOf(elements);
    return new ImmutableAnalyzedClass(
        this.modifiers,
        this.name,
        this.superName,
        this.interfaceNames,
        this.analyzedMethods,
        this.publicFinalMethods,
        newValue,
        this.mixinTypes);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link AnalyzedClass#shimTypes() shimTypes}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of shimTypes elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAnalyzedClass withShimTypes(Iterable<? extends ShimType> elements) {
    if (this.shimTypes == elements) return this;
    ImmutableList<ShimType> newValue = ImmutableList.copyOf(elements);
    return new ImmutableAnalyzedClass(
        this.modifiers,
        this.name,
        this.superName,
        this.interfaceNames,
        this.analyzedMethods,
        this.publicFinalMethods,
        newValue,
        this.mixinTypes);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link AnalyzedClass#mixinTypes() mixinTypes}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAnalyzedClass withMixinTypes(MixinType... elements) {
    ImmutableList<MixinType> newValue = ImmutableList.copyOf(elements);
    return new ImmutableAnalyzedClass(
        this.modifiers,
        this.name,
        this.superName,
        this.interfaceNames,
        this.analyzedMethods,
        this.publicFinalMethods,
        this.shimTypes,
        newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link AnalyzedClass#mixinTypes() mixinTypes}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of mixinTypes elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAnalyzedClass withMixinTypes(Iterable<? extends MixinType> elements) {
    if (this.mixinTypes == elements) return this;
    ImmutableList<MixinType> newValue = ImmutableList.copyOf(elements);
    return new ImmutableAnalyzedClass(
        this.modifiers,
        this.name,
        this.superName,
        this.interfaceNames,
        this.analyzedMethods,
        this.publicFinalMethods,
        this.shimTypes,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAnalyzedClass} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAnalyzedClass
        && equalTo((ImmutableAnalyzedClass) another);
  }

  private boolean equalTo(ImmutableAnalyzedClass another) {
    return modifiers == another.modifiers
        && name.equals(another.name)
        && Objects.equal(superName, another.superName)
        && interfaceNames.equals(another.interfaceNames)
        && analyzedMethods.equals(another.analyzedMethods)
        && publicFinalMethods.equals(another.publicFinalMethods)
        && shimTypes.equals(another.shimTypes)
        && mixinTypes.equals(another.mixinTypes);
  }

  /**
   * Computes a hash code from attributes: {@code modifiers}, {@code name}, {@code superName}, {@code interfaceNames}, {@code analyzedMethods}, {@code publicFinalMethods}, {@code shimTypes}, {@code mixinTypes}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + modifiers;
    h += (h << 5) + name.hashCode();
    h += (h << 5) + Objects.hashCode(superName);
    h += (h << 5) + interfaceNames.hashCode();
    h += (h << 5) + analyzedMethods.hashCode();
    h += (h << 5) + publicFinalMethods.hashCode();
    h += (h << 5) + shimTypes.hashCode();
    h += (h << 5) + mixinTypes.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code AnalyzedClass} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("AnalyzedClass")
        .omitNullValues()
        .add("modifiers", modifiers)
        .add("name", name)
        .add("superName", superName)
        .add("interfaceNames", interfaceNames)
        .add("analyzedMethods", analyzedMethods)
        .add("publicFinalMethods", publicFinalMethods)
        .add("shimTypes", shimTypes)
        .add("mixinTypes", mixinTypes)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends AnalyzedClass {
    int modifiers;
    boolean modifiersIsSet;
    @Nullable String name;
    @Nullable String superName;
    ImmutableList<String> interfaceNames = ImmutableList.of();
    ImmutableList<AnalyzedMethod> analyzedMethods = ImmutableList.of();
    ImmutableList<PublicFinalMethod> publicFinalMethods = ImmutableList.of();
    ImmutableList<ShimType> shimTypes = ImmutableList.of();
    ImmutableList<MixinType> mixinTypes = ImmutableList.of();
    @JsonProperty("modifiers")
    public void setModifiers(int modifiers) {
      this.modifiers = modifiers;
      this.modifiersIsSet = true;
    }
    @JsonProperty("name")
    public void setName(String name) {
      this.name = name;
    }
    @JsonProperty("superName")
    public void setSuperName(@Nullable String superName) {
      this.superName = superName;
    }
    @JsonProperty("interfaceNames")
    public void setInterfaceNames(ImmutableList<String> interfaceNames) {
      this.interfaceNames = interfaceNames;
    }
    @JsonProperty("analyzedMethods")
    public void setAnalyzedMethods(ImmutableList<AnalyzedMethod> analyzedMethods) {
      this.analyzedMethods = analyzedMethods;
    }
    @JsonProperty("publicFinalMethods")
    public void setPublicFinalMethods(ImmutableList<PublicFinalMethod> publicFinalMethods) {
      this.publicFinalMethods = publicFinalMethods;
    }
    @JsonProperty("shimTypes")
    public void setShimTypes(ImmutableList<ShimType> shimTypes) {
      this.shimTypes = shimTypes;
    }
    @JsonProperty("mixinTypes")
    public void setMixinTypes(ImmutableList<MixinType> mixinTypes) {
      this.mixinTypes = mixinTypes;
    }
    @Override
    int modifiers() { throw new UnsupportedOperationException(); }
    @Override
    String name() { throw new UnsupportedOperationException(); }
    @Override
    String superName() { throw new UnsupportedOperationException(); }
    @Override
    ImmutableList<String> interfaceNames() { throw new UnsupportedOperationException(); }
    @Override
    ImmutableList<AnalyzedMethod> analyzedMethods() { throw new UnsupportedOperationException(); }
    @Override
    ImmutableList<PublicFinalMethod> publicFinalMethods() { throw new UnsupportedOperationException(); }
    @Override
    ImmutableList<ShimType> shimTypes() { throw new UnsupportedOperationException(); }
    @Override
    ImmutableList<MixinType> mixinTypes() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableAnalyzedClass fromJson(Json json) {
    ImmutableAnalyzedClass.Builder builder = ImmutableAnalyzedClass.builder();
    if (json.modifiersIsSet) {
      builder.modifiers(json.modifiers);
    }
    if (json.name != null) {
      builder.name(json.name);
    }
    if (json.superName != null) {
      builder.superName(json.superName);
    }
    if (json.interfaceNames != null) {
      builder.addAllInterfaceNames(json.interfaceNames);
    }
    if (json.analyzedMethods != null) {
      builder.addAllAnalyzedMethods(json.analyzedMethods);
    }
    if (json.publicFinalMethods != null) {
      builder.addAllPublicFinalMethods(json.publicFinalMethods);
    }
    if (json.shimTypes != null) {
      builder.addAllShimTypes(json.shimTypes);
    }
    if (json.mixinTypes != null) {
      builder.addAllMixinTypes(json.mixinTypes);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link AnalyzedClass} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable AnalyzedClass instance
   */
  public static ImmutableAnalyzedClass copyOf(AnalyzedClass instance) {
    if (instance instanceof ImmutableAnalyzedClass) {
      return (ImmutableAnalyzedClass) instance;
    }
    return ImmutableAnalyzedClass.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableAnalyzedClass ImmutableAnalyzedClass}.
   * @return A new ImmutableAnalyzedClass builder
   */
  public static ImmutableAnalyzedClass.Builder builder() {
    return new ImmutableAnalyzedClass.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableAnalyzedClass ImmutableAnalyzedClass}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_MODIFIERS = 0x1L;
    private static final long INIT_BIT_NAME = 0x2L;
    private long initBits = 0x3L;

    private int modifiers;
    private @Nullable String name;
    private @Nullable String superName;
    private ImmutableList.Builder<String> interfaceNames = ImmutableList.builder();
    private ImmutableList.Builder<AnalyzedMethod> analyzedMethods = ImmutableList.builder();
    private ImmutableList.Builder<PublicFinalMethod> publicFinalMethods = ImmutableList.builder();
    private ImmutableList.Builder<ShimType> shimTypes = ImmutableList.builder();
    private ImmutableList.Builder<MixinType> mixinTypes = ImmutableList.builder();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code AnalyzedClass} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(AnalyzedClass instance) {
      Preconditions.checkNotNull(instance, "instance");
      modifiers(instance.modifiers());
      name(instance.name());
      @Nullable String superNameValue = instance.superName();
      if (superNameValue != null) {
        superName(superNameValue);
      }
      addAllInterfaceNames(instance.interfaceNames());
      addAllAnalyzedMethods(instance.analyzedMethods());
      addAllPublicFinalMethods(instance.publicFinalMethods());
      addAllShimTypes(instance.shimTypes());
      addAllMixinTypes(instance.mixinTypes());
      return this;
    }

    /**
     * Initializes the value for the {@link AnalyzedClass#modifiers() modifiers} attribute.
     * @param modifiers The value for modifiers 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder modifiers(int modifiers) {
      this.modifiers = modifiers;
      initBits &= ~INIT_BIT_MODIFIERS;
      return this;
    }

    /**
     * Initializes the value for the {@link AnalyzedClass#name() name} attribute.
     * @param name The value for name 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder name(String name) {
      this.name = Preconditions.checkNotNull(name, "name");
      initBits &= ~INIT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link AnalyzedClass#superName() superName} attribute.
     * @param superName The value for superName (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder superName(@Nullable String superName) {
      this.superName = superName;
      return this;
    }

    /**
     * Adds one element to {@link AnalyzedClass#interfaceNames() interfaceNames} list.
     * @param element A interfaceNames element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addInterfaceNames(String element) {
      this.interfaceNames.add(element);
      return this;
    }

    /**
     * Adds elements to {@link AnalyzedClass#interfaceNames() interfaceNames} list.
     * @param elements An array of interfaceNames elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addInterfaceNames(String... elements) {
      this.interfaceNames.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link AnalyzedClass#interfaceNames() interfaceNames} list.
     * @param elements An iterable of interfaceNames elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder interfaceNames(Iterable<String> elements) {
      this.interfaceNames = ImmutableList.builder();
      return addAllInterfaceNames(elements);
    }

    /**
     * Adds elements to {@link AnalyzedClass#interfaceNames() interfaceNames} list.
     * @param elements An iterable of interfaceNames elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllInterfaceNames(Iterable<String> elements) {
      this.interfaceNames.addAll(elements);
      return this;
    }

    /**
     * Adds one element to {@link AnalyzedClass#analyzedMethods() analyzedMethods} list.
     * @param element A analyzedMethods element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAnalyzedMethods(AnalyzedMethod element) {
      this.analyzedMethods.add(element);
      return this;
    }

    /**
     * Adds elements to {@link AnalyzedClass#analyzedMethods() analyzedMethods} list.
     * @param elements An array of analyzedMethods elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAnalyzedMethods(AnalyzedMethod... elements) {
      this.analyzedMethods.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link AnalyzedClass#analyzedMethods() analyzedMethods} list.
     * @param elements An iterable of analyzedMethods elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder analyzedMethods(Iterable<? extends AnalyzedMethod> elements) {
      this.analyzedMethods = ImmutableList.builder();
      return addAllAnalyzedMethods(elements);
    }

    /**
     * Adds elements to {@link AnalyzedClass#analyzedMethods() analyzedMethods} list.
     * @param elements An iterable of analyzedMethods elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllAnalyzedMethods(Iterable<? extends AnalyzedMethod> elements) {
      this.analyzedMethods.addAll(elements);
      return this;
    }

    /**
     * Adds one element to {@link AnalyzedClass#publicFinalMethods() publicFinalMethods} list.
     * @param element A publicFinalMethods element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addPublicFinalMethods(PublicFinalMethod element) {
      this.publicFinalMethods.add(element);
      return this;
    }

    /**
     * Adds elements to {@link AnalyzedClass#publicFinalMethods() publicFinalMethods} list.
     * @param elements An array of publicFinalMethods elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addPublicFinalMethods(PublicFinalMethod... elements) {
      this.publicFinalMethods.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link AnalyzedClass#publicFinalMethods() publicFinalMethods} list.
     * @param elements An iterable of publicFinalMethods elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder publicFinalMethods(Iterable<? extends PublicFinalMethod> elements) {
      this.publicFinalMethods = ImmutableList.builder();
      return addAllPublicFinalMethods(elements);
    }

    /**
     * Adds elements to {@link AnalyzedClass#publicFinalMethods() publicFinalMethods} list.
     * @param elements An iterable of publicFinalMethods elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllPublicFinalMethods(Iterable<? extends PublicFinalMethod> elements) {
      this.publicFinalMethods.addAll(elements);
      return this;
    }

    /**
     * Adds one element to {@link AnalyzedClass#shimTypes() shimTypes} list.
     * @param element A shimTypes element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addShimTypes(ShimType element) {
      this.shimTypes.add(element);
      return this;
    }

    /**
     * Adds elements to {@link AnalyzedClass#shimTypes() shimTypes} list.
     * @param elements An array of shimTypes elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addShimTypes(ShimType... elements) {
      this.shimTypes.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link AnalyzedClass#shimTypes() shimTypes} list.
     * @param elements An iterable of shimTypes elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder shimTypes(Iterable<? extends ShimType> elements) {
      this.shimTypes = ImmutableList.builder();
      return addAllShimTypes(elements);
    }

    /**
     * Adds elements to {@link AnalyzedClass#shimTypes() shimTypes} list.
     * @param elements An iterable of shimTypes elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllShimTypes(Iterable<? extends ShimType> elements) {
      this.shimTypes.addAll(elements);
      return this;
    }

    /**
     * Adds one element to {@link AnalyzedClass#mixinTypes() mixinTypes} list.
     * @param element A mixinTypes element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addMixinTypes(MixinType element) {
      this.mixinTypes.add(element);
      return this;
    }

    /**
     * Adds elements to {@link AnalyzedClass#mixinTypes() mixinTypes} list.
     * @param elements An array of mixinTypes elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addMixinTypes(MixinType... elements) {
      this.mixinTypes.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link AnalyzedClass#mixinTypes() mixinTypes} list.
     * @param elements An iterable of mixinTypes elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder mixinTypes(Iterable<? extends MixinType> elements) {
      this.mixinTypes = ImmutableList.builder();
      return addAllMixinTypes(elements);
    }

    /**
     * Adds elements to {@link AnalyzedClass#mixinTypes() mixinTypes} list.
     * @param elements An iterable of mixinTypes elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllMixinTypes(Iterable<? extends MixinType> elements) {
      this.mixinTypes.addAll(elements);
      return this;
    }

    /**
     * Builds a new {@link ImmutableAnalyzedClass ImmutableAnalyzedClass}.
     * @return An immutable instance of AnalyzedClass
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableAnalyzedClass build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableAnalyzedClass(
          modifiers,
          name,
          superName,
          interfaceNames.build(),
          analyzedMethods.build(),
          publicFinalMethods.build(),
          shimTypes.build(),
          mixinTypes.build());
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_MODIFIERS) != 0) attributes.add("modifiers");
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      return "Cannot build AnalyzedClass, some of required attributes are not set " + attributes;
    }
  }
}
