package com.onesignal;

import com.onesignal.C4327Zb;
import com.onesignal.C4416rb;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onesignal.Tb */
class C4295Tb extends C4327Zb {
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static boolean f12723j;

    C4295Tb() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C4280Ob mo12395a(String str, boolean z) {
        return new C4289Rb(str, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12396a(String str) {
        C4306Xa.m17181g(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12397a(JSONObject jSONObject) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo12398b() {
        return C4306Xa.m17208v();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo12399b(JSONObject jSONObject) {
        if (jSONObject.has("email")) {
            C4306Xa.m17190k();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo12400c(JSONObject jSONObject) {
        if (jSONObject.has("email")) {
            C4306Xa.m17192l();
        }
        if (jSONObject.has("identifier")) {
            C4306Xa.m17194m();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C4327Zb.C4328a mo12415d(boolean z) {
        C4327Zb.C4328a aVar;
        if (z) {
            String v = C4306Xa.m17208v();
            String s = C4306Xa.m17205s();
            C4416rb.m17505b("players/" + v + "?app_id=" + s, (C4416rb.C4417a) new C4292Sb(this), "CACHE_KEY_GET_TAGS");
        }
        synchronized (this.f12827b) {
            aVar = new C4327Zb.C4328a(f12723j, C4255J.m16898a(this.f12834i.f12694f, "tags"));
        }
        return aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo12416e(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt("identifier", jSONObject.optString("identifier", (String) null));
            if (jSONObject.has("device_type")) {
                jSONObject2.put("device_type", jSONObject.optInt("device_type"));
            }
            jSONObject2.putOpt("parent_player_id", jSONObject.optString("parent_player_id", (String) null));
            JSONObject jSONObject3 = mo12449f().f12694f;
            mo12441a(jSONObject3, jSONObject2, jSONObject3, (Set<String>) null);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        try {
            JSONObject jSONObject4 = new JSONObject();
            if (jSONObject.has("subscribableStatus")) {
                jSONObject4.put("subscribableStatus", jSONObject.optInt("subscribableStatus"));
            }
            if (jSONObject.has("androidPermission")) {
                jSONObject4.put("androidPermission", jSONObject.optBoolean("androidPermission"));
            }
            JSONObject jSONObject5 = mo12449f().f12693e;
            mo12441a(jSONObject5, jSONObject4, jSONObject5, (Set<String>) null);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: e */
    public void mo12417e(boolean z) {
        try {
            mo12449f().f12693e.put("androidPermission", z);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo12401j() {
        mo12440a((Integer) 0).mo12455b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo12402l() {
        return mo12448e().mo12385b();
    }

    /* renamed from: m */
    public boolean mo12418m() {
        return mo12448e().f12693e.optBoolean("userSubscribePref", true);
    }
}
