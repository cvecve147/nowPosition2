package p250g.p255b.p256a.p261e;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import p250g.p255b.p256a.C6467a;
import p250g.p255b.p256a.C6567g;
import p250g.p255b.p256a.p258b.C6491q;

/* renamed from: g.b.a.e.b */
public class C6554b {

    /* renamed from: g.b.a.e.b$a */
    private static final class C6555a extends C6567g {

        /* renamed from: f */
        final int f18247f;

        /* renamed from: g */
        final C6558d f18248g;

        /* renamed from: h */
        final C6558d f18249h;

        C6555a(String str, int i, C6558d dVar, C6558d dVar2) {
            super(str);
            this.f18247f = i;
            this.f18248g = dVar;
            this.f18249h = dVar2;
        }

        /* renamed from: a */
        static C6555a m25032a(DataInput dataInput, String str) {
            return new C6555a(str, (int) C6554b.m25029a(dataInput), C6558d.m25054a(dataInput), C6558d.m25054a(dataInput));
        }

        /* renamed from: i */
        private C6558d m25033i(long j) {
            long j2;
            int i = this.f18247f;
            C6558d dVar = this.f18248g;
            C6558d dVar2 = this.f18249h;
            try {
                j2 = dVar.mo16947a(j, i, dVar2.mo16949b());
            } catch (ArithmeticException | IllegalArgumentException unused) {
                j2 = j;
            }
            try {
                j = dVar2.mo16947a(j, i, dVar.mo16949b());
            } catch (ArithmeticException | IllegalArgumentException unused2) {
            }
            return j2 > j ? dVar : dVar2;
        }

        /* renamed from: b */
        public String mo16932b(long j) {
            return m25033i(j).mo16948a();
        }

        /* renamed from: c */
        public int mo16933c(long j) {
            return this.f18247f + m25033i(j).mo16949b();
        }

        /* renamed from: e */
        public int mo16934e(long j) {
            return this.f18247f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6555a)) {
                return false;
            }
            C6555a aVar = (C6555a) obj;
            return mo16968c().equals(aVar.mo16968c()) && this.f18247f == aVar.f18247f && this.f18248g.equals(aVar.f18248g) && this.f18249h.equals(aVar.f18249h);
        }

        /* renamed from: f */
        public boolean mo16936f() {
            return false;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
            if (r5 < 0) goto L_0x0018;
         */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0030  */
        /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
        /* renamed from: g */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long mo16937g(long r9) {
            /*
                r8 = this;
                int r0 = r8.f18247f
                g.b.a.e.b$d r1 = r8.f18248g
                g.b.a.e.b$d r2 = r8.f18249h
                r3 = 0
                int r5 = r2.mo16949b()     // Catch:{ ArithmeticException | IllegalArgumentException -> 0x0018 }
                long r5 = r1.mo16947a(r9, r0, r5)     // Catch:{ ArithmeticException | IllegalArgumentException -> 0x0018 }
                int r7 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
                if (r7 <= 0) goto L_0x0019
                int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r7 >= 0) goto L_0x0019
            L_0x0018:
                r5 = r9
            L_0x0019:
                int r1 = r1.mo16949b()     // Catch:{ ArithmeticException | IllegalArgumentException -> 0x002b }
                long r0 = r2.mo16947a(r9, r0, r1)     // Catch:{ ArithmeticException | IllegalArgumentException -> 0x002b }
                int r2 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
                if (r2 <= 0) goto L_0x002a
                int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r2 >= 0) goto L_0x002a
                goto L_0x002b
            L_0x002a:
                r9 = r0
            L_0x002b:
                int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
                if (r0 <= 0) goto L_0x0030
                goto L_0x0031
            L_0x0030:
                r9 = r5
            L_0x0031:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: p250g.p255b.p256a.p261e.C6554b.C6555a.mo16937g(long):long");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
            if (r7 > 0) goto L_0x001b;
         */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0032  */
        /* renamed from: h */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long mo16938h(long r11) {
            /*
                r10 = this;
                r0 = 1
                long r11 = r11 + r0
                int r2 = r10.f18247f
                g.b.a.e.b$d r3 = r10.f18248g
                g.b.a.e.b$d r4 = r10.f18249h
                r5 = 0
                int r7 = r4.mo16949b()     // Catch:{ ArithmeticException | IllegalArgumentException -> 0x001b }
                long r7 = r3.mo16950b(r11, r2, r7)     // Catch:{ ArithmeticException | IllegalArgumentException -> 0x001b }
                int r9 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
                if (r9 >= 0) goto L_0x001c
                int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r9 <= 0) goto L_0x001c
            L_0x001b:
                r7 = r11
            L_0x001c:
                int r3 = r3.mo16949b()     // Catch:{ ArithmeticException | IllegalArgumentException -> 0x002e }
                long r2 = r4.mo16950b(r11, r2, r3)     // Catch:{ ArithmeticException | IllegalArgumentException -> 0x002e }
                int r4 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
                if (r4 >= 0) goto L_0x002d
                int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
                if (r4 <= 0) goto L_0x002d
                goto L_0x002e
            L_0x002d:
                r11 = r2
            L_0x002e:
                int r2 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
                if (r2 <= 0) goto L_0x0033
                r11 = r7
            L_0x0033:
                long r11 = r11 - r0
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: p250g.p255b.p256a.p261e.C6554b.C6555a.mo16938h(long):long");
        }
    }

    /* renamed from: g.b.a.e.b$b */
    private static final class C6556b {

        /* renamed from: a */
        final char f18250a;

        /* renamed from: b */
        final int f18251b;

        /* renamed from: c */
        final int f18252c;

        /* renamed from: d */
        final int f18253d;

        /* renamed from: e */
        final boolean f18254e;

        /* renamed from: f */
        final int f18255f;

        C6556b(char c, int i, int i2, int i3, boolean z, int i4) {
            if (c == 'u' || c == 'w' || c == 's') {
                this.f18250a = c;
                this.f18251b = i;
                this.f18252c = i2;
                this.f18253d = i3;
                this.f18254e = z;
                this.f18255f = i4;
                return;
            }
            throw new IllegalArgumentException("Unknown mode: " + c);
        }

        /* renamed from: a */
        private long m25040a(C6467a aVar, long j) {
            if (this.f18252c >= 0) {
                return aVar.mo16656e().mo16749b(j, this.f18252c);
            }
            return aVar.mo16656e().mo16747a(aVar.mo16674w().mo16747a(aVar.mo16656e().mo16749b(j, 1), 1), this.f18252c);
        }

        /* renamed from: a */
        static C6556b m25041a(DataInput dataInput) {
            return new C6556b((char) dataInput.readUnsignedByte(), dataInput.readUnsignedByte(), dataInput.readByte(), dataInput.readUnsignedByte(), dataInput.readBoolean(), (int) C6554b.m25029a(dataInput));
        }

        /* renamed from: b */
        private long m25042b(C6467a aVar, long j) {
            try {
                return m25040a(aVar, j);
            } catch (IllegalArgumentException e) {
                if (this.f18251b == 2 && this.f18252c == 29) {
                    while (!aVar.mo16647H().mo16741b(j)) {
                        j = aVar.mo16647H().mo16747a(j, 1);
                    }
                    return m25040a(aVar, j);
                }
                throw e;
            }
        }

        /* renamed from: c */
        private long m25043c(C6467a aVar, long j) {
            try {
                return m25040a(aVar, j);
            } catch (IllegalArgumentException e) {
                if (this.f18251b == 2 && this.f18252c == 29) {
                    while (!aVar.mo16647H().mo16741b(j)) {
                        j = aVar.mo16647H().mo16747a(j, -1);
                    }
                    return m25040a(aVar, j);
                }
                throw e;
            }
        }

        /* renamed from: d */
        private long m25044d(C6467a aVar, long j) {
            int a = this.f18253d - aVar.mo16657f().mo16740a(j);
            if (a == 0) {
                return j;
            }
            if (this.f18254e) {
                if (a < 0) {
                    a += 7;
                }
            } else if (a > 0) {
                a -= 7;
            }
            return aVar.mo16657f().mo16747a(j, a);
        }

        /* renamed from: a */
        public long mo16943a(long j, int i, int i2) {
            char c = this.f18250a;
            if (c == 'w') {
                i += i2;
            } else if (c != 's') {
                i = 0;
            }
            long j2 = (long) i;
            long j3 = j + j2;
            C6491q O = C6491q.m24462O();
            long b = m25042b(O, O.mo16669r().mo16747a(O.mo16669r().mo16749b(O.mo16674w().mo16749b(j3, this.f18251b), 0), this.f18255f));
            if (this.f18253d != 0) {
                b = m25044d(O, b);
                if (b <= j3) {
                    b = m25044d(O, m25042b(O, O.mo16674w().mo16749b(O.mo16647H().mo16747a(b, 1), this.f18251b)));
                }
            } else if (b <= j3) {
                b = m25042b(O, O.mo16647H().mo16747a(b, 1));
            }
            return b - j2;
        }

        /* renamed from: b */
        public long mo16944b(long j, int i, int i2) {
            char c = this.f18250a;
            if (c == 'w') {
                i += i2;
            } else if (c != 's') {
                i = 0;
            }
            long j2 = (long) i;
            long j3 = j + j2;
            C6491q O = C6491q.m24462O();
            long c2 = m25043c(O, O.mo16669r().mo16747a(O.mo16669r().mo16749b(O.mo16674w().mo16749b(j3, this.f18251b), 0), this.f18255f));
            if (this.f18253d != 0) {
                c2 = m25044d(O, c2);
                if (c2 >= j3) {
                    c2 = m25044d(O, m25043c(O, O.mo16674w().mo16749b(O.mo16647H().mo16747a(c2, -1), this.f18251b)));
                }
            } else if (c2 >= j3) {
                c2 = m25043c(O, O.mo16647H().mo16747a(c2, -1));
            }
            return c2 - j2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6556b)) {
                return false;
            }
            C6556b bVar = (C6556b) obj;
            return this.f18250a == bVar.f18250a && this.f18251b == bVar.f18251b && this.f18252c == bVar.f18252c && this.f18253d == bVar.f18253d && this.f18254e == bVar.f18254e && this.f18255f == bVar.f18255f;
        }

        public String toString() {
            return "[OfYear]\nMode: " + this.f18250a + 10 + "MonthOfYear: " + this.f18251b + 10 + "DayOfMonth: " + this.f18252c + 10 + "DayOfWeek: " + this.f18253d + 10 + "AdvanceDayOfWeek: " + this.f18254e + 10 + "MillisOfDay: " + this.f18255f + 10;
        }
    }

    /* renamed from: g.b.a.e.b$c */
    private static final class C6557c extends C6567g {

        /* renamed from: f */
        private final long[] f18256f;

        /* renamed from: g */
        private final int[] f18257g;

        /* renamed from: h */
        private final int[] f18258h;

        /* renamed from: i */
        private final String[] f18259i;

        /* renamed from: j */
        private final C6555a f18260j;

        private C6557c(String str, long[] jArr, int[] iArr, int[] iArr2, String[] strArr, C6555a aVar) {
            super(str);
            this.f18256f = jArr;
            this.f18257g = iArr;
            this.f18258h = iArr2;
            this.f18259i = strArr;
            this.f18260j = aVar;
        }

        /* renamed from: a */
        static C6557c m25047a(DataInput dataInput, String str) {
            int i;
            int readUnsignedShort = dataInput.readUnsignedShort();
            String[] strArr = new String[readUnsignedShort];
            for (int i2 = 0; i2 < readUnsignedShort; i2++) {
                strArr[i2] = dataInput.readUTF();
            }
            int readInt = dataInput.readInt();
            long[] jArr = new long[readInt];
            int[] iArr = new int[readInt];
            int[] iArr2 = new int[readInt];
            String[] strArr2 = new String[readInt];
            for (int i3 = 0; i3 < readInt; i3++) {
                jArr[i3] = C6554b.m25029a(dataInput);
                iArr[i3] = (int) C6554b.m25029a(dataInput);
                iArr2[i3] = (int) C6554b.m25029a(dataInput);
                if (readUnsignedShort < 256) {
                    try {
                        i = dataInput.readUnsignedByte();
                    } catch (ArrayIndexOutOfBoundsException unused) {
                        throw new IOException("Invalid encoding");
                    }
                } else {
                    i = dataInput.readUnsignedShort();
                }
                strArr2[i3] = strArr[i];
            }
            return new C6557c(str, jArr, iArr, iArr2, strArr2, dataInput.readBoolean() ? C6555a.m25032a(dataInput, str) : null);
        }

        /* renamed from: b */
        public String mo16932b(long j) {
            long[] jArr = this.f18256f;
            int binarySearch = Arrays.binarySearch(jArr, j);
            if (binarySearch >= 0) {
                return this.f18259i[binarySearch];
            }
            int i = ~binarySearch;
            if (i < jArr.length) {
                return i > 0 ? this.f18259i[i - 1] : "UTC";
            }
            C6555a aVar = this.f18260j;
            return aVar == null ? this.f18259i[i - 1] : aVar.mo16932b(j);
        }

        /* renamed from: c */
        public int mo16933c(long j) {
            long[] jArr = this.f18256f;
            int binarySearch = Arrays.binarySearch(jArr, j);
            if (binarySearch >= 0) {
                return this.f18257g[binarySearch];
            }
            int i = ~binarySearch;
            if (i >= jArr.length) {
                C6555a aVar = this.f18260j;
                return aVar == null ? this.f18257g[i - 1] : aVar.mo16933c(j);
            } else if (i > 0) {
                return this.f18257g[i - 1];
            } else {
                return 0;
            }
        }

        /* renamed from: e */
        public int mo16934e(long j) {
            long[] jArr = this.f18256f;
            int binarySearch = Arrays.binarySearch(jArr, j);
            if (binarySearch >= 0) {
                return this.f18258h[binarySearch];
            }
            int i = ~binarySearch;
            if (i >= jArr.length) {
                C6555a aVar = this.f18260j;
                return aVar == null ? this.f18258h[i - 1] : aVar.mo16934e(j);
            } else if (i > 0) {
                return this.f18258h[i - 1];
            } else {
                return 0;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6557c)) {
                return false;
            }
            C6557c cVar = (C6557c) obj;
            if (mo16968c().equals(cVar.mo16968c()) && Arrays.equals(this.f18256f, cVar.f18256f) && Arrays.equals(this.f18259i, cVar.f18259i) && Arrays.equals(this.f18257g, cVar.f18257g) && Arrays.equals(this.f18258h, cVar.f18258h)) {
                C6555a aVar = this.f18260j;
                if (aVar == null) {
                    if (cVar.f18260j == null) {
                        return true;
                    }
                } else if (aVar.equals(cVar.f18260j)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: f */
        public boolean mo16936f() {
            return false;
        }

        /* renamed from: g */
        public long mo16937g(long j) {
            long[] jArr = this.f18256f;
            int binarySearch = Arrays.binarySearch(jArr, j);
            int i = binarySearch >= 0 ? binarySearch + 1 : ~binarySearch;
            if (i < jArr.length) {
                return jArr[i];
            }
            if (this.f18260j == null) {
                return j;
            }
            long j2 = jArr[jArr.length - 1];
            if (j < j2) {
                j = j2;
            }
            return this.f18260j.mo16937g(j);
        }

        /* renamed from: h */
        public long mo16938h(long j) {
            long[] jArr = this.f18256f;
            int binarySearch = Arrays.binarySearch(jArr, j);
            if (binarySearch >= 0) {
                return j > Long.MIN_VALUE ? j - 1 : j;
            }
            int i = ~binarySearch;
            if (i < jArr.length) {
                if (i > 0) {
                    long j2 = jArr[i - 1];
                    if (j2 > Long.MIN_VALUE) {
                        return j2 - 1;
                    }
                }
                return j;
            }
            C6555a aVar = this.f18260j;
            if (aVar != null) {
                long h = aVar.mo16938h(j);
                if (h < j) {
                    return h;
                }
            }
            long j3 = jArr[i - 1];
            return j3 > Long.MIN_VALUE ? j3 - 1 : j;
        }
    }

    /* renamed from: g.b.a.e.b$d */
    private static final class C6558d {

        /* renamed from: a */
        final C6556b f18261a;

        /* renamed from: b */
        final String f18262b;

        /* renamed from: c */
        final int f18263c;

        C6558d(C6556b bVar, String str, int i) {
            this.f18261a = bVar;
            this.f18262b = str;
            this.f18263c = i;
        }

        /* renamed from: a */
        static C6558d m25054a(DataInput dataInput) {
            return new C6558d(C6556b.m25041a(dataInput), dataInput.readUTF(), (int) C6554b.m25029a(dataInput));
        }

        /* renamed from: a */
        public long mo16947a(long j, int i, int i2) {
            return this.f18261a.mo16943a(j, i, i2);
        }

        /* renamed from: a */
        public String mo16948a() {
            return this.f18262b;
        }

        /* renamed from: b */
        public int mo16949b() {
            return this.f18263c;
        }

        /* renamed from: b */
        public long mo16950b(long j, int i, int i2) {
            return this.f18261a.mo16944b(j, i, i2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6558d)) {
                return false;
            }
            C6558d dVar = (C6558d) obj;
            return this.f18263c == dVar.f18263c && this.f18262b.equals(dVar.f18262b) && this.f18261a.equals(dVar.f18261a);
        }

        public String toString() {
            return this.f18261a + " named " + this.f18262b + " at " + this.f18263c;
        }
    }

    /* renamed from: a */
    static long m25029a(DataInput dataInput) {
        long readUnsignedByte;
        long j;
        int readUnsignedByte2 = dataInput.readUnsignedByte();
        int i = readUnsignedByte2 >> 6;
        if (i == 1) {
            readUnsignedByte = (long) (dataInput.readUnsignedByte() | ((readUnsignedByte2 << 26) >> 2) | (dataInput.readUnsignedByte() << 16) | (dataInput.readUnsignedByte() << 8));
            j = 60000;
        } else if (i == 2) {
            readUnsignedByte = ((((long) readUnsignedByte2) << 58) >> 26) | ((long) (dataInput.readUnsignedByte() << 24)) | ((long) (dataInput.readUnsignedByte() << 16)) | ((long) (dataInput.readUnsignedByte() << 8)) | ((long) dataInput.readUnsignedByte());
            j = 1000;
        } else if (i == 3) {
            return dataInput.readLong();
        } else {
            readUnsignedByte = (long) ((readUnsignedByte2 << 26) >> 26);
            j = 1800000;
        }
        return readUnsignedByte * j;
    }

    /* renamed from: a */
    public static C6567g m25030a(DataInput dataInput, String str) {
        int readUnsignedByte = dataInput.readUnsignedByte();
        if (readUnsignedByte == 67) {
            return C6552a.m25017a(C6557c.m25047a(dataInput, str));
        }
        if (readUnsignedByte == 70) {
            C6560d dVar = new C6560d(str, dataInput.readUTF(), (int) m25029a(dataInput), (int) m25029a(dataInput));
            return dVar.equals(C6567g.f18277a) ? C6567g.f18277a : dVar;
        } else if (readUnsignedByte == 80) {
            return C6557c.m25047a(dataInput, str);
        } else {
            throw new IOException("Invalid encoding");
        }
    }

    /* renamed from: a */
    public static C6567g m25031a(InputStream inputStream, String str) {
        return inputStream instanceof DataInput ? m25030a((DataInput) inputStream, str) : m25030a((DataInput) new DataInputStream(inputStream), str);
    }
}
