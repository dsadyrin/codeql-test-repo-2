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
 * Immutable implementation of {@link GaugeConfigJsonService.MBeanObjectNameRequest}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMBeanObjectNameRequest.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "GaugeConfigJsonService.MBeanObjectNameRequest"})
@Immutable
final class ImmutableMBeanObjectNameRequest
    implements GaugeConfigJsonService.MBeanObjectNameRequest {
  private final String partialObjectName;
  private final int limit;

  private ImmutableMBeanObjectNameRequest(String partialObjectName, int limit) {
    this.partialObjectName = partialObjectName;
    this.limit = limit;
  }

  /**
   * @return The value of the {@code partialObjectName} attribute
   */
  @JsonProperty("partialObjectName")
  @Override
  public String partialObjectName() {
    return partialObjectName;
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
   * Copy the current immutable object by setting a value for the {@link GaugeConfigJsonService.MBeanObjectNameRequest#partialObjectName() partialObjectName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for partialObjectName
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMBeanObjectNameRequest withPartialObjectName(String value) {
    if (this.partialObjectName.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "partialObjectName");
    return new ImmutableMBeanObjectNameRequest(newValue, this.limit);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link GaugeConfigJsonService.MBeanObjectNameRequest#limit() limit} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for limit
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMBeanObjectNameRequest withLimit(int value) {
    if (this.limit == value) return this;
    return new ImmutableMBeanObjectNameRequest(this.partialObjectName, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMBeanObjectNameRequest} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMBeanObjectNameRequest
        && equalTo((ImmutableMBeanObjectNameRequest) another);
  }

  private boolean equalTo(ImmutableMBeanObjectNameRequest another) {
    return partialObjectName.equals(another.partialObjectName)
        && limit == another.limit;
  }

  /**
   * Computes a hash code from attributes: {@code partialObjectName}, {@code limit}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + partialObjectName.hashCode();
    h += (h << 5) + limit;
    return h;
  }

  /**
   * Prints the immutable value {@code MBeanObjectNameRequest} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("MBeanObjectNameRequest")
        .omitNullValues()
        .add("partialObjectName", partialObjectName)
        .add("limit", limit)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements GaugeConfigJsonService.MBeanObjectNameRequest {
    @Nullable String partialObjectName;
    int limit;
    boolean limitIsSet;
    @JsonProperty("partialObjectName")
    public void setPartialObjectName(String partialObjectName) {
      this.partialObjectName = partialObjectName;
    }
    @JsonProperty("limit")
    public void setLimit(int limit) {
      this.limit = limit;
      this.limitIsSet = true;
    }
    @Override
    public String partialObjectName() { throw new UnsupportedOperationException(); }
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
  static ImmutableMBeanObjectNameRequest fromJson(Json json) {
    ImmutableMBeanObjectNameRequest.Builder builder = ImmutableMBeanObjectNameRequest.builder();
    if (json.partialObjectName != null) {
      builder.partialObjectName(json.partialObjectName);
    }
    if (json.limitIsSet) {
      builder.limit(json.limit);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link GaugeConfigJsonService.MBeanObjectNameRequest} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MBeanObjectNameRequest instance
   */
  public static ImmutableMBeanObjectNameRequest copyOf(GaugeConfigJsonService.MBeanObjectNameRequest instance) {
    if (instance instanceof ImmutableMBeanObjectNameRequest) {
      return (ImmutableMBeanObjectNameRequest) instance;
    }
    return ImmutableMBeanObjectNameRequest.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableMBeanObjectNameRequest ImmutableMBeanObjectNameRequest}.
   * @return A new ImmutableMBeanObjectNameRequest builder
   */
  public static ImmutableMBeanObjectNameRequest.Builder builder() {
    return new ImmutableMBeanObjectNameRequest.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableMBeanObjectNameRequest ImmutableMBeanObjectNameRequest}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_PARTIAL_OBJECT_NAME = 0x1L;
    private static final long INIT_BIT_LIMIT = 0x2L;
    private long initBits = 0x3L;

    private @Nullable String partialObjectName;
    private int limit;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code MBeanObjectNameRequest} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(GaugeConfigJsonService.MBeanObjectNameRequest instance) {
      Preconditions.checkNotNull(instance, "instance");
      partialObjectName(instance.partialObjectName());
      limit(instance.limit());
      return this;
    }

    /**
     * Initializes the value for the {@link GaugeConfigJsonService.MBeanObjectNameRequest#partialObjectName() partialObjectName} attribute.
     * @param partialObjectName The value for partialObjectName 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder partialObjectName(String partialObjectName) {
      this.partialObjectName = Preconditions.checkNotNull(partialObjectName, "partialObjectName");
      initBits &= ~INIT_BIT_PARTIAL_OBJECT_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link GaugeConfigJsonService.MBeanObjectNameRequest#limit() limit} attribute.
     * @param limit The value for limit 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder limit(int limit) {
      this.limit = limit;
      initBits &= ~INIT_BIT_LIMIT;
      return this;
    }

    /**
     * Builds a new {@link ImmutableMBeanObjectNameRequest ImmutableMBeanObjectNameRequest}.
     * @return An immutable instance of MBeanObjectNameRequest
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableMBeanObjectNameRequest build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableMBeanObjectNameRequest(partialObjectName, limit);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_PARTIAL_OBJECT_NAME) != 0) attributes.add("partialObjectName");
      if ((initBits & INIT_BIT_LIMIT) != 0) attributes.add("limit");
      return "Cannot build MBeanObjectNameRequest, some of required attributes are not set " + attributes;
    }
  }
}
