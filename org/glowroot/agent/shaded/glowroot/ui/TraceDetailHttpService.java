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
package org.glowroot.agent.shaded.glowroot.ui;

import java.util.List;

import javax.annotation.Nullable;

import org.glowroot.agent.shaded.google.common.net.MediaType;
import org.glowroot.agent.shaded.slf4j.Logger;
import org.glowroot.agent.shaded.slf4j.LoggerFactory;

import org.glowroot.agent.shaded.glowroot.ui.CommonHandler.CommonRequest;
import org.glowroot.agent.shaded.glowroot.ui.CommonHandler.CommonResponse;
import org.glowroot.agent.shaded.glowroot.ui.HttpSessionManager.Authentication;

import static org.glowroot.agent.shaded.google.common.base.Preconditions.checkState;
import static org.glowroot.agent.shaded.netty.handler.codec.http.HttpResponseStatus.NOT_FOUND;
import static org.glowroot.agent.shaded.netty.handler.codec.http.HttpResponseStatus.OK;

class TraceDetailHttpService implements HttpService {

    private static final Logger logger = LoggerFactory.getLogger(TraceDetailHttpService.class);

    private final TraceCommonService traceCommonService;

    TraceDetailHttpService(TraceCommonService traceCommonService) {
        this.traceCommonService = traceCommonService;
    }

    @Override
    public String getPermission() {
        // see special case for "agent:trace" permission in Authentication.isAgentPermitted()
        return "agent:trace";
    }

    @Override
    public CommonResponse handleRequest(CommonRequest request, Authentication authentication)
            throws Exception {
        String path = request.getPath();
        String traceComponent = path.substring(path.lastIndexOf('/') + 1);
        List<String> agentRollupIds = request.getParameters("agent-rollup-id");
        checkState(!agentRollupIds.isEmpty(), "Missing agent rollup in query string: %s",
                request.getUri());
        String agentRollupId = agentRollupIds.get(0);
        List<String> agentIds = request.getParameters("agent-id");
        checkState(!agentIds.isEmpty(), "Missing agent id in query string: %s", request.getUri());
        String agentId = agentIds.get(0);
        List<String> traceIds = request.getParameters("trace-id");
        checkState(!traceIds.isEmpty(), "Missing trace id in query string: %s", request.getUri());
        String traceId = traceIds.get(0);
        // check-live-traces is an optimization so the central collector only has to check with
        // remote agents when necessary
        List<String> checkLiveTracesParams = request.getParameters("check-live-traces");
        boolean checkLiveTraces = !checkLiveTracesParams.isEmpty()
                && Boolean.parseBoolean(checkLiveTracesParams.get(0));
        logger.debug("handleRequest(): traceComponent={}, agentRollupId={}, agentId={}, traceId={},"
                + " checkLiveTraces={}", traceComponent, agentRollupId, agentId, traceId,
                checkLiveTraces);

        ChunkSource detail = getDetailChunkSource(traceComponent, agentRollupId, agentId, traceId,
                checkLiveTraces);
        if (detail == null) {
            return new CommonResponse(NOT_FOUND);
        }
        return new CommonResponse(OK, MediaType.JSON_UTF_8, detail);
    }

    private @Nullable ChunkSource getDetailChunkSource(String traceComponent, String agentRollupId,
            String agentId, String traceId, boolean checkLiveTraces) throws Exception {
        if (traceComponent.equals("entries")) {
            String entriesJson = traceCommonService.getEntriesJson(agentRollupId, agentId, traceId,
                    checkLiveTraces);
            if (entriesJson == null) {
                // this includes trace was found but the trace had no entries
                // caller should check trace.entry_count
                return null;
            }
            return ChunkSource.wrap(entriesJson);
        }
        if (traceComponent.equals("main-thread-profile")) {
            String profileJson = traceCommonService.getMainThreadProfileJson(agentRollupId, agentId,
                    traceId, checkLiveTraces);
            if (profileJson == null) {
                return null;
            }
            return ChunkSource.wrap(profileJson);
        }
        if (traceComponent.equals("aux-thread-profile")) {
            String profileJson = traceCommonService.getAuxThreadProfileJson(agentRollupId, agentId,
                    traceId, checkLiveTraces);
            if (profileJson == null) {
                return null;
            }
            return ChunkSource.wrap(profileJson);
        }
        throw new IllegalStateException("Unexpected trace component: " + traceComponent);
    }
}
