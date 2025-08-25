package org.glowroot.agent.shaded.glowroot.ui;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Objects;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import org.glowroot.agent.shaded.google.common.collect.ImmutableList;
import org.glowroot.agent.shaded.google.common.collect.Lists;
import org.glowroot.agent.shaded.google.common.primitives.Longs;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.glowroot.agent.shaded.glowroot.common.repo.MutableThreadStats;
import org.glowroot.agent.shaded.glowroot.common.repo.MutableTimer;

/**
 * Immutable implementation of {@link AggregateMerging.MergedAggregate}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMergedAggregate.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "AggregateMerging.MergedAggregate"})
@Immutable
final class ImmutableMergedAggregate implements AggregateMerging.MergedAggregate {
  private final long transactionCount;
  private final ImmutableList<MutableTimer> mainThreadRootTimers;
  private final ImmutableList<MutableTimer> auxThreadRootTimers;
  private final ImmutableList<MutableTimer> asyncTimers;
  private final @Nullable MutableThreadStats mainThreadStats;
  private final @Nullable MutableThreadStats auxThreadStats;

  private ImmutableMergedAggregate(
      long transactionCount,
      ImmutableList<MutableTimer> mainThreadRootTimers,
      ImmutableList<MutableTimer> auxThreadRootTimers,
      ImmutableList<MutableTimer> asyncTimers,
      @Nullable MutableThreadStats mainThreadStats,
      @Nullable MutableThreadStats auxThreadStats) {
    this.transactionCount = transactionCount;
    this.mainThreadRootTimers = mainThreadRootTimers;
    this.auxThreadRootTimers = auxThreadRootTimers;
    this.asyncTimers = asyncTimers;
    this.mainThreadStats = mainThreadStats;
    this.auxThreadStats = auxThreadStats;
  }

  /**
   * @return The value of the {@code transactionCount} attribute
   */
  @JsonProperty("transactionCount")
  @Override
  public long transactionCount() {
    return transactionCount;
  }

  /**
   * @return The value of the {@code mainThreadRootTimers} attribute
   */
  @JsonProperty("mainThreadRootTimers")
  @Override
  public ImmutableList<MutableTimer> mainThreadRootTimers() {
    return mainThreadRootTimers;
  }

  /**
   * @return The value of the {@code auxThreadRootTimers} attribute
   */
  @JsonProperty("auxThreadRootTimers")
  @Override
  public ImmutableList<MutableTimer> auxThreadRootTimers() {
    return auxThreadRootTimers;
  }

  /**
   * @return The value of the {@code asyncTimers} attribute
   */
  @JsonProperty("asyncTimers")
  @Override
  public ImmutableList<MutableTimer> asyncTimers() {
    return asyncTimers;
  }

  /**
   * @return The value of the {@code mainThreadStats} attribute
   */
  @JsonProperty("mainThreadStats")
  @Override
  public @Nullable MutableThreadStats mainThreadStats() {
    return mainThreadStats;
  }

  /**
   * @return The value of the {@code auxThreadStats} attribute
   */
  @JsonProperty("auxThreadStats")
  @Override
  public @Nullable MutableThreadStats auxThreadStats() {
    return auxThreadStats;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AggregateMerging.MergedAggregate#transactionCount() transactionCount} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for transactionCount
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMergedAggregate withTransactionCount(long value) {
    if (this.transactionCount == value) return this;
    return new ImmutableMergedAggregate(
        value,
        this.mainThreadRootTimers,
        this.auxThreadRootTimers,
        this.asyncTimers,
        this.mainThreadStats,
        this.auxThreadStats);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link AggregateMerging.MergedAggregate#mainThreadRootTimers() mainThreadRootTimers}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMergedAggregate withMainThreadRootTimers(MutableTimer... elements) {
    ImmutableList<MutableTimer> newValue = ImmutableList.copyOf(elements);
    return new ImmutableMergedAggregate(
        this.transactionCount,
        newValue,
        this.auxThreadRootTimers,
        this.asyncTimers,
        this.mainThreadStats,
        this.auxThreadStats);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link AggregateMerging.MergedAggregate#mainThreadRootTimers() mainThreadRootTimers}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of mainThreadRootTimers elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMergedAggregate withMainThreadRootTimers(Iterable<? extends MutableTimer> elements) {
    if (this.mainThreadRootTimers == elements) return this;
    ImmutableList<MutableTimer> newValue = ImmutableList.copyOf(elements);
    return new ImmutableMergedAggregate(
        this.transactionCount,
        newValue,
        this.auxThreadRootTimers,
        this.asyncTimers,
        this.mainThreadStats,
        this.auxThreadStats);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link AggregateMerging.MergedAggregate#auxThreadRootTimers() auxThreadRootTimers}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMergedAggregate withAuxThreadRootTimers(MutableTimer... elements) {
    ImmutableList<MutableTimer> newValue = ImmutableList.copyOf(elements);
    return new ImmutableMergedAggregate(
        this.transactionCount,
        this.mainThreadRootTimers,
        newValue,
        this.asyncTimers,
        this.mainThreadStats,
        this.auxThreadStats);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link AggregateMerging.MergedAggregate#auxThreadRootTimers() auxThreadRootTimers}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of auxThreadRootTimers elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMergedAggregate withAuxThreadRootTimers(Iterable<? extends MutableTimer> elements) {
    if (this.auxThreadRootTimers == elements) return this;
    ImmutableList<MutableTimer> newValue = ImmutableList.copyOf(elements);
    return new ImmutableMergedAggregate(
        this.transactionCount,
        this.mainThreadRootTimers,
        newValue,
        this.asyncTimers,
        this.mainThreadStats,
        this.auxThreadStats);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link AggregateMerging.MergedAggregate#asyncTimers() asyncTimers}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMergedAggregate withAsyncTimers(MutableTimer... elements) {
    ImmutableList<MutableTimer> newValue = ImmutableList.copyOf(elements);
    return new ImmutableMergedAggregate(
        this.transactionCount,
        this.mainThreadRootTimers,
        this.auxThreadRootTimers,
        newValue,
        this.mainThreadStats,
        this.auxThreadStats);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link AggregateMerging.MergedAggregate#asyncTimers() asyncTimers}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of asyncTimers elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMergedAggregate withAsyncTimers(Iterable<? extends MutableTimer> elements) {
    if (this.asyncTimers == elements) return this;
    ImmutableList<MutableTimer> newValue = ImmutableList.copyOf(elements);
    return new ImmutableMergedAggregate(
        this.transactionCount,
        this.mainThreadRootTimers,
        this.auxThreadRootTimers,
        newValue,
        this.mainThreadStats,
        this.auxThreadStats);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AggregateMerging.MergedAggregate#mainThreadStats() mainThreadStats} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for mainThreadStats (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMergedAggregate withMainThreadStats(@Nullable MutableThreadStats value) {
    if (this.mainThreadStats == value) return this;
    return new ImmutableMergedAggregate(
        this.transactionCount,
        this.mainThreadRootTimers,
        this.auxThreadRootTimers,
        this.asyncTimers,
        value,
        this.auxThreadStats);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AggregateMerging.MergedAggregate#auxThreadStats() auxThreadStats} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for auxThreadStats (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMergedAggregate withAuxThreadStats(@Nullable MutableThreadStats value) {
    if (this.auxThreadStats == value) return this;
    return new ImmutableMergedAggregate(
        this.transactionCount,
        this.mainThreadRootTimers,
        this.auxThreadRootTimers,
        this.asyncTimers,
        this.mainThreadStats,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMergedAggregate} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMergedAggregate
        && equalTo((ImmutableMergedAggregate) another);
  }

  private boolean equalTo(ImmutableMergedAggregate another) {
    return transactionCount == another.transactionCount
        && mainThreadRootTimers.equals(another.mainThreadRootTimers)
        && auxThreadRootTimers.equals(another.auxThreadRootTimers)
        && asyncTimers.equals(another.asyncTimers)
        && Objects.equal(mainThreadStats, another.mainThreadStats)
        && Objects.equal(auxThreadStats, another.auxThreadStats);
  }

  /**
   * Computes a hash code from attributes: {@code transactionCount}, {@code mainThreadRootTimers}, {@code auxThreadRootTimers}, {@code asyncTimers}, {@code mainThreadStats}, {@code auxThreadStats}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Longs.hashCode(transactionCount);
    h += (h << 5) + mainThreadRootTimers.hashCode();
    h += (h << 5) + auxThreadRootTimers.hashCode();
    h += (h << 5) + asyncTimers.hashCode();
    h += (h << 5) + Objects.hashCode(mainThreadStats);
    h += (h << 5) + Objects.hashCode(auxThreadStats);
    return h;
  }

  /**
   * Prints the immutable value {@code MergedAggregate} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("MergedAggregate")
        .omitNullValues()
        .add("transactionCount", transactionCount)
        .add("mainThreadRootTimers", mainThreadRootTimers)
        .add("auxThreadRootTimers", auxThreadRootTimers)
        .add("asyncTimers", asyncTimers)
        .add("mainThreadStats", mainThreadStats)
        .add("auxThreadStats", auxThreadStats)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements AggregateMerging.MergedAggregate {
    long transactionCount;
    boolean transactionCountIsSet;
    List<MutableTimer> mainThreadRootTimers = ImmutableList.of();
    List<MutableTimer> auxThreadRootTimers = ImmutableList.of();
    List<MutableTimer> asyncTimers = ImmutableList.of();
    @Nullable MutableThreadStats mainThreadStats;
    @Nullable MutableThreadStats auxThreadStats;
    @JsonProperty("transactionCount")
    public void setTransactionCount(long transactionCount) {
      this.transactionCount = transactionCount;
      this.transactionCountIsSet = true;
    }
    @JsonProperty("mainThreadRootTimers")
    public void setMainThreadRootTimers(List<MutableTimer> mainThreadRootTimers) {
      this.mainThreadRootTimers = mainThreadRootTimers;
    }
    @JsonProperty("auxThreadRootTimers")
    public void setAuxThreadRootTimers(List<MutableTimer> auxThreadRootTimers) {
      this.auxThreadRootTimers = auxThreadRootTimers;
    }
    @JsonProperty("asyncTimers")
    public void setAsyncTimers(List<MutableTimer> asyncTimers) {
      this.asyncTimers = asyncTimers;
    }
    @JsonProperty("mainThreadStats")
    public void setMainThreadStats(@Nullable MutableThreadStats mainThreadStats) {
      this.mainThreadStats = mainThreadStats;
    }
    @JsonProperty("auxThreadStats")
    public void setAuxThreadStats(@Nullable MutableThreadStats auxThreadStats) {
      this.auxThreadStats = auxThreadStats;
    }
    @Override
    public long transactionCount() { throw new UnsupportedOperationException(); }
    @Override
    public List<MutableTimer> mainThreadRootTimers() { throw new UnsupportedOperationException(); }
    @Override
    public List<MutableTimer> auxThreadRootTimers() { throw new UnsupportedOperationException(); }
    @Override
    public List<MutableTimer> asyncTimers() { throw new UnsupportedOperationException(); }
    @Override
    public MutableThreadStats mainThreadStats() { throw new UnsupportedOperationException(); }
    @Override
    public MutableThreadStats auxThreadStats() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableMergedAggregate fromJson(Json json) {
    ImmutableMergedAggregate.Builder builder = ImmutableMergedAggregate.builder();
    if (json.transactionCountIsSet) {
      builder.transactionCount(json.transactionCount);
    }
    if (json.mainThreadRootTimers != null) {
      builder.addAllMainThreadRootTimers(json.mainThreadRootTimers);
    }
    if (json.auxThreadRootTimers != null) {
      builder.addAllAuxThreadRootTimers(json.auxThreadRootTimers);
    }
    if (json.asyncTimers != null) {
      builder.addAllAsyncTimers(json.asyncTimers);
    }
    if (json.mainThreadStats != null) {
      builder.mainThreadStats(json.mainThreadStats);
    }
    if (json.auxThreadStats != null) {
      builder.auxThreadStats(json.auxThreadStats);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link AggregateMerging.MergedAggregate} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MergedAggregate instance
   */
  public static ImmutableMergedAggregate copyOf(AggregateMerging.MergedAggregate instance) {
    if (instance instanceof ImmutableMergedAggregate) {
      return (ImmutableMergedAggregate) instance;
    }
    return ImmutableMergedAggregate.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableMergedAggregate ImmutableMergedAggregate}.
   * @return A new ImmutableMergedAggregate builder
   */
  public static ImmutableMergedAggregate.Builder builder() {
    return new ImmutableMergedAggregate.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableMergedAggregate ImmutableMergedAggregate}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_TRANSACTION_COUNT = 0x1L;
    private long initBits = 0x1L;

    private long transactionCount;
    private ImmutableList.Builder<MutableTimer> mainThreadRootTimers = ImmutableList.builder();
    private ImmutableList.Builder<MutableTimer> auxThreadRootTimers = ImmutableList.builder();
    private ImmutableList.Builder<MutableTimer> asyncTimers = ImmutableList.builder();
    private @Nullable MutableThreadStats mainThreadStats;
    private @Nullable MutableThreadStats auxThreadStats;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code MergedAggregate} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(AggregateMerging.MergedAggregate instance) {
      Preconditions.checkNotNull(instance, "instance");
      transactionCount(instance.transactionCount());
      addAllMainThreadRootTimers(instance.mainThreadRootTimers());
      addAllAuxThreadRootTimers(instance.auxThreadRootTimers());
      addAllAsyncTimers(instance.asyncTimers());
      @Nullable MutableThreadStats mainThreadStatsValue = instance.mainThreadStats();
      if (mainThreadStatsValue != null) {
        mainThreadStats(mainThreadStatsValue);
      }
      @Nullable MutableThreadStats auxThreadStatsValue = instance.auxThreadStats();
      if (auxThreadStatsValue != null) {
        auxThreadStats(auxThreadStatsValue);
      }
      return this;
    }

    /**
     * Initializes the value for the {@link AggregateMerging.MergedAggregate#transactionCount() transactionCount} attribute.
     * @param transactionCount The value for transactionCount 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder transactionCount(long transactionCount) {
      this.transactionCount = transactionCount;
      initBits &= ~INIT_BIT_TRANSACTION_COUNT;
      return this;
    }

    /**
     * Adds one element to {@link AggregateMerging.MergedAggregate#mainThreadRootTimers() mainThreadRootTimers} list.
     * @param element A mainThreadRootTimers element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addMainThreadRootTimers(MutableTimer element) {
      this.mainThreadRootTimers.add(element);
      return this;
    }

    /**
     * Adds elements to {@link AggregateMerging.MergedAggregate#mainThreadRootTimers() mainThreadRootTimers} list.
     * @param elements An array of mainThreadRootTimers elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addMainThreadRootTimers(MutableTimer... elements) {
      this.mainThreadRootTimers.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link AggregateMerging.MergedAggregate#mainThreadRootTimers() mainThreadRootTimers} list.
     * @param elements An iterable of mainThreadRootTimers elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder mainThreadRootTimers(Iterable<? extends MutableTimer> elements) {
      this.mainThreadRootTimers = ImmutableList.builder();
      return addAllMainThreadRootTimers(elements);
    }

    /**
     * Adds elements to {@link AggregateMerging.MergedAggregate#mainThreadRootTimers() mainThreadRootTimers} list.
     * @param elements An iterable of mainThreadRootTimers elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllMainThreadRootTimers(Iterable<? extends MutableTimer> elements) {
      this.mainThreadRootTimers.addAll(elements);
      return this;
    }

    /**
     * Adds one element to {@link AggregateMerging.MergedAggregate#auxThreadRootTimers() auxThreadRootTimers} list.
     * @param element A auxThreadRootTimers element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAuxThreadRootTimers(MutableTimer element) {
      this.auxThreadRootTimers.add(element);
      return this;
    }

    /**
     * Adds elements to {@link AggregateMerging.MergedAggregate#auxThreadRootTimers() auxThreadRootTimers} list.
     * @param elements An array of auxThreadRootTimers elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAuxThreadRootTimers(MutableTimer... elements) {
      this.auxThreadRootTimers.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link AggregateMerging.MergedAggregate#auxThreadRootTimers() auxThreadRootTimers} list.
     * @param elements An iterable of auxThreadRootTimers elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder auxThreadRootTimers(Iterable<? extends MutableTimer> elements) {
      this.auxThreadRootTimers = ImmutableList.builder();
      return addAllAuxThreadRootTimers(elements);
    }

    /**
     * Adds elements to {@link AggregateMerging.MergedAggregate#auxThreadRootTimers() auxThreadRootTimers} list.
     * @param elements An iterable of auxThreadRootTimers elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllAuxThreadRootTimers(Iterable<? extends MutableTimer> elements) {
      this.auxThreadRootTimers.addAll(elements);
      return this;
    }

    /**
     * Adds one element to {@link AggregateMerging.MergedAggregate#asyncTimers() asyncTimers} list.
     * @param element A asyncTimers element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAsyncTimers(MutableTimer element) {
      this.asyncTimers.add(element);
      return this;
    }

    /**
     * Adds elements to {@link AggregateMerging.MergedAggregate#asyncTimers() asyncTimers} list.
     * @param elements An array of asyncTimers elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAsyncTimers(MutableTimer... elements) {
      this.asyncTimers.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link AggregateMerging.MergedAggregate#asyncTimers() asyncTimers} list.
     * @param elements An iterable of asyncTimers elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder asyncTimers(Iterable<? extends MutableTimer> elements) {
      this.asyncTimers = ImmutableList.builder();
      return addAllAsyncTimers(elements);
    }

    /**
     * Adds elements to {@link AggregateMerging.MergedAggregate#asyncTimers() asyncTimers} list.
     * @param elements An iterable of asyncTimers elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllAsyncTimers(Iterable<? extends MutableTimer> elements) {
      this.asyncTimers.addAll(elements);
      return this;
    }

    /**
     * Initializes the value for the {@link AggregateMerging.MergedAggregate#mainThreadStats() mainThreadStats} attribute.
     * @param mainThreadStats The value for mainThreadStats (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder mainThreadStats(@Nullable MutableThreadStats mainThreadStats) {
      this.mainThreadStats = mainThreadStats;
      return this;
    }

    /**
     * Initializes the value for the {@link AggregateMerging.MergedAggregate#auxThreadStats() auxThreadStats} attribute.
     * @param auxThreadStats The value for auxThreadStats (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder auxThreadStats(@Nullable MutableThreadStats auxThreadStats) {
      this.auxThreadStats = auxThreadStats;
      return this;
    }

    /**
     * Builds a new {@link ImmutableMergedAggregate ImmutableMergedAggregate}.
     * @return An immutable instance of MergedAggregate
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableMergedAggregate build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableMergedAggregate(
          transactionCount,
          mainThreadRootTimers.build(),
          auxThreadRootTimers.build(),
          asyncTimers.build(),
          mainThreadStats,
          auxThreadStats);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_TRANSACTION_COUNT) != 0) attributes.add("transactionCount");
      return "Cannot build MergedAggregate, some of required attributes are not set " + attributes;
    }
  }
}
