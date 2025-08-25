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

/**
 * Immutable implementation of {@link ErrorJsonService.ErrorMessageRequest}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableErrorMessageRequest.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "ErrorJsonService.ErrorMessageRequest"})
@Immutable
final class ImmutableErrorMessageRequest
    implements ErrorJsonService.ErrorMessageRequest {
  private final String transactionType;
  private final @Nullable String transactionName;
  private final long from;
  private final long to;
  private final ImmutableList<String> include;
  private final ImmutableList<String> exclude;
  private final int errorMessageLimit;

  private ImmutableErrorMessageRequest(
      String transactionType,
      @Nullable String transactionName,
      long from,
      long to,
      ImmutableList<String> include,
      ImmutableList<String> exclude,
      int errorMessageLimit) {
    this.transactionType = transactionType;
    this.transactionName = transactionName;
    this.from = from;
    this.to = to;
    this.include = include;
    this.exclude = exclude;
    this.errorMessageLimit = errorMessageLimit;
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
   * @return The value of the {@code errorMessageLimit} attribute
   */
  @JsonProperty("errorMessageLimit")
  @Override
  public int errorMessageLimit() {
    return errorMessageLimit;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ErrorJsonService.ErrorMessageRequest#transactionType() transactionType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for transactionType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableErrorMessageRequest withTransactionType(String value) {
    if (this.transactionType.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "transactionType");
    return new ImmutableErrorMessageRequest(
        newValue,
        this.transactionName,
        this.from,
        this.to,
        this.include,
        this.exclude,
        this.errorMessageLimit);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ErrorJsonService.ErrorMessageRequest#transactionName() transactionName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for transactionName (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableErrorMessageRequest withTransactionName(@Nullable String value) {
    if (Objects.equal(this.transactionName, value)) return this;
    return new ImmutableErrorMessageRequest(
        this.transactionType,
        value,
        this.from,
        this.to,
        this.include,
        this.exclude,
        this.errorMessageLimit);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ErrorJsonService.ErrorMessageRequest#from() from} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for from
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableErrorMessageRequest withFrom(long value) {
    if (this.from == value) return this;
    return new ImmutableErrorMessageRequest(
        this.transactionType,
        this.transactionName,
        value,
        this.to,
        this.include,
        this.exclude,
        this.errorMessageLimit);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ErrorJsonService.ErrorMessageRequest#to() to} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for to
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableErrorMessageRequest withTo(long value) {
    if (this.to == value) return this;
    return new ImmutableErrorMessageRequest(
        this.transactionType,
        this.transactionName,
        this.from,
        value,
        this.include,
        this.exclude,
        this.errorMessageLimit);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ErrorJsonService.ErrorMessageRequest#include() include}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableErrorMessageRequest withInclude(String... elements) {
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableErrorMessageRequest(
        this.transactionType,
        this.transactionName,
        this.from,
        this.to,
        newValue,
        this.exclude,
        this.errorMessageLimit);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ErrorJsonService.ErrorMessageRequest#include() include}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of include elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableErrorMessageRequest withInclude(Iterable<String> elements) {
    if (this.include == elements) return this;
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableErrorMessageRequest(
        this.transactionType,
        this.transactionName,
        this.from,
        this.to,
        newValue,
        this.exclude,
        this.errorMessageLimit);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ErrorJsonService.ErrorMessageRequest#exclude() exclude}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableErrorMessageRequest withExclude(String... elements) {
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableErrorMessageRequest(
        this.transactionType,
        this.transactionName,
        this.from,
        this.to,
        this.include,
        newValue,
        this.errorMessageLimit);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ErrorJsonService.ErrorMessageRequest#exclude() exclude}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of exclude elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableErrorMessageRequest withExclude(Iterable<String> elements) {
    if (this.exclude == elements) return this;
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableErrorMessageRequest(
        this.transactionType,
        this.transactionName,
        this.from,
        this.to,
        this.include,
        newValue,
        this.errorMessageLimit);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ErrorJsonService.ErrorMessageRequest#errorMessageLimit() errorMessageLimit} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for errorMessageLimit
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableErrorMessageRequest withErrorMessageLimit(int value) {
    if (this.errorMessageLimit == value) return this;
    return new ImmutableErrorMessageRequest(
        this.transactionType,
        this.transactionName,
        this.from,
        this.to,
        this.include,
        this.exclude,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableErrorMessageRequest} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableErrorMessageRequest
        && equalTo((ImmutableErrorMessageRequest) another);
  }

  private boolean equalTo(ImmutableErrorMessageRequest another) {
    return transactionType.equals(another.transactionType)
        && Objects.equal(transactionName, another.transactionName)
        && from == another.from
        && to == another.to
        && include.equals(another.include)
        && exclude.equals(another.exclude)
        && errorMessageLimit == another.errorMessageLimit;
  }

  /**
   * Computes a hash code from attributes: {@code transactionType}, {@code transactionName}, {@code from}, {@code to}, {@code include}, {@code exclude}, {@code errorMessageLimit}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + transactionType.hashCode();
    h += (h << 5) + Objects.hashCode(transactionName);
    h += (h << 5) + Longs.hashCode(from);
    h += (h << 5) + Longs.hashCode(to);
    h += (h << 5) + include.hashCode();
    h += (h << 5) + exclude.hashCode();
    h += (h << 5) + errorMessageLimit;
    return h;
  }

  /**
   * Prints the immutable value {@code ErrorMessageRequest} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("ErrorMessageRequest")
        .omitNullValues()
        .add("transactionType", transactionType)
        .add("transactionName", transactionName)
        .add("from", from)
        .add("to", to)
        .add("include", include)
        .add("exclude", exclude)
        .add("errorMessageLimit", errorMessageLimit)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ErrorJsonService.ErrorMessageRequest {
    @Nullable String transactionType;
    @Nullable String transactionName;
    long from;
    boolean fromIsSet;
    long to;
    boolean toIsSet;
    ImmutableList<String> include = ImmutableList.of();
    ImmutableList<String> exclude = ImmutableList.of();
    int errorMessageLimit;
    boolean errorMessageLimitIsSet;
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
    @JsonProperty("include")
    public void setInclude(ImmutableList<String> include) {
      this.include = include;
    }
    @JsonProperty("exclude")
    public void setExclude(ImmutableList<String> exclude) {
      this.exclude = exclude;
    }
    @JsonProperty("errorMessageLimit")
    public void setErrorMessageLimit(int errorMessageLimit) {
      this.errorMessageLimit = errorMessageLimit;
      this.errorMessageLimitIsSet = true;
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
    public ImmutableList<String> include() { throw new UnsupportedOperationException(); }
    @Override
    public ImmutableList<String> exclude() { throw new UnsupportedOperationException(); }
    @Override
    public int errorMessageLimit() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableErrorMessageRequest fromJson(Json json) {
    ImmutableErrorMessageRequest.Builder builder = ImmutableErrorMessageRequest.builder();
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
    if (json.include != null) {
      builder.addAllInclude(json.include);
    }
    if (json.exclude != null) {
      builder.addAllExclude(json.exclude);
    }
    if (json.errorMessageLimitIsSet) {
      builder.errorMessageLimit(json.errorMessageLimit);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ErrorJsonService.ErrorMessageRequest} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ErrorMessageRequest instance
   */
  public static ImmutableErrorMessageRequest copyOf(ErrorJsonService.ErrorMessageRequest instance) {
    if (instance instanceof ImmutableErrorMessageRequest) {
      return (ImmutableErrorMessageRequest) instance;
    }
    return ImmutableErrorMessageRequest.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableErrorMessageRequest ImmutableErrorMessageRequest}.
   * @return A new ImmutableErrorMessageRequest builder
   */
  public static ImmutableErrorMessageRequest.Builder builder() {
    return new ImmutableErrorMessageRequest.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableErrorMessageRequest ImmutableErrorMessageRequest}.
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
    private static final long INIT_BIT_ERROR_MESSAGE_LIMIT = 0x8L;
    private long initBits = 0xfL;

    private @Nullable String transactionType;
    private @Nullable String transactionName;
    private long from;
    private long to;
    private ImmutableList.Builder<String> include = ImmutableList.builder();
    private ImmutableList.Builder<String> exclude = ImmutableList.builder();
    private int errorMessageLimit;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code ErrorMessageRequest} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(ErrorJsonService.ErrorMessageRequest instance) {
      Preconditions.checkNotNull(instance, "instance");
      transactionType(instance.transactionType());
      @Nullable String transactionNameValue = instance.transactionName();
      if (transactionNameValue != null) {
        transactionName(transactionNameValue);
      }
      from(instance.from());
      to(instance.to());
      addAllInclude(instance.include());
      addAllExclude(instance.exclude());
      errorMessageLimit(instance.errorMessageLimit());
      return this;
    }

    /**
     * Initializes the value for the {@link ErrorJsonService.ErrorMessageRequest#transactionType() transactionType} attribute.
     * @param transactionType The value for transactionType 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder transactionType(String transactionType) {
      this.transactionType = Preconditions.checkNotNull(transactionType, "transactionType");
      initBits &= ~INIT_BIT_TRANSACTION_TYPE;
      return this;
    }

    /**
     * Initializes the value for the {@link ErrorJsonService.ErrorMessageRequest#transactionName() transactionName} attribute.
     * @param transactionName The value for transactionName (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder transactionName(@Nullable String transactionName) {
      this.transactionName = transactionName;
      return this;
    }

    /**
     * Initializes the value for the {@link ErrorJsonService.ErrorMessageRequest#from() from} attribute.
     * @param from The value for from 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(long from) {
      this.from = from;
      initBits &= ~INIT_BIT_FROM;
      return this;
    }

    /**
     * Initializes the value for the {@link ErrorJsonService.ErrorMessageRequest#to() to} attribute.
     * @param to The value for to 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder to(long to) {
      this.to = to;
      initBits &= ~INIT_BIT_TO;
      return this;
    }

    /**
     * Adds one element to {@link ErrorJsonService.ErrorMessageRequest#include() include} list.
     * @param element A include element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addInclude(String element) {
      this.include.add(element);
      return this;
    }

    /**
     * Adds elements to {@link ErrorJsonService.ErrorMessageRequest#include() include} list.
     * @param elements An array of include elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addInclude(String... elements) {
      this.include.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link ErrorJsonService.ErrorMessageRequest#include() include} list.
     * @param elements An iterable of include elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder include(Iterable<String> elements) {
      this.include = ImmutableList.builder();
      return addAllInclude(elements);
    }

    /**
     * Adds elements to {@link ErrorJsonService.ErrorMessageRequest#include() include} list.
     * @param elements An iterable of include elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllInclude(Iterable<String> elements) {
      this.include.addAll(elements);
      return this;
    }

    /**
     * Adds one element to {@link ErrorJsonService.ErrorMessageRequest#exclude() exclude} list.
     * @param element A exclude element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addExclude(String element) {
      this.exclude.add(element);
      return this;
    }

    /**
     * Adds elements to {@link ErrorJsonService.ErrorMessageRequest#exclude() exclude} list.
     * @param elements An array of exclude elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addExclude(String... elements) {
      this.exclude.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link ErrorJsonService.ErrorMessageRequest#exclude() exclude} list.
     * @param elements An iterable of exclude elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder exclude(Iterable<String> elements) {
      this.exclude = ImmutableList.builder();
      return addAllExclude(elements);
    }

    /**
     * Adds elements to {@link ErrorJsonService.ErrorMessageRequest#exclude() exclude} list.
     * @param elements An iterable of exclude elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllExclude(Iterable<String> elements) {
      this.exclude.addAll(elements);
      return this;
    }

    /**
     * Initializes the value for the {@link ErrorJsonService.ErrorMessageRequest#errorMessageLimit() errorMessageLimit} attribute.
     * @param errorMessageLimit The value for errorMessageLimit 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder errorMessageLimit(int errorMessageLimit) {
      this.errorMessageLimit = errorMessageLimit;
      initBits &= ~INIT_BIT_ERROR_MESSAGE_LIMIT;
      return this;
    }

    /**
     * Builds a new {@link ImmutableErrorMessageRequest ImmutableErrorMessageRequest}.
     * @return An immutable instance of ErrorMessageRequest
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableErrorMessageRequest build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableErrorMessageRequest(
          transactionType,
          transactionName,
          from,
          to,
          include.build(),
          exclude.build(),
          errorMessageLimit);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_TRANSACTION_TYPE) != 0) attributes.add("transactionType");
      if ((initBits & INIT_BIT_FROM) != 0) attributes.add("from");
      if ((initBits & INIT_BIT_TO) != 0) attributes.add("to");
      if ((initBits & INIT_BIT_ERROR_MESSAGE_LIMIT) != 0) attributes.add("errorMessageLimit");
      return "Cannot build ErrorMessageRequest, some of required attributes are not set " + attributes;
    }
  }
}
