package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ads.C3520uh;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.internal.gmsg.B */
final class C1715B implements C1718E<C3520uh> {
    C1715B() {
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        C3520uh uhVar = (C3520uh) obj;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            uhVar.mo6793Eb();
        } else if ("resume".equals(str)) {
            uhVar.mo6792Db();
        }
    }
}
