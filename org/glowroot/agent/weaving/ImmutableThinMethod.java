package org.glowroot.agent.weaving;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Objects;
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
 * Immutable implementation of {@link ThinClassVisitor.ThinMethod}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableThinMethod.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "ThinClassVisitor.ThinMethod"})
@Immutable
final class ImmutableThinMethod implements ThinClassVisitor.ThinMethod {
  private final int access;
  private final String name;
  private final String desc;
  private final @Nullable String signature;
  private final ImmutableList<String> exceptions;
  private final ImmutableList<String> annotations;

  private ImmutableThinMethod(
      int access,
      String name,
      String desc,
      @Nullable String signature,
      ImmutableList<String> exceptions,
      ImmutableList<String> annotations) {
    this.access = access;
    this.name = name;
    this.desc = desc;
    this.signature = signature;
    this.exceptions = exceptions;
    this.annotations = annotations;
  }

  /**
   * @return The value of the {@code access} attribute
   */
  @JsonProperty("access")
  @Override
  public int access() {
    return access;
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @JsonProperty("name")
  @Override
  public String name() {
    return name;
  }

  /**
   * @return The value of the {@code desc} attribute
   */
  @JsonProperty("desc")
  @Override
  public String desc() {
    return desc;
  }

  /**
   * @return The value of the {@code signature} attribute
   */
  @JsonProperty("signature")
  @Override
  public @Nullable String signature() {
    return signature;
  }

  /**
   * @return The value of the {@code exceptions} attribute
   */
  @JsonProperty("exceptions")
  @Override
  public ImmutableList<String> exceptions() {
    return exceptions;
  }

  /**
   * @return The value of the {@code annotations} attribute
   */
  @JsonProperty("annotations")
  @Override
  public ImmutableList<String> annotations() {
    return annotations;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ThinClassVisitor.ThinMethod#access() access} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for access
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableThinMethod withAccess(int value) {
    if (this.access == value) return this;
    return new ImmutableThinMethod(value, this.name, this.desc, this.signature, this.exceptions, this.annotations);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ThinClassVisitor.ThinMethod#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableThinMethod withName(String value) {
    if (this.name.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "name");
    return new ImmutableThinMethod(this.access, newValue, this.desc, this.signature, this.exceptions, this.annotations);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ThinClassVisitor.ThinMethod#desc() desc} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for desc
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableThinMethod withDesc(String value) {
    if (this.desc.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "desc");
    return new ImmutableThinMethod(this.access, this.name, newValue, this.signature, this.exceptions, this.annotations);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ThinClassVisitor.ThinMethod#signature() signature} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for signature (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableThinMethod withSignature(@Nullable String value) {
    if (Objects.equal(this.signature, value)) return this;
    return new ImmutableThinMethod(this.access, this.name, this.desc, value, this.exceptions, this.annotations);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ThinClassVisitor.ThinMethod#exceptions() exceptions}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableThinMethod withExceptions(String... elements) {
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableThinMethod(this.access, this.name, this.desc, this.signature, newValue, this.annotations);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ThinClassVisitor.ThinMethod#exceptions() exceptions}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of exceptions elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableThinMethod withExceptions(Iterable<String> elements) {
    if (this.exceptions == elements) return this;
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableThinMethod(this.access, this.name, this.desc, this.signature, newValue, this.annotations);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ThinClassVisitor.ThinMethod#annotations() annotations}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableThinMethod withAnnotations(String... elements) {
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableThinMethod(this.access, this.name, this.desc, this.signature, this.exceptions, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ThinClassVisitor.ThinMethod#annotations() annotations}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of annotations elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableThinMethod withAnnotations(Iterable<String> elements) {
    if (this.annotations == elements) return this;
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableThinMethod(this.access, this.name, this.desc, this.signature, this.exceptions, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableThinMethod} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableThinMethod
        && equalTo((ImmutableThinMethod) another);
  }

  private boolean equalTo(ImmutableThinMethod another) {
    return access == another.access
        && name.equals(another.name)
        && desc.equals(another.desc)
        && Objects.equal(signature, another.signature)
        && exceptions.equals(another.exceptions)
        && annotations.equals(another.annotations);
  }

  /**
   * Computes a hash code from attributes: {@code access}, {@code name}, {@code desc}, {@code signature}, {@code exceptions}, {@code annotations}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + access;
    h += (h << 5) + name.hashCode();
    h += (h << 5) + desc.hashCode();
    h += (h << 5) + Objects.hashCode(signature);
    h += (h << 5) + exceptions.hashCode();
    h += (h << 5) + annotations.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code ThinMethod} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("ThinMethod")
        .omitNullValues()
        .add("access", access)
        .add("name", name)
        .add("desc", desc)
        .add("signature", signature)
        .add("exceptions", exceptions)
        .add("annotations", annotations)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ThinClassVisitor.ThinMethod {
    int access;
    boolean accessIsSet;
    @Nullable String name;
    @Nullable String desc;
    @Nullable String signature;
    List<String> exceptions = ImmutableList.of();
    List<String> annotations = ImmutableList.of();
    @JsonProperty("access")
    public void setAccess(int access) {
      this.access = access;
      this.accessIsSet = true;
    }
    @JsonProperty("name")
    public void setName(String name) {
      this.name = name;
    }
    @JsonProperty("desc")
    public void setDesc(String desc) {
      this.desc = desc;
    }
    @JsonProperty("signature")
    public void setSignature(@Nullable String signature) {
      this.signature = signature;
    }
    @JsonProperty("exceptions")
    public void setExceptions(List<String> exceptions) {
      this.exceptions = exceptions;
    }
    @JsonProperty("annotations")
    public void setAnnotations(List<String> annotations) {
      this.annotations = annotations;
    }
    @Override
    public int access() { throw new UnsupportedOperationException(); }
    @Override
    public String name() { throw new UnsupportedOperationException(); }
    @Override
    public String desc() { throw new UnsupportedOperationException(); }
    @Override
    public String signature() { throw new UnsupportedOperationException(); }
    @Override
    public List<String> exceptions() { throw new UnsupportedOperationException(); }
    @Override
    public List<String> annotations() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableThinMethod fromJson(Json json) {
    ImmutableThinMethod.Builder builder = ImmutableThinMethod.builder();
    if (json.accessIsSet) {
      builder.access(json.access);
    }
    if (json.name != null) {
      builder.name(json.name);
    }
    if (json.desc != null) {
      builder.desc(json.desc);
    }
    if (json.signature != null) {
      builder.signature(json.signature);
    }
    if (json.exceptions != null) {
      builder.addAllExceptions(json.exceptions);
    }
    if (json.annotations != null) {
      builder.addAllAnnotations(json.annotations);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ThinClassVisitor.ThinMethod} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ThinMethod instance
   */
  public static ImmutableThinMethod copyOf(ThinClassVisitor.ThinMethod instance) {
    if (instance instanceof ImmutableThinMethod) {
      return (ImmutableThinMethod) instance;
    }
    return ImmutableThinMethod.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableThinMethod ImmutableThinMethod}.
   * @return A new ImmutableThinMethod builder
   */
  public static ImmutableThinMethod.Builder builder() {
    return new ImmutableThinMethod.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableThinMethod ImmutableThinMethod}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_ACCESS = 0x1L;
    private static final long INIT_BIT_NAME = 0x2L;
    private static final long INIT_BIT_DESC = 0x4L;
    private long initBits = 0x7L;

    private int access;
    private @Nullable String name;
    private @Nullable String desc;
    private @Nullable String signature;
    private ImmutableList.Builder<String> exceptions = ImmutableList.builder();
    private ImmutableList.Builder<String> annotations = ImmutableList.builder();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code ThinMethod} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(ThinClassVisitor.ThinMethod instance) {
      Preconditions.checkNotNull(instance, "instance");
      access(instance.access());
      name(instance.name());
      desc(instance.desc());
      @Nullable String signatureValue = instance.signature();
      if (signatureValue != null) {
        signature(signatureValue);
      }
      addAllExceptions(instance.exceptions());
      addAllAnnotations(instance.annotations());
      return this;
    }

    /**
     * Initializes the value for the {@link ThinClassVisitor.ThinMethod#access() access} attribute.
     * @param access The value for access 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder access(int access) {
      this.access = access;
      initBits &= ~INIT_BIT_ACCESS;
      return this;
    }

    /**
     * Initializes the value for the {@link ThinClassVisitor.ThinMethod#name() name} attribute.
     * @param name The value for name 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder name(String name) {
      this.name = Preconditions.checkNotNull(name, "name");
      initBits &= ~INIT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link ThinClassVisitor.ThinMethod#desc() desc} attribute.
     * @param desc The value for desc 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder desc(String desc) {
      this.desc = Preconditions.checkNotNull(desc, "desc");
      initBits &= ~INIT_BIT_DESC;
      return this;
    }

    /**
     * Initializes the value for the {@link ThinClassVisitor.ThinMethod#signature() signature} attribute.
     * @param signature The value for signature (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder signature(@Nullable String signature) {
      this.signature = signature;
      return this;
    }

    /**
     * Adds one element to {@link ThinClassVisitor.ThinMethod#exceptions() exceptions} list.
     * @param element A exceptions element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addExceptions(String element) {
      this.exceptions.add(element);
      return this;
    }

    /**
     * Adds elements to {@link ThinClassVisitor.ThinMethod#exceptions() exceptions} list.
     * @param elements An array of exceptions elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addExceptions(String... elements) {
      this.exceptions.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link ThinClassVisitor.ThinMethod#exceptions() exceptions} list.
     * @param elements An iterable of exceptions elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder exceptions(Iterable<String> elements) {
      this.exceptions = ImmutableList.builder();
      return addAllExceptions(elements);
    }

    /**
     * Adds elements to {@link ThinClassVisitor.ThinMethod#exceptions() exceptions} list.
     * @param elements An iterable of exceptions elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllExceptions(Iterable<String> elements) {
      this.exceptions.addAll(elements);
      return this;
    }

    /**
     * Adds one element to {@link ThinClassVisitor.ThinMethod#annotations() annotations} list.
     * @param element A annotations element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAnnotations(String element) {
      this.annotations.add(element);
      return this;
    }

    /**
     * Adds elements to {@link ThinClassVisitor.ThinMethod#annotations() annotations} list.
     * @param elements An array of annotations elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAnnotations(String... elements) {
      this.annotations.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link ThinClassVisitor.ThinMethod#annotations() annotations} list.
     * @param elements An iterable of annotations elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder annotations(Iterable<String> elements) {
      this.annotations = ImmutableList.builder();
      return addAllAnnotations(elements);
    }

    /**
     * Adds elements to {@link ThinClassVisitor.ThinMethod#annotations() annotations} list.
     * @param elements An iterable of annotations elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllAnnotations(Iterable<String> elements) {
      this.annotations.addAll(elements);
      return this;
    }

    /**
     * Builds a new {@link ImmutableThinMethod ImmutableThinMethod}.
     * @return An immutable instance of ThinMethod
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableThinMethod build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableThinMethod(access, name, desc, signature, exceptions.build(), annotations.build());
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_ACCESS) != 0) attributes.add("access");
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      if ((initBits & INIT_BIT_DESC) != 0) attributes.add("desc");
      return "Cannot build ThinMethod, some of required attributes are not set " + attributes;
    }
  }
}
