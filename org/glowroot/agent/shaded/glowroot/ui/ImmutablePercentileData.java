package org.glowroot.agent.shaded.glowroot.ui;

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
 * Immutable implementation of {@link TransactionJsonService.PercentileData}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePercentileData.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "TransactionJsonService.PercentileData"})
@Immutable
final class ImmutablePercentileData implements TransactionJsonService.PercentileData {
  private final ImmutableList<DataSeries> dataSeriesList;
  private final TransactionJsonService.PercentileMergedAggregate mergedAggregate;

  private ImmutablePercentileData(
      ImmutableList<DataSeries> dataSeriesList,
      TransactionJsonService.PercentileMergedAggregate mergedAggregate) {
    this.dataSeriesList = dataSeriesList;
    this.mergedAggregate = mergedAggregate;
  }

  /**
   * @return The value of the {@code dataSeriesList} attribute
   */
  @JsonProperty("dataSeriesList")
  @Override
  public ImmutableList<DataSeries> dataSeriesList() {
    return dataSeriesList;
  }

  /**
   * @return The value of the {@code mergedAggregate} attribute
   */
  @JsonProperty("mergedAggregate")
  @Override
  public TransactionJsonService.PercentileMergedAggregate mergedAggregate() {
    return mergedAggregate;
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link TransactionJsonService.PercentileData#dataSeriesList() dataSeriesList}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePercentileData withDataSeriesList(DataSeries... elements) {
    ImmutableList<DataSeries> newValue = ImmutableList.copyOf(elements);
    return new ImmutablePercentileData(newValue, this.mergedAggregate);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link TransactionJsonService.PercentileData#dataSeriesList() dataSeriesList}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of dataSeriesList elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePercentileData withDataSeriesList(Iterable<? extends DataSeries> elements) {
    if (this.dataSeriesList == elements) return this;
    ImmutableList<DataSeries> newValue = ImmutableList.copyOf(elements);
    return new ImmutablePercentileData(newValue, this.mergedAggregate);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TransactionJsonService.PercentileData#mergedAggregate() mergedAggregate} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for mergedAggregate
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePercentileData withMergedAggregate(TransactionJsonService.PercentileMergedAggregate value) {
    if (this.mergedAggregate == value) return this;
    TransactionJsonService.PercentileMergedAggregate newValue = Preconditions.checkNotNull(value, "mergedAggregate");
    return new ImmutablePercentileData(this.dataSeriesList, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePercentileData} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePercentileData
        && equalTo((ImmutablePercentileData) another);
  }

  private boolean equalTo(ImmutablePercentileData another) {
    return dataSeriesList.equals(another.dataSeriesList)
        && mergedAggregate.equals(another.mergedAggregate);
  }

  /**
   * Computes a hash code from attributes: {@code dataSeriesList}, {@code mergedAggregate}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + dataSeriesList.hashCode();
    h += (h << 5) + mergedAggregate.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code PercentileData} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("PercentileData")
        .omitNullValues()
        .add("dataSeriesList", dataSeriesList)
        .add("mergedAggregate", mergedAggregate)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements TransactionJsonService.PercentileData {
    ImmutableList<DataSeries> dataSeriesList = ImmutableList.of();
    @Nullable TransactionJsonService.PercentileMergedAggregate mergedAggregate;
    @JsonProperty("dataSeriesList")
    public void setDataSeriesList(ImmutableList<DataSeries> dataSeriesList) {
      this.dataSeriesList = dataSeriesList;
    }
    @JsonProperty("mergedAggregate")
    public void setMergedAggregate(TransactionJsonService.PercentileMergedAggregate mergedAggregate) {
      this.mergedAggregate = mergedAggregate;
    }
    @Override
    public ImmutableList<DataSeries> dataSeriesList() { throw new UnsupportedOperationException(); }
    @Override
    public TransactionJsonService.PercentileMergedAggregate mergedAggregate() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutablePercentileData fromJson(Json json) {
    ImmutablePercentileData.Builder builder = ImmutablePercentileData.builder();
    if (json.dataSeriesList != null) {
      builder.addAllDataSeriesList(json.dataSeriesList);
    }
    if (json.mergedAggregate != null) {
      builder.mergedAggregate(json.mergedAggregate);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link TransactionJsonService.PercentileData} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable PercentileData instance
   */
  public static ImmutablePercentileData copyOf(TransactionJsonService.PercentileData instance) {
    if (instance instanceof ImmutablePercentileData) {
      return (ImmutablePercentileData) instance;
    }
    return ImmutablePercentileData.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutablePercentileData ImmutablePercentileData}.
   * @return A new ImmutablePercentileData builder
   */
  public static ImmutablePercentileData.Builder builder() {
    return new ImmutablePercentileData.Builder();
  }

  /**
   * Builds instances of type {@link ImmutablePercentileData ImmutablePercentileData}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_MERGED_AGGREGATE = 0x1L;
    private long initBits = 0x1L;

    private ImmutableList.Builder<DataSeries> dataSeriesList = ImmutableList.builder();
    private @Nullable TransactionJsonService.PercentileMergedAggregate mergedAggregate;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code PercentileData} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(TransactionJsonService.PercentileData instance) {
      Preconditions.checkNotNull(instance, "instance");
      addAllDataSeriesList(instance.dataSeriesList());
      mergedAggregate(instance.mergedAggregate());
      return this;
    }

    /**
     * Adds one element to {@link TransactionJsonService.PercentileData#dataSeriesList() dataSeriesList} list.
     * @param element A dataSeriesList element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addDataSeriesList(DataSeries element) {
      this.dataSeriesList.add(element);
      return this;
    }

    /**
     * Adds elements to {@link TransactionJsonService.PercentileData#dataSeriesList() dataSeriesList} list.
     * @param elements An array of dataSeriesList elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addDataSeriesList(DataSeries... elements) {
      this.dataSeriesList.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link TransactionJsonService.PercentileData#dataSeriesList() dataSeriesList} list.
     * @param elements An iterable of dataSeriesList elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder dataSeriesList(Iterable<? extends DataSeries> elements) {
      this.dataSeriesList = ImmutableList.builder();
      return addAllDataSeriesList(elements);
    }

    /**
     * Adds elements to {@link TransactionJsonService.PercentileData#dataSeriesList() dataSeriesList} list.
     * @param elements An iterable of dataSeriesList elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllDataSeriesList(Iterable<? extends DataSeries> elements) {
      this.dataSeriesList.addAll(elements);
      return this;
    }

    /**
     * Initializes the value for the {@link TransactionJsonService.PercentileData#mergedAggregate() mergedAggregate} attribute.
     * @param mergedAggregate The value for mergedAggregate 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder mergedAggregate(TransactionJsonService.PercentileMergedAggregate mergedAggregate) {
      this.mergedAggregate = Preconditions.checkNotNull(mergedAggregate, "mergedAggregate");
      initBits &= ~INIT_BIT_MERGED_AGGREGATE;
      return this;
    }

    /**
     * Builds a new {@link ImmutablePercentileData ImmutablePercentileData}.
     * @return An immutable instance of PercentileData
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutablePercentileData build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutablePercentileData(dataSeriesList.build(), mergedAggregate);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_MERGED_AGGREGATE) != 0) attributes.add("mergedAggregate");
      return "Cannot build PercentileData, some of required attributes are not set " + attributes;
    }
  }
}
