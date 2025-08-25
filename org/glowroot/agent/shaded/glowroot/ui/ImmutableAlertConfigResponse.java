package org.glowroot.agent.shaded.glowroot.ui;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Objects;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import org.glowroot.agent.shaded.google.common.collect.ImmutableList;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.glowroot.agent.shaded.glowroot.common.config.PagerDutyConfig;
import org.glowroot.agent.shaded.glowroot.common.repo.GaugeValueRepository;

/**
 * Immutable implementation of {@link AlertConfigJsonService.AlertConfigResponse}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAlertConfigResponse.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "AlertConfigJsonService.AlertConfigResponse"})
@Immutable
final class ImmutableAlertConfigResponse
    implements AlertConfigJsonService.AlertConfigResponse {
  private final @Nullable AlertConfigJsonService.AlertConfigDto config;
  private final @Nullable String heading;
  private final ImmutableList<GaugeValueRepository.Gauge> gauges;
  private final ImmutableList<AlertConfigJsonService.SyntheticMonitorItem> syntheticMonitors;
  private final ImmutableList<PagerDutyConfig.PagerDutyIntegrationKey> pagerDutyIntegrationKeys;

  private ImmutableAlertConfigResponse(
      @Nullable AlertConfigJsonService.AlertConfigDto config,
      @Nullable String heading,
      ImmutableList<GaugeValueRepository.Gauge> gauges,
      ImmutableList<AlertConfigJsonService.SyntheticMonitorItem> syntheticMonitors,
      ImmutableList<PagerDutyConfig.PagerDutyIntegrationKey> pagerDutyIntegrationKeys) {
    this.config = config;
    this.heading = heading;
    this.gauges = gauges;
    this.syntheticMonitors = syntheticMonitors;
    this.pagerDutyIntegrationKeys = pagerDutyIntegrationKeys;
  }

  /**
   * @return The value of the {@code config} attribute
   */
  @JsonProperty("config")
  @Override
  public @Nullable AlertConfigJsonService.AlertConfigDto config() {
    return config;
  }

  /**
   * @return The value of the {@code heading} attribute
   */
  @JsonProperty("heading")
  @Override
  public @Nullable String heading() {
    return heading;
  }

  /**
   * @return The value of the {@code gauges} attribute
   */
  @JsonProperty("gauges")
  @Override
  public ImmutableList<GaugeValueRepository.Gauge> gauges() {
    return gauges;
  }

  /**
   * @return The value of the {@code syntheticMonitors} attribute
   */
  @JsonProperty("syntheticMonitors")
  @Override
  public ImmutableList<AlertConfigJsonService.SyntheticMonitorItem> syntheticMonitors() {
    return syntheticMonitors;
  }

  /**
   * @return The value of the {@code pagerDutyIntegrationKeys} attribute
   */
  @JsonProperty("pagerDutyIntegrationKeys")
  @Override
  public ImmutableList<PagerDutyConfig.PagerDutyIntegrationKey> pagerDutyIntegrationKeys() {
    return pagerDutyIntegrationKeys;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AlertConfigJsonService.AlertConfigResponse#config() config} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for config (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAlertConfigResponse withConfig(@Nullable AlertConfigJsonService.AlertConfigDto value) {
    if (this.config == value) return this;
    return new ImmutableAlertConfigResponse(value, this.heading, this.gauges, this.syntheticMonitors, this.pagerDutyIntegrationKeys);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AlertConfigJsonService.AlertConfigResponse#heading() heading} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for heading (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAlertConfigResponse withHeading(@Nullable String value) {
    if (Objects.equal(this.heading, value)) return this;
    return new ImmutableAlertConfigResponse(this.config, value, this.gauges, this.syntheticMonitors, this.pagerDutyIntegrationKeys);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link AlertConfigJsonService.AlertConfigResponse#gauges() gauges}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAlertConfigResponse withGauges(GaugeValueRepository.Gauge... elements) {
    ImmutableList<GaugeValueRepository.Gauge> newValue = ImmutableList.copyOf(elements);
    return new ImmutableAlertConfigResponse(this.config, this.heading, newValue, this.syntheticMonitors, this.pagerDutyIntegrationKeys);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link AlertConfigJsonService.AlertConfigResponse#gauges() gauges}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of gauges elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAlertConfigResponse withGauges(Iterable<? extends GaugeValueRepository.Gauge> elements) {
    if (this.gauges == elements) return this;
    ImmutableList<GaugeValueRepository.Gauge> newValue = ImmutableList.copyOf(elements);
    return new ImmutableAlertConfigResponse(this.config, this.heading, newValue, this.syntheticMonitors, this.pagerDutyIntegrationKeys);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link AlertConfigJsonService.AlertConfigResponse#syntheticMonitors() syntheticMonitors}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAlertConfigResponse withSyntheticMonitors(AlertConfigJsonService.SyntheticMonitorItem... elements) {
    ImmutableList<AlertConfigJsonService.SyntheticMonitorItem> newValue = ImmutableList.copyOf(elements);
    return new ImmutableAlertConfigResponse(this.config, this.heading, this.gauges, newValue, this.pagerDutyIntegrationKeys);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link AlertConfigJsonService.AlertConfigResponse#syntheticMonitors() syntheticMonitors}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of syntheticMonitors elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAlertConfigResponse withSyntheticMonitors(Iterable<? extends AlertConfigJsonService.SyntheticMonitorItem> elements) {
    if (this.syntheticMonitors == elements) return this;
    ImmutableList<AlertConfigJsonService.SyntheticMonitorItem> newValue = ImmutableList.copyOf(elements);
    return new ImmutableAlertConfigResponse(this.config, this.heading, this.gauges, newValue, this.pagerDutyIntegrationKeys);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link AlertConfigJsonService.AlertConfigResponse#pagerDutyIntegrationKeys() pagerDutyIntegrationKeys}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAlertConfigResponse withPagerDutyIntegrationKeys(PagerDutyConfig.PagerDutyIntegrationKey... elements) {
    ImmutableList<PagerDutyConfig.PagerDutyIntegrationKey> newValue = ImmutableList.copyOf(elements);
    return new ImmutableAlertConfigResponse(this.config, this.heading, this.gauges, this.syntheticMonitors, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link AlertConfigJsonService.AlertConfigResponse#pagerDutyIntegrationKeys() pagerDutyIntegrationKeys}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of pagerDutyIntegrationKeys elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAlertConfigResponse withPagerDutyIntegrationKeys(Iterable<? extends PagerDutyConfig.PagerDutyIntegrationKey> elements) {
    if (this.pagerDutyIntegrationKeys == elements) return this;
    ImmutableList<PagerDutyConfig.PagerDutyIntegrationKey> newValue = ImmutableList.copyOf(elements);
    return new ImmutableAlertConfigResponse(this.config, this.heading, this.gauges, this.syntheticMonitors, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAlertConfigResponse} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAlertConfigResponse
        && equalTo((ImmutableAlertConfigResponse) another);
  }

  private boolean equalTo(ImmutableAlertConfigResponse another) {
    return Objects.equal(config, another.config)
        && Objects.equal(heading, another.heading)
        && gauges.equals(another.gauges)
        && syntheticMonitors.equals(another.syntheticMonitors)
        && pagerDutyIntegrationKeys.equals(another.pagerDutyIntegrationKeys);
  }

  /**
   * Computes a hash code from attributes: {@code config}, {@code heading}, {@code gauges}, {@code syntheticMonitors}, {@code pagerDutyIntegrationKeys}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(config);
    h += (h << 5) + Objects.hashCode(heading);
    h += (h << 5) + gauges.hashCode();
    h += (h << 5) + syntheticMonitors.hashCode();
    h += (h << 5) + pagerDutyIntegrationKeys.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code AlertConfigResponse} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("AlertConfigResponse")
        .omitNullValues()
        .add("config", config)
        .add("heading", heading)
        .add("gauges", gauges)
        .add("syntheticMonitors", syntheticMonitors)
        .add("pagerDutyIntegrationKeys", pagerDutyIntegrationKeys)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements AlertConfigJsonService.AlertConfigResponse {
    @Nullable AlertConfigJsonService.AlertConfigDto config;
    @Nullable String heading;
    List<GaugeValueRepository.Gauge> gauges = ImmutableList.of();
    List<AlertConfigJsonService.SyntheticMonitorItem> syntheticMonitors = ImmutableList.of();
    List<PagerDutyConfig.PagerDutyIntegrationKey> pagerDutyIntegrationKeys = ImmutableList.of();
    @JsonProperty("config")
    public void setConfig(@Nullable AlertConfigJsonService.AlertConfigDto config) {
      this.config = config;
    }
    @JsonProperty("heading")
    public void setHeading(@Nullable String heading) {
      this.heading = heading;
    }
    @JsonProperty("gauges")
    public void setGauges(List<GaugeValueRepository.Gauge> gauges) {
      this.gauges = gauges;
    }
    @JsonProperty("syntheticMonitors")
    public void setSyntheticMonitors(List<AlertConfigJsonService.SyntheticMonitorItem> syntheticMonitors) {
      this.syntheticMonitors = syntheticMonitors;
    }
    @JsonProperty("pagerDutyIntegrationKeys")
    public void setPagerDutyIntegrationKeys(List<PagerDutyConfig.PagerDutyIntegrationKey> pagerDutyIntegrationKeys) {
      this.pagerDutyIntegrationKeys = pagerDutyIntegrationKeys;
    }
    @Override
    public AlertConfigJsonService.AlertConfigDto config() { throw new UnsupportedOperationException(); }
    @Override
    public String heading() { throw new UnsupportedOperationException(); }
    @Override
    public List<GaugeValueRepository.Gauge> gauges() { throw new UnsupportedOperationException(); }
    @Override
    public List<AlertConfigJsonService.SyntheticMonitorItem> syntheticMonitors() { throw new UnsupportedOperationException(); }
    @Override
    public List<PagerDutyConfig.PagerDutyIntegrationKey> pagerDutyIntegrationKeys() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableAlertConfigResponse fromJson(Json json) {
    ImmutableAlertConfigResponse.Builder builder = ImmutableAlertConfigResponse.builder();
    if (json.config != null) {
      builder.config(json.config);
    }
    if (json.heading != null) {
      builder.heading(json.heading);
    }
    if (json.gauges != null) {
      builder.addAllGauges(json.gauges);
    }
    if (json.syntheticMonitors != null) {
      builder.addAllSyntheticMonitors(json.syntheticMonitors);
    }
    if (json.pagerDutyIntegrationKeys != null) {
      builder.addAllPagerDutyIntegrationKeys(json.pagerDutyIntegrationKeys);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link AlertConfigJsonService.AlertConfigResponse} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable AlertConfigResponse instance
   */
  public static ImmutableAlertConfigResponse copyOf(AlertConfigJsonService.AlertConfigResponse instance) {
    if (instance instanceof ImmutableAlertConfigResponse) {
      return (ImmutableAlertConfigResponse) instance;
    }
    return ImmutableAlertConfigResponse.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableAlertConfigResponse ImmutableAlertConfigResponse}.
   * @return A new ImmutableAlertConfigResponse builder
   */
  public static ImmutableAlertConfigResponse.Builder builder() {
    return new ImmutableAlertConfigResponse.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableAlertConfigResponse ImmutableAlertConfigResponse}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private @Nullable AlertConfigJsonService.AlertConfigDto config;
    private @Nullable String heading;
    private ImmutableList.Builder<GaugeValueRepository.Gauge> gauges = ImmutableList.builder();
    private ImmutableList.Builder<AlertConfigJsonService.SyntheticMonitorItem> syntheticMonitors = ImmutableList.builder();
    private ImmutableList.Builder<PagerDutyConfig.PagerDutyIntegrationKey> pagerDutyIntegrationKeys = ImmutableList.builder();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code AlertConfigResponse} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(AlertConfigJsonService.AlertConfigResponse instance) {
      Preconditions.checkNotNull(instance, "instance");
      @Nullable AlertConfigJsonService.AlertConfigDto configValue = instance.config();
      if (configValue != null) {
        config(configValue);
      }
      @Nullable String headingValue = instance.heading();
      if (headingValue != null) {
        heading(headingValue);
      }
      addAllGauges(instance.gauges());
      addAllSyntheticMonitors(instance.syntheticMonitors());
      addAllPagerDutyIntegrationKeys(instance.pagerDutyIntegrationKeys());
      return this;
    }

    /**
     * Initializes the value for the {@link AlertConfigJsonService.AlertConfigResponse#config() config} attribute.
     * @param config The value for config (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder config(@Nullable AlertConfigJsonService.AlertConfigDto config) {
      this.config = config;
      return this;
    }

    /**
     * Initializes the value for the {@link AlertConfigJsonService.AlertConfigResponse#heading() heading} attribute.
     * @param heading The value for heading (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder heading(@Nullable String heading) {
      this.heading = heading;
      return this;
    }

    /**
     * Adds one element to {@link AlertConfigJsonService.AlertConfigResponse#gauges() gauges} list.
     * @param element A gauges element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addGauges(GaugeValueRepository.Gauge element) {
      this.gauges.add(element);
      return this;
    }

    /**
     * Adds elements to {@link AlertConfigJsonService.AlertConfigResponse#gauges() gauges} list.
     * @param elements An array of gauges elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addGauges(GaugeValueRepository.Gauge... elements) {
      this.gauges.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link AlertConfigJsonService.AlertConfigResponse#gauges() gauges} list.
     * @param elements An iterable of gauges elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder gauges(Iterable<? extends GaugeValueRepository.Gauge> elements) {
      this.gauges = ImmutableList.builder();
      return addAllGauges(elements);
    }

    /**
     * Adds elements to {@link AlertConfigJsonService.AlertConfigResponse#gauges() gauges} list.
     * @param elements An iterable of gauges elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllGauges(Iterable<? extends GaugeValueRepository.Gauge> elements) {
      this.gauges.addAll(elements);
      return this;
    }

    /**
     * Adds one element to {@link AlertConfigJsonService.AlertConfigResponse#syntheticMonitors() syntheticMonitors} list.
     * @param element A syntheticMonitors element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addSyntheticMonitors(AlertConfigJsonService.SyntheticMonitorItem element) {
      this.syntheticMonitors.add(element);
      return this;
    }

    /**
     * Adds elements to {@link AlertConfigJsonService.AlertConfigResponse#syntheticMonitors() syntheticMonitors} list.
     * @param elements An array of syntheticMonitors elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addSyntheticMonitors(AlertConfigJsonService.SyntheticMonitorItem... elements) {
      this.syntheticMonitors.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link AlertConfigJsonService.AlertConfigResponse#syntheticMonitors() syntheticMonitors} list.
     * @param elements An iterable of syntheticMonitors elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder syntheticMonitors(Iterable<? extends AlertConfigJsonService.SyntheticMonitorItem> elements) {
      this.syntheticMonitors = ImmutableList.builder();
      return addAllSyntheticMonitors(elements);
    }

    /**
     * Adds elements to {@link AlertConfigJsonService.AlertConfigResponse#syntheticMonitors() syntheticMonitors} list.
     * @param elements An iterable of syntheticMonitors elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllSyntheticMonitors(Iterable<? extends AlertConfigJsonService.SyntheticMonitorItem> elements) {
      this.syntheticMonitors.addAll(elements);
      return this;
    }

    /**
     * Adds one element to {@link AlertConfigJsonService.AlertConfigResponse#pagerDutyIntegrationKeys() pagerDutyIntegrationKeys} list.
     * @param element A pagerDutyIntegrationKeys element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addPagerDutyIntegrationKeys(PagerDutyConfig.PagerDutyIntegrationKey element) {
      this.pagerDutyIntegrationKeys.add(element);
      return this;
    }

    /**
     * Adds elements to {@link AlertConfigJsonService.AlertConfigResponse#pagerDutyIntegrationKeys() pagerDutyIntegrationKeys} list.
     * @param elements An array of pagerDutyIntegrationKeys elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addPagerDutyIntegrationKeys(PagerDutyConfig.PagerDutyIntegrationKey... elements) {
      this.pagerDutyIntegrationKeys.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link AlertConfigJsonService.AlertConfigResponse#pagerDutyIntegrationKeys() pagerDutyIntegrationKeys} list.
     * @param elements An iterable of pagerDutyIntegrationKeys elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder pagerDutyIntegrationKeys(Iterable<? extends PagerDutyConfig.PagerDutyIntegrationKey> elements) {
      this.pagerDutyIntegrationKeys = ImmutableList.builder();
      return addAllPagerDutyIntegrationKeys(elements);
    }

    /**
     * Adds elements to {@link AlertConfigJsonService.AlertConfigResponse#pagerDutyIntegrationKeys() pagerDutyIntegrationKeys} list.
     * @param elements An iterable of pagerDutyIntegrationKeys elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllPagerDutyIntegrationKeys(Iterable<? extends PagerDutyConfig.PagerDutyIntegrationKey> elements) {
      this.pagerDutyIntegrationKeys.addAll(elements);
      return this;
    }

    /**
     * Builds a new {@link ImmutableAlertConfigResponse ImmutableAlertConfigResponse}.
     * @return An immutable instance of AlertConfigResponse
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableAlertConfigResponse build() {
      return new ImmutableAlertConfigResponse(config, heading, gauges.build(), syntheticMonitors.build(), pagerDutyIntegrationKeys.build());
    }
  }
}
