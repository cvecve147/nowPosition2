package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.C2047a;

/* renamed from: com.google.android.gms.internal.location.d */
public final class C3691d implements Parcelable.Creator<zzad> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C2047a.m9004b(parcel);
        Status status = null;
        while (parcel.dataPosition() < b) {
            int a = C2047a.m8999a(parcel);
            if (C2047a.m8998a(a) != 1) {
                C2047a.m9024s(parcel, a);
            } else {
                status = (Status) C2047a.m9001a(parcel, a, Status.CREATOR);
            }
        }
        C2047a.m9012g(parcel, b);
        return new zzad(status);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzad[i];
    }
}
