package p101d.p129g.p159f.p176g.p177a.p178a.p179a;

import p101d.p129g.p159f.p167c.C5772a;

/* renamed from: d.g.f.g.a.a.a.j */
public abstract class C5826j {

    /* renamed from: a */
    private final C5772a f16109a;

    /* renamed from: b */
    private final C5836s f16110b;

    C5826j(C5772a aVar) {
        this.f16109a = aVar;
        this.f16110b = new C5836s(aVar);
    }

    /* renamed from: a */
    public static C5826j m21992a(C5772a aVar) {
        if (aVar.mo15369a(1)) {
            return new C5823g(aVar);
        }
        if (!aVar.mo15369a(2)) {
            return new C5827k(aVar);
        }
        int a = C5836s.m22020a(aVar, 1, 4);
        if (a == 4) {
            return new C5817a(aVar);
        }
        if (a == 5) {
            return new C5818b(aVar);
        }
        int a2 = C5836s.m22020a(aVar, 1, 5);
        if (a2 == 12) {
            return new C5819c(aVar);
        }
        if (a2 == 13) {
            return new C5820d(aVar);
        }
        switch (C5836s.m22020a(aVar, 1, 7)) {
            case 56:
                return new C5821e(aVar, "310", "11");
            case 57:
                return new C5821e(aVar, "320", "11");
            case 58:
                return new C5821e(aVar, "310", "13");
            case 59:
                return new C5821e(aVar, "320", "13");
            case 60:
                return new C5821e(aVar, "310", "15");
            case 61:
                return new C5821e(aVar, "320", "15");
            case 62:
                return new C5821e(aVar, "310", "17");
            case 63:
                return new C5821e(aVar, "320", "17");
            default:
                throw new IllegalStateException("unknown decoder: " + aVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C5836s mo15498a() {
        return this.f16110b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C5772a mo15499b() {
        return this.f16109a;
    }

    /* renamed from: c */
    public abstract String mo15494c();
}
