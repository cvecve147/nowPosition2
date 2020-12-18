package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.C1718E;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Nv */
final class C2559Nv implements C1718E<Object> {

    /* renamed from: a */
    private final /* synthetic */ C3370pa f8013a;

    /* renamed from: b */
    private final /* synthetic */ C2443Jv f8014b;

    C2559Nv(C2443Jv jv, C3370pa paVar) {
        this.f8014b = jv;
        this.f8013a = paVar;
    }

    public final void zza(Object obj, Map<String, String> map) {
        C3520uh uhVar = (C3520uh) this.f8014b.f7389a.get();
        if (uhVar == null) {
            this.f8013a.mo9854a("/hideOverlay", this);
        } else {
            uhVar.getView().setVisibility(8);
        }
    }
}
