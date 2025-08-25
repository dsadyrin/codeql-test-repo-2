package org.glowroot.agent.shaded.glowroot.ui;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Objects;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import org.glowroot.agent.shaded.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link TraceCommonService.TraceExport}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTraceExport.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code ImmutableTraceExport.of()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "TraceCommonService.TraceExport"})
@Immutable
final class ImmutableTraceExport implements TraceCommonService.TraceExport {
  private final String fileName;
  private final String headerJson;
  private final @Nullable String entriesJson;
  private final @Nullable String sharedQueryTextsJson;
  private final @Nullable String mainThreadProfileJson;
  private final @Nullable String auxThreadProfileJson;

  private ImmutableTraceExport(
      String fileName,
      String headerJson,
      @Nullable String entriesJson,
      @Nullable String sharedQueryTextsJson,
      @Nullable String mainThreadProfileJson,
      @Nullable String auxThreadProfileJson) {
    this.fileName = Preconditions.checkNotNull(fileName, "fileName");
    this.headerJson = Preconditions.checkNotNull(headerJson, "headerJson");
    this.entriesJson = entriesJson;
    this.sharedQueryTextsJson = sharedQueryTextsJson;
    this.mainThreadProfileJson = mainThreadProfileJson;
    this.auxThreadProfileJson = auxThreadProfileJson;
  }

  private ImmutableTraceExport(
      ImmutableTraceExport original,
      String fileName,
      String headerJson,
      @Nullable String entriesJson,
      @Nullable String sharedQueryTextsJson,
      @Nullable String mainThreadProfileJson,
      @Nullable String auxThreadProfileJson) {
    this.fileName = fileName;
    this.headerJson = headerJson;
    this.entriesJson = entriesJson;
    this.sharedQueryTextsJson = sharedQueryTextsJson;
    this.mainThreadProfileJson = mainThreadProfileJson;
    this.auxThreadProfileJson = auxThreadProfileJson;
  }

  /**
   * @return The value of the {@code fileName} attribute
   */
  @JsonProperty("fileName")
  @Override
  public String fileName() {
    return fileName;
  }

  /**
   * @return The value of the {@code headerJson} attribute
   */
  @JsonProperty("headerJson")
  @Override
  public String headerJson() {
    return headerJson;
  }

  /**
   * @return The value of the {@code entriesJson} attribute
   */
  @JsonProperty("entriesJson")
  @Override
  public @Nullable String entriesJson() {
    return entriesJson;
  }

  /**
   * @return The value of the {@code sharedQueryTextsJson} attribute
   */
  @JsonProperty("sharedQueryTextsJson")
  @Override
  public @Nullable String sharedQueryTextsJson() {
    return sharedQueryTextsJson;
  }

  /**
   * @return The value of the {@code mainThreadProfileJson} attribute
   */
  @JsonProperty("mainThreadProfileJson")
  @Override
  public @Nullable String mainThreadProfileJson() {
    return mainThreadProfileJson;
  }

  /**
   * @return The value of the {@code auxThreadProfileJson} attribute
   */
  @JsonProperty("auxThreadProfileJson")
  @Override
  public @Nullable String auxThreadProfileJson() {
    return auxThreadProfileJson;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TraceCommonService.TraceExport#fileName() fileName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for fileName
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTraceExport withFileName(String value) {
    if (this.fileName.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "fileName");
    return new ImmutableTraceExport(
        this,
        newValue,
        this.headerJson,
        this.entriesJson,
        this.sharedQueryTextsJson,
        this.mainThreadProfileJson,
        this.auxThreadProfileJson);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TraceCommonService.TraceExport#headerJson() headerJson} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for headerJson
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTraceExport withHeaderJson(String value) {
    if (this.headerJson.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "headerJson");
    return new ImmutableTraceExport(
        this,
        this.fileName,
        newValue,
        this.entriesJson,
        this.sharedQueryTextsJson,
        this.mainThreadProfileJson,
        this.auxThreadProfileJson);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TraceCommonService.TraceExport#entriesJson() entriesJson} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for entriesJson (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTraceExport withEntriesJson(@Nullable String value) {
    if (Objects.equal(this.entriesJson, value)) return this;
    return new ImmutableTraceExport(
        this,
        this.fileName,
        this.headerJson,
        value,
        this.sharedQueryTextsJson,
        this.mainThreadProfileJson,
        this.auxThreadProfileJson);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TraceCommonService.TraceExport#sharedQueryTextsJson() sharedQueryTextsJson} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for sharedQueryTextsJson (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTraceExport withSharedQueryTextsJson(@Nullable String value) {
    if (Objects.equal(this.sharedQueryTextsJson, value)) return this;
    return new ImmutableTraceExport(
        this,
        this.fileName,
        this.headerJson,
        this.entriesJson,
        value,
        this.mainThreadProfileJson,
        this.auxThreadProfileJson);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TraceCommonService.TraceExport#mainThreadProfileJson() mainThreadProfileJson} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for mainThreadProfileJson (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTraceExport withMainThreadProfileJson(@Nullable String value) {
    if (Objects.equal(this.mainThreadProfileJson, value)) return this;
    return new ImmutableTraceExport(
        this,
        this.fileName,
        this.headerJson,
        this.entriesJson,
        this.sharedQueryTextsJson,
        value,
        this.auxThreadProfileJson);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TraceCommonService.TraceExport#auxThreadProfileJson() auxThreadProfileJson} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for auxThreadProfileJson (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTraceExport withAuxThreadProfileJson(@Nullable String value) {
    if (Objects.equal(this.auxThreadProfileJson, value)) return this;
    return new ImmutableTraceExport(
        this,
        this.fileName,
        this.headerJson,
        this.entriesJson,
        this.sharedQueryTextsJson,
        this.mainThreadProfileJson,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTraceExport} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTraceExport
        && equalTo((ImmutableTraceExport) another);
  }

  private boolean equalTo(ImmutableTraceExport another) {
    return fileName.equals(another.fileName)
        && headerJson.equals(another.headerJson)
        && Objects.equal(entriesJson, another.entriesJson)
        && Objects.equal(sharedQueryTextsJson, another.sharedQueryTextsJson)
        && Objects.equal(mainThreadProfileJson, another.mainThreadProfileJson)
        && Objects.equal(auxThreadProfileJson, another.auxThreadProfileJson);
  }

  /**
   * Computes a hash code from attributes: {@code fileName}, {@code headerJson}, {@code entriesJson}, {@code sharedQueryTextsJson}, {@code mainThreadProfileJson}, {@code auxThreadProfileJson}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + fileName.hashCode();
    h += (h << 5) + headerJson.hashCode();
    h += (h << 5) + Objects.hashCode(entriesJson);
    h += (h << 5) + Objects.hashCode(sharedQueryTextsJson);
    h += (h << 5) + Objects.hashCode(mainThreadProfileJson);
    h += (h << 5) + Objects.hashCode(auxThreadProfileJson);
    return h;
  }

  /**
   * Prints the immutable value {@code TraceExport} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("TraceExport")
        .omitNullValues()
        .add("fileName", fileName)
        .add("headerJson", headerJson)
        .add("entriesJson", entriesJson)
        .add("sharedQueryTextsJson", sharedQueryTextsJson)
        .add("mainThreadProfileJson", mainThreadProfileJson)
        .add("auxThreadProfileJson", auxThreadProfileJson)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements TraceCommonService.TraceExport {
    @Nullable String fileName;
    @Nullable String headerJson;
    @Nullable String entriesJson;
    @Nullable String sharedQueryTextsJson;
    @Nullable String mainThreadProfileJson;
    @Nullable String auxThreadProfileJson;
    @JsonProperty("fileName")
    public void setFileName(String fileName) {
      this.fileName = fileName;
    }
    @JsonProperty("headerJson")
    public void setHeaderJson(String headerJson) {
      this.headerJson = headerJson;
    }
    @JsonProperty("entriesJson")
    public void setEntriesJson(@Nullable String entriesJson) {
      this.entriesJson = entriesJson;
    }
    @JsonProperty("sharedQueryTextsJson")
    public void setSharedQueryTextsJson(@Nullable String sharedQueryTextsJson) {
      this.sharedQueryTextsJson = sharedQueryTextsJson;
    }
    @JsonProperty("mainThreadProfileJson")
    public void setMainThreadProfileJson(@Nullable String mainThreadProfileJson) {
      this.mainThreadProfileJson = mainThreadProfileJson;
    }
    @JsonProperty("auxThreadProfileJson")
    public void setAuxThreadProfileJson(@Nullable String auxThreadProfileJson) {
      this.auxThreadProfileJson = auxThreadProfileJson;
    }
    @Override
    public String fileName() { throw new UnsupportedOperationException(); }
    @Override
    public String headerJson() { throw new UnsupportedOperationException(); }
    @Override
    public String entriesJson() { throw new UnsupportedOperationException(); }
    @Override
    public String sharedQueryTextsJson() { throw new UnsupportedOperationException(); }
    @Override
    public String mainThreadProfileJson() { throw new UnsupportedOperationException(); }
    @Override
    public String auxThreadProfileJson() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableTraceExport fromJson(Json json) {
    ImmutableTraceExport.Builder builder = ImmutableTraceExport.builder();
    if (json.fileName != null) {
      builder.fileName(json.fileName);
    }
    if (json.headerJson != null) {
      builder.headerJson(json.headerJson);
    }
    if (json.entriesJson != null) {
      builder.entriesJson(json.entriesJson);
    }
    if (json.sharedQueryTextsJson != null) {
      builder.sharedQueryTextsJson(json.sharedQueryTextsJson);
    }
    if (json.mainThreadProfileJson != null) {
      builder.mainThreadProfileJson(json.mainThreadProfileJson);
    }
    if (json.auxThreadProfileJson != null) {
      builder.auxThreadProfileJson(json.auxThreadProfileJson);
    }
    return builder.build();
  }

  /**
   * Construct a new immutable {@code TraceExport} instance.
   * @param fileName The value for the {@code fileName} attribute
   * @param headerJson The value for the {@code headerJson} attribute
   * @param entriesJson The value for the {@code entriesJson} attribute
   * @param sharedQueryTextsJson The value for the {@code sharedQueryTextsJson} attribute
   * @param mainThreadProfileJson The value for the {@code mainThreadProfileJson} attribute
   * @param auxThreadProfileJson The value for the {@code auxThreadProfileJson} attribute
   * @return An immutable TraceExport instance
   */
  public static ImmutableTraceExport of(String fileName, String headerJson, @Nullable String entriesJson, @Nullable String sharedQueryTextsJson, @Nullable String mainThreadProfileJson, @Nullable String auxThreadProfileJson) {
    return new ImmutableTraceExport(fileName, headerJson, entriesJson, sharedQueryTextsJson, mainThreadProfileJson, auxThreadProfileJson);
  }

  /**
   * Creates an immutable copy of a {@link TraceCommonService.TraceExport} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable TraceExport instance
   */
  public static ImmutableTraceExport copyOf(TraceCommonService.TraceExport instance) {
    if (instance instanceof ImmutableTraceExport) {
      return (ImmutableTraceExport) instance;
    }
    return ImmutableTraceExport.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableTraceExport ImmutableTraceExport}.
   * @return A new ImmutableTraceExport builder
   */
  public static ImmutableTraceExport.Builder builder() {
    return new ImmutableTraceExport.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableTraceExport ImmutableTraceExport}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_FILE_NAME = 0x1L;
    private static final long INIT_BIT_HEADER_JSON = 0x2L;
    private long initBits = 0x3L;

    private @Nullable String fileName;
    private @Nullable String headerJson;
    private @Nullable String entriesJson;
    private @Nullable String sharedQueryTextsJson;
    private @Nullable String mainThreadProfileJson;
    private @Nullable String auxThreadProfileJson;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code TraceExport} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(TraceCommonService.TraceExport instance) {
      Preconditions.checkNotNull(instance, "instance");
      fileName(instance.fileName());
      headerJson(instance.headerJson());
      @Nullable String entriesJsonValue = instance.entriesJson();
      if (entriesJsonValue != null) {
        entriesJson(entriesJsonValue);
      }
      @Nullable String sharedQueryTextsJsonValue = instance.sharedQueryTextsJson();
      if (sharedQueryTextsJsonValue != null) {
        sharedQueryTextsJson(sharedQueryTextsJsonValue);
      }
      @Nullable String mainThreadProfileJsonValue = instance.mainThreadProfileJson();
      if (mainThreadProfileJsonValue != null) {
        mainThreadProfileJson(mainThreadProfileJsonValue);
      }
      @Nullable String auxThreadProfileJsonValue = instance.auxThreadProfileJson();
      if (auxThreadProfileJsonValue != null) {
        auxThreadProfileJson(auxThreadProfileJsonValue);
      }
      return this;
    }

    /**
     * Initializes the value for the {@link TraceCommonService.TraceExport#fileName() fileName} attribute.
     * @param fileName The value for fileName 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder fileName(String fileName) {
      this.fileName = Preconditions.checkNotNull(fileName, "fileName");
      initBits &= ~INIT_BIT_FILE_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link TraceCommonService.TraceExport#headerJson() headerJson} attribute.
     * @param headerJson The value for headerJson 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder headerJson(String headerJson) {
      this.headerJson = Preconditions.checkNotNull(headerJson, "headerJson");
      initBits &= ~INIT_BIT_HEADER_JSON;
      return this;
    }

    /**
     * Initializes the value for the {@link TraceCommonService.TraceExport#entriesJson() entriesJson} attribute.
     * @param entriesJson The value for entriesJson (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder entriesJson(@Nullable String entriesJson) {
      this.entriesJson = entriesJson;
      return this;
    }

    /**
     * Initializes the value for the {@link TraceCommonService.TraceExport#sharedQueryTextsJson() sharedQueryTextsJson} attribute.
     * @param sharedQueryTextsJson The value for sharedQueryTextsJson (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder sharedQueryTextsJson(@Nullable String sharedQueryTextsJson) {
      this.sharedQueryTextsJson = sharedQueryTextsJson;
      return this;
    }

    /**
     * Initializes the value for the {@link TraceCommonService.TraceExport#mainThreadProfileJson() mainThreadProfileJson} attribute.
     * @param mainThreadProfileJson The value for mainThreadProfileJson (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder mainThreadProfileJson(@Nullable String mainThreadProfileJson) {
      this.mainThreadProfileJson = mainThreadProfileJson;
      return this;
    }

    /**
     * Initializes the value for the {@link TraceCommonService.TraceExport#auxThreadProfileJson() auxThreadProfileJson} attribute.
     * @param auxThreadProfileJson The value for auxThreadProfileJson (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder auxThreadProfileJson(@Nullable String auxThreadProfileJson) {
      this.auxThreadProfileJson = auxThreadProfileJson;
      return this;
    }

    /**
     * Builds a new {@link ImmutableTraceExport ImmutableTraceExport}.
     * @return An immutable instance of TraceExport
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableTraceExport build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableTraceExport(
          null,
          fileName,
          headerJson,
          entriesJson,
          sharedQueryTextsJson,
          mainThreadProfileJson,
          auxThreadProfileJson);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_FILE_NAME) != 0) attributes.add("fileName");
      if ((initBits & INIT_BIT_HEADER_JSON) != 0) attributes.add("headerJson");
      return "Cannot build TraceExport, some of required attributes are not set " + attributes;
    }
  }
}
