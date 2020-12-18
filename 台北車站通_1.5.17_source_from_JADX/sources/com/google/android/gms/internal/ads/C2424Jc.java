package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C2047a;

/* renamed from: com.google.android.gms.internal.ads.Jc */
public final class C2424Jc implements Parcelable.Creator<zzahk> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C2047a.m9004b(parcel);
        zzjj zzjj = null;
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = C2047a.m8999a(parcel);
            int a2 = C2047a.m8998a(a);
            if (a2 == 2) {
                zzjj = (zzjj) C2047a.m9001a(parcel, a, zzjj.CREATOR);
            } else if (a2 != 3) {
                C2047a.m9024s(parcel, a);
            } else {
                str = C2047a.m9009d(parcel, a);
            }
        }
        C2047a.m9012g(parcel, b);
        return new zzahk(zzjj, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzahk[i];
    }
}
