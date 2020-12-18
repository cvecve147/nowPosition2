package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C2049b;

@C2478La
public final class zzahk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzahk> CREATOR = new C2424Jc();

    /* renamed from: a */
    public final zzjj f10843a;

    /* renamed from: b */
    public final String f10844b;

    public zzahk(zzjj zzjj, String str) {
        this.f10843a = zzjj;
        this.f10844b = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C2049b.m9025a(parcel);
        C2049b.m9034a(parcel, 2, (Parcelable) this.f10843a, i, false);
        C2049b.m9038a(parcel, 3, this.f10844b, false);
        C2049b.m9026a(parcel, a);
    }
}
