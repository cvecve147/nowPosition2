package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C2047a;

/* renamed from: com.google.android.gms.internal.ads.xb */
public final class C3600xb implements Parcelable.Creator<zzaev> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C2047a.m9004b(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < b) {
            int a = C2047a.m8999a(parcel);
            if (C2047a.m8998a(a) != 2) {
                C2047a.m9024s(parcel, a);
            } else {
                parcelFileDescriptor = (ParcelFileDescriptor) C2047a.m9001a(parcel, a, ParcelFileDescriptor.CREATOR);
            }
        }
        C2047a.m9012g(parcel, b);
        return new zzaev(parcelFileDescriptor);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaev[i];
    }
}
