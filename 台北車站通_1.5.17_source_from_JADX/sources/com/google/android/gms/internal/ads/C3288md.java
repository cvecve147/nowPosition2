package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C2047a;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.md */
public final class C3288md implements Parcelable.Creator<zzaiq> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C2047a.m9004b(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        String str = null;
        String str2 = null;
        ArrayList<String> arrayList = null;
        ArrayList<String> arrayList2 = null;
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
                    z = C2047a.m9013h(parcel, a);
                    break;
                case 5:
                    z2 = C2047a.m9013h(parcel, a);
                    break;
                case 6:
                    arrayList = C2047a.m9011f(parcel, a);
                    break;
                case 7:
                    z3 = C2047a.m9013h(parcel, a);
                    break;
                case 8:
                    z4 = C2047a.m9013h(parcel, a);
                    break;
                case 9:
                    arrayList2 = C2047a.m9011f(parcel, a);
                    break;
                default:
                    C2047a.m9024s(parcel, a);
                    break;
            }
        }
        C2047a.m9012g(parcel, b);
        return new zzaiq(str, str2, z, z2, arrayList, z3, z4, arrayList2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaiq[i];
    }
}
