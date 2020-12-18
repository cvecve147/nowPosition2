package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C2047a;

/* renamed from: com.google.android.gms.internal.ads.xu */
public final class C3619xu implements Parcelable.Creator<zzmu> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C2047a.m9004b(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < b) {
            int a = C2047a.m8999a(parcel);
            int a2 = C2047a.m8998a(a);
            if (a2 == 2) {
                z = C2047a.m9013h(parcel, a);
            } else if (a2 == 3) {
                z2 = C2047a.m9013h(parcel, a);
            } else if (a2 != 4) {
                C2047a.m9024s(parcel, a);
            } else {
                z3 = C2047a.m9013h(parcel, a);
            }
        }
        C2047a.m9012g(parcel, b);
        return new zzmu(z, z2, z3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzmu[i];
    }
}
