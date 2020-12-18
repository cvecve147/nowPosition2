package com.google.android.gms.internal.ads;

import android.content.Context;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.I */
public abstract class C2392I extends C2717Td {

    /* renamed from: d */
    protected final C2534N f7223d;

    /* renamed from: e */
    protected final Context f7224e;

    /* renamed from: f */
    protected final Object f7225f = new Object();

    /* renamed from: g */
    protected final Object f7226g = new Object();

    /* renamed from: h */
    protected final C2282Ed f7227h;

    /* renamed from: i */
    protected zzaej f7228i;

    protected C2392I(Context context, C2282Ed ed, C2534N n) {
        super(true);
        this.f7224e = context;
        this.f7227h = ed;
        this.f7228i = ed.f6943b;
        this.f7223d = n;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo8311a(long j);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C2254Dd mo8312b(int i);

    /* renamed from: c */
    public void mo7015c() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0033 A[Catch:{ L -> 0x0014 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003b A[Catch:{ L -> 0x0014 }] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7016d() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f7225f
            monitor-enter(r0)
            java.lang.String r1 = "AdRendererBackgroundTask started."
            com.google.android.gms.internal.ads.C2227Cf.m9532b(r1)     // Catch:{ all -> 0x0060 }
            com.google.android.gms.internal.ads.Ed r1 = r5.f7227h     // Catch:{ all -> 0x0060 }
            int r1 = r1.f6946e     // Catch:{ all -> 0x0060 }
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ L -> 0x0014 }
            r5.mo8311a(r2)     // Catch:{ L -> 0x0014 }
            goto L_0x0050
        L_0x0014:
            r1 = move-exception
            int r2 = r1.mo8468a()     // Catch:{ all -> 0x0060 }
            r3 = 3
            if (r2 == r3) goto L_0x0028
            r3 = -1
            if (r2 != r3) goto L_0x0020
            goto L_0x0028
        L_0x0020:
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x0060 }
            com.google.android.gms.internal.ads.C2227Cf.m9536d(r1)     // Catch:{ all -> 0x0060 }
            goto L_0x002f
        L_0x0028:
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x0060 }
            com.google.android.gms.internal.ads.C2227Cf.m9534c(r1)     // Catch:{ all -> 0x0060 }
        L_0x002f:
            com.google.android.gms.internal.ads.zzaej r1 = r5.f7228i     // Catch:{ all -> 0x0060 }
            if (r1 != 0) goto L_0x003b
            com.google.android.gms.internal.ads.zzaej r1 = new com.google.android.gms.internal.ads.zzaej     // Catch:{ all -> 0x0060 }
            r1.<init>(r2)     // Catch:{ all -> 0x0060 }
        L_0x0038:
            r5.f7228i = r1     // Catch:{ all -> 0x0060 }
            goto L_0x0045
        L_0x003b:
            com.google.android.gms.internal.ads.zzaej r1 = new com.google.android.gms.internal.ads.zzaej     // Catch:{ all -> 0x0060 }
            com.google.android.gms.internal.ads.zzaej r3 = r5.f7228i     // Catch:{ all -> 0x0060 }
            long r3 = r3.f10813l     // Catch:{ all -> 0x0060 }
            r1.<init>(r2, r3)     // Catch:{ all -> 0x0060 }
            goto L_0x0038
        L_0x0045:
            android.os.Handler r1 = com.google.android.gms.internal.ads.C3114ge.f9351a     // Catch:{ all -> 0x0060 }
            com.google.android.gms.internal.ads.J r3 = new com.google.android.gms.internal.ads.J     // Catch:{ all -> 0x0060 }
            r3.<init>(r5)     // Catch:{ all -> 0x0060 }
            r1.post(r3)     // Catch:{ all -> 0x0060 }
            r1 = r2
        L_0x0050:
            com.google.android.gms.internal.ads.Dd r1 = r5.mo8312b(r1)     // Catch:{ all -> 0x0060 }
            android.os.Handler r2 = com.google.android.gms.internal.ads.C3114ge.f9351a     // Catch:{ all -> 0x0060 }
            com.google.android.gms.internal.ads.K r3 = new com.google.android.gms.internal.ads.K     // Catch:{ all -> 0x0060 }
            r3.<init>(r5, r1)     // Catch:{ all -> 0x0060 }
            r2.post(r3)     // Catch:{ all -> 0x0060 }
            monitor-exit(r0)     // Catch:{ all -> 0x0060 }
            return
        L_0x0060:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0060 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2392I.mo7016d():void");
    }
}
