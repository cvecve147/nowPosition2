package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.C2047a;

/* renamed from: com.google.android.gms.common.internal.h */
public class C2029h implements Parcelable.Creator<ConnectionInfo> {
    public ConnectionInfo createFromParcel(Parcel parcel) {
        int b = C2047a.m9004b(parcel);
        Bundle bundle = null;
        Feature[] featureArr = null;
        while (parcel.dataPosition() < b) {
            int a = C2047a.m8999a(parcel);
            int a2 = C2047a.m8998a(a);
            if (a2 == 1) {
                bundle = C2047a.m9000a(parcel, a);
            } else if (a2 != 2) {
                C2047a.m9024s(parcel, a);
            } else {
                featureArr = (Feature[]) C2047a.m9006b(parcel, a, Feature.CREATOR);
            }
        }
        C2047a.m9012g(parcel, b);
        return new ConnectionInfo(bundle, featureArr);
    }

    public ConnectionInfo[] newArray(int i) {
        return new ConnectionInfo[i];
    }
}
