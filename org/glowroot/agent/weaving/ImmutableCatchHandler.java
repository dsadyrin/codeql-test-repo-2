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
import org.glowroot.agent.shaded.objectweb.asm.Label;

/**
 * Immutable implementation of {@link WeavingMethodVisitor.CatchHandler}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCatchHandler.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code ImmutableCatchHandler.of()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "WeavingMethodVisitor.CatchHandler"})
@Immutable
final class ImmutableCatchHandler
    implements WeavingMethodVisitor.CatchHandler {
  private final Label catchStartLabel;
  private final ImmutableList<Advice> advisors;

  private ImmutableCatchHandler(
      Label catchStartLabel,
      Iterable<? extends Advice> advisors) {
    this.catchStartLabel = Preconditions.checkNotNull(catchStartLabel, "catchStartLabel");
    this.advisors = ImmutableList.copyOf(advisors);
  }

  private ImmutableCatchHandler(
      ImmutableCatchHandler original,
      Label catchStartLabel,
      ImmutableList<Advice> advisors) {
    this.catchStartLabel = catchStartLabel;
    this.advisors = advisors;
  }

  /**
   * @return The value of the {@code catchStartLabel} attribute
   */
  @JsonProperty("catchStartLabel")
  @Override
  public Label catchStartLabel() {
    return catchStartLabel;
  }

  /**
   * @return The value of the {@code advisors} attribute
   */
  @JsonProperty("advisors")
  @Override
  public ImmutableList<Advice> advisors() {
    return advisors;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link WeavingMethodVisitor.CatchHandler#catchStartLabel() catchStartLabel} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for catchStartLabel
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCatchHandler withCatchStartLabel(Label value) {
    if (this.catchStartLabel == value) return this;
    Label newValue = Preconditions.checkNotNull(value, "catchStartLabel");
    return new ImmutableCatchHandler(this, newValue, this.advisors);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link WeavingMethodVisitor.CatchHandler#advisors() advisors}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCatchHandler withAdvisors(Advice... elements) {
    ImmutableList<Advice> newValue = ImmutableList.copyOf(elements);
    return new ImmutableCatchHandler(this, this.catchStartLabel, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link WeavingMethodVisitor.CatchHandler#advisors() advisors}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of advisors elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCatchHandler withAdvisors(Iterable<? extends Advice> elements) {
    if (this.advisors == elements) return this;
    ImmutableList<Advice> newValue = ImmutableList.copyOf(elements);
    return new ImmutableCatchHandler(this, this.catchStartLabel, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCatchHandler} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCatchHandler
        && equalTo((ImmutableCatchHandler) another);
  }

  private boolean equalTo(ImmutableCatchHandler another) {
    return catchStartLabel.equals(another.catchStartLabel)
        && advisors.equals(another.advisors);
  }

  /**
   * Computes a hash code from attributes: {@code catchStartLabel}, {@code advisors}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + catchStartLabel.hashCode();
    h += (h << 5) + advisors.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code CatchHandler} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("CatchHandler")
        .omitNullValues()
        .add("catchStartLabel", catchStartLabel)
        .add("advisors", advisors)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements WeavingMethodVisitor.CatchHandler {
    @Nullable Label catchStartLabel;
    List<Advice> advisors = ImmutableList.of();
    @JsonProperty("catchStartLabel")
    public void setCatchStartLabel(Label catchStartLabel) {
      this.catchStartLabel = catchStartLabel;
    }
    @JsonProperty("advisors")
    public void setAdvisors(List<Advice> advisors) {
      this.advisors = advisors;
    }
    @Override
    public Label catchStartLabel() { throw new UnsupportedOperationException(); }
    @Override
    public List<Advice> advisors() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableCatchHandler fromJson(Json json) {
    ImmutableCatchHandler.Builder builder = ImmutableCatchHandler.builder();
    if (json.catchStartLabel != null) {
      builder.catchStartLabel(json.catchStartLabel);
    }
    if (json.advisors != null) {
      builder.addAllAdvisors(json.advisors);
    }
    return builder.build();
  }

  /**
   * Construct a new immutable {@code CatchHandler} instance.
   * @param catchStartLabel The value for the {@code catchStartLabel} attribute
   * @param advisors The value for the {@code advisors} attribute
   * @return An immutable CatchHandler instance
   */
  public static ImmutableCatchHandler of(Label catchStartLabel, List<Advice> advisors) {
    return of(catchStartLabel, (Iterable<? extends Advice>) advisors);
  }

  /**
   * Construct a new immutable {@code CatchHandler} instance.
   * @param catchStartLabel The value for the {@code catchStartLabel} attribute
   * @param advisors The value for the {@code advisors} attribute
   * @return An immutable CatchHandler instance
   */
  public static ImmutableCatchHandler of(Label catchStartLabel, Iterable<? extends Advice> advisors) {
    return new ImmutableCatchHandler(catchStartLabel, advisors);
  }

  /**
   * Creates an immutable copy of a {@link WeavingMethodVisitor.CatchHandler} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable CatchHandler instance
   */
  public static ImmutableCatchHandler copyOf(WeavingMethodVisitor.CatchHandler instance) {
    if (instance instanceof ImmutableCatchHandler) {
      return (ImmutableCatchHandler) instance;
    }
    return ImmutableCatchHandler.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableCatchHandler ImmutableCatchHandler}.
   * @return A new ImmutableCatchHandler builder
   */
  public static ImmutableCatchHandler.Builder builder() {
    return new ImmutableCatchHandler.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableCatchHandler ImmutableCatchHandler}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_CATCH_START_LABEL = 0x1L;
    private long initBits = 0x1L;

    private @Nullable Label catchStartLabel;
    private ImmutableList.Builder<Advice> advisors = ImmutableList.builder();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code CatchHandler} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(WeavingMethodVisitor.CatchHandler instance) {
      Preconditions.checkNotNull(instance, "instance");
      catchStartLabel(instance.catchStartLabel());
      addAllAdvisors(instance.advisors());
      return this;
    }

    /**
     * Initializes the value for the {@link WeavingMethodVisitor.CatchHandler#catchStartLabel() catchStartLabel} attribute.
     * @param catchStartLabel The value for catchStartLabel 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder catchStartLabel(Label catchStartLabel) {
      this.catchStartLabel = Preconditions.checkNotNull(catchStartLabel, "catchStartLabel");
      initBits &= ~INIT_BIT_CATCH_START_LABEL;
      return this;
    }

    /**
     * Adds one element to {@link WeavingMethodVisitor.CatchHandler#advisors() advisors} list.
     * @param element A advisors element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAdvisors(Advice element) {
      this.advisors.add(element);
      return this;
    }

    /**
     * Adds elements to {@link WeavingMethodVisitor.CatchHandler#advisors() advisors} list.
     * @param elements An array of advisors elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAdvisors(Advice... elements) {
      this.advisors.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link WeavingMethodVisitor.CatchHandler#advisors() advisors} list.
     * @param elements An iterable of advisors elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder advisors(Iterable<? extends Advice> elements) {
      this.advisors = ImmutableList.builder();
      return addAllAdvisors(elements);
    }

    /**
     * Adds elements to {@link WeavingMethodVisitor.CatchHandler#advisors() advisors} list.
     * @param elements An iterable of advisors elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllAdvisors(Iterable<? extends Advice> elements) {
      this.advisors.addAll(elements);
      return this;
    }

    /**
     * Builds a new {@link ImmutableCatchHandler ImmutableCatchHandler}.
     * @return An immutable instance of CatchHandler
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableCatchHandler build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableCatchHandler(null, catchStartLabel, advisors.build());
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_CATCH_START_LABEL) != 0) attributes.add("catchStartLabel");
      return "Cannot build CatchHandler, some of required attributes are not set " + attributes;
    }
  }
}
