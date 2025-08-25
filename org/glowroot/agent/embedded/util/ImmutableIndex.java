package org.glowroot.agent.embedded.util;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import org.glowroot.agent.shaded.google.common.collect.ImmutableList;
import org.glowroot.agent.shaded.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link Schemas.Index}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableIndex.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code ImmutableIndex.of()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "Schemas.Index"})
@Immutable
public final class ImmutableIndex extends Schemas.Index {
  private final String name;
  private final ImmutableList<String> columns;

  private ImmutableIndex(String name, Iterable<String> columns) {
    this.name = Preconditions.checkNotNull(name, "name");
    this.columns = ImmutableList.copyOf(columns);
  }

  private ImmutableIndex(
      ImmutableIndex original,
      String name,
      ImmutableList<String> columns) {
    this.name = name;
    this.columns = columns;
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @JsonProperty("name")
  @Override
  String name() {
    return name;
  }

  /**
   * @return The value of the {@code columns} attribute
   */
  @JsonProperty("columns")
  @Override
  ImmutableList<String> columns() {
    return columns;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Schemas.Index#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableIndex withName(String value) {
    if (this.name.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "name");
    return new ImmutableIndex(this, newValue, this.columns);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Schemas.Index#columns() columns}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableIndex withColumns(String... elements) {
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableIndex(this, this.name, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Schemas.Index#columns() columns}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of columns elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableIndex withColumns(Iterable<String> elements) {
    if (this.columns == elements) return this;
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableIndex(this, this.name, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableIndex} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableIndex
        && equalTo((ImmutableIndex) another);
  }

  private boolean equalTo(ImmutableIndex another) {
    return name.equals(another.name)
        && columns.equals(another.columns);
  }

  /**
   * Computes a hash code from attributes: {@code name}, {@code columns}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + name.hashCode();
    h += (h << 5) + columns.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Index} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("Index")
        .omitNullValues()
        .add("name", name)
        .add("columns", columns)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends Schemas.Index {
    @Nullable String name;
    ImmutableList<String> columns = ImmutableList.of();
    @JsonProperty("name")
    public void setName(String name) {
      this.name = name;
    }
    @JsonProperty("columns")
    public void setColumns(ImmutableList<String> columns) {
      this.columns = columns;
    }
    @Override
    String name() { throw new UnsupportedOperationException(); }
    @Override
    ImmutableList<String> columns() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableIndex fromJson(Json json) {
    ImmutableIndex.Builder builder = ImmutableIndex.builder();
    if (json.name != null) {
      builder.name(json.name);
    }
    if (json.columns != null) {
      builder.addAllColumns(json.columns);
    }
    return builder.build();
  }

  /**
   * Construct a new immutable {@code Index} instance.
   * @param name The value for the {@code name} attribute
   * @param columns The value for the {@code columns} attribute
   * @return An immutable Index instance
   */
  public static ImmutableIndex of(String name, ImmutableList<String> columns) {
    return of(name, (Iterable<String>) columns);
  }

  /**
   * Construct a new immutable {@code Index} instance.
   * @param name The value for the {@code name} attribute
   * @param columns The value for the {@code columns} attribute
   * @return An immutable Index instance
   */
  public static ImmutableIndex of(String name, Iterable<String> columns) {
    return new ImmutableIndex(name, columns);
  }

  /**
   * Creates an immutable copy of a {@link Schemas.Index} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Index instance
   */
  public static ImmutableIndex copyOf(Schemas.Index instance) {
    if (instance instanceof ImmutableIndex) {
      return (ImmutableIndex) instance;
    }
    return ImmutableIndex.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableIndex ImmutableIndex}.
   * @return A new ImmutableIndex builder
   */
  public static ImmutableIndex.Builder builder() {
    return new ImmutableIndex.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableIndex ImmutableIndex}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_NAME = 0x1L;
    private long initBits = 0x1L;

    private @Nullable String name;
    private ImmutableList.Builder<String> columns = ImmutableList.builder();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Index} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(Schemas.Index instance) {
      Preconditions.checkNotNull(instance, "instance");
      name(instance.name());
      addAllColumns(instance.columns());
      return this;
    }

    /**
     * Initializes the value for the {@link Schemas.Index#name() name} attribute.
     * @param name The value for name 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder name(String name) {
      this.name = Preconditions.checkNotNull(name, "name");
      initBits &= ~INIT_BIT_NAME;
      return this;
    }

    /**
     * Adds one element to {@link Schemas.Index#columns() columns} list.
     * @param element A columns element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addColumns(String element) {
      this.columns.add(element);
      return this;
    }

    /**
     * Adds elements to {@link Schemas.Index#columns() columns} list.
     * @param elements An array of columns elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addColumns(String... elements) {
      this.columns.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link Schemas.Index#columns() columns} list.
     * @param elements An iterable of columns elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder columns(Iterable<String> elements) {
      this.columns = ImmutableList.builder();
      return addAllColumns(elements);
    }

    /**
     * Adds elements to {@link Schemas.Index#columns() columns} list.
     * @param elements An iterable of columns elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllColumns(Iterable<String> elements) {
      this.columns.addAll(elements);
      return this;
    }

    /**
     * Builds a new {@link ImmutableIndex ImmutableIndex}.
     * @return An immutable instance of Index
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableIndex build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableIndex(null, name, columns.build());
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      return "Cannot build Index, some of required attributes are not set " + attributes;
    }
  }
}
