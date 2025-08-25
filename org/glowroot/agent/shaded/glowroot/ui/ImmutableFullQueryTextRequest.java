package org.glowroot.agent.shaded.glowroot.ui;

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

/**
 * Immutable implementation of {@link TransactionJsonService.FullQueryTextRequest}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableFullQueryTextRequest.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "TransactionJsonService.FullQueryTextRequest"})
@Immutable
final class ImmutableFullQueryTextRequest
    implements TransactionJsonService.FullQueryTextRequest {
  private final String fullTextSha1;

  private ImmutableFullQueryTextRequest(String fullTextSha1) {
    this.fullTextSha1 = fullTextSha1;
  }

  /**
   * @return The value of the {@code fullTextSha1} attribute
   */
  @JsonProperty("fullTextSha1")
  @Override
  public String fullTextSha1() {
    return fullTextSha1;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TransactionJsonService.FullQueryTextRequest#fullTextSha1() fullTextSha1} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for fullTextSha1
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableFullQueryTextRequest withFullTextSha1(String value) {
    if (this.fullTextSha1.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "fullTextSha1");
    return new ImmutableFullQueryTextRequest(newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableFullQueryTextRequest} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableFullQueryTextRequest
        && equalTo((ImmutableFullQueryTextRequest) another);
  }

  private boolean equalTo(ImmutableFullQueryTextRequest another) {
    return fullTextSha1.equals(another.fullTextSha1);
  }

  /**
   * Computes a hash code from attributes: {@code fullTextSha1}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + fullTextSha1.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code FullQueryTextRequest} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("FullQueryTextRequest")
        .omitNullValues()
        .add("fullTextSha1", fullTextSha1)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements TransactionJsonService.FullQueryTextRequest {
    @Nullable String fullTextSha1;
    @JsonProperty("fullTextSha1")
    public void setFullTextSha1(String fullTextSha1) {
      this.fullTextSha1 = fullTextSha1;
    }
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
  static ImmutableFullQueryTextRequest fromJson(Json json) {
    ImmutableFullQueryTextRequest.Builder builder = ImmutableFullQueryTextRequest.builder();
    if (json.fullTextSha1 != null) {
      builder.fullTextSha1(json.fullTextSha1);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link TransactionJsonService.FullQueryTextRequest} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable FullQueryTextRequest instance
   */
  public static ImmutableFullQueryTextRequest copyOf(TransactionJsonService.FullQueryTextRequest instance) {
    if (instance instanceof ImmutableFullQueryTextRequest) {
      return (ImmutableFullQueryTextRequest) instance;
    }
    return ImmutableFullQueryTextRequest.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableFullQueryTextRequest ImmutableFullQueryTextRequest}.
   * @return A new ImmutableFullQueryTextRequest builder
   */
  public static ImmutableFullQueryTextRequest.Builder builder() {
    return new ImmutableFullQueryTextRequest.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableFullQueryTextRequest ImmutableFullQueryTextRequest}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_FULL_TEXT_SHA1 = 0x1L;
    private long initBits = 0x1L;

    private @Nullable String fullTextSha1;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code FullQueryTextRequest} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(TransactionJsonService.FullQueryTextRequest instance) {
      Preconditions.checkNotNull(instance, "instance");
      fullTextSha1(instance.fullTextSha1());
      return this;
    }

    /**
     * Initializes the value for the {@link TransactionJsonService.FullQueryTextRequest#fullTextSha1() fullTextSha1} attribute.
     * @param fullTextSha1 The value for fullTextSha1 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder fullTextSha1(String fullTextSha1) {
      this.fullTextSha1 = Preconditions.checkNotNull(fullTextSha1, "fullTextSha1");
      initBits &= ~INIT_BIT_FULL_TEXT_SHA1;
      return this;
    }

    /**
     * Builds a new {@link ImmutableFullQueryTextRequest ImmutableFullQueryTextRequest}.
     * @return An immutable instance of FullQueryTextRequest
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableFullQueryTextRequest build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableFullQueryTextRequest(fullTextSha1);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_FULL_TEXT_SHA1) != 0) attributes.add("fullTextSha1");
      return "Cannot build FullQueryTextRequest, some of required attributes are not set " + attributes;
    }
  }
}
