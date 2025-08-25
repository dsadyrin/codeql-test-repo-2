package org.glowroot.agent.shaded.glowroot.ui;

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
 * Immutable implementation of {@link TransactionJsonService.TransactionDataRequest}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTransactionDataRequest.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "TransactionJsonService.TransactionDataRequest"})
@Immutable
final class ImmutableTransactionDataRequest
    implements TransactionJsonService.TransactionDataRequest {
  private final String transactionType;
  private final @Nullable String transactionName;
  private final long from;
  private final long to;

  private ImmutableTransactionDataRequest(
      String transactionType,
      @Nullable String transactionName,
      long from,
      long to) {
    this.transactionType = transactionType;
    this.transactionName = transactionName;
    this.from = from;
    this.to = to;
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
   * Copy the current immutable object by setting a value for the {@link TransactionJsonService.TransactionDataRequest#transactionType() transactionType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for transactionType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTransactionDataRequest withTransactionType(String value) {
    if (this.transactionType.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "transactionType");
    return new ImmutableTransactionDataRequest(newValue, this.transactionName, this.from, this.to);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TransactionJsonService.TransactionDataRequest#transactionName() transactionName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for transactionName (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTransactionDataRequest withTransactionName(@Nullable String value) {
    if (Objects.equal(this.transactionName, value)) return this;
    return new ImmutableTransactionDataRequest(this.transactionType, value, this.from, this.to);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TransactionJsonService.TransactionDataRequest#from() from} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for from
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTransactionDataRequest withFrom(long value) {
    if (this.from == value) return this;
    return new ImmutableTransactionDataRequest(this.transactionType, this.transactionName, value, this.to);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TransactionJsonService.TransactionDataRequest#to() to} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for to
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTransactionDataRequest withTo(long value) {
    if (this.to == value) return this;
    return new ImmutableTransactionDataRequest(this.transactionType, this.transactionName, this.from, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTransactionDataRequest} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTransactionDataRequest
        && equalTo((ImmutableTransactionDataRequest) another);
  }

  private boolean equalTo(ImmutableTransactionDataRequest another) {
    return transactionType.equals(another.transactionType)
        && Objects.equal(transactionName, another.transactionName)
        && from == another.from
        && to == another.to;
  }

  /**
   * Computes a hash code from attributes: {@code transactionType}, {@code transactionName}, {@code from}, {@code to}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + transactionType.hashCode();
    h += (h << 5) + Objects.hashCode(transactionName);
    h += (h << 5) + Longs.hashCode(from);
    h += (h << 5) + Longs.hashCode(to);
    return h;
  }

  /**
   * Prints the immutable value {@code TransactionDataRequest} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("TransactionDataRequest")
        .omitNullValues()
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
  static final class Json implements TransactionJsonService.TransactionDataRequest {
    @Nullable String transactionType;
    @Nullable String transactionName;
    long from;
    boolean fromIsSet;
    long to;
    boolean toIsSet;
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
  static ImmutableTransactionDataRequest fromJson(Json json) {
    ImmutableTransactionDataRequest.Builder builder = ImmutableTransactionDataRequest.builder();
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
   * Creates an immutable copy of a {@link TransactionJsonService.TransactionDataRequest} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable TransactionDataRequest instance
   */
  public static ImmutableTransactionDataRequest copyOf(TransactionJsonService.TransactionDataRequest instance) {
    if (instance instanceof ImmutableTransactionDataRequest) {
      return (ImmutableTransactionDataRequest) instance;
    }
    return ImmutableTransactionDataRequest.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableTransactionDataRequest ImmutableTransactionDataRequest}.
   * @return A new ImmutableTransactionDataRequest builder
   */
  public static ImmutableTransactionDataRequest.Builder builder() {
    return new ImmutableTransactionDataRequest.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableTransactionDataRequest ImmutableTransactionDataRequest}.
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

    private @Nullable String transactionType;
    private @Nullable String transactionName;
    private long from;
    private long to;

    private Builder() {
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

    /**
     * Fill a builder with attribute values from the provided {@code org.glowroot.agent.shaded.glowroot.ui.TransactionJsonService.TransactionDataRequest} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(TransactionJsonService.TransactionDataRequest instance) {
      Preconditions.checkNotNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    private void from(Object object) {
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
     * Initializes the value for the {@link TransactionJsonService.TransactionDataRequest#transactionType() transactionType} attribute.
     * @param transactionType The value for transactionType 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder transactionType(String transactionType) {
      this.transactionType = Preconditions.checkNotNull(transactionType, "transactionType");
      initBits &= ~INIT_BIT_TRANSACTION_TYPE;
      return this;
    }

    /**
     * Initializes the value for the {@link TransactionJsonService.TransactionDataRequest#transactionName() transactionName} attribute.
     * @param transactionName The value for transactionName (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder transactionName(@Nullable String transactionName) {
      this.transactionName = transactionName;
      return this;
    }

    /**
     * Initializes the value for the {@link TransactionJsonService.TransactionDataRequest#from() from} attribute.
     * @param from The value for from 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(long from) {
      this.from = from;
      initBits &= ~INIT_BIT_FROM;
      return this;
    }

    /**
     * Initializes the value for the {@link TransactionJsonService.TransactionDataRequest#to() to} attribute.
     * @param to The value for to 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder to(long to) {
      this.to = to;
      initBits &= ~INIT_BIT_TO;
      return this;
    }

    /**
     * Builds a new {@link ImmutableTransactionDataRequest ImmutableTransactionDataRequest}.
     * @return An immutable instance of TransactionDataRequest
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableTransactionDataRequest build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableTransactionDataRequest(transactionType, transactionName, from, to);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_TRANSACTION_TYPE) != 0) attributes.add("transactionType");
      if ((initBits & INIT_BIT_FROM) != 0) attributes.add("from");
      if ((initBits & INIT_BIT_TO) != 0) attributes.add("to");
      return "Cannot build TransactionDataRequest, some of required attributes are not set " + attributes;
    }
  }
}
