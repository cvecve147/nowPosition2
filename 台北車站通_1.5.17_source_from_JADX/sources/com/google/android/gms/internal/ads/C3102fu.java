package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.fu */
public abstract class C3102fu extends C2296Eq implements C3073eu {
    public C3102fu() {
        super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            mo9408Ga();
        } else if (i == 2) {
            mo9409Ia();
        } else if (i == 3) {
            mo9412ha();
        } else if (i == 4) {
            mo9410R();
        } else if (i != 5) {
            return false;
        } else {
            mo9411d(C2324Fq.m9805a(parcel));
        }
        parcel2.writeNoException();
        return true;
    }
}
