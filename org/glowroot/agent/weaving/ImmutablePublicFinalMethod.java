package org.glowroot.agent.weaving;

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
 * Immutable implementation of {@link PublicFinalMethod}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePublicFinalMethod.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "PublicFinalMethod"})
@Immutable
final class ImmutablePublicFinalMethod extends PublicFinalMethod {
  private final String name;
  private final ImmutableList<String> parameterTypes;

  private ImmutablePublicFinalMethod(String name, ImmutableList<String> parameterTypes) {
    this.name = name;
    this.parameterTypes = parameterTypes;
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
   * Copy the current immutable object by setting a value for the {@link PublicFinalMethod#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePublicFinalMethod withName(String value) {
    if (this.name.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "name");
    return new ImmutablePublicFinalMethod(newValue, this.parameterTypes);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link PublicFinalMethod#parameterTypes() parameterTypes}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePublicFinalMethod withParameterTypes(String... elements) {
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutablePublicFinalMethod(this.name, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link PublicFinalMethod#parameterTypes() parameterTypes}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of parameterTypes elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePublicFinalMethod withParameterTypes(Iterable<String> elements) {
    if (this.parameterTypes == elements) return this;
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutablePublicFinalMethod(this.name, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePublicFinalMethod} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePublicFinalMethod
        && equalTo((ImmutablePublicFinalMethod) another);
  }

  private boolean equalTo(ImmutablePublicFinalMethod another) {
    return name.equals(another.name)
        && parameterTypes.equals(another.parameterTypes);
  }

  /**
   * Computes a hash code from attributes: {@code name}, {@code parameterTypes}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + name.hashCode();
    h += (h << 5) + parameterTypes.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code PublicFinalMethod} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("PublicFinalMethod")
        .omitNullValues()
        .add("name", name)
        .add("parameterTypes", parameterTypes)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends PublicFinalMethod {
    @Nullable String name;
    ImmutableList<String> parameterTypes = ImmutableList.of();
    @JsonProperty("name")
    public void setName(String name) {
      this.name = name;
    }
    @JsonProperty("parameterTypes")
    public void setParameterTypes(ImmutableList<String> parameterTypes) {
      this.parameterTypes = parameterTypes;
    }
    @Override
    String name() { throw new UnsupportedOperationException(); }
    @Override
    ImmutableList<String> parameterTypes() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutablePublicFinalMethod fromJson(Json json) {
    ImmutablePublicFinalMethod.Builder builder = ImmutablePublicFinalMethod.builder();
    if (json.name != null) {
      builder.name(json.name);
    }
    if (json.parameterTypes != null) {
      builder.addAllParameterTypes(json.parameterTypes);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link PublicFinalMethod} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable PublicFinalMethod instance
   */
  public static ImmutablePublicFinalMethod copyOf(PublicFinalMethod instance) {
    if (instance instanceof ImmutablePublicFinalMethod) {
      return (ImmutablePublicFinalMethod) instance;
    }
    return ImmutablePublicFinalMethod.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutablePublicFinalMethod ImmutablePublicFinalMethod}.
   * @return A new ImmutablePublicFinalMethod builder
   */
  public static ImmutablePublicFinalMethod.Builder builder() {
    return new ImmutablePublicFinalMethod.Builder();
  }

  /**
   * Builds instances of type {@link ImmutablePublicFinalMethod ImmutablePublicFinalMethod}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_NAME = 0x1L;
    private long initBits = 0x1L;

    private @Nullable String name;
    private ImmutableList.Builder<String> parameterTypes = ImmutableList.builder();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code PublicFinalMethod} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(PublicFinalMethod instance) {
      Preconditions.checkNotNull(instance, "instance");
      name(instance.name());
      addAllParameterTypes(instance.parameterTypes());
      return this;
    }

    /**
     * Initializes the value for the {@link PublicFinalMethod#name() name} attribute.
     * @param name The value for name 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder name(String name) {
      this.name = Preconditions.checkNotNull(name, "name");
      initBits &= ~INIT_BIT_NAME;
      return this;
    }

    /**
     * Adds one element to {@link PublicFinalMethod#parameterTypes() parameterTypes} list.
     * @param element A parameterTypes element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addParameterTypes(String element) {
      this.parameterTypes.add(element);
      return this;
    }

    /**
     * Adds elements to {@link PublicFinalMethod#parameterTypes() parameterTypes} list.
     * @param elements An array of parameterTypes elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addParameterTypes(String... elements) {
      this.parameterTypes.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link PublicFinalMethod#parameterTypes() parameterTypes} list.
     * @param elements An iterable of parameterTypes elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder parameterTypes(Iterable<String> elements) {
      this.parameterTypes = ImmutableList.builder();
      return addAllParameterTypes(elements);
    }

    /**
     * Adds elements to {@link PublicFinalMethod#parameterTypes() parameterTypes} list.
     * @param elements An iterable of parameterTypes elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllParameterTypes(Iterable<String> elements) {
      this.parameterTypes.addAll(elements);
      return this;
    }

    /**
     * Builds a new {@link ImmutablePublicFinalMethod ImmutablePublicFinalMethod}.
     * @return An immutable instance of PublicFinalMethod
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutablePublicFinalMethod build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutablePublicFinalMethod(name, parameterTypes.build());
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      return "Cannot build PublicFinalMethod, some of required attributes are not set " + attributes;
    }
  }
}
