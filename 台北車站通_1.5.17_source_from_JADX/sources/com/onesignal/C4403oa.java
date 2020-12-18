package com.onesignal;

import com.onesignal.C4416rb;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onesignal.oa */
class C4403oa extends C4416rb.C4417a {

    /* renamed from: a */
    final /* synthetic */ C4406pa f12972a;

    C4403oa(C4406pa paVar) {
        this.f12972a = paVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12377a(int i, String str, Throwable th) {
        C4406pa.m17453b("html", i, str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12355a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("html");
            C4364fa faVar = new C4364fa(true);
            faVar.mo12498a(jSONObject.optDouble("display_duration"));
            C4384jc.m17389a(faVar, string);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
