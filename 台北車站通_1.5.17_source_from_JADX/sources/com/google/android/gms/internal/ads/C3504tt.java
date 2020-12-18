package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.tt */
public abstract class C3504tt extends C2296Eq implements C3475st {
    public C3504tt() {
        super("com.google.android.gms.ads.internal.client.IAdClickListener");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        mo8018f();
        parcel2.writeNoException();
        return true;
    }
}
