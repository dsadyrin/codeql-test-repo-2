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
 * Immutable implementation of {@link InstrumentationConfigJsonService.MethodSignaturesRequest}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMethodSignaturesRequest.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "InstrumentationConfigJsonService.MethodSignaturesRequest"})
@Immutable
final class ImmutableMethodSignaturesRequest
    implements InstrumentationConfigJsonService.MethodSignaturesRequest {
  private final String className;
  private final String methodName;

  private ImmutableMethodSignaturesRequest(String className, String methodName) {
    this.className = className;
    this.methodName = methodName;
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
   * @return The value of the {@code methodName} attribute
   */
  @JsonProperty("methodName")
  @Override
  public String methodName() {
    return methodName;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link InstrumentationConfigJsonService.MethodSignaturesRequest#className() className} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for className
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMethodSignaturesRequest withClassName(String value) {
    if (this.className.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "className");
    return new ImmutableMethodSignaturesRequest(newValue, this.methodName);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link InstrumentationConfigJsonService.MethodSignaturesRequest#methodName() methodName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for methodName
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMethodSignaturesRequest withMethodName(String value) {
    if (this.methodName.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "methodName");
    return new ImmutableMethodSignaturesRequest(this.className, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMethodSignaturesRequest} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMethodSignaturesRequest
        && equalTo((ImmutableMethodSignaturesRequest) another);
  }

  private boolean equalTo(ImmutableMethodSignaturesRequest another) {
    return className.equals(another.className)
        && methodName.equals(another.methodName);
  }

  /**
   * Computes a hash code from attributes: {@code className}, {@code methodName}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + className.hashCode();
    h += (h << 5) + methodName.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code MethodSignaturesRequest} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("MethodSignaturesRequest")
        .omitNullValues()
        .add("className", className)
        .add("methodName", methodName)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements InstrumentationConfigJsonService.MethodSignaturesRequest {
    @Nullable String className;
    @Nullable String methodName;
    @JsonProperty("className")
    public void setClassName(String className) {
      this.className = className;
    }
    @JsonProperty("methodName")
    public void setMethodName(String methodName) {
      this.methodName = methodName;
    }
    @Override
    public String className() { throw new UnsupportedOperationException(); }
    @Override
    public String methodName() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableMethodSignaturesRequest fromJson(Json json) {
    ImmutableMethodSignaturesRequest.Builder builder = ImmutableMethodSignaturesRequest.builder();
    if (json.className != null) {
      builder.className(json.className);
    }
    if (json.methodName != null) {
      builder.methodName(json.methodName);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link InstrumentationConfigJsonService.MethodSignaturesRequest} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MethodSignaturesRequest instance
   */
  public static ImmutableMethodSignaturesRequest copyOf(InstrumentationConfigJsonService.MethodSignaturesRequest instance) {
    if (instance instanceof ImmutableMethodSignaturesRequest) {
      return (ImmutableMethodSignaturesRequest) instance;
    }
    return ImmutableMethodSignaturesRequest.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableMethodSignaturesRequest ImmutableMethodSignaturesRequest}.
   * @return A new ImmutableMethodSignaturesRequest builder
   */
  public static ImmutableMethodSignaturesRequest.Builder builder() {
    return new ImmutableMethodSignaturesRequest.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableMethodSignaturesRequest ImmutableMethodSignaturesRequest}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_CLASS_NAME = 0x1L;
    private static final long INIT_BIT_METHOD_NAME = 0x2L;
    private long initBits = 0x3L;

    private @Nullable String className;
    private @Nullable String methodName;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code MethodSignaturesRequest} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(InstrumentationConfigJsonService.MethodSignaturesRequest instance) {
      Preconditions.checkNotNull(instance, "instance");
      className(instance.className());
      methodName(instance.methodName());
      return this;
    }

    /**
     * Initializes the value for the {@link InstrumentationConfigJsonService.MethodSignaturesRequest#className() className} attribute.
     * @param className The value for className 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder className(String className) {
      this.className = Preconditions.checkNotNull(className, "className");
      initBits &= ~INIT_BIT_CLASS_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link InstrumentationConfigJsonService.MethodSignaturesRequest#methodName() methodName} attribute.
     * @param methodName The value for methodName 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder methodName(String methodName) {
      this.methodName = Preconditions.checkNotNull(methodName, "methodName");
      initBits &= ~INIT_BIT_METHOD_NAME;
      return this;
    }

    /**
     * Builds a new {@link ImmutableMethodSignaturesRequest ImmutableMethodSignaturesRequest}.
     * @return An immutable instance of MethodSignaturesRequest
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableMethodSignaturesRequest build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableMethodSignaturesRequest(className, methodName);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_CLASS_NAME) != 0) attributes.add("className");
      if ((initBits & INIT_BIT_METHOD_NAME) != 0) attributes.add("methodName");
      return "Cannot build MethodSignaturesRequest, some of required attributes are not set " + attributes;
    }
  }
}
