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
 * Immutable implementation of {@link LayoutService.EditConfigPermissions}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableEditConfigPermissions.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "LayoutService.EditConfigPermissions"})
@Immutable
final class ImmutableEditConfigPermissions
    implements LayoutService.EditConfigPermissions {
  private final boolean transaction;
  private final boolean gauge;
  private final boolean syntheticMonitor;
  private final boolean alert;
  private final boolean ui;
  private final boolean plugin;
  private final boolean instrumentation;
  private final boolean userRecording;
  private final boolean advanced;

  private ImmutableEditConfigPermissions(
      boolean transaction,
      boolean gauge,
      boolean syntheticMonitor,
      boolean alert,
      boolean ui,
      boolean plugin,
      boolean instrumentation,
      boolean userRecording,
      boolean advanced) {
    this.transaction = transaction;
    this.gauge = gauge;
    this.syntheticMonitor = syntheticMonitor;
    this.alert = alert;
    this.ui = ui;
    this.plugin = plugin;
    this.instrumentation = instrumentation;
    this.userRecording = userRecording;
    this.advanced = advanced;
  }

  /**
   * @return The value of the {@code transaction} attribute
   */
  @JsonProperty("transaction")
  @Override
  public boolean transaction() {
    return transaction;
  }

  /**
   * @return The value of the {@code gauge} attribute
   */
  @JsonProperty("gauge")
  @Override
  public boolean gauge() {
    return gauge;
  }

  /**
   * @return The value of the {@code syntheticMonitor} attribute
   */
  @JsonProperty("syntheticMonitor")
  @Override
  public boolean syntheticMonitor() {
    return syntheticMonitor;
  }

  /**
   * @return The value of the {@code alert} attribute
   */
  @JsonProperty("alert")
  @Override
  public boolean alert() {
    return alert;
  }

  /**
   * @return The value of the {@code ui} attribute
   */
  @JsonProperty("ui")
  @Override
  public boolean ui() {
    return ui;
  }

  /**
   * @return The value of the {@code plugin} attribute
   */
  @JsonProperty("plugin")
  @Override
  public boolean plugin() {
    return plugin;
  }

  /**
   * @return The value of the {@code instrumentation} attribute
   */
  @JsonProperty("instrumentation")
  @Override
  public boolean instrumentation() {
    return instrumentation;
  }

  /**
   * @return The value of the {@code userRecording} attribute
   */
  @JsonProperty("userRecording")
  @Override
  public boolean userRecording() {
    return userRecording;
  }

  /**
   * @return The value of the {@code advanced} attribute
   */
  @JsonProperty("advanced")
  @Override
  public boolean advanced() {
    return advanced;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LayoutService.EditConfigPermissions#transaction() transaction} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for transaction
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEditConfigPermissions withTransaction(boolean value) {
    if (this.transaction == value) return this;
    return new ImmutableEditConfigPermissions(
        value,
        this.gauge,
        this.syntheticMonitor,
        this.alert,
        this.ui,
        this.plugin,
        this.instrumentation,
        this.userRecording,
        this.advanced);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LayoutService.EditConfigPermissions#gauge() gauge} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for gauge
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEditConfigPermissions withGauge(boolean value) {
    if (this.gauge == value) return this;
    return new ImmutableEditConfigPermissions(
        this.transaction,
        value,
        this.syntheticMonitor,
        this.alert,
        this.ui,
        this.plugin,
        this.instrumentation,
        this.userRecording,
        this.advanced);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LayoutService.EditConfigPermissions#syntheticMonitor() syntheticMonitor} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for syntheticMonitor
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEditConfigPermissions withSyntheticMonitor(boolean value) {
    if (this.syntheticMonitor == value) return this;
    return new ImmutableEditConfigPermissions(
        this.transaction,
        this.gauge,
        value,
        this.alert,
        this.ui,
        this.plugin,
        this.instrumentation,
        this.userRecording,
        this.advanced);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LayoutService.EditConfigPermissions#alert() alert} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for alert
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEditConfigPermissions withAlert(boolean value) {
    if (this.alert == value) return this;
    return new ImmutableEditConfigPermissions(
        this.transaction,
        this.gauge,
        this.syntheticMonitor,
        value,
        this.ui,
        this.plugin,
        this.instrumentation,
        this.userRecording,
        this.advanced);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LayoutService.EditConfigPermissions#ui() ui} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for ui
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEditConfigPermissions withUi(boolean value) {
    if (this.ui == value) return this;
    return new ImmutableEditConfigPermissions(
        this.transaction,
        this.gauge,
        this.syntheticMonitor,
        this.alert,
        value,
        this.plugin,
        this.instrumentation,
        this.userRecording,
        this.advanced);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LayoutService.EditConfigPermissions#plugin() plugin} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for plugin
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEditConfigPermissions withPlugin(boolean value) {
    if (this.plugin == value) return this;
    return new ImmutableEditConfigPermissions(
        this.transaction,
        this.gauge,
        this.syntheticMonitor,
        this.alert,
        this.ui,
        value,
        this.instrumentation,
        this.userRecording,
        this.advanced);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LayoutService.EditConfigPermissions#instrumentation() instrumentation} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for instrumentation
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEditConfigPermissions withInstrumentation(boolean value) {
    if (this.instrumentation == value) return this;
    return new ImmutableEditConfigPermissions(
        this.transaction,
        this.gauge,
        this.syntheticMonitor,
        this.alert,
        this.ui,
        this.plugin,
        value,
        this.userRecording,
        this.advanced);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LayoutService.EditConfigPermissions#userRecording() userRecording} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for userRecording
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEditConfigPermissions withUserRecording(boolean value) {
    if (this.userRecording == value) return this;
    return new ImmutableEditConfigPermissions(
        this.transaction,
        this.gauge,
        this.syntheticMonitor,
        this.alert,
        this.ui,
        this.plugin,
        this.instrumentation,
        value,
        this.advanced);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LayoutService.EditConfigPermissions#advanced() advanced} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for advanced
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEditConfigPermissions withAdvanced(boolean value) {
    if (this.advanced == value) return this;
    return new ImmutableEditConfigPermissions(
        this.transaction,
        this.gauge,
        this.syntheticMonitor,
        this.alert,
        this.ui,
        this.plugin,
        this.instrumentation,
        this.userRecording,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableEditConfigPermissions} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableEditConfigPermissions
        && equalTo((ImmutableEditConfigPermissions) another);
  }

  private boolean equalTo(ImmutableEditConfigPermissions another) {
    return transaction == another.transaction
        && gauge == another.gauge
        && syntheticMonitor == another.syntheticMonitor
        && alert == another.alert
        && ui == another.ui
        && plugin == another.plugin
        && instrumentation == another.instrumentation
        && userRecording == another.userRecording
        && advanced == another.advanced;
  }

  /**
   * Computes a hash code from attributes: {@code transaction}, {@code gauge}, {@code syntheticMonitor}, {@code alert}, {@code ui}, {@code plugin}, {@code instrumentation}, {@code userRecording}, {@code advanced}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Booleans.hashCode(transaction);
    h += (h << 5) + Booleans.hashCode(gauge);
    h += (h << 5) + Booleans.hashCode(syntheticMonitor);
    h += (h << 5) + Booleans.hashCode(alert);
    h += (h << 5) + Booleans.hashCode(ui);
    h += (h << 5) + Booleans.hashCode(plugin);
    h += (h << 5) + Booleans.hashCode(instrumentation);
    h += (h << 5) + Booleans.hashCode(userRecording);
    h += (h << 5) + Booleans.hashCode(advanced);
    return h;
  }

  /**
   * Prints the immutable value {@code EditConfigPermissions} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("EditConfigPermissions")
        .omitNullValues()
        .add("transaction", transaction)
        .add("gauge", gauge)
        .add("syntheticMonitor", syntheticMonitor)
        .add("alert", alert)
        .add("ui", ui)
        .add("plugin", plugin)
        .add("instrumentation", instrumentation)
        .add("userRecording", userRecording)
        .add("advanced", advanced)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements LayoutService.EditConfigPermissions {
    boolean transaction;
    boolean transactionIsSet;
    boolean gauge;
    boolean gaugeIsSet;
    boolean syntheticMonitor;
    boolean syntheticMonitorIsSet;
    boolean alert;
    boolean alertIsSet;
    boolean ui;
    boolean uiIsSet;
    boolean plugin;
    boolean pluginIsSet;
    boolean instrumentation;
    boolean instrumentationIsSet;
    boolean userRecording;
    boolean userRecordingIsSet;
    boolean advanced;
    boolean advancedIsSet;
    @JsonProperty("transaction")
    public void setTransaction(boolean transaction) {
      this.transaction = transaction;
      this.transactionIsSet = true;
    }
    @JsonProperty("gauge")
    public void setGauge(boolean gauge) {
      this.gauge = gauge;
      this.gaugeIsSet = true;
    }
    @JsonProperty("syntheticMonitor")
    public void setSyntheticMonitor(boolean syntheticMonitor) {
      this.syntheticMonitor = syntheticMonitor;
      this.syntheticMonitorIsSet = true;
    }
    @JsonProperty("alert")
    public void setAlert(boolean alert) {
      this.alert = alert;
      this.alertIsSet = true;
    }
    @JsonProperty("ui")
    public void setUi(boolean ui) {
      this.ui = ui;
      this.uiIsSet = true;
    }
    @JsonProperty("plugin")
    public void setPlugin(boolean plugin) {
      this.plugin = plugin;
      this.pluginIsSet = true;
    }
    @JsonProperty("instrumentation")
    public void setInstrumentation(boolean instrumentation) {
      this.instrumentation = instrumentation;
      this.instrumentationIsSet = true;
    }
    @JsonProperty("userRecording")
    public void setUserRecording(boolean userRecording) {
      this.userRecording = userRecording;
      this.userRecordingIsSet = true;
    }
    @JsonProperty("advanced")
    public void setAdvanced(boolean advanced) {
      this.advanced = advanced;
      this.advancedIsSet = true;
    }
    @Override
    public boolean transaction() { throw new UnsupportedOperationException(); }
    @Override
    public boolean gauge() { throw new UnsupportedOperationException(); }
    @Override
    public boolean syntheticMonitor() { throw new UnsupportedOperationException(); }
    @Override
    public boolean alert() { throw new UnsupportedOperationException(); }
    @Override
    public boolean ui() { throw new UnsupportedOperationException(); }
    @Override
    public boolean plugin() { throw new UnsupportedOperationException(); }
    @Override
    public boolean instrumentation() { throw new UnsupportedOperationException(); }
    @Override
    public boolean userRecording() { throw new UnsupportedOperationException(); }
    @Override
    public boolean advanced() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableEditConfigPermissions fromJson(Json json) {
    ImmutableEditConfigPermissions.Builder builder = ImmutableEditConfigPermissions.builder();
    if (json.transactionIsSet) {
      builder.transaction(json.transaction);
    }
    if (json.gaugeIsSet) {
      builder.gauge(json.gauge);
    }
    if (json.syntheticMonitorIsSet) {
      builder.syntheticMonitor(json.syntheticMonitor);
    }
    if (json.alertIsSet) {
      builder.alert(json.alert);
    }
    if (json.uiIsSet) {
      builder.ui(json.ui);
    }
    if (json.pluginIsSet) {
      builder.plugin(json.plugin);
    }
    if (json.instrumentationIsSet) {
      builder.instrumentation(json.instrumentation);
    }
    if (json.userRecordingIsSet) {
      builder.userRecording(json.userRecording);
    }
    if (json.advancedIsSet) {
      builder.advanced(json.advanced);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link LayoutService.EditConfigPermissions} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable EditConfigPermissions instance
   */
  public static ImmutableEditConfigPermissions copyOf(LayoutService.EditConfigPermissions instance) {
    if (instance instanceof ImmutableEditConfigPermissions) {
      return (ImmutableEditConfigPermissions) instance;
    }
    return ImmutableEditConfigPermissions.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableEditConfigPermissions ImmutableEditConfigPermissions}.
   * @return A new ImmutableEditConfigPermissions builder
   */
  public static ImmutableEditConfigPermissions.Builder builder() {
    return new ImmutableEditConfigPermissions.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableEditConfigPermissions ImmutableEditConfigPermissions}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_TRANSACTION = 0x1L;
    private static final long INIT_BIT_GAUGE = 0x2L;
    private static final long INIT_BIT_SYNTHETIC_MONITOR = 0x4L;
    private static final long INIT_BIT_ALERT = 0x8L;
    private static final long INIT_BIT_UI = 0x10L;
    private static final long INIT_BIT_PLUGIN = 0x20L;
    private static final long INIT_BIT_INSTRUMENTATION = 0x40L;
    private static final long INIT_BIT_USER_RECORDING = 0x80L;
    private static final long INIT_BIT_ADVANCED = 0x100L;
    private long initBits = 0x1ffL;

    private boolean transaction;
    private boolean gauge;
    private boolean syntheticMonitor;
    private boolean alert;
    private boolean ui;
    private boolean plugin;
    private boolean instrumentation;
    private boolean userRecording;
    private boolean advanced;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code EditConfigPermissions} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(LayoutService.EditConfigPermissions instance) {
      Preconditions.checkNotNull(instance, "instance");
      transaction(instance.transaction());
      gauge(instance.gauge());
      syntheticMonitor(instance.syntheticMonitor());
      alert(instance.alert());
      ui(instance.ui());
      plugin(instance.plugin());
      instrumentation(instance.instrumentation());
      userRecording(instance.userRecording());
      advanced(instance.advanced());
      return this;
    }

    /**
     * Initializes the value for the {@link LayoutService.EditConfigPermissions#transaction() transaction} attribute.
     * @param transaction The value for transaction 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder transaction(boolean transaction) {
      this.transaction = transaction;
      initBits &= ~INIT_BIT_TRANSACTION;
      return this;
    }

    /**
     * Initializes the value for the {@link LayoutService.EditConfigPermissions#gauge() gauge} attribute.
     * @param gauge The value for gauge 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder gauge(boolean gauge) {
      this.gauge = gauge;
      initBits &= ~INIT_BIT_GAUGE;
      return this;
    }

    /**
     * Initializes the value for the {@link LayoutService.EditConfigPermissions#syntheticMonitor() syntheticMonitor} attribute.
     * @param syntheticMonitor The value for syntheticMonitor 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder syntheticMonitor(boolean syntheticMonitor) {
      this.syntheticMonitor = syntheticMonitor;
      initBits &= ~INIT_BIT_SYNTHETIC_MONITOR;
      return this;
    }

    /**
     * Initializes the value for the {@link LayoutService.EditConfigPermissions#alert() alert} attribute.
     * @param alert The value for alert 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder alert(boolean alert) {
      this.alert = alert;
      initBits &= ~INIT_BIT_ALERT;
      return this;
    }

    /**
     * Initializes the value for the {@link LayoutService.EditConfigPermissions#ui() ui} attribute.
     * @param ui The value for ui 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder ui(boolean ui) {
      this.ui = ui;
      initBits &= ~INIT_BIT_UI;
      return this;
    }

    /**
     * Initializes the value for the {@link LayoutService.EditConfigPermissions#plugin() plugin} attribute.
     * @param plugin The value for plugin 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder plugin(boolean plugin) {
      this.plugin = plugin;
      initBits &= ~INIT_BIT_PLUGIN;
      return this;
    }

    /**
     * Initializes the value for the {@link LayoutService.EditConfigPermissions#instrumentation() instrumentation} attribute.
     * @param instrumentation The value for instrumentation 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder instrumentation(boolean instrumentation) {
      this.instrumentation = instrumentation;
      initBits &= ~INIT_BIT_INSTRUMENTATION;
      return this;
    }

    /**
     * Initializes the value for the {@link LayoutService.EditConfigPermissions#userRecording() userRecording} attribute.
     * @param userRecording The value for userRecording 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder userRecording(boolean userRecording) {
      this.userRecording = userRecording;
      initBits &= ~INIT_BIT_USER_RECORDING;
      return this;
    }

    /**
     * Initializes the value for the {@link LayoutService.EditConfigPermissions#advanced() advanced} attribute.
     * @param advanced The value for advanced 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder advanced(boolean advanced) {
      this.advanced = advanced;
      initBits &= ~INIT_BIT_ADVANCED;
      return this;
    }

    /**
     * Builds a new {@link ImmutableEditConfigPermissions ImmutableEditConfigPermissions}.
     * @return An immutable instance of EditConfigPermissions
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableEditConfigPermissions build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableEditConfigPermissions(
          transaction,
          gauge,
          syntheticMonitor,
          alert,
          ui,
          plugin,
          instrumentation,
          userRecording,
          advanced);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_TRANSACTION) != 0) attributes.add("transaction");
      if ((initBits & INIT_BIT_GAUGE) != 0) attributes.add("gauge");
      if ((initBits & INIT_BIT_SYNTHETIC_MONITOR) != 0) attributes.add("syntheticMonitor");
      if ((initBits & INIT_BIT_ALERT) != 0) attributes.add("alert");
      if ((initBits & INIT_BIT_UI) != 0) attributes.add("ui");
      if ((initBits & INIT_BIT_PLUGIN) != 0) attributes.add("plugin");
      if ((initBits & INIT_BIT_INSTRUMENTATION) != 0) attributes.add("instrumentation");
      if ((initBits & INIT_BIT_USER_RECORDING) != 0) attributes.add("userRecording");
      if ((initBits & INIT_BIT_ADVANCED) != 0) attributes.add("advanced");
      return "Cannot build EditConfigPermissions, some of required attributes are not set " + attributes;
    }
  }
}
