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
 * Immutable implementation of {@link LayoutService.ErrorPermissions}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableErrorPermissions.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "LayoutService.ErrorPermissions"})
@Immutable
final class ImmutableErrorPermissions extends LayoutService.ErrorPermissions {
  private final boolean overview;
  private final boolean traces;

  private ImmutableErrorPermissions(boolean overview, boolean traces) {
    this.overview = overview;
    this.traces = traces;
  }

  /**
   * @return The value of the {@code overview} attribute
   */
  @JsonProperty("overview")
  @Override
  boolean overview() {
    return overview;
  }

  /**
   * @return The value of the {@code traces} attribute
   */
  @JsonProperty("traces")
  @Override
  boolean traces() {
    return traces;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LayoutService.ErrorPermissions#overview() overview} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for overview
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableErrorPermissions withOverview(boolean value) {
    if (this.overview == value) return this;
    return new ImmutableErrorPermissions(value, this.traces);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LayoutService.ErrorPermissions#traces() traces} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for traces
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableErrorPermissions withTraces(boolean value) {
    if (this.traces == value) return this;
    return new ImmutableErrorPermissions(this.overview, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableErrorPermissions} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableErrorPermissions
        && equalTo((ImmutableErrorPermissions) another);
  }

  private boolean equalTo(ImmutableErrorPermissions another) {
    return overview == another.overview
        && traces == another.traces;
  }

  /**
   * Computes a hash code from attributes: {@code overview}, {@code traces}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Booleans.hashCode(overview);
    h += (h << 5) + Booleans.hashCode(traces);
    return h;
  }

  /**
   * Prints the immutable value {@code ErrorPermissions} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("ErrorPermissions")
        .omitNullValues()
        .add("overview", overview)
        .add("traces", traces)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends LayoutService.ErrorPermissions {
    boolean overview;
    boolean overviewIsSet;
    boolean traces;
    boolean tracesIsSet;
    @JsonProperty("overview")
    public void setOverview(boolean overview) {
      this.overview = overview;
      this.overviewIsSet = true;
    }
    @JsonProperty("traces")
    public void setTraces(boolean traces) {
      this.traces = traces;
      this.tracesIsSet = true;
    }
    @Override
    boolean overview() { throw new UnsupportedOperationException(); }
    @Override
    boolean traces() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableErrorPermissions fromJson(Json json) {
    ImmutableErrorPermissions.Builder builder = ImmutableErrorPermissions.builder();
    if (json.overviewIsSet) {
      builder.overview(json.overview);
    }
    if (json.tracesIsSet) {
      builder.traces(json.traces);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link LayoutService.ErrorPermissions} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ErrorPermissions instance
   */
  public static ImmutableErrorPermissions copyOf(LayoutService.ErrorPermissions instance) {
    if (instance instanceof ImmutableErrorPermissions) {
      return (ImmutableErrorPermissions) instance;
    }
    return ImmutableErrorPermissions.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableErrorPermissions ImmutableErrorPermissions}.
   * @return A new ImmutableErrorPermissions builder
   */
  public static ImmutableErrorPermissions.Builder builder() {
    return new ImmutableErrorPermissions.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableErrorPermissions ImmutableErrorPermissions}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_OVERVIEW = 0x1L;
    private static final long INIT_BIT_TRACES = 0x2L;
    private long initBits = 0x3L;

    private boolean overview;
    private boolean traces;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code ErrorPermissions} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(LayoutService.ErrorPermissions instance) {
      Preconditions.checkNotNull(instance, "instance");
      overview(instance.overview());
      traces(instance.traces());
      return this;
    }

    /**
     * Initializes the value for the {@link LayoutService.ErrorPermissions#overview() overview} attribute.
     * @param overview The value for overview 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder overview(boolean overview) {
      this.overview = overview;
      initBits &= ~INIT_BIT_OVERVIEW;
      return this;
    }

    /**
     * Initializes the value for the {@link LayoutService.ErrorPermissions#traces() traces} attribute.
     * @param traces The value for traces 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder traces(boolean traces) {
      this.traces = traces;
      initBits &= ~INIT_BIT_TRACES;
      return this;
    }

    /**
     * Builds a new {@link ImmutableErrorPermissions ImmutableErrorPermissions}.
     * @return An immutable instance of ErrorPermissions
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableErrorPermissions build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableErrorPermissions(overview, traces);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_OVERVIEW) != 0) attributes.add("overview");
      if ((initBits & INIT_BIT_TRACES) != 0) attributes.add("traces");
      return "Cannot build ErrorPermissions, some of required attributes are not set " + attributes;
    }
  }
}
