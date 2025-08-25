package org.glowroot.agent.shaded.glowroot.ui;

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
import org.glowroot.agent.shaded.glowroot.common.config.ImmutablePagerDutyIntegrationKey;

/**
 * Immutable implementation of {@link AdminJsonService.PagerDutyConfigDto}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePagerDutyConfigDto.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "AdminJsonService.PagerDutyConfigDto"})
@Immutable
final class ImmutablePagerDutyConfigDto extends AdminJsonService.PagerDutyConfigDto {
  private final ImmutableList<ImmutablePagerDutyIntegrationKey> integrationKeys;
  private final String version;

  private ImmutablePagerDutyConfigDto(
      ImmutableList<ImmutablePagerDutyIntegrationKey> integrationKeys,
      String version) {
    this.integrationKeys = integrationKeys;
    this.version = version;
  }

  /**
   * @return The value of the {@code integrationKeys} attribute
   */
  @JsonProperty("integrationKeys")
  @Override
  public ImmutableList<ImmutablePagerDutyIntegrationKey> integrationKeys() {
    return integrationKeys;
  }

  /**
   * @return The value of the {@code version} attribute
   */
  @JsonProperty("version")
  @Override
  String version() {
    return version;
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link AdminJsonService.PagerDutyConfigDto#integrationKeys() integrationKeys}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePagerDutyConfigDto withIntegrationKeys(ImmutablePagerDutyIntegrationKey... elements) {
    ImmutableList<ImmutablePagerDutyIntegrationKey> newValue = ImmutableList.copyOf(elements);
    return new ImmutablePagerDutyConfigDto(newValue, this.version);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link AdminJsonService.PagerDutyConfigDto#integrationKeys() integrationKeys}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of integrationKeys elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePagerDutyConfigDto withIntegrationKeys(Iterable<? extends ImmutablePagerDutyIntegrationKey> elements) {
    if (this.integrationKeys == elements) return this;
    ImmutableList<ImmutablePagerDutyIntegrationKey> newValue = ImmutableList.copyOf(elements);
    return new ImmutablePagerDutyConfigDto(newValue, this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AdminJsonService.PagerDutyConfigDto#version() version} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for version
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePagerDutyConfigDto withVersion(String value) {
    if (this.version.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "version");
    return new ImmutablePagerDutyConfigDto(this.integrationKeys, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePagerDutyConfigDto} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePagerDutyConfigDto
        && equalTo((ImmutablePagerDutyConfigDto) another);
  }

  private boolean equalTo(ImmutablePagerDutyConfigDto another) {
    return integrationKeys.equals(another.integrationKeys)
        && version.equals(another.version);
  }

  /**
   * Computes a hash code from attributes: {@code integrationKeys}, {@code version}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + integrationKeys.hashCode();
    h += (h << 5) + version.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code PagerDutyConfigDto} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("PagerDutyConfigDto")
        .omitNullValues()
        .add("integrationKeys", integrationKeys)
        .add("version", version)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends AdminJsonService.PagerDutyConfigDto {
    List<ImmutablePagerDutyIntegrationKey> integrationKeys = ImmutableList.of();
    @Nullable String version;
    @JsonProperty("integrationKeys")
    public void setIntegrationKeys(List<ImmutablePagerDutyIntegrationKey> integrationKeys) {
      this.integrationKeys = integrationKeys;
    }
    @JsonProperty("version")
    public void setVersion(String version) {
      this.version = version;
    }
    @Override
    public List<ImmutablePagerDutyIntegrationKey> integrationKeys() { throw new UnsupportedOperationException(); }
    @Override
    String version() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutablePagerDutyConfigDto fromJson(Json json) {
    ImmutablePagerDutyConfigDto.Builder builder = ImmutablePagerDutyConfigDto.builder();
    if (json.integrationKeys != null) {
      builder.addAllIntegrationKeys(json.integrationKeys);
    }
    if (json.version != null) {
      builder.version(json.version);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link AdminJsonService.PagerDutyConfigDto} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable PagerDutyConfigDto instance
   */
  public static ImmutablePagerDutyConfigDto copyOf(AdminJsonService.PagerDutyConfigDto instance) {
    if (instance instanceof ImmutablePagerDutyConfigDto) {
      return (ImmutablePagerDutyConfigDto) instance;
    }
    return ImmutablePagerDutyConfigDto.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutablePagerDutyConfigDto ImmutablePagerDutyConfigDto}.
   * @return A new ImmutablePagerDutyConfigDto builder
   */
  public static ImmutablePagerDutyConfigDto.Builder builder() {
    return new ImmutablePagerDutyConfigDto.Builder();
  }

  /**
   * Builds instances of type {@link ImmutablePagerDutyConfigDto ImmutablePagerDutyConfigDto}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_VERSION = 0x1L;
    private long initBits = 0x1L;

    private ImmutableList.Builder<ImmutablePagerDutyIntegrationKey> integrationKeys = ImmutableList.builder();
    private @Nullable String version;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code PagerDutyConfigDto} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(AdminJsonService.PagerDutyConfigDto instance) {
      Preconditions.checkNotNull(instance, "instance");
      addAllIntegrationKeys(instance.integrationKeys());
      version(instance.version());
      return this;
    }

    /**
     * Adds one element to {@link AdminJsonService.PagerDutyConfigDto#integrationKeys() integrationKeys} list.
     * @param element A integrationKeys element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addIntegrationKeys(ImmutablePagerDutyIntegrationKey element) {
      this.integrationKeys.add(element);
      return this;
    }

    /**
     * Adds elements to {@link AdminJsonService.PagerDutyConfigDto#integrationKeys() integrationKeys} list.
     * @param elements An array of integrationKeys elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addIntegrationKeys(ImmutablePagerDutyIntegrationKey... elements) {
      this.integrationKeys.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link AdminJsonService.PagerDutyConfigDto#integrationKeys() integrationKeys} list.
     * @param elements An iterable of integrationKeys elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder integrationKeys(Iterable<? extends ImmutablePagerDutyIntegrationKey> elements) {
      this.integrationKeys = ImmutableList.builder();
      return addAllIntegrationKeys(elements);
    }

    /**
     * Adds elements to {@link AdminJsonService.PagerDutyConfigDto#integrationKeys() integrationKeys} list.
     * @param elements An iterable of integrationKeys elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllIntegrationKeys(Iterable<? extends ImmutablePagerDutyIntegrationKey> elements) {
      this.integrationKeys.addAll(elements);
      return this;
    }

    /**
     * Initializes the value for the {@link AdminJsonService.PagerDutyConfigDto#version() version} attribute.
     * @param version The value for version 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder version(String version) {
      this.version = Preconditions.checkNotNull(version, "version");
      initBits &= ~INIT_BIT_VERSION;
      return this;
    }

    /**
     * Builds a new {@link ImmutablePagerDutyConfigDto ImmutablePagerDutyConfigDto}.
     * @return An immutable instance of PagerDutyConfigDto
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutablePagerDutyConfigDto build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutablePagerDutyConfigDto(integrationKeys.build(), version);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_VERSION) != 0) attributes.add("version");
      return "Cannot build PagerDutyConfigDto, some of required attributes are not set " + attributes;
    }
  }
}
