package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.ads.internal.overlay.C1771c;
import com.google.android.gms.internal.ads.C2227Cf;
import com.google.android.gms.internal.ads.C3520uh;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.internal.gmsg.w */
final class C1749w implements C1718E<C3520uh> {
    C1749w() {
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        C3520uh uhVar = (C3520uh) obj;
        C1771c Ya = uhVar.mo8137Ya();
        if (Ya != null) {
            Ya.mo6994bc();
            return;
        }
        C1771c tb = uhVar.mo8200tb();
        if (tb != null) {
            tb.mo6994bc();
        } else {
            C2227Cf.m9536d("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
