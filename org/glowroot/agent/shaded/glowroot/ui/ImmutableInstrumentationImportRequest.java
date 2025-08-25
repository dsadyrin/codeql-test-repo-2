package org.glowroot.agent.shaded.glowroot.ui;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import org.glowroot.agent.shaded.google.common.collect.ImmutableList;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link InstrumentationConfigJsonService.InstrumentationImportRequest}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableInstrumentationImportRequest.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "InstrumentationConfigJsonService.InstrumentationImportRequest"})
@Immutable
final class ImmutableInstrumentationImportRequest
    implements InstrumentationConfigJsonService.InstrumentationImportRequest {
  private final ImmutableList<ImmutableInstrumentationConfigDto> configs;

  private ImmutableInstrumentationImportRequest(ImmutableList<ImmutableInstrumentationConfigDto> configs) {
    this.configs = configs;
  }

  /**
   * @return The value of the {@code configs} attribute
   */
  @JsonProperty("configs")
  @Override
  public ImmutableList<ImmutableInstrumentationConfigDto> configs() {
    return configs;
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link InstrumentationConfigJsonService.InstrumentationImportRequest#configs() configs}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInstrumentationImportRequest withConfigs(ImmutableInstrumentationConfigDto... elements) {
    ImmutableList<ImmutableInstrumentationConfigDto> newValue = ImmutableList.copyOf(elements);
    return new ImmutableInstrumentationImportRequest(newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link InstrumentationConfigJsonService.InstrumentationImportRequest#configs() configs}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of configs elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInstrumentationImportRequest withConfigs(Iterable<? extends ImmutableInstrumentationConfigDto> elements) {
    if (this.configs == elements) return this;
    ImmutableList<ImmutableInstrumentationConfigDto> newValue = ImmutableList.copyOf(elements);
    return new ImmutableInstrumentationImportRequest(newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableInstrumentationImportRequest} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableInstrumentationImportRequest
        && equalTo((ImmutableInstrumentationImportRequest) another);
  }

  private boolean equalTo(ImmutableInstrumentationImportRequest another) {
    return configs.equals(another.configs);
  }

  /**
   * Computes a hash code from attributes: {@code configs}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + configs.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code InstrumentationImportRequest} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("InstrumentationImportRequest")
        .omitNullValues()
        .add("configs", configs)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json
      implements InstrumentationConfigJsonService.InstrumentationImportRequest {
    ImmutableList<ImmutableInstrumentationConfigDto> configs = ImmutableList.of();
    @JsonProperty("configs")
    public void setConfigs(ImmutableList<ImmutableInstrumentationConfigDto> configs) {
      this.configs = configs;
    }
    @Override
    public ImmutableList<ImmutableInstrumentationConfigDto> configs() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableInstrumentationImportRequest fromJson(Json json) {
    ImmutableInstrumentationImportRequest.Builder builder = ImmutableInstrumentationImportRequest.builder();
    if (json.configs != null) {
      builder.addAllConfigs(json.configs);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link InstrumentationConfigJsonService.InstrumentationImportRequest} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable InstrumentationImportRequest instance
   */
  public static ImmutableInstrumentationImportRequest copyOf(InstrumentationConfigJsonService.InstrumentationImportRequest instance) {
    if (instance instanceof ImmutableInstrumentationImportRequest) {
      return (ImmutableInstrumentationImportRequest) instance;
    }
    return ImmutableInstrumentationImportRequest.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableInstrumentationImportRequest ImmutableInstrumentationImportRequest}.
   * @return A new ImmutableInstrumentationImportRequest builder
   */
  public static ImmutableInstrumentationImportRequest.Builder builder() {
    return new ImmutableInstrumentationImportRequest.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableInstrumentationImportRequest ImmutableInstrumentationImportRequest}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private ImmutableList.Builder<ImmutableInstrumentationConfigDto> configs = ImmutableList.builder();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code InstrumentationImportRequest} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(InstrumentationConfigJsonService.InstrumentationImportRequest instance) {
      Preconditions.checkNotNull(instance, "instance");
      addAllConfigs(instance.configs());
      return this;
    }

    /**
     * Adds one element to {@link InstrumentationConfigJsonService.InstrumentationImportRequest#configs() configs} list.
     * @param element A configs element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addConfigs(ImmutableInstrumentationConfigDto element) {
      this.configs.add(element);
      return this;
    }

    /**
     * Adds elements to {@link InstrumentationConfigJsonService.InstrumentationImportRequest#configs() configs} list.
     * @param elements An array of configs elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addConfigs(ImmutableInstrumentationConfigDto... elements) {
      this.configs.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link InstrumentationConfigJsonService.InstrumentationImportRequest#configs() configs} list.
     * @param elements An iterable of configs elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder configs(Iterable<? extends ImmutableInstrumentationConfigDto> elements) {
      this.configs = ImmutableList.builder();
      return addAllConfigs(elements);
    }

    /**
     * Adds elements to {@link InstrumentationConfigJsonService.InstrumentationImportRequest#configs() configs} list.
     * @param elements An iterable of configs elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllConfigs(Iterable<? extends ImmutableInstrumentationConfigDto> elements) {
      this.configs.addAll(elements);
      return this;
    }

    /**
     * Builds a new {@link ImmutableInstrumentationImportRequest ImmutableInstrumentationImportRequest}.
     * @return An immutable instance of InstrumentationImportRequest
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableInstrumentationImportRequest build() {
      return new ImmutableInstrumentationImportRequest(configs.build());
    }
  }
}
