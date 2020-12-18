package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C2047a;
import com.google.android.gms.vision.barcode.Barcode;

/* renamed from: com.google.android.gms.vision.barcode.j */
public final class C4021j implements Parcelable.Creator<Barcode.GeoPoint> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C2047a.m9004b(parcel);
        double d = 0.0d;
        double d2 = 0.0d;
        while (parcel.dataPosition() < b) {
            int a = C2047a.m8999a(parcel);
            int a2 = C2047a.m8998a(a);
            if (a2 == 2) {
                d = C2047a.m9015j(parcel, a);
            } else if (a2 != 3) {
                C2047a.m9024s(parcel, a);
            } else {
                d2 = C2047a.m9015j(parcel, a);
            }
        }
        C2047a.m9012g(parcel, b);
        return new Barcode.GeoPoint(d, d2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Barcode.GeoPoint[i];
    }
}
