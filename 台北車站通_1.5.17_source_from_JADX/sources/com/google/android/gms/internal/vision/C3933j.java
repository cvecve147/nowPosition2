package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C2047a;

/* renamed from: com.google.android.gms.internal.vision.j */
public final class C3933j implements Parcelable.Creator<zzk> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C2047a.m9004b(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        long j = 0;
        while (parcel.dataPosition() < b) {
            int a = C2047a.m8999a(parcel);
            int a2 = C2047a.m8998a(a);
            if (a2 == 2) {
                i = C2047a.m9020o(parcel, a);
            } else if (a2 == 3) {
                i2 = C2047a.m9020o(parcel, a);
            } else if (a2 == 4) {
                i3 = C2047a.m9020o(parcel, a);
            } else if (a2 == 5) {
                j = C2047a.m9021p(parcel, a);
            } else if (a2 != 6) {
                C2047a.m9024s(parcel, a);
            } else {
                i4 = C2047a.m9020o(parcel, a);
            }
        }
        C2047a.m9012g(parcel, b);
        return new zzk(i, i2, i3, j, i4);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzk[i];
    }
}
