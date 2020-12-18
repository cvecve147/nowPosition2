package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzjj;

/* renamed from: com.google.android.gms.ads.internal.j */
final class C1757j implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzjj f5766a;

    /* renamed from: b */
    private final /* synthetic */ C1755i f5767b;

    C1757j(C1755i iVar, zzjj zzjj) {
        this.f5767b = iVar;
        this.f5766a = zzjj;
    }

    public final void run() {
        synchronized (this.f5767b.f5763s) {
            if (this.f5767b.m7904bc()) {
                this.f5767b.m7905c(this.f5766a);
            } else {
                this.f5767b.m7902b(this.f5766a, 1);
            }
        }
    }
}
