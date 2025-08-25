package org.glowroot.agent.shaded.glowroot.common.live;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Objects;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link LiveTraceRepository.TracePointFilter}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTracePointFilter.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "LiveTraceRepository.TracePointFilter"})
@Immutable
public final class ImmutableTracePointFilter
    extends LiveTraceRepository.TracePointFilter {
  private final @Nullable StringComparator headlineComparator;
  private final @Nullable String headline;
  private final @Nullable StringComparator errorMessageComparator;
  private final @Nullable String errorMessage;
  private final @Nullable StringComparator userComparator;
  private final @Nullable String user;
  private final @Nullable String attributeName;
  private final @Nullable StringComparator attributeValueComparator;
  private final @Nullable String attributeValue;

  private ImmutableTracePointFilter(
      @Nullable StringComparator headlineComparator,
      @Nullable String headline,
      @Nullable StringComparator errorMessageComparator,
      @Nullable String errorMessage,
      @Nullable StringComparator userComparator,
      @Nullable String user,
      @Nullable String attributeName,
      @Nullable StringComparator attributeValueComparator,
      @Nullable String attributeValue) {
    this.headlineComparator = headlineComparator;
    this.headline = headline;
    this.errorMessageComparator = errorMessageComparator;
    this.errorMessage = errorMessage;
    this.userComparator = userComparator;
    this.user = user;
    this.attributeName = attributeName;
    this.attributeValueComparator = attributeValueComparator;
    this.attributeValue = attributeValue;
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
   * Copy the current immutable object by setting a value for the {@link LiveTraceRepository.TracePointFilter#headlineComparator() headlineComparator} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for headlineComparator (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTracePointFilter withHeadlineComparator(@Nullable StringComparator value) {
    if (this.headlineComparator == value) return this;
    return new ImmutableTracePointFilter(
        value,
        this.headline,
        this.errorMessageComparator,
        this.errorMessage,
        this.userComparator,
        this.user,
        this.attributeName,
        this.attributeValueComparator,
        this.attributeValue);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LiveTraceRepository.TracePointFilter#headline() headline} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for headline (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTracePointFilter withHeadline(@Nullable String value) {
    if (Objects.equal(this.headline, value)) return this;
    return new ImmutableTracePointFilter(
        this.headlineComparator,
        value,
        this.errorMessageComparator,
        this.errorMessage,
        this.userComparator,
        this.user,
        this.attributeName,
        this.attributeValueComparator,
        this.attributeValue);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LiveTraceRepository.TracePointFilter#errorMessageComparator() errorMessageComparator} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for errorMessageComparator (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTracePointFilter withErrorMessageComparator(@Nullable StringComparator value) {
    if (this.errorMessageComparator == value) return this;
    return new ImmutableTracePointFilter(
        this.headlineComparator,
        this.headline,
        value,
        this.errorMessage,
        this.userComparator,
        this.user,
        this.attributeName,
        this.attributeValueComparator,
        this.attributeValue);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LiveTraceRepository.TracePointFilter#errorMessage() errorMessage} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for errorMessage (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTracePointFilter withErrorMessage(@Nullable String value) {
    if (Objects.equal(this.errorMessage, value)) return this;
    return new ImmutableTracePointFilter(
        this.headlineComparator,
        this.headline,
        this.errorMessageComparator,
        value,
        this.userComparator,
        this.user,
        this.attributeName,
        this.attributeValueComparator,
        this.attributeValue);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LiveTraceRepository.TracePointFilter#userComparator() userComparator} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for userComparator (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTracePointFilter withUserComparator(@Nullable StringComparator value) {
    if (this.userComparator == value) return this;
    return new ImmutableTracePointFilter(
        this.headlineComparator,
        this.headline,
        this.errorMessageComparator,
        this.errorMessage,
        value,
        this.user,
        this.attributeName,
        this.attributeValueComparator,
        this.attributeValue);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LiveTraceRepository.TracePointFilter#user() user} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for user (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTracePointFilter withUser(@Nullable String value) {
    if (Objects.equal(this.user, value)) return this;
    return new ImmutableTracePointFilter(
        this.headlineComparator,
        this.headline,
        this.errorMessageComparator,
        this.errorMessage,
        this.userComparator,
        value,
        this.attributeName,
        this.attributeValueComparator,
        this.attributeValue);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LiveTraceRepository.TracePointFilter#attributeName() attributeName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for attributeName (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTracePointFilter withAttributeName(@Nullable String value) {
    if (Objects.equal(this.attributeName, value)) return this;
    return new ImmutableTracePointFilter(
        this.headlineComparator,
        this.headline,
        this.errorMessageComparator,
        this.errorMessage,
        this.userComparator,
        this.user,
        value,
        this.attributeValueComparator,
        this.attributeValue);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LiveTraceRepository.TracePointFilter#attributeValueComparator() attributeValueComparator} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for attributeValueComparator (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTracePointFilter withAttributeValueComparator(@Nullable StringComparator value) {
    if (this.attributeValueComparator == value) return this;
    return new ImmutableTracePointFilter(
        this.headlineComparator,
        this.headline,
        this.errorMessageComparator,
        this.errorMessage,
        this.userComparator,
        this.user,
        this.attributeName,
        value,
        this.attributeValue);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LiveTraceRepository.TracePointFilter#attributeValue() attributeValue} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for attributeValue (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTracePointFilter withAttributeValue(@Nullable String value) {
    if (Objects.equal(this.attributeValue, value)) return this;
    return new ImmutableTracePointFilter(
        this.headlineComparator,
        this.headline,
        this.errorMessageComparator,
        this.errorMessage,
        this.userComparator,
        this.user,
        this.attributeName,
        this.attributeValueComparator,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTracePointFilter} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTracePointFilter
        && equalTo((ImmutableTracePointFilter) another);
  }

  private boolean equalTo(ImmutableTracePointFilter another) {
    return Objects.equal(headlineComparator, another.headlineComparator)
        && Objects.equal(headline, another.headline)
        && Objects.equal(errorMessageComparator, another.errorMessageComparator)
        && Objects.equal(errorMessage, another.errorMessage)
        && Objects.equal(userComparator, another.userComparator)
        && Objects.equal(user, another.user)
        && Objects.equal(attributeName, another.attributeName)
        && Objects.equal(attributeValueComparator, another.attributeValueComparator)
        && Objects.equal(attributeValue, another.attributeValue);
  }

  /**
   * Computes a hash code from attributes: {@code headlineComparator}, {@code headline}, {@code errorMessageComparator}, {@code errorMessage}, {@code userComparator}, {@code user}, {@code attributeName}, {@code attributeValueComparator}, {@code attributeValue}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(headlineComparator);
    h += (h << 5) + Objects.hashCode(headline);
    h += (h << 5) + Objects.hashCode(errorMessageComparator);
    h += (h << 5) + Objects.hashCode(errorMessage);
    h += (h << 5) + Objects.hashCode(userComparator);
    h += (h << 5) + Objects.hashCode(user);
    h += (h << 5) + Objects.hashCode(attributeName);
    h += (h << 5) + Objects.hashCode(attributeValueComparator);
    h += (h << 5) + Objects.hashCode(attributeValue);
    return h;
  }

  /**
   * Prints the immutable value {@code TracePointFilter} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("TracePointFilter")
        .omitNullValues()
        .add("headlineComparator", headlineComparator)
        .add("headline", headline)
        .add("errorMessageComparator", errorMessageComparator)
        .add("errorMessage", errorMessage)
        .add("userComparator", userComparator)
        .add("user", user)
        .add("attributeName", attributeName)
        .add("attributeValueComparator", attributeValueComparator)
        .add("attributeValue", attributeValue)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends LiveTraceRepository.TracePointFilter {
    @Nullable StringComparator headlineComparator;
    @Nullable String headline;
    @Nullable StringComparator errorMessageComparator;
    @Nullable String errorMessage;
    @Nullable StringComparator userComparator;
    @Nullable String user;
    @Nullable String attributeName;
    @Nullable StringComparator attributeValueComparator;
    @Nullable String attributeValue;
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
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableTracePointFilter fromJson(Json json) {
    ImmutableTracePointFilter.Builder builder = ImmutableTracePointFilter.builder();
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
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link LiveTraceRepository.TracePointFilter} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable TracePointFilter instance
   */
  public static ImmutableTracePointFilter copyOf(LiveTraceRepository.TracePointFilter instance) {
    if (instance instanceof ImmutableTracePointFilter) {
      return (ImmutableTracePointFilter) instance;
    }
    return ImmutableTracePointFilter.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableTracePointFilter ImmutableTracePointFilter}.
   * @return A new ImmutableTracePointFilter builder
   */
  public static ImmutableTracePointFilter.Builder builder() {
    return new ImmutableTracePointFilter.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableTracePointFilter ImmutableTracePointFilter}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private @Nullable StringComparator headlineComparator;
    private @Nullable String headline;
    private @Nullable StringComparator errorMessageComparator;
    private @Nullable String errorMessage;
    private @Nullable StringComparator userComparator;
    private @Nullable String user;
    private @Nullable String attributeName;
    private @Nullable StringComparator attributeValueComparator;
    private @Nullable String attributeValue;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code TracePointFilter} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(LiveTraceRepository.TracePointFilter instance) {
      Preconditions.checkNotNull(instance, "instance");
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
      return this;
    }

    /**
     * Initializes the value for the {@link LiveTraceRepository.TracePointFilter#headlineComparator() headlineComparator} attribute.
     * @param headlineComparator The value for headlineComparator (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder headlineComparator(@Nullable StringComparator headlineComparator) {
      this.headlineComparator = headlineComparator;
      return this;
    }

    /**
     * Initializes the value for the {@link LiveTraceRepository.TracePointFilter#headline() headline} attribute.
     * @param headline The value for headline (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder headline(@Nullable String headline) {
      this.headline = headline;
      return this;
    }

    /**
     * Initializes the value for the {@link LiveTraceRepository.TracePointFilter#errorMessageComparator() errorMessageComparator} attribute.
     * @param errorMessageComparator The value for errorMessageComparator (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder errorMessageComparator(@Nullable StringComparator errorMessageComparator) {
      this.errorMessageComparator = errorMessageComparator;
      return this;
    }

    /**
     * Initializes the value for the {@link LiveTraceRepository.TracePointFilter#errorMessage() errorMessage} attribute.
     * @param errorMessage The value for errorMessage (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder errorMessage(@Nullable String errorMessage) {
      this.errorMessage = errorMessage;
      return this;
    }

    /**
     * Initializes the value for the {@link LiveTraceRepository.TracePointFilter#userComparator() userComparator} attribute.
     * @param userComparator The value for userComparator (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder userComparator(@Nullable StringComparator userComparator) {
      this.userComparator = userComparator;
      return this;
    }

    /**
     * Initializes the value for the {@link LiveTraceRepository.TracePointFilter#user() user} attribute.
     * @param user The value for user (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder user(@Nullable String user) {
      this.user = user;
      return this;
    }

    /**
     * Initializes the value for the {@link LiveTraceRepository.TracePointFilter#attributeName() attributeName} attribute.
     * @param attributeName The value for attributeName (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder attributeName(@Nullable String attributeName) {
      this.attributeName = attributeName;
      return this;
    }

    /**
     * Initializes the value for the {@link LiveTraceRepository.TracePointFilter#attributeValueComparator() attributeValueComparator} attribute.
     * @param attributeValueComparator The value for attributeValueComparator (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder attributeValueComparator(@Nullable StringComparator attributeValueComparator) {
      this.attributeValueComparator = attributeValueComparator;
      return this;
    }

    /**
     * Initializes the value for the {@link LiveTraceRepository.TracePointFilter#attributeValue() attributeValue} attribute.
     * @param attributeValue The value for attributeValue (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder attributeValue(@Nullable String attributeValue) {
      this.attributeValue = attributeValue;
      return this;
    }

    /**
     * Builds a new {@link ImmutableTracePointFilter ImmutableTracePointFilter}.
     * @return An immutable instance of TracePointFilter
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableTracePointFilter build() {
      return new ImmutableTracePointFilter(
          headlineComparator,
          headline,
          errorMessageComparator,
          errorMessage,
          userComparator,
          user,
          attributeName,
          attributeValueComparator,
          attributeValue);
    }
  }
}
