package org.apache.http.impl.execchain;

import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.logging.Log;
import org.apache.http.HttpClientConnection;
import org.apache.http.annotation.ThreadSafe;
import org.apache.http.concurrent.Cancellable;
import org.apache.http.conn.ConnectionReleaseTrigger;
import org.apache.http.conn.HttpClientConnectionManager;

@ThreadSafe
class ConnectionHolder implements ConnectionReleaseTrigger, Cancellable, Closeable {
    private final Log log;
    private final HttpClientConnection managedConn;
    private final HttpClientConnectionManager manager;
    private volatile boolean released;
    private volatile boolean reusable;
    private volatile Object state;
    private volatile TimeUnit tunit;
    private volatile long validDuration;

    public ConnectionHolder(Log log2, HttpClientConnectionManager httpClientConnectionManager, HttpClientConnection httpClientConnection) {
        this.log = log2;
        this.manager = httpClientConnectionManager;
        this.managedConn = httpClientConnection;
    }

    public void abortConnection() {
        synchronized (this.managedConn) {
            if (!this.released) {
                this.released = true;
                try {
                    this.managedConn.shutdown();
                    this.log.debug("Connection discarded");
                    this.manager.releaseConnection(this.managedConn, (Object) null, 0, TimeUnit.MILLISECONDS);
                } catch (IOException e) {
                    try {
                        if (this.log.isDebugEnabled()) {
                            this.log.debug(e.getMessage(), e);
                        }
                    } finally {
                        this.manager.releaseConnection(this.managedConn, (Object) null, 0, TimeUnit.MILLISECONDS);
                    }
                }
            }
        }
    }

    public boolean cancel() {
        boolean z = this.released;
        this.log.debug("Cancelling request execution");
        abortConnection();
        return !z;
    }

    public void close() {
        abortConnection();
    }

    public boolean isReleased() {
        return this.released;
    }

    public boolean isReusable() {
        return this.reusable;
    }

    public void markNonReusable() {
        this.reusable = false;
    }

    public void markReusable() {
        this.reusable = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0056, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void releaseConnection() {
        /*
            r9 = this;
            org.apache.http.HttpClientConnection r0 = r9.managedConn
            monitor-enter(r0)
            boolean r1 = r9.released     // Catch:{ all -> 0x0064 }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0064 }
            return
        L_0x0009:
            r1 = 1
            r9.released = r1     // Catch:{ all -> 0x0064 }
            boolean r1 = r9.reusable     // Catch:{ all -> 0x0064 }
            if (r1 == 0) goto L_0x001e
            org.apache.http.conn.HttpClientConnectionManager r2 = r9.manager     // Catch:{ all -> 0x0064 }
            org.apache.http.HttpClientConnection r3 = r9.managedConn     // Catch:{ all -> 0x0064 }
            java.lang.Object r4 = r9.state     // Catch:{ all -> 0x0064 }
            long r5 = r9.validDuration     // Catch:{ all -> 0x0064 }
            java.util.concurrent.TimeUnit r7 = r9.tunit     // Catch:{ all -> 0x0064 }
        L_0x001a:
            r2.releaseConnection(r3, r4, r5, r7)     // Catch:{ all -> 0x0064 }
            goto L_0x0055
        L_0x001e:
            org.apache.http.HttpClientConnection r1 = r9.managedConn     // Catch:{ IOException -> 0x0039 }
            r1.close()     // Catch:{ IOException -> 0x0039 }
            org.apache.commons.logging.Log r1 = r9.log     // Catch:{ IOException -> 0x0039 }
            java.lang.String r2 = "Connection discarded"
            r1.debug(r2)     // Catch:{ IOException -> 0x0039 }
            org.apache.http.conn.HttpClientConnectionManager r3 = r9.manager     // Catch:{ all -> 0x0064 }
            org.apache.http.HttpClientConnection r4 = r9.managedConn     // Catch:{ all -> 0x0064 }
            r5 = 0
            r6 = 0
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x0064 }
            r3.releaseConnection(r4, r5, r6, r8)     // Catch:{ all -> 0x0064 }
            goto L_0x0055
        L_0x0037:
            r1 = move-exception
            goto L_0x0057
        L_0x0039:
            r1 = move-exception
            org.apache.commons.logging.Log r2 = r9.log     // Catch:{ all -> 0x0037 }
            boolean r2 = r2.isDebugEnabled()     // Catch:{ all -> 0x0037 }
            if (r2 == 0) goto L_0x004b
            org.apache.commons.logging.Log r2 = r9.log     // Catch:{ all -> 0x0037 }
            java.lang.String r3 = r1.getMessage()     // Catch:{ all -> 0x0037 }
            r2.debug(r3, r1)     // Catch:{ all -> 0x0037 }
        L_0x004b:
            org.apache.http.conn.HttpClientConnectionManager r2 = r9.manager     // Catch:{ all -> 0x0064 }
            org.apache.http.HttpClientConnection r3 = r9.managedConn     // Catch:{ all -> 0x0064 }
            r4 = 0
            r5 = 0
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x0064 }
            goto L_0x001a
        L_0x0055:
            monitor-exit(r0)     // Catch:{ all -> 0x0064 }
            return
        L_0x0057:
            org.apache.http.conn.HttpClientConnectionManager r2 = r9.manager     // Catch:{ all -> 0x0064 }
            org.apache.http.HttpClientConnection r3 = r9.managedConn     // Catch:{ all -> 0x0064 }
            r4 = 0
            r5 = 0
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x0064 }
            r2.releaseConnection(r3, r4, r5, r7)     // Catch:{ all -> 0x0064 }
            throw r1     // Catch:{ all -> 0x0064 }
        L_0x0064:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0064 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.execchain.ConnectionHolder.releaseConnection():void");
    }

    public void setState(Object obj) {
        this.state = obj;
    }

    public void setValidFor(long j, TimeUnit timeUnit) {
        synchronized (this.managedConn) {
            this.validDuration = j;
            this.tunit = timeUnit;
        }
    }
}
