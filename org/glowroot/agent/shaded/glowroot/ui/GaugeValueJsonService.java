/*
 * Copyright 2013-2017 the original author or authors.
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
import java.util.Map;
import java.util.Map.Entry;

import org.glowroot.agent.shaded.fasterxml.jackson.core.JsonGenerator;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.ObjectMapper;
import org.glowroot.agent.shaded.google.common.base.Function;
import org.glowroot.agent.shaded.google.common.collect.ImmutableList;
import org.glowroot.agent.shaded.google.common.collect.Lists;
import org.glowroot.agent.shaded.google.common.collect.Maps;
import org.glowroot.agent.shaded.google.common.collect.Ordering;
import org.glowroot.agent.shaded.google.common.io.CharStreams;
import org.immutables.value.Value;

import org.glowroot.agent.shaded.glowroot.common.repo.AgentRollupRepository;
import org.glowroot.agent.shaded.glowroot.common.repo.ConfigRepository;
import org.glowroot.agent.shaded.glowroot.common.repo.GaugeValueRepository;
import org.glowroot.agent.shaded.glowroot.common.repo.GaugeValueRepository.Gauge;
import org.glowroot.agent.shaded.glowroot.common.repo.Utils;
import org.glowroot.agent.shaded.glowroot.common.repo.util.RollupLevelService;
import org.glowroot.agent.shaded.glowroot.common.util.ObjectMappers;
import org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.GaugeValue;

import static org.glowroot.agent.shaded.google.common.base.Preconditions.checkNotNull;

@JsonService
class GaugeValueJsonService {

    private static final ObjectMapper mapper = ObjectMappers.create();

    private final GaugeValueRepository gaugeValueRepository;
    private final RollupLevelService rollupLevelService;
    private final AgentRollupRepository agentRollupRepository;
    private final ConfigRepository configRepository;

    GaugeValueJsonService(GaugeValueRepository gaugeValueRepository,
            RollupLevelService rollupLevelService, AgentRollupRepository agentRollupRepository,
            ConfigRepository configRepository) {
        this.gaugeValueRepository = gaugeValueRepository;
        this.rollupLevelService = rollupLevelService;
        this.agentRollupRepository = agentRollupRepository;
        this.configRepository = configRepository;
    }

    @GET(path = "/backend/jvm/gauges", permission = "agent:jvm:gauges")
    String getGaugeValues(@BindAgentRollupId String agentRollupId,
            @BindRequest GaugeValueRequest request) throws Exception {
        int rollupLevel =
                rollupLevelService.getGaugeRollupLevelForView(request.from(), request.to());
        if (rollupLevel == 0 && !agentRollupRepository.isAgent(agentRollupId)) {
            // agent rollups from children do not have level-0 data
            rollupLevel = 1;
        }
        long intervalMillis;
        if (rollupLevel == 0) {
            intervalMillis = configRepository.getGaugeCollectionIntervalMillis();
        } else {
            intervalMillis =
                    configRepository.getRollupConfigs().get(rollupLevel - 1).intervalMillis();
        }
        double gapMillis = intervalMillis * 1.5;
        long revisedFrom = request.from() - intervalMillis;
        long revisedTo = request.to() + intervalMillis;

        Map<String, List<GaugeValue>> map = Maps.newLinkedHashMap();
        for (String gaugeName : request.gaugeName()) {
            map.put(gaugeName,
                    getGaugeValues(agentRollupId, revisedFrom, revisedTo, gaugeName, rollupLevel));
        }
        if (rollupLevel != 0) {
            syncManualRollupCaptureTimes(map, rollupLevel);
        }
        List<DataSeries> dataSeriesList = Lists.newArrayList();
        for (Entry<String, List<GaugeValue>> entry : map.entrySet()) {
            dataSeriesList
                    .add(convertToDataSeriesWithGaps(entry.getKey(), entry.getValue(), gapMillis));
        }
        StringBuilder sb = new StringBuilder();
        JsonGenerator jg = mapper.getFactory().createGenerator(CharStreams.asWriter(sb));
        jg.writeStartObject();
        jg.writeObjectField("dataSeries", dataSeriesList);
        jg.writeEndObject();
        jg.close();
        return sb.toString();
    }

    @GET(path = "/backend/jvm/all-gauges", permission = "agent:jvm:gauges")
    String getAllGaugeNames(@BindAgentRollupId String agentRollupId) throws Exception {
        List<Gauge> gauges = gaugeValueRepository.getGauges(agentRollupId);
        ImmutableList<Gauge> sortedGauges = new GaugeOrdering().immutableSortedCopy(gauges);
        return mapper.writeValueAsString(sortedGauges);
    }

    private List<GaugeValue> getGaugeValues(String agentRollupId, long from, long to,
            String gaugeName, int rollupLevel) throws Exception {
        List<GaugeValue> gaugeValues = gaugeValueRepository.readGaugeValues(agentRollupId,
                gaugeName, from, to, rollupLevel);
        if (rollupLevel == 0) {
            return gaugeValues;
        }
        long nonRolledUpFrom = from;
        if (!gaugeValues.isEmpty()) {
            long lastRolledUpTime = gaugeValues.get(gaugeValues.size() - 1).getCaptureTime();
            nonRolledUpFrom = Math.max(nonRolledUpFrom, lastRolledUpTime + 1);
        }
        List<GaugeValue> orderedNonRolledUpGaugeValues = Lists.newArrayList();
        orderedNonRolledUpGaugeValues.addAll(gaugeValueRepository.readGaugeValues(agentRollupId,
                gaugeName, nonRolledUpFrom, to, 0));
        gaugeValues = Lists.newArrayList(gaugeValues);
        long fixedIntervalMillis =
                configRepository.getRollupConfigs().get(rollupLevel - 1).intervalMillis();
        gaugeValues.addAll(rollUpGaugeValues(orderedNonRolledUpGaugeValues, gaugeName,
                new RollupCaptureTimeFn(fixedIntervalMillis)));
        return gaugeValues;
    }

    private <K> void syncManualRollupCaptureTimes(Map<K, List<GaugeValue>> map, int rollupLevel) {
        long fixedIntervalMillis =
                configRepository.getRollupConfigs().get(rollupLevel - 1).intervalMillis();
        Map<K, Long> manualRollupCaptureTimes = Maps.newHashMap();
        long maxCaptureTime = Long.MIN_VALUE;
        for (Entry<K, List<GaugeValue>> entry : map.entrySet()) {
            List<GaugeValue> gaugeValues = entry.getValue();
            if (gaugeValues.isEmpty()) {
                continue;
            }
            GaugeValue lastGaugeValue = gaugeValues.get(gaugeValues.size() - 1);
            long lastCaptureTime = lastGaugeValue.getCaptureTime();
            maxCaptureTime = Math.max(maxCaptureTime, lastCaptureTime);
            if (lastCaptureTime % fixedIntervalMillis != 0) {
                manualRollupCaptureTimes.put(entry.getKey(), lastCaptureTime);
            }
        }
        if (maxCaptureTime == Long.MIN_VALUE) {
            // nothing to sync
            return;
        }
        long maxRollupCaptureTime = Utils.getRollupCaptureTime(maxCaptureTime, fixedIntervalMillis);
        long maxDiffToSync = Math.min(fixedIntervalMillis / 5, 60000);
        for (Entry<K, Long> entry : manualRollupCaptureTimes.entrySet()) {
            Long captureTime = entry.getValue();
            if (Utils.getRollupCaptureTime(captureTime,
                    fixedIntervalMillis) != maxRollupCaptureTime) {
                continue;
            }
            if (maxCaptureTime - captureTime > maxDiffToSync) {
                // only sync up times that are close to each other
                continue;
            }
            K key = entry.getKey();
            List<GaugeValue> gaugeValues = checkNotNull(map.get(key));
            // make copy in case ImmutableList
            gaugeValues = Lists.newArrayList(gaugeValues);
            GaugeValue lastGaugeValue = gaugeValues.get(gaugeValues.size() - 1);
            gaugeValues.set(gaugeValues.size() - 1, lastGaugeValue.toBuilder()
                    .setCaptureTime(maxCaptureTime)
                    .build());
            map.put(key, gaugeValues);
        }
    }

    static List<GaugeValue> rollUpGaugeValues(List<GaugeValue> orderedNonRolledUpGaugeValues,
            String gaugeName, Function<Long, Long> rollupCaptureTimeFn) {
        List<GaugeValue> rolledUpGaugeValues = Lists.newArrayList();
        double currTotal = 0;
        long currWeight = 0;
        long currRollupCaptureTime = Long.MIN_VALUE;
        for (GaugeValue nonRolledUpGaugeValue : orderedNonRolledUpGaugeValues) {
            long captureTime = nonRolledUpGaugeValue.getCaptureTime();
            long rollupCaptureTime = rollupCaptureTimeFn.apply(captureTime);
            if (rollupCaptureTime != currRollupCaptureTime && currWeight > 0) {
                rolledUpGaugeValues.add(GaugeValue.newBuilder()
                        .setGaugeName(gaugeName)
                        .setCaptureTime(currRollupCaptureTime)
                        .setValue(currTotal / currWeight)
                        .setWeight(currWeight)
                        .build());
                currTotal = 0;
                currWeight = 0;
            }
            currRollupCaptureTime = rollupCaptureTime;
            currTotal += nonRolledUpGaugeValue.getValue() * nonRolledUpGaugeValue.getWeight();
            currWeight += nonRolledUpGaugeValue.getWeight();
        }
        if (currWeight > 0) {
            // roll up final one
            long lastCaptureTime = orderedNonRolledUpGaugeValues
                    .get(orderedNonRolledUpGaugeValues.size() - 1).getCaptureTime();
            rolledUpGaugeValues.add(GaugeValue.newBuilder()
                    .setGaugeName(gaugeName)
                    .setCaptureTime(lastCaptureTime)
                    .setValue(currTotal / currWeight)
                    .setWeight(currWeight)
                    .build());
        }
        return rolledUpGaugeValues;
    }

    private static DataSeries convertToDataSeriesWithGaps(String dataSeriesName,
            List<GaugeValue> gaugeValues, double gapMillis) {
        DataSeries dataSeries = new DataSeries(dataSeriesName);
        GaugeValue lastGaugeValue = null;
        for (GaugeValue gaugeValue : gaugeValues) {
            if (lastGaugeValue != null
                    && gaugeValue.getCaptureTime() - lastGaugeValue.getCaptureTime() > gapMillis) {
                dataSeries.addNull();
            }
            dataSeries.add(gaugeValue.getCaptureTime(), gaugeValue.getValue());
            lastGaugeValue = gaugeValue;
        }
        return dataSeries;
    }

    @Value.Immutable
    interface GaugeValueRequest {
        long from();
        long to();
        // singular because this is used in query string
        ImmutableList<String> gaugeName();
    }

    static class GaugeOrdering extends Ordering<Gauge> {
        @Override
        public int compare(Gauge left, Gauge right) {
            return left.display().compareToIgnoreCase(right.display());
        }
    }

    private static class RollupCaptureTimeFn implements Function<Long, Long> {

        private final long fixedIntervalMillis;

        private RollupCaptureTimeFn(long fixedIntervalMillis) {
            this.fixedIntervalMillis = fixedIntervalMillis;
        }

        @Override
        public Long apply(Long captureTime) {
            return Utils.getRollupCaptureTime(captureTime, fixedIntervalMillis);
        }
    }
}
