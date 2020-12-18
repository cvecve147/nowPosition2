package p101d.p191i.p192a.p193a;

import android.content.Context;
import android.util.Log;
import org.json.JSONObject;
import p101d.p119e.p120a.C5288s;

/* renamed from: d.i.a.a.C */
class C5937C implements C5288s.C5290b<JSONObject> {

    /* renamed from: a */
    final /* synthetic */ Context f16456a;

    /* renamed from: b */
    final /* synthetic */ String f16457b;

    C5937C(Context context, String str) {
        this.f16456a = context;
        this.f16457b = str;
    }

    /* renamed from: a */
    public void mo14126a(JSONObject jSONObject) {
        String a = C5942H.f16462a;
        Log.d(a, "更新地圖資源: " + jSONObject.toString());
        C5942H.m22502b(C5942H.f16469h, "更新地圖資源...");
        C5942H.m22503b(this.f16456a, jSONObject, this.f16457b);
    }
}
