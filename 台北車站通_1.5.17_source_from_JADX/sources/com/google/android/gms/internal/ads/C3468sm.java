package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.sm */
final class C3468sm extends C3411qm {

    /* renamed from: f */
    private final byte[] f10210f;

    /* renamed from: g */
    private final boolean f10211g;

    /* renamed from: h */
    private int f10212h;

    /* renamed from: i */
    private int f10213i;

    /* renamed from: j */
    private int f10214j;

    /* renamed from: k */
    private int f10215k;

    /* renamed from: l */
    private int f10216l;

    /* renamed from: m */
    private int f10217m;

    private C3468sm(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.f10217m = Integer.MAX_VALUE;
        this.f10210f = bArr;
        this.f10212h = i2 + i;
        this.f10214j = i;
        this.f10215k = this.f10214j;
        this.f10211g = z;
    }

    /* renamed from: A */
    private final byte m13765A() {
        int i = this.f10214j;
        if (i != this.f10212h) {
            byte[] bArr = this.f10210f;
            this.f10214j = i + 1;
            return bArr[i];
        }
        throw C2755Um.m11347a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0066, code lost:
        if (r2[r3] >= 0) goto L_0x0068;
     */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m13766v() {
        /*
            r5 = this;
            int r0 = r5.f10214j
            int r1 = r5.f10212h
            if (r1 == r0) goto L_0x006b
            byte[] r2 = r5.f10210f
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0011
            r5.f10214j = r3
            return r0
        L_0x0011:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L_0x006b
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x0022
            r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            goto L_0x0068
        L_0x0022:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L_0x002f
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L_0x002d:
            r1 = r3
            goto L_0x0068
        L_0x002f:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x003d
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L_0x0068
        L_0x003d:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L_0x002d
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0068
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x002d
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0068
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x002d
            int r1 = r3 + 1
            byte r2 = r2[r3]
            if (r2 < 0) goto L_0x006b
        L_0x0068:
            r5.f10214j = r1
            return r0
        L_0x006b:
            long r0 = r5.mo10021u()
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3468sm.m13766v():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b0, code lost:
        if (((long) r2[r0]) >= 0) goto L_0x00b4;
     */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long m13767w() {
        /*
            r11 = this;
            int r0 = r11.f10214j
            int r1 = r11.f10212h
            if (r1 == r0) goto L_0x00b8
            byte[] r2 = r11.f10210f
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0012
            r11.f10214j = r3
            long r0 = (long) r0
            return r0
        L_0x0012:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L_0x00b8
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x0025
            r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
        L_0x0022:
            long r2 = (long) r0
            goto L_0x00b5
        L_0x0025:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L_0x0036
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            long r0 = (long) r0
            r9 = r0
            r1 = r3
            r2 = r9
            goto L_0x00b5
        L_0x0036:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x0044
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L_0x0022
        L_0x0044:
            long r3 = (long) r0
            int r0 = r1 + 1
            byte r1 = r2[r1]
            long r5 = (long) r1
            r1 = 28
            long r5 = r5 << r1
            long r3 = r3 ^ r5
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x005b
            r1 = 266354560(0xfe03f80, double:1.315966377E-315)
        L_0x0057:
            long r2 = r3 ^ r1
            r1 = r0
            goto L_0x00b5
        L_0x005b:
            int r1 = r0 + 1
            byte r0 = r2[r0]
            long r7 = (long) r0
            r0 = 35
            long r7 = r7 << r0
            long r3 = r3 ^ r7
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0070
            r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
        L_0x006d:
            long r2 = r3 ^ r5
            goto L_0x00b5
        L_0x0070:
            int r0 = r1 + 1
            byte r1 = r2[r1]
            long r7 = (long) r1
            r1 = 42
            long r7 = r7 << r1
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x0083
            r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
            goto L_0x0057
        L_0x0083:
            int r1 = r0 + 1
            byte r0 = r2[r0]
            long r7 = (long) r0
            r0 = 49
            long r7 = r7 << r0
            long r3 = r3 ^ r7
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0096
            r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
            goto L_0x006d
        L_0x0096:
            int r0 = r1 + 1
            byte r1 = r2[r1]
            long r7 = (long) r1
            r1 = 56
            long r7 = r7 << r1
            long r3 = r3 ^ r7
            r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L_0x00b3
            int r1 = r0 + 1
            byte r0 = r2[r0]
            long r7 = (long) r0
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x00b8
            goto L_0x00b4
        L_0x00b3:
            r1 = r0
        L_0x00b4:
            r2 = r3
        L_0x00b5:
            r11.f10214j = r1
            return r2
        L_0x00b8:
            long r0 = r11.mo10021u()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3468sm.m13767w():long");
    }

    /* renamed from: x */
    private final int m13768x() {
        int i = this.f10214j;
        if (this.f10212h - i >= 4) {
            byte[] bArr = this.f10210f;
            this.f10214j = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }
        throw C2755Um.m11347a();
    }

    /* renamed from: y */
    private final long m13769y() {
        int i = this.f10214j;
        if (this.f10212h - i >= 8) {
            byte[] bArr = this.f10210f;
            this.f10214j = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }
        throw C2755Um.m11347a();
    }

    /* renamed from: z */
    private final void m13770z() {
        this.f10212h += this.f10213i;
        int i = this.f10212h;
        int i2 = i - this.f10215k;
        int i3 = this.f10217m;
        if (i2 > i3) {
            this.f10213i = i2 - i3;
            this.f10212h = i - this.f10213i;
            return;
        }
        this.f10213i = 0;
    }

    /* renamed from: a */
    public final double mo9938a() {
        return Double.longBitsToDouble(m13769y());
    }

    /* renamed from: a */
    public final void mo9939a(int i) {
        if (this.f10216l != i) {
            throw C2755Um.m11351e();
        }
    }

    /* renamed from: b */
    public final float mo9940b() {
        return Float.intBitsToFloat(m13768x());
    }

    /* renamed from: b */
    public final boolean mo9941b(int i) {
        int d;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.f10212h - this.f10214j >= 10) {
                while (i3 < 10) {
                    byte[] bArr = this.f10210f;
                    int i4 = this.f10214j;
                    this.f10214j = i4 + 1;
                    if (bArr[i4] < 0) {
                        i3++;
                    }
                }
                throw C2755Um.m11349c();
            }
            while (i3 < 10) {
                if (m13765A() < 0) {
                    i3++;
                }
            }
            throw C2755Um.m11349c();
            return true;
        } else if (i2 == 1) {
            mo10020f(8);
            return true;
        } else if (i2 == 2) {
            mo10020f(m13766v());
            return true;
        } else if (i2 == 3) {
            do {
                d = mo9944d();
                if (d == 0 || !mo9941b(d)) {
                    mo9939a(((i >>> 3) << 3) | 4);
                }
                d = mo9944d();
                break;
            } while (!mo9941b(d));
            mo9939a(((i >>> 3) << 3) | 4);
            return true;
        } else if (i2 == 4) {
            return false;
        } else {
            if (i2 == 5) {
                mo10020f(4);
                return true;
            }
            throw C2755Um.m11352f();
        }
    }

    /* renamed from: c */
    public final int mo9942c(int i) {
        if (i >= 0) {
            int t = i + mo9961t();
            int i2 = this.f10217m;
            if (t <= i2) {
                this.f10217m = t;
                m13770z();
                return i2;
            }
            throw C2755Um.m11347a();
        }
        throw C2755Um.m11348b();
    }

    /* renamed from: c */
    public final String mo9943c() {
        int v = m13766v();
        if (v > 0) {
            int i = this.f10212h;
            int i2 = this.f10214j;
            if (v <= i - i2) {
                String str = new String(this.f10210f, i2, v, C2641Qm.f8145a);
                this.f10214j += v;
                return str;
            }
        }
        if (v == 0) {
            return "";
        }
        if (v < 0) {
            throw C2755Um.m11348b();
        }
        throw C2755Um.m11347a();
    }

    /* renamed from: d */
    public final int mo9944d() {
        if (mo9960s()) {
            this.f10216l = 0;
            return 0;
        }
        this.f10216l = m13766v();
        int i = this.f10216l;
        if ((i >>> 3) != 0) {
            return i;
        }
        throw C2755Um.m11350d();
    }

    /* renamed from: d */
    public final void mo9945d(int i) {
        this.f10217m = i;
        m13770z();
    }

    /* renamed from: e */
    public final long mo9946e() {
        return m13767w();
    }

    /* renamed from: f */
    public final long mo9947f() {
        return m13767w();
    }

    /* renamed from: f */
    public final void mo10020f(int i) {
        if (i >= 0) {
            int i2 = this.f10212h;
            int i3 = this.f10214j;
            if (i <= i2 - i3) {
                this.f10214j = i3 + i;
                return;
            }
        }
        if (i < 0) {
            throw C2755Um.m11348b();
        }
        throw C2755Um.m11347a();
    }

    /* renamed from: g */
    public final int mo9948g() {
        return m13766v();
    }

    /* renamed from: h */
    public final long mo9949h() {
        return m13769y();
    }

    /* renamed from: i */
    public final int mo9950i() {
        return m13768x();
    }

    /* renamed from: j */
    public final boolean mo9951j() {
        return m13767w() != 0;
    }

    /* renamed from: k */
    public final String mo9952k() {
        int v = m13766v();
        if (v > 0) {
            int i = this.f10212h;
            int i2 = this.f10214j;
            if (v <= i - i2) {
                if (C3271lo.m12994a(this.f10210f, i2, i2 + v)) {
                    int i3 = this.f10214j;
                    this.f10214j = i3 + v;
                    return new String(this.f10210f, i3, v, C2641Qm.f8145a);
                }
                throw C2755Um.m11354h();
            }
        }
        if (v == 0) {
            return "";
        }
        if (v <= 0) {
            throw C2755Um.m11348b();
        }
        throw C2755Um.m11347a();
    }

    /* renamed from: l */
    public final C3150hm mo9953l() {
        byte[] bArr;
        int v = m13766v();
        if (v > 0) {
            int i = this.f10212h;
            int i2 = this.f10214j;
            if (v <= i - i2) {
                C3150hm a = C3150hm.m12538a(this.f10210f, i2, v);
                this.f10214j += v;
                return a;
            }
        }
        if (v == 0) {
            return C3150hm.f9434a;
        }
        if (v > 0) {
            int i3 = this.f10212h;
            int i4 = this.f10214j;
            if (v <= i3 - i4) {
                this.f10214j = v + i4;
                bArr = Arrays.copyOfRange(this.f10210f, i4, this.f10214j);
                return C3150hm.m12540b(bArr);
            }
        }
        if (v > 0) {
            throw C2755Um.m11347a();
        } else if (v == 0) {
            bArr = C2641Qm.f8147c;
            return C3150hm.m12540b(bArr);
        } else {
            throw C2755Um.m11348b();
        }
    }

    /* renamed from: m */
    public final int mo9954m() {
        return m13766v();
    }

    /* renamed from: n */
    public final int mo9955n() {
        return m13766v();
    }

    /* renamed from: o */
    public final int mo9956o() {
        return m13768x();
    }

    /* renamed from: p */
    public final long mo9957p() {
        return m13769y();
    }

    /* renamed from: q */
    public final int mo9958q() {
        return C3411qm.m13540e(m13766v());
    }

    /* renamed from: r */
    public final long mo9959r() {
        return C3411qm.m13538a(m13767w());
    }

    /* renamed from: s */
    public final boolean mo9960s() {
        return this.f10214j == this.f10212h;
    }

    /* renamed from: t */
    public final int mo9961t() {
        return this.f10214j - this.f10215k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final long mo10021u() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte A = m13765A();
            j |= ((long) (A & Byte.MAX_VALUE)) << i;
            if ((A & 128) == 0) {
                return j;
            }
        }
        throw C2755Um.m11349c();
    }
}
