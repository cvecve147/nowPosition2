package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.Iq */
public abstract class C2410Iq extends C2296Eq implements C2382Hq {
    /* renamed from: a */
    public static C2382Hq m10317a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.clearcut.IClearcut");
        return queryLocalInterface instanceof C2382Hq ? (C2382Hq) queryLocalInterface : new C2438Jq(iBinder);
    }
}
