package org.apache.http.impl.execchain;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.annotation.Immutable;
import org.apache.http.client.ServiceUnavailableRetryStrategy;
import org.apache.http.util.Args;

@Immutable
public class ServiceUnavailableRetryExec implements ClientExecChain {
    private final Log log = LogFactory.getLog(ServiceUnavailableRetryExec.class);
    private final ClientExecChain requestExecutor;
    private final ServiceUnavailableRetryStrategy retryStrategy;

    public ServiceUnavailableRetryExec(ClientExecChain clientExecChain, ServiceUnavailableRetryStrategy serviceUnavailableRetryStrategy) {
        Args.notNull(clientExecChain, "HTTP request executor");
        Args.notNull(serviceUnavailableRetryStrategy, "Retry strategy");
        this.requestExecutor = clientExecChain;
        this.retryStrategy = serviceUnavailableRetryStrategy;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:8|9|10) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0048, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x003c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.apache.http.client.methods.CloseableHttpResponse execute(org.apache.http.conn.routing.HttpRoute r9, org.apache.http.client.methods.HttpRequestWrapper r10, org.apache.http.client.protocol.HttpClientContext r11, org.apache.http.client.methods.HttpExecutionAware r12) {
        /*
            r8 = this;
            org.apache.http.Header[] r0 = r10.getAllHeaders()
            r1 = 1
        L_0x0005:
            org.apache.http.impl.execchain.ClientExecChain r2 = r8.requestExecutor
            org.apache.http.client.methods.CloseableHttpResponse r2 = r2.execute(r9, r10, r11, r12)
            org.apache.http.client.ServiceUnavailableRetryStrategy r3 = r8.retryStrategy     // Catch:{ RuntimeException -> 0x0050 }
            boolean r3 = r3.retryRequest(r2, r1, r11)     // Catch:{ RuntimeException -> 0x0050 }
            if (r3 == 0) goto L_0x004f
            r2.close()     // Catch:{ RuntimeException -> 0x0050 }
            org.apache.http.client.ServiceUnavailableRetryStrategy r3 = r8.retryStrategy     // Catch:{ RuntimeException -> 0x0050 }
            long r3 = r3.getRetryInterval()     // Catch:{ RuntimeException -> 0x0050 }
            r5 = 0
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x0049
            org.apache.commons.logging.Log r5 = r8.log     // Catch:{ InterruptedException -> 0x003c }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ InterruptedException -> 0x003c }
            r6.<init>()     // Catch:{ InterruptedException -> 0x003c }
            java.lang.String r7 = "Wait for "
            r6.append(r7)     // Catch:{ InterruptedException -> 0x003c }
            r6.append(r3)     // Catch:{ InterruptedException -> 0x003c }
            java.lang.String r6 = r6.toString()     // Catch:{ InterruptedException -> 0x003c }
            r5.trace(r6)     // Catch:{ InterruptedException -> 0x003c }
            java.lang.Thread.sleep(r3)     // Catch:{ InterruptedException -> 0x003c }
            goto L_0x0049
        L_0x003c:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch:{ RuntimeException -> 0x0050 }
            r9.interrupt()     // Catch:{ RuntimeException -> 0x0050 }
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch:{ RuntimeException -> 0x0050 }
            r9.<init>()     // Catch:{ RuntimeException -> 0x0050 }
            throw r9     // Catch:{ RuntimeException -> 0x0050 }
        L_0x0049:
            r10.setHeaders(r0)     // Catch:{ RuntimeException -> 0x0050 }
            int r1 = r1 + 1
            goto L_0x0005
        L_0x004f:
            return r2
        L_0x0050:
            r9 = move-exception
            r2.close()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.execchain.ServiceUnavailableRetryExec.execute(org.apache.http.conn.routing.HttpRoute, org.apache.http.client.methods.HttpRequestWrapper, org.apache.http.client.protocol.HttpClientContext, org.apache.http.client.methods.HttpExecutionAware):org.apache.http.client.methods.CloseableHttpResponse");
    }
}
