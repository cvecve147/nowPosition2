package org.apache.http.client.protocol;

import org.apache.commons.logging.Log;
import org.apache.http.HttpRequest;
import org.apache.http.annotation.Immutable;
import org.apache.http.auth.AuthState;
import org.apache.http.conn.HttpRoutedConnection;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;

@Immutable
@Deprecated
public class RequestProxyAuthentication extends RequestAuthenticationBase {
    public void process(HttpRequest httpRequest, HttpContext httpContext) {
        Log log;
        String str;
        Args.notNull(httpRequest, "HTTP request");
        Args.notNull(httpContext, "HTTP context");
        if (!httpRequest.containsHeader("Proxy-Authorization")) {
            HttpRoutedConnection httpRoutedConnection = (HttpRoutedConnection) httpContext.getAttribute("http.connection");
            if (httpRoutedConnection == null) {
                log = this.log;
                str = "HTTP connection not set in the context";
            } else if (!httpRoutedConnection.getRoute().isTunnelled()) {
                AuthState authState = (AuthState) httpContext.getAttribute("http.auth.proxy-scope");
                if (authState == null) {
                    log = this.log;
                    str = "Proxy auth state not set in the context";
                } else {
                    if (this.log.isDebugEnabled()) {
                        Log log2 = this.log;
                        log2.debug("Proxy auth state: " + authState.getState());
                    }
                    process(authState, httpRequest, httpContext);
                    return;
                }
            } else {
                return;
            }
            log.debug(str);
        }
    }
}
