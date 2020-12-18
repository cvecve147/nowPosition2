package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.C2227Cf;
import com.google.android.gms.internal.ads.C2254Dd;
import com.google.android.gms.internal.ads.C3564vv;

/* renamed from: com.google.android.gms.ads.internal.K */
final class C1685K implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f5530a;

    /* renamed from: b */
    private final /* synthetic */ C2254Dd f5531b;

    /* renamed from: c */
    private final /* synthetic */ C1678D f5532c;

    C1685K(C1678D d, String str, C2254Dd dd) {
        this.f5532c = d;
        this.f5530a = str;
        this.f5531b = dd;
    }

    public final void run() {
        try {
            this.f5532c.f5648f.f5635v.get(this.f5530a).mo8308a((C3564vv) this.f5531b.f6848F);
        } catch (RemoteException e) {
            C2227Cf.m9537d("#007 Could not call remote method.", e);
        }
    }
}
