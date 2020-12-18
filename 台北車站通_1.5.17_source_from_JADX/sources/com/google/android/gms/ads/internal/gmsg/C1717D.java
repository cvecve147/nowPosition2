package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ads.C3520uh;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.internal.gmsg.D */
final class C1717D implements C1718E<C3520uh> {
    C1717D() {
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        C3520uh uhVar = (C3520uh) obj;
        if (map.keySet().contains("start")) {
            uhVar.mo8183n(true);
        }
        if (map.keySet().contains("stop")) {
            uhVar.mo8183n(false);
        }
    }
}
