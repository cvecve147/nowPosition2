package p250g.p255b.p256a.p259c;

import java.util.Locale;
import p250g.p255b.p256a.C6497c;
import p250g.p255b.p256a.C6517d;
import p250g.p255b.p256a.C6570h;
import p250g.p255b.p256a.C6573j;

/* renamed from: g.b.a.c.b */
public abstract class C6499b extends C6497c {

    /* renamed from: a */
    private final C6517d f18046a;

    protected C6499b(C6517d dVar) {
        if (dVar != null) {
            this.f18046a = dVar;
            return;
        }
        throw new IllegalArgumentException("The type must not be null");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo16755a(String str, Locale locale) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new C6573j(mo16792g(), str);
        }
    }

    /* renamed from: a */
    public int mo16737a(Locale locale) {
        int c = mo16742c();
        if (c >= 0) {
            if (c < 10) {
                return 1;
            }
            if (c < 100) {
                return 2;
            }
            if (c < 1000) {
                return 3;
            }
        }
        return Integer.toString(c).length();
    }

    /* renamed from: a */
    public long mo16747a(long j, int i) {
        return mo16757a().mo16785a(j, i);
    }

    /* renamed from: a */
    public long mo16738a(long j, String str, Locale locale) {
        return mo16749b(j, mo16755a(str, locale));
    }

    /* renamed from: a */
    public String mo16756a(int i, Locale locale) {
        return mo16739b(i, locale);
    }

    /* renamed from: a */
    public String mo16781a(long j, Locale locale) {
        return mo16756a(mo16740a(j), locale);
    }

    /* renamed from: b */
    public C6570h mo16750b() {
        return null;
    }

    /* renamed from: b */
    public String mo16739b(int i, Locale locale) {
        return Integer.toString(i);
    }

    /* renamed from: b */
    public String mo16782b(long j, Locale locale) {
        return mo16739b(mo16740a(j), locale);
    }

    /* renamed from: b */
    public boolean mo16741b(long j) {
        return false;
    }

    /* renamed from: c */
    public long mo16751c(long j) {
        return j - mo16752e(j);
    }

    /* renamed from: d */
    public long mo16753d(long j) {
        long e = mo16752e(j);
        return e != j ? mo16747a(e, 1) : j;
    }

    /* renamed from: e */
    public final String mo16791e() {
        return this.f18046a.mo16835F();
    }

    /* renamed from: f */
    public long mo16758f(long j) {
        long e = mo16752e(j);
        long d = mo16753d(j);
        return d - j <= j - e ? d : e;
    }

    /* renamed from: g */
    public long mo16759g(long j) {
        long e = mo16752e(j);
        long d = mo16753d(j);
        long j2 = j - e;
        long j3 = d - j;
        return j2 < j3 ? e : (j3 >= j2 && (mo16740a(d) & 1) != 0) ? e : d;
    }

    /* renamed from: g */
    public final C6517d mo16792g() {
        return this.f18046a;
    }

    /* renamed from: h */
    public long mo16760h(long j) {
        long e = mo16752e(j);
        long d = mo16753d(j);
        return j - e <= d - j ? e : d;
    }

    /* renamed from: h */
    public final boolean mo16793h() {
        return true;
    }

    /* renamed from: i */
    public int mo16746i(long j) {
        return mo16742c();
    }

    public String toString() {
        return "DateTimeField[" + mo16791e() + ']';
    }
}
