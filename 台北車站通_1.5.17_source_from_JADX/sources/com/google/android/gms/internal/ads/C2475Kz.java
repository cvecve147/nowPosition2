package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Kz */
final class C2475Kz implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C2276Dz f7485a;

    C2475Kz(C2447Jz jz, C2276Dz dz) {
        this.f7485a = dz;
    }

    public final void run() {
        try {
            this.f7485a.f6936c.destroy();
        } catch (RemoteException e) {
            C2227Cf.m9535c("Could not destroy mediation adapter.", e);
        }
    }
}
