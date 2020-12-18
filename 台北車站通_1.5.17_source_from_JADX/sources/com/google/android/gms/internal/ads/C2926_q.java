package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.C1697X;
import com.google.android.gms.ads.internal.gmsg.C1718E;
import com.google.android.gms.ads.internal.gmsg.C1729c;
import org.json.JSONObject;

@C2478La
/* renamed from: com.google.android.gms.internal.ads._q */
public final class C2926_q implements C3183ir {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C2554Nq f8857a;

    /* renamed from: b */
    private final Context f8858b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C1729c f8859c;

    /* renamed from: d */
    private C2653Qy f8860d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f8861e;

    /* renamed from: f */
    private final C1718E<C2934_y> f8862f = new C3070er(this);

    /* renamed from: g */
    private final C1718E<C2934_y> f8863g = new C3099fr(this);

    /* renamed from: h */
    private final C1718E<C2934_y> f8864h = new C3127gr(this);

    /* renamed from: i */
    private final C1718E<C2934_y> f8865i = new C3155hr(this);

    public C2926_q(C2554Nq nq, C2275Dy dy, Context context) {
        this.f8857a = nq;
        this.f8858b = context;
        this.f8859c = new C1729c(this.f8858b);
        this.f8860d = dy.mo8022b((C2209Bp) null);
        this.f8860d.mo9535a(new C2955ar(this), new C2984br(this));
        String valueOf = String.valueOf(this.f8857a.f7667e.mo8509d());
        C2227Cf.m9532b(valueOf.length() != 0 ? "Core JS tracking ad unit: ".concat(valueOf) : new String("Core JS tracking ad unit: "));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo9170a(C2934_y _yVar) {
        _yVar.mo9186b("/updateActiveView", this.f8862f);
        _yVar.mo9186b("/untrackActiveViewUnit", this.f8863g);
        _yVar.mo9186b("/visibilityChanged", this.f8864h);
        if (C1697X.m7689B().mo10040d(this.f8858b)) {
            _yVar.mo9186b("/logScionEvent", this.f8865i);
        }
    }

    /* renamed from: a */
    public final void mo9007a(JSONObject jSONObject, boolean z) {
        this.f8860d.mo9535a(new C3012cr(this, jSONObject), new C3234kg());
    }

    /* renamed from: a */
    public final boolean mo9008a() {
        return this.f8861e;
    }

    /* renamed from: b */
    public final void mo9009b() {
        this.f8860d.mo9535a(new C3042dr(this), new C3234kg());
        this.f8860d.mo8770c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo9171b(C2934_y _yVar) {
        _yVar.mo9185a("/visibilityChanged", this.f8864h);
        _yVar.mo9185a("/untrackActiveViewUnit", this.f8863g);
        _yVar.mo9185a("/updateActiveView", this.f8862f);
        if (C1697X.m7689B().mo10040d(this.f8858b)) {
            _yVar.mo9185a("/logScionEvent", this.f8865i);
        }
    }
}
