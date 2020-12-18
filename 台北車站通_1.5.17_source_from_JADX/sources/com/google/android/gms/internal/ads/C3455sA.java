package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import p101d.p129g.p130a.C5457a;

/* renamed from: com.google.android.gms.internal.ads.sA */
final class C3455sA implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C5457a f10175a;

    /* renamed from: b */
    private final /* synthetic */ C3369pA f10176b;

    C3455sA(C3369pA pAVar, C5457a aVar) {
        this.f10176b = pAVar;
        this.f10175a = aVar;
    }

    public final void run() {
        try {
            this.f10176b.f9988a.mo8889c(C3483tA.m13826a(this.f10175a));
        } catch (RemoteException e) {
            C2227Cf.m9537d("#007 Could not call remote method.", e);
        }
    }
}
