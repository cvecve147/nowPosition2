package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.C2047a;
import com.google.android.gms.location.zzj;
import java.util.List;

/* renamed from: com.google.android.gms.internal.location.B */
public final class C3683B implements Parcelable.Creator<zzm> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C2047a.m9004b(parcel);
        zzj zzj = zzm.f10972b;
        List<ClientIdentity> list = zzm.f10971a;
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = C2047a.m8999a(parcel);
            int a2 = C2047a.m8998a(a);
            if (a2 == 1) {
                zzj = (zzj) C2047a.m9001a(parcel, a, zzj.CREATOR);
            } else if (a2 == 2) {
                list = C2047a.m9008c(parcel, a, ClientIdentity.CREATOR);
            } else if (a2 != 3) {
                C2047a.m9024s(parcel, a);
            } else {
                str = C2047a.m9009d(parcel, a);
            }
        }
        C2047a.m9012g(parcel, b);
        return new zzm(zzj, list, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzm[i];
    }
}
