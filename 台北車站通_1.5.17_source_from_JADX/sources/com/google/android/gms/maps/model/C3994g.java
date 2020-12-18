package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C2047a;

/* renamed from: com.google.android.gms.maps.model.g */
public final class C3994g implements Parcelable.Creator<LatLng> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C2047a.m9004b(parcel);
        double d = 0.0d;
        double d2 = 0.0d;
        while (parcel.dataPosition() < b) {
            int a = C2047a.m8999a(parcel);
            int a2 = C2047a.m8998a(a);
            if (a2 == 2) {
                d = C2047a.m9015j(parcel, a);
            } else if (a2 != 3) {
                C2047a.m9024s(parcel, a);
            } else {
                d2 = C2047a.m9015j(parcel, a);
            }
        }
        C2047a.m9012g(parcel, b);
        return new LatLng(d, d2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LatLng[i];
    }
}
