package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.C1697X;

/* renamed from: com.google.android.gms.internal.ads.Ob */
final class C2566Ob implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzaef f8028a;

    /* renamed from: b */
    private final /* synthetic */ C3428rb f8029b;

    /* renamed from: c */
    private final /* synthetic */ C2509Mb f8030c;

    C2566Ob(C2509Mb mb, zzaef zzaef, C3428rb rbVar) {
        this.f8030c = mb;
        this.f8028a = zzaef;
        this.f8029b = rbVar;
    }

    public final void run() {
        zzaej zzaej;
        try {
            zzaej = this.f8030c.mo8524a(this.f8028a);
        } catch (Exception e) {
            C1697X.m7702i().mo8319a((Throwable) e, "AdRequestServiceImpl.loadAdAsync");
            C2227Cf.m9535c("Could not fetch ad response due to an Exception.", e);
            zzaej = null;
        }
        if (zzaej == null) {
            zzaej = new zzaej(0);
        }
        try {
            this.f8029b.mo9677a(zzaej);
        } catch (RemoteException e2) {
            C2227Cf.m9535c("Fail to forward ad response.", e2);
        }
    }
}
