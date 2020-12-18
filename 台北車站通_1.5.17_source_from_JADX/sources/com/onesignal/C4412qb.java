package com.onesignal;

import com.onesignal.C4416rb;

/* renamed from: com.onesignal.qb */
class C4412qb implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C4416rb.C4417a f13010a;

    /* renamed from: b */
    final /* synthetic */ int f13011b;

    /* renamed from: c */
    final /* synthetic */ String f13012c;

    /* renamed from: d */
    final /* synthetic */ Throwable f13013d;

    C4412qb(C4416rb.C4417a aVar, int i, String str, Throwable th) {
        this.f13010a = aVar;
        this.f13011b = i;
        this.f13012c = str;
        this.f13013d = th;
    }

    public void run() {
        this.f13010a.mo12377a(this.f13011b, this.f13012c, this.f13013d);
    }
}
