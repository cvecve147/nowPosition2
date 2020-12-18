package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Xt */
public final class C2846Xt extends C2267Dq implements C2791Vt {
    C2846Xt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
    }

    public final long getValue() {
        Parcel a = mo8008a(1, mo8007Xa());
        long readLong = a.readLong();
        a.recycle();
        return readLong;
    }
}
