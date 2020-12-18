package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C2049b;

public final class zzc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzc> CREATOR = new C3926c();

    /* renamed from: a */
    public int f11802a;

    public zzc() {
    }

    public zzc(int i) {
        this.f11802a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C2049b.m9025a(parcel);
        C2049b.m9030a(parcel, 2, this.f11802a);
        C2049b.m9026a(parcel, a);
    }
}
