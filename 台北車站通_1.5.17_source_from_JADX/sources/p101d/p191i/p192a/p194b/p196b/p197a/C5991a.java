package p101d.p191i.p192a.p194b.p196b.p197a;

/* renamed from: d.i.a.b.b.a.a */
public class C5991a {

    /* renamed from: a */
    private static final double[] f16664a = new double[128];

    /* renamed from: b */
    private final char[] f16665b;

    /* renamed from: c */
    private final int f16666c;

    /* renamed from: d */
    private char f16667d;

    /* renamed from: e */
    public int f16668e;

    static {
        int i = 0;
        while (true) {
            double[] dArr = f16664a;
            if (i < dArr.length) {
                dArr[i] = Math.pow(10.0d, (double) i);
                i++;
            } else {
                return;
            }
        }
    }

    public C5991a(String str, int i) {
        try {
            this.f16665b = new char[str.length()];
            str.getChars(0, str.length(), this.f16665b, 0);
            this.f16668e = i;
            char[] cArr = this.f16665b;
            this.f16666c = cArr.length;
            this.f16667d = cArr[i];
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public static float m22698a(int i, int i2) {
        if (i2 < -125 || i == 0) {
            return 0.0f;
        }
        if (i2 >= 128) {
            return i > 0 ? Float.POSITIVE_INFINITY : Float.NEGATIVE_INFINITY;
        }
        if (i2 == 0) {
            return (float) i;
        }
        if (i >= 67108864) {
            i++;
        }
        return (float) (i2 > 0 ? ((double) i) * f16664a[i2] : ((double) i) / f16664a[-i2]);
    }

    /* renamed from: a */
    private void m22699a(char c) {
        throw new RuntimeException("Unexpected char '" + c + "'.");
    }

    /* renamed from: g */
    private char m22700g() {
        int i = this.f16668e;
        if (i < this.f16666c) {
            this.f16668e = i + 1;
        }
        int i2 = this.f16668e;
        if (i2 == this.f16666c) {
            return 0;
        }
        return this.f16665b[i2];
    }

    /* renamed from: a */
    public void mo15848a() {
        this.f16667d = m22700g();
    }

    /* renamed from: b */
    public int mo15849b() {
        mo15853f();
        int i = this.f16667d - '0';
        this.f16667d = m22700g();
        mo15852e();
        return i;
    }

    /* renamed from: c */
    public float mo15850c() {
        mo15853f();
        float d = mo15851d();
        mo15852e();
        return d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        r0.f16667d = m22700g();
        r6 = r0.f16667d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        if (r6 == '.') goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0034, code lost:
        if (r6 == 'E') goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0036, code lost:
        if (r6 == 'e') goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0038, code lost:
        switch(r6) {
            case 48: goto L_0x002a;
            case 49: goto L_0x003c;
            case 50: goto L_0x003c;
            case 51: goto L_0x003c;
            case 52: goto L_0x003c;
            case 53: goto L_0x003c;
            case 54: goto L_0x003c;
            case 55: goto L_0x003c;
            case 56: goto L_0x003c;
            case 57: goto L_0x003c;
            default: goto L_0x003b;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003b, code lost:
        return 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        r6 = 0;
        r12 = 0;
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003f, code lost:
        if (r6 >= 9) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0041, code lost:
        r6 = r6 + 1;
        r13 = (r13 * 10) + (r0.f16667d - '0');
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004b, code lost:
        r12 = r12 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004d, code lost:
        r0.f16667d = m22700g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0055, code lost:
        switch(r0.f16667d) {
            case 48: goto L_0x003f;
            case 49: goto L_0x003f;
            case 50: goto L_0x003f;
            case 51: goto L_0x003f;
            case 52: goto L_0x003f;
            case 53: goto L_0x003f;
            case 54: goto L_0x003f;
            case 55: goto L_0x003f;
            case 56: goto L_0x003f;
            case 57: goto L_0x003f;
            default: goto L_0x0058;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0058, code lost:
        r14 = r13;
        r13 = r12;
        r12 = r6;
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005d, code lost:
        r6 = true;
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0062, code lost:
        r13 = r12;
        r14 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00d7, code lost:
        r0.f16667d = m22700g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00df, code lost:
        switch(r0.f16667d) {
            case 48: goto L_0x00d7;
            case 49: goto L_0x00e3;
            case 50: goto L_0x00e3;
            case 51: goto L_0x00e3;
            case 52: goto L_0x00e3;
            case 53: goto L_0x00e3;
            case 54: goto L_0x00e3;
            case 55: goto L_0x00e3;
            case 56: goto L_0x00e3;
            case 57: goto L_0x00e3;
            default: goto L_0x00e2;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00e3, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00e5, code lost:
        if (r5 >= 3) goto L_0x00f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00e7, code lost:
        r5 = r5 + 1;
        r2 = (r2 * 10) + (r0.f16667d - '0');
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00f0, code lost:
        r0.f16667d = m22700g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00f8, code lost:
        switch(r0.f16667d) {
            case 48: goto L_0x00e4;
            case 49: goto L_0x00e4;
            case 50: goto L_0x00e4;
            case 51: goto L_0x00e4;
            case 52: goto L_0x00e4;
            case 53: goto L_0x00e4;
            case 54: goto L_0x00e4;
            case 55: goto L_0x00e4;
            case 56: goto L_0x00e4;
            case 57: goto L_0x00e4;
            default: goto L_0x00fb;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00fb, code lost:
        r5 = r2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007a A[LOOP_START, PHI: r13 
      PHI: (r13v6 int) = (r13v0 int), (r13v7 int) binds: [B:31:0x0078, B:33:0x0084] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008a A[LOOP_START, PHI: r12 r13 r14 
      PHI: (r12v1 int) = (r12v0 int), (r12v2 int) binds: [B:83:0x008a, B:39:0x009f] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r13v3 int) = (r13v2 int), (r13v4 int) binds: [B:83:0x008a, B:39:0x009f] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r14v4 int) = (r14v0 int), (r14v5 int) binds: [B:83:0x008a, B:39:0x009f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0027 A[RETURN] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public float mo15851d() {
        /*
            r17 = this;
            r0 = r17
            char r1 = r0.f16667d
            r2 = 45
            r3 = 43
            r4 = 1
            r5 = 0
            if (r1 == r3) goto L_0x0012
            if (r1 == r2) goto L_0x0010
            r1 = r4
            goto L_0x0019
        L_0x0010:
            r1 = r5
            goto L_0x0013
        L_0x0012:
            r1 = r4
        L_0x0013:
            char r6 = r17.m22700g()
            r0.f16667d = r6
        L_0x0019:
            char r6 = r0.f16667d
            r7 = 0
            r8 = 101(0x65, float:1.42E-43)
            r9 = 9
            r10 = 69
            r11 = 46
            switch(r6) {
                case 46: goto L_0x0060;
                case 47: goto L_0x0027;
                case 48: goto L_0x002a;
                case 49: goto L_0x003c;
                case 50: goto L_0x003c;
                case 51: goto L_0x003c;
                case 52: goto L_0x003c;
                case 53: goto L_0x003c;
                case 54: goto L_0x003c;
                case 55: goto L_0x003c;
                case 56: goto L_0x003c;
                case 57: goto L_0x003c;
                default: goto L_0x0027;
            }
        L_0x0027:
            r1 = 2143289344(0x7fc00000, float:NaN)
            return r1
        L_0x002a:
            char r6 = r17.m22700g()
            r0.f16667d = r6
            char r6 = r0.f16667d
            if (r6 == r11) goto L_0x005d
            if (r6 == r10) goto L_0x005d
            if (r6 == r8) goto L_0x005d
            switch(r6) {
                case 48: goto L_0x002a;
                case 49: goto L_0x003c;
                case 50: goto L_0x003c;
                case 51: goto L_0x003c;
                case 52: goto L_0x003c;
                case 53: goto L_0x003c;
                case 54: goto L_0x003c;
                case 55: goto L_0x003c;
                case 56: goto L_0x003c;
                case 57: goto L_0x003c;
                default: goto L_0x003b;
            }
        L_0x003b:
            return r7
        L_0x003c:
            r6 = r5
            r12 = r6
            r13 = r12
        L_0x003f:
            if (r6 >= r9) goto L_0x004b
            int r6 = r6 + 1
            int r13 = r13 * 10
            char r14 = r0.f16667d
            int r14 = r14 + -48
            int r13 = r13 + r14
            goto L_0x004d
        L_0x004b:
            int r12 = r12 + 1
        L_0x004d:
            char r14 = r17.m22700g()
            r0.f16667d = r14
            char r14 = r0.f16667d
            switch(r14) {
                case 48: goto L_0x003f;
                case 49: goto L_0x003f;
                case 50: goto L_0x003f;
                case 51: goto L_0x003f;
                case 52: goto L_0x003f;
                case 53: goto L_0x003f;
                case 54: goto L_0x003f;
                case 55: goto L_0x003f;
                case 56: goto L_0x003f;
                case 57: goto L_0x003f;
                default: goto L_0x0058;
            }
        L_0x0058:
            r14 = r13
            r13 = r12
            r12 = r6
            r6 = r4
            goto L_0x0064
        L_0x005d:
            r6 = r4
            r12 = r5
            goto L_0x0062
        L_0x0060:
            r6 = r5
            r12 = r6
        L_0x0062:
            r13 = r12
            r14 = r13
        L_0x0064:
            char r15 = r0.f16667d
            r16 = 0
            if (r15 != r11) goto L_0x00a7
            char r11 = r17.m22700g()
            r0.f16667d = r11
            char r11 = r0.f16667d
            switch(r11) {
                case 48: goto L_0x0078;
                case 49: goto L_0x008a;
                case 50: goto L_0x008a;
                case 51: goto L_0x008a;
                case 52: goto L_0x008a;
                case 53: goto L_0x008a;
                case 54: goto L_0x008a;
                case 55: goto L_0x008a;
                case 56: goto L_0x008a;
                case 57: goto L_0x008a;
                default: goto L_0x0075;
            }
        L_0x0075:
            if (r6 == 0) goto L_0x00a3
            goto L_0x00a7
        L_0x0078:
            if (r12 != 0) goto L_0x008a
        L_0x007a:
            char r11 = r17.m22700g()
            r0.f16667d = r11
            int r13 = r13 + -1
            char r11 = r0.f16667d
            switch(r11) {
                case 48: goto L_0x007a;
                case 49: goto L_0x008a;
                case 50: goto L_0x008a;
                case 51: goto L_0x008a;
                case 52: goto L_0x008a;
                case 53: goto L_0x008a;
                case 54: goto L_0x008a;
                case 55: goto L_0x008a;
                case 56: goto L_0x008a;
                case 57: goto L_0x008a;
                default: goto L_0x0087;
            }
        L_0x0087:
            if (r6 != 0) goto L_0x00a7
            return r7
        L_0x008a:
            if (r12 >= r9) goto L_0x0097
            int r12 = r12 + 1
            int r14 = r14 * 10
            char r6 = r0.f16667d
            int r6 = r6 + -48
            int r14 = r14 + r6
            int r13 = r13 + -1
        L_0x0097:
            char r6 = r17.m22700g()
            r0.f16667d = r6
            char r6 = r0.f16667d
            switch(r6) {
                case 48: goto L_0x008a;
                case 49: goto L_0x008a;
                case 50: goto L_0x008a;
                case 51: goto L_0x008a;
                case 52: goto L_0x008a;
                case 53: goto L_0x008a;
                case 54: goto L_0x008a;
                case 55: goto L_0x008a;
                case 56: goto L_0x008a;
                case 57: goto L_0x008a;
                default: goto L_0x00a2;
            }
        L_0x00a2:
            goto L_0x00a7
        L_0x00a3:
            r0.m22699a(r11)
            throw r16
        L_0x00a7:
            char r6 = r0.f16667d
            if (r6 == r10) goto L_0x00ae
            if (r6 == r8) goto L_0x00ae
            goto L_0x00fc
        L_0x00ae:
            char r6 = r17.m22700g()
            r0.f16667d = r6
            char r6 = r0.f16667d
            if (r6 == r3) goto L_0x00c2
            if (r6 == r2) goto L_0x00c1
            switch(r6) {
                case 48: goto L_0x00d1;
                case 49: goto L_0x00d1;
                case 50: goto L_0x00d1;
                case 51: goto L_0x00d1;
                case 52: goto L_0x00d1;
                case 53: goto L_0x00d1;
                case 54: goto L_0x00d1;
                case 55: goto L_0x00d1;
                case 56: goto L_0x00d1;
                case 57: goto L_0x00d1;
                default: goto L_0x00bd;
            }
        L_0x00bd:
            r0.m22699a(r6)
            throw r16
        L_0x00c1:
            r4 = r5
        L_0x00c2:
            char r2 = r17.m22700g()
            r0.f16667d = r2
            char r2 = r0.f16667d
            switch(r2) {
                case 48: goto L_0x00d1;
                case 49: goto L_0x00d1;
                case 50: goto L_0x00d1;
                case 51: goto L_0x00d1;
                case 52: goto L_0x00d1;
                case 53: goto L_0x00d1;
                case 54: goto L_0x00d1;
                case 55: goto L_0x00d1;
                case 56: goto L_0x00d1;
                case 57: goto L_0x00d1;
                default: goto L_0x00cd;
            }
        L_0x00cd:
            r0.m22699a(r2)
            goto L_0x0108
        L_0x00d1:
            char r2 = r0.f16667d
            switch(r2) {
                case 48: goto L_0x00d7;
                case 49: goto L_0x00e3;
                case 50: goto L_0x00e3;
                case 51: goto L_0x00e3;
                case 52: goto L_0x00e3;
                case 53: goto L_0x00e3;
                case 54: goto L_0x00e3;
                case 55: goto L_0x00e3;
                case 56: goto L_0x00e3;
                case 57: goto L_0x00e3;
                default: goto L_0x00d6;
            }
        L_0x00d6:
            goto L_0x00fc
        L_0x00d7:
            char r2 = r17.m22700g()
            r0.f16667d = r2
            char r2 = r0.f16667d
            switch(r2) {
                case 48: goto L_0x00d7;
                case 49: goto L_0x00e3;
                case 50: goto L_0x00e3;
                case 51: goto L_0x00e3;
                case 52: goto L_0x00e3;
                case 53: goto L_0x00e3;
                case 54: goto L_0x00e3;
                case 55: goto L_0x00e3;
                case 56: goto L_0x00e3;
                case 57: goto L_0x00e3;
                default: goto L_0x00e2;
            }
        L_0x00e2:
            goto L_0x00fc
        L_0x00e3:
            r2 = r5
        L_0x00e4:
            r3 = 3
            if (r5 >= r3) goto L_0x00f0
            int r5 = r5 + 1
            int r2 = r2 * 10
            char r3 = r0.f16667d
            int r3 = r3 + -48
            int r2 = r2 + r3
        L_0x00f0:
            char r3 = r17.m22700g()
            r0.f16667d = r3
            char r3 = r0.f16667d
            switch(r3) {
                case 48: goto L_0x00e4;
                case 49: goto L_0x00e4;
                case 50: goto L_0x00e4;
                case 51: goto L_0x00e4;
                case 52: goto L_0x00e4;
                case 53: goto L_0x00e4;
                case 54: goto L_0x00e4;
                case 55: goto L_0x00e4;
                case 56: goto L_0x00e4;
                case 57: goto L_0x00e4;
                default: goto L_0x00fb;
            }
        L_0x00fb:
            r5 = r2
        L_0x00fc:
            if (r4 != 0) goto L_0x00ff
            int r5 = -r5
        L_0x00ff:
            int r5 = r5 + r13
            if (r1 != 0) goto L_0x0103
            int r14 = -r14
        L_0x0103:
            float r1 = m22698a(r14, r5)
            return r1
        L_0x0108:
            throw r16
        */
        throw new UnsupportedOperationException("Method not decompiled: p101d.p191i.p192a.p194b.p196b.p197a.C5991a.mo15851d():float");
    }

    /* renamed from: e */
    public void mo15852e() {
        while (true) {
            int i = this.f16668e;
            if (i < this.f16666c) {
                char c = this.f16665b[i];
                if (c == 9 || c == 10 || c == ' ' || c == ',') {
                    mo15848a();
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: f */
    public void mo15853f() {
        while (true) {
            int i = this.f16668e;
            if (i < this.f16666c && Character.isWhitespace(this.f16665b[i])) {
                mo15848a();
            } else {
                return;
            }
        }
    }
}
