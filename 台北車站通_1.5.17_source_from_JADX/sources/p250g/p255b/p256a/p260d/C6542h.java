package p250g.p255b.p256a.p260d;

import java.io.Writer;
import java.util.Locale;
import p250g.p255b.p256a.C6467a;
import p250g.p255b.p256a.C6567g;

/* renamed from: g.b.a.d.h */
class C6542h implements C6548m {

    /* renamed from: a */
    private final C6541g f18173a;

    private C6542h(C6541g gVar) {
        this.f18173a = gVar;
    }

    /* renamed from: a */
    static C6548m m24921a(C6541g gVar) {
        if (gVar == null) {
            return null;
        }
        return new C6542h(gVar);
    }

    /* renamed from: a */
    public void mo16898a(Appendable appendable, long j, C6467a aVar, int i, C6567g gVar, Locale locale) {
        Appendable appendable2 = appendable;
        if (appendable2 instanceof StringBuffer) {
            this.f18173a.mo16928a((StringBuffer) appendable2, j, aVar, i, gVar, locale);
        } else if (appendable2 instanceof Writer) {
            this.f18173a.mo16927a((Writer) appendable2, j, aVar, i, gVar, locale);
        } else {
            StringBuffer stringBuffer = new StringBuffer(mo16899b());
            this.f18173a.mo16928a(stringBuffer, j, aVar, i, gVar, locale);
            appendable.append(stringBuffer);
        }
    }

    /* renamed from: b */
    public int mo16899b() {
        return this.f18173a.mo16929b();
    }
}
