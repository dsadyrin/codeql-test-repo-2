package org.glowroot.agent.shaded.glowroot.ui;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import org.glowroot.agent.shaded.google.common.collect.ImmutableList;
import org.glowroot.agent.shaded.google.common.collect.Lists;
import org.glowroot.agent.shaded.google.common.primitives.Booleans;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link GaugeConfigJsonService.MBeanAttributeNamesResponse}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMBeanAttributeNamesResponse.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "GaugeConfigJsonService.MBeanAttributeNamesResponse"})
@Immutable
final class ImmutableMBeanAttributeNamesResponse
    implements GaugeConfigJsonService.MBeanAttributeNamesResponse {
  private final boolean mbeanUnavailable;
  private final boolean mbeanUnmatched;
  private final boolean duplicateMBean;
  private final ImmutableList<String> mbeanAttributes;

  private ImmutableMBeanAttributeNamesResponse(
      boolean mbeanUnavailable,
      boolean mbeanUnmatched,
      boolean duplicateMBean,
      ImmutableList<String> mbeanAttributes) {
    this.mbeanUnavailable = mbeanUnavailable;
    this.mbeanUnmatched = mbeanUnmatched;
    this.duplicateMBean = duplicateMBean;
    this.mbeanAttributes = mbeanAttributes;
  }

  /**
   * @return The value of the {@code mbeanUnavailable} attribute
   */
  @JsonProperty("mbeanUnavailable")
  @Override
  public boolean mbeanUnavailable() {
    return mbeanUnavailable;
  }

  /**
   * @return The value of the {@code mbeanUnmatched} attribute
   */
  @JsonProperty("mbeanUnmatched")
  @Override
  public boolean mbeanUnmatched() {
    return mbeanUnmatched;
  }

  /**
   * @return The value of the {@code duplicateMBean} attribute
   */
  @JsonProperty("duplicateMBean")
  @Override
  public boolean duplicateMBean() {
    return duplicateMBean;
  }

  /**
   * @return The value of the {@code mbeanAttributes} attribute
   */
  @JsonProperty("mbeanAttributes")
  @Override
  public ImmutableList<String> mbeanAttributes() {
    return mbeanAttributes;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link GaugeConfigJsonService.MBeanAttributeNamesResponse#mbeanUnavailable() mbeanUnavailable} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for mbeanUnavailable
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMBeanAttributeNamesResponse withMbeanUnavailable(boolean value) {
    if (this.mbeanUnavailable == value) return this;
    return new ImmutableMBeanAttributeNamesResponse(value, this.mbeanUnmatched, this.duplicateMBean, this.mbeanAttributes);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link GaugeConfigJsonService.MBeanAttributeNamesResponse#mbeanUnmatched() mbeanUnmatched} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for mbeanUnmatched
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMBeanAttributeNamesResponse withMbeanUnmatched(boolean value) {
    if (this.mbeanUnmatched == value) return this;
    return new ImmutableMBeanAttributeNamesResponse(this.mbeanUnavailable, value, this.duplicateMBean, this.mbeanAttributes);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link GaugeConfigJsonService.MBeanAttributeNamesResponse#duplicateMBean() duplicateMBean} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for duplicateMBean
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMBeanAttributeNamesResponse withDuplicateMBean(boolean value) {
    if (this.duplicateMBean == value) return this;
    return new ImmutableMBeanAttributeNamesResponse(this.mbeanUnavailable, this.mbeanUnmatched, value, this.mbeanAttributes);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link GaugeConfigJsonService.MBeanAttributeNamesResponse#mbeanAttributes() mbeanAttributes}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMBeanAttributeNamesResponse withMbeanAttributes(String... elements) {
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableMBeanAttributeNamesResponse(this.mbeanUnavailable, this.mbeanUnmatched, this.duplicateMBean, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link GaugeConfigJsonService.MBeanAttributeNamesResponse#mbeanAttributes() mbeanAttributes}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of mbeanAttributes elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMBeanAttributeNamesResponse withMbeanAttributes(Iterable<String> elements) {
    if (this.mbeanAttributes == elements) return this;
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableMBeanAttributeNamesResponse(this.mbeanUnavailable, this.mbeanUnmatched, this.duplicateMBean, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMBeanAttributeNamesResponse} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMBeanAttributeNamesResponse
        && equalTo((ImmutableMBeanAttributeNamesResponse) another);
  }

  private boolean equalTo(ImmutableMBeanAttributeNamesResponse another) {
    return mbeanUnavailable == another.mbeanUnavailable
        && mbeanUnmatched == another.mbeanUnmatched
        && duplicateMBean == another.duplicateMBean
        && mbeanAttributes.equals(another.mbeanAttributes);
  }

  /**
   * Computes a hash code from attributes: {@code mbeanUnavailable}, {@code mbeanUnmatched}, {@code duplicateMBean}, {@code mbeanAttributes}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Booleans.hashCode(mbeanUnavailable);
    h += (h << 5) + Booleans.hashCode(mbeanUnmatched);
    h += (h << 5) + Booleans.hashCode(duplicateMBean);
    h += (h << 5) + mbeanAttributes.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code MBeanAttributeNamesResponse} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("MBeanAttributeNamesResponse")
        .omitNullValues()
        .add("mbeanUnavailable", mbeanUnavailable)
        .add("mbeanUnmatched", mbeanUnmatched)
        .add("duplicateMBean", duplicateMBean)
        .add("mbeanAttributes", mbeanAttributes)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements GaugeConfigJsonService.MBeanAttributeNamesResponse {
    boolean mbeanUnavailable;
    boolean mbeanUnavailableIsSet;
    boolean mbeanUnmatched;
    boolean mbeanUnmatchedIsSet;
    boolean duplicateMBean;
    boolean duplicateMBeanIsSet;
    ImmutableList<String> mbeanAttributes = ImmutableList.of();
    @JsonProperty("mbeanUnavailable")
    public void setMbeanUnavailable(boolean mbeanUnavailable) {
      this.mbeanUnavailable = mbeanUnavailable;
      this.mbeanUnavailableIsSet = true;
    }
    @JsonProperty("mbeanUnmatched")
    public void setMbeanUnmatched(boolean mbeanUnmatched) {
      this.mbeanUnmatched = mbeanUnmatched;
      this.mbeanUnmatchedIsSet = true;
    }
    @JsonProperty("duplicateMBean")
    public void setDuplicateMBean(boolean duplicateMBean) {
      this.duplicateMBean = duplicateMBean;
      this.duplicateMBeanIsSet = true;
    }
    @JsonProperty("mbeanAttributes")
    public void setMbeanAttributes(ImmutableList<String> mbeanAttributes) {
      this.mbeanAttributes = mbeanAttributes;
    }
    @Override
    public boolean mbeanUnavailable() { throw new UnsupportedOperationException(); }
    @Override
    public boolean mbeanUnmatched() { throw new UnsupportedOperationException(); }
    @Override
    public boolean duplicateMBean() { throw new UnsupportedOperationException(); }
    @Override
    public ImmutableList<String> mbeanAttributes() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableMBeanAttributeNamesResponse fromJson(Json json) {
    ImmutableMBeanAttributeNamesResponse.Builder builder = ImmutableMBeanAttributeNamesResponse.builder();
    if (json.mbeanUnavailableIsSet) {
      builder.mbeanUnavailable(json.mbeanUnavailable);
    }
    if (json.mbeanUnmatchedIsSet) {
      builder.mbeanUnmatched(json.mbeanUnmatched);
    }
    if (json.duplicateMBeanIsSet) {
      builder.duplicateMBean(json.duplicateMBean);
    }
    if (json.mbeanAttributes != null) {
      builder.addAllMbeanAttributes(json.mbeanAttributes);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link GaugeConfigJsonService.MBeanAttributeNamesResponse} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MBeanAttributeNamesResponse instance
   */
  public static ImmutableMBeanAttributeNamesResponse copyOf(GaugeConfigJsonService.MBeanAttributeNamesResponse instance) {
    if (instance instanceof ImmutableMBeanAttributeNamesResponse) {
      return (ImmutableMBeanAttributeNamesResponse) instance;
    }
    return ImmutableMBeanAttributeNamesResponse.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableMBeanAttributeNamesResponse ImmutableMBeanAttributeNamesResponse}.
   * @return A new ImmutableMBeanAttributeNamesResponse builder
   */
  public static ImmutableMBeanAttributeNamesResponse.Builder builder() {
    return new ImmutableMBeanAttributeNamesResponse.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableMBeanAttributeNamesResponse ImmutableMBeanAttributeNamesResponse}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_MBEAN_UNAVAILABLE = 0x1L;
    private static final long INIT_BIT_MBEAN_UNMATCHED = 0x2L;
    private static final long INIT_BIT_DUPLICATE_M_BEAN = 0x4L;
    private long initBits = 0x7L;

    private boolean mbeanUnavailable;
    private boolean mbeanUnmatched;
    private boolean duplicateMBean;
    private ImmutableList.Builder<String> mbeanAttributes = ImmutableList.builder();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code MBeanAttributeNamesResponse} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(GaugeConfigJsonService.MBeanAttributeNamesResponse instance) {
      Preconditions.checkNotNull(instance, "instance");
      mbeanUnavailable(instance.mbeanUnavailable());
      mbeanUnmatched(instance.mbeanUnmatched());
      duplicateMBean(instance.duplicateMBean());
      addAllMbeanAttributes(instance.mbeanAttributes());
      return this;
    }

    /**
     * Initializes the value for the {@link GaugeConfigJsonService.MBeanAttributeNamesResponse#mbeanUnavailable() mbeanUnavailable} attribute.
     * @param mbeanUnavailable The value for mbeanUnavailable 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder mbeanUnavailable(boolean mbeanUnavailable) {
      this.mbeanUnavailable = mbeanUnavailable;
      initBits &= ~INIT_BIT_MBEAN_UNAVAILABLE;
      return this;
    }

    /**
     * Initializes the value for the {@link GaugeConfigJsonService.MBeanAttributeNamesResponse#mbeanUnmatched() mbeanUnmatched} attribute.
     * @param mbeanUnmatched The value for mbeanUnmatched 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder mbeanUnmatched(boolean mbeanUnmatched) {
      this.mbeanUnmatched = mbeanUnmatched;
      initBits &= ~INIT_BIT_MBEAN_UNMATCHED;
      return this;
    }

    /**
     * Initializes the value for the {@link GaugeConfigJsonService.MBeanAttributeNamesResponse#duplicateMBean() duplicateMBean} attribute.
     * @param duplicateMBean The value for duplicateMBean 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder duplicateMBean(boolean duplicateMBean) {
      this.duplicateMBean = duplicateMBean;
      initBits &= ~INIT_BIT_DUPLICATE_M_BEAN;
      return this;
    }

    /**
     * Adds one element to {@link GaugeConfigJsonService.MBeanAttributeNamesResponse#mbeanAttributes() mbeanAttributes} list.
     * @param element A mbeanAttributes element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addMbeanAttributes(String element) {
      this.mbeanAttributes.add(element);
      return this;
    }

    /**
     * Adds elements to {@link GaugeConfigJsonService.MBeanAttributeNamesResponse#mbeanAttributes() mbeanAttributes} list.
     * @param elements An array of mbeanAttributes elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addMbeanAttributes(String... elements) {
      this.mbeanAttributes.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link GaugeConfigJsonService.MBeanAttributeNamesResponse#mbeanAttributes() mbeanAttributes} list.
     * @param elements An iterable of mbeanAttributes elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder mbeanAttributes(Iterable<String> elements) {
      this.mbeanAttributes = ImmutableList.builder();
      return addAllMbeanAttributes(elements);
    }

    /**
     * Adds elements to {@link GaugeConfigJsonService.MBeanAttributeNamesResponse#mbeanAttributes() mbeanAttributes} list.
     * @param elements An iterable of mbeanAttributes elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllMbeanAttributes(Iterable<String> elements) {
      this.mbeanAttributes.addAll(elements);
      return this;
    }

    /**
     * Builds a new {@link ImmutableMBeanAttributeNamesResponse ImmutableMBeanAttributeNamesResponse}.
     * @return An immutable instance of MBeanAttributeNamesResponse
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableMBeanAttributeNamesResponse build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableMBeanAttributeNamesResponse(mbeanUnavailable, mbeanUnmatched, duplicateMBean, mbeanAttributes.build());
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_MBEAN_UNAVAILABLE) != 0) attributes.add("mbeanUnavailable");
      if ((initBits & INIT_BIT_MBEAN_UNMATCHED) != 0) attributes.add("mbeanUnmatched");
      if ((initBits & INIT_BIT_DUPLICATE_M_BEAN) != 0) attributes.add("duplicateMBean");
      return "Cannot build MBeanAttributeNamesResponse, some of required attributes are not set " + attributes;
    }
  }
}
