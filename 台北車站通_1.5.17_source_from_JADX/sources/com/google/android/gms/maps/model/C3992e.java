package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C2047a;

/* renamed from: com.google.android.gms.maps.model.e */
public final class C3992e implements Parcelable.Creator<CameraPosition> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C2047a.m9004b(parcel);
        float f = 0.0f;
        LatLng latLng = null;
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (parcel.dataPosition() < b) {
            int a = C2047a.m8999a(parcel);
            int a2 = C2047a.m8998a(a);
            if (a2 == 2) {
                latLng = (LatLng) C2047a.m9001a(parcel, a, LatLng.CREATOR);
            } else if (a2 == 3) {
                f = C2047a.m9017l(parcel, a);
            } else if (a2 == 4) {
                f2 = C2047a.m9017l(parcel, a);
            } else if (a2 != 5) {
                C2047a.m9024s(parcel, a);
            } else {
                f3 = C2047a.m9017l(parcel, a);
            }
        }
        C2047a.m9012g(parcel, b);
        return new CameraPosition(latLng, f, f2, f3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new CameraPosition[i];
    }
}
