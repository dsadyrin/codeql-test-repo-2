package org.glowroot.agent.shaded.glowroot.ui;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Objects;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import org.glowroot.agent.shaded.google.common.collect.ImmutableList;
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
 * Immutable implementation of {@link TransactionJsonService.TransactionPercentileRequest}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTransactionPercentileRequest.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "TransactionJsonService.TransactionPercentileRequest"})
@Immutable
final class ImmutableTransactionPercentileRequest
    implements TransactionJsonService.TransactionPercentileRequest {
  private final ImmutableList<Double> percentile;
  private final String transactionType;
  private final @Nullable String transactionName;
  private final long from;
  private final long to;

  private ImmutableTransactionPercentileRequest(
      ImmutableList<Double> percentile,
      String transactionType,
      @Nullable String transactionName,
      long from,
      long to) {
    this.percentile = percentile;
    this.transactionType = transactionType;
    this.transactionName = transactionName;
    this.from = from;
    this.to = to;
  }

  /**
   * @return The value of the {@code percentile} attribute
   */
  @JsonProperty("percentile")
  @Override
  public ImmutableList<Double> percentile() {
    return percentile;
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
   * Copy the current immutable object with elements that replace the content of {@link TransactionJsonService.TransactionPercentileRequest#percentile() percentile}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTransactionPercentileRequest withPercentile(double... elements) {
    ImmutableList<Double> newValue = ImmutableList.copyOf(Doubles.asList(elements));
    return new ImmutableTransactionPercentileRequest(newValue, this.transactionType, this.transactionName, this.from, this.to);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link TransactionJsonService.TransactionPercentileRequest#percentile() percentile}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of percentile elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTransactionPercentileRequest withPercentile(Iterable<Double> elements) {
    if (this.percentile == elements) return this;
    ImmutableList<Double> newValue = ImmutableList.copyOf(elements);
    return new ImmutableTransactionPercentileRequest(newValue, this.transactionType, this.transactionName, this.from, this.to);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TransactionJsonService.TransactionPercentileRequest#transactionType() transactionType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for transactionType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTransactionPercentileRequest withTransactionType(String value) {
    if (this.transactionType.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "transactionType");
    return new ImmutableTransactionPercentileRequest(this.percentile, newValue, this.transactionName, this.from, this.to);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TransactionJsonService.TransactionPercentileRequest#transactionName() transactionName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for transactionName (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTransactionPercentileRequest withTransactionName(@Nullable String value) {
    if (Objects.equal(this.transactionName, value)) return this;
    return new ImmutableTransactionPercentileRequest(this.percentile, this.transactionType, value, this.from, this.to);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TransactionJsonService.TransactionPercentileRequest#from() from} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for from
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTransactionPercentileRequest withFrom(long value) {
    if (this.from == value) return this;
    return new ImmutableTransactionPercentileRequest(this.percentile, this.transactionType, this.transactionName, value, this.to);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TransactionJsonService.TransactionPercentileRequest#to() to} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for to
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTransactionPercentileRequest withTo(long value) {
    if (this.to == value) return this;
    return new ImmutableTransactionPercentileRequest(this.percentile, this.transactionType, this.transactionName, this.from, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTransactionPercentileRequest} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTransactionPercentileRequest
        && equalTo((ImmutableTransactionPercentileRequest) another);
  }

  private boolean equalTo(ImmutableTransactionPercentileRequest another) {
    return percentile.equals(another.percentile)
        && transactionType.equals(another.transactionType)
        && Objects.equal(transactionName, another.transactionName)
        && from == another.from
        && to == another.to;
  }

  /**
   * Computes a hash code from attributes: {@code percentile}, {@code transactionType}, {@code transactionName}, {@code from}, {@code to}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + percentile.hashCode();
    h += (h << 5) + transactionType.hashCode();
    h += (h << 5) + Objects.hashCode(transactionName);
    h += (h << 5) + Longs.hashCode(from);
    h += (h << 5) + Longs.hashCode(to);
    return h;
  }

  /**
   * Prints the immutable value {@code TransactionPercentileRequest} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("TransactionPercentileRequest")
        .omitNullValues()
        .add("percentile", percentile)
        .add("transactionType", transactionType)
        .add("transactionName", transactionName)
        .add("from", from)
        .add("to", to)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements TransactionJsonService.TransactionPercentileRequest {
    ImmutableList<Double> percentile = ImmutableList.of();
    @Nullable String transactionType;
    @Nullable String transactionName;
    long from;
    boolean fromIsSet;
    long to;
    boolean toIsSet;
    @JsonProperty("percentile")
    public void setPercentile(ImmutableList<Double> percentile) {
      this.percentile = percentile;
    }
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
    @Override
    public ImmutableList<Double> percentile() { throw new UnsupportedOperationException(); }
    @Override
    public String transactionType() { throw new UnsupportedOperationException(); }
    @Override
    public String transactionName() { throw new UnsupportedOperationException(); }
    @Override
    public long from() { throw new UnsupportedOperationException(); }
    @Override
    public long to() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableTransactionPercentileRequest fromJson(Json json) {
    ImmutableTransactionPercentileRequest.Builder builder = ImmutableTransactionPercentileRequest.builder();
    if (json.percentile != null) {
      builder.addAllPercentile(json.percentile);
    }
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
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link TransactionJsonService.TransactionPercentileRequest} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable TransactionPercentileRequest instance
   */
  public static ImmutableTransactionPercentileRequest copyOf(TransactionJsonService.TransactionPercentileRequest instance) {
    if (instance instanceof ImmutableTransactionPercentileRequest) {
      return (ImmutableTransactionPercentileRequest) instance;
    }
    return ImmutableTransactionPercentileRequest.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableTransactionPercentileRequest ImmutableTransactionPercentileRequest}.
   * @return A new ImmutableTransactionPercentileRequest builder
   */
  public static ImmutableTransactionPercentileRequest.Builder builder() {
    return new ImmutableTransactionPercentileRequest.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableTransactionPercentileRequest ImmutableTransactionPercentileRequest}.
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
    private long initBits = 0x7L;

    private ImmutableList.Builder<Double> percentile = ImmutableList.builder();
    private @Nullable String transactionType;
    private @Nullable String transactionName;
    private long from;
    private long to;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code org.glowroot.agent.shaded.glowroot.ui.TransactionJsonService.TransactionPercentileRequest} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(TransactionJsonService.TransactionPercentileRequest instance) {
      Preconditions.checkNotNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    /**
     * Fill a builder with attribute values from the provided {@code org.glowroot.agent.shaded.glowroot.ui.TransactionJsonService.RequestBase} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(TransactionJsonService.RequestBase instance) {
      Preconditions.checkNotNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    private void from(Object object) {
      if (object instanceof TransactionJsonService.TransactionPercentileRequest) {
        TransactionJsonService.TransactionPercentileRequest instance = (TransactionJsonService.TransactionPercentileRequest) object;
        addAllPercentile(instance.percentile());
      }
      if (object instanceof TransactionJsonService.RequestBase) {
        TransactionJsonService.RequestBase instance = (TransactionJsonService.RequestBase) object;
        transactionType(instance.transactionType());
        from(instance.from());
        to(instance.to());
        @Nullable String transactionNameValue = instance.transactionName();
        if (transactionNameValue != null) {
          transactionName(transactionNameValue);
        }
      }
    }

    /**
     * Adds one element to {@link TransactionJsonService.TransactionPercentileRequest#percentile() percentile} list.
     * @param element A percentile element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addPercentile(double element) {
      this.percentile.add(element);
      return this;
    }

    /**
     * Adds elements to {@link TransactionJsonService.TransactionPercentileRequest#percentile() percentile} list.
     * @param elements An array of percentile elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addPercentile(double... elements) {
      this.percentile.addAll(Doubles.asList(elements));
      return this;
    }

    /**
     * Sets or replaces all elements for {@link TransactionJsonService.TransactionPercentileRequest#percentile() percentile} list.
     * @param elements An iterable of percentile elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder percentile(Iterable<Double> elements) {
      this.percentile = ImmutableList.builder();
      return addAllPercentile(elements);
    }

    /**
     * Adds elements to {@link TransactionJsonService.TransactionPercentileRequest#percentile() percentile} list.
     * @param elements An iterable of percentile elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllPercentile(Iterable<Double> elements) {
      this.percentile.addAll(elements);
      return this;
    }

    /**
     * Initializes the value for the {@link TransactionJsonService.TransactionPercentileRequest#transactionType() transactionType} attribute.
     * @param transactionType The value for transactionType 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder transactionType(String transactionType) {
      this.transactionType = Preconditions.checkNotNull(transactionType, "transactionType");
      initBits &= ~INIT_BIT_TRANSACTION_TYPE;
      return this;
    }

    /**
     * Initializes the value for the {@link TransactionJsonService.TransactionPercentileRequest#transactionName() transactionName} attribute.
     * @param transactionName The value for transactionName (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder transactionName(@Nullable String transactionName) {
      this.transactionName = transactionName;
      return this;
    }

    /**
     * Initializes the value for the {@link TransactionJsonService.TransactionPercentileRequest#from() from} attribute.
     * @param from The value for from 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(long from) {
      this.from = from;
      initBits &= ~INIT_BIT_FROM;
      return this;
    }

    /**
     * Initializes the value for the {@link TransactionJsonService.TransactionPercentileRequest#to() to} attribute.
     * @param to The value for to 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder to(long to) {
      this.to = to;
      initBits &= ~INIT_BIT_TO;
      return this;
    }

    /**
     * Builds a new {@link ImmutableTransactionPercentileRequest ImmutableTransactionPercentileRequest}.
     * @return An immutable instance of TransactionPercentileRequest
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableTransactionPercentileRequest build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableTransactionPercentileRequest(percentile.build(), transactionType, transactionName, from, to);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_TRANSACTION_TYPE) != 0) attributes.add("transactionType");
      if ((initBits & INIT_BIT_FROM) != 0) attributes.add("from");
      if ((initBits & INIT_BIT_TO) != 0) attributes.add("to");
      return "Cannot build TransactionPercentileRequest, some of required attributes are not set " + attributes;
    }
  }
}
