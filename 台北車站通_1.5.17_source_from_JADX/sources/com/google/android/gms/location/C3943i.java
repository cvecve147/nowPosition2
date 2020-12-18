package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C2047a;
import java.util.List;

/* renamed from: com.google.android.gms.location.i */
public final class C3943i implements Parcelable.Creator<LocationResult> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C2047a.m9004b(parcel);
        List<Location> list = LocationResult.f11821a;
        while (parcel.dataPosition() < b) {
            int a = C2047a.m8999a(parcel);
            if (C2047a.m8998a(a) != 1) {
                C2047a.m9024s(parcel, a);
            } else {
                list = C2047a.m9008c(parcel, a, Location.CREATOR);
            }
        }
        C2047a.m9012g(parcel, b);
        return new LocationResult(list);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationResult[i];
    }
}
