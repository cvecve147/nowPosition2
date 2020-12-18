package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.bn */
public class C2980bn {

    /* renamed from: a */
    private static final C2206Bm f8952a = C2206Bm.m9445a();

    /* renamed from: b */
    private C3150hm f8953b;

    /* renamed from: c */
    private volatile C3498tn f8954c;

    /* renamed from: d */
    private volatile C3150hm f8955d;

    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0012 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.ads.C3498tn m12021b(com.google.android.gms.internal.ads.C3498tn r2) {
        /*
            r1 = this;
            com.google.android.gms.internal.ads.tn r0 = r1.f8954c
            if (r0 != 0) goto L_0x001c
            monitor-enter(r1)
            com.google.android.gms.internal.ads.tn r0 = r1.f8954c     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x000b
        L_0x0009:
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            goto L_0x001c
        L_0x000b:
            r1.f8954c = r2     // Catch:{ Um -> 0x0012 }
            com.google.android.gms.internal.ads.hm r0 = com.google.android.gms.internal.ads.C3150hm.f9434a     // Catch:{ Um -> 0x0012 }
            r1.f8955d = r0     // Catch:{ Um -> 0x0012 }
            goto L_0x0009
        L_0x0012:
            r1.f8954c = r2     // Catch:{ all -> 0x0019 }
            com.google.android.gms.internal.ads.hm r2 = com.google.android.gms.internal.ads.C3150hm.f9434a     // Catch:{ all -> 0x0019 }
            r1.f8955d = r2     // Catch:{ all -> 0x0019 }
            goto L_0x0009
        L_0x0019:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            throw r2
        L_0x001c:
            com.google.android.gms.internal.ads.tn r2 = r1.f8954c
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2980bn.m12021b(com.google.android.gms.internal.ads.tn):com.google.android.gms.internal.ads.tn");
    }

    /* renamed from: a */
    public final C3150hm mo9253a() {
        if (this.f8955d != null) {
            return this.f8955d;
        }
        synchronized (this) {
            if (this.f8955d != null) {
                C3150hm hmVar = this.f8955d;
                return hmVar;
            }
            this.f8955d = this.f8954c == null ? C3150hm.f9434a : this.f8954c.mo9039h();
            C3150hm hmVar2 = this.f8955d;
            return hmVar2;
        }
    }

    /* renamed from: a */
    public final C3498tn mo9254a(C3498tn tnVar) {
        C3498tn tnVar2 = this.f8954c;
        this.f8953b = null;
        this.f8955d = null;
        this.f8954c = tnVar;
        return tnVar2;
    }

    /* renamed from: b */
    public final int mo9255b() {
        if (this.f8955d != null) {
            return this.f8955d.size();
        }
        if (this.f8954c != null) {
            return this.f8954c.mo8615e();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2980bn)) {
            return false;
        }
        C2980bn bnVar = (C2980bn) obj;
        C3498tn tnVar = this.f8954c;
        C3498tn tnVar2 = bnVar.f8954c;
        return (tnVar == null && tnVar2 == null) ? mo9253a().equals(bnVar.mo9253a()) : (tnVar == null || tnVar2 == null) ? tnVar != null ? tnVar.equals(bnVar.m12021b(tnVar.mo8614d())) : m12021b(tnVar2.mo8614d()).equals(tnVar2) : tnVar.equals(tnVar2);
    }

    public int hashCode() {
        return 1;
    }
}
