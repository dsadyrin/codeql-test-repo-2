package org.glowroot.agent.config;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import org.glowroot.agent.shaded.google.common.collect.ImmutableList;
import java.io.File;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link PluginCache}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePluginCache.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "PluginCache"})
@Immutable
public final class ImmutablePluginCache extends PluginCache {
  private final ImmutableList<File> pluginJars;
  private final ImmutableList<PluginDescriptor> pluginDescriptors;

  private ImmutablePluginCache(
      ImmutableList<File> pluginJars,
      ImmutableList<PluginDescriptor> pluginDescriptors) {
    this.pluginJars = pluginJars;
    this.pluginDescriptors = pluginDescriptors;
  }

  /**
   * @return The value of the {@code pluginJars} attribute
   */
  @JsonProperty("pluginJars")
  @Override
  public ImmutableList<File> pluginJars() {
    return pluginJars;
  }

  /**
   * @return The value of the {@code pluginDescriptors} attribute
   */
  @JsonProperty("pluginDescriptors")
  @Override
  public ImmutableList<PluginDescriptor> pluginDescriptors() {
    return pluginDescriptors;
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link PluginCache#pluginJars() pluginJars}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePluginCache withPluginJars(File... elements) {
    ImmutableList<File> newValue = ImmutableList.copyOf(elements);
    return new ImmutablePluginCache(newValue, this.pluginDescriptors);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link PluginCache#pluginJars() pluginJars}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of pluginJars elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePluginCache withPluginJars(Iterable<? extends File> elements) {
    if (this.pluginJars == elements) return this;
    ImmutableList<File> newValue = ImmutableList.copyOf(elements);
    return new ImmutablePluginCache(newValue, this.pluginDescriptors);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link PluginCache#pluginDescriptors() pluginDescriptors}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePluginCache withPluginDescriptors(PluginDescriptor... elements) {
    ImmutableList<PluginDescriptor> newValue = ImmutableList.copyOf(elements);
    return new ImmutablePluginCache(this.pluginJars, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link PluginCache#pluginDescriptors() pluginDescriptors}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of pluginDescriptors elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePluginCache withPluginDescriptors(Iterable<? extends PluginDescriptor> elements) {
    if (this.pluginDescriptors == elements) return this;
    ImmutableList<PluginDescriptor> newValue = ImmutableList.copyOf(elements);
    return new ImmutablePluginCache(this.pluginJars, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePluginCache} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePluginCache
        && equalTo((ImmutablePluginCache) another);
  }

  private boolean equalTo(ImmutablePluginCache another) {
    return pluginJars.equals(another.pluginJars)
        && pluginDescriptors.equals(another.pluginDescriptors);
  }

  /**
   * Computes a hash code from attributes: {@code pluginJars}, {@code pluginDescriptors}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + pluginJars.hashCode();
    h += (h << 5) + pluginDescriptors.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code PluginCache} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("PluginCache")
        .omitNullValues()
        .add("pluginJars", pluginJars)
        .add("pluginDescriptors", pluginDescriptors)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends PluginCache {
    ImmutableList<File> pluginJars = ImmutableList.of();
    ImmutableList<PluginDescriptor> pluginDescriptors = ImmutableList.of();
    @JsonProperty("pluginJars")
    public void setPluginJars(ImmutableList<File> pluginJars) {
      this.pluginJars = pluginJars;
    }
    @JsonProperty("pluginDescriptors")
    public void setPluginDescriptors(ImmutableList<PluginDescriptor> pluginDescriptors) {
      this.pluginDescriptors = pluginDescriptors;
    }
    @Override
    public ImmutableList<File> pluginJars() { throw new UnsupportedOperationException(); }
    @Override
    public ImmutableList<PluginDescriptor> pluginDescriptors() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutablePluginCache fromJson(Json json) {
    ImmutablePluginCache.Builder builder = ImmutablePluginCache.builder();
    if (json.pluginJars != null) {
      builder.addAllPluginJars(json.pluginJars);
    }
    if (json.pluginDescriptors != null) {
      builder.addAllPluginDescriptors(json.pluginDescriptors);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link PluginCache} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable PluginCache instance
   */
  public static ImmutablePluginCache copyOf(PluginCache instance) {
    if (instance instanceof ImmutablePluginCache) {
      return (ImmutablePluginCache) instance;
    }
    return ImmutablePluginCache.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutablePluginCache ImmutablePluginCache}.
   * @return A new ImmutablePluginCache builder
   */
  public static ImmutablePluginCache.Builder builder() {
    return new ImmutablePluginCache.Builder();
  }

  /**
   * Builds instances of type {@link ImmutablePluginCache ImmutablePluginCache}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private ImmutableList.Builder<File> pluginJars = ImmutableList.builder();
    private ImmutableList.Builder<PluginDescriptor> pluginDescriptors = ImmutableList.builder();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code PluginCache} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(PluginCache instance) {
      Preconditions.checkNotNull(instance, "instance");
      addAllPluginJars(instance.pluginJars());
      addAllPluginDescriptors(instance.pluginDescriptors());
      return this;
    }

    /**
     * Adds one element to {@link PluginCache#pluginJars() pluginJars} list.
     * @param element A pluginJars element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addPluginJars(File element) {
      this.pluginJars.add(element);
      return this;
    }

    /**
     * Adds elements to {@link PluginCache#pluginJars() pluginJars} list.
     * @param elements An array of pluginJars elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addPluginJars(File... elements) {
      this.pluginJars.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link PluginCache#pluginJars() pluginJars} list.
     * @param elements An iterable of pluginJars elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder pluginJars(Iterable<? extends File> elements) {
      this.pluginJars = ImmutableList.builder();
      return addAllPluginJars(elements);
    }

    /**
     * Adds elements to {@link PluginCache#pluginJars() pluginJars} list.
     * @param elements An iterable of pluginJars elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllPluginJars(Iterable<? extends File> elements) {
      this.pluginJars.addAll(elements);
      return this;
    }

    /**
     * Adds one element to {@link PluginCache#pluginDescriptors() pluginDescriptors} list.
     * @param element A pluginDescriptors element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addPluginDescriptors(PluginDescriptor element) {
      this.pluginDescriptors.add(element);
      return this;
    }

    /**
     * Adds elements to {@link PluginCache#pluginDescriptors() pluginDescriptors} list.
     * @param elements An array of pluginDescriptors elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addPluginDescriptors(PluginDescriptor... elements) {
      this.pluginDescriptors.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link PluginCache#pluginDescriptors() pluginDescriptors} list.
     * @param elements An iterable of pluginDescriptors elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder pluginDescriptors(Iterable<? extends PluginDescriptor> elements) {
      this.pluginDescriptors = ImmutableList.builder();
      return addAllPluginDescriptors(elements);
    }

    /**
     * Adds elements to {@link PluginCache#pluginDescriptors() pluginDescriptors} list.
     * @param elements An iterable of pluginDescriptors elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllPluginDescriptors(Iterable<? extends PluginDescriptor> elements) {
      this.pluginDescriptors.addAll(elements);
      return this;
    }

    /**
     * Builds a new {@link ImmutablePluginCache ImmutablePluginCache}.
     * @return An immutable instance of PluginCache
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutablePluginCache build() {
      return new ImmutablePluginCache(pluginJars.build(), pluginDescriptors.build());
    }
  }
}
