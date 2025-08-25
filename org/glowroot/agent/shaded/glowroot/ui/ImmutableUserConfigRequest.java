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
 * Immutable implementation of {@link UserConfigJsonService.UserConfigRequest}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableUserConfigRequest.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "UserConfigJsonService.UserConfigRequest"})
@Immutable
final class ImmutableUserConfigRequest
    implements UserConfigJsonService.UserConfigRequest {
  private final Optional<String> username;

  private ImmutableUserConfigRequest(Optional<String> username) {
    this.username = username;
  }

  /**
   * @return The value of the {@code username} attribute
   */
  @JsonProperty("username")
  @Override
  public Optional<String> username() {
    return username;
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link UserConfigJsonService.UserConfigRequest#username() username} attribute.
   * @param value The value for username
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUserConfigRequest withUsername(String value) {
    Optional<String> newValue = Optional.of(value);
    if (this.username.equals(newValue)) return this;
    return new ImmutableUserConfigRequest(newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link UserConfigJsonService.UserConfigRequest#username() username} attribute.
   * An equality check is used to prevent copying of the same value by returning {@code this}.
   * @param optional A value for username
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableUserConfigRequest withUsername(Optional<String> optional) {
    Optional<String> value = (Optional<String>) optional;
    if (this.username.equals(value)) return this;
    return new ImmutableUserConfigRequest(value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableUserConfigRequest} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableUserConfigRequest
        && equalTo((ImmutableUserConfigRequest) another);
  }

  private boolean equalTo(ImmutableUserConfigRequest another) {
    return username.equals(another.username);
  }

  /**
   * Computes a hash code from attributes: {@code username}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + username.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code UserConfigRequest} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("UserConfigRequest")
        .omitNullValues()
        .add("username", username.orNull())
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements UserConfigJsonService.UserConfigRequest {
    Optional<String> username = Optional.absent();
    @JsonProperty("username")
    public void setUsername(Optional<String> username) {
      this.username = username;
    }
    @Override
    public Optional<String> username() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableUserConfigRequest fromJson(Json json) {
    ImmutableUserConfigRequest.Builder builder = ImmutableUserConfigRequest.builder();
    if (json.username != null) {
      builder.username(json.username);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link UserConfigJsonService.UserConfigRequest} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable UserConfigRequest instance
   */
  public static ImmutableUserConfigRequest copyOf(UserConfigJsonService.UserConfigRequest instance) {
    if (instance instanceof ImmutableUserConfigRequest) {
      return (ImmutableUserConfigRequest) instance;
    }
    return ImmutableUserConfigRequest.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableUserConfigRequest ImmutableUserConfigRequest}.
   * @return A new ImmutableUserConfigRequest builder
   */
  public static ImmutableUserConfigRequest.Builder builder() {
    return new ImmutableUserConfigRequest.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableUserConfigRequest ImmutableUserConfigRequest}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private Optional<String> username = Optional.absent();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code UserConfigRequest} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(UserConfigJsonService.UserConfigRequest instance) {
      Preconditions.checkNotNull(instance, "instance");
      Optional<String> usernameOptional = instance.username();
      if (usernameOptional.isPresent()) {
        username(usernameOptional);
      }
      return this;
    }

    /**
     * Initializes the optional value {@link UserConfigJsonService.UserConfigRequest#username() username} to username.
     * @param username The value for username
     * @return {@code this} builder for chained invocation
     */
    public final Builder username(String username) {
      this.username = Optional.of(username);
      return this;
    }

    /**
     * Initializes the optional value {@link UserConfigJsonService.UserConfigRequest#username() username} to username.
     * @param username The value for username
     * @return {@code this} builder for use in a chained invocation
     */
    @SuppressWarnings("unchecked") // safe covariant cast
    public final Builder username(Optional<String> username) {
      this.username = (Optional<String>) username;
      return this;
    }

    /**
     * Builds a new {@link ImmutableUserConfigRequest ImmutableUserConfigRequest}.
     * @return An immutable instance of UserConfigRequest
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableUserConfigRequest build() {
      return new ImmutableUserConfigRequest(username);
    }
  }
}
