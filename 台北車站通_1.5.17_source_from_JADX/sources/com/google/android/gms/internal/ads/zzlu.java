package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C2049b;

@C2478La
public final class zzlu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzlu> CREATOR = new C3158hu();

    /* renamed from: a */
    public final int f10903a;

    public zzlu(int i) {
        this.f10903a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C2049b.m9025a(parcel);
        C2049b.m9030a(parcel, 2, this.f10903a);
        C2049b.m9026a(parcel, a);
    }
}
