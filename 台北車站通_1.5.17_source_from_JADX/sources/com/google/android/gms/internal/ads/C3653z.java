package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.z */
public final class C3653z extends C2296Eq implements C3625y {
    /* renamed from: a */
    public static C3625y m14677a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
        return queryLocalInterface instanceof C3625y ? (C3625y) queryLocalInterface : new C2163A(iBinder);
    }
}
