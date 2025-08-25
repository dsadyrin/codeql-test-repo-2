package org.glowroot.agent.shaded.glowroot.ui;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Objects;
import org.glowroot.agent.shaded.google.common.base.Optional;
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
 * Immutable implementation of {@link GaugeConfigJsonService.GaugeConfigDto}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableGaugeConfigDto.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "GaugeConfigJsonService.GaugeConfigDto"})
@Immutable
final class ImmutableGaugeConfigDto extends GaugeConfigJsonService.GaugeConfigDto {
  private final @Nullable String display;
  private final ImmutableList<String> displayPath;
  private final String mbeanObjectName;
  private final ImmutableList<ImmutableMBeanAttributeDto> mbeanAttributes;
  private final Optional<String> version;

  private ImmutableGaugeConfigDto(
      @Nullable String display,
      ImmutableList<String> displayPath,
      String mbeanObjectName,
      ImmutableList<ImmutableMBeanAttributeDto> mbeanAttributes,
      Optional<String> version) {
    this.display = display;
    this.displayPath = displayPath;
    this.mbeanObjectName = mbeanObjectName;
    this.mbeanAttributes = mbeanAttributes;
    this.version = version;
  }

  /**
   * @return The value of the {@code display} attribute
   */
  @JsonProperty("display")
  @Override
  @Nullable String display() {
    return display;
  }

  /**
   * @return The value of the {@code displayPath} attribute
   */
  @JsonProperty("displayPath")
  @Override
  ImmutableList<String> displayPath() {
    return displayPath;
  }

  /**
   * @return The value of the {@code mbeanObjectName} attribute
   */
  @JsonProperty("mbeanObjectName")
  @Override
  String mbeanObjectName() {
    return mbeanObjectName;
  }

  /**
   * @return The value of the {@code mbeanAttributes} attribute
   */
  @JsonProperty("mbeanAttributes")
  @Override
  ImmutableList<ImmutableMBeanAttributeDto> mbeanAttributes() {
    return mbeanAttributes;
  }

  /**
   * @return The value of the {@code version} attribute
   */
  @JsonProperty("version")
  @Override
  Optional<String> version() {
    return version;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link GaugeConfigJsonService.GaugeConfigDto#display() display} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for display (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableGaugeConfigDto withDisplay(@Nullable String value) {
    if (Objects.equal(this.display, value)) return this;
    return new ImmutableGaugeConfigDto(value, this.displayPath, this.mbeanObjectName, this.mbeanAttributes, this.version);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link GaugeConfigJsonService.GaugeConfigDto#displayPath() displayPath}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGaugeConfigDto withDisplayPath(String... elements) {
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableGaugeConfigDto(this.display, newValue, this.mbeanObjectName, this.mbeanAttributes, this.version);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link GaugeConfigJsonService.GaugeConfigDto#displayPath() displayPath}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of displayPath elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGaugeConfigDto withDisplayPath(Iterable<String> elements) {
    if (this.displayPath == elements) return this;
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableGaugeConfigDto(this.display, newValue, this.mbeanObjectName, this.mbeanAttributes, this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link GaugeConfigJsonService.GaugeConfigDto#mbeanObjectName() mbeanObjectName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for mbeanObjectName
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableGaugeConfigDto withMbeanObjectName(String value) {
    if (this.mbeanObjectName.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "mbeanObjectName");
    return new ImmutableGaugeConfigDto(this.display, this.displayPath, newValue, this.mbeanAttributes, this.version);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link GaugeConfigJsonService.GaugeConfigDto#mbeanAttributes() mbeanAttributes}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGaugeConfigDto withMbeanAttributes(ImmutableMBeanAttributeDto... elements) {
    ImmutableList<ImmutableMBeanAttributeDto> newValue = ImmutableList.copyOf(elements);
    return new ImmutableGaugeConfigDto(this.display, this.displayPath, this.mbeanObjectName, newValue, this.version);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link GaugeConfigJsonService.GaugeConfigDto#mbeanAttributes() mbeanAttributes}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of mbeanAttributes elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGaugeConfigDto withMbeanAttributes(Iterable<? extends ImmutableMBeanAttributeDto> elements) {
    if (this.mbeanAttributes == elements) return this;
    ImmutableList<ImmutableMBeanAttributeDto> newValue = ImmutableList.copyOf(elements);
    return new ImmutableGaugeConfigDto(this.display, this.displayPath, this.mbeanObjectName, newValue, this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GaugeConfigJsonService.GaugeConfigDto#version() version} attribute.
   * @param value The value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGaugeConfigDto withVersion(String value) {
    Optional<String> newValue = Optional.of(value);
    if (this.version.equals(newValue)) return this;
    return new ImmutableGaugeConfigDto(this.display, this.displayPath, this.mbeanObjectName, this.mbeanAttributes, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GaugeConfigJsonService.GaugeConfigDto#version() version} attribute.
   * An equality check is used to prevent copying of the same value by returning {@code this}.
   * @param optional A value for version
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGaugeConfigDto withVersion(Optional<String> optional) {
    Optional<String> value = (Optional<String>) optional;
    if (this.version.equals(value)) return this;
    return new ImmutableGaugeConfigDto(this.display, this.displayPath, this.mbeanObjectName, this.mbeanAttributes, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableGaugeConfigDto} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableGaugeConfigDto
        && equalTo((ImmutableGaugeConfigDto) another);
  }

  private boolean equalTo(ImmutableGaugeConfigDto another) {
    return Objects.equal(display, another.display)
        && displayPath.equals(another.displayPath)
        && mbeanObjectName.equals(another.mbeanObjectName)
        && mbeanAttributes.equals(another.mbeanAttributes)
        && version.equals(another.version);
  }

  /**
   * Computes a hash code from attributes: {@code display}, {@code displayPath}, {@code mbeanObjectName}, {@code mbeanAttributes}, {@code version}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(display);
    h += (h << 5) + displayPath.hashCode();
    h += (h << 5) + mbeanObjectName.hashCode();
    h += (h << 5) + mbeanAttributes.hashCode();
    h += (h << 5) + version.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code GaugeConfigDto} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("GaugeConfigDto")
        .omitNullValues()
        .add("display", display)
        .add("displayPath", displayPath)
        .add("mbeanObjectName", mbeanObjectName)
        .add("mbeanAttributes", mbeanAttributes)
        .add("version", version.orNull())
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends GaugeConfigJsonService.GaugeConfigDto {
    @Nullable String display;
    List<String> displayPath = ImmutableList.of();
    @Nullable String mbeanObjectName;
    ImmutableList<ImmutableMBeanAttributeDto> mbeanAttributes = ImmutableList.of();
    Optional<String> version = Optional.absent();
    @JsonProperty("display")
    public void setDisplay(@Nullable String display) {
      this.display = display;
    }
    @JsonProperty("displayPath")
    public void setDisplayPath(List<String> displayPath) {
      this.displayPath = displayPath;
    }
    @JsonProperty("mbeanObjectName")
    public void setMbeanObjectName(String mbeanObjectName) {
      this.mbeanObjectName = mbeanObjectName;
    }
    @JsonProperty("mbeanAttributes")
    public void setMbeanAttributes(ImmutableList<ImmutableMBeanAttributeDto> mbeanAttributes) {
      this.mbeanAttributes = mbeanAttributes;
    }
    @JsonProperty("version")
    public void setVersion(Optional<String> version) {
      this.version = version;
    }
    @Override
    String display() { throw new UnsupportedOperationException(); }
    @Override
    List<String> displayPath() { throw new UnsupportedOperationException(); }
    @Override
    String mbeanObjectName() { throw new UnsupportedOperationException(); }
    @Override
    ImmutableList<ImmutableMBeanAttributeDto> mbeanAttributes() { throw new UnsupportedOperationException(); }
    @Override
    Optional<String> version() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableGaugeConfigDto fromJson(Json json) {
    ImmutableGaugeConfigDto.Builder builder = ImmutableGaugeConfigDto.builder();
    if (json.display != null) {
      builder.display(json.display);
    }
    if (json.displayPath != null) {
      builder.addAllDisplayPath(json.displayPath);
    }
    if (json.mbeanObjectName != null) {
      builder.mbeanObjectName(json.mbeanObjectName);
    }
    if (json.mbeanAttributes != null) {
      builder.addAllMbeanAttributes(json.mbeanAttributes);
    }
    if (json.version != null) {
      builder.version(json.version);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link GaugeConfigJsonService.GaugeConfigDto} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable GaugeConfigDto instance
   */
  public static ImmutableGaugeConfigDto copyOf(GaugeConfigJsonService.GaugeConfigDto instance) {
    if (instance instanceof ImmutableGaugeConfigDto) {
      return (ImmutableGaugeConfigDto) instance;
    }
    return ImmutableGaugeConfigDto.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableGaugeConfigDto ImmutableGaugeConfigDto}.
   * @return A new ImmutableGaugeConfigDto builder
   */
  public static ImmutableGaugeConfigDto.Builder builder() {
    return new ImmutableGaugeConfigDto.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableGaugeConfigDto ImmutableGaugeConfigDto}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_MBEAN_OBJECT_NAME = 0x1L;
    private long initBits = 0x1L;

    private @Nullable String display;
    private ImmutableList.Builder<String> displayPath = ImmutableList.builder();
    private @Nullable String mbeanObjectName;
    private ImmutableList.Builder<ImmutableMBeanAttributeDto> mbeanAttributes = ImmutableList.builder();
    private Optional<String> version = Optional.absent();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code GaugeConfigDto} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(GaugeConfigJsonService.GaugeConfigDto instance) {
      Preconditions.checkNotNull(instance, "instance");
      @Nullable String displayValue = instance.display();
      if (displayValue != null) {
        display(displayValue);
      }
      addAllDisplayPath(instance.displayPath());
      mbeanObjectName(instance.mbeanObjectName());
      addAllMbeanAttributes(instance.mbeanAttributes());
      Optional<String> versionOptional = instance.version();
      if (versionOptional.isPresent()) {
        version(versionOptional);
      }
      return this;
    }

    /**
     * Initializes the value for the {@link GaugeConfigJsonService.GaugeConfigDto#display() display} attribute.
     * @param display The value for display (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder display(@Nullable String display) {
      this.display = display;
      return this;
    }

    /**
     * Adds one element to {@link GaugeConfigJsonService.GaugeConfigDto#displayPath() displayPath} list.
     * @param element A displayPath element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addDisplayPath(String element) {
      this.displayPath.add(element);
      return this;
    }

    /**
     * Adds elements to {@link GaugeConfigJsonService.GaugeConfigDto#displayPath() displayPath} list.
     * @param elements An array of displayPath elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addDisplayPath(String... elements) {
      this.displayPath.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link GaugeConfigJsonService.GaugeConfigDto#displayPath() displayPath} list.
     * @param elements An iterable of displayPath elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder displayPath(Iterable<String> elements) {
      this.displayPath = ImmutableList.builder();
      return addAllDisplayPath(elements);
    }

    /**
     * Adds elements to {@link GaugeConfigJsonService.GaugeConfigDto#displayPath() displayPath} list.
     * @param elements An iterable of displayPath elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllDisplayPath(Iterable<String> elements) {
      this.displayPath.addAll(elements);
      return this;
    }

    /**
     * Initializes the value for the {@link GaugeConfigJsonService.GaugeConfigDto#mbeanObjectName() mbeanObjectName} attribute.
     * @param mbeanObjectName The value for mbeanObjectName 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder mbeanObjectName(String mbeanObjectName) {
      this.mbeanObjectName = Preconditions.checkNotNull(mbeanObjectName, "mbeanObjectName");
      initBits &= ~INIT_BIT_MBEAN_OBJECT_NAME;
      return this;
    }

    /**
     * Adds one element to {@link GaugeConfigJsonService.GaugeConfigDto#mbeanAttributes() mbeanAttributes} list.
     * @param element A mbeanAttributes element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addMbeanAttributes(ImmutableMBeanAttributeDto element) {
      this.mbeanAttributes.add(element);
      return this;
    }

    /**
     * Adds elements to {@link GaugeConfigJsonService.GaugeConfigDto#mbeanAttributes() mbeanAttributes} list.
     * @param elements An array of mbeanAttributes elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addMbeanAttributes(ImmutableMBeanAttributeDto... elements) {
      this.mbeanAttributes.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link GaugeConfigJsonService.GaugeConfigDto#mbeanAttributes() mbeanAttributes} list.
     * @param elements An iterable of mbeanAttributes elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder mbeanAttributes(Iterable<? extends ImmutableMBeanAttributeDto> elements) {
      this.mbeanAttributes = ImmutableList.builder();
      return addAllMbeanAttributes(elements);
    }

    /**
     * Adds elements to {@link GaugeConfigJsonService.GaugeConfigDto#mbeanAttributes() mbeanAttributes} list.
     * @param elements An iterable of mbeanAttributes elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllMbeanAttributes(Iterable<? extends ImmutableMBeanAttributeDto> elements) {
      this.mbeanAttributes.addAll(elements);
      return this;
    }

    /**
     * Initializes the optional value {@link GaugeConfigJsonService.GaugeConfigDto#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    public final Builder version(String version) {
      this.version = Optional.of(version);
      return this;
    }

    /**
     * Initializes the optional value {@link GaugeConfigJsonService.GaugeConfigDto#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    @SuppressWarnings("unchecked") // safe covariant cast
    public final Builder version(Optional<String> version) {
      this.version = (Optional<String>) version;
      return this;
    }

    /**
     * Builds a new {@link ImmutableGaugeConfigDto ImmutableGaugeConfigDto}.
     * @return An immutable instance of GaugeConfigDto
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableGaugeConfigDto build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableGaugeConfigDto(display, displayPath.build(), mbeanObjectName, mbeanAttributes.build(), version);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_MBEAN_OBJECT_NAME) != 0) attributes.add("mbeanObjectName");
      return "Cannot build GaugeConfigDto, some of required attributes are not set " + attributes;
    }
  }
}
