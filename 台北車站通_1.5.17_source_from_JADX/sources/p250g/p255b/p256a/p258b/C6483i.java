package p250g.p255b.p256a.p258b;

import p250g.p255b.p256a.C6517d;
import p250g.p255b.p256a.C6570h;
import p250g.p255b.p256a.p259c.C6504g;
import p250g.p255b.p256a.p259c.C6505h;

/* renamed from: g.b.a.b.i */
final class C6483i extends C6505h {

    /* renamed from: d */
    private final C6475c f18010d;

    C6483i(C6475c cVar) {
        super(C6517d.m24714R(), cVar.mo16699R());
        this.f18010d = cVar;
    }

    /* renamed from: a */
    public int mo16740a(long j) {
        return this.f18010d.mo16732h(j);
    }

    /* renamed from: a */
    public long mo16747a(long j, int i) {
        return i == 0 ? j : mo16749b(j, mo16740a(j) + i);
    }

    /* renamed from: a */
    public long mo16748a(long j, long j2) {
        return mo16747a(j, C6504g.m24586a(j2));
    }

    /* renamed from: b */
    public long mo16749b(long j, int i) {
        C6504g.m24589a(this, Math.abs(i), this.f18010d.mo16705X(), this.f18010d.mo16704W());
        int a = mo16740a(j);
        if (a == i) {
            return j;
        }
        int b = this.f18010d.mo16714b(j);
        int d = this.f18010d.mo16721d(a);
        int d2 = this.f18010d.mo16721d(i);
        if (d2 < d) {
            d = d2;
        }
        int g = this.f18010d.mo16731g(j);
        if (g <= d) {
            d = g;
        }
        long f = this.f18010d.mo16729f(j, i);
        int a2 = mo16740a(f);
        if (a2 < i) {
            f += 604800000;
        } else if (a2 > i) {
            f -= 604800000;
        }
        return this.f18010d.mo16657f().mo16749b(f + (((long) (d - this.f18010d.mo16731g(f))) * 604800000), b);
    }

    /* renamed from: b */
    public C6570h mo16750b() {
        return this.f18010d.mo16642C();
    }

    /* renamed from: b */
    public boolean mo16741b(long j) {
        C6475c cVar = this.f18010d;
        return cVar.mo16721d(cVar.mo16732h(j)) > 52;
    }

    /* renamed from: c */
    public int mo16742c() {
        return this.f18010d.mo16704W();
    }

    /* renamed from: c */
    public long mo16751c(long j) {
        return j - mo16752e(j);
    }

    /* renamed from: d */
    public int mo16743d() {
        return this.f18010d.mo16705X();
    }

    /* renamed from: e */
    public long mo16752e(long j) {
        long e = this.f18010d.mo16641B().mo16752e(j);
        int g = this.f18010d.mo16731g(e);
        return g > 1 ? e - (((long) (g - 1)) * 604800000) : e;
    }

    /* renamed from: f */
    public C6570h mo16745f() {
        return null;
    }
}
