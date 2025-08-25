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
 * Immutable implementation of {@link InstrumentationConfigJsonService.MethodNamesRequest}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMethodNamesRequest.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "InstrumentationConfigJsonService.MethodNamesRequest"})
@Immutable
final class ImmutableMethodNamesRequest
    implements InstrumentationConfigJsonService.MethodNamesRequest {
  private final String className;
  private final String partialMethodName;
  private final int limit;

  private ImmutableMethodNamesRequest(String className, String partialMethodName, int limit) {
    this.className = className;
    this.partialMethodName = partialMethodName;
    this.limit = limit;
  }

  /**
   * @return The value of the {@code className} attribute
   */
  @JsonProperty("className")
  @Override
  public String className() {
    return className;
  }

  /**
   * @return The value of the {@code partialMethodName} attribute
   */
  @JsonProperty("partialMethodName")
  @Override
  public String partialMethodName() {
    return partialMethodName;
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
   * Copy the current immutable object by setting a value for the {@link InstrumentationConfigJsonService.MethodNamesRequest#className() className} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for className
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMethodNamesRequest withClassName(String value) {
    if (this.className.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "className");
    return new ImmutableMethodNamesRequest(newValue, this.partialMethodName, this.limit);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link InstrumentationConfigJsonService.MethodNamesRequest#partialMethodName() partialMethodName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for partialMethodName
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMethodNamesRequest withPartialMethodName(String value) {
    if (this.partialMethodName.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "partialMethodName");
    return new ImmutableMethodNamesRequest(this.className, newValue, this.limit);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link InstrumentationConfigJsonService.MethodNamesRequest#limit() limit} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for limit
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMethodNamesRequest withLimit(int value) {
    if (this.limit == value) return this;
    return new ImmutableMethodNamesRequest(this.className, this.partialMethodName, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMethodNamesRequest} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMethodNamesRequest
        && equalTo((ImmutableMethodNamesRequest) another);
  }

  private boolean equalTo(ImmutableMethodNamesRequest another) {
    return className.equals(another.className)
        && partialMethodName.equals(another.partialMethodName)
        && limit == another.limit;
  }

  /**
   * Computes a hash code from attributes: {@code className}, {@code partialMethodName}, {@code limit}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + className.hashCode();
    h += (h << 5) + partialMethodName.hashCode();
    h += (h << 5) + limit;
    return h;
  }

  /**
   * Prints the immutable value {@code MethodNamesRequest} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("MethodNamesRequest")
        .omitNullValues()
        .add("className", className)
        .add("partialMethodName", partialMethodName)
        .add("limit", limit)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements InstrumentationConfigJsonService.MethodNamesRequest {
    @Nullable String className;
    @Nullable String partialMethodName;
    int limit;
    boolean limitIsSet;
    @JsonProperty("className")
    public void setClassName(String className) {
      this.className = className;
    }
    @JsonProperty("partialMethodName")
    public void setPartialMethodName(String partialMethodName) {
      this.partialMethodName = partialMethodName;
    }
    @JsonProperty("limit")
    public void setLimit(int limit) {
      this.limit = limit;
      this.limitIsSet = true;
    }
    @Override
    public String className() { throw new UnsupportedOperationException(); }
    @Override
    public String partialMethodName() { throw new UnsupportedOperationException(); }
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
  static ImmutableMethodNamesRequest fromJson(Json json) {
    ImmutableMethodNamesRequest.Builder builder = ImmutableMethodNamesRequest.builder();
    if (json.className != null) {
      builder.className(json.className);
    }
    if (json.partialMethodName != null) {
      builder.partialMethodName(json.partialMethodName);
    }
    if (json.limitIsSet) {
      builder.limit(json.limit);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link InstrumentationConfigJsonService.MethodNamesRequest} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MethodNamesRequest instance
   */
  public static ImmutableMethodNamesRequest copyOf(InstrumentationConfigJsonService.MethodNamesRequest instance) {
    if (instance instanceof ImmutableMethodNamesRequest) {
      return (ImmutableMethodNamesRequest) instance;
    }
    return ImmutableMethodNamesRequest.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableMethodNamesRequest ImmutableMethodNamesRequest}.
   * @return A new ImmutableMethodNamesRequest builder
   */
  public static ImmutableMethodNamesRequest.Builder builder() {
    return new ImmutableMethodNamesRequest.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableMethodNamesRequest ImmutableMethodNamesRequest}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_CLASS_NAME = 0x1L;
    private static final long INIT_BIT_PARTIAL_METHOD_NAME = 0x2L;
    private static final long INIT_BIT_LIMIT = 0x4L;
    private long initBits = 0x7L;

    private @Nullable String className;
    private @Nullable String partialMethodName;
    private int limit;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code MethodNamesRequest} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(InstrumentationConfigJsonService.MethodNamesRequest instance) {
      Preconditions.checkNotNull(instance, "instance");
      className(instance.className());
      partialMethodName(instance.partialMethodName());
      limit(instance.limit());
      return this;
    }

    /**
     * Initializes the value for the {@link InstrumentationConfigJsonService.MethodNamesRequest#className() className} attribute.
     * @param className The value for className 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder className(String className) {
      this.className = Preconditions.checkNotNull(className, "className");
      initBits &= ~INIT_BIT_CLASS_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link InstrumentationConfigJsonService.MethodNamesRequest#partialMethodName() partialMethodName} attribute.
     * @param partialMethodName The value for partialMethodName 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder partialMethodName(String partialMethodName) {
      this.partialMethodName = Preconditions.checkNotNull(partialMethodName, "partialMethodName");
      initBits &= ~INIT_BIT_PARTIAL_METHOD_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link InstrumentationConfigJsonService.MethodNamesRequest#limit() limit} attribute.
     * @param limit The value for limit 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder limit(int limit) {
      this.limit = limit;
      initBits &= ~INIT_BIT_LIMIT;
      return this;
    }

    /**
     * Builds a new {@link ImmutableMethodNamesRequest ImmutableMethodNamesRequest}.
     * @return An immutable instance of MethodNamesRequest
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableMethodNamesRequest build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableMethodNamesRequest(className, partialMethodName, limit);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_CLASS_NAME) != 0) attributes.add("className");
      if ((initBits & INIT_BIT_PARTIAL_METHOD_NAME) != 0) attributes.add("partialMethodName");
      if ((initBits & INIT_BIT_LIMIT) != 0) attributes.add("limit");
      return "Cannot build MethodNamesRequest, some of required attributes are not set " + attributes;
    }
  }
}
