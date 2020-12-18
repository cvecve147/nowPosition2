package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C2047a;

/* renamed from: com.google.android.gms.internal.measurement.s */
public final class C3892s implements Parcelable.Creator<zzdz> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = C2047a.m9004b(parcel);
        boolean z = false;
        int i = 0;
        boolean z2 = false;
        boolean z3 = true;
        boolean z4 = true;
        boolean z5 = true;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        long j5 = -2147483648L;
        while (parcel.dataPosition() < b) {
            int a = C2047a.m8999a(parcel);
            switch (C2047a.m8998a(a)) {
                case 2:
                    str = C2047a.m9009d(parcel2, a);
                    break;
                case 3:
                    str2 = C2047a.m9009d(parcel2, a);
                    break;
                case 4:
                    str3 = C2047a.m9009d(parcel2, a);
                    break;
                case 5:
                    str4 = C2047a.m9009d(parcel2, a);
                    break;
                case 6:
                    j = C2047a.m9021p(parcel2, a);
                    break;
                case 7:
                    j2 = C2047a.m9021p(parcel2, a);
                    break;
                case 8:
                    str5 = C2047a.m9009d(parcel2, a);
                    break;
                case 9:
                    z3 = C2047a.m9013h(parcel2, a);
                    break;
                case 10:
                    z = C2047a.m9013h(parcel2, a);
                    break;
                case 11:
                    j5 = C2047a.m9021p(parcel2, a);
                    break;
                case 12:
                    str6 = C2047a.m9009d(parcel2, a);
                    break;
                case 13:
                    j3 = C2047a.m9021p(parcel2, a);
                    break;
                case 14:
                    j4 = C2047a.m9021p(parcel2, a);
                    break;
                case 15:
                    i = C2047a.m9020o(parcel2, a);
                    break;
                case 16:
                    z4 = C2047a.m9013h(parcel2, a);
                    break;
                case 17:
                    z5 = C2047a.m9013h(parcel2, a);
                    break;
                case 18:
                    z2 = C2047a.m9013h(parcel2, a);
                    break;
                default:
                    C2047a.m9024s(parcel2, a);
                    break;
            }
        }
        C2047a.m9012g(parcel2, b);
        return new zzdz(str, str2, str3, str4, j, j2, str5, z3, z, j5, str6, j3, j4, i, z4, z5, z2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzdz[i];
    }
}
