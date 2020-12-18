package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C2047a;

/* renamed from: com.google.android.gms.internal.vision.c */
public final class C3926c implements Parcelable.Creator<zzc> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C2047a.m9004b(parcel);
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = C2047a.m8999a(parcel);
            if (C2047a.m8998a(a) != 2) {
                C2047a.m9024s(parcel, a);
            } else {
                i = C2047a.m9020o(parcel, a);
            }
        }
        C2047a.m9012g(parcel, b);
        return new zzc(i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzc[i];
    }
}
