package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C2047a;

/* renamed from: com.google.android.gms.location.k */
public final class C3945k implements Parcelable.Creator<zzaj> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C2047a.m9004b(parcel);
        long j = -1;
        long j2 = -1;
        int i = 1;
        int i2 = 1;
        while (parcel.dataPosition() < b) {
            int a = C2047a.m8999a(parcel);
            int a2 = C2047a.m8998a(a);
            if (a2 == 1) {
                i = C2047a.m9020o(parcel, a);
            } else if (a2 == 2) {
                i2 = C2047a.m9020o(parcel, a);
            } else if (a2 == 3) {
                j = C2047a.m9021p(parcel, a);
            } else if (a2 != 4) {
                C2047a.m9024s(parcel, a);
            } else {
                j2 = C2047a.m9021p(parcel, a);
            }
        }
        C2047a.m9012g(parcel, b);
        return new zzaj(i, i2, j, j2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaj[i];
    }
}
