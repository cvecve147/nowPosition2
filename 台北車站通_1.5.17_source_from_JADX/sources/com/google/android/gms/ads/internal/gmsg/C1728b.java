package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ads.C2227Cf;
import com.google.android.gms.internal.ads.C2478La;
import com.google.android.gms.internal.ads.C3116gg;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;
import org.json.JSONException;
import org.json.JSONObject;

@C2478La
/* renamed from: com.google.android.gms.ads.internal.gmsg.b */
public final class C1728b implements C1718E<Object> {

    /* renamed from: a */
    private final HashMap<String, C3116gg<JSONObject>> f5691a = new HashMap<>();

    /* renamed from: a */
    public final Future<JSONObject> mo6934a(String str) {
        C3116gg ggVar = new C3116gg();
        this.f5691a.put(str, ggVar);
        return ggVar;
    }

    /* renamed from: b */
    public final void mo6935b(String str) {
        C3116gg ggVar = this.f5691a.get(str);
        if (ggVar == null) {
            C2227Cf.m9529a("Could not find the ad request for the corresponding ad response.");
            return;
        }
        if (!ggVar.isDone()) {
            ggVar.cancel(true);
        }
        this.f5691a.remove(str);
    }

    public final void zza(Object obj, Map<String, String> map) {
        String str = map.get("request_id");
        String str2 = map.get("fetched_ad");
        C2227Cf.m9532b("Received ad from the cache.");
        C3116gg ggVar = this.f5691a.get(str);
        if (ggVar == null) {
            C2227Cf.m9529a("Could not find the ad request for the corresponding ad response.");
            return;
        }
        try {
            ggVar.mo9464b(new JSONObject(str2));
        } catch (JSONException e) {
            C2227Cf.m9533b("Failed constructing JSON object from value passed from javascript", e);
            ggVar.mo9464b(null);
        } finally {
            this.f5691a.remove(str);
        }
    }
}
