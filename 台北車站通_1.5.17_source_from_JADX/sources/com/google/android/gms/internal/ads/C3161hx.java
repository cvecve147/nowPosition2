package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.hx */
public final class C3161hx extends C2267Dq implements C3133gx {
    C3161hx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    /* renamed from: a */
    public final ParcelFileDescriptor mo9482a(zzsg zzsg) {
        Parcel Xa = mo8007Xa();
        C2324Fq.m9803a(Xa, (Parcelable) zzsg);
        Parcel a = mo8008a(1, Xa);
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) C2324Fq.m9801a(a, ParcelFileDescriptor.CREATOR);
        a.recycle();
        return parcelFileDescriptor;
    }
}
