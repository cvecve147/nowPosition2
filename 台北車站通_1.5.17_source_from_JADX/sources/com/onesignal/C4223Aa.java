package com.onesignal;

import org.json.JSONObject;

/* renamed from: com.onesignal.Aa */
public class C4223Aa {

    /* renamed from: a */
    C4450za f12544a;

    /* renamed from: b */
    C4450za f12545b;

    /* renamed from: a */
    public JSONObject mo12274a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("from", this.f12545b.mo12558g());
            jSONObject.put("to", this.f12544a.mo12558g());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return mo12274a().toString();
    }
}
