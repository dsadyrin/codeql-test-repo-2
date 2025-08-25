package org.glowroot.agent.weaving;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import org.glowroot.agent.shaded.google.common.collect.ImmutableList;
import org.glowroot.agent.shaded.google.common.collect.Lists;
import java.lang.reflect.Method;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.glowroot.agent.shaded.objectweb.asm.Type;

/**
 * Immutable implementation of {@link ShimType}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableShimType.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "ShimType"})
@Immutable
final class ImmutableShimType extends ShimType {
  private final Type iface;
  private final ImmutableList<String> targets;
  private final ImmutableList<Method> shimMethods;

  private ImmutableShimType(
      Type iface,
      ImmutableList<String> targets,
      ImmutableList<Method> shimMethods) {
    this.iface = iface;
    this.targets = targets;
    this.shimMethods = shimMethods;
  }

  /**
   * @return The value of the {@code iface} attribute
   */
  @JsonProperty("iface")
  @Override
  Type iface() {
    return iface;
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
   * @return The value of the {@code shimMethods} attribute
   */
  @JsonProperty("shimMethods")
  @Override
  ImmutableList<Method> shimMethods() {
    return shimMethods;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ShimType#iface() iface} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for iface
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableShimType withIface(Type value) {
    if (this.iface == value) return this;
    Type newValue = Preconditions.checkNotNull(value, "iface");
    return new ImmutableShimType(newValue, this.targets, this.shimMethods);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ShimType#targets() targets}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableShimType withTargets(String... elements) {
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableShimType(this.iface, newValue, this.shimMethods);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ShimType#targets() targets}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of targets elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableShimType withTargets(Iterable<String> elements) {
    if (this.targets == elements) return this;
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableShimType(this.iface, newValue, this.shimMethods);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ShimType#shimMethods() shimMethods}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableShimType withShimMethods(Method... elements) {
    ImmutableList<Method> newValue = ImmutableList.copyOf(elements);
    return new ImmutableShimType(this.iface, this.targets, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ShimType#shimMethods() shimMethods}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of shimMethods elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableShimType withShimMethods(Iterable<? extends Method> elements) {
    if (this.shimMethods == elements) return this;
    ImmutableList<Method> newValue = ImmutableList.copyOf(elements);
    return new ImmutableShimType(this.iface, this.targets, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableShimType} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableShimType
        && equalTo((ImmutableShimType) another);
  }

  private boolean equalTo(ImmutableShimType another) {
    return iface.equals(another.iface)
        && targets.equals(another.targets)
        && shimMethods.equals(another.shimMethods);
  }

  /**
   * Computes a hash code from attributes: {@code iface}, {@code targets}, {@code shimMethods}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + iface.hashCode();
    h += (h << 5) + targets.hashCode();
    h += (h << 5) + shimMethods.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code ShimType} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("ShimType")
        .omitNullValues()
        .add("iface", iface)
        .add("targets", targets)
        .add("shimMethods", shimMethods)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends ShimType {
    @Nullable Type iface;
    ImmutableList<String> targets = ImmutableList.of();
    ImmutableList<Method> shimMethods = ImmutableList.of();
    @JsonProperty("iface")
    public void setIface(Type iface) {
      this.iface = iface;
    }
    @JsonProperty("targets")
    public void setTargets(ImmutableList<String> targets) {
      this.targets = targets;
    }
    @JsonProperty("shimMethods")
    public void setShimMethods(ImmutableList<Method> shimMethods) {
      this.shimMethods = shimMethods;
    }
    @Override
    Type iface() { throw new UnsupportedOperationException(); }
    @Override
    ImmutableList<String> targets() { throw new UnsupportedOperationException(); }
    @Override
    ImmutableList<Method> shimMethods() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableShimType fromJson(Json json) {
    ImmutableShimType.Builder builder = ImmutableShimType.builder();
    if (json.iface != null) {
      builder.iface(json.iface);
    }
    if (json.targets != null) {
      builder.addAllTargets(json.targets);
    }
    if (json.shimMethods != null) {
      builder.addAllShimMethods(json.shimMethods);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ShimType} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ShimType instance
   */
  public static ImmutableShimType copyOf(ShimType instance) {
    if (instance instanceof ImmutableShimType) {
      return (ImmutableShimType) instance;
    }
    return ImmutableShimType.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableShimType ImmutableShimType}.
   * @return A new ImmutableShimType builder
   */
  public static ImmutableShimType.Builder builder() {
    return new ImmutableShimType.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableShimType ImmutableShimType}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_IFACE = 0x1L;
    private long initBits = 0x1L;

    private @Nullable Type iface;
    private ImmutableList.Builder<String> targets = ImmutableList.builder();
    private ImmutableList.Builder<Method> shimMethods = ImmutableList.builder();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code ShimType} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(ShimType instance) {
      Preconditions.checkNotNull(instance, "instance");
      iface(instance.iface());
      addAllTargets(instance.targets());
      addAllShimMethods(instance.shimMethods());
      return this;
    }

    /**
     * Initializes the value for the {@link ShimType#iface() iface} attribute.
     * @param iface The value for iface 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder iface(Type iface) {
      this.iface = Preconditions.checkNotNull(iface, "iface");
      initBits &= ~INIT_BIT_IFACE;
      return this;
    }

    /**
     * Adds one element to {@link ShimType#targets() targets} list.
     * @param element A targets element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addTargets(String element) {
      this.targets.add(element);
      return this;
    }

    /**
     * Adds elements to {@link ShimType#targets() targets} list.
     * @param elements An array of targets elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addTargets(String... elements) {
      this.targets.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link ShimType#targets() targets} list.
     * @param elements An iterable of targets elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder targets(Iterable<String> elements) {
      this.targets = ImmutableList.builder();
      return addAllTargets(elements);
    }

    /**
     * Adds elements to {@link ShimType#targets() targets} list.
     * @param elements An iterable of targets elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllTargets(Iterable<String> elements) {
      this.targets.addAll(elements);
      return this;
    }

    /**
     * Adds one element to {@link ShimType#shimMethods() shimMethods} list.
     * @param element A shimMethods element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addShimMethods(Method element) {
      this.shimMethods.add(element);
      return this;
    }

    /**
     * Adds elements to {@link ShimType#shimMethods() shimMethods} list.
     * @param elements An array of shimMethods elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addShimMethods(Method... elements) {
      this.shimMethods.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link ShimType#shimMethods() shimMethods} list.
     * @param elements An iterable of shimMethods elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder shimMethods(Iterable<? extends Method> elements) {
      this.shimMethods = ImmutableList.builder();
      return addAllShimMethods(elements);
    }

    /**
     * Adds elements to {@link ShimType#shimMethods() shimMethods} list.
     * @param elements An iterable of shimMethods elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllShimMethods(Iterable<? extends Method> elements) {
      this.shimMethods.addAll(elements);
      return this;
    }

    /**
     * Builds a new {@link ImmutableShimType ImmutableShimType}.
     * @return An immutable instance of ShimType
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableShimType build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableShimType(iface, targets.build(), shimMethods.build());
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_IFACE) != 0) attributes.add("iface");
      return "Cannot build ShimType, some of required attributes are not set " + attributes;
    }
  }
}
