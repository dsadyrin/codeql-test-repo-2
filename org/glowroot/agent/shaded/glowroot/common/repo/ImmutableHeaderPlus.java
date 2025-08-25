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
import org.glowroot.agent.shaded.glowroot.common.live.LiveTraceRepository;
import org.glowroot.agent.shaded.glowroot.wire.api.model.TraceOuterClass;

/**
 * Immutable implementation of {@link TraceRepository.HeaderPlus}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableHeaderPlus.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code ImmutableHeaderPlus.of()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "TraceRepository.HeaderPlus"})
@Immutable
public final class ImmutableHeaderPlus implements TraceRepository.HeaderPlus {
  private final TraceOuterClass.Trace.Header header;
  private final LiveTraceRepository.Existence entriesExistence;
  private final LiveTraceRepository.Existence profileExistence;

  private ImmutableHeaderPlus(
      TraceOuterClass.Trace.Header header,
      LiveTraceRepository.Existence entriesExistence,
      LiveTraceRepository.Existence profileExistence) {
    this.header = Preconditions.checkNotNull(header, "header");
    this.entriesExistence = Preconditions.checkNotNull(entriesExistence, "entriesExistence");
    this.profileExistence = Preconditions.checkNotNull(profileExistence, "profileExistence");
  }

  private ImmutableHeaderPlus(
      ImmutableHeaderPlus original,
      TraceOuterClass.Trace.Header header,
      LiveTraceRepository.Existence entriesExistence,
      LiveTraceRepository.Existence profileExistence) {
    this.header = header;
    this.entriesExistence = entriesExistence;
    this.profileExistence = profileExistence;
  }

  /**
   * @return The value of the {@code header} attribute
   */
  @JsonProperty("header")
  @Override
  public TraceOuterClass.Trace.Header header() {
    return header;
  }

  /**
   * @return The value of the {@code entriesExistence} attribute
   */
  @JsonProperty("entriesExistence")
  @Override
  public LiveTraceRepository.Existence entriesExistence() {
    return entriesExistence;
  }

  /**
   * @return The value of the {@code profileExistence} attribute
   */
  @JsonProperty("profileExistence")
  @Override
  public LiveTraceRepository.Existence profileExistence() {
    return profileExistence;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TraceRepository.HeaderPlus#header() header} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for header
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableHeaderPlus withHeader(TraceOuterClass.Trace.Header value) {
    if (this.header == value) return this;
    TraceOuterClass.Trace.Header newValue = Preconditions.checkNotNull(value, "header");
    return new ImmutableHeaderPlus(this, newValue, this.entriesExistence, this.profileExistence);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TraceRepository.HeaderPlus#entriesExistence() entriesExistence} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for entriesExistence
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableHeaderPlus withEntriesExistence(LiveTraceRepository.Existence value) {
    if (this.entriesExistence == value) return this;
    LiveTraceRepository.Existence newValue = Preconditions.checkNotNull(value, "entriesExistence");
    return new ImmutableHeaderPlus(this, this.header, newValue, this.profileExistence);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TraceRepository.HeaderPlus#profileExistence() profileExistence} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for profileExistence
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableHeaderPlus withProfileExistence(LiveTraceRepository.Existence value) {
    if (this.profileExistence == value) return this;
    LiveTraceRepository.Existence newValue = Preconditions.checkNotNull(value, "profileExistence");
    return new ImmutableHeaderPlus(this, this.header, this.entriesExistence, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableHeaderPlus} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableHeaderPlus
        && equalTo((ImmutableHeaderPlus) another);
  }

  private boolean equalTo(ImmutableHeaderPlus another) {
    return header.equals(another.header)
        && entriesExistence.equals(another.entriesExistence)
        && profileExistence.equals(another.profileExistence);
  }

  /**
   * Computes a hash code from attributes: {@code header}, {@code entriesExistence}, {@code profileExistence}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + header.hashCode();
    h += (h << 5) + entriesExistence.hashCode();
    h += (h << 5) + profileExistence.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code HeaderPlus} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("HeaderPlus")
        .omitNullValues()
        .add("header", header)
        .add("entriesExistence", entriesExistence)
        .add("profileExistence", profileExistence)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements TraceRepository.HeaderPlus {
    @Nullable TraceOuterClass.Trace.Header header;
    @Nullable LiveTraceRepository.Existence entriesExistence;
    @Nullable LiveTraceRepository.Existence profileExistence;
    @JsonProperty("header")
    public void setHeader(TraceOuterClass.Trace.Header header) {
      this.header = header;
    }
    @JsonProperty("entriesExistence")
    public void setEntriesExistence(LiveTraceRepository.Existence entriesExistence) {
      this.entriesExistence = entriesExistence;
    }
    @JsonProperty("profileExistence")
    public void setProfileExistence(LiveTraceRepository.Existence profileExistence) {
      this.profileExistence = profileExistence;
    }
    @Override
    public TraceOuterClass.Trace.Header header() { throw new UnsupportedOperationException(); }
    @Override
    public LiveTraceRepository.Existence entriesExistence() { throw new UnsupportedOperationException(); }
    @Override
    public LiveTraceRepository.Existence profileExistence() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableHeaderPlus fromJson(Json json) {
    ImmutableHeaderPlus.Builder builder = ImmutableHeaderPlus.builder();
    if (json.header != null) {
      builder.header(json.header);
    }
    if (json.entriesExistence != null) {
      builder.entriesExistence(json.entriesExistence);
    }
    if (json.profileExistence != null) {
      builder.profileExistence(json.profileExistence);
    }
    return builder.build();
  }

  /**
   * Construct a new immutable {@code HeaderPlus} instance.
   * @param header The value for the {@code header} attribute
   * @param entriesExistence The value for the {@code entriesExistence} attribute
   * @param profileExistence The value for the {@code profileExistence} attribute
   * @return An immutable HeaderPlus instance
   */
  public static ImmutableHeaderPlus of(TraceOuterClass.Trace.Header header, LiveTraceRepository.Existence entriesExistence, LiveTraceRepository.Existence profileExistence) {
    return new ImmutableHeaderPlus(header, entriesExistence, profileExistence);
  }

  /**
   * Creates an immutable copy of a {@link TraceRepository.HeaderPlus} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable HeaderPlus instance
   */
  public static ImmutableHeaderPlus copyOf(TraceRepository.HeaderPlus instance) {
    if (instance instanceof ImmutableHeaderPlus) {
      return (ImmutableHeaderPlus) instance;
    }
    return ImmutableHeaderPlus.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableHeaderPlus ImmutableHeaderPlus}.
   * @return A new ImmutableHeaderPlus builder
   */
  public static ImmutableHeaderPlus.Builder builder() {
    return new ImmutableHeaderPlus.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableHeaderPlus ImmutableHeaderPlus}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_HEADER = 0x1L;
    private static final long INIT_BIT_ENTRIES_EXISTENCE = 0x2L;
    private static final long INIT_BIT_PROFILE_EXISTENCE = 0x4L;
    private long initBits = 0x7L;

    private @Nullable TraceOuterClass.Trace.Header header;
    private @Nullable LiveTraceRepository.Existence entriesExistence;
    private @Nullable LiveTraceRepository.Existence profileExistence;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code HeaderPlus} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(TraceRepository.HeaderPlus instance) {
      Preconditions.checkNotNull(instance, "instance");
      header(instance.header());
      entriesExistence(instance.entriesExistence());
      profileExistence(instance.profileExistence());
      return this;
    }

    /**
     * Initializes the value for the {@link TraceRepository.HeaderPlus#header() header} attribute.
     * @param header The value for header 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder header(TraceOuterClass.Trace.Header header) {
      this.header = Preconditions.checkNotNull(header, "header");
      initBits &= ~INIT_BIT_HEADER;
      return this;
    }

    /**
     * Initializes the value for the {@link TraceRepository.HeaderPlus#entriesExistence() entriesExistence} attribute.
     * @param entriesExistence The value for entriesExistence 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder entriesExistence(LiveTraceRepository.Existence entriesExistence) {
      this.entriesExistence = Preconditions.checkNotNull(entriesExistence, "entriesExistence");
      initBits &= ~INIT_BIT_ENTRIES_EXISTENCE;
      return this;
    }

    /**
     * Initializes the value for the {@link TraceRepository.HeaderPlus#profileExistence() profileExistence} attribute.
     * @param profileExistence The value for profileExistence 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder profileExistence(LiveTraceRepository.Existence profileExistence) {
      this.profileExistence = Preconditions.checkNotNull(profileExistence, "profileExistence");
      initBits &= ~INIT_BIT_PROFILE_EXISTENCE;
      return this;
    }

    /**
     * Builds a new {@link ImmutableHeaderPlus ImmutableHeaderPlus}.
     * @return An immutable instance of HeaderPlus
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableHeaderPlus build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableHeaderPlus(null, header, entriesExistence, profileExistence);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_HEADER) != 0) attributes.add("header");
      if ((initBits & INIT_BIT_ENTRIES_EXISTENCE) != 0) attributes.add("entriesExistence");
      if ((initBits & INIT_BIT_PROFILE_EXISTENCE) != 0) attributes.add("profileExistence");
      return "Cannot build HeaderPlus, some of required attributes are not set " + attributes;
    }
  }
}
