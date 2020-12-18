package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.xA */
public final class C3598xA extends C2267Dq implements C3570wA {
    C3598xA(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    /* renamed from: d */
    public final void mo10157d(String str) {
        Parcel Xa = mo8007Xa();
        Xa.writeString(str);
        mo8010b(2, Xa);
    }
}
