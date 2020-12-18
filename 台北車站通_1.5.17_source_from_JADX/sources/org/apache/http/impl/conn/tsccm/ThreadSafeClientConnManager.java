package org.apache.http.impl.conn.tsccm;

import java.util.concurrent.TimeUnit;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.annotation.ThreadSafe;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.ClientConnectionRequest;
import org.apache.http.conn.ManagedClientConnection;
import org.apache.http.conn.params.ConnPerRouteBean;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.impl.conn.DefaultClientConnectionOperator;
import org.apache.http.impl.conn.SchemeRegistryFactory;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;

@Deprecated
@ThreadSafe
public class ThreadSafeClientConnManager implements ClientConnectionManager {
    protected final ClientConnectionOperator connOperator;
    protected final ConnPerRouteBean connPerRoute;
    protected final AbstractConnPool connectionPool;
    /* access modifiers changed from: private */
    public final Log log;
    protected final ConnPoolByRoute pool;
    protected final SchemeRegistry schemeRegistry;

    public ThreadSafeClientConnManager() {
        this(SchemeRegistryFactory.createDefault());
    }

    public ThreadSafeClientConnManager(SchemeRegistry schemeRegistry2) {
        this(schemeRegistry2, -1, TimeUnit.MILLISECONDS);
    }

    public ThreadSafeClientConnManager(SchemeRegistry schemeRegistry2, long j, TimeUnit timeUnit) {
        this(schemeRegistry2, j, timeUnit, new ConnPerRouteBean());
    }

    public ThreadSafeClientConnManager(SchemeRegistry schemeRegistry2, long j, TimeUnit timeUnit, ConnPerRouteBean connPerRouteBean) {
        Args.notNull(schemeRegistry2, "Scheme registry");
        this.log = LogFactory.getLog(ThreadSafeClientConnManager.class);
        this.schemeRegistry = schemeRegistry2;
        this.connPerRoute = connPerRouteBean;
        this.connOperator = createConnectionOperator(schemeRegistry2);
        this.pool = createConnectionPool(j, timeUnit);
        this.connectionPool = this.pool;
    }

    @Deprecated
    public ThreadSafeClientConnManager(HttpParams httpParams, SchemeRegistry schemeRegistry2) {
        Args.notNull(schemeRegistry2, "Scheme registry");
        this.log = LogFactory.getLog(ThreadSafeClientConnManager.class);
        this.schemeRegistry = schemeRegistry2;
        this.connPerRoute = new ConnPerRouteBean();
        this.connOperator = createConnectionOperator(schemeRegistry2);
        this.pool = (ConnPoolByRoute) createConnectionPool(httpParams);
        this.connectionPool = this.pool;
    }

    public void closeExpiredConnections() {
        this.log.debug("Closing expired connections");
        this.pool.closeExpiredConnections();
    }

    public void closeIdleConnections(long j, TimeUnit timeUnit) {
        if (this.log.isDebugEnabled()) {
            Log log2 = this.log;
            log2.debug("Closing connections idle longer than " + j + " " + timeUnit);
        }
        this.pool.closeIdleConnections(j, timeUnit);
    }

    /* access modifiers changed from: protected */
    public ClientConnectionOperator createConnectionOperator(SchemeRegistry schemeRegistry2) {
        return new DefaultClientConnectionOperator(schemeRegistry2);
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public AbstractConnPool createConnectionPool(HttpParams httpParams) {
        return new ConnPoolByRoute(this.connOperator, httpParams);
    }

    /* access modifiers changed from: protected */
    public ConnPoolByRoute createConnectionPool(long j, TimeUnit timeUnit) {
        return new ConnPoolByRoute(this.connOperator, this.connPerRoute, 20, j, timeUnit);
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        try {
            shutdown();
        } finally {
            super.finalize();
        }
    }

    public int getConnectionsInPool() {
        return this.pool.getConnectionsInPool();
    }

    public int getConnectionsInPool(HttpRoute httpRoute) {
        return this.pool.getConnectionsInPool(httpRoute);
    }

    public int getDefaultMaxPerRoute() {
        return this.connPerRoute.getDefaultMaxPerRoute();
    }

    public int getMaxForRoute(HttpRoute httpRoute) {
        return this.connPerRoute.getMaxForRoute(httpRoute);
    }

    public int getMaxTotal() {
        return this.pool.getMaxTotalConnections();
    }

    public SchemeRegistry getSchemeRegistry() {
        return this.schemeRegistry;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:34:0x0070=Splitter:B:34:0x0070, B:19:0x0038=Splitter:B:19:0x0038} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void releaseConnection(org.apache.http.conn.ManagedClientConnection r8, long r9, java.util.concurrent.TimeUnit r11) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof org.apache.http.impl.conn.tsccm.BasicPooledConnAdapter
            java.lang.String r1 = "Connection class mismatch, connection not obtained from this manager"
            org.apache.http.util.Args.check(r0, r1)
            org.apache.http.impl.conn.tsccm.BasicPooledConnAdapter r8 = (org.apache.http.impl.conn.tsccm.BasicPooledConnAdapter) r8
            org.apache.http.impl.conn.AbstractPoolEntry r0 = r8.getPoolEntry()
            if (r0 == 0) goto L_0x001d
            org.apache.http.conn.ClientConnectionManager r0 = r8.getManager()
            if (r0 != r7) goto L_0x0017
            r0 = 1
            goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            java.lang.String r1 = "Connection not obtained from this manager"
            org.apache.http.util.Asserts.check(r0, r1)
        L_0x001d:
            monitor-enter(r8)
            org.apache.http.impl.conn.AbstractPoolEntry r0 = r8.getPoolEntry()     // Catch:{ all -> 0x00b9 }
            r2 = r0
            org.apache.http.impl.conn.tsccm.BasicPoolEntry r2 = (org.apache.http.impl.conn.tsccm.BasicPoolEntry) r2     // Catch:{ all -> 0x00b9 }
            if (r2 != 0) goto L_0x0029
            monitor-exit(r8)     // Catch:{ all -> 0x00b9 }
            return
        L_0x0029:
            boolean r0 = r8.isOpen()     // Catch:{ IOException -> 0x0060 }
            if (r0 == 0) goto L_0x0038
            boolean r0 = r8.isMarkedReusable()     // Catch:{ IOException -> 0x0060 }
            if (r0 != 0) goto L_0x0038
            r8.shutdown()     // Catch:{ IOException -> 0x0060 }
        L_0x0038:
            boolean r3 = r8.isMarkedReusable()     // Catch:{ all -> 0x00b9 }
            org.apache.commons.logging.Log r0 = r7.log     // Catch:{ all -> 0x00b9 }
            boolean r0 = r0.isDebugEnabled()     // Catch:{ all -> 0x00b9 }
            if (r0 == 0) goto L_0x0053
            if (r3 == 0) goto L_0x004e
            org.apache.commons.logging.Log r0 = r7.log     // Catch:{ all -> 0x00b9 }
            java.lang.String r1 = "Released connection is reusable."
        L_0x004a:
            r0.debug(r1)     // Catch:{ all -> 0x00b9 }
            goto L_0x0053
        L_0x004e:
            org.apache.commons.logging.Log r0 = r7.log     // Catch:{ all -> 0x00b9 }
            java.lang.String r1 = "Released connection is not reusable."
            goto L_0x004a
        L_0x0053:
            r8.detach()     // Catch:{ all -> 0x00b9 }
            org.apache.http.impl.conn.tsccm.ConnPoolByRoute r1 = r7.pool     // Catch:{ all -> 0x00b9 }
        L_0x0058:
            r4 = r9
            r6 = r11
            r1.freeEntry(r2, r3, r4, r6)     // Catch:{ all -> 0x00b9 }
            goto L_0x0091
        L_0x005e:
            r0 = move-exception
            goto L_0x0093
        L_0x0060:
            r0 = move-exception
            org.apache.commons.logging.Log r1 = r7.log     // Catch:{ all -> 0x005e }
            boolean r1 = r1.isDebugEnabled()     // Catch:{ all -> 0x005e }
            if (r1 == 0) goto L_0x0070
            org.apache.commons.logging.Log r1 = r7.log     // Catch:{ all -> 0x005e }
            java.lang.String r3 = "Exception shutting down released connection."
            r1.debug(r3, r0)     // Catch:{ all -> 0x005e }
        L_0x0070:
            boolean r3 = r8.isMarkedReusable()     // Catch:{ all -> 0x00b9 }
            org.apache.commons.logging.Log r0 = r7.log     // Catch:{ all -> 0x00b9 }
            boolean r0 = r0.isDebugEnabled()     // Catch:{ all -> 0x00b9 }
            if (r0 == 0) goto L_0x008b
            if (r3 == 0) goto L_0x0086
            org.apache.commons.logging.Log r0 = r7.log     // Catch:{ all -> 0x00b9 }
            java.lang.String r1 = "Released connection is reusable."
        L_0x0082:
            r0.debug(r1)     // Catch:{ all -> 0x00b9 }
            goto L_0x008b
        L_0x0086:
            org.apache.commons.logging.Log r0 = r7.log     // Catch:{ all -> 0x00b9 }
            java.lang.String r1 = "Released connection is not reusable."
            goto L_0x0082
        L_0x008b:
            r8.detach()     // Catch:{ all -> 0x00b9 }
            org.apache.http.impl.conn.tsccm.ConnPoolByRoute r1 = r7.pool     // Catch:{ all -> 0x00b9 }
            goto L_0x0058
        L_0x0091:
            monitor-exit(r8)     // Catch:{ all -> 0x00b9 }
            return
        L_0x0093:
            boolean r3 = r8.isMarkedReusable()     // Catch:{ all -> 0x00b9 }
            org.apache.commons.logging.Log r1 = r7.log     // Catch:{ all -> 0x00b9 }
            boolean r1 = r1.isDebugEnabled()     // Catch:{ all -> 0x00b9 }
            if (r1 == 0) goto L_0x00ae
            if (r3 == 0) goto L_0x00a9
            org.apache.commons.logging.Log r1 = r7.log     // Catch:{ all -> 0x00b9 }
            java.lang.String r4 = "Released connection is reusable."
        L_0x00a5:
            r1.debug(r4)     // Catch:{ all -> 0x00b9 }
            goto L_0x00ae
        L_0x00a9:
            org.apache.commons.logging.Log r1 = r7.log     // Catch:{ all -> 0x00b9 }
            java.lang.String r4 = "Released connection is not reusable."
            goto L_0x00a5
        L_0x00ae:
            r8.detach()     // Catch:{ all -> 0x00b9 }
            org.apache.http.impl.conn.tsccm.ConnPoolByRoute r1 = r7.pool     // Catch:{ all -> 0x00b9 }
            r4 = r9
            r6 = r11
            r1.freeEntry(r2, r3, r4, r6)     // Catch:{ all -> 0x00b9 }
            throw r0     // Catch:{ all -> 0x00b9 }
        L_0x00b9:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x00b9 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager.releaseConnection(org.apache.http.conn.ManagedClientConnection, long, java.util.concurrent.TimeUnit):void");
    }

    public ClientConnectionRequest requestConnection(final HttpRoute httpRoute, Object obj) {
        final PoolEntryRequest requestPoolEntry = this.pool.requestPoolEntry(httpRoute, obj);
        return new ClientConnectionRequest() {
            public void abortRequest() {
                requestPoolEntry.abortRequest();
            }

            public ManagedClientConnection getConnection(long j, TimeUnit timeUnit) {
                Args.notNull(httpRoute, "Route");
                if (ThreadSafeClientConnManager.this.log.isDebugEnabled()) {
                    Log access$000 = ThreadSafeClientConnManager.this.log;
                    access$000.debug("Get connection: " + httpRoute + ", timeout = " + j);
                }
                return new BasicPooledConnAdapter(ThreadSafeClientConnManager.this, requestPoolEntry.getPoolEntry(j, timeUnit));
            }
        };
    }

    public void setDefaultMaxPerRoute(int i) {
        this.connPerRoute.setDefaultMaxPerRoute(i);
    }

    public void setMaxForRoute(HttpRoute httpRoute, int i) {
        this.connPerRoute.setMaxForRoute(httpRoute, i);
    }

    public void setMaxTotal(int i) {
        this.pool.setMaxTotalConnections(i);
    }

    public void shutdown() {
        this.log.debug("Shutting down");
        this.pool.shutdown();
    }
}
