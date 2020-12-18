package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.internal.C2061y;
import com.google.android.gms.common.util.C2083e;
import java.lang.Thread;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.gms.internal.measurement.wa */
public final class C3909wa extends C3802Wa {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final AtomicLong f11690c = new AtomicLong(Long.MIN_VALUE);

    /* renamed from: d */
    private ExecutorService f11691d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C3921za f11692e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C3921za f11693f;

    /* renamed from: g */
    private final PriorityBlockingQueue<C3917ya<?>> f11694g = new PriorityBlockingQueue<>();

    /* renamed from: h */
    private final BlockingQueue<C3917ya<?>> f11695h = new LinkedBlockingQueue();

    /* renamed from: i */
    private final Thread.UncaughtExceptionHandler f11696i = new C3913xa(this, "Thread death: Uncaught exception on worker thread");

    /* renamed from: j */
    private final Thread.UncaughtExceptionHandler f11697j = new C3913xa(this, "Thread death: Uncaught exception on network thread");
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final Object f11698k = new Object();
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final Semaphore f11699l = new Semaphore(2);
    /* access modifiers changed from: private */

    /* renamed from: m */
    public volatile boolean f11700m;

    C3909wa(C3715Aa aa) {
        super(aa);
    }

    /* renamed from: a */
    private final void m15795a(C3917ya<?> yaVar) {
        synchronized (this.f11698k) {
            this.f11694g.add(yaVar);
            if (this.f11692e == null) {
                this.f11692e = new C3921za(this, "Measurement Worker", this.f11694g);
                this.f11692e.setUncaughtExceptionHandler(this.f11696i);
                this.f11692e.start();
            } else {
                this.f11692e.mo11094a();
            }
        }
    }

    /* renamed from: y */
    public static boolean m15801y() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public final ExecutorService mo11017A() {
        ExecutorService executorService;
        synchronized (this.f11698k) {
            if (this.f11691d == null) {
                this.f11691d = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new ArrayBlockingQueue(100));
            }
            executorService = this.f11691d;
        }
        return executorService;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C2083e mo10382a() {
        return super.mo10382a();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:16|17|(1:19)(1:20)|21|22|23) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0014, code lost:
        r2 = mo10385b().mo10576B();
        r4 = java.lang.String.valueOf(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        if (r4.length() == 0) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0028, code lost:
        r3 = "Timed out waiting for ".concat(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        r3 = new java.lang.String("Timed out waiting for ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        r2.mo10592a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r2 = mo10385b().mo10576B();
        r4 = java.lang.String.valueOf(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
        if (r4.length() != 0) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004b, code lost:
        r3 = "Interrupted waiting for ".concat(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0050, code lost:
        r3 = new java.lang.String("Interrupted waiting for ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
        r2.mo10592a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005b, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000e, code lost:
        r1 = r1.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        if (r1 != null) goto L_0x0036;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0037 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> T mo11018a(java.util.concurrent.atomic.AtomicReference<T> r1, long r2, java.lang.String r4, java.lang.Runnable r5) {
        /*
            r0 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.measurement.wa r2 = r0.mo10386c()     // Catch:{ all -> 0x005c }
            r2.mo11020a((java.lang.Runnable) r5)     // Catch:{ all -> 0x005c }
            r2 = 15000(0x3a98, double:7.411E-320)
            r1.wait(r2)     // Catch:{ InterruptedException -> 0x0037 }
            monitor-exit(r1)     // Catch:{ all -> 0x005c }
            java.lang.Object r1 = r1.get()
            if (r1 != 0) goto L_0x0036
            com.google.android.gms.internal.measurement.W r2 = r0.mo10385b()
            com.google.android.gms.internal.measurement.Y r2 = r2.mo10576B()
            java.lang.String r3 = "Timed out waiting for "
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r5 = r4.length()
            if (r5 == 0) goto L_0x002d
            java.lang.String r3 = r3.concat(r4)
            goto L_0x0033
        L_0x002d:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r3)
            r3 = r4
        L_0x0033:
            r2.mo10592a(r3)
        L_0x0036:
            return r1
        L_0x0037:
            com.google.android.gms.internal.measurement.W r2 = r0.mo10385b()     // Catch:{ all -> 0x005c }
            com.google.android.gms.internal.measurement.Y r2 = r2.mo10576B()     // Catch:{ all -> 0x005c }
            java.lang.String r3 = "Interrupted waiting for "
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x005c }
            int r5 = r4.length()     // Catch:{ all -> 0x005c }
            if (r5 == 0) goto L_0x0050
            java.lang.String r3 = r3.concat(r4)     // Catch:{ all -> 0x005c }
            goto L_0x0056
        L_0x0050:
            java.lang.String r4 = new java.lang.String     // Catch:{ all -> 0x005c }
            r4.<init>(r3)     // Catch:{ all -> 0x005c }
            r3 = r4
        L_0x0056:
            r2.mo10592a(r3)     // Catch:{ all -> 0x005c }
            r2 = 0
            monitor-exit(r1)     // Catch:{ all -> 0x005c }
            return r2
        L_0x005c:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x005c }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C3909wa.mo11018a(java.util.concurrent.atomic.AtomicReference, long, java.lang.String, java.lang.Runnable):java.lang.Object");
    }

    /* renamed from: a */
    public final <V> Future<V> mo11019a(Callable<V> callable) {
        mo10588t();
        C2061y.m9067a(callable);
        C3917ya yaVar = new C3917ya(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.f11692e) {
            if (!this.f11694g.isEmpty()) {
                mo10385b().mo10576B().mo10592a("Callable skipped the worker queue.");
            }
            yaVar.run();
        } else {
            m15795a((C3917ya<?>) yaVar);
        }
        return yaVar;
    }

    /* renamed from: a */
    public final void mo11020a(Runnable runnable) {
        mo10588t();
        C2061y.m9067a(runnable);
        m15795a((C3917ya<?>) new C3917ya(this, runnable, false, "Task exception on worker thread"));
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C3801W mo10385b() {
        return super.mo10385b();
    }

    /* renamed from: b */
    public final <V> Future<V> mo11021b(Callable<V> callable) {
        mo10588t();
        C2061y.m9067a(callable);
        C3917ya yaVar = new C3917ya(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f11692e) {
            yaVar.run();
        } else {
            m15795a((C3917ya<?>) yaVar);
        }
        return yaVar;
    }

    /* renamed from: b */
    public final void mo11022b(Runnable runnable) {
        mo10588t();
        C2061y.m9067a(runnable);
        C3917ya yaVar = new C3917ya(this, runnable, false, "Task exception on network thread");
        synchronized (this.f11698k) {
            this.f11695h.add(yaVar);
            if (this.f11693f == null) {
                this.f11693f = new C3921za(this, "Measurement Network", this.f11695h);
                this.f11693f.setUncaughtExceptionHandler(this.f11697j);
                this.f11693f.start();
            } else {
                this.f11693f.mo11094a();
            }
        }
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C3909wa mo10386c() {
        return super.mo10386c();
    }

    /* renamed from: d */
    public final void mo10451d() {
        if (Thread.currentThread() != this.f11692e) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    /* renamed from: f */
    public final void mo10565f() {
        if (Thread.currentThread() != this.f11693f) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    public final /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ C3734F mo10452j() {
        return super.mo10452j();
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C3793U mo10453n() {
        return super.mo10453n();
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C3871mc mo10454o() {
        return super.mo10454o();
    }

    /* renamed from: q */
    public final /* bridge */ /* synthetic */ C3849ha mo10455q() {
        return super.mo10455q();
    }

    /* renamed from: r */
    public final /* bridge */ /* synthetic */ C3908w mo10456r() {
        return super.mo10456r();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final boolean mo10457u() {
        return false;
    }

    /* renamed from: z */
    public final boolean mo11023z() {
        return Thread.currentThread() == this.f11692e;
    }
}
