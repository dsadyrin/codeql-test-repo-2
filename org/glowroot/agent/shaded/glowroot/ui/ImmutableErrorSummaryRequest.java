package org.glowroot.agent.shaded.glowroot.ui;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import org.glowroot.agent.shaded.google.common.collect.Lists;
import org.glowroot.agent.shaded.google.common.primitives.Longs;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.glowroot.agent.shaded.glowroot.common.model.TransactionErrorSummaryCollector;

/**
 * Immutable implementation of {@link ErrorJsonService.ErrorSummaryRequest}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableErrorSummaryRequest.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "ErrorJsonService.ErrorSummaryRequest"})
@Immutable
final class ImmutableErrorSummaryRequest
    implements ErrorJsonService.ErrorSummaryRequest {
  private final String transactionType;
  private final long from;
  private final long to;
  private final TransactionErrorSummaryCollector.ErrorSummarySortOrder sortOrder;
  private final int limit;

  private ImmutableErrorSummaryRequest(
      String transactionType,
      long from,
      long to,
      TransactionErrorSummaryCollector.ErrorSummarySortOrder sortOrder,
      int limit) {
    this.transactionType = transactionType;
    this.from = from;
    this.to = to;
    this.sortOrder = sortOrder;
    this.limit = limit;
  }

  /**
   * @return The value of the {@code transactionType} attribute
   */
  @JsonProperty("transactionType")
  @Override
  public String transactionType() {
    return transactionType;
  }

  /**
   * @return The value of the {@code from} attribute
   */
  @JsonProperty("from")
  @Override
  public long from() {
    return from;
  }

  /**
   * @return The value of the {@code to} attribute
   */
  @JsonProperty("to")
  @Override
  public long to() {
    return to;
  }

  /**
   * @return The value of the {@code sortOrder} attribute
   */
  @JsonProperty("sortOrder")
  @Override
  public TransactionErrorSummaryCollector.ErrorSummarySortOrder sortOrder() {
    return sortOrder;
  }

  /**
   * @return The value of the {@code limit} attribute
   */
  @JsonProperty("limit")
  @Override
  public int limit() {
    return limit;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ErrorJsonService.ErrorSummaryRequest#transactionType() transactionType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for transactionType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableErrorSummaryRequest withTransactionType(String value) {
    if (this.transactionType.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "transactionType");
    return new ImmutableErrorSummaryRequest(newValue, this.from, this.to, this.sortOrder, this.limit);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ErrorJsonService.ErrorSummaryRequest#from() from} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for from
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableErrorSummaryRequest withFrom(long value) {
    if (this.from == value) return this;
    return new ImmutableErrorSummaryRequest(this.transactionType, value, this.to, this.sortOrder, this.limit);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ErrorJsonService.ErrorSummaryRequest#to() to} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for to
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableErrorSummaryRequest withTo(long value) {
    if (this.to == value) return this;
    return new ImmutableErrorSummaryRequest(this.transactionType, this.from, value, this.sortOrder, this.limit);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ErrorJsonService.ErrorSummaryRequest#sortOrder() sortOrder} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for sortOrder
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableErrorSummaryRequest withSortOrder(TransactionErrorSummaryCollector.ErrorSummarySortOrder value) {
    if (this.sortOrder == value) return this;
    TransactionErrorSummaryCollector.ErrorSummarySortOrder newValue = Preconditions.checkNotNull(value, "sortOrder");
    return new ImmutableErrorSummaryRequest(this.transactionType, this.from, this.to, newValue, this.limit);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ErrorJsonService.ErrorSummaryRequest#limit() limit} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for limit
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableErrorSummaryRequest withLimit(int value) {
    if (this.limit == value) return this;
    return new ImmutableErrorSummaryRequest(this.transactionType, this.from, this.to, this.sortOrder, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableErrorSummaryRequest} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableErrorSummaryRequest
        && equalTo((ImmutableErrorSummaryRequest) another);
  }

  private boolean equalTo(ImmutableErrorSummaryRequest another) {
    return transactionType.equals(another.transactionType)
        && from == another.from
        && to == another.to
        && sortOrder.equals(another.sortOrder)
        && limit == another.limit;
  }

  /**
   * Computes a hash code from attributes: {@code transactionType}, {@code from}, {@code to}, {@code sortOrder}, {@code limit}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + transactionType.hashCode();
    h += (h << 5) + Longs.hashCode(from);
    h += (h << 5) + Longs.hashCode(to);
    h += (h << 5) + sortOrder.hashCode();
    h += (h << 5) + limit;
    return h;
  }

  /**
   * Prints the immutable value {@code ErrorSummaryRequest} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("ErrorSummaryRequest")
        .omitNullValues()
        .add("transactionType", transactionType)
        .add("from", from)
        .add("to", to)
        .add("sortOrder", sortOrder)
        .add("limit", limit)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ErrorJsonService.ErrorSummaryRequest {
    @Nullable String transactionType;
    long from;
    boolean fromIsSet;
    long to;
    boolean toIsSet;
    @Nullable TransactionErrorSummaryCollector.ErrorSummarySortOrder sortOrder;
    int limit;
    boolean limitIsSet;
    @JsonProperty("transactionType")
    public void setTransactionType(String transactionType) {
      this.transactionType = transactionType;
    }
    @JsonProperty("from")
    public void setFrom(long from) {
      this.from = from;
      this.fromIsSet = true;
    }
    @JsonProperty("to")
    public void setTo(long to) {
      this.to = to;
      this.toIsSet = true;
    }
    @JsonProperty("sortOrder")
    public void setSortOrder(TransactionErrorSummaryCollector.ErrorSummarySortOrder sortOrder) {
      this.sortOrder = sortOrder;
    }
    @JsonProperty("limit")
    public void setLimit(int limit) {
      this.limit = limit;
      this.limitIsSet = true;
    }
    @Override
    public String transactionType() { throw new UnsupportedOperationException(); }
    @Override
    public long from() { throw new UnsupportedOperationException(); }
    @Override
    public long to() { throw new UnsupportedOperationException(); }
    @Override
    public TransactionErrorSummaryCollector.ErrorSummarySortOrder sortOrder() { throw new UnsupportedOperationException(); }
    @Override
    public int limit() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableErrorSummaryRequest fromJson(Json json) {
    ImmutableErrorSummaryRequest.Builder builder = ImmutableErrorSummaryRequest.builder();
    if (json.transactionType != null) {
      builder.transactionType(json.transactionType);
    }
    if (json.fromIsSet) {
      builder.from(json.from);
    }
    if (json.toIsSet) {
      builder.to(json.to);
    }
    if (json.sortOrder != null) {
      builder.sortOrder(json.sortOrder);
    }
    if (json.limitIsSet) {
      builder.limit(json.limit);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ErrorJsonService.ErrorSummaryRequest} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ErrorSummaryRequest instance
   */
  public static ImmutableErrorSummaryRequest copyOf(ErrorJsonService.ErrorSummaryRequest instance) {
    if (instance instanceof ImmutableErrorSummaryRequest) {
      return (ImmutableErrorSummaryRequest) instance;
    }
    return ImmutableErrorSummaryRequest.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableErrorSummaryRequest ImmutableErrorSummaryRequest}.
   * @return A new ImmutableErrorSummaryRequest builder
   */
  public static ImmutableErrorSummaryRequest.Builder builder() {
    return new ImmutableErrorSummaryRequest.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableErrorSummaryRequest ImmutableErrorSummaryRequest}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_TRANSACTION_TYPE = 0x1L;
    private static final long INIT_BIT_FROM = 0x2L;
    private static final long INIT_BIT_TO = 0x4L;
    private static final long INIT_BIT_SORT_ORDER = 0x8L;
    private static final long INIT_BIT_LIMIT = 0x10L;
    private long initBits = 0x1fL;

    private @Nullable String transactionType;
    private long from;
    private long to;
    private @Nullable TransactionErrorSummaryCollector.ErrorSummarySortOrder sortOrder;
    private int limit;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code ErrorSummaryRequest} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(ErrorJsonService.ErrorSummaryRequest instance) {
      Preconditions.checkNotNull(instance, "instance");
      transactionType(instance.transactionType());
      from(instance.from());
      to(instance.to());
      sortOrder(instance.sortOrder());
      limit(instance.limit());
      return this;
    }

    /**
     * Initializes the value for the {@link ErrorJsonService.ErrorSummaryRequest#transactionType() transactionType} attribute.
     * @param transactionType The value for transactionType 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder transactionType(String transactionType) {
      this.transactionType = Preconditions.checkNotNull(transactionType, "transactionType");
      initBits &= ~INIT_BIT_TRANSACTION_TYPE;
      return this;
    }

    /**
     * Initializes the value for the {@link ErrorJsonService.ErrorSummaryRequest#from() from} attribute.
     * @param from The value for from 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(long from) {
      this.from = from;
      initBits &= ~INIT_BIT_FROM;
      return this;
    }

    /**
     * Initializes the value for the {@link ErrorJsonService.ErrorSummaryRequest#to() to} attribute.
     * @param to The value for to 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder to(long to) {
      this.to = to;
      initBits &= ~INIT_BIT_TO;
      return this;
    }

    /**
     * Initializes the value for the {@link ErrorJsonService.ErrorSummaryRequest#sortOrder() sortOrder} attribute.
     * @param sortOrder The value for sortOrder 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder sortOrder(TransactionErrorSummaryCollector.ErrorSummarySortOrder sortOrder) {
      this.sortOrder = Preconditions.checkNotNull(sortOrder, "sortOrder");
      initBits &= ~INIT_BIT_SORT_ORDER;
      return this;
    }

    /**
     * Initializes the value for the {@link ErrorJsonService.ErrorSummaryRequest#limit() limit} attribute.
     * @param limit The value for limit 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder limit(int limit) {
      this.limit = limit;
      initBits &= ~INIT_BIT_LIMIT;
      return this;
    }

    /**
     * Builds a new {@link ImmutableErrorSummaryRequest ImmutableErrorSummaryRequest}.
     * @return An immutable instance of ErrorSummaryRequest
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableErrorSummaryRequest build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableErrorSummaryRequest(transactionType, from, to, sortOrder, limit);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_TRANSACTION_TYPE) != 0) attributes.add("transactionType");
      if ((initBits & INIT_BIT_FROM) != 0) attributes.add("from");
      if ((initBits & INIT_BIT_TO) != 0) attributes.add("to");
      if ((initBits & INIT_BIT_SORT_ORDER) != 0) attributes.add("sortOrder");
      if ((initBits & INIT_BIT_LIMIT) != 0) attributes.add("limit");
      return "Cannot build ErrorSummaryRequest, some of required attributes are not set " + attributes;
    }
  }
}
