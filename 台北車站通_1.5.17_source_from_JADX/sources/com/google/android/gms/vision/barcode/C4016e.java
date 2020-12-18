package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C2047a;
import com.google.android.gms.vision.barcode.Barcode;

/* renamed from: com.google.android.gms.vision.barcode.e */
public final class C4016e implements Parcelable.Creator<Barcode.CalendarDateTime> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C2047a.m9004b(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        boolean z = false;
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = C2047a.m8999a(parcel);
            switch (C2047a.m8998a(a)) {
                case 2:
                    i = C2047a.m9020o(parcel, a);
                    break;
                case 3:
                    i2 = C2047a.m9020o(parcel, a);
                    break;
                case 4:
                    i3 = C2047a.m9020o(parcel, a);
                    break;
                case 5:
                    i4 = C2047a.m9020o(parcel, a);
                    break;
                case 6:
                    i5 = C2047a.m9020o(parcel, a);
                    break;
                case 7:
                    i6 = C2047a.m9020o(parcel, a);
                    break;
                case 8:
                    z = C2047a.m9013h(parcel, a);
                    break;
                case 9:
                    str = C2047a.m9009d(parcel, a);
                    break;
                default:
                    C2047a.m9024s(parcel, a);
                    break;
            }
        }
        C2047a.m9012g(parcel, b);
        return new Barcode.CalendarDateTime(i, i2, i3, i4, i5, i6, z, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Barcode.CalendarDateTime[i];
    }
}
