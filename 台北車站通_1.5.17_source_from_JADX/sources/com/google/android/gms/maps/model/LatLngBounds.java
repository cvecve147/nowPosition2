package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C2059x;
import com.google.android.gms.common.internal.C2061y;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C2049b;

public final class LatLngBounds extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLngBounds> CREATOR = new C3993f();

    /* renamed from: a */
    public final LatLng f11884a;

    /* renamed from: b */
    public final LatLng f11885b;

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        C2061y.m9068a(latLng, (Object) "null southwest");
        C2061y.m9068a(latLng2, (Object) "null northeast");
        C2061y.m9075a(latLng2.f11882a >= latLng.f11882a, "southern latitude exceeds northern latitude (%s > %s)", Double.valueOf(latLng.f11882a), Double.valueOf(latLng2.f11882a));
        this.f11884a = latLng;
        this.f11885b = latLng2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        return this.f11884a.equals(latLngBounds.f11884a) && this.f11885b.equals(latLngBounds.f11885b);
    }

    public final int hashCode() {
        return C2059x.m9062a(this.f11884a, this.f11885b);
    }

    public final String toString() {
        C2059x.C2060a a = C2059x.m9063a((Object) this);
        a.mo7711a("southwest", this.f11884a);
        a.mo7711a("northeast", this.f11885b);
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C2049b.m9025a(parcel);
        C2049b.m9034a(parcel, 2, (Parcelable) this.f11884a, i, false);
        C2049b.m9034a(parcel, 3, (Parcelable) this.f11885b, i, false);
        C2049b.m9026a(parcel, a);
    }
}
