package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C2011d;

/* renamed from: com.google.android.gms.internal.ads.cs */
final class C3013cs implements C2011d.C2013b {

    /* renamed from: a */
    private final /* synthetic */ C2899Zr f9010a;

    C3013cs(C2899Zr zr) {
        this.f9010a = zr;
    }

    /* renamed from: a */
    public final void mo7572a(ConnectionResult connectionResult) {
        synchronized (this.f9010a.f8714b) {
            C3156hs unused = this.f9010a.f8717e = null;
            if (this.f9010a.f8715c != null) {
                C3071es unused2 = this.f9010a.f8715c = null;
            }
            this.f9010a.f8714b.notifyAll();
        }
    }
}
