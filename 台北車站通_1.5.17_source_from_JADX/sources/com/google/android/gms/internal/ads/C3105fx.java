package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C2047a;

/* renamed from: com.google.android.gms.internal.ads.fx */
public final class C3105fx implements Parcelable.Creator<zzsi> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = C2047a.m9004b(parcel);
        boolean z = false;
        int i = 0;
        boolean z2 = false;
        String str = null;
        byte[] bArr = null;
        String[] strArr = null;
        String[] strArr2 = null;
        long j = 0;
        while (parcel.dataPosition() < b) {
            int a = C2047a.m8999a(parcel);
            switch (C2047a.m8998a(a)) {
                case 1:
                    z = C2047a.m9013h(parcel2, a);
                    break;
                case 2:
                    str = C2047a.m9009d(parcel2, a);
                    break;
                case 3:
                    i = C2047a.m9020o(parcel2, a);
                    break;
                case 4:
                    bArr = C2047a.m9005b(parcel2, a);
                    break;
                case 5:
                    strArr = C2047a.m9010e(parcel2, a);
                    break;
                case 6:
                    strArr2 = C2047a.m9010e(parcel2, a);
                    break;
                case 7:
                    z2 = C2047a.m9013h(parcel2, a);
                    break;
                case 8:
                    j = C2047a.m9021p(parcel2, a);
                    break;
                default:
                    C2047a.m9024s(parcel2, a);
                    break;
            }
        }
        C2047a.m9012g(parcel2, b);
        return new zzsi(z, str, i, bArr, strArr, strArr2, z2, j);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzsi[i];
    }
}
