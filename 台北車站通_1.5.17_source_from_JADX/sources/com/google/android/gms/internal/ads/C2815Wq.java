package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.C1718E;
import org.json.JSONObject;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Wq */
public final class C2815Wq implements C3183ir {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C2554Nq f8562a;

    /* renamed from: b */
    private final C3520uh f8563b;

    /* renamed from: c */
    private final C1718E<C3520uh> f8564c = new C2843Xq(this);

    /* renamed from: d */
    private final C1718E<C3520uh> f8565d = new C2871Yq(this);

    /* renamed from: e */
    private final C1718E<C3520uh> f8566e = new C2898Zq(this);

    public C2815Wq(C2554Nq nq, C3520uh uhVar) {
        this.f8562a = nq;
        this.f8563b = uhVar;
        C3520uh uhVar2 = this.f8563b;
        uhVar2.mo8157b("/updateActiveView", this.f8564c);
        uhVar2.mo8157b("/untrackActiveViewUnit", this.f8565d);
        uhVar2.mo8157b("/visibilityChanged", this.f8566e);
        String valueOf = String.valueOf(this.f8562a.f7667e.mo8509d());
        C2227Cf.m9532b(valueOf.length() != 0 ? "Custom JS tracking ad unit: ".concat(valueOf) : new String("Custom JS tracking ad unit: "));
    }

    /* renamed from: a */
    public final void mo9007a(JSONObject jSONObject, boolean z) {
        if (!z) {
            this.f8563b.mo7967b("AFMA_updateActiveView", jSONObject);
        } else {
            this.f8562a.mo8590b((C3183ir) this);
        }
    }

    /* renamed from: a */
    public final boolean mo9008a() {
        return true;
    }

    /* renamed from: b */
    public final void mo9009b() {
        C3520uh uhVar = this.f8563b;
        uhVar.mo8147a("/visibilityChanged", (C1718E<? super C3520uh>) this.f8566e);
        uhVar.mo8147a("/untrackActiveViewUnit", (C1718E<? super C3520uh>) this.f8565d);
        uhVar.mo8147a("/updateActiveView", (C1718E<? super C3520uh>) this.f8564c);
    }
}
