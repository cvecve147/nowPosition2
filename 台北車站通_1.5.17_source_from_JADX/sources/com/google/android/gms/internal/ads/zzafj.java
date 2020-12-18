package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C2049b;

@C2478La
public final class zzafj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzafj> CREATOR = new C2423Jb();

    /* renamed from: a */
    String f10842a;

    public zzafj(String str) {
        this.f10842a = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C2049b.m9025a(parcel);
        C2049b.m9038a(parcel, 2, this.f10842a, false);
        C2049b.m9026a(parcel, a);
    }
}
