package org.glowroot.agent.shaded.glowroot.common.live;

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

/**
 * Immutable implementation of {@link LiveAggregateRepository.OverallQuery}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableOverallQuery.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "LiveAggregateRepository.OverallQuery"})
@Immutable
public final class ImmutableOverallQuery
    implements LiveAggregateRepository.OverallQuery {
  private final String transactionType;
  private final long from;
  private final long to;
  private final int rollupLevel;

  private ImmutableOverallQuery(String transactionType, long from, long to, int rollupLevel) {
    this.transactionType = transactionType;
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
   * Copy the current immutable object by setting a value for the {@link LiveAggregateRepository.OverallQuery#transactionType() transactionType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for transactionType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableOverallQuery withTransactionType(String value) {
    if (this.transactionType.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "transactionType");
    return new ImmutableOverallQuery(newValue, this.from, this.to, this.rollupLevel);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LiveAggregateRepository.OverallQuery#from() from} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for from
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableOverallQuery withFrom(long value) {
    if (this.from == value) return this;
    return new ImmutableOverallQuery(this.transactionType, value, this.to, this.rollupLevel);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LiveAggregateRepository.OverallQuery#to() to} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for to
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableOverallQuery withTo(long value) {
    if (this.to == value) return this;
    return new ImmutableOverallQuery(this.transactionType, this.from, value, this.rollupLevel);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LiveAggregateRepository.OverallQuery#rollupLevel() rollupLevel} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for rollupLevel
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableOverallQuery withRollupLevel(int value) {
    if (this.rollupLevel == value) return this;
    return new ImmutableOverallQuery(this.transactionType, this.from, this.to, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableOverallQuery} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableOverallQuery
        && equalTo((ImmutableOverallQuery) another);
  }

  private boolean equalTo(ImmutableOverallQuery another) {
    return transactionType.equals(another.transactionType)
        && from == another.from
        && to == another.to
        && rollupLevel == another.rollupLevel;
  }

  /**
   * Computes a hash code from attributes: {@code transactionType}, {@code from}, {@code to}, {@code rollupLevel}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + transactionType.hashCode();
    h += (h << 5) + Longs.hashCode(from);
    h += (h << 5) + Longs.hashCode(to);
    h += (h << 5) + rollupLevel;
    return h;
  }

  /**
   * Prints the immutable value {@code OverallQuery} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("OverallQuery")
        .omitNullValues()
        .add("transactionType", transactionType)
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
  static final class Json implements LiveAggregateRepository.OverallQuery {
    @Nullable String transactionType;
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
  static ImmutableOverallQuery fromJson(Json json) {
    ImmutableOverallQuery.Builder builder = ImmutableOverallQuery.builder();
    if (json.transactionType != null) {
      builder.transactionType(json.transactionType);
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
   * Creates an immutable copy of a {@link LiveAggregateRepository.OverallQuery} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable OverallQuery instance
   */
  public static ImmutableOverallQuery copyOf(LiveAggregateRepository.OverallQuery instance) {
    if (instance instanceof ImmutableOverallQuery) {
      return (ImmutableOverallQuery) instance;
    }
    return ImmutableOverallQuery.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableOverallQuery ImmutableOverallQuery}.
   * @return A new ImmutableOverallQuery builder
   */
  public static ImmutableOverallQuery.Builder builder() {
    return new ImmutableOverallQuery.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableOverallQuery ImmutableOverallQuery}.
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
    private long from;
    private long to;
    private int rollupLevel;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code OverallQuery} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(LiveAggregateRepository.OverallQuery instance) {
      Preconditions.checkNotNull(instance, "instance");
      transactionType(instance.transactionType());
      from(instance.from());
      to(instance.to());
      rollupLevel(instance.rollupLevel());
      return this;
    }

    /**
     * Initializes the value for the {@link LiveAggregateRepository.OverallQuery#transactionType() transactionType} attribute.
     * @param transactionType The value for transactionType 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder transactionType(String transactionType) {
      this.transactionType = Preconditions.checkNotNull(transactionType, "transactionType");
      initBits &= ~INIT_BIT_TRANSACTION_TYPE;
      return this;
    }

    /**
     * Initializes the value for the {@link LiveAggregateRepository.OverallQuery#from() from} attribute.
     * @param from The value for from 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(long from) {
      this.from = from;
      initBits &= ~INIT_BIT_FROM;
      return this;
    }

    /**
     * Initializes the value for the {@link LiveAggregateRepository.OverallQuery#to() to} attribute.
     * @param to The value for to 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder to(long to) {
      this.to = to;
      initBits &= ~INIT_BIT_TO;
      return this;
    }

    /**
     * Initializes the value for the {@link LiveAggregateRepository.OverallQuery#rollupLevel() rollupLevel} attribute.
     * @param rollupLevel The value for rollupLevel 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder rollupLevel(int rollupLevel) {
      this.rollupLevel = rollupLevel;
      initBits &= ~INIT_BIT_ROLLUP_LEVEL;
      return this;
    }

    /**
     * Builds a new {@link ImmutableOverallQuery ImmutableOverallQuery}.
     * @return An immutable instance of OverallQuery
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableOverallQuery build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableOverallQuery(transactionType, from, to, rollupLevel);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_TRANSACTION_TYPE) != 0) attributes.add("transactionType");
      if ((initBits & INIT_BIT_FROM) != 0) attributes.add("from");
      if ((initBits & INIT_BIT_TO) != 0) attributes.add("to");
      if ((initBits & INIT_BIT_ROLLUP_LEVEL) != 0) attributes.add("rollupLevel");
      return "Cannot build OverallQuery, some of required attributes are not set " + attributes;
    }
  }
}
