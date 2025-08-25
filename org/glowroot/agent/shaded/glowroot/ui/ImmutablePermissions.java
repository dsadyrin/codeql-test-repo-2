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
 * Immutable implementation of {@link LayoutService.Permissions}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePermissions.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "LayoutService.Permissions"})
@Immutable
final class ImmutablePermissions extends LayoutService.Permissions {
  private final LayoutService.TransactionPermissions transaction;
  private final LayoutService.ErrorPermissions error;
  private final LayoutService.JvmPermissions jvm;
  private final boolean syntheticMonitor;
  private final boolean incident;
  private final LayoutService.ConfigPermissions config;

  private ImmutablePermissions(
      LayoutService.TransactionPermissions transaction,
      LayoutService.ErrorPermissions error,
      LayoutService.JvmPermissions jvm,
      boolean syntheticMonitor,
      boolean incident,
      LayoutService.ConfigPermissions config) {
    this.transaction = transaction;
    this.error = error;
    this.jvm = jvm;
    this.syntheticMonitor = syntheticMonitor;
    this.incident = incident;
    this.config = config;
  }

  /**
   * @return The value of the {@code transaction} attribute
   */
  @JsonProperty("transaction")
  @Override
  LayoutService.TransactionPermissions transaction() {
    return transaction;
  }

  /**
   * @return The value of the {@code error} attribute
   */
  @JsonProperty("error")
  @Override
  LayoutService.ErrorPermissions error() {
    return error;
  }

  /**
   * @return The value of the {@code jvm} attribute
   */
  @JsonProperty("jvm")
  @Override
  LayoutService.JvmPermissions jvm() {
    return jvm;
  }

  /**
   * @return The value of the {@code syntheticMonitor} attribute
   */
  @JsonProperty("syntheticMonitor")
  @Override
  boolean syntheticMonitor() {
    return syntheticMonitor;
  }

  /**
   * @return The value of the {@code incident} attribute
   */
  @JsonProperty("incident")
  @Override
  boolean incident() {
    return incident;
  }

  /**
   * @return The value of the {@code config} attribute
   */
  @JsonProperty("config")
  @Override
  LayoutService.ConfigPermissions config() {
    return config;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LayoutService.Permissions#transaction() transaction} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for transaction
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePermissions withTransaction(LayoutService.TransactionPermissions value) {
    if (this.transaction == value) return this;
    LayoutService.TransactionPermissions newValue = Preconditions.checkNotNull(value, "transaction");
    return new ImmutablePermissions(newValue, this.error, this.jvm, this.syntheticMonitor, this.incident, this.config);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LayoutService.Permissions#error() error} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for error
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePermissions withError(LayoutService.ErrorPermissions value) {
    if (this.error == value) return this;
    LayoutService.ErrorPermissions newValue = Preconditions.checkNotNull(value, "error");
    return new ImmutablePermissions(this.transaction, newValue, this.jvm, this.syntheticMonitor, this.incident, this.config);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LayoutService.Permissions#jvm() jvm} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for jvm
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePermissions withJvm(LayoutService.JvmPermissions value) {
    if (this.jvm == value) return this;
    LayoutService.JvmPermissions newValue = Preconditions.checkNotNull(value, "jvm");
    return new ImmutablePermissions(this.transaction, this.error, newValue, this.syntheticMonitor, this.incident, this.config);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LayoutService.Permissions#syntheticMonitor() syntheticMonitor} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for syntheticMonitor
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePermissions withSyntheticMonitor(boolean value) {
    if (this.syntheticMonitor == value) return this;
    return new ImmutablePermissions(this.transaction, this.error, this.jvm, value, this.incident, this.config);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LayoutService.Permissions#incident() incident} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for incident
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePermissions withIncident(boolean value) {
    if (this.incident == value) return this;
    return new ImmutablePermissions(this.transaction, this.error, this.jvm, this.syntheticMonitor, value, this.config);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LayoutService.Permissions#config() config} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for config
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePermissions withConfig(LayoutService.ConfigPermissions value) {
    if (this.config == value) return this;
    LayoutService.ConfigPermissions newValue = Preconditions.checkNotNull(value, "config");
    return new ImmutablePermissions(this.transaction, this.error, this.jvm, this.syntheticMonitor, this.incident, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePermissions} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePermissions
        && equalTo((ImmutablePermissions) another);
  }

  private boolean equalTo(ImmutablePermissions another) {
    return transaction.equals(another.transaction)
        && error.equals(another.error)
        && jvm.equals(another.jvm)
        && syntheticMonitor == another.syntheticMonitor
        && incident == another.incident
        && config.equals(another.config);
  }

  /**
   * Computes a hash code from attributes: {@code transaction}, {@code error}, {@code jvm}, {@code syntheticMonitor}, {@code incident}, {@code config}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + transaction.hashCode();
    h += (h << 5) + error.hashCode();
    h += (h << 5) + jvm.hashCode();
    h += (h << 5) + Booleans.hashCode(syntheticMonitor);
    h += (h << 5) + Booleans.hashCode(incident);
    h += (h << 5) + config.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Permissions} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("Permissions")
        .omitNullValues()
        .add("transaction", transaction)
        .add("error", error)
        .add("jvm", jvm)
        .add("syntheticMonitor", syntheticMonitor)
        .add("incident", incident)
        .add("config", config)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends LayoutService.Permissions {
    @Nullable LayoutService.TransactionPermissions transaction;
    @Nullable LayoutService.ErrorPermissions error;
    @Nullable LayoutService.JvmPermissions jvm;
    boolean syntheticMonitor;
    boolean syntheticMonitorIsSet;
    boolean incident;
    boolean incidentIsSet;
    @Nullable LayoutService.ConfigPermissions config;
    @JsonProperty("transaction")
    public void setTransaction(LayoutService.TransactionPermissions transaction) {
      this.transaction = transaction;
    }
    @JsonProperty("error")
    public void setError(LayoutService.ErrorPermissions error) {
      this.error = error;
    }
    @JsonProperty("jvm")
    public void setJvm(LayoutService.JvmPermissions jvm) {
      this.jvm = jvm;
    }
    @JsonProperty("syntheticMonitor")
    public void setSyntheticMonitor(boolean syntheticMonitor) {
      this.syntheticMonitor = syntheticMonitor;
      this.syntheticMonitorIsSet = true;
    }
    @JsonProperty("incident")
    public void setIncident(boolean incident) {
      this.incident = incident;
      this.incidentIsSet = true;
    }
    @JsonProperty("config")
    public void setConfig(LayoutService.ConfigPermissions config) {
      this.config = config;
    }
    @Override
    LayoutService.TransactionPermissions transaction() { throw new UnsupportedOperationException(); }
    @Override
    LayoutService.ErrorPermissions error() { throw new UnsupportedOperationException(); }
    @Override
    LayoutService.JvmPermissions jvm() { throw new UnsupportedOperationException(); }
    @Override
    boolean syntheticMonitor() { throw new UnsupportedOperationException(); }
    @Override
    boolean incident() { throw new UnsupportedOperationException(); }
    @Override
    LayoutService.ConfigPermissions config() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutablePermissions fromJson(Json json) {
    ImmutablePermissions.Builder builder = ImmutablePermissions.builder();
    if (json.transaction != null) {
      builder.transaction(json.transaction);
    }
    if (json.error != null) {
      builder.error(json.error);
    }
    if (json.jvm != null) {
      builder.jvm(json.jvm);
    }
    if (json.syntheticMonitorIsSet) {
      builder.syntheticMonitor(json.syntheticMonitor);
    }
    if (json.incidentIsSet) {
      builder.incident(json.incident);
    }
    if (json.config != null) {
      builder.config(json.config);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link LayoutService.Permissions} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Permissions instance
   */
  public static ImmutablePermissions copyOf(LayoutService.Permissions instance) {
    if (instance instanceof ImmutablePermissions) {
      return (ImmutablePermissions) instance;
    }
    return ImmutablePermissions.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutablePermissions ImmutablePermissions}.
   * @return A new ImmutablePermissions builder
   */
  public static ImmutablePermissions.Builder builder() {
    return new ImmutablePermissions.Builder();
  }

  /**
   * Builds instances of type {@link ImmutablePermissions ImmutablePermissions}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_TRANSACTION = 0x1L;
    private static final long INIT_BIT_ERROR = 0x2L;
    private static final long INIT_BIT_JVM = 0x4L;
    private static final long INIT_BIT_SYNTHETIC_MONITOR = 0x8L;
    private static final long INIT_BIT_INCIDENT = 0x10L;
    private static final long INIT_BIT_CONFIG = 0x20L;
    private long initBits = 0x3fL;

    private @Nullable LayoutService.TransactionPermissions transaction;
    private @Nullable LayoutService.ErrorPermissions error;
    private @Nullable LayoutService.JvmPermissions jvm;
    private boolean syntheticMonitor;
    private boolean incident;
    private @Nullable LayoutService.ConfigPermissions config;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Permissions} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(LayoutService.Permissions instance) {
      Preconditions.checkNotNull(instance, "instance");
      transaction(instance.transaction());
      error(instance.error());
      jvm(instance.jvm());
      syntheticMonitor(instance.syntheticMonitor());
      incident(instance.incident());
      config(instance.config());
      return this;
    }

    /**
     * Initializes the value for the {@link LayoutService.Permissions#transaction() transaction} attribute.
     * @param transaction The value for transaction 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder transaction(LayoutService.TransactionPermissions transaction) {
      this.transaction = Preconditions.checkNotNull(transaction, "transaction");
      initBits &= ~INIT_BIT_TRANSACTION;
      return this;
    }

    /**
     * Initializes the value for the {@link LayoutService.Permissions#error() error} attribute.
     * @param error The value for error 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder error(LayoutService.ErrorPermissions error) {
      this.error = Preconditions.checkNotNull(error, "error");
      initBits &= ~INIT_BIT_ERROR;
      return this;
    }

    /**
     * Initializes the value for the {@link LayoutService.Permissions#jvm() jvm} attribute.
     * @param jvm The value for jvm 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder jvm(LayoutService.JvmPermissions jvm) {
      this.jvm = Preconditions.checkNotNull(jvm, "jvm");
      initBits &= ~INIT_BIT_JVM;
      return this;
    }

    /**
     * Initializes the value for the {@link LayoutService.Permissions#syntheticMonitor() syntheticMonitor} attribute.
     * @param syntheticMonitor The value for syntheticMonitor 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder syntheticMonitor(boolean syntheticMonitor) {
      this.syntheticMonitor = syntheticMonitor;
      initBits &= ~INIT_BIT_SYNTHETIC_MONITOR;
      return this;
    }

    /**
     * Initializes the value for the {@link LayoutService.Permissions#incident() incident} attribute.
     * @param incident The value for incident 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder incident(boolean incident) {
      this.incident = incident;
      initBits &= ~INIT_BIT_INCIDENT;
      return this;
    }

    /**
     * Initializes the value for the {@link LayoutService.Permissions#config() config} attribute.
     * @param config The value for config 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder config(LayoutService.ConfigPermissions config) {
      this.config = Preconditions.checkNotNull(config, "config");
      initBits &= ~INIT_BIT_CONFIG;
      return this;
    }

    /**
     * Builds a new {@link ImmutablePermissions ImmutablePermissions}.
     * @return An immutable instance of Permissions
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutablePermissions build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutablePermissions(transaction, error, jvm, syntheticMonitor, incident, config);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_TRANSACTION) != 0) attributes.add("transaction");
      if ((initBits & INIT_BIT_ERROR) != 0) attributes.add("error");
      if ((initBits & INIT_BIT_JVM) != 0) attributes.add("jvm");
      if ((initBits & INIT_BIT_SYNTHETIC_MONITOR) != 0) attributes.add("syntheticMonitor");
      if ((initBits & INIT_BIT_INCIDENT) != 0) attributes.add("incident");
      if ((initBits & INIT_BIT_CONFIG) != 0) attributes.add("config");
      return "Cannot build Permissions, some of required attributes are not set " + attributes;
    }
  }
}
