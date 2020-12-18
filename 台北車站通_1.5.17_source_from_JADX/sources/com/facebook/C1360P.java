package com.facebook;

import android.os.Handler;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.P */
class C1360P extends OutputStream implements C1368Y {

    /* renamed from: a */
    private final Map<GraphRequest, C1415aa> f4843a = new HashMap();

    /* renamed from: b */
    private final Handler f4844b;

    /* renamed from: c */
    private GraphRequest f4845c;

    /* renamed from: d */
    private C1415aa f4846d;

    /* renamed from: e */
    private int f4847e;

    C1360P(Handler handler) {
        this.f4844b = handler;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo6002a() {
        return this.f4847e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6003a(long j) {
        if (this.f4846d == null) {
            this.f4846d = new C1415aa(this.f4844b, this.f4845c);
            this.f4843a.put(this.f4845c, this.f4846d);
        }
        this.f4846d.mo6082b(j);
        this.f4847e = (int) (((long) this.f4847e) + j);
    }

    /* renamed from: a */
    public void mo6004a(GraphRequest graphRequest) {
        this.f4845c = graphRequest;
        this.f4846d = graphRequest != null ? this.f4843a.get(graphRequest) : null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Map<GraphRequest, C1415aa> mo6005b() {
        return this.f4843a;
    }

    public void write(int i) {
        mo6003a(1);
    }

    public void write(byte[] bArr) {
        mo6003a((long) bArr.length);
    }

    public void write(byte[] bArr, int i, int i2) {
        mo6003a((long) i2);
    }
}
