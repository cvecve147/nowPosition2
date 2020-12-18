package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Xz */
public final class C2852Xz extends C2267Dq implements C2797Vz {
    C2852Xz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
    }

    /* renamed from: Qa */
    public final int mo7968Qa() {
        Parcel a = mo8008a(1, mo8007Xa());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }
}
