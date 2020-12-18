package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ads.C2227Cf;
import com.google.android.gms.internal.ads.C2478La;
import java.util.Map;

@C2478La
/* renamed from: com.google.android.gms.ads.internal.gmsg.H */
public final class C1721H implements C1718E<Object> {

    /* renamed from: a */
    private final C1726I f5676a;

    public C1721H(C1726I i) {
        this.f5676a = i;
    }

    public final void zza(Object obj, Map<String, String> map) {
        boolean equals = "1".equals(map.get("transparentBackground"));
        boolean equals2 = "1".equals(map.get("blur"));
        float f = 0.0f;
        try {
            if (map.get("blurRadius") != null) {
                f = Float.parseFloat(map.get("blurRadius"));
            }
        } catch (NumberFormatException e) {
            C2227Cf.m9533b("Fail to parse float", e);
        }
        this.f5676a.mo6933p(equals);
        this.f5676a.mo6932a(equals2, f);
    }
}
