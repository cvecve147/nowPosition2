package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C1697X;

/* renamed from: com.google.android.gms.internal.ads.Ld */
final class C2481Ld {

    /* renamed from: a */
    private final Object f7504a;

    /* renamed from: b */
    private volatile int f7505b;

    /* renamed from: c */
    private volatile long f7506c;

    private C2481Ld() {
        this.f7504a = new Object();
        this.f7505b = C2511Md.f7566a;
        this.f7506c = 0;
    }

    /* synthetic */ C2481Ld(C2453Kd kd) {
        this();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m10487a(int r5, int r6) {
        /*
            r4 = this;
            r4.m10488d()
            com.google.android.gms.common.util.e r0 = com.google.android.gms.ads.internal.C1697X.m7705l()
            long r0 = r0.mo7725a()
            java.lang.Object r2 = r4.f7504a
            monitor-enter(r2)
            int r3 = r4.f7505b     // Catch:{ all -> 0x0020 }
            if (r3 == r5) goto L_0x0014
            monitor-exit(r2)     // Catch:{ all -> 0x0020 }
            return
        L_0x0014:
            r4.f7505b = r6     // Catch:{ all -> 0x0020 }
            int r5 = r4.f7505b     // Catch:{ all -> 0x0020 }
            int r6 = com.google.android.gms.internal.ads.C2511Md.f7568c     // Catch:{ all -> 0x0020 }
            if (r5 != r6) goto L_0x001e
            r4.f7506c = r0     // Catch:{ all -> 0x0020 }
        L_0x001e:
            monitor-exit(r2)     // Catch:{ all -> 0x0020 }
            return
        L_0x0020:
            r5 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0020 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2481Ld.m10487a(int, int):void");
    }

    /* renamed from: d */
    private final void m10488d() {
        long a = C1697X.m7705l().mo7725a();
        synchronized (this.f7504a) {
            if (this.f7505b == C2511Md.f7568c) {
                if (this.f7506c + ((Long) C3390pt.m13458f().mo8515a(C2558Nu.f7763Je)).longValue() <= a) {
                    this.f7505b = C2511Md.f7566a;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo8471a(boolean z) {
        int i;
        int i2;
        if (z) {
            i = C2511Md.f7566a;
            i2 = C2511Md.f7567b;
        } else {
            i = C2511Md.f7567b;
            i2 = C2511Md.f7566a;
        }
        m10487a(i, i2);
    }

    /* renamed from: a */
    public final boolean mo8472a() {
        m10488d();
        return this.f7505b == C2511Md.f7567b;
    }

    /* renamed from: b */
    public final boolean mo8473b() {
        m10488d();
        return this.f7505b == C2511Md.f7568c;
    }

    /* renamed from: c */
    public final void mo8474c() {
        m10487a(C2511Md.f7567b, C2511Md.f7568c);
    }
}
