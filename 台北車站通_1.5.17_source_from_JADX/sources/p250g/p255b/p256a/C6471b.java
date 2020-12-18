package p250g.p255b.p256a;

import java.io.Serializable;
import p250g.p255b.p256a.p257a.C6470c;
import p250g.p255b.p256a.p260d.C6520b;
import p250g.p255b.p256a.p260d.C6544j;

/* renamed from: g.b.a.b */
public final class C6471b extends C6470c implements C6580p, Serializable {
    public C6471b() {
    }

    public C6471b(long j, C6467a aVar) {
        super(j, aVar);
    }

    /* renamed from: a */
    public static C6471b m24200a(String str) {
        return m24201a(str, C6544j.m24931c().mo16849d());
    }

    /* renamed from: a */
    public static C6471b m24201a(String str, C6520b bVar) {
        return bVar.mo16840a(str);
    }

    /* renamed from: h */
    public static C6471b m24202h() {
        return new C6471b();
    }

    /* renamed from: a */
    public C6471b mo16691a(C6567g gVar) {
        return mo16692b(getChronology().mo16651a(gVar));
    }

    /* renamed from: b */
    public C6471b mo16692b(C6467a aVar) {
        C6467a a = C6549e.m25008a(aVar);
        return a == getChronology() ? this : new C6471b(mo16689e(), a);
    }
}
