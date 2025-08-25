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
package org.glowroot.agent.shaded.glowroot.ui;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

import javax.annotation.Nullable;

import org.glowroot.agent.shaded.google.common.collect.ImmutableSet;
import org.glowroot.agent.shaded.google.common.collect.Sets;
import org.glowroot.agent.shaded.google.common.net.MediaType;
import org.glowroot.agent.shaded.netty.handler.codec.http.HttpHeaderNames;
import org.glowroot.agent.shaded.netty.handler.codec.http.cookie.Cookie;
import org.glowroot.agent.shaded.netty.handler.codec.http.cookie.DefaultCookie;
import org.glowroot.agent.shaded.netty.handler.codec.http.cookie.ServerCookieDecoder;
import org.glowroot.agent.shaded.netty.handler.codec.http.cookie.ServerCookieEncoder;
import org.immutables.serial.Serial;
import org.immutables.value.Value;
import org.glowroot.agent.shaded.slf4j.Logger;
import org.glowroot.agent.shaded.slf4j.LoggerFactory;

import org.glowroot.agent.shaded.glowroot.common.config.LdapConfig;
import org.glowroot.agent.shaded.glowroot.common.config.RoleConfig;
import org.glowroot.agent.shaded.glowroot.common.config.RoleConfig.SimplePermission;
import org.glowroot.agent.shaded.glowroot.common.config.UserConfig;
import org.glowroot.agent.shaded.glowroot.common.repo.ConfigRepository;
import org.glowroot.agent.shaded.glowroot.common.util.Clock;
import org.glowroot.agent.shaded.glowroot.ui.CommonHandler.CommonRequest;
import org.glowroot.agent.shaded.glowroot.ui.CommonHandler.CommonResponse;
import org.glowroot.agent.shaded.glowroot.ui.LdapAuthentication.AuthenticationException;

import static org.glowroot.agent.shaded.google.common.base.Preconditions.checkState;
import static org.glowroot.agent.shaded.netty.handler.codec.http.HttpResponseStatus.OK;
import static java.util.concurrent.TimeUnit.MINUTES;

class HttpSessionManager {

    private static final Logger logger = LoggerFactory.getLogger(HttpSessionManager.class);
    private static final Logger auditLogger = LoggerFactory.getLogger("audit");

    private final boolean central;
    private final boolean offline;
    private final ConfigRepository configRepository;
    private final Clock clock;
    private final LayoutService layoutService;

    private final SecureRandom secureRandom = new SecureRandom();
    private final ConcurrentMap<String, ImmutableSession> sessionMap;

    HttpSessionManager(boolean central, boolean offline, ConfigRepository configRepository,
            Clock clock, LayoutService layoutService, SessionMapFactory sessionMapFactory) {
        this.central = central;
        this.offline = offline;
        this.configRepository = configRepository;
        this.clock = clock;
        this.layoutService = layoutService;
        this.sessionMap = sessionMapFactory.create();
    }

    CommonResponse login(String username, String password) throws Exception {
        if (username.equalsIgnoreCase("anonymous")) {
            auditFailedLogin(username);
            return buildIncorrectLoginResponse();
        }
        UserConfig userConfig = getUserConfigCaseInsensitive(username);
        if (userConfig == null || userConfig.ldap()) {
            Set<String> roles;
            try {
                roles = authenticateAgainstLdapAndGetGlowrootRoles(username, password);
            } catch (AuthenticationException e) {
                logger.debug(e.getMessage(), e);
                auditFailedLogin(username);
                return buildIncorrectLoginResponse();
            }
            if (userConfig != null) {
                roles = Sets.newHashSet(roles);
                roles.addAll(userConfig.roles());
            }
            if (!roles.isEmpty()) {
                return createSession(username, roles, true);
            }
        } else if (validatePassword(password, userConfig.passwordHash())) {
            return createSession(userConfig.username(), userConfig.roles(), false);
        }
        auditFailedLogin(username);
        return buildIncorrectLoginResponse();
    }

    void signOut(CommonRequest request) throws Exception {
        String sessionId = getSessionId(request);
        if (sessionId != null) {
            Session session = sessionMap.remove(sessionId);
            if (session != null) {
                auditLogout(session.caseAmbiguousUsername());
            }
        }
    }

    void deleteSessionCookie(CommonResponse response) throws Exception {
        Cookie cookie = new DefaultCookie(configRepository.getWebConfig().sessionCookieName(), "");
        cookie.setHttpOnly(true);
        cookie.setMaxAge(0);
        cookie.setPath("/");
        response.setHeader(HttpHeaderNames.SET_COOKIE, ServerCookieEncoder.STRICT.encode(cookie));
    }

    Authentication getAuthentication(CommonRequest request, boolean touch) throws Exception {
        if (offline) {
            return getOfflineViewerAuthentication();
        }
        String sessionId = getSessionId(request);
        if (sessionId == null) {
            return getAnonymousAuthentication();
        }
        Session session = sessionMap.get(sessionId);
        if (session == null) {
            return getAnonymousAuthentication();
        }
        long currentTimeMillis = clock.currentTimeMillis();
        long timeoutMillis =
                MINUTES.toMillis(configRepository.getWebConfig().sessionTimeoutMinutes());
        if (session.isTimedOut(currentTimeMillis, timeoutMillis)) {
            return getAnonymousAuthentication();
        }
        if (touch) {
            // need to re-put in order to force replication when using clustered central
            sessionMap.put(sessionId, ImmutableSession.builder()
                    .copyFrom(session)
                    .lastRequest(currentTimeMillis)
                    .build());
        }
        return session.createAuthentication(central, configRepository);
    }

    @Nullable
    String getSessionId(CommonRequest request) throws Exception {
        String cookieHeader = request.getHeader(HttpHeaderNames.COOKIE);
        if (cookieHeader == null) {
            return null;
        }
        Set<Cookie> cookies = ServerCookieDecoder.STRICT.decode(cookieHeader);
        for (Cookie cookie : cookies) {
            if (cookie.name().equals(configRepository.getWebConfig().sessionCookieName())) {
                return cookie.value();
            }
        }
        return null;
    }

    Authentication getAnonymousAuthentication() throws Exception {
        UserConfig userConfig = getUserConfigCaseInsensitive("anonymous");
        return ImmutableAuthentication.builder()
                .central(central)
                .offline(false)
                .anonymous(true)
                .ldap(false)
                .caseAmbiguousUsername("anonymous")
                .roles(userConfig == null ? ImmutableSet.<String>of() : userConfig.roles())
                .configRepository(configRepository)
                .build();
    }

    private CommonResponse buildIncorrectLoginResponse() {
        return new CommonResponse(OK, MediaType.JSON_UTF_8, "{\"incorrectLogin\":true}");
    }

    private CommonResponse createSession(String username, Set<String> roles, boolean ldap)
            throws Exception {
        String sessionId = new BigInteger(130, secureRandom).toString(32);
        ImmutableSession session = ImmutableSession.builder()
                .caseAmbiguousUsername(username)
                .ldap(ldap)
                .roles(roles)
                .lastRequest(clock.currentTimeMillis())
                .build();
        sessionMap.put(sessionId, session);

        String layoutJson = layoutService
                .getLayoutJson(session.createAuthentication(central, configRepository));
        CommonResponse response = new CommonResponse(OK, MediaType.JSON_UTF_8, layoutJson);
        Cookie cookie =
                new DefaultCookie(configRepository.getWebConfig().sessionCookieName(), sessionId);
        cookie.setHttpOnly(true);
        cookie.setPath("/");
        response.setHeader(HttpHeaderNames.SET_COOKIE, ServerCookieEncoder.STRICT.encode(cookie));
        purgeExpiredSessions();

        auditSuccessfulLogin(username);
        return response;
    }

    private Authentication getOfflineViewerAuthentication() {
        return ImmutableAuthentication.builder()
                .central(false) // offline only applies to embedded
                .offline(true)
                .anonymous(true)
                .ldap(false)
                .caseAmbiguousUsername("anonymous")
                .configRepository(configRepository)
                .build();
    }

    private @Nullable UserConfig getUserConfigCaseInsensitive(String username) throws Exception {
        for (UserConfig userConfig : configRepository.getUserConfigs()) {
            if (userConfig.username().equalsIgnoreCase(username)) {
                return userConfig;
            }
        }
        return null;
    }

    private void purgeExpiredSessions() throws Exception {
        long currentTimeMillis = clock.currentTimeMillis();
        long timeoutMillis =
                MINUTES.toMillis(configRepository.getWebConfig().sessionTimeoutMinutes());
        Iterator<Entry<String, ImmutableSession>> i = sessionMap.entrySet().iterator();
        while (i.hasNext()) {
            Session session = i.next().getValue();
            if (session.isTimedOut(currentTimeMillis, timeoutMillis)) {
                i.remove();
                auditSessionTimeout(session.caseAmbiguousUsername());
            }
        }
    }

    private Set<String> authenticateAgainstLdapAndGetGlowrootRoles(String username, String password)
            throws Exception {
        LdapConfig ldapConfig = configRepository.getLdapConfig();
        String host = ldapConfig.host();
        if (host.isEmpty()) {
            throw new AuthenticationException("LDAP is not configured");
        }
        Set<String> ldapGroupDns = LdapAuthentication.authenticateAndGetLdapGroupDns(username,
                password, ldapConfig, null, configRepository.getLazySecretKey());
        return LdapAuthentication.getGlowrootRoles(ldapGroupDns, ldapConfig);
    }

    private void auditFailedLogin(String username) {
        auditLogger.info("{} - failed login", username);
    }

    private void auditSuccessfulLogin(String username) {
        auditLogger.info("{} - successful login", username);
    }

    private void auditLogout(String username) {
        auditLogger.info("{} - logout", username);
    }

    private void auditSessionTimeout(String username) {
        auditLogger.info("{} - session timeout", username);
    }

    private static boolean validatePassword(String password, String passwordHash)
            throws GeneralSecurityException {
        if (passwordHash.isEmpty()) {
            // need special case for empty password
            return password.isEmpty();
        } else {
            return PasswordHash.validatePassword(password, passwordHash);
        }
    }

    @Value.Immutable
    @Serial.Structural
    abstract static class Session {

        abstract String caseAmbiguousUsername(); // the case is exactly as user entered during login
        abstract boolean ldap();
        abstract Set<String> roles();
        abstract long lastRequest();

        Authentication createAuthentication(boolean central, ConfigRepository configRepository) {
            return ImmutableAuthentication.builder()
                    .central(central)
                    .offline(false)
                    .anonymous(false) // sessions are only for non-anonymous authentication
                    .ldap(ldap())
                    .caseAmbiguousUsername(caseAmbiguousUsername())
                    .roles(roles())
                    .configRepository(configRepository)
                    .build();
        }

        private boolean isTimedOut(long currentTimeMillis, long timeoutMillis) {
            return lastRequest() < currentTimeMillis - timeoutMillis;
        }
    }

    @Value.Immutable
    abstract static class Authentication {

        abstract boolean central();
        abstract boolean offline();
        abstract boolean anonymous();
        abstract boolean ldap();
        abstract String caseAmbiguousUsername(); // the case is exactly as user entered during login
        abstract Set<String> roles();

        abstract ConfigRepository configRepository();

        boolean isPermitted(String agentRollupId, String permission) throws Exception {
            if (permission.startsWith("agent:")) {
                return isAgentPermitted(agentRollupId, permission);
            } else {
                return isAdminPermitted(permission);
            }
        }

        boolean isAgentPermitted(String agentRollupId, String permission) throws Exception {
            checkState(permission.startsWith("agent:"));
            if (offline()) {
                return !permission.startsWith("agent:config:edit:");
            }
            if (permission.equals("agent:trace")) {
                // special case for now
                return isAgentPermitted(agentRollupId, "agent:transaction:traces")
                        || isAgentPermitted(agentRollupId, "agent:error:traces");
            }
            return isPermitted(SimplePermission.create(agentRollupId, permission));
        }

        boolean isAdminPermitted(String permission) throws Exception {
            checkState(permission.startsWith("admin:"));
            if (offline()) {
                return permission.equals("admin:view") || permission.startsWith("admin:view:");
            }
            return isPermitted(SimplePermission.create(permission));
        }

        private boolean isPermitted(SimplePermission permission) throws Exception {
            for (RoleConfig roleConfig : configRepository().getRoleConfigs()) {
                if (roles().contains(roleConfig.name()) && roleConfig.isPermitted(permission)) {
                    return true;
                }
            }
            return false;
        }
    }
}
