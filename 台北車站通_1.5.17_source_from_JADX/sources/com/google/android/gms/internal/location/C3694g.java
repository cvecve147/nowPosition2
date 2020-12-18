package com.google.android.gms.internal.location;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.location.g */
public abstract class C3694g extends C3706s implements C3693f {
    public C3694g() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo10340a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        mo10337a((zzad) C3712y.m14831a(parcel, zzad.CREATOR));
        return true;
    }
}
