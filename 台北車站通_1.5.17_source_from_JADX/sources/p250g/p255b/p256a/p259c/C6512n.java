package p250g.p255b.p256a.p259c;

import p250g.p255b.p256a.C6497c;
import p250g.p255b.p256a.C6517d;
import p250g.p255b.p256a.C6570h;

/* renamed from: g.b.a.c.n */
public class C6512n extends C6501d {

    /* renamed from: c */
    final int f18067c;

    /* renamed from: d */
    final C6570h f18068d;

    /* renamed from: e */
    final C6570h f18069e;

    public C6512n(C6503f fVar) {
        this(fVar, fVar.mo16792g());
    }

    public C6512n(C6503f fVar, C6517d dVar) {
        this(fVar, fVar.mo16815i().mo16757a(), dVar);
    }

    public C6512n(C6503f fVar, C6570h hVar, C6517d dVar) {
        super(fVar.mo16815i(), dVar);
        this.f18067c = fVar.f18050c;
        this.f18068d = hVar;
        this.f18069e = fVar.f18051d;
    }

    public C6512n(C6497c cVar, C6570h hVar, C6517d dVar, int i) {
        super(cVar, dVar);
        if (i >= 2) {
            this.f18069e = hVar;
            this.f18068d = cVar.mo16757a();
            this.f18067c = i;
            return;
        }
        throw new IllegalArgumentException("The divisor must be at least 2");
    }

    /* renamed from: a */
    private int m24634a(int i) {
        return i >= 0 ? i / this.f18067c : ((i + 1) / this.f18067c) - 1;
    }

    /* renamed from: a */
    public int mo16740a(long j) {
        int a = mo16815i().mo16740a(j);
        if (a >= 0) {
            return a % this.f18067c;
        }
        int i = this.f18067c;
        return (i - 1) + ((a + 1) % i);
    }

    /* renamed from: a */
    public C6570h mo16757a() {
        return this.f18068d;
    }

    /* renamed from: b */
    public long mo16749b(long j, int i) {
        C6504g.m24589a(this, i, 0, this.f18067c - 1);
        return mo16815i().mo16749b(j, (m24634a(mo16815i().mo16740a(j)) * this.f18067c) + i);
    }

    /* renamed from: c */
    public int mo16742c() {
        return this.f18067c - 1;
    }

    /* renamed from: c */
    public long mo16751c(long j) {
        return mo16815i().mo16751c(j);
    }

    /* renamed from: d */
    public int mo16743d() {
        return 0;
    }

    /* renamed from: d */
    public long mo16753d(long j) {
        return mo16815i().mo16753d(j);
    }

    /* renamed from: e */
    public long mo16752e(long j) {
        return mo16815i().mo16752e(j);
    }

    /* renamed from: f */
    public long mo16758f(long j) {
        return mo16815i().mo16758f(j);
    }

    /* renamed from: f */
    public C6570h mo16745f() {
        return this.f18069e;
    }

    /* renamed from: g */
    public long mo16759g(long j) {
        return mo16815i().mo16759g(j);
    }

    /* renamed from: h */
    public long mo16760h(long j) {
        return mo16815i().mo16760h(j);
    }
}
