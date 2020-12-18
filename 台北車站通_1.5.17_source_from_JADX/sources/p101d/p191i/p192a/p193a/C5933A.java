package p101d.p191i.p192a.p193a;

import android.util.Log;
import org.json.JSONException;
import p101d.p119e.p120a.C5288s;
import p101d.p119e.p120a.C5295x;

/* renamed from: d.i.a.a.A */
class C5933A implements C5288s.C5289a {

    /* renamed from: a */
    final /* synthetic */ String f16434a;

    /* renamed from: b */
    final /* synthetic */ C5934B f16435b;

    C5933A(C5934B b, String str) {
        this.f16435b = b;
        this.f16434a = str;
    }

    /* renamed from: a */
    public void mo14131a(C5295x xVar) {
        Log.d(C5934B.f16436a, "取得停車場空格數失敗，請稍候再試。");
        try {
            this.f16435b.f16439d.put(this.f16434a, "--");
            Log.d(C5934B.f16436a, this.f16435b.f16439d.toString());
            this.f16435b.f16445j.mo15720b().mo15925a("buildingFreeNumber", this.f16435b.f16439d);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C5934B b = this.f16435b;
        Integer unused = b.f16447l = Integer.valueOf(b.f16447l.intValue() + 1);
        if (this.f16435b.f16447l == this.f16435b.f16446k) {
            this.f16435b.f16444i = false;
        }
    }
}
