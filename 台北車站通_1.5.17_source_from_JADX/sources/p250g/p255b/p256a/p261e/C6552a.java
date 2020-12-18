package p250g.p255b.p256a.p261e;

import p250g.p255b.p256a.C6567g;

/* renamed from: g.b.a.e.a */
public class C6552a extends C6567g {

    /* renamed from: f */
    private static final int f18238f;

    /* renamed from: g */
    private final C6567g f18239g;

    /* renamed from: h */
    private final transient C6553a[] f18240h = new C6553a[(f18238f + 1)];

    /* renamed from: g.b.a.e.a$a */
    private static final class C6553a {

        /* renamed from: a */
        public final long f18241a;

        /* renamed from: b */
        public final C6567g f18242b;

        /* renamed from: c */
        C6553a f18243c;

        /* renamed from: d */
        private String f18244d;

        /* renamed from: e */
        private int f18245e = Integer.MIN_VALUE;

        /* renamed from: f */
        private int f18246f = Integer.MIN_VALUE;

        C6553a(C6567g gVar, long j) {
            this.f18241a = j;
            this.f18242b = gVar;
        }

        /* renamed from: a */
        public String mo16940a(long j) {
            C6553a aVar = this.f18243c;
            if (aVar != null && j >= aVar.f18241a) {
                return aVar.mo16940a(j);
            }
            if (this.f18244d == null) {
                this.f18244d = this.f18242b.mo16932b(this.f18241a);
            }
            return this.f18244d;
        }

        /* renamed from: b */
        public int mo16941b(long j) {
            C6553a aVar = this.f18243c;
            if (aVar != null && j >= aVar.f18241a) {
                return aVar.mo16941b(j);
            }
            if (this.f18245e == Integer.MIN_VALUE) {
                this.f18245e = this.f18242b.mo16933c(this.f18241a);
            }
            return this.f18245e;
        }

        /* renamed from: c */
        public int mo16942c(long j) {
            C6553a aVar = this.f18243c;
            if (aVar != null && j >= aVar.f18241a) {
                return aVar.mo16942c(j);
            }
            if (this.f18246f == Integer.MIN_VALUE) {
                this.f18246f = this.f18242b.mo16934e(this.f18241a);
            }
            return this.f18246f;
        }
    }

    static {
        Integer num;
        int i;
        try {
            num = Integer.getInteger("org.joda.time.tz.CachedDateTimeZone.size");
        } catch (SecurityException unused) {
            num = null;
        }
        if (num == null) {
            i = 512;
        } else {
            int i2 = 0;
            for (int intValue = num.intValue() - 1; intValue > 0; intValue >>= 1) {
                i2++;
            }
            i = 1 << i2;
        }
        f18238f = i - 1;
    }

    private C6552a(C6567g gVar) {
        super(gVar.mo16968c());
        this.f18239g = gVar;
    }

    /* renamed from: a */
    public static C6552a m25017a(C6567g gVar) {
        return gVar instanceof C6552a ? (C6552a) gVar : new C6552a(gVar);
    }

    /* renamed from: i */
    private C6553a m25018i(long j) {
        long j2 = j & -4294967296L;
        C6553a aVar = new C6553a(this.f18239g, j2);
        long j3 = 4294967295L | j2;
        C6553a aVar2 = aVar;
        while (true) {
            long g = this.f18239g.mo16937g(j2);
            if (g == j2 || g > j3) {
                return aVar;
            }
            C6553a aVar3 = new C6553a(this.f18239g, g);
            aVar2.f18243c = aVar3;
            aVar2 = aVar3;
            j2 = g;
        }
        return aVar;
    }

    /* renamed from: j */
    private C6553a m25019j(long j) {
        int i = (int) (j >> 32);
        C6553a[] aVarArr = this.f18240h;
        int i2 = f18238f & i;
        C6553a aVar = aVarArr[i2];
        if (aVar != null && ((int) (aVar.f18241a >> 32)) == i) {
            return aVar;
        }
        C6553a i3 = m25018i(j);
        aVarArr[i2] = i3;
        return i3;
    }

    /* renamed from: b */
    public String mo16932b(long j) {
        return m25019j(j).mo16940a(j);
    }

    /* renamed from: c */
    public int mo16933c(long j) {
        return m25019j(j).mo16941b(j);
    }

    /* renamed from: e */
    public int mo16934e(long j) {
        return m25019j(j).mo16942c(j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6552a) {
            return this.f18239g.equals(((C6552a) obj).f18239g);
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo16936f() {
        return this.f18239g.mo16936f();
    }

    /* renamed from: g */
    public long mo16937g(long j) {
        return this.f18239g.mo16937g(j);
    }

    /* renamed from: h */
    public long mo16938h(long j) {
        return this.f18239g.mo16938h(j);
    }

    public int hashCode() {
        return this.f18239g.hashCode();
    }
}
