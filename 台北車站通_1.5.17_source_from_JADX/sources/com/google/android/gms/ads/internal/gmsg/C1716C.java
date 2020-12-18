package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ads.C3520uh;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.internal.gmsg.C */
final class C1716C implements C1718E<C3520uh> {
    C1716C() {
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        C3520uh uhVar = (C3520uh) obj;
        if (map.keySet().contains("start")) {
            uhVar.mo8182mb().mo9238f();
        } else if (map.keySet().contains("stop")) {
            uhVar.mo8182mb().mo9237e();
        } else if (map.keySet().contains("cancel")) {
            uhVar.mo8182mb().mo9234b();
        }
    }
}
