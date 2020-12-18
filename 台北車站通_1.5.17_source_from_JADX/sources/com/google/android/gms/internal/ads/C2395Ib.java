package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.C1718E;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Ib */
public final class C2395Ib implements C1718E<Object> {
    public final void zza(Object obj, Map<String, String> map) {
        String str = map.get("request_id");
        String valueOf = String.valueOf(map.get("errors"));
        C2227Cf.m9536d(valueOf.length() != 0 ? "Invalid request: ".concat(valueOf) : new String("Invalid request: "));
        C2166Ab.f6664i.mo6935b(str);
    }
}
