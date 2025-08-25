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
import org.glowroot.agent.shaded.glowroot.common.live.StringComparator;

/**
 * Immutable implementation of {@link TracePointJsonService.TracePointRequest}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTracePointRequest.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "TracePointJsonService.TracePointRequest"})
@Immutable
public final class ImmutableTracePointRequest extends TracePointJsonService.TracePointRequest {
  private final String transactionType;
  private final @Nullable String transactionName;
  private final long from;
  private final long to;
  private final @Nullable StringComparator headlineComparator;
  private final @Nullable String headline;
  private final @Nullable StringComparator errorMessageComparator;
  private final @Nullable String errorMessage;
  private final @Nullable StringComparator userComparator;
  private final @Nullable String user;
  private final @Nullable String attributeName;
  private final @Nullable StringComparator attributeValueComparator;
  private final @Nullable String attributeValue;
  private final int limit;

  private ImmutableTracePointRequest(
      String transactionType,
      @Nullable String transactionName,
      long from,
      long to,
      @Nullable StringComparator headlineComparator,
      @Nullable String headline,
      @Nullable StringComparator errorMessageComparator,
      @Nullable String errorMessage,
      @Nullable StringComparator userComparator,
      @Nullable String user,
      @Nullable String attributeName,
      @Nullable StringComparator attributeValueComparator,
      @Nullable String attributeValue,
      int limit) {
    this.transactionType = transactionType;
    this.transactionName = transactionName;
    this.from = from;
    this.to = to;
    this.headlineComparator = headlineComparator;
    this.headline = headline;
    this.errorMessageComparator = errorMessageComparator;
    this.errorMessage = errorMessage;
    this.userComparator = userComparator;
    this.user = user;
    this.attributeName = attributeName;
    this.attributeValueComparator = attributeValueComparator;
    this.attributeValue = attributeValue;
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
   * @return The value of the {@code headlineComparator} attribute
   */
  @JsonProperty("headlineComparator")
  @Override
  public @Nullable StringComparator headlineComparator() {
    return headlineComparator;
  }

  /**
   * @return The value of the {@code headline} attribute
   */
  @JsonProperty("headline")
  @Override
  public @Nullable String headline() {
    return headline;
  }

  /**
   * @return The value of the {@code errorMessageComparator} attribute
   */
  @JsonProperty("errorMessageComparator")
  @Override
  public @Nullable StringComparator errorMessageComparator() {
    return errorMessageComparator;
  }

  /**
   * @return The value of the {@code errorMessage} attribute
   */
  @JsonProperty("errorMessage")
  @Override
  public @Nullable String errorMessage() {
    return errorMessage;
  }

  /**
   * @return The value of the {@code userComparator} attribute
   */
  @JsonProperty("userComparator")
  @Override
  public @Nullable StringComparator userComparator() {
    return userComparator;
  }

  /**
   * @return The value of the {@code user} attribute
   */
  @JsonProperty("user")
  @Override
  public @Nullable String user() {
    return user;
  }

  /**
   * @return The value of the {@code attributeName} attribute
   */
  @JsonProperty("attributeName")
  @Override
  public @Nullable String attributeName() {
    return attributeName;
  }

  /**
   * @return The value of the {@code attributeValueComparator} attribute
   */
  @JsonProperty("attributeValueComparator")
  @Override
  public @Nullable StringComparator attributeValueComparator() {
    return attributeValueComparator;
  }

  /**
   * @return The value of the {@code attributeValue} attribute
   */
  @JsonProperty("attributeValue")
  @Override
  public @Nullable String attributeValue() {
    return attributeValue;
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
   * Copy the current immutable object by setting a value for the {@link TracePointJsonService.TracePointRequest#transactionType() transactionType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for transactionType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTracePointRequest withTransactionType(String value) {
    if (this.transactionType.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "transactionType");
    return new ImmutableTracePointRequest(
        newValue,
        this.transactionName,
        this.from,
        this.to,
        this.headlineComparator,
        this.headline,
        this.errorMessageComparator,
        this.errorMessage,
        this.userComparator,
        this.user,
        this.attributeName,
        this.attributeValueComparator,
        this.attributeValue,
        this.limit);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TracePointJsonService.TracePointRequest#transactionName() transactionName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for transactionName (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTracePointRequest withTransactionName(@Nullable String value) {
    if (Objects.equal(this.transactionName, value)) return this;
    return new ImmutableTracePointRequest(
        this.transactionType,
        value,
        this.from,
        this.to,
        this.headlineComparator,
        this.headline,
        this.errorMessageComparator,
        this.errorMessage,
        this.userComparator,
        this.user,
        this.attributeName,
        this.attributeValueComparator,
        this.attributeValue,
        this.limit);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TracePointJsonService.TracePointRequest#from() from} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for from
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTracePointRequest withFrom(long value) {
    if (this.from == value) return this;
    return new ImmutableTracePointRequest(
        this.transactionType,
        this.transactionName,
        value,
        this.to,
        this.headlineComparator,
        this.headline,
        this.errorMessageComparator,
        this.errorMessage,
        this.userComparator,
        this.user,
        this.attributeName,
        this.attributeValueComparator,
        this.attributeValue,
        this.limit);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TracePointJsonService.TracePointRequest#to() to} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for to
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTracePointRequest withTo(long value) {
    if (this.to == value) return this;
    return new ImmutableTracePointRequest(
        this.transactionType,
        this.transactionName,
        this.from,
        value,
        this.headlineComparator,
        this.headline,
        this.errorMessageComparator,
        this.errorMessage,
        this.userComparator,
        this.user,
        this.attributeName,
        this.attributeValueComparator,
        this.attributeValue,
        this.limit);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TracePointJsonService.TracePointRequest#headlineComparator() headlineComparator} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for headlineComparator (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTracePointRequest withHeadlineComparator(@Nullable StringComparator value) {
    if (this.headlineComparator == value) return this;
    return new ImmutableTracePointRequest(
        this.transactionType,
        this.transactionName,
        this.from,
        this.to,
        value,
        this.headline,
        this.errorMessageComparator,
        this.errorMessage,
        this.userComparator,
        this.user,
        this.attributeName,
        this.attributeValueComparator,
        this.attributeValue,
        this.limit);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TracePointJsonService.TracePointRequest#headline() headline} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for headline (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTracePointRequest withHeadline(@Nullable String value) {
    if (Objects.equal(this.headline, value)) return this;
    return new ImmutableTracePointRequest(
        this.transactionType,
        this.transactionName,
        this.from,
        this.to,
        this.headlineComparator,
        value,
        this.errorMessageComparator,
        this.errorMessage,
        this.userComparator,
        this.user,
        this.attributeName,
        this.attributeValueComparator,
        this.attributeValue,
        this.limit);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TracePointJsonService.TracePointRequest#errorMessageComparator() errorMessageComparator} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for errorMessageComparator (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTracePointRequest withErrorMessageComparator(@Nullable StringComparator value) {
    if (this.errorMessageComparator == value) return this;
    return new ImmutableTracePointRequest(
        this.transactionType,
        this.transactionName,
        this.from,
        this.to,
        this.headlineComparator,
        this.headline,
        value,
        this.errorMessage,
        this.userComparator,
        this.user,
        this.attributeName,
        this.attributeValueComparator,
        this.attributeValue,
        this.limit);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TracePointJsonService.TracePointRequest#errorMessage() errorMessage} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for errorMessage (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTracePointRequest withErrorMessage(@Nullable String value) {
    if (Objects.equal(this.errorMessage, value)) return this;
    return new ImmutableTracePointRequest(
        this.transactionType,
        this.transactionName,
        this.from,
        this.to,
        this.headlineComparator,
        this.headline,
        this.errorMessageComparator,
        value,
        this.userComparator,
        this.user,
        this.attributeName,
        this.attributeValueComparator,
        this.attributeValue,
        this.limit);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TracePointJsonService.TracePointRequest#userComparator() userComparator} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for userComparator (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTracePointRequest withUserComparator(@Nullable StringComparator value) {
    if (this.userComparator == value) return this;
    return new ImmutableTracePointRequest(
        this.transactionType,
        this.transactionName,
        this.from,
        this.to,
        this.headlineComparator,
        this.headline,
        this.errorMessageComparator,
        this.errorMessage,
        value,
        this.user,
        this.attributeName,
        this.attributeValueComparator,
        this.attributeValue,
        this.limit);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TracePointJsonService.TracePointRequest#user() user} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for user (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTracePointRequest withUser(@Nullable String value) {
    if (Objects.equal(this.user, value)) return this;
    return new ImmutableTracePointRequest(
        this.transactionType,
        this.transactionName,
        this.from,
        this.to,
        this.headlineComparator,
        this.headline,
        this.errorMessageComparator,
        this.errorMessage,
        this.userComparator,
        value,
        this.attributeName,
        this.attributeValueComparator,
        this.attributeValue,
        this.limit);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TracePointJsonService.TracePointRequest#attributeName() attributeName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for attributeName (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTracePointRequest withAttributeName(@Nullable String value) {
    if (Objects.equal(this.attributeName, value)) return this;
    return new ImmutableTracePointRequest(
        this.transactionType,
        this.transactionName,
        this.from,
        this.to,
        this.headlineComparator,
        this.headline,
        this.errorMessageComparator,
        this.errorMessage,
        this.userComparator,
        this.user,
        value,
        this.attributeValueComparator,
        this.attributeValue,
        this.limit);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TracePointJsonService.TracePointRequest#attributeValueComparator() attributeValueComparator} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for attributeValueComparator (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTracePointRequest withAttributeValueComparator(@Nullable StringComparator value) {
    if (this.attributeValueComparator == value) return this;
    return new ImmutableTracePointRequest(
        this.transactionType,
        this.transactionName,
        this.from,
        this.to,
        this.headlineComparator,
        this.headline,
        this.errorMessageComparator,
        this.errorMessage,
        this.userComparator,
        this.user,
        this.attributeName,
        value,
        this.attributeValue,
        this.limit);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TracePointJsonService.TracePointRequest#attributeValue() attributeValue} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for attributeValue (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTracePointRequest withAttributeValue(@Nullable String value) {
    if (Objects.equal(this.attributeValue, value)) return this;
    return new ImmutableTracePointRequest(
        this.transactionType,
        this.transactionName,
        this.from,
        this.to,
        this.headlineComparator,
        this.headline,
        this.errorMessageComparator,
        this.errorMessage,
        this.userComparator,
        this.user,
        this.attributeName,
        this.attributeValueComparator,
        value,
        this.limit);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TracePointJsonService.TracePointRequest#limit() limit} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for limit
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTracePointRequest withLimit(int value) {
    if (this.limit == value) return this;
    return new ImmutableTracePointRequest(
        this.transactionType,
        this.transactionName,
        this.from,
        this.to,
        this.headlineComparator,
        this.headline,
        this.errorMessageComparator,
        this.errorMessage,
        this.userComparator,
        this.user,
        this.attributeName,
        this.attributeValueComparator,
        this.attributeValue,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTracePointRequest} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTracePointRequest
        && equalTo((ImmutableTracePointRequest) another);
  }

  private boolean equalTo(ImmutableTracePointRequest another) {
    return transactionType.equals(another.transactionType)
        && Objects.equal(transactionName, another.transactionName)
        && from == another.from
        && to == another.to
        && Objects.equal(headlineComparator, another.headlineComparator)
        && Objects.equal(headline, another.headline)
        && Objects.equal(errorMessageComparator, another.errorMessageComparator)
        && Objects.equal(errorMessage, another.errorMessage)
        && Objects.equal(userComparator, another.userComparator)
        && Objects.equal(user, another.user)
        && Objects.equal(attributeName, another.attributeName)
        && Objects.equal(attributeValueComparator, another.attributeValueComparator)
        && Objects.equal(attributeValue, another.attributeValue)
        && limit == another.limit;
  }

  /**
   * Computes a hash code from attributes: {@code transactionType}, {@code transactionName}, {@code from}, {@code to}, {@code headlineComparator}, {@code headline}, {@code errorMessageComparator}, {@code errorMessage}, {@code userComparator}, {@code user}, {@code attributeName}, {@code attributeValueComparator}, {@code attributeValue}, {@code limit}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + transactionType.hashCode();
    h += (h << 5) + Objects.hashCode(transactionName);
    h += (h << 5) + Longs.hashCode(from);
    h += (h << 5) + Longs.hashCode(to);
    h += (h << 5) + Objects.hashCode(headlineComparator);
    h += (h << 5) + Objects.hashCode(headline);
    h += (h << 5) + Objects.hashCode(errorMessageComparator);
    h += (h << 5) + Objects.hashCode(errorMessage);
    h += (h << 5) + Objects.hashCode(userComparator);
    h += (h << 5) + Objects.hashCode(user);
    h += (h << 5) + Objects.hashCode(attributeName);
    h += (h << 5) + Objects.hashCode(attributeValueComparator);
    h += (h << 5) + Objects.hashCode(attributeValue);
    h += (h << 5) + limit;
    return h;
  }

  /**
   * Prints the immutable value {@code TracePointRequest} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("TracePointRequest")
        .omitNullValues()
        .add("transactionType", transactionType)
        .add("transactionName", transactionName)
        .add("from", from)
        .add("to", to)
        .add("headlineComparator", headlineComparator)
        .add("headline", headline)
        .add("errorMessageComparator", errorMessageComparator)
        .add("errorMessage", errorMessage)
        .add("userComparator", userComparator)
        .add("user", user)
        .add("attributeName", attributeName)
        .add("attributeValueComparator", attributeValueComparator)
        .add("attributeValue", attributeValue)
        .add("limit", limit)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends TracePointJsonService.TracePointRequest {
    @Nullable String transactionType;
    @Nullable String transactionName;
    long from;
    boolean fromIsSet;
    long to;
    boolean toIsSet;
    @Nullable StringComparator headlineComparator;
    @Nullable String headline;
    @Nullable StringComparator errorMessageComparator;
    @Nullable String errorMessage;
    @Nullable StringComparator userComparator;
    @Nullable String user;
    @Nullable String attributeName;
    @Nullable StringComparator attributeValueComparator;
    @Nullable String attributeValue;
    int limit;
    boolean limitIsSet;
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
    @JsonProperty("headlineComparator")
    public void setHeadlineComparator(@Nullable StringComparator headlineComparator) {
      this.headlineComparator = headlineComparator;
    }
    @JsonProperty("headline")
    public void setHeadline(@Nullable String headline) {
      this.headline = headline;
    }
    @JsonProperty("errorMessageComparator")
    public void setErrorMessageComparator(@Nullable StringComparator errorMessageComparator) {
      this.errorMessageComparator = errorMessageComparator;
    }
    @JsonProperty("errorMessage")
    public void setErrorMessage(@Nullable String errorMessage) {
      this.errorMessage = errorMessage;
    }
    @JsonProperty("userComparator")
    public void setUserComparator(@Nullable StringComparator userComparator) {
      this.userComparator = userComparator;
    }
    @JsonProperty("user")
    public void setUser(@Nullable String user) {
      this.user = user;
    }
    @JsonProperty("attributeName")
    public void setAttributeName(@Nullable String attributeName) {
      this.attributeName = attributeName;
    }
    @JsonProperty("attributeValueComparator")
    public void setAttributeValueComparator(@Nullable StringComparator attributeValueComparator) {
      this.attributeValueComparator = attributeValueComparator;
    }
    @JsonProperty("attributeValue")
    public void setAttributeValue(@Nullable String attributeValue) {
      this.attributeValue = attributeValue;
    }
    @JsonProperty("limit")
    public void setLimit(int limit) {
      this.limit = limit;
      this.limitIsSet = true;
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
    public StringComparator headlineComparator() { throw new UnsupportedOperationException(); }
    @Override
    public String headline() { throw new UnsupportedOperationException(); }
    @Override
    public StringComparator errorMessageComparator() { throw new UnsupportedOperationException(); }
    @Override
    public String errorMessage() { throw new UnsupportedOperationException(); }
    @Override
    public StringComparator userComparator() { throw new UnsupportedOperationException(); }
    @Override
    public String user() { throw new UnsupportedOperationException(); }
    @Override
    public String attributeName() { throw new UnsupportedOperationException(); }
    @Override
    public StringComparator attributeValueComparator() { throw new UnsupportedOperationException(); }
    @Override
    public String attributeValue() { throw new UnsupportedOperationException(); }
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
  static ImmutableTracePointRequest fromJson(Json json) {
    ImmutableTracePointRequest.Builder builder = ImmutableTracePointRequest.builder();
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
    if (json.headlineComparator != null) {
      builder.headlineComparator(json.headlineComparator);
    }
    if (json.headline != null) {
      builder.headline(json.headline);
    }
    if (json.errorMessageComparator != null) {
      builder.errorMessageComparator(json.errorMessageComparator);
    }
    if (json.errorMessage != null) {
      builder.errorMessage(json.errorMessage);
    }
    if (json.userComparator != null) {
      builder.userComparator(json.userComparator);
    }
    if (json.user != null) {
      builder.user(json.user);
    }
    if (json.attributeName != null) {
      builder.attributeName(json.attributeName);
    }
    if (json.attributeValueComparator != null) {
      builder.attributeValueComparator(json.attributeValueComparator);
    }
    if (json.attributeValue != null) {
      builder.attributeValue(json.attributeValue);
    }
    if (json.limitIsSet) {
      builder.limit(json.limit);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link TracePointJsonService.TracePointRequest} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable TracePointRequest instance
   */
  public static ImmutableTracePointRequest copyOf(TracePointJsonService.TracePointRequest instance) {
    if (instance instanceof ImmutableTracePointRequest) {
      return (ImmutableTracePointRequest) instance;
    }
    return ImmutableTracePointRequest.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableTracePointRequest ImmutableTracePointRequest}.
   * @return A new ImmutableTracePointRequest builder
   */
  public static ImmutableTracePointRequest.Builder builder() {
    return new ImmutableTracePointRequest.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableTracePointRequest ImmutableTracePointRequest}.
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
    private static final long INIT_BIT_LIMIT = 0x8L;
    private long initBits = 0xfL;

    private @Nullable String transactionType;
    private @Nullable String transactionName;
    private long from;
    private long to;
    private @Nullable StringComparator headlineComparator;
    private @Nullable String headline;
    private @Nullable StringComparator errorMessageComparator;
    private @Nullable String errorMessage;
    private @Nullable StringComparator userComparator;
    private @Nullable String user;
    private @Nullable String attributeName;
    private @Nullable StringComparator attributeValueComparator;
    private @Nullable String attributeValue;
    private int limit;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code TracePointRequest} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(TracePointJsonService.TracePointRequest instance) {
      Preconditions.checkNotNull(instance, "instance");
      transactionType(instance.transactionType());
      @Nullable String transactionNameValue = instance.transactionName();
      if (transactionNameValue != null) {
        transactionName(transactionNameValue);
      }
      from(instance.from());
      to(instance.to());
      @Nullable StringComparator headlineComparatorValue = instance.headlineComparator();
      if (headlineComparatorValue != null) {
        headlineComparator(headlineComparatorValue);
      }
      @Nullable String headlineValue = instance.headline();
      if (headlineValue != null) {
        headline(headlineValue);
      }
      @Nullable StringComparator errorMessageComparatorValue = instance.errorMessageComparator();
      if (errorMessageComparatorValue != null) {
        errorMessageComparator(errorMessageComparatorValue);
      }
      @Nullable String errorMessageValue = instance.errorMessage();
      if (errorMessageValue != null) {
        errorMessage(errorMessageValue);
      }
      @Nullable StringComparator userComparatorValue = instance.userComparator();
      if (userComparatorValue != null) {
        userComparator(userComparatorValue);
      }
      @Nullable String userValue = instance.user();
      if (userValue != null) {
        user(userValue);
      }
      @Nullable String attributeNameValue = instance.attributeName();
      if (attributeNameValue != null) {
        attributeName(attributeNameValue);
      }
      @Nullable StringComparator attributeValueComparatorValue = instance.attributeValueComparator();
      if (attributeValueComparatorValue != null) {
        attributeValueComparator(attributeValueComparatorValue);
      }
      @Nullable String attributeValueValue = instance.attributeValue();
      if (attributeValueValue != null) {
        attributeValue(attributeValueValue);
      }
      limit(instance.limit());
      return this;
    }

    /**
     * Initializes the value for the {@link TracePointJsonService.TracePointRequest#transactionType() transactionType} attribute.
     * @param transactionType The value for transactionType 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder transactionType(String transactionType) {
      this.transactionType = Preconditions.checkNotNull(transactionType, "transactionType");
      initBits &= ~INIT_BIT_TRANSACTION_TYPE;
      return this;
    }

    /**
     * Initializes the value for the {@link TracePointJsonService.TracePointRequest#transactionName() transactionName} attribute.
     * @param transactionName The value for transactionName (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder transactionName(@Nullable String transactionName) {
      this.transactionName = transactionName;
      return this;
    }

    /**
     * Initializes the value for the {@link TracePointJsonService.TracePointRequest#from() from} attribute.
     * @param from The value for from 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(long from) {
      this.from = from;
      initBits &= ~INIT_BIT_FROM;
      return this;
    }

    /**
     * Initializes the value for the {@link TracePointJsonService.TracePointRequest#to() to} attribute.
     * @param to The value for to 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder to(long to) {
      this.to = to;
      initBits &= ~INIT_BIT_TO;
      return this;
    }

    /**
     * Initializes the value for the {@link TracePointJsonService.TracePointRequest#headlineComparator() headlineComparator} attribute.
     * @param headlineComparator The value for headlineComparator (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder headlineComparator(@Nullable StringComparator headlineComparator) {
      this.headlineComparator = headlineComparator;
      return this;
    }

    /**
     * Initializes the value for the {@link TracePointJsonService.TracePointRequest#headline() headline} attribute.
     * @param headline The value for headline (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder headline(@Nullable String headline) {
      this.headline = headline;
      return this;
    }

    /**
     * Initializes the value for the {@link TracePointJsonService.TracePointRequest#errorMessageComparator() errorMessageComparator} attribute.
     * @param errorMessageComparator The value for errorMessageComparator (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder errorMessageComparator(@Nullable StringComparator errorMessageComparator) {
      this.errorMessageComparator = errorMessageComparator;
      return this;
    }

    /**
     * Initializes the value for the {@link TracePointJsonService.TracePointRequest#errorMessage() errorMessage} attribute.
     * @param errorMessage The value for errorMessage (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder errorMessage(@Nullable String errorMessage) {
      this.errorMessage = errorMessage;
      return this;
    }

    /**
     * Initializes the value for the {@link TracePointJsonService.TracePointRequest#userComparator() userComparator} attribute.
     * @param userComparator The value for userComparator (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder userComparator(@Nullable StringComparator userComparator) {
      this.userComparator = userComparator;
      return this;
    }

    /**
     * Initializes the value for the {@link TracePointJsonService.TracePointRequest#user() user} attribute.
     * @param user The value for user (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder user(@Nullable String user) {
      this.user = user;
      return this;
    }

    /**
     * Initializes the value for the {@link TracePointJsonService.TracePointRequest#attributeName() attributeName} attribute.
     * @param attributeName The value for attributeName (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder attributeName(@Nullable String attributeName) {
      this.attributeName = attributeName;
      return this;
    }

    /**
     * Initializes the value for the {@link TracePointJsonService.TracePointRequest#attributeValueComparator() attributeValueComparator} attribute.
     * @param attributeValueComparator The value for attributeValueComparator (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder attributeValueComparator(@Nullable StringComparator attributeValueComparator) {
      this.attributeValueComparator = attributeValueComparator;
      return this;
    }

    /**
     * Initializes the value for the {@link TracePointJsonService.TracePointRequest#attributeValue() attributeValue} attribute.
     * @param attributeValue The value for attributeValue (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder attributeValue(@Nullable String attributeValue) {
      this.attributeValue = attributeValue;
      return this;
    }

    /**
     * Initializes the value for the {@link TracePointJsonService.TracePointRequest#limit() limit} attribute.
     * @param limit The value for limit 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder limit(int limit) {
      this.limit = limit;
      initBits &= ~INIT_BIT_LIMIT;
      return this;
    }

    /**
     * Builds a new {@link ImmutableTracePointRequest ImmutableTracePointRequest}.
     * @return An immutable instance of TracePointRequest
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableTracePointRequest build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableTracePointRequest(
          transactionType,
          transactionName,
          from,
          to,
          headlineComparator,
          headline,
          errorMessageComparator,
          errorMessage,
          userComparator,
          user,
          attributeName,
          attributeValueComparator,
          attributeValue,
          limit);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_TRANSACTION_TYPE) != 0) attributes.add("transactionType");
      if ((initBits & INIT_BIT_FROM) != 0) attributes.add("from");
      if ((initBits & INIT_BIT_TO) != 0) attributes.add("to");
      if ((initBits & INIT_BIT_LIMIT) != 0) attributes.add("limit");
      return "Cannot build TracePointRequest, some of required attributes are not set " + attributes;
    }
  }
}
