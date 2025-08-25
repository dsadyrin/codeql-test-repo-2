/**
 * Classes used for exposing logical structure of POJOs as Jackson
 * sees it, and exposed via
 * {@link org.glowroot.agent.shaded.fasterxml.jackson.databind.ObjectMapper#acceptJsonFormatVisitor(Class, JsonFormatVisitorWrapper)}
 * and
 * {@link org.glowroot.agent.shaded.fasterxml.jackson.databind.ObjectMapper#acceptJsonFormatVisitor(org.glowroot.agent.shaded.fasterxml.jackson.databind.JavaType, JsonFormatVisitorWrapper)}
 * methods.
 *<p>
 * The main entrypoint for code, then, is {@link org.glowroot.agent.shaded.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper} and other
 * types are recursively needed during traversal.
 */
package org.glowroot.agent.shaded.fasterxml.jackson.databind.jsonFormatVisitors;
