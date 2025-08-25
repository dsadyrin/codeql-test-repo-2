package org.glowroot.agent.shaded.glowroot.ui;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
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
 * Immutable implementation of {@link LayoutService.JvmPermissions}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableJvmPermissions.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "LayoutService.JvmPermissions"})
@Immutable
final class ImmutableJvmPermissions extends LayoutService.JvmPermissions {
  private final boolean gauges;
  private final boolean threadDump;
  private final boolean heapDump;
  private final boolean heapHistogram;
  private final boolean gc;
  private final boolean mbeanTree;
  private final boolean systemProperties;
  private final boolean environment;
  private final boolean capabilities;

  private ImmutableJvmPermissions(
      boolean gauges,
      boolean threadDump,
      boolean heapDump,
      boolean heapHistogram,
      boolean gc,
      boolean mbeanTree,
      boolean systemProperties,
      boolean environment,
      boolean capabilities) {
    this.gauges = gauges;
    this.threadDump = threadDump;
    this.heapDump = heapDump;
    this.heapHistogram = heapHistogram;
    this.gc = gc;
    this.mbeanTree = mbeanTree;
    this.systemProperties = systemProperties;
    this.environment = environment;
    this.capabilities = capabilities;
  }

  /**
   * @return The value of the {@code gauges} attribute
   */
  @JsonProperty("gauges")
  @Override
  boolean gauges() {
    return gauges;
  }

  /**
   * @return The value of the {@code threadDump} attribute
   */
  @JsonProperty("threadDump")
  @Override
  boolean threadDump() {
    return threadDump;
  }

  /**
   * @return The value of the {@code heapDump} attribute
   */
  @JsonProperty("heapDump")
  @Override
  boolean heapDump() {
    return heapDump;
  }

  /**
   * @return The value of the {@code heapHistogram} attribute
   */
  @JsonProperty("heapHistogram")
  @Override
  boolean heapHistogram() {
    return heapHistogram;
  }

  /**
   * @return The value of the {@code gc} attribute
   */
  @JsonProperty("gc")
  @Override
  boolean gc() {
    return gc;
  }

  /**
   * @return The value of the {@code mbeanTree} attribute
   */
  @JsonProperty("mbeanTree")
  @Override
  boolean mbeanTree() {
    return mbeanTree;
  }

  /**
   * @return The value of the {@code systemProperties} attribute
   */
  @JsonProperty("systemProperties")
  @Override
  boolean systemProperties() {
    return systemProperties;
  }

  /**
   * @return The value of the {@code environment} attribute
   */
  @JsonProperty("environment")
  @Override
  boolean environment() {
    return environment;
  }

  /**
   * @return The value of the {@code capabilities} attribute
   */
  @JsonProperty("capabilities")
  @Override
  boolean capabilities() {
    return capabilities;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LayoutService.JvmPermissions#gauges() gauges} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for gauges
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableJvmPermissions withGauges(boolean value) {
    if (this.gauges == value) return this;
    return new ImmutableJvmPermissions(
        value,
        this.threadDump,
        this.heapDump,
        this.heapHistogram,
        this.gc,
        this.mbeanTree,
        this.systemProperties,
        this.environment,
        this.capabilities);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LayoutService.JvmPermissions#threadDump() threadDump} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for threadDump
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableJvmPermissions withThreadDump(boolean value) {
    if (this.threadDump == value) return this;
    return new ImmutableJvmPermissions(
        this.gauges,
        value,
        this.heapDump,
        this.heapHistogram,
        this.gc,
        this.mbeanTree,
        this.systemProperties,
        this.environment,
        this.capabilities);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LayoutService.JvmPermissions#heapDump() heapDump} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for heapDump
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableJvmPermissions withHeapDump(boolean value) {
    if (this.heapDump == value) return this;
    return new ImmutableJvmPermissions(
        this.gauges,
        this.threadDump,
        value,
        this.heapHistogram,
        this.gc,
        this.mbeanTree,
        this.systemProperties,
        this.environment,
        this.capabilities);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LayoutService.JvmPermissions#heapHistogram() heapHistogram} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for heapHistogram
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableJvmPermissions withHeapHistogram(boolean value) {
    if (this.heapHistogram == value) return this;
    return new ImmutableJvmPermissions(
        this.gauges,
        this.threadDump,
        this.heapDump,
        value,
        this.gc,
        this.mbeanTree,
        this.systemProperties,
        this.environment,
        this.capabilities);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LayoutService.JvmPermissions#gc() gc} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for gc
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableJvmPermissions withGc(boolean value) {
    if (this.gc == value) return this;
    return new ImmutableJvmPermissions(
        this.gauges,
        this.threadDump,
        this.heapDump,
        this.heapHistogram,
        value,
        this.mbeanTree,
        this.systemProperties,
        this.environment,
        this.capabilities);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LayoutService.JvmPermissions#mbeanTree() mbeanTree} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for mbeanTree
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableJvmPermissions withMbeanTree(boolean value) {
    if (this.mbeanTree == value) return this;
    return new ImmutableJvmPermissions(
        this.gauges,
        this.threadDump,
        this.heapDump,
        this.heapHistogram,
        this.gc,
        value,
        this.systemProperties,
        this.environment,
        this.capabilities);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LayoutService.JvmPermissions#systemProperties() systemProperties} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for systemProperties
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableJvmPermissions withSystemProperties(boolean value) {
    if (this.systemProperties == value) return this;
    return new ImmutableJvmPermissions(
        this.gauges,
        this.threadDump,
        this.heapDump,
        this.heapHistogram,
        this.gc,
        this.mbeanTree,
        value,
        this.environment,
        this.capabilities);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LayoutService.JvmPermissions#environment() environment} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for environment
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableJvmPermissions withEnvironment(boolean value) {
    if (this.environment == value) return this;
    return new ImmutableJvmPermissions(
        this.gauges,
        this.threadDump,
        this.heapDump,
        this.heapHistogram,
        this.gc,
        this.mbeanTree,
        this.systemProperties,
        value,
        this.capabilities);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LayoutService.JvmPermissions#capabilities() capabilities} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for capabilities
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableJvmPermissions withCapabilities(boolean value) {
    if (this.capabilities == value) return this;
    return new ImmutableJvmPermissions(
        this.gauges,
        this.threadDump,
        this.heapDump,
        this.heapHistogram,
        this.gc,
        this.mbeanTree,
        this.systemProperties,
        this.environment,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableJvmPermissions} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableJvmPermissions
        && equalTo((ImmutableJvmPermissions) another);
  }

  private boolean equalTo(ImmutableJvmPermissions another) {
    return gauges == another.gauges
        && threadDump == another.threadDump
        && heapDump == another.heapDump
        && heapHistogram == another.heapHistogram
        && gc == another.gc
        && mbeanTree == another.mbeanTree
        && systemProperties == another.systemProperties
        && environment == another.environment
        && capabilities == another.capabilities;
  }

  /**
   * Computes a hash code from attributes: {@code gauges}, {@code threadDump}, {@code heapDump}, {@code heapHistogram}, {@code gc}, {@code mbeanTree}, {@code systemProperties}, {@code environment}, {@code capabilities}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Booleans.hashCode(gauges);
    h += (h << 5) + Booleans.hashCode(threadDump);
    h += (h << 5) + Booleans.hashCode(heapDump);
    h += (h << 5) + Booleans.hashCode(heapHistogram);
    h += (h << 5) + Booleans.hashCode(gc);
    h += (h << 5) + Booleans.hashCode(mbeanTree);
    h += (h << 5) + Booleans.hashCode(systemProperties);
    h += (h << 5) + Booleans.hashCode(environment);
    h += (h << 5) + Booleans.hashCode(capabilities);
    return h;
  }

  /**
   * Prints the immutable value {@code JvmPermissions} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("JvmPermissions")
        .omitNullValues()
        .add("gauges", gauges)
        .add("threadDump", threadDump)
        .add("heapDump", heapDump)
        .add("heapHistogram", heapHistogram)
        .add("gc", gc)
        .add("mbeanTree", mbeanTree)
        .add("systemProperties", systemProperties)
        .add("environment", environment)
        .add("capabilities", capabilities)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends LayoutService.JvmPermissions {
    boolean gauges;
    boolean gaugesIsSet;
    boolean threadDump;
    boolean threadDumpIsSet;
    boolean heapDump;
    boolean heapDumpIsSet;
    boolean heapHistogram;
    boolean heapHistogramIsSet;
    boolean gc;
    boolean gcIsSet;
    boolean mbeanTree;
    boolean mbeanTreeIsSet;
    boolean systemProperties;
    boolean systemPropertiesIsSet;
    boolean environment;
    boolean environmentIsSet;
    boolean capabilities;
    boolean capabilitiesIsSet;
    @JsonProperty("gauges")
    public void setGauges(boolean gauges) {
      this.gauges = gauges;
      this.gaugesIsSet = true;
    }
    @JsonProperty("threadDump")
    public void setThreadDump(boolean threadDump) {
      this.threadDump = threadDump;
      this.threadDumpIsSet = true;
    }
    @JsonProperty("heapDump")
    public void setHeapDump(boolean heapDump) {
      this.heapDump = heapDump;
      this.heapDumpIsSet = true;
    }
    @JsonProperty("heapHistogram")
    public void setHeapHistogram(boolean heapHistogram) {
      this.heapHistogram = heapHistogram;
      this.heapHistogramIsSet = true;
    }
    @JsonProperty("gc")
    public void setGc(boolean gc) {
      this.gc = gc;
      this.gcIsSet = true;
    }
    @JsonProperty("mbeanTree")
    public void setMbeanTree(boolean mbeanTree) {
      this.mbeanTree = mbeanTree;
      this.mbeanTreeIsSet = true;
    }
    @JsonProperty("systemProperties")
    public void setSystemProperties(boolean systemProperties) {
      this.systemProperties = systemProperties;
      this.systemPropertiesIsSet = true;
    }
    @JsonProperty("environment")
    public void setEnvironment(boolean environment) {
      this.environment = environment;
      this.environmentIsSet = true;
    }
    @JsonProperty("capabilities")
    public void setCapabilities(boolean capabilities) {
      this.capabilities = capabilities;
      this.capabilitiesIsSet = true;
    }
    @Override
    boolean gauges() { throw new UnsupportedOperationException(); }
    @Override
    boolean threadDump() { throw new UnsupportedOperationException(); }
    @Override
    boolean heapDump() { throw new UnsupportedOperationException(); }
    @Override
    boolean heapHistogram() { throw new UnsupportedOperationException(); }
    @Override
    boolean gc() { throw new UnsupportedOperationException(); }
    @Override
    boolean mbeanTree() { throw new UnsupportedOperationException(); }
    @Override
    boolean systemProperties() { throw new UnsupportedOperationException(); }
    @Override
    boolean environment() { throw new UnsupportedOperationException(); }
    @Override
    boolean capabilities() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableJvmPermissions fromJson(Json json) {
    ImmutableJvmPermissions.Builder builder = ImmutableJvmPermissions.builder();
    if (json.gaugesIsSet) {
      builder.gauges(json.gauges);
    }
    if (json.threadDumpIsSet) {
      builder.threadDump(json.threadDump);
    }
    if (json.heapDumpIsSet) {
      builder.heapDump(json.heapDump);
    }
    if (json.heapHistogramIsSet) {
      builder.heapHistogram(json.heapHistogram);
    }
    if (json.gcIsSet) {
      builder.gc(json.gc);
    }
    if (json.mbeanTreeIsSet) {
      builder.mbeanTree(json.mbeanTree);
    }
    if (json.systemPropertiesIsSet) {
      builder.systemProperties(json.systemProperties);
    }
    if (json.environmentIsSet) {
      builder.environment(json.environment);
    }
    if (json.capabilitiesIsSet) {
      builder.capabilities(json.capabilities);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link LayoutService.JvmPermissions} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable JvmPermissions instance
   */
  public static ImmutableJvmPermissions copyOf(LayoutService.JvmPermissions instance) {
    if (instance instanceof ImmutableJvmPermissions) {
      return (ImmutableJvmPermissions) instance;
    }
    return ImmutableJvmPermissions.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableJvmPermissions ImmutableJvmPermissions}.
   * @return A new ImmutableJvmPermissions builder
   */
  public static ImmutableJvmPermissions.Builder builder() {
    return new ImmutableJvmPermissions.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableJvmPermissions ImmutableJvmPermissions}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_GAUGES = 0x1L;
    private static final long INIT_BIT_THREAD_DUMP = 0x2L;
    private static final long INIT_BIT_HEAP_DUMP = 0x4L;
    private static final long INIT_BIT_HEAP_HISTOGRAM = 0x8L;
    private static final long INIT_BIT_GC = 0x10L;
    private static final long INIT_BIT_MBEAN_TREE = 0x20L;
    private static final long INIT_BIT_SYSTEM_PROPERTIES = 0x40L;
    private static final long INIT_BIT_ENVIRONMENT = 0x80L;
    private static final long INIT_BIT_CAPABILITIES = 0x100L;
    private long initBits = 0x1ffL;

    private boolean gauges;
    private boolean threadDump;
    private boolean heapDump;
    private boolean heapHistogram;
    private boolean gc;
    private boolean mbeanTree;
    private boolean systemProperties;
    private boolean environment;
    private boolean capabilities;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code JvmPermissions} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(LayoutService.JvmPermissions instance) {
      Preconditions.checkNotNull(instance, "instance");
      gauges(instance.gauges());
      threadDump(instance.threadDump());
      heapDump(instance.heapDump());
      heapHistogram(instance.heapHistogram());
      gc(instance.gc());
      mbeanTree(instance.mbeanTree());
      systemProperties(instance.systemProperties());
      environment(instance.environment());
      capabilities(instance.capabilities());
      return this;
    }

    /**
     * Initializes the value for the {@link LayoutService.JvmPermissions#gauges() gauges} attribute.
     * @param gauges The value for gauges 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder gauges(boolean gauges) {
      this.gauges = gauges;
      initBits &= ~INIT_BIT_GAUGES;
      return this;
    }

    /**
     * Initializes the value for the {@link LayoutService.JvmPermissions#threadDump() threadDump} attribute.
     * @param threadDump The value for threadDump 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder threadDump(boolean threadDump) {
      this.threadDump = threadDump;
      initBits &= ~INIT_BIT_THREAD_DUMP;
      return this;
    }

    /**
     * Initializes the value for the {@link LayoutService.JvmPermissions#heapDump() heapDump} attribute.
     * @param heapDump The value for heapDump 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder heapDump(boolean heapDump) {
      this.heapDump = heapDump;
      initBits &= ~INIT_BIT_HEAP_DUMP;
      return this;
    }

    /**
     * Initializes the value for the {@link LayoutService.JvmPermissions#heapHistogram() heapHistogram} attribute.
     * @param heapHistogram The value for heapHistogram 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder heapHistogram(boolean heapHistogram) {
      this.heapHistogram = heapHistogram;
      initBits &= ~INIT_BIT_HEAP_HISTOGRAM;
      return this;
    }

    /**
     * Initializes the value for the {@link LayoutService.JvmPermissions#gc() gc} attribute.
     * @param gc The value for gc 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder gc(boolean gc) {
      this.gc = gc;
      initBits &= ~INIT_BIT_GC;
      return this;
    }

    /**
     * Initializes the value for the {@link LayoutService.JvmPermissions#mbeanTree() mbeanTree} attribute.
     * @param mbeanTree The value for mbeanTree 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder mbeanTree(boolean mbeanTree) {
      this.mbeanTree = mbeanTree;
      initBits &= ~INIT_BIT_MBEAN_TREE;
      return this;
    }

    /**
     * Initializes the value for the {@link LayoutService.JvmPermissions#systemProperties() systemProperties} attribute.
     * @param systemProperties The value for systemProperties 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder systemProperties(boolean systemProperties) {
      this.systemProperties = systemProperties;
      initBits &= ~INIT_BIT_SYSTEM_PROPERTIES;
      return this;
    }

    /**
     * Initializes the value for the {@link LayoutService.JvmPermissions#environment() environment} attribute.
     * @param environment The value for environment 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder environment(boolean environment) {
      this.environment = environment;
      initBits &= ~INIT_BIT_ENVIRONMENT;
      return this;
    }

    /**
     * Initializes the value for the {@link LayoutService.JvmPermissions#capabilities() capabilities} attribute.
     * @param capabilities The value for capabilities 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder capabilities(boolean capabilities) {
      this.capabilities = capabilities;
      initBits &= ~INIT_BIT_CAPABILITIES;
      return this;
    }

    /**
     * Builds a new {@link ImmutableJvmPermissions ImmutableJvmPermissions}.
     * @return An immutable instance of JvmPermissions
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableJvmPermissions build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableJvmPermissions(
          gauges,
          threadDump,
          heapDump,
          heapHistogram,
          gc,
          mbeanTree,
          systemProperties,
          environment,
          capabilities);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_GAUGES) != 0) attributes.add("gauges");
      if ((initBits & INIT_BIT_THREAD_DUMP) != 0) attributes.add("threadDump");
      if ((initBits & INIT_BIT_HEAP_DUMP) != 0) attributes.add("heapDump");
      if ((initBits & INIT_BIT_HEAP_HISTOGRAM) != 0) attributes.add("heapHistogram");
      if ((initBits & INIT_BIT_GC) != 0) attributes.add("gc");
      if ((initBits & INIT_BIT_MBEAN_TREE) != 0) attributes.add("mbeanTree");
      if ((initBits & INIT_BIT_SYSTEM_PROPERTIES) != 0) attributes.add("systemProperties");
      if ((initBits & INIT_BIT_ENVIRONMENT) != 0) attributes.add("environment");
      if ((initBits & INIT_BIT_CAPABILITIES) != 0) attributes.add("capabilities");
      return "Cannot build JvmPermissions, some of required attributes are not set " + attributes;
    }
  }
}
