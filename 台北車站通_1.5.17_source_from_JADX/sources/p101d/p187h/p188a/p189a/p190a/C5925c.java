package p101d.p187h.p188a.p189a.p190a;

import p263h.C6650p;

/* renamed from: d.h.a.a.a.c */
public final class C5925c extends Exception {

    /* renamed from: a */
    private final int f16379a;

    /* renamed from: b */
    private final String f16380b;

    /* renamed from: c */
    private final transient C6650p<?> f16381c;

    public C5925c(C6650p<?> pVar) {
        super(m22427a(pVar));
        this.f16379a = pVar.mo17052b();
        this.f16380b = pVar.mo17054d();
        this.f16381c = pVar;
    }

    /* renamed from: a */
    private static String m22427a(C6650p<?> pVar) {
        if (pVar != null) {
            return "HTTP " + pVar.mo17052b() + " " + pVar.mo17054d();
        }
        throw new NullPointerException("response == null");
    }
}
