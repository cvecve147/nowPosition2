package com.onesignal;

import org.json.JSONObject;

/* renamed from: com.onesignal.ea */
public class C4360ea implements Cloneable {

    /* renamed from: a */
    C4447ya<Object, C4360ea> f12884a = new C4447ya<>("changed", false);

    /* renamed from: b */
    private String f12885b;

    /* renamed from: c */
    private String f12886c;

    C4360ea(boolean z) {
        String str;
        if (z) {
            this.f12885b = C4370gb.m17351a(C4370gb.f12909a, "PREFS_ONESIGNAL_EMAIL_ID_LAST", (String) null);
            str = C4370gb.m17351a(C4370gb.f12909a, "PREFS_ONESIGNAL_EMAIL_ADDRESS_LAST", (String) null);
        } else {
            this.f12885b = C4306Xa.m17197o();
            str = C4421sb.m17513a().mo12445c();
        }
        this.f12886c = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12490a(String str) {
        boolean z = !str.equals(this.f12885b);
        this.f12885b = str;
        if (z) {
            this.f12884a.mo12553c(this);
        }
    }

    /* access modifiers changed from: protected */
    public Object clone() {
        try {
            return super.clone();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    public boolean mo12492d() {
        return (this.f12885b == null || this.f12886c == null) ? false : true;
    }

    /* renamed from: e */
    public JSONObject mo12493e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("emailUserId", this.f12885b != null ? this.f12885b : JSONObject.NULL);
            jSONObject.put("emailAddress", this.f12886c != null ? this.f12886c : JSONObject.NULL);
            jSONObject.put("subscribed", mo12492d());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return mo12493e().toString();
    }
}
