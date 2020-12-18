package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C2049b;

@C2478La
public final class zzzt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzzt> CREATOR = new C2421JA();

    /* renamed from: a */
    private final int f10925a;

    /* renamed from: b */
    private final int f10926b;

    /* renamed from: c */
    private final int f10927c;

    zzzt(int i, int i2, int i3) {
        this.f10925a = i;
        this.f10926b = i2;
        this.f10927c = i3;
    }

    /* renamed from: a */
    public static zzzt m14782a(C2458Ki ki) {
        return new zzzt(ki.f7459a, ki.f7460b, ki.f7461c);
    }

    public final String toString() {
        int i = this.f10925a;
        int i2 = this.f10926b;
        int i3 = this.f10927c;
        StringBuilder sb = new StringBuilder(35);
        sb.append(i);
        sb.append(".");
        sb.append(i2);
        sb.append(".");
        sb.append(i3);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C2049b.m9025a(parcel);
        C2049b.m9030a(parcel, 1, this.f10925a);
        C2049b.m9030a(parcel, 2, this.f10926b);
        C2049b.m9030a(parcel, 3, this.f10927c);
        C2049b.m9026a(parcel, a);
    }
}
