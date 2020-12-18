package p250g.p255b.p256a.p258b;

import p250g.p255b.p256a.C6517d;
import p250g.p255b.p256a.C6570h;
import p250g.p255b.p256a.p259c.C6504g;
import p250g.p255b.p256a.p259c.C6505h;

/* renamed from: g.b.a.b.j */
class C6484j extends C6505h {

    /* renamed from: d */
    protected final C6475c f18011d;

    C6484j(C6475c cVar) {
        super(C6517d.m24716T(), cVar.mo16699R());
        this.f18011d = cVar;
    }

    /* renamed from: a */
    public int mo16740a(long j) {
        return this.f18011d.mo16734i(j);
    }

    /* renamed from: a */
    public long mo16747a(long j, int i) {
        return i == 0 ? j : mo16749b(j, C6504g.m24585a(mo16740a(j), i));
    }

    /* renamed from: a */
    public long mo16748a(long j, long j2) {
        return mo16747a(j, C6504g.m24586a(j2));
    }

    /* renamed from: b */
    public long mo16749b(long j, int i) {
        C6504g.m24589a(this, i, this.f18011d.mo16705X(), this.f18011d.mo16704W());
        return this.f18011d.mo16729f(j, i);
    }

    /* renamed from: b */
    public C6570h mo16750b() {
        return this.f18011d.mo16659h();
    }

    /* renamed from: b */
    public boolean mo16741b(long j) {
        return this.f18011d.mo16730f(mo16740a(j));
    }

    /* renamed from: c */
    public int mo16742c() {
        return this.f18011d.mo16704W();
    }

    /* renamed from: c */
    public long mo16751c(long j) {
        return j - mo16752e(j);
    }

    /* renamed from: c */
    public long mo16754c(long j, int i) {
        C6504g.m24589a(this, i, this.f18011d.mo16705X() - 1, this.f18011d.mo16704W() + 1);
        return this.f18011d.mo16729f(j, i);
    }

    /* renamed from: d */
    public int mo16743d() {
        return this.f18011d.mo16705X();
    }

    /* renamed from: d */
    public long mo16753d(long j) {
        int a = mo16740a(j);
        return j != this.f18011d.mo16726e(a) ? this.f18011d.mo16726e(a + 1) : j;
    }

    /* renamed from: e */
    public long mo16752e(long j) {
        return this.f18011d.mo16726e(mo16740a(j));
    }

    /* renamed from: f */
    public C6570h mo16745f() {
        return null;
    }
}
