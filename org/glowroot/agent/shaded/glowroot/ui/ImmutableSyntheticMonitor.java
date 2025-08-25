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
 * Immutable implementation of {@link SyntheticResultJsonService.SyntheticMonitor}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSyntheticMonitor.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code ImmutableSyntheticMonitor.of()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "SyntheticResultJsonService.SyntheticMonitor"})
@Immutable
final class ImmutableSyntheticMonitor
    implements SyntheticResultJsonService.SyntheticMonitor {
  private final String id;
  private final String display;

  private ImmutableSyntheticMonitor(String id, String display) {
    this.id = Preconditions.checkNotNull(id, "id");
    this.display = Preconditions.checkNotNull(display, "display");
  }

  private ImmutableSyntheticMonitor(ImmutableSyntheticMonitor original, String id, String display) {
    this.id = id;
    this.display = display;
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public String id() {
    return id;
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
   * Copy the current immutable object by setting a value for the {@link SyntheticResultJsonService.SyntheticMonitor#id() id} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for id
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSyntheticMonitor withId(String value) {
    if (this.id.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "id");
    return new ImmutableSyntheticMonitor(this, newValue, this.display);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SyntheticResultJsonService.SyntheticMonitor#display() display} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for display
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSyntheticMonitor withDisplay(String value) {
    if (this.display.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "display");
    return new ImmutableSyntheticMonitor(this, this.id, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSyntheticMonitor} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSyntheticMonitor
        && equalTo((ImmutableSyntheticMonitor) another);
  }

  private boolean equalTo(ImmutableSyntheticMonitor another) {
    return id.equals(another.id)
        && display.equals(another.display);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code display}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + id.hashCode();
    h += (h << 5) + display.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code SyntheticMonitor} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("SyntheticMonitor")
        .omitNullValues()
        .add("id", id)
        .add("display", display)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements SyntheticResultJsonService.SyntheticMonitor {
    @Nullable String id;
    @Nullable String display;
    @JsonProperty("id")
    public void setId(String id) {
      this.id = id;
    }
    @JsonProperty("display")
    public void setDisplay(String display) {
      this.display = display;
    }
    @Override
    public String id() { throw new UnsupportedOperationException(); }
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
  static ImmutableSyntheticMonitor fromJson(Json json) {
    ImmutableSyntheticMonitor.Builder builder = ImmutableSyntheticMonitor.builder();
    if (json.id != null) {
      builder.id(json.id);
    }
    if (json.display != null) {
      builder.display(json.display);
    }
    return builder.build();
  }

  /**
   * Construct a new immutable {@code SyntheticMonitor} instance.
   * @param id The value for the {@code id} attribute
   * @param display The value for the {@code display} attribute
   * @return An immutable SyntheticMonitor instance
   */
  public static ImmutableSyntheticMonitor of(String id, String display) {
    return new ImmutableSyntheticMonitor(id, display);
  }

  /**
   * Creates an immutable copy of a {@link SyntheticResultJsonService.SyntheticMonitor} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SyntheticMonitor instance
   */
  public static ImmutableSyntheticMonitor copyOf(SyntheticResultJsonService.SyntheticMonitor instance) {
    if (instance instanceof ImmutableSyntheticMonitor) {
      return (ImmutableSyntheticMonitor) instance;
    }
    return ImmutableSyntheticMonitor.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableSyntheticMonitor ImmutableSyntheticMonitor}.
   * @return A new ImmutableSyntheticMonitor builder
   */
  public static ImmutableSyntheticMonitor.Builder builder() {
    return new ImmutableSyntheticMonitor.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableSyntheticMonitor ImmutableSyntheticMonitor}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_ID = 0x1L;
    private static final long INIT_BIT_DISPLAY = 0x2L;
    private long initBits = 0x3L;

    private @Nullable String id;
    private @Nullable String display;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code SyntheticMonitor} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(SyntheticResultJsonService.SyntheticMonitor instance) {
      Preconditions.checkNotNull(instance, "instance");
      id(instance.id());
      display(instance.display());
      return this;
    }

    /**
     * Initializes the value for the {@link SyntheticResultJsonService.SyntheticMonitor#id() id} attribute.
     * @param id The value for id 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder id(String id) {
      this.id = Preconditions.checkNotNull(id, "id");
      initBits &= ~INIT_BIT_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link SyntheticResultJsonService.SyntheticMonitor#display() display} attribute.
     * @param display The value for display 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder display(String display) {
      this.display = Preconditions.checkNotNull(display, "display");
      initBits &= ~INIT_BIT_DISPLAY;
      return this;
    }

    /**
     * Builds a new {@link ImmutableSyntheticMonitor ImmutableSyntheticMonitor}.
     * @return An immutable instance of SyntheticMonitor
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableSyntheticMonitor build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableSyntheticMonitor(null, id, display);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_ID) != 0) attributes.add("id");
      if ((initBits & INIT_BIT_DISPLAY) != 0) attributes.add("display");
      return "Cannot build SyntheticMonitor, some of required attributes are not set " + attributes;
    }
  }
}
