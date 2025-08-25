package org.glowroot.agent.shaded.glowroot.ui;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Objects;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import org.glowroot.agent.shaded.google.common.collect.Lists;
import org.glowroot.agent.shaded.google.common.primitives.Booleans;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link AdminJsonService.EmbeddedWebConfigResponse}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableEmbeddedWebConfigResponse.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "AdminJsonService.EmbeddedWebConfigResponse"})
@Immutable
final class ImmutableEmbeddedWebConfigResponse
    implements AdminJsonService.EmbeddedWebConfigResponse {
  private final AdminJsonService.EmbeddedWebConfigDto config;
  private final int activePort;
  private final String activeBindAddress;
  private final boolean activeHttps;
  private final @Nullable String sharedConfDir;
  private final String confDir;
  private final boolean portChangeFailed;

  private ImmutableEmbeddedWebConfigResponse(
      AdminJsonService.EmbeddedWebConfigDto config,
      int activePort,
      String activeBindAddress,
      boolean activeHttps,
      @Nullable String sharedConfDir,
      String confDir,
      boolean portChangeFailed) {
    this.config = config;
    this.activePort = activePort;
    this.activeBindAddress = activeBindAddress;
    this.activeHttps = activeHttps;
    this.sharedConfDir = sharedConfDir;
    this.confDir = confDir;
    this.portChangeFailed = portChangeFailed;
  }

  /**
   * @return The value of the {@code config} attribute
   */
  @JsonProperty("config")
  @Override
  public AdminJsonService.EmbeddedWebConfigDto config() {
    return config;
  }

  /**
   * @return The value of the {@code activePort} attribute
   */
  @JsonProperty("activePort")
  @Override
  public int activePort() {
    return activePort;
  }

  /**
   * @return The value of the {@code activeBindAddress} attribute
   */
  @JsonProperty("activeBindAddress")
  @Override
  public String activeBindAddress() {
    return activeBindAddress;
  }

  /**
   * @return The value of the {@code activeHttps} attribute
   */
  @JsonProperty("activeHttps")
  @Override
  public boolean activeHttps() {
    return activeHttps;
  }

  /**
   * @return The value of the {@code sharedConfDir} attribute
   */
  @JsonProperty("sharedConfDir")
  @Override
  public @Nullable String sharedConfDir() {
    return sharedConfDir;
  }

  /**
   * @return The value of the {@code confDir} attribute
   */
  @JsonProperty("confDir")
  @Override
  public String confDir() {
    return confDir;
  }

  /**
   * @return The value of the {@code portChangeFailed} attribute
   */
  @JsonProperty("portChangeFailed")
  @Override
  public boolean portChangeFailed() {
    return portChangeFailed;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AdminJsonService.EmbeddedWebConfigResponse#config() config} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for config
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEmbeddedWebConfigResponse withConfig(AdminJsonService.EmbeddedWebConfigDto value) {
    if (this.config == value) return this;
    AdminJsonService.EmbeddedWebConfigDto newValue = Preconditions.checkNotNull(value, "config");
    return new ImmutableEmbeddedWebConfigResponse(
        newValue,
        this.activePort,
        this.activeBindAddress,
        this.activeHttps,
        this.sharedConfDir,
        this.confDir,
        this.portChangeFailed);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AdminJsonService.EmbeddedWebConfigResponse#activePort() activePort} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for activePort
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEmbeddedWebConfigResponse withActivePort(int value) {
    if (this.activePort == value) return this;
    return new ImmutableEmbeddedWebConfigResponse(
        this.config,
        value,
        this.activeBindAddress,
        this.activeHttps,
        this.sharedConfDir,
        this.confDir,
        this.portChangeFailed);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AdminJsonService.EmbeddedWebConfigResponse#activeBindAddress() activeBindAddress} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for activeBindAddress
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEmbeddedWebConfigResponse withActiveBindAddress(String value) {
    if (this.activeBindAddress.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "activeBindAddress");
    return new ImmutableEmbeddedWebConfigResponse(
        this.config,
        this.activePort,
        newValue,
        this.activeHttps,
        this.sharedConfDir,
        this.confDir,
        this.portChangeFailed);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AdminJsonService.EmbeddedWebConfigResponse#activeHttps() activeHttps} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for activeHttps
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEmbeddedWebConfigResponse withActiveHttps(boolean value) {
    if (this.activeHttps == value) return this;
    return new ImmutableEmbeddedWebConfigResponse(
        this.config,
        this.activePort,
        this.activeBindAddress,
        value,
        this.sharedConfDir,
        this.confDir,
        this.portChangeFailed);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AdminJsonService.EmbeddedWebConfigResponse#sharedConfDir() sharedConfDir} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for sharedConfDir (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEmbeddedWebConfigResponse withSharedConfDir(@Nullable String value) {
    if (Objects.equal(this.sharedConfDir, value)) return this;
    return new ImmutableEmbeddedWebConfigResponse(
        this.config,
        this.activePort,
        this.activeBindAddress,
        this.activeHttps,
        value,
        this.confDir,
        this.portChangeFailed);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AdminJsonService.EmbeddedWebConfigResponse#confDir() confDir} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for confDir
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEmbeddedWebConfigResponse withConfDir(String value) {
    if (this.confDir.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "confDir");
    return new ImmutableEmbeddedWebConfigResponse(
        this.config,
        this.activePort,
        this.activeBindAddress,
        this.activeHttps,
        this.sharedConfDir,
        newValue,
        this.portChangeFailed);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AdminJsonService.EmbeddedWebConfigResponse#portChangeFailed() portChangeFailed} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for portChangeFailed
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEmbeddedWebConfigResponse withPortChangeFailed(boolean value) {
    if (this.portChangeFailed == value) return this;
    return new ImmutableEmbeddedWebConfigResponse(
        this.config,
        this.activePort,
        this.activeBindAddress,
        this.activeHttps,
        this.sharedConfDir,
        this.confDir,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableEmbeddedWebConfigResponse} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableEmbeddedWebConfigResponse
        && equalTo((ImmutableEmbeddedWebConfigResponse) another);
  }

  private boolean equalTo(ImmutableEmbeddedWebConfigResponse another) {
    return config.equals(another.config)
        && activePort == another.activePort
        && activeBindAddress.equals(another.activeBindAddress)
        && activeHttps == another.activeHttps
        && Objects.equal(sharedConfDir, another.sharedConfDir)
        && confDir.equals(another.confDir)
        && portChangeFailed == another.portChangeFailed;
  }

  /**
   * Computes a hash code from attributes: {@code config}, {@code activePort}, {@code activeBindAddress}, {@code activeHttps}, {@code sharedConfDir}, {@code confDir}, {@code portChangeFailed}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + config.hashCode();
    h += (h << 5) + activePort;
    h += (h << 5) + activeBindAddress.hashCode();
    h += (h << 5) + Booleans.hashCode(activeHttps);
    h += (h << 5) + Objects.hashCode(sharedConfDir);
    h += (h << 5) + confDir.hashCode();
    h += (h << 5) + Booleans.hashCode(portChangeFailed);
    return h;
  }

  /**
   * Prints the immutable value {@code EmbeddedWebConfigResponse} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("EmbeddedWebConfigResponse")
        .omitNullValues()
        .add("config", config)
        .add("activePort", activePort)
        .add("activeBindAddress", activeBindAddress)
        .add("activeHttps", activeHttps)
        .add("sharedConfDir", sharedConfDir)
        .add("confDir", confDir)
        .add("portChangeFailed", portChangeFailed)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements AdminJsonService.EmbeddedWebConfigResponse {
    @Nullable AdminJsonService.EmbeddedWebConfigDto config;
    int activePort;
    boolean activePortIsSet;
    @Nullable String activeBindAddress;
    boolean activeHttps;
    boolean activeHttpsIsSet;
    @Nullable String sharedConfDir;
    @Nullable String confDir;
    boolean portChangeFailed;
    boolean portChangeFailedIsSet;
    @JsonProperty("config")
    public void setConfig(AdminJsonService.EmbeddedWebConfigDto config) {
      this.config = config;
    }
    @JsonProperty("activePort")
    public void setActivePort(int activePort) {
      this.activePort = activePort;
      this.activePortIsSet = true;
    }
    @JsonProperty("activeBindAddress")
    public void setActiveBindAddress(String activeBindAddress) {
      this.activeBindAddress = activeBindAddress;
    }
    @JsonProperty("activeHttps")
    public void setActiveHttps(boolean activeHttps) {
      this.activeHttps = activeHttps;
      this.activeHttpsIsSet = true;
    }
    @JsonProperty("sharedConfDir")
    public void setSharedConfDir(@Nullable String sharedConfDir) {
      this.sharedConfDir = sharedConfDir;
    }
    @JsonProperty("confDir")
    public void setConfDir(String confDir) {
      this.confDir = confDir;
    }
    @JsonProperty("portChangeFailed")
    public void setPortChangeFailed(boolean portChangeFailed) {
      this.portChangeFailed = portChangeFailed;
      this.portChangeFailedIsSet = true;
    }
    @Override
    public AdminJsonService.EmbeddedWebConfigDto config() { throw new UnsupportedOperationException(); }
    @Override
    public int activePort() { throw new UnsupportedOperationException(); }
    @Override
    public String activeBindAddress() { throw new UnsupportedOperationException(); }
    @Override
    public boolean activeHttps() { throw new UnsupportedOperationException(); }
    @Override
    public String sharedConfDir() { throw new UnsupportedOperationException(); }
    @Override
    public String confDir() { throw new UnsupportedOperationException(); }
    @Override
    public boolean portChangeFailed() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableEmbeddedWebConfigResponse fromJson(Json json) {
    ImmutableEmbeddedWebConfigResponse.Builder builder = ImmutableEmbeddedWebConfigResponse.builder();
    if (json.config != null) {
      builder.config(json.config);
    }
    if (json.activePortIsSet) {
      builder.activePort(json.activePort);
    }
    if (json.activeBindAddress != null) {
      builder.activeBindAddress(json.activeBindAddress);
    }
    if (json.activeHttpsIsSet) {
      builder.activeHttps(json.activeHttps);
    }
    if (json.sharedConfDir != null) {
      builder.sharedConfDir(json.sharedConfDir);
    }
    if (json.confDir != null) {
      builder.confDir(json.confDir);
    }
    if (json.portChangeFailedIsSet) {
      builder.portChangeFailed(json.portChangeFailed);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link AdminJsonService.EmbeddedWebConfigResponse} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable EmbeddedWebConfigResponse instance
   */
  public static ImmutableEmbeddedWebConfigResponse copyOf(AdminJsonService.EmbeddedWebConfigResponse instance) {
    if (instance instanceof ImmutableEmbeddedWebConfigResponse) {
      return (ImmutableEmbeddedWebConfigResponse) instance;
    }
    return ImmutableEmbeddedWebConfigResponse.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableEmbeddedWebConfigResponse ImmutableEmbeddedWebConfigResponse}.
   * @return A new ImmutableEmbeddedWebConfigResponse builder
   */
  public static ImmutableEmbeddedWebConfigResponse.Builder builder() {
    return new ImmutableEmbeddedWebConfigResponse.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableEmbeddedWebConfigResponse ImmutableEmbeddedWebConfigResponse}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_CONFIG = 0x1L;
    private static final long INIT_BIT_ACTIVE_PORT = 0x2L;
    private static final long INIT_BIT_ACTIVE_BIND_ADDRESS = 0x4L;
    private static final long INIT_BIT_ACTIVE_HTTPS = 0x8L;
    private static final long INIT_BIT_CONF_DIR = 0x10L;
    private static final long INIT_BIT_PORT_CHANGE_FAILED = 0x20L;
    private long initBits = 0x3fL;

    private @Nullable AdminJsonService.EmbeddedWebConfigDto config;
    private int activePort;
    private @Nullable String activeBindAddress;
    private boolean activeHttps;
    private @Nullable String sharedConfDir;
    private @Nullable String confDir;
    private boolean portChangeFailed;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code EmbeddedWebConfigResponse} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(AdminJsonService.EmbeddedWebConfigResponse instance) {
      Preconditions.checkNotNull(instance, "instance");
      config(instance.config());
      activePort(instance.activePort());
      activeBindAddress(instance.activeBindAddress());
      activeHttps(instance.activeHttps());
      @Nullable String sharedConfDirValue = instance.sharedConfDir();
      if (sharedConfDirValue != null) {
        sharedConfDir(sharedConfDirValue);
      }
      confDir(instance.confDir());
      portChangeFailed(instance.portChangeFailed());
      return this;
    }

    /**
     * Initializes the value for the {@link AdminJsonService.EmbeddedWebConfigResponse#config() config} attribute.
     * @param config The value for config 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder config(AdminJsonService.EmbeddedWebConfigDto config) {
      this.config = Preconditions.checkNotNull(config, "config");
      initBits &= ~INIT_BIT_CONFIG;
      return this;
    }

    /**
     * Initializes the value for the {@link AdminJsonService.EmbeddedWebConfigResponse#activePort() activePort} attribute.
     * @param activePort The value for activePort 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder activePort(int activePort) {
      this.activePort = activePort;
      initBits &= ~INIT_BIT_ACTIVE_PORT;
      return this;
    }

    /**
     * Initializes the value for the {@link AdminJsonService.EmbeddedWebConfigResponse#activeBindAddress() activeBindAddress} attribute.
     * @param activeBindAddress The value for activeBindAddress 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder activeBindAddress(String activeBindAddress) {
      this.activeBindAddress = Preconditions.checkNotNull(activeBindAddress, "activeBindAddress");
      initBits &= ~INIT_BIT_ACTIVE_BIND_ADDRESS;
      return this;
    }

    /**
     * Initializes the value for the {@link AdminJsonService.EmbeddedWebConfigResponse#activeHttps() activeHttps} attribute.
     * @param activeHttps The value for activeHttps 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder activeHttps(boolean activeHttps) {
      this.activeHttps = activeHttps;
      initBits &= ~INIT_BIT_ACTIVE_HTTPS;
      return this;
    }

    /**
     * Initializes the value for the {@link AdminJsonService.EmbeddedWebConfigResponse#sharedConfDir() sharedConfDir} attribute.
     * @param sharedConfDir The value for sharedConfDir (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder sharedConfDir(@Nullable String sharedConfDir) {
      this.sharedConfDir = sharedConfDir;
      return this;
    }

    /**
     * Initializes the value for the {@link AdminJsonService.EmbeddedWebConfigResponse#confDir() confDir} attribute.
     * @param confDir The value for confDir 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder confDir(String confDir) {
      this.confDir = Preconditions.checkNotNull(confDir, "confDir");
      initBits &= ~INIT_BIT_CONF_DIR;
      return this;
    }

    /**
     * Initializes the value for the {@link AdminJsonService.EmbeddedWebConfigResponse#portChangeFailed() portChangeFailed} attribute.
     * @param portChangeFailed The value for portChangeFailed 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder portChangeFailed(boolean portChangeFailed) {
      this.portChangeFailed = portChangeFailed;
      initBits &= ~INIT_BIT_PORT_CHANGE_FAILED;
      return this;
    }

    /**
     * Builds a new {@link ImmutableEmbeddedWebConfigResponse ImmutableEmbeddedWebConfigResponse}.
     * @return An immutable instance of EmbeddedWebConfigResponse
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableEmbeddedWebConfigResponse build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableEmbeddedWebConfigResponse(config, activePort, activeBindAddress, activeHttps, sharedConfDir, confDir, portChangeFailed);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_CONFIG) != 0) attributes.add("config");
      if ((initBits & INIT_BIT_ACTIVE_PORT) != 0) attributes.add("activePort");
      if ((initBits & INIT_BIT_ACTIVE_BIND_ADDRESS) != 0) attributes.add("activeBindAddress");
      if ((initBits & INIT_BIT_ACTIVE_HTTPS) != 0) attributes.add("activeHttps");
      if ((initBits & INIT_BIT_CONF_DIR) != 0) attributes.add("confDir");
      if ((initBits & INIT_BIT_PORT_CHANGE_FAILED) != 0) attributes.add("portChangeFailed");
      return "Cannot build EmbeddedWebConfigResponse, some of required attributes are not set " + attributes;
    }
  }
}
