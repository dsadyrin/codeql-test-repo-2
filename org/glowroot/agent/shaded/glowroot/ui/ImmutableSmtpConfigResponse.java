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
 * Immutable implementation of {@link AdminJsonService.SmtpConfigResponse}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSmtpConfigResponse.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "AdminJsonService.SmtpConfigResponse"})
@Immutable
final class ImmutableSmtpConfigResponse implements AdminJsonService.SmtpConfigResponse {
  private final AdminJsonService.SmtpConfigDto config;
  private final String localServerName;

  private ImmutableSmtpConfigResponse(AdminJsonService.SmtpConfigDto config, String localServerName) {
    this.config = config;
    this.localServerName = localServerName;
  }

  /**
   * @return The value of the {@code config} attribute
   */
  @JsonProperty("config")
  @Override
  public AdminJsonService.SmtpConfigDto config() {
    return config;
  }

  /**
   * @return The value of the {@code localServerName} attribute
   */
  @JsonProperty("localServerName")
  @Override
  public String localServerName() {
    return localServerName;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AdminJsonService.SmtpConfigResponse#config() config} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for config
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSmtpConfigResponse withConfig(AdminJsonService.SmtpConfigDto value) {
    if (this.config == value) return this;
    AdminJsonService.SmtpConfigDto newValue = Preconditions.checkNotNull(value, "config");
    return new ImmutableSmtpConfigResponse(newValue, this.localServerName);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AdminJsonService.SmtpConfigResponse#localServerName() localServerName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for localServerName
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSmtpConfigResponse withLocalServerName(String value) {
    if (this.localServerName.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "localServerName");
    return new ImmutableSmtpConfigResponse(this.config, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSmtpConfigResponse} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSmtpConfigResponse
        && equalTo((ImmutableSmtpConfigResponse) another);
  }

  private boolean equalTo(ImmutableSmtpConfigResponse another) {
    return config.equals(another.config)
        && localServerName.equals(another.localServerName);
  }

  /**
   * Computes a hash code from attributes: {@code config}, {@code localServerName}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + config.hashCode();
    h += (h << 5) + localServerName.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code SmtpConfigResponse} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("SmtpConfigResponse")
        .omitNullValues()
        .add("config", config)
        .add("localServerName", localServerName)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements AdminJsonService.SmtpConfigResponse {
    @Nullable AdminJsonService.SmtpConfigDto config;
    @Nullable String localServerName;
    @JsonProperty("config")
    public void setConfig(AdminJsonService.SmtpConfigDto config) {
      this.config = config;
    }
    @JsonProperty("localServerName")
    public void setLocalServerName(String localServerName) {
      this.localServerName = localServerName;
    }
    @Override
    public AdminJsonService.SmtpConfigDto config() { throw new UnsupportedOperationException(); }
    @Override
    public String localServerName() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableSmtpConfigResponse fromJson(Json json) {
    ImmutableSmtpConfigResponse.Builder builder = ImmutableSmtpConfigResponse.builder();
    if (json.config != null) {
      builder.config(json.config);
    }
    if (json.localServerName != null) {
      builder.localServerName(json.localServerName);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link AdminJsonService.SmtpConfigResponse} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SmtpConfigResponse instance
   */
  public static ImmutableSmtpConfigResponse copyOf(AdminJsonService.SmtpConfigResponse instance) {
    if (instance instanceof ImmutableSmtpConfigResponse) {
      return (ImmutableSmtpConfigResponse) instance;
    }
    return ImmutableSmtpConfigResponse.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableSmtpConfigResponse ImmutableSmtpConfigResponse}.
   * @return A new ImmutableSmtpConfigResponse builder
   */
  public static ImmutableSmtpConfigResponse.Builder builder() {
    return new ImmutableSmtpConfigResponse.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableSmtpConfigResponse ImmutableSmtpConfigResponse}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_CONFIG = 0x1L;
    private static final long INIT_BIT_LOCAL_SERVER_NAME = 0x2L;
    private long initBits = 0x3L;

    private @Nullable AdminJsonService.SmtpConfigDto config;
    private @Nullable String localServerName;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code SmtpConfigResponse} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(AdminJsonService.SmtpConfigResponse instance) {
      Preconditions.checkNotNull(instance, "instance");
      config(instance.config());
      localServerName(instance.localServerName());
      return this;
    }

    /**
     * Initializes the value for the {@link AdminJsonService.SmtpConfigResponse#config() config} attribute.
     * @param config The value for config 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder config(AdminJsonService.SmtpConfigDto config) {
      this.config = Preconditions.checkNotNull(config, "config");
      initBits &= ~INIT_BIT_CONFIG;
      return this;
    }

    /**
     * Initializes the value for the {@link AdminJsonService.SmtpConfigResponse#localServerName() localServerName} attribute.
     * @param localServerName The value for localServerName 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder localServerName(String localServerName) {
      this.localServerName = Preconditions.checkNotNull(localServerName, "localServerName");
      initBits &= ~INIT_BIT_LOCAL_SERVER_NAME;
      return this;
    }

    /**
     * Builds a new {@link ImmutableSmtpConfigResponse ImmutableSmtpConfigResponse}.
     * @return An immutable instance of SmtpConfigResponse
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableSmtpConfigResponse build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableSmtpConfigResponse(config, localServerName);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_CONFIG) != 0) attributes.add("config");
      if ((initBits & INIT_BIT_LOCAL_SERVER_NAME) != 0) attributes.add("localServerName");
      return "Cannot build SmtpConfigResponse, some of required attributes are not set " + attributes;
    }
  }
}
