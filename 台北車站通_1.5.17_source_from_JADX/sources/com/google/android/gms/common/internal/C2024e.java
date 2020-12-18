package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C2047a;

/* renamed from: com.google.android.gms.common.internal.e */
public class C2024e implements Parcelable.Creator<ClientIdentity> {
    public ClientIdentity createFromParcel(Parcel parcel) {
        int b = C2047a.m9004b(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = C2047a.m8999a(parcel);
            int a2 = C2047a.m8998a(a);
            if (a2 == 1) {
                i = C2047a.m9020o(parcel, a);
            } else if (a2 != 2) {
                C2047a.m9024s(parcel, a);
            } else {
                str = C2047a.m9009d(parcel, a);
            }
        }
        C2047a.m9012g(parcel, b);
        return new ClientIdentity(i, str);
    }

    public ClientIdentity[] newArray(int i) {
        return new ClientIdentity[i];
    }
}
