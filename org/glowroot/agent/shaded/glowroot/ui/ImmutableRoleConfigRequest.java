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
 * Immutable implementation of {@link RoleConfigJsonService.RoleConfigRequest}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableRoleConfigRequest.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "RoleConfigJsonService.RoleConfigRequest"})
@Immutable
final class ImmutableRoleConfigRequest
    implements RoleConfigJsonService.RoleConfigRequest {
  private final Optional<String> name;

  private ImmutableRoleConfigRequest(Optional<String> name) {
    this.name = name;
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @JsonProperty("name")
  @Override
  public Optional<String> name() {
    return name;
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RoleConfigJsonService.RoleConfigRequest#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRoleConfigRequest withName(String value) {
    Optional<String> newValue = Optional.of(value);
    if (this.name.equals(newValue)) return this;
    return new ImmutableRoleConfigRequest(newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RoleConfigJsonService.RoleConfigRequest#name() name} attribute.
   * An equality check is used to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRoleConfigRequest withName(Optional<String> optional) {
    Optional<String> value = (Optional<String>) optional;
    if (this.name.equals(value)) return this;
    return new ImmutableRoleConfigRequest(value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableRoleConfigRequest} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableRoleConfigRequest
        && equalTo((ImmutableRoleConfigRequest) another);
  }

  private boolean equalTo(ImmutableRoleConfigRequest another) {
    return name.equals(another.name);
  }

  /**
   * Computes a hash code from attributes: {@code name}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + name.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code RoleConfigRequest} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("RoleConfigRequest")
        .omitNullValues()
        .add("name", name.orNull())
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements RoleConfigJsonService.RoleConfigRequest {
    Optional<String> name = Optional.absent();
    @JsonProperty("name")
    public void setName(Optional<String> name) {
      this.name = name;
    }
    @Override
    public Optional<String> name() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableRoleConfigRequest fromJson(Json json) {
    ImmutableRoleConfigRequest.Builder builder = ImmutableRoleConfigRequest.builder();
    if (json.name != null) {
      builder.name(json.name);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link RoleConfigJsonService.RoleConfigRequest} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable RoleConfigRequest instance
   */
  public static ImmutableRoleConfigRequest copyOf(RoleConfigJsonService.RoleConfigRequest instance) {
    if (instance instanceof ImmutableRoleConfigRequest) {
      return (ImmutableRoleConfigRequest) instance;
    }
    return ImmutableRoleConfigRequest.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableRoleConfigRequest ImmutableRoleConfigRequest}.
   * @return A new ImmutableRoleConfigRequest builder
   */
  public static ImmutableRoleConfigRequest.Builder builder() {
    return new ImmutableRoleConfigRequest.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableRoleConfigRequest ImmutableRoleConfigRequest}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private Optional<String> name = Optional.absent();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code RoleConfigRequest} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(RoleConfigJsonService.RoleConfigRequest instance) {
      Preconditions.checkNotNull(instance, "instance");
      Optional<String> nameOptional = instance.name();
      if (nameOptional.isPresent()) {
        name(nameOptional);
      }
      return this;
    }

    /**
     * Initializes the optional value {@link RoleConfigJsonService.RoleConfigRequest#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    public final Builder name(String name) {
      this.name = Optional.of(name);
      return this;
    }

    /**
     * Initializes the optional value {@link RoleConfigJsonService.RoleConfigRequest#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    @SuppressWarnings("unchecked") // safe covariant cast
    public final Builder name(Optional<String> name) {
      this.name = (Optional<String>) name;
      return this;
    }

    /**
     * Builds a new {@link ImmutableRoleConfigRequest ImmutableRoleConfigRequest}.
     * @return An immutable instance of RoleConfigRequest
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableRoleConfigRequest build() {
      return new ImmutableRoleConfigRequest(name);
    }
  }
}
