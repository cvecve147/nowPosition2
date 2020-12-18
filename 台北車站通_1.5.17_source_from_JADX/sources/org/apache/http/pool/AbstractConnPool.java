package org.apache.http.pool;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.http.annotation.ThreadSafe;
import org.apache.http.concurrent.FutureCallback;
import org.apache.http.pool.PoolEntry;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;

@ThreadSafe
public abstract class AbstractConnPool<T, C, E extends PoolEntry<T, C>> implements ConnPool<T, E>, ConnPoolControl<T> {
    private final LinkedList<E> available = new LinkedList<>();
    private final ConnFactory<T, C> connFactory;
    private volatile int defaultMaxPerRoute;
    private volatile boolean isShutDown;
    private final Set<E> leased = new HashSet();
    private final Lock lock = new ReentrantLock();
    private final Map<T, Integer> maxPerRoute = new HashMap();
    private volatile int maxTotal;
    private final LinkedList<PoolEntryFuture<E>> pending = new LinkedList<>();
    private final Map<T, RouteSpecificPool<T, C, E>> routeToPool = new HashMap();
    private volatile int validateAfterInactivity;

    public AbstractConnPool(ConnFactory<T, C> connFactory2, int i, int i2) {
        Args.notNull(connFactory2, "Connection factory");
        this.connFactory = connFactory2;
        Args.positive(i, "Max per route value");
        this.defaultMaxPerRoute = i;
        Args.positive(i2, "Max total value");
        this.maxTotal = i2;
    }

    private int getMax(T t) {
        Integer num = this.maxPerRoute.get(t);
        return num != null ? num.intValue() : this.defaultMaxPerRoute;
    }

    private RouteSpecificPool<T, C, E> getPool(final T t) {
        RouteSpecificPool<T, C, E> routeSpecificPool = this.routeToPool.get(t);
        if (routeSpecificPool != null) {
            return routeSpecificPool;
        }
        C70211 r0 = new RouteSpecificPool<T, C, E>(t) {
            /* access modifiers changed from: protected */
            public E createEntry(C c) {
                return AbstractConnPool.this.createEntry(t, c);
            }
        };
        this.routeToPool.put(t, r0);
        return r0;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0066 A[Catch:{ all -> 0x0124, all -> 0x0136 }, LOOP:1: B:13:0x0030->B:28:0x0066, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x006f A[EDGE_INSN: B:78:0x006f->B:29:0x006f ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public E getPoolEntryBlocking(T r8, java.lang.Object r9, long r10, java.util.concurrent.TimeUnit r12, org.apache.http.pool.PoolEntryFuture<E> r13) {
        /*
            r7 = this;
            r0 = 0
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r1 = 0
            if (r0 <= 0) goto L_0x0016
            java.util.Date r0 = new java.util.Date
            long r2 = java.lang.System.currentTimeMillis()
            long r10 = r12.toMillis(r10)
            long r2 = r2 + r10
            r0.<init>(r2)
            goto L_0x0017
        L_0x0016:
            r0 = r1
        L_0x0017:
            java.util.concurrent.locks.Lock r10 = r7.lock
            r10.lock()
            org.apache.http.pool.RouteSpecificPool r10 = r7.getPool(r8)     // Catch:{ all -> 0x0136 }
        L_0x0020:
            if (r1 != 0) goto L_0x012e
            boolean r11 = r7.isShutDown     // Catch:{ all -> 0x0136 }
            r12 = 1
            r1 = 0
            if (r11 != 0) goto L_0x002a
            r11 = r12
            goto L_0x002b
        L_0x002a:
            r11 = r1
        L_0x002b:
            java.lang.String r2 = "Connection pool shut down"
            org.apache.http.util.Asserts.check(r11, r2)     // Catch:{ all -> 0x0136 }
        L_0x0030:
            org.apache.http.pool.PoolEntry r11 = r10.getFree(r9)     // Catch:{ all -> 0x0136 }
            if (r11 != 0) goto L_0x0037
            goto L_0x006f
        L_0x0037:
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0136 }
            boolean r2 = r11.isExpired(r2)     // Catch:{ all -> 0x0136 }
            if (r2 == 0) goto L_0x0045
        L_0x0041:
            r11.close()     // Catch:{ all -> 0x0136 }
            goto L_0x0060
        L_0x0045:
            int r2 = r7.validateAfterInactivity     // Catch:{ all -> 0x0136 }
            if (r2 <= 0) goto L_0x0060
            long r2 = r11.getUpdated()     // Catch:{ all -> 0x0136 }
            int r4 = r7.validateAfterInactivity     // Catch:{ all -> 0x0136 }
            long r4 = (long) r4     // Catch:{ all -> 0x0136 }
            long r2 = r2 + r4
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0136 }
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 > 0) goto L_0x0060
            boolean r2 = r7.validate(r11)     // Catch:{ all -> 0x0136 }
            if (r2 != 0) goto L_0x0060
            goto L_0x0041
        L_0x0060:
            boolean r2 = r11.isClosed()     // Catch:{ all -> 0x0136 }
            if (r2 == 0) goto L_0x006f
            java.util.LinkedList<E> r2 = r7.available     // Catch:{ all -> 0x0136 }
            r2.remove(r11)     // Catch:{ all -> 0x0136 }
            r10.free(r11, r1)     // Catch:{ all -> 0x0136 }
            goto L_0x0030
        L_0x006f:
            if (r11 == 0) goto L_0x0084
            java.util.LinkedList<E> r8 = r7.available     // Catch:{ all -> 0x0136 }
            r8.remove(r11)     // Catch:{ all -> 0x0136 }
            java.util.Set<E> r8 = r7.leased     // Catch:{ all -> 0x0136 }
            r8.add(r11)     // Catch:{ all -> 0x0136 }
            r7.onReuse(r11)     // Catch:{ all -> 0x0136 }
            java.util.concurrent.locks.Lock r8 = r7.lock
            r8.unlock()
            return r11
        L_0x0084:
            int r2 = r7.getMax(r8)     // Catch:{ all -> 0x0136 }
            int r3 = r10.getAllocatedCount()     // Catch:{ all -> 0x0136 }
            int r3 = r3 + r12
            int r3 = r3 - r2
            int r3 = java.lang.Math.max(r1, r3)     // Catch:{ all -> 0x0136 }
            if (r3 <= 0) goto L_0x00ac
            r4 = r1
        L_0x0095:
            if (r4 >= r3) goto L_0x00ac
            org.apache.http.pool.PoolEntry r5 = r10.getLastUsed()     // Catch:{ all -> 0x0136 }
            if (r5 != 0) goto L_0x009e
            goto L_0x00ac
        L_0x009e:
            r5.close()     // Catch:{ all -> 0x0136 }
            java.util.LinkedList<E> r6 = r7.available     // Catch:{ all -> 0x0136 }
            r6.remove(r5)     // Catch:{ all -> 0x0136 }
            r10.remove(r5)     // Catch:{ all -> 0x0136 }
            int r4 = r4 + 1
            goto L_0x0095
        L_0x00ac:
            int r3 = r10.getAllocatedCount()     // Catch:{ all -> 0x0136 }
            if (r3 >= r2) goto L_0x00fd
            java.util.Set<E> r2 = r7.leased     // Catch:{ all -> 0x0136 }
            int r2 = r2.size()     // Catch:{ all -> 0x0136 }
            int r3 = r7.maxTotal     // Catch:{ all -> 0x0136 }
            int r3 = r3 - r2
            int r1 = java.lang.Math.max(r3, r1)     // Catch:{ all -> 0x0136 }
            if (r1 <= 0) goto L_0x00fd
            java.util.LinkedList<E> r9 = r7.available     // Catch:{ all -> 0x0136 }
            int r9 = r9.size()     // Catch:{ all -> 0x0136 }
            int r1 = r1 - r12
            if (r9 <= r1) goto L_0x00e8
            java.util.LinkedList<E> r9 = r7.available     // Catch:{ all -> 0x0136 }
            boolean r9 = r9.isEmpty()     // Catch:{ all -> 0x0136 }
            if (r9 != 0) goto L_0x00e8
            java.util.LinkedList<E> r9 = r7.available     // Catch:{ all -> 0x0136 }
            java.lang.Object r9 = r9.removeLast()     // Catch:{ all -> 0x0136 }
            org.apache.http.pool.PoolEntry r9 = (org.apache.http.pool.PoolEntry) r9     // Catch:{ all -> 0x0136 }
            r9.close()     // Catch:{ all -> 0x0136 }
            java.lang.Object r11 = r9.getRoute()     // Catch:{ all -> 0x0136 }
            org.apache.http.pool.RouteSpecificPool r11 = r7.getPool(r11)     // Catch:{ all -> 0x0136 }
            r11.remove(r9)     // Catch:{ all -> 0x0136 }
        L_0x00e8:
            org.apache.http.pool.ConnFactory<T, C> r9 = r7.connFactory     // Catch:{ all -> 0x0136 }
            java.lang.Object r8 = r9.create(r8)     // Catch:{ all -> 0x0136 }
            org.apache.http.pool.PoolEntry r8 = r10.add(r8)     // Catch:{ all -> 0x0136 }
            java.util.Set<E> r9 = r7.leased     // Catch:{ all -> 0x0136 }
            r9.add(r8)     // Catch:{ all -> 0x0136 }
            java.util.concurrent.locks.Lock r9 = r7.lock
            r9.unlock()
            return r8
        L_0x00fd:
            r10.queue(r13)     // Catch:{ all -> 0x0124 }
            java.util.LinkedList<org.apache.http.pool.PoolEntryFuture<E>> r12 = r7.pending     // Catch:{ all -> 0x0124 }
            r12.add(r13)     // Catch:{ all -> 0x0124 }
            boolean r12 = r13.await(r0)     // Catch:{ all -> 0x0124 }
            r10.unqueue(r13)     // Catch:{ all -> 0x0136 }
            java.util.LinkedList<org.apache.http.pool.PoolEntryFuture<E>> r1 = r7.pending     // Catch:{ all -> 0x0136 }
            r1.remove(r13)     // Catch:{ all -> 0x0136 }
            if (r12 != 0) goto L_0x0121
            if (r0 == 0) goto L_0x0121
            long r1 = r0.getTime()     // Catch:{ all -> 0x0136 }
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0136 }
            int r12 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r12 <= 0) goto L_0x012e
        L_0x0121:
            r1 = r11
            goto L_0x0020
        L_0x0124:
            r8 = move-exception
            r10.unqueue(r13)     // Catch:{ all -> 0x0136 }
            java.util.LinkedList<org.apache.http.pool.PoolEntryFuture<E>> r9 = r7.pending     // Catch:{ all -> 0x0136 }
            r9.remove(r13)     // Catch:{ all -> 0x0136 }
            throw r8     // Catch:{ all -> 0x0136 }
        L_0x012e:
            java.util.concurrent.TimeoutException r8 = new java.util.concurrent.TimeoutException     // Catch:{ all -> 0x0136 }
            java.lang.String r9 = "Timeout waiting for connection"
            r8.<init>(r9)     // Catch:{ all -> 0x0136 }
            throw r8     // Catch:{ all -> 0x0136 }
        L_0x0136:
            r8 = move-exception
            java.util.concurrent.locks.Lock r9 = r7.lock
            r9.unlock()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.pool.AbstractConnPool.getPoolEntryBlocking(java.lang.Object, java.lang.Object, long, java.util.concurrent.TimeUnit, org.apache.http.pool.PoolEntryFuture):org.apache.http.pool.PoolEntry");
    }

    private void purgePoolMap() {
        Iterator<Map.Entry<T, RouteSpecificPool<T, C, E>>> it = this.routeToPool.entrySet().iterator();
        while (it.hasNext()) {
            RouteSpecificPool routeSpecificPool = (RouteSpecificPool) it.next().getValue();
            if (routeSpecificPool.getPendingCount() + routeSpecificPool.getAllocatedCount() == 0) {
                it.remove();
            }
        }
    }

    public void closeExpired() {
        final long currentTimeMillis = System.currentTimeMillis();
        enumAvailable(new PoolEntryCallback<T, C>() {
            public void process(PoolEntry<T, C> poolEntry) {
                if (poolEntry.isExpired(currentTimeMillis)) {
                    poolEntry.close();
                }
            }
        });
    }

    public void closeIdle(long j, TimeUnit timeUnit) {
        Args.notNull(timeUnit, "Time unit");
        long millis = timeUnit.toMillis(j);
        if (millis < 0) {
            millis = 0;
        }
        final long currentTimeMillis = System.currentTimeMillis() - millis;
        enumAvailable(new PoolEntryCallback<T, C>() {
            public void process(PoolEntry<T, C> poolEntry) {
                if (poolEntry.getUpdated() <= currentTimeMillis) {
                    poolEntry.close();
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    public abstract E createEntry(T t, C c);

    /* access modifiers changed from: protected */
    public void enumAvailable(PoolEntryCallback<T, C> poolEntryCallback) {
        this.lock.lock();
        try {
            Iterator it = this.available.iterator();
            while (it.hasNext()) {
                PoolEntry poolEntry = (PoolEntry) it.next();
                poolEntryCallback.process(poolEntry);
                if (poolEntry.isClosed()) {
                    getPool(poolEntry.getRoute()).remove(poolEntry);
                    it.remove();
                }
            }
            purgePoolMap();
        } finally {
            this.lock.unlock();
        }
    }

    /* access modifiers changed from: protected */
    public void enumLeased(PoolEntryCallback<T, C> poolEntryCallback) {
        this.lock.lock();
        try {
            for (E process : this.leased) {
                poolEntryCallback.process(process);
            }
        } finally {
            this.lock.unlock();
        }
    }

    public int getDefaultMaxPerRoute() {
        this.lock.lock();
        try {
            return this.defaultMaxPerRoute;
        } finally {
            this.lock.unlock();
        }
    }

    public int getMaxPerRoute(T t) {
        Args.notNull(t, "Route");
        this.lock.lock();
        try {
            return getMax(t);
        } finally {
            this.lock.unlock();
        }
    }

    public int getMaxTotal() {
        this.lock.lock();
        try {
            return this.maxTotal;
        } finally {
            this.lock.unlock();
        }
    }

    public Set<T> getRoutes() {
        this.lock.lock();
        try {
            return new HashSet(this.routeToPool.keySet());
        } finally {
            this.lock.unlock();
        }
    }

    public PoolStats getStats(T t) {
        Args.notNull(t, "Route");
        this.lock.lock();
        try {
            RouteSpecificPool pool = getPool(t);
            return new PoolStats(pool.getLeasedCount(), pool.getPendingCount(), pool.getAvailableCount(), getMax(t));
        } finally {
            this.lock.unlock();
        }
    }

    public PoolStats getTotalStats() {
        this.lock.lock();
        try {
            return new PoolStats(this.leased.size(), this.pending.size(), this.available.size(), this.maxTotal);
        } finally {
            this.lock.unlock();
        }
    }

    public int getValidateAfterInactivity() {
        return this.validateAfterInactivity;
    }

    public boolean isShutdown() {
        return this.isShutDown;
    }

    public Future<E> lease(T t, Object obj) {
        return lease(t, obj, (FutureCallback) null);
    }

    public Future<E> lease(T t, Object obj, FutureCallback<E> futureCallback) {
        Args.notNull(t, "Route");
        Asserts.check(!this.isShutDown, "Connection pool shut down");
        final T t2 = t;
        final Object obj2 = obj;
        return new PoolEntryFuture<E>(this.lock, futureCallback) {
            public E getPoolEntry(long j, TimeUnit timeUnit) {
                E access$000 = AbstractConnPool.this.getPoolEntryBlocking(t2, obj2, j, timeUnit, this);
                AbstractConnPool.this.onLease(access$000);
                return access$000;
            }
        };
    }

    /* access modifiers changed from: protected */
    public void onLease(E e) {
    }

    /* access modifiers changed from: protected */
    public void onRelease(E e) {
    }

    /* access modifiers changed from: protected */
    public void onReuse(E e) {
    }

    public void release(E e, boolean z) {
        this.lock.lock();
        try {
            if (this.leased.remove(e)) {
                RouteSpecificPool pool = getPool(e.getRoute());
                pool.free(e, z);
                if (!z || this.isShutDown) {
                    e.close();
                } else {
                    this.available.addFirst(e);
                    onRelease(e);
                }
                PoolEntryFuture nextPending = pool.nextPending();
                if (nextPending != null) {
                    this.pending.remove(nextPending);
                } else {
                    nextPending = this.pending.poll();
                }
                if (nextPending != null) {
                    nextPending.wakeup();
                }
            }
        } finally {
            this.lock.unlock();
        }
    }

    public void setDefaultMaxPerRoute(int i) {
        Args.positive(i, "Max per route value");
        this.lock.lock();
        try {
            this.defaultMaxPerRoute = i;
        } finally {
            this.lock.unlock();
        }
    }

    public void setMaxPerRoute(T t, int i) {
        Args.notNull(t, "Route");
        Args.positive(i, "Max per route value");
        this.lock.lock();
        try {
            this.maxPerRoute.put(t, Integer.valueOf(i));
        } finally {
            this.lock.unlock();
        }
    }

    public void setMaxTotal(int i) {
        Args.positive(i, "Max value");
        this.lock.lock();
        try {
            this.maxTotal = i;
        } finally {
            this.lock.unlock();
        }
    }

    public void setValidateAfterInactivity(int i) {
        this.validateAfterInactivity = i;
    }

    public void shutdown() {
        if (!this.isShutDown) {
            this.isShutDown = true;
            this.lock.lock();
            try {
                Iterator it = this.available.iterator();
                while (it.hasNext()) {
                    ((PoolEntry) it.next()).close();
                }
                for (E close : this.leased) {
                    close.close();
                }
                for (RouteSpecificPool<T, C, E> shutdown : this.routeToPool.values()) {
                    shutdown.shutdown();
                }
                this.routeToPool.clear();
                this.leased.clear();
                this.available.clear();
            } finally {
                this.lock.unlock();
            }
        }
    }

    public String toString() {
        return "[leased: " + this.leased + "][available: " + this.available + "][pending: " + this.pending + "]";
    }

    /* access modifiers changed from: protected */
    public boolean validate(E e) {
        return true;
    }
}
