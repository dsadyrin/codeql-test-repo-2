package org.glowroot.agent.shaded.glowroot.ui;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Objects;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import org.glowroot.agent.shaded.google.common.collect.ImmutableList;
import org.glowroot.agent.shaded.google.common.collect.Lists;
import org.glowroot.agent.shaded.google.common.primitives.Booleans;
import org.glowroot.agent.shaded.google.common.primitives.Doubles;
import org.glowroot.agent.shaded.google.common.primitives.Longs;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link TransactionJsonService.TransactionProfileRequest}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTransactionProfileRequest.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "TransactionJsonService.TransactionProfileRequest"})
@Immutable
final class ImmutableTransactionProfileRequest
    implements TransactionJsonService.TransactionProfileRequest {
  private final boolean auxiliary;
  private final ImmutableList<String> include;
  private final ImmutableList<String> exclude;
  private final double truncateBranchPercentage;
  private final String transactionType;
  private final @Nullable String transactionName;
  private final long from;
  private final long to;

  private ImmutableTransactionProfileRequest(
      boolean auxiliary,
      ImmutableList<String> include,
      ImmutableList<String> exclude,
      double truncateBranchPercentage,
      String transactionType,
      @Nullable String transactionName,
      long from,
      long to) {
    this.auxiliary = auxiliary;
    this.include = include;
    this.exclude = exclude;
    this.truncateBranchPercentage = truncateBranchPercentage;
    this.transactionType = transactionType;
    this.transactionName = transactionName;
    this.from = from;
    this.to = to;
  }

  /**
   * @return The value of the {@code auxiliary} attribute
   */
  @JsonProperty("auxiliary")
  @Override
  public boolean auxiliary() {
    return auxiliary;
  }

  /**
   * @return The value of the {@code include} attribute
   */
  @JsonProperty("include")
  @Override
  public ImmutableList<String> include() {
    return include;
  }

  /**
   * @return The value of the {@code exclude} attribute
   */
  @JsonProperty("exclude")
  @Override
  public ImmutableList<String> exclude() {
    return exclude;
  }

  /**
   * @return The value of the {@code truncateBranchPercentage} attribute
   */
  @JsonProperty("truncateBranchPercentage")
  @Override
  public double truncateBranchPercentage() {
    return truncateBranchPercentage;
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
   * Copy the current immutable object by setting a value for the {@link TransactionJsonService.TransactionProfileRequest#auxiliary() auxiliary} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for auxiliary
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTransactionProfileRequest withAuxiliary(boolean value) {
    if (this.auxiliary == value) return this;
    return new ImmutableTransactionProfileRequest(
        value,
        this.include,
        this.exclude,
        this.truncateBranchPercentage,
        this.transactionType,
        this.transactionName,
        this.from,
        this.to);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link TransactionJsonService.TransactionProfileRequest#include() include}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTransactionProfileRequest withInclude(String... elements) {
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableTransactionProfileRequest(
        this.auxiliary,
        newValue,
        this.exclude,
        this.truncateBranchPercentage,
        this.transactionType,
        this.transactionName,
        this.from,
        this.to);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link TransactionJsonService.TransactionProfileRequest#include() include}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of include elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTransactionProfileRequest withInclude(Iterable<String> elements) {
    if (this.include == elements) return this;
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableTransactionProfileRequest(
        this.auxiliary,
        newValue,
        this.exclude,
        this.truncateBranchPercentage,
        this.transactionType,
        this.transactionName,
        this.from,
        this.to);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link TransactionJsonService.TransactionProfileRequest#exclude() exclude}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTransactionProfileRequest withExclude(String... elements) {
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableTransactionProfileRequest(
        this.auxiliary,
        this.include,
        newValue,
        this.truncateBranchPercentage,
        this.transactionType,
        this.transactionName,
        this.from,
        this.to);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link TransactionJsonService.TransactionProfileRequest#exclude() exclude}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of exclude elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTransactionProfileRequest withExclude(Iterable<String> elements) {
    if (this.exclude == elements) return this;
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableTransactionProfileRequest(
        this.auxiliary,
        this.include,
        newValue,
        this.truncateBranchPercentage,
        this.transactionType,
        this.transactionName,
        this.from,
        this.to);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TransactionJsonService.TransactionProfileRequest#truncateBranchPercentage() truncateBranchPercentage} attribute.
   * A value strict bits equality used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for truncateBranchPercentage
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTransactionProfileRequest withTruncateBranchPercentage(double value) {
    if (Double.doubleToLongBits(this.truncateBranchPercentage) == Double.doubleToLongBits(value)) return this;
    return new ImmutableTransactionProfileRequest(
        this.auxiliary,
        this.include,
        this.exclude,
        value,
        this.transactionType,
        this.transactionName,
        this.from,
        this.to);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TransactionJsonService.TransactionProfileRequest#transactionType() transactionType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for transactionType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTransactionProfileRequest withTransactionType(String value) {
    if (this.transactionType.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "transactionType");
    return new ImmutableTransactionProfileRequest(
        this.auxiliary,
        this.include,
        this.exclude,
        this.truncateBranchPercentage,
        newValue,
        this.transactionName,
        this.from,
        this.to);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TransactionJsonService.TransactionProfileRequest#transactionName() transactionName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for transactionName (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTransactionProfileRequest withTransactionName(@Nullable String value) {
    if (Objects.equal(this.transactionName, value)) return this;
    return new ImmutableTransactionProfileRequest(
        this.auxiliary,
        this.include,
        this.exclude,
        this.truncateBranchPercentage,
        this.transactionType,
        value,
        this.from,
        this.to);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TransactionJsonService.TransactionProfileRequest#from() from} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for from
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTransactionProfileRequest withFrom(long value) {
    if (this.from == value) return this;
    return new ImmutableTransactionProfileRequest(
        this.auxiliary,
        this.include,
        this.exclude,
        this.truncateBranchPercentage,
        this.transactionType,
        this.transactionName,
        value,
        this.to);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TransactionJsonService.TransactionProfileRequest#to() to} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for to
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTransactionProfileRequest withTo(long value) {
    if (this.to == value) return this;
    return new ImmutableTransactionProfileRequest(
        this.auxiliary,
        this.include,
        this.exclude,
        this.truncateBranchPercentage,
        this.transactionType,
        this.transactionName,
        this.from,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTransactionProfileRequest} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTransactionProfileRequest
        && equalTo((ImmutableTransactionProfileRequest) another);
  }

  private boolean equalTo(ImmutableTransactionProfileRequest another) {
    return auxiliary == another.auxiliary
        && include.equals(another.include)
        && exclude.equals(another.exclude)
        && Double.doubleToLongBits(truncateBranchPercentage) == Double.doubleToLongBits(another.truncateBranchPercentage)
        && transactionType.equals(another.transactionType)
        && Objects.equal(transactionName, another.transactionName)
        && from == another.from
        && to == another.to;
  }

  /**
   * Computes a hash code from attributes: {@code auxiliary}, {@code include}, {@code exclude}, {@code truncateBranchPercentage}, {@code transactionType}, {@code transactionName}, {@code from}, {@code to}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Booleans.hashCode(auxiliary);
    h += (h << 5) + include.hashCode();
    h += (h << 5) + exclude.hashCode();
    h += (h << 5) + Doubles.hashCode(truncateBranchPercentage);
    h += (h << 5) + transactionType.hashCode();
    h += (h << 5) + Objects.hashCode(transactionName);
    h += (h << 5) + Longs.hashCode(from);
    h += (h << 5) + Longs.hashCode(to);
    return h;
  }

  /**
   * Prints the immutable value {@code TransactionProfileRequest} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("TransactionProfileRequest")
        .omitNullValues()
        .add("auxiliary", auxiliary)
        .add("include", include)
        .add("exclude", exclude)
        .add("truncateBranchPercentage", truncateBranchPercentage)
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
  static final class Json implements TransactionJsonService.TransactionProfileRequest {
    boolean auxiliary;
    boolean auxiliaryIsSet;
    ImmutableList<String> include = ImmutableList.of();
    ImmutableList<String> exclude = ImmutableList.of();
    double truncateBranchPercentage;
    boolean truncateBranchPercentageIsSet;
    @Nullable String transactionType;
    @Nullable String transactionName;
    long from;
    boolean fromIsSet;
    long to;
    boolean toIsSet;
    @JsonProperty("auxiliary")
    public void setAuxiliary(boolean auxiliary) {
      this.auxiliary = auxiliary;
      this.auxiliaryIsSet = true;
    }
    @JsonProperty("include")
    public void setInclude(ImmutableList<String> include) {
      this.include = include;
    }
    @JsonProperty("exclude")
    public void setExclude(ImmutableList<String> exclude) {
      this.exclude = exclude;
    }
    @JsonProperty("truncateBranchPercentage")
    public void setTruncateBranchPercentage(double truncateBranchPercentage) {
      this.truncateBranchPercentage = truncateBranchPercentage;
      this.truncateBranchPercentageIsSet = true;
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
    public boolean auxiliary() { throw new UnsupportedOperationException(); }
    @Override
    public ImmutableList<String> include() { throw new UnsupportedOperationException(); }
    @Override
    public ImmutableList<String> exclude() { throw new UnsupportedOperationException(); }
    @Override
    public double truncateBranchPercentage() { throw new UnsupportedOperationException(); }
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
  static ImmutableTransactionProfileRequest fromJson(Json json) {
    ImmutableTransactionProfileRequest.Builder builder = ImmutableTransactionProfileRequest.builder();
    if (json.auxiliaryIsSet) {
      builder.auxiliary(json.auxiliary);
    }
    if (json.include != null) {
      builder.addAllInclude(json.include);
    }
    if (json.exclude != null) {
      builder.addAllExclude(json.exclude);
    }
    if (json.truncateBranchPercentageIsSet) {
      builder.truncateBranchPercentage(json.truncateBranchPercentage);
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
   * Creates an immutable copy of a {@link TransactionJsonService.TransactionProfileRequest} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable TransactionProfileRequest instance
   */
  public static ImmutableTransactionProfileRequest copyOf(TransactionJsonService.TransactionProfileRequest instance) {
    if (instance instanceof ImmutableTransactionProfileRequest) {
      return (ImmutableTransactionProfileRequest) instance;
    }
    return ImmutableTransactionProfileRequest.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableTransactionProfileRequest ImmutableTransactionProfileRequest}.
   * @return A new ImmutableTransactionProfileRequest builder
   */
  public static ImmutableTransactionProfileRequest.Builder builder() {
    return new ImmutableTransactionProfileRequest.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableTransactionProfileRequest ImmutableTransactionProfileRequest}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_AUXILIARY = 0x1L;
    private static final long INIT_BIT_TRUNCATE_BRANCH_PERCENTAGE = 0x2L;
    private static final long INIT_BIT_TRANSACTION_TYPE = 0x4L;
    private static final long INIT_BIT_FROM = 0x8L;
    private static final long INIT_BIT_TO = 0x10L;
    private long initBits = 0x1fL;

    private boolean auxiliary;
    private ImmutableList.Builder<String> include = ImmutableList.builder();
    private ImmutableList.Builder<String> exclude = ImmutableList.builder();
    private double truncateBranchPercentage;
    private @Nullable String transactionType;
    private @Nullable String transactionName;
    private long from;
    private long to;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code org.glowroot.agent.shaded.glowroot.ui.TransactionJsonService.TransactionProfileRequest} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(TransactionJsonService.TransactionProfileRequest instance) {
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
      if (object instanceof TransactionJsonService.TransactionProfileRequest) {
        TransactionJsonService.TransactionProfileRequest instance = (TransactionJsonService.TransactionProfileRequest) object;
        addAllInclude(instance.include());
        addAllExclude(instance.exclude());
        truncateBranchPercentage(instance.truncateBranchPercentage());
        auxiliary(instance.auxiliary());
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
     * Initializes the value for the {@link TransactionJsonService.TransactionProfileRequest#auxiliary() auxiliary} attribute.
     * @param auxiliary The value for auxiliary 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder auxiliary(boolean auxiliary) {
      this.auxiliary = auxiliary;
      initBits &= ~INIT_BIT_AUXILIARY;
      return this;
    }

    /**
     * Adds one element to {@link TransactionJsonService.TransactionProfileRequest#include() include} list.
     * @param element A include element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addInclude(String element) {
      this.include.add(element);
      return this;
    }

    /**
     * Adds elements to {@link TransactionJsonService.TransactionProfileRequest#include() include} list.
     * @param elements An array of include elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addInclude(String... elements) {
      this.include.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link TransactionJsonService.TransactionProfileRequest#include() include} list.
     * @param elements An iterable of include elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder include(Iterable<String> elements) {
      this.include = ImmutableList.builder();
      return addAllInclude(elements);
    }

    /**
     * Adds elements to {@link TransactionJsonService.TransactionProfileRequest#include() include} list.
     * @param elements An iterable of include elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllInclude(Iterable<String> elements) {
      this.include.addAll(elements);
      return this;
    }

    /**
     * Adds one element to {@link TransactionJsonService.TransactionProfileRequest#exclude() exclude} list.
     * @param element A exclude element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addExclude(String element) {
      this.exclude.add(element);
      return this;
    }

    /**
     * Adds elements to {@link TransactionJsonService.TransactionProfileRequest#exclude() exclude} list.
     * @param elements An array of exclude elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addExclude(String... elements) {
      this.exclude.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link TransactionJsonService.TransactionProfileRequest#exclude() exclude} list.
     * @param elements An iterable of exclude elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder exclude(Iterable<String> elements) {
      this.exclude = ImmutableList.builder();
      return addAllExclude(elements);
    }

    /**
     * Adds elements to {@link TransactionJsonService.TransactionProfileRequest#exclude() exclude} list.
     * @param elements An iterable of exclude elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllExclude(Iterable<String> elements) {
      this.exclude.addAll(elements);
      return this;
    }

    /**
     * Initializes the value for the {@link TransactionJsonService.TransactionProfileRequest#truncateBranchPercentage() truncateBranchPercentage} attribute.
     * @param truncateBranchPercentage The value for truncateBranchPercentage 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder truncateBranchPercentage(double truncateBranchPercentage) {
      this.truncateBranchPercentage = truncateBranchPercentage;
      initBits &= ~INIT_BIT_TRUNCATE_BRANCH_PERCENTAGE;
      return this;
    }

    /**
     * Initializes the value for the {@link TransactionJsonService.TransactionProfileRequest#transactionType() transactionType} attribute.
     * @param transactionType The value for transactionType 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder transactionType(String transactionType) {
      this.transactionType = Preconditions.checkNotNull(transactionType, "transactionType");
      initBits &= ~INIT_BIT_TRANSACTION_TYPE;
      return this;
    }

    /**
     * Initializes the value for the {@link TransactionJsonService.TransactionProfileRequest#transactionName() transactionName} attribute.
     * @param transactionName The value for transactionName (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder transactionName(@Nullable String transactionName) {
      this.transactionName = transactionName;
      return this;
    }

    /**
     * Initializes the value for the {@link TransactionJsonService.TransactionProfileRequest#from() from} attribute.
     * @param from The value for from 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(long from) {
      this.from = from;
      initBits &= ~INIT_BIT_FROM;
      return this;
    }

    /**
     * Initializes the value for the {@link TransactionJsonService.TransactionProfileRequest#to() to} attribute.
     * @param to The value for to 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder to(long to) {
      this.to = to;
      initBits &= ~INIT_BIT_TO;
      return this;
    }

    /**
     * Builds a new {@link ImmutableTransactionProfileRequest ImmutableTransactionProfileRequest}.
     * @return An immutable instance of TransactionProfileRequest
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableTransactionProfileRequest build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableTransactionProfileRequest(
          auxiliary,
          include.build(),
          exclude.build(),
          truncateBranchPercentage,
          transactionType,
          transactionName,
          from,
          to);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_AUXILIARY) != 0) attributes.add("auxiliary");
      if ((initBits & INIT_BIT_TRUNCATE_BRANCH_PERCENTAGE) != 0) attributes.add("truncateBranchPercentage");
      if ((initBits & INIT_BIT_TRANSACTION_TYPE) != 0) attributes.add("transactionType");
      if ((initBits & INIT_BIT_FROM) != 0) attributes.add("from");
      if ((initBits & INIT_BIT_TO) != 0) attributes.add("to");
      return "Cannot build TransactionProfileRequest, some of required attributes are not set " + attributes;
    }
  }
}
