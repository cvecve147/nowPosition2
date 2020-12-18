package p250g.p255b.p256a.p258b;

import java.util.Locale;
import p250g.p255b.p256a.C6517d;
import p250g.p255b.p256a.C6570h;
import p250g.p255b.p256a.C6571i;
import p250g.p255b.p256a.p259c.C6499b;
import p250g.p255b.p256a.p259c.C6504g;
import p250g.p255b.p256a.p259c.C6515q;

/* renamed from: g.b.a.b.l */
final class C6486l extends C6499b {

    /* renamed from: b */
    private final C6475c f18013b;

    C6486l(C6475c cVar) {
        super(C6517d.m24702D());
        this.f18013b = cVar;
    }

    /* renamed from: a */
    public int mo16740a(long j) {
        return this.f18013b.mo16734i(j) <= 0 ? 0 : 1;
    }

    /* renamed from: a */
    public int mo16737a(Locale locale) {
        return C6487m.m24415a(locale).mo16764b();
    }

    /* renamed from: a */
    public long mo16738a(long j, String str, Locale locale) {
        return mo16749b(j, C6487m.m24415a(locale).mo16765b(str));
    }

    /* renamed from: a */
    public C6570h mo16757a() {
        return C6515q.m24676a(C6571i.m25129c());
    }

    /* renamed from: b */
    public long mo16749b(long j, int i) {
        C6504g.m24589a(this, i, 0, 1);
        if (mo16740a(j) == i) {
            return j;
        }
        return this.f18013b.mo16729f(j, -this.f18013b.mo16734i(j));
    }

    /* renamed from: b */
    public String mo16739b(int i, Locale locale) {
        return C6487m.m24415a(locale).mo16769c(i);
    }

    /* renamed from: c */
    public int mo16742c() {
        return 1;
    }

    /* renamed from: d */
    public int mo16743d() {
        return 0;
    }

    /* renamed from: d */
    public long mo16753d(long j) {
        if (mo16740a(j) == 0) {
            return this.f18013b.mo16729f(0, 1);
        }
        return Long.MAX_VALUE;
    }

    /* renamed from: e */
    public long mo16752e(long j) {
        if (mo16740a(j) == 1) {
            return this.f18013b.mo16729f(0, 1);
        }
        return Long.MIN_VALUE;
    }

    /* renamed from: f */
    public long mo16758f(long j) {
        return mo16752e(j);
    }

    /* renamed from: f */
    public C6570h mo16745f() {
        return null;
    }

    /* renamed from: g */
    public long mo16759g(long j) {
        return mo16752e(j);
    }

    /* renamed from: h */
    public long mo16760h(long j) {
        return mo16752e(j);
    }
}
