package p250g.p255b.p256a.p259c;

import java.io.Serializable;
import java.util.HashMap;
import p250g.p255b.p256a.C6570h;
import p250g.p255b.p256a.C6571i;

/* renamed from: g.b.a.c.q */
public final class C6515q extends C6570h implements Serializable {

    /* renamed from: a */
    private static HashMap<C6571i, C6515q> f18074a;

    /* renamed from: b */
    private final C6571i f18075b;

    private C6515q(C6571i iVar) {
        this.f18075b = iVar;
    }

    /* renamed from: a */
    public static synchronized C6515q m24676a(C6571i iVar) {
        C6515q qVar;
        synchronized (C6515q.class) {
            if (f18074a == null) {
                f18074a = new HashMap<>(7);
                qVar = null;
            } else {
                qVar = f18074a.get(iVar);
            }
            if (qVar == null) {
                qVar = new C6515q(iVar);
                f18074a.put(iVar, qVar);
            }
        }
        return qVar;
    }

    /* renamed from: m */
    private UnsupportedOperationException m24677m() {
        return new UnsupportedOperationException(this.f18075b + " field is unsupported");
    }

    private Object readResolve() {
        return m24676a(this.f18075b);
    }

    /* renamed from: a */
    public int compareTo(C6570h hVar) {
        return 0;
    }

    /* renamed from: a */
    public long mo16785a(long j, int i) {
        throw m24677m();
    }

    /* renamed from: a */
    public long mo16786a(long j, long j2) {
        throw m24677m();
    }

    /* renamed from: a */
    public final C6571i mo16810a() {
        return this.f18075b;
    }

    /* renamed from: b */
    public long mo16787b() {
        return 0;
    }

    /* renamed from: c */
    public boolean mo16788c() {
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6515q)) {
            return false;
        }
        C6515q qVar = (C6515q) obj;
        return qVar.mo16832l() == null ? mo16832l() == null : qVar.mo16832l().equals(mo16832l());
    }

    public int hashCode() {
        return mo16832l().hashCode();
    }

    /* renamed from: k */
    public boolean mo16812k() {
        return false;
    }

    /* renamed from: l */
    public String mo16832l() {
        return this.f18075b.mo16973d();
    }

    public String toString() {
        return "UnsupportedDurationField[" + mo16832l() + ']';
    }
}
