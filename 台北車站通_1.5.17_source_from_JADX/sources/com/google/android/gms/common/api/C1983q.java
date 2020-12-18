package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C2047a;

/* renamed from: com.google.android.gms.common.api.q */
public final class C1983q implements Parcelable.Creator<Status> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C2047a.m9004b(parcel);
        int i = 0;
        String str = null;
        PendingIntent pendingIntent = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = C2047a.m8999a(parcel);
            int a2 = C2047a.m8998a(a);
            if (a2 == 1) {
                i2 = C2047a.m9020o(parcel, a);
            } else if (a2 == 2) {
                str = C2047a.m9009d(parcel, a);
            } else if (a2 == 3) {
                pendingIntent = (PendingIntent) C2047a.m9001a(parcel, a, PendingIntent.CREATOR);
            } else if (a2 != 1000) {
                C2047a.m9024s(parcel, a);
            } else {
                i = C2047a.m9020o(parcel, a);
            }
        }
        C2047a.m9012g(parcel, b);
        return new Status(i, i2, str, pendingIntent);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Status[i];
    }
}
