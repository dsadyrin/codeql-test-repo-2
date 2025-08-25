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

/**
 * Immutable implementation of {@link AdviceMatcher}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAdviceMatcher.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code ImmutableAdviceMatcher.of()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "AdviceMatcher"})
@Immutable
final class ImmutableAdviceMatcher extends AdviceMatcher {
  private final Advice advice;

  private ImmutableAdviceMatcher(Advice advice) {
    this.advice = Preconditions.checkNotNull(advice, "advice");
  }

  private ImmutableAdviceMatcher(ImmutableAdviceMatcher original, Advice advice) {
    this.advice = advice;
  }

  /**
   * @return The value of the {@code advice} attribute
   */
  @JsonProperty("advice")
  @Override
  Advice advice() {
    return advice;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AdviceMatcher#advice() advice} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for advice
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAdviceMatcher withAdvice(Advice value) {
    if (this.advice == value) return this;
    Advice newValue = Preconditions.checkNotNull(value, "advice");
    return new ImmutableAdviceMatcher(this, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAdviceMatcher} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAdviceMatcher
        && equalTo((ImmutableAdviceMatcher) another);
  }

  private boolean equalTo(ImmutableAdviceMatcher another) {
    return advice.equals(another.advice);
  }

  /**
   * Computes a hash code from attributes: {@code advice}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + advice.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code AdviceMatcher} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("AdviceMatcher")
        .omitNullValues()
        .add("advice", advice)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends AdviceMatcher {
    @Nullable Advice advice;
    @JsonProperty("advice")
    public void setAdvice(Advice advice) {
      this.advice = advice;
    }
    @Override
    Advice advice() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableAdviceMatcher fromJson(Json json) {
    ImmutableAdviceMatcher.Builder builder = ImmutableAdviceMatcher.builder();
    if (json.advice != null) {
      builder.advice(json.advice);
    }
    return builder.build();
  }

  /**
   * Construct a new immutable {@code AdviceMatcher} instance.
   * @param advice The value for the {@code advice} attribute
   * @return An immutable AdviceMatcher instance
   */
  public static ImmutableAdviceMatcher of(Advice advice) {
    return new ImmutableAdviceMatcher(advice);
  }

  /**
   * Creates an immutable copy of a {@link AdviceMatcher} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable AdviceMatcher instance
   */
  public static ImmutableAdviceMatcher copyOf(AdviceMatcher instance) {
    if (instance instanceof ImmutableAdviceMatcher) {
      return (ImmutableAdviceMatcher) instance;
    }
    return ImmutableAdviceMatcher.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableAdviceMatcher ImmutableAdviceMatcher}.
   * @return A new ImmutableAdviceMatcher builder
   */
  public static ImmutableAdviceMatcher.Builder builder() {
    return new ImmutableAdviceMatcher.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableAdviceMatcher ImmutableAdviceMatcher}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_ADVICE = 0x1L;
    private long initBits = 0x1L;

    private @Nullable Advice advice;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code AdviceMatcher} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(AdviceMatcher instance) {
      Preconditions.checkNotNull(instance, "instance");
      advice(instance.advice());
      return this;
    }

    /**
     * Initializes the value for the {@link AdviceMatcher#advice() advice} attribute.
     * @param advice The value for advice 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder advice(Advice advice) {
      this.advice = Preconditions.checkNotNull(advice, "advice");
      initBits &= ~INIT_BIT_ADVICE;
      return this;
    }

    /**
     * Builds a new {@link ImmutableAdviceMatcher ImmutableAdviceMatcher}.
     * @return An immutable instance of AdviceMatcher
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableAdviceMatcher build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableAdviceMatcher(null, advice);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_ADVICE) != 0) attributes.add("advice");
      return "Cannot build AdviceMatcher, some of required attributes are not set " + attributes;
    }
  }
}
