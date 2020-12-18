package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Mt */
public abstract class C2527Mt extends C2296Eq implements C2499Lt {
    public C2527Mt() {
        super("com.google.android.gms.ads.internal.client.IAdMetadataListener");
    }

    /* renamed from: a */
    public static C2499Lt m10628a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
        return queryLocalInterface instanceof C2499Lt ? (C2499Lt) queryLocalInterface : new C2557Nt(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        mo8514Wa();
        parcel2.writeNoException();
        return true;
    }
}
