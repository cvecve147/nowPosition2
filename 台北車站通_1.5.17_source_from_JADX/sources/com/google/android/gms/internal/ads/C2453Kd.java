package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C1697X;

/* renamed from: com.google.android.gms.internal.ads.Kd */
final class C2453Kd extends C2717Td {

    /* renamed from: d */
    private final /* synthetic */ C2397Id f7440d;

    C2453Kd(C2397Id id) {
        this.f7440d = id;
    }

    /* renamed from: c */
    public final void mo7015c() {
    }

    /* renamed from: d */
    public final void mo7016d() {
        C2621Pu pu = new C2621Pu(this.f7440d.f7238f, this.f7440d.f7239g.f10855a);
        synchronized (this.f7440d.f7233a) {
            try {
                C1697X.m7707n();
                C2707Su.m11216a(this.f7440d.f7240h, pu);
            } catch (IllegalArgumentException e) {
                C2227Cf.m9535c("Cannot config CSI reporter.", e);
            }
        }
    }
}
