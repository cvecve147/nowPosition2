package p250g.p255b.p256a.p260d;

/* renamed from: g.b.a.d.l */
class C6547l implements C6536d, C6546k {

    /* renamed from: a */
    private final C6546k f18234a;

    private C6547l(C6546k kVar) {
        this.f18234a = kVar;
    }

    /* renamed from: a */
    static C6536d m25001a(C6546k kVar) {
        if (kVar instanceof C6540f) {
            return ((C6540f) kVar).mo16926b();
        }
        if (kVar instanceof C6536d) {
            return (C6536d) kVar;
        }
        if (kVar == null) {
            return null;
        }
        return new C6547l(kVar);
    }

    /* renamed from: a */
    public int mo16903a() {
        return this.f18234a.mo16896a();
    }

    /* renamed from: a */
    public int mo16897a(C6537e eVar, CharSequence charSequence, int i) {
        return this.f18234a.mo16897a(eVar, charSequence, i);
    }

    /* renamed from: a */
    public int mo16904a(C6537e eVar, String str, int i) {
        return this.f18234a.mo16897a(eVar, str, i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6547l) {
            return this.f18234a.equals(((C6547l) obj).f18234a);
        }
        return false;
    }
}
