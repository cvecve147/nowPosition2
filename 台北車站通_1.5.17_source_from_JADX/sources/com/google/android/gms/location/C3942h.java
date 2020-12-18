package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C2047a;

/* renamed from: com.google.android.gms.location.h */
public final class C3942h implements Parcelable.Creator<LocationRequest> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = C2047a.m9004b(parcel);
        int i = 102;
        long j = 3600000;
        long j2 = 600000;
        boolean z = false;
        long j3 = Long.MAX_VALUE;
        int i2 = Integer.MAX_VALUE;
        float f = 0.0f;
        long j4 = 0;
        while (parcel.dataPosition() < b) {
            int a = C2047a.m8999a(parcel);
            switch (C2047a.m8998a(a)) {
                case 1:
                    i = C2047a.m9020o(parcel2, a);
                    break;
                case 2:
                    j = C2047a.m9021p(parcel2, a);
                    break;
                case 3:
                    j2 = C2047a.m9021p(parcel2, a);
                    break;
                case 4:
                    z = C2047a.m9013h(parcel2, a);
                    break;
                case 5:
                    j3 = C2047a.m9021p(parcel2, a);
                    break;
                case 6:
                    i2 = C2047a.m9020o(parcel2, a);
                    break;
                case 7:
                    f = C2047a.m9017l(parcel2, a);
                    break;
                case 8:
                    j4 = C2047a.m9021p(parcel2, a);
                    break;
                default:
                    C2047a.m9024s(parcel2, a);
                    break;
            }
        }
        C2047a.m9012g(parcel2, b);
        return new LocationRequest(i, j, j2, z, j3, i2, f, j4);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationRequest[i];
    }
}
