package p245f.p246a.p247a.p248a.p249a;

/* renamed from: f.a.a.a.a.c */
class C6449c {

    /* renamed from: a */
    static final int[] f17843a = new int[0];

    /* renamed from: b */
    static final long[] f17844b = new long[0];

    /* renamed from: c */
    static final Object[] f17845c = new Object[0];

    /* renamed from: a */
    static int m24086a(int[] iArr, int i, int i2) {
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else if (i6 <= i2) {
                return i5;
            } else {
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }
}
