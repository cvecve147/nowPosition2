package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.qb */
public final class C3400qb extends C2267Dq implements C3343ob {
    C3400qb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    /* renamed from: a */
    public final void mo8525a(zzaef zzaef, C3428rb rbVar) {
        Parcel Xa = mo8007Xa();
        C2324Fq.m9803a(Xa, (Parcelable) zzaef);
        C2324Fq.m9802a(Xa, (IInterface) rbVar);
        mo8010b(2, Xa);
    }
}
