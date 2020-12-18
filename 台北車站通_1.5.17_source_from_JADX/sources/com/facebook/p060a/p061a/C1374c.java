package com.facebook.p060a.p061a;

import android.content.Context;

/* renamed from: com.facebook.a.a.c */
class C1374c implements Runnable {

    /* renamed from: a */
    final /* synthetic */ long f4872a;

    /* renamed from: b */
    final /* synthetic */ Context f4873b;

    /* renamed from: c */
    final /* synthetic */ String f4874c;

    C1374c(long j, Context context, String str) {
        this.f4872a = j;
        this.f4873b = context;
        this.f4874c = str;
    }

    public void run() {
        if (C1377f.f4883e == null) {
            C1382k unused = C1377f.f4883e = new C1382k(Long.valueOf(this.f4872a), (Long) null);
            C1383l.m6663a(this.f4873b, this.f4874c, (C1385n) null, C1377f.f4885g);
        } else if (C1377f.f4883e.mo6038e() != null) {
            long longValue = this.f4872a - C1377f.f4883e.mo6038e().longValue();
            if (longValue > ((long) (C1377f.m6642i() * 1000))) {
                C1383l.m6662a(this.f4873b, this.f4874c, C1377f.f4883e, C1377f.f4885g);
                C1383l.m6663a(this.f4873b, this.f4874c, (C1385n) null, C1377f.f4885g);
                C1382k unused2 = C1377f.f4883e = new C1382k(Long.valueOf(this.f4872a), (Long) null);
            } else if (longValue > 1000) {
                C1377f.f4883e.mo6041i();
            }
        }
        C1377f.f4883e.mo6034a(Long.valueOf(this.f4872a));
        C1377f.f4883e.mo6042j();
    }
}
