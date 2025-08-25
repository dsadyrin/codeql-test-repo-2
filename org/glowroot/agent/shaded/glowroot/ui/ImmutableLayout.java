package org.glowroot.agent.shaded.glowroot.ui;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonAutoDetect;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonCreator;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.google.common.base.MoreObjects;
import org.glowroot.agent.shaded.google.common.base.Preconditions;
import org.glowroot.agent.shaded.google.common.collect.ImmutableList;
import org.glowroot.agent.shaded.google.common.collect.ImmutableMap;
import org.glowroot.agent.shaded.google.common.collect.Lists;
import org.glowroot.agent.shaded.google.common.primitives.Booleans;
import org.glowroot.agent.shaded.google.common.primitives.Longs;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.glowroot.agent.shaded.glowroot.common.repo.ConfigRepository;

/**
 * Immutable implementation of {@link LayoutService.Layout}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableLayout.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "LayoutService.Layout"})
@Immutable
final class ImmutableLayout extends LayoutService.Layout {
  private final boolean central;
  private final boolean servlet;
  private final boolean offline;
  private final String glowrootVersion;
  private final boolean loginEnabled;
  private final ImmutableList<ConfigRepository.RollupConfig> rollupConfigs;
  private final ImmutableList<Long> rollupExpirationMillis;
  private final long gaugeCollectionIntervalMillis;
  private final ImmutableMap<String, LayoutService.AgentRollupLayout> agentRollups;
  private final boolean showNavbarTransaction;
  private final boolean showNavbarError;
  private final boolean showNavbarJvm;
  private final boolean showNavbarSyntheticMonitor;
  private final boolean showNavbarIncident;
  private final boolean showNavbarReport;
  private final boolean showNavbarConfig;
  private final boolean adminView;
  private final boolean adminEdit;
  private final boolean loggedIn;
  private final boolean ldap;
  private final boolean redirectToLogin;
  private final String defaultTimeZoneId;
  private final ImmutableList<String> timeZoneIds;
  private final String version;

  private ImmutableLayout(
      boolean central,
      boolean servlet,
      boolean offline,
      String glowrootVersion,
      boolean loginEnabled,
      ImmutableList<ConfigRepository.RollupConfig> rollupConfigs,
      ImmutableList<Long> rollupExpirationMillis,
      long gaugeCollectionIntervalMillis,
      ImmutableMap<String, LayoutService.AgentRollupLayout> agentRollups,
      boolean showNavbarTransaction,
      boolean showNavbarError,
      boolean showNavbarJvm,
      boolean showNavbarSyntheticMonitor,
      boolean showNavbarIncident,
      boolean showNavbarReport,
      boolean showNavbarConfig,
      boolean adminView,
      boolean adminEdit,
      boolean loggedIn,
      boolean ldap,
      boolean redirectToLogin,
      String defaultTimeZoneId,
      ImmutableList<String> timeZoneIds) {
    this.central = central;
    this.servlet = servlet;
    this.offline = offline;
    this.glowrootVersion = glowrootVersion;
    this.loginEnabled = loginEnabled;
    this.rollupConfigs = rollupConfigs;
    this.rollupExpirationMillis = rollupExpirationMillis;
    this.gaugeCollectionIntervalMillis = gaugeCollectionIntervalMillis;
    this.agentRollups = agentRollups;
    this.showNavbarTransaction = showNavbarTransaction;
    this.showNavbarError = showNavbarError;
    this.showNavbarJvm = showNavbarJvm;
    this.showNavbarSyntheticMonitor = showNavbarSyntheticMonitor;
    this.showNavbarIncident = showNavbarIncident;
    this.showNavbarReport = showNavbarReport;
    this.showNavbarConfig = showNavbarConfig;
    this.adminView = adminView;
    this.adminEdit = adminEdit;
    this.loggedIn = loggedIn;
    this.ldap = ldap;
    this.redirectToLogin = redirectToLogin;
    this.defaultTimeZoneId = defaultTimeZoneId;
    this.timeZoneIds = timeZoneIds;
    this.version = Preconditions.checkNotNull(super.version(), "version");
  }

  /**
   * @return The value of the {@code central} attribute
   */
  @JsonProperty("central")
  @Override
  boolean central() {
    return central;
  }

  /**
   * @return The value of the {@code servlet} attribute
   */
  @JsonProperty("servlet")
  @Override
  boolean servlet() {
    return servlet;
  }

  /**
   * @return The value of the {@code offline} attribute
   */
  @JsonProperty("offline")
  @Override
  boolean offline() {
    return offline;
  }

  /**
   * @return The value of the {@code glowrootVersion} attribute
   */
  @JsonProperty("glowrootVersion")
  @Override
  String glowrootVersion() {
    return glowrootVersion;
  }

  /**
   * @return The value of the {@code loginEnabled} attribute
   */
  @JsonProperty("loginEnabled")
  @Override
  boolean loginEnabled() {
    return loginEnabled;
  }

  /**
   * @return The value of the {@code rollupConfigs} attribute
   */
  @JsonProperty("rollupConfigs")
  @Override
  ImmutableList<ConfigRepository.RollupConfig> rollupConfigs() {
    return rollupConfigs;
  }

  /**
   * @return The value of the {@code rollupExpirationMillis} attribute
   */
  @JsonProperty("rollupExpirationMillis")
  @Override
  ImmutableList<Long> rollupExpirationMillis() {
    return rollupExpirationMillis;
  }

  /**
   * @return The value of the {@code gaugeCollectionIntervalMillis} attribute
   */
  @JsonProperty("gaugeCollectionIntervalMillis")
  @Override
  long gaugeCollectionIntervalMillis() {
    return gaugeCollectionIntervalMillis;
  }

  /**
   * @return The value of the {@code agentRollups} attribute
   */
  @JsonProperty("agentRollups")
  @Override
  ImmutableMap<String, LayoutService.AgentRollupLayout> agentRollups() {
    return agentRollups;
  }

  /**
   * @return The value of the {@code showNavbarTransaction} attribute
   */
  @JsonProperty("showNavbarTransaction")
  @Override
  boolean showNavbarTransaction() {
    return showNavbarTransaction;
  }

  /**
   * @return The value of the {@code showNavbarError} attribute
   */
  @JsonProperty("showNavbarError")
  @Override
  boolean showNavbarError() {
    return showNavbarError;
  }

  /**
   * @return The value of the {@code showNavbarJvm} attribute
   */
  @JsonProperty("showNavbarJvm")
  @Override
  boolean showNavbarJvm() {
    return showNavbarJvm;
  }

  /**
   * @return The value of the {@code showNavbarSyntheticMonitor} attribute
   */
  @JsonProperty("showNavbarSyntheticMonitor")
  @Override
  boolean showNavbarSyntheticMonitor() {
    return showNavbarSyntheticMonitor;
  }

  /**
   * @return The value of the {@code showNavbarIncident} attribute
   */
  @JsonProperty("showNavbarIncident")
  @Override
  boolean showNavbarIncident() {
    return showNavbarIncident;
  }

  /**
   * @return The value of the {@code showNavbarReport} attribute
   */
  @JsonProperty("showNavbarReport")
  @Override
  boolean showNavbarReport() {
    return showNavbarReport;
  }

  /**
   * @return The value of the {@code showNavbarConfig} attribute
   */
  @JsonProperty("showNavbarConfig")
  @Override
  boolean showNavbarConfig() {
    return showNavbarConfig;
  }

  /**
   * @return The value of the {@code adminView} attribute
   */
  @JsonProperty("adminView")
  @Override
  boolean adminView() {
    return adminView;
  }

  /**
   * @return The value of the {@code adminEdit} attribute
   */
  @JsonProperty("adminEdit")
  @Override
  boolean adminEdit() {
    return adminEdit;
  }

  /**
   * @return The value of the {@code loggedIn} attribute
   */
  @JsonProperty("loggedIn")
  @Override
  boolean loggedIn() {
    return loggedIn;
  }

  /**
   * @return The value of the {@code ldap} attribute
   */
  @JsonProperty("ldap")
  @Override
  boolean ldap() {
    return ldap;
  }

  /**
   * @return The value of the {@code redirectToLogin} attribute
   */
  @JsonProperty("redirectToLogin")
  @Override
  boolean redirectToLogin() {
    return redirectToLogin;
  }

  /**
   * @return The value of the {@code defaultTimeZoneId} attribute
   */
  @JsonProperty("defaultTimeZoneId")
  @Override
  String defaultTimeZoneId() {
    return defaultTimeZoneId;
  }

  /**
   * @return The value of the {@code timeZoneIds} attribute
   */
  @JsonProperty("timeZoneIds")
  @Override
  ImmutableList<String> timeZoneIds() {
    return timeZoneIds;
  }

  /**
   * @return The computed-at-construction value of the {@code version} attribute
   */
  @JsonProperty("version")
  @Override
  public String version() {
    return version;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LayoutService.Layout#central() central} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for central
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLayout withCentral(boolean value) {
    if (this.central == value) return this;
    return new ImmutableLayout(
        value,
        this.servlet,
        this.offline,
        this.glowrootVersion,
        this.loginEnabled,
        this.rollupConfigs,
        this.rollupExpirationMillis,
        this.gaugeCollectionIntervalMillis,
        this.agentRollups,
        this.showNavbarTransaction,
        this.showNavbarError,
        this.showNavbarJvm,
        this.showNavbarSyntheticMonitor,
        this.showNavbarIncident,
        this.showNavbarReport,
        this.showNavbarConfig,
        this.adminView,
        this.adminEdit,
        this.loggedIn,
        this.ldap,
        this.redirectToLogin,
        this.defaultTimeZoneId,
        this.timeZoneIds);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LayoutService.Layout#servlet() servlet} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for servlet
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLayout withServlet(boolean value) {
    if (this.servlet == value) return this;
    return new ImmutableLayout(
        this.central,
        value,
        this.offline,
        this.glowrootVersion,
        this.loginEnabled,
        this.rollupConfigs,
        this.rollupExpirationMillis,
        this.gaugeCollectionIntervalMillis,
        this.agentRollups,
        this.showNavbarTransaction,
        this.showNavbarError,
        this.showNavbarJvm,
        this.showNavbarSyntheticMonitor,
        this.showNavbarIncident,
        this.showNavbarReport,
        this.showNavbarConfig,
        this.adminView,
        this.adminEdit,
        this.loggedIn,
        this.ldap,
        this.redirectToLogin,
        this.defaultTimeZoneId,
        this.timeZoneIds);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LayoutService.Layout#offline() offline} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for offline
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLayout withOffline(boolean value) {
    if (this.offline == value) return this;
    return new ImmutableLayout(
        this.central,
        this.servlet,
        value,
        this.glowrootVersion,
        this.loginEnabled,
        this.rollupConfigs,
        this.rollupExpirationMillis,
        this.gaugeCollectionIntervalMillis,
        this.agentRollups,
        this.showNavbarTransaction,
        this.showNavbarError,
        this.showNavbarJvm,
        this.showNavbarSyntheticMonitor,
        this.showNavbarIncident,
        this.showNavbarReport,
        this.showNavbarConfig,
        this.adminView,
        this.adminEdit,
        this.loggedIn,
        this.ldap,
        this.redirectToLogin,
        this.defaultTimeZoneId,
        this.timeZoneIds);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LayoutService.Layout#glowrootVersion() glowrootVersion} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for glowrootVersion
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLayout withGlowrootVersion(String value) {
    if (this.glowrootVersion.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "glowrootVersion");
    return new ImmutableLayout(
        this.central,
        this.servlet,
        this.offline,
        newValue,
        this.loginEnabled,
        this.rollupConfigs,
        this.rollupExpirationMillis,
        this.gaugeCollectionIntervalMillis,
        this.agentRollups,
        this.showNavbarTransaction,
        this.showNavbarError,
        this.showNavbarJvm,
        this.showNavbarSyntheticMonitor,
        this.showNavbarIncident,
        this.showNavbarReport,
        this.showNavbarConfig,
        this.adminView,
        this.adminEdit,
        this.loggedIn,
        this.ldap,
        this.redirectToLogin,
        this.defaultTimeZoneId,
        this.timeZoneIds);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LayoutService.Layout#loginEnabled() loginEnabled} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for loginEnabled
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLayout withLoginEnabled(boolean value) {
    if (this.loginEnabled == value) return this;
    return new ImmutableLayout(
        this.central,
        this.servlet,
        this.offline,
        this.glowrootVersion,
        value,
        this.rollupConfigs,
        this.rollupExpirationMillis,
        this.gaugeCollectionIntervalMillis,
        this.agentRollups,
        this.showNavbarTransaction,
        this.showNavbarError,
        this.showNavbarJvm,
        this.showNavbarSyntheticMonitor,
        this.showNavbarIncident,
        this.showNavbarReport,
        this.showNavbarConfig,
        this.adminView,
        this.adminEdit,
        this.loggedIn,
        this.ldap,
        this.redirectToLogin,
        this.defaultTimeZoneId,
        this.timeZoneIds);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link LayoutService.Layout#rollupConfigs() rollupConfigs}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLayout withRollupConfigs(ConfigRepository.RollupConfig... elements) {
    ImmutableList<ConfigRepository.RollupConfig> newValue = ImmutableList.copyOf(elements);
    return new ImmutableLayout(
        this.central,
        this.servlet,
        this.offline,
        this.glowrootVersion,
        this.loginEnabled,
        newValue,
        this.rollupExpirationMillis,
        this.gaugeCollectionIntervalMillis,
        this.agentRollups,
        this.showNavbarTransaction,
        this.showNavbarError,
        this.showNavbarJvm,
        this.showNavbarSyntheticMonitor,
        this.showNavbarIncident,
        this.showNavbarReport,
        this.showNavbarConfig,
        this.adminView,
        this.adminEdit,
        this.loggedIn,
        this.ldap,
        this.redirectToLogin,
        this.defaultTimeZoneId,
        this.timeZoneIds);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link LayoutService.Layout#rollupConfigs() rollupConfigs}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of rollupConfigs elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLayout withRollupConfigs(Iterable<? extends ConfigRepository.RollupConfig> elements) {
    if (this.rollupConfigs == elements) return this;
    ImmutableList<ConfigRepository.RollupConfig> newValue = ImmutableList.copyOf(elements);
    return new ImmutableLayout(
        this.central,
        this.servlet,
        this.offline,
        this.glowrootVersion,
        this.loginEnabled,
        newValue,
        this.rollupExpirationMillis,
        this.gaugeCollectionIntervalMillis,
        this.agentRollups,
        this.showNavbarTransaction,
        this.showNavbarError,
        this.showNavbarJvm,
        this.showNavbarSyntheticMonitor,
        this.showNavbarIncident,
        this.showNavbarReport,
        this.showNavbarConfig,
        this.adminView,
        this.adminEdit,
        this.loggedIn,
        this.ldap,
        this.redirectToLogin,
        this.defaultTimeZoneId,
        this.timeZoneIds);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link LayoutService.Layout#rollupExpirationMillis() rollupExpirationMillis}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLayout withRollupExpirationMillis(long... elements) {
    ImmutableList<Long> newValue = ImmutableList.copyOf(Longs.asList(elements));
    return new ImmutableLayout(
        this.central,
        this.servlet,
        this.offline,
        this.glowrootVersion,
        this.loginEnabled,
        this.rollupConfigs,
        newValue,
        this.gaugeCollectionIntervalMillis,
        this.agentRollups,
        this.showNavbarTransaction,
        this.showNavbarError,
        this.showNavbarJvm,
        this.showNavbarSyntheticMonitor,
        this.showNavbarIncident,
        this.showNavbarReport,
        this.showNavbarConfig,
        this.adminView,
        this.adminEdit,
        this.loggedIn,
        this.ldap,
        this.redirectToLogin,
        this.defaultTimeZoneId,
        this.timeZoneIds);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link LayoutService.Layout#rollupExpirationMillis() rollupExpirationMillis}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of rollupExpirationMillis elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLayout withRollupExpirationMillis(Iterable<Long> elements) {
    if (this.rollupExpirationMillis == elements) return this;
    ImmutableList<Long> newValue = ImmutableList.copyOf(elements);
    return new ImmutableLayout(
        this.central,
        this.servlet,
        this.offline,
        this.glowrootVersion,
        this.loginEnabled,
        this.rollupConfigs,
        newValue,
        this.gaugeCollectionIntervalMillis,
        this.agentRollups,
        this.showNavbarTransaction,
        this.showNavbarError,
        this.showNavbarJvm,
        this.showNavbarSyntheticMonitor,
        this.showNavbarIncident,
        this.showNavbarReport,
        this.showNavbarConfig,
        this.adminView,
        this.adminEdit,
        this.loggedIn,
        this.ldap,
        this.redirectToLogin,
        this.defaultTimeZoneId,
        this.timeZoneIds);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LayoutService.Layout#gaugeCollectionIntervalMillis() gaugeCollectionIntervalMillis} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for gaugeCollectionIntervalMillis
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLayout withGaugeCollectionIntervalMillis(long value) {
    if (this.gaugeCollectionIntervalMillis == value) return this;
    return new ImmutableLayout(
        this.central,
        this.servlet,
        this.offline,
        this.glowrootVersion,
        this.loginEnabled,
        this.rollupConfigs,
        this.rollupExpirationMillis,
        value,
        this.agentRollups,
        this.showNavbarTransaction,
        this.showNavbarError,
        this.showNavbarJvm,
        this.showNavbarSyntheticMonitor,
        this.showNavbarIncident,
        this.showNavbarReport,
        this.showNavbarConfig,
        this.adminView,
        this.adminEdit,
        this.loggedIn,
        this.ldap,
        this.redirectToLogin,
        this.defaultTimeZoneId,
        this.timeZoneIds);
  }

  /**
   * Copy the current immutable object by replacing the {@link LayoutService.Layout#agentRollups() agentRollups} map with the specified map.
   * Nulls are not permitted as keys or values.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param entries The entries to be added to the agentRollups map
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLayout withAgentRollups(Map<String, ? extends LayoutService.AgentRollupLayout> entries) {
    if (this.agentRollups == entries) return this;
    ImmutableMap<String, LayoutService.AgentRollupLayout> newValue = ImmutableMap.copyOf(entries);
    return new ImmutableLayout(
        this.central,
        this.servlet,
        this.offline,
        this.glowrootVersion,
        this.loginEnabled,
        this.rollupConfigs,
        this.rollupExpirationMillis,
        this.gaugeCollectionIntervalMillis,
        newValue,
        this.showNavbarTransaction,
        this.showNavbarError,
        this.showNavbarJvm,
        this.showNavbarSyntheticMonitor,
        this.showNavbarIncident,
        this.showNavbarReport,
        this.showNavbarConfig,
        this.adminView,
        this.adminEdit,
        this.loggedIn,
        this.ldap,
        this.redirectToLogin,
        this.defaultTimeZoneId,
        this.timeZoneIds);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LayoutService.Layout#showNavbarTransaction() showNavbarTransaction} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for showNavbarTransaction
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLayout withShowNavbarTransaction(boolean value) {
    if (this.showNavbarTransaction == value) return this;
    return new ImmutableLayout(
        this.central,
        this.servlet,
        this.offline,
        this.glowrootVersion,
        this.loginEnabled,
        this.rollupConfigs,
        this.rollupExpirationMillis,
        this.gaugeCollectionIntervalMillis,
        this.agentRollups,
        value,
        this.showNavbarError,
        this.showNavbarJvm,
        this.showNavbarSyntheticMonitor,
        this.showNavbarIncident,
        this.showNavbarReport,
        this.showNavbarConfig,
        this.adminView,
        this.adminEdit,
        this.loggedIn,
        this.ldap,
        this.redirectToLogin,
        this.defaultTimeZoneId,
        this.timeZoneIds);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LayoutService.Layout#showNavbarError() showNavbarError} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for showNavbarError
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLayout withShowNavbarError(boolean value) {
    if (this.showNavbarError == value) return this;
    return new ImmutableLayout(
        this.central,
        this.servlet,
        this.offline,
        this.glowrootVersion,
        this.loginEnabled,
        this.rollupConfigs,
        this.rollupExpirationMillis,
        this.gaugeCollectionIntervalMillis,
        this.agentRollups,
        this.showNavbarTransaction,
        value,
        this.showNavbarJvm,
        this.showNavbarSyntheticMonitor,
        this.showNavbarIncident,
        this.showNavbarReport,
        this.showNavbarConfig,
        this.adminView,
        this.adminEdit,
        this.loggedIn,
        this.ldap,
        this.redirectToLogin,
        this.defaultTimeZoneId,
        this.timeZoneIds);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LayoutService.Layout#showNavbarJvm() showNavbarJvm} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for showNavbarJvm
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLayout withShowNavbarJvm(boolean value) {
    if (this.showNavbarJvm == value) return this;
    return new ImmutableLayout(
        this.central,
        this.servlet,
        this.offline,
        this.glowrootVersion,
        this.loginEnabled,
        this.rollupConfigs,
        this.rollupExpirationMillis,
        this.gaugeCollectionIntervalMillis,
        this.agentRollups,
        this.showNavbarTransaction,
        this.showNavbarError,
        value,
        this.showNavbarSyntheticMonitor,
        this.showNavbarIncident,
        this.showNavbarReport,
        this.showNavbarConfig,
        this.adminView,
        this.adminEdit,
        this.loggedIn,
        this.ldap,
        this.redirectToLogin,
        this.defaultTimeZoneId,
        this.timeZoneIds);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LayoutService.Layout#showNavbarSyntheticMonitor() showNavbarSyntheticMonitor} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for showNavbarSyntheticMonitor
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLayout withShowNavbarSyntheticMonitor(boolean value) {
    if (this.showNavbarSyntheticMonitor == value) return this;
    return new ImmutableLayout(
        this.central,
        this.servlet,
        this.offline,
        this.glowrootVersion,
        this.loginEnabled,
        this.rollupConfigs,
        this.rollupExpirationMillis,
        this.gaugeCollectionIntervalMillis,
        this.agentRollups,
        this.showNavbarTransaction,
        this.showNavbarError,
        this.showNavbarJvm,
        value,
        this.showNavbarIncident,
        this.showNavbarReport,
        this.showNavbarConfig,
        this.adminView,
        this.adminEdit,
        this.loggedIn,
        this.ldap,
        this.redirectToLogin,
        this.defaultTimeZoneId,
        this.timeZoneIds);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LayoutService.Layout#showNavbarIncident() showNavbarIncident} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for showNavbarIncident
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLayout withShowNavbarIncident(boolean value) {
    if (this.showNavbarIncident == value) return this;
    return new ImmutableLayout(
        this.central,
        this.servlet,
        this.offline,
        this.glowrootVersion,
        this.loginEnabled,
        this.rollupConfigs,
        this.rollupExpirationMillis,
        this.gaugeCollectionIntervalMillis,
        this.agentRollups,
        this.showNavbarTransaction,
        this.showNavbarError,
        this.showNavbarJvm,
        this.showNavbarSyntheticMonitor,
        value,
        this.showNavbarReport,
        this.showNavbarConfig,
        this.adminView,
        this.adminEdit,
        this.loggedIn,
        this.ldap,
        this.redirectToLogin,
        this.defaultTimeZoneId,
        this.timeZoneIds);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LayoutService.Layout#showNavbarReport() showNavbarReport} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for showNavbarReport
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLayout withShowNavbarReport(boolean value) {
    if (this.showNavbarReport == value) return this;
    return new ImmutableLayout(
        this.central,
        this.servlet,
        this.offline,
        this.glowrootVersion,
        this.loginEnabled,
        this.rollupConfigs,
        this.rollupExpirationMillis,
        this.gaugeCollectionIntervalMillis,
        this.agentRollups,
        this.showNavbarTransaction,
        this.showNavbarError,
        this.showNavbarJvm,
        this.showNavbarSyntheticMonitor,
        this.showNavbarIncident,
        value,
        this.showNavbarConfig,
        this.adminView,
        this.adminEdit,
        this.loggedIn,
        this.ldap,
        this.redirectToLogin,
        this.defaultTimeZoneId,
        this.timeZoneIds);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LayoutService.Layout#showNavbarConfig() showNavbarConfig} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for showNavbarConfig
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLayout withShowNavbarConfig(boolean value) {
    if (this.showNavbarConfig == value) return this;
    return new ImmutableLayout(
        this.central,
        this.servlet,
        this.offline,
        this.glowrootVersion,
        this.loginEnabled,
        this.rollupConfigs,
        this.rollupExpirationMillis,
        this.gaugeCollectionIntervalMillis,
        this.agentRollups,
        this.showNavbarTransaction,
        this.showNavbarError,
        this.showNavbarJvm,
        this.showNavbarSyntheticMonitor,
        this.showNavbarIncident,
        this.showNavbarReport,
        value,
        this.adminView,
        this.adminEdit,
        this.loggedIn,
        this.ldap,
        this.redirectToLogin,
        this.defaultTimeZoneId,
        this.timeZoneIds);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LayoutService.Layout#adminView() adminView} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for adminView
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLayout withAdminView(boolean value) {
    if (this.adminView == value) return this;
    return new ImmutableLayout(
        this.central,
        this.servlet,
        this.offline,
        this.glowrootVersion,
        this.loginEnabled,
        this.rollupConfigs,
        this.rollupExpirationMillis,
        this.gaugeCollectionIntervalMillis,
        this.agentRollups,
        this.showNavbarTransaction,
        this.showNavbarError,
        this.showNavbarJvm,
        this.showNavbarSyntheticMonitor,
        this.showNavbarIncident,
        this.showNavbarReport,
        this.showNavbarConfig,
        value,
        this.adminEdit,
        this.loggedIn,
        this.ldap,
        this.redirectToLogin,
        this.defaultTimeZoneId,
        this.timeZoneIds);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LayoutService.Layout#adminEdit() adminEdit} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for adminEdit
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLayout withAdminEdit(boolean value) {
    if (this.adminEdit == value) return this;
    return new ImmutableLayout(
        this.central,
        this.servlet,
        this.offline,
        this.glowrootVersion,
        this.loginEnabled,
        this.rollupConfigs,
        this.rollupExpirationMillis,
        this.gaugeCollectionIntervalMillis,
        this.agentRollups,
        this.showNavbarTransaction,
        this.showNavbarError,
        this.showNavbarJvm,
        this.showNavbarSyntheticMonitor,
        this.showNavbarIncident,
        this.showNavbarReport,
        this.showNavbarConfig,
        this.adminView,
        value,
        this.loggedIn,
        this.ldap,
        this.redirectToLogin,
        this.defaultTimeZoneId,
        this.timeZoneIds);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LayoutService.Layout#loggedIn() loggedIn} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for loggedIn
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLayout withLoggedIn(boolean value) {
    if (this.loggedIn == value) return this;
    return new ImmutableLayout(
        this.central,
        this.servlet,
        this.offline,
        this.glowrootVersion,
        this.loginEnabled,
        this.rollupConfigs,
        this.rollupExpirationMillis,
        this.gaugeCollectionIntervalMillis,
        this.agentRollups,
        this.showNavbarTransaction,
        this.showNavbarError,
        this.showNavbarJvm,
        this.showNavbarSyntheticMonitor,
        this.showNavbarIncident,
        this.showNavbarReport,
        this.showNavbarConfig,
        this.adminView,
        this.adminEdit,
        value,
        this.ldap,
        this.redirectToLogin,
        this.defaultTimeZoneId,
        this.timeZoneIds);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LayoutService.Layout#ldap() ldap} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for ldap
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLayout withLdap(boolean value) {
    if (this.ldap == value) return this;
    return new ImmutableLayout(
        this.central,
        this.servlet,
        this.offline,
        this.glowrootVersion,
        this.loginEnabled,
        this.rollupConfigs,
        this.rollupExpirationMillis,
        this.gaugeCollectionIntervalMillis,
        this.agentRollups,
        this.showNavbarTransaction,
        this.showNavbarError,
        this.showNavbarJvm,
        this.showNavbarSyntheticMonitor,
        this.showNavbarIncident,
        this.showNavbarReport,
        this.showNavbarConfig,
        this.adminView,
        this.adminEdit,
        this.loggedIn,
        value,
        this.redirectToLogin,
        this.defaultTimeZoneId,
        this.timeZoneIds);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LayoutService.Layout#redirectToLogin() redirectToLogin} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for redirectToLogin
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLayout withRedirectToLogin(boolean value) {
    if (this.redirectToLogin == value) return this;
    return new ImmutableLayout(
        this.central,
        this.servlet,
        this.offline,
        this.glowrootVersion,
        this.loginEnabled,
        this.rollupConfigs,
        this.rollupExpirationMillis,
        this.gaugeCollectionIntervalMillis,
        this.agentRollups,
        this.showNavbarTransaction,
        this.showNavbarError,
        this.showNavbarJvm,
        this.showNavbarSyntheticMonitor,
        this.showNavbarIncident,
        this.showNavbarReport,
        this.showNavbarConfig,
        this.adminView,
        this.adminEdit,
        this.loggedIn,
        this.ldap,
        value,
        this.defaultTimeZoneId,
        this.timeZoneIds);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LayoutService.Layout#defaultTimeZoneId() defaultTimeZoneId} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for defaultTimeZoneId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLayout withDefaultTimeZoneId(String value) {
    if (this.defaultTimeZoneId.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "defaultTimeZoneId");
    return new ImmutableLayout(
        this.central,
        this.servlet,
        this.offline,
        this.glowrootVersion,
        this.loginEnabled,
        this.rollupConfigs,
        this.rollupExpirationMillis,
        this.gaugeCollectionIntervalMillis,
        this.agentRollups,
        this.showNavbarTransaction,
        this.showNavbarError,
        this.showNavbarJvm,
        this.showNavbarSyntheticMonitor,
        this.showNavbarIncident,
        this.showNavbarReport,
        this.showNavbarConfig,
        this.adminView,
        this.adminEdit,
        this.loggedIn,
        this.ldap,
        this.redirectToLogin,
        newValue,
        this.timeZoneIds);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link LayoutService.Layout#timeZoneIds() timeZoneIds}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLayout withTimeZoneIds(String... elements) {
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableLayout(
        this.central,
        this.servlet,
        this.offline,
        this.glowrootVersion,
        this.loginEnabled,
        this.rollupConfigs,
        this.rollupExpirationMillis,
        this.gaugeCollectionIntervalMillis,
        this.agentRollups,
        this.showNavbarTransaction,
        this.showNavbarError,
        this.showNavbarJvm,
        this.showNavbarSyntheticMonitor,
        this.showNavbarIncident,
        this.showNavbarReport,
        this.showNavbarConfig,
        this.adminView,
        this.adminEdit,
        this.loggedIn,
        this.ldap,
        this.redirectToLogin,
        this.defaultTimeZoneId,
        newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link LayoutService.Layout#timeZoneIds() timeZoneIds}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of timeZoneIds elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLayout withTimeZoneIds(Iterable<String> elements) {
    if (this.timeZoneIds == elements) return this;
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableLayout(
        this.central,
        this.servlet,
        this.offline,
        this.glowrootVersion,
        this.loginEnabled,
        this.rollupConfigs,
        this.rollupExpirationMillis,
        this.gaugeCollectionIntervalMillis,
        this.agentRollups,
        this.showNavbarTransaction,
        this.showNavbarError,
        this.showNavbarJvm,
        this.showNavbarSyntheticMonitor,
        this.showNavbarIncident,
        this.showNavbarReport,
        this.showNavbarConfig,
        this.adminView,
        this.adminEdit,
        this.loggedIn,
        this.ldap,
        this.redirectToLogin,
        this.defaultTimeZoneId,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableLayout} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableLayout
        && equalTo((ImmutableLayout) another);
  }

  private boolean equalTo(ImmutableLayout another) {
    return central == another.central
        && servlet == another.servlet
        && offline == another.offline
        && glowrootVersion.equals(another.glowrootVersion)
        && loginEnabled == another.loginEnabled
        && rollupConfigs.equals(another.rollupConfigs)
        && rollupExpirationMillis.equals(another.rollupExpirationMillis)
        && gaugeCollectionIntervalMillis == another.gaugeCollectionIntervalMillis
        && agentRollups.equals(another.agentRollups)
        && showNavbarTransaction == another.showNavbarTransaction
        && showNavbarError == another.showNavbarError
        && showNavbarJvm == another.showNavbarJvm
        && showNavbarSyntheticMonitor == another.showNavbarSyntheticMonitor
        && showNavbarIncident == another.showNavbarIncident
        && showNavbarReport == another.showNavbarReport
        && showNavbarConfig == another.showNavbarConfig
        && adminView == another.adminView
        && adminEdit == another.adminEdit
        && loggedIn == another.loggedIn
        && ldap == another.ldap
        && redirectToLogin == another.redirectToLogin
        && defaultTimeZoneId.equals(another.defaultTimeZoneId)
        && timeZoneIds.equals(another.timeZoneIds)
        && version.equals(another.version);
  }

  /**
   * Computes a hash code from attributes: {@code central}, {@code servlet}, {@code offline}, {@code glowrootVersion}, {@code loginEnabled}, {@code rollupConfigs}, {@code rollupExpirationMillis}, {@code gaugeCollectionIntervalMillis}, {@code agentRollups}, {@code showNavbarTransaction}, {@code showNavbarError}, {@code showNavbarJvm}, {@code showNavbarSyntheticMonitor}, {@code showNavbarIncident}, {@code showNavbarReport}, {@code showNavbarConfig}, {@code adminView}, {@code adminEdit}, {@code loggedIn}, {@code ldap}, {@code redirectToLogin}, {@code defaultTimeZoneId}, {@code timeZoneIds}, {@code version}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Booleans.hashCode(central);
    h += (h << 5) + Booleans.hashCode(servlet);
    h += (h << 5) + Booleans.hashCode(offline);
    h += (h << 5) + glowrootVersion.hashCode();
    h += (h << 5) + Booleans.hashCode(loginEnabled);
    h += (h << 5) + rollupConfigs.hashCode();
    h += (h << 5) + rollupExpirationMillis.hashCode();
    h += (h << 5) + Longs.hashCode(gaugeCollectionIntervalMillis);
    h += (h << 5) + agentRollups.hashCode();
    h += (h << 5) + Booleans.hashCode(showNavbarTransaction);
    h += (h << 5) + Booleans.hashCode(showNavbarError);
    h += (h << 5) + Booleans.hashCode(showNavbarJvm);
    h += (h << 5) + Booleans.hashCode(showNavbarSyntheticMonitor);
    h += (h << 5) + Booleans.hashCode(showNavbarIncident);
    h += (h << 5) + Booleans.hashCode(showNavbarReport);
    h += (h << 5) + Booleans.hashCode(showNavbarConfig);
    h += (h << 5) + Booleans.hashCode(adminView);
    h += (h << 5) + Booleans.hashCode(adminEdit);
    h += (h << 5) + Booleans.hashCode(loggedIn);
    h += (h << 5) + Booleans.hashCode(ldap);
    h += (h << 5) + Booleans.hashCode(redirectToLogin);
    h += (h << 5) + defaultTimeZoneId.hashCode();
    h += (h << 5) + timeZoneIds.hashCode();
    h += (h << 5) + version.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Layout} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("Layout")
        .omitNullValues()
        .add("central", central)
        .add("servlet", servlet)
        .add("offline", offline)
        .add("glowrootVersion", glowrootVersion)
        .add("loginEnabled", loginEnabled)
        .add("rollupConfigs", rollupConfigs)
        .add("rollupExpirationMillis", rollupExpirationMillis)
        .add("gaugeCollectionIntervalMillis", gaugeCollectionIntervalMillis)
        .add("agentRollups", agentRollups)
        .add("showNavbarTransaction", showNavbarTransaction)
        .add("showNavbarError", showNavbarError)
        .add("showNavbarJvm", showNavbarJvm)
        .add("showNavbarSyntheticMonitor", showNavbarSyntheticMonitor)
        .add("showNavbarIncident", showNavbarIncident)
        .add("showNavbarReport", showNavbarReport)
        .add("showNavbarConfig", showNavbarConfig)
        .add("adminView", adminView)
        .add("adminEdit", adminEdit)
        .add("loggedIn", loggedIn)
        .add("ldap", ldap)
        .add("redirectToLogin", redirectToLogin)
        .add("defaultTimeZoneId", defaultTimeZoneId)
        .add("timeZoneIds", timeZoneIds)
        .add("version", version)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends LayoutService.Layout {
    boolean central;
    boolean centralIsSet;
    boolean servlet;
    boolean servletIsSet;
    boolean offline;
    boolean offlineIsSet;
    @Nullable String glowrootVersion;
    boolean loginEnabled;
    boolean loginEnabledIsSet;
    ImmutableList<ConfigRepository.RollupConfig> rollupConfigs = ImmutableList.of();
    ImmutableList<Long> rollupExpirationMillis = ImmutableList.of();
    long gaugeCollectionIntervalMillis;
    boolean gaugeCollectionIntervalMillisIsSet;
    @Nullable ImmutableMap<String, LayoutService.AgentRollupLayout> agentRollups;
    boolean showNavbarTransaction;
    boolean showNavbarTransactionIsSet;
    boolean showNavbarError;
    boolean showNavbarErrorIsSet;
    boolean showNavbarJvm;
    boolean showNavbarJvmIsSet;
    boolean showNavbarSyntheticMonitor;
    boolean showNavbarSyntheticMonitorIsSet;
    boolean showNavbarIncident;
    boolean showNavbarIncidentIsSet;
    boolean showNavbarReport;
    boolean showNavbarReportIsSet;
    boolean showNavbarConfig;
    boolean showNavbarConfigIsSet;
    boolean adminView;
    boolean adminViewIsSet;
    boolean adminEdit;
    boolean adminEditIsSet;
    boolean loggedIn;
    boolean loggedInIsSet;
    boolean ldap;
    boolean ldapIsSet;
    boolean redirectToLogin;
    boolean redirectToLoginIsSet;
    @Nullable String defaultTimeZoneId;
    List<String> timeZoneIds = ImmutableList.of();
    @JsonProperty("central")
    public void setCentral(boolean central) {
      this.central = central;
      this.centralIsSet = true;
    }
    @JsonProperty("servlet")
    public void setServlet(boolean servlet) {
      this.servlet = servlet;
      this.servletIsSet = true;
    }
    @JsonProperty("offline")
    public void setOffline(boolean offline) {
      this.offline = offline;
      this.offlineIsSet = true;
    }
    @JsonProperty("glowrootVersion")
    public void setGlowrootVersion(String glowrootVersion) {
      this.glowrootVersion = glowrootVersion;
    }
    @JsonProperty("loginEnabled")
    public void setLoginEnabled(boolean loginEnabled) {
      this.loginEnabled = loginEnabled;
      this.loginEnabledIsSet = true;
    }
    @JsonProperty("rollupConfigs")
    public void setRollupConfigs(ImmutableList<ConfigRepository.RollupConfig> rollupConfigs) {
      this.rollupConfigs = rollupConfigs;
    }
    @JsonProperty("rollupExpirationMillis")
    public void setRollupExpirationMillis(ImmutableList<Long> rollupExpirationMillis) {
      this.rollupExpirationMillis = rollupExpirationMillis;
    }
    @JsonProperty("gaugeCollectionIntervalMillis")
    public void setGaugeCollectionIntervalMillis(long gaugeCollectionIntervalMillis) {
      this.gaugeCollectionIntervalMillis = gaugeCollectionIntervalMillis;
      this.gaugeCollectionIntervalMillisIsSet = true;
    }
    @JsonProperty("agentRollups")
    public void setAgentRollups(ImmutableMap<String, LayoutService.AgentRollupLayout> agentRollups) {
      this.agentRollups = agentRollups;
    }
    @JsonProperty("showNavbarTransaction")
    public void setShowNavbarTransaction(boolean showNavbarTransaction) {
      this.showNavbarTransaction = showNavbarTransaction;
      this.showNavbarTransactionIsSet = true;
    }
    @JsonProperty("showNavbarError")
    public void setShowNavbarError(boolean showNavbarError) {
      this.showNavbarError = showNavbarError;
      this.showNavbarErrorIsSet = true;
    }
    @JsonProperty("showNavbarJvm")
    public void setShowNavbarJvm(boolean showNavbarJvm) {
      this.showNavbarJvm = showNavbarJvm;
      this.showNavbarJvmIsSet = true;
    }
    @JsonProperty("showNavbarSyntheticMonitor")
    public void setShowNavbarSyntheticMonitor(boolean showNavbarSyntheticMonitor) {
      this.showNavbarSyntheticMonitor = showNavbarSyntheticMonitor;
      this.showNavbarSyntheticMonitorIsSet = true;
    }
    @JsonProperty("showNavbarIncident")
    public void setShowNavbarIncident(boolean showNavbarIncident) {
      this.showNavbarIncident = showNavbarIncident;
      this.showNavbarIncidentIsSet = true;
    }
    @JsonProperty("showNavbarReport")
    public void setShowNavbarReport(boolean showNavbarReport) {
      this.showNavbarReport = showNavbarReport;
      this.showNavbarReportIsSet = true;
    }
    @JsonProperty("showNavbarConfig")
    public void setShowNavbarConfig(boolean showNavbarConfig) {
      this.showNavbarConfig = showNavbarConfig;
      this.showNavbarConfigIsSet = true;
    }
    @JsonProperty("adminView")
    public void setAdminView(boolean adminView) {
      this.adminView = adminView;
      this.adminViewIsSet = true;
    }
    @JsonProperty("adminEdit")
    public void setAdminEdit(boolean adminEdit) {
      this.adminEdit = adminEdit;
      this.adminEditIsSet = true;
    }
    @JsonProperty("loggedIn")
    public void setLoggedIn(boolean loggedIn) {
      this.loggedIn = loggedIn;
      this.loggedInIsSet = true;
    }
    @JsonProperty("ldap")
    public void setLdap(boolean ldap) {
      this.ldap = ldap;
      this.ldapIsSet = true;
    }
    @JsonProperty("redirectToLogin")
    public void setRedirectToLogin(boolean redirectToLogin) {
      this.redirectToLogin = redirectToLogin;
      this.redirectToLoginIsSet = true;
    }
    @JsonProperty("defaultTimeZoneId")
    public void setDefaultTimeZoneId(String defaultTimeZoneId) {
      this.defaultTimeZoneId = defaultTimeZoneId;
    }
    @JsonProperty("timeZoneIds")
    public void setTimeZoneIds(List<String> timeZoneIds) {
      this.timeZoneIds = timeZoneIds;
    }
    @Override
    boolean central() { throw new UnsupportedOperationException(); }
    @Override
    boolean servlet() { throw new UnsupportedOperationException(); }
    @Override
    boolean offline() { throw new UnsupportedOperationException(); }
    @Override
    String glowrootVersion() { throw new UnsupportedOperationException(); }
    @Override
    boolean loginEnabled() { throw new UnsupportedOperationException(); }
    @Override
    ImmutableList<ConfigRepository.RollupConfig> rollupConfigs() { throw new UnsupportedOperationException(); }
    @Override
    ImmutableList<Long> rollupExpirationMillis() { throw new UnsupportedOperationException(); }
    @Override
    long gaugeCollectionIntervalMillis() { throw new UnsupportedOperationException(); }
    @Override
    ImmutableMap<String, LayoutService.AgentRollupLayout> agentRollups() { throw new UnsupportedOperationException(); }
    @Override
    boolean showNavbarTransaction() { throw new UnsupportedOperationException(); }
    @Override
    boolean showNavbarError() { throw new UnsupportedOperationException(); }
    @Override
    boolean showNavbarJvm() { throw new UnsupportedOperationException(); }
    @Override
    boolean showNavbarSyntheticMonitor() { throw new UnsupportedOperationException(); }
    @Override
    boolean showNavbarIncident() { throw new UnsupportedOperationException(); }
    @Override
    boolean showNavbarReport() { throw new UnsupportedOperationException(); }
    @Override
    boolean showNavbarConfig() { throw new UnsupportedOperationException(); }
    @Override
    boolean adminView() { throw new UnsupportedOperationException(); }
    @Override
    boolean adminEdit() { throw new UnsupportedOperationException(); }
    @Override
    boolean loggedIn() { throw new UnsupportedOperationException(); }
    @Override
    boolean ldap() { throw new UnsupportedOperationException(); }
    @Override
    boolean redirectToLogin() { throw new UnsupportedOperationException(); }
    @Override
    String defaultTimeZoneId() { throw new UnsupportedOperationException(); }
    @Override
    List<String> timeZoneIds() { throw new UnsupportedOperationException(); }
    @Override
    public String version() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableLayout fromJson(Json json) {
    ImmutableLayout.Builder builder = ImmutableLayout.builder();
    if (json.centralIsSet) {
      builder.central(json.central);
    }
    if (json.servletIsSet) {
      builder.servlet(json.servlet);
    }
    if (json.offlineIsSet) {
      builder.offline(json.offline);
    }
    if (json.glowrootVersion != null) {
      builder.glowrootVersion(json.glowrootVersion);
    }
    if (json.loginEnabledIsSet) {
      builder.loginEnabled(json.loginEnabled);
    }
    if (json.rollupConfigs != null) {
      builder.addAllRollupConfigs(json.rollupConfigs);
    }
    if (json.rollupExpirationMillis != null) {
      builder.addAllRollupExpirationMillis(json.rollupExpirationMillis);
    }
    if (json.gaugeCollectionIntervalMillisIsSet) {
      builder.gaugeCollectionIntervalMillis(json.gaugeCollectionIntervalMillis);
    }
    if (json.agentRollups != null) {
      builder.putAllAgentRollups(json.agentRollups);
    }
    if (json.showNavbarTransactionIsSet) {
      builder.showNavbarTransaction(json.showNavbarTransaction);
    }
    if (json.showNavbarErrorIsSet) {
      builder.showNavbarError(json.showNavbarError);
    }
    if (json.showNavbarJvmIsSet) {
      builder.showNavbarJvm(json.showNavbarJvm);
    }
    if (json.showNavbarSyntheticMonitorIsSet) {
      builder.showNavbarSyntheticMonitor(json.showNavbarSyntheticMonitor);
    }
    if (json.showNavbarIncidentIsSet) {
      builder.showNavbarIncident(json.showNavbarIncident);
    }
    if (json.showNavbarReportIsSet) {
      builder.showNavbarReport(json.showNavbarReport);
    }
    if (json.showNavbarConfigIsSet) {
      builder.showNavbarConfig(json.showNavbarConfig);
    }
    if (json.adminViewIsSet) {
      builder.adminView(json.adminView);
    }
    if (json.adminEditIsSet) {
      builder.adminEdit(json.adminEdit);
    }
    if (json.loggedInIsSet) {
      builder.loggedIn(json.loggedIn);
    }
    if (json.ldapIsSet) {
      builder.ldap(json.ldap);
    }
    if (json.redirectToLoginIsSet) {
      builder.redirectToLogin(json.redirectToLogin);
    }
    if (json.defaultTimeZoneId != null) {
      builder.defaultTimeZoneId(json.defaultTimeZoneId);
    }
    if (json.timeZoneIds != null) {
      builder.addAllTimeZoneIds(json.timeZoneIds);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link LayoutService.Layout} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Layout instance
   */
  public static ImmutableLayout copyOf(LayoutService.Layout instance) {
    if (instance instanceof ImmutableLayout) {
      return (ImmutableLayout) instance;
    }
    return ImmutableLayout.builder()
        .copyFrom(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableLayout ImmutableLayout}.
   * @return A new ImmutableLayout builder
   */
  public static ImmutableLayout.Builder builder() {
    return new ImmutableLayout.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableLayout ImmutableLayout}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_CENTRAL = 0x1L;
    private static final long INIT_BIT_SERVLET = 0x2L;
    private static final long INIT_BIT_OFFLINE = 0x4L;
    private static final long INIT_BIT_GLOWROOT_VERSION = 0x8L;
    private static final long INIT_BIT_LOGIN_ENABLED = 0x10L;
    private static final long INIT_BIT_GAUGE_COLLECTION_INTERVAL_MILLIS = 0x20L;
    private static final long INIT_BIT_SHOW_NAVBAR_TRANSACTION = 0x40L;
    private static final long INIT_BIT_SHOW_NAVBAR_ERROR = 0x80L;
    private static final long INIT_BIT_SHOW_NAVBAR_JVM = 0x100L;
    private static final long INIT_BIT_SHOW_NAVBAR_SYNTHETIC_MONITOR = 0x200L;
    private static final long INIT_BIT_SHOW_NAVBAR_INCIDENT = 0x400L;
    private static final long INIT_BIT_SHOW_NAVBAR_REPORT = 0x800L;
    private static final long INIT_BIT_SHOW_NAVBAR_CONFIG = 0x1000L;
    private static final long INIT_BIT_ADMIN_VIEW = 0x2000L;
    private static final long INIT_BIT_ADMIN_EDIT = 0x4000L;
    private static final long INIT_BIT_LOGGED_IN = 0x8000L;
    private static final long INIT_BIT_LDAP = 0x10000L;
    private static final long INIT_BIT_REDIRECT_TO_LOGIN = 0x20000L;
    private static final long INIT_BIT_DEFAULT_TIME_ZONE_ID = 0x40000L;
    private long initBits = 0x7ffffL;

    private boolean central;
    private boolean servlet;
    private boolean offline;
    private @Nullable String glowrootVersion;
    private boolean loginEnabled;
    private ImmutableList.Builder<ConfigRepository.RollupConfig> rollupConfigs = ImmutableList.builder();
    private ImmutableList.Builder<Long> rollupExpirationMillis = ImmutableList.builder();
    private long gaugeCollectionIntervalMillis;
    private ImmutableMap.Builder<String, LayoutService.AgentRollupLayout> agentRollups = ImmutableMap.builder();
    private boolean showNavbarTransaction;
    private boolean showNavbarError;
    private boolean showNavbarJvm;
    private boolean showNavbarSyntheticMonitor;
    private boolean showNavbarIncident;
    private boolean showNavbarReport;
    private boolean showNavbarConfig;
    private boolean adminView;
    private boolean adminEdit;
    private boolean loggedIn;
    private boolean ldap;
    private boolean redirectToLogin;
    private @Nullable String defaultTimeZoneId;
    private ImmutableList.Builder<String> timeZoneIds = ImmutableList.builder();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Layout} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder copyFrom(LayoutService.Layout instance) {
      Preconditions.checkNotNull(instance, "instance");
      central(instance.central());
      servlet(instance.servlet());
      offline(instance.offline());
      glowrootVersion(instance.glowrootVersion());
      loginEnabled(instance.loginEnabled());
      addAllRollupConfigs(instance.rollupConfigs());
      addAllRollupExpirationMillis(instance.rollupExpirationMillis());
      gaugeCollectionIntervalMillis(instance.gaugeCollectionIntervalMillis());
      putAllAgentRollups(instance.agentRollups());
      showNavbarTransaction(instance.showNavbarTransaction());
      showNavbarError(instance.showNavbarError());
      showNavbarJvm(instance.showNavbarJvm());
      showNavbarSyntheticMonitor(instance.showNavbarSyntheticMonitor());
      showNavbarIncident(instance.showNavbarIncident());
      showNavbarReport(instance.showNavbarReport());
      showNavbarConfig(instance.showNavbarConfig());
      adminView(instance.adminView());
      adminEdit(instance.adminEdit());
      loggedIn(instance.loggedIn());
      ldap(instance.ldap());
      redirectToLogin(instance.redirectToLogin());
      defaultTimeZoneId(instance.defaultTimeZoneId());
      addAllTimeZoneIds(instance.timeZoneIds());
      return this;
    }

    /**
     * Initializes the value for the {@link LayoutService.Layout#central() central} attribute.
     * @param central The value for central 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder central(boolean central) {
      this.central = central;
      initBits &= ~INIT_BIT_CENTRAL;
      return this;
    }

    /**
     * Initializes the value for the {@link LayoutService.Layout#servlet() servlet} attribute.
     * @param servlet The value for servlet 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder servlet(boolean servlet) {
      this.servlet = servlet;
      initBits &= ~INIT_BIT_SERVLET;
      return this;
    }

    /**
     * Initializes the value for the {@link LayoutService.Layout#offline() offline} attribute.
     * @param offline The value for offline 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder offline(boolean offline) {
      this.offline = offline;
      initBits &= ~INIT_BIT_OFFLINE;
      return this;
    }

    /**
     * Initializes the value for the {@link LayoutService.Layout#glowrootVersion() glowrootVersion} attribute.
     * @param glowrootVersion The value for glowrootVersion 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder glowrootVersion(String glowrootVersion) {
      this.glowrootVersion = Preconditions.checkNotNull(glowrootVersion, "glowrootVersion");
      initBits &= ~INIT_BIT_GLOWROOT_VERSION;
      return this;
    }

    /**
     * Initializes the value for the {@link LayoutService.Layout#loginEnabled() loginEnabled} attribute.
     * @param loginEnabled The value for loginEnabled 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder loginEnabled(boolean loginEnabled) {
      this.loginEnabled = loginEnabled;
      initBits &= ~INIT_BIT_LOGIN_ENABLED;
      return this;
    }

    /**
     * Adds one element to {@link LayoutService.Layout#rollupConfigs() rollupConfigs} list.
     * @param element A rollupConfigs element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addRollupConfigs(ConfigRepository.RollupConfig element) {
      this.rollupConfigs.add(element);
      return this;
    }

    /**
     * Adds elements to {@link LayoutService.Layout#rollupConfigs() rollupConfigs} list.
     * @param elements An array of rollupConfigs elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addRollupConfigs(ConfigRepository.RollupConfig... elements) {
      this.rollupConfigs.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link LayoutService.Layout#rollupConfigs() rollupConfigs} list.
     * @param elements An iterable of rollupConfigs elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder rollupConfigs(Iterable<? extends ConfigRepository.RollupConfig> elements) {
      this.rollupConfigs = ImmutableList.builder();
      return addAllRollupConfigs(elements);
    }

    /**
     * Adds elements to {@link LayoutService.Layout#rollupConfigs() rollupConfigs} list.
     * @param elements An iterable of rollupConfigs elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllRollupConfigs(Iterable<? extends ConfigRepository.RollupConfig> elements) {
      this.rollupConfigs.addAll(elements);
      return this;
    }

    /**
     * Adds one element to {@link LayoutService.Layout#rollupExpirationMillis() rollupExpirationMillis} list.
     * @param element A rollupExpirationMillis element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addRollupExpirationMillis(long element) {
      this.rollupExpirationMillis.add(element);
      return this;
    }

    /**
     * Adds elements to {@link LayoutService.Layout#rollupExpirationMillis() rollupExpirationMillis} list.
     * @param elements An array of rollupExpirationMillis elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addRollupExpirationMillis(long... elements) {
      this.rollupExpirationMillis.addAll(Longs.asList(elements));
      return this;
    }

    /**
     * Sets or replaces all elements for {@link LayoutService.Layout#rollupExpirationMillis() rollupExpirationMillis} list.
     * @param elements An iterable of rollupExpirationMillis elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder rollupExpirationMillis(Iterable<Long> elements) {
      this.rollupExpirationMillis = ImmutableList.builder();
      return addAllRollupExpirationMillis(elements);
    }

    /**
     * Adds elements to {@link LayoutService.Layout#rollupExpirationMillis() rollupExpirationMillis} list.
     * @param elements An iterable of rollupExpirationMillis elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllRollupExpirationMillis(Iterable<Long> elements) {
      this.rollupExpirationMillis.addAll(elements);
      return this;
    }

    /**
     * Initializes the value for the {@link LayoutService.Layout#gaugeCollectionIntervalMillis() gaugeCollectionIntervalMillis} attribute.
     * @param gaugeCollectionIntervalMillis The value for gaugeCollectionIntervalMillis 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder gaugeCollectionIntervalMillis(long gaugeCollectionIntervalMillis) {
      this.gaugeCollectionIntervalMillis = gaugeCollectionIntervalMillis;
      initBits &= ~INIT_BIT_GAUGE_COLLECTION_INTERVAL_MILLIS;
      return this;
    }

    /**
     * Put one entry to the {@link LayoutService.Layout#agentRollups() agentRollups} map.
     * @param key The key in the agentRollups map
     * @param value The associated value in the agentRollups map
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder putAgentRollups(String key, LayoutService.AgentRollupLayout value) {
      this.agentRollups.put(key, value);
      return this;
    }

    /**
     * Put one entry to the {@link LayoutService.Layout#agentRollups() agentRollups} map. Nulls are not permitted
     * @param entry The key and value entry
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder putAgentRollups(Map.Entry<String, ? extends LayoutService.AgentRollupLayout> entry) {
      this.agentRollups.put(entry);
      return this;
    }

    /**
     * Sets or replaces all mappings from the specified map as entries for the {@link LayoutService.Layout#agentRollups() agentRollups} map. Nulls are not permitted
     * @param agentRollups The entries that will be added to the agentRollups map
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder agentRollups(Map<String, ? extends LayoutService.AgentRollupLayout> agentRollups) {
      this.agentRollups = ImmutableMap.builder();
      return putAllAgentRollups(agentRollups);
    }

    /**
     * Put all mappings from the specified map as entries to {@link LayoutService.Layout#agentRollups() agentRollups} map. Nulls are not permitted
     * @param agentRollups The entries that will be added to the agentRollups map
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder putAllAgentRollups(Map<String, ? extends LayoutService.AgentRollupLayout> agentRollups) {
      this.agentRollups.putAll(agentRollups);
      return this;
    }

    /**
     * Initializes the value for the {@link LayoutService.Layout#showNavbarTransaction() showNavbarTransaction} attribute.
     * @param showNavbarTransaction The value for showNavbarTransaction 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder showNavbarTransaction(boolean showNavbarTransaction) {
      this.showNavbarTransaction = showNavbarTransaction;
      initBits &= ~INIT_BIT_SHOW_NAVBAR_TRANSACTION;
      return this;
    }

    /**
     * Initializes the value for the {@link LayoutService.Layout#showNavbarError() showNavbarError} attribute.
     * @param showNavbarError The value for showNavbarError 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder showNavbarError(boolean showNavbarError) {
      this.showNavbarError = showNavbarError;
      initBits &= ~INIT_BIT_SHOW_NAVBAR_ERROR;
      return this;
    }

    /**
     * Initializes the value for the {@link LayoutService.Layout#showNavbarJvm() showNavbarJvm} attribute.
     * @param showNavbarJvm The value for showNavbarJvm 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder showNavbarJvm(boolean showNavbarJvm) {
      this.showNavbarJvm = showNavbarJvm;
      initBits &= ~INIT_BIT_SHOW_NAVBAR_JVM;
      return this;
    }

    /**
     * Initializes the value for the {@link LayoutService.Layout#showNavbarSyntheticMonitor() showNavbarSyntheticMonitor} attribute.
     * @param showNavbarSyntheticMonitor The value for showNavbarSyntheticMonitor 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder showNavbarSyntheticMonitor(boolean showNavbarSyntheticMonitor) {
      this.showNavbarSyntheticMonitor = showNavbarSyntheticMonitor;
      initBits &= ~INIT_BIT_SHOW_NAVBAR_SYNTHETIC_MONITOR;
      return this;
    }

    /**
     * Initializes the value for the {@link LayoutService.Layout#showNavbarIncident() showNavbarIncident} attribute.
     * @param showNavbarIncident The value for showNavbarIncident 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder showNavbarIncident(boolean showNavbarIncident) {
      this.showNavbarIncident = showNavbarIncident;
      initBits &= ~INIT_BIT_SHOW_NAVBAR_INCIDENT;
      return this;
    }

    /**
     * Initializes the value for the {@link LayoutService.Layout#showNavbarReport() showNavbarReport} attribute.
     * @param showNavbarReport The value for showNavbarReport 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder showNavbarReport(boolean showNavbarReport) {
      this.showNavbarReport = showNavbarReport;
      initBits &= ~INIT_BIT_SHOW_NAVBAR_REPORT;
      return this;
    }

    /**
     * Initializes the value for the {@link LayoutService.Layout#showNavbarConfig() showNavbarConfig} attribute.
     * @param showNavbarConfig The value for showNavbarConfig 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder showNavbarConfig(boolean showNavbarConfig) {
      this.showNavbarConfig = showNavbarConfig;
      initBits &= ~INIT_BIT_SHOW_NAVBAR_CONFIG;
      return this;
    }

    /**
     * Initializes the value for the {@link LayoutService.Layout#adminView() adminView} attribute.
     * @param adminView The value for adminView 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder adminView(boolean adminView) {
      this.adminView = adminView;
      initBits &= ~INIT_BIT_ADMIN_VIEW;
      return this;
    }

    /**
     * Initializes the value for the {@link LayoutService.Layout#adminEdit() adminEdit} attribute.
     * @param adminEdit The value for adminEdit 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder adminEdit(boolean adminEdit) {
      this.adminEdit = adminEdit;
      initBits &= ~INIT_BIT_ADMIN_EDIT;
      return this;
    }

    /**
     * Initializes the value for the {@link LayoutService.Layout#loggedIn() loggedIn} attribute.
     * @param loggedIn The value for loggedIn 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder loggedIn(boolean loggedIn) {
      this.loggedIn = loggedIn;
      initBits &= ~INIT_BIT_LOGGED_IN;
      return this;
    }

    /**
     * Initializes the value for the {@link LayoutService.Layout#ldap() ldap} attribute.
     * @param ldap The value for ldap 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder ldap(boolean ldap) {
      this.ldap = ldap;
      initBits &= ~INIT_BIT_LDAP;
      return this;
    }

    /**
     * Initializes the value for the {@link LayoutService.Layout#redirectToLogin() redirectToLogin} attribute.
     * @param redirectToLogin The value for redirectToLogin 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder redirectToLogin(boolean redirectToLogin) {
      this.redirectToLogin = redirectToLogin;
      initBits &= ~INIT_BIT_REDIRECT_TO_LOGIN;
      return this;
    }

    /**
     * Initializes the value for the {@link LayoutService.Layout#defaultTimeZoneId() defaultTimeZoneId} attribute.
     * @param defaultTimeZoneId The value for defaultTimeZoneId 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder defaultTimeZoneId(String defaultTimeZoneId) {
      this.defaultTimeZoneId = Preconditions.checkNotNull(defaultTimeZoneId, "defaultTimeZoneId");
      initBits &= ~INIT_BIT_DEFAULT_TIME_ZONE_ID;
      return this;
    }

    /**
     * Adds one element to {@link LayoutService.Layout#timeZoneIds() timeZoneIds} list.
     * @param element A timeZoneIds element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addTimeZoneIds(String element) {
      this.timeZoneIds.add(element);
      return this;
    }

    /**
     * Adds elements to {@link LayoutService.Layout#timeZoneIds() timeZoneIds} list.
     * @param elements An array of timeZoneIds elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addTimeZoneIds(String... elements) {
      this.timeZoneIds.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link LayoutService.Layout#timeZoneIds() timeZoneIds} list.
     * @param elements An iterable of timeZoneIds elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder timeZoneIds(Iterable<String> elements) {
      this.timeZoneIds = ImmutableList.builder();
      return addAllTimeZoneIds(elements);
    }

    /**
     * Adds elements to {@link LayoutService.Layout#timeZoneIds() timeZoneIds} list.
     * @param elements An iterable of timeZoneIds elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllTimeZoneIds(Iterable<String> elements) {
      this.timeZoneIds.addAll(elements);
      return this;
    }

    /**
     * Builds a new {@link ImmutableLayout ImmutableLayout}.
     * @return An immutable instance of Layout
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableLayout build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableLayout(
          central,
          servlet,
          offline,
          glowrootVersion,
          loginEnabled,
          rollupConfigs.build(),
          rollupExpirationMillis.build(),
          gaugeCollectionIntervalMillis,
          agentRollups.build(),
          showNavbarTransaction,
          showNavbarError,
          showNavbarJvm,
          showNavbarSyntheticMonitor,
          showNavbarIncident,
          showNavbarReport,
          showNavbarConfig,
          adminView,
          adminEdit,
          loggedIn,
          ldap,
          redirectToLogin,
          defaultTimeZoneId,
          timeZoneIds.build());
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_CENTRAL) != 0) attributes.add("central");
      if ((initBits & INIT_BIT_SERVLET) != 0) attributes.add("servlet");
      if ((initBits & INIT_BIT_OFFLINE) != 0) attributes.add("offline");
      if ((initBits & INIT_BIT_GLOWROOT_VERSION) != 0) attributes.add("glowrootVersion");
      if ((initBits & INIT_BIT_LOGIN_ENABLED) != 0) attributes.add("loginEnabled");
      if ((initBits & INIT_BIT_GAUGE_COLLECTION_INTERVAL_MILLIS) != 0) attributes.add("gaugeCollectionIntervalMillis");
      if ((initBits & INIT_BIT_SHOW_NAVBAR_TRANSACTION) != 0) attributes.add("showNavbarTransaction");
      if ((initBits & INIT_BIT_SHOW_NAVBAR_ERROR) != 0) attributes.add("showNavbarError");
      if ((initBits & INIT_BIT_SHOW_NAVBAR_JVM) != 0) attributes.add("showNavbarJvm");
      if ((initBits & INIT_BIT_SHOW_NAVBAR_SYNTHETIC_MONITOR) != 0) attributes.add("showNavbarSyntheticMonitor");
      if ((initBits & INIT_BIT_SHOW_NAVBAR_INCIDENT) != 0) attributes.add("showNavbarIncident");
      if ((initBits & INIT_BIT_SHOW_NAVBAR_REPORT) != 0) attributes.add("showNavbarReport");
      if ((initBits & INIT_BIT_SHOW_NAVBAR_CONFIG) != 0) attributes.add("showNavbarConfig");
      if ((initBits & INIT_BIT_ADMIN_VIEW) != 0) attributes.add("adminView");
      if ((initBits & INIT_BIT_ADMIN_EDIT) != 0) attributes.add("adminEdit");
      if ((initBits & INIT_BIT_LOGGED_IN) != 0) attributes.add("loggedIn");
      if ((initBits & INIT_BIT_LDAP) != 0) attributes.add("ldap");
      if ((initBits & INIT_BIT_REDIRECT_TO_LOGIN) != 0) attributes.add("redirectToLogin");
      if ((initBits & INIT_BIT_DEFAULT_TIME_ZONE_ID) != 0) attributes.add("defaultTimeZoneId");
      return "Cannot build Layout, some of required attributes are not set " + attributes;
    }
  }
}
