package org.glowroot.agent.shaded.glowroot.ui;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import org.glowroot.agent.shaded.google.common.collect.ImmutableList;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link ReportJsonService.RequestWithAgentRollupIds}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableRequestWithAgentRollupIds.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "ReportJsonService.RequestWithAgentRollupIds"})
@Immutable
final class ImmutableRequestWithAgentRollupIds
    implements ReportJsonService.RequestWithAgentRollupIds {
  private final ImmutableList<String> agentRollupIds;

  private ImmutableRequestWithAgentRollupIds(ImmutableList<String> agentRollupIds) {
    this.agentRollupIds = agentRollupIds;
  }

  /**
   * @return The value of the {@code agentRollupIds} attribute
   */
  @JsonProperty("agentRollupIds")
  @Override
  public ImmutableList<String> agentRollupIds() {
    return agentRollupIds;
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ReportJsonService.RequestWithAgentRollupIds#agentRollupIds() agentRollupIds}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestWithAgentRollupIds withAgentRollupIds(String... elements) {
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableRequestWithAgentRollupIds(newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ReportJsonService.RequestWithAgentRollupIds#agentRollupIds() agentRollupIds}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of agentRollupIds elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestWithAgentRollupIds withAgentRollupIds(Iterable<String> elements) {
    if (this.agentRollupIds == elements) return this;
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableRequestWithAgentRollupIds(newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableRequestWithAgentRollupIds} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableRequestWithAgentRollupIds
        && equalTo((ImmutableRequestWithAgentRollupIds) another);
  }

  private boolean equalTo(ImmutableRequestWithAgentRollupIds another) {
    return agentRollupIds.equals(another.agentRollupIds);
  }

  /**
   * Computes a hash code from attributes: {@code agentRollupIds}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + agentRollupIds.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code RequestWithAgentRollupIds} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("RequestWithAgentRollupIds")
        .omitNullValues()
        .add("agentRollupIds", agentRollupIds)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ReportJsonService.RequestWithAgentRollupIds {
    List<String> agentRollupIds = ImmutableList.of();
    @JsonProperty("agentRollupIds")
    public void setAgentRollupIds(List<String> agentRollupIds) {
      this.agentRollupIds = agentRollupIds;
    }
    @Override
    public List<String> agentRollupIds() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableRequestWithAgentRollupIds fromJson(Json json) {
    ImmutableRequestWithAgentRollupIds.Builder builder = ImmutableRequestWithAgentRollupIds.builder();
    if (json.agentRollupIds != null) {
      builder.addAllAgentRollupIds(json.agentRollupIds);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ReportJsonService.RequestWithAgentRollupIds} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable RequestWithAgentRollupIds instance
   */
  public static ImmutableRequestWithAgentRollupIds copyOf(ReportJsonService.RequestWithAgentRollupIds instance) {
    if (instance instanceof ImmutableRequestWithAgentRollupIds) {
      return (ImmutableRequestWithAgentRollupIds) instance;
    }
    return ImmutableRequestWithAgentRollupIds.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableRequestWithAgentRollupIds ImmutableRequestWithAgentRollupIds}.
   * @return A new ImmutableRequestWithAgentRollupIds builder
   */
  public static ImmutableRequestWithAgentRollupIds.Builder builder() {
    return new ImmutableRequestWithAgentRollupIds.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableRequestWithAgentRollupIds ImmutableRequestWithAgentRollupIds}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private ImmutableList.Builder<String> agentRollupIds = ImmutableList.builder();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code RequestWithAgentRollupIds} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(ReportJsonService.RequestWithAgentRollupIds instance) {
      Preconditions.checkNotNull(instance, "instance");
      addAllAgentRollupIds(instance.agentRollupIds());
      return this;
    }

    /**
     * Adds one element to {@link ReportJsonService.RequestWithAgentRollupIds#agentRollupIds() agentRollupIds} list.
     * @param element A agentRollupIds element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAgentRollupIds(String element) {
      this.agentRollupIds.add(element);
      return this;
    }

    /**
     * Adds elements to {@link ReportJsonService.RequestWithAgentRollupIds#agentRollupIds() agentRollupIds} list.
     * @param elements An array of agentRollupIds elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAgentRollupIds(String... elements) {
      this.agentRollupIds.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link ReportJsonService.RequestWithAgentRollupIds#agentRollupIds() agentRollupIds} list.
     * @param elements An iterable of agentRollupIds elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder agentRollupIds(Iterable<String> elements) {
      this.agentRollupIds = ImmutableList.builder();
      return addAllAgentRollupIds(elements);
    }

    /**
     * Adds elements to {@link ReportJsonService.RequestWithAgentRollupIds#agentRollupIds() agentRollupIds} list.
     * @param elements An iterable of agentRollupIds elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllAgentRollupIds(Iterable<String> elements) {
      this.agentRollupIds.addAll(elements);
      return this;
    }

    /**
     * Builds a new {@link ImmutableRequestWithAgentRollupIds ImmutableRequestWithAgentRollupIds}.
     * @return An immutable instance of RequestWithAgentRollupIds
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableRequestWithAgentRollupIds build() {
      return new ImmutableRequestWithAgentRollupIds(agentRollupIds.build());
    }
  }
}
