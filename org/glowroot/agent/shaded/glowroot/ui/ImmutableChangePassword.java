package org.glowroot.agent.shaded.glowroot.ui;

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

/**
 * Immutable implementation of {@link AdminJsonService.ChangePassword}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableChangePassword.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "AdminJsonService.ChangePassword"})
@Immutable
final class ImmutableChangePassword implements AdminJsonService.ChangePassword {
  private final String currentPassword;
  private final String newPassword;

  private ImmutableChangePassword(String currentPassword, String newPassword) {
    this.currentPassword = currentPassword;
    this.newPassword = newPassword;
  }

  /**
   * @return The value of the {@code currentPassword} attribute
   */
  @JsonProperty("currentPassword")
  @Override
  public String currentPassword() {
    return currentPassword;
  }

  /**
   * @return The value of the {@code newPassword} attribute
   */
  @JsonProperty("newPassword")
  @Override
  public String newPassword() {
    return newPassword;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AdminJsonService.ChangePassword#currentPassword() currentPassword} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for currentPassword
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableChangePassword withCurrentPassword(String value) {
    if (this.currentPassword.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "currentPassword");
    return new ImmutableChangePassword(newValue, this.newPassword);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AdminJsonService.ChangePassword#newPassword() newPassword} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for newPassword
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableChangePassword withNewPassword(String value) {
    if (this.newPassword.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "newPassword");
    return new ImmutableChangePassword(this.currentPassword, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableChangePassword} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableChangePassword
        && equalTo((ImmutableChangePassword) another);
  }

  private boolean equalTo(ImmutableChangePassword another) {
    return currentPassword.equals(another.currentPassword)
        && newPassword.equals(another.newPassword);
  }

  /**
   * Computes a hash code from attributes: {@code currentPassword}, {@code newPassword}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + currentPassword.hashCode();
    h += (h << 5) + newPassword.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code ChangePassword} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("ChangePassword")
        .omitNullValues()
        .add("currentPassword", currentPassword)
        .add("newPassword", newPassword)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements AdminJsonService.ChangePassword {
    @Nullable String currentPassword;
    @Nullable String newPassword;
    @JsonProperty("currentPassword")
    public void setCurrentPassword(String currentPassword) {
      this.currentPassword = currentPassword;
    }
    @JsonProperty("newPassword")
    public void setNewPassword(String newPassword) {
      this.newPassword = newPassword;
    }
    @Override
    public String currentPassword() { throw new UnsupportedOperationException(); }
    @Override
    public String newPassword() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableChangePassword fromJson(Json json) {
    ImmutableChangePassword.Builder builder = ImmutableChangePassword.builder();
    if (json.currentPassword != null) {
      builder.currentPassword(json.currentPassword);
    }
    if (json.newPassword != null) {
      builder.newPassword(json.newPassword);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link AdminJsonService.ChangePassword} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ChangePassword instance
   */
  public static ImmutableChangePassword copyOf(AdminJsonService.ChangePassword instance) {
    if (instance instanceof ImmutableChangePassword) {
      return (ImmutableChangePassword) instance;
    }
    return ImmutableChangePassword.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableChangePassword ImmutableChangePassword}.
   * @return A new ImmutableChangePassword builder
   */
  public static ImmutableChangePassword.Builder builder() {
    return new ImmutableChangePassword.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableChangePassword ImmutableChangePassword}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_CURRENT_PASSWORD = 0x1L;
    private static final long INIT_BIT_NEW_PASSWORD = 0x2L;
    private long initBits = 0x3L;

    private @Nullable String currentPassword;
    private @Nullable String newPassword;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code ChangePassword} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(AdminJsonService.ChangePassword instance) {
      Preconditions.checkNotNull(instance, "instance");
      currentPassword(instance.currentPassword());
      newPassword(instance.newPassword());
      return this;
    }

    /**
     * Initializes the value for the {@link AdminJsonService.ChangePassword#currentPassword() currentPassword} attribute.
     * @param currentPassword The value for currentPassword 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder currentPassword(String currentPassword) {
      this.currentPassword = Preconditions.checkNotNull(currentPassword, "currentPassword");
      initBits &= ~INIT_BIT_CURRENT_PASSWORD;
      return this;
    }

    /**
     * Initializes the value for the {@link AdminJsonService.ChangePassword#newPassword() newPassword} attribute.
     * @param newPassword The value for newPassword 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder newPassword(String newPassword) {
      this.newPassword = Preconditions.checkNotNull(newPassword, "newPassword");
      initBits &= ~INIT_BIT_NEW_PASSWORD;
      return this;
    }

    /**
     * Builds a new {@link ImmutableChangePassword ImmutableChangePassword}.
     * @return An immutable instance of ChangePassword
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableChangePassword build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableChangePassword(currentPassword, newPassword);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_CURRENT_PASSWORD) != 0) attributes.add("currentPassword");
      if ((initBits & INIT_BIT_NEW_PASSWORD) != 0) attributes.add("newPassword");
      return "Cannot build ChangePassword, some of required attributes are not set " + attributes;
    }
  }
}
