package p250g.p255b.p256a.p258b;

import java.util.Locale;
import p250g.p255b.p256a.C6467a;
import p250g.p255b.p256a.C6497c;
import p250g.p255b.p256a.C6517d;
import p250g.p255b.p256a.C6567g;
import p250g.p255b.p256a.C6570h;
import p250g.p255b.p256a.C6571i;
import p250g.p255b.p256a.p258b.C6472a;
import p250g.p255b.p256a.p259c.C6503f;
import p250g.p255b.p256a.p259c.C6507i;
import p250g.p255b.p256a.p259c.C6508j;
import p250g.p255b.p256a.p259c.C6509k;
import p250g.p255b.p256a.p259c.C6511m;
import p250g.p255b.p256a.p259c.C6512n;
import p250g.p255b.p256a.p259c.C6516r;

/* renamed from: g.b.a.b.c */
abstract class C6475c extends C6472a {

    /* renamed from: M */
    private static final C6570h f17978M = C6507i.f18058a;

    /* renamed from: N */
    private static final C6570h f17979N = new C6511m(C6571i.m25135j(), 1000);

    /* renamed from: O */
    private static final C6570h f17980O = new C6511m(C6571i.m25133h(), 60000);

    /* renamed from: P */
    private static final C6570h f17981P = new C6511m(C6571i.m25131f(), 3600000);
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public static final C6570h f17982Q = new C6511m(C6571i.m25130e(), 43200000);
    /* access modifiers changed from: private */

    /* renamed from: R */
    public static final C6570h f17983R = new C6511m(C6571i.m25128b(), 86400000);

    /* renamed from: S */
    private static final C6570h f17984S = new C6511m(C6571i.m25136k(), 604800000);

    /* renamed from: T */
    private static final C6497c f17985T = new C6509k(C6517d.m24707K(), f17978M, f17979N);

    /* renamed from: U */
    private static final C6497c f17986U = new C6509k(C6517d.m24706J(), f17978M, f17983R);

    /* renamed from: V */
    private static final C6497c f17987V = new C6509k(C6517d.m24712P(), f17979N, f17980O);

    /* renamed from: W */
    private static final C6497c f17988W = new C6509k(C6517d.m24711O(), f17979N, f17983R);

    /* renamed from: X */
    private static final C6497c f17989X = new C6509k(C6517d.m24709M(), f17980O, f17981P);

    /* renamed from: Y */
    private static final C6497c f17990Y = new C6509k(C6517d.m24708L(), f17980O, f17983R);

    /* renamed from: Z */
    private static final C6497c f17991Z = new C6509k(C6517d.m24704H(), f17981P, f17983R);

    /* renamed from: aa */
    private static final C6497c f17992aa = new C6509k(C6517d.m24705I(), f17981P, f17982Q);

    /* renamed from: ba */
    private static final C6497c f17993ba = new C6516r(f17991Z, C6517d.m24743y());

    /* renamed from: ca */
    private static final C6497c f17994ca = new C6516r(f17992aa, C6517d.m24744z());

    /* renamed from: da */
    private static final C6497c f17995da = new C6476a();

    /* renamed from: ea */
    private final transient C6477b[] f17996ea = new C6477b[1024];

    /* renamed from: fa */
    private final int f17997fa;

    /* renamed from: g.b.a.b.c$a */
    private static class C6476a extends C6509k {
        C6476a() {
            super(C6517d.m24703G(), C6475c.f17982Q, C6475c.f17983R);
        }

        /* renamed from: a */
        public int mo16737a(Locale locale) {
            return C6487m.m24415a(locale).mo16767c();
        }

        /* renamed from: a */
        public long mo16738a(long j, String str, Locale locale) {
            return mo16749b(j, C6487m.m24415a(locale).mo16768c(str));
        }

        /* renamed from: b */
        public String mo16739b(int i, Locale locale) {
            return C6487m.m24415a(locale).mo16772d(i);
        }
    }

    /* renamed from: g.b.a.b.c$b */
    private static class C6477b {

        /* renamed from: a */
        public final int f17998a;

        /* renamed from: b */
        public final long f17999b;

        C6477b(int i, long j) {
            this.f17998a = i;
            this.f17999b = j;
        }
    }

    C6475c(C6467a aVar, Object obj, int i) {
        super(aVar, obj);
        if (i < 1 || i > 7) {
            throw new IllegalArgumentException("Invalid min days in first week: " + i);
        }
        this.f17997fa = i;
    }

    /* renamed from: g */
    private C6477b m24285g(int i) {
        int i2 = i & 1023;
        C6477b bVar = this.f17996ea[i2];
        if (bVar != null && bVar.f17998a == i) {
            return bVar;
        }
        C6477b bVar2 = new C6477b(i, mo16711a(i));
        this.f17996ea[i2] = bVar2;
        return bVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public abstract long mo16697P();

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public abstract long mo16698Q();

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public abstract long mo16699R();

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public abstract long mo16700S();

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public int mo16701T() {
        return 31;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public int mo16702U() {
        return 366;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public int mo16703V() {
        return 12;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public abstract int mo16704W();

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public abstract int mo16705X();

    /* renamed from: Y */
    public int mo16706Y() {
        return this.f17997fa;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract int mo16707a(int i, int i2);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo16708a(long j) {
        int i = mo16734i(j);
        return mo16710a(j, i, mo16723d(j, i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo16709a(long j, int i) {
        return mo16710a(j, i, mo16723d(j, i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo16710a(long j, int i, int i2) {
        return ((int) ((j - (mo16726e(i) + mo16716b(i, i2))) / 86400000)) + 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract long mo16711a(int i);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public long mo16712a(int i, int i2, int i3) {
        return mo16726e(i) + mo16716b(i, i2) + (((long) (i3 - 1)) * 86400000);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16695a(C6472a.C6473a aVar) {
        aVar.f17952a = f17978M;
        aVar.f17953b = f17979N;
        aVar.f17954c = f17980O;
        aVar.f17955d = f17981P;
        aVar.f17956e = f17982Q;
        aVar.f17957f = f17983R;
        aVar.f17958g = f17984S;
        aVar.f17964m = f17985T;
        aVar.f17965n = f17986U;
        aVar.f17966o = f17987V;
        aVar.f17967p = f17988W;
        aVar.f17968q = f17989X;
        aVar.f17969r = f17990Y;
        aVar.f17970s = f17991Z;
        aVar.f17972u = f17992aa;
        aVar.f17971t = f17993ba;
        aVar.f17973v = f17994ca;
        aVar.f17974w = f17995da;
        aVar.f17947E = new C6484j(this);
        aVar.f17948F = new C6489o(aVar.f17947E, this);
        aVar.f17950H = new C6503f(new C6508j(aVar.f17948F, 99), C6517d.m24742x(), 100);
        aVar.f17962k = aVar.f17950H.mo16757a();
        aVar.f17949G = new C6508j(new C6512n((C6503f) aVar.f17950H), C6517d.m24717U(), 1);
        aVar.f17951I = new C6486l(this);
        aVar.f17975x = new C6485k(this, aVar.f17957f);
        aVar.f17976y = new C6478d(this, aVar.f17957f);
        aVar.f17977z = new C6479e(this, aVar.f17957f);
        aVar.f17946D = new C6488n(this);
        aVar.f17944B = new C6483i(this);
        aVar.f17943A = new C6482h(this, aVar.f17958g);
        aVar.f17945C = new C6508j(new C6512n(aVar.f17944B, aVar.f17962k, C6517d.m24715S(), 100), C6517d.m24715S(), 1);
        aVar.f17961j = aVar.f17947E.mo16757a();
        aVar.f17960i = aVar.f17946D.mo16757a();
        aVar.f17959h = aVar.f17944B.mo16757a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo16713b(int i) {
        return mo16730f(i) ? 366 : 365;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo16714b(long j) {
        long j2;
        if (j >= 0) {
            j2 = j / 86400000;
        } else {
            j2 = (j - 86399999) / 86400000;
            if (j2 < -3) {
                return ((int) ((j2 + 4) % 7)) + 7;
            }
        }
        return ((int) ((j2 + 3) % 7)) + 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo16715b(long j, int i) {
        return ((int) ((j - mo16726e(i)) / 86400000)) + 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract long mo16716b(int i, int i2);

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo16717c(long j) {
        return mo16715b(j, mo16734i(j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo16718c(long j, int i) {
        return mo16722d(j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public long mo16719c(int i) {
        long e = mo16726e(i);
        int b = mo16714b(e);
        return b > 8 - this.f17997fa ? e + (((long) (8 - b)) * 86400000) : e - (((long) (b - 1)) * 86400000);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public long mo16720c(int i, int i2) {
        return mo16726e(i) + mo16716b(i, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo16721d(int i) {
        return (int) ((mo16719c(i + 1) - mo16719c(i)) / 604800000);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo16722d(long j) {
        int i = mo16734i(j);
        return mo16707a(i, mo16723d(j, i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract int mo16723d(long j, int i);

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo16724e(long j) {
        return j >= 0 ? (int) (j % 86400000) : ((int) ((j + 1) % 86400000)) + 86399999;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo16725e(long j, int i) {
        long c = mo16719c(i);
        if (j < c) {
            return mo16721d(i - 1);
        }
        if (j >= mo16719c(i + 1)) {
            return 1;
        }
        return ((int) ((j - c) / 604800000)) + 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public long mo16726e(int i) {
        return m24285g(i).f17999b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C6475c cVar = (C6475c) obj;
        return mo16706Y() == cVar.mo16706Y() && mo16662k().equals(cVar.mo16662k());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo16728f(long j) {
        return mo16723d(j, mo16734i(j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract long mo16729f(long j, int i);

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract boolean mo16730f(int i);

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo16731g(long j) {
        return mo16725e(j, mo16734i(j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo16732h(long j) {
        long j2;
        int i = mo16734i(j);
        int e = mo16725e(j, i);
        if (e == 1) {
            j2 = j + 604800000;
        } else if (e <= 51) {
            return i;
        } else {
            j2 = j - 1209600000;
        }
        return mo16734i(j2);
    }

    public int hashCode() {
        return (getClass().getName().hashCode() * 11) + mo16662k().hashCode() + mo16706Y();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo16734i(long j) {
        long S = mo16700S();
        long P = (j >> 1) + mo16697P();
        if (P < 0) {
            P = (P - S) + 1;
        }
        int i = (int) (P / S);
        long e = mo16726e(i);
        long j2 = j - e;
        if (j2 < 0) {
            return i - 1;
        }
        long j3 = 31536000000L;
        if (j2 < 31536000000L) {
            return i;
        }
        if (mo16730f(i)) {
            j3 = 31622400000L;
        }
        return e + j3 <= j ? i + 1 : i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo16735j(long j) {
        return false;
    }

    /* renamed from: k */
    public C6567g mo16662k() {
        C6467a L = mo16693L();
        return L != null ? L.mo16662k() : C6567g.f18277a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(60);
        String name = getClass().getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            name = name.substring(lastIndexOf + 1);
        }
        sb.append(name);
        sb.append('[');
        C6567g k = mo16662k();
        if (k != null) {
            sb.append(k.mo16968c());
        }
        if (mo16706Y() != 4) {
            sb.append(",mdfw=");
            sb.append(mo16706Y());
        }
        sb.append(']');
        return sb.toString();
    }
}
