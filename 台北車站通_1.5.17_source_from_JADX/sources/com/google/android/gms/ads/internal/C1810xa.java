package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.C2254Dd;
import com.google.android.gms.internal.ads.C3089fi;
import com.google.android.gms.internal.ads.C3114ge;

/* renamed from: com.google.android.gms.ads.internal.xa */
final /* synthetic */ class C1810xa implements C3089fi {

    /* renamed from: a */
    private final C2254Dd f5913a;

    /* renamed from: b */
    private final Runnable f5914b;

    C1810xa(C2254Dd dd, Runnable runnable) {
        this.f5913a = dd;
        this.f5914b = runnable;
    }

    /* renamed from: a */
    public final void mo7037a() {
        C2254Dd dd = this.f5913a;
        Runnable runnable = this.f5914b;
        if (!dd.f6875n) {
            C1697X.m7698e();
            C3114ge.m12412a(runnable);
        }
    }
}
