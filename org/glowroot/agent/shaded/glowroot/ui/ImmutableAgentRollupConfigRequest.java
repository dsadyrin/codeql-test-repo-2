package org.glowroot.agent.shaded.glowroot.ui;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Optional;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link AgentConfigJsonService.AgentRollupConfigRequest}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAgentRollupConfigRequest.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "AgentConfigJsonService.AgentRollupConfigRequest"})
@Immutable
final class ImmutableAgentRollupConfigRequest
    implements AgentConfigJsonService.AgentRollupConfigRequest {
  private final Optional<String> agentRollupId;

  private ImmutableAgentRollupConfigRequest(Optional<String> agentRollupId) {
    this.agentRollupId = agentRollupId;
  }

  /**
   * @return The value of the {@code agentRollupId} attribute
   */
  @JsonProperty("agentRollupId")
  @Override
  public Optional<String> agentRollupId() {
    return agentRollupId;
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AgentConfigJsonService.AgentRollupConfigRequest#agentRollupId() agentRollupId} attribute.
   * @param value The value for agentRollupId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAgentRollupConfigRequest withAgentRollupId(String value) {
    Optional<String> newValue = Optional.of(value);
    if (this.agentRollupId.equals(newValue)) return this;
    return new ImmutableAgentRollupConfigRequest(newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AgentConfigJsonService.AgentRollupConfigRequest#agentRollupId() agentRollupId} attribute.
   * An equality check is used to prevent copying of the same value by returning {@code this}.
   * @param optional A value for agentRollupId
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAgentRollupConfigRequest withAgentRollupId(Optional<String> optional) {
    Optional<String> value = (Optional<String>) optional;
    if (this.agentRollupId.equals(value)) return this;
    return new ImmutableAgentRollupConfigRequest(value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAgentRollupConfigRequest} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAgentRollupConfigRequest
        && equalTo((ImmutableAgentRollupConfigRequest) another);
  }

  private boolean equalTo(ImmutableAgentRollupConfigRequest another) {
    return agentRollupId.equals(another.agentRollupId);
  }

  /**
   * Computes a hash code from attributes: {@code agentRollupId}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + agentRollupId.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code AgentRollupConfigRequest} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("AgentRollupConfigRequest")
        .omitNullValues()
        .add("agentRollupId", agentRollupId.orNull())
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements AgentConfigJsonService.AgentRollupConfigRequest {
    Optional<String> agentRollupId = Optional.absent();
    @JsonProperty("agentRollupId")
    public void setAgentRollupId(Optional<String> agentRollupId) {
      this.agentRollupId = agentRollupId;
    }
    @Override
    public Optional<String> agentRollupId() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableAgentRollupConfigRequest fromJson(Json json) {
    ImmutableAgentRollupConfigRequest.Builder builder = ImmutableAgentRollupConfigRequest.builder();
    if (json.agentRollupId != null) {
      builder.agentRollupId(json.agentRollupId);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link AgentConfigJsonService.AgentRollupConfigRequest} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable AgentRollupConfigRequest instance
   */
  public static ImmutableAgentRollupConfigRequest copyOf(AgentConfigJsonService.AgentRollupConfigRequest instance) {
    if (instance instanceof ImmutableAgentRollupConfigRequest) {
      return (ImmutableAgentRollupConfigRequest) instance;
    }
    return ImmutableAgentRollupConfigRequest.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableAgentRollupConfigRequest ImmutableAgentRollupConfigRequest}.
   * @return A new ImmutableAgentRollupConfigRequest builder
   */
  public static ImmutableAgentRollupConfigRequest.Builder builder() {
    return new ImmutableAgentRollupConfigRequest.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableAgentRollupConfigRequest ImmutableAgentRollupConfigRequest}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private Optional<String> agentRollupId = Optional.absent();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code AgentRollupConfigRequest} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(AgentConfigJsonService.AgentRollupConfigRequest instance) {
      Preconditions.checkNotNull(instance, "instance");
      Optional<String> agentRollupIdOptional = instance.agentRollupId();
      if (agentRollupIdOptional.isPresent()) {
        agentRollupId(agentRollupIdOptional);
      }
      return this;
    }

    /**
     * Initializes the optional value {@link AgentConfigJsonService.AgentRollupConfigRequest#agentRollupId() agentRollupId} to agentRollupId.
     * @param agentRollupId The value for agentRollupId
     * @return {@code this} builder for chained invocation
     */
    public final Builder agentRollupId(String agentRollupId) {
      this.agentRollupId = Optional.of(agentRollupId);
      return this;
    }

    /**
     * Initializes the optional value {@link AgentConfigJsonService.AgentRollupConfigRequest#agentRollupId() agentRollupId} to agentRollupId.
     * @param agentRollupId The value for agentRollupId
     * @return {@code this} builder for use in a chained invocation
     */
    @SuppressWarnings("unchecked") // safe covariant cast
    public final Builder agentRollupId(Optional<String> agentRollupId) {
      this.agentRollupId = (Optional<String>) agentRollupId;
      return this;
    }

    /**
     * Builds a new {@link ImmutableAgentRollupConfigRequest ImmutableAgentRollupConfigRequest}.
     * @return An immutable instance of AgentRollupConfigRequest
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableAgentRollupConfigRequest build() {
      return new ImmutableAgentRollupConfigRequest(agentRollupId);
    }
  }
}
