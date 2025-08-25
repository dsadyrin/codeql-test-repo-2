/*
 * Copyright 2017 the original author or authors.
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
package org.glowroot.agent.shaded.glowroot.common.repo;

import java.util.List;

import org.immutables.value.Value;

import org.glowroot.agent.shaded.glowroot.common.util.Styles;
import org.glowroot.agent.shaded.glowroot.wire.api.model.AgentConfigOuterClass.AgentConfig.AlertConfig.AlertCondition;

public interface TriggeredAlertRepository {

    List<TriggeredAlert> readAll() throws Exception;

    boolean exists(String agentRollupId, AlertCondition alertCondition) throws Exception;

    void delete(String agentRollupId, AlertCondition alertCondition) throws Exception;

    void insert(String agentRollupId, AlertCondition alertCondition) throws Exception;

    List<AlertCondition> readAlertConditions(String agentRollupId) throws Exception;

    @Value.Immutable
    @Styles.AllParameters
    interface TriggeredAlert {
        String agentRollupId();
        AlertCondition alertCondition();
    }
}
