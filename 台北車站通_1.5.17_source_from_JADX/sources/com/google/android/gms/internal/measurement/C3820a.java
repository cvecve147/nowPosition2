package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.a */
public final class C3820a {

    /* renamed from: a */
    private final byte[] f11377a;

    /* renamed from: b */
    private final int f11378b;

    /* renamed from: c */
    private final int f11379c;

    /* renamed from: d */
    private int f11380d;

    /* renamed from: e */
    private int f11381e;

    /* renamed from: f */
    private int f11382f;

    /* renamed from: g */
    private int f11383g;

    /* renamed from: h */
    private int f11384h = Integer.MAX_VALUE;

    /* renamed from: i */
    private int f11385i;

    /* renamed from: j */
    private int f11386j = 64;

    /* renamed from: k */
    private int f11387k = 67108864;

    private C3820a(byte[] bArr, int i, int i2) {
        this.f11377a = bArr;
        this.f11378b = i;
        int i3 = i2 + i;
        this.f11380d = i3;
        this.f11379c = i3;
        this.f11382f = i;
    }

    /* renamed from: a */
    public static C3820a m15286a(byte[] bArr, int i, int i2) {
        return new C3820a(bArr, 0, i2);
    }

    /* renamed from: f */
    private final void m15287f(int i) {
        if (i >= 0) {
            int i2 = this.f11382f;
            int i3 = i2 + i;
            int i4 = this.f11384h;
            if (i3 > i4) {
                m15287f(i4 - i2);
                throw C3852i.m15481a();
            } else if (i <= this.f11380d - i2) {
                this.f11382f = i2 + i;
            } else {
                throw C3852i.m15481a();
            }
        } else {
            throw C3852i.m15482b();
        }
    }

    /* renamed from: j */
    private final void m15288j() {
        this.f11380d += this.f11381e;
        int i = this.f11380d;
        int i2 = this.f11384h;
        if (i > i2) {
            this.f11381e = i - i2;
            this.f11380d = i - this.f11381e;
            return;
        }
        this.f11381e = 0;
    }

    /* renamed from: k */
    private final byte m15289k() {
        int i = this.f11382f;
        if (i != this.f11380d) {
            byte[] bArr = this.f11377a;
            this.f11382f = i + 1;
            return bArr[i];
        }
        throw C3852i.m15481a();
    }

    /* renamed from: a */
    public final int mo10638a() {
        return this.f11382f - this.f11378b;
    }

    /* renamed from: a */
    public final int mo10639a(int i) {
        if (i >= 0) {
            int i2 = i + this.f11382f;
            int i3 = this.f11384h;
            if (i2 <= i3) {
                this.f11384h = i2;
                m15288j();
                return i3;
            }
            throw C3852i.m15481a();
        }
        throw C3852i.m15482b();
    }

    /* renamed from: a */
    public final void mo10640a(C3856j jVar) {
        int e = mo10649e();
        if (this.f11385i < this.f11386j) {
            int a = mo10639a(e);
            this.f11385i++;
            jVar.mo10404a(this);
            mo10643b(0);
            this.f11385i--;
            mo10647d(a);
            return;
        }
        throw C3852i.m15484d();
    }

    /* renamed from: a */
    public final byte[] mo10641a(int i, int i2) {
        if (i2 == 0) {
            return C3868m.f11546h;
        }
        byte[] bArr = new byte[i2];
        System.arraycopy(this.f11377a, this.f11378b + i, bArr, 0, i2);
        return bArr;
    }

    /* renamed from: b */
    public final String mo10642b() {
        int e = mo10649e();
        if (e >= 0) {
            int i = this.f11380d;
            int i2 = this.f11382f;
            if (e <= i - i2) {
                String str = new String(this.f11377a, i2, e, C3848h.f11466a);
                this.f11382f += e;
                return str;
            }
            throw C3852i.m15481a();
        }
        throw C3852i.m15482b();
    }

    /* renamed from: b */
    public final void mo10643b(int i) {
        if (this.f11383g != i) {
            throw new C3852i("Protocol message end-group tag did not match expected tag.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo10644b(int i, int i2) {
        int i3 = this.f11382f;
        int i4 = this.f11378b;
        if (i > i3 - i4) {
            StringBuilder sb = new StringBuilder(50);
            sb.append("Position ");
            sb.append(i);
            sb.append(" is beyond current ");
            sb.append(i3 - i4);
            throw new IllegalArgumentException(sb.toString());
        } else if (i >= 0) {
            this.f11382f = i4 + i;
            this.f11383g = i2;
        } else {
            StringBuilder sb2 = new StringBuilder(24);
            sb2.append("Bad position ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* renamed from: c */
    public final int mo10645c() {
        if (this.f11382f == this.f11380d) {
            this.f11383g = 0;
            return 0;
        }
        this.f11383g = mo10649e();
        int i = this.f11383g;
        if (i != 0) {
            return i;
        }
        throw new C3852i("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: c */
    public final boolean mo10646c(int i) {
        int c;
        int i2 = i & 7;
        if (i2 == 0) {
            mo10649e();
            return true;
        } else if (i2 == 1) {
            mo10653h();
            return true;
        } else if (i2 == 2) {
            m15287f(mo10649e());
            return true;
        } else if (i2 == 3) {
            do {
                c = mo10645c();
                if (c == 0 || !mo10646c(c)) {
                    mo10643b(((i >>> 3) << 3) | 4);
                }
                c = mo10645c();
                break;
            } while (!mo10646c(c));
            mo10643b(((i >>> 3) << 3) | 4);
            return true;
        } else if (i2 == 4) {
            return false;
        } else {
            if (i2 == 5) {
                mo10652g();
                return true;
            }
            throw new C3852i("Protocol message tag had invalid wire type.");
        }
    }

    /* renamed from: d */
    public final void mo10647d(int i) {
        this.f11384h = i;
        m15288j();
    }

    /* renamed from: d */
    public final boolean mo10648d() {
        return mo10649e() != 0;
    }

    /* renamed from: e */
    public final int mo10649e() {
        int i;
        byte k = m15289k();
        if (k >= 0) {
            return k;
        }
        byte b = k & Byte.MAX_VALUE;
        byte k2 = m15289k();
        if (k2 >= 0) {
            i = k2 << 7;
        } else {
            b |= (k2 & Byte.MAX_VALUE) << 7;
            byte k3 = m15289k();
            if (k3 >= 0) {
                i = k3 << 14;
            } else {
                b |= (k3 & Byte.MAX_VALUE) << 14;
                byte k4 = m15289k();
                if (k4 >= 0) {
                    i = k4 << 21;
                } else {
                    byte b2 = b | ((k4 & Byte.MAX_VALUE) << 21);
                    byte k5 = m15289k();
                    byte b3 = b2 | (k5 << 28);
                    if (k5 >= 0) {
                        return b3;
                    }
                    for (int i2 = 0; i2 < 5; i2++) {
                        if (m15289k() >= 0) {
                            return b3;
                        }
                    }
                    throw C3852i.m15483c();
                }
            }
        }
        return b | i;
    }

    /* renamed from: e */
    public final void mo10650e(int i) {
        mo10644b(i, this.f11383g);
    }

    /* renamed from: f */
    public final long mo10651f() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte k = m15289k();
            j |= ((long) (k & Byte.MAX_VALUE)) << i;
            if ((k & 128) == 0) {
                return j;
            }
        }
        throw C3852i.m15483c();
    }

    /* renamed from: g */
    public final int mo10652g() {
        return (m15289k() & 255) | ((m15289k() & 255) << 8) | ((m15289k() & 255) << 16) | ((m15289k() & 255) << 24);
    }

    /* renamed from: h */
    public final long mo10653h() {
        byte k = m15289k();
        byte k2 = m15289k();
        return ((((long) k2) & 255) << 8) | (((long) k) & 255) | ((((long) m15289k()) & 255) << 16) | ((((long) m15289k()) & 255) << 24) | ((((long) m15289k()) & 255) << 32) | ((((long) m15289k()) & 255) << 40) | ((((long) m15289k()) & 255) << 48) | ((((long) m15289k()) & 255) << 56);
    }

    /* renamed from: i */
    public final int mo10654i() {
        int i = this.f11384h;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - this.f11382f;
    }
}
