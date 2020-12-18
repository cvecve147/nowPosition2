package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.HA */
final class C2365HA implements C2259Di<C2287Ei, Object> {

    /* renamed from: a */
    private final /* synthetic */ C3626yA f7116a;

    /* renamed from: b */
    private final /* synthetic */ C2712Sz f7117b;

    /* renamed from: c */
    private final /* synthetic */ C2307FA f7118c;

    C2365HA(C2307FA fa, C3626yA yAVar, C2712Sz sz) {
        this.f7118c = fa;
        this.f7116a = yAVar;
        this.f7117b = sz;
    }

    /* renamed from: a */
    public final void mo7992a(String str) {
        try {
            this.f7116a.mo10224d(str);
        } catch (RemoteException e) {
            C2227Cf.m9533b("", e);
        }
    }
}
