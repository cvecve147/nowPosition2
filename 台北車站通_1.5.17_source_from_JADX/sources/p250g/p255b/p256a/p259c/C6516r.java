package p250g.p255b.p256a.p259c;

import p250g.p255b.p256a.C6497c;
import p250g.p255b.p256a.C6517d;
import p250g.p255b.p256a.C6570h;

/* renamed from: g.b.a.c.r */
public final class C6516r extends C6501d {
    public C6516r(C6497c cVar, C6517d dVar) {
        super(cVar, dVar);
        if (cVar.mo16743d() != 0) {
            throw new IllegalArgumentException("Wrapped field's minumum value must be zero");
        }
    }

    /* renamed from: a */
    public int mo16740a(long j) {
        int a = mo16815i().mo16740a(j);
        return a == 0 ? mo16742c() : a;
    }

    /* renamed from: a */
    public long mo16747a(long j, int i) {
        return mo16815i().mo16747a(j, i);
    }

    /* renamed from: b */
    public long mo16749b(long j, int i) {
        int c = mo16742c();
        C6504g.m24589a(this, i, 1, c);
        if (i == c) {
            i = 0;
        }
        return mo16815i().mo16749b(j, i);
    }

    /* renamed from: b */
    public C6570h mo16750b() {
        return mo16815i().mo16750b();
    }

    /* renamed from: b */
    public boolean mo16741b(long j) {
        return mo16815i().mo16741b(j);
    }

    /* renamed from: c */
    public int mo16742c() {
        return mo16815i().mo16742c() + 1;
    }

    /* renamed from: c */
    public long mo16751c(long j) {
        return mo16815i().mo16751c(j);
    }

    /* renamed from: d */
    public int mo16743d() {
        return 1;
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

    /* renamed from: g */
    public long mo16759g(long j) {
        return mo16815i().mo16759g(j);
    }

    /* renamed from: h */
    public long mo16760h(long j) {
        return mo16815i().mo16760h(j);
    }
}
