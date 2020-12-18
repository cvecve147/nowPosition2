package p250g.p255b.p256a.p259c;

import p250g.p255b.p256a.C6570h;
import p250g.p255b.p256a.C6571i;

/* renamed from: g.b.a.c.o */
public class C6513o extends C6502e {

    /* renamed from: c */
    private final int f18070c;

    public C6513o(C6570h hVar, C6571i iVar, int i) {
        super(hVar, iVar);
        if (i == 0 || i == 1) {
            throw new IllegalArgumentException("The scalar must not be 0 or 1");
        }
        this.f18070c = i;
    }

    /* renamed from: a */
    public long mo16785a(long j, int i) {
        return mo16816m().mo16786a(j, ((long) i) * ((long) this.f18070c));
    }

    /* renamed from: a */
    public long mo16786a(long j, long j2) {
        return mo16816m().mo16786a(j, C6504g.m24587a(j2, this.f18070c));
    }

    /* renamed from: b */
    public long mo16787b() {
        return mo16816m().mo16787b() * ((long) this.f18070c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6513o)) {
            return false;
        }
        C6513o oVar = (C6513o) obj;
        return mo16816m().equals(oVar.mo16816m()) && mo16810a() == oVar.mo16810a() && this.f18070c == oVar.f18070c;
    }

    public int hashCode() {
        long j = (long) this.f18070c;
        return ((int) (j ^ (j >>> 32))) + mo16810a().hashCode() + mo16816m().hashCode();
    }
}
