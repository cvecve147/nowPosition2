package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.Mi */
public abstract class C2516Mi extends C2296Eq implements C2486Li {
    /* renamed from: a */
    public static C2486Li m10595a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.omid.IOmid");
        return queryLocalInterface instanceof C2486Li ? (C2486Li) queryLocalInterface : new C2544Ni(iBinder);
    }
}
