package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.C1718E;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Tb */
final class C2715Tb implements C1718E<Object> {

    /* renamed from: a */
    private final /* synthetic */ C2687Sb f8331a;

    C2715Tb(C2687Sb sb) {
        this.f8331a = sb;
    }

    public final void zza(Object obj, Map<String, String> map) {
        synchronized (this.f8331a.f8232b) {
            if (!this.f8331a.f8235e.isDone()) {
                if (this.f8331a.f8233c.equals(map.get("request_id"))) {
                    C2855Yb yb = new C2855Yb(1, map);
                    String b = yb.mo9056b();
                    String valueOf = String.valueOf(yb.mo9058d());
                    StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 24 + String.valueOf(valueOf).length());
                    sb.append("Invalid ");
                    sb.append(b);
                    sb.append(" request error: ");
                    sb.append(valueOf);
                    C2227Cf.m9536d(sb.toString());
                    this.f8331a.f8235e.mo9464b(yb);
                }
            }
        }
    }
}
