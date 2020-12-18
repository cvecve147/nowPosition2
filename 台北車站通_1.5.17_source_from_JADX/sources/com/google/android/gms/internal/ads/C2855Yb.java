package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Yb */
public final class C2855Yb {

    /* renamed from: a */
    private final List<String> f8638a;

    /* renamed from: b */
    private final String f8639b;

    /* renamed from: c */
    private final String f8640c;

    /* renamed from: d */
    private final String f8641d;

    /* renamed from: e */
    private final boolean f8642e;

    /* renamed from: f */
    private final String f8643f;

    /* renamed from: g */
    private final String f8644g;

    /* renamed from: h */
    private String f8645h;

    /* renamed from: i */
    private final int f8646i;

    /* renamed from: j */
    private final boolean f8647j;

    /* renamed from: k */
    private final JSONObject f8648k;

    public C2855Yb(int i, Map<String, String> map) {
        this.f8645h = map.get("url");
        this.f8639b = map.get("base_uri");
        this.f8640c = map.get("post_parameters");
        this.f8642e = m11600b(map.get("drt_include"));
        this.f8643f = map.get("request_id");
        this.f8641d = map.get(SVGParser.XML_STYLESHEET_ATTR_TYPE);
        this.f8638a = m11601c(map.get("errors"));
        this.f8646i = i;
        this.f8644g = map.get("fetched_ad");
        this.f8647j = m11600b(map.get("render_test_ad_label"));
        this.f8648k = new JSONObject();
    }

    public C2855Yb(JSONObject jSONObject) {
        this.f8645h = jSONObject.optString("url");
        this.f8639b = jSONObject.optString("base_uri");
        this.f8640c = jSONObject.optString("post_parameters");
        this.f8642e = m11600b(jSONObject.optString("drt_include"));
        this.f8643f = jSONObject.optString("request_id");
        this.f8641d = jSONObject.optString(SVGParser.XML_STYLESHEET_ATTR_TYPE);
        this.f8638a = m11601c(jSONObject.optString("errors"));
        this.f8646i = jSONObject.optInt("valid", 0) == 1 ? -2 : 1;
        this.f8644g = jSONObject.optString("fetched_ad");
        this.f8647j = jSONObject.optBoolean("render_test_ad_label");
        JSONObject optJSONObject = jSONObject.optJSONObject("preprocessor_flags");
        this.f8648k = optJSONObject == null ? new JSONObject() : optJSONObject;
    }

    /* renamed from: b */
    private static boolean m11600b(String str) {
        if (str != null) {
            return str.equals("1") || str.equals("true");
        }
        return false;
    }

    /* renamed from: c */
    private static List<String> m11601c(String str) {
        if (str == null) {
            return null;
        }
        return Arrays.asList(str.split(","));
    }

    /* renamed from: a */
    public final int mo9054a() {
        return this.f8646i;
    }

    /* renamed from: a */
    public final void mo9055a(String str) {
        this.f8645h = str;
    }

    /* renamed from: b */
    public final String mo9056b() {
        return this.f8641d;
    }

    /* renamed from: c */
    public final String mo9057c() {
        return this.f8645h;
    }

    /* renamed from: d */
    public final List<String> mo9058d() {
        return this.f8638a;
    }

    /* renamed from: e */
    public final String mo9059e() {
        return this.f8639b;
    }

    /* renamed from: f */
    public final String mo9060f() {
        return this.f8640c;
    }

    /* renamed from: g */
    public final boolean mo9061g() {
        return this.f8642e;
    }

    /* renamed from: h */
    public final String mo9062h() {
        return this.f8643f;
    }

    /* renamed from: i */
    public final String mo9063i() {
        return this.f8644g;
    }

    /* renamed from: j */
    public final boolean mo9064j() {
        return this.f8647j;
    }
}
