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
 * Immutable implementation of {@link LayoutService.TransactionPermissions}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTransactionPermissions.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "LayoutService.TransactionPermissions"})
@Immutable
final class ImmutableTransactionPermissions
    extends LayoutService.TransactionPermissions {
  private final boolean overview;
  private final boolean traces;
  private final boolean queries;
  private final boolean serviceCalls;
  private final boolean profile;

  private ImmutableTransactionPermissions(boolean overview, boolean traces, boolean queries, boolean serviceCalls, boolean profile) {
    this.overview = overview;
    this.traces = traces;
    this.queries = queries;
    this.serviceCalls = serviceCalls;
    this.profile = profile;
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
   * @return The value of the {@code queries} attribute
   */
  @JsonProperty("queries")
  @Override
  boolean queries() {
    return queries;
  }

  /**
   * @return The value of the {@code serviceCalls} attribute
   */
  @JsonProperty("serviceCalls")
  @Override
  boolean serviceCalls() {
    return serviceCalls;
  }

  /**
   * @return The value of the {@code profile} attribute
   */
  @JsonProperty("profile")
  @Override
  boolean profile() {
    return profile;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LayoutService.TransactionPermissions#overview() overview} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for overview
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTransactionPermissions withOverview(boolean value) {
    if (this.overview == value) return this;
    return new ImmutableTransactionPermissions(value, this.traces, this.queries, this.serviceCalls, this.profile);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LayoutService.TransactionPermissions#traces() traces} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for traces
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTransactionPermissions withTraces(boolean value) {
    if (this.traces == value) return this;
    return new ImmutableTransactionPermissions(this.overview, value, this.queries, this.serviceCalls, this.profile);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LayoutService.TransactionPermissions#queries() queries} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for queries
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTransactionPermissions withQueries(boolean value) {
    if (this.queries == value) return this;
    return new ImmutableTransactionPermissions(this.overview, this.traces, value, this.serviceCalls, this.profile);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LayoutService.TransactionPermissions#serviceCalls() serviceCalls} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for serviceCalls
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTransactionPermissions withServiceCalls(boolean value) {
    if (this.serviceCalls == value) return this;
    return new ImmutableTransactionPermissions(this.overview, this.traces, this.queries, value, this.profile);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LayoutService.TransactionPermissions#profile() profile} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for profile
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTransactionPermissions withProfile(boolean value) {
    if (this.profile == value) return this;
    return new ImmutableTransactionPermissions(this.overview, this.traces, this.queries, this.serviceCalls, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTransactionPermissions} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTransactionPermissions
        && equalTo((ImmutableTransactionPermissions) another);
  }

  private boolean equalTo(ImmutableTransactionPermissions another) {
    return overview == another.overview
        && traces == another.traces
        && queries == another.queries
        && serviceCalls == another.serviceCalls
        && profile == another.profile;
  }

  /**
   * Computes a hash code from attributes: {@code overview}, {@code traces}, {@code queries}, {@code serviceCalls}, {@code profile}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Booleans.hashCode(overview);
    h += (h << 5) + Booleans.hashCode(traces);
    h += (h << 5) + Booleans.hashCode(queries);
    h += (h << 5) + Booleans.hashCode(serviceCalls);
    h += (h << 5) + Booleans.hashCode(profile);
    return h;
  }

  /**
   * Prints the immutable value {@code TransactionPermissions} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("TransactionPermissions")
        .omitNullValues()
        .add("overview", overview)
        .add("traces", traces)
        .add("queries", queries)
        .add("serviceCalls", serviceCalls)
        .add("profile", profile)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends LayoutService.TransactionPermissions {
    boolean overview;
    boolean overviewIsSet;
    boolean traces;
    boolean tracesIsSet;
    boolean queries;
    boolean queriesIsSet;
    boolean serviceCalls;
    boolean serviceCallsIsSet;
    boolean profile;
    boolean profileIsSet;
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
    @JsonProperty("queries")
    public void setQueries(boolean queries) {
      this.queries = queries;
      this.queriesIsSet = true;
    }
    @JsonProperty("serviceCalls")
    public void setServiceCalls(boolean serviceCalls) {
      this.serviceCalls = serviceCalls;
      this.serviceCallsIsSet = true;
    }
    @JsonProperty("profile")
    public void setProfile(boolean profile) {
      this.profile = profile;
      this.profileIsSet = true;
    }
    @Override
    boolean overview() { throw new UnsupportedOperationException(); }
    @Override
    boolean traces() { throw new UnsupportedOperationException(); }
    @Override
    boolean queries() { throw new UnsupportedOperationException(); }
    @Override
    boolean serviceCalls() { throw new UnsupportedOperationException(); }
    @Override
    boolean profile() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableTransactionPermissions fromJson(Json json) {
    ImmutableTransactionPermissions.Builder builder = ImmutableTransactionPermissions.builder();
    if (json.overviewIsSet) {
      builder.overview(json.overview);
    }
    if (json.tracesIsSet) {
      builder.traces(json.traces);
    }
    if (json.queriesIsSet) {
      builder.queries(json.queries);
    }
    if (json.serviceCallsIsSet) {
      builder.serviceCalls(json.serviceCalls);
    }
    if (json.profileIsSet) {
      builder.profile(json.profile);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link LayoutService.TransactionPermissions} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable TransactionPermissions instance
   */
  public static ImmutableTransactionPermissions copyOf(LayoutService.TransactionPermissions instance) {
    if (instance instanceof ImmutableTransactionPermissions) {
      return (ImmutableTransactionPermissions) instance;
    }
    return ImmutableTransactionPermissions.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableTransactionPermissions ImmutableTransactionPermissions}.
   * @return A new ImmutableTransactionPermissions builder
   */
  public static ImmutableTransactionPermissions.Builder builder() {
    return new ImmutableTransactionPermissions.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableTransactionPermissions ImmutableTransactionPermissions}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_OVERVIEW = 0x1L;
    private static final long INIT_BIT_TRACES = 0x2L;
    private static final long INIT_BIT_QUERIES = 0x4L;
    private static final long INIT_BIT_SERVICE_CALLS = 0x8L;
    private static final long INIT_BIT_PROFILE = 0x10L;
    private long initBits = 0x1fL;

    private boolean overview;
    private boolean traces;
    private boolean queries;
    private boolean serviceCalls;
    private boolean profile;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code TransactionPermissions} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(LayoutService.TransactionPermissions instance) {
      Preconditions.checkNotNull(instance, "instance");
      overview(instance.overview());
      traces(instance.traces());
      queries(instance.queries());
      serviceCalls(instance.serviceCalls());
      profile(instance.profile());
      return this;
    }

    /**
     * Initializes the value for the {@link LayoutService.TransactionPermissions#overview() overview} attribute.
     * @param overview The value for overview 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder overview(boolean overview) {
      this.overview = overview;
      initBits &= ~INIT_BIT_OVERVIEW;
      return this;
    }

    /**
     * Initializes the value for the {@link LayoutService.TransactionPermissions#traces() traces} attribute.
     * @param traces The value for traces 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder traces(boolean traces) {
      this.traces = traces;
      initBits &= ~INIT_BIT_TRACES;
      return this;
    }

    /**
     * Initializes the value for the {@link LayoutService.TransactionPermissions#queries() queries} attribute.
     * @param queries The value for queries 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder queries(boolean queries) {
      this.queries = queries;
      initBits &= ~INIT_BIT_QUERIES;
      return this;
    }

    /**
     * Initializes the value for the {@link LayoutService.TransactionPermissions#serviceCalls() serviceCalls} attribute.
     * @param serviceCalls The value for serviceCalls 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder serviceCalls(boolean serviceCalls) {
      this.serviceCalls = serviceCalls;
      initBits &= ~INIT_BIT_SERVICE_CALLS;
      return this;
    }

    /**
     * Initializes the value for the {@link LayoutService.TransactionPermissions#profile() profile} attribute.
     * @param profile The value for profile 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder profile(boolean profile) {
      this.profile = profile;
      initBits &= ~INIT_BIT_PROFILE;
      return this;
    }

    /**
     * Builds a new {@link ImmutableTransactionPermissions ImmutableTransactionPermissions}.
     * @return An immutable instance of TransactionPermissions
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableTransactionPermissions build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableTransactionPermissions(overview, traces, queries, serviceCalls, profile);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_OVERVIEW) != 0) attributes.add("overview");
      if ((initBits & INIT_BIT_TRACES) != 0) attributes.add("traces");
      if ((initBits & INIT_BIT_QUERIES) != 0) attributes.add("queries");
      if ((initBits & INIT_BIT_SERVICE_CALLS) != 0) attributes.add("serviceCalls");
      if ((initBits & INIT_BIT_PROFILE) != 0) attributes.add("profile");
      return "Cannot build TransactionPermissions, some of required attributes are not set " + attributes;
    }
  }
}
