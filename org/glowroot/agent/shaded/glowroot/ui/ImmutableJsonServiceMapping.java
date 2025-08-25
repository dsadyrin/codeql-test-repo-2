package org.glowroot.agent.shaded.glowroot.ui;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Objects;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import org.glowroot.agent.shaded.google.common.collect.Lists;
import org.glowroot.agent.shaded.google.common.primitives.Booleans;
import java.lang.reflect.Method;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link CommonHandler.JsonServiceMapping}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableJsonServiceMapping.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "CommonHandler.JsonServiceMapping"})
@Immutable
final class ImmutableJsonServiceMapping implements CommonHandler.JsonServiceMapping {
  private final CommonHandler.HttpMethod httpMethod;
  private final String path;
  private final String permission;
  private final Object service;
  private final Method method;
  private final boolean bindAgentId;
  private final boolean bindAgentRollup;
  private final @Nullable Class<?> bindRequest;
  private final boolean bindAutoRefresh;
  private final boolean bindAuthentication;

  private ImmutableJsonServiceMapping(
      CommonHandler.HttpMethod httpMethod,
      String path,
      String permission,
      Object service,
      Method method,
      boolean bindAgentId,
      boolean bindAgentRollup,
      @Nullable Class<?> bindRequest,
      boolean bindAutoRefresh,
      boolean bindAuthentication) {
    this.httpMethod = httpMethod;
    this.path = path;
    this.permission = permission;
    this.service = service;
    this.method = method;
    this.bindAgentId = bindAgentId;
    this.bindAgentRollup = bindAgentRollup;
    this.bindRequest = bindRequest;
    this.bindAutoRefresh = bindAutoRefresh;
    this.bindAuthentication = bindAuthentication;
  }

  /**
   * @return The value of the {@code httpMethod} attribute
   */
  @JsonProperty("httpMethod")
  @Override
  public CommonHandler.HttpMethod httpMethod() {
    return httpMethod;
  }

  /**
   * @return The value of the {@code path} attribute
   */
  @JsonProperty("path")
  @Override
  public String path() {
    return path;
  }

  /**
   * @return The value of the {@code permission} attribute
   */
  @JsonProperty("permission")
  @Override
  public String permission() {
    return permission;
  }

  /**
   * @return The value of the {@code service} attribute
   */
  @JsonProperty("service")
  @Override
  public Object service() {
    return service;
  }

  /**
   * @return The value of the {@code method} attribute
   */
  @JsonProperty("method")
  @Override
  public Method method() {
    return method;
  }

  /**
   * @return The value of the {@code bindAgentId} attribute
   */
  @JsonProperty("bindAgentId")
  @Override
  public boolean bindAgentId() {
    return bindAgentId;
  }

  /**
   * @return The value of the {@code bindAgentRollup} attribute
   */
  @JsonProperty("bindAgentRollup")
  @Override
  public boolean bindAgentRollup() {
    return bindAgentRollup;
  }

  /**
   * @return The value of the {@code bindRequest} attribute
   */
  @JsonProperty("bindRequest")
  @Override
  public @Nullable Class<?> bindRequest() {
    return bindRequest;
  }

  /**
   * @return The value of the {@code bindAutoRefresh} attribute
   */
  @JsonProperty("bindAutoRefresh")
  @Override
  public boolean bindAutoRefresh() {
    return bindAutoRefresh;
  }

  /**
   * @return The value of the {@code bindAuthentication} attribute
   */
  @JsonProperty("bindAuthentication")
  @Override
  public boolean bindAuthentication() {
    return bindAuthentication;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CommonHandler.JsonServiceMapping#httpMethod() httpMethod} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for httpMethod
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableJsonServiceMapping withHttpMethod(CommonHandler.HttpMethod value) {
    if (this.httpMethod == value) return this;
    CommonHandler.HttpMethod newValue = Preconditions.checkNotNull(value, "httpMethod");
    return new ImmutableJsonServiceMapping(
        newValue,
        this.path,
        this.permission,
        this.service,
        this.method,
        this.bindAgentId,
        this.bindAgentRollup,
        this.bindRequest,
        this.bindAutoRefresh,
        this.bindAuthentication);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CommonHandler.JsonServiceMapping#path() path} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for path
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableJsonServiceMapping withPath(String value) {
    if (this.path.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "path");
    return new ImmutableJsonServiceMapping(
        this.httpMethod,
        newValue,
        this.permission,
        this.service,
        this.method,
        this.bindAgentId,
        this.bindAgentRollup,
        this.bindRequest,
        this.bindAutoRefresh,
        this.bindAuthentication);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CommonHandler.JsonServiceMapping#permission() permission} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for permission
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableJsonServiceMapping withPermission(String value) {
    if (this.permission.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "permission");
    return new ImmutableJsonServiceMapping(
        this.httpMethod,
        this.path,
        newValue,
        this.service,
        this.method,
        this.bindAgentId,
        this.bindAgentRollup,
        this.bindRequest,
        this.bindAutoRefresh,
        this.bindAuthentication);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CommonHandler.JsonServiceMapping#service() service} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for service
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableJsonServiceMapping withService(Object value) {
    if (this.service == value) return this;
    Object newValue = Preconditions.checkNotNull(value, "service");
    return new ImmutableJsonServiceMapping(
        this.httpMethod,
        this.path,
        this.permission,
        newValue,
        this.method,
        this.bindAgentId,
        this.bindAgentRollup,
        this.bindRequest,
        this.bindAutoRefresh,
        this.bindAuthentication);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CommonHandler.JsonServiceMapping#method() method} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for method
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableJsonServiceMapping withMethod(Method value) {
    if (this.method == value) return this;
    Method newValue = Preconditions.checkNotNull(value, "method");
    return new ImmutableJsonServiceMapping(
        this.httpMethod,
        this.path,
        this.permission,
        this.service,
        newValue,
        this.bindAgentId,
        this.bindAgentRollup,
        this.bindRequest,
        this.bindAutoRefresh,
        this.bindAuthentication);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CommonHandler.JsonServiceMapping#bindAgentId() bindAgentId} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for bindAgentId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableJsonServiceMapping withBindAgentId(boolean value) {
    if (this.bindAgentId == value) return this;
    return new ImmutableJsonServiceMapping(
        this.httpMethod,
        this.path,
        this.permission,
        this.service,
        this.method,
        value,
        this.bindAgentRollup,
        this.bindRequest,
        this.bindAutoRefresh,
        this.bindAuthentication);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CommonHandler.JsonServiceMapping#bindAgentRollup() bindAgentRollup} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for bindAgentRollup
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableJsonServiceMapping withBindAgentRollup(boolean value) {
    if (this.bindAgentRollup == value) return this;
    return new ImmutableJsonServiceMapping(
        this.httpMethod,
        this.path,
        this.permission,
        this.service,
        this.method,
        this.bindAgentId,
        value,
        this.bindRequest,
        this.bindAutoRefresh,
        this.bindAuthentication);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CommonHandler.JsonServiceMapping#bindRequest() bindRequest} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for bindRequest (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableJsonServiceMapping withBindRequest(@Nullable Class<?> value) {
    if (this.bindRequest == value) return this;
    return new ImmutableJsonServiceMapping(
        this.httpMethod,
        this.path,
        this.permission,
        this.service,
        this.method,
        this.bindAgentId,
        this.bindAgentRollup,
        value,
        this.bindAutoRefresh,
        this.bindAuthentication);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CommonHandler.JsonServiceMapping#bindAutoRefresh() bindAutoRefresh} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for bindAutoRefresh
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableJsonServiceMapping withBindAutoRefresh(boolean value) {
    if (this.bindAutoRefresh == value) return this;
    return new ImmutableJsonServiceMapping(
        this.httpMethod,
        this.path,
        this.permission,
        this.service,
        this.method,
        this.bindAgentId,
        this.bindAgentRollup,
        this.bindRequest,
        value,
        this.bindAuthentication);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CommonHandler.JsonServiceMapping#bindAuthentication() bindAuthentication} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for bindAuthentication
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableJsonServiceMapping withBindAuthentication(boolean value) {
    if (this.bindAuthentication == value) return this;
    return new ImmutableJsonServiceMapping(
        this.httpMethod,
        this.path,
        this.permission,
        this.service,
        this.method,
        this.bindAgentId,
        this.bindAgentRollup,
        this.bindRequest,
        this.bindAutoRefresh,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableJsonServiceMapping} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableJsonServiceMapping
        && equalTo((ImmutableJsonServiceMapping) another);
  }

  private boolean equalTo(ImmutableJsonServiceMapping another) {
    return httpMethod.equals(another.httpMethod)
        && path.equals(another.path)
        && permission.equals(another.permission)
        && service.equals(another.service)
        && method.equals(another.method)
        && bindAgentId == another.bindAgentId
        && bindAgentRollup == another.bindAgentRollup
        && Objects.equal(bindRequest, another.bindRequest)
        && bindAutoRefresh == another.bindAutoRefresh
        && bindAuthentication == another.bindAuthentication;
  }

  /**
   * Computes a hash code from attributes: {@code httpMethod}, {@code path}, {@code permission}, {@code service}, {@code method}, {@code bindAgentId}, {@code bindAgentRollup}, {@code bindRequest}, {@code bindAutoRefresh}, {@code bindAuthentication}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + httpMethod.hashCode();
    h += (h << 5) + path.hashCode();
    h += (h << 5) + permission.hashCode();
    h += (h << 5) + service.hashCode();
    h += (h << 5) + method.hashCode();
    h += (h << 5) + Booleans.hashCode(bindAgentId);
    h += (h << 5) + Booleans.hashCode(bindAgentRollup);
    h += (h << 5) + Objects.hashCode(bindRequest);
    h += (h << 5) + Booleans.hashCode(bindAutoRefresh);
    h += (h << 5) + Booleans.hashCode(bindAuthentication);
    return h;
  }

  /**
   * Prints the immutable value {@code JsonServiceMapping} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("JsonServiceMapping")
        .omitNullValues()
        .add("httpMethod", httpMethod)
        .add("path", path)
        .add("permission", permission)
        .add("service", service)
        .add("method", method)
        .add("bindAgentId", bindAgentId)
        .add("bindAgentRollup", bindAgentRollup)
        .add("bindRequest", bindRequest)
        .add("bindAutoRefresh", bindAutoRefresh)
        .add("bindAuthentication", bindAuthentication)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements CommonHandler.JsonServiceMapping {
    @Nullable CommonHandler.HttpMethod httpMethod;
    @Nullable String path;
    @Nullable String permission;
    @Nullable Object service;
    @Nullable Method method;
    boolean bindAgentId;
    boolean bindAgentIdIsSet;
    boolean bindAgentRollup;
    boolean bindAgentRollupIsSet;
    @Nullable Class<?> bindRequest;
    boolean bindAutoRefresh;
    boolean bindAutoRefreshIsSet;
    boolean bindAuthentication;
    boolean bindAuthenticationIsSet;
    @JsonProperty("httpMethod")
    public void setHttpMethod(CommonHandler.HttpMethod httpMethod) {
      this.httpMethod = httpMethod;
    }
    @JsonProperty("path")
    public void setPath(String path) {
      this.path = path;
    }
    @JsonProperty("permission")
    public void setPermission(String permission) {
      this.permission = permission;
    }
    @JsonProperty("service")
    public void setService(Object service) {
      this.service = service;
    }
    @JsonProperty("method")
    public void setMethod(Method method) {
      this.method = method;
    }
    @JsonProperty("bindAgentId")
    public void setBindAgentId(boolean bindAgentId) {
      this.bindAgentId = bindAgentId;
      this.bindAgentIdIsSet = true;
    }
    @JsonProperty("bindAgentRollup")
    public void setBindAgentRollup(boolean bindAgentRollup) {
      this.bindAgentRollup = bindAgentRollup;
      this.bindAgentRollupIsSet = true;
    }
    @JsonProperty("bindRequest")
    public void setBindRequest(@Nullable Class<?> bindRequest) {
      this.bindRequest = bindRequest;
    }
    @JsonProperty("bindAutoRefresh")
    public void setBindAutoRefresh(boolean bindAutoRefresh) {
      this.bindAutoRefresh = bindAutoRefresh;
      this.bindAutoRefreshIsSet = true;
    }
    @JsonProperty("bindAuthentication")
    public void setBindAuthentication(boolean bindAuthentication) {
      this.bindAuthentication = bindAuthentication;
      this.bindAuthenticationIsSet = true;
    }
    @Override
    public CommonHandler.HttpMethod httpMethod() { throw new UnsupportedOperationException(); }
    @Override
    public String path() { throw new UnsupportedOperationException(); }
    @Override
    public String permission() { throw new UnsupportedOperationException(); }
    @Override
    public Object service() { throw new UnsupportedOperationException(); }
    @Override
    public Method method() { throw new UnsupportedOperationException(); }
    @Override
    public boolean bindAgentId() { throw new UnsupportedOperationException(); }
    @Override
    public boolean bindAgentRollup() { throw new UnsupportedOperationException(); }
    @Override
    public Class<?> bindRequest() { throw new UnsupportedOperationException(); }
    @Override
    public boolean bindAutoRefresh() { throw new UnsupportedOperationException(); }
    @Override
    public boolean bindAuthentication() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableJsonServiceMapping fromJson(Json json) {
    ImmutableJsonServiceMapping.Builder builder = ImmutableJsonServiceMapping.builder();
    if (json.httpMethod != null) {
      builder.httpMethod(json.httpMethod);
    }
    if (json.path != null) {
      builder.path(json.path);
    }
    if (json.permission != null) {
      builder.permission(json.permission);
    }
    if (json.service != null) {
      builder.service(json.service);
    }
    if (json.method != null) {
      builder.method(json.method);
    }
    if (json.bindAgentIdIsSet) {
      builder.bindAgentId(json.bindAgentId);
    }
    if (json.bindAgentRollupIsSet) {
      builder.bindAgentRollup(json.bindAgentRollup);
    }
    if (json.bindRequest != null) {
      builder.bindRequest(json.bindRequest);
    }
    if (json.bindAutoRefreshIsSet) {
      builder.bindAutoRefresh(json.bindAutoRefresh);
    }
    if (json.bindAuthenticationIsSet) {
      builder.bindAuthentication(json.bindAuthentication);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link CommonHandler.JsonServiceMapping} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable JsonServiceMapping instance
   */
  public static ImmutableJsonServiceMapping copyOf(CommonHandler.JsonServiceMapping instance) {
    if (instance instanceof ImmutableJsonServiceMapping) {
      return (ImmutableJsonServiceMapping) instance;
    }
    return ImmutableJsonServiceMapping.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableJsonServiceMapping ImmutableJsonServiceMapping}.
   * @return A new ImmutableJsonServiceMapping builder
   */
  public static ImmutableJsonServiceMapping.Builder builder() {
    return new ImmutableJsonServiceMapping.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableJsonServiceMapping ImmutableJsonServiceMapping}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_HTTP_METHOD = 0x1L;
    private static final long INIT_BIT_PATH = 0x2L;
    private static final long INIT_BIT_PERMISSION = 0x4L;
    private static final long INIT_BIT_SERVICE = 0x8L;
    private static final long INIT_BIT_METHOD = 0x10L;
    private static final long INIT_BIT_BIND_AGENT_ID = 0x20L;
    private static final long INIT_BIT_BIND_AGENT_ROLLUP = 0x40L;
    private static final long INIT_BIT_BIND_AUTO_REFRESH = 0x80L;
    private static final long INIT_BIT_BIND_AUTHENTICATION = 0x100L;
    private long initBits = 0x1ffL;

    private @Nullable CommonHandler.HttpMethod httpMethod;
    private @Nullable String path;
    private @Nullable String permission;
    private @Nullable Object service;
    private @Nullable Method method;
    private boolean bindAgentId;
    private boolean bindAgentRollup;
    private @Nullable Class<?> bindRequest;
    private boolean bindAutoRefresh;
    private boolean bindAuthentication;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code JsonServiceMapping} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(CommonHandler.JsonServiceMapping instance) {
      Preconditions.checkNotNull(instance, "instance");
      httpMethod(instance.httpMethod());
      path(instance.path());
      permission(instance.permission());
      service(instance.service());
      method(instance.method());
      bindAgentId(instance.bindAgentId());
      bindAgentRollup(instance.bindAgentRollup());
      @Nullable Class<?> bindRequestValue = instance.bindRequest();
      if (bindRequestValue != null) {
        bindRequest(bindRequestValue);
      }
      bindAutoRefresh(instance.bindAutoRefresh());
      bindAuthentication(instance.bindAuthentication());
      return this;
    }

    /**
     * Initializes the value for the {@link CommonHandler.JsonServiceMapping#httpMethod() httpMethod} attribute.
     * @param httpMethod The value for httpMethod 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder httpMethod(CommonHandler.HttpMethod httpMethod) {
      this.httpMethod = Preconditions.checkNotNull(httpMethod, "httpMethod");
      initBits &= ~INIT_BIT_HTTP_METHOD;
      return this;
    }

    /**
     * Initializes the value for the {@link CommonHandler.JsonServiceMapping#path() path} attribute.
     * @param path The value for path 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder path(String path) {
      this.path = Preconditions.checkNotNull(path, "path");
      initBits &= ~INIT_BIT_PATH;
      return this;
    }

    /**
     * Initializes the value for the {@link CommonHandler.JsonServiceMapping#permission() permission} attribute.
     * @param permission The value for permission 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder permission(String permission) {
      this.permission = Preconditions.checkNotNull(permission, "permission");
      initBits &= ~INIT_BIT_PERMISSION;
      return this;
    }

    /**
     * Initializes the value for the {@link CommonHandler.JsonServiceMapping#service() service} attribute.
     * @param service The value for service 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder service(Object service) {
      this.service = Preconditions.checkNotNull(service, "service");
      initBits &= ~INIT_BIT_SERVICE;
      return this;
    }

    /**
     * Initializes the value for the {@link CommonHandler.JsonServiceMapping#method() method} attribute.
     * @param method The value for method 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder method(Method method) {
      this.method = Preconditions.checkNotNull(method, "method");
      initBits &= ~INIT_BIT_METHOD;
      return this;
    }

    /**
     * Initializes the value for the {@link CommonHandler.JsonServiceMapping#bindAgentId() bindAgentId} attribute.
     * @param bindAgentId The value for bindAgentId 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder bindAgentId(boolean bindAgentId) {
      this.bindAgentId = bindAgentId;
      initBits &= ~INIT_BIT_BIND_AGENT_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link CommonHandler.JsonServiceMapping#bindAgentRollup() bindAgentRollup} attribute.
     * @param bindAgentRollup The value for bindAgentRollup 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder bindAgentRollup(boolean bindAgentRollup) {
      this.bindAgentRollup = bindAgentRollup;
      initBits &= ~INIT_BIT_BIND_AGENT_ROLLUP;
      return this;
    }

    /**
     * Initializes the value for the {@link CommonHandler.JsonServiceMapping#bindRequest() bindRequest} attribute.
     * @param bindRequest The value for bindRequest (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder bindRequest(@Nullable Class<?> bindRequest) {
      this.bindRequest = bindRequest;
      return this;
    }

    /**
     * Initializes the value for the {@link CommonHandler.JsonServiceMapping#bindAutoRefresh() bindAutoRefresh} attribute.
     * @param bindAutoRefresh The value for bindAutoRefresh 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder bindAutoRefresh(boolean bindAutoRefresh) {
      this.bindAutoRefresh = bindAutoRefresh;
      initBits &= ~INIT_BIT_BIND_AUTO_REFRESH;
      return this;
    }

    /**
     * Initializes the value for the {@link CommonHandler.JsonServiceMapping#bindAuthentication() bindAuthentication} attribute.
     * @param bindAuthentication The value for bindAuthentication 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder bindAuthentication(boolean bindAuthentication) {
      this.bindAuthentication = bindAuthentication;
      initBits &= ~INIT_BIT_BIND_AUTHENTICATION;
      return this;
    }

    /**
     * Builds a new {@link ImmutableJsonServiceMapping ImmutableJsonServiceMapping}.
     * @return An immutable instance of JsonServiceMapping
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableJsonServiceMapping build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableJsonServiceMapping(
          httpMethod,
          path,
          permission,
          service,
          method,
          bindAgentId,
          bindAgentRollup,
          bindRequest,
          bindAutoRefresh,
          bindAuthentication);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_HTTP_METHOD) != 0) attributes.add("httpMethod");
      if ((initBits & INIT_BIT_PATH) != 0) attributes.add("path");
      if ((initBits & INIT_BIT_PERMISSION) != 0) attributes.add("permission");
      if ((initBits & INIT_BIT_SERVICE) != 0) attributes.add("service");
      if ((initBits & INIT_BIT_METHOD) != 0) attributes.add("method");
      if ((initBits & INIT_BIT_BIND_AGENT_ID) != 0) attributes.add("bindAgentId");
      if ((initBits & INIT_BIT_BIND_AGENT_ROLLUP) != 0) attributes.add("bindAgentRollup");
      if ((initBits & INIT_BIT_BIND_AUTO_REFRESH) != 0) attributes.add("bindAutoRefresh");
      if ((initBits & INIT_BIT_BIND_AUTHENTICATION) != 0) attributes.add("bindAuthentication");
      return "Cannot build JsonServiceMapping, some of required attributes are not set " + attributes;
    }
  }
}
