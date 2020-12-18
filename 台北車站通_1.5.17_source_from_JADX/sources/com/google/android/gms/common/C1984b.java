package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C2047a;

/* renamed from: com.google.android.gms.common.b */
public class C1984b implements Parcelable.Creator<ConnectionResult> {
    public ConnectionResult createFromParcel(Parcel parcel) {
        int b = C2047a.m9004b(parcel);
        int i = 0;
        PendingIntent pendingIntent = null;
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = C2047a.m8999a(parcel);
            int a2 = C2047a.m8998a(a);
            if (a2 == 1) {
                i = C2047a.m9020o(parcel, a);
            } else if (a2 == 2) {
                i2 = C2047a.m9020o(parcel, a);
            } else if (a2 == 3) {
                pendingIntent = (PendingIntent) C2047a.m9001a(parcel, a, PendingIntent.CREATOR);
            } else if (a2 != 4) {
                C2047a.m9024s(parcel, a);
            } else {
                str = C2047a.m9009d(parcel, a);
            }
        }
        C2047a.m9012g(parcel, b);
        return new ConnectionResult(i, i2, pendingIntent, str);
    }

    public ConnectionResult[] newArray(int i) {
        return new ConnectionResult[i];
    }
}
