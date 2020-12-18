package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.lb */
public final class C3257lb extends C3457sb {

    /* renamed from: a */
    private final WeakReference<C2939ab> f9739a;

    public C3257lb(C2939ab abVar) {
        this.f9739a = new WeakReference<>(abVar);
    }

    /* renamed from: a */
    public final void mo9677a(zzaej zzaej) {
        C2939ab abVar = (C2939ab) this.f9739a.get();
        if (abVar != null) {
            abVar.mo8604a(zzaej);
        }
    }
}
