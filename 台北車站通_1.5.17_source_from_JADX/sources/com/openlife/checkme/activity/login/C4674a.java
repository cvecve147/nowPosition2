package com.openlife.checkme.activity.login;

import com.facebook.C1352H;
import com.facebook.GraphRequest;
import com.facebook.login.C1537E;
import org.json.JSONObject;

/* renamed from: com.openlife.checkme.activity.login.a */
class C4674a implements GraphRequest.C1348c {

    /* renamed from: a */
    final /* synthetic */ C1537E f13564a;

    /* renamed from: b */
    final /* synthetic */ C4675b f13565b;

    C4674a(C4675b bVar, C1537E e) {
        this.f13565b = bVar;
        this.f13564a = e;
    }

    /* renamed from: a */
    public void mo5975a(JSONObject jSONObject, C1352H h) {
        this.f13565b.f13566a.f13557a.mo13001a(this.f13564a.mo6294a().mo5894h(), jSONObject);
    }
}
