package com.facebook.p060a.p061a;

import android.content.Context;

/* renamed from: com.facebook.a.a.b */
class C1373b implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f4868a;

    /* renamed from: b */
    final /* synthetic */ String f4869b;

    /* renamed from: c */
    final /* synthetic */ long f4870c;

    /* renamed from: d */
    final /* synthetic */ C1385n f4871d;

    C1373b(Context context, String str, long j, C1385n nVar) {
        this.f4868a = context;
        this.f4869b = str;
        this.f4870c = j;
        this.f4871d = nVar;
    }

    public void run() {
        if (C1377f.f4883e == null) {
            C1382k h = C1382k.m6649h();
            if (h != null) {
                C1383l.m6662a(this.f4868a, this.f4869b, h, C1377f.f4885g);
            }
            C1382k unused = C1377f.f4883e = new C1382k(Long.valueOf(this.f4870c), (Long) null);
            C1377f.f4883e.mo6033a(this.f4871d);
            C1383l.m6663a(this.f4868a, this.f4869b, this.f4871d, C1377f.f4885g);
        }
    }
}
