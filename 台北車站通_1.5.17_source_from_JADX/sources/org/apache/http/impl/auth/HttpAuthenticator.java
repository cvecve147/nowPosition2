package org.apache.http.impl.auth;

import java.util.Queue;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.auth.AuthOption;
import org.apache.http.auth.AuthProtocolState;
import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthState;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.ContextAwareAuthScheme;
import org.apache.http.auth.Credentials;
import org.apache.http.client.AuthenticationStrategy;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Asserts;

public class HttpAuthenticator {
    private final Log log;

    /* renamed from: org.apache.http.impl.auth.HttpAuthenticator$1 */
    static /* synthetic */ class C70011 {
        static final /* synthetic */ int[] $SwitchMap$org$apache$http$auth$AuthProtocolState = new int[AuthProtocolState.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                org.apache.http.auth.AuthProtocolState[] r0 = org.apache.http.auth.AuthProtocolState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$org$apache$http$auth$AuthProtocolState = r0
                int[] r0 = $SwitchMap$org$apache$http$auth$AuthProtocolState     // Catch:{ NoSuchFieldError -> 0x0014 }
                org.apache.http.auth.AuthProtocolState r1 = org.apache.http.auth.AuthProtocolState.CHALLENGED     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$org$apache$http$auth$AuthProtocolState     // Catch:{ NoSuchFieldError -> 0x001f }
                org.apache.http.auth.AuthProtocolState r1 = org.apache.http.auth.AuthProtocolState.HANDSHAKE     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = $SwitchMap$org$apache$http$auth$AuthProtocolState     // Catch:{ NoSuchFieldError -> 0x002a }
                org.apache.http.auth.AuthProtocolState r1 = org.apache.http.auth.AuthProtocolState.SUCCESS     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = $SwitchMap$org$apache$http$auth$AuthProtocolState     // Catch:{ NoSuchFieldError -> 0x0035 }
                org.apache.http.auth.AuthProtocolState r1 = org.apache.http.auth.AuthProtocolState.FAILURE     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = $SwitchMap$org$apache$http$auth$AuthProtocolState     // Catch:{ NoSuchFieldError -> 0x0040 }
                org.apache.http.auth.AuthProtocolState r1 = org.apache.http.auth.AuthProtocolState.UNCHALLENGED     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.auth.HttpAuthenticator.C70011.<clinit>():void");
        }
    }

    public HttpAuthenticator() {
        this((Log) null);
    }

    public HttpAuthenticator(Log log2) {
        this.log = log2 == null ? LogFactory.getLog((Class) getClass()) : log2;
    }

    private Header doAuth(AuthScheme authScheme, Credentials credentials, HttpRequest httpRequest, HttpContext httpContext) {
        return authScheme instanceof ContextAwareAuthScheme ? ((ContextAwareAuthScheme) authScheme).authenticate(credentials, httpRequest, httpContext) : authScheme.authenticate(credentials, httpRequest);
    }

    private void ensureAuthScheme(AuthScheme authScheme) {
        Asserts.notNull(authScheme, "Auth scheme");
    }

    public void generateAuthResponse(HttpRequest httpRequest, AuthState authState, HttpContext httpContext) {
        AuthScheme authScheme = authState.getAuthScheme();
        Credentials credentials = authState.getCredentials();
        int i = C70011.$SwitchMap$org$apache$http$auth$AuthProtocolState[authState.getState().ordinal()];
        if (i == 1) {
            Queue<AuthOption> authOptions = authState.getAuthOptions();
            if (authOptions != null) {
                while (!authOptions.isEmpty()) {
                    AuthOption remove = authOptions.remove();
                    AuthScheme authScheme2 = remove.getAuthScheme();
                    Credentials credentials2 = remove.getCredentials();
                    authState.update(authScheme2, credentials2);
                    if (this.log.isDebugEnabled()) {
                        Log log2 = this.log;
                        log2.debug("Generating response to an authentication challenge using " + authScheme2.getSchemeName() + " scheme");
                    }
                    try {
                        httpRequest.addHeader(doAuth(authScheme2, credentials2, httpRequest, httpContext));
                        return;
                    } catch (AuthenticationException e) {
                        if (this.log.isWarnEnabled()) {
                            Log log3 = this.log;
                            log3.warn(authScheme2 + " authentication error: " + e.getMessage());
                        }
                    }
                }
                return;
            }
            ensureAuthScheme(authScheme);
        } else if (i == 3) {
            ensureAuthScheme(authScheme);
            if (authScheme.isConnectionBased()) {
                return;
            }
        } else if (i == 4) {
            return;
        }
        if (authScheme != null) {
            try {
                httpRequest.addHeader(doAuth(authScheme, credentials, httpRequest, httpContext));
            } catch (AuthenticationException e2) {
                if (this.log.isErrorEnabled()) {
                    Log log4 = this.log;
                    log4.error(authScheme + " authentication error: " + e2.getMessage());
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0072 A[Catch:{ MalformedChallengeException -> 0x00e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00bd A[Catch:{ MalformedChallengeException -> 0x00e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e4 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean handleAuthChallenge(org.apache.http.HttpHost r7, org.apache.http.HttpResponse r8, org.apache.http.client.AuthenticationStrategy r9, org.apache.http.auth.AuthState r10, org.apache.http.protocol.HttpContext r11) {
        /*
            r6 = this;
            r0 = 0
            org.apache.commons.logging.Log r1 = r6.log     // Catch:{ MalformedChallengeException -> 0x00e5 }
            boolean r1 = r1.isDebugEnabled()     // Catch:{ MalformedChallengeException -> 0x00e5 }
            if (r1 == 0) goto L_0x0023
            org.apache.commons.logging.Log r1 = r6.log     // Catch:{ MalformedChallengeException -> 0x00e5 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ MalformedChallengeException -> 0x00e5 }
            r2.<init>()     // Catch:{ MalformedChallengeException -> 0x00e5 }
            java.lang.String r3 = r7.toHostString()     // Catch:{ MalformedChallengeException -> 0x00e5 }
            r2.append(r3)     // Catch:{ MalformedChallengeException -> 0x00e5 }
            java.lang.String r3 = " requested authentication"
            r2.append(r3)     // Catch:{ MalformedChallengeException -> 0x00e5 }
            java.lang.String r2 = r2.toString()     // Catch:{ MalformedChallengeException -> 0x00e5 }
            r1.debug(r2)     // Catch:{ MalformedChallengeException -> 0x00e5 }
        L_0x0023:
            java.util.Map r1 = r9.getChallenges(r7, r8, r11)     // Catch:{ MalformedChallengeException -> 0x00e5 }
            boolean r2 = r1.isEmpty()     // Catch:{ MalformedChallengeException -> 0x00e5 }
            if (r2 == 0) goto L_0x0035
            org.apache.commons.logging.Log r7 = r6.log     // Catch:{ MalformedChallengeException -> 0x00e5 }
            java.lang.String r8 = "Response contains no authentication challenges"
            r7.debug(r8)     // Catch:{ MalformedChallengeException -> 0x00e5 }
            return r0
        L_0x0035:
            org.apache.http.auth.AuthScheme r2 = r10.getAuthScheme()     // Catch:{ MalformedChallengeException -> 0x00e5 }
            int[] r3 = org.apache.http.impl.auth.HttpAuthenticator.C70011.$SwitchMap$org$apache$http$auth$AuthProtocolState     // Catch:{ MalformedChallengeException -> 0x00e5 }
            org.apache.http.auth.AuthProtocolState r4 = r10.getState()     // Catch:{ MalformedChallengeException -> 0x00e5 }
            int r4 = r4.ordinal()     // Catch:{ MalformedChallengeException -> 0x00e5 }
            r3 = r3[r4]     // Catch:{ MalformedChallengeException -> 0x00e5 }
            r4 = 1
            if (r3 == r4) goto L_0x005a
            r5 = 2
            if (r3 == r5) goto L_0x005a
            r5 = 3
            if (r3 == r5) goto L_0x0056
            r5 = 4
            if (r3 == r5) goto L_0x0055
            r5 = 5
            if (r3 == r5) goto L_0x0070
            goto L_0x00b1
        L_0x0055:
            return r0
        L_0x0056:
            r10.reset()     // Catch:{ MalformedChallengeException -> 0x00e5 }
            goto L_0x00b1
        L_0x005a:
            if (r2 != 0) goto L_0x0070
            org.apache.commons.logging.Log r8 = r6.log     // Catch:{ MalformedChallengeException -> 0x00e5 }
            java.lang.String r1 = "Auth scheme is null"
            r8.debug(r1)     // Catch:{ MalformedChallengeException -> 0x00e5 }
            r8 = 0
            r9.authFailed(r7, r8, r11)     // Catch:{ MalformedChallengeException -> 0x00e5 }
            r10.reset()     // Catch:{ MalformedChallengeException -> 0x00e5 }
            org.apache.http.auth.AuthProtocolState r7 = org.apache.http.auth.AuthProtocolState.FAILURE     // Catch:{ MalformedChallengeException -> 0x00e5 }
            r10.setState(r7)     // Catch:{ MalformedChallengeException -> 0x00e5 }
            return r0
        L_0x0070:
            if (r2 == 0) goto L_0x00b1
            java.lang.String r3 = r2.getSchemeName()     // Catch:{ MalformedChallengeException -> 0x00e5 }
            java.util.Locale r5 = java.util.Locale.ROOT     // Catch:{ MalformedChallengeException -> 0x00e5 }
            java.lang.String r3 = r3.toLowerCase(r5)     // Catch:{ MalformedChallengeException -> 0x00e5 }
            java.lang.Object r3 = r1.get(r3)     // Catch:{ MalformedChallengeException -> 0x00e5 }
            org.apache.http.Header r3 = (org.apache.http.Header) r3     // Catch:{ MalformedChallengeException -> 0x00e5 }
            if (r3 == 0) goto L_0x0056
            org.apache.commons.logging.Log r8 = r6.log     // Catch:{ MalformedChallengeException -> 0x00e5 }
            java.lang.String r1 = "Authorization challenge processed"
            r8.debug(r1)     // Catch:{ MalformedChallengeException -> 0x00e5 }
            r2.processChallenge(r3)     // Catch:{ MalformedChallengeException -> 0x00e5 }
            boolean r8 = r2.isComplete()     // Catch:{ MalformedChallengeException -> 0x00e5 }
            if (r8 == 0) goto L_0x00ab
            org.apache.commons.logging.Log r8 = r6.log     // Catch:{ MalformedChallengeException -> 0x00e5 }
            java.lang.String r1 = "Authentication failed"
            r8.debug(r1)     // Catch:{ MalformedChallengeException -> 0x00e5 }
            org.apache.http.auth.AuthScheme r8 = r10.getAuthScheme()     // Catch:{ MalformedChallengeException -> 0x00e5 }
            r9.authFailed(r7, r8, r11)     // Catch:{ MalformedChallengeException -> 0x00e5 }
            r10.reset()     // Catch:{ MalformedChallengeException -> 0x00e5 }
            org.apache.http.auth.AuthProtocolState r7 = org.apache.http.auth.AuthProtocolState.FAILURE     // Catch:{ MalformedChallengeException -> 0x00e5 }
            r10.setState(r7)     // Catch:{ MalformedChallengeException -> 0x00e5 }
            return r0
        L_0x00ab:
            org.apache.http.auth.AuthProtocolState r7 = org.apache.http.auth.AuthProtocolState.HANDSHAKE     // Catch:{ MalformedChallengeException -> 0x00e5 }
            r10.setState(r7)     // Catch:{ MalformedChallengeException -> 0x00e5 }
            return r4
        L_0x00b1:
            java.util.Queue r7 = r9.select(r1, r7, r8, r11)     // Catch:{ MalformedChallengeException -> 0x00e5 }
            if (r7 == 0) goto L_0x00e4
            boolean r8 = r7.isEmpty()     // Catch:{ MalformedChallengeException -> 0x00e5 }
            if (r8 != 0) goto L_0x00e4
            org.apache.commons.logging.Log r8 = r6.log     // Catch:{ MalformedChallengeException -> 0x00e5 }
            boolean r8 = r8.isDebugEnabled()     // Catch:{ MalformedChallengeException -> 0x00e5 }
            if (r8 == 0) goto L_0x00db
            org.apache.commons.logging.Log r8 = r6.log     // Catch:{ MalformedChallengeException -> 0x00e5 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ MalformedChallengeException -> 0x00e5 }
            r9.<init>()     // Catch:{ MalformedChallengeException -> 0x00e5 }
            java.lang.String r11 = "Selected authentication options: "
            r9.append(r11)     // Catch:{ MalformedChallengeException -> 0x00e5 }
            r9.append(r7)     // Catch:{ MalformedChallengeException -> 0x00e5 }
            java.lang.String r9 = r9.toString()     // Catch:{ MalformedChallengeException -> 0x00e5 }
            r8.debug(r9)     // Catch:{ MalformedChallengeException -> 0x00e5 }
        L_0x00db:
            org.apache.http.auth.AuthProtocolState r8 = org.apache.http.auth.AuthProtocolState.CHALLENGED     // Catch:{ MalformedChallengeException -> 0x00e5 }
            r10.setState(r8)     // Catch:{ MalformedChallengeException -> 0x00e5 }
            r10.update(r7)     // Catch:{ MalformedChallengeException -> 0x00e5 }
            return r4
        L_0x00e4:
            return r0
        L_0x00e5:
            r7 = move-exception
            org.apache.commons.logging.Log r8 = r6.log
            boolean r8 = r8.isWarnEnabled()
            if (r8 == 0) goto L_0x0108
            org.apache.commons.logging.Log r8 = r6.log
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "Malformed challenge: "
            r9.append(r11)
            java.lang.String r7 = r7.getMessage()
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            r8.warn(r7)
        L_0x0108:
            r10.reset()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.auth.HttpAuthenticator.handleAuthChallenge(org.apache.http.HttpHost, org.apache.http.HttpResponse, org.apache.http.client.AuthenticationStrategy, org.apache.http.auth.AuthState, org.apache.http.protocol.HttpContext):boolean");
    }

    public boolean isAuthenticationRequested(HttpHost httpHost, HttpResponse httpResponse, AuthenticationStrategy authenticationStrategy, AuthState authState, HttpContext httpContext) {
        if (authenticationStrategy.isAuthenticationRequested(httpHost, httpResponse, httpContext)) {
            this.log.debug("Authentication required");
            if (authState.getState() == AuthProtocolState.SUCCESS) {
                authenticationStrategy.authFailed(httpHost, authState.getAuthScheme(), httpContext);
            }
            return true;
        }
        int i = C70011.$SwitchMap$org$apache$http$auth$AuthProtocolState[authState.getState().ordinal()];
        if (i == 1 || i == 2) {
            this.log.debug("Authentication succeeded");
            authState.setState(AuthProtocolState.SUCCESS);
            authenticationStrategy.authSucceeded(httpHost, authState.getAuthScheme(), httpContext);
            return false;
        } else if (i == 3) {
            return false;
        } else {
            authState.setState(AuthProtocolState.UNCHALLENGED);
            return false;
        }
    }
}
