package org.glowroot.agent.shaded.glowroot.ui;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import org.glowroot.agent.shaded.google.common.collect.ImmutableList;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link InstrumentationConfigJsonService.InstrumentationErrorResponse}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableInstrumentationErrorResponse.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "InstrumentationConfigJsonService.InstrumentationErrorResponse"})
@Immutable
final class ImmutableInstrumentationErrorResponse
    implements InstrumentationConfigJsonService.InstrumentationErrorResponse {
  private final ImmutableList<String> errors;

  private ImmutableInstrumentationErrorResponse(ImmutableList<String> errors) {
    this.errors = errors;
  }

  /**
   * @return The value of the {@code errors} attribute
   */
  @JsonProperty("errors")
  @Override
  public ImmutableList<String> errors() {
    return errors;
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link InstrumentationConfigJsonService.InstrumentationErrorResponse#errors() errors}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInstrumentationErrorResponse withErrors(String... elements) {
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableInstrumentationErrorResponse(newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link InstrumentationConfigJsonService.InstrumentationErrorResponse#errors() errors}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of errors elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInstrumentationErrorResponse withErrors(Iterable<String> elements) {
    if (this.errors == elements) return this;
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableInstrumentationErrorResponse(newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableInstrumentationErrorResponse} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableInstrumentationErrorResponse
        && equalTo((ImmutableInstrumentationErrorResponse) another);
  }

  private boolean equalTo(ImmutableInstrumentationErrorResponse another) {
    return errors.equals(another.errors);
  }

  /**
   * Computes a hash code from attributes: {@code errors}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + errors.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code InstrumentationErrorResponse} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("InstrumentationErrorResponse")
        .omitNullValues()
        .add("errors", errors)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json
      implements InstrumentationConfigJsonService.InstrumentationErrorResponse {
    ImmutableList<String> errors = ImmutableList.of();
    @JsonProperty("errors")
    public void setErrors(ImmutableList<String> errors) {
      this.errors = errors;
    }
    @Override
    public ImmutableList<String> errors() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableInstrumentationErrorResponse fromJson(Json json) {
    ImmutableInstrumentationErrorResponse.Builder builder = ImmutableInstrumentationErrorResponse.builder();
    if (json.errors != null) {
      builder.addAllErrors(json.errors);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link InstrumentationConfigJsonService.InstrumentationErrorResponse} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable InstrumentationErrorResponse instance
   */
  public static ImmutableInstrumentationErrorResponse copyOf(InstrumentationConfigJsonService.InstrumentationErrorResponse instance) {
    if (instance instanceof ImmutableInstrumentationErrorResponse) {
      return (ImmutableInstrumentationErrorResponse) instance;
    }
    return ImmutableInstrumentationErrorResponse.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableInstrumentationErrorResponse ImmutableInstrumentationErrorResponse}.
   * @return A new ImmutableInstrumentationErrorResponse builder
   */
  public static ImmutableInstrumentationErrorResponse.Builder builder() {
    return new ImmutableInstrumentationErrorResponse.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableInstrumentationErrorResponse ImmutableInstrumentationErrorResponse}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private ImmutableList.Builder<String> errors = ImmutableList.builder();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code InstrumentationErrorResponse} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(InstrumentationConfigJsonService.InstrumentationErrorResponse instance) {
      Preconditions.checkNotNull(instance, "instance");
      addAllErrors(instance.errors());
      return this;
    }

    /**
     * Adds one element to {@link InstrumentationConfigJsonService.InstrumentationErrorResponse#errors() errors} list.
     * @param element A errors element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addErrors(String element) {
      this.errors.add(element);
      return this;
    }

    /**
     * Adds elements to {@link InstrumentationConfigJsonService.InstrumentationErrorResponse#errors() errors} list.
     * @param elements An array of errors elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addErrors(String... elements) {
      this.errors.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link InstrumentationConfigJsonService.InstrumentationErrorResponse#errors() errors} list.
     * @param elements An iterable of errors elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder errors(Iterable<String> elements) {
      this.errors = ImmutableList.builder();
      return addAllErrors(elements);
    }

    /**
     * Adds elements to {@link InstrumentationConfigJsonService.InstrumentationErrorResponse#errors() errors} list.
     * @param elements An iterable of errors elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllErrors(Iterable<String> elements) {
      this.errors.addAll(elements);
      return this;
    }

    /**
     * Builds a new {@link ImmutableInstrumentationErrorResponse ImmutableInstrumentationErrorResponse}.
     * @return An immutable instance of InstrumentationErrorResponse
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableInstrumentationErrorResponse build() {
      return new ImmutableInstrumentationErrorResponse(errors.build());
    }
  }
}
