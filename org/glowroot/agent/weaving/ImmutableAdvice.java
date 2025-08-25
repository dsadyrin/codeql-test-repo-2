package org.glowroot.agent.weaving;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Objects;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import org.glowroot.agent.shaded.google.common.collect.ImmutableList;
import org.glowroot.agent.shaded.google.common.collect.ImmutableSet;
import org.glowroot.agent.shaded.google.common.collect.Lists;
import org.glowroot.agent.shaded.google.common.primitives.Booleans;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.glowroot.agent.plugin.api.weaving.Pointcut;
import org.glowroot.agent.shaded.objectweb.asm.Type;
import org.glowroot.agent.shaded.objectweb.asm.commons.Method;

/**
 * Immutable implementation of {@link Advice}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAdvice.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "Advice"})
@Immutable
final class ImmutableAdvice extends Advice {
  private final Pointcut pointcut;
  private final Type adviceType;
  private final @Nullable Pattern pointcutClassNamePattern;
  private final @Nullable Pattern pointcutClassAnnotationPattern;
  private final @Nullable Pattern pointcutSubTypeRestrictionPattern;
  private final @Nullable Pattern pointcutSuperTypeRestrictionPattern;
  private final @Nullable Pattern pointcutMethodNamePattern;
  private final @Nullable Pattern pointcutMethodAnnotationPattern;
  private final ImmutableList<Object> pointcutMethodParameterTypes;
  private final @Nullable Type travelerType;
  private final @Nullable Method isEnabledAdvice;
  private final @Nullable Method onBeforeAdvice;
  private final @Nullable Method onReturnAdvice;
  private final @Nullable Method onThrowAdvice;
  private final @Nullable Method onAfterAdvice;
  private final ImmutableList<Advice.AdviceParameter> isEnabledParameters;
  private final ImmutableList<Advice.AdviceParameter> onBeforeParameters;
  private final ImmutableList<Advice.AdviceParameter> onReturnParameters;
  private final ImmutableList<Advice.AdviceParameter> onThrowParameters;
  private final ImmutableList<Advice.AdviceParameter> onAfterParameters;
  private final boolean hasBindThreadContext;
  private final boolean hasBindOptionalThreadContext;
  private final boolean reweavable;
  private final ImmutableSet<Type> classMetaTypes;
  private final ImmutableSet<Type> methodMetaTypes;

  private ImmutableAdvice(
      Pointcut pointcut,
      Type adviceType,
      @Nullable Pattern pointcutClassNamePattern,
      @Nullable Pattern pointcutClassAnnotationPattern,
      @Nullable Pattern pointcutSubTypeRestrictionPattern,
      @Nullable Pattern pointcutSuperTypeRestrictionPattern,
      @Nullable Pattern pointcutMethodNamePattern,
      @Nullable Pattern pointcutMethodAnnotationPattern,
      ImmutableList<Object> pointcutMethodParameterTypes,
      @Nullable Type travelerType,
      @Nullable Method isEnabledAdvice,
      @Nullable Method onBeforeAdvice,
      @Nullable Method onReturnAdvice,
      @Nullable Method onThrowAdvice,
      @Nullable Method onAfterAdvice,
      ImmutableList<Advice.AdviceParameter> isEnabledParameters,
      ImmutableList<Advice.AdviceParameter> onBeforeParameters,
      ImmutableList<Advice.AdviceParameter> onReturnParameters,
      ImmutableList<Advice.AdviceParameter> onThrowParameters,
      ImmutableList<Advice.AdviceParameter> onAfterParameters,
      boolean hasBindThreadContext,
      boolean hasBindOptionalThreadContext,
      boolean reweavable) {
    this.pointcut = pointcut;
    this.adviceType = adviceType;
    this.pointcutClassNamePattern = pointcutClassNamePattern;
    this.pointcutClassAnnotationPattern = pointcutClassAnnotationPattern;
    this.pointcutSubTypeRestrictionPattern = pointcutSubTypeRestrictionPattern;
    this.pointcutSuperTypeRestrictionPattern = pointcutSuperTypeRestrictionPattern;
    this.pointcutMethodNamePattern = pointcutMethodNamePattern;
    this.pointcutMethodAnnotationPattern = pointcutMethodAnnotationPattern;
    this.pointcutMethodParameterTypes = pointcutMethodParameterTypes;
    this.travelerType = travelerType;
    this.isEnabledAdvice = isEnabledAdvice;
    this.onBeforeAdvice = onBeforeAdvice;
    this.onReturnAdvice = onReturnAdvice;
    this.onThrowAdvice = onThrowAdvice;
    this.onAfterAdvice = onAfterAdvice;
    this.isEnabledParameters = isEnabledParameters;
    this.onBeforeParameters = onBeforeParameters;
    this.onReturnParameters = onReturnParameters;
    this.onThrowParameters = onThrowParameters;
    this.onAfterParameters = onAfterParameters;
    this.hasBindThreadContext = hasBindThreadContext;
    this.hasBindOptionalThreadContext = hasBindOptionalThreadContext;
    this.reweavable = reweavable;
    this.classMetaTypes = initShim.classMetaTypes();
    this.methodMetaTypes = initShim.methodMetaTypes();
    this.initShim = null;
  }

  private static final int STAGE_INITIALIZING = -1;
  private static final int STAGE_UNINITIALIZED = 0;
  private static final int STAGE_INITIALIZED = 1;
  private transient volatile InitShim initShim = new InitShim();

  private final class InitShim {
    private ImmutableSet<Type> classMetaTypes;
    private int classMetaTypesBuildStage;

    ImmutableSet<Type> classMetaTypes() {
      if (classMetaTypesBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (classMetaTypesBuildStage == STAGE_UNINITIALIZED) {
        classMetaTypesBuildStage = STAGE_INITIALIZING;
        this.classMetaTypes = Preconditions.checkNotNull(ImmutableAdvice.super.classMetaTypes(), "classMetaTypes");
        classMetaTypesBuildStage = STAGE_INITIALIZED;
      }
      return this.classMetaTypes;
    }
    private ImmutableSet<Type> methodMetaTypes;
    private int methodMetaTypesBuildStage;

    ImmutableSet<Type> methodMetaTypes() {
      if (methodMetaTypesBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (methodMetaTypesBuildStage == STAGE_UNINITIALIZED) {
        methodMetaTypesBuildStage = STAGE_INITIALIZING;
        this.methodMetaTypes = Preconditions.checkNotNull(ImmutableAdvice.super.methodMetaTypes(), "methodMetaTypes");
        methodMetaTypesBuildStage = STAGE_INITIALIZED;
      }
      return this.methodMetaTypes;
    }

    private String formatInitCycleMessage() {
      ArrayList<String> attributes = Lists.newArrayList();
      if (classMetaTypesBuildStage == STAGE_INITIALIZING) attributes.add("classMetaTypes");
      if (methodMetaTypesBuildStage == STAGE_INITIALIZING) attributes.add("methodMetaTypes");
      return "Cannot build Advice, attribute initializers form cycle" + attributes;
    }
  }

  /**
   * @return The value of the {@code pointcut} attribute
   */
  @JsonProperty("pointcut")
  @Override
  Pointcut pointcut() {
    return pointcut;
  }

  /**
   * @return The value of the {@code adviceType} attribute
   */
  @JsonProperty("adviceType")
  @Override
  Type adviceType() {
    return adviceType;
  }

  /**
   * @return The value of the {@code pointcutClassNamePattern} attribute
   */
  @JsonProperty("pointcutClassNamePattern")
  @Override
  @Nullable Pattern pointcutClassNamePattern() {
    return pointcutClassNamePattern;
  }

  /**
   * @return The value of the {@code pointcutClassAnnotationPattern} attribute
   */
  @JsonProperty("pointcutClassAnnotationPattern")
  @Override
  @Nullable Pattern pointcutClassAnnotationPattern() {
    return pointcutClassAnnotationPattern;
  }

  /**
   * @return The value of the {@code pointcutSubTypeRestrictionPattern} attribute
   */
  @JsonProperty("pointcutSubTypeRestrictionPattern")
  @Override
  @Nullable Pattern pointcutSubTypeRestrictionPattern() {
    return pointcutSubTypeRestrictionPattern;
  }

  /**
   * @return The value of the {@code pointcutSuperTypeRestrictionPattern} attribute
   */
  @JsonProperty("pointcutSuperTypeRestrictionPattern")
  @Override
  @Nullable Pattern pointcutSuperTypeRestrictionPattern() {
    return pointcutSuperTypeRestrictionPattern;
  }

  /**
   * @return The value of the {@code pointcutMethodNamePattern} attribute
   */
  @JsonProperty("pointcutMethodNamePattern")
  @Override
  @Nullable Pattern pointcutMethodNamePattern() {
    return pointcutMethodNamePattern;
  }

  /**
   * @return The value of the {@code pointcutMethodAnnotationPattern} attribute
   */
  @JsonProperty("pointcutMethodAnnotationPattern")
  @Override
  @Nullable Pattern pointcutMethodAnnotationPattern() {
    return pointcutMethodAnnotationPattern;
  }

  /**
   * @return The value of the {@code pointcutMethodParameterTypes} attribute
   */
  @JsonProperty("pointcutMethodParameterTypes")
  @Override
  ImmutableList<Object> pointcutMethodParameterTypes() {
    return pointcutMethodParameterTypes;
  }

  /**
   * @return The value of the {@code travelerType} attribute
   */
  @JsonProperty("travelerType")
  @Override
  @Nullable Type travelerType() {
    return travelerType;
  }

  /**
   * @return The value of the {@code isEnabledAdvice} attribute
   */
  @JsonProperty("isEnabledAdvice")
  @Override
  @Nullable Method isEnabledAdvice() {
    return isEnabledAdvice;
  }

  /**
   * @return The value of the {@code onBeforeAdvice} attribute
   */
  @JsonProperty("onBeforeAdvice")
  @Override
  @Nullable Method onBeforeAdvice() {
    return onBeforeAdvice;
  }

  /**
   * @return The value of the {@code onReturnAdvice} attribute
   */
  @JsonProperty("onReturnAdvice")
  @Override
  @Nullable Method onReturnAdvice() {
    return onReturnAdvice;
  }

  /**
   * @return The value of the {@code onThrowAdvice} attribute
   */
  @JsonProperty("onThrowAdvice")
  @Override
  @Nullable Method onThrowAdvice() {
    return onThrowAdvice;
  }

  /**
   * @return The value of the {@code onAfterAdvice} attribute
   */
  @JsonProperty("onAfterAdvice")
  @Override
  @Nullable Method onAfterAdvice() {
    return onAfterAdvice;
  }

  /**
   * @return The value of the {@code isEnabledParameters} attribute
   */
  @JsonProperty("isEnabledParameters")
  @Override
  ImmutableList<Advice.AdviceParameter> isEnabledParameters() {
    return isEnabledParameters;
  }

  /**
   * @return The value of the {@code onBeforeParameters} attribute
   */
  @JsonProperty("onBeforeParameters")
  @Override
  ImmutableList<Advice.AdviceParameter> onBeforeParameters() {
    return onBeforeParameters;
  }

  /**
   * @return The value of the {@code onReturnParameters} attribute
   */
  @JsonProperty("onReturnParameters")
  @Override
  ImmutableList<Advice.AdviceParameter> onReturnParameters() {
    return onReturnParameters;
  }

  /**
   * @return The value of the {@code onThrowParameters} attribute
   */
  @JsonProperty("onThrowParameters")
  @Override
  ImmutableList<Advice.AdviceParameter> onThrowParameters() {
    return onThrowParameters;
  }

  /**
   * @return The value of the {@code onAfterParameters} attribute
   */
  @JsonProperty("onAfterParameters")
  @Override
  ImmutableList<Advice.AdviceParameter> onAfterParameters() {
    return onAfterParameters;
  }

  /**
   * @return The value of the {@code hasBindThreadContext} attribute
   */
  @JsonProperty("hasBindThreadContext")
  @Override
  boolean hasBindThreadContext() {
    return hasBindThreadContext;
  }

  /**
   * @return The value of the {@code hasBindOptionalThreadContext} attribute
   */
  @JsonProperty("hasBindOptionalThreadContext")
  @Override
  boolean hasBindOptionalThreadContext() {
    return hasBindOptionalThreadContext;
  }

  /**
   * @return The value of the {@code reweavable} attribute
   */
  @JsonProperty("reweavable")
  @Override
  boolean reweavable() {
    return reweavable;
  }

  /**
   * @return The computed-at-construction value of the {@code classMetaTypes} attribute
   */
  @JsonProperty("classMetaTypes")
  @Override
  ImmutableSet<Type> classMetaTypes() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.classMetaTypes()
        : this.classMetaTypes;
  }

  /**
   * @return The computed-at-construction value of the {@code methodMetaTypes} attribute
   */
  @JsonProperty("methodMetaTypes")
  @Override
  ImmutableSet<Type> methodMetaTypes() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.methodMetaTypes()
        : this.methodMetaTypes;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Advice#pointcut() pointcut} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for pointcut
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAdvice withPointcut(Pointcut value) {
    if (this.pointcut == value) return this;
    Pointcut newValue = Preconditions.checkNotNull(value, "pointcut");
    return new ImmutableAdvice(
        newValue,
        this.adviceType,
        this.pointcutClassNamePattern,
        this.pointcutClassAnnotationPattern,
        this.pointcutSubTypeRestrictionPattern,
        this.pointcutSuperTypeRestrictionPattern,
        this.pointcutMethodNamePattern,
        this.pointcutMethodAnnotationPattern,
        this.pointcutMethodParameterTypes,
        this.travelerType,
        this.isEnabledAdvice,
        this.onBeforeAdvice,
        this.onReturnAdvice,
        this.onThrowAdvice,
        this.onAfterAdvice,
        this.isEnabledParameters,
        this.onBeforeParameters,
        this.onReturnParameters,
        this.onThrowParameters,
        this.onAfterParameters,
        this.hasBindThreadContext,
        this.hasBindOptionalThreadContext,
        this.reweavable);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Advice#adviceType() adviceType} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for adviceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAdvice withAdviceType(Type value) {
    if (this.adviceType == value) return this;
    Type newValue = Preconditions.checkNotNull(value, "adviceType");
    return new ImmutableAdvice(
        this.pointcut,
        newValue,
        this.pointcutClassNamePattern,
        this.pointcutClassAnnotationPattern,
        this.pointcutSubTypeRestrictionPattern,
        this.pointcutSuperTypeRestrictionPattern,
        this.pointcutMethodNamePattern,
        this.pointcutMethodAnnotationPattern,
        this.pointcutMethodParameterTypes,
        this.travelerType,
        this.isEnabledAdvice,
        this.onBeforeAdvice,
        this.onReturnAdvice,
        this.onThrowAdvice,
        this.onAfterAdvice,
        this.isEnabledParameters,
        this.onBeforeParameters,
        this.onReturnParameters,
        this.onThrowParameters,
        this.onAfterParameters,
        this.hasBindThreadContext,
        this.hasBindOptionalThreadContext,
        this.reweavable);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Advice#pointcutClassNamePattern() pointcutClassNamePattern} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for pointcutClassNamePattern (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAdvice withPointcutClassNamePattern(@Nullable Pattern value) {
    if (this.pointcutClassNamePattern == value) return this;
    return new ImmutableAdvice(
        this.pointcut,
        this.adviceType,
        value,
        this.pointcutClassAnnotationPattern,
        this.pointcutSubTypeRestrictionPattern,
        this.pointcutSuperTypeRestrictionPattern,
        this.pointcutMethodNamePattern,
        this.pointcutMethodAnnotationPattern,
        this.pointcutMethodParameterTypes,
        this.travelerType,
        this.isEnabledAdvice,
        this.onBeforeAdvice,
        this.onReturnAdvice,
        this.onThrowAdvice,
        this.onAfterAdvice,
        this.isEnabledParameters,
        this.onBeforeParameters,
        this.onReturnParameters,
        this.onThrowParameters,
        this.onAfterParameters,
        this.hasBindThreadContext,
        this.hasBindOptionalThreadContext,
        this.reweavable);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Advice#pointcutClassAnnotationPattern() pointcutClassAnnotationPattern} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for pointcutClassAnnotationPattern (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAdvice withPointcutClassAnnotationPattern(@Nullable Pattern value) {
    if (this.pointcutClassAnnotationPattern == value) return this;
    return new ImmutableAdvice(
        this.pointcut,
        this.adviceType,
        this.pointcutClassNamePattern,
        value,
        this.pointcutSubTypeRestrictionPattern,
        this.pointcutSuperTypeRestrictionPattern,
        this.pointcutMethodNamePattern,
        this.pointcutMethodAnnotationPattern,
        this.pointcutMethodParameterTypes,
        this.travelerType,
        this.isEnabledAdvice,
        this.onBeforeAdvice,
        this.onReturnAdvice,
        this.onThrowAdvice,
        this.onAfterAdvice,
        this.isEnabledParameters,
        this.onBeforeParameters,
        this.onReturnParameters,
        this.onThrowParameters,
        this.onAfterParameters,
        this.hasBindThreadContext,
        this.hasBindOptionalThreadContext,
        this.reweavable);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Advice#pointcutSubTypeRestrictionPattern() pointcutSubTypeRestrictionPattern} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for pointcutSubTypeRestrictionPattern (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAdvice withPointcutSubTypeRestrictionPattern(@Nullable Pattern value) {
    if (this.pointcutSubTypeRestrictionPattern == value) return this;
    return new ImmutableAdvice(
        this.pointcut,
        this.adviceType,
        this.pointcutClassNamePattern,
        this.pointcutClassAnnotationPattern,
        value,
        this.pointcutSuperTypeRestrictionPattern,
        this.pointcutMethodNamePattern,
        this.pointcutMethodAnnotationPattern,
        this.pointcutMethodParameterTypes,
        this.travelerType,
        this.isEnabledAdvice,
        this.onBeforeAdvice,
        this.onReturnAdvice,
        this.onThrowAdvice,
        this.onAfterAdvice,
        this.isEnabledParameters,
        this.onBeforeParameters,
        this.onReturnParameters,
        this.onThrowParameters,
        this.onAfterParameters,
        this.hasBindThreadContext,
        this.hasBindOptionalThreadContext,
        this.reweavable);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Advice#pointcutSuperTypeRestrictionPattern() pointcutSuperTypeRestrictionPattern} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for pointcutSuperTypeRestrictionPattern (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAdvice withPointcutSuperTypeRestrictionPattern(@Nullable Pattern value) {
    if (this.pointcutSuperTypeRestrictionPattern == value) return this;
    return new ImmutableAdvice(
        this.pointcut,
        this.adviceType,
        this.pointcutClassNamePattern,
        this.pointcutClassAnnotationPattern,
        this.pointcutSubTypeRestrictionPattern,
        value,
        this.pointcutMethodNamePattern,
        this.pointcutMethodAnnotationPattern,
        this.pointcutMethodParameterTypes,
        this.travelerType,
        this.isEnabledAdvice,
        this.onBeforeAdvice,
        this.onReturnAdvice,
        this.onThrowAdvice,
        this.onAfterAdvice,
        this.isEnabledParameters,
        this.onBeforeParameters,
        this.onReturnParameters,
        this.onThrowParameters,
        this.onAfterParameters,
        this.hasBindThreadContext,
        this.hasBindOptionalThreadContext,
        this.reweavable);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Advice#pointcutMethodNamePattern() pointcutMethodNamePattern} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for pointcutMethodNamePattern (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAdvice withPointcutMethodNamePattern(@Nullable Pattern value) {
    if (this.pointcutMethodNamePattern == value) return this;
    return new ImmutableAdvice(
        this.pointcut,
        this.adviceType,
        this.pointcutClassNamePattern,
        this.pointcutClassAnnotationPattern,
        this.pointcutSubTypeRestrictionPattern,
        this.pointcutSuperTypeRestrictionPattern,
        value,
        this.pointcutMethodAnnotationPattern,
        this.pointcutMethodParameterTypes,
        this.travelerType,
        this.isEnabledAdvice,
        this.onBeforeAdvice,
        this.onReturnAdvice,
        this.onThrowAdvice,
        this.onAfterAdvice,
        this.isEnabledParameters,
        this.onBeforeParameters,
        this.onReturnParameters,
        this.onThrowParameters,
        this.onAfterParameters,
        this.hasBindThreadContext,
        this.hasBindOptionalThreadContext,
        this.reweavable);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Advice#pointcutMethodAnnotationPattern() pointcutMethodAnnotationPattern} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for pointcutMethodAnnotationPattern (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAdvice withPointcutMethodAnnotationPattern(@Nullable Pattern value) {
    if (this.pointcutMethodAnnotationPattern == value) return this;
    return new ImmutableAdvice(
        this.pointcut,
        this.adviceType,
        this.pointcutClassNamePattern,
        this.pointcutClassAnnotationPattern,
        this.pointcutSubTypeRestrictionPattern,
        this.pointcutSuperTypeRestrictionPattern,
        this.pointcutMethodNamePattern,
        value,
        this.pointcutMethodParameterTypes,
        this.travelerType,
        this.isEnabledAdvice,
        this.onBeforeAdvice,
        this.onReturnAdvice,
        this.onThrowAdvice,
        this.onAfterAdvice,
        this.isEnabledParameters,
        this.onBeforeParameters,
        this.onReturnParameters,
        this.onThrowParameters,
        this.onAfterParameters,
        this.hasBindThreadContext,
        this.hasBindOptionalThreadContext,
        this.reweavable);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Advice#pointcutMethodParameterTypes() pointcutMethodParameterTypes}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAdvice withPointcutMethodParameterTypes(Object... elements) {
    ImmutableList<Object> newValue = ImmutableList.copyOf(elements);
    return new ImmutableAdvice(
        this.pointcut,
        this.adviceType,
        this.pointcutClassNamePattern,
        this.pointcutClassAnnotationPattern,
        this.pointcutSubTypeRestrictionPattern,
        this.pointcutSuperTypeRestrictionPattern,
        this.pointcutMethodNamePattern,
        this.pointcutMethodAnnotationPattern,
        newValue,
        this.travelerType,
        this.isEnabledAdvice,
        this.onBeforeAdvice,
        this.onReturnAdvice,
        this.onThrowAdvice,
        this.onAfterAdvice,
        this.isEnabledParameters,
        this.onBeforeParameters,
        this.onReturnParameters,
        this.onThrowParameters,
        this.onAfterParameters,
        this.hasBindThreadContext,
        this.hasBindOptionalThreadContext,
        this.reweavable);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Advice#pointcutMethodParameterTypes() pointcutMethodParameterTypes}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of pointcutMethodParameterTypes elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAdvice withPointcutMethodParameterTypes(Iterable<? extends Object> elements) {
    if (this.pointcutMethodParameterTypes == elements) return this;
    ImmutableList<Object> newValue = ImmutableList.copyOf(elements);
    return new ImmutableAdvice(
        this.pointcut,
        this.adviceType,
        this.pointcutClassNamePattern,
        this.pointcutClassAnnotationPattern,
        this.pointcutSubTypeRestrictionPattern,
        this.pointcutSuperTypeRestrictionPattern,
        this.pointcutMethodNamePattern,
        this.pointcutMethodAnnotationPattern,
        newValue,
        this.travelerType,
        this.isEnabledAdvice,
        this.onBeforeAdvice,
        this.onReturnAdvice,
        this.onThrowAdvice,
        this.onAfterAdvice,
        this.isEnabledParameters,
        this.onBeforeParameters,
        this.onReturnParameters,
        this.onThrowParameters,
        this.onAfterParameters,
        this.hasBindThreadContext,
        this.hasBindOptionalThreadContext,
        this.reweavable);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Advice#travelerType() travelerType} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for travelerType (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAdvice withTravelerType(@Nullable Type value) {
    if (this.travelerType == value) return this;
    return new ImmutableAdvice(
        this.pointcut,
        this.adviceType,
        this.pointcutClassNamePattern,
        this.pointcutClassAnnotationPattern,
        this.pointcutSubTypeRestrictionPattern,
        this.pointcutSuperTypeRestrictionPattern,
        this.pointcutMethodNamePattern,
        this.pointcutMethodAnnotationPattern,
        this.pointcutMethodParameterTypes,
        value,
        this.isEnabledAdvice,
        this.onBeforeAdvice,
        this.onReturnAdvice,
        this.onThrowAdvice,
        this.onAfterAdvice,
        this.isEnabledParameters,
        this.onBeforeParameters,
        this.onReturnParameters,
        this.onThrowParameters,
        this.onAfterParameters,
        this.hasBindThreadContext,
        this.hasBindOptionalThreadContext,
        this.reweavable);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Advice#isEnabledAdvice() isEnabledAdvice} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for isEnabledAdvice (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAdvice withIsEnabledAdvice(@Nullable Method value) {
    if (this.isEnabledAdvice == value) return this;
    return new ImmutableAdvice(
        this.pointcut,
        this.adviceType,
        this.pointcutClassNamePattern,
        this.pointcutClassAnnotationPattern,
        this.pointcutSubTypeRestrictionPattern,
        this.pointcutSuperTypeRestrictionPattern,
        this.pointcutMethodNamePattern,
        this.pointcutMethodAnnotationPattern,
        this.pointcutMethodParameterTypes,
        this.travelerType,
        value,
        this.onBeforeAdvice,
        this.onReturnAdvice,
        this.onThrowAdvice,
        this.onAfterAdvice,
        this.isEnabledParameters,
        this.onBeforeParameters,
        this.onReturnParameters,
        this.onThrowParameters,
        this.onAfterParameters,
        this.hasBindThreadContext,
        this.hasBindOptionalThreadContext,
        this.reweavable);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Advice#onBeforeAdvice() onBeforeAdvice} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for onBeforeAdvice (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAdvice withOnBeforeAdvice(@Nullable Method value) {
    if (this.onBeforeAdvice == value) return this;
    return new ImmutableAdvice(
        this.pointcut,
        this.adviceType,
        this.pointcutClassNamePattern,
        this.pointcutClassAnnotationPattern,
        this.pointcutSubTypeRestrictionPattern,
        this.pointcutSuperTypeRestrictionPattern,
        this.pointcutMethodNamePattern,
        this.pointcutMethodAnnotationPattern,
        this.pointcutMethodParameterTypes,
        this.travelerType,
        this.isEnabledAdvice,
        value,
        this.onReturnAdvice,
        this.onThrowAdvice,
        this.onAfterAdvice,
        this.isEnabledParameters,
        this.onBeforeParameters,
        this.onReturnParameters,
        this.onThrowParameters,
        this.onAfterParameters,
        this.hasBindThreadContext,
        this.hasBindOptionalThreadContext,
        this.reweavable);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Advice#onReturnAdvice() onReturnAdvice} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for onReturnAdvice (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAdvice withOnReturnAdvice(@Nullable Method value) {
    if (this.onReturnAdvice == value) return this;
    return new ImmutableAdvice(
        this.pointcut,
        this.adviceType,
        this.pointcutClassNamePattern,
        this.pointcutClassAnnotationPattern,
        this.pointcutSubTypeRestrictionPattern,
        this.pointcutSuperTypeRestrictionPattern,
        this.pointcutMethodNamePattern,
        this.pointcutMethodAnnotationPattern,
        this.pointcutMethodParameterTypes,
        this.travelerType,
        this.isEnabledAdvice,
        this.onBeforeAdvice,
        value,
        this.onThrowAdvice,
        this.onAfterAdvice,
        this.isEnabledParameters,
        this.onBeforeParameters,
        this.onReturnParameters,
        this.onThrowParameters,
        this.onAfterParameters,
        this.hasBindThreadContext,
        this.hasBindOptionalThreadContext,
        this.reweavable);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Advice#onThrowAdvice() onThrowAdvice} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for onThrowAdvice (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAdvice withOnThrowAdvice(@Nullable Method value) {
    if (this.onThrowAdvice == value) return this;
    return new ImmutableAdvice(
        this.pointcut,
        this.adviceType,
        this.pointcutClassNamePattern,
        this.pointcutClassAnnotationPattern,
        this.pointcutSubTypeRestrictionPattern,
        this.pointcutSuperTypeRestrictionPattern,
        this.pointcutMethodNamePattern,
        this.pointcutMethodAnnotationPattern,
        this.pointcutMethodParameterTypes,
        this.travelerType,
        this.isEnabledAdvice,
        this.onBeforeAdvice,
        this.onReturnAdvice,
        value,
        this.onAfterAdvice,
        this.isEnabledParameters,
        this.onBeforeParameters,
        this.onReturnParameters,
        this.onThrowParameters,
        this.onAfterParameters,
        this.hasBindThreadContext,
        this.hasBindOptionalThreadContext,
        this.reweavable);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Advice#onAfterAdvice() onAfterAdvice} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for onAfterAdvice (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAdvice withOnAfterAdvice(@Nullable Method value) {
    if (this.onAfterAdvice == value) return this;
    return new ImmutableAdvice(
        this.pointcut,
        this.adviceType,
        this.pointcutClassNamePattern,
        this.pointcutClassAnnotationPattern,
        this.pointcutSubTypeRestrictionPattern,
        this.pointcutSuperTypeRestrictionPattern,
        this.pointcutMethodNamePattern,
        this.pointcutMethodAnnotationPattern,
        this.pointcutMethodParameterTypes,
        this.travelerType,
        this.isEnabledAdvice,
        this.onBeforeAdvice,
        this.onReturnAdvice,
        this.onThrowAdvice,
        value,
        this.isEnabledParameters,
        this.onBeforeParameters,
        this.onReturnParameters,
        this.onThrowParameters,
        this.onAfterParameters,
        this.hasBindThreadContext,
        this.hasBindOptionalThreadContext,
        this.reweavable);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Advice#isEnabledParameters() isEnabledParameters}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAdvice withIsEnabledParameters(Advice.AdviceParameter... elements) {
    ImmutableList<Advice.AdviceParameter> newValue = ImmutableList.copyOf(elements);
    return new ImmutableAdvice(
        this.pointcut,
        this.adviceType,
        this.pointcutClassNamePattern,
        this.pointcutClassAnnotationPattern,
        this.pointcutSubTypeRestrictionPattern,
        this.pointcutSuperTypeRestrictionPattern,
        this.pointcutMethodNamePattern,
        this.pointcutMethodAnnotationPattern,
        this.pointcutMethodParameterTypes,
        this.travelerType,
        this.isEnabledAdvice,
        this.onBeforeAdvice,
        this.onReturnAdvice,
        this.onThrowAdvice,
        this.onAfterAdvice,
        newValue,
        this.onBeforeParameters,
        this.onReturnParameters,
        this.onThrowParameters,
        this.onAfterParameters,
        this.hasBindThreadContext,
        this.hasBindOptionalThreadContext,
        this.reweavable);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Advice#isEnabledParameters() isEnabledParameters}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of isEnabledParameters elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAdvice withIsEnabledParameters(Iterable<? extends Advice.AdviceParameter> elements) {
    if (this.isEnabledParameters == elements) return this;
    ImmutableList<Advice.AdviceParameter> newValue = ImmutableList.copyOf(elements);
    return new ImmutableAdvice(
        this.pointcut,
        this.adviceType,
        this.pointcutClassNamePattern,
        this.pointcutClassAnnotationPattern,
        this.pointcutSubTypeRestrictionPattern,
        this.pointcutSuperTypeRestrictionPattern,
        this.pointcutMethodNamePattern,
        this.pointcutMethodAnnotationPattern,
        this.pointcutMethodParameterTypes,
        this.travelerType,
        this.isEnabledAdvice,
        this.onBeforeAdvice,
        this.onReturnAdvice,
        this.onThrowAdvice,
        this.onAfterAdvice,
        newValue,
        this.onBeforeParameters,
        this.onReturnParameters,
        this.onThrowParameters,
        this.onAfterParameters,
        this.hasBindThreadContext,
        this.hasBindOptionalThreadContext,
        this.reweavable);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Advice#onBeforeParameters() onBeforeParameters}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAdvice withOnBeforeParameters(Advice.AdviceParameter... elements) {
    ImmutableList<Advice.AdviceParameter> newValue = ImmutableList.copyOf(elements);
    return new ImmutableAdvice(
        this.pointcut,
        this.adviceType,
        this.pointcutClassNamePattern,
        this.pointcutClassAnnotationPattern,
        this.pointcutSubTypeRestrictionPattern,
        this.pointcutSuperTypeRestrictionPattern,
        this.pointcutMethodNamePattern,
        this.pointcutMethodAnnotationPattern,
        this.pointcutMethodParameterTypes,
        this.travelerType,
        this.isEnabledAdvice,
        this.onBeforeAdvice,
        this.onReturnAdvice,
        this.onThrowAdvice,
        this.onAfterAdvice,
        this.isEnabledParameters,
        newValue,
        this.onReturnParameters,
        this.onThrowParameters,
        this.onAfterParameters,
        this.hasBindThreadContext,
        this.hasBindOptionalThreadContext,
        this.reweavable);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Advice#onBeforeParameters() onBeforeParameters}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of onBeforeParameters elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAdvice withOnBeforeParameters(Iterable<? extends Advice.AdviceParameter> elements) {
    if (this.onBeforeParameters == elements) return this;
    ImmutableList<Advice.AdviceParameter> newValue = ImmutableList.copyOf(elements);
    return new ImmutableAdvice(
        this.pointcut,
        this.adviceType,
        this.pointcutClassNamePattern,
        this.pointcutClassAnnotationPattern,
        this.pointcutSubTypeRestrictionPattern,
        this.pointcutSuperTypeRestrictionPattern,
        this.pointcutMethodNamePattern,
        this.pointcutMethodAnnotationPattern,
        this.pointcutMethodParameterTypes,
        this.travelerType,
        this.isEnabledAdvice,
        this.onBeforeAdvice,
        this.onReturnAdvice,
        this.onThrowAdvice,
        this.onAfterAdvice,
        this.isEnabledParameters,
        newValue,
        this.onReturnParameters,
        this.onThrowParameters,
        this.onAfterParameters,
        this.hasBindThreadContext,
        this.hasBindOptionalThreadContext,
        this.reweavable);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Advice#onReturnParameters() onReturnParameters}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAdvice withOnReturnParameters(Advice.AdviceParameter... elements) {
    ImmutableList<Advice.AdviceParameter> newValue = ImmutableList.copyOf(elements);
    return new ImmutableAdvice(
        this.pointcut,
        this.adviceType,
        this.pointcutClassNamePattern,
        this.pointcutClassAnnotationPattern,
        this.pointcutSubTypeRestrictionPattern,
        this.pointcutSuperTypeRestrictionPattern,
        this.pointcutMethodNamePattern,
        this.pointcutMethodAnnotationPattern,
        this.pointcutMethodParameterTypes,
        this.travelerType,
        this.isEnabledAdvice,
        this.onBeforeAdvice,
        this.onReturnAdvice,
        this.onThrowAdvice,
        this.onAfterAdvice,
        this.isEnabledParameters,
        this.onBeforeParameters,
        newValue,
        this.onThrowParameters,
        this.onAfterParameters,
        this.hasBindThreadContext,
        this.hasBindOptionalThreadContext,
        this.reweavable);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Advice#onReturnParameters() onReturnParameters}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of onReturnParameters elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAdvice withOnReturnParameters(Iterable<? extends Advice.AdviceParameter> elements) {
    if (this.onReturnParameters == elements) return this;
    ImmutableList<Advice.AdviceParameter> newValue = ImmutableList.copyOf(elements);
    return new ImmutableAdvice(
        this.pointcut,
        this.adviceType,
        this.pointcutClassNamePattern,
        this.pointcutClassAnnotationPattern,
        this.pointcutSubTypeRestrictionPattern,
        this.pointcutSuperTypeRestrictionPattern,
        this.pointcutMethodNamePattern,
        this.pointcutMethodAnnotationPattern,
        this.pointcutMethodParameterTypes,
        this.travelerType,
        this.isEnabledAdvice,
        this.onBeforeAdvice,
        this.onReturnAdvice,
        this.onThrowAdvice,
        this.onAfterAdvice,
        this.isEnabledParameters,
        this.onBeforeParameters,
        newValue,
        this.onThrowParameters,
        this.onAfterParameters,
        this.hasBindThreadContext,
        this.hasBindOptionalThreadContext,
        this.reweavable);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Advice#onThrowParameters() onThrowParameters}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAdvice withOnThrowParameters(Advice.AdviceParameter... elements) {
    ImmutableList<Advice.AdviceParameter> newValue = ImmutableList.copyOf(elements);
    return new ImmutableAdvice(
        this.pointcut,
        this.adviceType,
        this.pointcutClassNamePattern,
        this.pointcutClassAnnotationPattern,
        this.pointcutSubTypeRestrictionPattern,
        this.pointcutSuperTypeRestrictionPattern,
        this.pointcutMethodNamePattern,
        this.pointcutMethodAnnotationPattern,
        this.pointcutMethodParameterTypes,
        this.travelerType,
        this.isEnabledAdvice,
        this.onBeforeAdvice,
        this.onReturnAdvice,
        this.onThrowAdvice,
        this.onAfterAdvice,
        this.isEnabledParameters,
        this.onBeforeParameters,
        this.onReturnParameters,
        newValue,
        this.onAfterParameters,
        this.hasBindThreadContext,
        this.hasBindOptionalThreadContext,
        this.reweavable);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Advice#onThrowParameters() onThrowParameters}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of onThrowParameters elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAdvice withOnThrowParameters(Iterable<? extends Advice.AdviceParameter> elements) {
    if (this.onThrowParameters == elements) return this;
    ImmutableList<Advice.AdviceParameter> newValue = ImmutableList.copyOf(elements);
    return new ImmutableAdvice(
        this.pointcut,
        this.adviceType,
        this.pointcutClassNamePattern,
        this.pointcutClassAnnotationPattern,
        this.pointcutSubTypeRestrictionPattern,
        this.pointcutSuperTypeRestrictionPattern,
        this.pointcutMethodNamePattern,
        this.pointcutMethodAnnotationPattern,
        this.pointcutMethodParameterTypes,
        this.travelerType,
        this.isEnabledAdvice,
        this.onBeforeAdvice,
        this.onReturnAdvice,
        this.onThrowAdvice,
        this.onAfterAdvice,
        this.isEnabledParameters,
        this.onBeforeParameters,
        this.onReturnParameters,
        newValue,
        this.onAfterParameters,
        this.hasBindThreadContext,
        this.hasBindOptionalThreadContext,
        this.reweavable);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Advice#onAfterParameters() onAfterParameters}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAdvice withOnAfterParameters(Advice.AdviceParameter... elements) {
    ImmutableList<Advice.AdviceParameter> newValue = ImmutableList.copyOf(elements);
    return new ImmutableAdvice(
        this.pointcut,
        this.adviceType,
        this.pointcutClassNamePattern,
        this.pointcutClassAnnotationPattern,
        this.pointcutSubTypeRestrictionPattern,
        this.pointcutSuperTypeRestrictionPattern,
        this.pointcutMethodNamePattern,
        this.pointcutMethodAnnotationPattern,
        this.pointcutMethodParameterTypes,
        this.travelerType,
        this.isEnabledAdvice,
        this.onBeforeAdvice,
        this.onReturnAdvice,
        this.onThrowAdvice,
        this.onAfterAdvice,
        this.isEnabledParameters,
        this.onBeforeParameters,
        this.onReturnParameters,
        this.onThrowParameters,
        newValue,
        this.hasBindThreadContext,
        this.hasBindOptionalThreadContext,
        this.reweavable);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Advice#onAfterParameters() onAfterParameters}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of onAfterParameters elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAdvice withOnAfterParameters(Iterable<? extends Advice.AdviceParameter> elements) {
    if (this.onAfterParameters == elements) return this;
    ImmutableList<Advice.AdviceParameter> newValue = ImmutableList.copyOf(elements);
    return new ImmutableAdvice(
        this.pointcut,
        this.adviceType,
        this.pointcutClassNamePattern,
        this.pointcutClassAnnotationPattern,
        this.pointcutSubTypeRestrictionPattern,
        this.pointcutSuperTypeRestrictionPattern,
        this.pointcutMethodNamePattern,
        this.pointcutMethodAnnotationPattern,
        this.pointcutMethodParameterTypes,
        this.travelerType,
        this.isEnabledAdvice,
        this.onBeforeAdvice,
        this.onReturnAdvice,
        this.onThrowAdvice,
        this.onAfterAdvice,
        this.isEnabledParameters,
        this.onBeforeParameters,
        this.onReturnParameters,
        this.onThrowParameters,
        newValue,
        this.hasBindThreadContext,
        this.hasBindOptionalThreadContext,
        this.reweavable);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Advice#hasBindThreadContext() hasBindThreadContext} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for hasBindThreadContext
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAdvice withHasBindThreadContext(boolean value) {
    if (this.hasBindThreadContext == value) return this;
    return new ImmutableAdvice(
        this.pointcut,
        this.adviceType,
        this.pointcutClassNamePattern,
        this.pointcutClassAnnotationPattern,
        this.pointcutSubTypeRestrictionPattern,
        this.pointcutSuperTypeRestrictionPattern,
        this.pointcutMethodNamePattern,
        this.pointcutMethodAnnotationPattern,
        this.pointcutMethodParameterTypes,
        this.travelerType,
        this.isEnabledAdvice,
        this.onBeforeAdvice,
        this.onReturnAdvice,
        this.onThrowAdvice,
        this.onAfterAdvice,
        this.isEnabledParameters,
        this.onBeforeParameters,
        this.onReturnParameters,
        this.onThrowParameters,
        this.onAfterParameters,
        value,
        this.hasBindOptionalThreadContext,
        this.reweavable);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Advice#hasBindOptionalThreadContext() hasBindOptionalThreadContext} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for hasBindOptionalThreadContext
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAdvice withHasBindOptionalThreadContext(boolean value) {
    if (this.hasBindOptionalThreadContext == value) return this;
    return new ImmutableAdvice(
        this.pointcut,
        this.adviceType,
        this.pointcutClassNamePattern,
        this.pointcutClassAnnotationPattern,
        this.pointcutSubTypeRestrictionPattern,
        this.pointcutSuperTypeRestrictionPattern,
        this.pointcutMethodNamePattern,
        this.pointcutMethodAnnotationPattern,
        this.pointcutMethodParameterTypes,
        this.travelerType,
        this.isEnabledAdvice,
        this.onBeforeAdvice,
        this.onReturnAdvice,
        this.onThrowAdvice,
        this.onAfterAdvice,
        this.isEnabledParameters,
        this.onBeforeParameters,
        this.onReturnParameters,
        this.onThrowParameters,
        this.onAfterParameters,
        this.hasBindThreadContext,
        value,
        this.reweavable);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Advice#reweavable() reweavable} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for reweavable
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAdvice withReweavable(boolean value) {
    if (this.reweavable == value) return this;
    return new ImmutableAdvice(
        this.pointcut,
        this.adviceType,
        this.pointcutClassNamePattern,
        this.pointcutClassAnnotationPattern,
        this.pointcutSubTypeRestrictionPattern,
        this.pointcutSuperTypeRestrictionPattern,
        this.pointcutMethodNamePattern,
        this.pointcutMethodAnnotationPattern,
        this.pointcutMethodParameterTypes,
        this.travelerType,
        this.isEnabledAdvice,
        this.onBeforeAdvice,
        this.onReturnAdvice,
        this.onThrowAdvice,
        this.onAfterAdvice,
        this.isEnabledParameters,
        this.onBeforeParameters,
        this.onReturnParameters,
        this.onThrowParameters,
        this.onAfterParameters,
        this.hasBindThreadContext,
        this.hasBindOptionalThreadContext,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAdvice} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAdvice
        && equalTo((ImmutableAdvice) another);
  }

  private boolean equalTo(ImmutableAdvice another) {
    return pointcut.equals(another.pointcut)
        && adviceType.equals(another.adviceType)
        && Objects.equal(pointcutClassNamePattern, another.pointcutClassNamePattern)
        && Objects.equal(pointcutClassAnnotationPattern, another.pointcutClassAnnotationPattern)
        && Objects.equal(pointcutSubTypeRestrictionPattern, another.pointcutSubTypeRestrictionPattern)
        && Objects.equal(pointcutSuperTypeRestrictionPattern, another.pointcutSuperTypeRestrictionPattern)
        && Objects.equal(pointcutMethodNamePattern, another.pointcutMethodNamePattern)
        && Objects.equal(pointcutMethodAnnotationPattern, another.pointcutMethodAnnotationPattern)
        && pointcutMethodParameterTypes.equals(another.pointcutMethodParameterTypes)
        && Objects.equal(travelerType, another.travelerType)
        && Objects.equal(isEnabledAdvice, another.isEnabledAdvice)
        && Objects.equal(onBeforeAdvice, another.onBeforeAdvice)
        && Objects.equal(onReturnAdvice, another.onReturnAdvice)
        && Objects.equal(onThrowAdvice, another.onThrowAdvice)
        && Objects.equal(onAfterAdvice, another.onAfterAdvice)
        && isEnabledParameters.equals(another.isEnabledParameters)
        && onBeforeParameters.equals(another.onBeforeParameters)
        && onReturnParameters.equals(another.onReturnParameters)
        && onThrowParameters.equals(another.onThrowParameters)
        && onAfterParameters.equals(another.onAfterParameters)
        && hasBindThreadContext == another.hasBindThreadContext
        && hasBindOptionalThreadContext == another.hasBindOptionalThreadContext
        && reweavable == another.reweavable
        && classMetaTypes.equals(another.classMetaTypes)
        && methodMetaTypes.equals(another.methodMetaTypes);
  }

  /**
   * Computes a hash code from attributes: {@code pointcut}, {@code adviceType}, {@code pointcutClassNamePattern}, {@code pointcutClassAnnotationPattern}, {@code pointcutSubTypeRestrictionPattern}, {@code pointcutSuperTypeRestrictionPattern}, {@code pointcutMethodNamePattern}, {@code pointcutMethodAnnotationPattern}, {@code pointcutMethodParameterTypes}, {@code travelerType}, {@code isEnabledAdvice}, {@code onBeforeAdvice}, {@code onReturnAdvice}, {@code onThrowAdvice}, {@code onAfterAdvice}, {@code isEnabledParameters}, {@code onBeforeParameters}, {@code onReturnParameters}, {@code onThrowParameters}, {@code onAfterParameters}, {@code hasBindThreadContext}, {@code hasBindOptionalThreadContext}, {@code reweavable}, {@code classMetaTypes}, {@code methodMetaTypes}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + pointcut.hashCode();
    h += (h << 5) + adviceType.hashCode();
    h += (h << 5) + Objects.hashCode(pointcutClassNamePattern);
    h += (h << 5) + Objects.hashCode(pointcutClassAnnotationPattern);
    h += (h << 5) + Objects.hashCode(pointcutSubTypeRestrictionPattern);
    h += (h << 5) + Objects.hashCode(pointcutSuperTypeRestrictionPattern);
    h += (h << 5) + Objects.hashCode(pointcutMethodNamePattern);
    h += (h << 5) + Objects.hashCode(pointcutMethodAnnotationPattern);
    h += (h << 5) + pointcutMethodParameterTypes.hashCode();
    h += (h << 5) + Objects.hashCode(travelerType);
    h += (h << 5) + Objects.hashCode(isEnabledAdvice);
    h += (h << 5) + Objects.hashCode(onBeforeAdvice);
    h += (h << 5) + Objects.hashCode(onReturnAdvice);
    h += (h << 5) + Objects.hashCode(onThrowAdvice);
    h += (h << 5) + Objects.hashCode(onAfterAdvice);
    h += (h << 5) + isEnabledParameters.hashCode();
    h += (h << 5) + onBeforeParameters.hashCode();
    h += (h << 5) + onReturnParameters.hashCode();
    h += (h << 5) + onThrowParameters.hashCode();
    h += (h << 5) + onAfterParameters.hashCode();
    h += (h << 5) + Booleans.hashCode(hasBindThreadContext);
    h += (h << 5) + Booleans.hashCode(hasBindOptionalThreadContext);
    h += (h << 5) + Booleans.hashCode(reweavable);
    h += (h << 5) + classMetaTypes.hashCode();
    h += (h << 5) + methodMetaTypes.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Advice} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("Advice")
        .omitNullValues()
        .add("pointcut", pointcut)
        .add("adviceType", adviceType)
        .add("pointcutClassNamePattern", pointcutClassNamePattern)
        .add("pointcutClassAnnotationPattern", pointcutClassAnnotationPattern)
        .add("pointcutSubTypeRestrictionPattern", pointcutSubTypeRestrictionPattern)
        .add("pointcutSuperTypeRestrictionPattern", pointcutSuperTypeRestrictionPattern)
        .add("pointcutMethodNamePattern", pointcutMethodNamePattern)
        .add("pointcutMethodAnnotationPattern", pointcutMethodAnnotationPattern)
        .add("pointcutMethodParameterTypes", pointcutMethodParameterTypes)
        .add("travelerType", travelerType)
        .add("isEnabledAdvice", isEnabledAdvice)
        .add("onBeforeAdvice", onBeforeAdvice)
        .add("onReturnAdvice", onReturnAdvice)
        .add("onThrowAdvice", onThrowAdvice)
        .add("onAfterAdvice", onAfterAdvice)
        .add("isEnabledParameters", isEnabledParameters)
        .add("onBeforeParameters", onBeforeParameters)
        .add("onReturnParameters", onReturnParameters)
        .add("onThrowParameters", onThrowParameters)
        .add("onAfterParameters", onAfterParameters)
        .add("hasBindThreadContext", hasBindThreadContext)
        .add("hasBindOptionalThreadContext", hasBindOptionalThreadContext)
        .add("reweavable", reweavable)
        .add("classMetaTypes", classMetaTypes)
        .add("methodMetaTypes", methodMetaTypes)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends Advice {
    @Nullable Pointcut pointcut;
    @Nullable Type adviceType;
    @Nullable Pattern pointcutClassNamePattern;
    @Nullable Pattern pointcutClassAnnotationPattern;
    @Nullable Pattern pointcutSubTypeRestrictionPattern;
    @Nullable Pattern pointcutSuperTypeRestrictionPattern;
    @Nullable Pattern pointcutMethodNamePattern;
    @Nullable Pattern pointcutMethodAnnotationPattern;
    List<Object> pointcutMethodParameterTypes = ImmutableList.of();
    @Nullable Type travelerType;
    @Nullable Method isEnabledAdvice;
    @Nullable Method onBeforeAdvice;
    @Nullable Method onReturnAdvice;
    @Nullable Method onThrowAdvice;
    @Nullable Method onAfterAdvice;
    ImmutableList<Advice.AdviceParameter> isEnabledParameters = ImmutableList.of();
    ImmutableList<Advice.AdviceParameter> onBeforeParameters = ImmutableList.of();
    ImmutableList<Advice.AdviceParameter> onReturnParameters = ImmutableList.of();
    ImmutableList<Advice.AdviceParameter> onThrowParameters = ImmutableList.of();
    ImmutableList<Advice.AdviceParameter> onAfterParameters = ImmutableList.of();
    boolean hasBindThreadContext;
    boolean hasBindThreadContextIsSet;
    boolean hasBindOptionalThreadContext;
    boolean hasBindOptionalThreadContextIsSet;
    boolean reweavable;
    boolean reweavableIsSet;
    @JsonProperty("pointcut")
    public void setPointcut(Pointcut pointcut) {
      this.pointcut = pointcut;
    }
    @JsonProperty("adviceType")
    public void setAdviceType(Type adviceType) {
      this.adviceType = adviceType;
    }
    @JsonProperty("pointcutClassNamePattern")
    public void setPointcutClassNamePattern(@Nullable Pattern pointcutClassNamePattern) {
      this.pointcutClassNamePattern = pointcutClassNamePattern;
    }
    @JsonProperty("pointcutClassAnnotationPattern")
    public void setPointcutClassAnnotationPattern(@Nullable Pattern pointcutClassAnnotationPattern) {
      this.pointcutClassAnnotationPattern = pointcutClassAnnotationPattern;
    }
    @JsonProperty("pointcutSubTypeRestrictionPattern")
    public void setPointcutSubTypeRestrictionPattern(@Nullable Pattern pointcutSubTypeRestrictionPattern) {
      this.pointcutSubTypeRestrictionPattern = pointcutSubTypeRestrictionPattern;
    }
    @JsonProperty("pointcutSuperTypeRestrictionPattern")
    public void setPointcutSuperTypeRestrictionPattern(@Nullable Pattern pointcutSuperTypeRestrictionPattern) {
      this.pointcutSuperTypeRestrictionPattern = pointcutSuperTypeRestrictionPattern;
    }
    @JsonProperty("pointcutMethodNamePattern")
    public void setPointcutMethodNamePattern(@Nullable Pattern pointcutMethodNamePattern) {
      this.pointcutMethodNamePattern = pointcutMethodNamePattern;
    }
    @JsonProperty("pointcutMethodAnnotationPattern")
    public void setPointcutMethodAnnotationPattern(@Nullable Pattern pointcutMethodAnnotationPattern) {
      this.pointcutMethodAnnotationPattern = pointcutMethodAnnotationPattern;
    }
    @JsonProperty("pointcutMethodParameterTypes")
    public void setPointcutMethodParameterTypes(List<Object> pointcutMethodParameterTypes) {
      this.pointcutMethodParameterTypes = pointcutMethodParameterTypes;
    }
    @JsonProperty("travelerType")
    public void setTravelerType(@Nullable Type travelerType) {
      this.travelerType = travelerType;
    }
    @JsonProperty("isEnabledAdvice")
    public void setIsEnabledAdvice(@Nullable Method isEnabledAdvice) {
      this.isEnabledAdvice = isEnabledAdvice;
    }
    @JsonProperty("onBeforeAdvice")
    public void setOnBeforeAdvice(@Nullable Method onBeforeAdvice) {
      this.onBeforeAdvice = onBeforeAdvice;
    }
    @JsonProperty("onReturnAdvice")
    public void setOnReturnAdvice(@Nullable Method onReturnAdvice) {
      this.onReturnAdvice = onReturnAdvice;
    }
    @JsonProperty("onThrowAdvice")
    public void setOnThrowAdvice(@Nullable Method onThrowAdvice) {
      this.onThrowAdvice = onThrowAdvice;
    }
    @JsonProperty("onAfterAdvice")
    public void setOnAfterAdvice(@Nullable Method onAfterAdvice) {
      this.onAfterAdvice = onAfterAdvice;
    }
    @JsonProperty("isEnabledParameters")
    public void setIsEnabledParameters(ImmutableList<Advice.AdviceParameter> isEnabledParameters) {
      this.isEnabledParameters = isEnabledParameters;
    }
    @JsonProperty("onBeforeParameters")
    public void setOnBeforeParameters(ImmutableList<Advice.AdviceParameter> onBeforeParameters) {
      this.onBeforeParameters = onBeforeParameters;
    }
    @JsonProperty("onReturnParameters")
    public void setOnReturnParameters(ImmutableList<Advice.AdviceParameter> onReturnParameters) {
      this.onReturnParameters = onReturnParameters;
    }
    @JsonProperty("onThrowParameters")
    public void setOnThrowParameters(ImmutableList<Advice.AdviceParameter> onThrowParameters) {
      this.onThrowParameters = onThrowParameters;
    }
    @JsonProperty("onAfterParameters")
    public void setOnAfterParameters(ImmutableList<Advice.AdviceParameter> onAfterParameters) {
      this.onAfterParameters = onAfterParameters;
    }
    @JsonProperty("hasBindThreadContext")
    public void setHasBindThreadContext(boolean hasBindThreadContext) {
      this.hasBindThreadContext = hasBindThreadContext;
      this.hasBindThreadContextIsSet = true;
    }
    @JsonProperty("hasBindOptionalThreadContext")
    public void setHasBindOptionalThreadContext(boolean hasBindOptionalThreadContext) {
      this.hasBindOptionalThreadContext = hasBindOptionalThreadContext;
      this.hasBindOptionalThreadContextIsSet = true;
    }
    @JsonProperty("reweavable")
    public void setReweavable(boolean reweavable) {
      this.reweavable = reweavable;
      this.reweavableIsSet = true;
    }
    @Override
    Pointcut pointcut() { throw new UnsupportedOperationException(); }
    @Override
    Type adviceType() { throw new UnsupportedOperationException(); }
    @Override
    Pattern pointcutClassNamePattern() { throw new UnsupportedOperationException(); }
    @Override
    Pattern pointcutClassAnnotationPattern() { throw new UnsupportedOperationException(); }
    @Override
    Pattern pointcutSubTypeRestrictionPattern() { throw new UnsupportedOperationException(); }
    @Override
    Pattern pointcutSuperTypeRestrictionPattern() { throw new UnsupportedOperationException(); }
    @Override
    Pattern pointcutMethodNamePattern() { throw new UnsupportedOperationException(); }
    @Override
    Pattern pointcutMethodAnnotationPattern() { throw new UnsupportedOperationException(); }
    @Override
    List<Object> pointcutMethodParameterTypes() { throw new UnsupportedOperationException(); }
    @Override
    Type travelerType() { throw new UnsupportedOperationException(); }
    @Override
    Method isEnabledAdvice() { throw new UnsupportedOperationException(); }
    @Override
    Method onBeforeAdvice() { throw new UnsupportedOperationException(); }
    @Override
    Method onReturnAdvice() { throw new UnsupportedOperationException(); }
    @Override
    Method onThrowAdvice() { throw new UnsupportedOperationException(); }
    @Override
    Method onAfterAdvice() { throw new UnsupportedOperationException(); }
    @Override
    ImmutableList<Advice.AdviceParameter> isEnabledParameters() { throw new UnsupportedOperationException(); }
    @Override
    ImmutableList<Advice.AdviceParameter> onBeforeParameters() { throw new UnsupportedOperationException(); }
    @Override
    ImmutableList<Advice.AdviceParameter> onReturnParameters() { throw new UnsupportedOperationException(); }
    @Override
    ImmutableList<Advice.AdviceParameter> onThrowParameters() { throw new UnsupportedOperationException(); }
    @Override
    ImmutableList<Advice.AdviceParameter> onAfterParameters() { throw new UnsupportedOperationException(); }
    @Override
    boolean hasBindThreadContext() { throw new UnsupportedOperationException(); }
    @Override
    boolean hasBindOptionalThreadContext() { throw new UnsupportedOperationException(); }
    @Override
    boolean reweavable() { throw new UnsupportedOperationException(); }
    @Override
    ImmutableSet<Type> classMetaTypes() { throw new UnsupportedOperationException(); }
    @Override
    ImmutableSet<Type> methodMetaTypes() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableAdvice fromJson(Json json) {
    ImmutableAdvice.Builder builder = ImmutableAdvice.builder();
    if (json.pointcut != null) {
      builder.pointcut(json.pointcut);
    }
    if (json.adviceType != null) {
      builder.adviceType(json.adviceType);
    }
    if (json.pointcutClassNamePattern != null) {
      builder.pointcutClassNamePattern(json.pointcutClassNamePattern);
    }
    if (json.pointcutClassAnnotationPattern != null) {
      builder.pointcutClassAnnotationPattern(json.pointcutClassAnnotationPattern);
    }
    if (json.pointcutSubTypeRestrictionPattern != null) {
      builder.pointcutSubTypeRestrictionPattern(json.pointcutSubTypeRestrictionPattern);
    }
    if (json.pointcutSuperTypeRestrictionPattern != null) {
      builder.pointcutSuperTypeRestrictionPattern(json.pointcutSuperTypeRestrictionPattern);
    }
    if (json.pointcutMethodNamePattern != null) {
      builder.pointcutMethodNamePattern(json.pointcutMethodNamePattern);
    }
    if (json.pointcutMethodAnnotationPattern != null) {
      builder.pointcutMethodAnnotationPattern(json.pointcutMethodAnnotationPattern);
    }
    if (json.pointcutMethodParameterTypes != null) {
      builder.addAllPointcutMethodParameterTypes(json.pointcutMethodParameterTypes);
    }
    if (json.travelerType != null) {
      builder.travelerType(json.travelerType);
    }
    if (json.isEnabledAdvice != null) {
      builder.isEnabledAdvice(json.isEnabledAdvice);
    }
    if (json.onBeforeAdvice != null) {
      builder.onBeforeAdvice(json.onBeforeAdvice);
    }
    if (json.onReturnAdvice != null) {
      builder.onReturnAdvice(json.onReturnAdvice);
    }
    if (json.onThrowAdvice != null) {
      builder.onThrowAdvice(json.onThrowAdvice);
    }
    if (json.onAfterAdvice != null) {
      builder.onAfterAdvice(json.onAfterAdvice);
    }
    if (json.isEnabledParameters != null) {
      builder.addAllIsEnabledParameters(json.isEnabledParameters);
    }
    if (json.onBeforeParameters != null) {
      builder.addAllOnBeforeParameters(json.onBeforeParameters);
    }
    if (json.onReturnParameters != null) {
      builder.addAllOnReturnParameters(json.onReturnParameters);
    }
    if (json.onThrowParameters != null) {
      builder.addAllOnThrowParameters(json.onThrowParameters);
    }
    if (json.onAfterParameters != null) {
      builder.addAllOnAfterParameters(json.onAfterParameters);
    }
    if (json.hasBindThreadContextIsSet) {
      builder.hasBindThreadContext(json.hasBindThreadContext);
    }
    if (json.hasBindOptionalThreadContextIsSet) {
      builder.hasBindOptionalThreadContext(json.hasBindOptionalThreadContext);
    }
    if (json.reweavableIsSet) {
      builder.reweavable(json.reweavable);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Advice} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Advice instance
   */
  public static ImmutableAdvice copyOf(Advice instance) {
    if (instance instanceof ImmutableAdvice) {
      return (ImmutableAdvice) instance;
    }
    return ImmutableAdvice.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableAdvice ImmutableAdvice}.
   * @return A new ImmutableAdvice builder
   */
  public static ImmutableAdvice.Builder builder() {
    return new ImmutableAdvice.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableAdvice ImmutableAdvice}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_POINTCUT = 0x1L;
    private static final long INIT_BIT_ADVICE_TYPE = 0x2L;
    private static final long INIT_BIT_HAS_BIND_THREAD_CONTEXT = 0x4L;
    private static final long INIT_BIT_HAS_BIND_OPTIONAL_THREAD_CONTEXT = 0x8L;
    private static final long INIT_BIT_REWEAVABLE = 0x10L;
    private long initBits = 0x1fL;

    private @Nullable Pointcut pointcut;
    private @Nullable Type adviceType;
    private @Nullable Pattern pointcutClassNamePattern;
    private @Nullable Pattern pointcutClassAnnotationPattern;
    private @Nullable Pattern pointcutSubTypeRestrictionPattern;
    private @Nullable Pattern pointcutSuperTypeRestrictionPattern;
    private @Nullable Pattern pointcutMethodNamePattern;
    private @Nullable Pattern pointcutMethodAnnotationPattern;
    private ImmutableList.Builder<Object> pointcutMethodParameterTypes = ImmutableList.builder();
    private @Nullable Type travelerType;
    private @Nullable Method isEnabledAdvice;
    private @Nullable Method onBeforeAdvice;
    private @Nullable Method onReturnAdvice;
    private @Nullable Method onThrowAdvice;
    private @Nullable Method onAfterAdvice;
    private ImmutableList.Builder<Advice.AdviceParameter> isEnabledParameters = ImmutableList.builder();
    private ImmutableList.Builder<Advice.AdviceParameter> onBeforeParameters = ImmutableList.builder();
    private ImmutableList.Builder<Advice.AdviceParameter> onReturnParameters = ImmutableList.builder();
    private ImmutableList.Builder<Advice.AdviceParameter> onThrowParameters = ImmutableList.builder();
    private ImmutableList.Builder<Advice.AdviceParameter> onAfterParameters = ImmutableList.builder();
    private boolean hasBindThreadContext;
    private boolean hasBindOptionalThreadContext;
    private boolean reweavable;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Advice} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(Advice instance) {
      Preconditions.checkNotNull(instance, "instance");
      pointcut(instance.pointcut());
      adviceType(instance.adviceType());
      @Nullable Pattern pointcutClassNamePatternValue = instance.pointcutClassNamePattern();
      if (pointcutClassNamePatternValue != null) {
        pointcutClassNamePattern(pointcutClassNamePatternValue);
      }
      @Nullable Pattern pointcutClassAnnotationPatternValue = instance.pointcutClassAnnotationPattern();
      if (pointcutClassAnnotationPatternValue != null) {
        pointcutClassAnnotationPattern(pointcutClassAnnotationPatternValue);
      }
      @Nullable Pattern pointcutSubTypeRestrictionPatternValue = instance.pointcutSubTypeRestrictionPattern();
      if (pointcutSubTypeRestrictionPatternValue != null) {
        pointcutSubTypeRestrictionPattern(pointcutSubTypeRestrictionPatternValue);
      }
      @Nullable Pattern pointcutSuperTypeRestrictionPatternValue = instance.pointcutSuperTypeRestrictionPattern();
      if (pointcutSuperTypeRestrictionPatternValue != null) {
        pointcutSuperTypeRestrictionPattern(pointcutSuperTypeRestrictionPatternValue);
      }
      @Nullable Pattern pointcutMethodNamePatternValue = instance.pointcutMethodNamePattern();
      if (pointcutMethodNamePatternValue != null) {
        pointcutMethodNamePattern(pointcutMethodNamePatternValue);
      }
      @Nullable Pattern pointcutMethodAnnotationPatternValue = instance.pointcutMethodAnnotationPattern();
      if (pointcutMethodAnnotationPatternValue != null) {
        pointcutMethodAnnotationPattern(pointcutMethodAnnotationPatternValue);
      }
      addAllPointcutMethodParameterTypes(instance.pointcutMethodParameterTypes());
      @Nullable Type travelerTypeValue = instance.travelerType();
      if (travelerTypeValue != null) {
        travelerType(travelerTypeValue);
      }
      @Nullable Method isEnabledAdviceValue = instance.isEnabledAdvice();
      if (isEnabledAdviceValue != null) {
        isEnabledAdvice(isEnabledAdviceValue);
      }
      @Nullable Method onBeforeAdviceValue = instance.onBeforeAdvice();
      if (onBeforeAdviceValue != null) {
        onBeforeAdvice(onBeforeAdviceValue);
      }
      @Nullable Method onReturnAdviceValue = instance.onReturnAdvice();
      if (onReturnAdviceValue != null) {
        onReturnAdvice(onReturnAdviceValue);
      }
      @Nullable Method onThrowAdviceValue = instance.onThrowAdvice();
      if (onThrowAdviceValue != null) {
        onThrowAdvice(onThrowAdviceValue);
      }
      @Nullable Method onAfterAdviceValue = instance.onAfterAdvice();
      if (onAfterAdviceValue != null) {
        onAfterAdvice(onAfterAdviceValue);
      }
      addAllIsEnabledParameters(instance.isEnabledParameters());
      addAllOnBeforeParameters(instance.onBeforeParameters());
      addAllOnReturnParameters(instance.onReturnParameters());
      addAllOnThrowParameters(instance.onThrowParameters());
      addAllOnAfterParameters(instance.onAfterParameters());
      hasBindThreadContext(instance.hasBindThreadContext());
      hasBindOptionalThreadContext(instance.hasBindOptionalThreadContext());
      reweavable(instance.reweavable());
      return this;
    }

    /**
     * Initializes the value for the {@link Advice#pointcut() pointcut} attribute.
     * @param pointcut The value for pointcut 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder pointcut(Pointcut pointcut) {
      this.pointcut = Preconditions.checkNotNull(pointcut, "pointcut");
      initBits &= ~INIT_BIT_POINTCUT;
      return this;
    }

    /**
     * Initializes the value for the {@link Advice#adviceType() adviceType} attribute.
     * @param adviceType The value for adviceType 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder adviceType(Type adviceType) {
      this.adviceType = Preconditions.checkNotNull(adviceType, "adviceType");
      initBits &= ~INIT_BIT_ADVICE_TYPE;
      return this;
    }

    /**
     * Initializes the value for the {@link Advice#pointcutClassNamePattern() pointcutClassNamePattern} attribute.
     * @param pointcutClassNamePattern The value for pointcutClassNamePattern (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder pointcutClassNamePattern(@Nullable Pattern pointcutClassNamePattern) {
      this.pointcutClassNamePattern = pointcutClassNamePattern;
      return this;
    }

    /**
     * Initializes the value for the {@link Advice#pointcutClassAnnotationPattern() pointcutClassAnnotationPattern} attribute.
     * @param pointcutClassAnnotationPattern The value for pointcutClassAnnotationPattern (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder pointcutClassAnnotationPattern(@Nullable Pattern pointcutClassAnnotationPattern) {
      this.pointcutClassAnnotationPattern = pointcutClassAnnotationPattern;
      return this;
    }

    /**
     * Initializes the value for the {@link Advice#pointcutSubTypeRestrictionPattern() pointcutSubTypeRestrictionPattern} attribute.
     * @param pointcutSubTypeRestrictionPattern The value for pointcutSubTypeRestrictionPattern (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder pointcutSubTypeRestrictionPattern(@Nullable Pattern pointcutSubTypeRestrictionPattern) {
      this.pointcutSubTypeRestrictionPattern = pointcutSubTypeRestrictionPattern;
      return this;
    }

    /**
     * Initializes the value for the {@link Advice#pointcutSuperTypeRestrictionPattern() pointcutSuperTypeRestrictionPattern} attribute.
     * @param pointcutSuperTypeRestrictionPattern The value for pointcutSuperTypeRestrictionPattern (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder pointcutSuperTypeRestrictionPattern(@Nullable Pattern pointcutSuperTypeRestrictionPattern) {
      this.pointcutSuperTypeRestrictionPattern = pointcutSuperTypeRestrictionPattern;
      return this;
    }

    /**
     * Initializes the value for the {@link Advice#pointcutMethodNamePattern() pointcutMethodNamePattern} attribute.
     * @param pointcutMethodNamePattern The value for pointcutMethodNamePattern (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder pointcutMethodNamePattern(@Nullable Pattern pointcutMethodNamePattern) {
      this.pointcutMethodNamePattern = pointcutMethodNamePattern;
      return this;
    }

    /**
     * Initializes the value for the {@link Advice#pointcutMethodAnnotationPattern() pointcutMethodAnnotationPattern} attribute.
     * @param pointcutMethodAnnotationPattern The value for pointcutMethodAnnotationPattern (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder pointcutMethodAnnotationPattern(@Nullable Pattern pointcutMethodAnnotationPattern) {
      this.pointcutMethodAnnotationPattern = pointcutMethodAnnotationPattern;
      return this;
    }

    /**
     * Adds one element to {@link Advice#pointcutMethodParameterTypes() pointcutMethodParameterTypes} list.
     * @param element A pointcutMethodParameterTypes element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addPointcutMethodParameterTypes(Object element) {
      this.pointcutMethodParameterTypes.add(element);
      return this;
    }

    /**
     * Adds elements to {@link Advice#pointcutMethodParameterTypes() pointcutMethodParameterTypes} list.
     * @param elements An array of pointcutMethodParameterTypes elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addPointcutMethodParameterTypes(Object... elements) {
      this.pointcutMethodParameterTypes.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link Advice#pointcutMethodParameterTypes() pointcutMethodParameterTypes} list.
     * @param elements An iterable of pointcutMethodParameterTypes elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder pointcutMethodParameterTypes(Iterable<? extends Object> elements) {
      this.pointcutMethodParameterTypes = ImmutableList.builder();
      return addAllPointcutMethodParameterTypes(elements);
    }

    /**
     * Adds elements to {@link Advice#pointcutMethodParameterTypes() pointcutMethodParameterTypes} list.
     * @param elements An iterable of pointcutMethodParameterTypes elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllPointcutMethodParameterTypes(Iterable<? extends Object> elements) {
      this.pointcutMethodParameterTypes.addAll(elements);
      return this;
    }

    /**
     * Initializes the value for the {@link Advice#travelerType() travelerType} attribute.
     * @param travelerType The value for travelerType (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder travelerType(@Nullable Type travelerType) {
      this.travelerType = travelerType;
      return this;
    }

    /**
     * Initializes the value for the {@link Advice#isEnabledAdvice() isEnabledAdvice} attribute.
     * @param isEnabledAdvice The value for isEnabledAdvice (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder isEnabledAdvice(@Nullable Method isEnabledAdvice) {
      this.isEnabledAdvice = isEnabledAdvice;
      return this;
    }

    /**
     * Initializes the value for the {@link Advice#onBeforeAdvice() onBeforeAdvice} attribute.
     * @param onBeforeAdvice The value for onBeforeAdvice (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder onBeforeAdvice(@Nullable Method onBeforeAdvice) {
      this.onBeforeAdvice = onBeforeAdvice;
      return this;
    }

    /**
     * Initializes the value for the {@link Advice#onReturnAdvice() onReturnAdvice} attribute.
     * @param onReturnAdvice The value for onReturnAdvice (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder onReturnAdvice(@Nullable Method onReturnAdvice) {
      this.onReturnAdvice = onReturnAdvice;
      return this;
    }

    /**
     * Initializes the value for the {@link Advice#onThrowAdvice() onThrowAdvice} attribute.
     * @param onThrowAdvice The value for onThrowAdvice (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder onThrowAdvice(@Nullable Method onThrowAdvice) {
      this.onThrowAdvice = onThrowAdvice;
      return this;
    }

    /**
     * Initializes the value for the {@link Advice#onAfterAdvice() onAfterAdvice} attribute.
     * @param onAfterAdvice The value for onAfterAdvice (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder onAfterAdvice(@Nullable Method onAfterAdvice) {
      this.onAfterAdvice = onAfterAdvice;
      return this;
    }

    /**
     * Adds one element to {@link Advice#isEnabledParameters() isEnabledParameters} list.
     * @param element A isEnabledParameters element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addIsEnabledParameters(Advice.AdviceParameter element) {
      this.isEnabledParameters.add(element);
      return this;
    }

    /**
     * Adds elements to {@link Advice#isEnabledParameters() isEnabledParameters} list.
     * @param elements An array of isEnabledParameters elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addIsEnabledParameters(Advice.AdviceParameter... elements) {
      this.isEnabledParameters.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link Advice#isEnabledParameters() isEnabledParameters} list.
     * @param elements An iterable of isEnabledParameters elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder isEnabledParameters(Iterable<? extends Advice.AdviceParameter> elements) {
      this.isEnabledParameters = ImmutableList.builder();
      return addAllIsEnabledParameters(elements);
    }

    /**
     * Adds elements to {@link Advice#isEnabledParameters() isEnabledParameters} list.
     * @param elements An iterable of isEnabledParameters elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllIsEnabledParameters(Iterable<? extends Advice.AdviceParameter> elements) {
      this.isEnabledParameters.addAll(elements);
      return this;
    }

    /**
     * Adds one element to {@link Advice#onBeforeParameters() onBeforeParameters} list.
     * @param element A onBeforeParameters element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addOnBeforeParameters(Advice.AdviceParameter element) {
      this.onBeforeParameters.add(element);
      return this;
    }

    /**
     * Adds elements to {@link Advice#onBeforeParameters() onBeforeParameters} list.
     * @param elements An array of onBeforeParameters elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addOnBeforeParameters(Advice.AdviceParameter... elements) {
      this.onBeforeParameters.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link Advice#onBeforeParameters() onBeforeParameters} list.
     * @param elements An iterable of onBeforeParameters elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder onBeforeParameters(Iterable<? extends Advice.AdviceParameter> elements) {
      this.onBeforeParameters = ImmutableList.builder();
      return addAllOnBeforeParameters(elements);
    }

    /**
     * Adds elements to {@link Advice#onBeforeParameters() onBeforeParameters} list.
     * @param elements An iterable of onBeforeParameters elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllOnBeforeParameters(Iterable<? extends Advice.AdviceParameter> elements) {
      this.onBeforeParameters.addAll(elements);
      return this;
    }

    /**
     * Adds one element to {@link Advice#onReturnParameters() onReturnParameters} list.
     * @param element A onReturnParameters element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addOnReturnParameters(Advice.AdviceParameter element) {
      this.onReturnParameters.add(element);
      return this;
    }

    /**
     * Adds elements to {@link Advice#onReturnParameters() onReturnParameters} list.
     * @param elements An array of onReturnParameters elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addOnReturnParameters(Advice.AdviceParameter... elements) {
      this.onReturnParameters.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link Advice#onReturnParameters() onReturnParameters} list.
     * @param elements An iterable of onReturnParameters elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder onReturnParameters(Iterable<? extends Advice.AdviceParameter> elements) {
      this.onReturnParameters = ImmutableList.builder();
      return addAllOnReturnParameters(elements);
    }

    /**
     * Adds elements to {@link Advice#onReturnParameters() onReturnParameters} list.
     * @param elements An iterable of onReturnParameters elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllOnReturnParameters(Iterable<? extends Advice.AdviceParameter> elements) {
      this.onReturnParameters.addAll(elements);
      return this;
    }

    /**
     * Adds one element to {@link Advice#onThrowParameters() onThrowParameters} list.
     * @param element A onThrowParameters element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addOnThrowParameters(Advice.AdviceParameter element) {
      this.onThrowParameters.add(element);
      return this;
    }

    /**
     * Adds elements to {@link Advice#onThrowParameters() onThrowParameters} list.
     * @param elements An array of onThrowParameters elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addOnThrowParameters(Advice.AdviceParameter... elements) {
      this.onThrowParameters.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link Advice#onThrowParameters() onThrowParameters} list.
     * @param elements An iterable of onThrowParameters elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder onThrowParameters(Iterable<? extends Advice.AdviceParameter> elements) {
      this.onThrowParameters = ImmutableList.builder();
      return addAllOnThrowParameters(elements);
    }

    /**
     * Adds elements to {@link Advice#onThrowParameters() onThrowParameters} list.
     * @param elements An iterable of onThrowParameters elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllOnThrowParameters(Iterable<? extends Advice.AdviceParameter> elements) {
      this.onThrowParameters.addAll(elements);
      return this;
    }

    /**
     * Adds one element to {@link Advice#onAfterParameters() onAfterParameters} list.
     * @param element A onAfterParameters element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addOnAfterParameters(Advice.AdviceParameter element) {
      this.onAfterParameters.add(element);
      return this;
    }

    /**
     * Adds elements to {@link Advice#onAfterParameters() onAfterParameters} list.
     * @param elements An array of onAfterParameters elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addOnAfterParameters(Advice.AdviceParameter... elements) {
      this.onAfterParameters.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link Advice#onAfterParameters() onAfterParameters} list.
     * @param elements An iterable of onAfterParameters elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder onAfterParameters(Iterable<? extends Advice.AdviceParameter> elements) {
      this.onAfterParameters = ImmutableList.builder();
      return addAllOnAfterParameters(elements);
    }

    /**
     * Adds elements to {@link Advice#onAfterParameters() onAfterParameters} list.
     * @param elements An iterable of onAfterParameters elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllOnAfterParameters(Iterable<? extends Advice.AdviceParameter> elements) {
      this.onAfterParameters.addAll(elements);
      return this;
    }

    /**
     * Initializes the value for the {@link Advice#hasBindThreadContext() hasBindThreadContext} attribute.
     * @param hasBindThreadContext The value for hasBindThreadContext 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder hasBindThreadContext(boolean hasBindThreadContext) {
      this.hasBindThreadContext = hasBindThreadContext;
      initBits &= ~INIT_BIT_HAS_BIND_THREAD_CONTEXT;
      return this;
    }

    /**
     * Initializes the value for the {@link Advice#hasBindOptionalThreadContext() hasBindOptionalThreadContext} attribute.
     * @param hasBindOptionalThreadContext The value for hasBindOptionalThreadContext 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder hasBindOptionalThreadContext(boolean hasBindOptionalThreadContext) {
      this.hasBindOptionalThreadContext = hasBindOptionalThreadContext;
      initBits &= ~INIT_BIT_HAS_BIND_OPTIONAL_THREAD_CONTEXT;
      return this;
    }

    /**
     * Initializes the value for the {@link Advice#reweavable() reweavable} attribute.
     * @param reweavable The value for reweavable 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder reweavable(boolean reweavable) {
      this.reweavable = reweavable;
      initBits &= ~INIT_BIT_REWEAVABLE;
      return this;
    }

    /**
     * Builds a new {@link ImmutableAdvice ImmutableAdvice}.
     * @return An immutable instance of Advice
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableAdvice build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableAdvice(
          pointcut,
          adviceType,
          pointcutClassNamePattern,
          pointcutClassAnnotationPattern,
          pointcutSubTypeRestrictionPattern,
          pointcutSuperTypeRestrictionPattern,
          pointcutMethodNamePattern,
          pointcutMethodAnnotationPattern,
          pointcutMethodParameterTypes.build(),
          travelerType,
          isEnabledAdvice,
          onBeforeAdvice,
          onReturnAdvice,
          onThrowAdvice,
          onAfterAdvice,
          isEnabledParameters.build(),
          onBeforeParameters.build(),
          onReturnParameters.build(),
          onThrowParameters.build(),
          onAfterParameters.build(),
          hasBindThreadContext,
          hasBindOptionalThreadContext,
          reweavable);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_POINTCUT) != 0) attributes.add("pointcut");
      if ((initBits & INIT_BIT_ADVICE_TYPE) != 0) attributes.add("adviceType");
      if ((initBits & INIT_BIT_HAS_BIND_THREAD_CONTEXT) != 0) attributes.add("hasBindThreadContext");
      if ((initBits & INIT_BIT_HAS_BIND_OPTIONAL_THREAD_CONTEXT) != 0) attributes.add("hasBindOptionalThreadContext");
      if ((initBits & INIT_BIT_REWEAVABLE) != 0) attributes.add("reweavable");
      return "Cannot build Advice, some of required attributes are not set " + attributes;
    }
  }
}
