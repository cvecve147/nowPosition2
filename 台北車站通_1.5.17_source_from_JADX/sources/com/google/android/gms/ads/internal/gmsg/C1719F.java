package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ads.C2227Cf;
import com.google.android.gms.internal.ads.C2991by;
import com.google.android.gms.internal.ads.C3114ge;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.internal.gmsg.F */
final class C1719F implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ Map f5671a;

    /* renamed from: b */
    final /* synthetic */ C2991by f5672b;

    /* renamed from: c */
    private final /* synthetic */ HttpClient f5673c;

    C1719F(HttpClient httpClient, Map map, C2991by byVar) {
        this.f5673c = httpClient;
        this.f5671a = map;
        this.f5672b = byVar;
    }

    public final void run() {
        C2227Cf.m9532b("Received Http request.");
        try {
            JSONObject send = this.f5673c.send(new JSONObject((String) this.f5671a.get("http_request")));
            if (send == null) {
                C2227Cf.m9529a("Response should not be null.");
            } else {
                C3114ge.f9351a.post(new C1720G(this, send));
            }
        } catch (Exception e) {
            C2227Cf.m9533b("Error converting request to json.", e);
        }
    }
}
