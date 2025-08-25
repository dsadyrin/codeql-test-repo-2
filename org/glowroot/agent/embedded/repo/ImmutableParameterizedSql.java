package org.glowroot.agent.embedded.repo;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
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
 * Immutable implementation of {@link TracePointQueryBuilder.ParameterizedSql}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableParameterizedSql.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code ImmutableParameterizedSql.of()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "TracePointQueryBuilder.ParameterizedSql"})
@Immutable
final class ImmutableParameterizedSql
    extends TracePointQueryBuilder.ParameterizedSql {
  private final String sql;
  private final ImmutableList<Object> args;

  private ImmutableParameterizedSql(String sql, Iterable<? extends Object> args) {
    this.sql = Preconditions.checkNotNull(sql, "sql");
    this.args = ImmutableList.copyOf(args);
  }

  private ImmutableParameterizedSql(
      ImmutableParameterizedSql original,
      String sql,
      ImmutableList<Object> args) {
    this.sql = sql;
    this.args = args;
  }

  /**
   * @return The value of the {@code sql} attribute
   */
  @JsonProperty("sql")
  @Override
  String sql() {
    return sql;
  }

  /**
   * @return The value of the {@code args} attribute
   */
  @JsonProperty("args")
  @Override
  ImmutableList<Object> args() {
    return args;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TracePointQueryBuilder.ParameterizedSql#sql() sql} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for sql
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableParameterizedSql withSql(String value) {
    if (this.sql.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "sql");
    return new ImmutableParameterizedSql(this, newValue, this.args);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link TracePointQueryBuilder.ParameterizedSql#args() args}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameterizedSql withArgs(Object... elements) {
    ImmutableList<Object> newValue = ImmutableList.copyOf(elements);
    return new ImmutableParameterizedSql(this, this.sql, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link TracePointQueryBuilder.ParameterizedSql#args() args}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of args elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameterizedSql withArgs(Iterable<? extends Object> elements) {
    if (this.args == elements) return this;
    ImmutableList<Object> newValue = ImmutableList.copyOf(elements);
    return new ImmutableParameterizedSql(this, this.sql, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableParameterizedSql} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableParameterizedSql
        && equalTo((ImmutableParameterizedSql) another);
  }

  private boolean equalTo(ImmutableParameterizedSql another) {
    return sql.equals(another.sql)
        && args.equals(another.args);
  }

  /**
   * Computes a hash code from attributes: {@code sql}, {@code args}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + sql.hashCode();
    h += (h << 5) + args.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code ParameterizedSql} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("ParameterizedSql")
        .omitNullValues()
        .add("sql", sql)
        .add("args", args)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends TracePointQueryBuilder.ParameterizedSql {
    @Nullable String sql;
    ImmutableList<Object> args = ImmutableList.of();
    @JsonProperty("sql")
    public void setSql(String sql) {
      this.sql = sql;
    }
    @JsonProperty("args")
    public void setArgs(ImmutableList<Object> args) {
      this.args = args;
    }
    @Override
    String sql() { throw new UnsupportedOperationException(); }
    @Override
    ImmutableList<Object> args() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableParameterizedSql fromJson(Json json) {
    ImmutableParameterizedSql.Builder builder = ImmutableParameterizedSql.builder();
    if (json.sql != null) {
      builder.sql(json.sql);
    }
    if (json.args != null) {
      builder.addAllArgs(json.args);
    }
    return builder.build();
  }

  /**
   * Construct a new immutable {@code ParameterizedSql} instance.
   * @param sql The value for the {@code sql} attribute
   * @param args The value for the {@code args} attribute
   * @return An immutable ParameterizedSql instance
   */
  public static ImmutableParameterizedSql of(String sql, ImmutableList<Object> args) {
    return of(sql, (Iterable<? extends Object>) args);
  }

  /**
   * Construct a new immutable {@code ParameterizedSql} instance.
   * @param sql The value for the {@code sql} attribute
   * @param args The value for the {@code args} attribute
   * @return An immutable ParameterizedSql instance
   */
  public static ImmutableParameterizedSql of(String sql, Iterable<? extends Object> args) {
    return new ImmutableParameterizedSql(sql, args);
  }

  /**
   * Creates an immutable copy of a {@link TracePointQueryBuilder.ParameterizedSql} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ParameterizedSql instance
   */
  public static ImmutableParameterizedSql copyOf(TracePointQueryBuilder.ParameterizedSql instance) {
    if (instance instanceof ImmutableParameterizedSql) {
      return (ImmutableParameterizedSql) instance;
    }
    return ImmutableParameterizedSql.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableParameterizedSql ImmutableParameterizedSql}.
   * @return A new ImmutableParameterizedSql builder
   */
  public static ImmutableParameterizedSql.Builder builder() {
    return new ImmutableParameterizedSql.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableParameterizedSql ImmutableParameterizedSql}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_SQL = 0x1L;
    private long initBits = 0x1L;

    private @Nullable String sql;
    private ImmutableList.Builder<Object> args = ImmutableList.builder();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code ParameterizedSql} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(TracePointQueryBuilder.ParameterizedSql instance) {
      Preconditions.checkNotNull(instance, "instance");
      sql(instance.sql());
      addAllArgs(instance.args());
      return this;
    }

    /**
     * Initializes the value for the {@link TracePointQueryBuilder.ParameterizedSql#sql() sql} attribute.
     * @param sql The value for sql 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder sql(String sql) {
      this.sql = Preconditions.checkNotNull(sql, "sql");
      initBits &= ~INIT_BIT_SQL;
      return this;
    }

    /**
     * Adds one element to {@link TracePointQueryBuilder.ParameterizedSql#args() args} list.
     * @param element A args element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addArgs(Object element) {
      this.args.add(element);
      return this;
    }

    /**
     * Adds elements to {@link TracePointQueryBuilder.ParameterizedSql#args() args} list.
     * @param elements An array of args elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addArgs(Object... elements) {
      this.args.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link TracePointQueryBuilder.ParameterizedSql#args() args} list.
     * @param elements An iterable of args elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder args(Iterable<? extends Object> elements) {
      this.args = ImmutableList.builder();
      return addAllArgs(elements);
    }

    /**
     * Adds elements to {@link TracePointQueryBuilder.ParameterizedSql#args() args} list.
     * @param elements An iterable of args elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllArgs(Iterable<? extends Object> elements) {
      this.args.addAll(elements);
      return this;
    }

    /**
     * Builds a new {@link ImmutableParameterizedSql ImmutableParameterizedSql}.
     * @return An immutable instance of ParameterizedSql
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableParameterizedSql build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableParameterizedSql(null, sql, args.build());
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_SQL) != 0) attributes.add("sql");
      return "Cannot build ParameterizedSql, some of required attributes are not set " + attributes;
    }
  }
}
