package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C2047a;

/* renamed from: com.google.android.gms.internal.ads.fs */
public final class C3100fs implements Parcelable.Creator<zzhl> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = C2047a.m9004b(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Bundle bundle = null;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int a = C2047a.m8999a(parcel);
            switch (C2047a.m8998a(a)) {
                case 2:
                    str = C2047a.m9009d(parcel2, a);
                    break;
                case 3:
                    j = C2047a.m9021p(parcel2, a);
                    break;
                case 4:
                    str2 = C2047a.m9009d(parcel2, a);
                    break;
                case 5:
                    str3 = C2047a.m9009d(parcel2, a);
                    break;
                case 6:
                    str4 = C2047a.m9009d(parcel2, a);
                    break;
                case 7:
                    bundle = C2047a.m9000a(parcel2, a);
                    break;
                case 8:
                    z = C2047a.m9013h(parcel2, a);
                    break;
                case 9:
                    j2 = C2047a.m9021p(parcel2, a);
                    break;
                default:
                    C2047a.m9024s(parcel2, a);
                    break;
            }
        }
        C2047a.m9012g(parcel2, b);
        return new zzhl(str, j, str2, str3, str4, bundle, z, j2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzhl[i];
    }
}
