package com.onesignal;

import org.json.JSONObject;

/* renamed from: com.onesignal.ga */
public class C4368ga {

    /* renamed from: a */
    String f12898a;

    /* renamed from: b */
    public String f12899b;

    /* renamed from: c */
    public C4369a f12900c;

    /* renamed from: d */
    public String f12901d;

    /* renamed from: e */
    public boolean f12902e;

    /* renamed from: f */
    public boolean f12903f;

    /* renamed from: com.onesignal.ga$a */
    public enum C4369a {
        IN_APP_WEBVIEW("webview"),
        BROWSER("browser"),
        REPLACE_CONTENT("replacement");
        

        /* renamed from: e */
        private String f12908e;

        private C4369a(String str) {
            this.f12908e = str;
        }

        /* renamed from: a */
        public static C4369a m17346a(String str) {
            for (C4369a aVar : values()) {
                if (aVar.f12908e.equalsIgnoreCase(str)) {
                    return aVar;
                }
            }
            return null;
        }

        public String toString() {
            return this.f12908e;
        }
    }

    C4368ga(JSONObject jSONObject) {
        this.f12898a = jSONObject.optString("id", (String) null);
        this.f12899b = jSONObject.optString("name", (String) null);
        this.f12901d = jSONObject.optString("url", (String) null);
        this.f12900c = C4369a.m17346a(jSONObject.optString("url_target", (String) null));
        if (this.f12900c == null) {
            this.f12900c = C4369a.IN_APP_WEBVIEW;
        }
        this.f12903f = jSONObject.optBoolean("close", true);
    }
}
