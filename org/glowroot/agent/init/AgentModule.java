/*
 * Copyright 2011-2017 the original author or authors.
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
package org.glowroot.agent.init;

import java.io.File;
import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.Instrumentation;
import java.lang.management.ManagementFactory;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.jar.JarFile;

import javax.annotation.Nullable;

import org.glowroot.agent.shaded.google.common.base.Joiner;
import org.glowroot.agent.shaded.google.common.base.Supplier;
import org.glowroot.agent.shaded.google.common.base.Ticker;
import org.glowroot.agent.shaded.google.common.collect.Lists;
import org.glowroot.agent.shaded.slf4j.Logger;
import org.glowroot.agent.shaded.slf4j.LoggerFactory;

import org.glowroot.agent.api.internal.GlowrootService;
import org.glowroot.agent.collector.Collector;
import org.glowroot.agent.config.ConfigService;
import org.glowroot.agent.config.PluginCache;
import org.glowroot.agent.config.PluginDescriptor;
import org.glowroot.agent.impl.Aggregator;
import org.glowroot.agent.impl.ConfigServiceImpl;
import org.glowroot.agent.impl.GlowrootServiceImpl;
import org.glowroot.agent.impl.ServiceRegistryImpl;
import org.glowroot.agent.impl.ServiceRegistryImpl.ConfigServiceFactory;
import org.glowroot.agent.impl.StackTraceCollector;
import org.glowroot.agent.impl.TimerNameCache;
import org.glowroot.agent.impl.TransactionCollector;
import org.glowroot.agent.impl.TransactionRegistry;
import org.glowroot.agent.impl.TransactionServiceImpl;
import org.glowroot.agent.impl.UserProfileScheduler;
import org.glowroot.agent.live.LiveAggregateRepositoryImpl;
import org.glowroot.agent.live.LiveJvmServiceImpl;
import org.glowroot.agent.live.LiveTraceRepositoryImpl;
import org.glowroot.agent.live.LiveWeavingServiceImpl;
import org.glowroot.agent.util.LazyPlatformMBeanServer;
import org.glowroot.agent.util.OptionalService;
import org.glowroot.agent.util.ThreadAllocatedBytes;
import org.glowroot.agent.util.Tickers;
import org.glowroot.agent.weaving.AdviceCache;
import org.glowroot.agent.weaving.AnalyzedWorld;
import org.glowroot.agent.weaving.IsolatedWeavingClassLoader;
import org.glowroot.agent.weaving.PreInitializeWeavingClasses;
import org.glowroot.agent.weaving.Weaver;
import org.glowroot.agent.weaving.WeavingClassFileTransformer;
import org.glowroot.agent.shaded.glowroot.common.util.Clock;
import org.glowroot.agent.shaded.glowroot.common.util.OnlyUsedByTests;

import static org.glowroot.agent.shaded.google.common.base.Preconditions.checkNotNull;
import static java.util.concurrent.TimeUnit.MILLISECONDS;
import static java.util.concurrent.TimeUnit.MINUTES;

public class AgentModule {

    private static final Logger logger = LoggerFactory.getLogger(AgentModule.class);

    // log startup messages using logger name "org.glowroot"
    private static final Logger startupLogger = LoggerFactory.getLogger("org.glowroot");

    // 1 minute
    private static final long ROLLUP_0_INTERVAL_MILLIS =
            Long.getLong("glowroot.internal.rollup.0.intervalMillis", MINUTES.toMillis(1));

    @OnlyUsedByTests
    public static final ThreadLocal</*@Nullable*/ IsolatedWeavingClassLoader> isolatedWeavingClassLoader =
            new ThreadLocal</*@Nullable*/ IsolatedWeavingClassLoader>();

    private final ConfigService configService;
    private final AnalyzedWorld analyzedWorld;
    private final TransactionRegistry transactionRegistry;
    private final AdviceCache adviceCache;

    private final TransactionCollector transactionCollector;
    private final Aggregator aggregator;

    private final ImmediateTraceStoreWatcher immedateTraceStoreWatcher;

    private final GaugeCollector gaugeCollector;
    private final StackTraceCollector stackTraceCollector;

    private final boolean jvmRetransformClassesSupported;

    private final LiveTraceRepositoryImpl liveTraceRepository;
    private final LiveAggregateRepositoryImpl liveAggregateRepository;
    private final LiveWeavingServiceImpl liveWeavingService;
    private final LiveJvmServiceImpl liveJvmService;

    private final LazyPlatformMBeanServer lazyPlatformMBeanServer;

    // accepts @Nullable Ticker to deal with shading issues when called from GlowrootModule
    public AgentModule(Clock clock, @Nullable Ticker nullableTicker, final PluginCache pluginCache,
            final ConfigService configService,
            Supplier<ScheduledExecutorService> backgroundExecutorSupplier, Collector collector,
            @Nullable Instrumentation instrumentation, File tmpDir) throws Exception {

        Ticker ticker = nullableTicker == null ? Tickers.getTicker() : nullableTicker;
        this.configService = configService;
        transactionRegistry = new TransactionRegistry();

        if (instrumentation != null) {
            for (File pluginJar : pluginCache.pluginJars()) {
                instrumentation.appendToBootstrapClassLoaderSearch(new JarFile(pluginJar));
            }
        }
        adviceCache = new AdviceCache(pluginCache.pluginDescriptors(), pluginCache.pluginJars(),
                configService.getInstrumentationConfigs(), instrumentation, tmpDir);
        analyzedWorld = new AnalyzedWorld(adviceCache.getAdvisorsSupplier(),
                adviceCache.getShimTypes(), adviceCache.getMixinTypes());
        final TimerNameCache timerNameCache = new TimerNameCache();

        Weaver weaver = new Weaver(adviceCache.getAdvisorsSupplier(), adviceCache.getShimTypes(),
                adviceCache.getMixinTypes(), analyzedWorld, transactionRegistry, timerNameCache,
                configService);

        if (instrumentation == null) {
            // instrumentation is null when debugging with LocalContainer
            IsolatedWeavingClassLoader isolatedWeavingClassLoader =
                    AgentModule.isolatedWeavingClassLoader.get();
            checkNotNull(isolatedWeavingClassLoader);
            isolatedWeavingClassLoader.setWeaver(weaver);
            jvmRetransformClassesSupported = false;
        } else {
            PreInitializeWeavingClasses.preInitializeClasses();
            ClassFileTransformer transformer = new WeavingClassFileTransformer(weaver);
            if (instrumentation.isRetransformClassesSupported()) {
                instrumentation.addTransformer(transformer, true);
                jvmRetransformClassesSupported = true;
            } else {
                instrumentation.addTransformer(transformer);
                jvmRetransformClassesSupported = false;
            }
            logRunnableCallableClassWarningIfNeeded(instrumentation);
        }

        // now that instrumentation is set up, it is safe to create scheduled executor
        ScheduledExecutorService backgroundExecutor = backgroundExecutorSupplier.get();

        aggregator = new Aggregator(collector, configService, ROLLUP_0_INTERVAL_MILLIS, clock);
        transactionCollector =
                new TransactionCollector(configService, collector, aggregator, clock, ticker);

        OptionalService<ThreadAllocatedBytes> threadAllocatedBytes = ThreadAllocatedBytes.create();

        Random random = new Random();
        UserProfileScheduler userProfileScheduler =
                new UserProfileScheduler(backgroundExecutor, configService, random);
        GlowrootService glowrootService = new GlowrootServiceImpl(transactionRegistry);
        TransactionServiceImpl.create(transactionRegistry, transactionCollector, configService,
                timerNameCache, threadAllocatedBytes.getService(), userProfileScheduler, ticker,
                clock);
        ConfigServiceFactory configServiceFactory = new ConfigServiceFactory() {
            @Override
            public org.glowroot.agent.plugin.api.config.ConfigService create(String pluginId) {
                checkNotNull(configService);
                checkNotNull(pluginCache);
                return ConfigServiceImpl.create(configService, pluginCache.pluginDescriptors(),
                        pluginId);
            }
        };
        ServiceRegistryImpl.init(glowrootService, timerNameCache, configServiceFactory);

        lazyPlatformMBeanServer = LazyPlatformMBeanServer.create();
        File[] roots = File.listRoots();
        if (roots != null) {
            for (File root : roots) {
                String name = root.getCanonicalPath();
                if (name.length() > 1 && (name.endsWith("/") || name.endsWith("\\"))) {
                    name = name.substring(0, name.length() - 1);
                }
                name = name.replaceAll(":", "");
                lazyPlatformMBeanServer.lazyRegisterMBean(new FileSystem(root),
                        "org.glowroot:type=FileSystem,name=" + name);
            }
        }
        gaugeCollector = new GaugeCollector(configService, collector, lazyPlatformMBeanServer,
                clock, ticker);
        // using fixed rate to keep gauge collections close to on the second mark
        long gaugeCollectionIntervalMillis = configService.getGaugeCollectionIntervalMillis();
        gaugeCollector.scheduleWithFixedDelay(gaugeCollectionIntervalMillis, MILLISECONDS);
        stackTraceCollector = new StackTraceCollector(transactionRegistry, configService, random);

        immedateTraceStoreWatcher = new ImmediateTraceStoreWatcher(backgroundExecutor,
                transactionRegistry, transactionCollector, configService, ticker);
        immedateTraceStoreWatcher.scheduleWithFixedDelay(backgroundExecutor,
                ImmediateTraceStoreWatcher.PERIOD_MILLIS, MILLISECONDS);

        liveTraceRepository = new LiveTraceRepositoryImpl(transactionRegistry, transactionCollector,
                clock, ticker);
        liveAggregateRepository = new LiveAggregateRepositoryImpl(aggregator);
        liveWeavingService = new LiveWeavingServiceImpl(analyzedWorld, instrumentation,
                configService, adviceCache, jvmRetransformClassesSupported);
        liveJvmService = new LiveJvmServiceImpl(lazyPlatformMBeanServer, transactionRegistry,
                transactionCollector, threadAllocatedBytes.getAvailability());

        initPlugins(pluginCache.pluginDescriptors());

        List<PluginDescriptor> pluginDescriptors = pluginCache.pluginDescriptors();
        List<String> pluginNames = Lists.newArrayList();
        for (PluginDescriptor pluginDescriptor : pluginDescriptors) {
            pluginNames.add(pluginDescriptor.name());
        }
        if (!pluginNames.isEmpty()) {
            startupLogger.info("plugins loaded: {}", Joiner.on(", ").join(pluginNames));
        }
    }

    public ConfigService getConfigService() {
        return configService;
    }

    public LazyPlatformMBeanServer getLazyPlatformMBeanServer() {
        return lazyPlatformMBeanServer;
    }

    public LiveTraceRepositoryImpl getLiveTraceRepository() {
        return liveTraceRepository;
    }

    public LiveAggregateRepositoryImpl getLiveAggregateRepository() {
        return liveAggregateRepository;
    }

    public LiveWeavingServiceImpl getLiveWeavingService() {
        return liveWeavingService;
    }

    public LiveJvmServiceImpl getLiveJvmService() {
        return liveJvmService;
    }

    private static void logRunnableCallableClassWarningIfNeeded(Instrumentation instrumentation) {
        List<String> runnableCallableClasses = Lists.newArrayList();
        for (Class<?> clazz : instrumentation.getAllLoadedClasses()) {
            if (clazz.isInterface()) {
                continue;
            }
            if (!clazz.getName().startsWith("java.util.concurrent.")) {
                continue;
            }
            if (Runnable.class.isAssignableFrom(clazz) || Callable.class.isAssignableFrom(clazz)) {
                runnableCallableClasses.add(clazz.getName());
            }
        }
        if (runnableCallableClasses.isEmpty()) {
            return;
        }
        List<String> nonGlowrootAgents = Lists.newArrayList();
        for (String jvmArg : ManagementFactory.getRuntimeMXBean().getInputArguments()) {
            if (jvmArg.startsWith("-javaagent:") && !jvmArg.endsWith("glowroot.jar")
                    || jvmArg.startsWith("-agentpath:")) {
                nonGlowrootAgents.add(jvmArg);
            }
        }
        String extraExplanation = "";
        if (!nonGlowrootAgents.isEmpty()) {
            extraExplanation = "This likely occurred because there";
            if (nonGlowrootAgents.size() == 1) {
                extraExplanation += " is another agent";
            } else {
                extraExplanation += " are other agents";
            }
            extraExplanation += " listed in the JVM args prior to the Glowroot agent ("
                    + Joiner.on(" ").join(nonGlowrootAgents)
                    + ") which gives the other agent";
            if (nonGlowrootAgents.size() != 1) {
                extraExplanation += "s";
            }
            extraExplanation += " higher loading precedence. ";
        }
        logger.warn("one or more java.lang.Runnable or java.util.concurrent.Callable"
                + " implementations were loaded before Glowroot instrumentation could be applied to"
                + " them: {}. {}This may prevent Glowroot from capturing async requests that span"
                + " multiple threads.", Joiner.on(", ").join(runnableCallableClasses),
                extraExplanation);
    }

    // now init plugins to give them a chance to do something in their static initializer
    // e.g. append their package to jboss.modules.system.pkgs
    private static void initPlugins(List<PluginDescriptor> pluginDescriptors) {
        for (PluginDescriptor pluginDescriptor : pluginDescriptors) {
            for (String aspect : pluginDescriptor.aspects()) {
                try {
                    Class.forName(aspect, true, AgentModule.class.getClassLoader());
                } catch (ClassNotFoundException e) {
                    // this would have already been logged as a warning during advice construction
                    logger.debug(e.getMessage(), e);
                }
            }
        }
    }

    @OnlyUsedByTests
    public void close() throws Exception {
        immedateTraceStoreWatcher.cancel();
        transactionCollector.close();
        aggregator.close();
        gaugeCollector.close();
        stackTraceCollector.close();
        lazyPlatformMBeanServer.close();
    }
}
