package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Qt */
public abstract class C2648Qt extends C2296Eq implements C2620Pt {
    public C2648Qt() {
        super("com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    /* renamed from: a */
    public static C2620Pt m11004a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
        return queryLocalInterface instanceof C2620Pt ? (C2620Pt) queryLocalInterface : new C2678Rt(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        mo8698a(parcel.readString(), parcel.readString());
        parcel2.writeNoException();
        return true;
    }
}
