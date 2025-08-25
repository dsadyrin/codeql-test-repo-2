package org.glowroot.agent.shaded.glowroot.common.repo;

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
import org.glowroot.agent.shaded.glowroot.common.model.Result;

/**
 * Immutable implementation of {@link TraceRepository.ErrorMessageResult}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableErrorMessageResult.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "TraceRepository.ErrorMessageResult"})
@Immutable
public final class ImmutableErrorMessageResult
    implements TraceRepository.ErrorMessageResult {
  private final ImmutableList<TraceRepository.ErrorMessagePoint> points;
  private final Result<TraceRepository.ErrorMessageCount> counts;

  private ImmutableErrorMessageResult(
      ImmutableList<TraceRepository.ErrorMessagePoint> points,
      Result<TraceRepository.ErrorMessageCount> counts) {
    this.points = points;
    this.counts = counts;
  }

  /**
   * @return The value of the {@code points} attribute
   */
  @JsonProperty("points")
  @Override
  public ImmutableList<TraceRepository.ErrorMessagePoint> points() {
    return points;
  }

  /**
   * @return The value of the {@code counts} attribute
   */
  @JsonProperty("counts")
  @Override
  public Result<TraceRepository.ErrorMessageCount> counts() {
    return counts;
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link TraceRepository.ErrorMessageResult#points() points}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableErrorMessageResult withPoints(TraceRepository.ErrorMessagePoint... elements) {
    ImmutableList<TraceRepository.ErrorMessagePoint> newValue = ImmutableList.copyOf(elements);
    return new ImmutableErrorMessageResult(newValue, this.counts);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link TraceRepository.ErrorMessageResult#points() points}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of points elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableErrorMessageResult withPoints(Iterable<? extends TraceRepository.ErrorMessagePoint> elements) {
    if (this.points == elements) return this;
    ImmutableList<TraceRepository.ErrorMessagePoint> newValue = ImmutableList.copyOf(elements);
    return new ImmutableErrorMessageResult(newValue, this.counts);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TraceRepository.ErrorMessageResult#counts() counts} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for counts
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableErrorMessageResult withCounts(Result<TraceRepository.ErrorMessageCount> value) {
    if (this.counts == value) return this;
    Result<TraceRepository.ErrorMessageCount> newValue = Preconditions.checkNotNull(value, "counts");
    return new ImmutableErrorMessageResult(this.points, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableErrorMessageResult} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableErrorMessageResult
        && equalTo((ImmutableErrorMessageResult) another);
  }

  private boolean equalTo(ImmutableErrorMessageResult another) {
    return points.equals(another.points)
        && counts.equals(another.counts);
  }

  /**
   * Computes a hash code from attributes: {@code points}, {@code counts}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + points.hashCode();
    h += (h << 5) + counts.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code ErrorMessageResult} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("ErrorMessageResult")
        .omitNullValues()
        .add("points", points)
        .add("counts", counts)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements TraceRepository.ErrorMessageResult {
    List<TraceRepository.ErrorMessagePoint> points = ImmutableList.of();
    @Nullable Result<TraceRepository.ErrorMessageCount> counts;
    @JsonProperty("points")
    public void setPoints(List<TraceRepository.ErrorMessagePoint> points) {
      this.points = points;
    }
    @JsonProperty("counts")
    public void setCounts(Result<TraceRepository.ErrorMessageCount> counts) {
      this.counts = counts;
    }
    @Override
    public List<TraceRepository.ErrorMessagePoint> points() { throw new UnsupportedOperationException(); }
    @Override
    public Result<TraceRepository.ErrorMessageCount> counts() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableErrorMessageResult fromJson(Json json) {
    ImmutableErrorMessageResult.Builder builder = ImmutableErrorMessageResult.builder();
    if (json.points != null) {
      builder.addAllPoints(json.points);
    }
    if (json.counts != null) {
      builder.counts(json.counts);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link TraceRepository.ErrorMessageResult} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ErrorMessageResult instance
   */
  public static ImmutableErrorMessageResult copyOf(TraceRepository.ErrorMessageResult instance) {
    if (instance instanceof ImmutableErrorMessageResult) {
      return (ImmutableErrorMessageResult) instance;
    }
    return ImmutableErrorMessageResult.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableErrorMessageResult ImmutableErrorMessageResult}.
   * @return A new ImmutableErrorMessageResult builder
   */
  public static ImmutableErrorMessageResult.Builder builder() {
    return new ImmutableErrorMessageResult.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableErrorMessageResult ImmutableErrorMessageResult}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_COUNTS = 0x1L;
    private long initBits = 0x1L;

    private ImmutableList.Builder<TraceRepository.ErrorMessagePoint> points = ImmutableList.builder();
    private @Nullable Result<TraceRepository.ErrorMessageCount> counts;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code ErrorMessageResult} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(TraceRepository.ErrorMessageResult instance) {
      Preconditions.checkNotNull(instance, "instance");
      addAllPoints(instance.points());
      counts(instance.counts());
      return this;
    }

    /**
     * Adds one element to {@link TraceRepository.ErrorMessageResult#points() points} list.
     * @param element A points element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addPoints(TraceRepository.ErrorMessagePoint element) {
      this.points.add(element);
      return this;
    }

    /**
     * Adds elements to {@link TraceRepository.ErrorMessageResult#points() points} list.
     * @param elements An array of points elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addPoints(TraceRepository.ErrorMessagePoint... elements) {
      this.points.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link TraceRepository.ErrorMessageResult#points() points} list.
     * @param elements An iterable of points elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder points(Iterable<? extends TraceRepository.ErrorMessagePoint> elements) {
      this.points = ImmutableList.builder();
      return addAllPoints(elements);
    }

    /**
     * Adds elements to {@link TraceRepository.ErrorMessageResult#points() points} list.
     * @param elements An iterable of points elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllPoints(Iterable<? extends TraceRepository.ErrorMessagePoint> elements) {
      this.points.addAll(elements);
      return this;
    }

    /**
     * Initializes the value for the {@link TraceRepository.ErrorMessageResult#counts() counts} attribute.
     * @param counts The value for counts 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder counts(Result<TraceRepository.ErrorMessageCount> counts) {
      this.counts = Preconditions.checkNotNull(counts, "counts");
      initBits &= ~INIT_BIT_COUNTS;
      return this;
    }

    /**
     * Builds a new {@link ImmutableErrorMessageResult ImmutableErrorMessageResult}.
     * @return An immutable instance of ErrorMessageResult
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableErrorMessageResult build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableErrorMessageResult(points.build(), counts);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_COUNTS) != 0) attributes.add("counts");
      return "Cannot build ErrorMessageResult, some of required attributes are not set " + attributes;
    }
  }
}
