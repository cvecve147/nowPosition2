package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.C1718E;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Mv */
final class C2529Mv implements C1718E<Object> {

    /* renamed from: a */
    private final /* synthetic */ C3370pa f7625a;

    /* renamed from: b */
    private final /* synthetic */ C2443Jv f7626b;

    C2529Mv(C2443Jv jv, C3370pa paVar) {
        this.f7626b = jv;
        this.f7625a = paVar;
    }

    public final void zza(Object obj, Map<String, String> map) {
        C3520uh uhVar = (C3520uh) this.f7626b.f7389a.get();
        if (uhVar == null) {
            this.f7625a.mo9854a("/showOverlay", this);
        } else {
            uhVar.getView().setVisibility(0);
        }
    }
}
