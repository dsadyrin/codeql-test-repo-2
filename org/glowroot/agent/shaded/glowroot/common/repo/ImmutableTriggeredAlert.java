package org.glowroot.agent.shaded.glowroot.common.repo;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
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
 * Immutable implementation of {@link TriggeredAlertRepository.TriggeredAlert}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTriggeredAlert.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code ImmutableTriggeredAlert.of()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "TriggeredAlertRepository.TriggeredAlert"})
@Immutable
public final class ImmutableTriggeredAlert
    implements TriggeredAlertRepository.TriggeredAlert {
  private final String agentRollupId;
  private final AgentConfigOuterClass.AgentConfig.AlertConfig.AlertCondition alertCondition;

  private ImmutableTriggeredAlert(
      String agentRollupId,
      AgentConfigOuterClass.AgentConfig.AlertConfig.AlertCondition alertCondition) {
    this.agentRollupId = Preconditions.checkNotNull(agentRollupId, "agentRollupId");
    this.alertCondition = Preconditions.checkNotNull(alertCondition, "alertCondition");
  }

  private ImmutableTriggeredAlert(
      ImmutableTriggeredAlert original,
      String agentRollupId,
      AgentConfigOuterClass.AgentConfig.AlertConfig.AlertCondition alertCondition) {
    this.agentRollupId = agentRollupId;
    this.alertCondition = alertCondition;
  }

  /**
   * @return The value of the {@code agentRollupId} attribute
   */
  @JsonProperty("agentRollupId")
  @Override
  public String agentRollupId() {
    return agentRollupId;
  }

  /**
   * @return The value of the {@code alertCondition} attribute
   */
  @JsonProperty("alertCondition")
  @Override
  public AgentConfigOuterClass.AgentConfig.AlertConfig.AlertCondition alertCondition() {
    return alertCondition;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TriggeredAlertRepository.TriggeredAlert#agentRollupId() agentRollupId} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for agentRollupId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTriggeredAlert withAgentRollupId(String value) {
    if (this.agentRollupId.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "agentRollupId");
    return new ImmutableTriggeredAlert(this, newValue, this.alertCondition);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TriggeredAlertRepository.TriggeredAlert#alertCondition() alertCondition} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for alertCondition
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTriggeredAlert withAlertCondition(AgentConfigOuterClass.AgentConfig.AlertConfig.AlertCondition value) {
    if (this.alertCondition == value) return this;
    AgentConfigOuterClass.AgentConfig.AlertConfig.AlertCondition newValue = Preconditions.checkNotNull(value, "alertCondition");
    return new ImmutableTriggeredAlert(this, this.agentRollupId, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTriggeredAlert} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTriggeredAlert
        && equalTo((ImmutableTriggeredAlert) another);
  }

  private boolean equalTo(ImmutableTriggeredAlert another) {
    return agentRollupId.equals(another.agentRollupId)
        && alertCondition.equals(another.alertCondition);
  }

  /**
   * Computes a hash code from attributes: {@code agentRollupId}, {@code alertCondition}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + agentRollupId.hashCode();
    h += (h << 5) + alertCondition.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code TriggeredAlert} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("TriggeredAlert")
        .omitNullValues()
        .add("agentRollupId", agentRollupId)
        .add("alertCondition", alertCondition)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements TriggeredAlertRepository.TriggeredAlert {
    @Nullable String agentRollupId;
    @Nullable AgentConfigOuterClass.AgentConfig.AlertConfig.AlertCondition alertCondition;
    @JsonProperty("agentRollupId")
    public void setAgentRollupId(String agentRollupId) {
      this.agentRollupId = agentRollupId;
    }
    @JsonProperty("alertCondition")
    public void setAlertCondition(AgentConfigOuterClass.AgentConfig.AlertConfig.AlertCondition alertCondition) {
      this.alertCondition = alertCondition;
    }
    @Override
    public String agentRollupId() { throw new UnsupportedOperationException(); }
    @Override
    public AgentConfigOuterClass.AgentConfig.AlertConfig.AlertCondition alertCondition() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableTriggeredAlert fromJson(Json json) {
    ImmutableTriggeredAlert.Builder builder = ImmutableTriggeredAlert.builder();
    if (json.agentRollupId != null) {
      builder.agentRollupId(json.agentRollupId);
    }
    if (json.alertCondition != null) {
      builder.alertCondition(json.alertCondition);
    }
    return builder.build();
  }

  /**
   * Construct a new immutable {@code TriggeredAlert} instance.
   * @param agentRollupId The value for the {@code agentRollupId} attribute
   * @param alertCondition The value for the {@code alertCondition} attribute
   * @return An immutable TriggeredAlert instance
   */
  public static ImmutableTriggeredAlert of(String agentRollupId, AgentConfigOuterClass.AgentConfig.AlertConfig.AlertCondition alertCondition) {
    return new ImmutableTriggeredAlert(agentRollupId, alertCondition);
  }

  /**
   * Creates an immutable copy of a {@link TriggeredAlertRepository.TriggeredAlert} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable TriggeredAlert instance
   */
  public static ImmutableTriggeredAlert copyOf(TriggeredAlertRepository.TriggeredAlert instance) {
    if (instance instanceof ImmutableTriggeredAlert) {
      return (ImmutableTriggeredAlert) instance;
    }
    return ImmutableTriggeredAlert.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableTriggeredAlert ImmutableTriggeredAlert}.
   * @return A new ImmutableTriggeredAlert builder
   */
  public static ImmutableTriggeredAlert.Builder builder() {
    return new ImmutableTriggeredAlert.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableTriggeredAlert ImmutableTriggeredAlert}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_AGENT_ROLLUP_ID = 0x1L;
    private static final long INIT_BIT_ALERT_CONDITION = 0x2L;
    private long initBits = 0x3L;

    private @Nullable String agentRollupId;
    private @Nullable AgentConfigOuterClass.AgentConfig.AlertConfig.AlertCondition alertCondition;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code TriggeredAlert} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(TriggeredAlertRepository.TriggeredAlert instance) {
      Preconditions.checkNotNull(instance, "instance");
      agentRollupId(instance.agentRollupId());
      alertCondition(instance.alertCondition());
      return this;
    }

    /**
     * Initializes the value for the {@link TriggeredAlertRepository.TriggeredAlert#agentRollupId() agentRollupId} attribute.
     * @param agentRollupId The value for agentRollupId 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder agentRollupId(String agentRollupId) {
      this.agentRollupId = Preconditions.checkNotNull(agentRollupId, "agentRollupId");
      initBits &= ~INIT_BIT_AGENT_ROLLUP_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link TriggeredAlertRepository.TriggeredAlert#alertCondition() alertCondition} attribute.
     * @param alertCondition The value for alertCondition 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder alertCondition(AgentConfigOuterClass.AgentConfig.AlertConfig.AlertCondition alertCondition) {
      this.alertCondition = Preconditions.checkNotNull(alertCondition, "alertCondition");
      initBits &= ~INIT_BIT_ALERT_CONDITION;
      return this;
    }

    /**
     * Builds a new {@link ImmutableTriggeredAlert ImmutableTriggeredAlert}.
     * @return An immutable instance of TriggeredAlert
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableTriggeredAlert build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableTriggeredAlert(null, agentRollupId, alertCondition);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_AGENT_ROLLUP_ID) != 0) attributes.add("agentRollupId");
      if ((initBits & INIT_BIT_ALERT_CONDITION) != 0) attributes.add("alertCondition");
      return "Cannot build TriggeredAlert, some of required attributes are not set " + attributes;
    }
  }
}
