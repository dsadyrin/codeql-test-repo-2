package org.glowroot.agent.live;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Objects;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import java.io.File;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link ClasspathCache.Location}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableLocation.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "ClasspathCache.Location"})
@Immutable
final class ImmutableLocation implements ClasspathCache.Location {
  private final @Nullable File directory;
  private final @Nullable File jarFile;
  private final @Nullable String jarFileInsideJarFile;
  private final @Nullable String directoryInsideJarFile;

  private ImmutableLocation(
      @Nullable File directory,
      @Nullable File jarFile,
      @Nullable String jarFileInsideJarFile,
      @Nullable String directoryInsideJarFile) {
    this.directory = directory;
    this.jarFile = jarFile;
    this.jarFileInsideJarFile = jarFileInsideJarFile;
    this.directoryInsideJarFile = directoryInsideJarFile;
  }

  /**
   * @return The value of the {@code directory} attribute
   */
  @JsonProperty("directory")
  @Override
  public @Nullable File directory() {
    return directory;
  }

  /**
   * @return The value of the {@code jarFile} attribute
   */
  @JsonProperty("jarFile")
  @Override
  public @Nullable File jarFile() {
    return jarFile;
  }

  /**
   * @return The value of the {@code jarFileInsideJarFile} attribute
   */
  @JsonProperty("jarFileInsideJarFile")
  @Override
  public @Nullable String jarFileInsideJarFile() {
    return jarFileInsideJarFile;
  }

  /**
   * @return The value of the {@code directoryInsideJarFile} attribute
   */
  @JsonProperty("directoryInsideJarFile")
  @Override
  public @Nullable String directoryInsideJarFile() {
    return directoryInsideJarFile;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ClasspathCache.Location#directory() directory} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for directory (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLocation withDirectory(@Nullable File value) {
    if (this.directory == value) return this;
    return new ImmutableLocation(value, this.jarFile, this.jarFileInsideJarFile, this.directoryInsideJarFile);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ClasspathCache.Location#jarFile() jarFile} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for jarFile (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLocation withJarFile(@Nullable File value) {
    if (this.jarFile == value) return this;
    return new ImmutableLocation(this.directory, value, this.jarFileInsideJarFile, this.directoryInsideJarFile);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ClasspathCache.Location#jarFileInsideJarFile() jarFileInsideJarFile} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for jarFileInsideJarFile (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLocation withJarFileInsideJarFile(@Nullable String value) {
    if (Objects.equal(this.jarFileInsideJarFile, value)) return this;
    return new ImmutableLocation(this.directory, this.jarFile, value, this.directoryInsideJarFile);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ClasspathCache.Location#directoryInsideJarFile() directoryInsideJarFile} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for directoryInsideJarFile (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLocation withDirectoryInsideJarFile(@Nullable String value) {
    if (Objects.equal(this.directoryInsideJarFile, value)) return this;
    return new ImmutableLocation(this.directory, this.jarFile, this.jarFileInsideJarFile, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableLocation} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableLocation
        && equalTo((ImmutableLocation) another);
  }

  private boolean equalTo(ImmutableLocation another) {
    return Objects.equal(directory, another.directory)
        && Objects.equal(jarFile, another.jarFile)
        && Objects.equal(jarFileInsideJarFile, another.jarFileInsideJarFile)
        && Objects.equal(directoryInsideJarFile, another.directoryInsideJarFile);
  }

  /**
   * Computes a hash code from attributes: {@code directory}, {@code jarFile}, {@code jarFileInsideJarFile}, {@code directoryInsideJarFile}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(directory);
    h += (h << 5) + Objects.hashCode(jarFile);
    h += (h << 5) + Objects.hashCode(jarFileInsideJarFile);
    h += (h << 5) + Objects.hashCode(directoryInsideJarFile);
    return h;
  }

  /**
   * Prints the immutable value {@code Location} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("Location")
        .omitNullValues()
        .add("directory", directory)
        .add("jarFile", jarFile)
        .add("jarFileInsideJarFile", jarFileInsideJarFile)
        .add("directoryInsideJarFile", directoryInsideJarFile)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ClasspathCache.Location {
    @Nullable File directory;
    @Nullable File jarFile;
    @Nullable String jarFileInsideJarFile;
    @Nullable String directoryInsideJarFile;
    @JsonProperty("directory")
    public void setDirectory(@Nullable File directory) {
      this.directory = directory;
    }
    @JsonProperty("jarFile")
    public void setJarFile(@Nullable File jarFile) {
      this.jarFile = jarFile;
    }
    @JsonProperty("jarFileInsideJarFile")
    public void setJarFileInsideJarFile(@Nullable String jarFileInsideJarFile) {
      this.jarFileInsideJarFile = jarFileInsideJarFile;
    }
    @JsonProperty("directoryInsideJarFile")
    public void setDirectoryInsideJarFile(@Nullable String directoryInsideJarFile) {
      this.directoryInsideJarFile = directoryInsideJarFile;
    }
    @Override
    public File directory() { throw new UnsupportedOperationException(); }
    @Override
    public File jarFile() { throw new UnsupportedOperationException(); }
    @Override
    public String jarFileInsideJarFile() { throw new UnsupportedOperationException(); }
    @Override
    public String directoryInsideJarFile() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableLocation fromJson(Json json) {
    ImmutableLocation.Builder builder = ImmutableLocation.builder();
    if (json.directory != null) {
      builder.directory(json.directory);
    }
    if (json.jarFile != null) {
      builder.jarFile(json.jarFile);
    }
    if (json.jarFileInsideJarFile != null) {
      builder.jarFileInsideJarFile(json.jarFileInsideJarFile);
    }
    if (json.directoryInsideJarFile != null) {
      builder.directoryInsideJarFile(json.directoryInsideJarFile);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ClasspathCache.Location} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Location instance
   */
  public static ImmutableLocation copyOf(ClasspathCache.Location instance) {
    if (instance instanceof ImmutableLocation) {
      return (ImmutableLocation) instance;
    }
    return ImmutableLocation.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableLocation ImmutableLocation}.
   * @return A new ImmutableLocation builder
   */
  public static ImmutableLocation.Builder builder() {
    return new ImmutableLocation.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableLocation ImmutableLocation}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private @Nullable File directory;
    private @Nullable File jarFile;
    private @Nullable String jarFileInsideJarFile;
    private @Nullable String directoryInsideJarFile;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Location} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(ClasspathCache.Location instance) {
      Preconditions.checkNotNull(instance, "instance");
      @Nullable File directoryValue = instance.directory();
      if (directoryValue != null) {
        directory(directoryValue);
      }
      @Nullable File jarFileValue = instance.jarFile();
      if (jarFileValue != null) {
        jarFile(jarFileValue);
      }
      @Nullable String jarFileInsideJarFileValue = instance.jarFileInsideJarFile();
      if (jarFileInsideJarFileValue != null) {
        jarFileInsideJarFile(jarFileInsideJarFileValue);
      }
      @Nullable String directoryInsideJarFileValue = instance.directoryInsideJarFile();
      if (directoryInsideJarFileValue != null) {
        directoryInsideJarFile(directoryInsideJarFileValue);
      }
      return this;
    }

    /**
     * Initializes the value for the {@link ClasspathCache.Location#directory() directory} attribute.
     * @param directory The value for directory (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder directory(@Nullable File directory) {
      this.directory = directory;
      return this;
    }

    /**
     * Initializes the value for the {@link ClasspathCache.Location#jarFile() jarFile} attribute.
     * @param jarFile The value for jarFile (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder jarFile(@Nullable File jarFile) {
      this.jarFile = jarFile;
      return this;
    }

    /**
     * Initializes the value for the {@link ClasspathCache.Location#jarFileInsideJarFile() jarFileInsideJarFile} attribute.
     * @param jarFileInsideJarFile The value for jarFileInsideJarFile (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder jarFileInsideJarFile(@Nullable String jarFileInsideJarFile) {
      this.jarFileInsideJarFile = jarFileInsideJarFile;
      return this;
    }

    /**
     * Initializes the value for the {@link ClasspathCache.Location#directoryInsideJarFile() directoryInsideJarFile} attribute.
     * @param directoryInsideJarFile The value for directoryInsideJarFile (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder directoryInsideJarFile(@Nullable String directoryInsideJarFile) {
      this.directoryInsideJarFile = directoryInsideJarFile;
      return this;
    }

    /**
     * Builds a new {@link ImmutableLocation ImmutableLocation}.
     * @return An immutable instance of Location
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableLocation build() {
      return new ImmutableLocation(directory, jarFile, jarFileInsideJarFile, directoryInsideJarFile);
    }
  }
}
