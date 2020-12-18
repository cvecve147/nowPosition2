package com.onesignal;

import org.json.JSONObject;

/* renamed from: com.onesignal.la */
class C4394la extends JSONObject {

    /* renamed from: a */
    final /* synthetic */ C4368ga f12950a;

    /* renamed from: b */
    final /* synthetic */ String f12951b;

    /* renamed from: c */
    final /* synthetic */ C4406pa f12952c;

    C4394la(C4406pa paVar, C4368ga gaVar, String str) {
        this.f12952c = paVar;
        this.f12950a = gaVar;
        this.f12951b = str;
        put("app_id", C4306Xa.f12757c);
        put("device_type", new C4252Ia().mo12316d());
        put("player_id", C4306Xa.m17208v());
        put("click_id", this.f12950a.f12898a);
        put("click_name", this.f12950a.f12899b);
        put("variant_id", this.f12951b);
        if (this.f12950a.f12902e) {
            put("first_click", true);
        }
    }
}
