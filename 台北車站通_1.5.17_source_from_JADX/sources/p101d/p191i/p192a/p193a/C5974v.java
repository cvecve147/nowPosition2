package p101d.p191i.p192a.p193a;

import android.util.Log;
import org.apache.http.cookie.ClientCookie;
import org.json.JSONArray;
import org.json.JSONObject;
import p101d.p191i.p192a.p200e.C6016b;

/* renamed from: d.i.a.a.v */
class C5974v implements C6016b.C6017a {

    /* renamed from: a */
    final /* synthetic */ C5975w f16574a;

    C5974v(C5975w wVar) {
        this.f16574a = wVar;
    }

    /* renamed from: a */
    public void mo15792a(int i, String str, long j) {
        if (C5975w.f16576b) {
            String a = C5975w.f16575a;
            Log.d(a, "String: " + str.toString());
        }
    }

    /* renamed from: a */
    public void mo15793a(int i, JSONObject jSONObject, long j) {
        Log.d(C5975w.f16575a, "JSON: " + jSONObject.getJSONArray(ClientCookie.PATH_ATTR).toString());
        JSONArray jSONArray = jSONObject.getJSONArray(ClientCookie.PATH_ATTR);
        int length = jSONArray.length();
        if (length == 0) {
            this.f16574a.f16579e.mo15807c();
            this.f16574a.f16578d.mo15768a((int[]) null);
            return;
        }
        int i2 = length * 3;
        int[] iArr = new int[(i2 + 3)];
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = i3 * 3;
            iArr[i4] = jSONArray.getJSONObject(i3).getInt("x");
            iArr[i4 + 1] = jSONArray.getJSONObject(i3).getInt("y");
            iArr[i4 + 2] = ((Integer) this.f16574a.f16594t.get(Integer.valueOf(jSONArray.getJSONObject(i3).getInt("z")))).intValue();
        }
        iArr[i2 + 0] = (int) this.f16574a.f16578d.mo15761a().mo15921f().x;
        iArr[i2 + 1] = (int) this.f16574a.f16578d.mo15761a().mo15921f().y;
        iArr[i2 + 2] = this.f16574a.f16578d.mo15761a().mo15913a();
        if (this.f16574a.f16578d != null) {
            this.f16574a.f16578d.mo15768a(iArr);
            C5975w wVar = this.f16574a;
            wVar.m22608a(wVar.f16578d.mo15761a());
        }
        C5975w wVar2 = this.f16574a;
        wVar2.m22608a(wVar2.f16578d.mo15761a());
        if (C5975w.f16576b) {
            for (int i5 = 0; i5 < iArr.length / 3; i5++) {
                String a = C5975w.f16575a;
                StringBuilder sb = new StringBuilder();
                sb.append("raw_route:");
                int i6 = i5 * 3;
                sb.append(iArr[i6]);
                sb.append(", ");
                sb.append(iArr[i6 + 1]);
                sb.append(", ");
                sb.append(iArr[i6 + 2]);
                Log.d(a, sb.toString());
            }
        }
    }
}
