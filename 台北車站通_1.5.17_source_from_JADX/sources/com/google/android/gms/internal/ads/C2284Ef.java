package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C2047a;

/* renamed from: com.google.android.gms.internal.ads.Ef */
public final class C2284Ef implements Parcelable.Creator<zzang> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C2047a.m9004b(parcel);
        int i = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = C2047a.m8999a(parcel);
            int a2 = C2047a.m8998a(a);
            if (a2 == 2) {
                str = C2047a.m9009d(parcel, a);
            } else if (a2 == 3) {
                i = C2047a.m9020o(parcel, a);
            } else if (a2 == 4) {
                i2 = C2047a.m9020o(parcel, a);
            } else if (a2 == 5) {
                z = C2047a.m9013h(parcel, a);
            } else if (a2 != 6) {
                C2047a.m9024s(parcel, a);
            } else {
                z2 = C2047a.m9013h(parcel, a);
            }
        }
        C2047a.m9012g(parcel, b);
        return new zzang(str, i, i2, z, z2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzang[i];
    }
}
