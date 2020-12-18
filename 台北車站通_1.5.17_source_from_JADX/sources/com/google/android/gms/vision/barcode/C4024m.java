package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C2047a;
import com.google.android.gms.vision.barcode.Barcode;

/* renamed from: com.google.android.gms.vision.barcode.m */
public final class C4024m implements Parcelable.Creator<Barcode.Sms> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C2047a.m9004b(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < b) {
            int a = C2047a.m8999a(parcel);
            int a2 = C2047a.m8998a(a);
            if (a2 == 2) {
                str = C2047a.m9009d(parcel, a);
            } else if (a2 != 3) {
                C2047a.m9024s(parcel, a);
            } else {
                str2 = C2047a.m9009d(parcel, a);
            }
        }
        C2047a.m9012g(parcel, b);
        return new Barcode.Sms(str, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Barcode.Sms[i];
    }
}
