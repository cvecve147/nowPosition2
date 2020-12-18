package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Lv */
final /* synthetic */ class C2501Lv implements C3003ci {

    /* renamed from: a */
    private final C2471Kv f7544a;

    /* renamed from: b */
    private final Map f7545b;

    /* renamed from: c */
    private final C3370pa f7546c;

    C2501Lv(C2471Kv kv, Map map, C3370pa paVar) {
        this.f7544a = kv;
        this.f7545b = map;
        this.f7546c = paVar;
    }

    /* renamed from: a */
    public final void mo7012a(boolean z) {
        C2471Kv kv = this.f7544a;
        Map map = this.f7545b;
        C3370pa paVar = this.f7546c;
        String unused = kv.f7480b.f7390b = (String) map.get("id");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("messageType", "htmlLoaded");
            jSONObject.put("id", kv.f7480b.f7390b);
            paVar.mo9855a("sendMessageToNativeJs", jSONObject);
        } catch (JSONException e) {
            C2227Cf.m9533b("Unable to dispatch sendMessageToNativeJs event", e);
        }
    }
}
