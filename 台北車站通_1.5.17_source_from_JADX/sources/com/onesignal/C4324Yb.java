package com.onesignal;

import com.onesignal.C4306Xa;
import com.onesignal.C4416rb;
import org.json.JSONObject;

/* renamed from: com.onesignal.Yb */
class C4324Yb extends C4416rb.C4417a {

    /* renamed from: a */
    final /* synthetic */ JSONObject f12820a;

    /* renamed from: b */
    final /* synthetic */ JSONObject f12821b;

    /* renamed from: c */
    final /* synthetic */ String f12822c;

    /* renamed from: d */
    final /* synthetic */ C4327Zb f12823d;

    C4324Yb(C4327Zb zb, JSONObject jSONObject, JSONObject jSONObject2, String str) {
        this.f12823d = zb;
        this.f12820a = jSONObject;
        this.f12821b = jSONObject2;
        this.f12822c = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12377a(int i, String str, Throwable th) {
        synchronized (this.f12823d.f12827b) {
            this.f12823d.f12832g = false;
            C4306Xa.C4316j jVar = C4306Xa.C4316j.WARN;
            C4306Xa.m17135a(jVar, "Failed last request. statusCode: " + i + "\nresponse: " + str);
            if (this.f12823d.m17240a(i, str, "not a valid device_type")) {
                this.f12823d.mo12418m();
            } else {
                this.f12823d.m17237a(i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12355a(String str) {
        synchronized (this.f12823d.f12827b) {
            this.f12823d.f12832g = false;
            this.f12823d.f12833h.mo12384b(this.f12820a, this.f12821b);
            try {
                C4306Xa.C4316j jVar = C4306Xa.C4316j.DEBUG;
                C4306Xa.m17154b(jVar, "doCreateOrNewSession:response: " + str);
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("id")) {
                    String optString = jSONObject.optString("id");
                    this.f12823d.mo12396a(optString);
                    C4306Xa.C4316j jVar2 = C4306Xa.C4316j.INFO;
                    C4306Xa.m17135a(jVar2, "Device registered, UserId = " + optString);
                } else {
                    C4306Xa.C4316j jVar3 = C4306Xa.C4316j.INFO;
                    C4306Xa.m17135a(jVar3, "session sent, UserId = " + this.f12822c);
                }
                this.f12823d.mo12449f().f12693e.put("session", false);
                this.f12823d.mo12449f().mo12386c();
                if (jSONObject.has("in_app_messages")) {
                    C4406pa.m17450b().mo12525a(jSONObject.getJSONArray("in_app_messages"));
                }
                this.f12823d.mo12400c(this.f12821b);
            } catch (Throwable th) {
                C4306Xa.m17136a(C4306Xa.C4316j.ERROR, "ERROR parsing on_session or create JSON Response.", th);
            }
        }
    }
}
