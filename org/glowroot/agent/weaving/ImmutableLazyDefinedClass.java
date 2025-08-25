package org.glowroot.agent.weaving;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import org.glowroot.agent.shaded.google.common.collect.ImmutableList;
import org.glowroot.agent.shaded.google.common.collect.Lists;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.glowroot.agent.shaded.objectweb.asm.Type;

/**
 * Immutable implementation of {@link ClassLoaders.LazyDefinedClass}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableLazyDefinedClass.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "ClassLoaders.LazyDefinedClass"})
@Immutable
public final class ImmutableLazyDefinedClass
    implements ClassLoaders.LazyDefinedClass {
  private final Type type;
  private final byte[] bytes;
  private final ImmutableList<ClassLoaders.LazyDefinedClass> dependencies;

  private ImmutableLazyDefinedClass(
      Type type,
      byte[] bytes,
      ImmutableList<ClassLoaders.LazyDefinedClass> dependencies) {
    this.type = type;
    this.bytes = bytes;
    this.dependencies = dependencies;
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Type type() {
    return type;
  }

  /**
   * @return A cloned {@code bytes} array
   */
  @JsonProperty("bytes")
  @Override
  public byte[] bytes() {
    return bytes.clone();
  }

  /**
   * @return The value of the {@code dependencies} attribute
   */
  @JsonProperty("dependencies")
  @Override
  public ImmutableList<ClassLoaders.LazyDefinedClass> dependencies() {
    return dependencies;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ClassLoaders.LazyDefinedClass#type() type} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for type
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLazyDefinedClass withType(Type value) {
    if (this.type == value) return this;
    Type newValue = Preconditions.checkNotNull(value, "type");
    return new ImmutableLazyDefinedClass(newValue, this.bytes, this.dependencies);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ClassLoaders.LazyDefinedClass#bytes() bytes}.
   * The array is cloned before being saved as attribute values.
   * @param elements The non-null elements for bytes
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLazyDefinedClass withBytes(byte... elements) {
    byte[] newValue = elements.clone();
    return new ImmutableLazyDefinedClass(this.type, newValue, this.dependencies);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ClassLoaders.LazyDefinedClass#dependencies() dependencies}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLazyDefinedClass withDependencies(ClassLoaders.LazyDefinedClass... elements) {
    ImmutableList<ClassLoaders.LazyDefinedClass> newValue = ImmutableList.copyOf(elements);
    return new ImmutableLazyDefinedClass(this.type, this.bytes, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ClassLoaders.LazyDefinedClass#dependencies() dependencies}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of dependencies elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLazyDefinedClass withDependencies(Iterable<? extends ClassLoaders.LazyDefinedClass> elements) {
    if (this.dependencies == elements) return this;
    ImmutableList<ClassLoaders.LazyDefinedClass> newValue = ImmutableList.copyOf(elements);
    return new ImmutableLazyDefinedClass(this.type, this.bytes, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableLazyDefinedClass} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableLazyDefinedClass
        && equalTo((ImmutableLazyDefinedClass) another);
  }

  private boolean equalTo(ImmutableLazyDefinedClass another) {
    return type.equals(another.type)
        && Arrays.equals(bytes, another.bytes)
        && dependencies.equals(another.dependencies);
  }

  /**
   * Computes a hash code from attributes: {@code type}, {@code bytes}, {@code dependencies}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + type.hashCode();
    h += (h << 5) + Arrays.hashCode(bytes);
    h += (h << 5) + dependencies.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code LazyDefinedClass} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("LazyDefinedClass")
        .omitNullValues()
        .add("type", type)
        .add("bytes", Arrays.toString(bytes))
        .add("dependencies", dependencies)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ClassLoaders.LazyDefinedClass {
    @Nullable Type type;
    @Nullable byte[] bytes;
    ImmutableList<ClassLoaders.LazyDefinedClass> dependencies = ImmutableList.of();
    @JsonProperty("type")
    public void setType(Type type) {
      this.type = type;
    }
    @JsonProperty("bytes")
    public void setBytes(byte[] bytes) {
      this.bytes = bytes;
    }
    @JsonProperty("dependencies")
    public void setDependencies(ImmutableList<ClassLoaders.LazyDefinedClass> dependencies) {
      this.dependencies = dependencies;
    }
    @Override
    public Type type() { throw new UnsupportedOperationException(); }
    @Override
    public byte[] bytes() { throw new UnsupportedOperationException(); }
    @Override
    public ImmutableList<ClassLoaders.LazyDefinedClass> dependencies() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableLazyDefinedClass fromJson(Json json) {
    ImmutableLazyDefinedClass.Builder builder = ImmutableLazyDefinedClass.builder();
    if (json.type != null) {
      builder.type(json.type);
    }
    if (json.bytes != null) {
      builder.bytes(json.bytes);
    }
    if (json.dependencies != null) {
      builder.addAllDependencies(json.dependencies);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ClassLoaders.LazyDefinedClass} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable LazyDefinedClass instance
   */
  public static ImmutableLazyDefinedClass copyOf(ClassLoaders.LazyDefinedClass instance) {
    if (instance instanceof ImmutableLazyDefinedClass) {
      return (ImmutableLazyDefinedClass) instance;
    }
    return ImmutableLazyDefinedClass.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableLazyDefinedClass ImmutableLazyDefinedClass}.
   * @return A new ImmutableLazyDefinedClass builder
   */
  public static ImmutableLazyDefinedClass.Builder builder() {
    return new ImmutableLazyDefinedClass.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableLazyDefinedClass ImmutableLazyDefinedClass}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_TYPE = 0x1L;
    private static final long INIT_BIT_BYTES = 0x2L;
    private long initBits = 0x3L;

    private @Nullable Type type;
    private @Nullable byte[] bytes;
    private ImmutableList.Builder<ClassLoaders.LazyDefinedClass> dependencies = ImmutableList.builder();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code LazyDefinedClass} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(ClassLoaders.LazyDefinedClass instance) {
      Preconditions.checkNotNull(instance, "instance");
      type(instance.type());
      bytes(instance.bytes());
      addAllDependencies(instance.dependencies());
      return this;
    }

    /**
     * Initializes the value for the {@link ClassLoaders.LazyDefinedClass#type() type} attribute.
     * @param type The value for type 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder type(Type type) {
      this.type = Preconditions.checkNotNull(type, "type");
      initBits &= ~INIT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the value for the {@link ClassLoaders.LazyDefinedClass#bytes() bytes} attribute.
     * @param bytes The elements for bytes
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder bytes(byte... bytes) {
      this.bytes = bytes.clone();
      initBits &= ~INIT_BIT_BYTES;
      return this;
    }

    /**
     * Adds one element to {@link ClassLoaders.LazyDefinedClass#dependencies() dependencies} list.
     * @param element A dependencies element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addDependencies(ClassLoaders.LazyDefinedClass element) {
      this.dependencies.add(element);
      return this;
    }

    /**
     * Adds elements to {@link ClassLoaders.LazyDefinedClass#dependencies() dependencies} list.
     * @param elements An array of dependencies elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addDependencies(ClassLoaders.LazyDefinedClass... elements) {
      this.dependencies.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link ClassLoaders.LazyDefinedClass#dependencies() dependencies} list.
     * @param elements An iterable of dependencies elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder dependencies(Iterable<? extends ClassLoaders.LazyDefinedClass> elements) {
      this.dependencies = ImmutableList.builder();
      return addAllDependencies(elements);
    }

    /**
     * Adds elements to {@link ClassLoaders.LazyDefinedClass#dependencies() dependencies} list.
     * @param elements An iterable of dependencies elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllDependencies(Iterable<? extends ClassLoaders.LazyDefinedClass> elements) {
      this.dependencies.addAll(elements);
      return this;
    }

    /**
     * Builds a new {@link ImmutableLazyDefinedClass ImmutableLazyDefinedClass}.
     * @return An immutable instance of LazyDefinedClass
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableLazyDefinedClass build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableLazyDefinedClass(type, bytes, dependencies.build());
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_TYPE) != 0) attributes.add("type");
      if ((initBits & INIT_BIT_BYTES) != 0) attributes.add("bytes");
      return "Cannot build LazyDefinedClass, some of required attributes are not set " + attributes;
    }
  }
}
