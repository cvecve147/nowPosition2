package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C2047a;

/* renamed from: com.google.android.gms.internal.measurement.J */
public final class C3750J implements Parcelable.Creator<zzer> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C2047a.m9004b(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < b) {
            int a = C2047a.m8999a(parcel);
            if (C2047a.m8998a(a) != 2) {
                C2047a.m9024s(parcel, a);
            } else {
                bundle = C2047a.m9000a(parcel, a);
            }
        }
        C2047a.m9012g(parcel, b);
        return new zzer(bundle);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzer[i];
    }
}
