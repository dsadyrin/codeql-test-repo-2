package org.glowroot.agent.shaded.glowroot.ui;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Objects;
import org.glowroot.agent.shaded.google.common.base.Optional;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import org.glowroot.agent.shaded.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.glowroot.agent.shaded.glowroot.wire.api.model.AgentConfigOuterClass;

/**
 * Immutable implementation of {@link SyntheticMonitorConfigJsonService.SyntheticMonitorConfigDto}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSyntheticMonitorConfigDto.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "SyntheticMonitorConfigJsonService.SyntheticMonitorConfigDto"})
@Immutable
final class ImmutableSyntheticMonitorConfigDto
    extends SyntheticMonitorConfigJsonService.SyntheticMonitorConfigDto {
  private final String display;
  private final AgentConfigOuterClass.AgentConfig.SyntheticMonitorConfig.SyntheticMonitorKind kind;
  private final @Nullable String pingUrl;
  private final @Nullable String javaSource;
  private final Optional<String> id;
  private final Optional<String> version;

  private ImmutableSyntheticMonitorConfigDto(
      String display,
      AgentConfigOuterClass.AgentConfig.SyntheticMonitorConfig.SyntheticMonitorKind kind,
      @Nullable String pingUrl,
      @Nullable String javaSource,
      Optional<String> id,
      Optional<String> version) {
    this.display = display;
    this.kind = kind;
    this.pingUrl = pingUrl;
    this.javaSource = javaSource;
    this.id = id;
    this.version = version;
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
   * @return The value of the {@code kind} attribute
   */
  @JsonProperty("kind")
  @Override
  AgentConfigOuterClass.AgentConfig.SyntheticMonitorConfig.SyntheticMonitorKind kind() {
    return kind;
  }

  /**
   * @return The value of the {@code pingUrl} attribute
   */
  @JsonProperty("pingUrl")
  @Override
  @Nullable String pingUrl() {
    return pingUrl;
  }

  /**
   * @return The value of the {@code javaSource} attribute
   */
  @JsonProperty("javaSource")
  @Override
  @Nullable String javaSource() {
    return javaSource;
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  Optional<String> id() {
    return id;
  }

  /**
   * @return The value of the {@code version} attribute
   */
  @JsonProperty("version")
  @Override
  Optional<String> version() {
    return version;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SyntheticMonitorConfigJsonService.SyntheticMonitorConfigDto#display() display} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for display
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSyntheticMonitorConfigDto withDisplay(String value) {
    if (this.display.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "display");
    return new ImmutableSyntheticMonitorConfigDto(newValue, this.kind, this.pingUrl, this.javaSource, this.id, this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SyntheticMonitorConfigJsonService.SyntheticMonitorConfigDto#kind() kind} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for kind
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSyntheticMonitorConfigDto withKind(AgentConfigOuterClass.AgentConfig.SyntheticMonitorConfig.SyntheticMonitorKind value) {
    if (this.kind == value) return this;
    AgentConfigOuterClass.AgentConfig.SyntheticMonitorConfig.SyntheticMonitorKind newValue = Preconditions.checkNotNull(value, "kind");
    return new ImmutableSyntheticMonitorConfigDto(this.display, newValue, this.pingUrl, this.javaSource, this.id, this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SyntheticMonitorConfigJsonService.SyntheticMonitorConfigDto#pingUrl() pingUrl} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for pingUrl (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSyntheticMonitorConfigDto withPingUrl(@Nullable String value) {
    if (Objects.equal(this.pingUrl, value)) return this;
    return new ImmutableSyntheticMonitorConfigDto(this.display, this.kind, value, this.javaSource, this.id, this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SyntheticMonitorConfigJsonService.SyntheticMonitorConfigDto#javaSource() javaSource} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for javaSource (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSyntheticMonitorConfigDto withJavaSource(@Nullable String value) {
    if (Objects.equal(this.javaSource, value)) return this;
    return new ImmutableSyntheticMonitorConfigDto(this.display, this.kind, this.pingUrl, value, this.id, this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SyntheticMonitorConfigJsonService.SyntheticMonitorConfigDto#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSyntheticMonitorConfigDto withId(String value) {
    Optional<String> newValue = Optional.of(value);
    if (this.id.equals(newValue)) return this;
    return new ImmutableSyntheticMonitorConfigDto(this.display, this.kind, this.pingUrl, this.javaSource, newValue, this.version);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SyntheticMonitorConfigJsonService.SyntheticMonitorConfigDto#id() id} attribute.
   * An equality check is used to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSyntheticMonitorConfigDto withId(Optional<String> optional) {
    Optional<String> value = (Optional<String>) optional;
    if (this.id.equals(value)) return this;
    return new ImmutableSyntheticMonitorConfigDto(this.display, this.kind, this.pingUrl, this.javaSource, value, this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SyntheticMonitorConfigJsonService.SyntheticMonitorConfigDto#version() version} attribute.
   * @param value The value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSyntheticMonitorConfigDto withVersion(String value) {
    Optional<String> newValue = Optional.of(value);
    if (this.version.equals(newValue)) return this;
    return new ImmutableSyntheticMonitorConfigDto(this.display, this.kind, this.pingUrl, this.javaSource, this.id, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SyntheticMonitorConfigJsonService.SyntheticMonitorConfigDto#version() version} attribute.
   * An equality check is used to prevent copying of the same value by returning {@code this}.
   * @param optional A value for version
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSyntheticMonitorConfigDto withVersion(Optional<String> optional) {
    Optional<String> value = (Optional<String>) optional;
    if (this.version.equals(value)) return this;
    return new ImmutableSyntheticMonitorConfigDto(this.display, this.kind, this.pingUrl, this.javaSource, this.id, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSyntheticMonitorConfigDto} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSyntheticMonitorConfigDto
        && equalTo((ImmutableSyntheticMonitorConfigDto) another);
  }

  private boolean equalTo(ImmutableSyntheticMonitorConfigDto another) {
    return display.equals(another.display)
        && kind.equals(another.kind)
        && Objects.equal(pingUrl, another.pingUrl)
        && Objects.equal(javaSource, another.javaSource)
        && id.equals(another.id)
        && version.equals(another.version);
  }

  /**
   * Computes a hash code from attributes: {@code display}, {@code kind}, {@code pingUrl}, {@code javaSource}, {@code id}, {@code version}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + display.hashCode();
    h += (h << 5) + kind.hashCode();
    h += (h << 5) + Objects.hashCode(pingUrl);
    h += (h << 5) + Objects.hashCode(javaSource);
    h += (h << 5) + id.hashCode();
    h += (h << 5) + version.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code SyntheticMonitorConfigDto} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("SyntheticMonitorConfigDto")
        .omitNullValues()
        .add("display", display)
        .add("kind", kind)
        .add("pingUrl", pingUrl)
        .add("javaSource", javaSource)
        .add("id", id.orNull())
        .add("version", version.orNull())
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends SyntheticMonitorConfigJsonService.SyntheticMonitorConfigDto {
    @Nullable String display;
    @Nullable AgentConfigOuterClass.AgentConfig.SyntheticMonitorConfig.SyntheticMonitorKind kind;
    @Nullable String pingUrl;
    @Nullable String javaSource;
    Optional<String> id = Optional.absent();
    Optional<String> version = Optional.absent();
    @JsonProperty("display")
    public void setDisplay(String display) {
      this.display = display;
    }
    @JsonProperty("kind")
    public void setKind(AgentConfigOuterClass.AgentConfig.SyntheticMonitorConfig.SyntheticMonitorKind kind) {
      this.kind = kind;
    }
    @JsonProperty("pingUrl")
    public void setPingUrl(@Nullable String pingUrl) {
      this.pingUrl = pingUrl;
    }
    @JsonProperty("javaSource")
    public void setJavaSource(@Nullable String javaSource) {
      this.javaSource = javaSource;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
    }
    @JsonProperty("version")
    public void setVersion(Optional<String> version) {
      this.version = version;
    }
    @Override
    String display() { throw new UnsupportedOperationException(); }
    @Override
    AgentConfigOuterClass.AgentConfig.SyntheticMonitorConfig.SyntheticMonitorKind kind() { throw new UnsupportedOperationException(); }
    @Override
    String pingUrl() { throw new UnsupportedOperationException(); }
    @Override
    String javaSource() { throw new UnsupportedOperationException(); }
    @Override
    Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    Optional<String> version() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableSyntheticMonitorConfigDto fromJson(Json json) {
    ImmutableSyntheticMonitorConfigDto.Builder builder = ImmutableSyntheticMonitorConfigDto.builder();
    if (json.display != null) {
      builder.display(json.display);
    }
    if (json.kind != null) {
      builder.kind(json.kind);
    }
    if (json.pingUrl != null) {
      builder.pingUrl(json.pingUrl);
    }
    if (json.javaSource != null) {
      builder.javaSource(json.javaSource);
    }
    if (json.id != null) {
      builder.id(json.id);
    }
    if (json.version != null) {
      builder.version(json.version);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SyntheticMonitorConfigJsonService.SyntheticMonitorConfigDto} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SyntheticMonitorConfigDto instance
   */
  public static ImmutableSyntheticMonitorConfigDto copyOf(SyntheticMonitorConfigJsonService.SyntheticMonitorConfigDto instance) {
    if (instance instanceof ImmutableSyntheticMonitorConfigDto) {
      return (ImmutableSyntheticMonitorConfigDto) instance;
    }
    return ImmutableSyntheticMonitorConfigDto.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableSyntheticMonitorConfigDto ImmutableSyntheticMonitorConfigDto}.
   * @return A new ImmutableSyntheticMonitorConfigDto builder
   */
  public static ImmutableSyntheticMonitorConfigDto.Builder builder() {
    return new ImmutableSyntheticMonitorConfigDto.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableSyntheticMonitorConfigDto ImmutableSyntheticMonitorConfigDto}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_DISPLAY = 0x1L;
    private static final long INIT_BIT_KIND = 0x2L;
    private long initBits = 0x3L;

    private @Nullable String display;
    private @Nullable AgentConfigOuterClass.AgentConfig.SyntheticMonitorConfig.SyntheticMonitorKind kind;
    private @Nullable String pingUrl;
    private @Nullable String javaSource;
    private Optional<String> id = Optional.absent();
    private Optional<String> version = Optional.absent();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code SyntheticMonitorConfigDto} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(SyntheticMonitorConfigJsonService.SyntheticMonitorConfigDto instance) {
      Preconditions.checkNotNull(instance, "instance");
      display(instance.display());
      kind(instance.kind());
      @Nullable String pingUrlValue = instance.pingUrl();
      if (pingUrlValue != null) {
        pingUrl(pingUrlValue);
      }
      @Nullable String javaSourceValue = instance.javaSource();
      if (javaSourceValue != null) {
        javaSource(javaSourceValue);
      }
      Optional<String> idOptional = instance.id();
      if (idOptional.isPresent()) {
        id(idOptional);
      }
      Optional<String> versionOptional = instance.version();
      if (versionOptional.isPresent()) {
        version(versionOptional);
      }
      return this;
    }

    /**
     * Initializes the value for the {@link SyntheticMonitorConfigJsonService.SyntheticMonitorConfigDto#display() display} attribute.
     * @param display The value for display 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder display(String display) {
      this.display = Preconditions.checkNotNull(display, "display");
      initBits &= ~INIT_BIT_DISPLAY;
      return this;
    }

    /**
     * Initializes the value for the {@link SyntheticMonitorConfigJsonService.SyntheticMonitorConfigDto#kind() kind} attribute.
     * @param kind The value for kind 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder kind(AgentConfigOuterClass.AgentConfig.SyntheticMonitorConfig.SyntheticMonitorKind kind) {
      this.kind = Preconditions.checkNotNull(kind, "kind");
      initBits &= ~INIT_BIT_KIND;
      return this;
    }

    /**
     * Initializes the value for the {@link SyntheticMonitorConfigJsonService.SyntheticMonitorConfigDto#pingUrl() pingUrl} attribute.
     * @param pingUrl The value for pingUrl (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder pingUrl(@Nullable String pingUrl) {
      this.pingUrl = pingUrl;
      return this;
    }

    /**
     * Initializes the value for the {@link SyntheticMonitorConfigJsonService.SyntheticMonitorConfigDto#javaSource() javaSource} attribute.
     * @param javaSource The value for javaSource (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder javaSource(@Nullable String javaSource) {
      this.javaSource = javaSource;
      return this;
    }

    /**
     * Initializes the optional value {@link SyntheticMonitorConfigJsonService.SyntheticMonitorConfigDto#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(String id) {
      this.id = Optional.of(id);
      return this;
    }

    /**
     * Initializes the optional value {@link SyntheticMonitorConfigJsonService.SyntheticMonitorConfigDto#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @SuppressWarnings("unchecked") // safe covariant cast
    public final Builder id(Optional<String> id) {
      this.id = (Optional<String>) id;
      return this;
    }

    /**
     * Initializes the optional value {@link SyntheticMonitorConfigJsonService.SyntheticMonitorConfigDto#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    public final Builder version(String version) {
      this.version = Optional.of(version);
      return this;
    }

    /**
     * Initializes the optional value {@link SyntheticMonitorConfigJsonService.SyntheticMonitorConfigDto#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    @SuppressWarnings("unchecked") // safe covariant cast
    public final Builder version(Optional<String> version) {
      this.version = (Optional<String>) version;
      return this;
    }

    /**
     * Builds a new {@link ImmutableSyntheticMonitorConfigDto ImmutableSyntheticMonitorConfigDto}.
     * @return An immutable instance of SyntheticMonitorConfigDto
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableSyntheticMonitorConfigDto build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableSyntheticMonitorConfigDto(display, kind, pingUrl, javaSource, id, version);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_DISPLAY) != 0) attributes.add("display");
      if ((initBits & INIT_BIT_KIND) != 0) attributes.add("kind");
      return "Cannot build SyntheticMonitorConfigDto, some of required attributes are not set " + attributes;
    }
  }
}
