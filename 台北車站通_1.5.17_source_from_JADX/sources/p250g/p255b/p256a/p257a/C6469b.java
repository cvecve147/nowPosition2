package p250g.p255b.p256a.p257a;

import p250g.p255b.p256a.C6581q;
import p250g.p255b.p256a.p259c.C6504g;
import p250g.p255b.p256a.p260d.C6544j;

/* renamed from: g.b.a.a.b */
public abstract class C6469b implements C6581q {
    protected C6469b() {
    }

    /* renamed from: a */
    public int compareTo(C6581q qVar) {
        int i;
        if (this == qVar || mo16689e() == qVar.mo16689e()) {
            return 0;
        }
        return i < 0 ? -1 : 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6581q)) {
            return false;
        }
        C6581q qVar = (C6581q) obj;
        return mo16689e() == qVar.mo16689e() && C6504g.m24590a((Object) getChronology(), (Object) qVar.getChronology());
    }

    public int hashCode() {
        return ((int) (mo16689e() ^ (mo16689e() >>> 32))) + getChronology().hashCode();
    }

    public String toString() {
        return C6544j.m24930b().mo16844a((C6581q) this);
    }
}
