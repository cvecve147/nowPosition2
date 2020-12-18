package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C2047a;

/* renamed from: com.google.android.gms.internal.ads.ex */
public final class C3076ex implements Parcelable.Creator<zzsg> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C2047a.m9004b(parcel);
        String str = null;
        String[] strArr = null;
        String[] strArr2 = null;
        while (parcel.dataPosition() < b) {
            int a = C2047a.m8999a(parcel);
            int a2 = C2047a.m8998a(a);
            if (a2 == 1) {
                str = C2047a.m9009d(parcel, a);
            } else if (a2 == 2) {
                strArr = C2047a.m9010e(parcel, a);
            } else if (a2 != 3) {
                C2047a.m9024s(parcel, a);
            } else {
                strArr2 = C2047a.m9010e(parcel, a);
            }
        }
        C2047a.m9012g(parcel, b);
        return new zzsg(str, strArr, strArr2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzsg[i];
    }
}
