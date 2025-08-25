package org.glowroot.agent.shaded.glowroot.common.live;

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
import org.glowroot.agent.shaded.glowroot.wire.api.model.TraceOuterClass;

/**
 * Immutable implementation of {@link LiveTraceRepository.Entries}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableEntries.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "LiveTraceRepository.Entries"})
@Immutable
public final class ImmutableEntries implements LiveTraceRepository.Entries {
  private final ImmutableList<TraceOuterClass.Trace.Entry> entries;
  private final ImmutableList<TraceOuterClass.Trace.SharedQueryText> sharedQueryTexts;

  private ImmutableEntries(
      ImmutableList<TraceOuterClass.Trace.Entry> entries,
      ImmutableList<TraceOuterClass.Trace.SharedQueryText> sharedQueryTexts) {
    this.entries = entries;
    this.sharedQueryTexts = sharedQueryTexts;
  }

  /**
   * @return The value of the {@code entries} attribute
   */
  @JsonProperty("entries")
  @Override
  public ImmutableList<TraceOuterClass.Trace.Entry> entries() {
    return entries;
  }

  /**
   * @return The value of the {@code sharedQueryTexts} attribute
   */
  @JsonProperty("sharedQueryTexts")
  @Override
  public ImmutableList<TraceOuterClass.Trace.SharedQueryText> sharedQueryTexts() {
    return sharedQueryTexts;
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link LiveTraceRepository.Entries#entries() entries}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEntries withEntries(TraceOuterClass.Trace.Entry... elements) {
    ImmutableList<TraceOuterClass.Trace.Entry> newValue = ImmutableList.copyOf(elements);
    return new ImmutableEntries(newValue, this.sharedQueryTexts);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link LiveTraceRepository.Entries#entries() entries}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of entries elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEntries withEntries(Iterable<? extends TraceOuterClass.Trace.Entry> elements) {
    if (this.entries == elements) return this;
    ImmutableList<TraceOuterClass.Trace.Entry> newValue = ImmutableList.copyOf(elements);
    return new ImmutableEntries(newValue, this.sharedQueryTexts);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link LiveTraceRepository.Entries#sharedQueryTexts() sharedQueryTexts}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEntries withSharedQueryTexts(TraceOuterClass.Trace.SharedQueryText... elements) {
    ImmutableList<TraceOuterClass.Trace.SharedQueryText> newValue = ImmutableList.copyOf(elements);
    return new ImmutableEntries(this.entries, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link LiveTraceRepository.Entries#sharedQueryTexts() sharedQueryTexts}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of sharedQueryTexts elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEntries withSharedQueryTexts(Iterable<? extends TraceOuterClass.Trace.SharedQueryText> elements) {
    if (this.sharedQueryTexts == elements) return this;
    ImmutableList<TraceOuterClass.Trace.SharedQueryText> newValue = ImmutableList.copyOf(elements);
    return new ImmutableEntries(this.entries, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableEntries} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableEntries
        && equalTo((ImmutableEntries) another);
  }

  private boolean equalTo(ImmutableEntries another) {
    return entries.equals(another.entries)
        && sharedQueryTexts.equals(another.sharedQueryTexts);
  }

  /**
   * Computes a hash code from attributes: {@code entries}, {@code sharedQueryTexts}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + entries.hashCode();
    h += (h << 5) + sharedQueryTexts.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Entries} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("Entries")
        .omitNullValues()
        .add("entries", entries)
        .add("sharedQueryTexts", sharedQueryTexts)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements LiveTraceRepository.Entries {
    List<TraceOuterClass.Trace.Entry> entries = ImmutableList.of();
    List<TraceOuterClass.Trace.SharedQueryText> sharedQueryTexts = ImmutableList.of();
    @JsonProperty("entries")
    public void setEntries(List<TraceOuterClass.Trace.Entry> entries) {
      this.entries = entries;
    }
    @JsonProperty("sharedQueryTexts")
    public void setSharedQueryTexts(List<TraceOuterClass.Trace.SharedQueryText> sharedQueryTexts) {
      this.sharedQueryTexts = sharedQueryTexts;
    }
    @Override
    public List<TraceOuterClass.Trace.Entry> entries() { throw new UnsupportedOperationException(); }
    @Override
    public List<TraceOuterClass.Trace.SharedQueryText> sharedQueryTexts() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableEntries fromJson(Json json) {
    ImmutableEntries.Builder builder = ImmutableEntries.builder();
    if (json.entries != null) {
      builder.addAllEntries(json.entries);
    }
    if (json.sharedQueryTexts != null) {
      builder.addAllSharedQueryTexts(json.sharedQueryTexts);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link LiveTraceRepository.Entries} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Entries instance
   */
  public static ImmutableEntries copyOf(LiveTraceRepository.Entries instance) {
    if (instance instanceof ImmutableEntries) {
      return (ImmutableEntries) instance;
    }
    return ImmutableEntries.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableEntries ImmutableEntries}.
   * @return A new ImmutableEntries builder
   */
  public static ImmutableEntries.Builder builder() {
    return new ImmutableEntries.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableEntries ImmutableEntries}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private ImmutableList.Builder<TraceOuterClass.Trace.Entry> entries = ImmutableList.builder();
    private ImmutableList.Builder<TraceOuterClass.Trace.SharedQueryText> sharedQueryTexts = ImmutableList.builder();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Entries} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(LiveTraceRepository.Entries instance) {
      Preconditions.checkNotNull(instance, "instance");
      addAllEntries(instance.entries());
      addAllSharedQueryTexts(instance.sharedQueryTexts());
      return this;
    }

    /**
     * Adds one element to {@link LiveTraceRepository.Entries#entries() entries} list.
     * @param element A entries element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addEntries(TraceOuterClass.Trace.Entry element) {
      this.entries.add(element);
      return this;
    }

    /**
     * Adds elements to {@link LiveTraceRepository.Entries#entries() entries} list.
     * @param elements An array of entries elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addEntries(TraceOuterClass.Trace.Entry... elements) {
      this.entries.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link LiveTraceRepository.Entries#entries() entries} list.
     * @param elements An iterable of entries elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder entries(Iterable<? extends TraceOuterClass.Trace.Entry> elements) {
      this.entries = ImmutableList.builder();
      return addAllEntries(elements);
    }

    /**
     * Adds elements to {@link LiveTraceRepository.Entries#entries() entries} list.
     * @param elements An iterable of entries elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllEntries(Iterable<? extends TraceOuterClass.Trace.Entry> elements) {
      this.entries.addAll(elements);
      return this;
    }

    /**
     * Adds one element to {@link LiveTraceRepository.Entries#sharedQueryTexts() sharedQueryTexts} list.
     * @param element A sharedQueryTexts element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addSharedQueryTexts(TraceOuterClass.Trace.SharedQueryText element) {
      this.sharedQueryTexts.add(element);
      return this;
    }

    /**
     * Adds elements to {@link LiveTraceRepository.Entries#sharedQueryTexts() sharedQueryTexts} list.
     * @param elements An array of sharedQueryTexts elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addSharedQueryTexts(TraceOuterClass.Trace.SharedQueryText... elements) {
      this.sharedQueryTexts.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link LiveTraceRepository.Entries#sharedQueryTexts() sharedQueryTexts} list.
     * @param elements An iterable of sharedQueryTexts elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder sharedQueryTexts(Iterable<? extends TraceOuterClass.Trace.SharedQueryText> elements) {
      this.sharedQueryTexts = ImmutableList.builder();
      return addAllSharedQueryTexts(elements);
    }

    /**
     * Adds elements to {@link LiveTraceRepository.Entries#sharedQueryTexts() sharedQueryTexts} list.
     * @param elements An iterable of sharedQueryTexts elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllSharedQueryTexts(Iterable<? extends TraceOuterClass.Trace.SharedQueryText> elements) {
      this.sharedQueryTexts.addAll(elements);
      return this;
    }

    /**
     * Builds a new {@link ImmutableEntries ImmutableEntries}.
     * @return An immutable instance of Entries
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableEntries build() {
      return new ImmutableEntries(entries.build(), sharedQueryTexts.build());
    }
  }
}
