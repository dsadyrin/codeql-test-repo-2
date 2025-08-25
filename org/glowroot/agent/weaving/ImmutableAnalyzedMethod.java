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
 * Immutable implementation of {@link AnalyzedMethod}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAnalyzedMethod.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "AnalyzedMethod"})
@Immutable
final class ImmutableAnalyzedMethod extends AnalyzedMethod {
  private final String name;
  private final ImmutableList<String> parameterTypes;
  private final String returnType;
  private final int modifiers;
  private final @Nullable String signature;
  private final ImmutableList<String> exceptions;
  private final ImmutableList<Advice> advisors;
  private final ImmutableList<Advice> subTypeRestrictedAdvisors;

  private ImmutableAnalyzedMethod(
      String name,
      ImmutableList<String> parameterTypes,
      String returnType,
      int modifiers,
      @Nullable String signature,
      ImmutableList<String> exceptions,
      ImmutableList<Advice> advisors,
      ImmutableList<Advice> subTypeRestrictedAdvisors) {
    this.name = name;
    this.parameterTypes = parameterTypes;
    this.returnType = returnType;
    this.modifiers = modifiers;
    this.signature = signature;
    this.exceptions = exceptions;
    this.advisors = advisors;
    this.subTypeRestrictedAdvisors = subTypeRestrictedAdvisors;
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
   * @return The value of the {@code parameterTypes} attribute
   */
  @JsonProperty("parameterTypes")
  @Override
  ImmutableList<String> parameterTypes() {
    return parameterTypes;
  }

  /**
   * @return The value of the {@code returnType} attribute
   */
  @JsonProperty("returnType")
  @Override
  String returnType() {
    return returnType;
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
   * @return The value of the {@code signature} attribute
   */
  @JsonProperty("signature")
  @Override
  @Nullable String signature() {
    return signature;
  }

  /**
   * @return The value of the {@code exceptions} attribute
   */
  @JsonProperty("exceptions")
  @Override
  ImmutableList<String> exceptions() {
    return exceptions;
  }

  /**
   * @return The value of the {@code advisors} attribute
   */
  @JsonProperty("advisors")
  @Override
  ImmutableList<Advice> advisors() {
    return advisors;
  }

  /**
   * @return The value of the {@code subTypeRestrictedAdvisors} attribute
   */
  @JsonProperty("subTypeRestrictedAdvisors")
  @Override
  ImmutableList<Advice> subTypeRestrictedAdvisors() {
    return subTypeRestrictedAdvisors;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AnalyzedMethod#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAnalyzedMethod withName(String value) {
    if (this.name.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "name");
    return new ImmutableAnalyzedMethod(
        newValue,
        this.parameterTypes,
        this.returnType,
        this.modifiers,
        this.signature,
        this.exceptions,
        this.advisors,
        this.subTypeRestrictedAdvisors);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link AnalyzedMethod#parameterTypes() parameterTypes}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAnalyzedMethod withParameterTypes(String... elements) {
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableAnalyzedMethod(
        this.name,
        newValue,
        this.returnType,
        this.modifiers,
        this.signature,
        this.exceptions,
        this.advisors,
        this.subTypeRestrictedAdvisors);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link AnalyzedMethod#parameterTypes() parameterTypes}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of parameterTypes elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAnalyzedMethod withParameterTypes(Iterable<String> elements) {
    if (this.parameterTypes == elements) return this;
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableAnalyzedMethod(
        this.name,
        newValue,
        this.returnType,
        this.modifiers,
        this.signature,
        this.exceptions,
        this.advisors,
        this.subTypeRestrictedAdvisors);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AnalyzedMethod#returnType() returnType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for returnType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAnalyzedMethod withReturnType(String value) {
    if (this.returnType.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "returnType");
    return new ImmutableAnalyzedMethod(
        this.name,
        this.parameterTypes,
        newValue,
        this.modifiers,
        this.signature,
        this.exceptions,
        this.advisors,
        this.subTypeRestrictedAdvisors);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AnalyzedMethod#modifiers() modifiers} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for modifiers
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAnalyzedMethod withModifiers(int value) {
    if (this.modifiers == value) return this;
    return new ImmutableAnalyzedMethod(
        this.name,
        this.parameterTypes,
        this.returnType,
        value,
        this.signature,
        this.exceptions,
        this.advisors,
        this.subTypeRestrictedAdvisors);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AnalyzedMethod#signature() signature} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for signature (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAnalyzedMethod withSignature(@Nullable String value) {
    if (Objects.equal(this.signature, value)) return this;
    return new ImmutableAnalyzedMethod(
        this.name,
        this.parameterTypes,
        this.returnType,
        this.modifiers,
        value,
        this.exceptions,
        this.advisors,
        this.subTypeRestrictedAdvisors);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link AnalyzedMethod#exceptions() exceptions}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAnalyzedMethod withExceptions(String... elements) {
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableAnalyzedMethod(
        this.name,
        this.parameterTypes,
        this.returnType,
        this.modifiers,
        this.signature,
        newValue,
        this.advisors,
        this.subTypeRestrictedAdvisors);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link AnalyzedMethod#exceptions() exceptions}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of exceptions elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAnalyzedMethod withExceptions(Iterable<String> elements) {
    if (this.exceptions == elements) return this;
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableAnalyzedMethod(
        this.name,
        this.parameterTypes,
        this.returnType,
        this.modifiers,
        this.signature,
        newValue,
        this.advisors,
        this.subTypeRestrictedAdvisors);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link AnalyzedMethod#advisors() advisors}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAnalyzedMethod withAdvisors(Advice... elements) {
    ImmutableList<Advice> newValue = ImmutableList.copyOf(elements);
    return new ImmutableAnalyzedMethod(
        this.name,
        this.parameterTypes,
        this.returnType,
        this.modifiers,
        this.signature,
        this.exceptions,
        newValue,
        this.subTypeRestrictedAdvisors);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link AnalyzedMethod#advisors() advisors}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of advisors elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAnalyzedMethod withAdvisors(Iterable<? extends Advice> elements) {
    if (this.advisors == elements) return this;
    ImmutableList<Advice> newValue = ImmutableList.copyOf(elements);
    return new ImmutableAnalyzedMethod(
        this.name,
        this.parameterTypes,
        this.returnType,
        this.modifiers,
        this.signature,
        this.exceptions,
        newValue,
        this.subTypeRestrictedAdvisors);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link AnalyzedMethod#subTypeRestrictedAdvisors() subTypeRestrictedAdvisors}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAnalyzedMethod withSubTypeRestrictedAdvisors(Advice... elements) {
    ImmutableList<Advice> newValue = ImmutableList.copyOf(elements);
    return new ImmutableAnalyzedMethod(
        this.name,
        this.parameterTypes,
        this.returnType,
        this.modifiers,
        this.signature,
        this.exceptions,
        this.advisors,
        newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link AnalyzedMethod#subTypeRestrictedAdvisors() subTypeRestrictedAdvisors}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of subTypeRestrictedAdvisors elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAnalyzedMethod withSubTypeRestrictedAdvisors(Iterable<? extends Advice> elements) {
    if (this.subTypeRestrictedAdvisors == elements) return this;
    ImmutableList<Advice> newValue = ImmutableList.copyOf(elements);
    return new ImmutableAnalyzedMethod(
        this.name,
        this.parameterTypes,
        this.returnType,
        this.modifiers,
        this.signature,
        this.exceptions,
        this.advisors,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAnalyzedMethod} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAnalyzedMethod
        && equalTo((ImmutableAnalyzedMethod) another);
  }

  private boolean equalTo(ImmutableAnalyzedMethod another) {
    return name.equals(another.name)
        && parameterTypes.equals(another.parameterTypes)
        && returnType.equals(another.returnType)
        && modifiers == another.modifiers
        && Objects.equal(signature, another.signature)
        && exceptions.equals(another.exceptions)
        && advisors.equals(another.advisors)
        && subTypeRestrictedAdvisors.equals(another.subTypeRestrictedAdvisors);
  }

  /**
   * Computes a hash code from attributes: {@code name}, {@code parameterTypes}, {@code returnType}, {@code modifiers}, {@code signature}, {@code exceptions}, {@code advisors}, {@code subTypeRestrictedAdvisors}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + name.hashCode();
    h += (h << 5) + parameterTypes.hashCode();
    h += (h << 5) + returnType.hashCode();
    h += (h << 5) + modifiers;
    h += (h << 5) + Objects.hashCode(signature);
    h += (h << 5) + exceptions.hashCode();
    h += (h << 5) + advisors.hashCode();
    h += (h << 5) + subTypeRestrictedAdvisors.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code AnalyzedMethod} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("AnalyzedMethod")
        .omitNullValues()
        .add("name", name)
        .add("parameterTypes", parameterTypes)
        .add("returnType", returnType)
        .add("modifiers", modifiers)
        .add("signature", signature)
        .add("exceptions", exceptions)
        .add("advisors", advisors)
        .add("subTypeRestrictedAdvisors", subTypeRestrictedAdvisors)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends AnalyzedMethod {
    @Nullable String name;
    ImmutableList<String> parameterTypes = ImmutableList.of();
    @Nullable String returnType;
    int modifiers;
    boolean modifiersIsSet;
    @Nullable String signature;
    ImmutableList<String> exceptions = ImmutableList.of();
    ImmutableList<Advice> advisors = ImmutableList.of();
    ImmutableList<Advice> subTypeRestrictedAdvisors = ImmutableList.of();
    @JsonProperty("name")
    public void setName(String name) {
      this.name = name;
    }
    @JsonProperty("parameterTypes")
    public void setParameterTypes(ImmutableList<String> parameterTypes) {
      this.parameterTypes = parameterTypes;
    }
    @JsonProperty("returnType")
    public void setReturnType(String returnType) {
      this.returnType = returnType;
    }
    @JsonProperty("modifiers")
    public void setModifiers(int modifiers) {
      this.modifiers = modifiers;
      this.modifiersIsSet = true;
    }
    @JsonProperty("signature")
    public void setSignature(@Nullable String signature) {
      this.signature = signature;
    }
    @JsonProperty("exceptions")
    public void setExceptions(ImmutableList<String> exceptions) {
      this.exceptions = exceptions;
    }
    @JsonProperty("advisors")
    public void setAdvisors(ImmutableList<Advice> advisors) {
      this.advisors = advisors;
    }
    @JsonProperty("subTypeRestrictedAdvisors")
    public void setSubTypeRestrictedAdvisors(ImmutableList<Advice> subTypeRestrictedAdvisors) {
      this.subTypeRestrictedAdvisors = subTypeRestrictedAdvisors;
    }
    @Override
    String name() { throw new UnsupportedOperationException(); }
    @Override
    ImmutableList<String> parameterTypes() { throw new UnsupportedOperationException(); }
    @Override
    String returnType() { throw new UnsupportedOperationException(); }
    @Override
    int modifiers() { throw new UnsupportedOperationException(); }
    @Override
    String signature() { throw new UnsupportedOperationException(); }
    @Override
    ImmutableList<String> exceptions() { throw new UnsupportedOperationException(); }
    @Override
    ImmutableList<Advice> advisors() { throw new UnsupportedOperationException(); }
    @Override
    ImmutableList<Advice> subTypeRestrictedAdvisors() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableAnalyzedMethod fromJson(Json json) {
    ImmutableAnalyzedMethod.Builder builder = ImmutableAnalyzedMethod.builder();
    if (json.name != null) {
      builder.name(json.name);
    }
    if (json.parameterTypes != null) {
      builder.addAllParameterTypes(json.parameterTypes);
    }
    if (json.returnType != null) {
      builder.returnType(json.returnType);
    }
    if (json.modifiersIsSet) {
      builder.modifiers(json.modifiers);
    }
    if (json.signature != null) {
      builder.signature(json.signature);
    }
    if (json.exceptions != null) {
      builder.addAllExceptions(json.exceptions);
    }
    if (json.advisors != null) {
      builder.addAllAdvisors(json.advisors);
    }
    if (json.subTypeRestrictedAdvisors != null) {
      builder.addAllSubTypeRestrictedAdvisors(json.subTypeRestrictedAdvisors);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link AnalyzedMethod} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable AnalyzedMethod instance
   */
  public static ImmutableAnalyzedMethod copyOf(AnalyzedMethod instance) {
    if (instance instanceof ImmutableAnalyzedMethod) {
      return (ImmutableAnalyzedMethod) instance;
    }
    return ImmutableAnalyzedMethod.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableAnalyzedMethod ImmutableAnalyzedMethod}.
   * @return A new ImmutableAnalyzedMethod builder
   */
  public static ImmutableAnalyzedMethod.Builder builder() {
    return new ImmutableAnalyzedMethod.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableAnalyzedMethod ImmutableAnalyzedMethod}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_NAME = 0x1L;
    private static final long INIT_BIT_RETURN_TYPE = 0x2L;
    private static final long INIT_BIT_MODIFIERS = 0x4L;
    private long initBits = 0x7L;

    private @Nullable String name;
    private ImmutableList.Builder<String> parameterTypes = ImmutableList.builder();
    private @Nullable String returnType;
    private int modifiers;
    private @Nullable String signature;
    private ImmutableList.Builder<String> exceptions = ImmutableList.builder();
    private ImmutableList.Builder<Advice> advisors = ImmutableList.builder();
    private ImmutableList.Builder<Advice> subTypeRestrictedAdvisors = ImmutableList.builder();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code AnalyzedMethod} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(AnalyzedMethod instance) {
      Preconditions.checkNotNull(instance, "instance");
      name(instance.name());
      addAllParameterTypes(instance.parameterTypes());
      returnType(instance.returnType());
      modifiers(instance.modifiers());
      @Nullable String signatureValue = instance.signature();
      if (signatureValue != null) {
        signature(signatureValue);
      }
      addAllExceptions(instance.exceptions());
      addAllAdvisors(instance.advisors());
      addAllSubTypeRestrictedAdvisors(instance.subTypeRestrictedAdvisors());
      return this;
    }

    /**
     * Initializes the value for the {@link AnalyzedMethod#name() name} attribute.
     * @param name The value for name 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder name(String name) {
      this.name = Preconditions.checkNotNull(name, "name");
      initBits &= ~INIT_BIT_NAME;
      return this;
    }

    /**
     * Adds one element to {@link AnalyzedMethod#parameterTypes() parameterTypes} list.
     * @param element A parameterTypes element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addParameterTypes(String element) {
      this.parameterTypes.add(element);
      return this;
    }

    /**
     * Adds elements to {@link AnalyzedMethod#parameterTypes() parameterTypes} list.
     * @param elements An array of parameterTypes elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addParameterTypes(String... elements) {
      this.parameterTypes.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link AnalyzedMethod#parameterTypes() parameterTypes} list.
     * @param elements An iterable of parameterTypes elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder parameterTypes(Iterable<String> elements) {
      this.parameterTypes = ImmutableList.builder();
      return addAllParameterTypes(elements);
    }

    /**
     * Adds elements to {@link AnalyzedMethod#parameterTypes() parameterTypes} list.
     * @param elements An iterable of parameterTypes elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllParameterTypes(Iterable<String> elements) {
      this.parameterTypes.addAll(elements);
      return this;
    }

    /**
     * Initializes the value for the {@link AnalyzedMethod#returnType() returnType} attribute.
     * @param returnType The value for returnType 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder returnType(String returnType) {
      this.returnType = Preconditions.checkNotNull(returnType, "returnType");
      initBits &= ~INIT_BIT_RETURN_TYPE;
      return this;
    }

    /**
     * Initializes the value for the {@link AnalyzedMethod#modifiers() modifiers} attribute.
     * @param modifiers The value for modifiers 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder modifiers(int modifiers) {
      this.modifiers = modifiers;
      initBits &= ~INIT_BIT_MODIFIERS;
      return this;
    }

    /**
     * Initializes the value for the {@link AnalyzedMethod#signature() signature} attribute.
     * @param signature The value for signature (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder signature(@Nullable String signature) {
      this.signature = signature;
      return this;
    }

    /**
     * Adds one element to {@link AnalyzedMethod#exceptions() exceptions} list.
     * @param element A exceptions element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addExceptions(String element) {
      this.exceptions.add(element);
      return this;
    }

    /**
     * Adds elements to {@link AnalyzedMethod#exceptions() exceptions} list.
     * @param elements An array of exceptions elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addExceptions(String... elements) {
      this.exceptions.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link AnalyzedMethod#exceptions() exceptions} list.
     * @param elements An iterable of exceptions elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder exceptions(Iterable<String> elements) {
      this.exceptions = ImmutableList.builder();
      return addAllExceptions(elements);
    }

    /**
     * Adds elements to {@link AnalyzedMethod#exceptions() exceptions} list.
     * @param elements An iterable of exceptions elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllExceptions(Iterable<String> elements) {
      this.exceptions.addAll(elements);
      return this;
    }

    /**
     * Adds one element to {@link AnalyzedMethod#advisors() advisors} list.
     * @param element A advisors element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAdvisors(Advice element) {
      this.advisors.add(element);
      return this;
    }

    /**
     * Adds elements to {@link AnalyzedMethod#advisors() advisors} list.
     * @param elements An array of advisors elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAdvisors(Advice... elements) {
      this.advisors.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link AnalyzedMethod#advisors() advisors} list.
     * @param elements An iterable of advisors elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder advisors(Iterable<? extends Advice> elements) {
      this.advisors = ImmutableList.builder();
      return addAllAdvisors(elements);
    }

    /**
     * Adds elements to {@link AnalyzedMethod#advisors() advisors} list.
     * @param elements An iterable of advisors elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllAdvisors(Iterable<? extends Advice> elements) {
      this.advisors.addAll(elements);
      return this;
    }

    /**
     * Adds one element to {@link AnalyzedMethod#subTypeRestrictedAdvisors() subTypeRestrictedAdvisors} list.
     * @param element A subTypeRestrictedAdvisors element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addSubTypeRestrictedAdvisors(Advice element) {
      this.subTypeRestrictedAdvisors.add(element);
      return this;
    }

    /**
     * Adds elements to {@link AnalyzedMethod#subTypeRestrictedAdvisors() subTypeRestrictedAdvisors} list.
     * @param elements An array of subTypeRestrictedAdvisors elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addSubTypeRestrictedAdvisors(Advice... elements) {
      this.subTypeRestrictedAdvisors.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link AnalyzedMethod#subTypeRestrictedAdvisors() subTypeRestrictedAdvisors} list.
     * @param elements An iterable of subTypeRestrictedAdvisors elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder subTypeRestrictedAdvisors(Iterable<? extends Advice> elements) {
      this.subTypeRestrictedAdvisors = ImmutableList.builder();
      return addAllSubTypeRestrictedAdvisors(elements);
    }

    /**
     * Adds elements to {@link AnalyzedMethod#subTypeRestrictedAdvisors() subTypeRestrictedAdvisors} list.
     * @param elements An iterable of subTypeRestrictedAdvisors elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllSubTypeRestrictedAdvisors(Iterable<? extends Advice> elements) {
      this.subTypeRestrictedAdvisors.addAll(elements);
      return this;
    }

    /**
     * Builds a new {@link ImmutableAnalyzedMethod ImmutableAnalyzedMethod}.
     * @return An immutable instance of AnalyzedMethod
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableAnalyzedMethod build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableAnalyzedMethod(
          name,
          parameterTypes.build(),
          returnType,
          modifiers,
          signature,
          exceptions.build(),
          advisors.build(),
          subTypeRestrictedAdvisors.build());
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      if ((initBits & INIT_BIT_RETURN_TYPE) != 0) attributes.add("returnType");
      if ((initBits & INIT_BIT_MODIFIERS) != 0) attributes.add("modifiers");
      return "Cannot build AnalyzedMethod, some of required attributes are not set " + attributes;
    }
  }
}
