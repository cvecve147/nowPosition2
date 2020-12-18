package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.C1718E;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Ub */
final class C2744Ub implements C1718E<Object> {

    /* renamed from: a */
    private final /* synthetic */ C2687Sb f8373a;

    C2744Ub(C2687Sb sb) {
        this.f8373a = sb;
    }

    public final void zza(Object obj, Map<String, String> map) {
        synchronized (this.f8373a.f8232b) {
            if (!this.f8373a.f8235e.isDone()) {
                C2855Yb yb = new C2855Yb(-2, map);
                if (this.f8373a.f8233c.equals(yb.mo9062h())) {
                    String c = yb.mo9057c();
                    if (c == null) {
                        C2227Cf.m9536d("URL missing in loadAdUrl GMSG.");
                        return;
                    }
                    if (c.contains("%40mediation_adapters%40")) {
                        String replaceAll = c.replaceAll("%40mediation_adapters%40", C2689Sd.m11153a(this.f8373a.f8231a, map.get("check_adapters"), this.f8373a.f8234d));
                        yb.mo9055a(replaceAll);
                        String valueOf = String.valueOf(replaceAll);
                        C2857Yd.m11615f(valueOf.length() != 0 ? "Ad request URL modified to ".concat(valueOf) : new String("Ad request URL modified to "));
                    }
                    this.f8373a.f8235e.mo9464b(yb);
                }
            }
        }
    }
}
