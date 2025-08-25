package org.glowroot.agent.weaving;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import org.glowroot.agent.shaded.google.common.collect.ImmutableList;
import org.glowroot.agent.shaded.google.common.collect.ImmutableSet;
import org.glowroot.agent.shaded.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.glowroot.agent.shaded.objectweb.asm.Type;

/**
 * Immutable implementation of {@link WeavingClassVisitor.MethodMetaGroup}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMethodMetaGroup.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "WeavingClassVisitor.MethodMetaGroup"})
@Immutable
final class ImmutableMethodMetaGroup
    implements WeavingClassVisitor.MethodMetaGroup {
  private final String methodName;
  private final ImmutableList<Type> methodParameterTypes;
  private final int uniqueNum;
  private final ImmutableSet<Type> methodMetaTypes;

  private ImmutableMethodMetaGroup(
      String methodName,
      ImmutableList<Type> methodParameterTypes,
      int uniqueNum,
      ImmutableSet<Type> methodMetaTypes) {
    this.methodName = methodName;
    this.methodParameterTypes = methodParameterTypes;
    this.uniqueNum = uniqueNum;
    this.methodMetaTypes = methodMetaTypes;
  }

  /**
   * @return The value of the {@code methodName} attribute
   */
  @JsonProperty("methodName")
  @Override
  public String methodName() {
    return methodName;
  }

  /**
   * @return The value of the {@code methodParameterTypes} attribute
   */
  @JsonProperty("methodParameterTypes")
  @Override
  public ImmutableList<Type> methodParameterTypes() {
    return methodParameterTypes;
  }

  /**
   * @return The value of the {@code uniqueNum} attribute
   */
  @JsonProperty("uniqueNum")
  @Override
  public int uniqueNum() {
    return uniqueNum;
  }

  /**
   * @return The value of the {@code methodMetaTypes} attribute
   */
  @JsonProperty("methodMetaTypes")
  @Override
  public ImmutableSet<Type> methodMetaTypes() {
    return methodMetaTypes;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link WeavingClassVisitor.MethodMetaGroup#methodName() methodName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for methodName
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMethodMetaGroup withMethodName(String value) {
    if (this.methodName.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "methodName");
    return new ImmutableMethodMetaGroup(newValue, this.methodParameterTypes, this.uniqueNum, this.methodMetaTypes);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link WeavingClassVisitor.MethodMetaGroup#methodParameterTypes() methodParameterTypes}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMethodMetaGroup withMethodParameterTypes(Type... elements) {
    ImmutableList<Type> newValue = ImmutableList.copyOf(elements);
    return new ImmutableMethodMetaGroup(this.methodName, newValue, this.uniqueNum, this.methodMetaTypes);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link WeavingClassVisitor.MethodMetaGroup#methodParameterTypes() methodParameterTypes}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of methodParameterTypes elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMethodMetaGroup withMethodParameterTypes(Iterable<? extends Type> elements) {
    if (this.methodParameterTypes == elements) return this;
    ImmutableList<Type> newValue = ImmutableList.copyOf(elements);
    return new ImmutableMethodMetaGroup(this.methodName, newValue, this.uniqueNum, this.methodMetaTypes);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link WeavingClassVisitor.MethodMetaGroup#uniqueNum() uniqueNum} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for uniqueNum
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMethodMetaGroup withUniqueNum(int value) {
    if (this.uniqueNum == value) return this;
    return new ImmutableMethodMetaGroup(this.methodName, this.methodParameterTypes, value, this.methodMetaTypes);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link WeavingClassVisitor.MethodMetaGroup#methodMetaTypes() methodMetaTypes}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMethodMetaGroup withMethodMetaTypes(Type... elements) {
    ImmutableSet<Type> newValue = ImmutableSet.copyOf(elements);
    return new ImmutableMethodMetaGroup(this.methodName, this.methodParameterTypes, this.uniqueNum, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link WeavingClassVisitor.MethodMetaGroup#methodMetaTypes() methodMetaTypes}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of methodMetaTypes elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMethodMetaGroup withMethodMetaTypes(Iterable<? extends Type> elements) {
    if (this.methodMetaTypes == elements) return this;
    ImmutableSet<Type> newValue = ImmutableSet.copyOf(elements);
    return new ImmutableMethodMetaGroup(this.methodName, this.methodParameterTypes, this.uniqueNum, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMethodMetaGroup} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMethodMetaGroup
        && equalTo((ImmutableMethodMetaGroup) another);
  }

  private boolean equalTo(ImmutableMethodMetaGroup another) {
    return methodName.equals(another.methodName)
        && methodParameterTypes.equals(another.methodParameterTypes)
        && uniqueNum == another.uniqueNum
        && methodMetaTypes.equals(another.methodMetaTypes);
  }

  /**
   * Computes a hash code from attributes: {@code methodName}, {@code methodParameterTypes}, {@code uniqueNum}, {@code methodMetaTypes}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + methodName.hashCode();
    h += (h << 5) + methodParameterTypes.hashCode();
    h += (h << 5) + uniqueNum;
    h += (h << 5) + methodMetaTypes.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code MethodMetaGroup} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("MethodMetaGroup")
        .omitNullValues()
        .add("methodName", methodName)
        .add("methodParameterTypes", methodParameterTypes)
        .add("uniqueNum", uniqueNum)
        .add("methodMetaTypes", methodMetaTypes)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements WeavingClassVisitor.MethodMetaGroup {
    @Nullable String methodName;
    ImmutableList<Type> methodParameterTypes = ImmutableList.of();
    int uniqueNum;
    boolean uniqueNumIsSet;
    ImmutableSet<Type> methodMetaTypes = ImmutableSet.of();
    @JsonProperty("methodName")
    public void setMethodName(String methodName) {
      this.methodName = methodName;
    }
    @JsonProperty("methodParameterTypes")
    public void setMethodParameterTypes(ImmutableList<Type> methodParameterTypes) {
      this.methodParameterTypes = methodParameterTypes;
    }
    @JsonProperty("uniqueNum")
    public void setUniqueNum(int uniqueNum) {
      this.uniqueNum = uniqueNum;
      this.uniqueNumIsSet = true;
    }
    @JsonProperty("methodMetaTypes")
    public void setMethodMetaTypes(ImmutableSet<Type> methodMetaTypes) {
      this.methodMetaTypes = methodMetaTypes;
    }
    @Override
    public String methodName() { throw new UnsupportedOperationException(); }
    @Override
    public ImmutableList<Type> methodParameterTypes() { throw new UnsupportedOperationException(); }
    @Override
    public int uniqueNum() { throw new UnsupportedOperationException(); }
    @Override
    public ImmutableSet<Type> methodMetaTypes() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableMethodMetaGroup fromJson(Json json) {
    ImmutableMethodMetaGroup.Builder builder = ImmutableMethodMetaGroup.builder();
    if (json.methodName != null) {
      builder.methodName(json.methodName);
    }
    if (json.methodParameterTypes != null) {
      builder.addAllMethodParameterTypes(json.methodParameterTypes);
    }
    if (json.uniqueNumIsSet) {
      builder.uniqueNum(json.uniqueNum);
    }
    if (json.methodMetaTypes != null) {
      builder.addAllMethodMetaTypes(json.methodMetaTypes);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link WeavingClassVisitor.MethodMetaGroup} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MethodMetaGroup instance
   */
  public static ImmutableMethodMetaGroup copyOf(WeavingClassVisitor.MethodMetaGroup instance) {
    if (instance instanceof ImmutableMethodMetaGroup) {
      return (ImmutableMethodMetaGroup) instance;
    }
    return ImmutableMethodMetaGroup.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableMethodMetaGroup ImmutableMethodMetaGroup}.
   * @return A new ImmutableMethodMetaGroup builder
   */
  public static ImmutableMethodMetaGroup.Builder builder() {
    return new ImmutableMethodMetaGroup.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableMethodMetaGroup ImmutableMethodMetaGroup}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_METHOD_NAME = 0x1L;
    private static final long INIT_BIT_UNIQUE_NUM = 0x2L;
    private long initBits = 0x3L;

    private @Nullable String methodName;
    private ImmutableList.Builder<Type> methodParameterTypes = ImmutableList.builder();
    private int uniqueNum;
    private ImmutableSet.Builder<Type> methodMetaTypes = ImmutableSet.builder();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code MethodMetaGroup} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(WeavingClassVisitor.MethodMetaGroup instance) {
      Preconditions.checkNotNull(instance, "instance");
      methodName(instance.methodName());
      addAllMethodParameterTypes(instance.methodParameterTypes());
      uniqueNum(instance.uniqueNum());
      addAllMethodMetaTypes(instance.methodMetaTypes());
      return this;
    }

    /**
     * Initializes the value for the {@link WeavingClassVisitor.MethodMetaGroup#methodName() methodName} attribute.
     * @param methodName The value for methodName 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder methodName(String methodName) {
      this.methodName = Preconditions.checkNotNull(methodName, "methodName");
      initBits &= ~INIT_BIT_METHOD_NAME;
      return this;
    }

    /**
     * Adds one element to {@link WeavingClassVisitor.MethodMetaGroup#methodParameterTypes() methodParameterTypes} list.
     * @param element A methodParameterTypes element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addMethodParameterTypes(Type element) {
      this.methodParameterTypes.add(element);
      return this;
    }

    /**
     * Adds elements to {@link WeavingClassVisitor.MethodMetaGroup#methodParameterTypes() methodParameterTypes} list.
     * @param elements An array of methodParameterTypes elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addMethodParameterTypes(Type... elements) {
      this.methodParameterTypes.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link WeavingClassVisitor.MethodMetaGroup#methodParameterTypes() methodParameterTypes} list.
     * @param elements An iterable of methodParameterTypes elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder methodParameterTypes(Iterable<? extends Type> elements) {
      this.methodParameterTypes = ImmutableList.builder();
      return addAllMethodParameterTypes(elements);
    }

    /**
     * Adds elements to {@link WeavingClassVisitor.MethodMetaGroup#methodParameterTypes() methodParameterTypes} list.
     * @param elements An iterable of methodParameterTypes elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllMethodParameterTypes(Iterable<? extends Type> elements) {
      this.methodParameterTypes.addAll(elements);
      return this;
    }

    /**
     * Initializes the value for the {@link WeavingClassVisitor.MethodMetaGroup#uniqueNum() uniqueNum} attribute.
     * @param uniqueNum The value for uniqueNum 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder uniqueNum(int uniqueNum) {
      this.uniqueNum = uniqueNum;
      initBits &= ~INIT_BIT_UNIQUE_NUM;
      return this;
    }

    /**
     * Adds one element to {@link WeavingClassVisitor.MethodMetaGroup#methodMetaTypes() methodMetaTypes} set.
     * @param element A methodMetaTypes element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addMethodMetaTypes(Type element) {
      this.methodMetaTypes.add(element);
      return this;
    }

    /**
     * Adds elements to {@link WeavingClassVisitor.MethodMetaGroup#methodMetaTypes() methodMetaTypes} set.
     * @param elements An array of methodMetaTypes elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addMethodMetaTypes(Type... elements) {
      this.methodMetaTypes.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link WeavingClassVisitor.MethodMetaGroup#methodMetaTypes() methodMetaTypes} set.
     * @param elements An iterable of methodMetaTypes elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder methodMetaTypes(Iterable<? extends Type> elements) {
      this.methodMetaTypes = ImmutableSet.builder();
      return addAllMethodMetaTypes(elements);
    }

    /**
     * Adds elements to {@link WeavingClassVisitor.MethodMetaGroup#methodMetaTypes() methodMetaTypes} set.
     * @param elements An iterable of methodMetaTypes elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllMethodMetaTypes(Iterable<? extends Type> elements) {
      this.methodMetaTypes.addAll(elements);
      return this;
    }

    /**
     * Builds a new {@link ImmutableMethodMetaGroup ImmutableMethodMetaGroup}.
     * @return An immutable instance of MethodMetaGroup
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableMethodMetaGroup build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableMethodMetaGroup(methodName, methodParameterTypes.build(), uniqueNum, methodMetaTypes.build());
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_METHOD_NAME) != 0) attributes.add("methodName");
      if ((initBits & INIT_BIT_UNIQUE_NUM) != 0) attributes.add("uniqueNum");
      return "Cannot build MethodMetaGroup, some of required attributes are not set " + attributes;
    }
  }
}
