package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;
import org.json.JSONArray;
import org.json.JSONObject;
import p013b.p018b.p028h.p039h.C1101r;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.sa */
public final class C3456sa implements C3110ga<C3564vv> {

    /* renamed from: a */
    private final boolean f10177a;

    public C3456sa(boolean z) {
        this.f10177a = z;
    }

    /* renamed from: a */
    public final /* synthetic */ C2329Fv mo9445a(C2825X x, JSONObject jSONObject) {
        C1101r rVar = new C1101r();
        C1101r rVar2 = new C1101r();
        C2804Wf<C3306mv> a = x.mo9012a(jSONObject);
        C2804Wf<C3520uh> a2 = x.mo9013a(jSONObject, "video");
        JSONArray jSONArray = jSONObject.getJSONArray("custom_assets");
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            String string = jSONObject2.getString(SVGParser.XML_STYLESHEET_ATTR_TYPE);
            if ("string".equals(string)) {
                rVar2.put(jSONObject2.getString("name"), jSONObject2.getString("string_value"));
            } else if ("image".equals(string)) {
                rVar.put(jSONObject2.getString("name"), x.mo9016a(jSONObject2, "image_value", this.f10177a));
            } else {
                String valueOf = String.valueOf(string);
                C2227Cf.m9536d(valueOf.length() != 0 ? "Unknown custom asset type: ".concat(valueOf) : new String("Unknown custom asset type: "));
            }
        }
        C3520uh a3 = C2825X.m11524a(a2);
        String string2 = jSONObject.getString("custom_template_id");
        C1101r rVar3 = new C1101r();
        for (int i2 = 0; i2 < rVar.size(); i2++) {
            rVar3.put(rVar.mo5236b(i2), ((Future) rVar.mo5241d(i2)).get());
        }
        return new C3564vv(string2, rVar3, rVar2, (C3306mv) a.get(), a3 != null ? a3.mo8174jb() : null, a3 != null ? a3.getView() : null);
    }
}
