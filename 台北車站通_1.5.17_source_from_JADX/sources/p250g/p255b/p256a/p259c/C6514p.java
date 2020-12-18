package p250g.p255b.p256a.p259c;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Locale;
import p250g.p255b.p256a.C6497c;
import p250g.p255b.p256a.C6517d;
import p250g.p255b.p256a.C6570h;

/* renamed from: g.b.a.c.p */
public final class C6514p extends C6497c implements Serializable {

    /* renamed from: a */
    private static HashMap<C6517d, C6514p> f18071a;

    /* renamed from: b */
    private final C6517d f18072b;

    /* renamed from: c */
    private final C6570h f18073c;

    private C6514p(C6517d dVar, C6570h hVar) {
        if (dVar == null || hVar == null) {
            throw new IllegalArgumentException();
        }
        this.f18072b = dVar;
        this.f18073c = hVar;
    }

    /* renamed from: a */
    public static synchronized C6514p m24650a(C6517d dVar, C6570h hVar) {
        C6514p pVar;
        synchronized (C6514p.class) {
            pVar = null;
            if (f18071a == null) {
                f18071a = new HashMap<>(7);
            } else {
                C6514p pVar2 = f18071a.get(dVar);
                if (pVar2 == null || pVar2.mo16757a() == hVar) {
                    pVar = pVar2;
                }
            }
            if (pVar == null) {
                pVar = new C6514p(dVar, hVar);
                f18071a.put(dVar, pVar);
            }
        }
        return pVar;
    }

    /* renamed from: i */
    private UnsupportedOperationException m24651i() {
        return new UnsupportedOperationException(this.f18072b + " field is unsupported");
    }

    private Object readResolve() {
        return m24650a(this.f18072b, this.f18073c);
    }

    /* renamed from: a */
    public int mo16740a(long j) {
        throw m24651i();
    }

    /* renamed from: a */
    public int mo16737a(Locale locale) {
        throw m24651i();
    }

    /* renamed from: a */
    public long mo16747a(long j, int i) {
        return mo16757a().mo16785a(j, i);
    }

    /* renamed from: a */
    public long mo16738a(long j, String str, Locale locale) {
        throw m24651i();
    }

    /* renamed from: a */
    public C6570h mo16757a() {
        return this.f18073c;
    }

    /* renamed from: a */
    public String mo16756a(int i, Locale locale) {
        throw m24651i();
    }

    /* renamed from: a */
    public String mo16781a(long j, Locale locale) {
        throw m24651i();
    }

    /* renamed from: b */
    public long mo16749b(long j, int i) {
        throw m24651i();
    }

    /* renamed from: b */
    public C6570h mo16750b() {
        return null;
    }

    /* renamed from: b */
    public String mo16739b(int i, Locale locale) {
        throw m24651i();
    }

    /* renamed from: b */
    public String mo16782b(long j, Locale locale) {
        throw m24651i();
    }

    /* renamed from: b */
    public boolean mo16741b(long j) {
        throw m24651i();
    }

    /* renamed from: c */
    public int mo16742c() {
        throw m24651i();
    }

    /* renamed from: c */
    public long mo16751c(long j) {
        throw m24651i();
    }

    /* renamed from: d */
    public int mo16743d() {
        throw m24651i();
    }

    /* renamed from: d */
    public long mo16753d(long j) {
        throw m24651i();
    }

    /* renamed from: e */
    public long mo16752e(long j) {
        throw m24651i();
    }

    /* renamed from: e */
    public String mo16791e() {
        return this.f18072b.mo16835F();
    }

    /* renamed from: f */
    public long mo16758f(long j) {
        throw m24651i();
    }

    /* renamed from: f */
    public C6570h mo16745f() {
        return null;
    }

    /* renamed from: g */
    public long mo16759g(long j) {
        throw m24651i();
    }

    /* renamed from: g */
    public C6517d mo16792g() {
        return this.f18072b;
    }

    /* renamed from: h */
    public long mo16760h(long j) {
        throw m24651i();
    }

    /* renamed from: h */
    public boolean mo16793h() {
        return false;
    }

    public String toString() {
        return "UnsupportedDateTimeField";
    }
}
