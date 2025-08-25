package org.glowroot.agent.shaded.glowroot.common.config;

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
 * Immutable implementation of {@link PagerDutyConfig.PagerDutyIntegrationKey}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePagerDutyIntegrationKey.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code ImmutablePagerDutyIntegrationKey.of()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "PagerDutyConfig.PagerDutyIntegrationKey"})
@Immutable
public final class ImmutablePagerDutyIntegrationKey
    implements PagerDutyConfig.PagerDutyIntegrationKey {
  private final String key;
  private final String display;

  private ImmutablePagerDutyIntegrationKey(String key, String display) {
    this.key = Preconditions.checkNotNull(key, "key");
    this.display = Preconditions.checkNotNull(display, "display");
  }

  private ImmutablePagerDutyIntegrationKey(ImmutablePagerDutyIntegrationKey original, String key, String display) {
    this.key = key;
    this.display = display;
  }

  /**
   * @return The value of the {@code key} attribute
   */
  @JsonProperty("key")
  @Override
  public String key() {
    return key;
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
   * Copy the current immutable object by setting a value for the {@link PagerDutyConfig.PagerDutyIntegrationKey#key() key} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for key
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePagerDutyIntegrationKey withKey(String value) {
    if (this.key.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "key");
    return new ImmutablePagerDutyIntegrationKey(this, newValue, this.display);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PagerDutyConfig.PagerDutyIntegrationKey#display() display} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for display
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePagerDutyIntegrationKey withDisplay(String value) {
    if (this.display.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "display");
    return new ImmutablePagerDutyIntegrationKey(this, this.key, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePagerDutyIntegrationKey} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePagerDutyIntegrationKey
        && equalTo((ImmutablePagerDutyIntegrationKey) another);
  }

  private boolean equalTo(ImmutablePagerDutyIntegrationKey another) {
    return key.equals(another.key)
        && display.equals(another.display);
  }

  /**
   * Computes a hash code from attributes: {@code key}, {@code display}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + key.hashCode();
    h += (h << 5) + display.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code PagerDutyIntegrationKey} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("PagerDutyIntegrationKey")
        .omitNullValues()
        .add("key", key)
        .add("display", display)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements PagerDutyConfig.PagerDutyIntegrationKey {
    @Nullable String key;
    @Nullable String display;
    @JsonProperty("key")
    public void setKey(String key) {
      this.key = key;
    }
    @JsonProperty("display")
    public void setDisplay(String display) {
      this.display = display;
    }
    @Override
    public String key() { throw new UnsupportedOperationException(); }
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
  static ImmutablePagerDutyIntegrationKey fromJson(Json json) {
    ImmutablePagerDutyIntegrationKey.Builder builder = ImmutablePagerDutyIntegrationKey.builder();
    if (json.key != null) {
      builder.key(json.key);
    }
    if (json.display != null) {
      builder.display(json.display);
    }
    return builder.build();
  }

  /**
   * Construct a new immutable {@code PagerDutyIntegrationKey} instance.
   * @param key The value for the {@code key} attribute
   * @param display The value for the {@code display} attribute
   * @return An immutable PagerDutyIntegrationKey instance
   */
  public static ImmutablePagerDutyIntegrationKey of(String key, String display) {
    return new ImmutablePagerDutyIntegrationKey(key, display);
  }

  /**
   * Creates an immutable copy of a {@link PagerDutyConfig.PagerDutyIntegrationKey} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable PagerDutyIntegrationKey instance
   */
  public static ImmutablePagerDutyIntegrationKey copyOf(PagerDutyConfig.PagerDutyIntegrationKey instance) {
    if (instance instanceof ImmutablePagerDutyIntegrationKey) {
      return (ImmutablePagerDutyIntegrationKey) instance;
    }
    return ImmutablePagerDutyIntegrationKey.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutablePagerDutyIntegrationKey ImmutablePagerDutyIntegrationKey}.
   * @return A new ImmutablePagerDutyIntegrationKey builder
   */
  public static ImmutablePagerDutyIntegrationKey.Builder builder() {
    return new ImmutablePagerDutyIntegrationKey.Builder();
  }

  /**
   * Builds instances of type {@link ImmutablePagerDutyIntegrationKey ImmutablePagerDutyIntegrationKey}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_KEY = 0x1L;
    private static final long INIT_BIT_DISPLAY = 0x2L;
    private long initBits = 0x3L;

    private @Nullable String key;
    private @Nullable String display;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code PagerDutyIntegrationKey} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(PagerDutyConfig.PagerDutyIntegrationKey instance) {
      Preconditions.checkNotNull(instance, "instance");
      key(instance.key());
      display(instance.display());
      return this;
    }

    /**
     * Initializes the value for the {@link PagerDutyConfig.PagerDutyIntegrationKey#key() key} attribute.
     * @param key The value for key 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder key(String key) {
      this.key = Preconditions.checkNotNull(key, "key");
      initBits &= ~INIT_BIT_KEY;
      return this;
    }

    /**
     * Initializes the value for the {@link PagerDutyConfig.PagerDutyIntegrationKey#display() display} attribute.
     * @param display The value for display 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder display(String display) {
      this.display = Preconditions.checkNotNull(display, "display");
      initBits &= ~INIT_BIT_DISPLAY;
      return this;
    }

    /**
     * Builds a new {@link ImmutablePagerDutyIntegrationKey ImmutablePagerDutyIntegrationKey}.
     * @return An immutable instance of PagerDutyIntegrationKey
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutablePagerDutyIntegrationKey build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutablePagerDutyIntegrationKey(null, key, display);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_KEY) != 0) attributes.add("key");
      if ((initBits & INIT_BIT_DISPLAY) != 0) attributes.add("display");
      return "Cannot build PagerDutyIntegrationKey, some of required attributes are not set " + attributes;
    }
  }
}
