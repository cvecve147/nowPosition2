package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C1697X;
import com.google.android.gms.ads.internal.gmsg.C1741o;
import org.json.JSONObject;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.oz */
public final class C3367oz<I, O> implements C3050dz<I, O> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C3107fz<O> f9980a;

    /* renamed from: b */
    private final C3135gz<I> f9981b;

    /* renamed from: c */
    private final C2275Dy f9982c;

    /* renamed from: d */
    private final String f9983d;

    C3367oz(C2275Dy dy, String str, C3135gz<I> gzVar, C3107fz<O> fzVar) {
        this.f9982c = dy;
        this.f9983d = str;
        this.f9981b = gzVar;
        this.f9980a = fzVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m13291a(C2653Qy qy, C2934_y _yVar, I i, C3116gg<O> ggVar) {
        try {
            C1697X.m7698e();
            String a = C3114ge.m12399a();
            C1741o.f5730p.mo6937a(a, new C3453rz(this, qy, ggVar));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", a);
            jSONObject.put("args", this.f9981b.mo9484a(i));
            _yVar.mo7967b(this.f9983d, jSONObject);
        } catch (Exception e) {
            ggVar.mo9463a(e);
            C2227Cf.m9533b("Unable to invokeJavaScript", e);
            qy.mo8770c();
        } catch (Throwable th) {
            qy.mo8770c();
            throw th;
        }
    }

    /* renamed from: a */
    public final C2804Wf<O> mo9344a(I i) {
        C3116gg ggVar = new C3116gg();
        C2653Qy b = this.f9982c.mo8022b((C2209Bp) null);
        b.mo9535a(new C3396pz(this, b, i, ggVar), new C3424qz(this, ggVar, b));
        return ggVar;
    }

    /* renamed from: b */
    public final C2804Wf<O> mo6904b(I i) {
        return mo9344a(i);
    }
}
