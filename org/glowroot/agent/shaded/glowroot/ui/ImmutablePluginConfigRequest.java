package org.glowroot.agent.shaded.glowroot.ui;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Optional;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link ConfigJsonService.PluginConfigRequest}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePluginConfigRequest.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "ConfigJsonService.PluginConfigRequest"})
@Immutable
final class ImmutablePluginConfigRequest
    implements ConfigJsonService.PluginConfigRequest {
  private final Optional<String> pluginId;

  private ImmutablePluginConfigRequest(Optional<String> pluginId) {
    this.pluginId = pluginId;
  }

  /**
   * @return The value of the {@code pluginId} attribute
   */
  @JsonProperty("pluginId")
  @Override
  public Optional<String> pluginId() {
    return pluginId;
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConfigJsonService.PluginConfigRequest#pluginId() pluginId} attribute.
   * @param value The value for pluginId
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePluginConfigRequest withPluginId(String value) {
    Optional<String> newValue = Optional.of(value);
    if (this.pluginId.equals(newValue)) return this;
    return new ImmutablePluginConfigRequest(newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConfigJsonService.PluginConfigRequest#pluginId() pluginId} attribute.
   * An equality check is used to prevent copying of the same value by returning {@code this}.
   * @param optional A value for pluginId
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePluginConfigRequest withPluginId(Optional<String> optional) {
    Optional<String> value = (Optional<String>) optional;
    if (this.pluginId.equals(value)) return this;
    return new ImmutablePluginConfigRequest(value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePluginConfigRequest} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePluginConfigRequest
        && equalTo((ImmutablePluginConfigRequest) another);
  }

  private boolean equalTo(ImmutablePluginConfigRequest another) {
    return pluginId.equals(another.pluginId);
  }

  /**
   * Computes a hash code from attributes: {@code pluginId}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + pluginId.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code PluginConfigRequest} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("PluginConfigRequest")
        .omitNullValues()
        .add("pluginId", pluginId.orNull())
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ConfigJsonService.PluginConfigRequest {
    Optional<String> pluginId = Optional.absent();
    @JsonProperty("pluginId")
    public void setPluginId(Optional<String> pluginId) {
      this.pluginId = pluginId;
    }
    @Override
    public Optional<String> pluginId() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutablePluginConfigRequest fromJson(Json json) {
    ImmutablePluginConfigRequest.Builder builder = ImmutablePluginConfigRequest.builder();
    if (json.pluginId != null) {
      builder.pluginId(json.pluginId);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ConfigJsonService.PluginConfigRequest} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable PluginConfigRequest instance
   */
  public static ImmutablePluginConfigRequest copyOf(ConfigJsonService.PluginConfigRequest instance) {
    if (instance instanceof ImmutablePluginConfigRequest) {
      return (ImmutablePluginConfigRequest) instance;
    }
    return ImmutablePluginConfigRequest.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutablePluginConfigRequest ImmutablePluginConfigRequest}.
   * @return A new ImmutablePluginConfigRequest builder
   */
  public static ImmutablePluginConfigRequest.Builder builder() {
    return new ImmutablePluginConfigRequest.Builder();
  }

  /**
   * Builds instances of type {@link ImmutablePluginConfigRequest ImmutablePluginConfigRequest}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private Optional<String> pluginId = Optional.absent();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code PluginConfigRequest} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(ConfigJsonService.PluginConfigRequest instance) {
      Preconditions.checkNotNull(instance, "instance");
      Optional<String> pluginIdOptional = instance.pluginId();
      if (pluginIdOptional.isPresent()) {
        pluginId(pluginIdOptional);
      }
      return this;
    }

    /**
     * Initializes the optional value {@link ConfigJsonService.PluginConfigRequest#pluginId() pluginId} to pluginId.
     * @param pluginId The value for pluginId
     * @return {@code this} builder for chained invocation
     */
    public final Builder pluginId(String pluginId) {
      this.pluginId = Optional.of(pluginId);
      return this;
    }

    /**
     * Initializes the optional value {@link ConfigJsonService.PluginConfigRequest#pluginId() pluginId} to pluginId.
     * @param pluginId The value for pluginId
     * @return {@code this} builder for use in a chained invocation
     */
    @SuppressWarnings("unchecked") // safe covariant cast
    public final Builder pluginId(Optional<String> pluginId) {
      this.pluginId = (Optional<String>) pluginId;
      return this;
    }

    /**
     * Builds a new {@link ImmutablePluginConfigRequest ImmutablePluginConfigRequest}.
     * @return An immutable instance of PluginConfigRequest
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutablePluginConfigRequest build() {
      return new ImmutablePluginConfigRequest(pluginId);
    }
  }
}
