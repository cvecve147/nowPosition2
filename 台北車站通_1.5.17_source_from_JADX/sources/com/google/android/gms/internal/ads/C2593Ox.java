package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Ox */
final class C2593Ox implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C2624Px f8082a;

    /* renamed from: b */
    private final /* synthetic */ C2652Qx f8083b;

    C2593Ox(C3394px pxVar, C2624Px px, C2652Qx qx) {
        this.f8082a = px;
        this.f8083b = qx;
    }

    public final void run() {
        try {
            this.f8082a.mo7854a(this.f8083b);
        } catch (RemoteException e) {
            C2227Cf.m9535c("Could not propagate interstitial ad event.", e);
        }
    }
}
