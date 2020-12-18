package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import p101d.p129g.p130a.C5457a;

/* renamed from: com.google.android.gms.internal.ads.qA */
final class C3398qA implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C5457a f10058a;

    /* renamed from: b */
    private final /* synthetic */ C3369pA f10059b;

    C3398qA(C3369pA pAVar, C5457a aVar) {
        this.f10059b = pAVar;
        this.f10058a = aVar;
    }

    public final void run() {
        try {
            this.f10059b.f9988a.mo8889c(C3483tA.m13826a(this.f10058a));
        } catch (RemoteException e) {
            C2227Cf.m9537d("#007 Could not call remote method.", e);
        }
    }
}
