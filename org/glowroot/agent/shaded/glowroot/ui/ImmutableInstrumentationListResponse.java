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
 * Immutable implementation of {@link InstrumentationConfigJsonService.InstrumentationListResponse}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableInstrumentationListResponse.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "InstrumentationConfigJsonService.InstrumentationListResponse"})
@Immutable
final class ImmutableInstrumentationListResponse
    implements InstrumentationConfigJsonService.InstrumentationListResponse {
  private final ImmutableList<InstrumentationConfigJsonService.InstrumentationConfigDto> configs;
  private final boolean jvmOutOfSync;
  private final boolean jvmRetransformClassesSupported;

  private ImmutableInstrumentationListResponse(
      ImmutableList<InstrumentationConfigJsonService.InstrumentationConfigDto> configs,
      boolean jvmOutOfSync,
      boolean jvmRetransformClassesSupported) {
    this.configs = configs;
    this.jvmOutOfSync = jvmOutOfSync;
    this.jvmRetransformClassesSupported = jvmRetransformClassesSupported;
  }

  /**
   * @return The value of the {@code configs} attribute
   */
  @JsonProperty("configs")
  @Override
  public ImmutableList<InstrumentationConfigJsonService.InstrumentationConfigDto> configs() {
    return configs;
  }

  /**
   * @return The value of the {@code jvmOutOfSync} attribute
   */
  @JsonProperty("jvmOutOfSync")
  @Override
  public boolean jvmOutOfSync() {
    return jvmOutOfSync;
  }

  /**
   * @return The value of the {@code jvmRetransformClassesSupported} attribute
   */
  @JsonProperty("jvmRetransformClassesSupported")
  @Override
  public boolean jvmRetransformClassesSupported() {
    return jvmRetransformClassesSupported;
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link InstrumentationConfigJsonService.InstrumentationListResponse#configs() configs}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInstrumentationListResponse withConfigs(InstrumentationConfigJsonService.InstrumentationConfigDto... elements) {
    ImmutableList<InstrumentationConfigJsonService.InstrumentationConfigDto> newValue = ImmutableList.copyOf(elements);
    return new ImmutableInstrumentationListResponse(newValue, this.jvmOutOfSync, this.jvmRetransformClassesSupported);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link InstrumentationConfigJsonService.InstrumentationListResponse#configs() configs}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of configs elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInstrumentationListResponse withConfigs(Iterable<? extends InstrumentationConfigJsonService.InstrumentationConfigDto> elements) {
    if (this.configs == elements) return this;
    ImmutableList<InstrumentationConfigJsonService.InstrumentationConfigDto> newValue = ImmutableList.copyOf(elements);
    return new ImmutableInstrumentationListResponse(newValue, this.jvmOutOfSync, this.jvmRetransformClassesSupported);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link InstrumentationConfigJsonService.InstrumentationListResponse#jvmOutOfSync() jvmOutOfSync} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for jvmOutOfSync
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableInstrumentationListResponse withJvmOutOfSync(boolean value) {
    if (this.jvmOutOfSync == value) return this;
    return new ImmutableInstrumentationListResponse(this.configs, value, this.jvmRetransformClassesSupported);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link InstrumentationConfigJsonService.InstrumentationListResponse#jvmRetransformClassesSupported() jvmRetransformClassesSupported} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for jvmRetransformClassesSupported
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableInstrumentationListResponse withJvmRetransformClassesSupported(boolean value) {
    if (this.jvmRetransformClassesSupported == value) return this;
    return new ImmutableInstrumentationListResponse(this.configs, this.jvmOutOfSync, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableInstrumentationListResponse} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableInstrumentationListResponse
        && equalTo((ImmutableInstrumentationListResponse) another);
  }

  private boolean equalTo(ImmutableInstrumentationListResponse another) {
    return configs.equals(another.configs)
        && jvmOutOfSync == another.jvmOutOfSync
        && jvmRetransformClassesSupported == another.jvmRetransformClassesSupported;
  }

  /**
   * Computes a hash code from attributes: {@code configs}, {@code jvmOutOfSync}, {@code jvmRetransformClassesSupported}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + configs.hashCode();
    h += (h << 5) + Booleans.hashCode(jvmOutOfSync);
    h += (h << 5) + Booleans.hashCode(jvmRetransformClassesSupported);
    return h;
  }

  /**
   * Prints the immutable value {@code InstrumentationListResponse} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("InstrumentationListResponse")
        .omitNullValues()
        .add("configs", configs)
        .add("jvmOutOfSync", jvmOutOfSync)
        .add("jvmRetransformClassesSupported", jvmRetransformClassesSupported)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json
      implements InstrumentationConfigJsonService.InstrumentationListResponse {
    ImmutableList<InstrumentationConfigJsonService.InstrumentationConfigDto> configs = ImmutableList.of();
    boolean jvmOutOfSync;
    boolean jvmOutOfSyncIsSet;
    boolean jvmRetransformClassesSupported;
    boolean jvmRetransformClassesSupportedIsSet;
    @JsonProperty("configs")
    public void setConfigs(ImmutableList<InstrumentationConfigJsonService.InstrumentationConfigDto> configs) {
      this.configs = configs;
    }
    @JsonProperty("jvmOutOfSync")
    public void setJvmOutOfSync(boolean jvmOutOfSync) {
      this.jvmOutOfSync = jvmOutOfSync;
      this.jvmOutOfSyncIsSet = true;
    }
    @JsonProperty("jvmRetransformClassesSupported")
    public void setJvmRetransformClassesSupported(boolean jvmRetransformClassesSupported) {
      this.jvmRetransformClassesSupported = jvmRetransformClassesSupported;
      this.jvmRetransformClassesSupportedIsSet = true;
    }
    @Override
    public ImmutableList<InstrumentationConfigJsonService.InstrumentationConfigDto> configs() { throw new UnsupportedOperationException(); }
    @Override
    public boolean jvmOutOfSync() { throw new UnsupportedOperationException(); }
    @Override
    public boolean jvmRetransformClassesSupported() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableInstrumentationListResponse fromJson(Json json) {
    ImmutableInstrumentationListResponse.Builder builder = ImmutableInstrumentationListResponse.builder();
    if (json.configs != null) {
      builder.addAllConfigs(json.configs);
    }
    if (json.jvmOutOfSyncIsSet) {
      builder.jvmOutOfSync(json.jvmOutOfSync);
    }
    if (json.jvmRetransformClassesSupportedIsSet) {
      builder.jvmRetransformClassesSupported(json.jvmRetransformClassesSupported);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link InstrumentationConfigJsonService.InstrumentationListResponse} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable InstrumentationListResponse instance
   */
  public static ImmutableInstrumentationListResponse copyOf(InstrumentationConfigJsonService.InstrumentationListResponse instance) {
    if (instance instanceof ImmutableInstrumentationListResponse) {
      return (ImmutableInstrumentationListResponse) instance;
    }
    return ImmutableInstrumentationListResponse.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableInstrumentationListResponse ImmutableInstrumentationListResponse}.
   * @return A new ImmutableInstrumentationListResponse builder
   */
  public static ImmutableInstrumentationListResponse.Builder builder() {
    return new ImmutableInstrumentationListResponse.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableInstrumentationListResponse ImmutableInstrumentationListResponse}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_JVM_OUT_OF_SYNC = 0x1L;
    private static final long INIT_BIT_JVM_RETRANSFORM_CLASSES_SUPPORTED = 0x2L;
    private long initBits = 0x3L;

    private ImmutableList.Builder<InstrumentationConfigJsonService.InstrumentationConfigDto> configs = ImmutableList.builder();
    private boolean jvmOutOfSync;
    private boolean jvmRetransformClassesSupported;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code InstrumentationListResponse} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(InstrumentationConfigJsonService.InstrumentationListResponse instance) {
      Preconditions.checkNotNull(instance, "instance");
      addAllConfigs(instance.configs());
      jvmOutOfSync(instance.jvmOutOfSync());
      jvmRetransformClassesSupported(instance.jvmRetransformClassesSupported());
      return this;
    }

    /**
     * Adds one element to {@link InstrumentationConfigJsonService.InstrumentationListResponse#configs() configs} list.
     * @param element A configs element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addConfigs(InstrumentationConfigJsonService.InstrumentationConfigDto element) {
      this.configs.add(element);
      return this;
    }

    /**
     * Adds elements to {@link InstrumentationConfigJsonService.InstrumentationListResponse#configs() configs} list.
     * @param elements An array of configs elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addConfigs(InstrumentationConfigJsonService.InstrumentationConfigDto... elements) {
      this.configs.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link InstrumentationConfigJsonService.InstrumentationListResponse#configs() configs} list.
     * @param elements An iterable of configs elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder configs(Iterable<? extends InstrumentationConfigJsonService.InstrumentationConfigDto> elements) {
      this.configs = ImmutableList.builder();
      return addAllConfigs(elements);
    }

    /**
     * Adds elements to {@link InstrumentationConfigJsonService.InstrumentationListResponse#configs() configs} list.
     * @param elements An iterable of configs elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllConfigs(Iterable<? extends InstrumentationConfigJsonService.InstrumentationConfigDto> elements) {
      this.configs.addAll(elements);
      return this;
    }

    /**
     * Initializes the value for the {@link InstrumentationConfigJsonService.InstrumentationListResponse#jvmOutOfSync() jvmOutOfSync} attribute.
     * @param jvmOutOfSync The value for jvmOutOfSync 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder jvmOutOfSync(boolean jvmOutOfSync) {
      this.jvmOutOfSync = jvmOutOfSync;
      initBits &= ~INIT_BIT_JVM_OUT_OF_SYNC;
      return this;
    }

    /**
     * Initializes the value for the {@link InstrumentationConfigJsonService.InstrumentationListResponse#jvmRetransformClassesSupported() jvmRetransformClassesSupported} attribute.
     * @param jvmRetransformClassesSupported The value for jvmRetransformClassesSupported 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder jvmRetransformClassesSupported(boolean jvmRetransformClassesSupported) {
      this.jvmRetransformClassesSupported = jvmRetransformClassesSupported;
      initBits &= ~INIT_BIT_JVM_RETRANSFORM_CLASSES_SUPPORTED;
      return this;
    }

    /**
     * Builds a new {@link ImmutableInstrumentationListResponse ImmutableInstrumentationListResponse}.
     * @return An immutable instance of InstrumentationListResponse
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableInstrumentationListResponse build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableInstrumentationListResponse(configs.build(), jvmOutOfSync, jvmRetransformClassesSupported);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_JVM_OUT_OF_SYNC) != 0) attributes.add("jvmOutOfSync");
      if ((initBits & INIT_BIT_JVM_RETRANSFORM_CLASSES_SUPPORTED) != 0) attributes.add("jvmRetransformClassesSupported");
      return "Cannot build InstrumentationListResponse, some of required attributes are not set " + attributes;
    }
  }
}
