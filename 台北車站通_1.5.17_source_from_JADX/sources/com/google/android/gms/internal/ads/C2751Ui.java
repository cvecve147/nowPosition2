package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.Ui */
public final class C2751Ui extends C2267Dq implements C2722Ti {
    C2751Ui(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    /* renamed from: a */
    public final zzatv mo8895a(zzatt zzatt) {
        Parcel Xa = mo8007Xa();
        C2324Fq.m9803a(Xa, (Parcelable) zzatt);
        Parcel a = mo8008a(1, Xa);
        zzatv zzatv = (zzatv) C2324Fq.m9801a(a, zzatv.CREATOR);
        a.recycle();
        return zzatv;
    }
}
