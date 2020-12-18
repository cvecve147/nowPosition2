package p250g.p255b.p256a.p259c;

import p250g.p255b.p256a.C6571i;

/* renamed from: g.b.a.c.m */
public class C6511m extends C6500c {

    /* renamed from: b */
    private final long f18066b;

    public C6511m(C6571i iVar, long j) {
        super(iVar);
        this.f18066b = j;
    }

    /* renamed from: a */
    public long mo16785a(long j, int i) {
        return C6504g.m24588a(j, ((long) i) * this.f18066b);
    }

    /* renamed from: a */
    public long mo16786a(long j, long j2) {
        return C6504g.m24588a(j, C6504g.m24591b(j2, this.f18066b));
    }

    /* renamed from: b */
    public final long mo16787b() {
        return this.f18066b;
    }

    /* renamed from: c */
    public final boolean mo16788c() {
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6511m)) {
            return false;
        }
        C6511m mVar = (C6511m) obj;
        return mo16810a() == mVar.mo16810a() && this.f18066b == mVar.f18066b;
    }

    public int hashCode() {
        long j = this.f18066b;
        return ((int) (j ^ (j >>> 32))) + mo16810a().hashCode();
    }
}
