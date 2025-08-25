package org.glowroot.agent.weaving;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.Objects;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import org.glowroot.agent.shaded.google.common.collect.Lists;
import java.security.CodeSource;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link AnalyzedWorld.ParseContext}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableParseContext.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code ImmutableParseContext.of()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "AnalyzedWorld.ParseContext"})
@Immutable
final class ImmutableParseContext extends AnalyzedWorld.ParseContext {
  private final String className;
  private final @Nullable CodeSource codeSource;

  private ImmutableParseContext(String className, @Nullable CodeSource codeSource) {
    this.className = Preconditions.checkNotNull(className, "className");
    this.codeSource = codeSource;
  }

  private ImmutableParseContext(
      ImmutableParseContext original,
      String className,
      @Nullable CodeSource codeSource) {
    this.className = className;
    this.codeSource = codeSource;
  }

  /**
   * @return The value of the {@code className} attribute
   */
  @JsonProperty("className")
  @Override
  String className() {
    return className;
  }

  /**
   * @return The value of the {@code codeSource} attribute
   */
  @JsonProperty("codeSource")
  @Override
  @Nullable CodeSource codeSource() {
    return codeSource;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AnalyzedWorld.ParseContext#className() className} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for className
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableParseContext withClassName(String value) {
    if (this.className.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "className");
    return new ImmutableParseContext(this, newValue, this.codeSource);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AnalyzedWorld.ParseContext#codeSource() codeSource} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for codeSource (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableParseContext withCodeSource(@Nullable CodeSource value) {
    if (this.codeSource == value) return this;
    return new ImmutableParseContext(this, this.className, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableParseContext} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableParseContext
        && equalTo((ImmutableParseContext) another);
  }

  private boolean equalTo(ImmutableParseContext another) {
    return className.equals(another.className)
        && Objects.equal(codeSource, another.codeSource);
  }

  /**
   * Computes a hash code from attributes: {@code className}, {@code codeSource}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + className.hashCode();
    h += (h << 5) + Objects.hashCode(codeSource);
    return h;
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends AnalyzedWorld.ParseContext {
    @Nullable String className;
    @Nullable CodeSource codeSource;
    @JsonProperty("className")
    public void setClassName(String className) {
      this.className = className;
    }
    @JsonProperty("codeSource")
    public void setCodeSource(@Nullable CodeSource codeSource) {
      this.codeSource = codeSource;
    }
    @Override
    String className() { throw new UnsupportedOperationException(); }
    @Override
    CodeSource codeSource() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableParseContext fromJson(Json json) {
    ImmutableParseContext.Builder builder = ImmutableParseContext.builder();
    if (json.className != null) {
      builder.className(json.className);
    }
    if (json.codeSource != null) {
      builder.codeSource(json.codeSource);
    }
    return builder.build();
  }

  /**
   * Construct a new immutable {@code ParseContext} instance.
   * @param className The value for the {@code className} attribute
   * @param codeSource The value for the {@code codeSource} attribute
   * @return An immutable ParseContext instance
   */
  public static ImmutableParseContext of(String className, @Nullable CodeSource codeSource) {
    return new ImmutableParseContext(className, codeSource);
  }

  /**
   * Creates an immutable copy of a {@link AnalyzedWorld.ParseContext} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ParseContext instance
   */
  public static ImmutableParseContext copyOf(AnalyzedWorld.ParseContext instance) {
    if (instance instanceof ImmutableParseContext) {
      return (ImmutableParseContext) instance;
    }
    return ImmutableParseContext.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableParseContext ImmutableParseContext}.
   * @return A new ImmutableParseContext builder
   */
  public static ImmutableParseContext.Builder builder() {
    return new ImmutableParseContext.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableParseContext ImmutableParseContext}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_CLASS_NAME = 0x1L;
    private long initBits = 0x1L;

    private @Nullable String className;
    private @Nullable CodeSource codeSource;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code ParseContext} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(AnalyzedWorld.ParseContext instance) {
      Preconditions.checkNotNull(instance, "instance");
      className(instance.className());
      @Nullable CodeSource codeSourceValue = instance.codeSource();
      if (codeSourceValue != null) {
        codeSource(codeSourceValue);
      }
      return this;
    }

    /**
     * Initializes the value for the {@link AnalyzedWorld.ParseContext#className() className} attribute.
     * @param className The value for className 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder className(String className) {
      this.className = Preconditions.checkNotNull(className, "className");
      initBits &= ~INIT_BIT_CLASS_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link AnalyzedWorld.ParseContext#codeSource() codeSource} attribute.
     * @param codeSource The value for codeSource (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder codeSource(@Nullable CodeSource codeSource) {
      this.codeSource = codeSource;
      return this;
    }

    /**
     * Builds a new {@link ImmutableParseContext ImmutableParseContext}.
     * @return An immutable instance of ParseContext
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableParseContext build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableParseContext(null, className, codeSource);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_CLASS_NAME) != 0) attributes.add("className");
      return "Cannot build ParseContext, some of required attributes are not set " + attributes;
    }
  }
}
