package org.glowroot.agent.shaded.glowroot.common.config;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonIgnore;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import org.glowroot.agent.shaded.google.common.collect.Lists;
import java.util.ArrayList;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link CentralWebConfig}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCentralWebConfig.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "CentralWebConfig"})
@Immutable
public final class ImmutableCentralWebConfig extends CentralWebConfig {
  private final int sessionTimeoutMinutes;
  private final String sessionCookieName;
  private final String version;

  private ImmutableCentralWebConfig(ImmutableCentralWebConfig.Builder builder) {
    if (builder.sessionTimeoutMinutesIsSet()) {
      initShim.sessionTimeoutMinutes(builder.sessionTimeoutMinutes);
    }
    if (builder.sessionCookieName != null) {
      initShim.sessionCookieName(builder.sessionCookieName);
    }
    this.sessionTimeoutMinutes = initShim.sessionTimeoutMinutes();
    this.sessionCookieName = initShim.sessionCookieName();
    this.version = initShim.version();
    this.initShim = null;
  }

  private ImmutableCentralWebConfig(int sessionTimeoutMinutes, String sessionCookieName) {
    this.sessionTimeoutMinutes = sessionTimeoutMinutes;
    this.sessionCookieName = sessionCookieName;
    initShim.sessionTimeoutMinutes(this.sessionTimeoutMinutes);
    initShim.sessionCookieName(this.sessionCookieName);
    this.version = initShim.version();
    this.initShim = null;
  }

  private static final int STAGE_INITIALIZING = -1;
  private static final int STAGE_UNINITIALIZED = 0;
  private static final int STAGE_INITIALIZED = 1;
  private transient volatile InitShim initShim = new InitShim();

  private final class InitShim {
    private int sessionTimeoutMinutes;
    private int sessionTimeoutMinutesBuildStage;

    int sessionTimeoutMinutes() {
      if (sessionTimeoutMinutesBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (sessionTimeoutMinutesBuildStage == STAGE_UNINITIALIZED) {
        sessionTimeoutMinutesBuildStage = STAGE_INITIALIZING;
        this.sessionTimeoutMinutes = ImmutableCentralWebConfig.super.sessionTimeoutMinutes();
        sessionTimeoutMinutesBuildStage = STAGE_INITIALIZED;
      }
      return this.sessionTimeoutMinutes;
    }

    void sessionTimeoutMinutes(int sessionTimeoutMinutes) {
      this.sessionTimeoutMinutes = sessionTimeoutMinutes;
      sessionTimeoutMinutesBuildStage = STAGE_INITIALIZED;
    }
    private String sessionCookieName;
    private int sessionCookieNameBuildStage;

    String sessionCookieName() {
      if (sessionCookieNameBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (sessionCookieNameBuildStage == STAGE_UNINITIALIZED) {
        sessionCookieNameBuildStage = STAGE_INITIALIZING;
        this.sessionCookieName = Preconditions.checkNotNull(ImmutableCentralWebConfig.super.sessionCookieName(), "sessionCookieName");
        sessionCookieNameBuildStage = STAGE_INITIALIZED;
      }
      return this.sessionCookieName;
    }

    void sessionCookieName(String sessionCookieName) {
      this.sessionCookieName = sessionCookieName;
      sessionCookieNameBuildStage = STAGE_INITIALIZED;
    }
    private String version;
    private int versionBuildStage;

    String version() {
      if (versionBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (versionBuildStage == STAGE_UNINITIALIZED) {
        versionBuildStage = STAGE_INITIALIZING;
        this.version = Preconditions.checkNotNull(ImmutableCentralWebConfig.super.version(), "version");
        versionBuildStage = STAGE_INITIALIZED;
      }
      return this.version;
    }

    private String formatInitCycleMessage() {
      ArrayList<String> attributes = Lists.newArrayList();
      if (sessionTimeoutMinutesBuildStage == STAGE_INITIALIZING) attributes.add("sessionTimeoutMinutes");
      if (sessionCookieNameBuildStage == STAGE_INITIALIZING) attributes.add("sessionCookieName");
      if (versionBuildStage == STAGE_INITIALIZING) attributes.add("version");
      return "Cannot build CentralWebConfig, attribute initializers form cycle" + attributes;
    }
  }

  /**
   * @return The value of the {@code sessionTimeoutMinutes} attribute
   */
  @JsonProperty("sessionTimeoutMinutes")
  @Override
  public int sessionTimeoutMinutes() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.sessionTimeoutMinutes()
        : this.sessionTimeoutMinutes;
  }

  /**
   * @return The value of the {@code sessionCookieName} attribute
   */
  @JsonProperty("sessionCookieName")
  @Override
  public String sessionCookieName() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.sessionCookieName()
        : this.sessionCookieName;
  }

  /**
   * @return The computed-at-construction value of the {@code version} attribute
   */
  @JsonProperty("version")
  @JsonIgnore
  @Override
  public String version() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.version()
        : this.version;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CentralWebConfig#sessionTimeoutMinutes() sessionTimeoutMinutes} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for sessionTimeoutMinutes
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCentralWebConfig withSessionTimeoutMinutes(int value) {
    if (this.sessionTimeoutMinutes == value) return this;
    return new ImmutableCentralWebConfig(value, this.sessionCookieName);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CentralWebConfig#sessionCookieName() sessionCookieName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for sessionCookieName
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCentralWebConfig withSessionCookieName(String value) {
    if (this.sessionCookieName.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "sessionCookieName");
    return new ImmutableCentralWebConfig(this.sessionTimeoutMinutes, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCentralWebConfig} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCentralWebConfig
        && equalTo((ImmutableCentralWebConfig) another);
  }

  private boolean equalTo(ImmutableCentralWebConfig another) {
    return sessionTimeoutMinutes == another.sessionTimeoutMinutes
        && sessionCookieName.equals(another.sessionCookieName)
        && version.equals(another.version);
  }

  /**
   * Computes a hash code from attributes: {@code sessionTimeoutMinutes}, {@code sessionCookieName}, {@code version}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + sessionTimeoutMinutes;
    h += (h << 5) + sessionCookieName.hashCode();
    h += (h << 5) + version.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code CentralWebConfig} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("CentralWebConfig")
        .omitNullValues()
        .add("sessionTimeoutMinutes", sessionTimeoutMinutes)
        .add("sessionCookieName", sessionCookieName)
        .add("version", version)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends CentralWebConfig {
    int sessionTimeoutMinutes;
    boolean sessionTimeoutMinutesIsSet;
    @Nullable String sessionCookieName;
    @JsonProperty("sessionTimeoutMinutes")
    public void setSessionTimeoutMinutes(int sessionTimeoutMinutes) {
      this.sessionTimeoutMinutes = sessionTimeoutMinutes;
      this.sessionTimeoutMinutesIsSet = true;
    }
    @JsonProperty("sessionCookieName")
    public void setSessionCookieName(String sessionCookieName) {
      this.sessionCookieName = sessionCookieName;
    }
    @Override
    public int sessionTimeoutMinutes() { throw new UnsupportedOperationException(); }
    @Override
    public String sessionCookieName() { throw new UnsupportedOperationException(); }
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
  static ImmutableCentralWebConfig fromJson(Json json) {
    ImmutableCentralWebConfig.Builder builder = ImmutableCentralWebConfig.builder();
    if (json.sessionTimeoutMinutesIsSet) {
      builder.sessionTimeoutMinutes(json.sessionTimeoutMinutes);
    }
    if (json.sessionCookieName != null) {
      builder.sessionCookieName(json.sessionCookieName);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link CentralWebConfig} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable CentralWebConfig instance
   */
  public static ImmutableCentralWebConfig copyOf(CentralWebConfig instance) {
    if (instance instanceof ImmutableCentralWebConfig) {
      return (ImmutableCentralWebConfig) instance;
    }
    return ImmutableCentralWebConfig.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableCentralWebConfig ImmutableCentralWebConfig}.
   * @return A new ImmutableCentralWebConfig builder
   */
  public static ImmutableCentralWebConfig.Builder builder() {
    return new ImmutableCentralWebConfig.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableCentralWebConfig ImmutableCentralWebConfig}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_SESSION_TIMEOUT_MINUTES = 0x1L;
    private long optBits;

    private int sessionTimeoutMinutes;
    private @Nullable String sessionCookieName;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code org.glowroot.agent.shaded.glowroot.common.config.WebConfig} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(WebConfig instance) {
      Preconditions.checkNotNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    /**
     * Fill a builder with attribute values from the provided {@code org.glowroot.agent.shaded.glowroot.common.config.CentralWebConfig} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(CentralWebConfig instance) {
      Preconditions.checkNotNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    private void from(Object object) {
      long bits = 0;
      if (object instanceof WebConfig) {
        WebConfig instance = (WebConfig) object;
        if ((bits & 0x2L) == 0) {
          sessionCookieName(instance.sessionCookieName());
          bits |= 0x2L;
        }
        if ((bits & 0x1L) == 0) {
          sessionTimeoutMinutes(instance.sessionTimeoutMinutes());
          bits |= 0x1L;
        }
      }
      if (object instanceof CentralWebConfig) {
        CentralWebConfig instance = (CentralWebConfig) object;
        if ((bits & 0x2L) == 0) {
          sessionCookieName(instance.sessionCookieName());
          bits |= 0x2L;
        }
        if ((bits & 0x1L) == 0) {
          sessionTimeoutMinutes(instance.sessionTimeoutMinutes());
          bits |= 0x1L;
        }
      }
    }

    /**
     * Initializes the value for the {@link CentralWebConfig#sessionTimeoutMinutes() sessionTimeoutMinutes} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link CentralWebConfig#sessionTimeoutMinutes() sessionTimeoutMinutes}.</em>
     * @param sessionTimeoutMinutes The value for sessionTimeoutMinutes 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder sessionTimeoutMinutes(int sessionTimeoutMinutes) {
      this.sessionTimeoutMinutes = sessionTimeoutMinutes;
      optBits |= OPT_BIT_SESSION_TIMEOUT_MINUTES;
      return this;
    }

    /**
     * Initializes the value for the {@link CentralWebConfig#sessionCookieName() sessionCookieName} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link CentralWebConfig#sessionCookieName() sessionCookieName}.</em>
     * @param sessionCookieName The value for sessionCookieName 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder sessionCookieName(String sessionCookieName) {
      this.sessionCookieName = Preconditions.checkNotNull(sessionCookieName, "sessionCookieName");
      return this;
    }

    /**
     * Builds a new {@link ImmutableCentralWebConfig ImmutableCentralWebConfig}.
     * @return An immutable instance of CentralWebConfig
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableCentralWebConfig build() {
      return new ImmutableCentralWebConfig(this);
    }

    private boolean sessionTimeoutMinutesIsSet() {
      return (optBits & OPT_BIT_SESSION_TIMEOUT_MINUTES) != 0;
    }
  }
}
