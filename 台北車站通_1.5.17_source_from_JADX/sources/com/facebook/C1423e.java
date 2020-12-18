package com.facebook;

import com.facebook.C1425g;
import com.facebook.GraphRequest;
import org.json.JSONObject;

/* renamed from: com.facebook.e */
class C1423e implements GraphRequest.C1347b {

    /* renamed from: a */
    final /* synthetic */ C1425g.C1426a f4983a;

    /* renamed from: b */
    final /* synthetic */ C1425g f4984b;

    C1423e(C1425g gVar, C1425g.C1426a aVar) {
        this.f4984b = gVar;
        this.f4983a = aVar;
    }

    /* renamed from: a */
    public void mo5885a(C1352H h) {
        JSONObject b = h.mo5988b();
        if (b != null) {
            this.f4983a.f4998a = b.optString("access_token");
            this.f4983a.f4999b = b.optInt("expires_at");
        }
    }
}
