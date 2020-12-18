package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.zA */
public final class C3654zA extends C2267Dq implements C3626yA {
    C3654zA(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
    }

    /* renamed from: d */
    public final void mo10224d(String str) {
        Parcel Xa = mo8007Xa();
        Xa.writeString(str);
        mo8010b(3, Xa);
    }
}
