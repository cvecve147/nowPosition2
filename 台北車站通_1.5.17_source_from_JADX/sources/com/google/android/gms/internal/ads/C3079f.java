package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C1697X;
import java.util.Map;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.f */
public final class C3079f {

    /* renamed from: a */
    private final C3520uh f9123a;

    /* renamed from: b */
    private final boolean f9124b;

    /* renamed from: c */
    private final String f9125c;

    public C3079f(C3520uh uhVar, Map<String, String> map) {
        this.f9123a = uhVar;
        this.f9125c = map.get("forceOrientation");
        this.f9124b = map.containsKey("allowOrientationChange") ? Boolean.parseBoolean(map.get("allowOrientationChange")) : true;
    }

    /* renamed from: a */
    public final void mo9417a() {
        if (this.f9123a == null) {
            C2227Cf.m9536d("AdWebView is null");
        } else {
            this.f9123a.setRequestedOrientation("portrait".equalsIgnoreCase(this.f9125c) ? C1697X.m7700g().mo9725b() : "landscape".equalsIgnoreCase(this.f9125c) ? C1697X.m7700g().mo9712a() : this.f9124b ? -1 : C1697X.m7700g().mo9728c());
        }
    }
}
