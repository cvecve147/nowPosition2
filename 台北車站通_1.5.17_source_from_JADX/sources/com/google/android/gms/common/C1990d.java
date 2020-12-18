package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C2047a;

/* renamed from: com.google.android.gms.common.d */
public class C1990d implements Parcelable.Creator<Feature> {
    public Feature createFromParcel(Parcel parcel) {
        int b = C2047a.m9004b(parcel);
        String str = null;
        int i = 0;
        long j = -1;
        while (parcel.dataPosition() < b) {
            int a = C2047a.m8999a(parcel);
            int a2 = C2047a.m8998a(a);
            if (a2 == 1) {
                str = C2047a.m9009d(parcel, a);
            } else if (a2 == 2) {
                i = C2047a.m9020o(parcel, a);
            } else if (a2 != 3) {
                C2047a.m9024s(parcel, a);
            } else {
                j = C2047a.m9021p(parcel, a);
            }
        }
        C2047a.m9012g(parcel, b);
        return new Feature(str, i, j);
    }

    public Feature[] newArray(int i) {
        return new Feature[i];
    }
}
