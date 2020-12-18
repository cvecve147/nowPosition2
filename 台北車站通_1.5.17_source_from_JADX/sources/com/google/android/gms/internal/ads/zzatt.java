package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C2049b;

public final class zzatt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzatt> CREATOR = new C2663Ri();

    /* renamed from: a */
    private final int f10860a;

    /* renamed from: b */
    private final String f10861b;

    /* renamed from: c */
    private final String f10862c;

    zzatt(int i, String str, String str2) {
        this.f10860a = i;
        this.f10861b = str;
        this.f10862c = str2;
    }

    public zzatt(String str, String str2) {
        this(1, str, str2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C2049b.m9025a(parcel);
        C2049b.m9030a(parcel, 1, this.f10860a);
        C2049b.m9038a(parcel, 2, this.f10861b, false);
        C2049b.m9038a(parcel, 3, this.f10862c, false);
        C2049b.m9026a(parcel, a);
    }
}
