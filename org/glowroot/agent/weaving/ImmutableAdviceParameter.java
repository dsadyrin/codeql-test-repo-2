package org.glowroot.agent.weaving;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import org.glowroot.agent.shaded.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.glowroot.agent.shaded.objectweb.asm.Type;

/**
 * Immutable implementation of {@link Advice.AdviceParameter}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAdviceParameter.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "Advice.AdviceParameter"})
@Immutable
final class ImmutableAdviceParameter implements Advice.AdviceParameter {
  private final Advice.ParameterKind kind;
  private final Type type;

  private ImmutableAdviceParameter(Advice.ParameterKind kind, Type type) {
    this.kind = kind;
    this.type = type;
  }

  /**
   * @return The value of the {@code kind} attribute
   */
  @JsonProperty("kind")
  @Override
  public Advice.ParameterKind kind() {
    return kind;
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
   * Copy the current immutable object by setting a value for the {@link Advice.AdviceParameter#kind() kind} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for kind
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAdviceParameter withKind(Advice.ParameterKind value) {
    if (this.kind == value) return this;
    Advice.ParameterKind newValue = Preconditions.checkNotNull(value, "kind");
    return new ImmutableAdviceParameter(newValue, this.type);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Advice.AdviceParameter#type() type} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for type
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAdviceParameter withType(Type value) {
    if (this.type == value) return this;
    Type newValue = Preconditions.checkNotNull(value, "type");
    return new ImmutableAdviceParameter(this.kind, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAdviceParameter} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAdviceParameter
        && equalTo((ImmutableAdviceParameter) another);
  }

  private boolean equalTo(ImmutableAdviceParameter another) {
    return kind.equals(another.kind)
        && type.equals(another.type);
  }

  /**
   * Computes a hash code from attributes: {@code kind}, {@code type}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + kind.hashCode();
    h += (h << 5) + type.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code AdviceParameter} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("AdviceParameter")
        .omitNullValues()
        .add("kind", kind)
        .add("type", type)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Advice.AdviceParameter {
    @Nullable Advice.ParameterKind kind;
    @Nullable Type type;
    @JsonProperty("kind")
    public void setKind(Advice.ParameterKind kind) {
      this.kind = kind;
    }
    @JsonProperty("type")
    public void setType(Type type) {
      this.type = type;
    }
    @Override
    public Advice.ParameterKind kind() { throw new UnsupportedOperationException(); }
    @Override
    public Type type() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableAdviceParameter fromJson(Json json) {
    ImmutableAdviceParameter.Builder builder = ImmutableAdviceParameter.builder();
    if (json.kind != null) {
      builder.kind(json.kind);
    }
    if (json.type != null) {
      builder.type(json.type);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Advice.AdviceParameter} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable AdviceParameter instance
   */
  public static ImmutableAdviceParameter copyOf(Advice.AdviceParameter instance) {
    if (instance instanceof ImmutableAdviceParameter) {
      return (ImmutableAdviceParameter) instance;
    }
    return ImmutableAdviceParameter.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableAdviceParameter ImmutableAdviceParameter}.
   * @return A new ImmutableAdviceParameter builder
   */
  public static ImmutableAdviceParameter.Builder builder() {
    return new ImmutableAdviceParameter.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableAdviceParameter ImmutableAdviceParameter}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_KIND = 0x1L;
    private static final long INIT_BIT_TYPE = 0x2L;
    private long initBits = 0x3L;

    private @Nullable Advice.ParameterKind kind;
    private @Nullable Type type;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code AdviceParameter} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(Advice.AdviceParameter instance) {
      Preconditions.checkNotNull(instance, "instance");
      kind(instance.kind());
      type(instance.type());
      return this;
    }

    /**
     * Initializes the value for the {@link Advice.AdviceParameter#kind() kind} attribute.
     * @param kind The value for kind 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder kind(Advice.ParameterKind kind) {
      this.kind = Preconditions.checkNotNull(kind, "kind");
      initBits &= ~INIT_BIT_KIND;
      return this;
    }

    /**
     * Initializes the value for the {@link Advice.AdviceParameter#type() type} attribute.
     * @param type The value for type 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder type(Type type) {
      this.type = Preconditions.checkNotNull(type, "type");
      initBits &= ~INIT_BIT_TYPE;
      return this;
    }

    /**
     * Builds a new {@link ImmutableAdviceParameter ImmutableAdviceParameter}.
     * @return An immutable instance of AdviceParameter
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableAdviceParameter build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableAdviceParameter(kind, type);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_KIND) != 0) attributes.add("kind");
      if ((initBits & INIT_BIT_TYPE) != 0) attributes.add("type");
      return "Cannot build AdviceParameter, some of required attributes are not set " + attributes;
    }
  }
}
