package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.GA */
final class C2335GA implements C2259Di<Object, Object> {

    /* renamed from: a */
    private final /* synthetic */ C3570wA f7040a;

    /* renamed from: b */
    private final /* synthetic */ C2712Sz f7041b;

    C2335GA(C2307FA fa, C3570wA wAVar, C2712Sz sz) {
        this.f7040a = wAVar;
        this.f7041b = sz;
    }

    /* renamed from: a */
    public final void mo7992a(String str) {
        try {
            this.f7040a.mo10157d(str);
        } catch (RemoteException e) {
            C2227Cf.m9533b("", e);
        }
    }
}
