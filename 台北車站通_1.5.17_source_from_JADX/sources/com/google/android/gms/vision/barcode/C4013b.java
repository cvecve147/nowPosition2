package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C2047a;
import com.google.android.gms.vision.barcode.Barcode;

/* renamed from: com.google.android.gms.vision.barcode.b */
public final class C4013b implements Parcelable.Creator<Barcode.Address> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C2047a.m9004b(parcel);
        int i = 0;
        String[] strArr = null;
        while (parcel.dataPosition() < b) {
            int a = C2047a.m8999a(parcel);
            int a2 = C2047a.m8998a(a);
            if (a2 == 2) {
                i = C2047a.m9020o(parcel, a);
            } else if (a2 != 3) {
                C2047a.m9024s(parcel, a);
            } else {
                strArr = C2047a.m9010e(parcel, a);
            }
        }
        C2047a.m9012g(parcel, b);
        return new Barcode.Address(i, strArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Barcode.Address[i];
    }
}
