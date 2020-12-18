package com.onesignal;

import org.json.JSONObject;

/* renamed from: com.onesignal.ia */
class C4378ia extends JSONObject {

    /* renamed from: a */
    final /* synthetic */ String f12918a;

    /* renamed from: b */
    final /* synthetic */ C4406pa f12919b;

    C4378ia(C4406pa paVar, String str) {
        this.f12919b = paVar;
        this.f12918a = str;
        put("app_id", C4306Xa.f12757c);
        put("player_id", C4306Xa.m17208v());
        put("variant_id", this.f12918a);
        put("device_type", new C4252Ia().mo12316d());
        put("first_impression", true);
    }
}
