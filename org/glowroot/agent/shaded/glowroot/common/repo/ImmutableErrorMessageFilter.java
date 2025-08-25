package org.glowroot.agent.shaded.glowroot.common.repo;

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
 * Immutable implementation of {@link TraceRepository.ErrorMessageFilter}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableErrorMessageFilter.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "TraceRepository.ErrorMessageFilter"})
@Immutable
public final class ImmutableErrorMessageFilter
    implements TraceRepository.ErrorMessageFilter {
  private final ImmutableList<String> includes;
  private final ImmutableList<String> excludes;

  private ImmutableErrorMessageFilter(
      ImmutableList<String> includes,
      ImmutableList<String> excludes) {
    this.includes = includes;
    this.excludes = excludes;
  }

  /**
   * @return The value of the {@code includes} attribute
   */
  @JsonProperty("includes")
  @Override
  public ImmutableList<String> includes() {
    return includes;
  }

  /**
   * @return The value of the {@code excludes} attribute
   */
  @JsonProperty("excludes")
  @Override
  public ImmutableList<String> excludes() {
    return excludes;
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link TraceRepository.ErrorMessageFilter#includes() includes}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableErrorMessageFilter withIncludes(String... elements) {
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableErrorMessageFilter(newValue, this.excludes);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link TraceRepository.ErrorMessageFilter#includes() includes}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of includes elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableErrorMessageFilter withIncludes(Iterable<String> elements) {
    if (this.includes == elements) return this;
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableErrorMessageFilter(newValue, this.excludes);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link TraceRepository.ErrorMessageFilter#excludes() excludes}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableErrorMessageFilter withExcludes(String... elements) {
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableErrorMessageFilter(this.includes, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link TraceRepository.ErrorMessageFilter#excludes() excludes}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of excludes elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableErrorMessageFilter withExcludes(Iterable<String> elements) {
    if (this.excludes == elements) return this;
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableErrorMessageFilter(this.includes, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableErrorMessageFilter} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableErrorMessageFilter
        && equalTo((ImmutableErrorMessageFilter) another);
  }

  private boolean equalTo(ImmutableErrorMessageFilter another) {
    return includes.equals(another.includes)
        && excludes.equals(another.excludes);
  }

  /**
   * Computes a hash code from attributes: {@code includes}, {@code excludes}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + includes.hashCode();
    h += (h << 5) + excludes.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code ErrorMessageFilter} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("ErrorMessageFilter")
        .omitNullValues()
        .add("includes", includes)
        .add("excludes", excludes)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements TraceRepository.ErrorMessageFilter {
    ImmutableList<String> includes = ImmutableList.of();
    ImmutableList<String> excludes = ImmutableList.of();
    @JsonProperty("includes")
    public void setIncludes(ImmutableList<String> includes) {
      this.includes = includes;
    }
    @JsonProperty("excludes")
    public void setExcludes(ImmutableList<String> excludes) {
      this.excludes = excludes;
    }
    @Override
    public ImmutableList<String> includes() { throw new UnsupportedOperationException(); }
    @Override
    public ImmutableList<String> excludes() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableErrorMessageFilter fromJson(Json json) {
    ImmutableErrorMessageFilter.Builder builder = ImmutableErrorMessageFilter.builder();
    if (json.includes != null) {
      builder.addAllIncludes(json.includes);
    }
    if (json.excludes != null) {
      builder.addAllExcludes(json.excludes);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link TraceRepository.ErrorMessageFilter} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ErrorMessageFilter instance
   */
  public static ImmutableErrorMessageFilter copyOf(TraceRepository.ErrorMessageFilter instance) {
    if (instance instanceof ImmutableErrorMessageFilter) {
      return (ImmutableErrorMessageFilter) instance;
    }
    return ImmutableErrorMessageFilter.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableErrorMessageFilter ImmutableErrorMessageFilter}.
   * @return A new ImmutableErrorMessageFilter builder
   */
  public static ImmutableErrorMessageFilter.Builder builder() {
    return new ImmutableErrorMessageFilter.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableErrorMessageFilter ImmutableErrorMessageFilter}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private ImmutableList.Builder<String> includes = ImmutableList.builder();
    private ImmutableList.Builder<String> excludes = ImmutableList.builder();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code ErrorMessageFilter} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(TraceRepository.ErrorMessageFilter instance) {
      Preconditions.checkNotNull(instance, "instance");
      addAllIncludes(instance.includes());
      addAllExcludes(instance.excludes());
      return this;
    }

    /**
     * Adds one element to {@link TraceRepository.ErrorMessageFilter#includes() includes} list.
     * @param element A includes element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addIncludes(String element) {
      this.includes.add(element);
      return this;
    }

    /**
     * Adds elements to {@link TraceRepository.ErrorMessageFilter#includes() includes} list.
     * @param elements An array of includes elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addIncludes(String... elements) {
      this.includes.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link TraceRepository.ErrorMessageFilter#includes() includes} list.
     * @param elements An iterable of includes elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder includes(Iterable<String> elements) {
      this.includes = ImmutableList.builder();
      return addAllIncludes(elements);
    }

    /**
     * Adds elements to {@link TraceRepository.ErrorMessageFilter#includes() includes} list.
     * @param elements An iterable of includes elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllIncludes(Iterable<String> elements) {
      this.includes.addAll(elements);
      return this;
    }

    /**
     * Adds one element to {@link TraceRepository.ErrorMessageFilter#excludes() excludes} list.
     * @param element A excludes element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addExcludes(String element) {
      this.excludes.add(element);
      return this;
    }

    /**
     * Adds elements to {@link TraceRepository.ErrorMessageFilter#excludes() excludes} list.
     * @param elements An array of excludes elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addExcludes(String... elements) {
      this.excludes.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link TraceRepository.ErrorMessageFilter#excludes() excludes} list.
     * @param elements An iterable of excludes elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder excludes(Iterable<String> elements) {
      this.excludes = ImmutableList.builder();
      return addAllExcludes(elements);
    }

    /**
     * Adds elements to {@link TraceRepository.ErrorMessageFilter#excludes() excludes} list.
     * @param elements An iterable of excludes elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllExcludes(Iterable<String> elements) {
      this.excludes.addAll(elements);
      return this;
    }

    /**
     * Builds a new {@link ImmutableErrorMessageFilter ImmutableErrorMessageFilter}.
     * @return An immutable instance of ErrorMessageFilter
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableErrorMessageFilter build() {
      return new ImmutableErrorMessageFilter(includes.build(), excludes.build());
    }
  }
}
