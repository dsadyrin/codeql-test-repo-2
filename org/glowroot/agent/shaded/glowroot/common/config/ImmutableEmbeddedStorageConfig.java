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
 * Immutable implementation of {@link EmbeddedStorageConfig}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableEmbeddedStorageConfig.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "EmbeddedStorageConfig"})
@Immutable
public final class ImmutableEmbeddedStorageConfig extends EmbeddedStorageConfig {
  private final ImmutableList<Integer> rollupExpirationHours;
  private final int traceExpirationHours;
  private final int fullQueryTextExpirationHours;
  private final ImmutableList<Integer> rollupCappedDatabaseSizesMb;
  private final int traceCappedDatabaseSizeMb;
  private final String version;

  private ImmutableEmbeddedStorageConfig(ImmutableEmbeddedStorageConfig.Builder builder) {
    if (builder.rollupExpirationHoursIsSet()) {
      initShim.rollupExpirationHours(builder.rollupExpirationHours.build());
    }
    if (builder.traceExpirationHoursIsSet()) {
      initShim.traceExpirationHours(builder.traceExpirationHours);
    }
    if (builder.fullQueryTextExpirationHoursIsSet()) {
      initShim.fullQueryTextExpirationHours(builder.fullQueryTextExpirationHours);
    }
    if (builder.rollupCappedDatabaseSizesMbIsSet()) {
      initShim.rollupCappedDatabaseSizesMb(builder.rollupCappedDatabaseSizesMb.build());
    }
    if (builder.traceCappedDatabaseSizeMbIsSet()) {
      initShim.traceCappedDatabaseSizeMb(builder.traceCappedDatabaseSizeMb);
    }
    this.rollupExpirationHours = initShim.rollupExpirationHours();
    this.traceExpirationHours = initShim.traceExpirationHours();
    this.fullQueryTextExpirationHours = initShim.fullQueryTextExpirationHours();
    this.rollupCappedDatabaseSizesMb = initShim.rollupCappedDatabaseSizesMb();
    this.traceCappedDatabaseSizeMb = initShim.traceCappedDatabaseSizeMb();
    this.version = initShim.version();
    this.initShim = null;
  }

  private ImmutableEmbeddedStorageConfig(
      ImmutableList<Integer> rollupExpirationHours,
      int traceExpirationHours,
      int fullQueryTextExpirationHours,
      ImmutableList<Integer> rollupCappedDatabaseSizesMb,
      int traceCappedDatabaseSizeMb) {
    this.rollupExpirationHours = rollupExpirationHours;
    this.traceExpirationHours = traceExpirationHours;
    this.fullQueryTextExpirationHours = fullQueryTextExpirationHours;
    this.rollupCappedDatabaseSizesMb = rollupCappedDatabaseSizesMb;
    this.traceCappedDatabaseSizeMb = traceCappedDatabaseSizeMb;
    initShim.rollupExpirationHours(this.rollupExpirationHours);
    initShim.traceExpirationHours(this.traceExpirationHours);
    initShim.fullQueryTextExpirationHours(this.fullQueryTextExpirationHours);
    initShim.rollupCappedDatabaseSizesMb(this.rollupCappedDatabaseSizesMb);
    initShim.traceCappedDatabaseSizeMb(this.traceCappedDatabaseSizeMb);
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
        this.rollupExpirationHours = Preconditions.checkNotNull(ImmutableEmbeddedStorageConfig.super.rollupExpirationHours(), "rollupExpirationHours");
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
        this.traceExpirationHours = ImmutableEmbeddedStorageConfig.super.traceExpirationHours();
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
        this.fullQueryTextExpirationHours = ImmutableEmbeddedStorageConfig.super.fullQueryTextExpirationHours();
        fullQueryTextExpirationHoursBuildStage = STAGE_INITIALIZED;
      }
      return this.fullQueryTextExpirationHours;
    }

    void fullQueryTextExpirationHours(int fullQueryTextExpirationHours) {
      this.fullQueryTextExpirationHours = fullQueryTextExpirationHours;
      fullQueryTextExpirationHoursBuildStage = STAGE_INITIALIZED;
    }
    private ImmutableList<Integer> rollupCappedDatabaseSizesMb;
    private int rollupCappedDatabaseSizesMbBuildStage;

    ImmutableList<Integer> rollupCappedDatabaseSizesMb() {
      if (rollupCappedDatabaseSizesMbBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (rollupCappedDatabaseSizesMbBuildStage == STAGE_UNINITIALIZED) {
        rollupCappedDatabaseSizesMbBuildStage = STAGE_INITIALIZING;
        this.rollupCappedDatabaseSizesMb = Preconditions.checkNotNull(ImmutableEmbeddedStorageConfig.super.rollupCappedDatabaseSizesMb(), "rollupCappedDatabaseSizesMb");
        rollupCappedDatabaseSizesMbBuildStage = STAGE_INITIALIZED;
      }
      return this.rollupCappedDatabaseSizesMb;
    }

    void rollupCappedDatabaseSizesMb(ImmutableList<Integer> rollupCappedDatabaseSizesMb) {
      this.rollupCappedDatabaseSizesMb = rollupCappedDatabaseSizesMb;
      rollupCappedDatabaseSizesMbBuildStage = STAGE_INITIALIZED;
    }
    private int traceCappedDatabaseSizeMb;
    private int traceCappedDatabaseSizeMbBuildStage;

    int traceCappedDatabaseSizeMb() {
      if (traceCappedDatabaseSizeMbBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (traceCappedDatabaseSizeMbBuildStage == STAGE_UNINITIALIZED) {
        traceCappedDatabaseSizeMbBuildStage = STAGE_INITIALIZING;
        this.traceCappedDatabaseSizeMb = ImmutableEmbeddedStorageConfig.super.traceCappedDatabaseSizeMb();
        traceCappedDatabaseSizeMbBuildStage = STAGE_INITIALIZED;
      }
      return this.traceCappedDatabaseSizeMb;
    }

    void traceCappedDatabaseSizeMb(int traceCappedDatabaseSizeMb) {
      this.traceCappedDatabaseSizeMb = traceCappedDatabaseSizeMb;
      traceCappedDatabaseSizeMbBuildStage = STAGE_INITIALIZED;
    }
    private String version;
    private int versionBuildStage;

    String version() {
      if (versionBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (versionBuildStage == STAGE_UNINITIALIZED) {
        versionBuildStage = STAGE_INITIALIZING;
        this.version = Preconditions.checkNotNull(ImmutableEmbeddedStorageConfig.super.version(), "version");
        versionBuildStage = STAGE_INITIALIZED;
      }
      return this.version;
    }

    private String formatInitCycleMessage() {
      ArrayList<String> attributes = Lists.newArrayList();
      if (rollupExpirationHoursBuildStage == STAGE_INITIALIZING) attributes.add("rollupExpirationHours");
      if (traceExpirationHoursBuildStage == STAGE_INITIALIZING) attributes.add("traceExpirationHours");
      if (fullQueryTextExpirationHoursBuildStage == STAGE_INITIALIZING) attributes.add("fullQueryTextExpirationHours");
      if (rollupCappedDatabaseSizesMbBuildStage == STAGE_INITIALIZING) attributes.add("rollupCappedDatabaseSizesMb");
      if (traceCappedDatabaseSizeMbBuildStage == STAGE_INITIALIZING) attributes.add("traceCappedDatabaseSizeMb");
      if (versionBuildStage == STAGE_INITIALIZING) attributes.add("version");
      return "Cannot build EmbeddedStorageConfig, attribute initializers form cycle" + attributes;
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
   * @return The value of the {@code rollupCappedDatabaseSizesMb} attribute
   */
  @JsonProperty("rollupCappedDatabaseSizesMb")
  @Override
  public ImmutableList<Integer> rollupCappedDatabaseSizesMb() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.rollupCappedDatabaseSizesMb()
        : this.rollupCappedDatabaseSizesMb;
  }

  /**
   * @return The value of the {@code traceCappedDatabaseSizeMb} attribute
   */
  @JsonProperty("traceCappedDatabaseSizeMb")
  @Override
  public int traceCappedDatabaseSizeMb() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.traceCappedDatabaseSizeMb()
        : this.traceCappedDatabaseSizeMb;
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
   * Copy the current immutable object with elements that replace the content of {@link EmbeddedStorageConfig#rollupExpirationHours() rollupExpirationHours}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEmbeddedStorageConfig withRollupExpirationHours(int... elements) {
    ImmutableList<Integer> newValue = ImmutableList.copyOf(Ints.asList(elements));
    return new ImmutableEmbeddedStorageConfig(
        newValue,
        this.traceExpirationHours,
        this.fullQueryTextExpirationHours,
        this.rollupCappedDatabaseSizesMb,
        this.traceCappedDatabaseSizeMb);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link EmbeddedStorageConfig#rollupExpirationHours() rollupExpirationHours}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of rollupExpirationHours elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEmbeddedStorageConfig withRollupExpirationHours(Iterable<Integer> elements) {
    if (this.rollupExpirationHours == elements) return this;
    ImmutableList<Integer> newValue = ImmutableList.copyOf(elements);
    return new ImmutableEmbeddedStorageConfig(
        newValue,
        this.traceExpirationHours,
        this.fullQueryTextExpirationHours,
        this.rollupCappedDatabaseSizesMb,
        this.traceCappedDatabaseSizeMb);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EmbeddedStorageConfig#traceExpirationHours() traceExpirationHours} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for traceExpirationHours
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEmbeddedStorageConfig withTraceExpirationHours(int value) {
    if (this.traceExpirationHours == value) return this;
    return new ImmutableEmbeddedStorageConfig(
        this.rollupExpirationHours,
        value,
        this.fullQueryTextExpirationHours,
        this.rollupCappedDatabaseSizesMb,
        this.traceCappedDatabaseSizeMb);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EmbeddedStorageConfig#fullQueryTextExpirationHours() fullQueryTextExpirationHours} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for fullQueryTextExpirationHours
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEmbeddedStorageConfig withFullQueryTextExpirationHours(int value) {
    if (this.fullQueryTextExpirationHours == value) return this;
    return new ImmutableEmbeddedStorageConfig(
        this.rollupExpirationHours,
        this.traceExpirationHours,
        value,
        this.rollupCappedDatabaseSizesMb,
        this.traceCappedDatabaseSizeMb);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link EmbeddedStorageConfig#rollupCappedDatabaseSizesMb() rollupCappedDatabaseSizesMb}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEmbeddedStorageConfig withRollupCappedDatabaseSizesMb(int... elements) {
    ImmutableList<Integer> newValue = ImmutableList.copyOf(Ints.asList(elements));
    return new ImmutableEmbeddedStorageConfig(
        this.rollupExpirationHours,
        this.traceExpirationHours,
        this.fullQueryTextExpirationHours,
        newValue,
        this.traceCappedDatabaseSizeMb);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link EmbeddedStorageConfig#rollupCappedDatabaseSizesMb() rollupCappedDatabaseSizesMb}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of rollupCappedDatabaseSizesMb elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEmbeddedStorageConfig withRollupCappedDatabaseSizesMb(Iterable<Integer> elements) {
    if (this.rollupCappedDatabaseSizesMb == elements) return this;
    ImmutableList<Integer> newValue = ImmutableList.copyOf(elements);
    return new ImmutableEmbeddedStorageConfig(
        this.rollupExpirationHours,
        this.traceExpirationHours,
        this.fullQueryTextExpirationHours,
        newValue,
        this.traceCappedDatabaseSizeMb);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EmbeddedStorageConfig#traceCappedDatabaseSizeMb() traceCappedDatabaseSizeMb} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for traceCappedDatabaseSizeMb
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEmbeddedStorageConfig withTraceCappedDatabaseSizeMb(int value) {
    if (this.traceCappedDatabaseSizeMb == value) return this;
    return new ImmutableEmbeddedStorageConfig(
        this.rollupExpirationHours,
        this.traceExpirationHours,
        this.fullQueryTextExpirationHours,
        this.rollupCappedDatabaseSizesMb,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableEmbeddedStorageConfig} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableEmbeddedStorageConfig
        && equalTo((ImmutableEmbeddedStorageConfig) another);
  }

  private boolean equalTo(ImmutableEmbeddedStorageConfig another) {
    return rollupExpirationHours.equals(another.rollupExpirationHours)
        && traceExpirationHours == another.traceExpirationHours
        && fullQueryTextExpirationHours == another.fullQueryTextExpirationHours
        && rollupCappedDatabaseSizesMb.equals(another.rollupCappedDatabaseSizesMb)
        && traceCappedDatabaseSizeMb == another.traceCappedDatabaseSizeMb
        && version.equals(another.version);
  }

  /**
   * Computes a hash code from attributes: {@code rollupExpirationHours}, {@code traceExpirationHours}, {@code fullQueryTextExpirationHours}, {@code rollupCappedDatabaseSizesMb}, {@code traceCappedDatabaseSizeMb}, {@code version}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + rollupExpirationHours.hashCode();
    h += (h << 5) + traceExpirationHours;
    h += (h << 5) + fullQueryTextExpirationHours;
    h += (h << 5) + rollupCappedDatabaseSizesMb.hashCode();
    h += (h << 5) + traceCappedDatabaseSizeMb;
    h += (h << 5) + version.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code EmbeddedStorageConfig} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("EmbeddedStorageConfig")
        .omitNullValues()
        .add("rollupExpirationHours", rollupExpirationHours)
        .add("traceExpirationHours", traceExpirationHours)
        .add("fullQueryTextExpirationHours", fullQueryTextExpirationHours)
        .add("rollupCappedDatabaseSizesMb", rollupCappedDatabaseSizesMb)
        .add("traceCappedDatabaseSizeMb", traceCappedDatabaseSizeMb)
        .add("version", version)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends EmbeddedStorageConfig {
    ImmutableList<Integer> rollupExpirationHours = ImmutableList.of();
    boolean rollupExpirationHoursIsSet;
    int traceExpirationHours;
    boolean traceExpirationHoursIsSet;
    int fullQueryTextExpirationHours;
    boolean fullQueryTextExpirationHoursIsSet;
    ImmutableList<Integer> rollupCappedDatabaseSizesMb = ImmutableList.of();
    boolean rollupCappedDatabaseSizesMbIsSet;
    int traceCappedDatabaseSizeMb;
    boolean traceCappedDatabaseSizeMbIsSet;
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
    @JsonProperty("rollupCappedDatabaseSizesMb")
    public void setRollupCappedDatabaseSizesMb(ImmutableList<Integer> rollupCappedDatabaseSizesMb) {
      this.rollupCappedDatabaseSizesMb = rollupCappedDatabaseSizesMb;
      this.rollupCappedDatabaseSizesMbIsSet = true;
    }
    @JsonProperty("traceCappedDatabaseSizeMb")
    public void setTraceCappedDatabaseSizeMb(int traceCappedDatabaseSizeMb) {
      this.traceCappedDatabaseSizeMb = traceCappedDatabaseSizeMb;
      this.traceCappedDatabaseSizeMbIsSet = true;
    }
    @Override
    public ImmutableList<Integer> rollupExpirationHours() { throw new UnsupportedOperationException(); }
    @Override
    public int traceExpirationHours() { throw new UnsupportedOperationException(); }
    @Override
    public int fullQueryTextExpirationHours() { throw new UnsupportedOperationException(); }
    @Override
    public ImmutableList<Integer> rollupCappedDatabaseSizesMb() { throw new UnsupportedOperationException(); }
    @Override
    public int traceCappedDatabaseSizeMb() { throw new UnsupportedOperationException(); }
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
  static ImmutableEmbeddedStorageConfig fromJson(Json json) {
    ImmutableEmbeddedStorageConfig.Builder builder = ImmutableEmbeddedStorageConfig.builder();
    if (json.rollupExpirationHoursIsSet) {
      builder.rollupExpirationHours(json.rollupExpirationHours);
    }
    if (json.traceExpirationHoursIsSet) {
      builder.traceExpirationHours(json.traceExpirationHours);
    }
    if (json.fullQueryTextExpirationHoursIsSet) {
      builder.fullQueryTextExpirationHours(json.fullQueryTextExpirationHours);
    }
    if (json.rollupCappedDatabaseSizesMbIsSet) {
      builder.rollupCappedDatabaseSizesMb(json.rollupCappedDatabaseSizesMb);
    }
    if (json.traceCappedDatabaseSizeMbIsSet) {
      builder.traceCappedDatabaseSizeMb(json.traceCappedDatabaseSizeMb);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link EmbeddedStorageConfig} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable EmbeddedStorageConfig instance
   */
  public static ImmutableEmbeddedStorageConfig copyOf(EmbeddedStorageConfig instance) {
    if (instance instanceof ImmutableEmbeddedStorageConfig) {
      return (ImmutableEmbeddedStorageConfig) instance;
    }
    return ImmutableEmbeddedStorageConfig.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableEmbeddedStorageConfig ImmutableEmbeddedStorageConfig}.
   * @return A new ImmutableEmbeddedStorageConfig builder
   */
  public static ImmutableEmbeddedStorageConfig.Builder builder() {
    return new ImmutableEmbeddedStorageConfig.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableEmbeddedStorageConfig ImmutableEmbeddedStorageConfig}.
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
    private static final long OPT_BIT_ROLLUP_CAPPED_DATABASE_SIZES_MB = 0x8L;
    private static final long OPT_BIT_TRACE_CAPPED_DATABASE_SIZE_MB = 0x10L;
    private long optBits;

    private ImmutableList.Builder<Integer> rollupExpirationHours = ImmutableList.builder();
    private int traceExpirationHours;
    private int fullQueryTextExpirationHours;
    private ImmutableList.Builder<Integer> rollupCappedDatabaseSizesMb = ImmutableList.builder();
    private int traceCappedDatabaseSizeMb;

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
     * Fill a builder with attribute values from the provided {@code org.glowroot.agent.shaded.glowroot.common.config.EmbeddedStorageConfig} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(EmbeddedStorageConfig instance) {
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
      if (object instanceof EmbeddedStorageConfig) {
        EmbeddedStorageConfig instance = (EmbeddedStorageConfig) object;
        if ((bits & 0x2L) == 0) {
          addAllRollupExpirationHours(instance.rollupExpirationHours());
          bits |= 0x2L;
        }
        if ((bits & 0x4L) == 0) {
          fullQueryTextExpirationHours(instance.fullQueryTextExpirationHours());
          bits |= 0x4L;
        }
        addAllRollupCappedDatabaseSizesMb(instance.rollupCappedDatabaseSizesMb());
        traceCappedDatabaseSizeMb(instance.traceCappedDatabaseSizeMb());
        if ((bits & 0x1L) == 0) {
          traceExpirationHours(instance.traceExpirationHours());
          bits |= 0x1L;
        }
      }
    }

    /**
     * Adds one element to {@link EmbeddedStorageConfig#rollupExpirationHours() rollupExpirationHours} list.
     * @param element A rollupExpirationHours element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addRollupExpirationHours(int element) {
      this.rollupExpirationHours.add(element);
      optBits |= OPT_BIT_ROLLUP_EXPIRATION_HOURS;
      return this;
    }

    /**
     * Adds elements to {@link EmbeddedStorageConfig#rollupExpirationHours() rollupExpirationHours} list.
     * @param elements An array of rollupExpirationHours elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addRollupExpirationHours(int... elements) {
      this.rollupExpirationHours.addAll(Ints.asList(elements));
      optBits |= OPT_BIT_ROLLUP_EXPIRATION_HOURS;
      return this;
    }

    /**
     * Sets or replaces all elements for {@link EmbeddedStorageConfig#rollupExpirationHours() rollupExpirationHours} list.
     * @param elements An iterable of rollupExpirationHours elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder rollupExpirationHours(Iterable<Integer> elements) {
      this.rollupExpirationHours = ImmutableList.builder();
      return addAllRollupExpirationHours(elements);
    }

    /**
     * Adds elements to {@link EmbeddedStorageConfig#rollupExpirationHours() rollupExpirationHours} list.
     * @param elements An iterable of rollupExpirationHours elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllRollupExpirationHours(Iterable<Integer> elements) {
      this.rollupExpirationHours.addAll(elements);
      optBits |= OPT_BIT_ROLLUP_EXPIRATION_HOURS;
      return this;
    }

    /**
     * Initializes the value for the {@link EmbeddedStorageConfig#traceExpirationHours() traceExpirationHours} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link EmbeddedStorageConfig#traceExpirationHours() traceExpirationHours}.</em>
     * @param traceExpirationHours The value for traceExpirationHours 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder traceExpirationHours(int traceExpirationHours) {
      this.traceExpirationHours = traceExpirationHours;
      optBits |= OPT_BIT_TRACE_EXPIRATION_HOURS;
      return this;
    }

    /**
     * Initializes the value for the {@link EmbeddedStorageConfig#fullQueryTextExpirationHours() fullQueryTextExpirationHours} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link EmbeddedStorageConfig#fullQueryTextExpirationHours() fullQueryTextExpirationHours}.</em>
     * @param fullQueryTextExpirationHours The value for fullQueryTextExpirationHours 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder fullQueryTextExpirationHours(int fullQueryTextExpirationHours) {
      this.fullQueryTextExpirationHours = fullQueryTextExpirationHours;
      optBits |= OPT_BIT_FULL_QUERY_TEXT_EXPIRATION_HOURS;
      return this;
    }

    /**
     * Adds one element to {@link EmbeddedStorageConfig#rollupCappedDatabaseSizesMb() rollupCappedDatabaseSizesMb} list.
     * @param element A rollupCappedDatabaseSizesMb element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addRollupCappedDatabaseSizesMb(int element) {
      this.rollupCappedDatabaseSizesMb.add(element);
      optBits |= OPT_BIT_ROLLUP_CAPPED_DATABASE_SIZES_MB;
      return this;
    }

    /**
     * Adds elements to {@link EmbeddedStorageConfig#rollupCappedDatabaseSizesMb() rollupCappedDatabaseSizesMb} list.
     * @param elements An array of rollupCappedDatabaseSizesMb elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addRollupCappedDatabaseSizesMb(int... elements) {
      this.rollupCappedDatabaseSizesMb.addAll(Ints.asList(elements));
      optBits |= OPT_BIT_ROLLUP_CAPPED_DATABASE_SIZES_MB;
      return this;
    }

    /**
     * Sets or replaces all elements for {@link EmbeddedStorageConfig#rollupCappedDatabaseSizesMb() rollupCappedDatabaseSizesMb} list.
     * @param elements An iterable of rollupCappedDatabaseSizesMb elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder rollupCappedDatabaseSizesMb(Iterable<Integer> elements) {
      this.rollupCappedDatabaseSizesMb = ImmutableList.builder();
      return addAllRollupCappedDatabaseSizesMb(elements);
    }

    /**
     * Adds elements to {@link EmbeddedStorageConfig#rollupCappedDatabaseSizesMb() rollupCappedDatabaseSizesMb} list.
     * @param elements An iterable of rollupCappedDatabaseSizesMb elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllRollupCappedDatabaseSizesMb(Iterable<Integer> elements) {
      this.rollupCappedDatabaseSizesMb.addAll(elements);
      optBits |= OPT_BIT_ROLLUP_CAPPED_DATABASE_SIZES_MB;
      return this;
    }

    /**
     * Initializes the value for the {@link EmbeddedStorageConfig#traceCappedDatabaseSizeMb() traceCappedDatabaseSizeMb} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link EmbeddedStorageConfig#traceCappedDatabaseSizeMb() traceCappedDatabaseSizeMb}.</em>
     * @param traceCappedDatabaseSizeMb The value for traceCappedDatabaseSizeMb 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder traceCappedDatabaseSizeMb(int traceCappedDatabaseSizeMb) {
      this.traceCappedDatabaseSizeMb = traceCappedDatabaseSizeMb;
      optBits |= OPT_BIT_TRACE_CAPPED_DATABASE_SIZE_MB;
      return this;
    }

    /**
     * Builds a new {@link ImmutableEmbeddedStorageConfig ImmutableEmbeddedStorageConfig}.
     * @return An immutable instance of EmbeddedStorageConfig
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableEmbeddedStorageConfig build() {
      return new ImmutableEmbeddedStorageConfig(this);
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

    private boolean rollupCappedDatabaseSizesMbIsSet() {
      return (optBits & OPT_BIT_ROLLUP_CAPPED_DATABASE_SIZES_MB) != 0;
    }

    private boolean traceCappedDatabaseSizeMbIsSet() {
      return (optBits & OPT_BIT_TRACE_CAPPED_DATABASE_SIZE_MB) != 0;
    }
  }
}
