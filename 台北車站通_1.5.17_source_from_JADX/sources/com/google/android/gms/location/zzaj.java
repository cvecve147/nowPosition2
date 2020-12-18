package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C2059x;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C2049b;

public final class zzaj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaj> CREATOR = new C3945k();

    /* renamed from: a */
    private final int f11829a;

    /* renamed from: b */
    private final int f11830b;

    /* renamed from: c */
    private final long f11831c;

    /* renamed from: d */
    private final long f11832d;

    zzaj(int i, int i2, long j, long j2) {
        this.f11829a = i;
        this.f11830b = i2;
        this.f11831c = j;
        this.f11832d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaj.class == obj.getClass()) {
            zzaj zzaj = (zzaj) obj;
            return this.f11829a == zzaj.f11829a && this.f11830b == zzaj.f11830b && this.f11831c == zzaj.f11831c && this.f11832d == zzaj.f11832d;
        }
    }

    public final int hashCode() {
        return C2059x.m9062a(Integer.valueOf(this.f11830b), Integer.valueOf(this.f11829a), Long.valueOf(this.f11832d), Long.valueOf(this.f11831c));
    }

    public final String toString() {
        return "NetworkLocationStatus:" + " Wifi status: " + this.f11829a + " Cell status: " + this.f11830b + " elapsed time NS: " + this.f11832d + " system time ms: " + this.f11831c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C2049b.m9025a(parcel);
        C2049b.m9030a(parcel, 1, this.f11829a);
        C2049b.m9030a(parcel, 2, this.f11830b);
        C2049b.m9031a(parcel, 3, this.f11831c);
        C2049b.m9031a(parcel, 4, this.f11832d);
        C2049b.m9026a(parcel, a);
    }
}
