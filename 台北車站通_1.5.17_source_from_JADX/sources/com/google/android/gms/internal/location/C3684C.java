package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C2047a;

/* renamed from: com.google.android.gms.internal.location.C */
public final class C3684C implements Parcelable.Creator<zzo> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C2047a.m9004b(parcel);
        zzm zzm = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        int i = 1;
        while (parcel.dataPosition() < b) {
            int a = C2047a.m8999a(parcel);
            int a2 = C2047a.m8998a(a);
            if (a2 == 1) {
                i = C2047a.m9020o(parcel, a);
            } else if (a2 == 2) {
                zzm = (zzm) C2047a.m9001a(parcel, a, zzm.CREATOR);
            } else if (a2 == 3) {
                iBinder = C2047a.m9019n(parcel, a);
            } else if (a2 != 4) {
                C2047a.m9024s(parcel, a);
            } else {
                iBinder2 = C2047a.m9019n(parcel, a);
            }
        }
        C2047a.m9012g(parcel, b);
        return new zzo(i, zzm, iBinder, iBinder2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzo[i];
    }
}
