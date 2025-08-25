package org.glowroot.agent.shaded.glowroot.common.config;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonIgnore;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import org.glowroot.agent.shaded.google.common.collect.ImmutableSet;
import org.glowroot.agent.shaded.google.common.collect.Lists;
import org.glowroot.agent.shaded.google.common.primitives.Booleans;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link RoleConfig}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableRoleConfig.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "RoleConfig"})
@Immutable
public final class ImmutableRoleConfig extends RoleConfig {
  private final String name;
  private final ImmutableSet<String> permissions;
  private final boolean central;
  private final ImmutableSet<RoleConfig.SimplePermission> simplePermissions;
  private final String version;

  private ImmutableRoleConfig(ImmutableRoleConfig.Builder builder) {
    this.name = builder.name;
    this.permissions = builder.permissions.build();
    if (builder.centralIsSet()) {
      initShim.central(builder.central);
    }
    this.central = initShim.central();
    this.simplePermissions = initShim.simplePermissions();
    this.version = initShim.version();
    this.initShim = null;
  }

  private ImmutableRoleConfig(
      String name,
      ImmutableSet<String> permissions,
      boolean central) {
    this.name = name;
    this.permissions = permissions;
    this.central = central;
    initShim.central(this.central);
    this.simplePermissions = initShim.simplePermissions();
    this.version = initShim.version();
    this.initShim = null;
  }

  private static final int STAGE_INITIALIZING = -1;
  private static final int STAGE_UNINITIALIZED = 0;
  private static final int STAGE_INITIALIZED = 1;
  private transient volatile InitShim initShim = new InitShim();

  private final class InitShim {
    private boolean central;
    private int centralBuildStage;

    boolean central() {
      if (centralBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (centralBuildStage == STAGE_UNINITIALIZED) {
        centralBuildStage = STAGE_INITIALIZING;
        this.central = ImmutableRoleConfig.super.central();
        centralBuildStage = STAGE_INITIALIZED;
      }
      return this.central;
    }

    void central(boolean central) {
      this.central = central;
      centralBuildStage = STAGE_INITIALIZED;
    }
    private ImmutableSet<RoleConfig.SimplePermission> simplePermissions;
    private int simplePermissionsBuildStage;

    ImmutableSet<RoleConfig.SimplePermission> simplePermissions() {
      if (simplePermissionsBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (simplePermissionsBuildStage == STAGE_UNINITIALIZED) {
        simplePermissionsBuildStage = STAGE_INITIALIZING;
        this.simplePermissions = Preconditions.checkNotNull(ImmutableRoleConfig.super.simplePermissions(), "simplePermissions");
        simplePermissionsBuildStage = STAGE_INITIALIZED;
      }
      return this.simplePermissions;
    }
    private String version;
    private int versionBuildStage;

    String version() {
      if (versionBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (versionBuildStage == STAGE_UNINITIALIZED) {
        versionBuildStage = STAGE_INITIALIZING;
        this.version = Preconditions.checkNotNull(ImmutableRoleConfig.super.version(), "version");
        versionBuildStage = STAGE_INITIALIZED;
      }
      return this.version;
    }

    private String formatInitCycleMessage() {
      ArrayList<String> attributes = Lists.newArrayList();
      if (centralBuildStage == STAGE_INITIALIZING) attributes.add("central");
      if (simplePermissionsBuildStage == STAGE_INITIALIZING) attributes.add("simplePermissions");
      if (versionBuildStage == STAGE_INITIALIZING) attributes.add("version");
      return "Cannot build RoleConfig, attribute initializers form cycle" + attributes;
    }
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @JsonProperty("name")
  @Override
  public String name() {
    return name;
  }

  /**
   * @return The value of the {@code permissions} attribute
   */
  @JsonProperty("permissions")
  @Override
  public ImmutableSet<String> permissions() {
    return permissions;
  }

  /**
   * @return The value of the {@code central} attribute
   */
  @JsonProperty("central")
  @JsonIgnore
  @Override
  public boolean central() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.central()
        : this.central;
  }

  /**
   * @return The computed-at-construction value of the {@code simplePermissions} attribute
   */
  @JsonProperty("simplePermissions")
  @JsonIgnore
  @Override
  public ImmutableSet<RoleConfig.SimplePermission> simplePermissions() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.simplePermissions()
        : this.simplePermissions;
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
   * Copy the current immutable object by setting a value for the {@link RoleConfig#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRoleConfig withName(String value) {
    if (this.name.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "name");
    return new ImmutableRoleConfig(newValue, this.permissions, this.central);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link RoleConfig#permissions() permissions}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRoleConfig withPermissions(String... elements) {
    ImmutableSet<String> newValue = ImmutableSet.copyOf(elements);
    return new ImmutableRoleConfig(this.name, newValue, this.central);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link RoleConfig#permissions() permissions}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of permissions elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRoleConfig withPermissions(Iterable<String> elements) {
    if (this.permissions == elements) return this;
    ImmutableSet<String> newValue = ImmutableSet.copyOf(elements);
    return new ImmutableRoleConfig(this.name, newValue, this.central);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link RoleConfig#central() central} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for central
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRoleConfig withCentral(boolean value) {
    if (this.central == value) return this;
    return new ImmutableRoleConfig(this.name, this.permissions, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableRoleConfig} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableRoleConfig
        && equalTo((ImmutableRoleConfig) another);
  }

  private boolean equalTo(ImmutableRoleConfig another) {
    return name.equals(another.name)
        && permissions.equals(another.permissions)
        && central == another.central
        && simplePermissions.equals(another.simplePermissions)
        && version.equals(another.version);
  }

  /**
   * Computes a hash code from attributes: {@code name}, {@code permissions}, {@code central}, {@code simplePermissions}, {@code version}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + name.hashCode();
    h += (h << 5) + permissions.hashCode();
    h += (h << 5) + Booleans.hashCode(central);
    h += (h << 5) + simplePermissions.hashCode();
    h += (h << 5) + version.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code RoleConfig} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("RoleConfig")
        .omitNullValues()
        .add("name", name)
        .add("permissions", permissions)
        .add("central", central)
        .add("simplePermissions", simplePermissions)
        .add("version", version)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends RoleConfig {
    @Nullable String name;
    ImmutableSet<String> permissions = ImmutableSet.of();
    boolean central;
    boolean centralIsSet;
    @JsonProperty("name")
    public void setName(String name) {
      this.name = name;
    }
    @JsonProperty("permissions")
    public void setPermissions(ImmutableSet<String> permissions) {
      this.permissions = permissions;
    }
    @JsonProperty("central")
    @JsonIgnore
    public void setCentral(boolean central) {
      this.central = central;
      this.centralIsSet = true;
    }
    @Override
    public String name() { throw new UnsupportedOperationException(); }
    @Override
    public ImmutableSet<String> permissions() { throw new UnsupportedOperationException(); }
    @Override
    public boolean central() { throw new UnsupportedOperationException(); }
    @Override
    public ImmutableSet<RoleConfig.SimplePermission> simplePermissions() { throw new UnsupportedOperationException(); }
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
  static ImmutableRoleConfig fromJson(Json json) {
    ImmutableRoleConfig.Builder builder = ImmutableRoleConfig.builder();
    if (json.name != null) {
      builder.name(json.name);
    }
    if (json.permissions != null) {
      builder.addAllPermissions(json.permissions);
    }
    if (json.centralIsSet) {
      builder.central(json.central);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link RoleConfig} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable RoleConfig instance
   */
  public static ImmutableRoleConfig copyOf(RoleConfig instance) {
    if (instance instanceof ImmutableRoleConfig) {
      return (ImmutableRoleConfig) instance;
    }
    return ImmutableRoleConfig.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableRoleConfig ImmutableRoleConfig}.
   * @return A new ImmutableRoleConfig builder
   */
  public static ImmutableRoleConfig.Builder builder() {
    return new ImmutableRoleConfig.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableRoleConfig ImmutableRoleConfig}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_NAME = 0x1L;
    private static final long OPT_BIT_CENTRAL = 0x1L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable String name;
    private ImmutableSet.Builder<String> permissions = ImmutableSet.builder();
    private boolean central;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code RoleConfig} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(RoleConfig instance) {
      Preconditions.checkNotNull(instance, "instance");
      name(instance.name());
      addAllPermissions(instance.permissions());
      central(instance.central());
      return this;
    }

    /**
     * Initializes the value for the {@link RoleConfig#name() name} attribute.
     * @param name The value for name 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder name(String name) {
      this.name = Preconditions.checkNotNull(name, "name");
      initBits &= ~INIT_BIT_NAME;
      return this;
    }

    /**
     * Adds one element to {@link RoleConfig#permissions() permissions} set.
     * @param element A permissions element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addPermissions(String element) {
      this.permissions.add(element);
      return this;
    }

    /**
     * Adds elements to {@link RoleConfig#permissions() permissions} set.
     * @param elements An array of permissions elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addPermissions(String... elements) {
      this.permissions.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link RoleConfig#permissions() permissions} set.
     * @param elements An iterable of permissions elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder permissions(Iterable<String> elements) {
      this.permissions = ImmutableSet.builder();
      return addAllPermissions(elements);
    }

    /**
     * Adds elements to {@link RoleConfig#permissions() permissions} set.
     * @param elements An iterable of permissions elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllPermissions(Iterable<String> elements) {
      this.permissions.addAll(elements);
      return this;
    }

    /**
     * Initializes the value for the {@link RoleConfig#central() central} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link RoleConfig#central() central}.</em>
     * @param central The value for central 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder central(boolean central) {
      this.central = central;
      optBits |= OPT_BIT_CENTRAL;
      return this;
    }

    /**
     * Builds a new {@link ImmutableRoleConfig ImmutableRoleConfig}.
     * @return An immutable instance of RoleConfig
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableRoleConfig build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableRoleConfig(this);
    }

    private boolean centralIsSet() {
      return (optBits & OPT_BIT_CENTRAL) != 0;
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      return "Cannot build RoleConfig, some of required attributes are not set " + attributes;
    }
  }
}
