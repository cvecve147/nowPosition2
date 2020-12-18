package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Yf */
final class C2859Yf {

    /* renamed from: a */
    private final Object f8649a = new Object();

    /* renamed from: b */
    private final List<Runnable> f8650b = new ArrayList();

    /* renamed from: c */
    private boolean f8651c = false;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        if (r2 >= r1) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
        r3 = r0.get(r2);
        r2 = r2 + 1;
        ((java.lang.Runnable) r3).run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        r1 = r0.size();
        r2 = 0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo9066a() {
        /*
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Object r1 = r4.f8649a
            monitor-enter(r1)
            boolean r2 = r4.f8651c     // Catch:{ all -> 0x0030 }
            if (r2 == 0) goto L_0x000e
            monitor-exit(r1)     // Catch:{ all -> 0x0030 }
            return
        L_0x000e:
            java.util.List<java.lang.Runnable> r2 = r4.f8650b     // Catch:{ all -> 0x0030 }
            r0.addAll(r2)     // Catch:{ all -> 0x0030 }
            java.util.List<java.lang.Runnable> r2 = r4.f8650b     // Catch:{ all -> 0x0030 }
            r2.clear()     // Catch:{ all -> 0x0030 }
            r2 = 1
            r4.f8651c = r2     // Catch:{ all -> 0x0030 }
            monitor-exit(r1)     // Catch:{ all -> 0x0030 }
            int r1 = r0.size()
            r2 = 0
        L_0x0021:
            if (r2 >= r1) goto L_0x002f
            java.lang.Object r3 = r0.get(r2)
            int r2 = r2 + 1
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            r3.run()
            goto L_0x0021
        L_0x002f:
            return
        L_0x0030:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0030 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2859Yf.mo9066a():void");
    }

    /* renamed from: a */
    public final void mo9067a(Runnable runnable, Executor executor) {
        synchronized (this.f8649a) {
            if (this.f8651c) {
                executor.execute(runnable);
            } else {
                this.f8650b.add(new C2887Zf(executor, runnable));
            }
        }
    }
}
