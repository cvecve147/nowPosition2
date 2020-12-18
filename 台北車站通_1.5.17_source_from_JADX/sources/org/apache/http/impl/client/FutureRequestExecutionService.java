package org.apache.http.impl.client;

import java.io.Closeable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.http.annotation.ThreadSafe;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.concurrent.FutureCallback;
import org.apache.http.protocol.HttpContext;

@ThreadSafe
public class FutureRequestExecutionService implements Closeable {
    private final AtomicBoolean closed = new AtomicBoolean(false);
    private final ExecutorService executorService;
    private final HttpClient httpclient;
    private final FutureRequestExecutionMetrics metrics = new FutureRequestExecutionMetrics();

    public FutureRequestExecutionService(HttpClient httpClient, ExecutorService executorService2) {
        this.httpclient = httpClient;
        this.executorService = executorService2;
    }

    public void close() {
        this.closed.set(true);
        this.executorService.shutdownNow();
        HttpClient httpClient = this.httpclient;
        if (httpClient instanceof Closeable) {
            ((Closeable) httpClient).close();
        }
    }

    public <T> HttpRequestFutureTask<T> execute(HttpUriRequest httpUriRequest, HttpContext httpContext, ResponseHandler<T> responseHandler) {
        return execute(httpUriRequest, httpContext, responseHandler, (FutureCallback) null);
    }

    public <T> HttpRequestFutureTask<T> execute(HttpUriRequest httpUriRequest, HttpContext httpContext, ResponseHandler<T> responseHandler, FutureCallback<T> futureCallback) {
        if (!this.closed.get()) {
            this.metrics.getScheduledConnections().incrementAndGet();
            HttpRequestFutureTask<T> httpRequestFutureTask = new HttpRequestFutureTask<>(httpUriRequest, new HttpRequestTaskCallable(this.httpclient, httpUriRequest, httpContext, responseHandler, futureCallback, this.metrics));
            this.executorService.execute(httpRequestFutureTask);
            return httpRequestFutureTask;
        }
        throw new IllegalStateException("Close has been called on this httpclient instance.");
    }

    public FutureRequestExecutionMetrics metrics() {
        return this.metrics;
    }
}
