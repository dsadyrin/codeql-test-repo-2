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
 * Immutable implementation of {@link AgentConfigJsonService.AgentRollupConfigDto}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAgentRollupConfigDto.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "AgentConfigJsonService.AgentRollupConfigDto"})
@Immutable
final class ImmutableAgentRollupConfigDto
    extends AgentConfigJsonService.AgentRollupConfigDto {
  private final String id;
  private final String display;
  private final String version;

  private ImmutableAgentRollupConfigDto(String id, String display, String version) {
    this.id = id;
    this.display = display;
    this.version = version;
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  String id() {
    return id;
  }

  /**
   * @return The value of the {@code display} attribute
   */
  @JsonProperty("display")
  @Override
  String display() {
    return display;
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
   * Copy the current immutable object by setting a value for the {@link AgentConfigJsonService.AgentRollupConfigDto#id() id} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for id
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAgentRollupConfigDto withId(String value) {
    if (this.id.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "id");
    return new ImmutableAgentRollupConfigDto(newValue, this.display, this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AgentConfigJsonService.AgentRollupConfigDto#display() display} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for display
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAgentRollupConfigDto withDisplay(String value) {
    if (this.display.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "display");
    return new ImmutableAgentRollupConfigDto(this.id, newValue, this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AgentConfigJsonService.AgentRollupConfigDto#version() version} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for version
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAgentRollupConfigDto withVersion(String value) {
    if (this.version.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "version");
    return new ImmutableAgentRollupConfigDto(this.id, this.display, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAgentRollupConfigDto} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAgentRollupConfigDto
        && equalTo((ImmutableAgentRollupConfigDto) another);
  }

  private boolean equalTo(ImmutableAgentRollupConfigDto another) {
    return id.equals(another.id)
        && display.equals(another.display)
        && version.equals(another.version);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code display}, {@code version}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + id.hashCode();
    h += (h << 5) + display.hashCode();
    h += (h << 5) + version.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code AgentRollupConfigDto} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("AgentRollupConfigDto")
        .omitNullValues()
        .add("id", id)
        .add("display", display)
        .add("version", version)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends AgentConfigJsonService.AgentRollupConfigDto {
    @Nullable String id;
    @Nullable String display;
    @Nullable String version;
    @JsonProperty("id")
    public void setId(String id) {
      this.id = id;
    }
    @JsonProperty("display")
    public void setDisplay(String display) {
      this.display = display;
    }
    @JsonProperty("version")
    public void setVersion(String version) {
      this.version = version;
    }
    @Override
    String id() { throw new UnsupportedOperationException(); }
    @Override
    String display() { throw new UnsupportedOperationException(); }
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
  static ImmutableAgentRollupConfigDto fromJson(Json json) {
    ImmutableAgentRollupConfigDto.Builder builder = ImmutableAgentRollupConfigDto.builder();
    if (json.id != null) {
      builder.id(json.id);
    }
    if (json.display != null) {
      builder.display(json.display);
    }
    if (json.version != null) {
      builder.version(json.version);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link AgentConfigJsonService.AgentRollupConfigDto} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable AgentRollupConfigDto instance
   */
  public static ImmutableAgentRollupConfigDto copyOf(AgentConfigJsonService.AgentRollupConfigDto instance) {
    if (instance instanceof ImmutableAgentRollupConfigDto) {
      return (ImmutableAgentRollupConfigDto) instance;
    }
    return ImmutableAgentRollupConfigDto.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableAgentRollupConfigDto ImmutableAgentRollupConfigDto}.
   * @return A new ImmutableAgentRollupConfigDto builder
   */
  public static ImmutableAgentRollupConfigDto.Builder builder() {
    return new ImmutableAgentRollupConfigDto.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableAgentRollupConfigDto ImmutableAgentRollupConfigDto}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_ID = 0x1L;
    private static final long INIT_BIT_DISPLAY = 0x2L;
    private static final long INIT_BIT_VERSION = 0x4L;
    private long initBits = 0x7L;

    private @Nullable String id;
    private @Nullable String display;
    private @Nullable String version;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code AgentRollupConfigDto} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(AgentConfigJsonService.AgentRollupConfigDto instance) {
      Preconditions.checkNotNull(instance, "instance");
      id(instance.id());
      display(instance.display());
      version(instance.version());
      return this;
    }

    /**
     * Initializes the value for the {@link AgentConfigJsonService.AgentRollupConfigDto#id() id} attribute.
     * @param id The value for id 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder id(String id) {
      this.id = Preconditions.checkNotNull(id, "id");
      initBits &= ~INIT_BIT_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link AgentConfigJsonService.AgentRollupConfigDto#display() display} attribute.
     * @param display The value for display 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder display(String display) {
      this.display = Preconditions.checkNotNull(display, "display");
      initBits &= ~INIT_BIT_DISPLAY;
      return this;
    }

    /**
     * Initializes the value for the {@link AgentConfigJsonService.AgentRollupConfigDto#version() version} attribute.
     * @param version The value for version 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder version(String version) {
      this.version = Preconditions.checkNotNull(version, "version");
      initBits &= ~INIT_BIT_VERSION;
      return this;
    }

    /**
     * Builds a new {@link ImmutableAgentRollupConfigDto ImmutableAgentRollupConfigDto}.
     * @return An immutable instance of AgentRollupConfigDto
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableAgentRollupConfigDto build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableAgentRollupConfigDto(id, display, version);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_ID) != 0) attributes.add("id");
      if ((initBits & INIT_BIT_DISPLAY) != 0) attributes.add("display");
      if ((initBits & INIT_BIT_VERSION) != 0) attributes.add("version");
      return "Cannot build AgentRollupConfigDto, some of required attributes are not set " + attributes;
    }
  }
}
