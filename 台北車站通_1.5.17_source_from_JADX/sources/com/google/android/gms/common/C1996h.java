package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C2047a;

/* renamed from: com.google.android.gms.common.h */
public class C1996h implements Parcelable.Creator<GoogleCertificatesQuery> {
    public GoogleCertificatesQuery createFromParcel(Parcel parcel) {
        int b = C2047a.m9004b(parcel);
        String str = null;
        boolean z = false;
        IBinder iBinder = null;
        while (parcel.dataPosition() < b) {
            int a = C2047a.m8999a(parcel);
            int a2 = C2047a.m8998a(a);
            if (a2 == 1) {
                str = C2047a.m9009d(parcel, a);
            } else if (a2 == 2) {
                iBinder = C2047a.m9019n(parcel, a);
            } else if (a2 != 3) {
                C2047a.m9024s(parcel, a);
            } else {
                z = C2047a.m9013h(parcel, a);
            }
        }
        C2047a.m9012g(parcel, b);
        return new GoogleCertificatesQuery(str, iBinder, z);
    }

    public GoogleCertificatesQuery[] newArray(int i) {
        return new GoogleCertificatesQuery[i];
    }
}
