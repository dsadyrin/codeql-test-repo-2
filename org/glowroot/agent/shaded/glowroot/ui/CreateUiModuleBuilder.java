package org.glowroot.agent.shaded.glowroot.ui;

import org.glowroot.agent.shaded.google.common.base.Preconditions;
import org.glowroot.agent.shaded.google.common.base.Ticker;
import org.glowroot.agent.shaded.google.common.collect.Lists;
import java.io.File;
import java.util.List;
import java.util.regex.Pattern;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.NotThreadSafe;
import org.glowroot.agent.shaded.glowroot.common.live.LiveAggregateRepository;
import org.glowroot.agent.shaded.glowroot.common.live.LiveJvmService;
import org.glowroot.agent.shaded.glowroot.common.live.LiveTraceRepository;
import org.glowroot.agent.shaded.glowroot.common.live.LiveWeavingService;
import org.glowroot.agent.shaded.glowroot.common.repo.AgentRollupRepository;
import org.glowroot.agent.shaded.glowroot.common.repo.AggregateRepository;
import org.glowroot.agent.shaded.glowroot.common.repo.ConfigRepository;
import org.glowroot.agent.shaded.glowroot.common.repo.EnvironmentRepository;
import org.glowroot.agent.shaded.glowroot.common.repo.GaugeValueRepository;
import org.glowroot.agent.shaded.glowroot.common.repo.RepoAdmin;
import org.glowroot.agent.shaded.glowroot.common.repo.SyntheticResultRepository;
import org.glowroot.agent.shaded.glowroot.common.repo.TraceAttributeNameRepository;
import org.glowroot.agent.shaded.glowroot.common.repo.TraceRepository;
import org.glowroot.agent.shaded.glowroot.common.repo.TransactionTypeRepository;
import org.glowroot.agent.shaded.glowroot.common.repo.TriggeredAlertRepository;
import org.glowroot.agent.shaded.glowroot.common.repo.util.HttpClient;
import org.glowroot.agent.shaded.glowroot.common.repo.util.RollupLevelService;
import org.glowroot.agent.shaded.glowroot.common.util.Clock;

/**
 * {@code CreateUiModuleBuilder} collects parameters and invokes the static factory method:
 * {@code org.glowroot.agent.shaded.glowroot.ui.UiModule.createUiModule(..)}.
 * Call the {@link #build()} method to get a result of type {@code org.glowroot.agent.shaded.glowroot.ui.UiModule}.
 * <p><em>{@code CreateUiModuleBuilder} is not thread-safe and generally should not be stored in a field or collection,
 * but instead used immediately to create instances.</em>
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "UiModule.createUiModule"})
@NotThreadSafe
public final class CreateUiModuleBuilder {
  private static final long INIT_BIT_CENTRAL = 0x1L;
  private static final long INIT_BIT_SERVLET = 0x2L;
  private static final long INIT_BIT_OFFLINE = 0x4L;
  private static final long INIT_BIT_CONF_DIR = 0x8L;
  private static final long INIT_BIT_LOG_DIR = 0x10L;
  private static final long INIT_BIT_LOG_FILE_NAME_PATTERN = 0x20L;
  private static final long INIT_BIT_CLOCK = 0x40L;
  private static final long INIT_BIT_CONFIG_REPOSITORY = 0x80L;
  private static final long INIT_BIT_AGENT_ROLLUP_REPOSITORY = 0x100L;
  private static final long INIT_BIT_ENVIRONMENT_REPOSITORY = 0x200L;
  private static final long INIT_BIT_TRANSACTION_TYPE_REPOSITORY = 0x400L;
  private static final long INIT_BIT_AGGREGATE_REPOSITORY = 0x800L;
  private static final long INIT_BIT_TRACE_ATTRIBUTE_NAME_REPOSITORY = 0x1000L;
  private static final long INIT_BIT_TRACE_REPOSITORY = 0x2000L;
  private static final long INIT_BIT_GAUGE_VALUE_REPOSITORY = 0x4000L;
  private static final long INIT_BIT_TRIGGERED_ALERT_REPOSITORY = 0x8000L;
  private static final long INIT_BIT_REPO_ADMIN = 0x10000L;
  private static final long INIT_BIT_ROLLUP_LEVEL_SERVICE = 0x20000L;
  private static final long INIT_BIT_LIVE_TRACE_REPOSITORY = 0x40000L;
  private static final long INIT_BIT_LIVE_AGGREGATE_REPOSITORY = 0x80000L;
  private static final long INIT_BIT_SESSION_MAP_FACTORY = 0x100000L;
  private static final long INIT_BIT_HTTP_CLIENT = 0x200000L;
  private static final long INIT_BIT_NUM_WORKER_THREADS = 0x400000L;
  private static final long INIT_BIT_VERSION = 0x800000L;
  private long initBits = 0xffffffL;

  private boolean central;
  private boolean servlet;
  private boolean offline;
  private @Nullable String bindAddress;
  private @Nullable Integer port;
  private @Nullable Boolean https;
  private @Nullable String contextPath;
  private @Nullable File confDir;
  private @Nullable File sharedConfDir;
  private @Nullable File logDir;
  private @Nullable Pattern logFileNamePattern;
  private @Nullable Ticker ticker;
  private @Nullable Clock clock;
  private @Nullable LiveJvmService liveJvmService;
  private @Nullable ConfigRepository configRepository;
  private @Nullable AgentRollupRepository agentRollupRepository;
  private @Nullable EnvironmentRepository environmentRepository;
  private @Nullable TransactionTypeRepository transactionTypeRepository;
  private @Nullable AggregateRepository aggregateRepository;
  private @Nullable TraceAttributeNameRepository traceAttributeNameRepository;
  private @Nullable TraceRepository traceRepository;
  private @Nullable GaugeValueRepository gaugeValueRepository;
  private @Nullable SyntheticResultRepository syntheticResultRepository;
  private @Nullable TriggeredAlertRepository triggeredAlertRepository;
  private @Nullable RepoAdmin repoAdmin;
  private @Nullable RollupLevelService rollupLevelService;
  private @Nullable LiveTraceRepository liveTraceRepository;
  private @Nullable LiveAggregateRepository liveAggregateRepository;
  private @Nullable LiveWeavingService liveWeavingService;
  private @Nullable SessionMapFactory sessionMapFactory;
  private @Nullable HttpClient httpClient;
  private int numWorkerThreads;
  private @Nullable String version;

  /**
   * Creates a {@code CreateUiModuleBuilder} factory builder.
   */
  public CreateUiModuleBuilder() {
  }

  /**
   * Initializes the value for the {@code central} attribute.
   * @param central The value for central 
   * @return {@code this} builder for use in a chained invocation
   */
  public final CreateUiModuleBuilder central(boolean central) {
    this.central = central;
    initBits &= ~INIT_BIT_CENTRAL;
    return this;
  }

  /**
   * Initializes the value for the {@code servlet} attribute.
   * @param servlet The value for servlet 
   * @return {@code this} builder for use in a chained invocation
   */
  public final CreateUiModuleBuilder servlet(boolean servlet) {
    this.servlet = servlet;
    initBits &= ~INIT_BIT_SERVLET;
    return this;
  }

  /**
   * Initializes the value for the {@code offline} attribute.
   * @param offline The value for offline 
   * @return {@code this} builder for use in a chained invocation
   */
  public final CreateUiModuleBuilder offline(boolean offline) {
    this.offline = offline;
    initBits &= ~INIT_BIT_OFFLINE;
    return this;
  }

  /**
   * Initializes the value for the {@code bindAddress} attribute.
   * @param bindAddress The value for bindAddress (can be {@code null})
   * @return {@code this} builder for use in a chained invocation
   */
  public final CreateUiModuleBuilder bindAddress(@Nullable String bindAddress) {
    this.bindAddress = bindAddress;
    return this;
  }

  /**
   * Initializes the value for the {@code port} attribute.
   * @param port The value for port (can be {@code null})
   * @return {@code this} builder for use in a chained invocation
   */
  public final CreateUiModuleBuilder port(@Nullable Integer port) {
    this.port = port;
    return this;
  }

  /**
   * Initializes the value for the {@code https} attribute.
   * @param https The value for https (can be {@code null})
   * @return {@code this} builder for use in a chained invocation
   */
  public final CreateUiModuleBuilder https(@Nullable Boolean https) {
    this.https = https;
    return this;
  }

  /**
   * Initializes the value for the {@code contextPath} attribute.
   * @param contextPath The value for contextPath (can be {@code null})
   * @return {@code this} builder for use in a chained invocation
   */
  public final CreateUiModuleBuilder contextPath(@Nullable String contextPath) {
    this.contextPath = contextPath;
    return this;
  }

  /**
   * Initializes the value for the {@code confDir} attribute.
   * @param confDir The value for confDir 
   * @return {@code this} builder for use in a chained invocation
   */
  public final CreateUiModuleBuilder confDir(File confDir) {
    this.confDir = Preconditions.checkNotNull(confDir, "confDir");
    initBits &= ~INIT_BIT_CONF_DIR;
    return this;
  }

  /**
   * Initializes the value for the {@code sharedConfDir} attribute.
   * @param sharedConfDir The value for sharedConfDir (can be {@code null})
   * @return {@code this} builder for use in a chained invocation
   */
  public final CreateUiModuleBuilder sharedConfDir(@Nullable File sharedConfDir) {
    this.sharedConfDir = sharedConfDir;
    return this;
  }

  /**
   * Initializes the value for the {@code logDir} attribute.
   * @param logDir The value for logDir 
   * @return {@code this} builder for use in a chained invocation
   */
  public final CreateUiModuleBuilder logDir(File logDir) {
    this.logDir = Preconditions.checkNotNull(logDir, "logDir");
    initBits &= ~INIT_BIT_LOG_DIR;
    return this;
  }

  /**
   * Initializes the value for the {@code logFileNamePattern} attribute.
   * @param logFileNamePattern The value for logFileNamePattern 
   * @return {@code this} builder for use in a chained invocation
   */
  public final CreateUiModuleBuilder logFileNamePattern(Pattern logFileNamePattern) {
    this.logFileNamePattern = Preconditions.checkNotNull(logFileNamePattern, "logFileNamePattern");
    initBits &= ~INIT_BIT_LOG_FILE_NAME_PATTERN;
    return this;
  }

  /**
   * Initializes the value for the {@code ticker} attribute.
   * @param ticker The value for ticker (can be {@code null})
   * @return {@code this} builder for use in a chained invocation
   */
  public final CreateUiModuleBuilder ticker(@Nullable Ticker ticker) {
    this.ticker = ticker;
    return this;
  }

  /**
   * Initializes the value for the {@code clock} attribute.
   * @param clock The value for clock 
   * @return {@code this} builder for use in a chained invocation
   */
  public final CreateUiModuleBuilder clock(Clock clock) {
    this.clock = Preconditions.checkNotNull(clock, "clock");
    initBits &= ~INIT_BIT_CLOCK;
    return this;
  }

  /**
   * Initializes the value for the {@code liveJvmService} attribute.
   * @param liveJvmService The value for liveJvmService (can be {@code null})
   * @return {@code this} builder for use in a chained invocation
   */
  public final CreateUiModuleBuilder liveJvmService(@Nullable LiveJvmService liveJvmService) {
    this.liveJvmService = liveJvmService;
    return this;
  }

  /**
   * Initializes the value for the {@code configRepository} attribute.
   * @param configRepository The value for configRepository 
   * @return {@code this} builder for use in a chained invocation
   */
  public final CreateUiModuleBuilder configRepository(ConfigRepository configRepository) {
    this.configRepository = Preconditions.checkNotNull(configRepository, "configRepository");
    initBits &= ~INIT_BIT_CONFIG_REPOSITORY;
    return this;
  }

  /**
   * Initializes the value for the {@code agentRollupRepository} attribute.
   * @param agentRollupRepository The value for agentRollupRepository 
   * @return {@code this} builder for use in a chained invocation
   */
  public final CreateUiModuleBuilder agentRollupRepository(AgentRollupRepository agentRollupRepository) {
    this.agentRollupRepository = Preconditions.checkNotNull(agentRollupRepository, "agentRollupRepository");
    initBits &= ~INIT_BIT_AGENT_ROLLUP_REPOSITORY;
    return this;
  }

  /**
   * Initializes the value for the {@code environmentRepository} attribute.
   * @param environmentRepository The value for environmentRepository 
   * @return {@code this} builder for use in a chained invocation
   */
  public final CreateUiModuleBuilder environmentRepository(EnvironmentRepository environmentRepository) {
    this.environmentRepository = Preconditions.checkNotNull(environmentRepository, "environmentRepository");
    initBits &= ~INIT_BIT_ENVIRONMENT_REPOSITORY;
    return this;
  }

  /**
   * Initializes the value for the {@code transactionTypeRepository} attribute.
   * @param transactionTypeRepository The value for transactionTypeRepository 
   * @return {@code this} builder for use in a chained invocation
   */
  public final CreateUiModuleBuilder transactionTypeRepository(TransactionTypeRepository transactionTypeRepository) {
    this.transactionTypeRepository = Preconditions.checkNotNull(transactionTypeRepository, "transactionTypeRepository");
    initBits &= ~INIT_BIT_TRANSACTION_TYPE_REPOSITORY;
    return this;
  }

  /**
   * Initializes the value for the {@code aggregateRepository} attribute.
   * @param aggregateRepository The value for aggregateRepository 
   * @return {@code this} builder for use in a chained invocation
   */
  public final CreateUiModuleBuilder aggregateRepository(AggregateRepository aggregateRepository) {
    this.aggregateRepository = Preconditions.checkNotNull(aggregateRepository, "aggregateRepository");
    initBits &= ~INIT_BIT_AGGREGATE_REPOSITORY;
    return this;
  }

  /**
   * Initializes the value for the {@code traceAttributeNameRepository} attribute.
   * @param traceAttributeNameRepository The value for traceAttributeNameRepository 
   * @return {@code this} builder for use in a chained invocation
   */
  public final CreateUiModuleBuilder traceAttributeNameRepository(TraceAttributeNameRepository traceAttributeNameRepository) {
    this.traceAttributeNameRepository = Preconditions.checkNotNull(traceAttributeNameRepository, "traceAttributeNameRepository");
    initBits &= ~INIT_BIT_TRACE_ATTRIBUTE_NAME_REPOSITORY;
    return this;
  }

  /**
   * Initializes the value for the {@code traceRepository} attribute.
   * @param traceRepository The value for traceRepository 
   * @return {@code this} builder for use in a chained invocation
   */
  public final CreateUiModuleBuilder traceRepository(TraceRepository traceRepository) {
    this.traceRepository = Preconditions.checkNotNull(traceRepository, "traceRepository");
    initBits &= ~INIT_BIT_TRACE_REPOSITORY;
    return this;
  }

  /**
   * Initializes the value for the {@code gaugeValueRepository} attribute.
   * @param gaugeValueRepository The value for gaugeValueRepository 
   * @return {@code this} builder for use in a chained invocation
   */
  public final CreateUiModuleBuilder gaugeValueRepository(GaugeValueRepository gaugeValueRepository) {
    this.gaugeValueRepository = Preconditions.checkNotNull(gaugeValueRepository, "gaugeValueRepository");
    initBits &= ~INIT_BIT_GAUGE_VALUE_REPOSITORY;
    return this;
  }

  /**
   * Initializes the value for the {@code syntheticResultRepository} attribute.
   * @param syntheticResultRepository The value for syntheticResultRepository (can be {@code null})
   * @return {@code this} builder for use in a chained invocation
   */
  public final CreateUiModuleBuilder syntheticResultRepository(@Nullable SyntheticResultRepository syntheticResultRepository) {
    this.syntheticResultRepository = syntheticResultRepository;
    return this;
  }

  /**
   * Initializes the value for the {@code triggeredAlertRepository} attribute.
   * @param triggeredAlertRepository The value for triggeredAlertRepository 
   * @return {@code this} builder for use in a chained invocation
   */
  public final CreateUiModuleBuilder triggeredAlertRepository(TriggeredAlertRepository triggeredAlertRepository) {
    this.triggeredAlertRepository = Preconditions.checkNotNull(triggeredAlertRepository, "triggeredAlertRepository");
    initBits &= ~INIT_BIT_TRIGGERED_ALERT_REPOSITORY;
    return this;
  }

  /**
   * Initializes the value for the {@code repoAdmin} attribute.
   * @param repoAdmin The value for repoAdmin 
   * @return {@code this} builder for use in a chained invocation
   */
  public final CreateUiModuleBuilder repoAdmin(RepoAdmin repoAdmin) {
    this.repoAdmin = Preconditions.checkNotNull(repoAdmin, "repoAdmin");
    initBits &= ~INIT_BIT_REPO_ADMIN;
    return this;
  }

  /**
   * Initializes the value for the {@code rollupLevelService} attribute.
   * @param rollupLevelService The value for rollupLevelService 
   * @return {@code this} builder for use in a chained invocation
   */
  public final CreateUiModuleBuilder rollupLevelService(RollupLevelService rollupLevelService) {
    this.rollupLevelService = Preconditions.checkNotNull(rollupLevelService, "rollupLevelService");
    initBits &= ~INIT_BIT_ROLLUP_LEVEL_SERVICE;
    return this;
  }

  /**
   * Initializes the value for the {@code liveTraceRepository} attribute.
   * @param liveTraceRepository The value for liveTraceRepository 
   * @return {@code this} builder for use in a chained invocation
   */
  public final CreateUiModuleBuilder liveTraceRepository(LiveTraceRepository liveTraceRepository) {
    this.liveTraceRepository = Preconditions.checkNotNull(liveTraceRepository, "liveTraceRepository");
    initBits &= ~INIT_BIT_LIVE_TRACE_REPOSITORY;
    return this;
  }

  /**
   * Initializes the value for the {@code liveAggregateRepository} attribute.
   * @param liveAggregateRepository The value for liveAggregateRepository 
   * @return {@code this} builder for use in a chained invocation
   */
  public final CreateUiModuleBuilder liveAggregateRepository(LiveAggregateRepository liveAggregateRepository) {
    this.liveAggregateRepository = Preconditions.checkNotNull(liveAggregateRepository, "liveAggregateRepository");
    initBits &= ~INIT_BIT_LIVE_AGGREGATE_REPOSITORY;
    return this;
  }

  /**
   * Initializes the value for the {@code liveWeavingService} attribute.
   * @param liveWeavingService The value for liveWeavingService (can be {@code null})
   * @return {@code this} builder for use in a chained invocation
   */
  public final CreateUiModuleBuilder liveWeavingService(@Nullable LiveWeavingService liveWeavingService) {
    this.liveWeavingService = liveWeavingService;
    return this;
  }

  /**
   * Initializes the value for the {@code sessionMapFactory} attribute.
   * @param sessionMapFactory The value for sessionMapFactory 
   * @return {@code this} builder for use in a chained invocation
   */
  public final CreateUiModuleBuilder sessionMapFactory(SessionMapFactory sessionMapFactory) {
    this.sessionMapFactory = Preconditions.checkNotNull(sessionMapFactory, "sessionMapFactory");
    initBits &= ~INIT_BIT_SESSION_MAP_FACTORY;
    return this;
  }

  /**
   * Initializes the value for the {@code httpClient} attribute.
   * @param httpClient The value for httpClient 
   * @return {@code this} builder for use in a chained invocation
   */
  public final CreateUiModuleBuilder httpClient(HttpClient httpClient) {
    this.httpClient = Preconditions.checkNotNull(httpClient, "httpClient");
    initBits &= ~INIT_BIT_HTTP_CLIENT;
    return this;
  }

  /**
   * Initializes the value for the {@code numWorkerThreads} attribute.
   * @param numWorkerThreads The value for numWorkerThreads 
   * @return {@code this} builder for use in a chained invocation
   */
  public final CreateUiModuleBuilder numWorkerThreads(int numWorkerThreads) {
    this.numWorkerThreads = numWorkerThreads;
    initBits &= ~INIT_BIT_NUM_WORKER_THREADS;
    return this;
  }

  /**
   * Initializes the value for the {@code version} attribute.
   * @param version The value for version 
   * @return {@code this} builder for use in a chained invocation
   */
  public final CreateUiModuleBuilder version(String version) {
    this.version = Preconditions.checkNotNull(version, "version");
    initBits &= ~INIT_BIT_VERSION;
    return this;
  }

  /**
   * Invokes {@code org.glowroot.agent.shaded.glowroot.ui.UiModule.createUiModule(..)} using the collected parameters and returns the result of the invocation
   * @return A result of type {@code org.glowroot.agent.shaded.glowroot.ui.UiModule}
   * @throws java.lang.IllegalStateException if any required attributes are missing
   */
  public UiModule build() throws IllegalStateException, Exception {
    checkRequiredAttributes();
    return UiModule.createUiModule(central,
        servlet,
        offline,
        bindAddress,
        port,
        https,
        contextPath,
        confDir,
        sharedConfDir,
        logDir,
        logFileNamePattern,
        ticker,
        clock,
        liveJvmService,
        configRepository,
        agentRollupRepository,
        environmentRepository,
        transactionTypeRepository,
        aggregateRepository,
        traceAttributeNameRepository,
        traceRepository,
        gaugeValueRepository,
        syntheticResultRepository,
        triggeredAlertRepository,
        repoAdmin,
        rollupLevelService,
        liveTraceRepository,
        liveAggregateRepository,
        liveWeavingService,
        sessionMapFactory,
        httpClient,
        numWorkerThreads,
        version);
  }

  private boolean centralIsSet() {
    return (initBits & INIT_BIT_CENTRAL) == 0;
  }

  private boolean servletIsSet() {
    return (initBits & INIT_BIT_SERVLET) == 0;
  }

  private boolean offlineIsSet() {
    return (initBits & INIT_BIT_OFFLINE) == 0;
  }

  private boolean confDirIsSet() {
    return (initBits & INIT_BIT_CONF_DIR) == 0;
  }

  private boolean logDirIsSet() {
    return (initBits & INIT_BIT_LOG_DIR) == 0;
  }

  private boolean logFileNamePatternIsSet() {
    return (initBits & INIT_BIT_LOG_FILE_NAME_PATTERN) == 0;
  }

  private boolean clockIsSet() {
    return (initBits & INIT_BIT_CLOCK) == 0;
  }

  private boolean configRepositoryIsSet() {
    return (initBits & INIT_BIT_CONFIG_REPOSITORY) == 0;
  }

  private boolean agentRollupRepositoryIsSet() {
    return (initBits & INIT_BIT_AGENT_ROLLUP_REPOSITORY) == 0;
  }

  private boolean environmentRepositoryIsSet() {
    return (initBits & INIT_BIT_ENVIRONMENT_REPOSITORY) == 0;
  }

  private boolean transactionTypeRepositoryIsSet() {
    return (initBits & INIT_BIT_TRANSACTION_TYPE_REPOSITORY) == 0;
  }

  private boolean aggregateRepositoryIsSet() {
    return (initBits & INIT_BIT_AGGREGATE_REPOSITORY) == 0;
  }

  private boolean traceAttributeNameRepositoryIsSet() {
    return (initBits & INIT_BIT_TRACE_ATTRIBUTE_NAME_REPOSITORY) == 0;
  }

  private boolean traceRepositoryIsSet() {
    return (initBits & INIT_BIT_TRACE_REPOSITORY) == 0;
  }

  private boolean gaugeValueRepositoryIsSet() {
    return (initBits & INIT_BIT_GAUGE_VALUE_REPOSITORY) == 0;
  }

  private boolean triggeredAlertRepositoryIsSet() {
    return (initBits & INIT_BIT_TRIGGERED_ALERT_REPOSITORY) == 0;
  }

  private boolean repoAdminIsSet() {
    return (initBits & INIT_BIT_REPO_ADMIN) == 0;
  }

  private boolean rollupLevelServiceIsSet() {
    return (initBits & INIT_BIT_ROLLUP_LEVEL_SERVICE) == 0;
  }

  private boolean liveTraceRepositoryIsSet() {
    return (initBits & INIT_BIT_LIVE_TRACE_REPOSITORY) == 0;
  }

  private boolean liveAggregateRepositoryIsSet() {
    return (initBits & INIT_BIT_LIVE_AGGREGATE_REPOSITORY) == 0;
  }

  private boolean sessionMapFactoryIsSet() {
    return (initBits & INIT_BIT_SESSION_MAP_FACTORY) == 0;
  }

  private boolean httpClientIsSet() {
    return (initBits & INIT_BIT_HTTP_CLIENT) == 0;
  }

  private boolean numWorkerThreadsIsSet() {
    return (initBits & INIT_BIT_NUM_WORKER_THREADS) == 0;
  }

  private boolean versionIsSet() {
    return (initBits & INIT_BIT_VERSION) == 0;
  }

  private void checkRequiredAttributes() throws IllegalStateException {
    if (initBits != 0) {
      throw new IllegalStateException(formatRequiredAttributesMessage());
    }
  }

  private String formatRequiredAttributesMessage() {
    List<String> attributes = Lists.newArrayList();
    if (!centralIsSet()) attributes.add("central");
    if (!servletIsSet()) attributes.add("servlet");
    if (!offlineIsSet()) attributes.add("offline");
    if (!confDirIsSet()) attributes.add("confDir");
    if (!logDirIsSet()) attributes.add("logDir");
    if (!logFileNamePatternIsSet()) attributes.add("logFileNamePattern");
    if (!clockIsSet()) attributes.add("clock");
    if (!configRepositoryIsSet()) attributes.add("configRepository");
    if (!agentRollupRepositoryIsSet()) attributes.add("agentRollupRepository");
    if (!environmentRepositoryIsSet()) attributes.add("environmentRepository");
    if (!transactionTypeRepositoryIsSet()) attributes.add("transactionTypeRepository");
    if (!aggregateRepositoryIsSet()) attributes.add("aggregateRepository");
    if (!traceAttributeNameRepositoryIsSet()) attributes.add("traceAttributeNameRepository");
    if (!traceRepositoryIsSet()) attributes.add("traceRepository");
    if (!gaugeValueRepositoryIsSet()) attributes.add("gaugeValueRepository");
    if (!triggeredAlertRepositoryIsSet()) attributes.add("triggeredAlertRepository");
    if (!repoAdminIsSet()) attributes.add("repoAdmin");
    if (!rollupLevelServiceIsSet()) attributes.add("rollupLevelService");
    if (!liveTraceRepositoryIsSet()) attributes.add("liveTraceRepository");
    if (!liveAggregateRepositoryIsSet()) attributes.add("liveAggregateRepository");
    if (!sessionMapFactoryIsSet()) attributes.add("sessionMapFactory");
    if (!httpClientIsSet()) attributes.add("httpClient");
    if (!numWorkerThreadsIsSet()) attributes.add("numWorkerThreads");
    if (!versionIsSet()) attributes.add("version");
    return "Cannot build createUiModule, some of required attributes are not set " + attributes;
  }
}
