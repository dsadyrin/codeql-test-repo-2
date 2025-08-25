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
 * Immutable implementation of {@link GaugeValueJsonService.GaugeValueRequest}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableGaugeValueRequest.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "GaugeValueJsonService.GaugeValueRequest"})
@Immutable
final class ImmutableGaugeValueRequest
    implements GaugeValueJsonService.GaugeValueRequest {
  private final long from;
  private final long to;
  private final ImmutableList<String> gaugeName;

  private ImmutableGaugeValueRequest(long from, long to, ImmutableList<String> gaugeName) {
    this.from = from;
    this.to = to;
    this.gaugeName = gaugeName;
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
   * @return The value of the {@code gaugeName} attribute
   */
  @JsonProperty("gaugeName")
  @Override
  public ImmutableList<String> gaugeName() {
    return gaugeName;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link GaugeValueJsonService.GaugeValueRequest#from() from} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for from
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableGaugeValueRequest withFrom(long value) {
    if (this.from == value) return this;
    return new ImmutableGaugeValueRequest(value, this.to, this.gaugeName);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link GaugeValueJsonService.GaugeValueRequest#to() to} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for to
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableGaugeValueRequest withTo(long value) {
    if (this.to == value) return this;
    return new ImmutableGaugeValueRequest(this.from, value, this.gaugeName);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link GaugeValueJsonService.GaugeValueRequest#gaugeName() gaugeName}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGaugeValueRequest withGaugeName(String... elements) {
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableGaugeValueRequest(this.from, this.to, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link GaugeValueJsonService.GaugeValueRequest#gaugeName() gaugeName}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of gaugeName elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGaugeValueRequest withGaugeName(Iterable<String> elements) {
    if (this.gaugeName == elements) return this;
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableGaugeValueRequest(this.from, this.to, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableGaugeValueRequest} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableGaugeValueRequest
        && equalTo((ImmutableGaugeValueRequest) another);
  }

  private boolean equalTo(ImmutableGaugeValueRequest another) {
    return from == another.from
        && to == another.to
        && gaugeName.equals(another.gaugeName);
  }

  /**
   * Computes a hash code from attributes: {@code from}, {@code to}, {@code gaugeName}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Longs.hashCode(from);
    h += (h << 5) + Longs.hashCode(to);
    h += (h << 5) + gaugeName.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code GaugeValueRequest} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("GaugeValueRequest")
        .omitNullValues()
        .add("from", from)
        .add("to", to)
        .add("gaugeName", gaugeName)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements GaugeValueJsonService.GaugeValueRequest {
    long from;
    boolean fromIsSet;
    long to;
    boolean toIsSet;
    ImmutableList<String> gaugeName = ImmutableList.of();
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
    @JsonProperty("gaugeName")
    public void setGaugeName(ImmutableList<String> gaugeName) {
      this.gaugeName = gaugeName;
    }
    @Override
    public long from() { throw new UnsupportedOperationException(); }
    @Override
    public long to() { throw new UnsupportedOperationException(); }
    @Override
    public ImmutableList<String> gaugeName() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableGaugeValueRequest fromJson(Json json) {
    ImmutableGaugeValueRequest.Builder builder = ImmutableGaugeValueRequest.builder();
    if (json.fromIsSet) {
      builder.from(json.from);
    }
    if (json.toIsSet) {
      builder.to(json.to);
    }
    if (json.gaugeName != null) {
      builder.addAllGaugeName(json.gaugeName);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link GaugeValueJsonService.GaugeValueRequest} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable GaugeValueRequest instance
   */
  public static ImmutableGaugeValueRequest copyOf(GaugeValueJsonService.GaugeValueRequest instance) {
    if (instance instanceof ImmutableGaugeValueRequest) {
      return (ImmutableGaugeValueRequest) instance;
    }
    return ImmutableGaugeValueRequest.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableGaugeValueRequest ImmutableGaugeValueRequest}.
   * @return A new ImmutableGaugeValueRequest builder
   */
  public static ImmutableGaugeValueRequest.Builder builder() {
    return new ImmutableGaugeValueRequest.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableGaugeValueRequest ImmutableGaugeValueRequest}.
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
    private ImmutableList.Builder<String> gaugeName = ImmutableList.builder();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code GaugeValueRequest} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(GaugeValueJsonService.GaugeValueRequest instance) {
      Preconditions.checkNotNull(instance, "instance");
      from(instance.from());
      to(instance.to());
      addAllGaugeName(instance.gaugeName());
      return this;
    }

    /**
     * Initializes the value for the {@link GaugeValueJsonService.GaugeValueRequest#from() from} attribute.
     * @param from The value for from 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(long from) {
      this.from = from;
      initBits &= ~INIT_BIT_FROM;
      return this;
    }

    /**
     * Initializes the value for the {@link GaugeValueJsonService.GaugeValueRequest#to() to} attribute.
     * @param to The value for to 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder to(long to) {
      this.to = to;
      initBits &= ~INIT_BIT_TO;
      return this;
    }

    /**
     * Adds one element to {@link GaugeValueJsonService.GaugeValueRequest#gaugeName() gaugeName} list.
     * @param element A gaugeName element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addGaugeName(String element) {
      this.gaugeName.add(element);
      return this;
    }

    /**
     * Adds elements to {@link GaugeValueJsonService.GaugeValueRequest#gaugeName() gaugeName} list.
     * @param elements An array of gaugeName elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addGaugeName(String... elements) {
      this.gaugeName.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link GaugeValueJsonService.GaugeValueRequest#gaugeName() gaugeName} list.
     * @param elements An iterable of gaugeName elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder gaugeName(Iterable<String> elements) {
      this.gaugeName = ImmutableList.builder();
      return addAllGaugeName(elements);
    }

    /**
     * Adds elements to {@link GaugeValueJsonService.GaugeValueRequest#gaugeName() gaugeName} list.
     * @param elements An iterable of gaugeName elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllGaugeName(Iterable<String> elements) {
      this.gaugeName.addAll(elements);
      return this;
    }

    /**
     * Builds a new {@link ImmutableGaugeValueRequest ImmutableGaugeValueRequest}.
     * @return An immutable instance of GaugeValueRequest
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableGaugeValueRequest build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableGaugeValueRequest(from, to, gaugeName.build());
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_FROM) != 0) attributes.add("from");
      if ((initBits & INIT_BIT_TO) != 0) attributes.add("to");
      return "Cannot build GaugeValueRequest, some of required attributes are not set " + attributes;
    }
  }
}
