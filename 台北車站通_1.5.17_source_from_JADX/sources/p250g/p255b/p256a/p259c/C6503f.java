package p250g.p255b.p256a.p259c;

import p250g.p255b.p256a.C6497c;
import p250g.p255b.p256a.C6517d;
import p250g.p255b.p256a.C6570h;

/* renamed from: g.b.a.c.f */
public class C6503f extends C6501d {

    /* renamed from: c */
    final int f18050c;

    /* renamed from: d */
    final C6570h f18051d;

    /* renamed from: e */
    final C6570h f18052e;

    /* renamed from: f */
    private final int f18053f;

    /* renamed from: g */
    private final int f18054g;

    public C6503f(C6497c cVar, C6517d dVar, int i) {
        this(cVar, cVar.mo16745f(), dVar, i);
    }

    public C6503f(C6497c cVar, C6570h hVar, C6517d dVar, int i) {
        super(cVar, dVar);
        if (i >= 2) {
            C6570h a = cVar.mo16757a();
            if (a == null) {
                this.f18051d = null;
            } else {
                this.f18051d = new C6513o(a, dVar.mo16834E(), i);
            }
            this.f18052e = hVar;
            this.f18050c = i;
            int d = cVar.mo16743d();
            int i2 = d >= 0 ? d / i : ((d + 1) / i) - 1;
            int c = cVar.mo16742c();
            int i3 = c >= 0 ? c / i : ((c + 1) / i) - 1;
            this.f18053f = i2;
            this.f18054g = i3;
            return;
        }
        throw new IllegalArgumentException("The divisor must be at least 2");
    }

    /* renamed from: a */
    private int m24575a(int i) {
        if (i >= 0) {
            return i % this.f18050c;
        }
        int i2 = this.f18050c;
        return (i2 - 1) + ((i + 1) % i2);
    }

    /* renamed from: a */
    public int mo16740a(long j) {
        int a = mo16815i().mo16740a(j);
        return a >= 0 ? a / this.f18050c : ((a + 1) / this.f18050c) - 1;
    }

    /* renamed from: a */
    public long mo16747a(long j, int i) {
        return mo16815i().mo16747a(j, i * this.f18050c);
    }

    /* renamed from: a */
    public C6570h mo16757a() {
        return this.f18051d;
    }

    /* renamed from: b */
    public long mo16749b(long j, int i) {
        C6504g.m24589a(this, i, this.f18053f, this.f18054g);
        return mo16815i().mo16749b(j, (i * this.f18050c) + m24575a(mo16815i().mo16740a(j)));
    }

    /* renamed from: c */
    public int mo16742c() {
        return this.f18054g;
    }

    /* renamed from: c */
    public long mo16751c(long j) {
        return mo16749b(j, mo16740a(mo16815i().mo16751c(j)));
    }

    /* renamed from: d */
    public int mo16743d() {
        return this.f18053f;
    }

    /* renamed from: e */
    public long mo16752e(long j) {
        C6497c i = mo16815i();
        return i.mo16752e(i.mo16749b(j, mo16740a(j) * this.f18050c));
    }

    /* renamed from: f */
    public C6570h mo16745f() {
        C6570h hVar = this.f18052e;
        return hVar != null ? hVar : super.mo16745f();
    }
}
