package com.google.android.gms.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.location.C3706s;
import com.google.android.gms.internal.location.C3712y;

/* renamed from: com.google.android.gms.location.q */
public abstract class C3951q extends C3706s implements C3950p {
    /* renamed from: a */
    public static C3950p m15996a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
        return queryLocalInterface instanceof C3950p ? (C3950p) queryLocalInterface : new C3952r(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo10340a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            mo10352a((LocationResult) C3712y.m14831a(parcel, LocationResult.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            mo10351a((LocationAvailability) C3712y.m14831a(parcel, LocationAvailability.CREATOR));
        }
        return true;
    }
}
