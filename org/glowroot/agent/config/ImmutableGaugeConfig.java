package org.glowroot.agent.config;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import org.glowroot.agent.shaded.google.common.collect.ImmutableList;
import org.glowroot.agent.shaded.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link GaugeConfig}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableGaugeConfig.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "GaugeConfig"})
@Immutable
public final class ImmutableGaugeConfig extends GaugeConfig {
  private final String mbeanObjectName;
  private final ImmutableList<ImmutableMBeanAttribute> mbeanAttributes;

  private ImmutableGaugeConfig(
      String mbeanObjectName,
      ImmutableList<ImmutableMBeanAttribute> mbeanAttributes) {
    this.mbeanObjectName = mbeanObjectName;
    this.mbeanAttributes = mbeanAttributes;
  }

  /**
   * @return The value of the {@code mbeanObjectName} attribute
   */
  @JsonProperty("mbeanObjectName")
  @Override
  public String mbeanObjectName() {
    return mbeanObjectName;
  }

  /**
   * @return The value of the {@code mbeanAttributes} attribute
   */
  @JsonProperty("mbeanAttributes")
  @Override
  public ImmutableList<ImmutableMBeanAttribute> mbeanAttributes() {
    return mbeanAttributes;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link GaugeConfig#mbeanObjectName() mbeanObjectName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for mbeanObjectName
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableGaugeConfig withMbeanObjectName(String value) {
    if (this.mbeanObjectName.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "mbeanObjectName");
    return new ImmutableGaugeConfig(newValue, this.mbeanAttributes);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link GaugeConfig#mbeanAttributes() mbeanAttributes}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGaugeConfig withMbeanAttributes(ImmutableMBeanAttribute... elements) {
    ImmutableList<ImmutableMBeanAttribute> newValue = ImmutableList.copyOf(elements);
    return new ImmutableGaugeConfig(this.mbeanObjectName, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link GaugeConfig#mbeanAttributes() mbeanAttributes}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of mbeanAttributes elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGaugeConfig withMbeanAttributes(Iterable<? extends ImmutableMBeanAttribute> elements) {
    if (this.mbeanAttributes == elements) return this;
    ImmutableList<ImmutableMBeanAttribute> newValue = ImmutableList.copyOf(elements);
    return new ImmutableGaugeConfig(this.mbeanObjectName, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableGaugeConfig} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableGaugeConfig
        && equalTo((ImmutableGaugeConfig) another);
  }

  private boolean equalTo(ImmutableGaugeConfig another) {
    return mbeanObjectName.equals(another.mbeanObjectName)
        && mbeanAttributes.equals(another.mbeanAttributes);
  }

  /**
   * Computes a hash code from attributes: {@code mbeanObjectName}, {@code mbeanAttributes}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + mbeanObjectName.hashCode();
    h += (h << 5) + mbeanAttributes.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code GaugeConfig} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("GaugeConfig")
        .omitNullValues()
        .add("mbeanObjectName", mbeanObjectName)
        .add("mbeanAttributes", mbeanAttributes)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends GaugeConfig {
    @Nullable String mbeanObjectName;
    ImmutableList<ImmutableMBeanAttribute> mbeanAttributes = ImmutableList.of();
    @JsonProperty("mbeanObjectName")
    public void setMbeanObjectName(String mbeanObjectName) {
      this.mbeanObjectName = mbeanObjectName;
    }
    @JsonProperty("mbeanAttributes")
    public void setMbeanAttributes(ImmutableList<ImmutableMBeanAttribute> mbeanAttributes) {
      this.mbeanAttributes = mbeanAttributes;
    }
    @Override
    public String mbeanObjectName() { throw new UnsupportedOperationException(); }
    @Override
    public ImmutableList<ImmutableMBeanAttribute> mbeanAttributes() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableGaugeConfig fromJson(Json json) {
    ImmutableGaugeConfig.Builder builder = ImmutableGaugeConfig.builder();
    if (json.mbeanObjectName != null) {
      builder.mbeanObjectName(json.mbeanObjectName);
    }
    if (json.mbeanAttributes != null) {
      builder.addAllMbeanAttributes(json.mbeanAttributes);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link GaugeConfig} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable GaugeConfig instance
   */
  public static ImmutableGaugeConfig copyOf(GaugeConfig instance) {
    if (instance instanceof ImmutableGaugeConfig) {
      return (ImmutableGaugeConfig) instance;
    }
    return ImmutableGaugeConfig.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableGaugeConfig ImmutableGaugeConfig}.
   * @return A new ImmutableGaugeConfig builder
   */
  public static ImmutableGaugeConfig.Builder builder() {
    return new ImmutableGaugeConfig.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableGaugeConfig ImmutableGaugeConfig}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_MBEAN_OBJECT_NAME = 0x1L;
    private long initBits = 0x1L;

    private @Nullable String mbeanObjectName;
    private ImmutableList.Builder<ImmutableMBeanAttribute> mbeanAttributes = ImmutableList.builder();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code GaugeConfig} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(GaugeConfig instance) {
      Preconditions.checkNotNull(instance, "instance");
      mbeanObjectName(instance.mbeanObjectName());
      addAllMbeanAttributes(instance.mbeanAttributes());
      return this;
    }

    /**
     * Initializes the value for the {@link GaugeConfig#mbeanObjectName() mbeanObjectName} attribute.
     * @param mbeanObjectName The value for mbeanObjectName 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder mbeanObjectName(String mbeanObjectName) {
      this.mbeanObjectName = Preconditions.checkNotNull(mbeanObjectName, "mbeanObjectName");
      initBits &= ~INIT_BIT_MBEAN_OBJECT_NAME;
      return this;
    }

    /**
     * Adds one element to {@link GaugeConfig#mbeanAttributes() mbeanAttributes} list.
     * @param element A mbeanAttributes element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addMbeanAttributes(ImmutableMBeanAttribute element) {
      this.mbeanAttributes.add(element);
      return this;
    }

    /**
     * Adds elements to {@link GaugeConfig#mbeanAttributes() mbeanAttributes} list.
     * @param elements An array of mbeanAttributes elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addMbeanAttributes(ImmutableMBeanAttribute... elements) {
      this.mbeanAttributes.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link GaugeConfig#mbeanAttributes() mbeanAttributes} list.
     * @param elements An iterable of mbeanAttributes elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder mbeanAttributes(Iterable<? extends ImmutableMBeanAttribute> elements) {
      this.mbeanAttributes = ImmutableList.builder();
      return addAllMbeanAttributes(elements);
    }

    /**
     * Adds elements to {@link GaugeConfig#mbeanAttributes() mbeanAttributes} list.
     * @param elements An iterable of mbeanAttributes elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllMbeanAttributes(Iterable<? extends ImmutableMBeanAttribute> elements) {
      this.mbeanAttributes.addAll(elements);
      return this;
    }

    /**
     * Builds a new {@link ImmutableGaugeConfig ImmutableGaugeConfig}.
     * @return An immutable instance of GaugeConfig
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableGaugeConfig build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableGaugeConfig(mbeanObjectName, mbeanAttributes.build());
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_MBEAN_OBJECT_NAME) != 0) attributes.add("mbeanObjectName");
      return "Cannot build GaugeConfig, some of required attributes are not set " + attributes;
    }
  }
}
