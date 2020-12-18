package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.C2061y;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.google.android.gms.internal.measurement.za */
final class C3921za extends Thread {

    /* renamed from: a */
    private final Object f11740a = new Object();

    /* renamed from: b */
    private final BlockingQueue<C3917ya<?>> f11741b;

    /* renamed from: c */
    private final /* synthetic */ C3909wa f11742c;

    public C3921za(C3909wa waVar, String str, BlockingQueue<C3917ya<?>> blockingQueue) {
        this.f11742c = waVar;
        C2061y.m9067a(str);
        C2061y.m9067a(blockingQueue);
        this.f11741b = blockingQueue;
        setName(str);
    }

    /* renamed from: a */
    private final void m15940a(InterruptedException interruptedException) {
        this.f11742c.mo10385b().mo10576B().mo10593a(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    /* renamed from: a */
    public final void mo11094a() {
        synchronized (this.f11740a) {
            this.f11740a.notifyAll();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0065, code lost:
        r1 = r6.f11742c.f11698k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x006b, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r6.f11742c.f11699l.release();
        r6.f11742c.f11698k.notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0084, code lost:
        if (r6 != r6.f11742c.f11692e) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0086, code lost:
        com.google.android.gms.internal.measurement.C3921za unused = r6.f11742c.f11692e = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0092, code lost:
        if (r6 != r6.f11742c.f11693f) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0094, code lost:
        com.google.android.gms.internal.measurement.C3921za unused = r6.f11742c.f11693f = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x009a, code lost:
        r6.f11742c.mo10385b().mo10585y().mo10592a("Current scheduler thread is neither worker nor network");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a9, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00aa, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            r0 = 0
        L_0x0001:
            if (r0 != 0) goto L_0x0013
            com.google.android.gms.internal.measurement.wa r1 = r6.f11742c     // Catch:{ InterruptedException -> 0x000e }
            java.util.concurrent.Semaphore r1 = r1.f11699l     // Catch:{ InterruptedException -> 0x000e }
            r1.acquire()     // Catch:{ InterruptedException -> 0x000e }
            r0 = 1
            goto L_0x0001
        L_0x000e:
            r1 = move-exception
            r6.m15940a(r1)
            goto L_0x0001
        L_0x0013:
            r0 = 0
            int r1 = android.os.Process.myTid()     // Catch:{ all -> 0x00b7 }
            int r1 = android.os.Process.getThreadPriority(r1)     // Catch:{ all -> 0x00b7 }
        L_0x001c:
            java.util.concurrent.BlockingQueue<com.google.android.gms.internal.measurement.ya<?>> r2 = r6.f11741b     // Catch:{ all -> 0x00b7 }
            java.lang.Object r2 = r2.poll()     // Catch:{ all -> 0x00b7 }
            com.google.android.gms.internal.measurement.ya r2 = (com.google.android.gms.internal.measurement.C3917ya) r2     // Catch:{ all -> 0x00b7 }
            if (r2 == 0) goto L_0x0035
            boolean r3 = r2.f11722b     // Catch:{ all -> 0x00b7 }
            if (r3 == 0) goto L_0x002c
            r3 = r1
            goto L_0x002e
        L_0x002c:
            r3 = 10
        L_0x002e:
            android.os.Process.setThreadPriority(r3)     // Catch:{ all -> 0x00b7 }
            r2.run()     // Catch:{ all -> 0x00b7 }
            goto L_0x001c
        L_0x0035:
            java.lang.Object r2 = r6.f11740a     // Catch:{ all -> 0x00b7 }
            monitor-enter(r2)     // Catch:{ all -> 0x00b7 }
            java.util.concurrent.BlockingQueue<com.google.android.gms.internal.measurement.ya<?>> r3 = r6.f11741b     // Catch:{ all -> 0x00b4 }
            java.lang.Object r3 = r3.peek()     // Catch:{ all -> 0x00b4 }
            if (r3 != 0) goto L_0x0054
            com.google.android.gms.internal.measurement.wa r3 = r6.f11742c     // Catch:{ all -> 0x00b4 }
            boolean r3 = r3.f11700m     // Catch:{ all -> 0x00b4 }
            if (r3 != 0) goto L_0x0054
            java.lang.Object r3 = r6.f11740a     // Catch:{ InterruptedException -> 0x0050 }
            r4 = 30000(0x7530, double:1.4822E-319)
            r3.wait(r4)     // Catch:{ InterruptedException -> 0x0050 }
            goto L_0x0054
        L_0x0050:
            r3 = move-exception
            r6.m15940a(r3)     // Catch:{ all -> 0x00b4 }
        L_0x0054:
            monitor-exit(r2)     // Catch:{ all -> 0x00b4 }
            com.google.android.gms.internal.measurement.wa r2 = r6.f11742c     // Catch:{ all -> 0x00b7 }
            java.lang.Object r2 = r2.f11698k     // Catch:{ all -> 0x00b7 }
            monitor-enter(r2)     // Catch:{ all -> 0x00b7 }
            java.util.concurrent.BlockingQueue<com.google.android.gms.internal.measurement.ya<?>> r3 = r6.f11741b     // Catch:{ all -> 0x00b1 }
            java.lang.Object r3 = r3.peek()     // Catch:{ all -> 0x00b1 }
            if (r3 != 0) goto L_0x00ae
            monitor-exit(r2)     // Catch:{ all -> 0x00b1 }
            com.google.android.gms.internal.measurement.wa r1 = r6.f11742c
            java.lang.Object r1 = r1.f11698k
            monitor-enter(r1)
            com.google.android.gms.internal.measurement.wa r2 = r6.f11742c     // Catch:{ all -> 0x00ab }
            java.util.concurrent.Semaphore r2 = r2.f11699l     // Catch:{ all -> 0x00ab }
            r2.release()     // Catch:{ all -> 0x00ab }
            com.google.android.gms.internal.measurement.wa r2 = r6.f11742c     // Catch:{ all -> 0x00ab }
            java.lang.Object r2 = r2.f11698k     // Catch:{ all -> 0x00ab }
            r2.notifyAll()     // Catch:{ all -> 0x00ab }
            com.google.android.gms.internal.measurement.wa r2 = r6.f11742c     // Catch:{ all -> 0x00ab }
            com.google.android.gms.internal.measurement.za r2 = r2.f11692e     // Catch:{ all -> 0x00ab }
            if (r6 != r2) goto L_0x008c
            com.google.android.gms.internal.measurement.wa r2 = r6.f11742c     // Catch:{ all -> 0x00ab }
            com.google.android.gms.internal.measurement.C3921za unused = r2.f11692e = null     // Catch:{ all -> 0x00ab }
            goto L_0x00a9
        L_0x008c:
            com.google.android.gms.internal.measurement.wa r2 = r6.f11742c     // Catch:{ all -> 0x00ab }
            com.google.android.gms.internal.measurement.za r2 = r2.f11693f     // Catch:{ all -> 0x00ab }
            if (r6 != r2) goto L_0x009a
            com.google.android.gms.internal.measurement.wa r2 = r6.f11742c     // Catch:{ all -> 0x00ab }
            com.google.android.gms.internal.measurement.C3921za unused = r2.f11693f = null     // Catch:{ all -> 0x00ab }
            goto L_0x00a9
        L_0x009a:
            com.google.android.gms.internal.measurement.wa r0 = r6.f11742c     // Catch:{ all -> 0x00ab }
            com.google.android.gms.internal.measurement.W r0 = r0.mo10385b()     // Catch:{ all -> 0x00ab }
            com.google.android.gms.internal.measurement.Y r0 = r0.mo10585y()     // Catch:{ all -> 0x00ab }
            java.lang.String r2 = "Current scheduler thread is neither worker nor network"
            r0.mo10592a(r2)     // Catch:{ all -> 0x00ab }
        L_0x00a9:
            monitor-exit(r1)     // Catch:{ all -> 0x00ab }
            return
        L_0x00ab:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00ab }
            throw r0
        L_0x00ae:
            monitor-exit(r2)     // Catch:{ all -> 0x00b1 }
            goto L_0x001c
        L_0x00b1:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00b1 }
            throw r1     // Catch:{ all -> 0x00b7 }
        L_0x00b4:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00b4 }
            throw r1     // Catch:{ all -> 0x00b7 }
        L_0x00b7:
            r1 = move-exception
            com.google.android.gms.internal.measurement.wa r2 = r6.f11742c
            java.lang.Object r2 = r2.f11698k
            monitor-enter(r2)
            com.google.android.gms.internal.measurement.wa r3 = r6.f11742c     // Catch:{ all -> 0x00fe }
            java.util.concurrent.Semaphore r3 = r3.f11699l     // Catch:{ all -> 0x00fe }
            r3.release()     // Catch:{ all -> 0x00fe }
            com.google.android.gms.internal.measurement.wa r3 = r6.f11742c     // Catch:{ all -> 0x00fe }
            java.lang.Object r3 = r3.f11698k     // Catch:{ all -> 0x00fe }
            r3.notifyAll()     // Catch:{ all -> 0x00fe }
            com.google.android.gms.internal.measurement.wa r3 = r6.f11742c     // Catch:{ all -> 0x00fe }
            com.google.android.gms.internal.measurement.za r3 = r3.f11692e     // Catch:{ all -> 0x00fe }
            if (r6 == r3) goto L_0x00f7
            com.google.android.gms.internal.measurement.wa r3 = r6.f11742c     // Catch:{ all -> 0x00fe }
            com.google.android.gms.internal.measurement.za r3 = r3.f11693f     // Catch:{ all -> 0x00fe }
            if (r6 != r3) goto L_0x00e7
            com.google.android.gms.internal.measurement.wa r3 = r6.f11742c     // Catch:{ all -> 0x00fe }
            com.google.android.gms.internal.measurement.C3921za unused = r3.f11693f = null     // Catch:{ all -> 0x00fe }
            goto L_0x00fc
        L_0x00e7:
            com.google.android.gms.internal.measurement.wa r0 = r6.f11742c     // Catch:{ all -> 0x00fe }
            com.google.android.gms.internal.measurement.W r0 = r0.mo10385b()     // Catch:{ all -> 0x00fe }
            com.google.android.gms.internal.measurement.Y r0 = r0.mo10585y()     // Catch:{ all -> 0x00fe }
            java.lang.String r3 = "Current scheduler thread is neither worker nor network"
            r0.mo10592a(r3)     // Catch:{ all -> 0x00fe }
            goto L_0x00fc
        L_0x00f7:
            com.google.android.gms.internal.measurement.wa r3 = r6.f11742c     // Catch:{ all -> 0x00fe }
            com.google.android.gms.internal.measurement.C3921za unused = r3.f11692e = null     // Catch:{ all -> 0x00fe }
        L_0x00fc:
            monitor-exit(r2)     // Catch:{ all -> 0x00fe }
            throw r1
        L_0x00fe:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00fe }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C3921za.run():void");
    }
}
