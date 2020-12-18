package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.tb */
public final class C3485tb extends C2267Dq implements C3428rb {
    C3485tb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdResponseListener");
    }

    /* renamed from: a */
    public final void mo9677a(zzaej zzaej) {
        Parcel Xa = mo8007Xa();
        C2324Fq.m9803a(Xa, (Parcelable) zzaej);
        mo8010b(1, Xa);
    }
}
