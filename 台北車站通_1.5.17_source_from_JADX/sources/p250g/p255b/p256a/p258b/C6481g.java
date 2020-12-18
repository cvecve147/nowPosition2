package p250g.p255b.p256a.p258b;

import p250g.p255b.p256a.C6517d;
import p250g.p255b.p256a.C6570h;
import p250g.p255b.p256a.p259c.C6504g;
import p250g.p255b.p256a.p259c.C6505h;

/* renamed from: g.b.a.b.g */
class C6481g extends C6505h {

    /* renamed from: d */
    private final C6475c f18006d;

    /* renamed from: e */
    private final int f18007e = this.f18006d.mo16703V();

    /* renamed from: f */
    private final int f18008f;

    C6481g(C6475c cVar, int i) {
        super(C6517d.m24710N(), cVar.mo16698Q());
        this.f18006d = cVar;
        this.f18008f = i;
    }

    /* renamed from: a */
    public int mo16740a(long j) {
        return this.f18006d.mo16728f(j);
    }

    /* renamed from: a */
    public long mo16747a(long j, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (i == 0) {
            return j;
        }
        long e = (long) this.f18006d.mo16724e(j);
        int i7 = this.f18006d.mo16734i(j);
        int d = this.f18006d.mo16723d(j, i7);
        int i8 = d - 1;
        int i9 = i8 + i;
        if (d <= 0 || i9 >= 0) {
            i2 = i9;
            i3 = i7;
        } else {
            if (Math.signum((float) (this.f18007e + i)) == Math.signum((float) i)) {
                i3 = i7 - 1;
                i6 = i + this.f18007e;
            } else {
                i3 = i7 + 1;
                i6 = i - this.f18007e;
            }
            i2 = i6 + i8;
        }
        if (i2 >= 0) {
            int i10 = this.f18007e;
            i5 = i3 + (i2 / i10);
            i4 = (i2 % i10) + 1;
        } else {
            i5 = (i3 + (i2 / this.f18007e)) - 1;
            int abs = Math.abs(i2);
            int i11 = this.f18007e;
            int i12 = abs % i11;
            if (i12 == 0) {
                i12 = i11;
            }
            i4 = (this.f18007e - i12) + 1;
            if (i4 == 1) {
                i5++;
            }
        }
        int a = this.f18006d.mo16710a(j, i7, d);
        int a2 = this.f18006d.mo16707a(i5, i4);
        if (a > a2) {
            a = a2;
        }
        return this.f18006d.mo16712a(i5, i4, a) + e;
    }

    /* renamed from: a */
    public long mo16748a(long j, long j2) {
        long j3;
        long j4;
        long j5 = j;
        long j6 = j2;
        int i = (int) j6;
        if (((long) i) == j6) {
            return mo16747a(j5, i);
        }
        long e = (long) this.f18006d.mo16724e(j5);
        int i2 = this.f18006d.mo16734i(j5);
        int d = this.f18006d.mo16723d(j5, i2);
        long j7 = ((long) (d - 1)) + j6;
        if (j7 >= 0) {
            int i3 = this.f18007e;
            j3 = ((long) i2) + (j7 / ((long) i3));
            j4 = (j7 % ((long) i3)) + 1;
        } else {
            j3 = (((long) i2) + (j7 / ((long) this.f18007e))) - 1;
            long abs = Math.abs(j7);
            int i4 = this.f18007e;
            int i5 = (int) (abs % ((long) i4));
            if (i5 != 0) {
                i4 = i5;
            }
            j4 = (long) ((this.f18007e - i4) + 1);
            if (j4 == 1) {
                j3++;
            }
        }
        if (j3 < ((long) this.f18006d.mo16705X()) || j3 > ((long) this.f18006d.mo16704W())) {
            throw new IllegalArgumentException("Magnitude of add amount is too large: " + j6);
        }
        int i6 = (int) j3;
        int i7 = (int) j4;
        int a = this.f18006d.mo16710a(j5, i2, d);
        int a2 = this.f18006d.mo16707a(i6, i7);
        if (a > a2) {
            a = a2;
        }
        return this.f18006d.mo16712a(i6, i7, a) + e;
    }

    /* renamed from: b */
    public long mo16749b(long j, int i) {
        C6504g.m24589a(this, i, 1, this.f18007e);
        int i2 = this.f18006d.mo16734i(j);
        int a = this.f18006d.mo16709a(j, i2);
        int a2 = this.f18006d.mo16707a(i2, i);
        if (a > a2) {
            a = a2;
        }
        return this.f18006d.mo16712a(i2, i, a) + ((long) this.f18006d.mo16724e(j));
    }

    /* renamed from: b */
    public C6570h mo16750b() {
        return this.f18006d.mo16659h();
    }

    /* renamed from: b */
    public boolean mo16741b(long j) {
        int i = this.f18006d.mo16734i(j);
        return this.f18006d.mo16730f(i) && this.f18006d.mo16723d(j, i) == this.f18008f;
    }

    /* renamed from: c */
    public int mo16742c() {
        return this.f18007e;
    }

    /* renamed from: c */
    public long mo16751c(long j) {
        return j - mo16752e(j);
    }

    /* renamed from: d */
    public int mo16743d() {
        return 1;
    }

    /* renamed from: e */
    public long mo16752e(long j) {
        int i = this.f18006d.mo16734i(j);
        return this.f18006d.mo16720c(i, this.f18006d.mo16723d(j, i));
    }

    /* renamed from: f */
    public C6570h mo16745f() {
        return this.f18006d.mo16650K();
    }
}
