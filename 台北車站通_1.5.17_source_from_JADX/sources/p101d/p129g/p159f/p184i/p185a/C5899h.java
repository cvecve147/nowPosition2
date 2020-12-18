package p101d.p129g.p159f.p184i.p185a;

/* renamed from: d.g.f.i.a.h */
final class C5899h {

    /* renamed from: a */
    private static final int[][] f16295a = {new int[]{21522, 0}, new int[]{20773, 1}, new int[]{24188, 2}, new int[]{23371, 3}, new int[]{17913, 4}, new int[]{16590, 5}, new int[]{20375, 6}, new int[]{19104, 7}, new int[]{30660, 8}, new int[]{29427, 9}, new int[]{32170, 10}, new int[]{30877, 11}, new int[]{26159, 12}, new int[]{25368, 13}, new int[]{27713, 14}, new int[]{26998, 15}, new int[]{5769, 16}, new int[]{5054, 17}, new int[]{7399, 18}, new int[]{6608, 19}, new int[]{1890, 20}, new int[]{597, 21}, new int[]{3340, 22}, new int[]{2107, 23}, new int[]{13663, 24}, new int[]{12392, 25}, new int[]{16177, 26}, new int[]{14854, 27}, new int[]{9396, 28}, new int[]{8579, 29}, new int[]{11994, 30}, new int[]{11245, 31}};

    /* renamed from: b */
    private static final int[] f16296b = {0, 1, 1, 2, 1, 2, 2, 3, 1, 2, 2, 3, 2, 3, 3, 4};

    /* renamed from: c */
    private final C5898g f16297c;

    /* renamed from: d */
    private final byte f16298d;

    private C5899h(int i) {
        this.f16297c = C5898g.m22340a((i >> 3) & 3);
        this.f16298d = (byte) (i & 7);
    }

    /* renamed from: a */
    static C5899h m22341a(int i, int i2) {
        C5899h c = m22343c(i, i2);
        return c != null ? c : m22343c(i ^ 21522, i2 ^ 21522);
    }

    /* renamed from: b */
    static int m22342b(int i, int i2) {
        int i3 = i ^ i2;
        int[] iArr = f16296b;
        return iArr[i3 & 15] + iArr[(i3 >>> 4) & 15] + iArr[(i3 >>> 8) & 15] + iArr[(i3 >>> 12) & 15] + iArr[(i3 >>> 16) & 15] + iArr[(i3 >>> 20) & 15] + iArr[(i3 >>> 24) & 15] + iArr[(i3 >>> 28) & 15];
    }

    /* renamed from: c */
    private static C5899h m22343c(int i, int i2) {
        int b;
        int i3 = 0;
        int i4 = Integer.MAX_VALUE;
        for (int[] iArr : f16295a) {
            int i5 = iArr[0];
            if (i5 == i || i5 == i2) {
                return new C5899h(iArr[1]);
            }
            int b2 = m22342b(i, i5);
            if (b2 < i4) {
                i3 = iArr[1];
                i4 = b2;
            }
            if (i != i2 && (b = m22342b(i2, i5)) < i4) {
                i3 = iArr[1];
                i4 = b;
            }
        }
        if (i4 <= 3) {
            return new C5899h(i3);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public byte mo15655a() {
        return this.f16298d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C5898g mo15656b() {
        return this.f16297c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5899h)) {
            return false;
        }
        C5899h hVar = (C5899h) obj;
        return this.f16297c == hVar.f16297c && this.f16298d == hVar.f16298d;
    }

    public int hashCode() {
        return (this.f16297c.ordinal() << 3) | this.f16298d;
    }
}
