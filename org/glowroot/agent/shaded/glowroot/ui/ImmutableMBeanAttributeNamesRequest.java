package org.glowroot.agent.shaded.glowroot.ui;

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
 * Immutable implementation of {@link GaugeConfigJsonService.MBeanAttributeNamesRequest}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMBeanAttributeNamesRequest.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "GaugeConfigJsonService.MBeanAttributeNamesRequest"})
@Immutable
final class ImmutableMBeanAttributeNamesRequest
    implements GaugeConfigJsonService.MBeanAttributeNamesRequest {
  private final String objectName;
  private final @Nullable String gaugeVersion;

  private ImmutableMBeanAttributeNamesRequest(String objectName, @Nullable String gaugeVersion) {
    this.objectName = objectName;
    this.gaugeVersion = gaugeVersion;
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
   * @return The value of the {@code gaugeVersion} attribute
   */
  @JsonProperty("gaugeVersion")
  @Override
  public @Nullable String gaugeVersion() {
    return gaugeVersion;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link GaugeConfigJsonService.MBeanAttributeNamesRequest#objectName() objectName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for objectName
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMBeanAttributeNamesRequest withObjectName(String value) {
    if (this.objectName.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "objectName");
    return new ImmutableMBeanAttributeNamesRequest(newValue, this.gaugeVersion);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link GaugeConfigJsonService.MBeanAttributeNamesRequest#gaugeVersion() gaugeVersion} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for gaugeVersion (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMBeanAttributeNamesRequest withGaugeVersion(@Nullable String value) {
    if (Objects.equal(this.gaugeVersion, value)) return this;
    return new ImmutableMBeanAttributeNamesRequest(this.objectName, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMBeanAttributeNamesRequest} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMBeanAttributeNamesRequest
        && equalTo((ImmutableMBeanAttributeNamesRequest) another);
  }

  private boolean equalTo(ImmutableMBeanAttributeNamesRequest another) {
    return objectName.equals(another.objectName)
        && Objects.equal(gaugeVersion, another.gaugeVersion);
  }

  /**
   * Computes a hash code from attributes: {@code objectName}, {@code gaugeVersion}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + objectName.hashCode();
    h += (h << 5) + Objects.hashCode(gaugeVersion);
    return h;
  }

  /**
   * Prints the immutable value {@code MBeanAttributeNamesRequest} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("MBeanAttributeNamesRequest")
        .omitNullValues()
        .add("objectName", objectName)
        .add("gaugeVersion", gaugeVersion)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements GaugeConfigJsonService.MBeanAttributeNamesRequest {
    @Nullable String objectName;
    @Nullable String gaugeVersion;
    @JsonProperty("objectName")
    public void setObjectName(String objectName) {
      this.objectName = objectName;
    }
    @JsonProperty("gaugeVersion")
    public void setGaugeVersion(@Nullable String gaugeVersion) {
      this.gaugeVersion = gaugeVersion;
    }
    @Override
    public String objectName() { throw new UnsupportedOperationException(); }
    @Override
    public String gaugeVersion() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableMBeanAttributeNamesRequest fromJson(Json json) {
    ImmutableMBeanAttributeNamesRequest.Builder builder = ImmutableMBeanAttributeNamesRequest.builder();
    if (json.objectName != null) {
      builder.objectName(json.objectName);
    }
    if (json.gaugeVersion != null) {
      builder.gaugeVersion(json.gaugeVersion);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link GaugeConfigJsonService.MBeanAttributeNamesRequest} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MBeanAttributeNamesRequest instance
   */
  public static ImmutableMBeanAttributeNamesRequest copyOf(GaugeConfigJsonService.MBeanAttributeNamesRequest instance) {
    if (instance instanceof ImmutableMBeanAttributeNamesRequest) {
      return (ImmutableMBeanAttributeNamesRequest) instance;
    }
    return ImmutableMBeanAttributeNamesRequest.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableMBeanAttributeNamesRequest ImmutableMBeanAttributeNamesRequest}.
   * @return A new ImmutableMBeanAttributeNamesRequest builder
   */
  public static ImmutableMBeanAttributeNamesRequest.Builder builder() {
    return new ImmutableMBeanAttributeNamesRequest.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableMBeanAttributeNamesRequest ImmutableMBeanAttributeNamesRequest}.
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
    private @Nullable String gaugeVersion;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code MBeanAttributeNamesRequest} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(GaugeConfigJsonService.MBeanAttributeNamesRequest instance) {
      Preconditions.checkNotNull(instance, "instance");
      objectName(instance.objectName());
      @Nullable String gaugeVersionValue = instance.gaugeVersion();
      if (gaugeVersionValue != null) {
        gaugeVersion(gaugeVersionValue);
      }
      return this;
    }

    /**
     * Initializes the value for the {@link GaugeConfigJsonService.MBeanAttributeNamesRequest#objectName() objectName} attribute.
     * @param objectName The value for objectName 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder objectName(String objectName) {
      this.objectName = Preconditions.checkNotNull(objectName, "objectName");
      initBits &= ~INIT_BIT_OBJECT_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link GaugeConfigJsonService.MBeanAttributeNamesRequest#gaugeVersion() gaugeVersion} attribute.
     * @param gaugeVersion The value for gaugeVersion (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder gaugeVersion(@Nullable String gaugeVersion) {
      this.gaugeVersion = gaugeVersion;
      return this;
    }

    /**
     * Builds a new {@link ImmutableMBeanAttributeNamesRequest ImmutableMBeanAttributeNamesRequest}.
     * @return An immutable instance of MBeanAttributeNamesRequest
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableMBeanAttributeNamesRequest build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableMBeanAttributeNamesRequest(objectName, gaugeVersion);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_OBJECT_NAME) != 0) attributes.add("objectName");
      return "Cannot build MBeanAttributeNamesRequest, some of required attributes are not set " + attributes;
    }
  }
}
