package com.onesignal;

import com.onesignal.C4390kb;
import org.json.JSONObject;

/* renamed from: com.onesignal.jb */
class C4383jb extends C4390kb.C4392b {

    /* renamed from: g */
    final /* synthetic */ JSONObject f12925g;

    C4383jb(JSONObject jSONObject) {
        this.f12925g = jSONObject;
        this.f12944b = this.f12925g.optBoolean("enterp", false);
        this.f12945c = this.f12925g.optBoolean("use_email_auth", false);
        this.f12946d = this.f12925g.optJSONArray("chnl_lst");
        this.f12947e = this.f12925g.optBoolean("fba", false);
        this.f12948f = this.f12925g.optBoolean("restore_ttl_filter", true);
        this.f12943a = this.f12925g.optString("android_sender_id", (String) null);
    }
}
