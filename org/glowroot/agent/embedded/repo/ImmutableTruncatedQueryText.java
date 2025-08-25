package org.glowroot.agent.embedded.repo;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Objects;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import org.glowroot.agent.shaded.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link AggregateDao.TruncatedQueryText}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTruncatedQueryText.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code ImmutableTruncatedQueryText.of()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "AggregateDao.TruncatedQueryText"})
@Immutable
final class ImmutableTruncatedQueryText
    implements AggregateDao.TruncatedQueryText {
  private final String truncatedText;
  private final @Nullable String fullTextSha1;

  private ImmutableTruncatedQueryText(String truncatedText, @Nullable String fullTextSha1) {
    this.truncatedText = Preconditions.checkNotNull(truncatedText, "truncatedText");
    this.fullTextSha1 = fullTextSha1;
  }

  private ImmutableTruncatedQueryText(
      ImmutableTruncatedQueryText original,
      String truncatedText,
      @Nullable String fullTextSha1) {
    this.truncatedText = truncatedText;
    this.fullTextSha1 = fullTextSha1;
  }

  /**
   * @return The value of the {@code truncatedText} attribute
   */
  @JsonProperty("truncatedText")
  @Override
  public String truncatedText() {
    return truncatedText;
  }

  /**
   * @return The value of the {@code fullTextSha1} attribute
   */
  @JsonProperty("fullTextSha1")
  @Override
  public @Nullable String fullTextSha1() {
    return fullTextSha1;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AggregateDao.TruncatedQueryText#truncatedText() truncatedText} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for truncatedText
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTruncatedQueryText withTruncatedText(String value) {
    if (this.truncatedText.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "truncatedText");
    return new ImmutableTruncatedQueryText(this, newValue, this.fullTextSha1);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AggregateDao.TruncatedQueryText#fullTextSha1() fullTextSha1} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for fullTextSha1 (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTruncatedQueryText withFullTextSha1(@Nullable String value) {
    if (Objects.equal(this.fullTextSha1, value)) return this;
    return new ImmutableTruncatedQueryText(this, this.truncatedText, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTruncatedQueryText} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTruncatedQueryText
        && equalTo((ImmutableTruncatedQueryText) another);
  }

  private boolean equalTo(ImmutableTruncatedQueryText another) {
    return truncatedText.equals(another.truncatedText)
        && Objects.equal(fullTextSha1, another.fullTextSha1);
  }

  /**
   * Computes a hash code from attributes: {@code truncatedText}, {@code fullTextSha1}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + truncatedText.hashCode();
    h += (h << 5) + Objects.hashCode(fullTextSha1);
    return h;
  }

  /**
   * Prints the immutable value {@code TruncatedQueryText} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("TruncatedQueryText")
        .omitNullValues()
        .add("truncatedText", truncatedText)
        .add("fullTextSha1", fullTextSha1)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements AggregateDao.TruncatedQueryText {
    @Nullable String truncatedText;
    @Nullable String fullTextSha1;
    @JsonProperty("truncatedText")
    public void setTruncatedText(String truncatedText) {
      this.truncatedText = truncatedText;
    }
    @JsonProperty("fullTextSha1")
    public void setFullTextSha1(@Nullable String fullTextSha1) {
      this.fullTextSha1 = fullTextSha1;
    }
    @Override
    public String truncatedText() { throw new UnsupportedOperationException(); }
    @Override
    public String fullTextSha1() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableTruncatedQueryText fromJson(Json json) {
    ImmutableTruncatedQueryText.Builder builder = ImmutableTruncatedQueryText.builder();
    if (json.truncatedText != null) {
      builder.truncatedText(json.truncatedText);
    }
    if (json.fullTextSha1 != null) {
      builder.fullTextSha1(json.fullTextSha1);
    }
    return builder.build();
  }

  /**
   * Construct a new immutable {@code TruncatedQueryText} instance.
   * @param truncatedText The value for the {@code truncatedText} attribute
   * @param fullTextSha1 The value for the {@code fullTextSha1} attribute
   * @return An immutable TruncatedQueryText instance
   */
  public static ImmutableTruncatedQueryText of(String truncatedText, @Nullable String fullTextSha1) {
    return new ImmutableTruncatedQueryText(truncatedText, fullTextSha1);
  }

  /**
   * Creates an immutable copy of a {@link AggregateDao.TruncatedQueryText} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable TruncatedQueryText instance
   */
  public static ImmutableTruncatedQueryText copyOf(AggregateDao.TruncatedQueryText instance) {
    if (instance instanceof ImmutableTruncatedQueryText) {
      return (ImmutableTruncatedQueryText) instance;
    }
    return ImmutableTruncatedQueryText.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableTruncatedQueryText ImmutableTruncatedQueryText}.
   * @return A new ImmutableTruncatedQueryText builder
   */
  public static ImmutableTruncatedQueryText.Builder builder() {
    return new ImmutableTruncatedQueryText.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableTruncatedQueryText ImmutableTruncatedQueryText}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_TRUNCATED_TEXT = 0x1L;
    private long initBits = 0x1L;

    private @Nullable String truncatedText;
    private @Nullable String fullTextSha1;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code TruncatedQueryText} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(AggregateDao.TruncatedQueryText instance) {
      Preconditions.checkNotNull(instance, "instance");
      truncatedText(instance.truncatedText());
      @Nullable String fullTextSha1Value = instance.fullTextSha1();
      if (fullTextSha1Value != null) {
        fullTextSha1(fullTextSha1Value);
      }
      return this;
    }

    /**
     * Initializes the value for the {@link AggregateDao.TruncatedQueryText#truncatedText() truncatedText} attribute.
     * @param truncatedText The value for truncatedText 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder truncatedText(String truncatedText) {
      this.truncatedText = Preconditions.checkNotNull(truncatedText, "truncatedText");
      initBits &= ~INIT_BIT_TRUNCATED_TEXT;
      return this;
    }

    /**
     * Initializes the value for the {@link AggregateDao.TruncatedQueryText#fullTextSha1() fullTextSha1} attribute.
     * @param fullTextSha1 The value for fullTextSha1 (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder fullTextSha1(@Nullable String fullTextSha1) {
      this.fullTextSha1 = fullTextSha1;
      return this;
    }

    /**
     * Builds a new {@link ImmutableTruncatedQueryText ImmutableTruncatedQueryText}.
     * @return An immutable instance of TruncatedQueryText
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableTruncatedQueryText build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableTruncatedQueryText(null, truncatedText, fullTextSha1);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_TRUNCATED_TEXT) != 0) attributes.add("truncatedText");
      return "Cannot build TruncatedQueryText, some of required attributes are not set " + attributes;
    }
  }
}
