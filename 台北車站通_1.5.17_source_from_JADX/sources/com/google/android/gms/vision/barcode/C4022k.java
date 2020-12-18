package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C2047a;
import com.google.android.gms.vision.barcode.Barcode;

/* renamed from: com.google.android.gms.vision.barcode.k */
public final class C4022k implements Parcelable.Creator<Barcode.PersonName> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C2047a.m9004b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        while (parcel.dataPosition() < b) {
            int a = C2047a.m8999a(parcel);
            switch (C2047a.m8998a(a)) {
                case 2:
                    str = C2047a.m9009d(parcel, a);
                    break;
                case 3:
                    str2 = C2047a.m9009d(parcel, a);
                    break;
                case 4:
                    str3 = C2047a.m9009d(parcel, a);
                    break;
                case 5:
                    str4 = C2047a.m9009d(parcel, a);
                    break;
                case 6:
                    str5 = C2047a.m9009d(parcel, a);
                    break;
                case 7:
                    str6 = C2047a.m9009d(parcel, a);
                    break;
                case 8:
                    str7 = C2047a.m9009d(parcel, a);
                    break;
                default:
                    C2047a.m9024s(parcel, a);
                    break;
            }
        }
        C2047a.m9012g(parcel, b);
        return new Barcode.PersonName(str, str2, str3, str4, str5, str6, str7);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Barcode.PersonName[i];
    }
}
