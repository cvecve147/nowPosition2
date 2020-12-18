package com.facebook.p060a;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.C1352H;
import com.facebook.C1355K;
import com.facebook.C1601x;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.internal.C1430A;
import com.facebook.internal.C1459P;
import com.facebook.internal.C1525y;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p013b.p018b.p028h.p029a.C1020d;

/* renamed from: com.facebook.a.n */
class C1402n {

    /* renamed from: a */
    private static final String f4926a = "com.facebook.a.n";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static volatile C1395g f4927b = new C1395g();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final ScheduledExecutorService f4928c = Executors.newSingleThreadScheduledExecutor();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static ScheduledFuture f4929d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final Runnable f4930e = new C1396h();

    /* renamed from: a */
    private static GraphRequest m6690a(C1387b bVar, C1414w wVar, boolean z, C1410t tVar) {
        String b = bVar.mo6046b();
        boolean z2 = false;
        C1525y a = C1430A.m6774a(b, false);
        GraphRequest a2 = GraphRequest.m6510a((AccessToken) null, String.format("%s/activities", new Object[]{b}), (JSONObject) null, (GraphRequest.C1347b) null);
        Bundle h = a2.mo5963h();
        if (h == null) {
            h = new Bundle();
        }
        h.putString("access_token", bVar.mo6045a());
        String d = C1406q.m6717d();
        if (d != null) {
            h.putString("device_token", d);
        }
        a2.mo5951a(h);
        if (a != null) {
            z2 = a.mo6253h();
        }
        int a3 = wVar.mo6076a(a2, C1601x.m7386b(), z2, z);
        if (a3 == 0) {
            return null;
        }
        tVar.f4955a += a3;
        a2.mo5952a((GraphRequest.C1347b) new C1400l(bVar, a2, wVar, tVar));
        return a2;
    }

    /* renamed from: a */
    private static C1410t m6692a(C1408r rVar, C1395g gVar) {
        C1410t tVar = new C1410t();
        boolean a = C1601x.m7384a(C1601x.m7386b());
        ArrayList<GraphRequest> arrayList = new ArrayList<>();
        for (C1387b next : gVar.mo6059b()) {
            GraphRequest a2 = m6690a(next, gVar.mo6056a(next), a, tVar);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        if (arrayList.size() <= 0) {
            return null;
        }
        C1459P.m6842a(C1355K.APP_EVENTS, f4926a, "Flushing %d events due to %s.", Integer.valueOf(tVar.f4955a), rVar.toString());
        for (GraphRequest a3 : arrayList) {
            a3.mo5950a();
        }
        return tVar;
    }

    /* renamed from: a */
    public static void m6696a(C1387b bVar, C1392f fVar) {
        f4928c.execute(new C1399k(bVar, fVar));
    }

    /* renamed from: a */
    public static void m6697a(C1408r rVar) {
        f4928c.execute(new C1398j(rVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m6699b(C1387b bVar, GraphRequest graphRequest, C1352H h, C1414w wVar, C1410t tVar) {
        String str;
        String str2;
        FacebookRequestError a = h.mo5987a();
        C1409s sVar = C1409s.SUCCESS;
        boolean z = true;
        if (a == null) {
            str = "Success";
        } else if (a.mo5916b() == -1) {
            sVar = C1409s.NO_CONNECTIVITY;
            str = "Failed: No Connectivity";
        } else {
            str = String.format("Failed:\n  Response: %s\n  Error %s", new Object[]{h.toString(), a.toString()});
            sVar = C1409s.SERVER_ERROR;
        }
        if (C1601x.m7385a(C1355K.APP_EVENTS)) {
            try {
                str2 = new JSONArray((String) graphRequest.mo5965j()).toString(2);
            } catch (JSONException unused) {
                str2 = "<Can't encode events for debug logging>";
            }
            C1459P.m6842a(C1355K.APP_EVENTS, f4926a, "Flush completed\nParams: %s\n  Result: %s\n  Events JSON: %s", graphRequest.mo5960e().toString(), str, str2);
        }
        if (a == null) {
            z = false;
        }
        wVar.mo6078a(z);
        if (sVar == C1409s.NO_CONNECTIVITY) {
            C1601x.m7395h().execute(new C1401m(bVar, wVar));
        }
        if (sVar != C1409s.SUCCESS && tVar.f4956b != C1409s.NO_CONNECTIVITY) {
            tVar.f4956b = sVar;
        }
    }

    /* renamed from: b */
    static void m6700b(C1408r rVar) {
        f4927b.mo6058a(C1403o.m6705a());
        try {
            C1410t a = m6692a(rVar, f4927b);
            if (a != null) {
                Intent intent = new Intent("com.facebook.sdk.APP_EVENTS_FLUSHED");
                intent.putExtra("com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED", a.f4955a);
                intent.putExtra("com.facebook.sdk.APP_EVENTS_FLUSH_RESULT", a.f4956b);
                C1020d.m5430a(C1601x.m7386b()).mo5020a(intent);
            }
        } catch (Exception e) {
            Log.w(f4926a, "Caught unexpected exception while flushing app events: ", e);
        }
    }

    /* renamed from: e */
    public static Set<C1387b> m6703e() {
        return f4927b.mo6059b();
    }

    /* renamed from: f */
    public static void m6704f() {
        f4928c.execute(new C1397i());
    }
}
