package p250g.p255b.p256a.p258b;

import java.util.HashMap;
import java.util.Locale;
import p250g.p255b.p256a.C6467a;
import p250g.p255b.p256a.C6497c;
import p250g.p255b.p256a.C6567g;
import p250g.p255b.p256a.C6570h;
import p250g.p255b.p256a.C6573j;
import p250g.p255b.p256a.C6574k;
import p250g.p255b.p256a.p258b.C6472a;
import p250g.p255b.p256a.p259c.C6499b;
import p250g.p255b.p256a.p259c.C6500c;

/* renamed from: g.b.a.b.s */
public final class C6494s extends C6472a {

    /* renamed from: g.b.a.b.s$a */
    static final class C6495a extends C6499b {

        /* renamed from: b */
        final C6497c f18037b;

        /* renamed from: c */
        final C6567g f18038c;

        /* renamed from: d */
        final C6570h f18039d;

        /* renamed from: e */
        final boolean f18040e;

        /* renamed from: f */
        final C6570h f18041f;

        /* renamed from: g */
        final C6570h f18042g;

        C6495a(C6497c cVar, C6567g gVar, C6570h hVar, C6570h hVar2, C6570h hVar3) {
            super(cVar.mo16792g());
            if (cVar.mo16793h()) {
                this.f18037b = cVar;
                this.f18038c = gVar;
                this.f18039d = hVar;
                this.f18040e = C6494s.m24479a(hVar);
                this.f18041f = hVar2;
                this.f18042g = hVar3;
                return;
            }
            throw new IllegalArgumentException();
        }

        /* renamed from: j */
        private int m24484j(long j) {
            int c = this.f18038c.mo16933c(j);
            long j2 = (long) c;
            if (((j + j2) ^ j) >= 0 || (j ^ j2) < 0) {
                return c;
            }
            throw new ArithmeticException("Adding time zone offset caused overflow");
        }

        /* renamed from: a */
        public int mo16740a(long j) {
            return this.f18037b.mo16740a(this.f18038c.mo16963a(j));
        }

        /* renamed from: a */
        public int mo16737a(Locale locale) {
            return this.f18037b.mo16737a(locale);
        }

        /* renamed from: a */
        public long mo16747a(long j, int i) {
            if (this.f18040e) {
                long j2 = (long) m24484j(j);
                return this.f18037b.mo16747a(j + j2, i) - j2;
            }
            return this.f18038c.mo16965a(this.f18037b.mo16747a(this.f18038c.mo16963a(j), i), false, j);
        }

        /* renamed from: a */
        public long mo16738a(long j, String str, Locale locale) {
            return this.f18038c.mo16965a(this.f18037b.mo16738a(this.f18038c.mo16963a(j), str, locale), false, j);
        }

        /* renamed from: a */
        public final C6570h mo16757a() {
            return this.f18039d;
        }

        /* renamed from: a */
        public String mo16756a(int i, Locale locale) {
            return this.f18037b.mo16756a(i, locale);
        }

        /* renamed from: a */
        public String mo16781a(long j, Locale locale) {
            return this.f18037b.mo16781a(this.f18038c.mo16963a(j), locale);
        }

        /* renamed from: b */
        public long mo16749b(long j, int i) {
            long b = this.f18037b.mo16749b(this.f18038c.mo16963a(j), i);
            long a = this.f18038c.mo16965a(b, false, j);
            if (mo16740a(a) == i) {
                return a;
            }
            C6574k kVar = new C6574k(b, this.f18038c.mo16968c());
            C6573j jVar = new C6573j(this.f18037b.mo16792g(), Integer.valueOf(i), kVar.getMessage());
            jVar.initCause(kVar);
            throw jVar;
        }

        /* renamed from: b */
        public final C6570h mo16750b() {
            return this.f18042g;
        }

        /* renamed from: b */
        public String mo16739b(int i, Locale locale) {
            return this.f18037b.mo16739b(i, locale);
        }

        /* renamed from: b */
        public String mo16782b(long j, Locale locale) {
            return this.f18037b.mo16782b(this.f18038c.mo16963a(j), locale);
        }

        /* renamed from: b */
        public boolean mo16741b(long j) {
            return this.f18037b.mo16741b(this.f18038c.mo16963a(j));
        }

        /* renamed from: c */
        public int mo16742c() {
            return this.f18037b.mo16742c();
        }

        /* renamed from: c */
        public long mo16751c(long j) {
            return this.f18037b.mo16751c(this.f18038c.mo16963a(j));
        }

        /* renamed from: d */
        public int mo16743d() {
            return this.f18037b.mo16743d();
        }

        /* renamed from: d */
        public long mo16753d(long j) {
            if (this.f18040e) {
                long j2 = (long) m24484j(j);
                return this.f18037b.mo16753d(j + j2) - j2;
            }
            return this.f18038c.mo16965a(this.f18037b.mo16753d(this.f18038c.mo16963a(j)), false, j);
        }

        /* renamed from: e */
        public long mo16752e(long j) {
            if (this.f18040e) {
                long j2 = (long) m24484j(j);
                return this.f18037b.mo16752e(j + j2) - j2;
            }
            return this.f18038c.mo16965a(this.f18037b.mo16752e(this.f18038c.mo16963a(j)), false, j);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6495a)) {
                return false;
            }
            C6495a aVar = (C6495a) obj;
            return this.f18037b.equals(aVar.f18037b) && this.f18038c.equals(aVar.f18038c) && this.f18039d.equals(aVar.f18039d) && this.f18041f.equals(aVar.f18041f);
        }

        /* renamed from: f */
        public final C6570h mo16745f() {
            return this.f18041f;
        }

        public int hashCode() {
            return this.f18037b.hashCode() ^ this.f18038c.hashCode();
        }
    }

    /* renamed from: g.b.a.b.s$b */
    static class C6496b extends C6500c {

        /* renamed from: b */
        final C6570h f18043b;

        /* renamed from: c */
        final boolean f18044c;

        /* renamed from: d */
        final C6567g f18045d;

        C6496b(C6570h hVar, C6567g gVar) {
            super(hVar.mo16810a());
            if (hVar.mo16812k()) {
                this.f18043b = hVar;
                this.f18044c = C6494s.m24479a(hVar);
                this.f18045d = gVar;
                return;
            }
            throw new IllegalArgumentException();
        }

        /* renamed from: a */
        private int m24503a(long j) {
            int d = this.f18045d.mo16957d(j);
            long j2 = (long) d;
            if (((j - j2) ^ j) >= 0 || (j ^ j2) >= 0) {
                return d;
            }
            throw new ArithmeticException("Subtracting time zone offset caused overflow");
        }

        /* renamed from: b */
        private int m24504b(long j) {
            int c = this.f18045d.mo16933c(j);
            long j2 = (long) c;
            if (((j + j2) ^ j) >= 0 || (j ^ j2) < 0) {
                return c;
            }
            throw new ArithmeticException("Adding time zone offset caused overflow");
        }

        /* renamed from: a */
        public long mo16785a(long j, int i) {
            int b = m24504b(j);
            long a = this.f18043b.mo16785a(j + ((long) b), i);
            if (!this.f18044c) {
                b = m24503a(a);
            }
            return a - ((long) b);
        }

        /* renamed from: a */
        public long mo16786a(long j, long j2) {
            int b = m24504b(j);
            long a = this.f18043b.mo16786a(j + ((long) b), j2);
            if (!this.f18044c) {
                b = m24503a(a);
            }
            return a - ((long) b);
        }

        /* renamed from: b */
        public long mo16787b() {
            return this.f18043b.mo16787b();
        }

        /* renamed from: c */
        public boolean mo16788c() {
            return this.f18044c ? this.f18043b.mo16788c() : this.f18043b.mo16788c() && this.f18045d.mo16936f();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6496b)) {
                return false;
            }
            C6496b bVar = (C6496b) obj;
            return this.f18043b.equals(bVar.f18043b) && this.f18045d.equals(bVar.f18045d);
        }

        public int hashCode() {
            return this.f18043b.hashCode() ^ this.f18045d.hashCode();
        }
    }

    private C6494s(C6467a aVar, C6567g gVar) {
        super(aVar, gVar);
    }

    /* renamed from: a */
    public static C6494s m24476a(C6467a aVar, C6567g gVar) {
        if (aVar != null) {
            C6467a G = aVar.mo16646G();
            if (G == null) {
                throw new IllegalArgumentException("UTC chronology must not be null");
            } else if (gVar != null) {
                return new C6494s(G, gVar);
            } else {
                throw new IllegalArgumentException("DateTimeZone must not be null");
            }
        } else {
            throw new IllegalArgumentException("Must supply a chronology");
        }
    }

    /* renamed from: a */
    private C6497c m24477a(C6497c cVar, HashMap<Object, Object> hashMap) {
        if (cVar == null || !cVar.mo16793h()) {
            return cVar;
        }
        if (hashMap.containsKey(cVar)) {
            return (C6497c) hashMap.get(cVar);
        }
        C6495a aVar = new C6495a(cVar, mo16662k(), m24478a(cVar.mo16757a(), hashMap), m24478a(cVar.mo16745f(), hashMap), m24478a(cVar.mo16750b(), hashMap));
        hashMap.put(cVar, aVar);
        return aVar;
    }

    /* renamed from: a */
    private C6570h m24478a(C6570h hVar, HashMap<Object, Object> hashMap) {
        if (hVar == null || !hVar.mo16812k()) {
            return hVar;
        }
        if (hashMap.containsKey(hVar)) {
            return (C6570h) hashMap.get(hVar);
        }
        C6496b bVar = new C6496b(hVar, mo16662k());
        hashMap.put(hVar, bVar);
        return bVar;
    }

    /* renamed from: a */
    static boolean m24479a(C6570h hVar) {
        return hVar != null && hVar.mo16787b() < 43200000;
    }

    /* renamed from: G */
    public C6467a mo16646G() {
        return mo16693L();
    }

    /* renamed from: a */
    public C6467a mo16651a(C6567g gVar) {
        if (gVar == null) {
            gVar = C6567g.m25096b();
        }
        return gVar == mo16694M() ? this : gVar == C6567g.f18277a ? mo16693L() : new C6494s(mo16693L(), gVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16695a(C6472a.C6473a aVar) {
        HashMap hashMap = new HashMap();
        aVar.f17963l = m24478a(aVar.f17963l, (HashMap<Object, Object>) hashMap);
        aVar.f17962k = m24478a(aVar.f17962k, (HashMap<Object, Object>) hashMap);
        aVar.f17961j = m24478a(aVar.f17961j, (HashMap<Object, Object>) hashMap);
        aVar.f17960i = m24478a(aVar.f17960i, (HashMap<Object, Object>) hashMap);
        aVar.f17959h = m24478a(aVar.f17959h, (HashMap<Object, Object>) hashMap);
        aVar.f17958g = m24478a(aVar.f17958g, (HashMap<Object, Object>) hashMap);
        aVar.f17957f = m24478a(aVar.f17957f, (HashMap<Object, Object>) hashMap);
        aVar.f17956e = m24478a(aVar.f17956e, (HashMap<Object, Object>) hashMap);
        aVar.f17955d = m24478a(aVar.f17955d, (HashMap<Object, Object>) hashMap);
        aVar.f17954c = m24478a(aVar.f17954c, (HashMap<Object, Object>) hashMap);
        aVar.f17953b = m24478a(aVar.f17953b, (HashMap<Object, Object>) hashMap);
        aVar.f17952a = m24478a(aVar.f17952a, (HashMap<Object, Object>) hashMap);
        aVar.f17947E = m24477a(aVar.f17947E, (HashMap<Object, Object>) hashMap);
        aVar.f17948F = m24477a(aVar.f17948F, (HashMap<Object, Object>) hashMap);
        aVar.f17949G = m24477a(aVar.f17949G, (HashMap<Object, Object>) hashMap);
        aVar.f17950H = m24477a(aVar.f17950H, (HashMap<Object, Object>) hashMap);
        aVar.f17951I = m24477a(aVar.f17951I, (HashMap<Object, Object>) hashMap);
        aVar.f17975x = m24477a(aVar.f17975x, (HashMap<Object, Object>) hashMap);
        aVar.f17976y = m24477a(aVar.f17976y, (HashMap<Object, Object>) hashMap);
        aVar.f17977z = m24477a(aVar.f17977z, (HashMap<Object, Object>) hashMap);
        aVar.f17946D = m24477a(aVar.f17946D, (HashMap<Object, Object>) hashMap);
        aVar.f17943A = m24477a(aVar.f17943A, (HashMap<Object, Object>) hashMap);
        aVar.f17944B = m24477a(aVar.f17944B, (HashMap<Object, Object>) hashMap);
        aVar.f17945C = m24477a(aVar.f17945C, (HashMap<Object, Object>) hashMap);
        aVar.f17964m = m24477a(aVar.f17964m, (HashMap<Object, Object>) hashMap);
        aVar.f17965n = m24477a(aVar.f17965n, (HashMap<Object, Object>) hashMap);
        aVar.f17966o = m24477a(aVar.f17966o, (HashMap<Object, Object>) hashMap);
        aVar.f17967p = m24477a(aVar.f17967p, (HashMap<Object, Object>) hashMap);
        aVar.f17968q = m24477a(aVar.f17968q, (HashMap<Object, Object>) hashMap);
        aVar.f17969r = m24477a(aVar.f17969r, (HashMap<Object, Object>) hashMap);
        aVar.f17970s = m24477a(aVar.f17970s, (HashMap<Object, Object>) hashMap);
        aVar.f17972u = m24477a(aVar.f17972u, (HashMap<Object, Object>) hashMap);
        aVar.f17971t = m24477a(aVar.f17971t, (HashMap<Object, Object>) hashMap);
        aVar.f17973v = m24477a(aVar.f17973v, (HashMap<Object, Object>) hashMap);
        aVar.f17974w = m24477a(aVar.f17974w, (HashMap<Object, Object>) hashMap);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6494s)) {
            return false;
        }
        C6494s sVar = (C6494s) obj;
        return mo16693L().equals(sVar.mo16693L()) && mo16662k().equals(sVar.mo16662k());
    }

    public int hashCode() {
        return (mo16662k().hashCode() * 11) + 326565 + (mo16693L().hashCode() * 7);
    }

    /* renamed from: k */
    public C6567g mo16662k() {
        return (C6567g) mo16694M();
    }

    public String toString() {
        return "ZonedChronology[" + mo16693L() + ", " + mo16662k().mo16968c() + ']';
    }
}
