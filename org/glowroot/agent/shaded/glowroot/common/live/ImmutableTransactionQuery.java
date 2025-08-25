package org.glowroot.agent.shaded.glowroot.common.live;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Objects;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import org.glowroot.agent.shaded.google.common.collect.Lists;
import org.glowroot.agent.shaded.google.common.primitives.Longs;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link LiveAggregateRepository.TransactionQuery}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTransactionQuery.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "LiveAggregateRepository.TransactionQuery"})
@Immutable
public final class ImmutableTransactionQuery
    implements LiveAggregateRepository.TransactionQuery {
  private final String transactionType;
  private final @Nullable String transactionName;
  private final long from;
  private final long to;
  private final int rollupLevel;

  private ImmutableTransactionQuery(
      String transactionType,
      @Nullable String transactionName,
      long from,
      long to,
      int rollupLevel) {
    this.transactionType = transactionType;
    this.transactionName = transactionName;
    this.from = from;
    this.to = to;
    this.rollupLevel = rollupLevel;
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
   * @return The value of the {@code transactionName} attribute
   */
  @JsonProperty("transactionName")
  @Override
  public @Nullable String transactionName() {
    return transactionName;
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
   * @return The value of the {@code rollupLevel} attribute
   */
  @JsonProperty("rollupLevel")
  @Override
  public int rollupLevel() {
    return rollupLevel;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LiveAggregateRepository.TransactionQuery#transactionType() transactionType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for transactionType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTransactionQuery withTransactionType(String value) {
    if (this.transactionType.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "transactionType");
    return new ImmutableTransactionQuery(newValue, this.transactionName, this.from, this.to, this.rollupLevel);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LiveAggregateRepository.TransactionQuery#transactionName() transactionName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for transactionName (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTransactionQuery withTransactionName(@Nullable String value) {
    if (Objects.equal(this.transactionName, value)) return this;
    return new ImmutableTransactionQuery(this.transactionType, value, this.from, this.to, this.rollupLevel);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LiveAggregateRepository.TransactionQuery#from() from} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for from
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTransactionQuery withFrom(long value) {
    if (this.from == value) return this;
    return new ImmutableTransactionQuery(this.transactionType, this.transactionName, value, this.to, this.rollupLevel);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LiveAggregateRepository.TransactionQuery#to() to} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for to
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTransactionQuery withTo(long value) {
    if (this.to == value) return this;
    return new ImmutableTransactionQuery(this.transactionType, this.transactionName, this.from, value, this.rollupLevel);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LiveAggregateRepository.TransactionQuery#rollupLevel() rollupLevel} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for rollupLevel
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTransactionQuery withRollupLevel(int value) {
    if (this.rollupLevel == value) return this;
    return new ImmutableTransactionQuery(this.transactionType, this.transactionName, this.from, this.to, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTransactionQuery} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTransactionQuery
        && equalTo((ImmutableTransactionQuery) another);
  }

  private boolean equalTo(ImmutableTransactionQuery another) {
    return transactionType.equals(another.transactionType)
        && Objects.equal(transactionName, another.transactionName)
        && from == another.from
        && to == another.to
        && rollupLevel == another.rollupLevel;
  }

  /**
   * Computes a hash code from attributes: {@code transactionType}, {@code transactionName}, {@code from}, {@code to}, {@code rollupLevel}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + transactionType.hashCode();
    h += (h << 5) + Objects.hashCode(transactionName);
    h += (h << 5) + Longs.hashCode(from);
    h += (h << 5) + Longs.hashCode(to);
    h += (h << 5) + rollupLevel;
    return h;
  }

  /**
   * Prints the immutable value {@code TransactionQuery} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("TransactionQuery")
        .omitNullValues()
        .add("transactionType", transactionType)
        .add("transactionName", transactionName)
        .add("from", from)
        .add("to", to)
        .add("rollupLevel", rollupLevel)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements LiveAggregateRepository.TransactionQuery {
    @Nullable String transactionType;
    @Nullable String transactionName;
    long from;
    boolean fromIsSet;
    long to;
    boolean toIsSet;
    int rollupLevel;
    boolean rollupLevelIsSet;
    @JsonProperty("transactionType")
    public void setTransactionType(String transactionType) {
      this.transactionType = transactionType;
    }
    @JsonProperty("transactionName")
    public void setTransactionName(@Nullable String transactionName) {
      this.transactionName = transactionName;
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
    @JsonProperty("rollupLevel")
    public void setRollupLevel(int rollupLevel) {
      this.rollupLevel = rollupLevel;
      this.rollupLevelIsSet = true;
    }
    @Override
    public String transactionType() { throw new UnsupportedOperationException(); }
    @Override
    public String transactionName() { throw new UnsupportedOperationException(); }
    @Override
    public long from() { throw new UnsupportedOperationException(); }
    @Override
    public long to() { throw new UnsupportedOperationException(); }
    @Override
    public int rollupLevel() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableTransactionQuery fromJson(Json json) {
    ImmutableTransactionQuery.Builder builder = ImmutableTransactionQuery.builder();
    if (json.transactionType != null) {
      builder.transactionType(json.transactionType);
    }
    if (json.transactionName != null) {
      builder.transactionName(json.transactionName);
    }
    if (json.fromIsSet) {
      builder.from(json.from);
    }
    if (json.toIsSet) {
      builder.to(json.to);
    }
    if (json.rollupLevelIsSet) {
      builder.rollupLevel(json.rollupLevel);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link LiveAggregateRepository.TransactionQuery} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable TransactionQuery instance
   */
  public static ImmutableTransactionQuery copyOf(LiveAggregateRepository.TransactionQuery instance) {
    if (instance instanceof ImmutableTransactionQuery) {
      return (ImmutableTransactionQuery) instance;
    }
    return ImmutableTransactionQuery.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableTransactionQuery ImmutableTransactionQuery}.
   * @return A new ImmutableTransactionQuery builder
   */
  public static ImmutableTransactionQuery.Builder builder() {
    return new ImmutableTransactionQuery.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableTransactionQuery ImmutableTransactionQuery}.
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
    private static final long INIT_BIT_ROLLUP_LEVEL = 0x8L;
    private long initBits = 0xfL;

    private @Nullable String transactionType;
    private @Nullable String transactionName;
    private long from;
    private long to;
    private int rollupLevel;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code TransactionQuery} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(LiveAggregateRepository.TransactionQuery instance) {
      Preconditions.checkNotNull(instance, "instance");
      transactionType(instance.transactionType());
      @Nullable String transactionNameValue = instance.transactionName();
      if (transactionNameValue != null) {
        transactionName(transactionNameValue);
      }
      from(instance.from());
      to(instance.to());
      rollupLevel(instance.rollupLevel());
      return this;
    }

    /**
     * Initializes the value for the {@link LiveAggregateRepository.TransactionQuery#transactionType() transactionType} attribute.
     * @param transactionType The value for transactionType 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder transactionType(String transactionType) {
      this.transactionType = Preconditions.checkNotNull(transactionType, "transactionType");
      initBits &= ~INIT_BIT_TRANSACTION_TYPE;
      return this;
    }

    /**
     * Initializes the value for the {@link LiveAggregateRepository.TransactionQuery#transactionName() transactionName} attribute.
     * @param transactionName The value for transactionName (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder transactionName(@Nullable String transactionName) {
      this.transactionName = transactionName;
      return this;
    }

    /**
     * Initializes the value for the {@link LiveAggregateRepository.TransactionQuery#from() from} attribute.
     * @param from The value for from 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(long from) {
      this.from = from;
      initBits &= ~INIT_BIT_FROM;
      return this;
    }

    /**
     * Initializes the value for the {@link LiveAggregateRepository.TransactionQuery#to() to} attribute.
     * @param to The value for to 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder to(long to) {
      this.to = to;
      initBits &= ~INIT_BIT_TO;
      return this;
    }

    /**
     * Initializes the value for the {@link LiveAggregateRepository.TransactionQuery#rollupLevel() rollupLevel} attribute.
     * @param rollupLevel The value for rollupLevel 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder rollupLevel(int rollupLevel) {
      this.rollupLevel = rollupLevel;
      initBits &= ~INIT_BIT_ROLLUP_LEVEL;
      return this;
    }

    /**
     * Builds a new {@link ImmutableTransactionQuery ImmutableTransactionQuery}.
     * @return An immutable instance of TransactionQuery
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableTransactionQuery build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableTransactionQuery(transactionType, transactionName, from, to, rollupLevel);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_TRANSACTION_TYPE) != 0) attributes.add("transactionType");
      if ((initBits & INIT_BIT_FROM) != 0) attributes.add("from");
      if ((initBits & INIT_BIT_TO) != 0) attributes.add("to");
      if ((initBits & INIT_BIT_ROLLUP_LEVEL) != 0) attributes.add("rollupLevel");
      return "Cannot build TransactionQuery, some of required attributes are not set " + attributes;
    }
  }
}
