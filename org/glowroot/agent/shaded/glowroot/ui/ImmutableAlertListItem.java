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
 * Immutable implementation of {@link AlertConfigJsonService.AlertListItem}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAlertListItem.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code ImmutableAlertListItem.of()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "AlertConfigJsonService.AlertListItem"})
@Immutable
final class ImmutableAlertListItem implements AlertConfigJsonService.AlertListItem {
  private final String version;
  private final String display;

  private ImmutableAlertListItem(String version, String display) {
    this.version = Preconditions.checkNotNull(version, "version");
    this.display = Preconditions.checkNotNull(display, "display");
  }

  private ImmutableAlertListItem(ImmutableAlertListItem original, String version, String display) {
    this.version = version;
    this.display = display;
  }

  /**
   * @return The value of the {@code version} attribute
   */
  @JsonProperty("version")
  @Override
  public String version() {
    return version;
  }

  /**
   * @return The value of the {@code display} attribute
   */
  @JsonProperty("display")
  @Override
  public String display() {
    return display;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AlertConfigJsonService.AlertListItem#version() version} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for version
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAlertListItem withVersion(String value) {
    if (this.version.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "version");
    return new ImmutableAlertListItem(this, newValue, this.display);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AlertConfigJsonService.AlertListItem#display() display} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for display
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAlertListItem withDisplay(String value) {
    if (this.display.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "display");
    return new ImmutableAlertListItem(this, this.version, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAlertListItem} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAlertListItem
        && equalTo((ImmutableAlertListItem) another);
  }

  private boolean equalTo(ImmutableAlertListItem another) {
    return version.equals(another.version)
        && display.equals(another.display);
  }

  /**
   * Computes a hash code from attributes: {@code version}, {@code display}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + version.hashCode();
    h += (h << 5) + display.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code AlertListItem} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("AlertListItem")
        .omitNullValues()
        .add("version", version)
        .add("display", display)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements AlertConfigJsonService.AlertListItem {
    @Nullable String version;
    @Nullable String display;
    @JsonProperty("version")
    public void setVersion(String version) {
      this.version = version;
    }
    @JsonProperty("display")
    public void setDisplay(String display) {
      this.display = display;
    }
    @Override
    public String version() { throw new UnsupportedOperationException(); }
    @Override
    public String display() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableAlertListItem fromJson(Json json) {
    ImmutableAlertListItem.Builder builder = ImmutableAlertListItem.builder();
    if (json.version != null) {
      builder.version(json.version);
    }
    if (json.display != null) {
      builder.display(json.display);
    }
    return builder.build();
  }

  /**
   * Construct a new immutable {@code AlertListItem} instance.
   * @param version The value for the {@code version} attribute
   * @param display The value for the {@code display} attribute
   * @return An immutable AlertListItem instance
   */
  public static ImmutableAlertListItem of(String version, String display) {
    return new ImmutableAlertListItem(version, display);
  }

  /**
   * Creates an immutable copy of a {@link AlertConfigJsonService.AlertListItem} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable AlertListItem instance
   */
  public static ImmutableAlertListItem copyOf(AlertConfigJsonService.AlertListItem instance) {
    if (instance instanceof ImmutableAlertListItem) {
      return (ImmutableAlertListItem) instance;
    }
    return ImmutableAlertListItem.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableAlertListItem ImmutableAlertListItem}.
   * @return A new ImmutableAlertListItem builder
   */
  public static ImmutableAlertListItem.Builder builder() {
    return new ImmutableAlertListItem.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableAlertListItem ImmutableAlertListItem}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_VERSION = 0x1L;
    private static final long INIT_BIT_DISPLAY = 0x2L;
    private long initBits = 0x3L;

    private @Nullable String version;
    private @Nullable String display;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code AlertListItem} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(AlertConfigJsonService.AlertListItem instance) {
      Preconditions.checkNotNull(instance, "instance");
      version(instance.version());
      display(instance.display());
      return this;
    }

    /**
     * Initializes the value for the {@link AlertConfigJsonService.AlertListItem#version() version} attribute.
     * @param version The value for version 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder version(String version) {
      this.version = Preconditions.checkNotNull(version, "version");
      initBits &= ~INIT_BIT_VERSION;
      return this;
    }

    /**
     * Initializes the value for the {@link AlertConfigJsonService.AlertListItem#display() display} attribute.
     * @param display The value for display 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder display(String display) {
      this.display = Preconditions.checkNotNull(display, "display");
      initBits &= ~INIT_BIT_DISPLAY;
      return this;
    }

    /**
     * Builds a new {@link ImmutableAlertListItem ImmutableAlertListItem}.
     * @return An immutable instance of AlertListItem
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableAlertListItem build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableAlertListItem(null, version, display);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_VERSION) != 0) attributes.add("version");
      if ((initBits & INIT_BIT_DISPLAY) != 0) attributes.add("display");
      return "Cannot build AlertListItem, some of required attributes are not set " + attributes;
    }
  }
}
