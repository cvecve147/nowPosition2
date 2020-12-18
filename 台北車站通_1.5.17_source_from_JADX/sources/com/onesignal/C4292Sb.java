package com.onesignal;

import com.onesignal.C4416rb;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onesignal.Sb */
class C4292Sb extends C4416rb.C4417a {

    /* renamed from: a */
    final /* synthetic */ C4295Tb f12721a;

    C4292Sb(C4295Tb tb) {
        this.f12721a = tb;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12355a(String str) {
        boolean unused = C4295Tb.f12723j = true;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("tags")) {
                synchronized (this.f12721a.f12827b) {
                    JSONObject a = this.f12721a.mo12441a(this.f12721a.f12833h.f12694f.optJSONObject("tags"), this.f12721a.mo12448e().f12694f.optJSONObject("tags"), (JSONObject) null, (Set<String>) null);
                    this.f12721a.f12833h.f12694f.put("tags", jSONObject.optJSONObject("tags"));
                    this.f12721a.f12833h.mo12386c();
                    this.f12721a.mo12448e().mo12382a(jSONObject, a);
                    this.f12721a.mo12448e().mo12386c();
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
