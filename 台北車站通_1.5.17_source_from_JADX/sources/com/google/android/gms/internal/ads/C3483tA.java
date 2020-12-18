package com.google.android.gms.internal.ads;

import com.google.ads.mediation.C1611a;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import p101d.p129g.p130a.C5457a;
import p101d.p129g.p130a.C5458b;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.tA */
public final class C3483tA {
    /* renamed from: a */
    public static int m13826a(C5457a aVar) {
        int i = C3512uA.f10291b[aVar.ordinal()];
        if (i == 2) {
            return 1;
        }
        if (i != 3) {
            return i != 4 ? 0 : 3;
        }
        return 2;
    }

    /* renamed from: a */
    public static C1611a m13827a(zzjj zzjj, boolean z) {
        List<String> list = zzjj.f10879e;
        HashSet hashSet = list != null ? new HashSet(list) : null;
        Date date = new Date(zzjj.f10876b);
        int i = zzjj.f10878d;
        return new C1611a(date, i != 1 ? i != 2 ? C5458b.UNKNOWN : C5458b.FEMALE : C5458b.MALE, hashSet, z, zzjj.f10885k);
    }
}
