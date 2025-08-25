package org.glowroot.agent.shaded.glowroot.ui;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import org.glowroot.agent.shaded.google.common.collect.ImmutableList;
import org.glowroot.agent.shaded.google.common.collect.Lists;
import org.glowroot.agent.shaded.google.common.primitives.Ints;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link AdminJsonService.CentralStorageConfigDto}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCentralStorageConfigDto.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "AdminJsonService.CentralStorageConfigDto"})
@Immutable
final class ImmutableCentralStorageConfigDto
    extends AdminJsonService.CentralStorageConfigDto {
  private final ImmutableList<Integer> rollupExpirationHours;
  private final int traceExpirationHours;
  private final int fullQueryTextExpirationHours;
  private final String version;

  private ImmutableCentralStorageConfigDto(
      ImmutableList<Integer> rollupExpirationHours,
      int traceExpirationHours,
      int fullQueryTextExpirationHours,
      String version) {
    this.rollupExpirationHours = rollupExpirationHours;
    this.traceExpirationHours = traceExpirationHours;
    this.fullQueryTextExpirationHours = fullQueryTextExpirationHours;
    this.version = version;
  }

  /**
   * @return The value of the {@code rollupExpirationHours} attribute
   */
  @JsonProperty("rollupExpirationHours")
  @Override
  ImmutableList<Integer> rollupExpirationHours() {
    return rollupExpirationHours;
  }

  /**
   * @return The value of the {@code traceExpirationHours} attribute
   */
  @JsonProperty("traceExpirationHours")
  @Override
  int traceExpirationHours() {
    return traceExpirationHours;
  }

  /**
   * @return The value of the {@code fullQueryTextExpirationHours} attribute
   */
  @JsonProperty("fullQueryTextExpirationHours")
  @Override
  int fullQueryTextExpirationHours() {
    return fullQueryTextExpirationHours;
  }

  /**
   * @return The value of the {@code version} attribute
   */
  @JsonProperty("version")
  @Override
  String version() {
    return version;
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link AdminJsonService.CentralStorageConfigDto#rollupExpirationHours() rollupExpirationHours}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCentralStorageConfigDto withRollupExpirationHours(int... elements) {
    ImmutableList<Integer> newValue = ImmutableList.copyOf(Ints.asList(elements));
    return new ImmutableCentralStorageConfigDto(newValue, this.traceExpirationHours, this.fullQueryTextExpirationHours, this.version);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link AdminJsonService.CentralStorageConfigDto#rollupExpirationHours() rollupExpirationHours}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of rollupExpirationHours elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCentralStorageConfigDto withRollupExpirationHours(Iterable<Integer> elements) {
    if (this.rollupExpirationHours == elements) return this;
    ImmutableList<Integer> newValue = ImmutableList.copyOf(elements);
    return new ImmutableCentralStorageConfigDto(newValue, this.traceExpirationHours, this.fullQueryTextExpirationHours, this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AdminJsonService.CentralStorageConfigDto#traceExpirationHours() traceExpirationHours} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for traceExpirationHours
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCentralStorageConfigDto withTraceExpirationHours(int value) {
    if (this.traceExpirationHours == value) return this;
    return new ImmutableCentralStorageConfigDto(this.rollupExpirationHours, value, this.fullQueryTextExpirationHours, this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AdminJsonService.CentralStorageConfigDto#fullQueryTextExpirationHours() fullQueryTextExpirationHours} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for fullQueryTextExpirationHours
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCentralStorageConfigDto withFullQueryTextExpirationHours(int value) {
    if (this.fullQueryTextExpirationHours == value) return this;
    return new ImmutableCentralStorageConfigDto(this.rollupExpirationHours, this.traceExpirationHours, value, this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AdminJsonService.CentralStorageConfigDto#version() version} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for version
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCentralStorageConfigDto withVersion(String value) {
    if (this.version.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "version");
    return new ImmutableCentralStorageConfigDto(
        this.rollupExpirationHours,
        this.traceExpirationHours,
        this.fullQueryTextExpirationHours,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCentralStorageConfigDto} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCentralStorageConfigDto
        && equalTo((ImmutableCentralStorageConfigDto) another);
  }

  private boolean equalTo(ImmutableCentralStorageConfigDto another) {
    return rollupExpirationHours.equals(another.rollupExpirationHours)
        && traceExpirationHours == another.traceExpirationHours
        && fullQueryTextExpirationHours == another.fullQueryTextExpirationHours
        && version.equals(another.version);
  }

  /**
   * Computes a hash code from attributes: {@code rollupExpirationHours}, {@code traceExpirationHours}, {@code fullQueryTextExpirationHours}, {@code version}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + rollupExpirationHours.hashCode();
    h += (h << 5) + traceExpirationHours;
    h += (h << 5) + fullQueryTextExpirationHours;
    h += (h << 5) + version.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code CentralStorageConfigDto} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("CentralStorageConfigDto")
        .omitNullValues()
        .add("rollupExpirationHours", rollupExpirationHours)
        .add("traceExpirationHours", traceExpirationHours)
        .add("fullQueryTextExpirationHours", fullQueryTextExpirationHours)
        .add("version", version)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends AdminJsonService.CentralStorageConfigDto {
    ImmutableList<Integer> rollupExpirationHours = ImmutableList.of();
    int traceExpirationHours;
    boolean traceExpirationHoursIsSet;
    int fullQueryTextExpirationHours;
    boolean fullQueryTextExpirationHoursIsSet;
    @Nullable String version;
    @JsonProperty("rollupExpirationHours")
    public void setRollupExpirationHours(ImmutableList<Integer> rollupExpirationHours) {
      this.rollupExpirationHours = rollupExpirationHours;
    }
    @JsonProperty("traceExpirationHours")
    public void setTraceExpirationHours(int traceExpirationHours) {
      this.traceExpirationHours = traceExpirationHours;
      this.traceExpirationHoursIsSet = true;
    }
    @JsonProperty("fullQueryTextExpirationHours")
    public void setFullQueryTextExpirationHours(int fullQueryTextExpirationHours) {
      this.fullQueryTextExpirationHours = fullQueryTextExpirationHours;
      this.fullQueryTextExpirationHoursIsSet = true;
    }
    @JsonProperty("version")
    public void setVersion(String version) {
      this.version = version;
    }
    @Override
    ImmutableList<Integer> rollupExpirationHours() { throw new UnsupportedOperationException(); }
    @Override
    int traceExpirationHours() { throw new UnsupportedOperationException(); }
    @Override
    int fullQueryTextExpirationHours() { throw new UnsupportedOperationException(); }
    @Override
    String version() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableCentralStorageConfigDto fromJson(Json json) {
    ImmutableCentralStorageConfigDto.Builder builder = ImmutableCentralStorageConfigDto.builder();
    if (json.rollupExpirationHours != null) {
      builder.addAllRollupExpirationHours(json.rollupExpirationHours);
    }
    if (json.traceExpirationHoursIsSet) {
      builder.traceExpirationHours(json.traceExpirationHours);
    }
    if (json.fullQueryTextExpirationHoursIsSet) {
      builder.fullQueryTextExpirationHours(json.fullQueryTextExpirationHours);
    }
    if (json.version != null) {
      builder.version(json.version);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link AdminJsonService.CentralStorageConfigDto} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable CentralStorageConfigDto instance
   */
  public static ImmutableCentralStorageConfigDto copyOf(AdminJsonService.CentralStorageConfigDto instance) {
    if (instance instanceof ImmutableCentralStorageConfigDto) {
      return (ImmutableCentralStorageConfigDto) instance;
    }
    return ImmutableCentralStorageConfigDto.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableCentralStorageConfigDto ImmutableCentralStorageConfigDto}.
   * @return A new ImmutableCentralStorageConfigDto builder
   */
  public static ImmutableCentralStorageConfigDto.Builder builder() {
    return new ImmutableCentralStorageConfigDto.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableCentralStorageConfigDto ImmutableCentralStorageConfigDto}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_TRACE_EXPIRATION_HOURS = 0x1L;
    private static final long INIT_BIT_FULL_QUERY_TEXT_EXPIRATION_HOURS = 0x2L;
    private static final long INIT_BIT_VERSION = 0x4L;
    private long initBits = 0x7L;

    private ImmutableList.Builder<Integer> rollupExpirationHours = ImmutableList.builder();
    private int traceExpirationHours;
    private int fullQueryTextExpirationHours;
    private @Nullable String version;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code CentralStorageConfigDto} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(AdminJsonService.CentralStorageConfigDto instance) {
      Preconditions.checkNotNull(instance, "instance");
      addAllRollupExpirationHours(instance.rollupExpirationHours());
      traceExpirationHours(instance.traceExpirationHours());
      fullQueryTextExpirationHours(instance.fullQueryTextExpirationHours());
      version(instance.version());
      return this;
    }

    /**
     * Adds one element to {@link AdminJsonService.CentralStorageConfigDto#rollupExpirationHours() rollupExpirationHours} list.
     * @param element A rollupExpirationHours element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addRollupExpirationHours(int element) {
      this.rollupExpirationHours.add(element);
      return this;
    }

    /**
     * Adds elements to {@link AdminJsonService.CentralStorageConfigDto#rollupExpirationHours() rollupExpirationHours} list.
     * @param elements An array of rollupExpirationHours elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addRollupExpirationHours(int... elements) {
      this.rollupExpirationHours.addAll(Ints.asList(elements));
      return this;
    }

    /**
     * Sets or replaces all elements for {@link AdminJsonService.CentralStorageConfigDto#rollupExpirationHours() rollupExpirationHours} list.
     * @param elements An iterable of rollupExpirationHours elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder rollupExpirationHours(Iterable<Integer> elements) {
      this.rollupExpirationHours = ImmutableList.builder();
      return addAllRollupExpirationHours(elements);
    }

    /**
     * Adds elements to {@link AdminJsonService.CentralStorageConfigDto#rollupExpirationHours() rollupExpirationHours} list.
     * @param elements An iterable of rollupExpirationHours elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllRollupExpirationHours(Iterable<Integer> elements) {
      this.rollupExpirationHours.addAll(elements);
      return this;
    }

    /**
     * Initializes the value for the {@link AdminJsonService.CentralStorageConfigDto#traceExpirationHours() traceExpirationHours} attribute.
     * @param traceExpirationHours The value for traceExpirationHours 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder traceExpirationHours(int traceExpirationHours) {
      this.traceExpirationHours = traceExpirationHours;
      initBits &= ~INIT_BIT_TRACE_EXPIRATION_HOURS;
      return this;
    }

    /**
     * Initializes the value for the {@link AdminJsonService.CentralStorageConfigDto#fullQueryTextExpirationHours() fullQueryTextExpirationHours} attribute.
     * @param fullQueryTextExpirationHours The value for fullQueryTextExpirationHours 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder fullQueryTextExpirationHours(int fullQueryTextExpirationHours) {
      this.fullQueryTextExpirationHours = fullQueryTextExpirationHours;
      initBits &= ~INIT_BIT_FULL_QUERY_TEXT_EXPIRATION_HOURS;
      return this;
    }

    /**
     * Initializes the value for the {@link AdminJsonService.CentralStorageConfigDto#version() version} attribute.
     * @param version The value for version 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder version(String version) {
      this.version = Preconditions.checkNotNull(version, "version");
      initBits &= ~INIT_BIT_VERSION;
      return this;
    }

    /**
     * Builds a new {@link ImmutableCentralStorageConfigDto ImmutableCentralStorageConfigDto}.
     * @return An immutable instance of CentralStorageConfigDto
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableCentralStorageConfigDto build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableCentralStorageConfigDto(rollupExpirationHours.build(), traceExpirationHours, fullQueryTextExpirationHours, version);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_TRACE_EXPIRATION_HOURS) != 0) attributes.add("traceExpirationHours");
      if ((initBits & INIT_BIT_FULL_QUERY_TEXT_EXPIRATION_HOURS) != 0) attributes.add("fullQueryTextExpirationHours");
      if ((initBits & INIT_BIT_VERSION) != 0) attributes.add("version");
      return "Cannot build CentralStorageConfigDto, some of required attributes are not set " + attributes;
    }
  }
}
