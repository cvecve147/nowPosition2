package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.Jv */
final class C2443Jv {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final WeakReference<C3520uh> f7389a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public String f7390b;

    public C2443Jv(C3520uh uhVar) {
        this.f7389a = new WeakReference<>(uhVar);
    }

    /* renamed from: a */
    public final void mo8387a(C3370pa paVar) {
        paVar.mo9857b("/loadHtml", new C2471Kv(this, paVar));
        paVar.mo9857b("/showOverlay", new C2529Mv(this, paVar));
        paVar.mo9857b("/hideOverlay", new C2559Nv(this, paVar));
        C3520uh uhVar = (C3520uh) this.f7389a.get();
        if (uhVar != null) {
            uhVar.mo8157b("/sendMessageToSdk", new C2591Ov(this, paVar));
        }
    }
}
