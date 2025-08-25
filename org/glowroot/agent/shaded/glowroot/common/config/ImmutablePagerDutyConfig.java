package org.glowroot.agent.shaded.glowroot.common.config;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonIgnore;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonInclude;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import org.glowroot.agent.shaded.google.common.collect.ImmutableList;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link PagerDutyConfig}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePagerDutyConfig.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "PagerDutyConfig"})
@Immutable
public final class ImmutablePagerDutyConfig extends PagerDutyConfig {
  private final ImmutableList<ImmutablePagerDutyIntegrationKey> integrationKeys;
  private final String version;

  private ImmutablePagerDutyConfig(ImmutableList<ImmutablePagerDutyIntegrationKey> integrationKeys) {
    this.integrationKeys = integrationKeys;
    this.version = Preconditions.checkNotNull(super.version(), "version");
  }

  /**
   * @return The value of the {@code integrationKeys} attribute
   */
  @JsonProperty("integrationKeys")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @Override
  public ImmutableList<ImmutablePagerDutyIntegrationKey> integrationKeys() {
    return integrationKeys;
  }

  /**
   * @return The computed-at-construction value of the {@code version} attribute
   */
  @JsonProperty("version")
  @JsonIgnore
  @Override
  public String version() {
    return version;
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link PagerDutyConfig#integrationKeys() integrationKeys}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePagerDutyConfig withIntegrationKeys(ImmutablePagerDutyIntegrationKey... elements) {
    ImmutableList<ImmutablePagerDutyIntegrationKey> newValue = ImmutableList.copyOf(elements);
    return new ImmutablePagerDutyConfig(newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link PagerDutyConfig#integrationKeys() integrationKeys}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of integrationKeys elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePagerDutyConfig withIntegrationKeys(Iterable<? extends ImmutablePagerDutyIntegrationKey> elements) {
    if (this.integrationKeys == elements) return this;
    ImmutableList<ImmutablePagerDutyIntegrationKey> newValue = ImmutableList.copyOf(elements);
    return new ImmutablePagerDutyConfig(newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePagerDutyConfig} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePagerDutyConfig
        && equalTo((ImmutablePagerDutyConfig) another);
  }

  private boolean equalTo(ImmutablePagerDutyConfig another) {
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
   * Prints the immutable value {@code PagerDutyConfig} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("PagerDutyConfig")
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
  static final class Json extends PagerDutyConfig {
    List<ImmutablePagerDutyIntegrationKey> integrationKeys = ImmutableList.of();
    @JsonProperty("integrationKeys")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public void setIntegrationKeys(List<ImmutablePagerDutyIntegrationKey> integrationKeys) {
      this.integrationKeys = integrationKeys;
    }
    @Override
    public List<ImmutablePagerDutyIntegrationKey> integrationKeys() { throw new UnsupportedOperationException(); }
    @Override
    public String version() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutablePagerDutyConfig fromJson(Json json) {
    ImmutablePagerDutyConfig.Builder builder = ImmutablePagerDutyConfig.builder();
    if (json.integrationKeys != null) {
      builder.addAllIntegrationKeys(json.integrationKeys);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link PagerDutyConfig} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable PagerDutyConfig instance
   */
  public static ImmutablePagerDutyConfig copyOf(PagerDutyConfig instance) {
    if (instance instanceof ImmutablePagerDutyConfig) {
      return (ImmutablePagerDutyConfig) instance;
    }
    return ImmutablePagerDutyConfig.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutablePagerDutyConfig ImmutablePagerDutyConfig}.
   * @return A new ImmutablePagerDutyConfig builder
   */
  public static ImmutablePagerDutyConfig.Builder builder() {
    return new ImmutablePagerDutyConfig.Builder();
  }

  /**
   * Builds instances of type {@link ImmutablePagerDutyConfig ImmutablePagerDutyConfig}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private ImmutableList.Builder<ImmutablePagerDutyIntegrationKey> integrationKeys = ImmutableList.builder();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code PagerDutyConfig} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(PagerDutyConfig instance) {
      Preconditions.checkNotNull(instance, "instance");
      addAllIntegrationKeys(instance.integrationKeys());
      return this;
    }

    /**
     * Adds one element to {@link PagerDutyConfig#integrationKeys() integrationKeys} list.
     * @param element A integrationKeys element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addIntegrationKeys(ImmutablePagerDutyIntegrationKey element) {
      this.integrationKeys.add(element);
      return this;
    }

    /**
     * Adds elements to {@link PagerDutyConfig#integrationKeys() integrationKeys} list.
     * @param elements An array of integrationKeys elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addIntegrationKeys(ImmutablePagerDutyIntegrationKey... elements) {
      this.integrationKeys.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link PagerDutyConfig#integrationKeys() integrationKeys} list.
     * @param elements An iterable of integrationKeys elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder integrationKeys(Iterable<? extends ImmutablePagerDutyIntegrationKey> elements) {
      this.integrationKeys = ImmutableList.builder();
      return addAllIntegrationKeys(elements);
    }

    /**
     * Adds elements to {@link PagerDutyConfig#integrationKeys() integrationKeys} list.
     * @param elements An iterable of integrationKeys elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllIntegrationKeys(Iterable<? extends ImmutablePagerDutyIntegrationKey> elements) {
      this.integrationKeys.addAll(elements);
      return this;
    }

    /**
     * Builds a new {@link ImmutablePagerDutyConfig ImmutablePagerDutyConfig}.
     * @return An immutable instance of PagerDutyConfig
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutablePagerDutyConfig build() {
      return new ImmutablePagerDutyConfig(integrationKeys.build());
    }
  }
}
