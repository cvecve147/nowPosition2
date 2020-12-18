package p101d.p129g.p159f.p184i.p185a;

import p101d.p129g.p159f.C5811f;
import p101d.p129g.p159f.p167c.C5775b;

/* renamed from: d.g.f.i.a.k */
public final class C5902k {

    /* renamed from: a */
    private static final int[] f16313a = {31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 68472, 70749, 76311, 79154, 84390, 87683, 92361, 96236, 102084, 102881, 110507, 110734, 117786, 119615, 126325, 127568, 133589, 136944, 141498, 145311, 150283, 152622, 158308, 161089, 167017};

    /* renamed from: b */
    private static final C5902k[] f16314b = m22352f();

    /* renamed from: c */
    private final int f16315c;

    /* renamed from: d */
    private final int[] f16316d;

    /* renamed from: e */
    private final C5904b[] f16317e;

    /* renamed from: f */
    private final int f16318f;

    /* renamed from: d.g.f.i.a.k$a */
    public static final class C5903a {

        /* renamed from: a */
        private final int f16319a;

        /* renamed from: b */
        private final int f16320b;

        C5903a(int i, int i2) {
            this.f16319a = i;
            this.f16320b = i2;
        }

        /* renamed from: a */
        public int mo15668a() {
            return this.f16319a;
        }

        /* renamed from: b */
        public int mo15669b() {
            return this.f16320b;
        }
    }

    /* renamed from: d.g.f.i.a.k$b */
    public static final class C5904b {

        /* renamed from: a */
        private final int f16321a;

        /* renamed from: b */
        private final C5903a[] f16322b;

        C5904b(int i, C5903a... aVarArr) {
            this.f16321a = i;
            this.f16322b = aVarArr;
        }

        /* renamed from: a */
        public C5903a[] mo15670a() {
            return this.f16322b;
        }

        /* renamed from: b */
        public int mo15671b() {
            return this.f16321a;
        }
    }

    private C5902k(int i, int[] iArr, C5904b... bVarArr) {
        this.f16315c = i;
        this.f16316d = iArr;
        this.f16317e = bVarArr;
        int b = bVarArr[0].mo15671b();
        int i2 = 0;
        for (C5903a aVar : bVarArr[0].mo15670a()) {
            i2 += aVar.mo15668a() * (aVar.mo15669b() + b);
        }
        this.f16318f = i2;
    }

    /* renamed from: a */
    static C5902k m22349a(int i) {
        int i2 = 0;
        int i3 = Integer.MAX_VALUE;
        int i4 = 0;
        while (true) {
            int[] iArr = f16313a;
            if (i2 < iArr.length) {
                int i5 = iArr[i2];
                if (i5 == i) {
                    return m22351c(i2 + 7);
                }
                int b = C5899h.m22342b(i, i5);
                if (b < i3) {
                    i4 = i2 + 7;
                    i3 = b;
                }
                i2++;
            } else if (i3 <= 3) {
                return m22351c(i4);
            } else {
                return null;
            }
        }
    }

    /* renamed from: b */
    public static C5902k m22350b(int i) {
        if (i % 4 == 1) {
            try {
                return m22351c((i - 17) / 4);
            } catch (IllegalArgumentException unused) {
                throw C5811f.m21947a();
            }
        } else {
            throw C5811f.m21947a();
        }
    }

    /* renamed from: c */
    public static C5902k m22351c(int i) {
        if (i >= 1 && i <= 40) {
            return f16314b[i - 1];
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: f */
    private static C5902k[] m22352f() {
        return new C5902k[]{new C5902k(1, new int[0], new C5904b(7, new C5903a(1, 19)), new C5904b(10, new C5903a(1, 16)), new C5904b(13, new C5903a(1, 13)), new C5904b(17, new C5903a(1, 9))), new C5902k(2, new int[]{6, 18}, new C5904b(10, new C5903a(1, 34)), new C5904b(16, new C5903a(1, 28)), new C5904b(22, new C5903a(1, 22)), new C5904b(28, new C5903a(1, 16))), new C5902k(3, new int[]{6, 22}, new C5904b(15, new C5903a(1, 55)), new C5904b(26, new C5903a(1, 44)), new C5904b(18, new C5903a(2, 17)), new C5904b(22, new C5903a(2, 13))), new C5902k(4, new int[]{6, 26}, new C5904b(20, new C5903a(1, 80)), new C5904b(18, new C5903a(2, 32)), new C5904b(26, new C5903a(2, 24)), new C5904b(16, new C5903a(4, 9))), new C5902k(5, new int[]{6, 30}, new C5904b(26, new C5903a(1, 108)), new C5904b(24, new C5903a(2, 43)), new C5904b(18, new C5903a(2, 15), new C5903a(2, 16)), new C5904b(22, new C5903a(2, 11), new C5903a(2, 12))), new C5902k(6, new int[]{6, 34}, new C5904b(18, new C5903a(2, 68)), new C5904b(16, new C5903a(4, 27)), new C5904b(24, new C5903a(4, 19)), new C5904b(28, new C5903a(4, 15))), new C5902k(7, new int[]{6, 22, 38}, new C5904b(20, new C5903a(2, 78)), new C5904b(18, new C5903a(4, 31)), new C5904b(18, new C5903a(2, 14), new C5903a(4, 15)), new C5904b(26, new C5903a(4, 13), new C5903a(1, 14))), new C5902k(8, new int[]{6, 24, 42}, new C5904b(24, new C5903a(2, 97)), new C5904b(22, new C5903a(2, 38), new C5903a(2, 39)), new C5904b(22, new C5903a(4, 18), new C5903a(2, 19)), new C5904b(26, new C5903a(4, 14), new C5903a(2, 15))), new C5902k(9, new int[]{6, 26, 46}, new C5904b(30, new C5903a(2, 116)), new C5904b(22, new C5903a(3, 36), new C5903a(2, 37)), new C5904b(20, new C5903a(4, 16), new C5903a(4, 17)), new C5904b(24, new C5903a(4, 12), new C5903a(4, 13))), new C5902k(10, new int[]{6, 28, 50}, new C5904b(18, new C5903a(2, 68), new C5903a(2, 69)), new C5904b(26, new C5903a(4, 43), new C5903a(1, 44)), new C5904b(24, new C5903a(6, 19), new C5903a(2, 20)), new C5904b(28, new C5903a(6, 15), new C5903a(2, 16))), new C5902k(11, new int[]{6, 30, 54}, new C5904b(20, new C5903a(4, 81)), new C5904b(30, new C5903a(1, 50), new C5903a(4, 51)), new C5904b(28, new C5903a(4, 22), new C5903a(4, 23)), new C5904b(24, new C5903a(3, 12), new C5903a(8, 13))), new C5902k(12, new int[]{6, 32, 58}, new C5904b(24, new C5903a(2, 92), new C5903a(2, 93)), new C5904b(22, new C5903a(6, 36), new C5903a(2, 37)), new C5904b(26, new C5903a(4, 20), new C5903a(6, 21)), new C5904b(28, new C5903a(7, 14), new C5903a(4, 15))), new C5902k(13, new int[]{6, 34, 62}, new C5904b(26, new C5903a(4, 107)), new C5904b(22, new C5903a(8, 37), new C5903a(1, 38)), new C5904b(24, new C5903a(8, 20), new C5903a(4, 21)), new C5904b(22, new C5903a(12, 11), new C5903a(4, 12))), new C5902k(14, new int[]{6, 26, 46, 66}, new C5904b(30, new C5903a(3, 115), new C5903a(1, 116)), new C5904b(24, new C5903a(4, 40), new C5903a(5, 41)), new C5904b(20, new C5903a(11, 16), new C5903a(5, 17)), new C5904b(24, new C5903a(11, 12), new C5903a(5, 13))), new C5902k(15, new int[]{6, 26, 48, 70}, new C5904b(22, new C5903a(5, 87), new C5903a(1, 88)), new C5904b(24, new C5903a(5, 41), new C5903a(5, 42)), new C5904b(30, new C5903a(5, 24), new C5903a(7, 25)), new C5904b(24, new C5903a(11, 12), new C5903a(7, 13))), new C5902k(16, new int[]{6, 26, 50, 74}, new C5904b(24, new C5903a(5, 98), new C5903a(1, 99)), new C5904b(28, new C5903a(7, 45), new C5903a(3, 46)), new C5904b(24, new C5903a(15, 19), new C5903a(2, 20)), new C5904b(30, new C5903a(3, 15), new C5903a(13, 16))), new C5902k(17, new int[]{6, 30, 54, 78}, new C5904b(28, new C5903a(1, 107), new C5903a(5, 108)), new C5904b(28, new C5903a(10, 46), new C5903a(1, 47)), new C5904b(28, new C5903a(1, 22), new C5903a(15, 23)), new C5904b(28, new C5903a(2, 14), new C5903a(17, 15))), new C5902k(18, new int[]{6, 30, 56, 82}, new C5904b(30, new C5903a(5, 120), new C5903a(1, 121)), new C5904b(26, new C5903a(9, 43), new C5903a(4, 44)), new C5904b(28, new C5903a(17, 22), new C5903a(1, 23)), new C5904b(28, new C5903a(2, 14), new C5903a(19, 15))), new C5902k(19, new int[]{6, 30, 58, 86}, new C5904b(28, new C5903a(3, 113), new C5903a(4, 114)), new C5904b(26, new C5903a(3, 44), new C5903a(11, 45)), new C5904b(26, new C5903a(17, 21), new C5903a(4, 22)), new C5904b(26, new C5903a(9, 13), new C5903a(16, 14))), new C5902k(20, new int[]{6, 34, 62, 90}, new C5904b(28, new C5903a(3, 107), new C5903a(5, 108)), new C5904b(26, new C5903a(3, 41), new C5903a(13, 42)), new C5904b(30, new C5903a(15, 24), new C5903a(5, 25)), new C5904b(28, new C5903a(15, 15), new C5903a(10, 16))), new C5902k(21, new int[]{6, 28, 50, 72, 94}, new C5904b(28, new C5903a(4, 116), new C5903a(4, 117)), new C5904b(26, new C5903a(17, 42)), new C5904b(28, new C5903a(17, 22), new C5903a(6, 23)), new C5904b(30, new C5903a(19, 16), new C5903a(6, 17))), new C5902k(22, new int[]{6, 26, 50, 74, 98}, new C5904b(28, new C5903a(2, 111), new C5903a(7, 112)), new C5904b(28, new C5903a(17, 46)), new C5904b(30, new C5903a(7, 24), new C5903a(16, 25)), new C5904b(24, new C5903a(34, 13))), new C5902k(23, new int[]{6, 30, 54, 78, 102}, new C5904b(30, new C5903a(4, 121), new C5903a(5, 122)), new C5904b(28, new C5903a(4, 47), new C5903a(14, 48)), new C5904b(30, new C5903a(11, 24), new C5903a(14, 25)), new C5904b(30, new C5903a(16, 15), new C5903a(14, 16))), new C5902k(24, new int[]{6, 28, 54, 80, 106}, new C5904b(30, new C5903a(6, 117), new C5903a(4, 118)), new C5904b(28, new C5903a(6, 45), new C5903a(14, 46)), new C5904b(30, new C5903a(11, 24), new C5903a(16, 25)), new C5904b(30, new C5903a(30, 16), new C5903a(2, 17))), new C5902k(25, new int[]{6, 32, 58, 84, 110}, new C5904b(26, new C5903a(8, 106), new C5903a(4, 107)), new C5904b(28, new C5903a(8, 47), new C5903a(13, 48)), new C5904b(30, new C5903a(7, 24), new C5903a(22, 25)), new C5904b(30, new C5903a(22, 15), new C5903a(13, 16))), new C5902k(26, new int[]{6, 30, 58, 86, 114}, new C5904b(28, new C5903a(10, 114), new C5903a(2, 115)), new C5904b(28, new C5903a(19, 46), new C5903a(4, 47)), new C5904b(28, new C5903a(28, 22), new C5903a(6, 23)), new C5904b(30, new C5903a(33, 16), new C5903a(4, 17))), new C5902k(27, new int[]{6, 34, 62, 90, 118}, new C5904b(30, new C5903a(8, 122), new C5903a(4, 123)), new C5904b(28, new C5903a(22, 45), new C5903a(3, 46)), new C5904b(30, new C5903a(8, 23), new C5903a(26, 24)), new C5904b(30, new C5903a(12, 15), new C5903a(28, 16))), new C5902k(28, new int[]{6, 26, 50, 74, 98, 122}, new C5904b(30, new C5903a(3, 117), new C5903a(10, 118)), new C5904b(28, new C5903a(3, 45), new C5903a(23, 46)), new C5904b(30, new C5903a(4, 24), new C5903a(31, 25)), new C5904b(30, new C5903a(11, 15), new C5903a(31, 16))), new C5902k(29, new int[]{6, 30, 54, 78, 102, 126}, new C5904b(30, new C5903a(7, 116), new C5903a(7, 117)), new C5904b(28, new C5903a(21, 45), new C5903a(7, 46)), new C5904b(30, new C5903a(1, 23), new C5903a(37, 24)), new C5904b(30, new C5903a(19, 15), new C5903a(26, 16))), new C5902k(30, new int[]{6, 26, 52, 78, 104, 130}, new C5904b(30, new C5903a(5, 115), new C5903a(10, 116)), new C5904b(28, new C5903a(19, 47), new C5903a(10, 48)), new C5904b(30, new C5903a(15, 24), new C5903a(25, 25)), new C5904b(30, new C5903a(23, 15), new C5903a(25, 16))), new C5902k(31, new int[]{6, 30, 56, 82, 108, 134}, new C5904b(30, new C5903a(13, 115), new C5903a(3, 116)), new C5904b(28, new C5903a(2, 46), new C5903a(29, 47)), new C5904b(30, new C5903a(42, 24), new C5903a(1, 25)), new C5904b(30, new C5903a(23, 15), new C5903a(28, 16))), new C5902k(32, new int[]{6, 34, 60, 86, 112, 138}, new C5904b(30, new C5903a(17, 115)), new C5904b(28, new C5903a(10, 46), new C5903a(23, 47)), new C5904b(30, new C5903a(10, 24), new C5903a(35, 25)), new C5904b(30, new C5903a(19, 15), new C5903a(35, 16))), new C5902k(33, new int[]{6, 30, 58, 86, 114, 142}, new C5904b(30, new C5903a(17, 115), new C5903a(1, 116)), new C5904b(28, new C5903a(14, 46), new C5903a(21, 47)), new C5904b(30, new C5903a(29, 24), new C5903a(19, 25)), new C5904b(30, new C5903a(11, 15), new C5903a(46, 16))), new C5902k(34, new int[]{6, 34, 62, 90, 118, 146}, new C5904b(30, new C5903a(13, 115), new C5903a(6, 116)), new C5904b(28, new C5903a(14, 46), new C5903a(23, 47)), new C5904b(30, new C5903a(44, 24), new C5903a(7, 25)), new C5904b(30, new C5903a(59, 16), new C5903a(1, 17))), new C5902k(35, new int[]{6, 30, 54, 78, 102, 126, 150}, new C5904b(30, new C5903a(12, 121), new C5903a(7, 122)), new C5904b(28, new C5903a(12, 47), new C5903a(26, 48)), new C5904b(30, new C5903a(39, 24), new C5903a(14, 25)), new C5904b(30, new C5903a(22, 15), new C5903a(41, 16))), new C5902k(36, new int[]{6, 24, 50, 76, 102, 128, 154}, new C5904b(30, new C5903a(6, 121), new C5903a(14, 122)), new C5904b(28, new C5903a(6, 47), new C5903a(34, 48)), new C5904b(30, new C5903a(46, 24), new C5903a(10, 25)), new C5904b(30, new C5903a(2, 15), new C5903a(64, 16))), new C5902k(37, new int[]{6, 28, 54, 80, 106, 132, 158}, new C5904b(30, new C5903a(17, 122), new C5903a(4, 123)), new C5904b(28, new C5903a(29, 46), new C5903a(14, 47)), new C5904b(30, new C5903a(49, 24), new C5903a(10, 25)), new C5904b(30, new C5903a(24, 15), new C5903a(46, 16))), new C5902k(38, new int[]{6, 32, 58, 84, 110, 136, 162}, new C5904b(30, new C5903a(4, 122), new C5903a(18, 123)), new C5904b(28, new C5903a(13, 46), new C5903a(32, 47)), new C5904b(30, new C5903a(48, 24), new C5903a(14, 25)), new C5904b(30, new C5903a(42, 15), new C5903a(32, 16))), new C5902k(39, new int[]{6, 26, 54, 82, 110, 138, 166}, new C5904b(30, new C5903a(20, 117), new C5903a(4, 118)), new C5904b(28, new C5903a(40, 47), new C5903a(7, 48)), new C5904b(30, new C5903a(43, 24), new C5903a(22, 25)), new C5904b(30, new C5903a(10, 15), new C5903a(67, 16))), new C5902k(40, new int[]{6, 30, 58, 86, 114, 142, 170}, new C5904b(30, new C5903a(19, 118), new C5903a(6, 119)), new C5904b(28, new C5903a(18, 47), new C5903a(31, 48)), new C5904b(30, new C5903a(34, 24), new C5903a(34, 25)), new C5904b(30, new C5903a(20, 15), new C5903a(61, 16)))};
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C5775b mo15661a() {
        int c = mo15664c();
        C5775b bVar = new C5775b(c);
        bVar.mo15387a(0, 0, 9, 9);
        int i = c - 8;
        bVar.mo15387a(i, 0, 8, 9);
        bVar.mo15387a(0, i, 9, 8);
        int length = this.f16316d.length;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = this.f16316d[i2] - 2;
            for (int i4 = 0; i4 < length; i4++) {
                if (!((i2 == 0 && (i4 == 0 || i4 == length - 1)) || (i2 == length - 1 && i4 == 0))) {
                    bVar.mo15387a(this.f16316d[i4] - 2, i3, 5, 5);
                }
            }
        }
        int i5 = c - 17;
        bVar.mo15387a(6, 9, 1, i5);
        bVar.mo15387a(9, 6, i5, 1);
        if (this.f16315c > 6) {
            int i6 = c - 11;
            bVar.mo15387a(i6, 0, 3, 6);
            bVar.mo15387a(0, i6, 6, 3);
        }
        return bVar;
    }

    /* renamed from: a */
    public C5904b mo15662a(C5898g gVar) {
        return this.f16317e[gVar.ordinal()];
    }

    /* renamed from: b */
    public int[] mo15663b() {
        return this.f16316d;
    }

    /* renamed from: c */
    public int mo15664c() {
        return (this.f16315c * 4) + 17;
    }

    /* renamed from: d */
    public int mo15665d() {
        return this.f16318f;
    }

    /* renamed from: e */
    public int mo15666e() {
        return this.f16315c;
    }

    public String toString() {
        return String.valueOf(this.f16315c);
    }
}
