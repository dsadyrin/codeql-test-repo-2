package org.glowroot.agent.shaded.glowroot.ui;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import org.glowroot.agent.shaded.google.common.collect.Lists;
import org.glowroot.agent.shaded.google.common.primitives.Booleans;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link GaugeConfigJsonService.MBeanAttributeDto}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMBeanAttributeDto.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code ImmutableMBeanAttributeDto.of()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "GaugeConfigJsonService.MBeanAttributeDto"})
@Immutable
final class ImmutableMBeanAttributeDto extends GaugeConfigJsonService.MBeanAttributeDto {
  private final String name;
  private final boolean counter;

  private ImmutableMBeanAttributeDto(String name, boolean counter) {
    this.name = Preconditions.checkNotNull(name, "name");
    this.counter = counter;
  }

  private ImmutableMBeanAttributeDto(ImmutableMBeanAttributeDto original, String name, boolean counter) {
    this.name = name;
    this.counter = counter;
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @JsonProperty("name")
  @Override
  String name() {
    return name;
  }

  /**
   * @return The value of the {@code counter} attribute
   */
  @JsonProperty("counter")
  @Override
  boolean counter() {
    return counter;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link GaugeConfigJsonService.MBeanAttributeDto#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMBeanAttributeDto withName(String value) {
    if (this.name.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "name");
    return new ImmutableMBeanAttributeDto(this, newValue, this.counter);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link GaugeConfigJsonService.MBeanAttributeDto#counter() counter} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for counter
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMBeanAttributeDto withCounter(boolean value) {
    if (this.counter == value) return this;
    return new ImmutableMBeanAttributeDto(this, this.name, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMBeanAttributeDto} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMBeanAttributeDto
        && equalTo((ImmutableMBeanAttributeDto) another);
  }

  private boolean equalTo(ImmutableMBeanAttributeDto another) {
    return name.equals(another.name)
        && counter == another.counter;
  }

  /**
   * Computes a hash code from attributes: {@code name}, {@code counter}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + name.hashCode();
    h += (h << 5) + Booleans.hashCode(counter);
    return h;
  }

  /**
   * Prints the immutable value {@code MBeanAttributeDto} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("MBeanAttributeDto")
        .omitNullValues()
        .add("name", name)
        .add("counter", counter)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends GaugeConfigJsonService.MBeanAttributeDto {
    @Nullable String name;
    boolean counter;
    boolean counterIsSet;
    @JsonProperty("name")
    public void setName(String name) {
      this.name = name;
    }
    @JsonProperty("counter")
    public void setCounter(boolean counter) {
      this.counter = counter;
      this.counterIsSet = true;
    }
    @Override
    String name() { throw new UnsupportedOperationException(); }
    @Override
    boolean counter() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableMBeanAttributeDto fromJson(Json json) {
    ImmutableMBeanAttributeDto.Builder builder = ImmutableMBeanAttributeDto.builder();
    if (json.name != null) {
      builder.name(json.name);
    }
    if (json.counterIsSet) {
      builder.counter(json.counter);
    }
    return builder.build();
  }

  /**
   * Construct a new immutable {@code MBeanAttributeDto} instance.
   * @param name The value for the {@code name} attribute
   * @param counter The value for the {@code counter} attribute
   * @return An immutable MBeanAttributeDto instance
   */
  public static ImmutableMBeanAttributeDto of(String name, boolean counter) {
    return new ImmutableMBeanAttributeDto(name, counter);
  }

  /**
   * Creates an immutable copy of a {@link GaugeConfigJsonService.MBeanAttributeDto} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MBeanAttributeDto instance
   */
  public static ImmutableMBeanAttributeDto copyOf(GaugeConfigJsonService.MBeanAttributeDto instance) {
    if (instance instanceof ImmutableMBeanAttributeDto) {
      return (ImmutableMBeanAttributeDto) instance;
    }
    return ImmutableMBeanAttributeDto.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableMBeanAttributeDto ImmutableMBeanAttributeDto}.
   * @return A new ImmutableMBeanAttributeDto builder
   */
  public static ImmutableMBeanAttributeDto.Builder builder() {
    return new ImmutableMBeanAttributeDto.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableMBeanAttributeDto ImmutableMBeanAttributeDto}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_NAME = 0x1L;
    private static final long INIT_BIT_COUNTER = 0x2L;
    private long initBits = 0x3L;

    private @Nullable String name;
    private boolean counter;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code MBeanAttributeDto} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(GaugeConfigJsonService.MBeanAttributeDto instance) {
      Preconditions.checkNotNull(instance, "instance");
      name(instance.name());
      counter(instance.counter());
      return this;
    }

    /**
     * Initializes the value for the {@link GaugeConfigJsonService.MBeanAttributeDto#name() name} attribute.
     * @param name The value for name 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder name(String name) {
      this.name = Preconditions.checkNotNull(name, "name");
      initBits &= ~INIT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link GaugeConfigJsonService.MBeanAttributeDto#counter() counter} attribute.
     * @param counter The value for counter 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder counter(boolean counter) {
      this.counter = counter;
      initBits &= ~INIT_BIT_COUNTER;
      return this;
    }

    /**
     * Builds a new {@link ImmutableMBeanAttributeDto ImmutableMBeanAttributeDto}.
     * @return An immutable instance of MBeanAttributeDto
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableMBeanAttributeDto build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableMBeanAttributeDto(null, name, counter);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      if ((initBits & INIT_BIT_COUNTER) != 0) attributes.add("counter");
      return "Cannot build MBeanAttributeDto, some of required attributes are not set " + attributes;
    }
  }
}
