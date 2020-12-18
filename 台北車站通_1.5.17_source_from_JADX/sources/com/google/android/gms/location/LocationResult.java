package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C2049b;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class LocationResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationResult> CREATOR = new C3943i();

    /* renamed from: a */
    static final List<Location> f11821a = Collections.emptyList();

    /* renamed from: b */
    private final List<Location> f11822b;

    LocationResult(List<Location> list) {
        this.f11822b = list;
    }

    /* renamed from: b */
    public final List<Location> mo11149b() {
        return this.f11822b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationResult)) {
            return false;
        }
        LocationResult locationResult = (LocationResult) obj;
        if (locationResult.f11822b.size() != this.f11822b.size()) {
            return false;
        }
        Iterator<Location> it = this.f11822b.iterator();
        for (Location time : locationResult.f11822b) {
            if (it.next().getTime() != time.getTime()) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 17;
        for (Location time : this.f11822b) {
            long time2 = time.getTime();
            i = (i * 31) + ((int) (time2 ^ (time2 >>> 32)));
        }
        return i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f11822b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("LocationResult[locations: ");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C2049b.m9025a(parcel);
        C2049b.m9049c(parcel, 1, mo11149b(), false);
        C2049b.m9026a(parcel, a);
    }
}
