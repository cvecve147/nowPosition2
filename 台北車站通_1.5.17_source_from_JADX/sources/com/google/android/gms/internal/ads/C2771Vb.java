package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.C1718E;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Vb */
final class C2771Vb implements C1718E<Object> {

    /* renamed from: a */
    private final /* synthetic */ C2687Sb f8430a;

    C2771Vb(C2687Sb sb) {
        this.f8430a = sb;
    }

    public final void zza(Object obj, Map<String, String> map) {
        synchronized (this.f8430a.f8232b) {
            if (!this.f8430a.f8235e.isDone()) {
                C2855Yb yb = new C2855Yb(-2, map);
                if (this.f8430a.f8233c.equals(yb.mo9062h())) {
                    this.f8430a.f8235e.mo9464b(yb);
                }
            }
        }
    }
}
