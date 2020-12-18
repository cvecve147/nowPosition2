package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C2049b;
import java.util.Map;

@C2478La
public final class zzsg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzsg> CREATOR = new C3076ex();

    /* renamed from: a */
    private final String f10914a;

    /* renamed from: b */
    private final String[] f10915b;

    /* renamed from: c */
    private final String[] f10916c;

    zzsg(String str, String[] strArr, String[] strArr2) {
        this.f10914a = str;
        this.f10915b = strArr;
        this.f10916c = strArr2;
    }

    /* renamed from: a */
    public static zzsg m14781a(C2216Bw bw) {
        Map<String, String> a = bw.mo7901a();
        int size = a.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i = 0;
        for (Map.Entry next : a.entrySet()) {
            strArr[i] = (String) next.getKey();
            strArr2[i] = (String) next.getValue();
            i++;
        }
        return new zzsg(bw.mo7909c(), strArr, strArr2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C2049b.m9025a(parcel);
        C2049b.m9038a(parcel, 1, this.f10914a, false);
        C2049b.m9043a(parcel, 2, this.f10915b, false);
        C2049b.m9043a(parcel, 3, this.f10916c, false);
        C2049b.m9026a(parcel, a);
    }
}
