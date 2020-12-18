package p250g.p255b.p256a.p259c;

import p250g.p255b.p256a.C6497c;
import p250g.p255b.p256a.C6517d;
import p250g.p255b.p256a.C6570h;

/* renamed from: g.b.a.c.j */
public class C6508j extends C6501d {

    /* renamed from: c */
    private final int f18059c;

    /* renamed from: d */
    private final int f18060d;

    /* renamed from: e */
    private final int f18061e;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C6508j(C6497c cVar, int i) {
        this(cVar, cVar == null ? null : cVar.mo16792g(), i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public C6508j(C6497c cVar, C6517d dVar, int i) {
        this(cVar, dVar, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public C6508j(C6497c cVar, C6517d dVar, int i, int i2, int i3) {
        super(cVar, dVar);
        if (i != 0) {
            this.f18059c = i;
            if (i2 < cVar.mo16743d() + i) {
                this.f18060d = cVar.mo16743d() + i;
            } else {
                this.f18060d = i2;
            }
            if (i3 > cVar.mo16742c() + i) {
                this.f18061e = cVar.mo16742c() + i;
            } else {
                this.f18061e = i3;
            }
        } else {
            throw new IllegalArgumentException("The offset cannot be zero");
        }
    }

    /* renamed from: a */
    public int mo16740a(long j) {
        return super.mo16740a(j) + this.f18059c;
    }

    /* renamed from: a */
    public long mo16747a(long j, int i) {
        long a = super.mo16747a(j, i);
        C6504g.m24589a(this, mo16740a(a), this.f18060d, this.f18061e);
        return a;
    }

    /* renamed from: b */
    public long mo16749b(long j, int i) {
        C6504g.m24589a(this, i, this.f18060d, this.f18061e);
        return super.mo16749b(j, i - this.f18059c);
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
        return this.f18061e;
    }

    /* renamed from: c */
    public long mo16751c(long j) {
        return mo16815i().mo16751c(j);
    }

    /* renamed from: d */
    public int mo16743d() {
        return this.f18060d;
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
