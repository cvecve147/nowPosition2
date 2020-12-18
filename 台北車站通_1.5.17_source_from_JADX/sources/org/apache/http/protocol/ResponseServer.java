package org.apache.http.protocol;

import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.annotation.Immutable;
import org.apache.http.util.Args;

@Immutable
public class ResponseServer implements HttpResponseInterceptor {
    private final String originServer;

    public ResponseServer() {
        this((String) null);
    }

    public ResponseServer(String str) {
        this.originServer = str;
    }

    public void process(HttpResponse httpResponse, HttpContext httpContext) {
        String str;
        Args.notNull(httpResponse, "HTTP response");
        if (!httpResponse.containsHeader("Server") && (str = this.originServer) != null) {
            httpResponse.addHeader("Server", str);
        }
    }
}
