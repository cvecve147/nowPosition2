package com.facebook.p060a.p061a;

import java.util.concurrent.ScheduledFuture;

/* renamed from: com.facebook.a.a.d */
class C1375d implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1376e f4875a;

    C1375d(C1376e eVar) {
        this.f4875a = eVar;
    }

    public void run() {
        if (C1377f.f4882d.get() <= 0) {
            C1376e eVar = this.f4875a;
            C1383l.m6662a(eVar.f4877b, eVar.f4878c, C1377f.f4883e, C1377f.f4885g);
            C1382k.m6648a();
            C1382k unused = C1377f.f4883e = null;
        }
        ScheduledFuture unused2 = C1377f.f4881c = null;
    }
}
