package org.apache.http.protocol;

import org.apache.http.HttpRequest;
import org.apache.http.annotation.ThreadSafe;
import org.apache.http.util.Args;

@ThreadSafe
public class UriHttpRequestHandlerMapper implements HttpRequestHandlerMapper {
    private final UriPatternMatcher<HttpRequestHandler> matcher;

    public UriHttpRequestHandlerMapper() {
        this(new UriPatternMatcher());
    }

    protected UriHttpRequestHandlerMapper(UriPatternMatcher<HttpRequestHandler> uriPatternMatcher) {
        Args.notNull(uriPatternMatcher, "Pattern matcher");
        this.matcher = uriPatternMatcher;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        r0 = r4.indexOf("#");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getRequestPath(org.apache.http.HttpRequest r4) {
        /*
            r3 = this;
            org.apache.http.RequestLine r4 = r4.getRequestLine()
            java.lang.String r4 = r4.getUri()
            java.lang.String r0 = "?"
            int r0 = r4.indexOf(r0)
            r1 = 0
            r2 = -1
            if (r0 == r2) goto L_0x0017
        L_0x0012:
            java.lang.String r4 = r4.substring(r1, r0)
            goto L_0x0020
        L_0x0017:
            java.lang.String r0 = "#"
            int r0 = r4.indexOf(r0)
            if (r0 == r2) goto L_0x0020
            goto L_0x0012
        L_0x0020:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.protocol.UriHttpRequestHandlerMapper.getRequestPath(org.apache.http.HttpRequest):java.lang.String");
    }

    public HttpRequestHandler lookup(HttpRequest httpRequest) {
        Args.notNull(httpRequest, "HTTP request");
        return this.matcher.lookup(getRequestPath(httpRequest));
    }

    public void register(String str, HttpRequestHandler httpRequestHandler) {
        Args.notNull(str, "Pattern");
        Args.notNull(httpRequestHandler, "Handler");
        this.matcher.register(str, httpRequestHandler);
    }

    public void unregister(String str) {
        this.matcher.unregister(str);
    }
}
