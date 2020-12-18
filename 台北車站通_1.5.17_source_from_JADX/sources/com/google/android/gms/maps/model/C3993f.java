package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C2047a;

/* renamed from: com.google.android.gms.maps.model.f */
public final class C3993f implements Parcelable.Creator<LatLngBounds> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C2047a.m9004b(parcel);
        LatLng latLng = null;
        LatLng latLng2 = null;
        while (parcel.dataPosition() < b) {
            int a = C2047a.m8999a(parcel);
            int a2 = C2047a.m8998a(a);
            if (a2 == 2) {
                latLng = (LatLng) C2047a.m9001a(parcel, a, LatLng.CREATOR);
            } else if (a2 != 3) {
                C2047a.m9024s(parcel, a);
            } else {
                latLng2 = (LatLng) C2047a.m9001a(parcel, a, LatLng.CREATOR);
            }
        }
        C2047a.m9012g(parcel, b);
        return new LatLngBounds(latLng, latLng2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LatLngBounds[i];
    }
}
