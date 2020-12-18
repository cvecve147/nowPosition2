package com.onesignal;

import com.onesignal.C4416rb;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onesignal.na */
class C4400na extends C4416rb.C4417a {

    /* renamed from: a */
    final /* synthetic */ C4364fa f12962a;

    /* renamed from: b */
    final /* synthetic */ C4406pa f12963b;

    C4400na(C4406pa paVar, C4364fa faVar) {
        this.f12963b = paVar;
        this.f12962a = faVar;
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
            this.f12962a.mo12498a(jSONObject.optDouble("display_duration"));
            C4384jc.m17389a(this.f12962a, string);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
