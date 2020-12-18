package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.sb */
public abstract class C3457sb extends C2296Eq implements C3428rb {
    public C3457sb() {
        super("com.google.android.gms.ads.internal.request.IAdResponseListener");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        mo9677a((zzaej) C2324Fq.m9801a(parcel, zzaej.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
