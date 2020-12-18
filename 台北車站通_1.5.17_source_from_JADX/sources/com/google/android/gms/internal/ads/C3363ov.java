package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.gmsg.C1718E;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.ov */
final class C3363ov implements C1718E<Object> {

    /* renamed from: a */
    private final /* synthetic */ C3335nv f9970a;

    C3363ov(C3335nv nvVar) {
        this.f9970a = nvVar;
    }

    public final void zza(Object obj, Map<String, String> map) {
        try {
            this.f9970a.f9935e = Long.valueOf(Long.parseLong(map.get("timestamp")));
        } catch (NumberFormatException unused) {
            C2227Cf.m9529a("Failed to call parse unconfirmedClickTimestamp.");
        }
        this.f9970a.f9934d = map.get("id");
        String str = map.get("asset_id");
        if (this.f9970a.f9932b == null) {
            C2227Cf.m9532b("Received unconfirmed click but UnconfirmedClickListener is null.");
            return;
        }
        try {
            this.f9970a.f9932b.mo8768k(str);
        } catch (RemoteException e) {
            C2227Cf.m9537d("#007 Could not call remote method.", e);
        }
    }
}
