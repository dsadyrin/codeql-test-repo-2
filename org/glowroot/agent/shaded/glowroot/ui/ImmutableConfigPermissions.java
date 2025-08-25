package org.glowroot.agent.shaded.glowroot.ui;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import org.glowroot.agent.shaded.google.common.collect.Lists;
import org.glowroot.agent.shaded.google.common.primitives.Booleans;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link LayoutService.ConfigPermissions}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableConfigPermissions.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "LayoutService.ConfigPermissions"})
@Immutable
final class ImmutableConfigPermissions implements LayoutService.ConfigPermissions {
  private final boolean view;
  private final LayoutService.EditConfigPermissions edit;

  private ImmutableConfigPermissions(boolean view, LayoutService.EditConfigPermissions edit) {
    this.view = view;
    this.edit = edit;
  }

  /**
   * @return The value of the {@code view} attribute
   */
  @JsonProperty("view")
  @Override
  public boolean view() {
    return view;
  }

  /**
   * @return The value of the {@code edit} attribute
   */
  @JsonProperty("edit")
  @Override
  public LayoutService.EditConfigPermissions edit() {
    return edit;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LayoutService.ConfigPermissions#view() view} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for view
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableConfigPermissions withView(boolean value) {
    if (this.view == value) return this;
    return new ImmutableConfigPermissions(value, this.edit);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LayoutService.ConfigPermissions#edit() edit} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for edit
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableConfigPermissions withEdit(LayoutService.EditConfigPermissions value) {
    if (this.edit == value) return this;
    LayoutService.EditConfigPermissions newValue = Preconditions.checkNotNull(value, "edit");
    return new ImmutableConfigPermissions(this.view, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableConfigPermissions} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableConfigPermissions
        && equalTo((ImmutableConfigPermissions) another);
  }

  private boolean equalTo(ImmutableConfigPermissions another) {
    return view == another.view
        && edit.equals(another.edit);
  }

  /**
   * Computes a hash code from attributes: {@code view}, {@code edit}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Booleans.hashCode(view);
    h += (h << 5) + edit.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code ConfigPermissions} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("ConfigPermissions")
        .omitNullValues()
        .add("view", view)
        .add("edit", edit)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements LayoutService.ConfigPermissions {
    boolean view;
    boolean viewIsSet;
    @Nullable LayoutService.EditConfigPermissions edit;
    @JsonProperty("view")
    public void setView(boolean view) {
      this.view = view;
      this.viewIsSet = true;
    }
    @JsonProperty("edit")
    public void setEdit(LayoutService.EditConfigPermissions edit) {
      this.edit = edit;
    }
    @Override
    public boolean view() { throw new UnsupportedOperationException(); }
    @Override
    public LayoutService.EditConfigPermissions edit() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableConfigPermissions fromJson(Json json) {
    ImmutableConfigPermissions.Builder builder = ImmutableConfigPermissions.builder();
    if (json.viewIsSet) {
      builder.view(json.view);
    }
    if (json.edit != null) {
      builder.edit(json.edit);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link LayoutService.ConfigPermissions} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ConfigPermissions instance
   */
  public static ImmutableConfigPermissions copyOf(LayoutService.ConfigPermissions instance) {
    if (instance instanceof ImmutableConfigPermissions) {
      return (ImmutableConfigPermissions) instance;
    }
    return ImmutableConfigPermissions.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableConfigPermissions ImmutableConfigPermissions}.
   * @return A new ImmutableConfigPermissions builder
   */
  public static ImmutableConfigPermissions.Builder builder() {
    return new ImmutableConfigPermissions.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableConfigPermissions ImmutableConfigPermissions}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_VIEW = 0x1L;
    private static final long INIT_BIT_EDIT = 0x2L;
    private long initBits = 0x3L;

    private boolean view;
    private @Nullable LayoutService.EditConfigPermissions edit;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code ConfigPermissions} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(LayoutService.ConfigPermissions instance) {
      Preconditions.checkNotNull(instance, "instance");
      view(instance.view());
      edit(instance.edit());
      return this;
    }

    /**
     * Initializes the value for the {@link LayoutService.ConfigPermissions#view() view} attribute.
     * @param view The value for view 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder view(boolean view) {
      this.view = view;
      initBits &= ~INIT_BIT_VIEW;
      return this;
    }

    /**
     * Initializes the value for the {@link LayoutService.ConfigPermissions#edit() edit} attribute.
     * @param edit The value for edit 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder edit(LayoutService.EditConfigPermissions edit) {
      this.edit = Preconditions.checkNotNull(edit, "edit");
      initBits &= ~INIT_BIT_EDIT;
      return this;
    }

    /**
     * Builds a new {@link ImmutableConfigPermissions ImmutableConfigPermissions}.
     * @return An immutable instance of ConfigPermissions
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableConfigPermissions build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableConfigPermissions(view, edit);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_VIEW) != 0) attributes.add("view");
      if ((initBits & INIT_BIT_EDIT) != 0) attributes.add("edit");
      return "Cannot build ConfigPermissions, some of required attributes are not set " + attributes;
    }
  }
}
