package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.uc */
public abstract class C3515uc extends C2296Eq implements C3486tc {
    public C3515uc() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardItem");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            String type = getType();
            parcel2.writeNoException();
            parcel2.writeString(type);
        } else if (i != 2) {
            return false;
        } else {
            int D = mo9820D();
            parcel2.writeNoException();
            parcel2.writeInt(D);
        }
        return true;
    }
}
