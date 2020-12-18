package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzjj;

/* renamed from: com.google.android.gms.ads.internal.k */
final class C1759k implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzjj f5772a;

    /* renamed from: b */
    private final /* synthetic */ int f5773b;

    /* renamed from: c */
    private final /* synthetic */ C1755i f5774c;

    C1759k(C1755i iVar, zzjj zzjj, int i) {
        this.f5774c = iVar;
        this.f5772a = zzjj;
        this.f5773b = i;
    }

    public final void run() {
        synchronized (this.f5774c.f5763s) {
            this.f5774c.m7902b(this.f5772a, this.f5773b);
        }
    }
}
