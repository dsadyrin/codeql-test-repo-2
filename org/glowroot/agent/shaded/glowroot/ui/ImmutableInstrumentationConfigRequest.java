package org.glowroot.agent.shaded.glowroot.ui;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Optional;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link InstrumentationConfigJsonService.InstrumentationConfigRequest}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableInstrumentationConfigRequest.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "InstrumentationConfigJsonService.InstrumentationConfigRequest"})
@Immutable
final class ImmutableInstrumentationConfigRequest
    implements InstrumentationConfigJsonService.InstrumentationConfigRequest {
  private final Optional<String> version;

  private ImmutableInstrumentationConfigRequest(Optional<String> version) {
    this.version = version;
  }

  /**
   * @return The value of the {@code version} attribute
   */
  @JsonProperty("version")
  @Override
  public Optional<String> version() {
    return version;
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InstrumentationConfigJsonService.InstrumentationConfigRequest#version() version} attribute.
   * @param value The value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInstrumentationConfigRequest withVersion(String value) {
    Optional<String> newValue = Optional.of(value);
    if (this.version.equals(newValue)) return this;
    return new ImmutableInstrumentationConfigRequest(newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InstrumentationConfigJsonService.InstrumentationConfigRequest#version() version} attribute.
   * An equality check is used to prevent copying of the same value by returning {@code this}.
   * @param optional A value for version
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInstrumentationConfigRequest withVersion(Optional<String> optional) {
    Optional<String> value = (Optional<String>) optional;
    if (this.version.equals(value)) return this;
    return new ImmutableInstrumentationConfigRequest(value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableInstrumentationConfigRequest} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableInstrumentationConfigRequest
        && equalTo((ImmutableInstrumentationConfigRequest) another);
  }

  private boolean equalTo(ImmutableInstrumentationConfigRequest another) {
    return version.equals(another.version);
  }

  /**
   * Computes a hash code from attributes: {@code version}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + version.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code InstrumentationConfigRequest} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("InstrumentationConfigRequest")
        .omitNullValues()
        .add("version", version.orNull())
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json
      implements InstrumentationConfigJsonService.InstrumentationConfigRequest {
    Optional<String> version = Optional.absent();
    @JsonProperty("version")
    public void setVersion(Optional<String> version) {
      this.version = version;
    }
    @Override
    public Optional<String> version() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableInstrumentationConfigRequest fromJson(Json json) {
    ImmutableInstrumentationConfigRequest.Builder builder = ImmutableInstrumentationConfigRequest.builder();
    if (json.version != null) {
      builder.version(json.version);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link InstrumentationConfigJsonService.InstrumentationConfigRequest} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable InstrumentationConfigRequest instance
   */
  public static ImmutableInstrumentationConfigRequest copyOf(InstrumentationConfigJsonService.InstrumentationConfigRequest instance) {
    if (instance instanceof ImmutableInstrumentationConfigRequest) {
      return (ImmutableInstrumentationConfigRequest) instance;
    }
    return ImmutableInstrumentationConfigRequest.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableInstrumentationConfigRequest ImmutableInstrumentationConfigRequest}.
   * @return A new ImmutableInstrumentationConfigRequest builder
   */
  public static ImmutableInstrumentationConfigRequest.Builder builder() {
    return new ImmutableInstrumentationConfigRequest.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableInstrumentationConfigRequest ImmutableInstrumentationConfigRequest}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private Optional<String> version = Optional.absent();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code InstrumentationConfigRequest} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(InstrumentationConfigJsonService.InstrumentationConfigRequest instance) {
      Preconditions.checkNotNull(instance, "instance");
      Optional<String> versionOptional = instance.version();
      if (versionOptional.isPresent()) {
        version(versionOptional);
      }
      return this;
    }

    /**
     * Initializes the optional value {@link InstrumentationConfigJsonService.InstrumentationConfigRequest#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    public final Builder version(String version) {
      this.version = Optional.of(version);
      return this;
    }

    /**
     * Initializes the optional value {@link InstrumentationConfigJsonService.InstrumentationConfigRequest#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    @SuppressWarnings("unchecked") // safe covariant cast
    public final Builder version(Optional<String> version) {
      this.version = (Optional<String>) version;
      return this;
    }

    /**
     * Builds a new {@link ImmutableInstrumentationConfigRequest ImmutableInstrumentationConfigRequest}.
     * @return An immutable instance of InstrumentationConfigRequest
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableInstrumentationConfigRequest build() {
      return new ImmutableInstrumentationConfigRequest(version);
    }
  }
}
