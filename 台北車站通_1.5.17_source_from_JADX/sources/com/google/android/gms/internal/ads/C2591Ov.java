package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.C1718E;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Ov */
final class C2591Ov implements C1718E<Object> {

    /* renamed from: a */
    private final /* synthetic */ C3370pa f8080a;

    /* renamed from: b */
    private final /* synthetic */ C2443Jv f8081b;

    C2591Ov(C2443Jv jv, C3370pa paVar) {
        this.f8081b = jv;
        this.f8080a = paVar;
    }

    public final void zza(Object obj, Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        try {
            for (String next : map.keySet()) {
                jSONObject.put(next, map.get(next));
            }
            jSONObject.put("id", this.f8081b.f7390b);
            this.f8080a.mo9855a("sendMessageToNativeJs", jSONObject);
        } catch (JSONException e) {
            C2227Cf.m9533b("Unable to dispatch sendMessageToNativeJs event", e);
        }
    }
}
