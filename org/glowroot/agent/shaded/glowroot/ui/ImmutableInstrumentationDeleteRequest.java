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
 * Immutable implementation of {@link InstrumentationConfigJsonService.InstrumentationDeleteRequest}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableInstrumentationDeleteRequest.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "InstrumentationConfigJsonService.InstrumentationDeleteRequest"})
@Immutable
final class ImmutableInstrumentationDeleteRequest
    implements InstrumentationConfigJsonService.InstrumentationDeleteRequest {
  private final ImmutableList<String> versions;

  private ImmutableInstrumentationDeleteRequest(ImmutableList<String> versions) {
    this.versions = versions;
  }

  /**
   * @return The value of the {@code versions} attribute
   */
  @JsonProperty("versions")
  @Override
  public ImmutableList<String> versions() {
    return versions;
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link InstrumentationConfigJsonService.InstrumentationDeleteRequest#versions() versions}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInstrumentationDeleteRequest withVersions(String... elements) {
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableInstrumentationDeleteRequest(newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link InstrumentationConfigJsonService.InstrumentationDeleteRequest#versions() versions}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of versions elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInstrumentationDeleteRequest withVersions(Iterable<String> elements) {
    if (this.versions == elements) return this;
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableInstrumentationDeleteRequest(newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableInstrumentationDeleteRequest} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableInstrumentationDeleteRequest
        && equalTo((ImmutableInstrumentationDeleteRequest) another);
  }

  private boolean equalTo(ImmutableInstrumentationDeleteRequest another) {
    return versions.equals(another.versions);
  }

  /**
   * Computes a hash code from attributes: {@code versions}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + versions.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code InstrumentationDeleteRequest} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("InstrumentationDeleteRequest")
        .omitNullValues()
        .add("versions", versions)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json
      implements InstrumentationConfigJsonService.InstrumentationDeleteRequest {
    List<String> versions = ImmutableList.of();
    @JsonProperty("versions")
    public void setVersions(List<String> versions) {
      this.versions = versions;
    }
    @Override
    public List<String> versions() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableInstrumentationDeleteRequest fromJson(Json json) {
    ImmutableInstrumentationDeleteRequest.Builder builder = ImmutableInstrumentationDeleteRequest.builder();
    if (json.versions != null) {
      builder.addAllVersions(json.versions);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link InstrumentationConfigJsonService.InstrumentationDeleteRequest} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable InstrumentationDeleteRequest instance
   */
  public static ImmutableInstrumentationDeleteRequest copyOf(InstrumentationConfigJsonService.InstrumentationDeleteRequest instance) {
    if (instance instanceof ImmutableInstrumentationDeleteRequest) {
      return (ImmutableInstrumentationDeleteRequest) instance;
    }
    return ImmutableInstrumentationDeleteRequest.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableInstrumentationDeleteRequest ImmutableInstrumentationDeleteRequest}.
   * @return A new ImmutableInstrumentationDeleteRequest builder
   */
  public static ImmutableInstrumentationDeleteRequest.Builder builder() {
    return new ImmutableInstrumentationDeleteRequest.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableInstrumentationDeleteRequest ImmutableInstrumentationDeleteRequest}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private ImmutableList.Builder<String> versions = ImmutableList.builder();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code InstrumentationDeleteRequest} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(InstrumentationConfigJsonService.InstrumentationDeleteRequest instance) {
      Preconditions.checkNotNull(instance, "instance");
      addAllVersions(instance.versions());
      return this;
    }

    /**
     * Adds one element to {@link InstrumentationConfigJsonService.InstrumentationDeleteRequest#versions() versions} list.
     * @param element A versions element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addVersions(String element) {
      this.versions.add(element);
      return this;
    }

    /**
     * Adds elements to {@link InstrumentationConfigJsonService.InstrumentationDeleteRequest#versions() versions} list.
     * @param elements An array of versions elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addVersions(String... elements) {
      this.versions.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link InstrumentationConfigJsonService.InstrumentationDeleteRequest#versions() versions} list.
     * @param elements An iterable of versions elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder versions(Iterable<String> elements) {
      this.versions = ImmutableList.builder();
      return addAllVersions(elements);
    }

    /**
     * Adds elements to {@link InstrumentationConfigJsonService.InstrumentationDeleteRequest#versions() versions} list.
     * @param elements An iterable of versions elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllVersions(Iterable<String> elements) {
      this.versions.addAll(elements);
      return this;
    }

    /**
     * Builds a new {@link ImmutableInstrumentationDeleteRequest ImmutableInstrumentationDeleteRequest}.
     * @return An immutable instance of InstrumentationDeleteRequest
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableInstrumentationDeleteRequest build() {
      return new ImmutableInstrumentationDeleteRequest(versions.build());
    }
  }
}
