package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C2049b;

public final class LatLng extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLng> CREATOR = new C3994g();

    /* renamed from: a */
    public final double f11882a;

    /* renamed from: b */
    public final double f11883b;

    public LatLng(double d, double d2) {
        this.f11883b = (-180.0d > d2 || d2 >= 180.0d) ? ((((d2 - 180.0d) % 360.0d) + 360.0d) % 360.0d) - 180.0d : d2;
        this.f11882a = Math.max(-90.0d, Math.min(90.0d, d));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLng)) {
            return false;
        }
        LatLng latLng = (LatLng) obj;
        return Double.doubleToLongBits(this.f11882a) == Double.doubleToLongBits(latLng.f11882a) && Double.doubleToLongBits(this.f11883b) == Double.doubleToLongBits(latLng.f11883b);
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f11882a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f11883b);
        return ((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) ((doubleToLongBits2 >>> 32) ^ doubleToLongBits2));
    }

    public final String toString() {
        double d = this.f11882a;
        double d2 = this.f11883b;
        StringBuilder sb = new StringBuilder(60);
        sb.append("lat/lng: (");
        sb.append(d);
        sb.append(",");
        sb.append(d2);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C2049b.m9025a(parcel);
        C2049b.m9028a(parcel, 2, this.f11882a);
        C2049b.m9028a(parcel, 3, this.f11883b);
        C2049b.m9026a(parcel, a);
    }
}
