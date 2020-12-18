package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ads.C2227Cf;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.internal.gmsg.y */
final class C1751y implements C1718E<Object> {
    C1751y() {
    }

    public final void zza(Object obj, Map<String, String> map) {
        String valueOf = String.valueOf(map.get("string"));
        C2227Cf.m9534c(valueOf.length() != 0 ? "Received log message: ".concat(valueOf) : new String("Received log message: "));
    }
}
