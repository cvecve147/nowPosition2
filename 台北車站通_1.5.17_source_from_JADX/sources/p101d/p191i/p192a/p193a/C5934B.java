package p101d.p191i.p192a.p193a;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p101d.p119e.p120a.C5288s;
import p101d.p119e.p120a.C5295x;
import p101d.p119e.p120a.p121a.C5262j;
import p101d.p191i.p192a.C5931a;

/* renamed from: d.i.a.a.B */
public class C5934B {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static String f16436a = "STOParkingManagement";

    /* renamed from: b */
    private static HashMap<String, String> f16437b = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public JSONObject f16438c = null;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public JSONObject f16439d = null;

    /* renamed from: e */
    private JSONArray f16440e;

    /* renamed from: f */
    public Boolean f16441f = true;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Integer f16442g = 50000;

    /* renamed from: h */
    public Boolean f16443h = false;

    /* renamed from: i */
    public Boolean f16444i = false;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C5931a f16445j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public Integer f16446k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public Integer f16447l;

    /* renamed from: m */
    private HashMap<String, Integer> f16448m = new HashMap<>();

    /* renamed from: n */
    private HashMap<String, Integer> f16449n = new HashMap<>();

    /* renamed from: d.i.a.a.B$a */
    private class C5935a implements C5288s.C5290b<JSONObject> {

        /* renamed from: a */
        private String f16450a;

        /* renamed from: b */
        private String f16451b;

        public C5935a(String str, String str2) {
            this.f16450a = str2;
            this.f16451b = str;
        }

        /* renamed from: a */
        public void mo14126a(JSONObject jSONObject) {
            String a = C5934B.f16436a;
            Log.d(a, "Update " + this.f16451b + "-" + this.f16450a);
            try {
                if (!C5934B.this.f16438c.has(this.f16451b)) {
                    C5934B.this.f16438c.put(this.f16451b, new JSONObject());
                }
                JSONArray jSONArray = jSONObject.getJSONArray("data");
                JSONObject jSONObject2 = new JSONObject();
                String format = new SimpleDateFormat("MM月dd日HH:mm").format(new Date());
                jSONObject2.put("data", jSONArray);
                jSONObject2.put("datetime", format);
                jSONObject2.put("freeCnt", jSONArray.length());
                C5934B.this.f16438c.getJSONObject(this.f16451b).put(this.f16450a, jSONObject2);
                C5934B.this.f16445j.mo15720b().mo15925a("freeSpace", C5934B.this.f16438c);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            C5934B.this.m22469a(this.f16451b);
        }
    }

    /* renamed from: d.i.a.a.B$b */
    private class C5936b implements C5288s.C5289a {

        /* renamed from: a */
        private String f16453a;

        /* renamed from: b */
        private String f16454b;

        public C5936b(String str, String str2) {
            this.f16453a = str2;
            this.f16454b = str;
        }

        /* renamed from: a */
        public void mo14131a(C5295x xVar) {
            String a = C5934B.f16436a;
            Log.e(a, "更新車格狀態錯誤：" + this.f16454b + "-" + this.f16453a);
            C5934B.this.m22469a(this.f16454b);
        }
    }

    public C5934B(Context context) {
        this.f16445j = new C5931a(context);
        this.f16440e = this.f16445j.f16403I;
        f16437b.put("B1", "地下一樓");
        f16437b.put("B2", "地下二樓");
        f16437b.put("B3", "地下三樓");
        f16437b.put("B4", "地下四樓");
        f16437b.put("B5", "地下五樓");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m22469a(String str) {
        boolean z;
        this.f16449n.put(str, Integer.valueOf(this.f16449n.get(str).intValue() + 1));
        Iterator<String> it = this.f16448m.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            String next = it.next();
            if (this.f16449n.get(next) != this.f16448m.get(next)) {
                z = true;
                break;
            }
        }
        this.f16443h = z;
    }

    /* renamed from: a */
    private void m22470a(String str, JSONObject jSONObject, Boolean bool) {
        if (this.f16438c == null) {
            this.f16438c = this.f16445j.mo15720b().mo15929b("freeSpace");
        }
        if (!(!bool.booleanValue()) || !this.f16443h.booleanValue()) {
            this.f16443h = true;
            this.f16448m.put(str, Integer.valueOf(jSONObject.length()));
            this.f16449n.put(str, 0);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                try {
                    String string = jSONObject.getString(keys.next());
                    this.f16445j.mo15714a().mo15734a(new C5262j(0, this.f16445j.mo15716a(str, f16437b.get(string)), new C5935a(str, string), new C5936b(str, string)));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m22473c() {
        if (!this.f16444i.booleanValue()) {
            this.f16444i = true;
            this.f16446k = Integer.valueOf(this.f16440e.length());
            this.f16447l = 0;
            if (this.f16439d == null) {
                this.f16439d = new JSONObject();
            }
            for (int i = 0; i < this.f16440e.length(); i++) {
                try {
                    String string = this.f16440e.getJSONObject(i).getString("buildingID");
                    this.f16445j.mo15714a().mo15734a(new C5262j(0, this.f16445j.mo15715a(string), new C5981z(this, string), new C5933A(this, string)));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m22475d() {
        if (!this.f16443h.booleanValue()) {
            this.f16443h = true;
            this.f16445j.mo15720b().mo15927a("freeSpace");
            this.f16438c = new JSONObject();
            for (int i = 0; i < this.f16440e.length(); i++) {
                try {
                    m22470a(this.f16440e.getJSONObject(i).getString("buildingID"), this.f16440e.getJSONObject(i).getJSONObject("floorList"), true);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    public void mo15735a(Boolean bool, Boolean bool2) {
        Handler handler = new Handler();
        handler.postDelayed(new C5980y(this, bool, bool2, handler), (long) this.f16442g.intValue());
    }

    /* renamed from: a */
    public void mo15736a(String str, String str2, C5288s.C5290b<JSONObject> bVar, C5288s.C5289a aVar) {
        String country = Locale.getDefault().getCountry();
        if (country == null) {
            country = "TW";
        }
        boolean z = true;
        boolean z2 = (country.compareTo("TW") != 0) & (country.compareTo("CN") != 0) & (country.compareTo("KR") != 0);
        if (country.compareTo("JP") == 0) {
            z = false;
        }
        if (z2 && z) {
            country = "EN";
        }
        Log.d(f16436a, country);
        this.f16445j.mo15714a().mo15734a(new C5262j(0, this.f16445j.mo15723b(str, str2, country), bVar, aVar));
    }

    /* renamed from: a */
    public void mo15737a(String str, String str2, String str3, C5288s.C5290b<JSONObject> bVar, C5288s.C5289a aVar) {
        this.f16445j.mo15714a().mo15734a(new C5262j(0, this.f16445j.mo15717a(str, str3, str2), bVar, aVar));
    }

    /* renamed from: b */
    public JSONObject mo15738b() {
        JSONObject b = this.f16445j.mo15720b().mo15929b("buildingFreeNumber");
        return b == null ? new JSONObject() : b;
    }

    /* renamed from: b */
    public void mo15739b(Boolean bool, Boolean bool2) {
        if (bool.booleanValue()) {
            m22473c();
        }
        if (bool2.booleanValue()) {
            m22475d();
        }
        mo15735a(bool, bool2);
    }
}
