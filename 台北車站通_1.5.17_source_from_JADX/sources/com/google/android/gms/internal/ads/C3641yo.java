package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.yo */
public final class C3641yo {

    /* renamed from: a */
    private final byte[] f10575a;

    /* renamed from: b */
    private final int f10576b;

    /* renamed from: c */
    private final int f10577c;

    /* renamed from: d */
    private int f10578d;

    /* renamed from: e */
    private int f10579e;

    /* renamed from: f */
    private int f10580f;

    /* renamed from: g */
    private int f10581g;

    /* renamed from: h */
    private int f10582h = Integer.MAX_VALUE;

    /* renamed from: i */
    private int f10583i;

    /* renamed from: j */
    private int f10584j = 64;

    /* renamed from: k */
    private int f10585k = 67108864;

    private C3641yo(byte[] bArr, int i, int i2) {
        this.f10575a = bArr;
        this.f10576b = i;
        int i3 = i2 + i;
        this.f10578d = i3;
        this.f10577c = i3;
        this.f10580f = i;
    }

    /* renamed from: a */
    public static C3641yo m14599a(byte[] bArr, int i, int i2) {
        return new C3641yo(bArr, 0, i2);
    }

    /* renamed from: f */
    private final void m14600f(int i) {
        if (i >= 0) {
            int i2 = this.f10580f;
            int i3 = i2 + i;
            int i4 = this.f10582h;
            if (i3 > i4) {
                m14600f(i4 - i2);
                throw C2380Ho.m10167a();
            } else if (i <= this.f10578d - i2) {
                this.f10580f = i2 + i;
            } else {
                throw C2380Ho.m10167a();
            }
        } else {
            throw C2380Ho.m10168b();
        }
    }

    /* renamed from: k */
    private final void m14601k() {
        this.f10578d += this.f10579e;
        int i = this.f10578d;
        int i2 = this.f10582h;
        if (i > i2) {
            this.f10579e = i - i2;
            this.f10578d = i - this.f10579e;
            return;
        }
        this.f10579e = 0;
    }

    /* renamed from: l */
    private final byte m14602l() {
        int i = this.f10580f;
        if (i != this.f10578d) {
            byte[] bArr = this.f10575a;
            this.f10580f = i + 1;
            return bArr[i];
        }
        throw C2380Ho.m10167a();
    }

    /* renamed from: a */
    public final int mo10234a() {
        return this.f10580f - this.f10576b;
    }

    /* renamed from: a */
    public final void mo10235a(int i) {
        if (this.f10581g != i) {
            throw new C2380Ho("Protocol message end-group tag did not match expected tag.");
        }
    }

    /* renamed from: a */
    public final void mo10236a(C2408Io io) {
        int h = mo10249h();
        if (this.f10583i < this.f10584j) {
            int c = mo10241c(h);
            this.f10583i++;
            io.mo7847a(this);
            mo10235a(0);
            this.f10583i--;
            mo10244d(c);
            return;
        }
        throw new C2380Ho("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* renamed from: a */
    public final byte[] mo10237a(int i, int i2) {
        if (i2 == 0) {
            return C2494Lo.f7526h;
        }
        byte[] bArr = new byte[i2];
        System.arraycopy(this.f10575a, this.f10576b + i, bArr, 0, i2);
        return bArr;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo10238b(int i, int i2) {
        int i3 = this.f10580f;
        int i4 = this.f10576b;
        if (i > i3 - i4) {
            StringBuilder sb = new StringBuilder(50);
            sb.append("Position ");
            sb.append(i);
            sb.append(" is beyond current ");
            sb.append(i3 - i4);
            throw new IllegalArgumentException(sb.toString());
        } else if (i >= 0) {
            this.f10580f = i4 + i;
            this.f10581g = i2;
        } else {
            StringBuilder sb2 = new StringBuilder(24);
            sb2.append("Bad position ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* renamed from: b */
    public final boolean mo10239b(int i) {
        int d;
        int i2 = i & 7;
        if (i2 == 0) {
            mo10249h();
            return true;
        } else if (i2 == 1) {
            m14602l();
            m14602l();
            m14602l();
            m14602l();
            m14602l();
            m14602l();
            m14602l();
            m14602l();
            return true;
        } else if (i2 == 2) {
            m14600f(mo10249h());
            return true;
        } else if (i2 == 3) {
            do {
                d = mo10243d();
                if (d == 0 || !mo10239b(d)) {
                    mo10235a(((i >>> 3) << 3) | 4);
                }
                d = mo10243d();
                break;
            } while (!mo10239b(d));
            mo10235a(((i >>> 3) << 3) | 4);
            return true;
        } else if (i2 == 4) {
            return false;
        } else {
            if (i2 == 5) {
                m14602l();
                m14602l();
                m14602l();
                m14602l();
                return true;
            }
            throw new C2380Ho("Protocol message tag had invalid wire type.");
        }
    }

    /* renamed from: b */
    public final byte[] mo10240b() {
        int h = mo10249h();
        if (h < 0) {
            throw C2380Ho.m10168b();
        } else if (h == 0) {
            return C2494Lo.f7526h;
        } else {
            int i = this.f10578d;
            int i2 = this.f10580f;
            if (h <= i - i2) {
                byte[] bArr = new byte[h];
                System.arraycopy(this.f10575a, i2, bArr, 0, h);
                this.f10580f += h;
                return bArr;
            }
            throw C2380Ho.m10167a();
        }
    }

    /* renamed from: c */
    public final int mo10241c(int i) {
        if (i >= 0) {
            int i2 = i + this.f10580f;
            int i3 = this.f10582h;
            if (i2 <= i3) {
                this.f10582h = i2;
                m14601k();
                return i3;
            }
            throw C2380Ho.m10167a();
        }
        throw C2380Ho.m10168b();
    }

    /* renamed from: c */
    public final String mo10242c() {
        int h = mo10249h();
        if (h >= 0) {
            int i = this.f10578d;
            int i2 = this.f10580f;
            if (h <= i - i2) {
                String str = new String(this.f10575a, i2, h, C2352Go.f7087a);
                this.f10580f += h;
                return str;
            }
            throw C2380Ho.m10167a();
        }
        throw C2380Ho.m10168b();
    }

    /* renamed from: d */
    public final int mo10243d() {
        if (this.f10580f == this.f10578d) {
            this.f10581g = 0;
            return 0;
        }
        this.f10581g = mo10249h();
        int i = this.f10581g;
        if (i != 0) {
            return i;
        }
        throw new C2380Ho("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: d */
    public final void mo10244d(int i) {
        this.f10582h = i;
        m14601k();
    }

    /* renamed from: e */
    public final long mo10245e() {
        return mo10250i();
    }

    /* renamed from: e */
    public final void mo10246e(int i) {
        mo10238b(i, this.f10581g);
    }

    /* renamed from: f */
    public final int mo10247f() {
        return mo10249h();
    }

    /* renamed from: g */
    public final boolean mo10248g() {
        return mo10249h() != 0;
    }

    /* renamed from: h */
    public final int mo10249h() {
        int i;
        byte l = m14602l();
        if (l >= 0) {
            return l;
        }
        byte b = l & Byte.MAX_VALUE;
        byte l2 = m14602l();
        if (l2 >= 0) {
            i = l2 << 7;
        } else {
            b |= (l2 & Byte.MAX_VALUE) << 7;
            byte l3 = m14602l();
            if (l3 >= 0) {
                i = l3 << 14;
            } else {
                b |= (l3 & Byte.MAX_VALUE) << 14;
                byte l4 = m14602l();
                if (l4 >= 0) {
                    i = l4 << 21;
                } else {
                    byte b2 = b | ((l4 & Byte.MAX_VALUE) << 21);
                    byte l5 = m14602l();
                    byte b3 = b2 | (l5 << 28);
                    if (l5 >= 0) {
                        return b3;
                    }
                    for (int i2 = 0; i2 < 5; i2++) {
                        if (m14602l() >= 0) {
                            return b3;
                        }
                    }
                    throw C2380Ho.m10169c();
                }
            }
        }
        return b | i;
    }

    /* renamed from: i */
    public final long mo10250i() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte l = m14602l();
            j |= ((long) (l & Byte.MAX_VALUE)) << i;
            if ((l & 128) == 0) {
                return j;
            }
        }
        throw C2380Ho.m10169c();
    }

    /* renamed from: j */
    public final int mo10251j() {
        int i = this.f10582h;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - this.f10580f;
    }
}
