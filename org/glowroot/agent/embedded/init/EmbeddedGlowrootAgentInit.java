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
package org.glowroot.agent.embedded.init;

import java.io.File;
import java.io.IOException;
import java.lang.instrument.Instrumentation;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.annotation.Nullable;

import org.checkerframework.checker.nullness.qual.MonotonicNonNull;
import org.glowroot.agent.shaded.slf4j.Logger;
import org.glowroot.agent.shaded.slf4j.LoggerFactory;

import org.glowroot.agent.init.AgentModule;
import org.glowroot.agent.init.GlowrootAgentInit;
import org.glowroot.agent.init.NettyWorkaround;
import org.glowroot.agent.init.NettyWorkaround.NettyInit;
import org.glowroot.agent.util.ThreadFactories;
import org.glowroot.agent.shaded.glowroot.common.util.OnlyUsedByTests;

import static org.glowroot.agent.shaded.google.common.base.Preconditions.checkNotNull;

public class EmbeddedGlowrootAgentInit implements GlowrootAgentInit {

    private static final Logger logger = LoggerFactory.getLogger(EmbeddedGlowrootAgentInit.class);

    private final File dataDir;
    private final boolean offline;

    public EmbeddedGlowrootAgentInit(File dataDir, boolean offline) {
        this.dataDir = dataDir;
        this.offline = offline;
    }

    private @MonotonicNonNull EmbeddedAgentModule embeddedAgentModule;

    @Override
    public void init(@Nullable File pluginsDir, File confDir, @Nullable File sharedConfDir,
            File logDir, File tmpDir, Map<String, String> properties,
            @Nullable Instrumentation instrumentation, String glowrootVersion) throws Exception {

        embeddedAgentModule = new EmbeddedAgentModule(pluginsDir, confDir, sharedConfDir, logDir,
                dataDir, tmpDir, properties, instrumentation, glowrootVersion, offline);
        NettyWorkaround.run(instrumentation, new NettyInit() {
            @Override
            public void execute(boolean alreadyInsideNewThread) throws Exception {
                checkNotNull(embeddedAgentModule);
                if (alreadyInsideNewThread) {
                    embeddedAgentModule.waitForSimpleRepoModule();
                    embeddedAgentModule.initEmbeddedServer();
                    return;
                }
                // need to start new thread in order not to block agent startup
                ExecutorService singleUseExecutor = Executors
                        .newSingleThreadExecutor(ThreadFactories.create("Glowroot-Init-UI"));
                singleUseExecutor.execute(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            // TODO report checker framework issue that occurs without checkNotNull
                            checkNotNull(embeddedAgentModule);
                            embeddedAgentModule.waitForSimpleRepoModule();
                            embeddedAgentModule.initEmbeddedServer();
                        } catch (Exception e) {
                            logger.error(e.getMessage(), e);
                        }
                    }
                });
            }
        });
    }

    @Override
    @OnlyUsedByTests
    public void setSlowThresholdToZero() throws IOException {
        EmbeddedAgentModule embeddedAgentModule = checkNotNull(this.embeddedAgentModule);
        AgentModule agentModule = embeddedAgentModule.getAgentModule();
        agentModule.getConfigService().setSlowThresholdToZero();
    }

    @Override
    @OnlyUsedByTests
    public void resetConfig() throws Exception {
        EmbeddedAgentModule embeddedAgentModule = checkNotNull(this.embeddedAgentModule);
        AgentModule agentModule = embeddedAgentModule.getAgentModule();
        agentModule.getConfigService().resetConfig();
        ((ConfigRepositoryImpl) embeddedAgentModule.getSimpleRepoModule().getConfigRepository())
                .resetAdminConfig();
        agentModule.getLiveWeavingService().reweave("");
    }

    @Override
    @OnlyUsedByTests
    public void close() throws Exception {
        checkNotNull(embeddedAgentModule).close();
    }

    @Override
    @OnlyUsedByTests
    public void awaitClose() {}
}
