/*
 * Copyright 2014-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.glowroot.agent.shaded.glowroot.ui;

import java.util.List;

import javax.annotation.Nullable;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonInclude;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonInclude.Include;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonSubTypes;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonSubTypes.Type;
import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonTypeInfo;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.ObjectMapper;
import org.glowroot.agent.shaded.google.common.annotations.VisibleForTesting;
import org.glowroot.agent.shaded.google.common.base.Optional;
import org.glowroot.agent.shaded.google.common.collect.ImmutableList;
import org.glowroot.agent.shaded.google.common.collect.Lists;
import org.glowroot.agent.shaded.google.common.collect.Ordering;
import org.glowroot.agent.shaded.netty.handler.codec.http.HttpResponseStatus;
import org.immutables.value.Value;

import org.glowroot.agent.shaded.glowroot.common.config.PagerDutyConfig.PagerDutyIntegrationKey;
import org.glowroot.agent.shaded.glowroot.common.repo.ConfigRepository;
import org.glowroot.agent.shaded.glowroot.common.repo.GaugeValueRepository;
import org.glowroot.agent.shaded.glowroot.common.repo.GaugeValueRepository.Gauge;
import org.glowroot.agent.shaded.glowroot.common.repo.Utils;
import org.glowroot.agent.shaded.glowroot.common.repo.util.AlertingService;
import org.glowroot.agent.shaded.glowroot.common.repo.util.Gauges;
import org.glowroot.agent.shaded.glowroot.common.util.Formatting;
import org.glowroot.agent.shaded.glowroot.common.util.ObjectMappers;
import org.glowroot.agent.shaded.glowroot.common.util.Styles;
import org.glowroot.agent.shaded.glowroot.common.util.Versions;
import org.glowroot.agent.shaded.glowroot.ui.GaugeValueJsonService.GaugeOrdering;
import org.glowroot.agent.shaded.glowroot.wire.api.model.AgentConfigOuterClass.AgentConfig;
import org.glowroot.agent.shaded.glowroot.wire.api.model.AgentConfigOuterClass.AgentConfig.AlertConfig;
import org.glowroot.agent.shaded.glowroot.wire.api.model.AgentConfigOuterClass.AgentConfig.AlertConfig.AlertCondition;
import org.glowroot.agent.shaded.glowroot.wire.api.model.AgentConfigOuterClass.AgentConfig.AlertConfig.AlertCondition.HeartbeatCondition;
import org.glowroot.agent.shaded.glowroot.wire.api.model.AgentConfigOuterClass.AgentConfig.AlertConfig.AlertCondition.MetricCondition;
import org.glowroot.agent.shaded.glowroot.wire.api.model.AgentConfigOuterClass.AgentConfig.AlertConfig.AlertCondition.SyntheticMonitorCondition;
import org.glowroot.agent.shaded.glowroot.wire.api.model.AgentConfigOuterClass.AgentConfig.AlertConfig.AlertNotification;
import org.glowroot.agent.shaded.glowroot.wire.api.model.AgentConfigOuterClass.AgentConfig.SyntheticMonitorConfig;
import org.glowroot.agent.shaded.glowroot.wire.api.model.Proto.OptionalDouble;

import static org.glowroot.agent.shaded.google.common.base.Preconditions.checkNotNull;
import static org.glowroot.agent.shaded.google.common.base.Preconditions.checkState;

@JsonService
class AlertConfigJsonService {

    private static final ObjectMapper mapper = ObjectMappers.create();

    @VisibleForTesting
    static final Ordering<AlertListItem> orderingByName = new Ordering<AlertListItem>() {
        @Override
        public int compare(AlertListItem left, AlertListItem right) {
            return left.display().compareToIgnoreCase(right.display());
        }
    };

    private final ConfigRepository configRepository;
    private final GaugeValueRepository gaugeValueRepository;
    private final boolean central;

    AlertConfigJsonService(ConfigRepository configRepository,
            GaugeValueRepository gaugeValueRepository, boolean central) {
        this.configRepository = configRepository;
        this.gaugeValueRepository = gaugeValueRepository;
        this.central = central;
    }

    // central supports alert configs on rollups
    @GET(path = "/backend/config/alerts", permission = "agent:config:view:alert")
    String getAlert(@BindAgentRollupId String agentRollupId,
            @BindRequest AlertConfigRequest request) throws Exception {
        Optional<String> version = request.version();
        if (version.isPresent()) {
            AlertConfig alertConfig = configRepository.getAlertConfig(agentRollupId, version.get());
            if (alertConfig == null) {
                throw new JsonServiceException(HttpResponseStatus.NOT_FOUND);
            }
            return getAlertResponse(agentRollupId, alertConfig);
        } else {
            List<AlertListItem> alertListItems = Lists.newArrayList();
            List<AlertConfig> alertConfigs = configRepository.getAlertConfigs(agentRollupId);
            for (AlertConfig alertConfig : alertConfigs) {
                alertListItems.add(ImmutableAlertListItem.of(Versions.getVersion(alertConfig),
                        getConditionDisplay(agentRollupId, alertConfig.getCondition(),
                                configRepository)));
            }
            alertListItems = orderingByName.immutableSortedCopy(alertListItems);
            return mapper.writeValueAsString(alertListItems);
        }
    }

    // central supports alert configs on rollups
    @GET(path = "/backend/config/alert-dropdowns", permission = "agent:config:view:alert")
    String getAlertDropdowns(@BindAgentRollupId String agentRollupId) throws Exception {
        return mapper.writeValueAsString(ImmutableAlertConfigResponse.builder()
                .addAllGauges(getGaugeDropdownItems(agentRollupId))
                .addAllSyntheticMonitors(getSyntheticMonitorDropdownItems(agentRollupId))
                .addAllPagerDutyIntegrationKeys(
                        configRepository.getPagerDutyConfig().integrationKeys())
                .build());
    }

    // central supports alert configs on rollups
    @POST(path = "/backend/config/alerts/add", permission = "agent:config:edit:alert")
    String addAlert(@BindAgentRollupId String agentRollupId, @BindRequest AlertConfigDto configDto)
            throws Exception {
        AlertConfig alertConfig = configDto.toProto();
        configRepository.insertAlertConfig(agentRollupId, alertConfig);
        return getAlertResponse(agentRollupId, alertConfig);
    }

    // central supports alert configs on rollups
    @POST(path = "/backend/config/alerts/update", permission = "agent:config:edit:alert")
    String updateAlert(@BindAgentRollupId String agentRollupId,
            @BindRequest AlertConfigDto configDto) throws Exception {
        AlertConfig alertConfig = configDto.toProto();
        configRepository.updateAlertConfig(agentRollupId, alertConfig, configDto.version().get());
        return getAlertResponse(agentRollupId, alertConfig);
    }

    // central supports alert configs on rollups
    @POST(path = "/backend/config/alerts/remove", permission = "agent:config:edit:alert")
    void removeAlert(@BindAgentRollupId String agentRollupId,
            @BindRequest AlertConfigRequest request) throws Exception {
        configRepository.deleteAlertConfig(agentRollupId, request.version().get());
    }

    private String getAlertResponse(String agentRollupId, AlertConfig alertConfig)
            throws Exception {
        return mapper.writeValueAsString(ImmutableAlertConfigResponse.builder()
                .config(AlertConfigDto.toDto(alertConfig))
                .heading(getConditionDisplay(agentRollupId, alertConfig.getCondition(),
                        configRepository))
                .addAllGauges(getGaugeDropdownItems(agentRollupId))
                .addAllSyntheticMonitors(getSyntheticMonitorDropdownItems(agentRollupId))
                .addAllPagerDutyIntegrationKeys(
                        configRepository.getPagerDutyConfig().integrationKeys())
                .build());
    }

    private List<Gauge> getGaugeDropdownItems(String agentRollupId) throws Exception {
        List<Gauge> gauges = gaugeValueRepository.getGauges(agentRollupId);
        return new GaugeOrdering().immutableSortedCopy(gauges);
    }

    private List<SyntheticMonitorItem> getSyntheticMonitorDropdownItems(String agentRollupId)
            throws Exception {
        if (!central) {
            return ImmutableList.of();
        }
        List<SyntheticMonitorItem> items = Lists.newArrayList();
        for (SyntheticMonitorConfig config : configRepository
                .getSyntheticMonitorConfigs(agentRollupId)) {
            items.add(ImmutableSyntheticMonitorItem.of(config.getId(), config.getDisplay()));
        }
        return items;
    }

    static String getConditionDisplay(String agentRollupId, AlertCondition alertCondition,
            ConfigRepository configRepository) throws Exception {
        switch (alertCondition.getValCase()) {
            case METRIC_CONDITION:
                return getConditionDisplay(alertCondition.getMetricCondition());
            case SYNTHETIC_MONITOR_CONDITION:
                SyntheticMonitorCondition condition = alertCondition.getSyntheticMonitorCondition();
                SyntheticMonitorConfig syntheticMonitorConfig =
                        configRepository.getSyntheticMonitorConfig(agentRollupId,
                                condition.getSyntheticMonitorId());
                return getConditionDisplay(condition,
                        syntheticMonitorConfig);
            case HEARTBEAT_CONDITION:
                return getConditionDisplay(alertCondition.getHeartbeatCondition());
            default:
                throw new IllegalStateException(
                        "Unexpected alert condition: " + alertCondition.getValCase().name());
        }
    }

    private static String getConditionDisplay(MetricCondition metricCondition) {
        StringBuilder sb = new StringBuilder();
        String metric = metricCondition.getMetric();
        String transactionType = metricCondition.getTransactionType();
        if (!transactionType.isEmpty()) {
            sb.append(transactionType);
            sb.append(" - ");
        }
        String transactionName = metricCondition.getTransactionName();
        if (!transactionName.isEmpty()) {
            sb.append(transactionName);
            sb.append(" - ");
        }
        Gauge gauge = null;
        if (metric.startsWith("gauge:")) {
            String gaugeName = metric.substring("gauge:".length());
            gauge = Gauges.getGauge(gaugeName);
            sb.append("Gauge - ");
            sb.append(gauge.display());
            sb.append(" - ");
        }
        if (metric.equals("transaction:x-percentile")) {
            checkState(metricCondition.hasPercentile());
            sb.append(
                    Utils.getPercentileWithSuffix(metricCondition.getPercentile().getValue()));
            sb.append(" percentile");
        } else if (metric.equals("transaction:average")) {
            sb.append("average");
        } else if (metric.equals("transaction:count")) {
            sb.append("transaction count");
        } else if (metric.equals("error:rate")) {
            sb.append("error rate");
        } else if (metric.equals("error:count")) {
            sb.append("error count");
        } else if (metric.startsWith("gauge:")) {
            sb.append("average");
        } else {
            throw new IllegalStateException("Unexpected metric: " + metric);
        }
        sb.append(
                AlertingService.getOverTheLastMinutesText(metricCondition.getTimePeriodSeconds()));
        if (metricCondition.getLowerBoundThreshold()) {
            sb.append(" drops below ");
        } else {
            sb.append(" exceeds ");
        }
        if (metric.equals("transaction:x-percentile") || metric.equals("transaction:average")) {
            sb.append(AlertingService.getWithUnit(metricCondition.getThreshold(), "millisecond"));
        } else if (metric.equals("transaction:count")) {
            sb.append(Formatting.displaySixDigitsOfPrecision(metricCondition.getThreshold()));
        } else if (metric.equals("error:rate")) {
            sb.append(Formatting.displaySixDigitsOfPrecision(metricCondition.getThreshold()));
            sb.append(" percent");
        } else if (metric.equals("error:count")) {
            sb.append(Formatting.displaySixDigitsOfPrecision(metricCondition.getThreshold()));
        } else if (metric.startsWith("gauge:")) {
            sb.append(AlertingService.getGaugeThresholdText(metricCondition.getThreshold(),
                    checkNotNull(gauge).unit()));
        } else {
            throw new IllegalStateException("Unexpected metric: " + metric);
        }
        return sb.toString();
    }

    private static String getConditionDisplay(HeartbeatCondition condition) {
        StringBuilder sb = new StringBuilder();
        sb.append("Heartbeat - not received over the last ");
        sb.append(AlertingService.getWithUnit(condition.getTimePeriodSeconds(), "second"));
        return sb.toString();
    }

    private static String getConditionDisplay(SyntheticMonitorCondition condition,
            @Nullable SyntheticMonitorConfig syntheticMonitorConfig) {
        StringBuilder sb = new StringBuilder();
        sb.append("Synthetic monitor - ");
        if (syntheticMonitorConfig == null) {
            sb.append("<NOT FOUND>");
        } else {
            sb.append(syntheticMonitorConfig.getDisplay());
        }
        sb.append(" exceeds ");
        sb.append(AlertingService.getWithUnit(condition.getThresholdMillis(), "millisecond"));
        return sb.toString();
    }

    @Value.Immutable
    interface AlertConfigRequest {
        Optional<String> version();
    }

    @Value.Immutable
    @Styles.AllParameters
    interface AlertListItem {
        String version();
        String display();
    }

    @Value.Immutable
    interface AlertConfigResponse {
        @Nullable
        AlertConfigDto config();
        @Nullable
        String heading();
        List<Gauge> gauges();
        List<SyntheticMonitorItem> syntheticMonitors();
        List<PagerDutyIntegrationKey> pagerDutyIntegrationKeys();
    }

    @Value.Immutable
    @Styles.AllParameters
    interface SyntheticMonitorItem {
        String id();
        String display();
    }

    @Value.Immutable
    abstract static class AlertConfigDto {

        public abstract AlertConditionDto condition();
        public abstract @Nullable ImmutableEmailNotificationDto emailNotification();
        public abstract @Nullable ImmutablePagerDutyNotificationDto pagerDutyNotification();

        abstract Optional<String> version(); // absent for insert operations

        private static AlertConfigDto toDto(AgentConfig.AlertConfig config) {
            ImmutableAlertConfigDto.Builder builder = ImmutableAlertConfigDto.builder()
                    .condition(toDto(config.getCondition()));
            AlertNotification notification = config.getNotification();
            if (notification.hasEmailNotification()) {
                builder.emailNotification(toDto(notification.getEmailNotification()));
            }
            if (notification.hasPagerDutyNotification()) {
                builder.pagerDutyNotification(toDto(notification.getPagerDutyNotification()));
            }
            return builder.version(Optional.of(Versions.getVersion(config)))
                    .build();
        }

        private AgentConfig.AlertConfig toProto() {
            AgentConfig.AlertConfig.Builder builder = AgentConfig.AlertConfig.newBuilder()
                    .setCondition(toProto(condition()));
            EmailNotificationDto emailNotification = emailNotification();
            if (emailNotification != null) {
                builder.getNotificationBuilder().setEmailNotification(toProto(emailNotification));
            }
            PagerDutyNotificationDto pagerDutyNotification = pagerDutyNotification();
            if (pagerDutyNotification != null) {
                builder.getNotificationBuilder()
                        .setPagerDutyNotification(toProto(pagerDutyNotification));
            }
            return builder.build();
        }

        private static AlertConditionDto toDto(
                AgentConfig.AlertConfig.AlertCondition alertCondition) {
            switch (alertCondition.getValCase()) {
                case METRIC_CONDITION:
                    return toDto(alertCondition.getMetricCondition());
                case SYNTHETIC_MONITOR_CONDITION:
                    return toDto(alertCondition.getSyntheticMonitorCondition());
                case HEARTBEAT_CONDITION:
                    return toDto(alertCondition.getHeartbeatCondition());
                default:
                    throw new IllegalStateException(
                            "Unexpected condition kind: " + alertCondition.getValCase().name());
            }
        }

        private static ImmutableEmailNotificationDto toDto(
                AgentConfig.AlertConfig.AlertNotification.EmailNotification emailNotification) {
            return ImmutableEmailNotificationDto.builder()
                    .addAllEmailAddresses(emailNotification.getEmailAddressList())
                    .build();
        }

        private static ImmutablePagerDutyNotificationDto toDto(
                AgentConfig.AlertConfig.AlertNotification.PagerDutyNotification pagerDutyNotification) {
            return ImmutablePagerDutyNotificationDto.builder()
                    .pagerDutyIntegrationKey(pagerDutyNotification.getPagerDutyIntegrationKey())
                    .build();
        }

        private static AgentConfig.AlertConfig.AlertCondition toProto(AlertConditionDto condition) {
            if (condition instanceof MetricConditionDto) {
                return AgentConfig.AlertConfig.AlertCondition.newBuilder()
                        .setMetricCondition(toProto((MetricConditionDto) condition))
                        .build();
            }
            if (condition instanceof SyntheticMonitorConditionDto) {
                return AgentConfig.AlertConfig.AlertCondition.newBuilder()
                        .setSyntheticMonitorCondition(
                                toProto((SyntheticMonitorConditionDto) condition))
                        .build();
            }
            if (condition instanceof HeartbeatConditionDto) {
                return AgentConfig.AlertConfig.AlertCondition.newBuilder()
                        .setHeartbeatCondition(toProto((HeartbeatConditionDto) condition))
                        .build();
            }
            throw new IllegalStateException(
                    "Unexpected alert condition type: " + condition.getClass().getName());
        }

        private static AgentConfig.AlertConfig.AlertNotification.EmailNotification toProto(
                EmailNotificationDto emailNotification) {
            return AgentConfig.AlertConfig.AlertNotification.EmailNotification.newBuilder()
                    .addAllEmailAddress(emailNotification.emailAddresses())
                    .build();
        }

        private static AgentConfig.AlertConfig.AlertNotification.PagerDutyNotification toProto(
                PagerDutyNotificationDto pagerDutyNotification) {
            return AgentConfig.AlertConfig.AlertNotification.PagerDutyNotification.newBuilder()
                    .setPagerDutyIntegrationKey(pagerDutyNotification.pagerDutyIntegrationKey())
                    .build();
        }

        private static MetricConditionDto toDto(
                AgentConfig.AlertConfig.AlertCondition.MetricCondition condition) {
            ImmutableMetricConditionDto.Builder builder = ImmutableMetricConditionDto.builder()
                    .metric(condition.getMetric());
            String transactionType = condition.getTransactionType();
            if (transactionType != null) {
                builder.transactionType(transactionType);
            }
            String transactionName = condition.getTransactionName();
            if (transactionName != null) {
                builder.transactionName(transactionName);
            }
            if (condition.hasPercentile()) {
                builder.percentile(condition.getPercentile().getValue());
            }
            return builder.threshold(condition.getThreshold())
                    .lowerBoundThreshold(condition.getLowerBoundThreshold())
                    .timePeriodSeconds(condition.getTimePeriodSeconds())
                    .minTransactionCount(condition.getMinTransactionCount())
                    .build();
        }

        private static SyntheticMonitorConditionDto toDto(
                AgentConfig.AlertConfig.AlertCondition.SyntheticMonitorCondition condition) {
            return ImmutableSyntheticMonitorConditionDto.builder()
                    .syntheticMonitorId(condition.getSyntheticMonitorId())
                    .thresholdMillis(condition.getThresholdMillis())
                    .build();
        }

        private static HeartbeatConditionDto toDto(
                AgentConfig.AlertConfig.AlertCondition.HeartbeatCondition condition) {
            return ImmutableHeartbeatConditionDto.builder()
                    .timePeriodSeconds(condition.getTimePeriodSeconds())
                    .build();
        }

        private static AgentConfig.AlertConfig.AlertCondition.MetricCondition toProto(
                MetricConditionDto condition) {
            AgentConfig.AlertConfig.AlertCondition.MetricCondition.Builder builder =
                    AgentConfig.AlertConfig.AlertCondition.MetricCondition.newBuilder()
                            .setMetric(condition.metric());
            String transactionType = condition.transactionType();
            if (transactionType != null) {
                builder.setTransactionType(transactionType);
            }
            String transactionName = condition.transactionName();
            if (transactionName != null) {
                builder.setTransactionName(transactionName);
            }
            Double percentile = condition.percentile();
            if (percentile != null) {
                builder.setPercentile(OptionalDouble.newBuilder().setValue(percentile));
            }
            return builder.setThreshold(condition.threshold())
                    .setLowerBoundThreshold(condition.lowerBoundThreshold())
                    .setTimePeriodSeconds(condition.timePeriodSeconds())
                    .setMinTransactionCount(condition.minTransactionCount())
                    .build();
        }

        private static AgentConfig.AlertConfig.AlertCondition.SyntheticMonitorCondition toProto(
                SyntheticMonitorConditionDto condition) {
            return AgentConfig.AlertConfig.AlertCondition.SyntheticMonitorCondition.newBuilder()
                    .setSyntheticMonitorId(condition.syntheticMonitorId())
                    .setThresholdMillis(condition.thresholdMillis())
                    .build();
        }

        private static AgentConfig.AlertConfig.AlertCondition.HeartbeatCondition toProto(
                HeartbeatConditionDto condition) {
            return AgentConfig.AlertConfig.AlertCondition.HeartbeatCondition.newBuilder()
                    .setTimePeriodSeconds(condition.timePeriodSeconds())
                    .build();
        }

        @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY,
                property = "conditionType")
        @JsonSubTypes({@Type(value = ImmutableMetricConditionDto.class, name = "metric"),
                @Type(value = ImmutableSyntheticMonitorConditionDto.class,
                        name = "synthetic-monitor"),
                @Type(value = ImmutableHeartbeatConditionDto.class, name = "heartbeat")})
        public interface AlertConditionDto {}

        @Value.Immutable
        public abstract static class MetricConditionDto implements AlertConditionDto {
            abstract String metric();
            abstract @Nullable String transactionType();
            abstract @Nullable String transactionName();
            abstract @Nullable Double percentile();
            abstract double threshold();
            @Value.Default
            @JsonInclude(value = Include.NON_EMPTY)
            boolean lowerBoundThreshold() {
                return false;
            }
            abstract int timePeriodSeconds();
            @Value.Default
            @JsonInclude(value = Include.NON_EMPTY)
            long minTransactionCount() {
                return 0;
            }
        }

        @Value.Immutable
        public interface SyntheticMonitorConditionDto extends AlertConditionDto {
            String syntheticMonitorId();
            int thresholdMillis();
        }

        @Value.Immutable
        public interface HeartbeatConditionDto extends AlertConditionDto {
            int timePeriodSeconds();
        }

        @Value.Immutable
        public interface EmailNotificationDto {
            ImmutableList<String> emailAddresses();
        }

        @Value.Immutable
        public interface PagerDutyNotificationDto {
            String pagerDutyIntegrationKey();
        }
    }
}
