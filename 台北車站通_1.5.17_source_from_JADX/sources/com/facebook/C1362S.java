package com.facebook;

import android.os.Handler;
import com.facebook.C1343G;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.util.Map;

/* renamed from: com.facebook.S */
class C1362S extends FilterOutputStream implements C1368Y {

    /* renamed from: a */
    private final Map<GraphRequest, C1415aa> f4856a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C1343G f4857b;

    /* renamed from: c */
    private final long f4858c = C1601x.m7398k();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public long f4859d;

    /* renamed from: e */
    private long f4860e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public long f4861f;

    /* renamed from: g */
    private C1415aa f4862g;

    C1362S(OutputStream outputStream, C1343G g, Map<GraphRequest, C1415aa> map, long j) {
        super(outputStream);
        this.f4857b = g;
        this.f4856a = map;
        this.f4861f = j;
    }

    /* renamed from: a */
    private void m6621a() {
        if (this.f4859d > this.f4860e) {
            for (C1343G.C1344a next : this.f4857b.mo5940g()) {
                if (next instanceof C1343G.C1345b) {
                    Handler f = this.f4857b.mo5939f();
                    C1343G.C1345b bVar = (C1343G.C1345b) next;
                    if (f == null) {
                        bVar.mo5949a(this.f4857b, this.f4859d, this.f4861f);
                    } else {
                        f.post(new C1361Q(this, bVar));
                    }
                }
            }
            this.f4860e = this.f4859d;
        }
    }

    /* renamed from: a */
    private void m6622a(long j) {
        C1415aa aaVar = this.f4862g;
        if (aaVar != null) {
            aaVar.mo6081a(j);
        }
        this.f4859d += j;
        long j2 = this.f4859d;
        if (j2 >= this.f4860e + this.f4858c || j2 >= this.f4861f) {
            m6621a();
        }
    }

    /* renamed from: a */
    public void mo6004a(GraphRequest graphRequest) {
        this.f4862g = graphRequest != null ? this.f4856a.get(graphRequest) : null;
    }

    public void close() {
        super.close();
        for (C1415aa a : this.f4856a.values()) {
            a.mo6080a();
        }
        m6621a();
    }

    public void write(int i) {
        this.out.write(i);
        m6622a(1);
    }

    public void write(byte[] bArr) {
        this.out.write(bArr);
        m6622a((long) bArr.length);
    }

    public void write(byte[] bArr, int i, int i2) {
        this.out.write(bArr, i, i2);
        m6622a((long) i2);
    }
}
