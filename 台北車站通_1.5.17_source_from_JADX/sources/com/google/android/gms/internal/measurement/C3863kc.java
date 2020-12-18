package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C2047a;

/* renamed from: com.google.android.gms.internal.measurement.kc */
public final class C3863kc implements Parcelable.Creator<zzjx> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = C2047a.m9004b(parcel);
        String str = null;
        Long l = null;
        Float f = null;
        String str2 = null;
        String str3 = null;
        Double d = null;
        int i = 0;
        long j = 0;
        while (parcel.dataPosition() < b) {
            int a = C2047a.m8999a(parcel);
            switch (C2047a.m8998a(a)) {
                case 1:
                    i = C2047a.m9020o(parcel2, a);
                    break;
                case 2:
                    str = C2047a.m9009d(parcel2, a);
                    break;
                case 3:
                    j = C2047a.m9021p(parcel2, a);
                    break;
                case 4:
                    l = C2047a.m9022q(parcel2, a);
                    break;
                case 5:
                    f = C2047a.m9018m(parcel2, a);
                    break;
                case 6:
                    str2 = C2047a.m9009d(parcel2, a);
                    break;
                case 7:
                    str3 = C2047a.m9009d(parcel2, a);
                    break;
                case 8:
                    d = C2047a.m9016k(parcel2, a);
                    break;
                default:
                    C2047a.m9024s(parcel2, a);
                    break;
            }
        }
        C2047a.m9012g(parcel2, b);
        return new zzjx(i, str, j, l, f, str2, str3, d);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzjx[i];
    }
}
