package org.glowroot.agent.shaded.glowroot.ui;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Objects;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import org.glowroot.agent.shaded.google.common.collect.Lists;
import org.glowroot.agent.shaded.google.common.primitives.Doubles;
import org.glowroot.agent.shaded.google.common.primitives.Longs;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link TransactionJsonService.Query}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableQuery.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "TransactionJsonService.Query"})
@Immutable
final class ImmutableQuery implements TransactionJsonService.Query {
  private final String queryType;
  private final String truncatedQueryText;
  private final @Nullable String fullQueryTextSha1;
  private final double totalDurationNanos;
  private final long executionCount;
  private final @Nullable Long totalRows;

  private ImmutableQuery(
      String queryType,
      String truncatedQueryText,
      @Nullable String fullQueryTextSha1,
      double totalDurationNanos,
      long executionCount,
      @Nullable Long totalRows) {
    this.queryType = queryType;
    this.truncatedQueryText = truncatedQueryText;
    this.fullQueryTextSha1 = fullQueryTextSha1;
    this.totalDurationNanos = totalDurationNanos;
    this.executionCount = executionCount;
    this.totalRows = totalRows;
  }

  /**
   * @return The value of the {@code queryType} attribute
   */
  @JsonProperty("queryType")
  @Override
  public String queryType() {
    return queryType;
  }

  /**
   * @return The value of the {@code truncatedQueryText} attribute
   */
  @JsonProperty("truncatedQueryText")
  @Override
  public String truncatedQueryText() {
    return truncatedQueryText;
  }

  /**
   * @return The value of the {@code fullQueryTextSha1} attribute
   */
  @JsonProperty("fullQueryTextSha1")
  @Override
  public @Nullable String fullQueryTextSha1() {
    return fullQueryTextSha1;
  }

  /**
   * @return The value of the {@code totalDurationNanos} attribute
   */
  @JsonProperty("totalDurationNanos")
  @Override
  public double totalDurationNanos() {
    return totalDurationNanos;
  }

  /**
   * @return The value of the {@code executionCount} attribute
   */
  @JsonProperty("executionCount")
  @Override
  public long executionCount() {
    return executionCount;
  }

  /**
   * @return The value of the {@code totalRows} attribute
   */
  @JsonProperty("totalRows")
  @Override
  public @Nullable Long totalRows() {
    return totalRows;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TransactionJsonService.Query#queryType() queryType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for queryType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableQuery withQueryType(String value) {
    if (this.queryType.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "queryType");
    return new ImmutableQuery(
        newValue,
        this.truncatedQueryText,
        this.fullQueryTextSha1,
        this.totalDurationNanos,
        this.executionCount,
        this.totalRows);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TransactionJsonService.Query#truncatedQueryText() truncatedQueryText} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for truncatedQueryText
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableQuery withTruncatedQueryText(String value) {
    if (this.truncatedQueryText.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "truncatedQueryText");
    return new ImmutableQuery(
        this.queryType,
        newValue,
        this.fullQueryTextSha1,
        this.totalDurationNanos,
        this.executionCount,
        this.totalRows);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TransactionJsonService.Query#fullQueryTextSha1() fullQueryTextSha1} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for fullQueryTextSha1 (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableQuery withFullQueryTextSha1(@Nullable String value) {
    if (Objects.equal(this.fullQueryTextSha1, value)) return this;
    return new ImmutableQuery(
        this.queryType,
        this.truncatedQueryText,
        value,
        this.totalDurationNanos,
        this.executionCount,
        this.totalRows);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TransactionJsonService.Query#totalDurationNanos() totalDurationNanos} attribute.
   * A value strict bits equality used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for totalDurationNanos
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableQuery withTotalDurationNanos(double value) {
    if (Double.doubleToLongBits(this.totalDurationNanos) == Double.doubleToLongBits(value)) return this;
    return new ImmutableQuery(
        this.queryType,
        this.truncatedQueryText,
        this.fullQueryTextSha1,
        value,
        this.executionCount,
        this.totalRows);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TransactionJsonService.Query#executionCount() executionCount} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for executionCount
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableQuery withExecutionCount(long value) {
    if (this.executionCount == value) return this;
    return new ImmutableQuery(
        this.queryType,
        this.truncatedQueryText,
        this.fullQueryTextSha1,
        this.totalDurationNanos,
        value,
        this.totalRows);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TransactionJsonService.Query#totalRows() totalRows} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for totalRows (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableQuery withTotalRows(@Nullable Long value) {
    if (Objects.equal(this.totalRows, value)) return this;
    return new ImmutableQuery(
        this.queryType,
        this.truncatedQueryText,
        this.fullQueryTextSha1,
        this.totalDurationNanos,
        this.executionCount,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableQuery} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableQuery
        && equalTo((ImmutableQuery) another);
  }

  private boolean equalTo(ImmutableQuery another) {
    return queryType.equals(another.queryType)
        && truncatedQueryText.equals(another.truncatedQueryText)
        && Objects.equal(fullQueryTextSha1, another.fullQueryTextSha1)
        && Double.doubleToLongBits(totalDurationNanos) == Double.doubleToLongBits(another.totalDurationNanos)
        && executionCount == another.executionCount
        && Objects.equal(totalRows, another.totalRows);
  }

  /**
   * Computes a hash code from attributes: {@code queryType}, {@code truncatedQueryText}, {@code fullQueryTextSha1}, {@code totalDurationNanos}, {@code executionCount}, {@code totalRows}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + queryType.hashCode();
    h += (h << 5) + truncatedQueryText.hashCode();
    h += (h << 5) + Objects.hashCode(fullQueryTextSha1);
    h += (h << 5) + Doubles.hashCode(totalDurationNanos);
    h += (h << 5) + Longs.hashCode(executionCount);
    h += (h << 5) + Objects.hashCode(totalRows);
    return h;
  }

  /**
   * Prints the immutable value {@code Query} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("Query")
        .omitNullValues()
        .add("queryType", queryType)
        .add("truncatedQueryText", truncatedQueryText)
        .add("fullQueryTextSha1", fullQueryTextSha1)
        .add("totalDurationNanos", totalDurationNanos)
        .add("executionCount", executionCount)
        .add("totalRows", totalRows)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements TransactionJsonService.Query {
    @Nullable String queryType;
    @Nullable String truncatedQueryText;
    @Nullable String fullQueryTextSha1;
    double totalDurationNanos;
    boolean totalDurationNanosIsSet;
    long executionCount;
    boolean executionCountIsSet;
    @Nullable Long totalRows;
    @JsonProperty("queryType")
    public void setQueryType(String queryType) {
      this.queryType = queryType;
    }
    @JsonProperty("truncatedQueryText")
    public void setTruncatedQueryText(String truncatedQueryText) {
      this.truncatedQueryText = truncatedQueryText;
    }
    @JsonProperty("fullQueryTextSha1")
    public void setFullQueryTextSha1(@Nullable String fullQueryTextSha1) {
      this.fullQueryTextSha1 = fullQueryTextSha1;
    }
    @JsonProperty("totalDurationNanos")
    public void setTotalDurationNanos(double totalDurationNanos) {
      this.totalDurationNanos = totalDurationNanos;
      this.totalDurationNanosIsSet = true;
    }
    @JsonProperty("executionCount")
    public void setExecutionCount(long executionCount) {
      this.executionCount = executionCount;
      this.executionCountIsSet = true;
    }
    @JsonProperty("totalRows")
    public void setTotalRows(@Nullable Long totalRows) {
      this.totalRows = totalRows;
    }
    @Override
    public String queryType() { throw new UnsupportedOperationException(); }
    @Override
    public String truncatedQueryText() { throw new UnsupportedOperationException(); }
    @Override
    public String fullQueryTextSha1() { throw new UnsupportedOperationException(); }
    @Override
    public double totalDurationNanos() { throw new UnsupportedOperationException(); }
    @Override
    public long executionCount() { throw new UnsupportedOperationException(); }
    @Override
    public Long totalRows() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableQuery fromJson(Json json) {
    ImmutableQuery.Builder builder = ImmutableQuery.builder();
    if (json.queryType != null) {
      builder.queryType(json.queryType);
    }
    if (json.truncatedQueryText != null) {
      builder.truncatedQueryText(json.truncatedQueryText);
    }
    if (json.fullQueryTextSha1 != null) {
      builder.fullQueryTextSha1(json.fullQueryTextSha1);
    }
    if (json.totalDurationNanosIsSet) {
      builder.totalDurationNanos(json.totalDurationNanos);
    }
    if (json.executionCountIsSet) {
      builder.executionCount(json.executionCount);
    }
    if (json.totalRows != null) {
      builder.totalRows(json.totalRows);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link TransactionJsonService.Query} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Query instance
   */
  public static ImmutableQuery copyOf(TransactionJsonService.Query instance) {
    if (instance instanceof ImmutableQuery) {
      return (ImmutableQuery) instance;
    }
    return ImmutableQuery.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableQuery ImmutableQuery}.
   * @return A new ImmutableQuery builder
   */
  public static ImmutableQuery.Builder builder() {
    return new ImmutableQuery.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableQuery ImmutableQuery}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_QUERY_TYPE = 0x1L;
    private static final long INIT_BIT_TRUNCATED_QUERY_TEXT = 0x2L;
    private static final long INIT_BIT_TOTAL_DURATION_NANOS = 0x4L;
    private static final long INIT_BIT_EXECUTION_COUNT = 0x8L;
    private long initBits = 0xfL;

    private @Nullable String queryType;
    private @Nullable String truncatedQueryText;
    private @Nullable String fullQueryTextSha1;
    private double totalDurationNanos;
    private long executionCount;
    private @Nullable Long totalRows;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Query} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(TransactionJsonService.Query instance) {
      Preconditions.checkNotNull(instance, "instance");
      queryType(instance.queryType());
      truncatedQueryText(instance.truncatedQueryText());
      @Nullable String fullQueryTextSha1Value = instance.fullQueryTextSha1();
      if (fullQueryTextSha1Value != null) {
        fullQueryTextSha1(fullQueryTextSha1Value);
      }
      totalDurationNanos(instance.totalDurationNanos());
      executionCount(instance.executionCount());
      @Nullable Long totalRowsValue = instance.totalRows();
      if (totalRowsValue != null) {
        totalRows(totalRowsValue);
      }
      return this;
    }

    /**
     * Initializes the value for the {@link TransactionJsonService.Query#queryType() queryType} attribute.
     * @param queryType The value for queryType 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder queryType(String queryType) {
      this.queryType = Preconditions.checkNotNull(queryType, "queryType");
      initBits &= ~INIT_BIT_QUERY_TYPE;
      return this;
    }

    /**
     * Initializes the value for the {@link TransactionJsonService.Query#truncatedQueryText() truncatedQueryText} attribute.
     * @param truncatedQueryText The value for truncatedQueryText 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder truncatedQueryText(String truncatedQueryText) {
      this.truncatedQueryText = Preconditions.checkNotNull(truncatedQueryText, "truncatedQueryText");
      initBits &= ~INIT_BIT_TRUNCATED_QUERY_TEXT;
      return this;
    }

    /**
     * Initializes the value for the {@link TransactionJsonService.Query#fullQueryTextSha1() fullQueryTextSha1} attribute.
     * @param fullQueryTextSha1 The value for fullQueryTextSha1 (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder fullQueryTextSha1(@Nullable String fullQueryTextSha1) {
      this.fullQueryTextSha1 = fullQueryTextSha1;
      return this;
    }

    /**
     * Initializes the value for the {@link TransactionJsonService.Query#totalDurationNanos() totalDurationNanos} attribute.
     * @param totalDurationNanos The value for totalDurationNanos 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder totalDurationNanos(double totalDurationNanos) {
      this.totalDurationNanos = totalDurationNanos;
      initBits &= ~INIT_BIT_TOTAL_DURATION_NANOS;
      return this;
    }

    /**
     * Initializes the value for the {@link TransactionJsonService.Query#executionCount() executionCount} attribute.
     * @param executionCount The value for executionCount 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder executionCount(long executionCount) {
      this.executionCount = executionCount;
      initBits &= ~INIT_BIT_EXECUTION_COUNT;
      return this;
    }

    /**
     * Initializes the value for the {@link TransactionJsonService.Query#totalRows() totalRows} attribute.
     * @param totalRows The value for totalRows (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder totalRows(@Nullable Long totalRows) {
      this.totalRows = totalRows;
      return this;
    }

    /**
     * Builds a new {@link ImmutableQuery ImmutableQuery}.
     * @return An immutable instance of Query
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableQuery build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableQuery(
          queryType,
          truncatedQueryText,
          fullQueryTextSha1,
          totalDurationNanos,
          executionCount,
          totalRows);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_QUERY_TYPE) != 0) attributes.add("queryType");
      if ((initBits & INIT_BIT_TRUNCATED_QUERY_TEXT) != 0) attributes.add("truncatedQueryText");
      if ((initBits & INIT_BIT_TOTAL_DURATION_NANOS) != 0) attributes.add("totalDurationNanos");
      if ((initBits & INIT_BIT_EXECUTION_COUNT) != 0) attributes.add("executionCount");
      return "Cannot build Query, some of required attributes are not set " + attributes;
    }
  }
}
