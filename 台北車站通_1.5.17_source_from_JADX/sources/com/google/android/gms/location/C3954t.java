package com.google.android.gms.location;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.location.C3706s;
import com.google.android.gms.internal.location.C3712y;

/* renamed from: com.google.android.gms.location.t */
public abstract class C3954t extends C3706s implements C3953s {
    public C3954t() {
        super("com.google.android.gms.location.ILocationListener");
    }

    /* renamed from: a */
    public static C3953s m15998a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
        return queryLocalInterface instanceof C3953s ? (C3953s) queryLocalInterface : new C3955u(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo10340a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        onLocationChanged((Location) C3712y.m14831a(parcel, Location.CREATOR));
        return true;
    }
}
