package org.glowroot.agent.shaded.glowroot.ui;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import org.glowroot.agent.shaded.google.common.collect.ImmutableList;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link JvmJsonService.MBeanTreeRequest}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMBeanTreeRequest.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "JvmJsonService.MBeanTreeRequest"})
@Immutable
final class ImmutableMBeanTreeRequest implements JvmJsonService.MBeanTreeRequest {
  private final ImmutableList<String> expanded;

  private ImmutableMBeanTreeRequest(ImmutableList<String> expanded) {
    this.expanded = expanded;
  }

  /**
   * @return The value of the {@code expanded} attribute
   */
  @JsonProperty("expanded")
  @Override
  public ImmutableList<String> expanded() {
    return expanded;
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link JvmJsonService.MBeanTreeRequest#expanded() expanded}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMBeanTreeRequest withExpanded(String... elements) {
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableMBeanTreeRequest(newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link JvmJsonService.MBeanTreeRequest#expanded() expanded}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of expanded elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMBeanTreeRequest withExpanded(Iterable<String> elements) {
    if (this.expanded == elements) return this;
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableMBeanTreeRequest(newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMBeanTreeRequest} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMBeanTreeRequest
        && equalTo((ImmutableMBeanTreeRequest) another);
  }

  private boolean equalTo(ImmutableMBeanTreeRequest another) {
    return expanded.equals(another.expanded);
  }

  /**
   * Computes a hash code from attributes: {@code expanded}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + expanded.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code MBeanTreeRequest} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("MBeanTreeRequest")
        .omitNullValues()
        .add("expanded", expanded)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements JvmJsonService.MBeanTreeRequest {
    List<String> expanded = ImmutableList.of();
    @JsonProperty("expanded")
    public void setExpanded(List<String> expanded) {
      this.expanded = expanded;
    }
    @Override
    public List<String> expanded() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableMBeanTreeRequest fromJson(Json json) {
    ImmutableMBeanTreeRequest.Builder builder = ImmutableMBeanTreeRequest.builder();
    if (json.expanded != null) {
      builder.addAllExpanded(json.expanded);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link JvmJsonService.MBeanTreeRequest} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MBeanTreeRequest instance
   */
  public static ImmutableMBeanTreeRequest copyOf(JvmJsonService.MBeanTreeRequest instance) {
    if (instance instanceof ImmutableMBeanTreeRequest) {
      return (ImmutableMBeanTreeRequest) instance;
    }
    return ImmutableMBeanTreeRequest.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableMBeanTreeRequest ImmutableMBeanTreeRequest}.
   * @return A new ImmutableMBeanTreeRequest builder
   */
  public static ImmutableMBeanTreeRequest.Builder builder() {
    return new ImmutableMBeanTreeRequest.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableMBeanTreeRequest ImmutableMBeanTreeRequest}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private ImmutableList.Builder<String> expanded = ImmutableList.builder();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code MBeanTreeRequest} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(JvmJsonService.MBeanTreeRequest instance) {
      Preconditions.checkNotNull(instance, "instance");
      addAllExpanded(instance.expanded());
      return this;
    }

    /**
     * Adds one element to {@link JvmJsonService.MBeanTreeRequest#expanded() expanded} list.
     * @param element A expanded element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addExpanded(String element) {
      this.expanded.add(element);
      return this;
    }

    /**
     * Adds elements to {@link JvmJsonService.MBeanTreeRequest#expanded() expanded} list.
     * @param elements An array of expanded elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addExpanded(String... elements) {
      this.expanded.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link JvmJsonService.MBeanTreeRequest#expanded() expanded} list.
     * @param elements An iterable of expanded elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder expanded(Iterable<String> elements) {
      this.expanded = ImmutableList.builder();
      return addAllExpanded(elements);
    }

    /**
     * Adds elements to {@link JvmJsonService.MBeanTreeRequest#expanded() expanded} list.
     * @param elements An iterable of expanded elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllExpanded(Iterable<String> elements) {
      this.expanded.addAll(elements);
      return this;
    }

    /**
     * Builds a new {@link ImmutableMBeanTreeRequest ImmutableMBeanTreeRequest}.
     * @return An immutable instance of MBeanTreeRequest
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableMBeanTreeRequest build() {
      return new ImmutableMBeanTreeRequest(expanded.build());
    }
  }
}
