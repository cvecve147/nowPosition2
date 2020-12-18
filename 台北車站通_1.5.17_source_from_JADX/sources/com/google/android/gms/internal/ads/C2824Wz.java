package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Wz */
public abstract class C2824Wz extends C2296Eq implements C2797Vz {
    public C2824Wz() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        int Qa = mo7968Qa();
        parcel2.writeNoException();
        parcel2.writeInt(Qa);
        return true;
    }
}
