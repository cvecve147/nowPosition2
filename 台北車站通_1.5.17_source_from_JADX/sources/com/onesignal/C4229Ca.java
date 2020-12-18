package com.onesignal;

import org.json.JSONObject;

/* renamed from: com.onesignal.Ca */
public class C4229Ca {

    /* renamed from: a */
    OSSubscriptionState f12559a;

    /* renamed from: b */
    OSSubscriptionState f12560b;

    /* renamed from: a */
    public OSSubscriptionState mo12282a() {
        return this.f12560b;
    }

    /* renamed from: b */
    public OSSubscriptionState mo12283b() {
        return this.f12559a;
    }

    /* renamed from: c */
    public JSONObject mo12284c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("from", this.f12560b.mo12375g());
            jSONObject.put("to", this.f12559a.mo12375g());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return mo12284c().toString();
    }
}
