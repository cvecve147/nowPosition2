package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.ads.um */
public abstract class C3525um extends C3122gm {

    /* renamed from: a */
    private static final Logger f10305a = Logger.getLogger(C3525um.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final boolean f10306b = C3210jo.m12744b();

    /* renamed from: c */
    C3583wm f10307c;

    /* renamed from: com.google.android.gms.internal.ads.um$a */
    static class C3526a extends C3525um {

        /* renamed from: d */
        private final byte[] f10308d;

        /* renamed from: e */
        private final int f10309e;

        /* renamed from: f */
        private final int f10310f;

        /* renamed from: g */
        private int f10311g;

        C3526a(byte[] bArr, int i, int i2) {
            super();
            if (bArr != null) {
                int i3 = i2 + 0;
                if ((i2 | 0 | (bArr.length - i3)) >= 0) {
                    this.f10308d = bArr;
                    this.f10309e = 0;
                    this.f10311g = 0;
                    this.f10310f = i3;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), 0, Integer.valueOf(i2)}));
            }
            throw new NullPointerException("buffer");
        }

        /* renamed from: a */
        public final int mo10085a() {
            return this.f10310f - this.f10311g;
        }

        /* renamed from: a */
        public final void mo10086a(byte b) {
            try {
                byte[] bArr = this.f10308d;
                int i = this.f10311g;
                this.f10311g = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new C3527b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f10311g), Integer.valueOf(this.f10310f), 1}), e);
            }
        }

        /* renamed from: a */
        public final void mo10089a(int i) {
            if (i >= 0) {
                mo10103b(i);
            } else {
                mo10099a((long) i);
            }
        }

        /* renamed from: a */
        public final void mo10092a(int i, int i2) {
            mo10103b((i << 3) | i2);
        }

        /* renamed from: a */
        public final void mo10093a(int i, long j) {
            mo10092a(i, 0);
            mo10099a(j);
        }

        /* renamed from: a */
        public final void mo10094a(int i, C3150hm hmVar) {
            mo10092a(i, 2);
            mo10115b(hmVar);
        }

        /* renamed from: a */
        public final void mo10095a(int i, C3498tn tnVar) {
            mo10092a(1, 3);
            mo10109c(2, i);
            mo10092a(3, 2);
            mo10118c(tnVar);
            mo10092a(1, 4);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo10096a(int i, C3498tn tnVar, C2493Ln ln) {
            mo10092a(i, 2);
            C2838Xl xl = (C2838Xl) tnVar;
            int j = xl.mo8621j();
            if (j == -1) {
                j = ln.mo8502b(xl);
                xl.mo8612a(j);
            }
            mo10103b(j);
            ln.mo8498a(tnVar, (C3613xo) this.f10307c);
        }

        /* renamed from: a */
        public final void mo10097a(int i, String str) {
            mo10092a(i, 2);
            mo10116b(str);
        }

        /* renamed from: a */
        public final void mo10098a(int i, boolean z) {
            mo10092a(i, 0);
            mo10086a(z ? (byte) 1 : 0);
        }

        /* renamed from: a */
        public final void mo10099a(long j) {
            if (!C3525um.f10306b || mo10085a() < 10) {
                while ((j & -128) != 0) {
                    byte[] bArr = this.f10308d;
                    int i = this.f10311g;
                    this.f10311g = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f10308d;
                    int i2 = this.f10311g;
                    this.f10311g = i2 + 1;
                    bArr2[i2] = (byte) ((int) j);
                } catch (IndexOutOfBoundsException e) {
                    throw new C3527b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f10311g), Integer.valueOf(this.f10310f), 1}), e);
                }
            } else {
                while ((j & -128) != 0) {
                    byte[] bArr3 = this.f10308d;
                    int i3 = this.f10311g;
                    this.f10311g = i3 + 1;
                    C3210jo.m12737a(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr4 = this.f10308d;
                int i4 = this.f10311g;
                this.f10311g = i4 + 1;
                C3210jo.m12737a(bArr4, (long) i4, (byte) ((int) j));
            }
        }

        /* renamed from: a */
        public final void mo9476a(byte[] bArr, int i, int i2) {
            mo10117b(bArr, i, i2);
        }

        /* renamed from: b */
        public final void mo10103b(int i) {
            if (!C3525um.f10306b || mo10085a() < 10) {
                while ((i & -128) != 0) {
                    byte[] bArr = this.f10308d;
                    int i2 = this.f10311g;
                    this.f10311g = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f10308d;
                    int i3 = this.f10311g;
                    this.f10311g = i3 + 1;
                    bArr2[i3] = (byte) i;
                } catch (IndexOutOfBoundsException e) {
                    throw new C3527b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f10311g), Integer.valueOf(this.f10310f), 1}), e);
                }
            } else {
                while ((i & -128) != 0) {
                    byte[] bArr3 = this.f10308d;
                    int i4 = this.f10311g;
                    this.f10311g = i4 + 1;
                    C3210jo.m12737a(bArr3, (long) i4, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                byte[] bArr4 = this.f10308d;
                int i5 = this.f10311g;
                this.f10311g = i5 + 1;
                C3210jo.m12737a(bArr4, (long) i5, (byte) i);
            }
        }

        /* renamed from: b */
        public final void mo10104b(int i, int i2) {
            mo10092a(i, 0);
            mo10089a(i2);
        }

        /* renamed from: b */
        public final void mo10106b(int i, C3150hm hmVar) {
            mo10092a(1, 3);
            mo10109c(2, i);
            mo10094a(3, hmVar);
            mo10092a(1, 4);
        }

        /* renamed from: b */
        public final void mo10115b(C3150hm hmVar) {
            mo10103b(hmVar.size());
            hmVar.mo9503a((C3122gm) this);
        }

        /* renamed from: b */
        public final void mo10116b(String str) {
            int i = this.f10311g;
            try {
                int g = C3525um.m14104g(str.length() * 3);
                int g2 = C3525um.m14104g(str.length());
                if (g2 == g) {
                    this.f10311g = i + g2;
                    int a = C3271lo.m12992a(str, this.f10308d, this.f10311g, mo10085a());
                    this.f10311g = i;
                    mo10103b((a - i) - g2);
                    this.f10311g = a;
                    return;
                }
                mo10103b(C3271lo.m12991a((CharSequence) str));
                this.f10311g = C3271lo.m12992a(str, this.f10308d, this.f10311g, mo10085a());
            } catch (C3356oo e) {
                this.f10311g = i;
                mo10100a(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new C3527b(e2);
            }
        }

        /* renamed from: b */
        public final void mo10117b(byte[] bArr, int i, int i2) {
            try {
                System.arraycopy(bArr, i, this.f10308d, this.f10311g, i2);
                this.f10311g += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new C3527b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f10311g), Integer.valueOf(this.f10310f), Integer.valueOf(i2)}), e);
            }
        }

        /* renamed from: c */
        public final void mo10109c(int i, int i2) {
            mo10092a(i, 0);
            mo10103b(i2);
        }

        /* renamed from: c */
        public final void mo10110c(int i, long j) {
            mo10092a(i, 1);
            mo10111c(j);
        }

        /* renamed from: c */
        public final void mo10111c(long j) {
            try {
                byte[] bArr = this.f10308d;
                int i = this.f10311g;
                this.f10311g = i + 1;
                bArr[i] = (byte) ((int) j);
                byte[] bArr2 = this.f10308d;
                int i2 = this.f10311g;
                this.f10311g = i2 + 1;
                bArr2[i2] = (byte) ((int) (j >> 8));
                byte[] bArr3 = this.f10308d;
                int i3 = this.f10311g;
                this.f10311g = i3 + 1;
                bArr3[i3] = (byte) ((int) (j >> 16));
                byte[] bArr4 = this.f10308d;
                int i4 = this.f10311g;
                this.f10311g = i4 + 1;
                bArr4[i4] = (byte) ((int) (j >> 24));
                byte[] bArr5 = this.f10308d;
                int i5 = this.f10311g;
                this.f10311g = i5 + 1;
                bArr5[i5] = (byte) ((int) (j >> 32));
                byte[] bArr6 = this.f10308d;
                int i6 = this.f10311g;
                this.f10311g = i6 + 1;
                bArr6[i6] = (byte) ((int) (j >> 40));
                byte[] bArr7 = this.f10308d;
                int i7 = this.f10311g;
                this.f10311g = i7 + 1;
                bArr7[i7] = (byte) ((int) (j >> 48));
                byte[] bArr8 = this.f10308d;
                int i8 = this.f10311g;
                this.f10311g = i8 + 1;
                bArr8[i8] = (byte) ((int) (j >> 56));
            } catch (IndexOutOfBoundsException e) {
                throw new C3527b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f10311g), Integer.valueOf(this.f10310f), 1}), e);
            }
        }

        /* renamed from: c */
        public final void mo10118c(C3498tn tnVar) {
            mo10103b(tnVar.mo8615e());
            tnVar.mo8613a(this);
        }

        /* renamed from: d */
        public final void mo10112d(int i) {
            try {
                byte[] bArr = this.f10308d;
                int i2 = this.f10311g;
                this.f10311g = i2 + 1;
                bArr[i2] = (byte) i;
                byte[] bArr2 = this.f10308d;
                int i3 = this.f10311g;
                this.f10311g = i3 + 1;
                bArr2[i3] = (byte) (i >> 8);
                byte[] bArr3 = this.f10308d;
                int i4 = this.f10311g;
                this.f10311g = i4 + 1;
                bArr3[i4] = (byte) (i >> 16);
                byte[] bArr4 = this.f10308d;
                int i5 = this.f10311g;
                this.f10311g = i5 + 1;
                bArr4[i5] = i >> 24;
            } catch (IndexOutOfBoundsException e) {
                throw new C3527b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f10311g), Integer.valueOf(this.f10310f), 1}), e);
            }
        }

        /* renamed from: e */
        public final void mo10114e(int i, int i2) {
            mo10092a(i, 5);
            mo10112d(i2);
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.um$b */
    public static class C3527b extends IOException {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        C3527b(java.lang.String r3, java.lang.Throwable r4) {
            /*
                r2 = this;
                java.lang.String r3 = java.lang.String.valueOf(r3)
                int r0 = r3.length()
                java.lang.String r1 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
                if (r0 == 0) goto L_0x0011
                java.lang.String r3 = r1.concat(r3)
                goto L_0x0016
            L_0x0011:
                java.lang.String r3 = new java.lang.String
                r3.<init>(r1)
            L_0x0016:
                r2.<init>(r3, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3525um.C3527b.<init>(java.lang.String, java.lang.Throwable):void");
        }

        C3527b(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    private C3525um() {
    }

    /* renamed from: a */
    public static int m14072a(int i, C2980bn bnVar) {
        int e = m14097e(i);
        int b = bnVar.mo9255b();
        return e + m14104g(b) + b;
    }

    /* renamed from: a */
    public static int m14073a(C2980bn bnVar) {
        int b = bnVar.mo9255b();
        return m14104g(b) + b;
    }

    /* renamed from: a */
    public static int m14074a(C3150hm hmVar) {
        int size = hmVar.size();
        return m14104g(size) + size;
    }

    /* renamed from: a */
    public static int m14075a(C3498tn tnVar) {
        int e = tnVar.mo8615e();
        return m14104g(e) + e;
    }

    /* renamed from: a */
    static int m14076a(C3498tn tnVar, C2493Ln ln) {
        C2838Xl xl = (C2838Xl) tnVar;
        int j = xl.mo8621j();
        if (j == -1) {
            j = ln.mo8502b(xl);
            xl.mo8612a(j);
        }
        return m14104g(j) + j;
    }

    /* renamed from: a */
    public static int m14077a(String str) {
        int i;
        try {
            i = C3271lo.m12991a((CharSequence) str);
        } catch (C3356oo unused) {
            i = str.getBytes(C2641Qm.f8145a).length;
        }
        return m14104g(i) + i;
    }

    /* renamed from: a */
    public static C3525um m14078a(byte[] bArr) {
        return new C3526a(bArr, 0, bArr.length);
    }

    /* renamed from: b */
    public static int m14079b(double d) {
        return 8;
    }

    /* renamed from: b */
    public static int m14080b(float f) {
        return 4;
    }

    /* renamed from: b */
    public static int m14081b(int i, double d) {
        return m14097e(i) + 8;
    }

    /* renamed from: b */
    public static int m14082b(int i, float f) {
        return m14097e(i) + 4;
    }

    /* renamed from: b */
    public static int m14083b(int i, C2980bn bnVar) {
        return (m14097e(1) << 1) + m14105g(2, i) + m14072a(3, bnVar);
    }

    /* renamed from: b */
    public static int m14084b(int i, C3498tn tnVar) {
        return (m14097e(1) << 1) + m14105g(2, i) + m14097e(3) + m14075a(tnVar);
    }

    /* renamed from: b */
    static int m14085b(int i, C3498tn tnVar, C2493Ln ln) {
        return m14097e(i) + m14076a(tnVar, ln);
    }

    /* renamed from: b */
    public static int m14086b(int i, String str) {
        return m14097e(i) + m14077a(str);
    }

    /* renamed from: b */
    public static int m14087b(int i, boolean z) {
        return m14097e(i) + 1;
    }

    @Deprecated
    /* renamed from: b */
    public static int m14088b(C3498tn tnVar) {
        return tnVar.mo8615e();
    }

    /* renamed from: b */
    public static int m14089b(boolean z) {
        return 1;
    }

    /* renamed from: b */
    public static int m14090b(byte[] bArr) {
        int length = bArr.length;
        return m14104g(length) + length;
    }

    /* renamed from: c */
    public static int m14091c(int i, C3150hm hmVar) {
        int e = m14097e(i);
        int size = hmVar.size();
        return e + m14104g(size) + size;
    }

    @Deprecated
    /* renamed from: c */
    static int m14092c(int i, C3498tn tnVar, C2493Ln ln) {
        int e = m14097e(i) << 1;
        C2838Xl xl = (C2838Xl) tnVar;
        int j = xl.mo8621j();
        if (j == -1) {
            j = ln.mo8502b(xl);
            xl.mo8612a(j);
        }
        return e + j;
    }

    /* renamed from: d */
    public static int m14094d(int i, long j) {
        return m14097e(i) + m14099e(j);
    }

    /* renamed from: d */
    public static int m14095d(int i, C3150hm hmVar) {
        return (m14097e(1) << 1) + m14105g(2, i) + m14091c(3, hmVar);
    }

    /* renamed from: d */
    public static int m14096d(long j) {
        return m14099e(j);
    }

    /* renamed from: e */
    public static int m14097e(int i) {
        return m14104g(i << 3);
    }

    /* renamed from: e */
    public static int m14098e(int i, long j) {
        return m14097e(i) + m14099e(j);
    }

    /* renamed from: e */
    public static int m14099e(long j) {
        int i;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            i = 6;
            j >>>= 28;
        } else {
            i = 2;
        }
        if ((-2097152 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & -16384) != 0 ? i + 1 : i;
    }

    /* renamed from: f */
    public static int m14100f(int i) {
        if (i >= 0) {
            return m14104g(i);
        }
        return 10;
    }

    /* renamed from: f */
    public static int m14101f(int i, int i2) {
        return m14097e(i) + m14100f(i2);
    }

    /* renamed from: f */
    public static int m14102f(int i, long j) {
        return m14097e(i) + m14099e(m14114i(j));
    }

    /* renamed from: f */
    public static int m14103f(long j) {
        return m14099e(m14114i(j));
    }

    /* renamed from: g */
    public static int m14104g(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    /* renamed from: g */
    public static int m14105g(int i, int i2) {
        return m14097e(i) + m14104g(i2);
    }

    /* renamed from: g */
    public static int m14106g(int i, long j) {
        return m14097e(i) + 8;
    }

    /* renamed from: g */
    public static int m14107g(long j) {
        return 8;
    }

    /* renamed from: h */
    public static int m14108h(int i) {
        return m14104g(m14120m(i));
    }

    /* renamed from: h */
    public static int m14109h(int i, int i2) {
        return m14097e(i) + m14104g(m14120m(i2));
    }

    /* renamed from: h */
    public static int m14110h(int i, long j) {
        return m14097e(i) + 8;
    }

    /* renamed from: h */
    public static int m14111h(long j) {
        return 8;
    }

    /* renamed from: i */
    public static int m14112i(int i) {
        return 4;
    }

    /* renamed from: i */
    public static int m14113i(int i, int i2) {
        return m14097e(i) + 4;
    }

    /* renamed from: i */
    private static long m14114i(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* renamed from: j */
    public static int m14115j(int i) {
        return 4;
    }

    /* renamed from: j */
    public static int m14116j(int i, int i2) {
        return m14097e(i) + 4;
    }

    /* renamed from: k */
    public static int m14117k(int i) {
        return m14100f(i);
    }

    /* renamed from: k */
    public static int m14118k(int i, int i2) {
        return m14097e(i) + m14100f(i2);
    }

    @Deprecated
    /* renamed from: l */
    public static int m14119l(int i) {
        return m14104g(i);
    }

    /* renamed from: m */
    private static int m14120m(int i) {
        return (i >> 31) ^ (i << 1);
    }

    /* renamed from: a */
    public abstract int mo10085a();

    /* renamed from: a */
    public abstract void mo10086a(byte b);

    /* renamed from: a */
    public final void mo10087a(double d) {
        mo10111c(Double.doubleToRawLongBits(d));
    }

    /* renamed from: a */
    public final void mo10088a(float f) {
        mo10112d(Float.floatToRawIntBits(f));
    }

    /* renamed from: a */
    public abstract void mo10089a(int i);

    /* renamed from: a */
    public final void mo10090a(int i, double d) {
        mo10110c(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: a */
    public final void mo10091a(int i, float f) {
        mo10114e(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: a */
    public abstract void mo10092a(int i, int i2);

    /* renamed from: a */
    public abstract void mo10093a(int i, long j);

    /* renamed from: a */
    public abstract void mo10094a(int i, C3150hm hmVar);

    /* renamed from: a */
    public abstract void mo10095a(int i, C3498tn tnVar);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo10096a(int i, C3498tn tnVar, C2493Ln ln);

    /* renamed from: a */
    public abstract void mo10097a(int i, String str);

    /* renamed from: a */
    public abstract void mo10098a(int i, boolean z);

    /* renamed from: a */
    public abstract void mo10099a(long j);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo10100a(String str, C3356oo ooVar) {
        f10305a.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", ooVar);
        byte[] bytes = str.getBytes(C2641Qm.f8145a);
        try {
            mo10103b(bytes.length);
            mo9476a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new C3527b(e);
        } catch (C3527b e2) {
            throw e2;
        }
    }

    /* renamed from: a */
    public final void mo10101a(boolean z) {
        mo10086a(z ? (byte) 1 : 0);
    }

    /* renamed from: b */
    public final void mo10102b() {
        if (mo10085a() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* renamed from: b */
    public abstract void mo10103b(int i);

    /* renamed from: b */
    public abstract void mo10104b(int i, int i2);

    /* renamed from: b */
    public final void mo10105b(int i, long j) {
        mo10093a(i, m14114i(j));
    }

    /* renamed from: b */
    public abstract void mo10106b(int i, C3150hm hmVar);

    /* renamed from: b */
    public final void mo10107b(long j) {
        mo10099a(m14114i(j));
    }

    /* renamed from: c */
    public final void mo10108c(int i) {
        mo10103b(m14120m(i));
    }

    /* renamed from: c */
    public abstract void mo10109c(int i, int i2);

    /* renamed from: c */
    public abstract void mo10110c(int i, long j);

    /* renamed from: c */
    public abstract void mo10111c(long j);

    /* renamed from: d */
    public abstract void mo10112d(int i);

    /* renamed from: d */
    public final void mo10113d(int i, int i2) {
        mo10109c(i, m14120m(i2));
    }

    /* renamed from: e */
    public abstract void mo10114e(int i, int i2);
}
