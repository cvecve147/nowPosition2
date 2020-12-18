package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C2047a;

/* renamed from: com.google.android.gms.ads.internal.r */
public final class C1797r implements Parcelable.Creator<zzaq> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C2047a.m9004b(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i = 0;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        String str = null;
        float f = 0.0f;
        while (parcel.dataPosition() < b) {
            int a = C2047a.m8999a(parcel);
            switch (C2047a.m8998a(a)) {
                case 2:
                    z = C2047a.m9013h(parcel, a);
                    break;
                case 3:
                    z2 = C2047a.m9013h(parcel, a);
                    break;
                case 4:
                    str = C2047a.m9009d(parcel, a);
                    break;
                case 5:
                    z3 = C2047a.m9013h(parcel, a);
                    break;
                case 6:
                    f = C2047a.m9017l(parcel, a);
                    break;
                case 7:
                    i = C2047a.m9020o(parcel, a);
                    break;
                case 8:
                    z4 = C2047a.m9013h(parcel, a);
                    break;
                case 9:
                    z5 = C2047a.m9013h(parcel, a);
                    break;
                case 10:
                    z6 = C2047a.m9013h(parcel, a);
                    break;
                default:
                    C2047a.m9024s(parcel, a);
                    break;
            }
        }
        C2047a.m9012g(parcel, b);
        return new zzaq(z, z2, str, z3, f, i, z4, z5, z6);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaq[i];
    }
}
