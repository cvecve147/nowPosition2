package p101d.p191i.p192a.p193a;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: d.i.a.a.f */
class C5950f implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f16487a;

    /* renamed from: b */
    final /* synthetic */ JSONObject f16488b;

    /* renamed from: c */
    final /* synthetic */ C5961q f16489c;

    C5950f(C5961q qVar, String str, JSONObject jSONObject) {
        this.f16489c = qVar;
        this.f16487a = str;
        this.f16488b = jSONObject;
    }

    public void run() {
        try {
            this.f16489c.m22534a(this.f16487a, this.f16488b.getJSONObject(this.f16487a).getJSONArray("PoiDetail"));
            this.f16489c.m22539b(this.f16487a, this.f16488b.getJSONObject(this.f16487a).getJSONArray("RoiDetail"));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
