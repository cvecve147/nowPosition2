package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C2047a;

/* renamed from: com.google.android.gms.signin.internal.a */
public class C4001a implements Parcelable.Creator<AuthAccountResult> {
    public AuthAccountResult createFromParcel(Parcel parcel) {
        int b = C2047a.m9004b(parcel);
        int i = 0;
        Intent intent = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = C2047a.m8999a(parcel);
            int a2 = C2047a.m8998a(a);
            if (a2 == 1) {
                i = C2047a.m9020o(parcel, a);
            } else if (a2 == 2) {
                i2 = C2047a.m9020o(parcel, a);
            } else if (a2 != 3) {
                C2047a.m9024s(parcel, a);
            } else {
                intent = (Intent) C2047a.m9001a(parcel, a, Intent.CREATOR);
            }
        }
        C2047a.m9012g(parcel, b);
        return new AuthAccountResult(i, i2, intent);
    }

    public AuthAccountResult[] newArray(int i) {
        return new AuthAccountResult[i];
    }
}
