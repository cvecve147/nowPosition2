package p250g.p255b.p256a;

import java.io.Serializable;

/* renamed from: g.b.a.d */
public abstract class C6517d implements Serializable {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C6517d f18076a = new C6518a("era", (byte) 1, C6571i.m25129c(), (C6571i) null);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final C6517d f18077b = new C6518a("yearOfEra", (byte) 2, C6571i.m25138m(), C6571i.m25129c());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final C6517d f18078c = new C6518a("centuryOfEra", (byte) 3, C6571i.m25127a(), C6571i.m25129c());
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final C6517d f18079d = new C6518a("yearOfCentury", (byte) 4, C6571i.m25138m(), C6571i.m25127a());
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final C6517d f18080e = new C6518a("year", (byte) 5, C6571i.m25138m(), (C6571i) null);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C6517d f18081f = new C6518a("dayOfYear", (byte) 6, C6571i.m25128b(), C6571i.m25138m());
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C6517d f18082g = new C6518a("monthOfYear", (byte) 7, C6571i.m25134i(), C6571i.m25138m());
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final C6517d f18083h = new C6518a("dayOfMonth", (byte) 8, C6571i.m25128b(), C6571i.m25134i());
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final C6517d f18084i = new C6518a("weekyearOfCentury", (byte) 9, C6571i.m25137l(), C6571i.m25127a());
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final C6517d f18085j = new C6518a("weekyear", (byte) 10, C6571i.m25137l(), (C6571i) null);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C6517d f18086k = new C6518a("weekOfWeekyear", (byte) 11, C6571i.m25136k(), C6571i.m25137l());
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final C6517d f18087l = new C6518a("dayOfWeek", (byte) 12, C6571i.m25128b(), C6571i.m25136k());
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final C6517d f18088m = new C6518a("halfdayOfDay", (byte) 13, C6571i.m25130e(), C6571i.m25128b());
    /* access modifiers changed from: private */

    /* renamed from: n */
    public static final C6517d f18089n = new C6518a("hourOfHalfday", (byte) 14, C6571i.m25131f(), C6571i.m25130e());
    /* access modifiers changed from: private */

    /* renamed from: o */
    public static final C6517d f18090o = new C6518a("clockhourOfHalfday", (byte) 15, C6571i.m25131f(), C6571i.m25130e());
    /* access modifiers changed from: private */

    /* renamed from: p */
    public static final C6517d f18091p = new C6518a("clockhourOfDay", (byte) 16, C6571i.m25131f(), C6571i.m25128b());
    /* access modifiers changed from: private */

    /* renamed from: q */
    public static final C6517d f18092q = new C6518a("hourOfDay", (byte) 17, C6571i.m25131f(), C6571i.m25128b());
    /* access modifiers changed from: private */

    /* renamed from: r */
    public static final C6517d f18093r = new C6518a("minuteOfDay", (byte) 18, C6571i.m25133h(), C6571i.m25128b());
    /* access modifiers changed from: private */

    /* renamed from: s */
    public static final C6517d f18094s = new C6518a("minuteOfHour", (byte) 19, C6571i.m25133h(), C6571i.m25131f());
    /* access modifiers changed from: private */

    /* renamed from: t */
    public static final C6517d f18095t = new C6518a("secondOfDay", (byte) 20, C6571i.m25135j(), C6571i.m25128b());
    /* access modifiers changed from: private */

    /* renamed from: u */
    public static final C6517d f18096u = new C6518a("secondOfMinute", (byte) 21, C6571i.m25135j(), C6571i.m25133h());
    /* access modifiers changed from: private */

    /* renamed from: v */
    public static final C6517d f18097v = new C6518a("millisOfDay", (byte) 22, C6571i.m25132g(), C6571i.m25128b());
    /* access modifiers changed from: private */

    /* renamed from: w */
    public static final C6517d f18098w = new C6518a("millisOfSecond", (byte) 23, C6571i.m25132g(), C6571i.m25135j());

    /* renamed from: x */
    private final String f18099x;

    /* renamed from: g.b.a.d$a */
    private static class C6518a extends C6517d {

        /* renamed from: A */
        private final transient C6571i f18100A;

        /* renamed from: y */
        private final byte f18101y;

        /* renamed from: z */
        private final transient C6571i f18102z;

        C6518a(String str, byte b, C6571i iVar, C6571i iVar2) {
            super(str);
            this.f18101y = b;
            this.f18102z = iVar;
            this.f18100A = iVar2;
        }

        private Object readResolve() {
            switch (this.f18101y) {
                case 1:
                    return C6517d.f18076a;
                case 2:
                    return C6517d.f18077b;
                case 3:
                    return C6517d.f18078c;
                case 4:
                    return C6517d.f18079d;
                case 5:
                    return C6517d.f18080e;
                case 6:
                    return C6517d.f18081f;
                case 7:
                    return C6517d.f18082g;
                case 8:
                    return C6517d.f18083h;
                case 9:
                    return C6517d.f18084i;
                case 10:
                    return C6517d.f18085j;
                case 11:
                    return C6517d.f18086k;
                case 12:
                    return C6517d.f18087l;
                case 13:
                    return C6517d.f18088m;
                case 14:
                    return C6517d.f18089n;
                case 15:
                    return C6517d.f18090o;
                case 16:
                    return C6517d.f18091p;
                case 17:
                    return C6517d.f18092q;
                case 18:
                    return C6517d.f18093r;
                case 19:
                    return C6517d.f18094s;
                case 20:
                    return C6517d.f18095t;
                case 21:
                    return C6517d.f18096u;
                case 22:
                    return C6517d.f18097v;
                case 23:
                    return C6517d.f18098w;
                default:
                    return this;
            }
        }

        /* renamed from: E */
        public C6571i mo16834E() {
            return this.f18102z;
        }

        /* renamed from: a */
        public C6497c mo16836a(C6467a aVar) {
            C6467a a = C6549e.m25008a(aVar);
            switch (this.f18101y) {
                case 1:
                    return a.mo16660i();
                case 2:
                    return a.mo16649J();
                case 3:
                    return a.mo16653b();
                case 4:
                    return a.mo16648I();
                case 5:
                    return a.mo16647H();
                case 6:
                    return a.mo16658g();
                case 7:
                    return a.mo16674w();
                case 8:
                    return a.mo16656e();
                case 9:
                    return a.mo16644E();
                case 10:
                    return a.mo16643D();
                case 11:
                    return a.mo16641B();
                case 12:
                    return a.mo16657f();
                case 13:
                    return a.mo16663l();
                case 14:
                    return a.mo16666o();
                case 15:
                    return a.mo16655d();
                case 16:
                    return a.mo16654c();
                case 17:
                    return a.mo16665n();
                case 18:
                    return a.mo16671t();
                case 19:
                    return a.mo16672u();
                case 20:
                    return a.mo16676y();
                case 21:
                    return a.mo16677z();
                case 22:
                    return a.mo16669r();
                case 23:
                    return a.mo16670s();
                default:
                    throw new InternalError();
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C6518a) {
                return this.f18101y == ((C6518a) obj).f18101y;
            }
            return false;
        }

        public int hashCode() {
            return 1 << this.f18101y;
        }
    }

    protected C6517d(String str) {
        this.f18099x = str;
    }

    /* renamed from: A */
    public static C6517d m24699A() {
        return f18083h;
    }

    /* renamed from: B */
    public static C6517d m24700B() {
        return f18087l;
    }

    /* renamed from: C */
    public static C6517d m24701C() {
        return f18081f;
    }

    /* renamed from: D */
    public static C6517d m24702D() {
        return f18076a;
    }

    /* renamed from: G */
    public static C6517d m24703G() {
        return f18088m;
    }

    /* renamed from: H */
    public static C6517d m24704H() {
        return f18092q;
    }

    /* renamed from: I */
    public static C6517d m24705I() {
        return f18089n;
    }

    /* renamed from: J */
    public static C6517d m24706J() {
        return f18097v;
    }

    /* renamed from: K */
    public static C6517d m24707K() {
        return f18098w;
    }

    /* renamed from: L */
    public static C6517d m24708L() {
        return f18093r;
    }

    /* renamed from: M */
    public static C6517d m24709M() {
        return f18094s;
    }

    /* renamed from: N */
    public static C6517d m24710N() {
        return f18082g;
    }

    /* renamed from: O */
    public static C6517d m24711O() {
        return f18095t;
    }

    /* renamed from: P */
    public static C6517d m24712P() {
        return f18096u;
    }

    /* renamed from: Q */
    public static C6517d m24713Q() {
        return f18086k;
    }

    /* renamed from: R */
    public static C6517d m24714R() {
        return f18085j;
    }

    /* renamed from: S */
    public static C6517d m24715S() {
        return f18084i;
    }

    /* renamed from: T */
    public static C6517d m24716T() {
        return f18080e;
    }

    /* renamed from: U */
    public static C6517d m24717U() {
        return f18079d;
    }

    /* renamed from: V */
    public static C6517d m24718V() {
        return f18077b;
    }

    /* renamed from: x */
    public static C6517d m24742x() {
        return f18078c;
    }

    /* renamed from: y */
    public static C6517d m24743y() {
        return f18091p;
    }

    /* renamed from: z */
    public static C6517d m24744z() {
        return f18090o;
    }

    /* renamed from: E */
    public abstract C6571i mo16834E();

    /* renamed from: F */
    public String mo16835F() {
        return this.f18099x;
    }

    /* renamed from: a */
    public abstract C6497c mo16836a(C6467a aVar);

    public String toString() {
        return mo16835F();
    }
}
