package org.glowroot.agent.config;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonIgnore;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonInclude;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Objects;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import org.glowroot.agent.shaded.google.common.collect.ImmutableList;
import org.glowroot.agent.shaded.google.common.collect.ImmutableMap;
import org.glowroot.agent.shaded.google.common.collect.Lists;
import org.glowroot.agent.shaded.google.common.primitives.Booleans;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.glowroot.agent.shaded.glowroot.wire.api.model.AgentConfigOuterClass;

/**
 * Immutable implementation of {@link InstrumentationConfig}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableInstrumentationConfig.builder()}.
 */
@SuppressWarnings({"all", "deprecation"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "InstrumentationConfig"})
@Immutable
public final class ImmutableInstrumentationConfig extends InstrumentationConfig {
  private final String className;
  private final String classAnnotation;
  private final String subTypeRestriction;
  private final String superTypeRestriction;
  private final String methodDeclaringClassName;
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
  private final boolean isTimerOrGreater;
  private final boolean isTraceEntryOrGreater;
  private final boolean isTransaction;
  private final ImmutableList<String> validationErrors;

  private ImmutableInstrumentationConfig(ImmutableInstrumentationConfig.Builder builder) {
    this.methodParameterTypes = builder.methodParameterTypes.build();
    this.methodModifiers = builder.methodModifiers.build();
    this.captureKind = builder.captureKind;
    this.transactionAttributeTemplates = builder.transactionAttributeTemplates.build();
    this.transactionSlowThresholdMillis = builder.transactionSlowThresholdMillis;
    this.traceEntryStackThresholdMillis = builder.traceEntryStackThresholdMillis;
    if (builder.className != null) {
      initShim.className(builder.className);
    }
    if (builder.classAnnotation != null) {
      initShim.classAnnotation(builder.classAnnotation);
    }
    if (builder.subTypeRestriction != null) {
      initShim.subTypeRestriction(builder.subTypeRestriction);
    }
    if (builder.superTypeRestriction != null) {
      initShim.superTypeRestriction(builder.superTypeRestriction);
    }
    if (builder.methodDeclaringClassName != null) {
      initShim.methodDeclaringClassName(builder.methodDeclaringClassName);
    }
    if (builder.methodName != null) {
      initShim.methodName(builder.methodName);
    }
    if (builder.methodAnnotation != null) {
      initShim.methodAnnotation(builder.methodAnnotation);
    }
    if (builder.methodReturnType != null) {
      initShim.methodReturnType(builder.methodReturnType);
    }
    if (builder.nestingGroup != null) {
      initShim.nestingGroup(builder.nestingGroup);
    }
    if (builder.orderIsSet()) {
      initShim.order(builder.order);
    }
    if (builder.transactionType != null) {
      initShim.transactionType(builder.transactionType);
    }
    if (builder.transactionNameTemplate != null) {
      initShim.transactionNameTemplate(builder.transactionNameTemplate);
    }
    if (builder.transactionUserTemplate != null) {
      initShim.transactionUserTemplate(builder.transactionUserTemplate);
    }
    if (builder.transactionOuterIsSet()) {
      initShim.transactionOuter(builder.transactionOuter);
    }
    if (builder.traceEntryMessageTemplate != null) {
      initShim.traceEntryMessageTemplate(builder.traceEntryMessageTemplate);
    }
    if (builder.traceEntryCaptureSelfNestedIsSet()) {
      initShim.traceEntryCaptureSelfNested(builder.traceEntryCaptureSelfNested);
    }
    if (builder.timerName != null) {
      initShim.timerName(builder.timerName);
    }
    if (builder.enabledProperty != null) {
      initShim.enabledProperty(builder.enabledProperty);
    }
    if (builder.traceEntryEnabledProperty != null) {
      initShim.traceEntryEnabledProperty(builder.traceEntryEnabledProperty);
    }
    this.className = initShim.className();
    this.classAnnotation = initShim.classAnnotation();
    this.subTypeRestriction = initShim.subTypeRestriction();
    this.superTypeRestriction = initShim.superTypeRestriction();
    this.methodDeclaringClassName = initShim.methodDeclaringClassName();
    this.methodName = initShim.methodName();
    this.methodAnnotation = initShim.methodAnnotation();
    this.methodReturnType = initShim.methodReturnType();
    this.nestingGroup = initShim.nestingGroup();
    this.order = initShim.order();
    this.transactionType = initShim.transactionType();
    this.transactionNameTemplate = initShim.transactionNameTemplate();
    this.transactionUserTemplate = initShim.transactionUserTemplate();
    this.transactionOuter = initShim.transactionOuter();
    this.traceEntryMessageTemplate = initShim.traceEntryMessageTemplate();
    this.traceEntryCaptureSelfNested = initShim.traceEntryCaptureSelfNested();
    this.timerName = initShim.timerName();
    this.enabledProperty = initShim.enabledProperty();
    this.traceEntryEnabledProperty = initShim.traceEntryEnabledProperty();
    this.isTimerOrGreater = initShim.isTimerOrGreater();
    this.isTraceEntryOrGreater = initShim.isTraceEntryOrGreater();
    this.isTransaction = initShim.isTransaction();
    this.validationErrors = initShim.validationErrors();
    this.initShim = null;
  }

  private ImmutableInstrumentationConfig(
      String className,
      String classAnnotation,
      String subTypeRestriction,
      String superTypeRestriction,
      String methodDeclaringClassName,
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
      String traceEntryEnabledProperty) {
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
    initShim.className(this.className);
    initShim.classAnnotation(this.classAnnotation);
    initShim.subTypeRestriction(this.subTypeRestriction);
    initShim.superTypeRestriction(this.superTypeRestriction);
    initShim.methodDeclaringClassName(this.methodDeclaringClassName);
    initShim.methodName(this.methodName);
    initShim.methodAnnotation(this.methodAnnotation);
    initShim.methodReturnType(this.methodReturnType);
    initShim.nestingGroup(this.nestingGroup);
    initShim.order(this.order);
    initShim.transactionType(this.transactionType);
    initShim.transactionNameTemplate(this.transactionNameTemplate);
    initShim.transactionUserTemplate(this.transactionUserTemplate);
    initShim.transactionOuter(this.transactionOuter);
    initShim.traceEntryMessageTemplate(this.traceEntryMessageTemplate);
    initShim.traceEntryCaptureSelfNested(this.traceEntryCaptureSelfNested);
    initShim.timerName(this.timerName);
    initShim.enabledProperty(this.enabledProperty);
    initShim.traceEntryEnabledProperty(this.traceEntryEnabledProperty);
    this.isTimerOrGreater = initShim.isTimerOrGreater();
    this.isTraceEntryOrGreater = initShim.isTraceEntryOrGreater();
    this.isTransaction = initShim.isTransaction();
    this.validationErrors = initShim.validationErrors();
    this.initShim = null;
  }

  private static final int STAGE_INITIALIZING = -1;
  private static final int STAGE_UNINITIALIZED = 0;
  private static final int STAGE_INITIALIZED = 1;
  private transient volatile InitShim initShim = new InitShim();

  private final class InitShim {
    private String className;
    private int classNameBuildStage;

    String className() {
      if (classNameBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (classNameBuildStage == STAGE_UNINITIALIZED) {
        classNameBuildStage = STAGE_INITIALIZING;
        this.className = Preconditions.checkNotNull(ImmutableInstrumentationConfig.super.className(), "className");
        classNameBuildStage = STAGE_INITIALIZED;
      }
      return this.className;
    }

    void className(String className) {
      this.className = className;
      classNameBuildStage = STAGE_INITIALIZED;
    }
    private String classAnnotation;
    private int classAnnotationBuildStage;

    String classAnnotation() {
      if (classAnnotationBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (classAnnotationBuildStage == STAGE_UNINITIALIZED) {
        classAnnotationBuildStage = STAGE_INITIALIZING;
        this.classAnnotation = Preconditions.checkNotNull(ImmutableInstrumentationConfig.super.classAnnotation(), "classAnnotation");
        classAnnotationBuildStage = STAGE_INITIALIZED;
      }
      return this.classAnnotation;
    }

    void classAnnotation(String classAnnotation) {
      this.classAnnotation = classAnnotation;
      classAnnotationBuildStage = STAGE_INITIALIZED;
    }
    private String subTypeRestriction;
    private int subTypeRestrictionBuildStage;

    String subTypeRestriction() {
      if (subTypeRestrictionBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (subTypeRestrictionBuildStage == STAGE_UNINITIALIZED) {
        subTypeRestrictionBuildStage = STAGE_INITIALIZING;
        this.subTypeRestriction = Preconditions.checkNotNull(ImmutableInstrumentationConfig.super.subTypeRestriction(), "subTypeRestriction");
        subTypeRestrictionBuildStage = STAGE_INITIALIZED;
      }
      return this.subTypeRestriction;
    }

    void subTypeRestriction(String subTypeRestriction) {
      this.subTypeRestriction = subTypeRestriction;
      subTypeRestrictionBuildStage = STAGE_INITIALIZED;
    }
    private String superTypeRestriction;
    private int superTypeRestrictionBuildStage;

    String superTypeRestriction() {
      if (superTypeRestrictionBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (superTypeRestrictionBuildStage == STAGE_UNINITIALIZED) {
        superTypeRestrictionBuildStage = STAGE_INITIALIZING;
        this.superTypeRestriction = Preconditions.checkNotNull(ImmutableInstrumentationConfig.super.superTypeRestriction(), "superTypeRestriction");
        superTypeRestrictionBuildStage = STAGE_INITIALIZED;
      }
      return this.superTypeRestriction;
    }

    void superTypeRestriction(String superTypeRestriction) {
      this.superTypeRestriction = superTypeRestriction;
      superTypeRestrictionBuildStage = STAGE_INITIALIZED;
    }
    private String methodDeclaringClassName;
    private int methodDeclaringClassNameBuildStage;

    String methodDeclaringClassName() {
      if (methodDeclaringClassNameBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (methodDeclaringClassNameBuildStage == STAGE_UNINITIALIZED) {
        methodDeclaringClassNameBuildStage = STAGE_INITIALIZING;
        this.methodDeclaringClassName = Preconditions.checkNotNull(ImmutableInstrumentationConfig.super.methodDeclaringClassName(), "methodDeclaringClassName");
        methodDeclaringClassNameBuildStage = STAGE_INITIALIZED;
      }
      return this.methodDeclaringClassName;
    }

    void methodDeclaringClassName(String methodDeclaringClassName) {
      this.methodDeclaringClassName = methodDeclaringClassName;
      methodDeclaringClassNameBuildStage = STAGE_INITIALIZED;
    }
    private String methodName;
    private int methodNameBuildStage;

    String methodName() {
      if (methodNameBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (methodNameBuildStage == STAGE_UNINITIALIZED) {
        methodNameBuildStage = STAGE_INITIALIZING;
        this.methodName = Preconditions.checkNotNull(ImmutableInstrumentationConfig.super.methodName(), "methodName");
        methodNameBuildStage = STAGE_INITIALIZED;
      }
      return this.methodName;
    }

    void methodName(String methodName) {
      this.methodName = methodName;
      methodNameBuildStage = STAGE_INITIALIZED;
    }
    private String methodAnnotation;
    private int methodAnnotationBuildStage;

    String methodAnnotation() {
      if (methodAnnotationBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (methodAnnotationBuildStage == STAGE_UNINITIALIZED) {
        methodAnnotationBuildStage = STAGE_INITIALIZING;
        this.methodAnnotation = Preconditions.checkNotNull(ImmutableInstrumentationConfig.super.methodAnnotation(), "methodAnnotation");
        methodAnnotationBuildStage = STAGE_INITIALIZED;
      }
      return this.methodAnnotation;
    }

    void methodAnnotation(String methodAnnotation) {
      this.methodAnnotation = methodAnnotation;
      methodAnnotationBuildStage = STAGE_INITIALIZED;
    }
    private String methodReturnType;
    private int methodReturnTypeBuildStage;

    String methodReturnType() {
      if (methodReturnTypeBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (methodReturnTypeBuildStage == STAGE_UNINITIALIZED) {
        methodReturnTypeBuildStage = STAGE_INITIALIZING;
        this.methodReturnType = Preconditions.checkNotNull(ImmutableInstrumentationConfig.super.methodReturnType(), "methodReturnType");
        methodReturnTypeBuildStage = STAGE_INITIALIZED;
      }
      return this.methodReturnType;
    }

    void methodReturnType(String methodReturnType) {
      this.methodReturnType = methodReturnType;
      methodReturnTypeBuildStage = STAGE_INITIALIZED;
    }
    private String nestingGroup;
    private int nestingGroupBuildStage;

    String nestingGroup() {
      if (nestingGroupBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (nestingGroupBuildStage == STAGE_UNINITIALIZED) {
        nestingGroupBuildStage = STAGE_INITIALIZING;
        this.nestingGroup = Preconditions.checkNotNull(ImmutableInstrumentationConfig.super.nestingGroup(), "nestingGroup");
        nestingGroupBuildStage = STAGE_INITIALIZED;
      }
      return this.nestingGroup;
    }

    void nestingGroup(String nestingGroup) {
      this.nestingGroup = nestingGroup;
      nestingGroupBuildStage = STAGE_INITIALIZED;
    }
    private int order;
    private int orderBuildStage;

    int order() {
      if (orderBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (orderBuildStage == STAGE_UNINITIALIZED) {
        orderBuildStage = STAGE_INITIALIZING;
        this.order = ImmutableInstrumentationConfig.super.order();
        orderBuildStage = STAGE_INITIALIZED;
      }
      return this.order;
    }

    void order(int order) {
      this.order = order;
      orderBuildStage = STAGE_INITIALIZED;
    }
    private String transactionType;
    private int transactionTypeBuildStage;

    String transactionType() {
      if (transactionTypeBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (transactionTypeBuildStage == STAGE_UNINITIALIZED) {
        transactionTypeBuildStage = STAGE_INITIALIZING;
        this.transactionType = Preconditions.checkNotNull(ImmutableInstrumentationConfig.super.transactionType(), "transactionType");
        transactionTypeBuildStage = STAGE_INITIALIZED;
      }
      return this.transactionType;
    }

    void transactionType(String transactionType) {
      this.transactionType = transactionType;
      transactionTypeBuildStage = STAGE_INITIALIZED;
    }
    private String transactionNameTemplate;
    private int transactionNameTemplateBuildStage;

    String transactionNameTemplate() {
      if (transactionNameTemplateBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (transactionNameTemplateBuildStage == STAGE_UNINITIALIZED) {
        transactionNameTemplateBuildStage = STAGE_INITIALIZING;
        this.transactionNameTemplate = Preconditions.checkNotNull(ImmutableInstrumentationConfig.super.transactionNameTemplate(), "transactionNameTemplate");
        transactionNameTemplateBuildStage = STAGE_INITIALIZED;
      }
      return this.transactionNameTemplate;
    }

    void transactionNameTemplate(String transactionNameTemplate) {
      this.transactionNameTemplate = transactionNameTemplate;
      transactionNameTemplateBuildStage = STAGE_INITIALIZED;
    }
    private String transactionUserTemplate;
    private int transactionUserTemplateBuildStage;

    String transactionUserTemplate() {
      if (transactionUserTemplateBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (transactionUserTemplateBuildStage == STAGE_UNINITIALIZED) {
        transactionUserTemplateBuildStage = STAGE_INITIALIZING;
        this.transactionUserTemplate = Preconditions.checkNotNull(ImmutableInstrumentationConfig.super.transactionUserTemplate(), "transactionUserTemplate");
        transactionUserTemplateBuildStage = STAGE_INITIALIZED;
      }
      return this.transactionUserTemplate;
    }

    void transactionUserTemplate(String transactionUserTemplate) {
      this.transactionUserTemplate = transactionUserTemplate;
      transactionUserTemplateBuildStage = STAGE_INITIALIZED;
    }
    private boolean transactionOuter;
    private int transactionOuterBuildStage;

    boolean transactionOuter() {
      if (transactionOuterBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (transactionOuterBuildStage == STAGE_UNINITIALIZED) {
        transactionOuterBuildStage = STAGE_INITIALIZING;
        this.transactionOuter = ImmutableInstrumentationConfig.super.transactionOuter();
        transactionOuterBuildStage = STAGE_INITIALIZED;
      }
      return this.transactionOuter;
    }

    void transactionOuter(boolean transactionOuter) {
      this.transactionOuter = transactionOuter;
      transactionOuterBuildStage = STAGE_INITIALIZED;
    }
    private String traceEntryMessageTemplate;
    private int traceEntryMessageTemplateBuildStage;

    String traceEntryMessageTemplate() {
      if (traceEntryMessageTemplateBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (traceEntryMessageTemplateBuildStage == STAGE_UNINITIALIZED) {
        traceEntryMessageTemplateBuildStage = STAGE_INITIALIZING;
        this.traceEntryMessageTemplate = Preconditions.checkNotNull(ImmutableInstrumentationConfig.super.traceEntryMessageTemplate(), "traceEntryMessageTemplate");
        traceEntryMessageTemplateBuildStage = STAGE_INITIALIZED;
      }
      return this.traceEntryMessageTemplate;
    }

    void traceEntryMessageTemplate(String traceEntryMessageTemplate) {
      this.traceEntryMessageTemplate = traceEntryMessageTemplate;
      traceEntryMessageTemplateBuildStage = STAGE_INITIALIZED;
    }
    private boolean traceEntryCaptureSelfNested;
    private int traceEntryCaptureSelfNestedBuildStage;

    boolean traceEntryCaptureSelfNested() {
      if (traceEntryCaptureSelfNestedBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (traceEntryCaptureSelfNestedBuildStage == STAGE_UNINITIALIZED) {
        traceEntryCaptureSelfNestedBuildStage = STAGE_INITIALIZING;
        this.traceEntryCaptureSelfNested = ImmutableInstrumentationConfig.super.traceEntryCaptureSelfNested();
        traceEntryCaptureSelfNestedBuildStage = STAGE_INITIALIZED;
      }
      return this.traceEntryCaptureSelfNested;
    }

    void traceEntryCaptureSelfNested(boolean traceEntryCaptureSelfNested) {
      this.traceEntryCaptureSelfNested = traceEntryCaptureSelfNested;
      traceEntryCaptureSelfNestedBuildStage = STAGE_INITIALIZED;
    }
    private String timerName;
    private int timerNameBuildStage;

    String timerName() {
      if (timerNameBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (timerNameBuildStage == STAGE_UNINITIALIZED) {
        timerNameBuildStage = STAGE_INITIALIZING;
        this.timerName = Preconditions.checkNotNull(ImmutableInstrumentationConfig.super.timerName(), "timerName");
        timerNameBuildStage = STAGE_INITIALIZED;
      }
      return this.timerName;
    }

    void timerName(String timerName) {
      this.timerName = timerName;
      timerNameBuildStage = STAGE_INITIALIZED;
    }
    private String enabledProperty;
    private int enabledPropertyBuildStage;

    String enabledProperty() {
      if (enabledPropertyBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (enabledPropertyBuildStage == STAGE_UNINITIALIZED) {
        enabledPropertyBuildStage = STAGE_INITIALIZING;
        this.enabledProperty = Preconditions.checkNotNull(ImmutableInstrumentationConfig.super.enabledProperty(), "enabledProperty");
        enabledPropertyBuildStage = STAGE_INITIALIZED;
      }
      return this.enabledProperty;
    }

    void enabledProperty(String enabledProperty) {
      this.enabledProperty = enabledProperty;
      enabledPropertyBuildStage = STAGE_INITIALIZED;
    }
    private String traceEntryEnabledProperty;
    private int traceEntryEnabledPropertyBuildStage;

    String traceEntryEnabledProperty() {
      if (traceEntryEnabledPropertyBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (traceEntryEnabledPropertyBuildStage == STAGE_UNINITIALIZED) {
        traceEntryEnabledPropertyBuildStage = STAGE_INITIALIZING;
        this.traceEntryEnabledProperty = Preconditions.checkNotNull(ImmutableInstrumentationConfig.super.traceEntryEnabledProperty(), "traceEntryEnabledProperty");
        traceEntryEnabledPropertyBuildStage = STAGE_INITIALIZED;
      }
      return this.traceEntryEnabledProperty;
    }

    void traceEntryEnabledProperty(String traceEntryEnabledProperty) {
      this.traceEntryEnabledProperty = traceEntryEnabledProperty;
      traceEntryEnabledPropertyBuildStage = STAGE_INITIALIZED;
    }
    private boolean isTimerOrGreater;
    private int isTimerOrGreaterBuildStage;

    boolean isTimerOrGreater() {
      if (isTimerOrGreaterBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (isTimerOrGreaterBuildStage == STAGE_UNINITIALIZED) {
        isTimerOrGreaterBuildStage = STAGE_INITIALIZING;
        this.isTimerOrGreater = ImmutableInstrumentationConfig.super.isTimerOrGreater();
        isTimerOrGreaterBuildStage = STAGE_INITIALIZED;
      }
      return this.isTimerOrGreater;
    }
    private boolean isTraceEntryOrGreater;
    private int isTraceEntryOrGreaterBuildStage;

    boolean isTraceEntryOrGreater() {
      if (isTraceEntryOrGreaterBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (isTraceEntryOrGreaterBuildStage == STAGE_UNINITIALIZED) {
        isTraceEntryOrGreaterBuildStage = STAGE_INITIALIZING;
        this.isTraceEntryOrGreater = ImmutableInstrumentationConfig.super.isTraceEntryOrGreater();
        isTraceEntryOrGreaterBuildStage = STAGE_INITIALIZED;
      }
      return this.isTraceEntryOrGreater;
    }
    private boolean isTransaction;
    private int isTransactionBuildStage;

    boolean isTransaction() {
      if (isTransactionBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (isTransactionBuildStage == STAGE_UNINITIALIZED) {
        isTransactionBuildStage = STAGE_INITIALIZING;
        this.isTransaction = ImmutableInstrumentationConfig.super.isTransaction();
        isTransactionBuildStage = STAGE_INITIALIZED;
      }
      return this.isTransaction;
    }
    private ImmutableList<String> validationErrors;
    private int validationErrorsBuildStage;

    ImmutableList<String> validationErrors() {
      if (validationErrorsBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (validationErrorsBuildStage == STAGE_UNINITIALIZED) {
        validationErrorsBuildStage = STAGE_INITIALIZING;
        this.validationErrors = Preconditions.checkNotNull(ImmutableInstrumentationConfig.super.validationErrors(), "validationErrors");
        validationErrorsBuildStage = STAGE_INITIALIZED;
      }
      return this.validationErrors;
    }

    private String formatInitCycleMessage() {
      ArrayList<String> attributes = Lists.newArrayList();
      if (classNameBuildStage == STAGE_INITIALIZING) attributes.add("className");
      if (classAnnotationBuildStage == STAGE_INITIALIZING) attributes.add("classAnnotation");
      if (subTypeRestrictionBuildStage == STAGE_INITIALIZING) attributes.add("subTypeRestriction");
      if (superTypeRestrictionBuildStage == STAGE_INITIALIZING) attributes.add("superTypeRestriction");
      if (methodDeclaringClassNameBuildStage == STAGE_INITIALIZING) attributes.add("methodDeclaringClassName");
      if (methodNameBuildStage == STAGE_INITIALIZING) attributes.add("methodName");
      if (methodAnnotationBuildStage == STAGE_INITIALIZING) attributes.add("methodAnnotation");
      if (methodReturnTypeBuildStage == STAGE_INITIALIZING) attributes.add("methodReturnType");
      if (nestingGroupBuildStage == STAGE_INITIALIZING) attributes.add("nestingGroup");
      if (orderBuildStage == STAGE_INITIALIZING) attributes.add("order");
      if (transactionTypeBuildStage == STAGE_INITIALIZING) attributes.add("transactionType");
      if (transactionNameTemplateBuildStage == STAGE_INITIALIZING) attributes.add("transactionNameTemplate");
      if (transactionUserTemplateBuildStage == STAGE_INITIALIZING) attributes.add("transactionUserTemplate");
      if (transactionOuterBuildStage == STAGE_INITIALIZING) attributes.add("transactionOuter");
      if (traceEntryMessageTemplateBuildStage == STAGE_INITIALIZING) attributes.add("traceEntryMessageTemplate");
      if (traceEntryCaptureSelfNestedBuildStage == STAGE_INITIALIZING) attributes.add("traceEntryCaptureSelfNested");
      if (timerNameBuildStage == STAGE_INITIALIZING) attributes.add("timerName");
      if (enabledPropertyBuildStage == STAGE_INITIALIZING) attributes.add("enabledProperty");
      if (traceEntryEnabledPropertyBuildStage == STAGE_INITIALIZING) attributes.add("traceEntryEnabledProperty");
      if (isTimerOrGreaterBuildStage == STAGE_INITIALIZING) attributes.add("isTimerOrGreater");
      if (isTraceEntryOrGreaterBuildStage == STAGE_INITIALIZING) attributes.add("isTraceEntryOrGreater");
      if (isTransactionBuildStage == STAGE_INITIALIZING) attributes.add("isTransaction");
      if (validationErrorsBuildStage == STAGE_INITIALIZING) attributes.add("validationErrors");
      return "Cannot build InstrumentationConfig, attribute initializers form cycle" + attributes;
    }
  }

  /**
   * @return The value of the {@code className} attribute
   */
  @JsonProperty("className")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @Override
  public String className() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.className()
        : this.className;
  }

  /**
   * @return The value of the {@code classAnnotation} attribute
   */
  @JsonProperty("classAnnotation")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @Override
  public String classAnnotation() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.classAnnotation()
        : this.classAnnotation;
  }

  /**
   * @return The value of the {@code subTypeRestriction} attribute
   */
  @JsonProperty("subTypeRestriction")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @Override
  public String subTypeRestriction() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.subTypeRestriction()
        : this.subTypeRestriction;
  }

  /**
   * @return The value of the {@code superTypeRestriction} attribute
   */
  @JsonProperty("superTypeRestriction")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @Override
  public String superTypeRestriction() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.superTypeRestriction()
        : this.superTypeRestriction;
  }

  /**
   * @return The value of the {@code methodDeclaringClassName} attribute
   */
  @JsonProperty("methodDeclaringClassName")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @Deprecated
  @Override
  public String methodDeclaringClassName() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.methodDeclaringClassName()
        : this.methodDeclaringClassName;
  }

  /**
   * @return The value of the {@code methodName} attribute
   */
  @JsonProperty("methodName")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @Override
  public String methodName() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.methodName()
        : this.methodName;
  }

  /**
   * @return The value of the {@code methodAnnotation} attribute
   */
  @JsonProperty("methodAnnotation")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @Override
  public String methodAnnotation() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.methodAnnotation()
        : this.methodAnnotation;
  }

  /**
   * @return The value of the {@code methodParameterTypes} attribute
   */
  @JsonProperty("methodParameterTypes")
  @Override
  public ImmutableList<String> methodParameterTypes() {
    return methodParameterTypes;
  }

  /**
   * @return The value of the {@code methodReturnType} attribute
   */
  @JsonProperty("methodReturnType")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @Override
  public String methodReturnType() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.methodReturnType()
        : this.methodReturnType;
  }

  /**
   * @return The value of the {@code methodModifiers} attribute
   */
  @JsonProperty("methodModifiers")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @Override
  public ImmutableList<AgentConfigOuterClass.AgentConfig.InstrumentationConfig.MethodModifier> methodModifiers() {
    return methodModifiers;
  }

  /**
   * @return The value of the {@code nestingGroup} attribute
   */
  @JsonProperty("nestingGroup")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @Override
  public String nestingGroup() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.nestingGroup()
        : this.nestingGroup;
  }

  /**
   * @return The value of the {@code order} attribute
   */
  @JsonProperty("order")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @Override
  public int order() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.order()
        : this.order;
  }

  /**
   * @return The value of the {@code captureKind} attribute
   */
  @JsonProperty("captureKind")
  @Override
  public AgentConfigOuterClass.AgentConfig.InstrumentationConfig.CaptureKind captureKind() {
    return captureKind;
  }

  /**
   * @return The value of the {@code transactionType} attribute
   */
  @JsonProperty("transactionType")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @Override
  public String transactionType() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.transactionType()
        : this.transactionType;
  }

  /**
   * @return The value of the {@code transactionNameTemplate} attribute
   */
  @JsonProperty("transactionNameTemplate")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @Override
  public String transactionNameTemplate() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.transactionNameTemplate()
        : this.transactionNameTemplate;
  }

  /**
   * @return The value of the {@code transactionUserTemplate} attribute
   */
  @JsonProperty("transactionUserTemplate")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @Override
  public String transactionUserTemplate() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.transactionUserTemplate()
        : this.transactionUserTemplate;
  }

  /**
   * @return The value of the {@code transactionAttributeTemplates} attribute
   */
  @JsonProperty("transactionAttributeTemplates")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @Override
  public ImmutableMap<String, String> transactionAttributeTemplates() {
    return transactionAttributeTemplates;
  }

  /**
   * @return The value of the {@code transactionSlowThresholdMillis} attribute
   */
  @JsonProperty("transactionSlowThresholdMillis")
  @JsonInclude(JsonInclude.Include.NON_NULL)
  @Override
  public @Nullable Integer transactionSlowThresholdMillis() {
    return transactionSlowThresholdMillis;
  }

  /**
   * @return The value of the {@code transactionOuter} attribute
   */
  @JsonProperty("transactionOuter")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @Override
  public boolean transactionOuter() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.transactionOuter()
        : this.transactionOuter;
  }

  /**
   * @return The value of the {@code traceEntryMessageTemplate} attribute
   */
  @JsonProperty("traceEntryMessageTemplate")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @Override
  public String traceEntryMessageTemplate() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.traceEntryMessageTemplate()
        : this.traceEntryMessageTemplate;
  }

  /**
   * @return The value of the {@code traceEntryStackThresholdMillis} attribute
   */
  @JsonProperty("traceEntryStackThresholdMillis")
  @JsonInclude(JsonInclude.Include.NON_NULL)
  @Override
  public @Nullable Integer traceEntryStackThresholdMillis() {
    return traceEntryStackThresholdMillis;
  }

  /**
   * @return The value of the {@code traceEntryCaptureSelfNested} attribute
   */
  @JsonProperty("traceEntryCaptureSelfNested")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @Override
  public boolean traceEntryCaptureSelfNested() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.traceEntryCaptureSelfNested()
        : this.traceEntryCaptureSelfNested;
  }

  /**
   * @return The value of the {@code timerName} attribute
   */
  @JsonProperty("timerName")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @Override
  public String timerName() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.timerName()
        : this.timerName;
  }

  /**
   * @return The value of the {@code enabledProperty} attribute
   */
  @JsonProperty("enabledProperty")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @Override
  public String enabledProperty() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.enabledProperty()
        : this.enabledProperty;
  }

  /**
   * @return The value of the {@code traceEntryEnabledProperty} attribute
   */
  @JsonProperty("traceEntryEnabledProperty")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @Override
  public String traceEntryEnabledProperty() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.traceEntryEnabledProperty()
        : this.traceEntryEnabledProperty;
  }

  /**
   * @return The computed-at-construction value of the {@code isTimerOrGreater} attribute
   */
  @JsonProperty("isTimerOrGreater")
  @JsonIgnore
  @Override
  public boolean isTimerOrGreater() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.isTimerOrGreater()
        : this.isTimerOrGreater;
  }

  /**
   * @return The computed-at-construction value of the {@code isTraceEntryOrGreater} attribute
   */
  @JsonProperty("isTraceEntryOrGreater")
  @JsonIgnore
  @Override
  public boolean isTraceEntryOrGreater() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.isTraceEntryOrGreater()
        : this.isTraceEntryOrGreater;
  }

  /**
   * @return The computed-at-construction value of the {@code isTransaction} attribute
   */
  @JsonProperty("isTransaction")
  @JsonIgnore
  @Override
  public boolean isTransaction() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.isTransaction()
        : this.isTransaction;
  }

  /**
   * @return The computed-at-construction value of the {@code validationErrors} attribute
   */
  @JsonProperty("validationErrors")
  @JsonIgnore
  @Override
  public ImmutableList<String> validationErrors() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.validationErrors()
        : this.validationErrors;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link InstrumentationConfig#className() className} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for className
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableInstrumentationConfig withClassName(String value) {
    if (this.className.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "className");
    return new ImmutableInstrumentationConfig(
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
        this.traceEntryEnabledProperty);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link InstrumentationConfig#classAnnotation() classAnnotation} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for classAnnotation
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableInstrumentationConfig withClassAnnotation(String value) {
    if (this.classAnnotation.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "classAnnotation");
    return new ImmutableInstrumentationConfig(
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
        this.traceEntryEnabledProperty);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link InstrumentationConfig#subTypeRestriction() subTypeRestriction} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for subTypeRestriction
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableInstrumentationConfig withSubTypeRestriction(String value) {
    if (this.subTypeRestriction.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "subTypeRestriction");
    return new ImmutableInstrumentationConfig(
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
        this.traceEntryEnabledProperty);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link InstrumentationConfig#superTypeRestriction() superTypeRestriction} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for superTypeRestriction
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableInstrumentationConfig withSuperTypeRestriction(String value) {
    if (this.superTypeRestriction.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "superTypeRestriction");
    return new ImmutableInstrumentationConfig(
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
        this.traceEntryEnabledProperty);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link InstrumentationConfig#methodDeclaringClassName() methodDeclaringClassName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for methodDeclaringClassName
   * @return A modified copy of the {@code this} object
   */
  @Deprecated
  public final ImmutableInstrumentationConfig withMethodDeclaringClassName(String value) {
    if (this.methodDeclaringClassName.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "methodDeclaringClassName");
    return new ImmutableInstrumentationConfig(
        this.className,
        this.classAnnotation,
        this.subTypeRestriction,
        this.superTypeRestriction,
        newValue,
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
        this.traceEntryEnabledProperty);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link InstrumentationConfig#methodName() methodName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for methodName
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableInstrumentationConfig withMethodName(String value) {
    if (this.methodName.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "methodName");
    return new ImmutableInstrumentationConfig(
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
        this.traceEntryEnabledProperty);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link InstrumentationConfig#methodAnnotation() methodAnnotation} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for methodAnnotation
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableInstrumentationConfig withMethodAnnotation(String value) {
    if (this.methodAnnotation.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "methodAnnotation");
    return new ImmutableInstrumentationConfig(
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
        this.traceEntryEnabledProperty);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link InstrumentationConfig#methodParameterTypes() methodParameterTypes}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInstrumentationConfig withMethodParameterTypes(String... elements) {
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableInstrumentationConfig(
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
        this.traceEntryEnabledProperty);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link InstrumentationConfig#methodParameterTypes() methodParameterTypes}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of methodParameterTypes elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInstrumentationConfig withMethodParameterTypes(Iterable<String> elements) {
    if (this.methodParameterTypes == elements) return this;
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableInstrumentationConfig(
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
        this.traceEntryEnabledProperty);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link InstrumentationConfig#methodReturnType() methodReturnType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for methodReturnType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableInstrumentationConfig withMethodReturnType(String value) {
    if (this.methodReturnType.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "methodReturnType");
    return new ImmutableInstrumentationConfig(
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
        this.traceEntryEnabledProperty);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link InstrumentationConfig#methodModifiers() methodModifiers}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInstrumentationConfig withMethodModifiers(AgentConfigOuterClass.AgentConfig.InstrumentationConfig.MethodModifier... elements) {
    ImmutableList<AgentConfigOuterClass.AgentConfig.InstrumentationConfig.MethodModifier> newValue = ImmutableList.copyOf(elements);
    return new ImmutableInstrumentationConfig(
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
        this.traceEntryEnabledProperty);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link InstrumentationConfig#methodModifiers() methodModifiers}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of methodModifiers elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInstrumentationConfig withMethodModifiers(Iterable<? extends AgentConfigOuterClass.AgentConfig.InstrumentationConfig.MethodModifier> elements) {
    if (this.methodModifiers == elements) return this;
    ImmutableList<AgentConfigOuterClass.AgentConfig.InstrumentationConfig.MethodModifier> newValue = ImmutableList.copyOf(elements);
    return new ImmutableInstrumentationConfig(
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
        this.traceEntryEnabledProperty);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link InstrumentationConfig#nestingGroup() nestingGroup} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for nestingGroup
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableInstrumentationConfig withNestingGroup(String value) {
    if (this.nestingGroup.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "nestingGroup");
    return new ImmutableInstrumentationConfig(
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
        this.traceEntryEnabledProperty);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link InstrumentationConfig#order() order} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for order
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableInstrumentationConfig withOrder(int value) {
    if (this.order == value) return this;
    return new ImmutableInstrumentationConfig(
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
        this.traceEntryEnabledProperty);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link InstrumentationConfig#captureKind() captureKind} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for captureKind
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableInstrumentationConfig withCaptureKind(AgentConfigOuterClass.AgentConfig.InstrumentationConfig.CaptureKind value) {
    if (this.captureKind == value) return this;
    AgentConfigOuterClass.AgentConfig.InstrumentationConfig.CaptureKind newValue = Preconditions.checkNotNull(value, "captureKind");
    return new ImmutableInstrumentationConfig(
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
        this.traceEntryEnabledProperty);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link InstrumentationConfig#transactionType() transactionType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for transactionType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableInstrumentationConfig withTransactionType(String value) {
    if (this.transactionType.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "transactionType");
    return new ImmutableInstrumentationConfig(
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
        this.traceEntryEnabledProperty);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link InstrumentationConfig#transactionNameTemplate() transactionNameTemplate} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for transactionNameTemplate
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableInstrumentationConfig withTransactionNameTemplate(String value) {
    if (this.transactionNameTemplate.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "transactionNameTemplate");
    return new ImmutableInstrumentationConfig(
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
        this.traceEntryEnabledProperty);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link InstrumentationConfig#transactionUserTemplate() transactionUserTemplate} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for transactionUserTemplate
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableInstrumentationConfig withTransactionUserTemplate(String value) {
    if (this.transactionUserTemplate.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "transactionUserTemplate");
    return new ImmutableInstrumentationConfig(
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
        this.traceEntryEnabledProperty);
  }

  /**
   * Copy the current immutable object by replacing the {@link InstrumentationConfig#transactionAttributeTemplates() transactionAttributeTemplates} map with the specified map.
   * Nulls are not permitted as keys or values.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param entries The entries to be added to the transactionAttributeTemplates map
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInstrumentationConfig withTransactionAttributeTemplates(Map<String, ? extends String> entries) {
    if (this.transactionAttributeTemplates == entries) return this;
    ImmutableMap<String, String> newValue = ImmutableMap.copyOf(entries);
    return new ImmutableInstrumentationConfig(
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
        this.traceEntryEnabledProperty);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link InstrumentationConfig#transactionSlowThresholdMillis() transactionSlowThresholdMillis} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for transactionSlowThresholdMillis (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableInstrumentationConfig withTransactionSlowThresholdMillis(@Nullable Integer value) {
    if (Objects.equal(this.transactionSlowThresholdMillis, value)) return this;
    return new ImmutableInstrumentationConfig(
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
        this.traceEntryEnabledProperty);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link InstrumentationConfig#transactionOuter() transactionOuter} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for transactionOuter
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableInstrumentationConfig withTransactionOuter(boolean value) {
    if (this.transactionOuter == value) return this;
    return new ImmutableInstrumentationConfig(
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
        this.traceEntryEnabledProperty);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link InstrumentationConfig#traceEntryMessageTemplate() traceEntryMessageTemplate} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for traceEntryMessageTemplate
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableInstrumentationConfig withTraceEntryMessageTemplate(String value) {
    if (this.traceEntryMessageTemplate.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "traceEntryMessageTemplate");
    return new ImmutableInstrumentationConfig(
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
        this.traceEntryEnabledProperty);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link InstrumentationConfig#traceEntryStackThresholdMillis() traceEntryStackThresholdMillis} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for traceEntryStackThresholdMillis (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableInstrumentationConfig withTraceEntryStackThresholdMillis(@Nullable Integer value) {
    if (Objects.equal(this.traceEntryStackThresholdMillis, value)) return this;
    return new ImmutableInstrumentationConfig(
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
        this.traceEntryEnabledProperty);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link InstrumentationConfig#traceEntryCaptureSelfNested() traceEntryCaptureSelfNested} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for traceEntryCaptureSelfNested
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableInstrumentationConfig withTraceEntryCaptureSelfNested(boolean value) {
    if (this.traceEntryCaptureSelfNested == value) return this;
    return new ImmutableInstrumentationConfig(
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
        this.traceEntryEnabledProperty);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link InstrumentationConfig#timerName() timerName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for timerName
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableInstrumentationConfig withTimerName(String value) {
    if (this.timerName.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "timerName");
    return new ImmutableInstrumentationConfig(
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
        this.traceEntryEnabledProperty);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link InstrumentationConfig#enabledProperty() enabledProperty} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for enabledProperty
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableInstrumentationConfig withEnabledProperty(String value) {
    if (this.enabledProperty.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "enabledProperty");
    return new ImmutableInstrumentationConfig(
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
        this.traceEntryEnabledProperty);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link InstrumentationConfig#traceEntryEnabledProperty() traceEntryEnabledProperty} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for traceEntryEnabledProperty
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableInstrumentationConfig withTraceEntryEnabledProperty(String value) {
    if (this.traceEntryEnabledProperty.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "traceEntryEnabledProperty");
    return new ImmutableInstrumentationConfig(
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
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableInstrumentationConfig} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableInstrumentationConfig
        && equalTo((ImmutableInstrumentationConfig) another);
  }

  private boolean equalTo(ImmutableInstrumentationConfig another) {
    return className.equals(another.className)
        && classAnnotation.equals(another.classAnnotation)
        && subTypeRestriction.equals(another.subTypeRestriction)
        && superTypeRestriction.equals(another.superTypeRestriction)
        && methodDeclaringClassName.equals(another.methodDeclaringClassName)
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
        && isTimerOrGreater == another.isTimerOrGreater
        && isTraceEntryOrGreater == another.isTraceEntryOrGreater
        && isTransaction == another.isTransaction
        && validationErrors.equals(another.validationErrors);
  }

  /**
   * Computes a hash code from attributes: {@code className}, {@code classAnnotation}, {@code subTypeRestriction}, {@code superTypeRestriction}, {@code methodDeclaringClassName}, {@code methodName}, {@code methodAnnotation}, {@code methodParameterTypes}, {@code methodReturnType}, {@code methodModifiers}, {@code nestingGroup}, {@code order}, {@code captureKind}, {@code transactionType}, {@code transactionNameTemplate}, {@code transactionUserTemplate}, {@code transactionAttributeTemplates}, {@code transactionSlowThresholdMillis}, {@code transactionOuter}, {@code traceEntryMessageTemplate}, {@code traceEntryStackThresholdMillis}, {@code traceEntryCaptureSelfNested}, {@code timerName}, {@code enabledProperty}, {@code traceEntryEnabledProperty}, {@code isTimerOrGreater}, {@code isTraceEntryOrGreater}, {@code isTransaction}, {@code validationErrors}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + className.hashCode();
    h += (h << 5) + classAnnotation.hashCode();
    h += (h << 5) + subTypeRestriction.hashCode();
    h += (h << 5) + superTypeRestriction.hashCode();
    h += (h << 5) + methodDeclaringClassName.hashCode();
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
    h += (h << 5) + Booleans.hashCode(isTimerOrGreater);
    h += (h << 5) + Booleans.hashCode(isTraceEntryOrGreater);
    h += (h << 5) + Booleans.hashCode(isTransaction);
    h += (h << 5) + validationErrors.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code InstrumentationConfig} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("InstrumentationConfig")
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
        .add("isTimerOrGreater", isTimerOrGreater)
        .add("isTraceEntryOrGreater", isTraceEntryOrGreater)
        .add("isTransaction", isTransaction)
        .add("validationErrors", validationErrors)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends InstrumentationConfig {
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
    @JsonProperty("className")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public void setClassName(String className) {
      this.className = className;
    }
    @JsonProperty("classAnnotation")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public void setClassAnnotation(String classAnnotation) {
      this.classAnnotation = classAnnotation;
    }
    @JsonProperty("subTypeRestriction")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public void setSubTypeRestriction(String subTypeRestriction) {
      this.subTypeRestriction = subTypeRestriction;
    }
    @JsonProperty("superTypeRestriction")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public void setSuperTypeRestriction(String superTypeRestriction) {
      this.superTypeRestriction = superTypeRestriction;
    }
    @JsonProperty("methodDeclaringClassName")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public void setMethodDeclaringClassName(String methodDeclaringClassName) {
      this.methodDeclaringClassName = methodDeclaringClassName;
    }
    @JsonProperty("methodName")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public void setMethodName(String methodName) {
      this.methodName = methodName;
    }
    @JsonProperty("methodAnnotation")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public void setMethodAnnotation(String methodAnnotation) {
      this.methodAnnotation = methodAnnotation;
    }
    @JsonProperty("methodParameterTypes")
    public void setMethodParameterTypes(ImmutableList<String> methodParameterTypes) {
      this.methodParameterTypes = methodParameterTypes;
    }
    @JsonProperty("methodReturnType")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public void setMethodReturnType(String methodReturnType) {
      this.methodReturnType = methodReturnType;
    }
    @JsonProperty("methodModifiers")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public void setMethodModifiers(ImmutableList<AgentConfigOuterClass.AgentConfig.InstrumentationConfig.MethodModifier> methodModifiers) {
      this.methodModifiers = methodModifiers;
    }
    @JsonProperty("nestingGroup")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public void setNestingGroup(String nestingGroup) {
      this.nestingGroup = nestingGroup;
    }
    @JsonProperty("order")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public void setOrder(int order) {
      this.order = order;
      this.orderIsSet = true;
    }
    @JsonProperty("captureKind")
    public void setCaptureKind(AgentConfigOuterClass.AgentConfig.InstrumentationConfig.CaptureKind captureKind) {
      this.captureKind = captureKind;
    }
    @JsonProperty("transactionType")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public void setTransactionType(String transactionType) {
      this.transactionType = transactionType;
    }
    @JsonProperty("transactionNameTemplate")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public void setTransactionNameTemplate(String transactionNameTemplate) {
      this.transactionNameTemplate = transactionNameTemplate;
    }
    @JsonProperty("transactionUserTemplate")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public void setTransactionUserTemplate(String transactionUserTemplate) {
      this.transactionUserTemplate = transactionUserTemplate;
    }
    @JsonProperty("transactionAttributeTemplates")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public void setTransactionAttributeTemplates(Map<String, String> transactionAttributeTemplates) {
      this.transactionAttributeTemplates = transactionAttributeTemplates;
    }
    @JsonProperty("transactionSlowThresholdMillis")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public void setTransactionSlowThresholdMillis(@Nullable Integer transactionSlowThresholdMillis) {
      this.transactionSlowThresholdMillis = transactionSlowThresholdMillis;
    }
    @JsonProperty("transactionOuter")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public void setTransactionOuter(boolean transactionOuter) {
      this.transactionOuter = transactionOuter;
      this.transactionOuterIsSet = true;
    }
    @JsonProperty("traceEntryMessageTemplate")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public void setTraceEntryMessageTemplate(String traceEntryMessageTemplate) {
      this.traceEntryMessageTemplate = traceEntryMessageTemplate;
    }
    @JsonProperty("traceEntryStackThresholdMillis")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public void setTraceEntryStackThresholdMillis(@Nullable Integer traceEntryStackThresholdMillis) {
      this.traceEntryStackThresholdMillis = traceEntryStackThresholdMillis;
    }
    @JsonProperty("traceEntryCaptureSelfNested")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public void setTraceEntryCaptureSelfNested(boolean traceEntryCaptureSelfNested) {
      this.traceEntryCaptureSelfNested = traceEntryCaptureSelfNested;
      this.traceEntryCaptureSelfNestedIsSet = true;
    }
    @JsonProperty("timerName")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public void setTimerName(String timerName) {
      this.timerName = timerName;
    }
    @JsonProperty("enabledProperty")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public void setEnabledProperty(String enabledProperty) {
      this.enabledProperty = enabledProperty;
    }
    @JsonProperty("traceEntryEnabledProperty")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public void setTraceEntryEnabledProperty(String traceEntryEnabledProperty) {
      this.traceEntryEnabledProperty = traceEntryEnabledProperty;
    }
    @Override
    public String className() { throw new UnsupportedOperationException(); }
    @Override
    public String classAnnotation() { throw new UnsupportedOperationException(); }
    @Override
    public String subTypeRestriction() { throw new UnsupportedOperationException(); }
    @Override
    public String superTypeRestriction() { throw new UnsupportedOperationException(); }
    @Override
    public String methodDeclaringClassName() { throw new UnsupportedOperationException(); }
    @Override
    public String methodName() { throw new UnsupportedOperationException(); }
    @Override
    public String methodAnnotation() { throw new UnsupportedOperationException(); }
    @Override
    public ImmutableList<String> methodParameterTypes() { throw new UnsupportedOperationException(); }
    @Override
    public String methodReturnType() { throw new UnsupportedOperationException(); }
    @Override
    public ImmutableList<AgentConfigOuterClass.AgentConfig.InstrumentationConfig.MethodModifier> methodModifiers() { throw new UnsupportedOperationException(); }
    @Override
    public String nestingGroup() { throw new UnsupportedOperationException(); }
    @Override
    public int order() { throw new UnsupportedOperationException(); }
    @Override
    public AgentConfigOuterClass.AgentConfig.InstrumentationConfig.CaptureKind captureKind() { throw new UnsupportedOperationException(); }
    @Override
    public String transactionType() { throw new UnsupportedOperationException(); }
    @Override
    public String transactionNameTemplate() { throw new UnsupportedOperationException(); }
    @Override
    public String transactionUserTemplate() { throw new UnsupportedOperationException(); }
    @Override
    public Map<String, String> transactionAttributeTemplates() { throw new UnsupportedOperationException(); }
    @Override
    public Integer transactionSlowThresholdMillis() { throw new UnsupportedOperationException(); }
    @Override
    public boolean transactionOuter() { throw new UnsupportedOperationException(); }
    @Override
    public String traceEntryMessageTemplate() { throw new UnsupportedOperationException(); }
    @Override
    public Integer traceEntryStackThresholdMillis() { throw new UnsupportedOperationException(); }
    @Override
    public boolean traceEntryCaptureSelfNested() { throw new UnsupportedOperationException(); }
    @Override
    public String timerName() { throw new UnsupportedOperationException(); }
    @Override
    public String enabledProperty() { throw new UnsupportedOperationException(); }
    @Override
    public String traceEntryEnabledProperty() { throw new UnsupportedOperationException(); }
    @Override
    public boolean isTimerOrGreater() { throw new UnsupportedOperationException(); }
    @Override
    public boolean isTraceEntryOrGreater() { throw new UnsupportedOperationException(); }
    @Override
    public boolean isTransaction() { throw new UnsupportedOperationException(); }
    @Override
    public ImmutableList<String> validationErrors() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableInstrumentationConfig fromJson(Json json) {
    ImmutableInstrumentationConfig.Builder builder = ImmutableInstrumentationConfig.builder();
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
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link InstrumentationConfig} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable InstrumentationConfig instance
   */
  public static ImmutableInstrumentationConfig copyOf(InstrumentationConfig instance) {
    if (instance instanceof ImmutableInstrumentationConfig) {
      return (ImmutableInstrumentationConfig) instance;
    }
    return ImmutableInstrumentationConfig.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableInstrumentationConfig ImmutableInstrumentationConfig}.
   * @return A new ImmutableInstrumentationConfig builder
   */
  public static ImmutableInstrumentationConfig.Builder builder() {
    return new ImmutableInstrumentationConfig.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableInstrumentationConfig ImmutableInstrumentationConfig}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_CAPTURE_KIND = 0x1L;
    private static final long OPT_BIT_ORDER = 0x1L;
    private static final long OPT_BIT_TRANSACTION_OUTER = 0x2L;
    private static final long OPT_BIT_TRACE_ENTRY_CAPTURE_SELF_NESTED = 0x4L;
    private long initBits = 0x1L;
    private long optBits;

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

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code InstrumentationConfig} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(InstrumentationConfig instance) {
      Preconditions.checkNotNull(instance, "instance");
      className(instance.className());
      classAnnotation(instance.classAnnotation());
      subTypeRestriction(instance.subTypeRestriction());
      superTypeRestriction(instance.superTypeRestriction());
      methodDeclaringClassName(instance.methodDeclaringClassName());
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
      return this;
    }

    /**
     * Initializes the value for the {@link InstrumentationConfig#className() className} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link InstrumentationConfig#className() className}.</em>
     * @param className The value for className 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder className(String className) {
      this.className = Preconditions.checkNotNull(className, "className");
      return this;
    }

    /**
     * Initializes the value for the {@link InstrumentationConfig#classAnnotation() classAnnotation} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link InstrumentationConfig#classAnnotation() classAnnotation}.</em>
     * @param classAnnotation The value for classAnnotation 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder classAnnotation(String classAnnotation) {
      this.classAnnotation = Preconditions.checkNotNull(classAnnotation, "classAnnotation");
      return this;
    }

    /**
     * Initializes the value for the {@link InstrumentationConfig#subTypeRestriction() subTypeRestriction} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link InstrumentationConfig#subTypeRestriction() subTypeRestriction}.</em>
     * @param subTypeRestriction The value for subTypeRestriction 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder subTypeRestriction(String subTypeRestriction) {
      this.subTypeRestriction = Preconditions.checkNotNull(subTypeRestriction, "subTypeRestriction");
      return this;
    }

    /**
     * Initializes the value for the {@link InstrumentationConfig#superTypeRestriction() superTypeRestriction} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link InstrumentationConfig#superTypeRestriction() superTypeRestriction}.</em>
     * @param superTypeRestriction The value for superTypeRestriction 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder superTypeRestriction(String superTypeRestriction) {
      this.superTypeRestriction = Preconditions.checkNotNull(superTypeRestriction, "superTypeRestriction");
      return this;
    }

    /**
     * Initializes the value for the {@link InstrumentationConfig#methodDeclaringClassName() methodDeclaringClassName} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link InstrumentationConfig#methodDeclaringClassName() methodDeclaringClassName}.</em>
     * @param methodDeclaringClassName The value for methodDeclaringClassName 
     * @return {@code this} builder for use in a chained invocation
     */
    @Deprecated
    public final Builder methodDeclaringClassName(String methodDeclaringClassName) {
      this.methodDeclaringClassName = Preconditions.checkNotNull(methodDeclaringClassName, "methodDeclaringClassName");
      return this;
    }

    /**
     * Initializes the value for the {@link InstrumentationConfig#methodName() methodName} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link InstrumentationConfig#methodName() methodName}.</em>
     * @param methodName The value for methodName 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder methodName(String methodName) {
      this.methodName = Preconditions.checkNotNull(methodName, "methodName");
      return this;
    }

    /**
     * Initializes the value for the {@link InstrumentationConfig#methodAnnotation() methodAnnotation} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link InstrumentationConfig#methodAnnotation() methodAnnotation}.</em>
     * @param methodAnnotation The value for methodAnnotation 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder methodAnnotation(String methodAnnotation) {
      this.methodAnnotation = Preconditions.checkNotNull(methodAnnotation, "methodAnnotation");
      return this;
    }

    /**
     * Adds one element to {@link InstrumentationConfig#methodParameterTypes() methodParameterTypes} list.
     * @param element A methodParameterTypes element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addMethodParameterTypes(String element) {
      this.methodParameterTypes.add(element);
      return this;
    }

    /**
     * Adds elements to {@link InstrumentationConfig#methodParameterTypes() methodParameterTypes} list.
     * @param elements An array of methodParameterTypes elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addMethodParameterTypes(String... elements) {
      this.methodParameterTypes.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link InstrumentationConfig#methodParameterTypes() methodParameterTypes} list.
     * @param elements An iterable of methodParameterTypes elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder methodParameterTypes(Iterable<String> elements) {
      this.methodParameterTypes = ImmutableList.builder();
      return addAllMethodParameterTypes(elements);
    }

    /**
     * Adds elements to {@link InstrumentationConfig#methodParameterTypes() methodParameterTypes} list.
     * @param elements An iterable of methodParameterTypes elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllMethodParameterTypes(Iterable<String> elements) {
      this.methodParameterTypes.addAll(elements);
      return this;
    }

    /**
     * Initializes the value for the {@link InstrumentationConfig#methodReturnType() methodReturnType} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link InstrumentationConfig#methodReturnType() methodReturnType}.</em>
     * @param methodReturnType The value for methodReturnType 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder methodReturnType(String methodReturnType) {
      this.methodReturnType = Preconditions.checkNotNull(methodReturnType, "methodReturnType");
      return this;
    }

    /**
     * Adds one element to {@link InstrumentationConfig#methodModifiers() methodModifiers} list.
     * @param element A methodModifiers element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addMethodModifiers(AgentConfigOuterClass.AgentConfig.InstrumentationConfig.MethodModifier element) {
      this.methodModifiers.add(element);
      return this;
    }

    /**
     * Adds elements to {@link InstrumentationConfig#methodModifiers() methodModifiers} list.
     * @param elements An array of methodModifiers elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addMethodModifiers(AgentConfigOuterClass.AgentConfig.InstrumentationConfig.MethodModifier... elements) {
      this.methodModifiers.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link InstrumentationConfig#methodModifiers() methodModifiers} list.
     * @param elements An iterable of methodModifiers elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder methodModifiers(Iterable<? extends AgentConfigOuterClass.AgentConfig.InstrumentationConfig.MethodModifier> elements) {
      this.methodModifiers = ImmutableList.builder();
      return addAllMethodModifiers(elements);
    }

    /**
     * Adds elements to {@link InstrumentationConfig#methodModifiers() methodModifiers} list.
     * @param elements An iterable of methodModifiers elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllMethodModifiers(Iterable<? extends AgentConfigOuterClass.AgentConfig.InstrumentationConfig.MethodModifier> elements) {
      this.methodModifiers.addAll(elements);
      return this;
    }

    /**
     * Initializes the value for the {@link InstrumentationConfig#nestingGroup() nestingGroup} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link InstrumentationConfig#nestingGroup() nestingGroup}.</em>
     * @param nestingGroup The value for nestingGroup 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder nestingGroup(String nestingGroup) {
      this.nestingGroup = Preconditions.checkNotNull(nestingGroup, "nestingGroup");
      return this;
    }

    /**
     * Initializes the value for the {@link InstrumentationConfig#order() order} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link InstrumentationConfig#order() order}.</em>
     * @param order The value for order 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder order(int order) {
      this.order = order;
      optBits |= OPT_BIT_ORDER;
      return this;
    }

    /**
     * Initializes the value for the {@link InstrumentationConfig#captureKind() captureKind} attribute.
     * @param captureKind The value for captureKind 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder captureKind(AgentConfigOuterClass.AgentConfig.InstrumentationConfig.CaptureKind captureKind) {
      this.captureKind = Preconditions.checkNotNull(captureKind, "captureKind");
      initBits &= ~INIT_BIT_CAPTURE_KIND;
      return this;
    }

    /**
     * Initializes the value for the {@link InstrumentationConfig#transactionType() transactionType} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link InstrumentationConfig#transactionType() transactionType}.</em>
     * @param transactionType The value for transactionType 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder transactionType(String transactionType) {
      this.transactionType = Preconditions.checkNotNull(transactionType, "transactionType");
      return this;
    }

    /**
     * Initializes the value for the {@link InstrumentationConfig#transactionNameTemplate() transactionNameTemplate} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link InstrumentationConfig#transactionNameTemplate() transactionNameTemplate}.</em>
     * @param transactionNameTemplate The value for transactionNameTemplate 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder transactionNameTemplate(String transactionNameTemplate) {
      this.transactionNameTemplate = Preconditions.checkNotNull(transactionNameTemplate, "transactionNameTemplate");
      return this;
    }

    /**
     * Initializes the value for the {@link InstrumentationConfig#transactionUserTemplate() transactionUserTemplate} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link InstrumentationConfig#transactionUserTemplate() transactionUserTemplate}.</em>
     * @param transactionUserTemplate The value for transactionUserTemplate 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder transactionUserTemplate(String transactionUserTemplate) {
      this.transactionUserTemplate = Preconditions.checkNotNull(transactionUserTemplate, "transactionUserTemplate");
      return this;
    }

    /**
     * Put one entry to the {@link InstrumentationConfig#transactionAttributeTemplates() transactionAttributeTemplates} map.
     * @param key The key in the transactionAttributeTemplates map
     * @param value The associated value in the transactionAttributeTemplates map
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder putTransactionAttributeTemplates(String key, String value) {
      this.transactionAttributeTemplates.put(key, value);
      return this;
    }

    /**
     * Put one entry to the {@link InstrumentationConfig#transactionAttributeTemplates() transactionAttributeTemplates} map. Nulls are not permitted
     * @param entry The key and value entry
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder putTransactionAttributeTemplates(Map.Entry<String, ? extends String> entry) {
      this.transactionAttributeTemplates.put(entry);
      return this;
    }

    /**
     * Sets or replaces all mappings from the specified map as entries for the {@link InstrumentationConfig#transactionAttributeTemplates() transactionAttributeTemplates} map. Nulls are not permitted
     * @param transactionAttributeTemplates The entries that will be added to the transactionAttributeTemplates map
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder transactionAttributeTemplates(Map<String, ? extends String> transactionAttributeTemplates) {
      this.transactionAttributeTemplates = ImmutableMap.builder();
      return putAllTransactionAttributeTemplates(transactionAttributeTemplates);
    }

    /**
     * Put all mappings from the specified map as entries to {@link InstrumentationConfig#transactionAttributeTemplates() transactionAttributeTemplates} map. Nulls are not permitted
     * @param transactionAttributeTemplates The entries that will be added to the transactionAttributeTemplates map
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder putAllTransactionAttributeTemplates(Map<String, ? extends String> transactionAttributeTemplates) {
      this.transactionAttributeTemplates.putAll(transactionAttributeTemplates);
      return this;
    }

    /**
     * Initializes the value for the {@link InstrumentationConfig#transactionSlowThresholdMillis() transactionSlowThresholdMillis} attribute.
     * @param transactionSlowThresholdMillis The value for transactionSlowThresholdMillis (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder transactionSlowThresholdMillis(@Nullable Integer transactionSlowThresholdMillis) {
      this.transactionSlowThresholdMillis = transactionSlowThresholdMillis;
      return this;
    }

    /**
     * Initializes the value for the {@link InstrumentationConfig#transactionOuter() transactionOuter} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link InstrumentationConfig#transactionOuter() transactionOuter}.</em>
     * @param transactionOuter The value for transactionOuter 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder transactionOuter(boolean transactionOuter) {
      this.transactionOuter = transactionOuter;
      optBits |= OPT_BIT_TRANSACTION_OUTER;
      return this;
    }

    /**
     * Initializes the value for the {@link InstrumentationConfig#traceEntryMessageTemplate() traceEntryMessageTemplate} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link InstrumentationConfig#traceEntryMessageTemplate() traceEntryMessageTemplate}.</em>
     * @param traceEntryMessageTemplate The value for traceEntryMessageTemplate 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder traceEntryMessageTemplate(String traceEntryMessageTemplate) {
      this.traceEntryMessageTemplate = Preconditions.checkNotNull(traceEntryMessageTemplate, "traceEntryMessageTemplate");
      return this;
    }

    /**
     * Initializes the value for the {@link InstrumentationConfig#traceEntryStackThresholdMillis() traceEntryStackThresholdMillis} attribute.
     * @param traceEntryStackThresholdMillis The value for traceEntryStackThresholdMillis (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder traceEntryStackThresholdMillis(@Nullable Integer traceEntryStackThresholdMillis) {
      this.traceEntryStackThresholdMillis = traceEntryStackThresholdMillis;
      return this;
    }

    /**
     * Initializes the value for the {@link InstrumentationConfig#traceEntryCaptureSelfNested() traceEntryCaptureSelfNested} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link InstrumentationConfig#traceEntryCaptureSelfNested() traceEntryCaptureSelfNested}.</em>
     * @param traceEntryCaptureSelfNested The value for traceEntryCaptureSelfNested 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder traceEntryCaptureSelfNested(boolean traceEntryCaptureSelfNested) {
      this.traceEntryCaptureSelfNested = traceEntryCaptureSelfNested;
      optBits |= OPT_BIT_TRACE_ENTRY_CAPTURE_SELF_NESTED;
      return this;
    }

    /**
     * Initializes the value for the {@link InstrumentationConfig#timerName() timerName} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link InstrumentationConfig#timerName() timerName}.</em>
     * @param timerName The value for timerName 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder timerName(String timerName) {
      this.timerName = Preconditions.checkNotNull(timerName, "timerName");
      return this;
    }

    /**
     * Initializes the value for the {@link InstrumentationConfig#enabledProperty() enabledProperty} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link InstrumentationConfig#enabledProperty() enabledProperty}.</em>
     * @param enabledProperty The value for enabledProperty 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder enabledProperty(String enabledProperty) {
      this.enabledProperty = Preconditions.checkNotNull(enabledProperty, "enabledProperty");
      return this;
    }

    /**
     * Initializes the value for the {@link InstrumentationConfig#traceEntryEnabledProperty() traceEntryEnabledProperty} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link InstrumentationConfig#traceEntryEnabledProperty() traceEntryEnabledProperty}.</em>
     * @param traceEntryEnabledProperty The value for traceEntryEnabledProperty 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder traceEntryEnabledProperty(String traceEntryEnabledProperty) {
      this.traceEntryEnabledProperty = Preconditions.checkNotNull(traceEntryEnabledProperty, "traceEntryEnabledProperty");
      return this;
    }

    /**
     * Builds a new {@link ImmutableInstrumentationConfig ImmutableInstrumentationConfig}.
     * @return An immutable instance of InstrumentationConfig
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableInstrumentationConfig build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableInstrumentationConfig(this);
    }

    private boolean orderIsSet() {
      return (optBits & OPT_BIT_ORDER) != 0;
    }

    private boolean transactionOuterIsSet() {
      return (optBits & OPT_BIT_TRANSACTION_OUTER) != 0;
    }

    private boolean traceEntryCaptureSelfNestedIsSet() {
      return (optBits & OPT_BIT_TRACE_ENTRY_CAPTURE_SELF_NESTED) != 0;
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_CAPTURE_KIND) != 0) attributes.add("captureKind");
      return "Cannot build InstrumentationConfig, some of required attributes are not set " + attributes;
    }
  }
}
