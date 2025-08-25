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
 * Immutable implementation of {@link SyntheticMonitorConfigJsonService.SyntheticMonitorConfigRequest}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSyntheticMonitorConfigRequest.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "SyntheticMonitorConfigJsonService.SyntheticMonitorConfigRequest"})
@Immutable
final class ImmutableSyntheticMonitorConfigRequest
    implements SyntheticMonitorConfigJsonService.SyntheticMonitorConfigRequest {
  private final Optional<String> id;

  private ImmutableSyntheticMonitorConfigRequest(Optional<String> id) {
    this.id = id;
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return id;
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SyntheticMonitorConfigJsonService.SyntheticMonitorConfigRequest#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSyntheticMonitorConfigRequest withId(String value) {
    Optional<String> newValue = Optional.of(value);
    if (this.id.equals(newValue)) return this;
    return new ImmutableSyntheticMonitorConfigRequest(newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SyntheticMonitorConfigJsonService.SyntheticMonitorConfigRequest#id() id} attribute.
   * An equality check is used to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSyntheticMonitorConfigRequest withId(Optional<String> optional) {
    Optional<String> value = (Optional<String>) optional;
    if (this.id.equals(value)) return this;
    return new ImmutableSyntheticMonitorConfigRequest(value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSyntheticMonitorConfigRequest} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSyntheticMonitorConfigRequest
        && equalTo((ImmutableSyntheticMonitorConfigRequest) another);
  }

  private boolean equalTo(ImmutableSyntheticMonitorConfigRequest another) {
    return id.equals(another.id);
  }

  /**
   * Computes a hash code from attributes: {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + id.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code SyntheticMonitorConfigRequest} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("SyntheticMonitorConfigRequest")
        .omitNullValues()
        .add("id", id.orNull())
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json
      implements SyntheticMonitorConfigJsonService.SyntheticMonitorConfigRequest {
    Optional<String> id = Optional.absent();
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
    }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableSyntheticMonitorConfigRequest fromJson(Json json) {
    ImmutableSyntheticMonitorConfigRequest.Builder builder = ImmutableSyntheticMonitorConfigRequest.builder();
    if (json.id != null) {
      builder.id(json.id);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SyntheticMonitorConfigJsonService.SyntheticMonitorConfigRequest} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SyntheticMonitorConfigRequest instance
   */
  public static ImmutableSyntheticMonitorConfigRequest copyOf(SyntheticMonitorConfigJsonService.SyntheticMonitorConfigRequest instance) {
    if (instance instanceof ImmutableSyntheticMonitorConfigRequest) {
      return (ImmutableSyntheticMonitorConfigRequest) instance;
    }
    return ImmutableSyntheticMonitorConfigRequest.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableSyntheticMonitorConfigRequest ImmutableSyntheticMonitorConfigRequest}.
   * @return A new ImmutableSyntheticMonitorConfigRequest builder
   */
  public static ImmutableSyntheticMonitorConfigRequest.Builder builder() {
    return new ImmutableSyntheticMonitorConfigRequest.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableSyntheticMonitorConfigRequest ImmutableSyntheticMonitorConfigRequest}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private Optional<String> id = Optional.absent();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code SyntheticMonitorConfigRequest} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(SyntheticMonitorConfigJsonService.SyntheticMonitorConfigRequest instance) {
      Preconditions.checkNotNull(instance, "instance");
      Optional<String> idOptional = instance.id();
      if (idOptional.isPresent()) {
        id(idOptional);
      }
      return this;
    }

    /**
     * Initializes the optional value {@link SyntheticMonitorConfigJsonService.SyntheticMonitorConfigRequest#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(String id) {
      this.id = Optional.of(id);
      return this;
    }

    /**
     * Initializes the optional value {@link SyntheticMonitorConfigJsonService.SyntheticMonitorConfigRequest#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @SuppressWarnings("unchecked") // safe covariant cast
    public final Builder id(Optional<String> id) {
      this.id = (Optional<String>) id;
      return this;
    }

    /**
     * Builds a new {@link ImmutableSyntheticMonitorConfigRequest ImmutableSyntheticMonitorConfigRequest}.
     * @return An immutable instance of SyntheticMonitorConfigRequest
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableSyntheticMonitorConfigRequest build() {
      return new ImmutableSyntheticMonitorConfigRequest(id);
    }
  }
}
