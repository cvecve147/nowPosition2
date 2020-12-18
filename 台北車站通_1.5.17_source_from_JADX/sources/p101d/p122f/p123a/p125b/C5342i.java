package p101d.p122f.p123a.p125b;

import org.json.JSONObject;

/* renamed from: d.f.a.b.i */
class C5342i {
    C5342i() {
    }

    /* renamed from: a */
    public C5341h mo14746a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new C5341h(jSONObject.optString("url", (String) null), jSONObject.optString("version_string", (String) null), jSONObject.optString("display_version", (String) null), jSONObject.optString("build_version", (String) null), jSONObject.optString("identifier", (String) null), jSONObject.optString("instance_identifier", (String) null));
    }
}
