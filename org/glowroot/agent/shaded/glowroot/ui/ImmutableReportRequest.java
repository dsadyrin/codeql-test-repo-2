package org.glowroot.agent.shaded.glowroot.ui;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Objects;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import org.glowroot.agent.shaded.google.common.collect.ImmutableList;
import org.glowroot.agent.shaded.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link ReportJsonService.ReportRequest}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableReportRequest.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "ReportJsonService.ReportRequest"})
@Immutable
final class ImmutableReportRequest implements ReportJsonService.ReportRequest {
  private final ImmutableList<String> agentRollupIds;
  private final String metric;
  private final @Nullable String transactionType;
  private final @Nullable String transactionName;
  private final @Nullable Double percentile;
  private final String fromDate;
  private final String toDate;
  private final ReportJsonService.ROLLUP rollup;
  private final String timeZoneId;

  private ImmutableReportRequest(
      ImmutableList<String> agentRollupIds,
      String metric,
      @Nullable String transactionType,
      @Nullable String transactionName,
      @Nullable Double percentile,
      String fromDate,
      String toDate,
      ReportJsonService.ROLLUP rollup,
      String timeZoneId) {
    this.agentRollupIds = agentRollupIds;
    this.metric = metric;
    this.transactionType = transactionType;
    this.transactionName = transactionName;
    this.percentile = percentile;
    this.fromDate = fromDate;
    this.toDate = toDate;
    this.rollup = rollup;
    this.timeZoneId = timeZoneId;
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
   * @return The value of the {@code metric} attribute
   */
  @JsonProperty("metric")
  @Override
  public String metric() {
    return metric;
  }

  /**
   * @return The value of the {@code transactionType} attribute
   */
  @JsonProperty("transactionType")
  @Override
  public @Nullable String transactionType() {
    return transactionType;
  }

  /**
   * @return The value of the {@code transactionName} attribute
   */
  @JsonProperty("transactionName")
  @Override
  public @Nullable String transactionName() {
    return transactionName;
  }

  /**
   * @return The value of the {@code percentile} attribute
   */
  @JsonProperty("percentile")
  @Override
  public @Nullable Double percentile() {
    return percentile;
  }

  /**
   * @return The value of the {@code fromDate} attribute
   */
  @JsonProperty("fromDate")
  @Override
  public String fromDate() {
    return fromDate;
  }

  /**
   * @return The value of the {@code toDate} attribute
   */
  @JsonProperty("toDate")
  @Override
  public String toDate() {
    return toDate;
  }

  /**
   * @return The value of the {@code rollup} attribute
   */
  @JsonProperty("rollup")
  @Override
  public ReportJsonService.ROLLUP rollup() {
    return rollup;
  }

  /**
   * @return The value of the {@code timeZoneId} attribute
   */
  @JsonProperty("timeZoneId")
  @Override
  public String timeZoneId() {
    return timeZoneId;
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ReportJsonService.ReportRequest#agentRollupIds() agentRollupIds}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableReportRequest withAgentRollupIds(String... elements) {
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableReportRequest(
        newValue,
        this.metric,
        this.transactionType,
        this.transactionName,
        this.percentile,
        this.fromDate,
        this.toDate,
        this.rollup,
        this.timeZoneId);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ReportJsonService.ReportRequest#agentRollupIds() agentRollupIds}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of agentRollupIds elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableReportRequest withAgentRollupIds(Iterable<String> elements) {
    if (this.agentRollupIds == elements) return this;
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableReportRequest(
        newValue,
        this.metric,
        this.transactionType,
        this.transactionName,
        this.percentile,
        this.fromDate,
        this.toDate,
        this.rollup,
        this.timeZoneId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ReportJsonService.ReportRequest#metric() metric} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for metric
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableReportRequest withMetric(String value) {
    if (this.metric.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "metric");
    return new ImmutableReportRequest(
        this.agentRollupIds,
        newValue,
        this.transactionType,
        this.transactionName,
        this.percentile,
        this.fromDate,
        this.toDate,
        this.rollup,
        this.timeZoneId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ReportJsonService.ReportRequest#transactionType() transactionType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for transactionType (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableReportRequest withTransactionType(@Nullable String value) {
    if (Objects.equal(this.transactionType, value)) return this;
    return new ImmutableReportRequest(
        this.agentRollupIds,
        this.metric,
        value,
        this.transactionName,
        this.percentile,
        this.fromDate,
        this.toDate,
        this.rollup,
        this.timeZoneId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ReportJsonService.ReportRequest#transactionName() transactionName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for transactionName (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableReportRequest withTransactionName(@Nullable String value) {
    if (Objects.equal(this.transactionName, value)) return this;
    return new ImmutableReportRequest(
        this.agentRollupIds,
        this.metric,
        this.transactionType,
        value,
        this.percentile,
        this.fromDate,
        this.toDate,
        this.rollup,
        this.timeZoneId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ReportJsonService.ReportRequest#percentile() percentile} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for percentile (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableReportRequest withPercentile(@Nullable Double value) {
    if (Objects.equal(this.percentile, value)) return this;
    return new ImmutableReportRequest(
        this.agentRollupIds,
        this.metric,
        this.transactionType,
        this.transactionName,
        value,
        this.fromDate,
        this.toDate,
        this.rollup,
        this.timeZoneId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ReportJsonService.ReportRequest#fromDate() fromDate} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for fromDate
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableReportRequest withFromDate(String value) {
    if (this.fromDate.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "fromDate");
    return new ImmutableReportRequest(
        this.agentRollupIds,
        this.metric,
        this.transactionType,
        this.transactionName,
        this.percentile,
        newValue,
        this.toDate,
        this.rollup,
        this.timeZoneId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ReportJsonService.ReportRequest#toDate() toDate} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for toDate
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableReportRequest withToDate(String value) {
    if (this.toDate.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "toDate");
    return new ImmutableReportRequest(
        this.agentRollupIds,
        this.metric,
        this.transactionType,
        this.transactionName,
        this.percentile,
        this.fromDate,
        newValue,
        this.rollup,
        this.timeZoneId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ReportJsonService.ReportRequest#rollup() rollup} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for rollup
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableReportRequest withRollup(ReportJsonService.ROLLUP value) {
    if (this.rollup == value) return this;
    ReportJsonService.ROLLUP newValue = Preconditions.checkNotNull(value, "rollup");
    return new ImmutableReportRequest(
        this.agentRollupIds,
        this.metric,
        this.transactionType,
        this.transactionName,
        this.percentile,
        this.fromDate,
        this.toDate,
        newValue,
        this.timeZoneId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ReportJsonService.ReportRequest#timeZoneId() timeZoneId} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for timeZoneId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableReportRequest withTimeZoneId(String value) {
    if (this.timeZoneId.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "timeZoneId");
    return new ImmutableReportRequest(
        this.agentRollupIds,
        this.metric,
        this.transactionType,
        this.transactionName,
        this.percentile,
        this.fromDate,
        this.toDate,
        this.rollup,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableReportRequest} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableReportRequest
        && equalTo((ImmutableReportRequest) another);
  }

  private boolean equalTo(ImmutableReportRequest another) {
    return agentRollupIds.equals(another.agentRollupIds)
        && metric.equals(another.metric)
        && Objects.equal(transactionType, another.transactionType)
        && Objects.equal(transactionName, another.transactionName)
        && Objects.equal(percentile, another.percentile)
        && fromDate.equals(another.fromDate)
        && toDate.equals(another.toDate)
        && rollup.equals(another.rollup)
        && timeZoneId.equals(another.timeZoneId);
  }

  /**
   * Computes a hash code from attributes: {@code agentRollupIds}, {@code metric}, {@code transactionType}, {@code transactionName}, {@code percentile}, {@code fromDate}, {@code toDate}, {@code rollup}, {@code timeZoneId}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + agentRollupIds.hashCode();
    h += (h << 5) + metric.hashCode();
    h += (h << 5) + Objects.hashCode(transactionType);
    h += (h << 5) + Objects.hashCode(transactionName);
    h += (h << 5) + Objects.hashCode(percentile);
    h += (h << 5) + fromDate.hashCode();
    h += (h << 5) + toDate.hashCode();
    h += (h << 5) + rollup.hashCode();
    h += (h << 5) + timeZoneId.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code ReportRequest} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("ReportRequest")
        .omitNullValues()
        .add("agentRollupIds", agentRollupIds)
        .add("metric", metric)
        .add("transactionType", transactionType)
        .add("transactionName", transactionName)
        .add("percentile", percentile)
        .add("fromDate", fromDate)
        .add("toDate", toDate)
        .add("rollup", rollup)
        .add("timeZoneId", timeZoneId)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ReportJsonService.ReportRequest {
    List<String> agentRollupIds = ImmutableList.of();
    @Nullable String metric;
    @Nullable String transactionType;
    @Nullable String transactionName;
    @Nullable Double percentile;
    @Nullable String fromDate;
    @Nullable String toDate;
    @Nullable ReportJsonService.ROLLUP rollup;
    @Nullable String timeZoneId;
    @JsonProperty("agentRollupIds")
    public void setAgentRollupIds(List<String> agentRollupIds) {
      this.agentRollupIds = agentRollupIds;
    }
    @JsonProperty("metric")
    public void setMetric(String metric) {
      this.metric = metric;
    }
    @JsonProperty("transactionType")
    public void setTransactionType(@Nullable String transactionType) {
      this.transactionType = transactionType;
    }
    @JsonProperty("transactionName")
    public void setTransactionName(@Nullable String transactionName) {
      this.transactionName = transactionName;
    }
    @JsonProperty("percentile")
    public void setPercentile(@Nullable Double percentile) {
      this.percentile = percentile;
    }
    @JsonProperty("fromDate")
    public void setFromDate(String fromDate) {
      this.fromDate = fromDate;
    }
    @JsonProperty("toDate")
    public void setToDate(String toDate) {
      this.toDate = toDate;
    }
    @JsonProperty("rollup")
    public void setRollup(ReportJsonService.ROLLUP rollup) {
      this.rollup = rollup;
    }
    @JsonProperty("timeZoneId")
    public void setTimeZoneId(String timeZoneId) {
      this.timeZoneId = timeZoneId;
    }
    @Override
    public List<String> agentRollupIds() { throw new UnsupportedOperationException(); }
    @Override
    public String metric() { throw new UnsupportedOperationException(); }
    @Override
    public String transactionType() { throw new UnsupportedOperationException(); }
    @Override
    public String transactionName() { throw new UnsupportedOperationException(); }
    @Override
    public Double percentile() { throw new UnsupportedOperationException(); }
    @Override
    public String fromDate() { throw new UnsupportedOperationException(); }
    @Override
    public String toDate() { throw new UnsupportedOperationException(); }
    @Override
    public ReportJsonService.ROLLUP rollup() { throw new UnsupportedOperationException(); }
    @Override
    public String timeZoneId() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableReportRequest fromJson(Json json) {
    ImmutableReportRequest.Builder builder = ImmutableReportRequest.builder();
    if (json.agentRollupIds != null) {
      builder.addAllAgentRollupIds(json.agentRollupIds);
    }
    if (json.metric != null) {
      builder.metric(json.metric);
    }
    if (json.transactionType != null) {
      builder.transactionType(json.transactionType);
    }
    if (json.transactionName != null) {
      builder.transactionName(json.transactionName);
    }
    if (json.percentile != null) {
      builder.percentile(json.percentile);
    }
    if (json.fromDate != null) {
      builder.fromDate(json.fromDate);
    }
    if (json.toDate != null) {
      builder.toDate(json.toDate);
    }
    if (json.rollup != null) {
      builder.rollup(json.rollup);
    }
    if (json.timeZoneId != null) {
      builder.timeZoneId(json.timeZoneId);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ReportJsonService.ReportRequest} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ReportRequest instance
   */
  public static ImmutableReportRequest copyOf(ReportJsonService.ReportRequest instance) {
    if (instance instanceof ImmutableReportRequest) {
      return (ImmutableReportRequest) instance;
    }
    return ImmutableReportRequest.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableReportRequest ImmutableReportRequest}.
   * @return A new ImmutableReportRequest builder
   */
  public static ImmutableReportRequest.Builder builder() {
    return new ImmutableReportRequest.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableReportRequest ImmutableReportRequest}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_METRIC = 0x1L;
    private static final long INIT_BIT_FROM_DATE = 0x2L;
    private static final long INIT_BIT_TO_DATE = 0x4L;
    private static final long INIT_BIT_ROLLUP = 0x8L;
    private static final long INIT_BIT_TIME_ZONE_ID = 0x10L;
    private long initBits = 0x1fL;

    private ImmutableList.Builder<String> agentRollupIds = ImmutableList.builder();
    private @Nullable String metric;
    private @Nullable String transactionType;
    private @Nullable String transactionName;
    private @Nullable Double percentile;
    private @Nullable String fromDate;
    private @Nullable String toDate;
    private @Nullable ReportJsonService.ROLLUP rollup;
    private @Nullable String timeZoneId;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code ReportRequest} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(ReportJsonService.ReportRequest instance) {
      Preconditions.checkNotNull(instance, "instance");
      addAllAgentRollupIds(instance.agentRollupIds());
      metric(instance.metric());
      @Nullable String transactionTypeValue = instance.transactionType();
      if (transactionTypeValue != null) {
        transactionType(transactionTypeValue);
      }
      @Nullable String transactionNameValue = instance.transactionName();
      if (transactionNameValue != null) {
        transactionName(transactionNameValue);
      }
      @Nullable Double percentileValue = instance.percentile();
      if (percentileValue != null) {
        percentile(percentileValue);
      }
      fromDate(instance.fromDate());
      toDate(instance.toDate());
      rollup(instance.rollup());
      timeZoneId(instance.timeZoneId());
      return this;
    }

    /**
     * Adds one element to {@link ReportJsonService.ReportRequest#agentRollupIds() agentRollupIds} list.
     * @param element A agentRollupIds element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAgentRollupIds(String element) {
      this.agentRollupIds.add(element);
      return this;
    }

    /**
     * Adds elements to {@link ReportJsonService.ReportRequest#agentRollupIds() agentRollupIds} list.
     * @param elements An array of agentRollupIds elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAgentRollupIds(String... elements) {
      this.agentRollupIds.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link ReportJsonService.ReportRequest#agentRollupIds() agentRollupIds} list.
     * @param elements An iterable of agentRollupIds elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder agentRollupIds(Iterable<String> elements) {
      this.agentRollupIds = ImmutableList.builder();
      return addAllAgentRollupIds(elements);
    }

    /**
     * Adds elements to {@link ReportJsonService.ReportRequest#agentRollupIds() agentRollupIds} list.
     * @param elements An iterable of agentRollupIds elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllAgentRollupIds(Iterable<String> elements) {
      this.agentRollupIds.addAll(elements);
      return this;
    }

    /**
     * Initializes the value for the {@link ReportJsonService.ReportRequest#metric() metric} attribute.
     * @param metric The value for metric 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder metric(String metric) {
      this.metric = Preconditions.checkNotNull(metric, "metric");
      initBits &= ~INIT_BIT_METRIC;
      return this;
    }

    /**
     * Initializes the value for the {@link ReportJsonService.ReportRequest#transactionType() transactionType} attribute.
     * @param transactionType The value for transactionType (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder transactionType(@Nullable String transactionType) {
      this.transactionType = transactionType;
      return this;
    }

    /**
     * Initializes the value for the {@link ReportJsonService.ReportRequest#transactionName() transactionName} attribute.
     * @param transactionName The value for transactionName (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder transactionName(@Nullable String transactionName) {
      this.transactionName = transactionName;
      return this;
    }

    /**
     * Initializes the value for the {@link ReportJsonService.ReportRequest#percentile() percentile} attribute.
     * @param percentile The value for percentile (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder percentile(@Nullable Double percentile) {
      this.percentile = percentile;
      return this;
    }

    /**
     * Initializes the value for the {@link ReportJsonService.ReportRequest#fromDate() fromDate} attribute.
     * @param fromDate The value for fromDate 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder fromDate(String fromDate) {
      this.fromDate = Preconditions.checkNotNull(fromDate, "fromDate");
      initBits &= ~INIT_BIT_FROM_DATE;
      return this;
    }

    /**
     * Initializes the value for the {@link ReportJsonService.ReportRequest#toDate() toDate} attribute.
     * @param toDate The value for toDate 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder toDate(String toDate) {
      this.toDate = Preconditions.checkNotNull(toDate, "toDate");
      initBits &= ~INIT_BIT_TO_DATE;
      return this;
    }

    /**
     * Initializes the value for the {@link ReportJsonService.ReportRequest#rollup() rollup} attribute.
     * @param rollup The value for rollup 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder rollup(ReportJsonService.ROLLUP rollup) {
      this.rollup = Preconditions.checkNotNull(rollup, "rollup");
      initBits &= ~INIT_BIT_ROLLUP;
      return this;
    }

    /**
     * Initializes the value for the {@link ReportJsonService.ReportRequest#timeZoneId() timeZoneId} attribute.
     * @param timeZoneId The value for timeZoneId 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder timeZoneId(String timeZoneId) {
      this.timeZoneId = Preconditions.checkNotNull(timeZoneId, "timeZoneId");
      initBits &= ~INIT_BIT_TIME_ZONE_ID;
      return this;
    }

    /**
     * Builds a new {@link ImmutableReportRequest ImmutableReportRequest}.
     * @return An immutable instance of ReportRequest
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableReportRequest build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableReportRequest(
          agentRollupIds.build(),
          metric,
          transactionType,
          transactionName,
          percentile,
          fromDate,
          toDate,
          rollup,
          timeZoneId);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_METRIC) != 0) attributes.add("metric");
      if ((initBits & INIT_BIT_FROM_DATE) != 0) attributes.add("fromDate");
      if ((initBits & INIT_BIT_TO_DATE) != 0) attributes.add("toDate");
      if ((initBits & INIT_BIT_ROLLUP) != 0) attributes.add("rollup");
      if ((initBits & INIT_BIT_TIME_ZONE_ID) != 0) attributes.add("timeZoneId");
      return "Cannot build ReportRequest, some of required attributes are not set " + attributes;
    }
  }
}
