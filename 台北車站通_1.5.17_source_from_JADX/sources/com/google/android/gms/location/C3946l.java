package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C2047a;

/* renamed from: com.google.android.gms.location.l */
public final class C3946l implements Parcelable.Creator<zzj> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = C2047a.m9004b(parcel);
        boolean z = true;
        long j = 50;
        float f = 0.0f;
        long j2 = Long.MAX_VALUE;
        int i = Integer.MAX_VALUE;
        while (parcel.dataPosition() < b) {
            int a = C2047a.m8999a(parcel);
            int a2 = C2047a.m8998a(a);
            if (a2 == 1) {
                z = C2047a.m9013h(parcel2, a);
            } else if (a2 == 2) {
                j = C2047a.m9021p(parcel2, a);
            } else if (a2 == 3) {
                f = C2047a.m9017l(parcel2, a);
            } else if (a2 == 4) {
                j2 = C2047a.m9021p(parcel2, a);
            } else if (a2 != 5) {
                C2047a.m9024s(parcel2, a);
            } else {
                i = C2047a.m9020o(parcel2, a);
            }
        }
        C2047a.m9012g(parcel2, b);
        return new zzj(z, j, f, j2, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzj[i];
    }
}
