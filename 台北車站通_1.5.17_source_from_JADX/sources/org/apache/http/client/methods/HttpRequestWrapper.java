package org.apache.http.client.methods;

import java.net.URI;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.message.AbstractHttpMessage;
import org.apache.http.message.BasicRequestLine;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.Args;

@NotThreadSafe
public class HttpRequestWrapper extends AbstractHttpMessage implements HttpUriRequest {
    private final String method;
    private final HttpRequest original;
    private final HttpHost target;
    private URI uri;
    private ProtocolVersion version;

    static class HttpEntityEnclosingRequestWrapper extends HttpRequestWrapper implements HttpEntityEnclosingRequest {
        private HttpEntity entity;

        HttpEntityEnclosingRequestWrapper(HttpEntityEnclosingRequest httpEntityEnclosingRequest, HttpHost httpHost) {
            super(httpEntityEnclosingRequest, httpHost);
            this.entity = httpEntityEnclosingRequest.getEntity();
        }

        public boolean expectContinue() {
            Header firstHeader = getFirstHeader("Expect");
            return firstHeader != null && HTTP.EXPECT_CONTINUE.equalsIgnoreCase(firstHeader.getValue());
        }

        public HttpEntity getEntity() {
            return this.entity;
        }

        public void setEntity(HttpEntity httpEntity) {
            this.entity = httpEntity;
        }
    }

    private HttpRequestWrapper(HttpRequest httpRequest, HttpHost httpHost) {
        Args.notNull(httpRequest, "HTTP request");
        this.original = httpRequest;
        this.target = httpHost;
        this.version = this.original.getRequestLine().getProtocolVersion();
        this.method = this.original.getRequestLine().getMethod();
        this.uri = httpRequest instanceof HttpUriRequest ? ((HttpUriRequest) httpRequest).getURI() : null;
        setHeaders(httpRequest.getAllHeaders());
    }

    public static HttpRequestWrapper wrap(HttpRequest httpRequest) {
        return wrap(httpRequest, (HttpHost) null);
    }

    public static HttpRequestWrapper wrap(HttpRequest httpRequest, HttpHost httpHost) {
        Args.notNull(httpRequest, "HTTP request");
        return httpRequest instanceof HttpEntityEnclosingRequest ? new HttpEntityEnclosingRequestWrapper((HttpEntityEnclosingRequest) httpRequest, httpHost) : new HttpRequestWrapper(httpRequest, httpHost);
    }

    public void abort() {
        throw new UnsupportedOperationException();
    }

    public String getMethod() {
        return this.method;
    }

    public HttpRequest getOriginal() {
        return this.original;
    }

    @Deprecated
    public HttpParams getParams() {
        if (this.params == null) {
            this.params = this.original.getParams().copy();
        }
        return this.params;
    }

    public ProtocolVersion getProtocolVersion() {
        ProtocolVersion protocolVersion = this.version;
        return protocolVersion != null ? protocolVersion : this.original.getProtocolVersion();
    }

    public RequestLine getRequestLine() {
        URI uri2 = this.uri;
        String aSCIIString = uri2 != null ? uri2.toASCIIString() : this.original.getRequestLine().getUri();
        if (aSCIIString == null || aSCIIString.isEmpty()) {
            aSCIIString = "/";
        }
        return new BasicRequestLine(this.method, aSCIIString, getProtocolVersion());
    }

    public HttpHost getTarget() {
        return this.target;
    }

    public URI getURI() {
        return this.uri;
    }

    public boolean isAborted() {
        return false;
    }

    public void setProtocolVersion(ProtocolVersion protocolVersion) {
        this.version = protocolVersion;
    }

    public void setURI(URI uri2) {
        this.uri = uri2;
    }

    public String toString() {
        return getRequestLine() + " " + this.headergroup;
    }
}
