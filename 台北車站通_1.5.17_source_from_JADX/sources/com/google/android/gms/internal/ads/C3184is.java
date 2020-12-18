package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.is */
public final class C3184is extends C2267Dq implements C3156hs {
    C3184is(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    /* renamed from: a */
    public final zzhi mo9526a(zzhl zzhl) {
        Parcel Xa = mo8007Xa();
        C2324Fq.m9803a(Xa, (Parcelable) zzhl);
        Parcel a = mo8008a(1, Xa);
        zzhi zzhi = (zzhi) C2324Fq.m9801a(a, zzhi.CREATOR);
        a.recycle();
        return zzhi;
    }
}
