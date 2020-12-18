package com.onesignal;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onesignal.Qb */
class C4287Qb extends C4327Zb {
    C4287Qb() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C4280Ob mo12395a(String str, boolean z) {
        return new C4283Pb(str, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12396a(String str) {
        C4306Xa.m17177f(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12397a(JSONObject jSONObject) {
        try {
            jSONObject.put("device_type", 11);
            jSONObject.putOpt("device_player_id", C4306Xa.m17208v());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo12398b() {
        return C4306Xa.m17197o();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo12399b(JSONObject jSONObject) {
        if (jSONObject.has("identifier")) {
            C4306Xa.m17190k();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo12400c(JSONObject jSONObject) {
        if (jSONObject.has("identifier")) {
            C4306Xa.m17192l();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo12401j() {
        if (!(mo12398b() == null && mo12445c() == null) && C4306Xa.m17208v() != null) {
            mo12440a((Integer) 0).mo12455b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo12402l() {
        mo12401j();
    }
}
