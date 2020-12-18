package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.C1734h;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.rz */
final class C3453rz implements C1734h {

    /* renamed from: a */
    private final C2653Qy f10172a;

    /* renamed from: b */
    private final C3116gg f10173b;

    /* renamed from: c */
    private final /* synthetic */ C3367oz f10174c;

    public C3453rz(C3367oz ozVar, C2653Qy qy, C3116gg ggVar) {
        this.f10174c = ozVar;
        this.f10172a = qy;
        this.f10173b = ggVar;
    }

    /* renamed from: a */
    public final void mo6938a(String str) {
        if (str == null) {
            try {
                this.f10173b.mo9463a(new C3020cz());
            } catch (IllegalStateException unused) {
            } catch (Throwable th) {
                this.f10172a.mo8770c();
                throw th;
            }
        } else {
            this.f10173b.mo9463a(new C3020cz(str));
        }
        this.f10172a.mo8770c();
    }

    /* renamed from: a */
    public final void mo6939a(JSONObject jSONObject) {
        try {
            this.f10173b.mo9464b(this.f10174c.f9980a.mo9443a(jSONObject));
        } catch (IllegalStateException unused) {
        } catch (JSONException e) {
            this.f10173b.mo9464b(e);
        } catch (Throwable th) {
            this.f10172a.mo8770c();
            throw th;
        }
        this.f10172a.mo8770c();
    }
}
