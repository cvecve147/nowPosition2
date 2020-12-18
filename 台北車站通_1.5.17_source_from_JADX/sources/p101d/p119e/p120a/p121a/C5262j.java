package p101d.p119e.p120a.p121a;

import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;
import p101d.p119e.p120a.C5279l;
import p101d.p119e.p120a.C5281n;
import p101d.p119e.p120a.C5288s;

/* renamed from: d.e.a.a.j */
public class C5262j extends C5263k<JSONObject> {
    public C5262j(int i, String str, C5288s.C5290b<JSONObject> bVar, C5288s.C5289a aVar) {
        super(i, str, (String) null, bVar, aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C5288s<JSONObject> mo14590a(C5279l lVar) {
        C5281n nVar;
        try {
            return C5288s.m20458a(new JSONObject(new String(lVar.f14931b, C5258g.m20367a(lVar.f14932c, "utf-8"))), C5258g.m20365a(lVar));
        } catch (UnsupportedEncodingException e) {
            nVar = new C5281n(e);
            return C5288s.m20457a(nVar);
        } catch (JSONException e2) {
            nVar = new C5281n(e2);
            return C5288s.m20457a(nVar);
        }
    }
}
