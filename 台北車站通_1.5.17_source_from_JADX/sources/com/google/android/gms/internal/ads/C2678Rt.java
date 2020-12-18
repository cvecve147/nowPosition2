package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Rt */
public final class C2678Rt extends C2267Dq implements C2620Pt {
    C2678Rt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    /* renamed from: a */
    public final void mo8698a(String str, String str2) {
        Parcel Xa = mo8007Xa();
        Xa.writeString(str);
        Xa.writeString(str2);
        mo8010b(1, Xa);
    }
}
