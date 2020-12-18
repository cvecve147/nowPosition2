package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C2047a;

/* renamed from: com.google.android.gms.internal.ads.Si */
public final class C2694Si implements Parcelable.Creator<zzatv> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C2047a.m9004b(parcel);
        int i = 0;
        byte[] bArr = null;
        while (parcel.dataPosition() < b) {
            int a = C2047a.m8999a(parcel);
            int a2 = C2047a.m8998a(a);
            if (a2 == 1) {
                i = C2047a.m9020o(parcel, a);
            } else if (a2 != 2) {
                C2047a.m9024s(parcel, a);
            } else {
                bArr = C2047a.m9005b(parcel, a);
            }
        }
        C2047a.m9012g(parcel, b);
        return new zzatv(i, bArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzatv[i];
    }
}
