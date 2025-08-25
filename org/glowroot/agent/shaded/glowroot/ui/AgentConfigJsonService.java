/*
 * Copyright 2016-2017 the original author or authors.
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

import org.glowroot.agent.shaded.fasterxml.jackson.databind.ObjectMapper;
import org.glowroot.agent.shaded.google.common.base.Optional;
import org.glowroot.agent.shaded.netty.handler.codec.http.HttpResponseStatus;
import org.immutables.value.Value;

import org.glowroot.agent.shaded.glowroot.common.config.AgentRollupConfig;
import org.glowroot.agent.shaded.glowroot.common.config.ImmutableAgentRollupConfig;
import org.glowroot.agent.shaded.glowroot.common.repo.AgentRollupRepository;
import org.glowroot.agent.shaded.glowroot.common.repo.ConfigRepository;
import org.glowroot.agent.shaded.glowroot.common.util.ObjectMappers;

@JsonService
class AgentConfigJsonService {

    private static final ObjectMapper mapper = ObjectMappers.create();

    private final ConfigRepository configRepository;
    private final AgentRollupRepository agentRollupRepository;

    AgentConfigJsonService(ConfigRepository configRepository,
            AgentRollupRepository agentRollupRepository) {
        this.configRepository = configRepository;
        this.agentRollupRepository = agentRollupRepository;
    }

    @GET(path = "/backend/admin/agent-rollups", permission = "admin:view:agentRollup")
    String getAgentRollupConfig(@BindRequest AgentRollupConfigRequest request) throws Exception {
        Optional<String> agentRollupId = request.agentRollupId();
        if (agentRollupId.isPresent()) {
            return getAgentRollupConfigInternal(agentRollupId.get());
        } else {
            return mapper.writeValueAsString(agentRollupRepository.readAgentRollups());
        }
    }

    @POST(path = "/backend/admin/agent-rollups/update", permission = "admin:edit:agentRollup")
    String updateAgentRollup(@BindRequest AgentRollupConfigDto agentRollupConfigDto)
            throws Exception {
        configRepository.updateAgentRollupConfig(agentRollupConfigDto.convert(),
                agentRollupConfigDto.version());
        return getAgentRollupConfigInternal(agentRollupConfigDto.id());
    }

    @POST(path = "/backend/admin/agent-rollups/remove", permission = "admin:edit:agentRollup")
    void removeUser(@BindRequest AgentRollupConfigRequest request) throws Exception {
        configRepository.deleteAgentRollupConfig(request.agentRollupId().get());
    }

    private String getAgentRollupConfigInternal(String agentRollupId) throws Exception {
        AgentRollupConfig agentRollupConfig = configRepository.getAgentRollupConfig(agentRollupId);
        if (agentRollupConfig == null) {
            throw new JsonServiceException(HttpResponseStatus.NOT_FOUND);
        }
        return mapper.writeValueAsString(AgentRollupConfigDto.create(agentRollupConfig));
    }

    @Value.Immutable
    interface AgentRollupConfigRequest {
        Optional<String> agentRollupId();
    }

    @Value.Immutable
    abstract static class AgentRollupConfigDto {

        abstract String id();
        abstract String display();
        abstract String version();

        private AgentRollupConfig convert() {
            return ImmutableAgentRollupConfig.builder()
                    .id(id())
                    .display(display())
                    .build();
        }

        private static AgentRollupConfigDto create(AgentRollupConfig config) {
            return ImmutableAgentRollupConfigDto.builder()
                    .id(config.id())
                    .display(config.display())
                    .version(config.version())
                    .build();
        }
    }
}
