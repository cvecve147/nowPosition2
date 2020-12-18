package p101d.p191i.p192a.p193a;

import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;
import p101d.p119e.p120a.C5288s;

/* renamed from: d.i.a.a.z */
class C5981z implements C5288s.C5290b<JSONObject> {

    /* renamed from: a */
    final /* synthetic */ String f16611a;

    /* renamed from: b */
    final /* synthetic */ C5934B f16612b;

    C5981z(C5934B b, String str) {
        this.f16612b = b;
        this.f16611a = str;
    }

    /* renamed from: a */
    public void mo14126a(JSONObject jSONObject) {
        try {
            this.f16612b.f16439d.put(this.f16611a, jSONObject.getString("FreeAmount"));
            Log.d(C5934B.f16436a, this.f16612b.f16439d.toString());
            this.f16612b.f16445j.mo15720b().mo15925a("buildingFreeNumber", this.f16612b.f16439d);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C5934B b = this.f16612b;
        Integer unused = b.f16447l = Integer.valueOf(b.f16447l.intValue() + 1);
        if (this.f16612b.f16447l == this.f16612b.f16446k) {
            this.f16612b.f16444i = false;
        }
    }
}
