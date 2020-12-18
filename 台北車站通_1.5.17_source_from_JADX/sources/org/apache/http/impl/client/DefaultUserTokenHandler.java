package org.apache.http.impl.client;

import java.security.Principal;
import org.apache.http.annotation.Immutable;
import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthState;
import org.apache.http.auth.Credentials;
import org.apache.http.client.UserTokenHandler;

@Immutable
public class DefaultUserTokenHandler implements UserTokenHandler {
    public static final DefaultUserTokenHandler INSTANCE = new DefaultUserTokenHandler();

    private static Principal getAuthPrincipal(AuthState authState) {
        Credentials credentials;
        AuthScheme authScheme = authState.getAuthScheme();
        if (authScheme == null || !authScheme.isComplete() || !authScheme.isConnectionBased() || (credentials = authState.getCredentials()) == null) {
            return null;
        }
        return credentials.getUserPrincipal();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002a, code lost:
        r3 = ((org.apache.http.conn.ManagedHttpClientConnection) r3).getSSLSession();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object getUserToken(org.apache.http.protocol.HttpContext r3) {
        /*
            r2 = this;
            org.apache.http.client.protocol.HttpClientContext r3 = org.apache.http.client.protocol.HttpClientContext.adapt(r3)
            org.apache.http.auth.AuthState r0 = r3.getTargetAuthState()
            if (r0 == 0) goto L_0x0019
            java.security.Principal r0 = getAuthPrincipal(r0)
            if (r0 != 0) goto L_0x001a
            org.apache.http.auth.AuthState r0 = r3.getProxyAuthState()
            java.security.Principal r0 = getAuthPrincipal(r0)
            goto L_0x001a
        L_0x0019:
            r0 = 0
        L_0x001a:
            if (r0 != 0) goto L_0x0036
            org.apache.http.HttpConnection r3 = r3.getConnection()
            boolean r1 = r3.isOpen()
            if (r1 == 0) goto L_0x0036
            boolean r1 = r3 instanceof org.apache.http.conn.ManagedHttpClientConnection
            if (r1 == 0) goto L_0x0036
            org.apache.http.conn.ManagedHttpClientConnection r3 = (org.apache.http.conn.ManagedHttpClientConnection) r3
            javax.net.ssl.SSLSession r3 = r3.getSSLSession()
            if (r3 == 0) goto L_0x0036
            java.security.Principal r0 = r3.getLocalPrincipal()
        L_0x0036:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.client.DefaultUserTokenHandler.getUserToken(org.apache.http.protocol.HttpContext):java.lang.Object");
    }
}
