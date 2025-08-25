package org.glowroot.agent.embedded.util;

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
 * Immutable implementation of {@link Schemas.Column}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableColumn.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code ImmutableColumn.of()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "Schemas.Column"})
@Immutable
public final class ImmutableColumn extends Schemas.Column {
  private final String name;
  private final Schemas.ColumnType type;

  private ImmutableColumn(String name, Schemas.ColumnType type) {
    this.name = Preconditions.checkNotNull(name, "name");
    this.type = Preconditions.checkNotNull(type, "type");
  }

  private ImmutableColumn(
      ImmutableColumn original,
      String name,
      Schemas.ColumnType type) {
    this.name = name;
    this.type = type;
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
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  Schemas.ColumnType type() {
    return type;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Schemas.Column#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableColumn withName(String value) {
    if (this.name.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "name");
    return new ImmutableColumn(this, newValue, this.type);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Schemas.Column#type() type} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for type
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableColumn withType(Schemas.ColumnType value) {
    if (this.type == value) return this;
    Schemas.ColumnType newValue = Preconditions.checkNotNull(value, "type");
    return new ImmutableColumn(this, this.name, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableColumn} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableColumn
        && equalTo((ImmutableColumn) another);
  }

  private boolean equalTo(ImmutableColumn another) {
    return name.equals(another.name)
        && type.equals(another.type);
  }

  /**
   * Computes a hash code from attributes: {@code name}, {@code type}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + name.hashCode();
    h += (h << 5) + type.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Column} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("Column")
        .omitNullValues()
        .add("name", name)
        .add("type", type)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends Schemas.Column {
    @Nullable String name;
    @Nullable Schemas.ColumnType type;
    @JsonProperty("name")
    public void setName(String name) {
      this.name = name;
    }
    @JsonProperty("type")
    public void setType(Schemas.ColumnType type) {
      this.type = type;
    }
    @Override
    String name() { throw new UnsupportedOperationException(); }
    @Override
    Schemas.ColumnType type() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableColumn fromJson(Json json) {
    ImmutableColumn.Builder builder = ImmutableColumn.builder();
    if (json.name != null) {
      builder.name(json.name);
    }
    if (json.type != null) {
      builder.type(json.type);
    }
    return builder.build();
  }

  /**
   * Construct a new immutable {@code Column} instance.
   * @param name The value for the {@code name} attribute
   * @param type The value for the {@code type} attribute
   * @return An immutable Column instance
   */
  public static ImmutableColumn of(String name, Schemas.ColumnType type) {
    return new ImmutableColumn(name, type);
  }

  /**
   * Creates an immutable copy of a {@link Schemas.Column} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Column instance
   */
  public static ImmutableColumn copyOf(Schemas.Column instance) {
    if (instance instanceof ImmutableColumn) {
      return (ImmutableColumn) instance;
    }
    return ImmutableColumn.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableColumn ImmutableColumn}.
   * @return A new ImmutableColumn builder
   */
  public static ImmutableColumn.Builder builder() {
    return new ImmutableColumn.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableColumn ImmutableColumn}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_NAME = 0x1L;
    private static final long INIT_BIT_TYPE = 0x2L;
    private long initBits = 0x3L;

    private @Nullable String name;
    private @Nullable Schemas.ColumnType type;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Column} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(Schemas.Column instance) {
      Preconditions.checkNotNull(instance, "instance");
      name(instance.name());
      type(instance.type());
      return this;
    }

    /**
     * Initializes the value for the {@link Schemas.Column#name() name} attribute.
     * @param name The value for name 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder name(String name) {
      this.name = Preconditions.checkNotNull(name, "name");
      initBits &= ~INIT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link Schemas.Column#type() type} attribute.
     * @param type The value for type 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder type(Schemas.ColumnType type) {
      this.type = Preconditions.checkNotNull(type, "type");
      initBits &= ~INIT_BIT_TYPE;
      return this;
    }

    /**
     * Builds a new {@link ImmutableColumn ImmutableColumn}.
     * @return An immutable instance of Column
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableColumn build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableColumn(null, name, type);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      if ((initBits & INIT_BIT_TYPE) != 0) attributes.add("type");
      return "Cannot build Column, some of required attributes are not set " + attributes;
    }
  }
}
