package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C2047a;

/* renamed from: com.google.android.gms.internal.ads.vu */
public final class C3563vu implements Parcelable.Creator<zzmq> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C2047a.m9004b(parcel);
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = C2047a.m8999a(parcel);
            if (C2047a.m8998a(a) != 15) {
                C2047a.m9024s(parcel, a);
            } else {
                str = C2047a.m9009d(parcel, a);
            }
        }
        C2047a.m9012g(parcel, b);
        return new zzmq(str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzmq[i];
    }
}
