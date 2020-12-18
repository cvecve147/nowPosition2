package com.facebook.internal;

import com.facebook.C1352H;
import com.facebook.C1574p;
import com.facebook.C1575q;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.internal.C1496ha;
import java.util.concurrent.CountDownLatch;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.ia */
class C1502ia implements GraphRequest.C1347b {

    /* renamed from: a */
    final /* synthetic */ String[] f5171a;

    /* renamed from: b */
    final /* synthetic */ int f5172b;

    /* renamed from: c */
    final /* synthetic */ CountDownLatch f5173c;

    /* renamed from: d */
    final /* synthetic */ C1496ha.C1500d f5174d;

    C1502ia(C1496ha.C1500d dVar, String[] strArr, int i, CountDownLatch countDownLatch) {
        this.f5174d = dVar;
        this.f5171a = strArr;
        this.f5172b = i;
        this.f5173c = countDownLatch;
    }

    /* renamed from: a */
    public void mo5885a(C1352H h) {
        try {
            FacebookRequestError a = h.mo5987a();
            if (a != null) {
                String c = a.mo5917c();
                if (c == null) {
                    c = "Error staging photo.";
                }
                throw new C1575q(h, c);
            }
            JSONObject b = h.mo5988b();
            if (b != null) {
                String optString = b.optString("uri");
                if (optString != null) {
                    this.f5171a[this.f5172b] = optString;
                    this.f5173c.countDown();
                    return;
                }
                throw new C1574p("Error staging photo.");
            }
            throw new C1574p("Error staging photo.");
        } catch (Exception e) {
            this.f5174d.f5169c[this.f5172b] = e;
        }
    }
}
