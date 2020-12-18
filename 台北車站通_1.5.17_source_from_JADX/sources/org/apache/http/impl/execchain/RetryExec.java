package org.apache.http.impl.execchain;

import java.io.IOException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.Header;
import org.apache.http.NoHttpResponseException;
import org.apache.http.annotation.Immutable;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.NonRepeatableRequestException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpExecutionAware;
import org.apache.http.client.methods.HttpRequestWrapper;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.util.Args;

@Immutable
public class RetryExec implements ClientExecChain {
    private final Log log = LogFactory.getLog(RetryExec.class);
    private final ClientExecChain requestExecutor;
    private final HttpRequestRetryHandler retryHandler;

    public RetryExec(ClientExecChain clientExecChain, HttpRequestRetryHandler httpRequestRetryHandler) {
        Args.notNull(clientExecChain, "HTTP request executor");
        Args.notNull(httpRequestRetryHandler, "HTTP request retry handler");
        this.requestExecutor = clientExecChain;
        this.retryHandler = httpRequestRetryHandler;
    }

    public CloseableHttpResponse execute(HttpRoute httpRoute, HttpRequestWrapper httpRequestWrapper, HttpClientContext httpClientContext, HttpExecutionAware httpExecutionAware) {
        Args.notNull(httpRoute, "HTTP route");
        Args.notNull(httpRequestWrapper, "HTTP request");
        Args.notNull(httpClientContext, "HTTP context");
        Header[] allHeaders = httpRequestWrapper.getAllHeaders();
        int i = 1;
        while (true) {
            try {
                return this.requestExecutor.execute(httpRoute, httpRequestWrapper, httpClientContext, httpExecutionAware);
            } catch (IOException e) {
                if (httpExecutionAware != null && httpExecutionAware.isAborted()) {
                    this.log.debug("Request has been aborted");
                    throw e;
                } else if (this.retryHandler.retryRequest(e, i, httpClientContext)) {
                    if (this.log.isInfoEnabled()) {
                        Log log2 = this.log;
                        log2.info("I/O exception (" + e.getClass().getName() + ") caught when processing request to " + httpRoute + ": " + e.getMessage());
                    }
                    if (this.log.isDebugEnabled()) {
                        this.log.debug(e.getMessage(), e);
                    }
                    if (RequestEntityProxy.isRepeatable(httpRequestWrapper)) {
                        httpRequestWrapper.setHeaders(allHeaders);
                        if (this.log.isInfoEnabled()) {
                            Log log3 = this.log;
                            log3.info("Retrying request to " + httpRoute);
                        }
                        i++;
                    } else {
                        this.log.debug("Cannot retry non-repeatable request");
                        throw new NonRepeatableRequestException("Cannot retry request with a non-repeatable request entity", e);
                    }
                } else if (e instanceof NoHttpResponseException) {
                    NoHttpResponseException noHttpResponseException = new NoHttpResponseException(httpRoute.getTargetHost().toHostString() + " failed to respond");
                    noHttpResponseException.setStackTrace(e.getStackTrace());
                    throw noHttpResponseException;
                } else {
                    throw e;
                }
            }
        }
    }
}
