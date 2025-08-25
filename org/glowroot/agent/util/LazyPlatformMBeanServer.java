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
package org.glowroot.agent.util;

import java.lang.management.ManagementFactory;
import java.util.List;
import java.util.Set;

import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import javax.management.InstanceAlreadyExistsException;
import javax.management.MBeanInfo;
import javax.management.MBeanServer;
import javax.management.MBeanServerFactory;
import javax.management.MalformedObjectNameException;
import javax.management.NotCompliantMBeanException;
import javax.management.ObjectName;
import javax.management.QueryExp;

import org.glowroot.agent.shaded.google.common.base.Stopwatch;
import org.glowroot.agent.shaded.google.common.collect.Lists;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.MonotonicNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.immutables.value.Value;
import org.glowroot.agent.shaded.slf4j.Logger;
import org.glowroot.agent.shaded.slf4j.LoggerFactory;

import org.glowroot.agent.shaded.glowroot.common.util.OnlyUsedByTests;
import org.glowroot.agent.shaded.glowroot.common.util.Styles;

import static java.util.concurrent.TimeUnit.SECONDS;

// this is needed for jboss-modules because calling ManagementFactory.getPlatformMBeanServer()
// before jboss-modules has set up its own logger will trigger the default JUL LogManager to be
// used, and then jboss/wildfly will fail to start
//
// it is also needed for glassfish because it sets the "javax.management.builder.initial" system
// property during startup (instead of from command line)
// see com.sun.enterprise.admin.launcher.JvmOptions.filter() that filters out from command line
// and see com.sun.enterprise.v3.server.SystemTasksImpl.resolveJavaConfig() that adds it back during
// startup
public class LazyPlatformMBeanServer {

    private static final Logger logger = LoggerFactory.getLogger(LazyPlatformMBeanServer.class);

    // log startup messages using logger name "org.glowroot"
    private static final Logger startupLogger = LoggerFactory.getLogger("org.glowroot");

    @GuardedBy("initListeners")
    private final List<InitListener> initListeners = Lists.newArrayList();

    private final boolean waitForContainerToCreatePlatformMBeanServer;
    private final boolean needsManualPatternMatching;
    private final boolean websphere;

    private final List<ObjectNamePair> toBeRegistered = Lists.newCopyOnWriteArrayList();
    private final List<ObjectName> toBeUnregistered = Lists.newCopyOnWriteArrayList();

    private volatile @MonotonicNonNull MBeanServer platformMBeanServer;

    public static LazyPlatformMBeanServer create() throws Exception {
        LazyPlatformMBeanServer lazyPlatformMBeanServer = new LazyPlatformMBeanServer();
        if (!lazyPlatformMBeanServer.waitForContainerToCreatePlatformMBeanServer) {
            // it is useful to init right away in this case in order to avoid condition where really
            // should wait for container, but works most of the time by luck due to timing of when
            // ensureInit() is first called
            lazyPlatformMBeanServer.ensureInit();
        }
        return lazyPlatformMBeanServer;
    }

    private LazyPlatformMBeanServer() {
        String command = AppServerDetection.getCommand();
        boolean oldJBoss = AppServerDetection.isOldJBoss(command);
        boolean websphere = AppServerDetection.isWebSphere(command);
        waitForContainerToCreatePlatformMBeanServer = AppServerDetection.isJBossModules(command)
                || oldJBoss || AppServerDetection.isGlassfish(command)
                || AppServerDetection.isWebLogic(command) || websphere;
        needsManualPatternMatching = oldJBoss;
        this.websphere = websphere;
    }

    public void lazyRegisterMBean(Object object, String name) {
        ObjectName objectName;
        try {
            objectName = ObjectName.getInstance(name);
        } catch (MalformedObjectNameException e) {
            logger.warn(e.getMessage(), e);
            return;
        }
        synchronized (initListeners) {
            if (platformMBeanServer == null) {
                toBeRegistered.add(ImmutableObjectNamePair.of(object, objectName));
                toBeUnregistered.add(objectName);
            } else {
                try {
                    safeRegisterMBean(object, objectName);
                    toBeUnregistered.add(objectName);
                } catch (Throwable t) {
                    logger.warn(t.getMessage(), t);
                }
            }
        }
    }

    public void invoke(ObjectName name, String operationName, Object[] params, String[] signature)
            throws Exception {
        ensureInit();
        platformMBeanServer.invoke(name, operationName, params, signature);
    }

    public Set<ObjectName> queryNames(@Nullable ObjectName name, @Nullable QueryExp query)
            throws Exception {
        ensureInit();
        if (needsManualPatternMatching && name != null && name.isPattern()) {
            return platformMBeanServer.queryNames(null, new ObjectNamePatternQueryExp(name));
        } else {
            return platformMBeanServer.queryNames(name, query);
        }
    }

    public MBeanInfo getMBeanInfo(ObjectName name) throws Exception {
        ensureInit();
        return platformMBeanServer.getMBeanInfo(name);
    }

    public Object getAttribute(ObjectName name, String attribute) throws Exception {
        ensureInit();
        return platformMBeanServer.getAttribute(name, attribute);
    }

    public void addInitListener(InitListener initListener) {
        synchronized (initListeners) {
            if (platformMBeanServer == null) {
                initListeners.add(initListener);
            } else {
                try {
                    initListener.postInit(platformMBeanServer);
                } catch (Throwable t) {
                    logger.error(t.getMessage(), t);
                }
            }
        }
    }

    @RequiresNonNull("platformMBeanServer")
    private void safeRegisterMBean(Object object, ObjectName name) {
        try {
            platformMBeanServer.registerMBean(object, name);
        } catch (InstanceAlreadyExistsException e) {
            // this happens during unit tests when a non-shared local container is used
            // (so that then there are two local containers in the same jvm)
            //
            // log exception at debug level
            logger.debug(e.getMessage(), e);
        } catch (NotCompliantMBeanException e) {
            if (e.getStackTrace()[0].getClassName()
                    .equals("org.jboss.mx.metadata.MBeanCapability")) {
                // this happens in jboss 4.2.3 because it doesn't know about Java 6 "MXBean"
                // naming convention
                // it's not really that important if glowroot mbeans aren't registered
                logger.debug(e.getMessage(), e);
            } else {
                logger.warn(e.getMessage(), e);
            }
        } catch (Throwable t) {
            logger.warn(t.getMessage(), t);
        }
    }

    @OnlyUsedByTests
    public void close() throws Exception {
        ensureInit();
        for (ObjectName name : toBeUnregistered) {
            platformMBeanServer.unregisterMBean(name);
        }
    }

    @EnsuresNonNull("platformMBeanServer")
    private void ensureInit() throws Exception {
        synchronized (initListeners) {
            if (platformMBeanServer != null) {
                return;
            }
            if (waitForContainerToCreatePlatformMBeanServer) {
                waitForContainerToCreatePlatformMBeanServer(Stopwatch.createUnstarted());
            }
            try {
                platformMBeanServer = ManagementFactory.getPlatformMBeanServer();
            } catch (Exception e) {
                // e.g. on old jboss: JMRuntimeException: Failed to load MBeanServerBuilder class
                // org.jboss.mx.server.MBeanServerBuilderImpl
                logger.debug(e.getMessage(), e);
                List<MBeanServer> mbeanServers = MBeanServerFactory.findMBeanServer(null);
                if (mbeanServers.isEmpty()) {
                    throw e;
                }
                platformMBeanServer = mbeanServers.get(0);
                startupLogger.info("could not load platform mbean server, using {}",
                        platformMBeanServer.getClass().getName());
            }
            for (InitListener initListener : initListeners) {
                try {
                    initListener.postInit(platformMBeanServer);
                } catch (Throwable t) {
                    logger.error(t.getMessage(), t);
                }
            }
            initListeners.clear();
            for (ObjectNamePair objectNamePair : toBeRegistered) {
                safeRegisterMBean(objectNamePair.object(), objectNamePair.name());
            }
            toBeRegistered.clear();
        }
    }

    private void waitForContainerToCreatePlatformMBeanServer(Stopwatch stopwatch)
            throws InterruptedException {
        stopwatch.start();
        while (stopwatch.elapsed(SECONDS) < 60 && !isPlatformMBeanServerCreated(false)) {
            Thread.sleep(100);
        }
        if (!isPlatformMBeanServerCreated(true)) {
            logger.error("platform mbean server was never created by container");
        }
    }

    private boolean isPlatformMBeanServerCreated(boolean logError) {
        List<MBeanServer> mbeanServers = MBeanServerFactory.findMBeanServer(null);
        if (!websphere) {
            return !mbeanServers.isEmpty();
        }
        for (MBeanServer mbeanServer : mbeanServers) {
            if (isWebSpherePlatformMbeanServerAndReady(mbeanServer, logError)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isWebSpherePlatformMbeanServerAndReady(MBeanServer mbeanServer,
            boolean logError) {
        Class<?> mbeanServerClass = mbeanServer.getClass();
        if (!mbeanServerClass.getName().equals("com.ibm.ws.management.PlatformMBeanServer")) {
            return false;
        }
        try {
            // ready when getAdminService() returns non-null
            return mbeanServerClass.getMethod("getAdminService").invoke(mbeanServer) != null;
        } catch (Exception e) {
            logger.debug(e.getMessage(), e);
            if (logError) {
                logger.error(e.getMessage(), e);
            }
            return false;
        }
    }

    public interface InitListener {
        void postInit(MBeanServer mbeanServer) throws Exception;
    }

    @Value.Immutable
    @Styles.AllParameters
    interface ObjectNamePair {
        Object object();
        ObjectName name();
    }

    @SuppressWarnings("serial")
    private static class ObjectNamePatternQueryExp implements QueryExp {

        private final ObjectName pattern;

        private ObjectNamePatternQueryExp(ObjectName pattern) {
            this.pattern = pattern;
        }

        @Override
        public boolean apply(ObjectName name) {
            return pattern.apply(name);
        }

        @Override
        public void setMBeanServer(MBeanServer s) {}
    }
}
