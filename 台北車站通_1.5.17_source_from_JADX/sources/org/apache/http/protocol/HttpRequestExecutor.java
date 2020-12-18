package org.apache.http.protocol;

import java.io.IOException;
import org.apache.http.HttpClientConnection;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolException;
import org.apache.http.ProtocolVersion;
import org.apache.http.annotation.Immutable;
import org.apache.http.util.Args;

@Immutable
public class HttpRequestExecutor {
    public static final int DEFAULT_WAIT_FOR_CONTINUE = 3000;
    private final int waitForContinue;

    public HttpRequestExecutor() {
        this(DEFAULT_WAIT_FOR_CONTINUE);
    }

    public HttpRequestExecutor(int i) {
        Args.positive(i, "Wait for continue time");
        this.waitForContinue = i;
    }

    private static void closeConnection(HttpClientConnection httpClientConnection) {
        try {
            httpClientConnection.close();
        } catch (IOException unused) {
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        r2 = r3.getStatusLine().getStatusCode();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean canResponseHaveBody(org.apache.http.HttpRequest r2, org.apache.http.HttpResponse r3) {
        /*
            r1 = this;
            org.apache.http.RequestLine r2 = r2.getRequestLine()
            java.lang.String r2 = r2.getMethod()
            java.lang.String r0 = "HEAD"
            boolean r2 = r0.equalsIgnoreCase(r2)
            r0 = 0
            if (r2 == 0) goto L_0x0012
            return r0
        L_0x0012:
            org.apache.http.StatusLine r2 = r3.getStatusLine()
            int r2 = r2.getStatusCode()
            r3 = 200(0xc8, float:2.8E-43)
            if (r2 < r3) goto L_0x002b
            r3 = 204(0xcc, float:2.86E-43)
            if (r2 == r3) goto L_0x002b
            r3 = 304(0x130, float:4.26E-43)
            if (r2 == r3) goto L_0x002b
            r3 = 205(0xcd, float:2.87E-43)
            if (r2 == r3) goto L_0x002b
            r0 = 1
        L_0x002b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.protocol.HttpRequestExecutor.canResponseHaveBody(org.apache.http.HttpRequest, org.apache.http.HttpResponse):boolean");
    }

    /* access modifiers changed from: protected */
    public HttpResponse doReceiveResponse(HttpRequest httpRequest, HttpClientConnection httpClientConnection, HttpContext httpContext) {
        Args.notNull(httpRequest, "HTTP request");
        Args.notNull(httpClientConnection, "Client connection");
        Args.notNull(httpContext, "HTTP context");
        HttpResponse httpResponse = null;
        int i = 0;
        while (true) {
            if (httpResponse != null && i >= 200) {
                return httpResponse;
            }
            httpResponse = httpClientConnection.receiveResponseHeader();
            if (canResponseHaveBody(httpRequest, httpResponse)) {
                httpClientConnection.receiveResponseEntity(httpResponse);
            }
            i = httpResponse.getStatusLine().getStatusCode();
        }
    }

    /* access modifiers changed from: protected */
    public HttpResponse doSendRequest(HttpRequest httpRequest, HttpClientConnection httpClientConnection, HttpContext httpContext) {
        Args.notNull(httpRequest, "HTTP request");
        Args.notNull(httpClientConnection, "Client connection");
        Args.notNull(httpContext, "HTTP context");
        httpContext.setAttribute("http.connection", httpClientConnection);
        httpContext.setAttribute("http.request_sent", Boolean.FALSE);
        httpClientConnection.sendRequestHeader(httpRequest);
        HttpResponse httpResponse = null;
        if (httpRequest instanceof HttpEntityEnclosingRequest) {
            boolean z = true;
            ProtocolVersion protocolVersion = httpRequest.getRequestLine().getProtocolVersion();
            HttpEntityEnclosingRequest httpEntityEnclosingRequest = (HttpEntityEnclosingRequest) httpRequest;
            if (httpEntityEnclosingRequest.expectContinue() && !protocolVersion.lessEquals(HttpVersion.HTTP_1_0)) {
                httpClientConnection.flush();
                if (httpClientConnection.isResponseAvailable(this.waitForContinue)) {
                    HttpResponse receiveResponseHeader = httpClientConnection.receiveResponseHeader();
                    if (canResponseHaveBody(httpRequest, receiveResponseHeader)) {
                        httpClientConnection.receiveResponseEntity(receiveResponseHeader);
                    }
                    int statusCode = receiveResponseHeader.getStatusLine().getStatusCode();
                    if (statusCode >= 200) {
                        z = false;
                        httpResponse = receiveResponseHeader;
                    } else if (statusCode != 100) {
                        throw new ProtocolException("Unexpected response: " + receiveResponseHeader.getStatusLine());
                    }
                }
            }
            if (z) {
                httpClientConnection.sendRequestEntity(httpEntityEnclosingRequest);
            }
        }
        httpClientConnection.flush();
        httpContext.setAttribute("http.request_sent", Boolean.TRUE);
        return httpResponse;
    }

    public HttpResponse execute(HttpRequest httpRequest, HttpClientConnection httpClientConnection, HttpContext httpContext) {
        Args.notNull(httpRequest, "HTTP request");
        Args.notNull(httpClientConnection, "Client connection");
        Args.notNull(httpContext, "HTTP context");
        try {
            HttpResponse doSendRequest = doSendRequest(httpRequest, httpClientConnection, httpContext);
            return doSendRequest == null ? doReceiveResponse(httpRequest, httpClientConnection, httpContext) : doSendRequest;
        } catch (IOException e) {
            closeConnection(httpClientConnection);
            throw e;
        } catch (HttpException e2) {
            closeConnection(httpClientConnection);
            throw e2;
        } catch (RuntimeException e3) {
            closeConnection(httpClientConnection);
            throw e3;
        }
    }

    public void postProcess(HttpResponse httpResponse, HttpProcessor httpProcessor, HttpContext httpContext) {
        Args.notNull(httpResponse, "HTTP response");
        Args.notNull(httpProcessor, "HTTP processor");
        Args.notNull(httpContext, "HTTP context");
        httpContext.setAttribute("http.response", httpResponse);
        httpProcessor.process(httpResponse, httpContext);
    }

    public void preProcess(HttpRequest httpRequest, HttpProcessor httpProcessor, HttpContext httpContext) {
        Args.notNull(httpRequest, "HTTP request");
        Args.notNull(httpProcessor, "HTTP processor");
        Args.notNull(httpContext, "HTTP context");
        httpContext.setAttribute("http.request", httpRequest);
        httpProcessor.process(httpRequest, httpContext);
    }
}
