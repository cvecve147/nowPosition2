package com.facebook;

import android.os.Handler;
import com.facebook.GraphRequest;

/* renamed from: com.facebook.aa */
class C1415aa {

    /* renamed from: a */
    private final GraphRequest f4965a;

    /* renamed from: b */
    private final Handler f4966b;

    /* renamed from: c */
    private final long f4967c = C1601x.m7398k();

    /* renamed from: d */
    private long f4968d;

    /* renamed from: e */
    private long f4969e;

    /* renamed from: f */
    private long f4970f;

    C1415aa(Handler handler, GraphRequest graphRequest) {
        this.f4965a = graphRequest;
        this.f4966b = handler;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6080a() {
        if (this.f4968d > this.f4969e) {
            GraphRequest.C1347b d = this.f4965a.mo5959d();
            long j = this.f4970f;
            if (j > 0 && (d instanceof GraphRequest.C1350e)) {
                long j2 = this.f4968d;
                GraphRequest.C1350e eVar = (GraphRequest.C1350e) d;
                Handler handler = this.f4966b;
                if (handler == null) {
                    eVar.mo5976a(j2, j);
                } else {
                    handler.post(new C1369Z(this, eVar, j2, j));
                }
                this.f4969e = this.f4968d;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6081a(long j) {
        this.f4968d += j;
        long j2 = this.f4968d;
        if (j2 >= this.f4969e + this.f4967c || j2 >= this.f4970f) {
            mo6080a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo6082b(long j) {
        this.f4970f += j;
    }
}
