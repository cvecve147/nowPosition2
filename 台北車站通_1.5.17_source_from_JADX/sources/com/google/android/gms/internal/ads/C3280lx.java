package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.lx */
final /* synthetic */ class C3280lx implements Runnable {

    /* renamed from: a */
    private final C3251kx f9762a;

    /* renamed from: b */
    private final C3048dx f9763b;

    /* renamed from: c */
    private final C3116gg f9764c;

    /* renamed from: d */
    private final zzsg f9765d;

    C3280lx(C3251kx kxVar, C3048dx dxVar, C3116gg ggVar, zzsg zzsg) {
        this.f9762a = kxVar;
        this.f9763b = dxVar;
        this.f9764c = ggVar;
        this.f9765d = zzsg;
    }

    public final void run() {
        C3251kx kxVar = this.f9762a;
        C3048dx dxVar = this.f9763b;
        C3116gg ggVar = this.f9764c;
        try {
            ggVar.mo9464b(dxVar.mo7557D().mo9482a(this.f9765d));
        } catch (RemoteException e) {
            C2227Cf.m9533b("Unable to obtain a cache service instance.", e);
            ggVar.mo9463a(e);
            kxVar.f9730c.m12679a();
        }
    }
}
