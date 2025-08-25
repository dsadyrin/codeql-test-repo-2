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
 * Immutable implementation of {@link JvmJsonService.MBeanAttributeMapRequest}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMBeanAttributeMapRequest.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "JvmJsonService.MBeanAttributeMapRequest"})
@Immutable
final class ImmutableMBeanAttributeMapRequest
    implements JvmJsonService.MBeanAttributeMapRequest {
  private final String objectName;

  private ImmutableMBeanAttributeMapRequest(String objectName) {
    this.objectName = objectName;
  }

  /**
   * @return The value of the {@code objectName} attribute
   */
  @JsonProperty("objectName")
  @Override
  public String objectName() {
    return objectName;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link JvmJsonService.MBeanAttributeMapRequest#objectName() objectName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for objectName
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMBeanAttributeMapRequest withObjectName(String value) {
    if (this.objectName.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "objectName");
    return new ImmutableMBeanAttributeMapRequest(newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMBeanAttributeMapRequest} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMBeanAttributeMapRequest
        && equalTo((ImmutableMBeanAttributeMapRequest) another);
  }

  private boolean equalTo(ImmutableMBeanAttributeMapRequest another) {
    return objectName.equals(another.objectName);
  }

  /**
   * Computes a hash code from attributes: {@code objectName}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + objectName.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code MBeanAttributeMapRequest} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("MBeanAttributeMapRequest")
        .omitNullValues()
        .add("objectName", objectName)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements JvmJsonService.MBeanAttributeMapRequest {
    @Nullable String objectName;
    @JsonProperty("objectName")
    public void setObjectName(String objectName) {
      this.objectName = objectName;
    }
    @Override
    public String objectName() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableMBeanAttributeMapRequest fromJson(Json json) {
    ImmutableMBeanAttributeMapRequest.Builder builder = ImmutableMBeanAttributeMapRequest.builder();
    if (json.objectName != null) {
      builder.objectName(json.objectName);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link JvmJsonService.MBeanAttributeMapRequest} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MBeanAttributeMapRequest instance
   */
  public static ImmutableMBeanAttributeMapRequest copyOf(JvmJsonService.MBeanAttributeMapRequest instance) {
    if (instance instanceof ImmutableMBeanAttributeMapRequest) {
      return (ImmutableMBeanAttributeMapRequest) instance;
    }
    return ImmutableMBeanAttributeMapRequest.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableMBeanAttributeMapRequest ImmutableMBeanAttributeMapRequest}.
   * @return A new ImmutableMBeanAttributeMapRequest builder
   */
  public static ImmutableMBeanAttributeMapRequest.Builder builder() {
    return new ImmutableMBeanAttributeMapRequest.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableMBeanAttributeMapRequest ImmutableMBeanAttributeMapRequest}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_OBJECT_NAME = 0x1L;
    private long initBits = 0x1L;

    private @Nullable String objectName;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code MBeanAttributeMapRequest} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(JvmJsonService.MBeanAttributeMapRequest instance) {
      Preconditions.checkNotNull(instance, "instance");
      objectName(instance.objectName());
      return this;
    }

    /**
     * Initializes the value for the {@link JvmJsonService.MBeanAttributeMapRequest#objectName() objectName} attribute.
     * @param objectName The value for objectName 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder objectName(String objectName) {
      this.objectName = Preconditions.checkNotNull(objectName, "objectName");
      initBits &= ~INIT_BIT_OBJECT_NAME;
      return this;
    }

    /**
     * Builds a new {@link ImmutableMBeanAttributeMapRequest ImmutableMBeanAttributeMapRequest}.
     * @return An immutable instance of MBeanAttributeMapRequest
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableMBeanAttributeMapRequest build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableMBeanAttributeMapRequest(objectName);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_OBJECT_NAME) != 0) attributes.add("objectName");
      return "Cannot build MBeanAttributeMapRequest, some of required attributes are not set " + attributes;
    }
  }
}
