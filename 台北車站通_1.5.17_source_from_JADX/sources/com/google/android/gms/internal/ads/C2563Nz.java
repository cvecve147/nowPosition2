package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Nz */
public abstract class C2563Nz extends C2296Eq implements C2533Mz {
    public C2563Nz() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    /* renamed from: a */
    public static C2533Mz m10778a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return queryLocalInterface instanceof C2533Mz ? (C2533Mz) queryLocalInterface : new C2595Oz(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        IInterface iInterface;
        if (i == 1) {
            iInterface = mo8520g(parcel.readString());
        } else if (i == 2) {
            boolean i3 = mo8521i(parcel.readString());
            parcel2.writeNoException();
            C2324Fq.m9804a(parcel2, i3);
            return true;
        } else if (i != 3) {
            return false;
        } else {
            iInterface = mo8519f(parcel.readString());
        }
        parcel2.writeNoException();
        C2324Fq.m9802a(parcel2, iInterface);
        return true;
    }
}
