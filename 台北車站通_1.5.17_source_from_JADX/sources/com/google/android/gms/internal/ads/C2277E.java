package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.E */
public final class C2277E extends C2296Eq implements C2249D {
    /* renamed from: a */
    public static C2249D m9684a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
        return queryLocalInterface instanceof C2249D ? (C2249D) queryLocalInterface : new C2306F(iBinder);
    }
}
