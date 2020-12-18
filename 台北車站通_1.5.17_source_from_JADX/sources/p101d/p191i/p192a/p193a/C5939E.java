package p101d.p191i.p192a.p193a;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p101d.p119e.p120a.C5288s;
import p101d.p191i.p192a.p200e.C6021e;

/* renamed from: d.i.a.a.E */
class C5939E implements C5288s.C5290b<JSONObject> {

    /* renamed from: a */
    final /* synthetic */ JSONArray f16459a;

    /* renamed from: b */
    final /* synthetic */ int f16460b;

    C5939E(JSONArray jSONArray, int i) {
        this.f16459a = jSONArray;
        this.f16460b = i;
    }

    /* renamed from: a */
    public void mo14126a(JSONObject jSONObject) {
        try {
            C6021e b = C5942H.f16465d.mo15720b();
            StringBuilder sb = new StringBuilder();
            sb.append("BEACON_");
            sb.append(this.f16459a.get(this.f16460b));
            b.mo15925a(sb.toString(), jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
