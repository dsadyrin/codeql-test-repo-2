/*
 * Copyright 2012-2016 the original author or authors.
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
package org.glowroot.agent.config;

import java.io.IOException;
import java.util.List;

import org.glowroot.agent.shaded.fasterxml.jackson.annotation.JsonProperty;
import org.glowroot.agent.shaded.fasterxml.jackson.core.JsonGenerator;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.ObjectMapper;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.module.SimpleModule;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.node.ObjectNode;
import org.glowroot.agent.shaded.google.common.collect.ImmutableList;
import org.glowroot.agent.shaded.google.common.io.CharStreams;
import org.immutables.value.Value;

import org.glowroot.agent.shaded.glowroot.common.util.ObjectMappers;

@Value.Immutable
public abstract class PluginDescriptor {

    public abstract String id();
    public abstract String name();
    public abstract ImmutableList<PropertyDescriptor> properties();
    @JsonProperty("instrumentation")
    public abstract ImmutableList<InstrumentationConfig> instrumentationConfigs();
    public abstract ImmutableList<String> aspects();

    // this is only for use by glowroot-agent-dist-maven-plugin, which needs to perform
    // de-serialization of shaded immutables objects using shaded jackson
    public static PluginDescriptor readValue(String content) throws IOException {
        SimpleModule module = new SimpleModule();
        module.addAbstractTypeMapping(InstrumentationConfig.class,
                ImmutableInstrumentationConfig.class);
        module.addAbstractTypeMapping(PropertyDescriptor.class, ImmutablePropertyDescriptor.class);
        ObjectMapper mapper = ObjectMappers.create(module);
        return mapper.readValue(content, ImmutablePluginDescriptor.class);
    }

    // this is only for use by glowroot-agent-dist-maven-plugin, which needs to perform
    // serialization of shaded immutables objects using shaded jackson
    public static String writeValue(List<PluginDescriptor> pluginDescriptors) throws IOException {
        ObjectMapper mapper = ObjectMappers.create();
        StringBuilder sb = new StringBuilder();
        JsonGenerator jg = mapper.getFactory().createGenerator(CharStreams.asWriter(sb))
                .setPrettyPrinter(ObjectMappers.getPrettyPrinter());
        jg.writeStartArray();
        for (PluginDescriptor pluginDescriptor : pluginDescriptors) {
            ObjectNode objectNode = mapper.valueToTree(pluginDescriptor);
            ObjectMappers.stripEmptyContainerNodes(objectNode);
            jg.writeTree(objectNode);
        }
        jg.writeEndArray();
        jg.close();
        // newline is not required, just a personal preference
        sb.append(ObjectMappers.NEWLINE);
        return sb.toString();
    }
}
