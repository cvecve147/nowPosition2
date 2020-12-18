package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.C2341Gf;
import com.google.android.gms.internal.ads.C2483Lf;
import com.google.android.gms.internal.ads.C2804Wf;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.internal.f */
final /* synthetic */ class C1710f implements C2341Gf {

    /* renamed from: a */
    static final C2341Gf f5668a = new C1710f();

    private C1710f() {
    }

    /* renamed from: b */
    public final C2804Wf mo6904b(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject.optBoolean("isSuccessful", false)) {
            C1697X.m7702i().mo8333m().mo9155f(jSONObject.getString("appSettingsJson"));
        }
        return C2483Lf.m10495a(null);
    }
}
