package org.glowroot.agent.shaded.glowroot.common.config;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonIgnore;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import org.glowroot.agent.shaded.google.common.collect.ImmutableList;
import org.glowroot.agent.shaded.google.common.collect.Lists;
import org.glowroot.agent.shaded.google.common.primitives.Ints;
import java.util.ArrayList;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link CentralStorageConfig}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCentralStorageConfig.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "CentralStorageConfig"})
@Immutable
public final class ImmutableCentralStorageConfig extends CentralStorageConfig {
  private final ImmutableList<Integer> rollupExpirationHours;
  private final int traceExpirationHours;
  private final int fullQueryTextExpirationHours;
  private final String version;

  private ImmutableCentralStorageConfig(ImmutableCentralStorageConfig.Builder builder) {
    if (builder.rollupExpirationHoursIsSet()) {
      initShim.rollupExpirationHours(builder.rollupExpirationHours.build());
    }
    if (builder.traceExpirationHoursIsSet()) {
      initShim.traceExpirationHours(builder.traceExpirationHours);
    }
    if (builder.fullQueryTextExpirationHoursIsSet()) {
      initShim.fullQueryTextExpirationHours(builder.fullQueryTextExpirationHours);
    }
    this.rollupExpirationHours = initShim.rollupExpirationHours();
    this.traceExpirationHours = initShim.traceExpirationHours();
    this.fullQueryTextExpirationHours = initShim.fullQueryTextExpirationHours();
    this.version = initShim.version();
    this.initShim = null;
  }

  private ImmutableCentralStorageConfig(
      ImmutableList<Integer> rollupExpirationHours,
      int traceExpirationHours,
      int fullQueryTextExpirationHours) {
    this.rollupExpirationHours = rollupExpirationHours;
    this.traceExpirationHours = traceExpirationHours;
    this.fullQueryTextExpirationHours = fullQueryTextExpirationHours;
    initShim.rollupExpirationHours(this.rollupExpirationHours);
    initShim.traceExpirationHours(this.traceExpirationHours);
    initShim.fullQueryTextExpirationHours(this.fullQueryTextExpirationHours);
    this.version = initShim.version();
    this.initShim = null;
  }

  private static final int STAGE_INITIALIZING = -1;
  private static final int STAGE_UNINITIALIZED = 0;
  private static final int STAGE_INITIALIZED = 1;
  private transient volatile InitShim initShim = new InitShim();

  private final class InitShim {
    private ImmutableList<Integer> rollupExpirationHours;
    private int rollupExpirationHoursBuildStage;

    ImmutableList<Integer> rollupExpirationHours() {
      if (rollupExpirationHoursBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (rollupExpirationHoursBuildStage == STAGE_UNINITIALIZED) {
        rollupExpirationHoursBuildStage = STAGE_INITIALIZING;
        this.rollupExpirationHours = Preconditions.checkNotNull(ImmutableCentralStorageConfig.super.rollupExpirationHours(), "rollupExpirationHours");
        rollupExpirationHoursBuildStage = STAGE_INITIALIZED;
      }
      return this.rollupExpirationHours;
    }

    void rollupExpirationHours(ImmutableList<Integer> rollupExpirationHours) {
      this.rollupExpirationHours = rollupExpirationHours;
      rollupExpirationHoursBuildStage = STAGE_INITIALIZED;
    }
    private int traceExpirationHours;
    private int traceExpirationHoursBuildStage;

    int traceExpirationHours() {
      if (traceExpirationHoursBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (traceExpirationHoursBuildStage == STAGE_UNINITIALIZED) {
        traceExpirationHoursBuildStage = STAGE_INITIALIZING;
        this.traceExpirationHours = ImmutableCentralStorageConfig.super.traceExpirationHours();
        traceExpirationHoursBuildStage = STAGE_INITIALIZED;
      }
      return this.traceExpirationHours;
    }

    void traceExpirationHours(int traceExpirationHours) {
      this.traceExpirationHours = traceExpirationHours;
      traceExpirationHoursBuildStage = STAGE_INITIALIZED;
    }
    private int fullQueryTextExpirationHours;
    private int fullQueryTextExpirationHoursBuildStage;

    int fullQueryTextExpirationHours() {
      if (fullQueryTextExpirationHoursBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (fullQueryTextExpirationHoursBuildStage == STAGE_UNINITIALIZED) {
        fullQueryTextExpirationHoursBuildStage = STAGE_INITIALIZING;
        this.fullQueryTextExpirationHours = ImmutableCentralStorageConfig.super.fullQueryTextExpirationHours();
        fullQueryTextExpirationHoursBuildStage = STAGE_INITIALIZED;
      }
      return this.fullQueryTextExpirationHours;
    }

    void fullQueryTextExpirationHours(int fullQueryTextExpirationHours) {
      this.fullQueryTextExpirationHours = fullQueryTextExpirationHours;
      fullQueryTextExpirationHoursBuildStage = STAGE_INITIALIZED;
    }
    private String version;
    private int versionBuildStage;

    String version() {
      if (versionBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (versionBuildStage == STAGE_UNINITIALIZED) {
        versionBuildStage = STAGE_INITIALIZING;
        this.version = Preconditions.checkNotNull(ImmutableCentralStorageConfig.super.version(), "version");
        versionBuildStage = STAGE_INITIALIZED;
      }
      return this.version;
    }

    private String formatInitCycleMessage() {
      ArrayList<String> attributes = Lists.newArrayList();
      if (rollupExpirationHoursBuildStage == STAGE_INITIALIZING) attributes.add("rollupExpirationHours");
      if (traceExpirationHoursBuildStage == STAGE_INITIALIZING) attributes.add("traceExpirationHours");
      if (fullQueryTextExpirationHoursBuildStage == STAGE_INITIALIZING) attributes.add("fullQueryTextExpirationHours");
      if (versionBuildStage == STAGE_INITIALIZING) attributes.add("version");
      return "Cannot build CentralStorageConfig, attribute initializers form cycle" + attributes;
    }
  }

  /**
   * @return The value of the {@code rollupExpirationHours} attribute
   */
  @JsonProperty("rollupExpirationHours")
  @Override
  public ImmutableList<Integer> rollupExpirationHours() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.rollupExpirationHours()
        : this.rollupExpirationHours;
  }

  /**
   * @return The value of the {@code traceExpirationHours} attribute
   */
  @JsonProperty("traceExpirationHours")
  @Override
  public int traceExpirationHours() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.traceExpirationHours()
        : this.traceExpirationHours;
  }

  /**
   * @return The value of the {@code fullQueryTextExpirationHours} attribute
   */
  @JsonProperty("fullQueryTextExpirationHours")
  @Override
  public int fullQueryTextExpirationHours() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.fullQueryTextExpirationHours()
        : this.fullQueryTextExpirationHours;
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
   * Copy the current immutable object with elements that replace the content of {@link CentralStorageConfig#rollupExpirationHours() rollupExpirationHours}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCentralStorageConfig withRollupExpirationHours(int... elements) {
    ImmutableList<Integer> newValue = ImmutableList.copyOf(Ints.asList(elements));
    return new ImmutableCentralStorageConfig(newValue, this.traceExpirationHours, this.fullQueryTextExpirationHours);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link CentralStorageConfig#rollupExpirationHours() rollupExpirationHours}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of rollupExpirationHours elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCentralStorageConfig withRollupExpirationHours(Iterable<Integer> elements) {
    if (this.rollupExpirationHours == elements) return this;
    ImmutableList<Integer> newValue = ImmutableList.copyOf(elements);
    return new ImmutableCentralStorageConfig(newValue, this.traceExpirationHours, this.fullQueryTextExpirationHours);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CentralStorageConfig#traceExpirationHours() traceExpirationHours} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for traceExpirationHours
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCentralStorageConfig withTraceExpirationHours(int value) {
    if (this.traceExpirationHours == value) return this;
    return new ImmutableCentralStorageConfig(this.rollupExpirationHours, value, this.fullQueryTextExpirationHours);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CentralStorageConfig#fullQueryTextExpirationHours() fullQueryTextExpirationHours} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for fullQueryTextExpirationHours
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCentralStorageConfig withFullQueryTextExpirationHours(int value) {
    if (this.fullQueryTextExpirationHours == value) return this;
    return new ImmutableCentralStorageConfig(this.rollupExpirationHours, this.traceExpirationHours, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCentralStorageConfig} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCentralStorageConfig
        && equalTo((ImmutableCentralStorageConfig) another);
  }

  private boolean equalTo(ImmutableCentralStorageConfig another) {
    return rollupExpirationHours.equals(another.rollupExpirationHours)
        && traceExpirationHours == another.traceExpirationHours
        && fullQueryTextExpirationHours == another.fullQueryTextExpirationHours
        && version.equals(another.version);
  }

  /**
   * Computes a hash code from attributes: {@code rollupExpirationHours}, {@code traceExpirationHours}, {@code fullQueryTextExpirationHours}, {@code version}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + rollupExpirationHours.hashCode();
    h += (h << 5) + traceExpirationHours;
    h += (h << 5) + fullQueryTextExpirationHours;
    h += (h << 5) + version.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code CentralStorageConfig} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("CentralStorageConfig")
        .omitNullValues()
        .add("rollupExpirationHours", rollupExpirationHours)
        .add("traceExpirationHours", traceExpirationHours)
        .add("fullQueryTextExpirationHours", fullQueryTextExpirationHours)
        .add("version", version)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends CentralStorageConfig {
    ImmutableList<Integer> rollupExpirationHours = ImmutableList.of();
    boolean rollupExpirationHoursIsSet;
    int traceExpirationHours;
    boolean traceExpirationHoursIsSet;
    int fullQueryTextExpirationHours;
    boolean fullQueryTextExpirationHoursIsSet;
    @JsonProperty("rollupExpirationHours")
    public void setRollupExpirationHours(ImmutableList<Integer> rollupExpirationHours) {
      this.rollupExpirationHours = rollupExpirationHours;
      this.rollupExpirationHoursIsSet = true;
    }
    @JsonProperty("traceExpirationHours")
    public void setTraceExpirationHours(int traceExpirationHours) {
      this.traceExpirationHours = traceExpirationHours;
      this.traceExpirationHoursIsSet = true;
    }
    @JsonProperty("fullQueryTextExpirationHours")
    public void setFullQueryTextExpirationHours(int fullQueryTextExpirationHours) {
      this.fullQueryTextExpirationHours = fullQueryTextExpirationHours;
      this.fullQueryTextExpirationHoursIsSet = true;
    }
    @Override
    public ImmutableList<Integer> rollupExpirationHours() { throw new UnsupportedOperationException(); }
    @Override
    public int traceExpirationHours() { throw new UnsupportedOperationException(); }
    @Override
    public int fullQueryTextExpirationHours() { throw new UnsupportedOperationException(); }
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
  static ImmutableCentralStorageConfig fromJson(Json json) {
    ImmutableCentralStorageConfig.Builder builder = ImmutableCentralStorageConfig.builder();
    if (json.rollupExpirationHoursIsSet) {
      builder.rollupExpirationHours(json.rollupExpirationHours);
    }
    if (json.traceExpirationHoursIsSet) {
      builder.traceExpirationHours(json.traceExpirationHours);
    }
    if (json.fullQueryTextExpirationHoursIsSet) {
      builder.fullQueryTextExpirationHours(json.fullQueryTextExpirationHours);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link CentralStorageConfig} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable CentralStorageConfig instance
   */
  public static ImmutableCentralStorageConfig copyOf(CentralStorageConfig instance) {
    if (instance instanceof ImmutableCentralStorageConfig) {
      return (ImmutableCentralStorageConfig) instance;
    }
    return ImmutableCentralStorageConfig.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableCentralStorageConfig ImmutableCentralStorageConfig}.
   * @return A new ImmutableCentralStorageConfig builder
   */
  public static ImmutableCentralStorageConfig.Builder builder() {
    return new ImmutableCentralStorageConfig.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableCentralStorageConfig ImmutableCentralStorageConfig}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ROLLUP_EXPIRATION_HOURS = 0x1L;
    private static final long OPT_BIT_TRACE_EXPIRATION_HOURS = 0x2L;
    private static final long OPT_BIT_FULL_QUERY_TEXT_EXPIRATION_HOURS = 0x4L;
    private long optBits;

    private ImmutableList.Builder<Integer> rollupExpirationHours = ImmutableList.builder();
    private int traceExpirationHours;
    private int fullQueryTextExpirationHours;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code org.glowroot.agent.shaded.glowroot.common.config.StorageConfig} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(StorageConfig instance) {
      Preconditions.checkNotNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    /**
     * Fill a builder with attribute values from the provided {@code org.glowroot.agent.shaded.glowroot.common.config.CentralStorageConfig} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(CentralStorageConfig instance) {
      Preconditions.checkNotNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    private void from(Object object) {
      long bits = 0;
      if (object instanceof StorageConfig) {
        StorageConfig instance = (StorageConfig) object;
        if ((bits & 0x1L) == 0) {
          traceExpirationHours(instance.traceExpirationHours());
          bits |= 0x1L;
        }
        if ((bits & 0x2L) == 0) {
          addAllRollupExpirationHours(instance.rollupExpirationHours());
          bits |= 0x2L;
        }
        if ((bits & 0x4L) == 0) {
          fullQueryTextExpirationHours(instance.fullQueryTextExpirationHours());
          bits |= 0x4L;
        }
      }
      if (object instanceof CentralStorageConfig) {
        CentralStorageConfig instance = (CentralStorageConfig) object;
        if ((bits & 0x1L) == 0) {
          traceExpirationHours(instance.traceExpirationHours());
          bits |= 0x1L;
        }
        if ((bits & 0x2L) == 0) {
          addAllRollupExpirationHours(instance.rollupExpirationHours());
          bits |= 0x2L;
        }
        if ((bits & 0x4L) == 0) {
          fullQueryTextExpirationHours(instance.fullQueryTextExpirationHours());
          bits |= 0x4L;
        }
      }
    }

    /**
     * Adds one element to {@link CentralStorageConfig#rollupExpirationHours() rollupExpirationHours} list.
     * @param element A rollupExpirationHours element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addRollupExpirationHours(int element) {
      this.rollupExpirationHours.add(element);
      optBits |= OPT_BIT_ROLLUP_EXPIRATION_HOURS;
      return this;
    }

    /**
     * Adds elements to {@link CentralStorageConfig#rollupExpirationHours() rollupExpirationHours} list.
     * @param elements An array of rollupExpirationHours elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addRollupExpirationHours(int... elements) {
      this.rollupExpirationHours.addAll(Ints.asList(elements));
      optBits |= OPT_BIT_ROLLUP_EXPIRATION_HOURS;
      return this;
    }

    /**
     * Sets or replaces all elements for {@link CentralStorageConfig#rollupExpirationHours() rollupExpirationHours} list.
     * @param elements An iterable of rollupExpirationHours elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder rollupExpirationHours(Iterable<Integer> elements) {
      this.rollupExpirationHours = ImmutableList.builder();
      return addAllRollupExpirationHours(elements);
    }

    /**
     * Adds elements to {@link CentralStorageConfig#rollupExpirationHours() rollupExpirationHours} list.
     * @param elements An iterable of rollupExpirationHours elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllRollupExpirationHours(Iterable<Integer> elements) {
      this.rollupExpirationHours.addAll(elements);
      optBits |= OPT_BIT_ROLLUP_EXPIRATION_HOURS;
      return this;
    }

    /**
     * Initializes the value for the {@link CentralStorageConfig#traceExpirationHours() traceExpirationHours} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link CentralStorageConfig#traceExpirationHours() traceExpirationHours}.</em>
     * @param traceExpirationHours The value for traceExpirationHours 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder traceExpirationHours(int traceExpirationHours) {
      this.traceExpirationHours = traceExpirationHours;
      optBits |= OPT_BIT_TRACE_EXPIRATION_HOURS;
      return this;
    }

    /**
     * Initializes the value for the {@link CentralStorageConfig#fullQueryTextExpirationHours() fullQueryTextExpirationHours} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link CentralStorageConfig#fullQueryTextExpirationHours() fullQueryTextExpirationHours}.</em>
     * @param fullQueryTextExpirationHours The value for fullQueryTextExpirationHours 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder fullQueryTextExpirationHours(int fullQueryTextExpirationHours) {
      this.fullQueryTextExpirationHours = fullQueryTextExpirationHours;
      optBits |= OPT_BIT_FULL_QUERY_TEXT_EXPIRATION_HOURS;
      return this;
    }

    /**
     * Builds a new {@link ImmutableCentralStorageConfig ImmutableCentralStorageConfig}.
     * @return An immutable instance of CentralStorageConfig
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableCentralStorageConfig build() {
      return new ImmutableCentralStorageConfig(this);
    }

    private boolean rollupExpirationHoursIsSet() {
      return (optBits & OPT_BIT_ROLLUP_EXPIRATION_HOURS) != 0;
    }

    private boolean traceExpirationHoursIsSet() {
      return (optBits & OPT_BIT_TRACE_EXPIRATION_HOURS) != 0;
    }

    private boolean fullQueryTextExpirationHoursIsSet() {
      return (optBits & OPT_BIT_FULL_QUERY_TEXT_EXPIRATION_HOURS) != 0;
    }
  }
}
