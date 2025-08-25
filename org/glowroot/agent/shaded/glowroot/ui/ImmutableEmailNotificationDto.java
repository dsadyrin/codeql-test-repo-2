package org.glowroot.agent.shaded.glowroot.ui;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import org.glowroot.agent.shaded.google.common.collect.ImmutableList;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link AlertConfigJsonService.AlertConfigDto.EmailNotificationDto}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableEmailNotificationDto.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "AlertConfigJsonService.AlertConfigDto.EmailNotificationDto"})
@Immutable
public final class ImmutableEmailNotificationDto
    implements AlertConfigJsonService.AlertConfigDto.EmailNotificationDto {
  private final ImmutableList<String> emailAddresses;

  private ImmutableEmailNotificationDto(ImmutableList<String> emailAddresses) {
    this.emailAddresses = emailAddresses;
  }

  /**
   * @return The value of the {@code emailAddresses} attribute
   */
  @JsonProperty("emailAddresses")
  @Override
  public ImmutableList<String> emailAddresses() {
    return emailAddresses;
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link AlertConfigJsonService.AlertConfigDto.EmailNotificationDto#emailAddresses() emailAddresses}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEmailNotificationDto withEmailAddresses(String... elements) {
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableEmailNotificationDto(newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link AlertConfigJsonService.AlertConfigDto.EmailNotificationDto#emailAddresses() emailAddresses}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of emailAddresses elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEmailNotificationDto withEmailAddresses(Iterable<String> elements) {
    if (this.emailAddresses == elements) return this;
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableEmailNotificationDto(newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableEmailNotificationDto} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableEmailNotificationDto
        && equalTo((ImmutableEmailNotificationDto) another);
  }

  private boolean equalTo(ImmutableEmailNotificationDto another) {
    return emailAddresses.equals(another.emailAddresses);
  }

  /**
   * Computes a hash code from attributes: {@code emailAddresses}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + emailAddresses.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code EmailNotificationDto} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("EmailNotificationDto")
        .omitNullValues()
        .add("emailAddresses", emailAddresses)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json
      implements AlertConfigJsonService.AlertConfigDto.EmailNotificationDto {
    ImmutableList<String> emailAddresses = ImmutableList.of();
    @JsonProperty("emailAddresses")
    public void setEmailAddresses(ImmutableList<String> emailAddresses) {
      this.emailAddresses = emailAddresses;
    }
    @Override
    public ImmutableList<String> emailAddresses() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableEmailNotificationDto fromJson(Json json) {
    ImmutableEmailNotificationDto.Builder builder = ImmutableEmailNotificationDto.builder();
    if (json.emailAddresses != null) {
      builder.addAllEmailAddresses(json.emailAddresses);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link AlertConfigJsonService.AlertConfigDto.EmailNotificationDto} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable EmailNotificationDto instance
   */
  public static ImmutableEmailNotificationDto copyOf(AlertConfigJsonService.AlertConfigDto.EmailNotificationDto instance) {
    if (instance instanceof ImmutableEmailNotificationDto) {
      return (ImmutableEmailNotificationDto) instance;
    }
    return ImmutableEmailNotificationDto.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableEmailNotificationDto ImmutableEmailNotificationDto}.
   * @return A new ImmutableEmailNotificationDto builder
   */
  public static ImmutableEmailNotificationDto.Builder builder() {
    return new ImmutableEmailNotificationDto.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableEmailNotificationDto ImmutableEmailNotificationDto}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private ImmutableList.Builder<String> emailAddresses = ImmutableList.builder();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code EmailNotificationDto} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(AlertConfigJsonService.AlertConfigDto.EmailNotificationDto instance) {
      Preconditions.checkNotNull(instance, "instance");
      addAllEmailAddresses(instance.emailAddresses());
      return this;
    }

    /**
     * Adds one element to {@link AlertConfigJsonService.AlertConfigDto.EmailNotificationDto#emailAddresses() emailAddresses} list.
     * @param element A emailAddresses element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addEmailAddresses(String element) {
      this.emailAddresses.add(element);
      return this;
    }

    /**
     * Adds elements to {@link AlertConfigJsonService.AlertConfigDto.EmailNotificationDto#emailAddresses() emailAddresses} list.
     * @param elements An array of emailAddresses elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addEmailAddresses(String... elements) {
      this.emailAddresses.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link AlertConfigJsonService.AlertConfigDto.EmailNotificationDto#emailAddresses() emailAddresses} list.
     * @param elements An iterable of emailAddresses elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder emailAddresses(Iterable<String> elements) {
      this.emailAddresses = ImmutableList.builder();
      return addAllEmailAddresses(elements);
    }

    /**
     * Adds elements to {@link AlertConfigJsonService.AlertConfigDto.EmailNotificationDto#emailAddresses() emailAddresses} list.
     * @param elements An iterable of emailAddresses elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllEmailAddresses(Iterable<String> elements) {
      this.emailAddresses.addAll(elements);
      return this;
    }

    /**
     * Builds a new {@link ImmutableEmailNotificationDto ImmutableEmailNotificationDto}.
     * @return An immutable instance of EmailNotificationDto
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableEmailNotificationDto build() {
      return new ImmutableEmailNotificationDto(emailAddresses.build());
    }
  }
}
