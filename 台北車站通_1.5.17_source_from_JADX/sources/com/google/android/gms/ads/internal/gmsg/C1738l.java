package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ads.C2227Cf;
import com.google.android.gms.internal.ads.C2478La;
import java.util.Map;

@C2478La
/* renamed from: com.google.android.gms.ads.internal.gmsg.l */
public final class C1738l implements C1718E<Object> {

    /* renamed from: a */
    private final C1739m f5714a;

    public C1738l(C1739m mVar) {
        this.f5714a = mVar;
    }

    public final void zza(Object obj, Map<String, String> map) {
        String str = map.get("name");
        if (str == null) {
            C2227Cf.m9536d("App event with no name parameter.");
        } else {
            this.f5714a.mo6863a(str, map.get("info"));
        }
    }
}
