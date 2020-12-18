package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C2047a;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.nb */
public final class C3314nb implements Parcelable.Creator<zzael> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C2047a.m9004b(parcel);
        boolean z = false;
        ArrayList<String> arrayList = null;
        while (parcel.dataPosition() < b) {
            int a = C2047a.m8999a(parcel);
            int a2 = C2047a.m8998a(a);
            if (a2 == 2) {
                z = C2047a.m9013h(parcel, a);
            } else if (a2 != 3) {
                C2047a.m9024s(parcel, a);
            } else {
                arrayList = C2047a.m9011f(parcel, a);
            }
        }
        C2047a.m9012g(parcel, b);
        return new zzael(z, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzael[i];
    }
}
