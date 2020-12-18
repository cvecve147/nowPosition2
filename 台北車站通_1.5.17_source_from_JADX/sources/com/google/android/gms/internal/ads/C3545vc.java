package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.vc */
public final class C3545vc extends C2267Dq implements C3486tc {
    C3545vc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardItem");
    }

    /* renamed from: D */
    public final int mo9820D() {
        Parcel a = mo8008a(2, mo8007Xa());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    public final String getType() {
        Parcel a = mo8008a(1, mo8007Xa());
        String readString = a.readString();
        a.recycle();
        return readString;
    }
}
