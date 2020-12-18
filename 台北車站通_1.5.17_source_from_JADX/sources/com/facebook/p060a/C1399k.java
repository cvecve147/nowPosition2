package com.facebook.p060a;

import com.facebook.p060a.C1406q;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.facebook.a.k */
class C1399k implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1387b f4918a;

    /* renamed from: b */
    final /* synthetic */ C1392f f4919b;

    C1399k(C1387b bVar, C1392f fVar) {
        this.f4918a = bVar;
        this.f4919b = fVar;
    }

    public void run() {
        C1402n.f4927b.mo6057a(this.f4918a, this.f4919b);
        if (C1406q.m6716c() != C1406q.C1407a.EXPLICIT_ONLY && C1402n.f4927b.mo6055a() > 100) {
            C1402n.m6700b(C1408r.EVENT_THRESHOLD);
        } else if (C1402n.f4929d == null) {
            ScheduledFuture unused = C1402n.f4929d = C1402n.f4928c.schedule(C1402n.f4930e, 15, TimeUnit.SECONDS);
        }
    }
}
