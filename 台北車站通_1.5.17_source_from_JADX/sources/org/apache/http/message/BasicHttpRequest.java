package org.apache.http.message;

import org.apache.http.HttpRequest;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.util.Args;

@NotThreadSafe
public class BasicHttpRequest extends AbstractHttpMessage implements HttpRequest {
    private final String method;
    private RequestLine requestline;
    private final String uri;

    public BasicHttpRequest(String str, String str2) {
        Args.notNull(str, "Method name");
        this.method = str;
        Args.notNull(str2, "Request URI");
        this.uri = str2;
        this.requestline = null;
    }

    public BasicHttpRequest(String str, String str2, ProtocolVersion protocolVersion) {
        this(new BasicRequestLine(str, str2, protocolVersion));
    }

    public BasicHttpRequest(RequestLine requestLine) {
        Args.notNull(requestLine, "Request line");
        this.requestline = requestLine;
        this.method = requestLine.getMethod();
        this.uri = requestLine.getUri();
    }

    public ProtocolVersion getProtocolVersion() {
        return getRequestLine().getProtocolVersion();
    }

    public RequestLine getRequestLine() {
        if (this.requestline == null) {
            this.requestline = new BasicRequestLine(this.method, this.uri, HttpVersion.HTTP_1_1);
        }
        return this.requestline;
    }

    public String toString() {
        return this.method + TokenParser.f19315SP + this.uri + TokenParser.f19315SP + this.headergroup;
    }
}
