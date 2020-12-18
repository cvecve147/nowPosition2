package p101d.p191i.p192a.p194b.p195a;

import android.graphics.Picture;
import android.graphics.PointF;
import android.util.Log;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p101d.p191i.p192a.p194b.p196b.p197a.C5992b;
import p101d.p191i.p192a.p194b.p196b.p197a.C5993c;
import p101d.p191i.p192a.p194b.p196b.p197a.C5995e;

/* renamed from: d.i.a.b.a.c */
class C5985c extends Thread {

    /* renamed from: a */
    final /* synthetic */ String f16615a;

    /* renamed from: b */
    final /* synthetic */ List f16616b;

    /* renamed from: c */
    final /* synthetic */ C5986d f16617c;

    C5985c(C5986d dVar, String str, List list) {
        this.f16617c = dVar;
        this.f16615a = str;
        this.f16616b = list;
    }

    public void run() {
        super.run();
        if (this.f16617c.f16632a) {
            Log.d("MapMainView", "svgPath: " + this.f16615a);
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(this.f16615a);
            C5993c cVar = new C5993c();
            cVar.mo15860a((InputStream) fileInputStream);
            cVar.mo15861a(true);
            C5992b a = this.f16616b == null ? cVar.mo15858a() : cVar.mo15859a((List<String>) this.f16616b);
            Picture b = a.mo15857b();
            if (this.f16617c.f16632a) {
                StringBuilder sb = new StringBuilder();
                sb.append("[DONE] svgPath: ");
                sb.append(this.f16615a);
                Log.e("MapMainView", sb.toString());
            }
            if (b != null) {
                if (this.f16617c.f16636e == null) {
                    C5989f unused = this.f16617c.f16636e = new C5989f(this.f16617c);
                    this.f16617c.getOverLays().add(this.f16617c.f16636e);
                    HashMap unused2 = this.f16617c.f16644m = new HashMap();
                    JSONArray jSONArray = new JSONArray(a.mo15854a());
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        float parseFloat = Float.parseFloat(jSONObject.getString("locX"));
                        float parseFloat2 = Float.parseFloat(jSONObject.getString("locY"));
                        this.f16617c.f16644m.put(jSONObject.getString("id"), new PointF(parseFloat, parseFloat2));
                        if (this.f16617c.f16632a) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Info[");
                            sb2.append(jSONObject.getString("id"));
                            sb2.append("] : ");
                            sb2.append(parseFloat);
                            sb2.append(", ");
                            sb2.append(parseFloat2);
                            Log.d("MapMainView", sb2.toString());
                        }
                    }
                }
                this.f16617c.f16636e.mo15847a(b);
                if (this.f16617c.f16632a) {
                    Log.i("MapMainView", "mapLoadFinished");
                }
                if (this.f16617c.f16633b != null) {
                    this.f16617c.f16633b.mo15776a(this.f16615a);
                }
                boolean unused3 = this.f16617c.f16642k = true;
            } else if (this.f16617c.f16633b != null) {
                this.f16617c.f16633b.mo15777b(this.f16615a);
            }
        } catch (C5995e e) {
            e.printStackTrace();
            this.f16617c.f16633b.mo15777b(this.f16615a);
        } catch (JSONException e2) {
            e2.printStackTrace();
            this.f16617c.f16633b.mo15777b(this.f16615a);
        } catch (NullPointerException e3) {
            e3.printStackTrace();
            this.f16617c.f16633b.mo15777b(this.f16615a);
        } catch (Exception e4) {
            e4.printStackTrace();
            this.f16617c.f16633b.mo15777b(this.f16615a);
        }
    }
}
