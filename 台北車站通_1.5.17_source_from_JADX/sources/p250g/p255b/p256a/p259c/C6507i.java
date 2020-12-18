package p250g.p255b.p256a.p259c;

import java.io.Serializable;
import p250g.p255b.p256a.C6570h;
import p250g.p255b.p256a.C6571i;

/* renamed from: g.b.a.c.i */
public final class C6507i extends C6570h implements Serializable {

    /* renamed from: a */
    public static final C6570h f18058a = new C6507i();

    private C6507i() {
    }

    private Object readResolve() {
        return f18058a;
    }

    /* renamed from: a */
    public int compareTo(C6570h hVar) {
        int i = (mo16787b() > hVar.mo16787b() ? 1 : (mo16787b() == hVar.mo16787b() ? 0 : -1));
        if (i == 0) {
            return 0;
        }
        return i < 0 ? -1 : 1;
    }

    /* renamed from: a */
    public long mo16785a(long j, int i) {
        return C6504g.m24588a(j, (long) i);
    }

    /* renamed from: a */
    public long mo16786a(long j, long j2) {
        return C6504g.m24588a(j, j2);
    }

    /* renamed from: a */
    public C6571i mo16810a() {
        return C6571i.m25132g();
    }

    /* renamed from: b */
    public final long mo16787b() {
        return 1;
    }

    /* renamed from: c */
    public final boolean mo16788c() {
        return true;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C6507i) && mo16787b() == ((C6507i) obj).mo16787b();
    }

    public int hashCode() {
        return (int) mo16787b();
    }

    /* renamed from: k */
    public boolean mo16812k() {
        return true;
    }

    public String toString() {
        return "DurationField[millis]";
    }
}
