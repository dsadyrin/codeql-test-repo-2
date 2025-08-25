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
 * Immutable implementation of {@link AdminJsonService.CentralWebConfigResponse}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCentralWebConfigResponse.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "AdminJsonService.CentralWebConfigResponse"})
@Immutable
final class ImmutableCentralWebConfigResponse
    implements AdminJsonService.CentralWebConfigResponse {
  private final AdminJsonService.CentralWebConfigDto config;

  private ImmutableCentralWebConfigResponse(AdminJsonService.CentralWebConfigDto config) {
    this.config = config;
  }

  /**
   * @return The value of the {@code config} attribute
   */
  @JsonProperty("config")
  @Override
  public AdminJsonService.CentralWebConfigDto config() {
    return config;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AdminJsonService.CentralWebConfigResponse#config() config} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for config
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCentralWebConfigResponse withConfig(AdminJsonService.CentralWebConfigDto value) {
    if (this.config == value) return this;
    AdminJsonService.CentralWebConfigDto newValue = Preconditions.checkNotNull(value, "config");
    return new ImmutableCentralWebConfigResponse(newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCentralWebConfigResponse} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCentralWebConfigResponse
        && equalTo((ImmutableCentralWebConfigResponse) another);
  }

  private boolean equalTo(ImmutableCentralWebConfigResponse another) {
    return config.equals(another.config);
  }

  /**
   * Computes a hash code from attributes: {@code config}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + config.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code CentralWebConfigResponse} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("CentralWebConfigResponse")
        .omitNullValues()
        .add("config", config)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements AdminJsonService.CentralWebConfigResponse {
    @Nullable AdminJsonService.CentralWebConfigDto config;
    @JsonProperty("config")
    public void setConfig(AdminJsonService.CentralWebConfigDto config) {
      this.config = config;
    }
    @Override
    public AdminJsonService.CentralWebConfigDto config() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableCentralWebConfigResponse fromJson(Json json) {
    ImmutableCentralWebConfigResponse.Builder builder = ImmutableCentralWebConfigResponse.builder();
    if (json.config != null) {
      builder.config(json.config);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link AdminJsonService.CentralWebConfigResponse} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable CentralWebConfigResponse instance
   */
  public static ImmutableCentralWebConfigResponse copyOf(AdminJsonService.CentralWebConfigResponse instance) {
    if (instance instanceof ImmutableCentralWebConfigResponse) {
      return (ImmutableCentralWebConfigResponse) instance;
    }
    return ImmutableCentralWebConfigResponse.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableCentralWebConfigResponse ImmutableCentralWebConfigResponse}.
   * @return A new ImmutableCentralWebConfigResponse builder
   */
  public static ImmutableCentralWebConfigResponse.Builder builder() {
    return new ImmutableCentralWebConfigResponse.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableCentralWebConfigResponse ImmutableCentralWebConfigResponse}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_CONFIG = 0x1L;
    private long initBits = 0x1L;

    private @Nullable AdminJsonService.CentralWebConfigDto config;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code CentralWebConfigResponse} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(AdminJsonService.CentralWebConfigResponse instance) {
      Preconditions.checkNotNull(instance, "instance");
      config(instance.config());
      return this;
    }

    /**
     * Initializes the value for the {@link AdminJsonService.CentralWebConfigResponse#config() config} attribute.
     * @param config The value for config 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder config(AdminJsonService.CentralWebConfigDto config) {
      this.config = Preconditions.checkNotNull(config, "config");
      initBits &= ~INIT_BIT_CONFIG;
      return this;
    }

    /**
     * Builds a new {@link ImmutableCentralWebConfigResponse ImmutableCentralWebConfigResponse}.
     * @return An immutable instance of CentralWebConfigResponse
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableCentralWebConfigResponse build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableCentralWebConfigResponse(config);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_CONFIG) != 0) attributes.add("config");
      return "Cannot build CentralWebConfigResponse, some of required attributes are not set " + attributes;
    }
  }
}
