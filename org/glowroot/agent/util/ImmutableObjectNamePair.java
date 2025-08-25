package org.glowroot.agent.util;

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
import javax.management.ObjectName;

/**
 * Immutable implementation of {@link LazyPlatformMBeanServer.ObjectNamePair}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableObjectNamePair.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code ImmutableObjectNamePair.of()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "LazyPlatformMBeanServer.ObjectNamePair"})
@Immutable
final class ImmutableObjectNamePair
    implements LazyPlatformMBeanServer.ObjectNamePair {
  private final Object object;
  private final ObjectName name;

  private ImmutableObjectNamePair(Object object, ObjectName name) {
    this.object = Preconditions.checkNotNull(object, "object");
    this.name = Preconditions.checkNotNull(name, "name");
  }

  private ImmutableObjectNamePair(ImmutableObjectNamePair original, Object object, ObjectName name) {
    this.object = object;
    this.name = name;
  }

  /**
   * @return The value of the {@code object} attribute
   */
  @JsonProperty("object")
  @Override
  public Object object() {
    return object;
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @JsonProperty("name")
  @Override
  public ObjectName name() {
    return name;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LazyPlatformMBeanServer.ObjectNamePair#object() object} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for object
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableObjectNamePair withObject(Object value) {
    if (this.object == value) return this;
    Object newValue = Preconditions.checkNotNull(value, "object");
    return new ImmutableObjectNamePair(this, newValue, this.name);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LazyPlatformMBeanServer.ObjectNamePair#name() name} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableObjectNamePair withName(ObjectName value) {
    if (this.name == value) return this;
    ObjectName newValue = Preconditions.checkNotNull(value, "name");
    return new ImmutableObjectNamePair(this, this.object, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableObjectNamePair} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableObjectNamePair
        && equalTo((ImmutableObjectNamePair) another);
  }

  private boolean equalTo(ImmutableObjectNamePair another) {
    return object.equals(another.object)
        && name.equals(another.name);
  }

  /**
   * Computes a hash code from attributes: {@code object}, {@code name}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + object.hashCode();
    h += (h << 5) + name.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code ObjectNamePair} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("ObjectNamePair")
        .omitNullValues()
        .add("object", object)
        .add("name", name)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements LazyPlatformMBeanServer.ObjectNamePair {
    @Nullable Object object;
    @Nullable ObjectName name;
    @JsonProperty("object")
    public void setObject(Object object) {
      this.object = object;
    }
    @JsonProperty("name")
    public void setName(ObjectName name) {
      this.name = name;
    }
    @Override
    public Object object() { throw new UnsupportedOperationException(); }
    @Override
    public ObjectName name() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableObjectNamePair fromJson(Json json) {
    ImmutableObjectNamePair.Builder builder = ImmutableObjectNamePair.builder();
    if (json.object != null) {
      builder.object(json.object);
    }
    if (json.name != null) {
      builder.name(json.name);
    }
    return builder.build();
  }

  /**
   * Construct a new immutable {@code ObjectNamePair} instance.
   * @param object The value for the {@code object} attribute
   * @param name The value for the {@code name} attribute
   * @return An immutable ObjectNamePair instance
   */
  public static ImmutableObjectNamePair of(Object object, ObjectName name) {
    return new ImmutableObjectNamePair(object, name);
  }

  /**
   * Creates an immutable copy of a {@link LazyPlatformMBeanServer.ObjectNamePair} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ObjectNamePair instance
   */
  public static ImmutableObjectNamePair copyOf(LazyPlatformMBeanServer.ObjectNamePair instance) {
    if (instance instanceof ImmutableObjectNamePair) {
      return (ImmutableObjectNamePair) instance;
    }
    return ImmutableObjectNamePair.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableObjectNamePair ImmutableObjectNamePair}.
   * @return A new ImmutableObjectNamePair builder
   */
  public static ImmutableObjectNamePair.Builder builder() {
    return new ImmutableObjectNamePair.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableObjectNamePair ImmutableObjectNamePair}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_OBJECT = 0x1L;
    private static final long INIT_BIT_NAME = 0x2L;
    private long initBits = 0x3L;

    private @Nullable Object object;
    private @Nullable ObjectName name;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code ObjectNamePair} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(LazyPlatformMBeanServer.ObjectNamePair instance) {
      Preconditions.checkNotNull(instance, "instance");
      object(instance.object());
      name(instance.name());
      return this;
    }

    /**
     * Initializes the value for the {@link LazyPlatformMBeanServer.ObjectNamePair#object() object} attribute.
     * @param object The value for object 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder object(Object object) {
      this.object = Preconditions.checkNotNull(object, "object");
      initBits &= ~INIT_BIT_OBJECT;
      return this;
    }

    /**
     * Initializes the value for the {@link LazyPlatformMBeanServer.ObjectNamePair#name() name} attribute.
     * @param name The value for name 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder name(ObjectName name) {
      this.name = Preconditions.checkNotNull(name, "name");
      initBits &= ~INIT_BIT_NAME;
      return this;
    }

    /**
     * Builds a new {@link ImmutableObjectNamePair ImmutableObjectNamePair}.
     * @return An immutable instance of ObjectNamePair
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableObjectNamePair build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableObjectNamePair(null, object, name);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_OBJECT) != 0) attributes.add("object");
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      return "Cannot build ObjectNamePair, some of required attributes are not set " + attributes;
    }
  }
}
