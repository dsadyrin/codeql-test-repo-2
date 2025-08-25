package org.glowroot.agent.shaded.glowroot.ui;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonInclude;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Objects;
import org.glowroot.agent.shaded.google.common.base.Optional;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import org.glowroot.agent.shaded.google.common.collect.ImmutableList;
import org.glowroot.agent.shaded.google.common.collect.ImmutableMap;
import org.glowroot.agent.shaded.google.common.collect.Lists;
import org.glowroot.agent.shaded.google.common.primitives.Booleans;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.glowroot.agent.shaded.glowroot.wire.api.model.AgentConfigOuterClass;

/**
 * Immutable implementation of {@link InstrumentationConfigJsonService.InstrumentationConfigDto}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableInstrumentationConfigDto.builder()}.
 */
@SuppressWarnings({"all", "deprecation"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "InstrumentationConfigJsonService.InstrumentationConfigDto"})
@Immutable
final class ImmutableInstrumentationConfigDto
    extends InstrumentationConfigJsonService.InstrumentationConfigDto {
  private final String className;
  private final String classAnnotation;
  private final String subTypeRestriction;
  private final String superTypeRestriction;
  private final @Nullable String methodDeclaringClassName;
  private final String methodName;
  private final String methodAnnotation;
  private final ImmutableList<String> methodParameterTypes;
  private final String methodReturnType;
  private final ImmutableList<AgentConfigOuterClass.AgentConfig.InstrumentationConfig.MethodModifier> methodModifiers;
  private final String nestingGroup;
  private final int order;
  private final AgentConfigOuterClass.AgentConfig.InstrumentationConfig.CaptureKind captureKind;
  private final String transactionType;
  private final String transactionNameTemplate;
  private final String transactionUserTemplate;
  private final ImmutableMap<String, String> transactionAttributeTemplates;
  private final @Nullable Integer transactionSlowThresholdMillis;
  private final boolean transactionOuter;
  private final String traceEntryMessageTemplate;
  private final @Nullable Integer traceEntryStackThresholdMillis;
  private final boolean traceEntryCaptureSelfNested;
  private final String timerName;
  private final String enabledProperty;
  private final String traceEntryEnabledProperty;
  private final Optional<String> version;

  private ImmutableInstrumentationConfigDto(
      String className,
      String classAnnotation,
      String subTypeRestriction,
      String superTypeRestriction,
      @Nullable String methodDeclaringClassName,
      String methodName,
      String methodAnnotation,
      ImmutableList<String> methodParameterTypes,
      String methodReturnType,
      ImmutableList<AgentConfigOuterClass.AgentConfig.InstrumentationConfig.MethodModifier> methodModifiers,
      String nestingGroup,
      int order,
      AgentConfigOuterClass.AgentConfig.InstrumentationConfig.CaptureKind captureKind,
      String transactionType,
      String transactionNameTemplate,
      String transactionUserTemplate,
      ImmutableMap<String, String> transactionAttributeTemplates,
      @Nullable Integer transactionSlowThresholdMillis,
      boolean transactionOuter,
      String traceEntryMessageTemplate,
      @Nullable Integer traceEntryStackThresholdMillis,
      boolean traceEntryCaptureSelfNested,
      String timerName,
      String enabledProperty,
      String traceEntryEnabledProperty,
      Optional<String> version) {
    this.className = className;
    this.classAnnotation = classAnnotation;
    this.subTypeRestriction = subTypeRestriction;
    this.superTypeRestriction = superTypeRestriction;
    this.methodDeclaringClassName = methodDeclaringClassName;
    this.methodName = methodName;
    this.methodAnnotation = methodAnnotation;
    this.methodParameterTypes = methodParameterTypes;
    this.methodReturnType = methodReturnType;
    this.methodModifiers = methodModifiers;
    this.nestingGroup = nestingGroup;
    this.order = order;
    this.captureKind = captureKind;
    this.transactionType = transactionType;
    this.transactionNameTemplate = transactionNameTemplate;
    this.transactionUserTemplate = transactionUserTemplate;
    this.transactionAttributeTemplates = transactionAttributeTemplates;
    this.transactionSlowThresholdMillis = transactionSlowThresholdMillis;
    this.transactionOuter = transactionOuter;
    this.traceEntryMessageTemplate = traceEntryMessageTemplate;
    this.traceEntryStackThresholdMillis = traceEntryStackThresholdMillis;
    this.traceEntryCaptureSelfNested = traceEntryCaptureSelfNested;
    this.timerName = timerName;
    this.enabledProperty = enabledProperty;
    this.traceEntryEnabledProperty = traceEntryEnabledProperty;
    this.version = version;
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
   * @return The value of the {@code classAnnotation} attribute
   */
  @JsonProperty("classAnnotation")
  @Override
  String classAnnotation() {
    return classAnnotation;
  }

  /**
   * @return The value of the {@code subTypeRestriction} attribute
   */
  @JsonProperty("subTypeRestriction")
  @Override
  String subTypeRestriction() {
    return subTypeRestriction;
  }

  /**
   * @return The value of the {@code superTypeRestriction} attribute
   */
  @JsonProperty("superTypeRestriction")
  @Override
  String superTypeRestriction() {
    return superTypeRestriction;
  }

  /**
   * @return The value of the {@code methodDeclaringClassName} attribute
   */
  @JsonProperty("methodDeclaringClassName")
  @JsonInclude(JsonInclude.Include.NON_NULL)
  @Deprecated
  @Override
  @Nullable String methodDeclaringClassName() {
    return methodDeclaringClassName;
  }

  /**
   * @return The value of the {@code methodName} attribute
   */
  @JsonProperty("methodName")
  @Override
  String methodName() {
    return methodName;
  }

  /**
   * @return The value of the {@code methodAnnotation} attribute
   */
  @JsonProperty("methodAnnotation")
  @Override
  String methodAnnotation() {
    return methodAnnotation;
  }

  /**
   * @return The value of the {@code methodParameterTypes} attribute
   */
  @JsonProperty("methodParameterTypes")
  @Override
  ImmutableList<String> methodParameterTypes() {
    return methodParameterTypes;
  }

  /**
   * @return The value of the {@code methodReturnType} attribute
   */
  @JsonProperty("methodReturnType")
  @Override
  String methodReturnType() {
    return methodReturnType;
  }

  /**
   * @return The value of the {@code methodModifiers} attribute
   */
  @JsonProperty("methodModifiers")
  @Override
  ImmutableList<AgentConfigOuterClass.AgentConfig.InstrumentationConfig.MethodModifier> methodModifiers() {
    return methodModifiers;
  }

  /**
   * @return The value of the {@code nestingGroup} attribute
   */
  @JsonProperty("nestingGroup")
  @Override
  String nestingGroup() {
    return nestingGroup;
  }

  /**
   * @return The value of the {@code order} attribute
   */
  @JsonProperty("order")
  @Override
  int order() {
    return order;
  }

  /**
   * @return The value of the {@code captureKind} attribute
   */
  @JsonProperty("captureKind")
  @Override
  AgentConfigOuterClass.AgentConfig.InstrumentationConfig.CaptureKind captureKind() {
    return captureKind;
  }

  /**
   * @return The value of the {@code transactionType} attribute
   */
  @JsonProperty("transactionType")
  @Override
  String transactionType() {
    return transactionType;
  }

  /**
   * @return The value of the {@code transactionNameTemplate} attribute
   */
  @JsonProperty("transactionNameTemplate")
  @Override
  String transactionNameTemplate() {
    return transactionNameTemplate;
  }

  /**
   * @return The value of the {@code transactionUserTemplate} attribute
   */
  @JsonProperty("transactionUserTemplate")
  @Override
  String transactionUserTemplate() {
    return transactionUserTemplate;
  }

  /**
   * @return The value of the {@code transactionAttributeTemplates} attribute
   */
  @JsonProperty("transactionAttributeTemplates")
  @Override
  ImmutableMap<String, String> transactionAttributeTemplates() {
    return transactionAttributeTemplates;
  }

  /**
   * @return The value of the {@code transactionSlowThresholdMillis} attribute
   */
  @JsonProperty("transactionSlowThresholdMillis")
  @Override
  @Nullable Integer transactionSlowThresholdMillis() {
    return transactionSlowThresholdMillis;
  }

  /**
   * @return The value of the {@code transactionOuter} attribute
   */
  @JsonProperty("transactionOuter")
  @Override
  boolean transactionOuter() {
    return transactionOuter;
  }

  /**
   * @return The value of the {@code traceEntryMessageTemplate} attribute
   */
  @JsonProperty("traceEntryMessageTemplate")
  @Override
  String traceEntryMessageTemplate() {
    return traceEntryMessageTemplate;
  }

  /**
   * @return The value of the {@code traceEntryStackThresholdMillis} attribute
   */
  @JsonProperty("traceEntryStackThresholdMillis")
  @Override
  @Nullable Integer traceEntryStackThresholdMillis() {
    return traceEntryStackThresholdMillis;
  }

  /**
   * @return The value of the {@code traceEntryCaptureSelfNested} attribute
   */
  @JsonProperty("traceEntryCaptureSelfNested")
  @Override
  boolean traceEntryCaptureSelfNested() {
    return traceEntryCaptureSelfNested;
  }

  /**
   * @return The value of the {@code timerName} attribute
   */
  @JsonProperty("timerName")
  @Override
  String timerName() {
    return timerName;
  }

  /**
   * @return The value of the {@code enabledProperty} attribute
   */
  @JsonProperty("enabledProperty")
  @Override
  String enabledProperty() {
    return enabledProperty;
  }

  /**
   * @return The value of the {@code traceEntryEnabledProperty} attribute
   */
  @JsonProperty("traceEntryEnabledProperty")
  @Override
  String traceEntryEnabledProperty() {
    return traceEntryEnabledProperty;
  }

  /**
   * @return The value of the {@code version} attribute
   */
  @JsonProperty("version")
  @Override
  Optional<String> version() {
    return version;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link InstrumentationConfigJsonService.InstrumentationConfigDto#className() className} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for className
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableInstrumentationConfigDto withClassName(String value) {
    if (this.className.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "className");
    return new ImmutableInstrumentationConfigDto(
        newValue,
        this.classAnnotation,
        this.subTypeRestriction,
        this.superTypeRestriction,
        this.methodDeclaringClassName,
        this.methodName,
        this.methodAnnotation,
        this.methodParameterTypes,
        this.methodReturnType,
        this.methodModifiers,
        this.nestingGroup,
        this.order,
        this.captureKind,
        this.transactionType,
        this.transactionNameTemplate,
        this.transactionUserTemplate,
        this.transactionAttributeTemplates,
        this.transactionSlowThresholdMillis,
        this.transactionOuter,
        this.traceEntryMessageTemplate,
        this.traceEntryStackThresholdMillis,
        this.traceEntryCaptureSelfNested,
        this.timerName,
        this.enabledProperty,
        this.traceEntryEnabledProperty,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link InstrumentationConfigJsonService.InstrumentationConfigDto#classAnnotation() classAnnotation} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for classAnnotation
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableInstrumentationConfigDto withClassAnnotation(String value) {
    if (this.classAnnotation.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "classAnnotation");
    return new ImmutableInstrumentationConfigDto(
        this.className,
        newValue,
        this.subTypeRestriction,
        this.superTypeRestriction,
        this.methodDeclaringClassName,
        this.methodName,
        this.methodAnnotation,
        this.methodParameterTypes,
        this.methodReturnType,
        this.methodModifiers,
        this.nestingGroup,
        this.order,
        this.captureKind,
        this.transactionType,
        this.transactionNameTemplate,
        this.transactionUserTemplate,
        this.transactionAttributeTemplates,
        this.transactionSlowThresholdMillis,
        this.transactionOuter,
        this.traceEntryMessageTemplate,
        this.traceEntryStackThresholdMillis,
        this.traceEntryCaptureSelfNested,
        this.timerName,
        this.enabledProperty,
        this.traceEntryEnabledProperty,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link InstrumentationConfigJsonService.InstrumentationConfigDto#subTypeRestriction() subTypeRestriction} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for subTypeRestriction
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableInstrumentationConfigDto withSubTypeRestriction(String value) {
    if (this.subTypeRestriction.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "subTypeRestriction");
    return new ImmutableInstrumentationConfigDto(
        this.className,
        this.classAnnotation,
        newValue,
        this.superTypeRestriction,
        this.methodDeclaringClassName,
        this.methodName,
        this.methodAnnotation,
        this.methodParameterTypes,
        this.methodReturnType,
        this.methodModifiers,
        this.nestingGroup,
        this.order,
        this.captureKind,
        this.transactionType,
        this.transactionNameTemplate,
        this.transactionUserTemplate,
        this.transactionAttributeTemplates,
        this.transactionSlowThresholdMillis,
        this.transactionOuter,
        this.traceEntryMessageTemplate,
        this.traceEntryStackThresholdMillis,
        this.traceEntryCaptureSelfNested,
        this.timerName,
        this.enabledProperty,
        this.traceEntryEnabledProperty,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link InstrumentationConfigJsonService.InstrumentationConfigDto#superTypeRestriction() superTypeRestriction} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for superTypeRestriction
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableInstrumentationConfigDto withSuperTypeRestriction(String value) {
    if (this.superTypeRestriction.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "superTypeRestriction");
    return new ImmutableInstrumentationConfigDto(
        this.className,
        this.classAnnotation,
        this.subTypeRestriction,
        newValue,
        this.methodDeclaringClassName,
        this.methodName,
        this.methodAnnotation,
        this.methodParameterTypes,
        this.methodReturnType,
        this.methodModifiers,
        this.nestingGroup,
        this.order,
        this.captureKind,
        this.transactionType,
        this.transactionNameTemplate,
        this.transactionUserTemplate,
        this.transactionAttributeTemplates,
        this.transactionSlowThresholdMillis,
        this.transactionOuter,
        this.traceEntryMessageTemplate,
        this.traceEntryStackThresholdMillis,
        this.traceEntryCaptureSelfNested,
        this.timerName,
        this.enabledProperty,
        this.traceEntryEnabledProperty,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link InstrumentationConfigJsonService.InstrumentationConfigDto#methodDeclaringClassName() methodDeclaringClassName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for methodDeclaringClassName (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  @Deprecated
  public final ImmutableInstrumentationConfigDto withMethodDeclaringClassName(@Nullable String value) {
    if (Objects.equal(this.methodDeclaringClassName, value)) return this;
    return new ImmutableInstrumentationConfigDto(
        this.className,
        this.classAnnotation,
        this.subTypeRestriction,
        this.superTypeRestriction,
        value,
        this.methodName,
        this.methodAnnotation,
        this.methodParameterTypes,
        this.methodReturnType,
        this.methodModifiers,
        this.nestingGroup,
        this.order,
        this.captureKind,
        this.transactionType,
        this.transactionNameTemplate,
        this.transactionUserTemplate,
        this.transactionAttributeTemplates,
        this.transactionSlowThresholdMillis,
        this.transactionOuter,
        this.traceEntryMessageTemplate,
        this.traceEntryStackThresholdMillis,
        this.traceEntryCaptureSelfNested,
        this.timerName,
        this.enabledProperty,
        this.traceEntryEnabledProperty,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link InstrumentationConfigJsonService.InstrumentationConfigDto#methodName() methodName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for methodName
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableInstrumentationConfigDto withMethodName(String value) {
    if (this.methodName.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "methodName");
    return new ImmutableInstrumentationConfigDto(
        this.className,
        this.classAnnotation,
        this.subTypeRestriction,
        this.superTypeRestriction,
        this.methodDeclaringClassName,
        newValue,
        this.methodAnnotation,
        this.methodParameterTypes,
        this.methodReturnType,
        this.methodModifiers,
        this.nestingGroup,
        this.order,
        this.captureKind,
        this.transactionType,
        this.transactionNameTemplate,
        this.transactionUserTemplate,
        this.transactionAttributeTemplates,
        this.transactionSlowThresholdMillis,
        this.transactionOuter,
        this.traceEntryMessageTemplate,
        this.traceEntryStackThresholdMillis,
        this.traceEntryCaptureSelfNested,
        this.timerName,
        this.enabledProperty,
        this.traceEntryEnabledProperty,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link InstrumentationConfigJsonService.InstrumentationConfigDto#methodAnnotation() methodAnnotation} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for methodAnnotation
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableInstrumentationConfigDto withMethodAnnotation(String value) {
    if (this.methodAnnotation.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "methodAnnotation");
    return new ImmutableInstrumentationConfigDto(
        this.className,
        this.classAnnotation,
        this.subTypeRestriction,
        this.superTypeRestriction,
        this.methodDeclaringClassName,
        this.methodName,
        newValue,
        this.methodParameterTypes,
        this.methodReturnType,
        this.methodModifiers,
        this.nestingGroup,
        this.order,
        this.captureKind,
        this.transactionType,
        this.transactionNameTemplate,
        this.transactionUserTemplate,
        this.transactionAttributeTemplates,
        this.transactionSlowThresholdMillis,
        this.transactionOuter,
        this.traceEntryMessageTemplate,
        this.traceEntryStackThresholdMillis,
        this.traceEntryCaptureSelfNested,
        this.timerName,
        this.enabledProperty,
        this.traceEntryEnabledProperty,
        this.version);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link InstrumentationConfigJsonService.InstrumentationConfigDto#methodParameterTypes() methodParameterTypes}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInstrumentationConfigDto withMethodParameterTypes(String... elements) {
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableInstrumentationConfigDto(
        this.className,
        this.classAnnotation,
        this.subTypeRestriction,
        this.superTypeRestriction,
        this.methodDeclaringClassName,
        this.methodName,
        this.methodAnnotation,
        newValue,
        this.methodReturnType,
        this.methodModifiers,
        this.nestingGroup,
        this.order,
        this.captureKind,
        this.transactionType,
        this.transactionNameTemplate,
        this.transactionUserTemplate,
        this.transactionAttributeTemplates,
        this.transactionSlowThresholdMillis,
        this.transactionOuter,
        this.traceEntryMessageTemplate,
        this.traceEntryStackThresholdMillis,
        this.traceEntryCaptureSelfNested,
        this.timerName,
        this.enabledProperty,
        this.traceEntryEnabledProperty,
        this.version);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link InstrumentationConfigJsonService.InstrumentationConfigDto#methodParameterTypes() methodParameterTypes}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of methodParameterTypes elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInstrumentationConfigDto withMethodParameterTypes(Iterable<String> elements) {
    if (this.methodParameterTypes == elements) return this;
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableInstrumentationConfigDto(
        this.className,
        this.classAnnotation,
        this.subTypeRestriction,
        this.superTypeRestriction,
        this.methodDeclaringClassName,
        this.methodName,
        this.methodAnnotation,
        newValue,
        this.methodReturnType,
        this.methodModifiers,
        this.nestingGroup,
        this.order,
        this.captureKind,
        this.transactionType,
        this.transactionNameTemplate,
        this.transactionUserTemplate,
        this.transactionAttributeTemplates,
        this.transactionSlowThresholdMillis,
        this.transactionOuter,
        this.traceEntryMessageTemplate,
        this.traceEntryStackThresholdMillis,
        this.traceEntryCaptureSelfNested,
        this.timerName,
        this.enabledProperty,
        this.traceEntryEnabledProperty,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link InstrumentationConfigJsonService.InstrumentationConfigDto#methodReturnType() methodReturnType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for methodReturnType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableInstrumentationConfigDto withMethodReturnType(String value) {
    if (this.methodReturnType.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "methodReturnType");
    return new ImmutableInstrumentationConfigDto(
        this.className,
        this.classAnnotation,
        this.subTypeRestriction,
        this.superTypeRestriction,
        this.methodDeclaringClassName,
        this.methodName,
        this.methodAnnotation,
        this.methodParameterTypes,
        newValue,
        this.methodModifiers,
        this.nestingGroup,
        this.order,
        this.captureKind,
        this.transactionType,
        this.transactionNameTemplate,
        this.transactionUserTemplate,
        this.transactionAttributeTemplates,
        this.transactionSlowThresholdMillis,
        this.transactionOuter,
        this.traceEntryMessageTemplate,
        this.traceEntryStackThresholdMillis,
        this.traceEntryCaptureSelfNested,
        this.timerName,
        this.enabledProperty,
        this.traceEntryEnabledProperty,
        this.version);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link InstrumentationConfigJsonService.InstrumentationConfigDto#methodModifiers() methodModifiers}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInstrumentationConfigDto withMethodModifiers(AgentConfigOuterClass.AgentConfig.InstrumentationConfig.MethodModifier... elements) {
    ImmutableList<AgentConfigOuterClass.AgentConfig.InstrumentationConfig.MethodModifier> newValue = ImmutableList.copyOf(elements);
    return new ImmutableInstrumentationConfigDto(
        this.className,
        this.classAnnotation,
        this.subTypeRestriction,
        this.superTypeRestriction,
        this.methodDeclaringClassName,
        this.methodName,
        this.methodAnnotation,
        this.methodParameterTypes,
        this.methodReturnType,
        newValue,
        this.nestingGroup,
        this.order,
        this.captureKind,
        this.transactionType,
        this.transactionNameTemplate,
        this.transactionUserTemplate,
        this.transactionAttributeTemplates,
        this.transactionSlowThresholdMillis,
        this.transactionOuter,
        this.traceEntryMessageTemplate,
        this.traceEntryStackThresholdMillis,
        this.traceEntryCaptureSelfNested,
        this.timerName,
        this.enabledProperty,
        this.traceEntryEnabledProperty,
        this.version);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link InstrumentationConfigJsonService.InstrumentationConfigDto#methodModifiers() methodModifiers}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of methodModifiers elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInstrumentationConfigDto withMethodModifiers(Iterable<? extends AgentConfigOuterClass.AgentConfig.InstrumentationConfig.MethodModifier> elements) {
    if (this.methodModifiers == elements) return this;
    ImmutableList<AgentConfigOuterClass.AgentConfig.InstrumentationConfig.MethodModifier> newValue = ImmutableList.copyOf(elements);
    return new ImmutableInstrumentationConfigDto(
        this.className,
        this.classAnnotation,
        this.subTypeRestriction,
        this.superTypeRestriction,
        this.methodDeclaringClassName,
        this.methodName,
        this.methodAnnotation,
        this.methodParameterTypes,
        this.methodReturnType,
        newValue,
        this.nestingGroup,
        this.order,
        this.captureKind,
        this.transactionType,
        this.transactionNameTemplate,
        this.transactionUserTemplate,
        this.transactionAttributeTemplates,
        this.transactionSlowThresholdMillis,
        this.transactionOuter,
        this.traceEntryMessageTemplate,
        this.traceEntryStackThresholdMillis,
        this.traceEntryCaptureSelfNested,
        this.timerName,
        this.enabledProperty,
        this.traceEntryEnabledProperty,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link InstrumentationConfigJsonService.InstrumentationConfigDto#nestingGroup() nestingGroup} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for nestingGroup
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableInstrumentationConfigDto withNestingGroup(String value) {
    if (this.nestingGroup.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "nestingGroup");
    return new ImmutableInstrumentationConfigDto(
        this.className,
        this.classAnnotation,
        this.subTypeRestriction,
        this.superTypeRestriction,
        this.methodDeclaringClassName,
        this.methodName,
        this.methodAnnotation,
        this.methodParameterTypes,
        this.methodReturnType,
        this.methodModifiers,
        newValue,
        this.order,
        this.captureKind,
        this.transactionType,
        this.transactionNameTemplate,
        this.transactionUserTemplate,
        this.transactionAttributeTemplates,
        this.transactionSlowThresholdMillis,
        this.transactionOuter,
        this.traceEntryMessageTemplate,
        this.traceEntryStackThresholdMillis,
        this.traceEntryCaptureSelfNested,
        this.timerName,
        this.enabledProperty,
        this.traceEntryEnabledProperty,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link InstrumentationConfigJsonService.InstrumentationConfigDto#order() order} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for order
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableInstrumentationConfigDto withOrder(int value) {
    if (this.order == value) return this;
    return new ImmutableInstrumentationConfigDto(
        this.className,
        this.classAnnotation,
        this.subTypeRestriction,
        this.superTypeRestriction,
        this.methodDeclaringClassName,
        this.methodName,
        this.methodAnnotation,
        this.methodParameterTypes,
        this.methodReturnType,
        this.methodModifiers,
        this.nestingGroup,
        value,
        this.captureKind,
        this.transactionType,
        this.transactionNameTemplate,
        this.transactionUserTemplate,
        this.transactionAttributeTemplates,
        this.transactionSlowThresholdMillis,
        this.transactionOuter,
        this.traceEntryMessageTemplate,
        this.traceEntryStackThresholdMillis,
        this.traceEntryCaptureSelfNested,
        this.timerName,
        this.enabledProperty,
        this.traceEntryEnabledProperty,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link InstrumentationConfigJsonService.InstrumentationConfigDto#captureKind() captureKind} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for captureKind
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableInstrumentationConfigDto withCaptureKind(AgentConfigOuterClass.AgentConfig.InstrumentationConfig.CaptureKind value) {
    if (this.captureKind == value) return this;
    AgentConfigOuterClass.AgentConfig.InstrumentationConfig.CaptureKind newValue = Preconditions.checkNotNull(value, "captureKind");
    return new ImmutableInstrumentationConfigDto(
        this.className,
        this.classAnnotation,
        this.subTypeRestriction,
        this.superTypeRestriction,
        this.methodDeclaringClassName,
        this.methodName,
        this.methodAnnotation,
        this.methodParameterTypes,
        this.methodReturnType,
        this.methodModifiers,
        this.nestingGroup,
        this.order,
        newValue,
        this.transactionType,
        this.transactionNameTemplate,
        this.transactionUserTemplate,
        this.transactionAttributeTemplates,
        this.transactionSlowThresholdMillis,
        this.transactionOuter,
        this.traceEntryMessageTemplate,
        this.traceEntryStackThresholdMillis,
        this.traceEntryCaptureSelfNested,
        this.timerName,
        this.enabledProperty,
        this.traceEntryEnabledProperty,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link InstrumentationConfigJsonService.InstrumentationConfigDto#transactionType() transactionType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for transactionType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableInstrumentationConfigDto withTransactionType(String value) {
    if (this.transactionType.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "transactionType");
    return new ImmutableInstrumentationConfigDto(
        this.className,
        this.classAnnotation,
        this.subTypeRestriction,
        this.superTypeRestriction,
        this.methodDeclaringClassName,
        this.methodName,
        this.methodAnnotation,
        this.methodParameterTypes,
        this.methodReturnType,
        this.methodModifiers,
        this.nestingGroup,
        this.order,
        this.captureKind,
        newValue,
        this.transactionNameTemplate,
        this.transactionUserTemplate,
        this.transactionAttributeTemplates,
        this.transactionSlowThresholdMillis,
        this.transactionOuter,
        this.traceEntryMessageTemplate,
        this.traceEntryStackThresholdMillis,
        this.traceEntryCaptureSelfNested,
        this.timerName,
        this.enabledProperty,
        this.traceEntryEnabledProperty,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link InstrumentationConfigJsonService.InstrumentationConfigDto#transactionNameTemplate() transactionNameTemplate} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for transactionNameTemplate
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableInstrumentationConfigDto withTransactionNameTemplate(String value) {
    if (this.transactionNameTemplate.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "transactionNameTemplate");
    return new ImmutableInstrumentationConfigDto(
        this.className,
        this.classAnnotation,
        this.subTypeRestriction,
        this.superTypeRestriction,
        this.methodDeclaringClassName,
        this.methodName,
        this.methodAnnotation,
        this.methodParameterTypes,
        this.methodReturnType,
        this.methodModifiers,
        this.nestingGroup,
        this.order,
        this.captureKind,
        this.transactionType,
        newValue,
        this.transactionUserTemplate,
        this.transactionAttributeTemplates,
        this.transactionSlowThresholdMillis,
        this.transactionOuter,
        this.traceEntryMessageTemplate,
        this.traceEntryStackThresholdMillis,
        this.traceEntryCaptureSelfNested,
        this.timerName,
        this.enabledProperty,
        this.traceEntryEnabledProperty,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link InstrumentationConfigJsonService.InstrumentationConfigDto#transactionUserTemplate() transactionUserTemplate} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for transactionUserTemplate
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableInstrumentationConfigDto withTransactionUserTemplate(String value) {
    if (this.transactionUserTemplate.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "transactionUserTemplate");
    return new ImmutableInstrumentationConfigDto(
        this.className,
        this.classAnnotation,
        this.subTypeRestriction,
        this.superTypeRestriction,
        this.methodDeclaringClassName,
        this.methodName,
        this.methodAnnotation,
        this.methodParameterTypes,
        this.methodReturnType,
        this.methodModifiers,
        this.nestingGroup,
        this.order,
        this.captureKind,
        this.transactionType,
        this.transactionNameTemplate,
        newValue,
        this.transactionAttributeTemplates,
        this.transactionSlowThresholdMillis,
        this.transactionOuter,
        this.traceEntryMessageTemplate,
        this.traceEntryStackThresholdMillis,
        this.traceEntryCaptureSelfNested,
        this.timerName,
        this.enabledProperty,
        this.traceEntryEnabledProperty,
        this.version);
  }

  /**
   * Copy the current immutable object by replacing the {@link InstrumentationConfigJsonService.InstrumentationConfigDto#transactionAttributeTemplates() transactionAttributeTemplates} map with the specified map.
   * Nulls are not permitted as keys or values.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param entries The entries to be added to the transactionAttributeTemplates map
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInstrumentationConfigDto withTransactionAttributeTemplates(Map<String, ? extends String> entries) {
    if (this.transactionAttributeTemplates == entries) return this;
    ImmutableMap<String, String> newValue = ImmutableMap.copyOf(entries);
    return new ImmutableInstrumentationConfigDto(
        this.className,
        this.classAnnotation,
        this.subTypeRestriction,
        this.superTypeRestriction,
        this.methodDeclaringClassName,
        this.methodName,
        this.methodAnnotation,
        this.methodParameterTypes,
        this.methodReturnType,
        this.methodModifiers,
        this.nestingGroup,
        this.order,
        this.captureKind,
        this.transactionType,
        this.transactionNameTemplate,
        this.transactionUserTemplate,
        newValue,
        this.transactionSlowThresholdMillis,
        this.transactionOuter,
        this.traceEntryMessageTemplate,
        this.traceEntryStackThresholdMillis,
        this.traceEntryCaptureSelfNested,
        this.timerName,
        this.enabledProperty,
        this.traceEntryEnabledProperty,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link InstrumentationConfigJsonService.InstrumentationConfigDto#transactionSlowThresholdMillis() transactionSlowThresholdMillis} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for transactionSlowThresholdMillis (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableInstrumentationConfigDto withTransactionSlowThresholdMillis(@Nullable Integer value) {
    if (Objects.equal(this.transactionSlowThresholdMillis, value)) return this;
    return new ImmutableInstrumentationConfigDto(
        this.className,
        this.classAnnotation,
        this.subTypeRestriction,
        this.superTypeRestriction,
        this.methodDeclaringClassName,
        this.methodName,
        this.methodAnnotation,
        this.methodParameterTypes,
        this.methodReturnType,
        this.methodModifiers,
        this.nestingGroup,
        this.order,
        this.captureKind,
        this.transactionType,
        this.transactionNameTemplate,
        this.transactionUserTemplate,
        this.transactionAttributeTemplates,
        value,
        this.transactionOuter,
        this.traceEntryMessageTemplate,
        this.traceEntryStackThresholdMillis,
        this.traceEntryCaptureSelfNested,
        this.timerName,
        this.enabledProperty,
        this.traceEntryEnabledProperty,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link InstrumentationConfigJsonService.InstrumentationConfigDto#transactionOuter() transactionOuter} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for transactionOuter
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableInstrumentationConfigDto withTransactionOuter(boolean value) {
    if (this.transactionOuter == value) return this;
    return new ImmutableInstrumentationConfigDto(
        this.className,
        this.classAnnotation,
        this.subTypeRestriction,
        this.superTypeRestriction,
        this.methodDeclaringClassName,
        this.methodName,
        this.methodAnnotation,
        this.methodParameterTypes,
        this.methodReturnType,
        this.methodModifiers,
        this.nestingGroup,
        this.order,
        this.captureKind,
        this.transactionType,
        this.transactionNameTemplate,
        this.transactionUserTemplate,
        this.transactionAttributeTemplates,
        this.transactionSlowThresholdMillis,
        value,
        this.traceEntryMessageTemplate,
        this.traceEntryStackThresholdMillis,
        this.traceEntryCaptureSelfNested,
        this.timerName,
        this.enabledProperty,
        this.traceEntryEnabledProperty,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link InstrumentationConfigJsonService.InstrumentationConfigDto#traceEntryMessageTemplate() traceEntryMessageTemplate} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for traceEntryMessageTemplate
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableInstrumentationConfigDto withTraceEntryMessageTemplate(String value) {
    if (this.traceEntryMessageTemplate.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "traceEntryMessageTemplate");
    return new ImmutableInstrumentationConfigDto(
        this.className,
        this.classAnnotation,
        this.subTypeRestriction,
        this.superTypeRestriction,
        this.methodDeclaringClassName,
        this.methodName,
        this.methodAnnotation,
        this.methodParameterTypes,
        this.methodReturnType,
        this.methodModifiers,
        this.nestingGroup,
        this.order,
        this.captureKind,
        this.transactionType,
        this.transactionNameTemplate,
        this.transactionUserTemplate,
        this.transactionAttributeTemplates,
        this.transactionSlowThresholdMillis,
        this.transactionOuter,
        newValue,
        this.traceEntryStackThresholdMillis,
        this.traceEntryCaptureSelfNested,
        this.timerName,
        this.enabledProperty,
        this.traceEntryEnabledProperty,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link InstrumentationConfigJsonService.InstrumentationConfigDto#traceEntryStackThresholdMillis() traceEntryStackThresholdMillis} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for traceEntryStackThresholdMillis (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableInstrumentationConfigDto withTraceEntryStackThresholdMillis(@Nullable Integer value) {
    if (Objects.equal(this.traceEntryStackThresholdMillis, value)) return this;
    return new ImmutableInstrumentationConfigDto(
        this.className,
        this.classAnnotation,
        this.subTypeRestriction,
        this.superTypeRestriction,
        this.methodDeclaringClassName,
        this.methodName,
        this.methodAnnotation,
        this.methodParameterTypes,
        this.methodReturnType,
        this.methodModifiers,
        this.nestingGroup,
        this.order,
        this.captureKind,
        this.transactionType,
        this.transactionNameTemplate,
        this.transactionUserTemplate,
        this.transactionAttributeTemplates,
        this.transactionSlowThresholdMillis,
        this.transactionOuter,
        this.traceEntryMessageTemplate,
        value,
        this.traceEntryCaptureSelfNested,
        this.timerName,
        this.enabledProperty,
        this.traceEntryEnabledProperty,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link InstrumentationConfigJsonService.InstrumentationConfigDto#traceEntryCaptureSelfNested() traceEntryCaptureSelfNested} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for traceEntryCaptureSelfNested
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableInstrumentationConfigDto withTraceEntryCaptureSelfNested(boolean value) {
    if (this.traceEntryCaptureSelfNested == value) return this;
    return new ImmutableInstrumentationConfigDto(
        this.className,
        this.classAnnotation,
        this.subTypeRestriction,
        this.superTypeRestriction,
        this.methodDeclaringClassName,
        this.methodName,
        this.methodAnnotation,
        this.methodParameterTypes,
        this.methodReturnType,
        this.methodModifiers,
        this.nestingGroup,
        this.order,
        this.captureKind,
        this.transactionType,
        this.transactionNameTemplate,
        this.transactionUserTemplate,
        this.transactionAttributeTemplates,
        this.transactionSlowThresholdMillis,
        this.transactionOuter,
        this.traceEntryMessageTemplate,
        this.traceEntryStackThresholdMillis,
        value,
        this.timerName,
        this.enabledProperty,
        this.traceEntryEnabledProperty,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link InstrumentationConfigJsonService.InstrumentationConfigDto#timerName() timerName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for timerName
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableInstrumentationConfigDto withTimerName(String value) {
    if (this.timerName.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "timerName");
    return new ImmutableInstrumentationConfigDto(
        this.className,
        this.classAnnotation,
        this.subTypeRestriction,
        this.superTypeRestriction,
        this.methodDeclaringClassName,
        this.methodName,
        this.methodAnnotation,
        this.methodParameterTypes,
        this.methodReturnType,
        this.methodModifiers,
        this.nestingGroup,
        this.order,
        this.captureKind,
        this.transactionType,
        this.transactionNameTemplate,
        this.transactionUserTemplate,
        this.transactionAttributeTemplates,
        this.transactionSlowThresholdMillis,
        this.transactionOuter,
        this.traceEntryMessageTemplate,
        this.traceEntryStackThresholdMillis,
        this.traceEntryCaptureSelfNested,
        newValue,
        this.enabledProperty,
        this.traceEntryEnabledProperty,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link InstrumentationConfigJsonService.InstrumentationConfigDto#enabledProperty() enabledProperty} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for enabledProperty
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableInstrumentationConfigDto withEnabledProperty(String value) {
    if (this.enabledProperty.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "enabledProperty");
    return new ImmutableInstrumentationConfigDto(
        this.className,
        this.classAnnotation,
        this.subTypeRestriction,
        this.superTypeRestriction,
        this.methodDeclaringClassName,
        this.methodName,
        this.methodAnnotation,
        this.methodParameterTypes,
        this.methodReturnType,
        this.methodModifiers,
        this.nestingGroup,
        this.order,
        this.captureKind,
        this.transactionType,
        this.transactionNameTemplate,
        this.transactionUserTemplate,
        this.transactionAttributeTemplates,
        this.transactionSlowThresholdMillis,
        this.transactionOuter,
        this.traceEntryMessageTemplate,
        this.traceEntryStackThresholdMillis,
        this.traceEntryCaptureSelfNested,
        this.timerName,
        newValue,
        this.traceEntryEnabledProperty,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link InstrumentationConfigJsonService.InstrumentationConfigDto#traceEntryEnabledProperty() traceEntryEnabledProperty} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for traceEntryEnabledProperty
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableInstrumentationConfigDto withTraceEntryEnabledProperty(String value) {
    if (this.traceEntryEnabledProperty.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "traceEntryEnabledProperty");
    return new ImmutableInstrumentationConfigDto(
        this.className,
        this.classAnnotation,
        this.subTypeRestriction,
        this.superTypeRestriction,
        this.methodDeclaringClassName,
        this.methodName,
        this.methodAnnotation,
        this.methodParameterTypes,
        this.methodReturnType,
        this.methodModifiers,
        this.nestingGroup,
        this.order,
        this.captureKind,
        this.transactionType,
        this.transactionNameTemplate,
        this.transactionUserTemplate,
        this.transactionAttributeTemplates,
        this.transactionSlowThresholdMillis,
        this.transactionOuter,
        this.traceEntryMessageTemplate,
        this.traceEntryStackThresholdMillis,
        this.traceEntryCaptureSelfNested,
        this.timerName,
        this.enabledProperty,
        newValue,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InstrumentationConfigJsonService.InstrumentationConfigDto#version() version} attribute.
   * @param value The value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInstrumentationConfigDto withVersion(String value) {
    Optional<String> newValue = Optional.of(value);
    if (this.version.equals(newValue)) return this;
    return new ImmutableInstrumentationConfigDto(
        this.className,
        this.classAnnotation,
        this.subTypeRestriction,
        this.superTypeRestriction,
        this.methodDeclaringClassName,
        this.methodName,
        this.methodAnnotation,
        this.methodParameterTypes,
        this.methodReturnType,
        this.methodModifiers,
        this.nestingGroup,
        this.order,
        this.captureKind,
        this.transactionType,
        this.transactionNameTemplate,
        this.transactionUserTemplate,
        this.transactionAttributeTemplates,
        this.transactionSlowThresholdMillis,
        this.transactionOuter,
        this.traceEntryMessageTemplate,
        this.traceEntryStackThresholdMillis,
        this.traceEntryCaptureSelfNested,
        this.timerName,
        this.enabledProperty,
        this.traceEntryEnabledProperty,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InstrumentationConfigJsonService.InstrumentationConfigDto#version() version} attribute.
   * An equality check is used to prevent copying of the same value by returning {@code this}.
   * @param optional A value for version
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInstrumentationConfigDto withVersion(Optional<String> optional) {
    Optional<String> value = (Optional<String>) optional;
    if (this.version.equals(value)) return this;
    return new ImmutableInstrumentationConfigDto(
        this.className,
        this.classAnnotation,
        this.subTypeRestriction,
        this.superTypeRestriction,
        this.methodDeclaringClassName,
        this.methodName,
        this.methodAnnotation,
        this.methodParameterTypes,
        this.methodReturnType,
        this.methodModifiers,
        this.nestingGroup,
        this.order,
        this.captureKind,
        this.transactionType,
        this.transactionNameTemplate,
        this.transactionUserTemplate,
        this.transactionAttributeTemplates,
        this.transactionSlowThresholdMillis,
        this.transactionOuter,
        this.traceEntryMessageTemplate,
        this.traceEntryStackThresholdMillis,
        this.traceEntryCaptureSelfNested,
        this.timerName,
        this.enabledProperty,
        this.traceEntryEnabledProperty,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableInstrumentationConfigDto} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableInstrumentationConfigDto
        && equalTo((ImmutableInstrumentationConfigDto) another);
  }

  private boolean equalTo(ImmutableInstrumentationConfigDto another) {
    return className.equals(another.className)
        && classAnnotation.equals(another.classAnnotation)
        && subTypeRestriction.equals(another.subTypeRestriction)
        && superTypeRestriction.equals(another.superTypeRestriction)
        && Objects.equal(methodDeclaringClassName, another.methodDeclaringClassName)
        && methodName.equals(another.methodName)
        && methodAnnotation.equals(another.methodAnnotation)
        && methodParameterTypes.equals(another.methodParameterTypes)
        && methodReturnType.equals(another.methodReturnType)
        && methodModifiers.equals(another.methodModifiers)
        && nestingGroup.equals(another.nestingGroup)
        && order == another.order
        && captureKind.equals(another.captureKind)
        && transactionType.equals(another.transactionType)
        && transactionNameTemplate.equals(another.transactionNameTemplate)
        && transactionUserTemplate.equals(another.transactionUserTemplate)
        && transactionAttributeTemplates.equals(another.transactionAttributeTemplates)
        && Objects.equal(transactionSlowThresholdMillis, another.transactionSlowThresholdMillis)
        && transactionOuter == another.transactionOuter
        && traceEntryMessageTemplate.equals(another.traceEntryMessageTemplate)
        && Objects.equal(traceEntryStackThresholdMillis, another.traceEntryStackThresholdMillis)
        && traceEntryCaptureSelfNested == another.traceEntryCaptureSelfNested
        && timerName.equals(another.timerName)
        && enabledProperty.equals(another.enabledProperty)
        && traceEntryEnabledProperty.equals(another.traceEntryEnabledProperty)
        && version.equals(another.version);
  }

  /**
   * Computes a hash code from attributes: {@code className}, {@code classAnnotation}, {@code subTypeRestriction}, {@code superTypeRestriction}, {@code methodDeclaringClassName}, {@code methodName}, {@code methodAnnotation}, {@code methodParameterTypes}, {@code methodReturnType}, {@code methodModifiers}, {@code nestingGroup}, {@code order}, {@code captureKind}, {@code transactionType}, {@code transactionNameTemplate}, {@code transactionUserTemplate}, {@code transactionAttributeTemplates}, {@code transactionSlowThresholdMillis}, {@code transactionOuter}, {@code traceEntryMessageTemplate}, {@code traceEntryStackThresholdMillis}, {@code traceEntryCaptureSelfNested}, {@code timerName}, {@code enabledProperty}, {@code traceEntryEnabledProperty}, {@code version}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + className.hashCode();
    h += (h << 5) + classAnnotation.hashCode();
    h += (h << 5) + subTypeRestriction.hashCode();
    h += (h << 5) + superTypeRestriction.hashCode();
    h += (h << 5) + Objects.hashCode(methodDeclaringClassName);
    h += (h << 5) + methodName.hashCode();
    h += (h << 5) + methodAnnotation.hashCode();
    h += (h << 5) + methodParameterTypes.hashCode();
    h += (h << 5) + methodReturnType.hashCode();
    h += (h << 5) + methodModifiers.hashCode();
    h += (h << 5) + nestingGroup.hashCode();
    h += (h << 5) + order;
    h += (h << 5) + captureKind.hashCode();
    h += (h << 5) + transactionType.hashCode();
    h += (h << 5) + transactionNameTemplate.hashCode();
    h += (h << 5) + transactionUserTemplate.hashCode();
    h += (h << 5) + transactionAttributeTemplates.hashCode();
    h += (h << 5) + Objects.hashCode(transactionSlowThresholdMillis);
    h += (h << 5) + Booleans.hashCode(transactionOuter);
    h += (h << 5) + traceEntryMessageTemplate.hashCode();
    h += (h << 5) + Objects.hashCode(traceEntryStackThresholdMillis);
    h += (h << 5) + Booleans.hashCode(traceEntryCaptureSelfNested);
    h += (h << 5) + timerName.hashCode();
    h += (h << 5) + enabledProperty.hashCode();
    h += (h << 5) + traceEntryEnabledProperty.hashCode();
    h += (h << 5) + version.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code InstrumentationConfigDto} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("InstrumentationConfigDto")
        .omitNullValues()
        .add("className", className)
        .add("classAnnotation", classAnnotation)
        .add("subTypeRestriction", subTypeRestriction)
        .add("superTypeRestriction", superTypeRestriction)
        .add("methodDeclaringClassName", methodDeclaringClassName)
        .add("methodName", methodName)
        .add("methodAnnotation", methodAnnotation)
        .add("methodParameterTypes", methodParameterTypes)
        .add("methodReturnType", methodReturnType)
        .add("methodModifiers", methodModifiers)
        .add("nestingGroup", nestingGroup)
        .add("order", order)
        .add("captureKind", captureKind)
        .add("transactionType", transactionType)
        .add("transactionNameTemplate", transactionNameTemplate)
        .add("transactionUserTemplate", transactionUserTemplate)
        .add("transactionAttributeTemplates", transactionAttributeTemplates)
        .add("transactionSlowThresholdMillis", transactionSlowThresholdMillis)
        .add("transactionOuter", transactionOuter)
        .add("traceEntryMessageTemplate", traceEntryMessageTemplate)
        .add("traceEntryStackThresholdMillis", traceEntryStackThresholdMillis)
        .add("traceEntryCaptureSelfNested", traceEntryCaptureSelfNested)
        .add("timerName", timerName)
        .add("enabledProperty", enabledProperty)
        .add("traceEntryEnabledProperty", traceEntryEnabledProperty)
        .add("version", version.orNull())
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends InstrumentationConfigJsonService.InstrumentationConfigDto {
    @Nullable String className;
    @Nullable String classAnnotation;
    @Nullable String subTypeRestriction;
    @Nullable String superTypeRestriction;
    @Nullable String methodDeclaringClassName;
    @Nullable String methodName;
    @Nullable String methodAnnotation;
    ImmutableList<String> methodParameterTypes = ImmutableList.of();
    @Nullable String methodReturnType;
    ImmutableList<AgentConfigOuterClass.AgentConfig.InstrumentationConfig.MethodModifier> methodModifiers = ImmutableList.of();
    @Nullable String nestingGroup;
    int order;
    boolean orderIsSet;
    @Nullable AgentConfigOuterClass.AgentConfig.InstrumentationConfig.CaptureKind captureKind;
    @Nullable String transactionType;
    @Nullable String transactionNameTemplate;
    @Nullable String transactionUserTemplate;
    @Nullable Map<String, String> transactionAttributeTemplates;
    @Nullable Integer transactionSlowThresholdMillis;
    boolean transactionOuter;
    boolean transactionOuterIsSet;
    @Nullable String traceEntryMessageTemplate;
    @Nullable Integer traceEntryStackThresholdMillis;
    boolean traceEntryCaptureSelfNested;
    boolean traceEntryCaptureSelfNestedIsSet;
    @Nullable String timerName;
    @Nullable String enabledProperty;
    @Nullable String traceEntryEnabledProperty;
    Optional<String> version = Optional.absent();
    @JsonProperty("className")
    public void setClassName(String className) {
      this.className = className;
    }
    @JsonProperty("classAnnotation")
    public void setClassAnnotation(String classAnnotation) {
      this.classAnnotation = classAnnotation;
    }
    @JsonProperty("subTypeRestriction")
    public void setSubTypeRestriction(String subTypeRestriction) {
      this.subTypeRestriction = subTypeRestriction;
    }
    @JsonProperty("superTypeRestriction")
    public void setSuperTypeRestriction(String superTypeRestriction) {
      this.superTypeRestriction = superTypeRestriction;
    }
    @JsonProperty("methodDeclaringClassName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public void setMethodDeclaringClassName(@Nullable String methodDeclaringClassName) {
      this.methodDeclaringClassName = methodDeclaringClassName;
    }
    @JsonProperty("methodName")
    public void setMethodName(String methodName) {
      this.methodName = methodName;
    }
    @JsonProperty("methodAnnotation")
    public void setMethodAnnotation(String methodAnnotation) {
      this.methodAnnotation = methodAnnotation;
    }
    @JsonProperty("methodParameterTypes")
    public void setMethodParameterTypes(ImmutableList<String> methodParameterTypes) {
      this.methodParameterTypes = methodParameterTypes;
    }
    @JsonProperty("methodReturnType")
    public void setMethodReturnType(String methodReturnType) {
      this.methodReturnType = methodReturnType;
    }
    @JsonProperty("methodModifiers")
    public void setMethodModifiers(ImmutableList<AgentConfigOuterClass.AgentConfig.InstrumentationConfig.MethodModifier> methodModifiers) {
      this.methodModifiers = methodModifiers;
    }
    @JsonProperty("nestingGroup")
    public void setNestingGroup(String nestingGroup) {
      this.nestingGroup = nestingGroup;
    }
    @JsonProperty("order")
    public void setOrder(int order) {
      this.order = order;
      this.orderIsSet = true;
    }
    @JsonProperty("captureKind")
    public void setCaptureKind(AgentConfigOuterClass.AgentConfig.InstrumentationConfig.CaptureKind captureKind) {
      this.captureKind = captureKind;
    }
    @JsonProperty("transactionType")
    public void setTransactionType(String transactionType) {
      this.transactionType = transactionType;
    }
    @JsonProperty("transactionNameTemplate")
    public void setTransactionNameTemplate(String transactionNameTemplate) {
      this.transactionNameTemplate = transactionNameTemplate;
    }
    @JsonProperty("transactionUserTemplate")
    public void setTransactionUserTemplate(String transactionUserTemplate) {
      this.transactionUserTemplate = transactionUserTemplate;
    }
    @JsonProperty("transactionAttributeTemplates")
    public void setTransactionAttributeTemplates(Map<String, String> transactionAttributeTemplates) {
      this.transactionAttributeTemplates = transactionAttributeTemplates;
    }
    @JsonProperty("transactionSlowThresholdMillis")
    public void setTransactionSlowThresholdMillis(@Nullable Integer transactionSlowThresholdMillis) {
      this.transactionSlowThresholdMillis = transactionSlowThresholdMillis;
    }
    @JsonProperty("transactionOuter")
    public void setTransactionOuter(boolean transactionOuter) {
      this.transactionOuter = transactionOuter;
      this.transactionOuterIsSet = true;
    }
    @JsonProperty("traceEntryMessageTemplate")
    public void setTraceEntryMessageTemplate(String traceEntryMessageTemplate) {
      this.traceEntryMessageTemplate = traceEntryMessageTemplate;
    }
    @JsonProperty("traceEntryStackThresholdMillis")
    public void setTraceEntryStackThresholdMillis(@Nullable Integer traceEntryStackThresholdMillis) {
      this.traceEntryStackThresholdMillis = traceEntryStackThresholdMillis;
    }
    @JsonProperty("traceEntryCaptureSelfNested")
    public void setTraceEntryCaptureSelfNested(boolean traceEntryCaptureSelfNested) {
      this.traceEntryCaptureSelfNested = traceEntryCaptureSelfNested;
      this.traceEntryCaptureSelfNestedIsSet = true;
    }
    @JsonProperty("timerName")
    public void setTimerName(String timerName) {
      this.timerName = timerName;
    }
    @JsonProperty("enabledProperty")
    public void setEnabledProperty(String enabledProperty) {
      this.enabledProperty = enabledProperty;
    }
    @JsonProperty("traceEntryEnabledProperty")
    public void setTraceEntryEnabledProperty(String traceEntryEnabledProperty) {
      this.traceEntryEnabledProperty = traceEntryEnabledProperty;
    }
    @JsonProperty("version")
    public void setVersion(Optional<String> version) {
      this.version = version;
    }
    @Override
    String className() { throw new UnsupportedOperationException(); }
    @Override
    String classAnnotation() { throw new UnsupportedOperationException(); }
    @Override
    String subTypeRestriction() { throw new UnsupportedOperationException(); }
    @Override
    String superTypeRestriction() { throw new UnsupportedOperationException(); }
    @Override
    String methodDeclaringClassName() { throw new UnsupportedOperationException(); }
    @Override
    String methodName() { throw new UnsupportedOperationException(); }
    @Override
    String methodAnnotation() { throw new UnsupportedOperationException(); }
    @Override
    ImmutableList<String> methodParameterTypes() { throw new UnsupportedOperationException(); }
    @Override
    String methodReturnType() { throw new UnsupportedOperationException(); }
    @Override
    ImmutableList<AgentConfigOuterClass.AgentConfig.InstrumentationConfig.MethodModifier> methodModifiers() { throw new UnsupportedOperationException(); }
    @Override
    String nestingGroup() { throw new UnsupportedOperationException(); }
    @Override
    int order() { throw new UnsupportedOperationException(); }
    @Override
    AgentConfigOuterClass.AgentConfig.InstrumentationConfig.CaptureKind captureKind() { throw new UnsupportedOperationException(); }
    @Override
    String transactionType() { throw new UnsupportedOperationException(); }
    @Override
    String transactionNameTemplate() { throw new UnsupportedOperationException(); }
    @Override
    String transactionUserTemplate() { throw new UnsupportedOperationException(); }
    @Override
    Map<String, String> transactionAttributeTemplates() { throw new UnsupportedOperationException(); }
    @Override
    Integer transactionSlowThresholdMillis() { throw new UnsupportedOperationException(); }
    @Override
    boolean transactionOuter() { throw new UnsupportedOperationException(); }
    @Override
    String traceEntryMessageTemplate() { throw new UnsupportedOperationException(); }
    @Override
    Integer traceEntryStackThresholdMillis() { throw new UnsupportedOperationException(); }
    @Override
    boolean traceEntryCaptureSelfNested() { throw new UnsupportedOperationException(); }
    @Override
    String timerName() { throw new UnsupportedOperationException(); }
    @Override
    String enabledProperty() { throw new UnsupportedOperationException(); }
    @Override
    String traceEntryEnabledProperty() { throw new UnsupportedOperationException(); }
    @Override
    Optional<String> version() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableInstrumentationConfigDto fromJson(Json json) {
    ImmutableInstrumentationConfigDto.Builder builder = ImmutableInstrumentationConfigDto.builder();
    if (json.className != null) {
      builder.className(json.className);
    }
    if (json.classAnnotation != null) {
      builder.classAnnotation(json.classAnnotation);
    }
    if (json.subTypeRestriction != null) {
      builder.subTypeRestriction(json.subTypeRestriction);
    }
    if (json.superTypeRestriction != null) {
      builder.superTypeRestriction(json.superTypeRestriction);
    }
    if (json.methodDeclaringClassName != null) {
      builder.methodDeclaringClassName(json.methodDeclaringClassName);
    }
    if (json.methodName != null) {
      builder.methodName(json.methodName);
    }
    if (json.methodAnnotation != null) {
      builder.methodAnnotation(json.methodAnnotation);
    }
    if (json.methodParameterTypes != null) {
      builder.addAllMethodParameterTypes(json.methodParameterTypes);
    }
    if (json.methodReturnType != null) {
      builder.methodReturnType(json.methodReturnType);
    }
    if (json.methodModifiers != null) {
      builder.addAllMethodModifiers(json.methodModifiers);
    }
    if (json.nestingGroup != null) {
      builder.nestingGroup(json.nestingGroup);
    }
    if (json.orderIsSet) {
      builder.order(json.order);
    }
    if (json.captureKind != null) {
      builder.captureKind(json.captureKind);
    }
    if (json.transactionType != null) {
      builder.transactionType(json.transactionType);
    }
    if (json.transactionNameTemplate != null) {
      builder.transactionNameTemplate(json.transactionNameTemplate);
    }
    if (json.transactionUserTemplate != null) {
      builder.transactionUserTemplate(json.transactionUserTemplate);
    }
    if (json.transactionAttributeTemplates != null) {
      builder.putAllTransactionAttributeTemplates(json.transactionAttributeTemplates);
    }
    if (json.transactionSlowThresholdMillis != null) {
      builder.transactionSlowThresholdMillis(json.transactionSlowThresholdMillis);
    }
    if (json.transactionOuterIsSet) {
      builder.transactionOuter(json.transactionOuter);
    }
    if (json.traceEntryMessageTemplate != null) {
      builder.traceEntryMessageTemplate(json.traceEntryMessageTemplate);
    }
    if (json.traceEntryStackThresholdMillis != null) {
      builder.traceEntryStackThresholdMillis(json.traceEntryStackThresholdMillis);
    }
    if (json.traceEntryCaptureSelfNestedIsSet) {
      builder.traceEntryCaptureSelfNested(json.traceEntryCaptureSelfNested);
    }
    if (json.timerName != null) {
      builder.timerName(json.timerName);
    }
    if (json.enabledProperty != null) {
      builder.enabledProperty(json.enabledProperty);
    }
    if (json.traceEntryEnabledProperty != null) {
      builder.traceEntryEnabledProperty(json.traceEntryEnabledProperty);
    }
    if (json.version != null) {
      builder.version(json.version);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link InstrumentationConfigJsonService.InstrumentationConfigDto} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable InstrumentationConfigDto instance
   */
  public static ImmutableInstrumentationConfigDto copyOf(InstrumentationConfigJsonService.InstrumentationConfigDto instance) {
    if (instance instanceof ImmutableInstrumentationConfigDto) {
      return (ImmutableInstrumentationConfigDto) instance;
    }
    return ImmutableInstrumentationConfigDto.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableInstrumentationConfigDto ImmutableInstrumentationConfigDto}.
   * @return A new ImmutableInstrumentationConfigDto builder
   */
  public static ImmutableInstrumentationConfigDto.Builder builder() {
    return new ImmutableInstrumentationConfigDto.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableInstrumentationConfigDto ImmutableInstrumentationConfigDto}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_CLASS_NAME = 0x1L;
    private static final long INIT_BIT_CLASS_ANNOTATION = 0x2L;
    private static final long INIT_BIT_SUB_TYPE_RESTRICTION = 0x4L;
    private static final long INIT_BIT_SUPER_TYPE_RESTRICTION = 0x8L;
    private static final long INIT_BIT_METHOD_NAME = 0x10L;
    private static final long INIT_BIT_METHOD_ANNOTATION = 0x20L;
    private static final long INIT_BIT_METHOD_RETURN_TYPE = 0x40L;
    private static final long INIT_BIT_NESTING_GROUP = 0x80L;
    private static final long INIT_BIT_ORDER = 0x100L;
    private static final long INIT_BIT_CAPTURE_KIND = 0x200L;
    private static final long INIT_BIT_TRANSACTION_TYPE = 0x400L;
    private static final long INIT_BIT_TRANSACTION_NAME_TEMPLATE = 0x800L;
    private static final long INIT_BIT_TRANSACTION_USER_TEMPLATE = 0x1000L;
    private static final long INIT_BIT_TRANSACTION_OUTER = 0x2000L;
    private static final long INIT_BIT_TRACE_ENTRY_MESSAGE_TEMPLATE = 0x4000L;
    private static final long INIT_BIT_TRACE_ENTRY_CAPTURE_SELF_NESTED = 0x8000L;
    private static final long INIT_BIT_TIMER_NAME = 0x10000L;
    private static final long INIT_BIT_ENABLED_PROPERTY = 0x20000L;
    private static final long INIT_BIT_TRACE_ENTRY_ENABLED_PROPERTY = 0x40000L;
    private long initBits = 0x7ffffL;

    private @Nullable String className;
    private @Nullable String classAnnotation;
    private @Nullable String subTypeRestriction;
    private @Nullable String superTypeRestriction;
    private @Nullable String methodDeclaringClassName;
    private @Nullable String methodName;
    private @Nullable String methodAnnotation;
    private ImmutableList.Builder<String> methodParameterTypes = ImmutableList.builder();
    private @Nullable String methodReturnType;
    private ImmutableList.Builder<AgentConfigOuterClass.AgentConfig.InstrumentationConfig.MethodModifier> methodModifiers = ImmutableList.builder();
    private @Nullable String nestingGroup;
    private int order;
    private @Nullable AgentConfigOuterClass.AgentConfig.InstrumentationConfig.CaptureKind captureKind;
    private @Nullable String transactionType;
    private @Nullable String transactionNameTemplate;
    private @Nullable String transactionUserTemplate;
    private ImmutableMap.Builder<String, String> transactionAttributeTemplates = ImmutableMap.builder();
    private @Nullable Integer transactionSlowThresholdMillis;
    private boolean transactionOuter;
    private @Nullable String traceEntryMessageTemplate;
    private @Nullable Integer traceEntryStackThresholdMillis;
    private boolean traceEntryCaptureSelfNested;
    private @Nullable String timerName;
    private @Nullable String enabledProperty;
    private @Nullable String traceEntryEnabledProperty;
    private Optional<String> version = Optional.absent();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code InstrumentationConfigDto} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(InstrumentationConfigJsonService.InstrumentationConfigDto instance) {
      Preconditions.checkNotNull(instance, "instance");
      className(instance.className());
      classAnnotation(instance.classAnnotation());
      subTypeRestriction(instance.subTypeRestriction());
      superTypeRestriction(instance.superTypeRestriction());
      @Nullable String methodDeclaringClassNameValue = instance.methodDeclaringClassName();
      if (methodDeclaringClassNameValue != null) {
        methodDeclaringClassName(methodDeclaringClassNameValue);
      }
      methodName(instance.methodName());
      methodAnnotation(instance.methodAnnotation());
      addAllMethodParameterTypes(instance.methodParameterTypes());
      methodReturnType(instance.methodReturnType());
      addAllMethodModifiers(instance.methodModifiers());
      nestingGroup(instance.nestingGroup());
      order(instance.order());
      captureKind(instance.captureKind());
      transactionType(instance.transactionType());
      transactionNameTemplate(instance.transactionNameTemplate());
      transactionUserTemplate(instance.transactionUserTemplate());
      putAllTransactionAttributeTemplates(instance.transactionAttributeTemplates());
      @Nullable Integer transactionSlowThresholdMillisValue = instance.transactionSlowThresholdMillis();
      if (transactionSlowThresholdMillisValue != null) {
        transactionSlowThresholdMillis(transactionSlowThresholdMillisValue);
      }
      transactionOuter(instance.transactionOuter());
      traceEntryMessageTemplate(instance.traceEntryMessageTemplate());
      @Nullable Integer traceEntryStackThresholdMillisValue = instance.traceEntryStackThresholdMillis();
      if (traceEntryStackThresholdMillisValue != null) {
        traceEntryStackThresholdMillis(traceEntryStackThresholdMillisValue);
      }
      traceEntryCaptureSelfNested(instance.traceEntryCaptureSelfNested());
      timerName(instance.timerName());
      enabledProperty(instance.enabledProperty());
      traceEntryEnabledProperty(instance.traceEntryEnabledProperty());
      Optional<String> versionOptional = instance.version();
      if (versionOptional.isPresent()) {
        version(versionOptional);
      }
      return this;
    }

    /**
     * Initializes the value for the {@link InstrumentationConfigJsonService.InstrumentationConfigDto#className() className} attribute.
     * @param className The value for className 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder className(String className) {
      this.className = Preconditions.checkNotNull(className, "className");
      initBits &= ~INIT_BIT_CLASS_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link InstrumentationConfigJsonService.InstrumentationConfigDto#classAnnotation() classAnnotation} attribute.
     * @param classAnnotation The value for classAnnotation 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder classAnnotation(String classAnnotation) {
      this.classAnnotation = Preconditions.checkNotNull(classAnnotation, "classAnnotation");
      initBits &= ~INIT_BIT_CLASS_ANNOTATION;
      return this;
    }

    /**
     * Initializes the value for the {@link InstrumentationConfigJsonService.InstrumentationConfigDto#subTypeRestriction() subTypeRestriction} attribute.
     * @param subTypeRestriction The value for subTypeRestriction 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder subTypeRestriction(String subTypeRestriction) {
      this.subTypeRestriction = Preconditions.checkNotNull(subTypeRestriction, "subTypeRestriction");
      initBits &= ~INIT_BIT_SUB_TYPE_RESTRICTION;
      return this;
    }

    /**
     * Initializes the value for the {@link InstrumentationConfigJsonService.InstrumentationConfigDto#superTypeRestriction() superTypeRestriction} attribute.
     * @param superTypeRestriction The value for superTypeRestriction 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder superTypeRestriction(String superTypeRestriction) {
      this.superTypeRestriction = Preconditions.checkNotNull(superTypeRestriction, "superTypeRestriction");
      initBits &= ~INIT_BIT_SUPER_TYPE_RESTRICTION;
      return this;
    }

    /**
     * Initializes the value for the {@link InstrumentationConfigJsonService.InstrumentationConfigDto#methodDeclaringClassName() methodDeclaringClassName} attribute.
     * @param methodDeclaringClassName The value for methodDeclaringClassName (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @Deprecated
    public final Builder methodDeclaringClassName(@Nullable String methodDeclaringClassName) {
      this.methodDeclaringClassName = methodDeclaringClassName;
      return this;
    }

    /**
     * Initializes the value for the {@link InstrumentationConfigJsonService.InstrumentationConfigDto#methodName() methodName} attribute.
     * @param methodName The value for methodName 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder methodName(String methodName) {
      this.methodName = Preconditions.checkNotNull(methodName, "methodName");
      initBits &= ~INIT_BIT_METHOD_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link InstrumentationConfigJsonService.InstrumentationConfigDto#methodAnnotation() methodAnnotation} attribute.
     * @param methodAnnotation The value for methodAnnotation 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder methodAnnotation(String methodAnnotation) {
      this.methodAnnotation = Preconditions.checkNotNull(methodAnnotation, "methodAnnotation");
      initBits &= ~INIT_BIT_METHOD_ANNOTATION;
      return this;
    }

    /**
     * Adds one element to {@link InstrumentationConfigJsonService.InstrumentationConfigDto#methodParameterTypes() methodParameterTypes} list.
     * @param element A methodParameterTypes element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addMethodParameterTypes(String element) {
      this.methodParameterTypes.add(element);
      return this;
    }

    /**
     * Adds elements to {@link InstrumentationConfigJsonService.InstrumentationConfigDto#methodParameterTypes() methodParameterTypes} list.
     * @param elements An array of methodParameterTypes elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addMethodParameterTypes(String... elements) {
      this.methodParameterTypes.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link InstrumentationConfigJsonService.InstrumentationConfigDto#methodParameterTypes() methodParameterTypes} list.
     * @param elements An iterable of methodParameterTypes elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder methodParameterTypes(Iterable<String> elements) {
      this.methodParameterTypes = ImmutableList.builder();
      return addAllMethodParameterTypes(elements);
    }

    /**
     * Adds elements to {@link InstrumentationConfigJsonService.InstrumentationConfigDto#methodParameterTypes() methodParameterTypes} list.
     * @param elements An iterable of methodParameterTypes elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllMethodParameterTypes(Iterable<String> elements) {
      this.methodParameterTypes.addAll(elements);
      return this;
    }

    /**
     * Initializes the value for the {@link InstrumentationConfigJsonService.InstrumentationConfigDto#methodReturnType() methodReturnType} attribute.
     * @param methodReturnType The value for methodReturnType 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder methodReturnType(String methodReturnType) {
      this.methodReturnType = Preconditions.checkNotNull(methodReturnType, "methodReturnType");
      initBits &= ~INIT_BIT_METHOD_RETURN_TYPE;
      return this;
    }

    /**
     * Adds one element to {@link InstrumentationConfigJsonService.InstrumentationConfigDto#methodModifiers() methodModifiers} list.
     * @param element A methodModifiers element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addMethodModifiers(AgentConfigOuterClass.AgentConfig.InstrumentationConfig.MethodModifier element) {
      this.methodModifiers.add(element);
      return this;
    }

    /**
     * Adds elements to {@link InstrumentationConfigJsonService.InstrumentationConfigDto#methodModifiers() methodModifiers} list.
     * @param elements An array of methodModifiers elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addMethodModifiers(AgentConfigOuterClass.AgentConfig.InstrumentationConfig.MethodModifier... elements) {
      this.methodModifiers.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link InstrumentationConfigJsonService.InstrumentationConfigDto#methodModifiers() methodModifiers} list.
     * @param elements An iterable of methodModifiers elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder methodModifiers(Iterable<? extends AgentConfigOuterClass.AgentConfig.InstrumentationConfig.MethodModifier> elements) {
      this.methodModifiers = ImmutableList.builder();
      return addAllMethodModifiers(elements);
    }

    /**
     * Adds elements to {@link InstrumentationConfigJsonService.InstrumentationConfigDto#methodModifiers() methodModifiers} list.
     * @param elements An iterable of methodModifiers elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllMethodModifiers(Iterable<? extends AgentConfigOuterClass.AgentConfig.InstrumentationConfig.MethodModifier> elements) {
      this.methodModifiers.addAll(elements);
      return this;
    }

    /**
     * Initializes the value for the {@link InstrumentationConfigJsonService.InstrumentationConfigDto#nestingGroup() nestingGroup} attribute.
     * @param nestingGroup The value for nestingGroup 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder nestingGroup(String nestingGroup) {
      this.nestingGroup = Preconditions.checkNotNull(nestingGroup, "nestingGroup");
      initBits &= ~INIT_BIT_NESTING_GROUP;
      return this;
    }

    /**
     * Initializes the value for the {@link InstrumentationConfigJsonService.InstrumentationConfigDto#order() order} attribute.
     * @param order The value for order 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder order(int order) {
      this.order = order;
      initBits &= ~INIT_BIT_ORDER;
      return this;
    }

    /**
     * Initializes the value for the {@link InstrumentationConfigJsonService.InstrumentationConfigDto#captureKind() captureKind} attribute.
     * @param captureKind The value for captureKind 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder captureKind(AgentConfigOuterClass.AgentConfig.InstrumentationConfig.CaptureKind captureKind) {
      this.captureKind = Preconditions.checkNotNull(captureKind, "captureKind");
      initBits &= ~INIT_BIT_CAPTURE_KIND;
      return this;
    }

    /**
     * Initializes the value for the {@link InstrumentationConfigJsonService.InstrumentationConfigDto#transactionType() transactionType} attribute.
     * @param transactionType The value for transactionType 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder transactionType(String transactionType) {
      this.transactionType = Preconditions.checkNotNull(transactionType, "transactionType");
      initBits &= ~INIT_BIT_TRANSACTION_TYPE;
      return this;
    }

    /**
     * Initializes the value for the {@link InstrumentationConfigJsonService.InstrumentationConfigDto#transactionNameTemplate() transactionNameTemplate} attribute.
     * @param transactionNameTemplate The value for transactionNameTemplate 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder transactionNameTemplate(String transactionNameTemplate) {
      this.transactionNameTemplate = Preconditions.checkNotNull(transactionNameTemplate, "transactionNameTemplate");
      initBits &= ~INIT_BIT_TRANSACTION_NAME_TEMPLATE;
      return this;
    }

    /**
     * Initializes the value for the {@link InstrumentationConfigJsonService.InstrumentationConfigDto#transactionUserTemplate() transactionUserTemplate} attribute.
     * @param transactionUserTemplate The value for transactionUserTemplate 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder transactionUserTemplate(String transactionUserTemplate) {
      this.transactionUserTemplate = Preconditions.checkNotNull(transactionUserTemplate, "transactionUserTemplate");
      initBits &= ~INIT_BIT_TRANSACTION_USER_TEMPLATE;
      return this;
    }

    /**
     * Put one entry to the {@link InstrumentationConfigJsonService.InstrumentationConfigDto#transactionAttributeTemplates() transactionAttributeTemplates} map.
     * @param key The key in the transactionAttributeTemplates map
     * @param value The associated value in the transactionAttributeTemplates map
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder putTransactionAttributeTemplates(String key, String value) {
      this.transactionAttributeTemplates.put(key, value);
      return this;
    }

    /**
     * Put one entry to the {@link InstrumentationConfigJsonService.InstrumentationConfigDto#transactionAttributeTemplates() transactionAttributeTemplates} map. Nulls are not permitted
     * @param entry The key and value entry
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder putTransactionAttributeTemplates(Map.Entry<String, ? extends String> entry) {
      this.transactionAttributeTemplates.put(entry);
      return this;
    }

    /**
     * Sets or replaces all mappings from the specified map as entries for the {@link InstrumentationConfigJsonService.InstrumentationConfigDto#transactionAttributeTemplates() transactionAttributeTemplates} map. Nulls are not permitted
     * @param transactionAttributeTemplates The entries that will be added to the transactionAttributeTemplates map
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder transactionAttributeTemplates(Map<String, ? extends String> transactionAttributeTemplates) {
      this.transactionAttributeTemplates = ImmutableMap.builder();
      return putAllTransactionAttributeTemplates(transactionAttributeTemplates);
    }

    /**
     * Put all mappings from the specified map as entries to {@link InstrumentationConfigJsonService.InstrumentationConfigDto#transactionAttributeTemplates() transactionAttributeTemplates} map. Nulls are not permitted
     * @param transactionAttributeTemplates The entries that will be added to the transactionAttributeTemplates map
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder putAllTransactionAttributeTemplates(Map<String, ? extends String> transactionAttributeTemplates) {
      this.transactionAttributeTemplates.putAll(transactionAttributeTemplates);
      return this;
    }

    /**
     * Initializes the value for the {@link InstrumentationConfigJsonService.InstrumentationConfigDto#transactionSlowThresholdMillis() transactionSlowThresholdMillis} attribute.
     * @param transactionSlowThresholdMillis The value for transactionSlowThresholdMillis (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder transactionSlowThresholdMillis(@Nullable Integer transactionSlowThresholdMillis) {
      this.transactionSlowThresholdMillis = transactionSlowThresholdMillis;
      return this;
    }

    /**
     * Initializes the value for the {@link InstrumentationConfigJsonService.InstrumentationConfigDto#transactionOuter() transactionOuter} attribute.
     * @param transactionOuter The value for transactionOuter 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder transactionOuter(boolean transactionOuter) {
      this.transactionOuter = transactionOuter;
      initBits &= ~INIT_BIT_TRANSACTION_OUTER;
      return this;
    }

    /**
     * Initializes the value for the {@link InstrumentationConfigJsonService.InstrumentationConfigDto#traceEntryMessageTemplate() traceEntryMessageTemplate} attribute.
     * @param traceEntryMessageTemplate The value for traceEntryMessageTemplate 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder traceEntryMessageTemplate(String traceEntryMessageTemplate) {
      this.traceEntryMessageTemplate = Preconditions.checkNotNull(traceEntryMessageTemplate, "traceEntryMessageTemplate");
      initBits &= ~INIT_BIT_TRACE_ENTRY_MESSAGE_TEMPLATE;
      return this;
    }

    /**
     * Initializes the value for the {@link InstrumentationConfigJsonService.InstrumentationConfigDto#traceEntryStackThresholdMillis() traceEntryStackThresholdMillis} attribute.
     * @param traceEntryStackThresholdMillis The value for traceEntryStackThresholdMillis (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder traceEntryStackThresholdMillis(@Nullable Integer traceEntryStackThresholdMillis) {
      this.traceEntryStackThresholdMillis = traceEntryStackThresholdMillis;
      return this;
    }

    /**
     * Initializes the value for the {@link InstrumentationConfigJsonService.InstrumentationConfigDto#traceEntryCaptureSelfNested() traceEntryCaptureSelfNested} attribute.
     * @param traceEntryCaptureSelfNested The value for traceEntryCaptureSelfNested 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder traceEntryCaptureSelfNested(boolean traceEntryCaptureSelfNested) {
      this.traceEntryCaptureSelfNested = traceEntryCaptureSelfNested;
      initBits &= ~INIT_BIT_TRACE_ENTRY_CAPTURE_SELF_NESTED;
      return this;
    }

    /**
     * Initializes the value for the {@link InstrumentationConfigJsonService.InstrumentationConfigDto#timerName() timerName} attribute.
     * @param timerName The value for timerName 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder timerName(String timerName) {
      this.timerName = Preconditions.checkNotNull(timerName, "timerName");
      initBits &= ~INIT_BIT_TIMER_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link InstrumentationConfigJsonService.InstrumentationConfigDto#enabledProperty() enabledProperty} attribute.
     * @param enabledProperty The value for enabledProperty 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder enabledProperty(String enabledProperty) {
      this.enabledProperty = Preconditions.checkNotNull(enabledProperty, "enabledProperty");
      initBits &= ~INIT_BIT_ENABLED_PROPERTY;
      return this;
    }

    /**
     * Initializes the value for the {@link InstrumentationConfigJsonService.InstrumentationConfigDto#traceEntryEnabledProperty() traceEntryEnabledProperty} attribute.
     * @param traceEntryEnabledProperty The value for traceEntryEnabledProperty 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder traceEntryEnabledProperty(String traceEntryEnabledProperty) {
      this.traceEntryEnabledProperty = Preconditions.checkNotNull(traceEntryEnabledProperty, "traceEntryEnabledProperty");
      initBits &= ~INIT_BIT_TRACE_ENTRY_ENABLED_PROPERTY;
      return this;
    }

    /**
     * Initializes the optional value {@link InstrumentationConfigJsonService.InstrumentationConfigDto#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    public final Builder version(String version) {
      this.version = Optional.of(version);
      return this;
    }

    /**
     * Initializes the optional value {@link InstrumentationConfigJsonService.InstrumentationConfigDto#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    @SuppressWarnings("unchecked") // safe covariant cast
    public final Builder version(Optional<String> version) {
      this.version = (Optional<String>) version;
      return this;
    }

    /**
     * Builds a new {@link ImmutableInstrumentationConfigDto ImmutableInstrumentationConfigDto}.
     * @return An immutable instance of InstrumentationConfigDto
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableInstrumentationConfigDto build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableInstrumentationConfigDto(
          className,
          classAnnotation,
          subTypeRestriction,
          superTypeRestriction,
          methodDeclaringClassName,
          methodName,
          methodAnnotation,
          methodParameterTypes.build(),
          methodReturnType,
          methodModifiers.build(),
          nestingGroup,
          order,
          captureKind,
          transactionType,
          transactionNameTemplate,
          transactionUserTemplate,
          transactionAttributeTemplates.build(),
          transactionSlowThresholdMillis,
          transactionOuter,
          traceEntryMessageTemplate,
          traceEntryStackThresholdMillis,
          traceEntryCaptureSelfNested,
          timerName,
          enabledProperty,
          traceEntryEnabledProperty,
          version);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_CLASS_NAME) != 0) attributes.add("className");
      if ((initBits & INIT_BIT_CLASS_ANNOTATION) != 0) attributes.add("classAnnotation");
      if ((initBits & INIT_BIT_SUB_TYPE_RESTRICTION) != 0) attributes.add("subTypeRestriction");
      if ((initBits & INIT_BIT_SUPER_TYPE_RESTRICTION) != 0) attributes.add("superTypeRestriction");
      if ((initBits & INIT_BIT_METHOD_NAME) != 0) attributes.add("methodName");
      if ((initBits & INIT_BIT_METHOD_ANNOTATION) != 0) attributes.add("methodAnnotation");
      if ((initBits & INIT_BIT_METHOD_RETURN_TYPE) != 0) attributes.add("methodReturnType");
      if ((initBits & INIT_BIT_NESTING_GROUP) != 0) attributes.add("nestingGroup");
      if ((initBits & INIT_BIT_ORDER) != 0) attributes.add("order");
      if ((initBits & INIT_BIT_CAPTURE_KIND) != 0) attributes.add("captureKind");
      if ((initBits & INIT_BIT_TRANSACTION_TYPE) != 0) attributes.add("transactionType");
      if ((initBits & INIT_BIT_TRANSACTION_NAME_TEMPLATE) != 0) attributes.add("transactionNameTemplate");
      if ((initBits & INIT_BIT_TRANSACTION_USER_TEMPLATE) != 0) attributes.add("transactionUserTemplate");
      if ((initBits & INIT_BIT_TRANSACTION_OUTER) != 0) attributes.add("transactionOuter");
      if ((initBits & INIT_BIT_TRACE_ENTRY_MESSAGE_TEMPLATE) != 0) attributes.add("traceEntryMessageTemplate");
      if ((initBits & INIT_BIT_TRACE_ENTRY_CAPTURE_SELF_NESTED) != 0) attributes.add("traceEntryCaptureSelfNested");
      if ((initBits & INIT_BIT_TIMER_NAME) != 0) attributes.add("timerName");
      if ((initBits & INIT_BIT_ENABLED_PROPERTY) != 0) attributes.add("enabledProperty");
      if ((initBits & INIT_BIT_TRACE_ENTRY_ENABLED_PROPERTY) != 0) attributes.add("traceEntryEnabledProperty");
      return "Cannot build InstrumentationConfigDto, some of required attributes are not set " + attributes;
    }
  }
}
