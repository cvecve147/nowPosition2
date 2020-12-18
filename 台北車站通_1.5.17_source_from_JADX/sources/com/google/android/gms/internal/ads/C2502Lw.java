package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.Lw */
public abstract class C2502Lw extends C2296Eq implements C2472Kw {
    /* renamed from: a */
    public static C2472Kw m10567a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
        return queryLocalInterface instanceof C2472Kw ? (C2472Kw) queryLocalInterface : new C2530Mw(iBinder);
    }
}
