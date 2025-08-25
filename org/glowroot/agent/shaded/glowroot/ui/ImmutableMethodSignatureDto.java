package org.glowroot.agent.shaded.glowroot.ui;

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
 * Immutable implementation of {@link InstrumentationConfigJsonService.MethodSignatureDto}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMethodSignatureDto.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "InstrumentationConfigJsonService.MethodSignatureDto"})
@Immutable
final class ImmutableMethodSignatureDto
    extends InstrumentationConfigJsonService.MethodSignatureDto {
  private final String name;
  private final ImmutableList<String> parameterTypes;
  private final String returnType;
  private final ImmutableList<String> modifiers;

  private ImmutableMethodSignatureDto(
      String name,
      ImmutableList<String> parameterTypes,
      String returnType,
      ImmutableList<String> modifiers) {
    this.name = name;
    this.parameterTypes = parameterTypes;
    this.returnType = returnType;
    this.modifiers = modifiers;
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
  ImmutableList<String> modifiers() {
    return modifiers;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link InstrumentationConfigJsonService.MethodSignatureDto#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMethodSignatureDto withName(String value) {
    if (this.name.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "name");
    return new ImmutableMethodSignatureDto(newValue, this.parameterTypes, this.returnType, this.modifiers);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link InstrumentationConfigJsonService.MethodSignatureDto#parameterTypes() parameterTypes}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMethodSignatureDto withParameterTypes(String... elements) {
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableMethodSignatureDto(this.name, newValue, this.returnType, this.modifiers);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link InstrumentationConfigJsonService.MethodSignatureDto#parameterTypes() parameterTypes}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of parameterTypes elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMethodSignatureDto withParameterTypes(Iterable<String> elements) {
    if (this.parameterTypes == elements) return this;
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableMethodSignatureDto(this.name, newValue, this.returnType, this.modifiers);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link InstrumentationConfigJsonService.MethodSignatureDto#returnType() returnType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for returnType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMethodSignatureDto withReturnType(String value) {
    if (this.returnType.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "returnType");
    return new ImmutableMethodSignatureDto(this.name, this.parameterTypes, newValue, this.modifiers);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link InstrumentationConfigJsonService.MethodSignatureDto#modifiers() modifiers}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMethodSignatureDto withModifiers(String... elements) {
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableMethodSignatureDto(this.name, this.parameterTypes, this.returnType, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link InstrumentationConfigJsonService.MethodSignatureDto#modifiers() modifiers}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of modifiers elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMethodSignatureDto withModifiers(Iterable<String> elements) {
    if (this.modifiers == elements) return this;
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableMethodSignatureDto(this.name, this.parameterTypes, this.returnType, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMethodSignatureDto} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMethodSignatureDto
        && equalTo((ImmutableMethodSignatureDto) another);
  }

  private boolean equalTo(ImmutableMethodSignatureDto another) {
    return name.equals(another.name)
        && parameterTypes.equals(another.parameterTypes)
        && returnType.equals(another.returnType)
        && modifiers.equals(another.modifiers);
  }

  /**
   * Computes a hash code from attributes: {@code name}, {@code parameterTypes}, {@code returnType}, {@code modifiers}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + name.hashCode();
    h += (h << 5) + parameterTypes.hashCode();
    h += (h << 5) + returnType.hashCode();
    h += (h << 5) + modifiers.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code MethodSignatureDto} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("MethodSignatureDto")
        .omitNullValues()
        .add("name", name)
        .add("parameterTypes", parameterTypes)
        .add("returnType", returnType)
        .add("modifiers", modifiers)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends InstrumentationConfigJsonService.MethodSignatureDto {
    @Nullable String name;
    ImmutableList<String> parameterTypes = ImmutableList.of();
    @Nullable String returnType;
    ImmutableList<String> modifiers = ImmutableList.of();
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
    public void setModifiers(ImmutableList<String> modifiers) {
      this.modifiers = modifiers;
    }
    @Override
    String name() { throw new UnsupportedOperationException(); }
    @Override
    ImmutableList<String> parameterTypes() { throw new UnsupportedOperationException(); }
    @Override
    String returnType() { throw new UnsupportedOperationException(); }
    @Override
    ImmutableList<String> modifiers() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableMethodSignatureDto fromJson(Json json) {
    ImmutableMethodSignatureDto.Builder builder = ImmutableMethodSignatureDto.builder();
    if (json.name != null) {
      builder.name(json.name);
    }
    if (json.parameterTypes != null) {
      builder.addAllParameterTypes(json.parameterTypes);
    }
    if (json.returnType != null) {
      builder.returnType(json.returnType);
    }
    if (json.modifiers != null) {
      builder.addAllModifiers(json.modifiers);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link InstrumentationConfigJsonService.MethodSignatureDto} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MethodSignatureDto instance
   */
  public static ImmutableMethodSignatureDto copyOf(InstrumentationConfigJsonService.MethodSignatureDto instance) {
    if (instance instanceof ImmutableMethodSignatureDto) {
      return (ImmutableMethodSignatureDto) instance;
    }
    return ImmutableMethodSignatureDto.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableMethodSignatureDto ImmutableMethodSignatureDto}.
   * @return A new ImmutableMethodSignatureDto builder
   */
  public static ImmutableMethodSignatureDto.Builder builder() {
    return new ImmutableMethodSignatureDto.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableMethodSignatureDto ImmutableMethodSignatureDto}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_NAME = 0x1L;
    private static final long INIT_BIT_RETURN_TYPE = 0x2L;
    private long initBits = 0x3L;

    private @Nullable String name;
    private ImmutableList.Builder<String> parameterTypes = ImmutableList.builder();
    private @Nullable String returnType;
    private ImmutableList.Builder<String> modifiers = ImmutableList.builder();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code MethodSignatureDto} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(InstrumentationConfigJsonService.MethodSignatureDto instance) {
      Preconditions.checkNotNull(instance, "instance");
      name(instance.name());
      addAllParameterTypes(instance.parameterTypes());
      returnType(instance.returnType());
      addAllModifiers(instance.modifiers());
      return this;
    }

    /**
     * Initializes the value for the {@link InstrumentationConfigJsonService.MethodSignatureDto#name() name} attribute.
     * @param name The value for name 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder name(String name) {
      this.name = Preconditions.checkNotNull(name, "name");
      initBits &= ~INIT_BIT_NAME;
      return this;
    }

    /**
     * Adds one element to {@link InstrumentationConfigJsonService.MethodSignatureDto#parameterTypes() parameterTypes} list.
     * @param element A parameterTypes element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addParameterTypes(String element) {
      this.parameterTypes.add(element);
      return this;
    }

    /**
     * Adds elements to {@link InstrumentationConfigJsonService.MethodSignatureDto#parameterTypes() parameterTypes} list.
     * @param elements An array of parameterTypes elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addParameterTypes(String... elements) {
      this.parameterTypes.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link InstrumentationConfigJsonService.MethodSignatureDto#parameterTypes() parameterTypes} list.
     * @param elements An iterable of parameterTypes elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder parameterTypes(Iterable<String> elements) {
      this.parameterTypes = ImmutableList.builder();
      return addAllParameterTypes(elements);
    }

    /**
     * Adds elements to {@link InstrumentationConfigJsonService.MethodSignatureDto#parameterTypes() parameterTypes} list.
     * @param elements An iterable of parameterTypes elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllParameterTypes(Iterable<String> elements) {
      this.parameterTypes.addAll(elements);
      return this;
    }

    /**
     * Initializes the value for the {@link InstrumentationConfigJsonService.MethodSignatureDto#returnType() returnType} attribute.
     * @param returnType The value for returnType 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder returnType(String returnType) {
      this.returnType = Preconditions.checkNotNull(returnType, "returnType");
      initBits &= ~INIT_BIT_RETURN_TYPE;
      return this;
    }

    /**
     * Adds one element to {@link InstrumentationConfigJsonService.MethodSignatureDto#modifiers() modifiers} list.
     * @param element A modifiers element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addModifiers(String element) {
      this.modifiers.add(element);
      return this;
    }

    /**
     * Adds elements to {@link InstrumentationConfigJsonService.MethodSignatureDto#modifiers() modifiers} list.
     * @param elements An array of modifiers elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addModifiers(String... elements) {
      this.modifiers.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link InstrumentationConfigJsonService.MethodSignatureDto#modifiers() modifiers} list.
     * @param elements An iterable of modifiers elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder modifiers(Iterable<String> elements) {
      this.modifiers = ImmutableList.builder();
      return addAllModifiers(elements);
    }

    /**
     * Adds elements to {@link InstrumentationConfigJsonService.MethodSignatureDto#modifiers() modifiers} list.
     * @param elements An iterable of modifiers elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllModifiers(Iterable<String> elements) {
      this.modifiers.addAll(elements);
      return this;
    }

    /**
     * Builds a new {@link ImmutableMethodSignatureDto ImmutableMethodSignatureDto}.
     * @return An immutable instance of MethodSignatureDto
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableMethodSignatureDto build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableMethodSignatureDto(name, parameterTypes.build(), returnType, modifiers.build());
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      if ((initBits & INIT_BIT_RETURN_TYPE) != 0) attributes.add("returnType");
      return "Cannot build MethodSignatureDto, some of required attributes are not set " + attributes;
    }
  }
}
