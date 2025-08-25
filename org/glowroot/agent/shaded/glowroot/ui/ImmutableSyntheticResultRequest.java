package org.glowroot.agent.shaded.glowroot.ui;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import org.glowroot.agent.shaded.google.common.collect.ImmutableList;
import org.glowroot.agent.shaded.google.common.collect.Lists;
import org.glowroot.agent.shaded.google.common.primitives.Longs;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link SyntheticResultJsonService.SyntheticResultRequest}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSyntheticResultRequest.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "SyntheticResultJsonService.SyntheticResultRequest"})
@Immutable
final class ImmutableSyntheticResultRequest
    implements SyntheticResultJsonService.SyntheticResultRequest {
  private final long from;
  private final long to;
  private final ImmutableList<String> syntheticMonitorId;

  private ImmutableSyntheticResultRequest(long from, long to, ImmutableList<String> syntheticMonitorId) {
    this.from = from;
    this.to = to;
    this.syntheticMonitorId = syntheticMonitorId;
  }

  /**
   * @return The value of the {@code from} attribute
   */
  @JsonProperty("from")
  @Override
  public long from() {
    return from;
  }

  /**
   * @return The value of the {@code to} attribute
   */
  @JsonProperty("to")
  @Override
  public long to() {
    return to;
  }

  /**
   * @return The value of the {@code syntheticMonitorId} attribute
   */
  @JsonProperty("syntheticMonitorId")
  @Override
  public ImmutableList<String> syntheticMonitorId() {
    return syntheticMonitorId;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SyntheticResultJsonService.SyntheticResultRequest#from() from} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for from
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSyntheticResultRequest withFrom(long value) {
    if (this.from == value) return this;
    return new ImmutableSyntheticResultRequest(value, this.to, this.syntheticMonitorId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SyntheticResultJsonService.SyntheticResultRequest#to() to} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for to
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSyntheticResultRequest withTo(long value) {
    if (this.to == value) return this;
    return new ImmutableSyntheticResultRequest(this.from, value, this.syntheticMonitorId);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link SyntheticResultJsonService.SyntheticResultRequest#syntheticMonitorId() syntheticMonitorId}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSyntheticResultRequest withSyntheticMonitorId(String... elements) {
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableSyntheticResultRequest(this.from, this.to, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link SyntheticResultJsonService.SyntheticResultRequest#syntheticMonitorId() syntheticMonitorId}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of syntheticMonitorId elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSyntheticResultRequest withSyntheticMonitorId(Iterable<String> elements) {
    if (this.syntheticMonitorId == elements) return this;
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableSyntheticResultRequest(this.from, this.to, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSyntheticResultRequest} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSyntheticResultRequest
        && equalTo((ImmutableSyntheticResultRequest) another);
  }

  private boolean equalTo(ImmutableSyntheticResultRequest another) {
    return from == another.from
        && to == another.to
        && syntheticMonitorId.equals(another.syntheticMonitorId);
  }

  /**
   * Computes a hash code from attributes: {@code from}, {@code to}, {@code syntheticMonitorId}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Longs.hashCode(from);
    h += (h << 5) + Longs.hashCode(to);
    h += (h << 5) + syntheticMonitorId.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code SyntheticResultRequest} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("SyntheticResultRequest")
        .omitNullValues()
        .add("from", from)
        .add("to", to)
        .add("syntheticMonitorId", syntheticMonitorId)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements SyntheticResultJsonService.SyntheticResultRequest {
    long from;
    boolean fromIsSet;
    long to;
    boolean toIsSet;
    ImmutableList<String> syntheticMonitorId = ImmutableList.of();
    @JsonProperty("from")
    public void setFrom(long from) {
      this.from = from;
      this.fromIsSet = true;
    }
    @JsonProperty("to")
    public void setTo(long to) {
      this.to = to;
      this.toIsSet = true;
    }
    @JsonProperty("syntheticMonitorId")
    public void setSyntheticMonitorId(ImmutableList<String> syntheticMonitorId) {
      this.syntheticMonitorId = syntheticMonitorId;
    }
    @Override
    public long from() { throw new UnsupportedOperationException(); }
    @Override
    public long to() { throw new UnsupportedOperationException(); }
    @Override
    public ImmutableList<String> syntheticMonitorId() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableSyntheticResultRequest fromJson(Json json) {
    ImmutableSyntheticResultRequest.Builder builder = ImmutableSyntheticResultRequest.builder();
    if (json.fromIsSet) {
      builder.from(json.from);
    }
    if (json.toIsSet) {
      builder.to(json.to);
    }
    if (json.syntheticMonitorId != null) {
      builder.addAllSyntheticMonitorId(json.syntheticMonitorId);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SyntheticResultJsonService.SyntheticResultRequest} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SyntheticResultRequest instance
   */
  public static ImmutableSyntheticResultRequest copyOf(SyntheticResultJsonService.SyntheticResultRequest instance) {
    if (instance instanceof ImmutableSyntheticResultRequest) {
      return (ImmutableSyntheticResultRequest) instance;
    }
    return ImmutableSyntheticResultRequest.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableSyntheticResultRequest ImmutableSyntheticResultRequest}.
   * @return A new ImmutableSyntheticResultRequest builder
   */
  public static ImmutableSyntheticResultRequest.Builder builder() {
    return new ImmutableSyntheticResultRequest.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableSyntheticResultRequest ImmutableSyntheticResultRequest}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_FROM = 0x1L;
    private static final long INIT_BIT_TO = 0x2L;
    private long initBits = 0x3L;

    private long from;
    private long to;
    private ImmutableList.Builder<String> syntheticMonitorId = ImmutableList.builder();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code SyntheticResultRequest} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(SyntheticResultJsonService.SyntheticResultRequest instance) {
      Preconditions.checkNotNull(instance, "instance");
      from(instance.from());
      to(instance.to());
      addAllSyntheticMonitorId(instance.syntheticMonitorId());
      return this;
    }

    /**
     * Initializes the value for the {@link SyntheticResultJsonService.SyntheticResultRequest#from() from} attribute.
     * @param from The value for from 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(long from) {
      this.from = from;
      initBits &= ~INIT_BIT_FROM;
      return this;
    }

    /**
     * Initializes the value for the {@link SyntheticResultJsonService.SyntheticResultRequest#to() to} attribute.
     * @param to The value for to 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder to(long to) {
      this.to = to;
      initBits &= ~INIT_BIT_TO;
      return this;
    }

    /**
     * Adds one element to {@link SyntheticResultJsonService.SyntheticResultRequest#syntheticMonitorId() syntheticMonitorId} list.
     * @param element A syntheticMonitorId element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addSyntheticMonitorId(String element) {
      this.syntheticMonitorId.add(element);
      return this;
    }

    /**
     * Adds elements to {@link SyntheticResultJsonService.SyntheticResultRequest#syntheticMonitorId() syntheticMonitorId} list.
     * @param elements An array of syntheticMonitorId elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addSyntheticMonitorId(String... elements) {
      this.syntheticMonitorId.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link SyntheticResultJsonService.SyntheticResultRequest#syntheticMonitorId() syntheticMonitorId} list.
     * @param elements An iterable of syntheticMonitorId elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder syntheticMonitorId(Iterable<String> elements) {
      this.syntheticMonitorId = ImmutableList.builder();
      return addAllSyntheticMonitorId(elements);
    }

    /**
     * Adds elements to {@link SyntheticResultJsonService.SyntheticResultRequest#syntheticMonitorId() syntheticMonitorId} list.
     * @param elements An iterable of syntheticMonitorId elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllSyntheticMonitorId(Iterable<String> elements) {
      this.syntheticMonitorId.addAll(elements);
      return this;
    }

    /**
     * Builds a new {@link ImmutableSyntheticResultRequest ImmutableSyntheticResultRequest}.
     * @return An immutable instance of SyntheticResultRequest
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableSyntheticResultRequest build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableSyntheticResultRequest(from, to, syntheticMonitorId.build());
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_FROM) != 0) attributes.add("from");
      if ((initBits & INIT_BIT_TO) != 0) attributes.add("to");
      return "Cannot build SyntheticResultRequest, some of required attributes are not set " + attributes;
    }
  }
}
