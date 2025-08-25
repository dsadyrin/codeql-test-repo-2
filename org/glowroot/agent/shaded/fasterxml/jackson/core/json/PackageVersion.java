package org.glowroot.agent.shaded.fasterxml.jackson.core.json;

import org.glowroot.agent.shaded.fasterxml.jackson.core.Version;
import org.glowroot.agent.shaded.fasterxml.jackson.core.Versioned;
import org.glowroot.agent.shaded.fasterxml.jackson.core.util.VersionUtil;

/**
 * Automatically generated from PackageVersion.java.in during
 * packageVersion-generate execution of maven-replacer-plugin in
 * pom.xml.
 */
public final class PackageVersion implements Versioned {
    public final static Version VERSION = VersionUtil.parseVersion(
        "2.6.7", "org.glowroot.agent.shaded.fasterxml.jackson.core", "jackson-core");

    @Override
    public Version version() {
        return VERSION;
    }
}
