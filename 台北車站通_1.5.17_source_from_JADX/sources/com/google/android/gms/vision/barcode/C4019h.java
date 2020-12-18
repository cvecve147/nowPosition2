package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C2047a;
import com.google.android.gms.vision.barcode.Barcode;

/* renamed from: com.google.android.gms.vision.barcode.h */
public final class C4019h implements Parcelable.Creator<Barcode.DriverLicense> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = C2047a.m9004b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        while (parcel.dataPosition() < b) {
            int a = C2047a.m8999a(parcel);
            switch (C2047a.m8998a(a)) {
                case 2:
                    str = C2047a.m9009d(parcel2, a);
                    break;
                case 3:
                    str2 = C2047a.m9009d(parcel2, a);
                    break;
                case 4:
                    str3 = C2047a.m9009d(parcel2, a);
                    break;
                case 5:
                    str4 = C2047a.m9009d(parcel2, a);
                    break;
                case 6:
                    str5 = C2047a.m9009d(parcel2, a);
                    break;
                case 7:
                    str6 = C2047a.m9009d(parcel2, a);
                    break;
                case 8:
                    str7 = C2047a.m9009d(parcel2, a);
                    break;
                case 9:
                    str8 = C2047a.m9009d(parcel2, a);
                    break;
                case 10:
                    str9 = C2047a.m9009d(parcel2, a);
                    break;
                case 11:
                    str10 = C2047a.m9009d(parcel2, a);
                    break;
                case 12:
                    str11 = C2047a.m9009d(parcel2, a);
                    break;
                case 13:
                    str12 = C2047a.m9009d(parcel2, a);
                    break;
                case 14:
                    str13 = C2047a.m9009d(parcel2, a);
                    break;
                case 15:
                    str14 = C2047a.m9009d(parcel2, a);
                    break;
                default:
                    C2047a.m9024s(parcel2, a);
                    break;
            }
        }
        C2047a.m9012g(parcel2, b);
        return new Barcode.DriverLicense(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Barcode.DriverLicense[i];
    }
}
