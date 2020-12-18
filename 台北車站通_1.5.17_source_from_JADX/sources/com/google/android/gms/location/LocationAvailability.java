package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C2059x;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C2049b;
import java.util.Arrays;

public final class LocationAvailability extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new C3941g();
    @Deprecated

    /* renamed from: a */
    private int f11808a;
    @Deprecated

    /* renamed from: b */
    private int f11809b;

    /* renamed from: c */
    private long f11810c;

    /* renamed from: d */
    private int f11811d;

    /* renamed from: e */
    private zzaj[] f11812e;

    LocationAvailability(int i, int i2, int i3, long j, zzaj[] zzajArr) {
        this.f11811d = i;
        this.f11808a = i2;
        this.f11809b = i3;
        this.f11810c = j;
        this.f11812e = zzajArr;
    }

    /* renamed from: b */
    public final boolean mo11135b() {
        return this.f11811d < 1000;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && LocationAvailability.class == obj.getClass()) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            return this.f11808a == locationAvailability.f11808a && this.f11809b == locationAvailability.f11809b && this.f11810c == locationAvailability.f11810c && this.f11811d == locationAvailability.f11811d && Arrays.equals(this.f11812e, locationAvailability.f11812e);
        }
    }

    public final int hashCode() {
        return C2059x.m9062a(Integer.valueOf(this.f11811d), Integer.valueOf(this.f11808a), Integer.valueOf(this.f11809b), Long.valueOf(this.f11810c), this.f11812e);
    }

    public final String toString() {
        boolean b = mo11135b();
        StringBuilder sb = new StringBuilder(48);
        sb.append("LocationAvailability[isLocationAvailable: ");
        sb.append(b);
        sb.append("]");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C2049b.m9025a(parcel);
        C2049b.m9030a(parcel, 1, this.f11808a);
        C2049b.m9030a(parcel, 2, this.f11809b);
        C2049b.m9031a(parcel, 3, this.f11810c);
        C2049b.m9030a(parcel, 4, this.f11811d);
        C2049b.m9042a(parcel, 5, (T[]) this.f11812e, i, false);
        C2049b.m9026a(parcel, a);
    }
}
