package org.glowroot.agent.shaded.glowroot.ui;

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

/**
 * Immutable implementation of {@link IncidentJsonService.AlertItem}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAlertItem.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code ImmutableAlertItem.of()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "IncidentJsonService.AlertItem"})
@Immutable
final class ImmutableAlertItem implements IncidentJsonService.AlertItem {
  private final String agentRollupId;
  private final String display;

  private ImmutableAlertItem(String agentRollupId, String display) {
    this.agentRollupId = Preconditions.checkNotNull(agentRollupId, "agentRollupId");
    this.display = Preconditions.checkNotNull(display, "display");
  }

  private ImmutableAlertItem(ImmutableAlertItem original, String agentRollupId, String display) {
    this.agentRollupId = agentRollupId;
    this.display = display;
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
   * @return The value of the {@code display} attribute
   */
  @JsonProperty("display")
  @Override
  public String display() {
    return display;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link IncidentJsonService.AlertItem#agentRollupId() agentRollupId} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for agentRollupId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAlertItem withAgentRollupId(String value) {
    if (this.agentRollupId.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "agentRollupId");
    return new ImmutableAlertItem(this, newValue, this.display);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link IncidentJsonService.AlertItem#display() display} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for display
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAlertItem withDisplay(String value) {
    if (this.display.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "display");
    return new ImmutableAlertItem(this, this.agentRollupId, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAlertItem} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAlertItem
        && equalTo((ImmutableAlertItem) another);
  }

  private boolean equalTo(ImmutableAlertItem another) {
    return agentRollupId.equals(another.agentRollupId)
        && display.equals(another.display);
  }

  /**
   * Computes a hash code from attributes: {@code agentRollupId}, {@code display}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + agentRollupId.hashCode();
    h += (h << 5) + display.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code AlertItem} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("AlertItem")
        .omitNullValues()
        .add("agentRollupId", agentRollupId)
        .add("display", display)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements IncidentJsonService.AlertItem {
    @Nullable String agentRollupId;
    @Nullable String display;
    @JsonProperty("agentRollupId")
    public void setAgentRollupId(String agentRollupId) {
      this.agentRollupId = agentRollupId;
    }
    @JsonProperty("display")
    public void setDisplay(String display) {
      this.display = display;
    }
    @Override
    public String agentRollupId() { throw new UnsupportedOperationException(); }
    @Override
    public String display() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableAlertItem fromJson(Json json) {
    ImmutableAlertItem.Builder builder = ImmutableAlertItem.builder();
    if (json.agentRollupId != null) {
      builder.agentRollupId(json.agentRollupId);
    }
    if (json.display != null) {
      builder.display(json.display);
    }
    return builder.build();
  }

  /**
   * Construct a new immutable {@code AlertItem} instance.
   * @param agentRollupId The value for the {@code agentRollupId} attribute
   * @param display The value for the {@code display} attribute
   * @return An immutable AlertItem instance
   */
  public static ImmutableAlertItem of(String agentRollupId, String display) {
    return new ImmutableAlertItem(agentRollupId, display);
  }

  /**
   * Creates an immutable copy of a {@link IncidentJsonService.AlertItem} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable AlertItem instance
   */
  public static ImmutableAlertItem copyOf(IncidentJsonService.AlertItem instance) {
    if (instance instanceof ImmutableAlertItem) {
      return (ImmutableAlertItem) instance;
    }
    return ImmutableAlertItem.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableAlertItem ImmutableAlertItem}.
   * @return A new ImmutableAlertItem builder
   */
  public static ImmutableAlertItem.Builder builder() {
    return new ImmutableAlertItem.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableAlertItem ImmutableAlertItem}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_AGENT_ROLLUP_ID = 0x1L;
    private static final long INIT_BIT_DISPLAY = 0x2L;
    private long initBits = 0x3L;

    private @Nullable String agentRollupId;
    private @Nullable String display;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code AlertItem} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(IncidentJsonService.AlertItem instance) {
      Preconditions.checkNotNull(instance, "instance");
      agentRollupId(instance.agentRollupId());
      display(instance.display());
      return this;
    }

    /**
     * Initializes the value for the {@link IncidentJsonService.AlertItem#agentRollupId() agentRollupId} attribute.
     * @param agentRollupId The value for agentRollupId 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder agentRollupId(String agentRollupId) {
      this.agentRollupId = Preconditions.checkNotNull(agentRollupId, "agentRollupId");
      initBits &= ~INIT_BIT_AGENT_ROLLUP_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link IncidentJsonService.AlertItem#display() display} attribute.
     * @param display The value for display 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder display(String display) {
      this.display = Preconditions.checkNotNull(display, "display");
      initBits &= ~INIT_BIT_DISPLAY;
      return this;
    }

    /**
     * Builds a new {@link ImmutableAlertItem ImmutableAlertItem}.
     * @return An immutable instance of AlertItem
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableAlertItem build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableAlertItem(null, agentRollupId, display);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_AGENT_ROLLUP_ID) != 0) attributes.add("agentRollupId");
      if ((initBits & INIT_BIT_DISPLAY) != 0) attributes.add("display");
      return "Cannot build AlertItem, some of required attributes are not set " + attributes;
    }
  }
}
