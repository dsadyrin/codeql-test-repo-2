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
 * Immutable implementation of {@link InstrumentationConfigJsonService.ClassNamesRequest}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableClassNamesRequest.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "InstrumentationConfigJsonService.ClassNamesRequest"})
@Immutable
final class ImmutableClassNamesRequest
    implements InstrumentationConfigJsonService.ClassNamesRequest {
  private final String partialClassName;
  private final int limit;

  private ImmutableClassNamesRequest(String partialClassName, int limit) {
    this.partialClassName = partialClassName;
    this.limit = limit;
  }

  /**
   * @return The value of the {@code partialClassName} attribute
   */
  @JsonProperty("partialClassName")
  @Override
  public String partialClassName() {
    return partialClassName;
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
   * Copy the current immutable object by setting a value for the {@link InstrumentationConfigJsonService.ClassNamesRequest#partialClassName() partialClassName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for partialClassName
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableClassNamesRequest withPartialClassName(String value) {
    if (this.partialClassName.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "partialClassName");
    return new ImmutableClassNamesRequest(newValue, this.limit);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link InstrumentationConfigJsonService.ClassNamesRequest#limit() limit} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for limit
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableClassNamesRequest withLimit(int value) {
    if (this.limit == value) return this;
    return new ImmutableClassNamesRequest(this.partialClassName, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableClassNamesRequest} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableClassNamesRequest
        && equalTo((ImmutableClassNamesRequest) another);
  }

  private boolean equalTo(ImmutableClassNamesRequest another) {
    return partialClassName.equals(another.partialClassName)
        && limit == another.limit;
  }

  /**
   * Computes a hash code from attributes: {@code partialClassName}, {@code limit}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + partialClassName.hashCode();
    h += (h << 5) + limit;
    return h;
  }

  /**
   * Prints the immutable value {@code ClassNamesRequest} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("ClassNamesRequest")
        .omitNullValues()
        .add("partialClassName", partialClassName)
        .add("limit", limit)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements InstrumentationConfigJsonService.ClassNamesRequest {
    @Nullable String partialClassName;
    int limit;
    boolean limitIsSet;
    @JsonProperty("partialClassName")
    public void setPartialClassName(String partialClassName) {
      this.partialClassName = partialClassName;
    }
    @JsonProperty("limit")
    public void setLimit(int limit) {
      this.limit = limit;
      this.limitIsSet = true;
    }
    @Override
    public String partialClassName() { throw new UnsupportedOperationException(); }
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
  static ImmutableClassNamesRequest fromJson(Json json) {
    ImmutableClassNamesRequest.Builder builder = ImmutableClassNamesRequest.builder();
    if (json.partialClassName != null) {
      builder.partialClassName(json.partialClassName);
    }
    if (json.limitIsSet) {
      builder.limit(json.limit);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link InstrumentationConfigJsonService.ClassNamesRequest} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ClassNamesRequest instance
   */
  public static ImmutableClassNamesRequest copyOf(InstrumentationConfigJsonService.ClassNamesRequest instance) {
    if (instance instanceof ImmutableClassNamesRequest) {
      return (ImmutableClassNamesRequest) instance;
    }
    return ImmutableClassNamesRequest.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableClassNamesRequest ImmutableClassNamesRequest}.
   * @return A new ImmutableClassNamesRequest builder
   */
  public static ImmutableClassNamesRequest.Builder builder() {
    return new ImmutableClassNamesRequest.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableClassNamesRequest ImmutableClassNamesRequest}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_PARTIAL_CLASS_NAME = 0x1L;
    private static final long INIT_BIT_LIMIT = 0x2L;
    private long initBits = 0x3L;

    private @Nullable String partialClassName;
    private int limit;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code ClassNamesRequest} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(InstrumentationConfigJsonService.ClassNamesRequest instance) {
      Preconditions.checkNotNull(instance, "instance");
      partialClassName(instance.partialClassName());
      limit(instance.limit());
      return this;
    }

    /**
     * Initializes the value for the {@link InstrumentationConfigJsonService.ClassNamesRequest#partialClassName() partialClassName} attribute.
     * @param partialClassName The value for partialClassName 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder partialClassName(String partialClassName) {
      this.partialClassName = Preconditions.checkNotNull(partialClassName, "partialClassName");
      initBits &= ~INIT_BIT_PARTIAL_CLASS_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link InstrumentationConfigJsonService.ClassNamesRequest#limit() limit} attribute.
     * @param limit The value for limit 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder limit(int limit) {
      this.limit = limit;
      initBits &= ~INIT_BIT_LIMIT;
      return this;
    }

    /**
     * Builds a new {@link ImmutableClassNamesRequest ImmutableClassNamesRequest}.
     * @return An immutable instance of ClassNamesRequest
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableClassNamesRequest build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableClassNamesRequest(partialClassName, limit);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_PARTIAL_CLASS_NAME) != 0) attributes.add("partialClassName");
      if ((initBits & INIT_BIT_LIMIT) != 0) attributes.add("limit");
      return "Cannot build ClassNamesRequest, some of required attributes are not set " + attributes;
    }
  }
}
