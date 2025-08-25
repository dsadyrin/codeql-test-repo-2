package org.glowroot.agent.weaving;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Objects;
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
 * Immutable implementation of {@link MixinType}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMixinType.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "MixinType"})
@Immutable
final class ImmutableMixinType extends MixinType {
  private final ImmutableList<String> targets;
  private final ImmutableList<Type> interfaces;
  private final @Nullable String initMethodName;
  private final byte[] implementationBytes;

  private ImmutableMixinType(
      ImmutableList<String> targets,
      ImmutableList<Type> interfaces,
      @Nullable String initMethodName,
      byte[] implementationBytes) {
    this.targets = targets;
    this.interfaces = interfaces;
    this.initMethodName = initMethodName;
    this.implementationBytes = implementationBytes;
  }

  /**
   * @return The value of the {@code targets} attribute
   */
  @JsonProperty("targets")
  @Override
  ImmutableList<String> targets() {
    return targets;
  }

  /**
   * @return The value of the {@code interfaces} attribute
   */
  @JsonProperty("interfaces")
  @Override
  ImmutableList<Type> interfaces() {
    return interfaces;
  }

  /**
   * @return The value of the {@code initMethodName} attribute
   */
  @JsonProperty("initMethodName")
  @Override
  @Nullable String initMethodName() {
    return initMethodName;
  }

  /**
   * @return A cloned {@code implementationBytes} array
   */
  @JsonProperty("implementationBytes")
  @Override
  byte[] implementationBytes() {
    return implementationBytes.clone();
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link MixinType#targets() targets}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMixinType withTargets(String... elements) {
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableMixinType(newValue, this.interfaces, this.initMethodName, this.implementationBytes);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link MixinType#targets() targets}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of targets elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMixinType withTargets(Iterable<String> elements) {
    if (this.targets == elements) return this;
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableMixinType(newValue, this.interfaces, this.initMethodName, this.implementationBytes);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link MixinType#interfaces() interfaces}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMixinType withInterfaces(Type... elements) {
    ImmutableList<Type> newValue = ImmutableList.copyOf(elements);
    return new ImmutableMixinType(this.targets, newValue, this.initMethodName, this.implementationBytes);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link MixinType#interfaces() interfaces}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of interfaces elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMixinType withInterfaces(Iterable<? extends Type> elements) {
    if (this.interfaces == elements) return this;
    ImmutableList<Type> newValue = ImmutableList.copyOf(elements);
    return new ImmutableMixinType(this.targets, newValue, this.initMethodName, this.implementationBytes);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MixinType#initMethodName() initMethodName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for initMethodName (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMixinType withInitMethodName(@Nullable String value) {
    if (Objects.equal(this.initMethodName, value)) return this;
    return new ImmutableMixinType(this.targets, this.interfaces, value, this.implementationBytes);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link MixinType#implementationBytes() implementationBytes}.
   * The array is cloned before being saved as attribute values.
   * @param elements The non-null elements for implementationBytes
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMixinType withImplementationBytes(byte... elements) {
    byte[] newValue = elements.clone();
    return new ImmutableMixinType(this.targets, this.interfaces, this.initMethodName, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMixinType} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMixinType
        && equalTo((ImmutableMixinType) another);
  }

  private boolean equalTo(ImmutableMixinType another) {
    return targets.equals(another.targets)
        && interfaces.equals(another.interfaces)
        && Objects.equal(initMethodName, another.initMethodName)
        && Arrays.equals(implementationBytes, another.implementationBytes);
  }

  /**
   * Computes a hash code from attributes: {@code targets}, {@code interfaces}, {@code initMethodName}, {@code implementationBytes}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + targets.hashCode();
    h += (h << 5) + interfaces.hashCode();
    h += (h << 5) + Objects.hashCode(initMethodName);
    h += (h << 5) + Arrays.hashCode(implementationBytes);
    return h;
  }

  /**
   * Prints the immutable value {@code MixinType} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("MixinType")
        .omitNullValues()
        .add("targets", targets)
        .add("interfaces", interfaces)
        .add("initMethodName", initMethodName)
        .add("implementationBytes", Arrays.toString(implementationBytes))
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends MixinType {
    ImmutableList<String> targets = ImmutableList.of();
    ImmutableList<Type> interfaces = ImmutableList.of();
    @Nullable String initMethodName;
    @Nullable byte[] implementationBytes;
    @JsonProperty("targets")
    public void setTargets(ImmutableList<String> targets) {
      this.targets = targets;
    }
    @JsonProperty("interfaces")
    public void setInterfaces(ImmutableList<Type> interfaces) {
      this.interfaces = interfaces;
    }
    @JsonProperty("initMethodName")
    public void setInitMethodName(@Nullable String initMethodName) {
      this.initMethodName = initMethodName;
    }
    @JsonProperty("implementationBytes")
    public void setImplementationBytes(byte[] implementationBytes) {
      this.implementationBytes = implementationBytes;
    }
    @Override
    ImmutableList<String> targets() { throw new UnsupportedOperationException(); }
    @Override
    ImmutableList<Type> interfaces() { throw new UnsupportedOperationException(); }
    @Override
    String initMethodName() { throw new UnsupportedOperationException(); }
    @Override
    byte[] implementationBytes() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableMixinType fromJson(Json json) {
    ImmutableMixinType.Builder builder = ImmutableMixinType.builder();
    if (json.targets != null) {
      builder.addAllTargets(json.targets);
    }
    if (json.interfaces != null) {
      builder.addAllInterfaces(json.interfaces);
    }
    if (json.initMethodName != null) {
      builder.initMethodName(json.initMethodName);
    }
    if (json.implementationBytes != null) {
      builder.implementationBytes(json.implementationBytes);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MixinType} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MixinType instance
   */
  public static ImmutableMixinType copyOf(MixinType instance) {
    if (instance instanceof ImmutableMixinType) {
      return (ImmutableMixinType) instance;
    }
    return ImmutableMixinType.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableMixinType ImmutableMixinType}.
   * @return A new ImmutableMixinType builder
   */
  public static ImmutableMixinType.Builder builder() {
    return new ImmutableMixinType.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableMixinType ImmutableMixinType}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_IMPLEMENTATION_BYTES = 0x1L;
    private long initBits = 0x1L;

    private ImmutableList.Builder<String> targets = ImmutableList.builder();
    private ImmutableList.Builder<Type> interfaces = ImmutableList.builder();
    private @Nullable String initMethodName;
    private @Nullable byte[] implementationBytes;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code MixinType} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(MixinType instance) {
      Preconditions.checkNotNull(instance, "instance");
      addAllTargets(instance.targets());
      addAllInterfaces(instance.interfaces());
      @Nullable String initMethodNameValue = instance.initMethodName();
      if (initMethodNameValue != null) {
        initMethodName(initMethodNameValue);
      }
      implementationBytes(instance.implementationBytes());
      return this;
    }

    /**
     * Adds one element to {@link MixinType#targets() targets} list.
     * @param element A targets element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addTargets(String element) {
      this.targets.add(element);
      return this;
    }

    /**
     * Adds elements to {@link MixinType#targets() targets} list.
     * @param elements An array of targets elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addTargets(String... elements) {
      this.targets.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link MixinType#targets() targets} list.
     * @param elements An iterable of targets elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder targets(Iterable<String> elements) {
      this.targets = ImmutableList.builder();
      return addAllTargets(elements);
    }

    /**
     * Adds elements to {@link MixinType#targets() targets} list.
     * @param elements An iterable of targets elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllTargets(Iterable<String> elements) {
      this.targets.addAll(elements);
      return this;
    }

    /**
     * Adds one element to {@link MixinType#interfaces() interfaces} list.
     * @param element A interfaces element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addInterfaces(Type element) {
      this.interfaces.add(element);
      return this;
    }

    /**
     * Adds elements to {@link MixinType#interfaces() interfaces} list.
     * @param elements An array of interfaces elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addInterfaces(Type... elements) {
      this.interfaces.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link MixinType#interfaces() interfaces} list.
     * @param elements An iterable of interfaces elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder interfaces(Iterable<? extends Type> elements) {
      this.interfaces = ImmutableList.builder();
      return addAllInterfaces(elements);
    }

    /**
     * Adds elements to {@link MixinType#interfaces() interfaces} list.
     * @param elements An iterable of interfaces elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllInterfaces(Iterable<? extends Type> elements) {
      this.interfaces.addAll(elements);
      return this;
    }

    /**
     * Initializes the value for the {@link MixinType#initMethodName() initMethodName} attribute.
     * @param initMethodName The value for initMethodName (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder initMethodName(@Nullable String initMethodName) {
      this.initMethodName = initMethodName;
      return this;
    }

    /**
     * Initializes the value for the {@link MixinType#implementationBytes() implementationBytes} attribute.
     * @param implementationBytes The elements for implementationBytes
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder implementationBytes(byte... implementationBytes) {
      this.implementationBytes = implementationBytes.clone();
      initBits &= ~INIT_BIT_IMPLEMENTATION_BYTES;
      return this;
    }

    /**
     * Builds a new {@link ImmutableMixinType ImmutableMixinType}.
     * @return An immutable instance of MixinType
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableMixinType build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableMixinType(targets.build(), interfaces.build(), initMethodName, implementationBytes);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_IMPLEMENTATION_BYTES) != 0) attributes.add("implementationBytes");
      return "Cannot build MixinType, some of required attributes are not set " + attributes;
    }
  }
}
