package org.glowroot.agent.model;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Objects;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import org.glowroot.agent.shaded.google.common.collect.Lists;
import org.glowroot.agent.shaded.google.common.primitives.Booleans;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link TimerNameImpl}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTimerNameImpl.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code ImmutableTimerNameImpl.of()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "TimerNameImpl"})
@Immutable
public final class ImmutableTimerNameImpl extends TimerNameImpl {
  private final String name;
  private final boolean extended;
  private final @Nullable TimerNameImpl extendedTimer;
  private final int specialHashCode;

  private ImmutableTimerNameImpl(String name, boolean extended) {
    this.name = Preconditions.checkNotNull(name, "name");
    this.extended = extended;
    this.extendedTimer = initShim.extendedTimer();
    this.specialHashCode = initShim.specialHashCode();
    this.initShim = null;
  }

  private ImmutableTimerNameImpl(ImmutableTimerNameImpl original, String name, boolean extended) {
    this.name = name;
    this.extended = extended;
    this.extendedTimer = initShim.extendedTimer();
    this.specialHashCode = initShim.specialHashCode();
    this.initShim = null;
  }

  private static final int STAGE_INITIALIZING = -1;
  private static final int STAGE_UNINITIALIZED = 0;
  private static final int STAGE_INITIALIZED = 1;
  private transient volatile InitShim initShim = new InitShim();

  private final class InitShim {
    private TimerNameImpl extendedTimer;
    private int extendedTimerBuildStage;

    TimerNameImpl extendedTimer() {
      if (extendedTimerBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (extendedTimerBuildStage == STAGE_UNINITIALIZED) {
        extendedTimerBuildStage = STAGE_INITIALIZING;
        this.extendedTimer = ImmutableTimerNameImpl.super.extendedTimer();
        extendedTimerBuildStage = STAGE_INITIALIZED;
      }
      return this.extendedTimer;
    }
    private int specialHashCode;
    private int specialHashCodeBuildStage;

    int specialHashCode() {
      if (specialHashCodeBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (specialHashCodeBuildStage == STAGE_UNINITIALIZED) {
        specialHashCodeBuildStage = STAGE_INITIALIZING;
        this.specialHashCode = ImmutableTimerNameImpl.super.specialHashCode();
        specialHashCodeBuildStage = STAGE_INITIALIZED;
      }
      return this.specialHashCode;
    }

    private String formatInitCycleMessage() {
      ArrayList<String> attributes = Lists.newArrayList();
      if (extendedTimerBuildStage == STAGE_INITIALIZING) attributes.add("extendedTimer");
      if (specialHashCodeBuildStage == STAGE_INITIALIZING) attributes.add("specialHashCode");
      return "Cannot build TimerNameImpl, attribute initializers form cycle" + attributes;
    }
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
   * @return The value of the {@code extended} attribute
   */
  @JsonProperty("extended")
  @Override
  public boolean extended() {
    return extended;
  }

  /**
   * @return The computed-at-construction value of the {@code extendedTimer} attribute
   */
  @JsonProperty("extendedTimer")
  @Override
  public @Nullable TimerNameImpl extendedTimer() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.extendedTimer()
        : this.extendedTimer;
  }

  /**
   * @return The computed-at-construction value of the {@code specialHashCode} attribute
   */
  @JsonProperty("specialHashCode")
  @Override
  public int specialHashCode() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.specialHashCode()
        : this.specialHashCode;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TimerNameImpl#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTimerNameImpl withName(String value) {
    if (this.name.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "name");
    return new ImmutableTimerNameImpl(this, newValue, this.extended);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TimerNameImpl#extended() extended} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for extended
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTimerNameImpl withExtended(boolean value) {
    if (this.extended == value) return this;
    return new ImmutableTimerNameImpl(this, this.name, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTimerNameImpl} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTimerNameImpl
        && equalTo((ImmutableTimerNameImpl) another);
  }

  private boolean equalTo(ImmutableTimerNameImpl another) {
    return name.equals(another.name)
        && extended == another.extended
        && Objects.equal(extendedTimer, another.extendedTimer)
        && specialHashCode == another.specialHashCode;
  }

  /**
   * Computes a hash code from attributes: {@code name}, {@code extended}, {@code extendedTimer}, {@code specialHashCode}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + name.hashCode();
    h += (h << 5) + Booleans.hashCode(extended);
    h += (h << 5) + Objects.hashCode(extendedTimer);
    h += (h << 5) + specialHashCode;
    return h;
  }

  /**
   * Prints the immutable value {@code TimerNameImpl} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("TimerNameImpl")
        .omitNullValues()
        .add("name", name)
        .add("extended", extended)
        .add("extendedTimer", extendedTimer)
        .add("specialHashCode", specialHashCode)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends TimerNameImpl {
    @Nullable String name;
    boolean extended;
    boolean extendedIsSet;
    @JsonProperty("name")
    public void setName(String name) {
      this.name = name;
    }
    @JsonProperty("extended")
    public void setExtended(boolean extended) {
      this.extended = extended;
      this.extendedIsSet = true;
    }
    @Override
    public String name() { throw new UnsupportedOperationException(); }
    @Override
    public boolean extended() { throw new UnsupportedOperationException(); }
    @Override
    public TimerNameImpl extendedTimer() { throw new UnsupportedOperationException(); }
    @Override
    public int specialHashCode() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableTimerNameImpl fromJson(Json json) {
    ImmutableTimerNameImpl.Builder builder = ImmutableTimerNameImpl.builder();
    if (json.name != null) {
      builder.name(json.name);
    }
    if (json.extendedIsSet) {
      builder.extended(json.extended);
    }
    return builder.build();
  }

  /**
   * Construct a new immutable {@code TimerNameImpl} instance.
   * @param name The value for the {@code name} attribute
   * @param extended The value for the {@code extended} attribute
   * @return An immutable TimerNameImpl instance
   */
  public static ImmutableTimerNameImpl of(String name, boolean extended) {
    return new ImmutableTimerNameImpl(name, extended);
  }

  /**
   * Creates an immutable copy of a {@link TimerNameImpl} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable TimerNameImpl instance
   */
  public static ImmutableTimerNameImpl copyOf(TimerNameImpl instance) {
    if (instance instanceof ImmutableTimerNameImpl) {
      return (ImmutableTimerNameImpl) instance;
    }
    return ImmutableTimerNameImpl.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableTimerNameImpl ImmutableTimerNameImpl}.
   * @return A new ImmutableTimerNameImpl builder
   */
  public static ImmutableTimerNameImpl.Builder builder() {
    return new ImmutableTimerNameImpl.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableTimerNameImpl ImmutableTimerNameImpl}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_NAME = 0x1L;
    private static final long INIT_BIT_EXTENDED = 0x2L;
    private long initBits = 0x3L;

    private @Nullable String name;
    private boolean extended;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code TimerNameImpl} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(TimerNameImpl instance) {
      Preconditions.checkNotNull(instance, "instance");
      name(instance.name());
      extended(instance.extended());
      return this;
    }

    /**
     * Initializes the value for the {@link TimerNameImpl#name() name} attribute.
     * @param name The value for name 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder name(String name) {
      this.name = Preconditions.checkNotNull(name, "name");
      initBits &= ~INIT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link TimerNameImpl#extended() extended} attribute.
     * @param extended The value for extended 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder extended(boolean extended) {
      this.extended = extended;
      initBits &= ~INIT_BIT_EXTENDED;
      return this;
    }

    /**
     * Builds a new {@link ImmutableTimerNameImpl ImmutableTimerNameImpl}.
     * @return An immutable instance of TimerNameImpl
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableTimerNameImpl build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableTimerNameImpl(null, name, extended);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      if ((initBits & INIT_BIT_EXTENDED) != 0) attributes.add("extended");
      return "Cannot build TimerNameImpl, some of required attributes are not set " + attributes;
    }
  }
}
