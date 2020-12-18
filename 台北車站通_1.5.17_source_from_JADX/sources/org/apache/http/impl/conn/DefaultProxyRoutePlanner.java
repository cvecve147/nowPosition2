package org.apache.http.impl.conn;

import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.annotation.Immutable;
import org.apache.http.conn.SchemePortResolver;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;

@Immutable
public class DefaultProxyRoutePlanner extends DefaultRoutePlanner {
    private final HttpHost proxy;

    public DefaultProxyRoutePlanner(HttpHost httpHost) {
        this(httpHost, (SchemePortResolver) null);
    }

    public DefaultProxyRoutePlanner(HttpHost httpHost, SchemePortResolver schemePortResolver) {
        super(schemePortResolver);
        Args.notNull(httpHost, "Proxy host");
        this.proxy = httpHost;
    }

    /* access modifiers changed from: protected */
    public HttpHost determineProxy(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        return this.proxy;
    }
}
