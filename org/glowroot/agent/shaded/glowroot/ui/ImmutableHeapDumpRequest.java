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
 * Immutable implementation of {@link JvmJsonService.HeapDumpRequest}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableHeapDumpRequest.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "JvmJsonService.HeapDumpRequest"})
@Immutable
final class ImmutableHeapDumpRequest implements JvmJsonService.HeapDumpRequest {
  private final String directory;

  private ImmutableHeapDumpRequest(String directory) {
    this.directory = directory;
  }

  /**
   * @return The value of the {@code directory} attribute
   */
  @JsonProperty("directory")
  @Override
  public String directory() {
    return directory;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link JvmJsonService.HeapDumpRequest#directory() directory} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for directory
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableHeapDumpRequest withDirectory(String value) {
    if (this.directory.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "directory");
    return new ImmutableHeapDumpRequest(newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableHeapDumpRequest} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableHeapDumpRequest
        && equalTo((ImmutableHeapDumpRequest) another);
  }

  private boolean equalTo(ImmutableHeapDumpRequest another) {
    return directory.equals(another.directory);
  }

  /**
   * Computes a hash code from attributes: {@code directory}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + directory.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code HeapDumpRequest} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("HeapDumpRequest")
        .omitNullValues()
        .add("directory", directory)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements JvmJsonService.HeapDumpRequest {
    @Nullable String directory;
    @JsonProperty("directory")
    public void setDirectory(String directory) {
      this.directory = directory;
    }
    @Override
    public String directory() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableHeapDumpRequest fromJson(Json json) {
    ImmutableHeapDumpRequest.Builder builder = ImmutableHeapDumpRequest.builder();
    if (json.directory != null) {
      builder.directory(json.directory);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link JvmJsonService.HeapDumpRequest} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable HeapDumpRequest instance
   */
  public static ImmutableHeapDumpRequest copyOf(JvmJsonService.HeapDumpRequest instance) {
    if (instance instanceof ImmutableHeapDumpRequest) {
      return (ImmutableHeapDumpRequest) instance;
    }
    return ImmutableHeapDumpRequest.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableHeapDumpRequest ImmutableHeapDumpRequest}.
   * @return A new ImmutableHeapDumpRequest builder
   */
  public static ImmutableHeapDumpRequest.Builder builder() {
    return new ImmutableHeapDumpRequest.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableHeapDumpRequest ImmutableHeapDumpRequest}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_DIRECTORY = 0x1L;
    private long initBits = 0x1L;

    private @Nullable String directory;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code HeapDumpRequest} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(JvmJsonService.HeapDumpRequest instance) {
      Preconditions.checkNotNull(instance, "instance");
      directory(instance.directory());
      return this;
    }

    /**
     * Initializes the value for the {@link JvmJsonService.HeapDumpRequest#directory() directory} attribute.
     * @param directory The value for directory 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder directory(String directory) {
      this.directory = Preconditions.checkNotNull(directory, "directory");
      initBits &= ~INIT_BIT_DIRECTORY;
      return this;
    }

    /**
     * Builds a new {@link ImmutableHeapDumpRequest ImmutableHeapDumpRequest}.
     * @return An immutable instance of HeapDumpRequest
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableHeapDumpRequest build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableHeapDumpRequest(directory);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_DIRECTORY) != 0) attributes.add("directory");
      return "Cannot build HeapDumpRequest, some of required attributes are not set " + attributes;
    }
  }
}
