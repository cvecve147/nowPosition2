package com.facebook;

import com.facebook.GraphRequest;

/* renamed from: com.facebook.Z */
class C1369Z implements Runnable {

    /* renamed from: a */
    final /* synthetic */ GraphRequest.C1350e f4864a;

    /* renamed from: b */
    final /* synthetic */ long f4865b;

    /* renamed from: c */
    final /* synthetic */ long f4866c;

    /* renamed from: d */
    final /* synthetic */ C1415aa f4867d;

    C1369Z(C1415aa aaVar, GraphRequest.C1350e eVar, long j, long j2) {
        this.f4867d = aaVar;
        this.f4864a = eVar;
        this.f4865b = j;
        this.f4866c = j2;
    }

    public void run() {
        this.f4864a.mo5976a(this.f4865b, this.f4866c);
    }
}
