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

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.annotation.Nullable;
import javax.management.ObjectName;

import org.glowroot.agent.shaded.fasterxml.jackson.core.JsonGenerator;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.ObjectMapper;
import org.glowroot.agent.shaded.google.common.base.Splitter;
import org.glowroot.agent.shaded.google.common.collect.ImmutableList;
import org.glowroot.agent.shaded.google.common.collect.ImmutableSet;
import org.glowroot.agent.shaded.google.common.collect.ImmutableSortedMap;
import org.glowroot.agent.shaded.google.common.collect.Lists;
import org.glowroot.agent.shaded.google.common.collect.Maps;
import org.glowroot.agent.shaded.google.common.collect.Ordering;
import org.glowroot.agent.shaded.google.common.collect.Sets;
import org.glowroot.agent.shaded.google.common.io.CharStreams;
import org.glowroot.agent.shaded.google.common.primitives.Longs;
import org.immutables.value.Value;
import org.glowroot.agent.shaded.slf4j.Logger;
import org.glowroot.agent.shaded.slf4j.LoggerFactory;

import org.glowroot.agent.shaded.glowroot.common.live.LiveJvmService;
import org.glowroot.agent.shaded.glowroot.common.live.LiveJvmService.AgentNotConnectedException;
import org.glowroot.agent.shaded.glowroot.common.live.LiveJvmService.AgentUnsupportedOperationException;
import org.glowroot.agent.shaded.glowroot.common.live.LiveJvmService.DirectoryDoesNotExistException;
import org.glowroot.agent.shaded.glowroot.common.live.LiveJvmService.UnavailableDueToRunningInIbmJvmException;
import org.glowroot.agent.shaded.glowroot.common.live.LiveJvmService.UnavailableDueToRunningInJreException;
import org.glowroot.agent.shaded.glowroot.common.repo.EnvironmentRepository;
import org.glowroot.agent.shaded.glowroot.common.util.NotAvailableAware;
import org.glowroot.agent.shaded.glowroot.common.util.ObjectMappers;
import org.glowroot.agent.shaded.glowroot.common.util.UsedByJsonSerialization;
import org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.Environment;
import org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.HostInfo;
import org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.JavaInfo;
import org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.ProcessInfo;
import org.glowroot.agent.shaded.glowroot.wire.api.model.DownstreamServiceOuterClass.Availability;
import org.glowroot.agent.shaded.glowroot.wire.api.model.DownstreamServiceOuterClass.Capabilities;
import org.glowroot.agent.shaded.glowroot.wire.api.model.DownstreamServiceOuterClass.HeapDumpFileInfo;
import org.glowroot.agent.shaded.glowroot.wire.api.model.DownstreamServiceOuterClass.HeapHistogram;
import org.glowroot.agent.shaded.glowroot.wire.api.model.DownstreamServiceOuterClass.MBeanDump;
import org.glowroot.agent.shaded.glowroot.wire.api.model.DownstreamServiceOuterClass.MBeanDumpRequest.MBeanDumpKind;
import org.glowroot.agent.shaded.glowroot.wire.api.model.DownstreamServiceOuterClass.ThreadDump;
import org.glowroot.agent.shaded.glowroot.wire.api.model.DownstreamServiceOuterClass.ThreadDump.LockInfo;

import static org.glowroot.agent.shaded.google.common.base.Preconditions.checkNotNull;

@JsonService
class JvmJsonService {

    private static final Logger logger = LoggerFactory.getLogger(JvmJsonService.class);
    private static final ObjectMapper mapper = ObjectMappers.create();

    private static final Set<String> PATH_SEPARATED_SYSTEM_PROPERTIES;

    static {
        PATH_SEPARATED_SYSTEM_PROPERTIES = ImmutableSet.of("java.class.path", "java.ext.dirs",
                "java.library.path", "sun.boot.class.path");
    }

    private final EnvironmentRepository environmentRepository;
    private final @Nullable LiveJvmService liveJvmService;

    JvmJsonService(EnvironmentRepository environmentRepository,
            @Nullable LiveJvmService liveJvmService) {
        this.environmentRepository = environmentRepository;
        this.liveJvmService = liveJvmService;
    }

    @GET(path = "/backend/jvm/environment", permission = "agent:jvm:environment")
    String getEnvironment(@BindAgentId String agentId) throws Exception {
        Environment environment = environmentRepository.read(agentId);
        if (environment == null) {
            return "{}";
        }
        HostInfo hostInfo = environment.getHostInfo();
        ProcessInfo processInfo = environment.getProcessInfo();
        JavaInfo javaInfo = environment.getJavaInfo();

        StringWriter sw = new StringWriter();
        JsonGenerator jg = mapper.getFactory().createGenerator(sw);
        jg.writeStartObject();
        if (liveJvmService != null) {
            jg.writeBooleanField("agentNotConnected", !liveJvmService.isAvailable(agentId));
        }
        jg.writeObjectFieldStart("host");
        jg.writeStringField("hostName", hostInfo.getHostName());
        jg.writeNumberField("availableProcessors", hostInfo.getAvailableProcessors());
        if (hostInfo.hasTotalPhysicalMemoryBytes()) {
            jg.writeNumberField("totalPhysicalMemoryBytes",
                    hostInfo.getTotalPhysicalMemoryBytes().getValue());
        }
        jg.writeStringField("osName", hostInfo.getOsName());
        jg.writeStringField("osVersion", hostInfo.getOsVersion());
        jg.writeEndObject();
        jg.writeObjectFieldStart("process");
        if (processInfo.hasProcessId()) {
            jg.writeNumberField("processId", processInfo.getProcessId().getValue());
        }
        jg.writeNumberField("startTime", processInfo.getStartTime());
        jg.writeEndObject();
        jg.writeObjectFieldStart("java");
        jg.writeStringField("version", javaInfo.getVersion());
        jg.writeStringField("vm", javaInfo.getVm());
        jg.writeArrayFieldStart("args");
        for (String arg : javaInfo.getArgList()) {
            jg.writeString(arg);
        }
        jg.writeEndArray();
        jg.writeStringField("glowrootAgentVersion", javaInfo.getGlowrootAgentVersion());
        jg.writeEndObject();
        jg.writeEndObject();
        jg.close();
        return sw.toString();
    }

    @GET(path = "/backend/jvm/thread-dump", permission = "agent:jvm:threadDump")
    String getThreadDump(@BindAgentId String agentId) throws Exception {
        checkNotNull(liveJvmService);
        ThreadDump threadDump;
        try {
            threadDump = liveJvmService.getThreadDump(agentId);
        } catch (AgentNotConnectedException e) {
            logger.debug(e.getMessage(), e);
            return "{\"agentNotConnected\":true}";
        }
        List<ThreadDump.Thread> allThreads = Lists.newArrayList();
        StringWriter sw = new StringWriter();
        JsonGenerator jg = mapper.getFactory().createGenerator(sw);
        jg.writeStartObject();
        jg.writeArrayFieldStart("transactions");
        for (ThreadDump.Transaction transaction : threadDump.getTransactionList()) {
            writeTransactionThread(transaction, jg);
            allThreads.addAll(transaction.getThreadList());
        }
        jg.writeEndArray();
        jg.writeArrayFieldStart("unmatchedThreads");
        for (ThreadDump.Thread thread : threadDump.getUnmatchedThreadList()) {
            writeThread(thread, jg);
            allThreads.add(thread);
        }
        jg.writeEndArray();
        jg.writeFieldName("threadDumpingThread");
        writeThread(threadDump.getThreadDumpingThread(), jg);
        allThreads.add(threadDump.getThreadDumpingThread());
        writeDeadlockedCycles(allThreads, jg);
        jg.writeEndObject();
        jg.close();
        return sw.toString();
    }

    @GET(path = "/backend/jvm/jstack", permission = "agent:jvm:threadDump")
    String getJstack(@BindAgentId String agentId) throws Exception {
        checkNotNull(liveJvmService);
        String jstack;
        try {
            jstack = liveJvmService.getJstack(agentId);
        } catch (AgentNotConnectedException e) {
            logger.debug(e.getMessage(), e);
            return "{\"agentNotConnected\":true}";
        } catch (UnavailableDueToRunningInJreException e) {
            logger.debug(e.getMessage(), e);
            return "{\"unavailableDueToRunningInJre\":true}";
        } catch (UnavailableDueToRunningInIbmJvmException e) {
            logger.debug(e.getMessage(), e);
            return "{\"unavailableDueToRunningInIbmJvm\":true}";
        } catch (AgentUnsupportedOperationException e) {
            // this operation introduced in 0.9.2
            logger.debug(e.getMessage(), e);
            return getAgentUnsupportedOperationResponse(agentId);
        }
        StringWriter sw = new StringWriter();
        JsonGenerator jg = mapper.getFactory().createGenerator(sw);
        jg.writeStartObject();
        jg.writeStringField("jstack", jstack);
        jg.writeEndObject();
        jg.close();
        return sw.toString();
    }

    @GET(path = "/backend/jvm/heap-dump-default-dir", permission = "agent:jvm:heapDump")
    String getHeapDumpDefaultDir(@BindAgentId String agentId) throws Exception {
        checkNotNull(liveJvmService);
        if (!liveJvmService.isAvailable(agentId)) {
            return "{\"agentNotConnected\":true}";
        }
        Environment environment = environmentRepository.read(agentId);
        checkNotNull(environment);
        StringBuilder sb = new StringBuilder();
        JsonGenerator jg = mapper.getFactory().createGenerator(CharStreams.asWriter(sb));
        jg.writeStartObject();
        jg.writeStringField("directory", environment.getJavaInfo().getHeapDumpDefaultDir());
        jg.writeEndObject();
        jg.close();
        return sb.toString();
    }

    @POST(path = "/backend/jvm/available-disk-space", permission = "agent:jvm:heapDump")
    String getAvailableDiskSpace(@BindAgentId String agentId, @BindRequest HeapDumpRequest request)
            throws Exception {
        checkNotNull(liveJvmService);
        try {
            return Long
                    .toString(liveJvmService.getAvailableDiskSpace(agentId, request.directory()));
        } catch (DirectoryDoesNotExistException e) {
            logger.debug(e.getMessage(), e);
            return "{\"directoryDoesNotExist\": true}";
        }
    }

    @POST(path = "/backend/jvm/heap-dump", permission = "agent:jvm:heapDump")
    String heapDump(@BindAgentId String agentId, @BindRequest HeapDumpRequest request)
            throws Exception {
        checkNotNull(liveJvmService);
        HeapDumpFileInfo heapDumpFileInfo;
        try {
            heapDumpFileInfo = liveJvmService.heapDump(agentId, request.directory());
        } catch (DirectoryDoesNotExistException e) {
            logger.debug(e.getMessage(), e);
            return "{\"directoryDoesNotExist\": true}";
        }
        StringWriter sw = new StringWriter();
        JsonGenerator jg = mapper.getFactory().createGenerator(sw);
        jg.writeStartObject();
        jg.writeStringField("filePath", heapDumpFileInfo.getFilePath());
        jg.writeNumberField("fileSizeBytes", heapDumpFileInfo.getFileSizeBytes());
        jg.writeEndObject();
        jg.close();
        return sw.toString();
    }

    @POST(path = "/backend/jvm/heap-histogram", permission = "agent:jvm:heapHistogram")
    String heapHistogram(@BindAgentId String agentId) throws Exception {
        checkNotNull(liveJvmService);
        HeapHistogram heapHistogram;
        try {
            heapHistogram = liveJvmService.heapHistogram(agentId);
        } catch (AgentNotConnectedException e) {
            logger.debug(e.getMessage(), e);
            return "{\"agentNotConnected\":true}";
        } catch (UnavailableDueToRunningInJreException e) {
            logger.debug(e.getMessage(), e);
            return "{\"unavailableDueToRunningInJre\":true}";
        } catch (UnavailableDueToRunningInIbmJvmException e) {
            logger.debug(e.getMessage(), e);
            return "{\"unavailableDueToRunningInIbmJvm\":true}";
        } catch (AgentUnsupportedOperationException e) {
            // this operation introduced in 0.9.2
            logger.debug(e.getMessage(), e);
            return getAgentUnsupportedOperationResponse(agentId);
        }
        StringWriter sw = new StringWriter();
        JsonGenerator jg = mapper.getFactory().createGenerator(sw);
        jg.writeStartObject();
        jg.writeArrayFieldStart("items");
        long totalBytes = 0;
        long totalCount = 0;
        for (HeapHistogram.ClassInfo classInfo : heapHistogram.getClassInfoList()) {
            jg.writeStartObject();
            jg.writeStringField("className", classInfo.getClassName());
            jg.writeNumberField("bytes", classInfo.getBytes());
            jg.writeNumberField("count", classInfo.getCount());
            jg.writeEndObject();
            totalBytes += classInfo.getBytes();
            totalCount += classInfo.getCount();
        }
        jg.writeEndArray();
        jg.writeNumberField("totalBytes", totalBytes);
        jg.writeNumberField("totalCount", totalCount);
        jg.writeEndObject();
        jg.close();
        return sw.toString();
    }

    @POST(path = "/backend/jvm/gc", permission = "agent:jvm:gc")
    void performGC(@BindAgentId String agentId) throws Exception {
        checkNotNull(liveJvmService);
        liveJvmService.gc(agentId);
    }

    @GET(path = "/backend/jvm/gc-check-agent-connected", permission = "agent:jvm:gc")
    String checkAgentConnected(@BindAgentId String agentId) throws Exception {
        checkNotNull(liveJvmService);
        return Boolean.toString(liveJvmService.isAvailable(agentId));
    }

    @GET(path = "/backend/jvm/mbean-tree", permission = "agent:jvm:mbeanTree")
    String getMBeanTree(@BindAgentId String agentId, @BindRequest MBeanTreeRequest request)
            throws Exception {
        checkNotNull(liveJvmService);
        MBeanDump mbeanDump;
        try {
            mbeanDump = liveJvmService.getMBeanDump(agentId,
                    MBeanDumpKind.ALL_MBEANS_INCLUDE_ATTRIBUTES_FOR_SOME, request.expanded());
        } catch (AgentNotConnectedException e) {
            logger.debug(e.getMessage(), e);
            return "{\"agentNotConnected\":true}";
        }
        Map<String, MBeanTreeInnerNode> sortedRootNodes = Maps.newTreeMap();
        for (MBeanDump.MBeanInfo mbeanInfo : mbeanDump.getMbeanInfoList()) {
            ObjectName objectName = ObjectName.getInstance(mbeanInfo.getObjectName());
            String domain = objectName.getDomain();
            MBeanTreeInnerNode node = sortedRootNodes.get(domain);
            if (node == null) {
                node = new MBeanTreeInnerNode(domain);
                sortedRootNodes.put(domain, node);
            }
            List<String> propertyValues = ObjectNames.getPropertyValues(objectName);
            for (int i = 0; i < propertyValues.size() - 1; i++) {
                node = node.getOrCreateNode(propertyValues.get(i));
            }
            String name = objectName.toString();
            String value = propertyValues.get(propertyValues.size() - 1);
            if (request.expanded().contains(name)) {
                node.addLeafNode(new MBeanTreeLeafNode(value, name, true,
                        getSortedAttributeMap(mbeanInfo.getAttributeList())));
            } else {
                node.addLeafNode(new MBeanTreeLeafNode(value, name, false, null));
            }
        }
        return mapper.writeValueAsString(sortedRootNodes);
    }

    @GET(path = "/backend/jvm/mbean-attribute-map", permission = "agent:jvm:mbeanTree")
    String getMBeanAttributeMap(@BindAgentId String agentId,
            @BindRequest MBeanAttributeMapRequest request) throws Exception {
        checkNotNull(liveJvmService);
        MBeanDump mbeanDump =
                liveJvmService.getMBeanDump(agentId, MBeanDumpKind.SOME_MBEANS_INCLUDE_ATTRIBUTES,
                        ImmutableList.of(request.objectName()));
        List<MBeanDump.MBeanInfo> mbeanInfos = mbeanDump.getMbeanInfoList();
        if (mbeanInfos.isEmpty()) {
            throw new IllegalStateException(
                    "Could not find mbean with object name: " + request.objectName());
        }
        if (mbeanInfos.size() > 1) {
            logger.warn("returned more than one mbean with object name: {}", request.objectName());
        }
        MBeanDump.MBeanInfo mbeanInfo = mbeanInfos.get(0);
        return mapper.writeValueAsString(getSortedAttributeMap(mbeanInfo.getAttributeList()));
    }

    @GET(path = "/backend/jvm/system-properties", permission = "agent:jvm:systemProperties")
    String getSystemProperties(@BindAgentId String agentId) throws Exception {
        checkNotNull(liveJvmService);
        Map<String, String> properties;
        try {
            properties = liveJvmService.getSystemProperties(agentId);
        } catch (AgentNotConnectedException e) {
            logger.debug(e.getMessage(), e);
            return "{\"agentNotConnected\":true}";
        } catch (AgentUnsupportedOperationException e) {
            // this operation introduced in 0.9.2
            logger.debug(e.getMessage(), e);
            return getAgentUnsupportedOperationResponse(agentId);
        }
        StringBuilder sb = new StringBuilder();
        JsonGenerator jg = mapper.getFactory().createGenerator(CharStreams.asWriter(sb));
        jg.writeStartObject();
        jg.writeArrayFieldStart("properties");
        for (Entry<String, String> entry : ImmutableSortedMap.copyOf(properties).entrySet()) {
            jg.writeStartObject();
            String propertyName = entry.getKey();
            jg.writeStringField("name", propertyName);
            if (PATH_SEPARATED_SYSTEM_PROPERTIES.contains(propertyName)) {
                jg.writeArrayFieldStart("value");
                for (String item : Splitter.on(File.pathSeparatorChar)
                        .splitToList(entry.getValue())) {
                    jg.writeString(item);
                }
                jg.writeEndArray();
            } else {
                jg.writeStringField("value", entry.getValue());
            }
            jg.writeEndObject();
        }
        jg.writeEndArray();
        jg.writeEndObject();
        jg.close();
        return sb.toString();
    }

    @GET(path = "/backend/jvm/capabilities", permission = "agent:jvm:capabilities")
    String getCapabilities(@BindAgentId String agentId) throws Exception {
        checkNotNull(liveJvmService);
        Capabilities capabilities;
        try {
            capabilities = liveJvmService.getCapabilities(agentId);
        } catch (AgentNotConnectedException e) {
            logger.debug(e.getMessage(), e);
            return "{\"agentNotConnected\":true}";
        }
        StringWriter sw = new StringWriter();
        JsonGenerator jg = mapper.getFactory().createGenerator(sw);
        jg.writeStartObject();
        writeAvailability("threadCpuTime", capabilities.getThreadCpuTime(), jg);
        writeAvailability("threadContentionTime", capabilities.getThreadContentionTime(), jg);
        writeAvailability("threadAllocatedBytes", capabilities.getThreadAllocatedBytes(), jg);
        jg.writeEndObject();
        jg.close();
        return sw.toString();
    }

    private void writeAvailability(String fieldName, Availability availability, JsonGenerator jg)
            throws IOException {
        jg.writeObjectFieldStart(fieldName);
        jg.writeBooleanField("available", availability.getAvailable());
        jg.writeStringField("reason", availability.getReason());
        jg.writeEndObject();
    }

    private String getAgentUnsupportedOperationResponse(String agentId) throws Exception {
        StringWriter sw = new StringWriter();
        JsonGenerator jg = mapper.getFactory().createGenerator(sw);
        jg.writeStartObject();
        jg.writeStringField("agentUnsupportedOperation", getAgentVersion(agentId));
        jg.writeEndObject();
        jg.close();
        return sw.toString();
    }

    private String getAgentVersion(String agentId) throws Exception {
        Environment environment = environmentRepository.read(agentId);
        if (environment == null) {
            return "unknown";
        }
        return environment.getJavaInfo().getGlowrootAgentVersion();
    }

    private static void writeTransactionThread(ThreadDump.Transaction transaction, JsonGenerator jg)
            throws IOException {
        jg.writeStartObject();
        jg.writeStringField("traceId", transaction.getTraceId());
        jg.writeStringField("headline", transaction.getHeadline());
        jg.writeStringField("transactionType", transaction.getTransactionType());
        jg.writeStringField("transactionName", transaction.getTransactionName());
        jg.writeNumberField("totalDurationNanos", transaction.getTotalDurationNanos());
        if (transaction.hasTotalCpuNanos()) {
            jg.writeNumberField("totalCpuNanos", transaction.getTotalCpuNanos().getValue());
        } else {
            jg.writeNumberField("totalCpuNanos", NotAvailableAware.NA);
        }
        jg.writeArrayFieldStart("threads");
        for (ThreadDump.Thread thread : transaction.getThreadList()) {
            writeThread(thread, jg);
        }
        jg.writeEndArray();
        jg.writeEndObject();
    }

    private static void writeThread(ThreadDump.Thread thread, JsonGenerator jg) throws IOException {
        jg.writeStartObject();
        jg.writeStringField("name", thread.getName());
        jg.writeStringField("id", Long.toString(thread.getId()));
        jg.writeStringField("state", thread.getState());
        jg.writeArrayFieldStart("stackTraceElements");
        boolean first = true;
        for (ThreadDump.StackTraceElement stackTraceElement : thread.getStackTraceElementList()) {
            writeStackTraceElement(stackTraceElement, jg);
            if (first) {
                if (thread.hasLockInfo()) {
                    if (thread.getState().equals(Thread.State.BLOCKED.name())) {
                        writeMonitorInfo("waiting to lock", thread.getLockInfo(), jg);
                    } else {
                        writeMonitorInfo("waiting on", thread.getLockInfo(), jg);
                    }
                } else {
                    // this condition is for the central ui when displaying thread dump from
                    // glowroot agent prior to 0.9.2
                    String lockName = thread.getLockName();
                    if (!lockName.isEmpty()) {
                        if (thread.getState().equals(Thread.State.BLOCKED.name())) {
                            jg.writeString("- waiting to lock " + lockName);
                        } else {
                            jg.writeString("- waiting on " + lockName);
                        }
                    }
                }
            }
            for (ThreadDump.LockInfo monitorInfo : stackTraceElement.getMonitorInfoList()) {
                writeMonitorInfo("locked on", monitorInfo, jg);
            }
            first = false;
        }
        jg.writeEndArray();
        jg.writeEndObject();
    }

    private static void writeDeadlockedCycles(List<ThreadDump.Thread> allThreads, JsonGenerator jg)
            throws IOException {
        Map<Long, ThreadDump.Thread> blockedThreads = Maps.newHashMap();
        for (ThreadDump.Thread thread : allThreads) {
            if (thread.hasLockOwnerId()) {
                blockedThreads.put(thread.getId(), thread);
            }
        }
        List<List<ThreadDump.Thread>> deadlockedCycles = findDeadlockedCycles(blockedThreads);
        jg.writeArrayFieldStart("deadlockedCycles");
        for (List<ThreadDump.Thread> deadlockedCycle : deadlockedCycles) {
            jg.writeStartArray();
            for (ThreadDump.Thread thread : deadlockedCycle) {
                jg.writeStartObject();
                jg.writeStringField("name", thread.getName());
                LockInfo lockInfo = thread.getLockInfo();
                jg.writeStringField("desc1", "waiting to lock " + lockInfo.getClassName() + "@"
                        + Integer.toHexString(lockInfo.getIdentityHashCode()));
                ThreadDump.Thread lockOwner =
                        checkNotNull(blockedThreads.get(thread.getLockOwnerId().getValue()));
                jg.writeStringField("desc2", "which is held by \"" + lockOwner.getName() + "\"");
                jg.writeEndObject();
            }
            jg.writeEndArray();
        }
        jg.writeEndArray();
    }

    private static List<List<ThreadDump.Thread>> findDeadlockedCycles(
            Map<Long, ThreadDump.Thread> blockedThreads) {
        if (blockedThreads.isEmpty()) {
            // optimized common case
            return ImmutableList.of();
        }
        Map<Long, ThreadDump.Thread> remainingBlockedThreads = Maps.newHashMap(blockedThreads);
        List<ThreadDump.Thread> cycleRoots = Lists.newArrayList();
        while (!remainingBlockedThreads.isEmpty()) {
            Iterator<Entry<Long, ThreadDump.Thread>> i =
                    remainingBlockedThreads.entrySet().iterator();
            Map.Entry<Long, ThreadDump.Thread> entry = i.next();
            long currThreadId = entry.getKey();
            ThreadDump.Thread currThread = entry.getValue();
            i.remove();
            Set<Long> seenThreadIds = Sets.newHashSet();
            while (currThread != null) {
                seenThreadIds.add(currThreadId);
                currThreadId = currThread.getLockOwnerId().getValue();
                if (seenThreadIds.contains(currThreadId)) {
                    cycleRoots.add(currThread);
                    break;
                }
                currThread = remainingBlockedThreads.remove(currThreadId);
            }
        }
        if (cycleRoots.isEmpty()) {
            // optimized common case
            return ImmutableList.of();
        }
        List<List<ThreadDump.Thread>> cycles = Lists.newArrayList();
        for (ThreadDump.Thread cycleRoot : cycleRoots) {
            List<ThreadDump.Thread> cycle = Lists.newArrayList(cycleRoot);
            ThreadDump.Thread cycleThread =
                    checkNotNull(blockedThreads.get(cycleRoot.getLockOwnerId().getValue()));
            while (cycleThread != cycleRoot) {
                cycle.add(cycleThread);
                cycleThread =
                        checkNotNull(blockedThreads.get(cycleThread.getLockOwnerId().getValue()));
            }
            Collections.sort(cycle, new ThreadOrdering());
            cycles.add(cycle);
        }
        Collections.sort(cycles, new DeadlockedCycleOrdering());
        return cycles;
    }

    private static void writeStackTraceElement(ThreadDump.StackTraceElement stackTraceElement,
            JsonGenerator jg) throws IOException {
        jg.writeString("at " + new StackTraceElement(stackTraceElement.getClassName(),
                stackTraceElement.getMethodName(), stackTraceElement.getFileName(),
                stackTraceElement.getLineNumber()).toString());
    }

    private static void writeMonitorInfo(String operation, ThreadDump.LockInfo monitorInfo,
            JsonGenerator jg) throws IOException {
        jg.writeString("- " + operation + " " + monitorInfo.getClassName() + "@"
                + Integer.toHexString(monitorInfo.getIdentityHashCode()));
    }

    private static Map<String, /*@Nullable*/ Object> getSortedAttributeMap(
            List<MBeanDump.MBeanAttribute> attributes) {
        Map<String, /*@Nullable*/ Object> sortedAttributeMap = Maps.newTreeMap();
        for (MBeanDump.MBeanAttribute attribute : attributes) {
            sortedAttributeMap.put(attribute.getName(), getAttributeValue(attribute.getValue()));
        }
        return sortedAttributeMap;
    }

    private static @Nullable Object getAttributeValue(MBeanDump.MBeanValue value) {
        if (value.getNull()) {
            return null;
        }
        switch (value.getValCase()) {
            case STRING:
                return value.getString();
            case DOUBLE:
                return value.getDouble();
            case LONG:
                return value.getLong();
            case BOOLEAN:
                return value.getBoolean();
            case LIST:
                List</*@Nullable*/ Object> list = Lists.newArrayList();
                for (MBeanDump.MBeanValue val : value.getList().getValueList()) {
                    list.add(getAttributeValue(val));
                }
                return list;
            case MAP:
                Map<String, /*@Nullable*/ Object> map = Maps.newHashMap();
                for (MBeanDump.MBeanValueMapEntry val : value.getMap().getEntryList()) {
                    map.put(val.getKey(), getAttributeValue(val.getValue()));
                }
                return map;
            default:
                throw new IllegalStateException(
                        "Unexpected mbean value case: " + value.getValCase());
        }
    }

    @Value.Immutable
    interface HeapDumpRequest {
        String directory();
    }

    @Value.Immutable
    interface MBeanTreeRequest {
        List<String> expanded();
    }

    @Value.Immutable
    interface MBeanAttributeMapRequest {
        String objectName();
    }

    private interface MBeanTreeNode {
        String getNodeName();
    }

    static class MBeanTreeInnerNode implements MBeanTreeNode {

        private static final Ordering<MBeanTreeNode> ordering = new Ordering<MBeanTreeNode>() {
            @Override
            public int compare(MBeanTreeNode left, MBeanTreeNode right) {
                return left.getNodeName().compareToIgnoreCase(right.getNodeName());
            }
        };

        private final String name;

        // not using Map here since its possible for multiple leafs with same name
        // e.g. d:type=Foo,name=Bar and d:type=Foo,nonsense=Bar
        // both translate to a leaf named Bar under d/Foo
        private final List<MBeanTreeNode> childNodes = Lists.newArrayList();

        private final Map<String, MBeanTreeInnerNode> innerNodes = Maps.newHashMap();

        private MBeanTreeInnerNode(String name) {
            this.name = name;
        }

        @Override
        @UsedByJsonSerialization
        public String getNodeName() {
            return name;
        }

        @UsedByJsonSerialization
        public List<MBeanTreeNode> getChildNodes() {
            return ordering.sortedCopy(childNodes);
        }

        private MBeanTreeInnerNode getOrCreateNode(String name) {
            MBeanTreeInnerNode innerNode = innerNodes.get(name);
            if (innerNode == null) {
                innerNode = new MBeanTreeInnerNode(name);
                innerNodes.put(name, innerNode);
                childNodes.add(innerNode);
            }
            return innerNode;
        }

        private void addLeafNode(MBeanTreeLeafNode leafNode) {
            childNodes.add(leafNode);
        }
    }

    static class MBeanTreeLeafNode implements MBeanTreeNode {

        // nodeName may not be unique
        private final String nodeName;
        private final String objectName;
        private final boolean expanded;
        private final @Nullable Map<String, /*@Nullable*/ Object> attributeMap;

        private MBeanTreeLeafNode(String nodeName, String objectName, boolean expanded,
                @Nullable Map<String, /*@Nullable*/ Object> attributeMap) {
            this.nodeName = nodeName;
            this.objectName = objectName;
            this.expanded = expanded;
            this.attributeMap = attributeMap;
        }

        @Override
        @UsedByJsonSerialization
        public String getNodeName() {
            return nodeName;
        }

        @UsedByJsonSerialization
        public String getObjectName() {
            return objectName;
        }

        @UsedByJsonSerialization
        public boolean isExpanded() {
            return expanded;
        }

        @UsedByJsonSerialization
        public @Nullable Map<String, /*@Nullable*/ Object> getAttributeMap() {
            return attributeMap;
        }
    }

    private static class ThreadOrdering extends Ordering<ThreadDump.Thread> {
        @Override
        public int compare(ThreadDump.Thread left, ThreadDump.Thread right) {
            return Longs.compare(right.getId(), left.getId());
        }
    }

    private static class DeadlockedCycleOrdering extends Ordering<List<ThreadDump.Thread>> {
        @Override
        public int compare(List<ThreadDump.Thread> left, List<ThreadDump.Thread> right) {
            return Longs.compare(right.get(0).getId(), left.get(0).getId());
        }
    }
}
