package org.glowroot.agent.embedded.repo;

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
import org.glowroot.agent.shaded.glowroot.common.repo.MutableAggregate;

/**
 * Immutable implementation of {@link AggregateDao.MutableOverallAggregate}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMutableOverallAggregate.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code ImmutableMutableOverallAggregate.of()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "AggregateDao.MutableOverallAggregate"})
@Immutable
final class ImmutableMutableOverallAggregate
    implements AggregateDao.MutableOverallAggregate {
  private final String transactionType;
  private final MutableAggregate aggregate;

  private ImmutableMutableOverallAggregate(String transactionType, MutableAggregate aggregate) {
    this.transactionType = Preconditions.checkNotNull(transactionType, "transactionType");
    this.aggregate = Preconditions.checkNotNull(aggregate, "aggregate");
  }

  private ImmutableMutableOverallAggregate(
      ImmutableMutableOverallAggregate original,
      String transactionType,
      MutableAggregate aggregate) {
    this.transactionType = transactionType;
    this.aggregate = aggregate;
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
   * @return The value of the {@code aggregate} attribute
   */
  @JsonProperty("aggregate")
  @Override
  public MutableAggregate aggregate() {
    return aggregate;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AggregateDao.MutableOverallAggregate#transactionType() transactionType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for transactionType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMutableOverallAggregate withTransactionType(String value) {
    if (this.transactionType.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "transactionType");
    return new ImmutableMutableOverallAggregate(this, newValue, this.aggregate);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AggregateDao.MutableOverallAggregate#aggregate() aggregate} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for aggregate
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMutableOverallAggregate withAggregate(MutableAggregate value) {
    if (this.aggregate == value) return this;
    MutableAggregate newValue = Preconditions.checkNotNull(value, "aggregate");
    return new ImmutableMutableOverallAggregate(this, this.transactionType, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMutableOverallAggregate} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMutableOverallAggregate
        && equalTo((ImmutableMutableOverallAggregate) another);
  }

  private boolean equalTo(ImmutableMutableOverallAggregate another) {
    return transactionType.equals(another.transactionType)
        && aggregate.equals(another.aggregate);
  }

  /**
   * Computes a hash code from attributes: {@code transactionType}, {@code aggregate}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + transactionType.hashCode();
    h += (h << 5) + aggregate.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code MutableOverallAggregate} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("MutableOverallAggregate")
        .omitNullValues()
        .add("transactionType", transactionType)
        .add("aggregate", aggregate)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements AggregateDao.MutableOverallAggregate {
    @Nullable String transactionType;
    @Nullable MutableAggregate aggregate;
    @JsonProperty("transactionType")
    public void setTransactionType(String transactionType) {
      this.transactionType = transactionType;
    }
    @JsonProperty("aggregate")
    public void setAggregate(MutableAggregate aggregate) {
      this.aggregate = aggregate;
    }
    @Override
    public String transactionType() { throw new UnsupportedOperationException(); }
    @Override
    public MutableAggregate aggregate() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableMutableOverallAggregate fromJson(Json json) {
    ImmutableMutableOverallAggregate.Builder builder = ImmutableMutableOverallAggregate.builder();
    if (json.transactionType != null) {
      builder.transactionType(json.transactionType);
    }
    if (json.aggregate != null) {
      builder.aggregate(json.aggregate);
    }
    return builder.build();
  }

  /**
   * Construct a new immutable {@code MutableOverallAggregate} instance.
   * @param transactionType The value for the {@code transactionType} attribute
   * @param aggregate The value for the {@code aggregate} attribute
   * @return An immutable MutableOverallAggregate instance
   */
  public static ImmutableMutableOverallAggregate of(String transactionType, MutableAggregate aggregate) {
    return new ImmutableMutableOverallAggregate(transactionType, aggregate);
  }

  /**
   * Creates an immutable copy of a {@link AggregateDao.MutableOverallAggregate} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MutableOverallAggregate instance
   */
  public static ImmutableMutableOverallAggregate copyOf(AggregateDao.MutableOverallAggregate instance) {
    if (instance instanceof ImmutableMutableOverallAggregate) {
      return (ImmutableMutableOverallAggregate) instance;
    }
    return ImmutableMutableOverallAggregate.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableMutableOverallAggregate ImmutableMutableOverallAggregate}.
   * @return A new ImmutableMutableOverallAggregate builder
   */
  public static ImmutableMutableOverallAggregate.Builder builder() {
    return new ImmutableMutableOverallAggregate.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableMutableOverallAggregate ImmutableMutableOverallAggregate}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_TRANSACTION_TYPE = 0x1L;
    private static final long INIT_BIT_AGGREGATE = 0x2L;
    private long initBits = 0x3L;

    private @Nullable String transactionType;
    private @Nullable MutableAggregate aggregate;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code MutableOverallAggregate} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(AggregateDao.MutableOverallAggregate instance) {
      Preconditions.checkNotNull(instance, "instance");
      transactionType(instance.transactionType());
      aggregate(instance.aggregate());
      return this;
    }

    /**
     * Initializes the value for the {@link AggregateDao.MutableOverallAggregate#transactionType() transactionType} attribute.
     * @param transactionType The value for transactionType 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder transactionType(String transactionType) {
      this.transactionType = Preconditions.checkNotNull(transactionType, "transactionType");
      initBits &= ~INIT_BIT_TRANSACTION_TYPE;
      return this;
    }

    /**
     * Initializes the value for the {@link AggregateDao.MutableOverallAggregate#aggregate() aggregate} attribute.
     * @param aggregate The value for aggregate 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder aggregate(MutableAggregate aggregate) {
      this.aggregate = Preconditions.checkNotNull(aggregate, "aggregate");
      initBits &= ~INIT_BIT_AGGREGATE;
      return this;
    }

    /**
     * Builds a new {@link ImmutableMutableOverallAggregate ImmutableMutableOverallAggregate}.
     * @return An immutable instance of MutableOverallAggregate
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableMutableOverallAggregate build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableMutableOverallAggregate(null, transactionType, aggregate);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_TRANSACTION_TYPE) != 0) attributes.add("transactionType");
      if ((initBits & INIT_BIT_AGGREGATE) != 0) attributes.add("aggregate");
      return "Cannot build MutableOverallAggregate, some of required attributes are not set " + attributes;
    }
  }
}
