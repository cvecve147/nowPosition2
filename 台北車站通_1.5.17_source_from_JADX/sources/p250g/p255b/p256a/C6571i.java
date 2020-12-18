package p250g.p255b.p256a;

import java.io.Serializable;

/* renamed from: g.b.a.i */
public abstract class C6571i implements Serializable {

    /* renamed from: a */
    static final C6571i f18285a = new C6572a("eras", (byte) 1);

    /* renamed from: b */
    static final C6571i f18286b = new C6572a("centuries", (byte) 2);

    /* renamed from: c */
    static final C6571i f18287c = new C6572a("weekyears", (byte) 3);

    /* renamed from: d */
    static final C6571i f18288d = new C6572a("years", (byte) 4);

    /* renamed from: e */
    static final C6571i f18289e = new C6572a("months", (byte) 5);

    /* renamed from: f */
    static final C6571i f18290f = new C6572a("weeks", (byte) 6);

    /* renamed from: g */
    static final C6571i f18291g = new C6572a("days", (byte) 7);

    /* renamed from: h */
    static final C6571i f18292h = new C6572a("halfdays", (byte) 8);

    /* renamed from: i */
    static final C6571i f18293i = new C6572a("hours", (byte) 9);

    /* renamed from: j */
    static final C6571i f18294j = new C6572a("minutes", (byte) 10);

    /* renamed from: k */
    static final C6571i f18295k = new C6572a("seconds", (byte) 11);

    /* renamed from: l */
    static final C6571i f18296l = new C6572a("millis", (byte) 12);

    /* renamed from: m */
    private final String f18297m;

    /* renamed from: g.b.a.i$a */
    private static class C6572a extends C6571i {

        /* renamed from: n */
        private final byte f18298n;

        C6572a(String str, byte b) {
            super(str);
            this.f18298n = b;
        }

        private Object readResolve() {
            switch (this.f18298n) {
                case 1:
                    return C6571i.f18285a;
                case 2:
                    return C6571i.f18286b;
                case 3:
                    return C6571i.f18287c;
                case 4:
                    return C6571i.f18288d;
                case 5:
                    return C6571i.f18289e;
                case 6:
                    return C6571i.f18290f;
                case 7:
                    return C6571i.f18291g;
                case 8:
                    return C6571i.f18292h;
                case 9:
                    return C6571i.f18293i;
                case 10:
                    return C6571i.f18294j;
                case 11:
                    return C6571i.f18295k;
                case 12:
                    return C6571i.f18296l;
                default:
                    return this;
            }
        }

        /* renamed from: a */
        public C6570h mo16972a(C6467a aVar) {
            C6467a a = C6549e.m25008a(aVar);
            switch (this.f18298n) {
                case 1:
                    return a.mo16661j();
                case 2:
                    return a.mo16652a();
                case 3:
                    return a.mo16645F();
                case 4:
                    return a.mo16650K();
                case 5:
                    return a.mo16675x();
                case 6:
                    return a.mo16642C();
                case 7:
                    return a.mo16659h();
                case 8:
                    return a.mo16664m();
                case 9:
                    return a.mo16667p();
                case 10:
                    return a.mo16673v();
                case 11:
                    return a.mo16640A();
                case 12:
                    return a.mo16668q();
                default:
                    throw new InternalError();
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C6572a) {
                return this.f18298n == ((C6572a) obj).f18298n;
            }
            return false;
        }

        public int hashCode() {
            return 1 << this.f18298n;
        }
    }

    protected C6571i(String str) {
        this.f18297m = str;
    }

    /* renamed from: a */
    public static C6571i m25127a() {
        return f18286b;
    }

    /* renamed from: b */
    public static C6571i m25128b() {
        return f18291g;
    }

    /* renamed from: c */
    public static C6571i m25129c() {
        return f18285a;
    }

    /* renamed from: e */
    public static C6571i m25130e() {
        return f18292h;
    }

    /* renamed from: f */
    public static C6571i m25131f() {
        return f18293i;
    }

    /* renamed from: g */
    public static C6571i m25132g() {
        return f18296l;
    }

    /* renamed from: h */
    public static C6571i m25133h() {
        return f18294j;
    }

    /* renamed from: i */
    public static C6571i m25134i() {
        return f18289e;
    }

    /* renamed from: j */
    public static C6571i m25135j() {
        return f18295k;
    }

    /* renamed from: k */
    public static C6571i m25136k() {
        return f18290f;
    }

    /* renamed from: l */
    public static C6571i m25137l() {
        return f18287c;
    }

    /* renamed from: m */
    public static C6571i m25138m() {
        return f18288d;
    }

    /* renamed from: a */
    public abstract C6570h mo16972a(C6467a aVar);

    /* renamed from: d */
    public String mo16973d() {
        return this.f18297m;
    }

    public String toString() {
        return mo16973d();
    }
}
