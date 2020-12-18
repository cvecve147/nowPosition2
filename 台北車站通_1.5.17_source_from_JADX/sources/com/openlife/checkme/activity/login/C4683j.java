package com.openlife.checkme.activity.login;

import com.openlife.checkme.activity.login.C4678e;
import com.openlife.checkme.activity.login.C4680g;
import com.openlife.checkme.activity.p088a.C4464g;
import com.openlife.checkme.net.model.FbLoginBody;
import org.json.JSONObject;

/* renamed from: com.openlife.checkme.activity.login.j */
public class C4683j<V extends C4680g, M extends C4678e> extends C4679f {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C4680g f13572d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C4678e f13573e;

    public C4683j(V v, M m) {
        super(v, m);
        this.f13572d = v;
        this.f13573e = m;
    }

    /* renamed from: a */
    public void mo13000a(FbLoginBody fbLoginBody) {
        C4464g.m17699a(mo13150a(), this.f13573e.mo12995a(fbLoginBody), new C4682i(this), this.f13572d);
    }

    /* renamed from: a */
    public void mo13001a(String str, JSONObject jSONObject) {
        FbLoginBody fbLoginBody = new FbLoginBody();
        fbLoginBody.setEmail(jSONObject.optString("email"));
        fbLoginBody.setFbuid(jSONObject.optString("id"));
        fbLoginBody.setNickname(jSONObject.optString("name"));
        fbLoginBody.setGender(jSONObject.optString("gender"));
        fbLoginBody.setFbToken(str);
        this.f13573e.mo12998a(jSONObject.optString("name"), jSONObject.optString("email"), jSONObject.optString("id"), str, jSONObject.optString("gender"));
        if (!this.f13573e.mo12996a().isEmpty()) {
            fbLoginBody.setVendorId(this.f13573e.mo12996a());
        }
        this.f13572d.mo12988a(fbLoginBody);
    }
}
