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
package org.glowroot.agent.shaded.glowroot.common.config;

public interface ConfigDefaults {

    String DEFAULT_DISPLAYED_TRANSACTION_TYPE = "Web";

    double DEFAULT_DISPLAYED_PERCENTILE_1 = 50.0;
    double DEFAULT_DISPLAYED_PERCENTILE_2 = 95.0;
    double DEFAULT_DISPLAYED_PERCENTILE_3 = 99.0;

    int MAX_AGGREGATE_TRANSACTIONS_PER_TYPE = 500;
    int MAX_AGGREGATE_QUERIES_PER_TYPE = 500;
    int MAX_AGGREGATE_SERVICE_CALLS_PER_TYPE = 500;
}
