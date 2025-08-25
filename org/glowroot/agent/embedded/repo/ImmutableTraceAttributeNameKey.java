package org.glowroot.agent.embedded.repo;

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
 * Immutable implementation of {@link TraceAttributeNameDao.TraceAttributeNameKey}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTraceAttributeNameKey.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code ImmutableTraceAttributeNameKey.of()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "TraceAttributeNameDao.TraceAttributeNameKey"})
@Immutable
final class ImmutableTraceAttributeNameKey
    implements TraceAttributeNameDao.TraceAttributeNameKey {
  private final String transactionType;
  private final String traceAttributeName;

  private ImmutableTraceAttributeNameKey(String transactionType, String traceAttributeName) {
    this.transactionType = Preconditions.checkNotNull(transactionType, "transactionType");
    this.traceAttributeName = Preconditions.checkNotNull(traceAttributeName, "traceAttributeName");
  }

  private ImmutableTraceAttributeNameKey(
      ImmutableTraceAttributeNameKey original,
      String transactionType,
      String traceAttributeName) {
    this.transactionType = transactionType;
    this.traceAttributeName = traceAttributeName;
  }

  /**
   * @return The value of the {@code transactionType} attribute
   */
  @JsonProperty("transactionType")
  @Override
  public String transactionType() {
    return transactionType;
  }

  /**
   * @return The value of the {@code traceAttributeName} attribute
   */
  @JsonProperty("traceAttributeName")
  @Override
  public String traceAttributeName() {
    return traceAttributeName;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TraceAttributeNameDao.TraceAttributeNameKey#transactionType() transactionType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for transactionType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTraceAttributeNameKey withTransactionType(String value) {
    if (this.transactionType.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "transactionType");
    return new ImmutableTraceAttributeNameKey(this, newValue, this.traceAttributeName);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TraceAttributeNameDao.TraceAttributeNameKey#traceAttributeName() traceAttributeName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for traceAttributeName
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTraceAttributeNameKey withTraceAttributeName(String value) {
    if (this.traceAttributeName.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "traceAttributeName");
    return new ImmutableTraceAttributeNameKey(this, this.transactionType, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTraceAttributeNameKey} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTraceAttributeNameKey
        && equalTo((ImmutableTraceAttributeNameKey) another);
  }

  private boolean equalTo(ImmutableTraceAttributeNameKey another) {
    return transactionType.equals(another.transactionType)
        && traceAttributeName.equals(another.traceAttributeName);
  }

  /**
   * Computes a hash code from attributes: {@code transactionType}, {@code traceAttributeName}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + transactionType.hashCode();
    h += (h << 5) + traceAttributeName.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code TraceAttributeNameKey} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("TraceAttributeNameKey")
        .omitNullValues()
        .add("transactionType", transactionType)
        .add("traceAttributeName", traceAttributeName)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json
      implements TraceAttributeNameDao.TraceAttributeNameKey {
    @Nullable String transactionType;
    @Nullable String traceAttributeName;
    @JsonProperty("transactionType")
    public void setTransactionType(String transactionType) {
      this.transactionType = transactionType;
    }
    @JsonProperty("traceAttributeName")
    public void setTraceAttributeName(String traceAttributeName) {
      this.traceAttributeName = traceAttributeName;
    }
    @Override
    public String transactionType() { throw new UnsupportedOperationException(); }
    @Override
    public String traceAttributeName() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableTraceAttributeNameKey fromJson(Json json) {
    ImmutableTraceAttributeNameKey.Builder builder = ImmutableTraceAttributeNameKey.builder();
    if (json.transactionType != null) {
      builder.transactionType(json.transactionType);
    }
    if (json.traceAttributeName != null) {
      builder.traceAttributeName(json.traceAttributeName);
    }
    return builder.build();
  }

  /**
   * Construct a new immutable {@code TraceAttributeNameKey} instance.
   * @param transactionType The value for the {@code transactionType} attribute
   * @param traceAttributeName The value for the {@code traceAttributeName} attribute
   * @return An immutable TraceAttributeNameKey instance
   */
  public static ImmutableTraceAttributeNameKey of(String transactionType, String traceAttributeName) {
    return new ImmutableTraceAttributeNameKey(transactionType, traceAttributeName);
  }

  /**
   * Creates an immutable copy of a {@link TraceAttributeNameDao.TraceAttributeNameKey} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable TraceAttributeNameKey instance
   */
  public static ImmutableTraceAttributeNameKey copyOf(TraceAttributeNameDao.TraceAttributeNameKey instance) {
    if (instance instanceof ImmutableTraceAttributeNameKey) {
      return (ImmutableTraceAttributeNameKey) instance;
    }
    return ImmutableTraceAttributeNameKey.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableTraceAttributeNameKey ImmutableTraceAttributeNameKey}.
   * @return A new ImmutableTraceAttributeNameKey builder
   */
  public static ImmutableTraceAttributeNameKey.Builder builder() {
    return new ImmutableTraceAttributeNameKey.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableTraceAttributeNameKey ImmutableTraceAttributeNameKey}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_TRANSACTION_TYPE = 0x1L;
    private static final long INIT_BIT_TRACE_ATTRIBUTE_NAME = 0x2L;
    private long initBits = 0x3L;

    private @Nullable String transactionType;
    private @Nullable String traceAttributeName;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code TraceAttributeNameKey} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(TraceAttributeNameDao.TraceAttributeNameKey instance) {
      Preconditions.checkNotNull(instance, "instance");
      transactionType(instance.transactionType());
      traceAttributeName(instance.traceAttributeName());
      return this;
    }

    /**
     * Initializes the value for the {@link TraceAttributeNameDao.TraceAttributeNameKey#transactionType() transactionType} attribute.
     * @param transactionType The value for transactionType 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder transactionType(String transactionType) {
      this.transactionType = Preconditions.checkNotNull(transactionType, "transactionType");
      initBits &= ~INIT_BIT_TRANSACTION_TYPE;
      return this;
    }

    /**
     * Initializes the value for the {@link TraceAttributeNameDao.TraceAttributeNameKey#traceAttributeName() traceAttributeName} attribute.
     * @param traceAttributeName The value for traceAttributeName 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder traceAttributeName(String traceAttributeName) {
      this.traceAttributeName = Preconditions.checkNotNull(traceAttributeName, "traceAttributeName");
      initBits &= ~INIT_BIT_TRACE_ATTRIBUTE_NAME;
      return this;
    }

    /**
     * Builds a new {@link ImmutableTraceAttributeNameKey ImmutableTraceAttributeNameKey}.
     * @return An immutable instance of TraceAttributeNameKey
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableTraceAttributeNameKey build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableTraceAttributeNameKey(null, transactionType, traceAttributeName);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_TRANSACTION_TYPE) != 0) attributes.add("transactionType");
      if ((initBits & INIT_BIT_TRACE_ATTRIBUTE_NAME) != 0) attributes.add("traceAttributeName");
      return "Cannot build TraceAttributeNameKey, some of required attributes are not set " + attributes;
    }
  }
}
