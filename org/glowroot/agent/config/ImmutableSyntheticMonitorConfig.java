package org.glowroot.agent.config;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonInclude;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import org.glowroot.agent.shaded.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.glowroot.agent.shaded.glowroot.wire.api.model.AgentConfigOuterClass;

/**
 * Immutable implementation of {@link SyntheticMonitorConfig}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSyntheticMonitorConfig.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "SyntheticMonitorConfig"})
@Immutable
public final class ImmutableSyntheticMonitorConfig extends SyntheticMonitorConfig {
  private final String id;
  private final String display;
  private final AgentConfigOuterClass.AgentConfig.SyntheticMonitorConfig.SyntheticMonitorKind kind;
  private final String pingUrl;
  private final String javaSource;

  private ImmutableSyntheticMonitorConfig(ImmutableSyntheticMonitorConfig.Builder builder) {
    this.id = builder.id;
    this.display = builder.display;
    this.kind = builder.kind;
    if (builder.pingUrl != null) {
      initShim.pingUrl(builder.pingUrl);
    }
    if (builder.javaSource != null) {
      initShim.javaSource(builder.javaSource);
    }
    this.pingUrl = initShim.pingUrl();
    this.javaSource = initShim.javaSource();
    this.initShim = null;
  }

  private ImmutableSyntheticMonitorConfig(
      String id,
      String display,
      AgentConfigOuterClass.AgentConfig.SyntheticMonitorConfig.SyntheticMonitorKind kind,
      String pingUrl,
      String javaSource) {
    this.id = id;
    this.display = display;
    this.kind = kind;
    this.pingUrl = pingUrl;
    this.javaSource = javaSource;
    this.initShim = null;
  }

  private static final int STAGE_INITIALIZING = -1;
  private static final int STAGE_UNINITIALIZED = 0;
  private static final int STAGE_INITIALIZED = 1;
  private transient volatile InitShim initShim = new InitShim();

  private final class InitShim {
    private String pingUrl;
    private int pingUrlBuildStage;

    String pingUrl() {
      if (pingUrlBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (pingUrlBuildStage == STAGE_UNINITIALIZED) {
        pingUrlBuildStage = STAGE_INITIALIZING;
        this.pingUrl = Preconditions.checkNotNull(ImmutableSyntheticMonitorConfig.super.pingUrl(), "pingUrl");
        pingUrlBuildStage = STAGE_INITIALIZED;
      }
      return this.pingUrl;
    }

    void pingUrl(String pingUrl) {
      this.pingUrl = pingUrl;
      pingUrlBuildStage = STAGE_INITIALIZED;
    }
    private String javaSource;
    private int javaSourceBuildStage;

    String javaSource() {
      if (javaSourceBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (javaSourceBuildStage == STAGE_UNINITIALIZED) {
        javaSourceBuildStage = STAGE_INITIALIZING;
        this.javaSource = Preconditions.checkNotNull(ImmutableSyntheticMonitorConfig.super.javaSource(), "javaSource");
        javaSourceBuildStage = STAGE_INITIALIZED;
      }
      return this.javaSource;
    }

    void javaSource(String javaSource) {
      this.javaSource = javaSource;
      javaSourceBuildStage = STAGE_INITIALIZED;
    }

    private String formatInitCycleMessage() {
      ArrayList<String> attributes = Lists.newArrayList();
      if (pingUrlBuildStage == STAGE_INITIALIZING) attributes.add("pingUrl");
      if (javaSourceBuildStage == STAGE_INITIALIZING) attributes.add("javaSource");
      return "Cannot build SyntheticMonitorConfig, attribute initializers form cycle" + attributes;
    }
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public String id() {
    return id;
  }

  /**
   * @return The value of the {@code display} attribute
   */
  @JsonProperty("display")
  @Override
  public String display() {
    return display;
  }

  /**
   * @return The value of the {@code kind} attribute
   */
  @JsonProperty("kind")
  @Override
  public AgentConfigOuterClass.AgentConfig.SyntheticMonitorConfig.SyntheticMonitorKind kind() {
    return kind;
  }

  /**
   * @return The value of the {@code pingUrl} attribute
   */
  @JsonProperty("pingUrl")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @Override
  public String pingUrl() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.pingUrl()
        : this.pingUrl;
  }

  /**
   * @return The value of the {@code javaSource} attribute
   */
  @JsonProperty("javaSource")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @Override
  public String javaSource() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.javaSource()
        : this.javaSource;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SyntheticMonitorConfig#id() id} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for id
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSyntheticMonitorConfig withId(String value) {
    if (this.id.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "id");
    return new ImmutableSyntheticMonitorConfig(newValue, this.display, this.kind, this.pingUrl, this.javaSource);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SyntheticMonitorConfig#display() display} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for display
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSyntheticMonitorConfig withDisplay(String value) {
    if (this.display.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "display");
    return new ImmutableSyntheticMonitorConfig(this.id, newValue, this.kind, this.pingUrl, this.javaSource);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SyntheticMonitorConfig#kind() kind} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for kind
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSyntheticMonitorConfig withKind(AgentConfigOuterClass.AgentConfig.SyntheticMonitorConfig.SyntheticMonitorKind value) {
    if (this.kind == value) return this;
    AgentConfigOuterClass.AgentConfig.SyntheticMonitorConfig.SyntheticMonitorKind newValue = Preconditions.checkNotNull(value, "kind");
    return new ImmutableSyntheticMonitorConfig(this.id, this.display, newValue, this.pingUrl, this.javaSource);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SyntheticMonitorConfig#pingUrl() pingUrl} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for pingUrl
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSyntheticMonitorConfig withPingUrl(String value) {
    if (this.pingUrl.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "pingUrl");
    return new ImmutableSyntheticMonitorConfig(this.id, this.display, this.kind, newValue, this.javaSource);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SyntheticMonitorConfig#javaSource() javaSource} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for javaSource
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSyntheticMonitorConfig withJavaSource(String value) {
    if (this.javaSource.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "javaSource");
    return new ImmutableSyntheticMonitorConfig(this.id, this.display, this.kind, this.pingUrl, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSyntheticMonitorConfig} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSyntheticMonitorConfig
        && equalTo((ImmutableSyntheticMonitorConfig) another);
  }

  private boolean equalTo(ImmutableSyntheticMonitorConfig another) {
    return id.equals(another.id)
        && display.equals(another.display)
        && kind.equals(another.kind)
        && pingUrl.equals(another.pingUrl)
        && javaSource.equals(another.javaSource);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code display}, {@code kind}, {@code pingUrl}, {@code javaSource}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + id.hashCode();
    h += (h << 5) + display.hashCode();
    h += (h << 5) + kind.hashCode();
    h += (h << 5) + pingUrl.hashCode();
    h += (h << 5) + javaSource.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code SyntheticMonitorConfig} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("SyntheticMonitorConfig")
        .omitNullValues()
        .add("id", id)
        .add("display", display)
        .add("kind", kind)
        .add("pingUrl", pingUrl)
        .add("javaSource", javaSource)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends SyntheticMonitorConfig {
    @Nullable String id;
    @Nullable String display;
    @Nullable AgentConfigOuterClass.AgentConfig.SyntheticMonitorConfig.SyntheticMonitorKind kind;
    @Nullable String pingUrl;
    @Nullable String javaSource;
    @JsonProperty("id")
    public void setId(String id) {
      this.id = id;
    }
    @JsonProperty("display")
    public void setDisplay(String display) {
      this.display = display;
    }
    @JsonProperty("kind")
    public void setKind(AgentConfigOuterClass.AgentConfig.SyntheticMonitorConfig.SyntheticMonitorKind kind) {
      this.kind = kind;
    }
    @JsonProperty("pingUrl")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public void setPingUrl(String pingUrl) {
      this.pingUrl = pingUrl;
    }
    @JsonProperty("javaSource")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public void setJavaSource(String javaSource) {
      this.javaSource = javaSource;
    }
    @Override
    public String id() { throw new UnsupportedOperationException(); }
    @Override
    public String display() { throw new UnsupportedOperationException(); }
    @Override
    public AgentConfigOuterClass.AgentConfig.SyntheticMonitorConfig.SyntheticMonitorKind kind() { throw new UnsupportedOperationException(); }
    @Override
    public String pingUrl() { throw new UnsupportedOperationException(); }
    @Override
    public String javaSource() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableSyntheticMonitorConfig fromJson(Json json) {
    ImmutableSyntheticMonitorConfig.Builder builder = ImmutableSyntheticMonitorConfig.builder();
    if (json.id != null) {
      builder.id(json.id);
    }
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
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SyntheticMonitorConfig} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SyntheticMonitorConfig instance
   */
  public static ImmutableSyntheticMonitorConfig copyOf(SyntheticMonitorConfig instance) {
    if (instance instanceof ImmutableSyntheticMonitorConfig) {
      return (ImmutableSyntheticMonitorConfig) instance;
    }
    return ImmutableSyntheticMonitorConfig.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableSyntheticMonitorConfig ImmutableSyntheticMonitorConfig}.
   * @return A new ImmutableSyntheticMonitorConfig builder
   */
  public static ImmutableSyntheticMonitorConfig.Builder builder() {
    return new ImmutableSyntheticMonitorConfig.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableSyntheticMonitorConfig ImmutableSyntheticMonitorConfig}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_ID = 0x1L;
    private static final long INIT_BIT_DISPLAY = 0x2L;
    private static final long INIT_BIT_KIND = 0x4L;
    private long initBits = 0x7L;

    private @Nullable String id;
    private @Nullable String display;
    private @Nullable AgentConfigOuterClass.AgentConfig.SyntheticMonitorConfig.SyntheticMonitorKind kind;
    private @Nullable String pingUrl;
    private @Nullable String javaSource;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code SyntheticMonitorConfig} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(SyntheticMonitorConfig instance) {
      Preconditions.checkNotNull(instance, "instance");
      id(instance.id());
      display(instance.display());
      kind(instance.kind());
      pingUrl(instance.pingUrl());
      javaSource(instance.javaSource());
      return this;
    }

    /**
     * Initializes the value for the {@link SyntheticMonitorConfig#id() id} attribute.
     * @param id The value for id 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder id(String id) {
      this.id = Preconditions.checkNotNull(id, "id");
      initBits &= ~INIT_BIT_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link SyntheticMonitorConfig#display() display} attribute.
     * @param display The value for display 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder display(String display) {
      this.display = Preconditions.checkNotNull(display, "display");
      initBits &= ~INIT_BIT_DISPLAY;
      return this;
    }

    /**
     * Initializes the value for the {@link SyntheticMonitorConfig#kind() kind} attribute.
     * @param kind The value for kind 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder kind(AgentConfigOuterClass.AgentConfig.SyntheticMonitorConfig.SyntheticMonitorKind kind) {
      this.kind = Preconditions.checkNotNull(kind, "kind");
      initBits &= ~INIT_BIT_KIND;
      return this;
    }

    /**
     * Initializes the value for the {@link SyntheticMonitorConfig#pingUrl() pingUrl} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link SyntheticMonitorConfig#pingUrl() pingUrl}.</em>
     * @param pingUrl The value for pingUrl 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder pingUrl(String pingUrl) {
      this.pingUrl = Preconditions.checkNotNull(pingUrl, "pingUrl");
      return this;
    }

    /**
     * Initializes the value for the {@link SyntheticMonitorConfig#javaSource() javaSource} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link SyntheticMonitorConfig#javaSource() javaSource}.</em>
     * @param javaSource The value for javaSource 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder javaSource(String javaSource) {
      this.javaSource = Preconditions.checkNotNull(javaSource, "javaSource");
      return this;
    }

    /**
     * Builds a new {@link ImmutableSyntheticMonitorConfig ImmutableSyntheticMonitorConfig}.
     * @return An immutable instance of SyntheticMonitorConfig
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableSyntheticMonitorConfig build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableSyntheticMonitorConfig(this);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_ID) != 0) attributes.add("id");
      if ((initBits & INIT_BIT_DISPLAY) != 0) attributes.add("display");
      if ((initBits & INIT_BIT_KIND) != 0) attributes.add("kind");
      return "Cannot build SyntheticMonitorConfig, some of required attributes are not set " + attributes;
    }
  }
}
