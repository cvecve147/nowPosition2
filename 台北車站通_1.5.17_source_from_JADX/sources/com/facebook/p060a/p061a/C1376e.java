package com.facebook.p060a.p061a;

import android.content.Context;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.facebook.a.a.e */
class C1376e implements Runnable {

    /* renamed from: a */
    final /* synthetic */ long f4876a;

    /* renamed from: b */
    final /* synthetic */ Context f4877b;

    /* renamed from: c */
    final /* synthetic */ String f4878c;

    C1376e(long j, Context context, String str) {
        this.f4876a = j;
        this.f4877b = context;
        this.f4878c = str;
    }

    public void run() {
        if (C1377f.f4883e == null) {
            C1382k unused = C1377f.f4883e = new C1382k(Long.valueOf(this.f4876a), (Long) null);
        }
        C1377f.f4883e.mo6034a(Long.valueOf(this.f4876a));
        if (C1377f.f4882d.get() <= 0) {
            ScheduledFuture unused2 = C1377f.f4881c = C1377f.f4880b.schedule(new C1375d(this), (long) C1377f.m6642i(), TimeUnit.SECONDS);
        }
        long f = C1377f.f4886h;
        long j = 0;
        if (f > 0) {
            j = (this.f4876a - f) / 1000;
        }
        C1379h.m6646a(this.f4878c, j);
        C1377f.f4883e.mo6042j();
    }
}
