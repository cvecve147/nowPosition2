package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C2047a;

/* renamed from: com.google.android.gms.internal.ads.Ri */
public final class C2663Ri implements Parcelable.Creator<zzatt> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C2047a.m9004b(parcel);
        String str = null;
        int i = 0;
        String str2 = null;
        while (parcel.dataPosition() < b) {
            int a = C2047a.m8999a(parcel);
            int a2 = C2047a.m8998a(a);
            if (a2 == 1) {
                i = C2047a.m9020o(parcel, a);
            } else if (a2 == 2) {
                str = C2047a.m9009d(parcel, a);
            } else if (a2 != 3) {
                C2047a.m9024s(parcel, a);
            } else {
                str2 = C2047a.m9009d(parcel, a);
            }
        }
        C2047a.m9012g(parcel, b);
        return new zzatt(i, str, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzatt[i];
    }
}
