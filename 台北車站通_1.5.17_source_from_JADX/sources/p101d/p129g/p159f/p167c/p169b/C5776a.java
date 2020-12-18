package p101d.p129g.p159f.p167c.p169b;

import org.apache.http.HttpStatus;

/* renamed from: d.g.f.c.b.a */
public final class C5776a {

    /* renamed from: a */
    public static final C5776a f15951a = new C5776a(4201, SVGParser.ENTITY_WATCH_BUFFER_SIZE, 1);

    /* renamed from: b */
    public static final C5776a f15952b = new C5776a(1033, 1024, 1);

    /* renamed from: c */
    public static final C5776a f15953c = new C5776a(67, 64, 1);

    /* renamed from: d */
    public static final C5776a f15954d = new C5776a(19, 16, 1);

    /* renamed from: e */
    public static final C5776a f15955e = new C5776a(285, 256, 0);

    /* renamed from: f */
    public static final C5776a f15956f = new C5776a(HttpStatus.SC_MOVED_PERMANENTLY, 256, 1);

    /* renamed from: g */
    public static final C5776a f15957g = f15956f;

    /* renamed from: h */
    public static final C5776a f15958h = f15953c;

    /* renamed from: i */
    private final int[] f15959i;

    /* renamed from: j */
    private final int[] f15960j;

    /* renamed from: k */
    private final C5777b f15961k;

    /* renamed from: l */
    private final C5777b f15962l;

    /* renamed from: m */
    private final int f15963m;

    /* renamed from: n */
    private final int f15964n;

    /* renamed from: o */
    private final int f15965o;

    public C5776a(int i, int i2, int i3) {
        this.f15964n = i;
        this.f15963m = i2;
        this.f15965o = i3;
        this.f15959i = new int[i2];
        this.f15960j = new int[i2];
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            this.f15959i[i5] = i4;
            i4 *= 2;
            if (i4 >= i2) {
                i4 = (i4 ^ i) & (i2 - 1);
            }
        }
        for (int i6 = 0; i6 < i2 - 1; i6++) {
            this.f15960j[this.f15959i[i6]] = i6;
        }
        this.f15961k = new C5777b(this, new int[]{0});
        this.f15962l = new C5777b(this, new int[]{1});
    }

    /* renamed from: a */
    static int m21815a(int i, int i2) {
        return i ^ i2;
    }

    /* renamed from: a */
    public int mo15401a() {
        return this.f15965o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo15402a(int i) {
        return this.f15959i[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo15403b(int i) {
        if (i != 0) {
            return this.f15959i[(this.f15963m - this.f15960j[i]) - 1];
        }
        throw new ArithmeticException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C5777b mo15404b() {
        return this.f15962l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C5777b mo15405b(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f15961k;
        } else {
            int[] iArr = new int[(i + 1)];
            iArr[0] = i2;
            return new C5777b(this, iArr);
        }
    }

    /* renamed from: c */
    public int mo15406c() {
        return this.f15963m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo15407c(int i) {
        if (i != 0) {
            return this.f15960j[i];
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo15408c(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.f15959i;
        int[] iArr2 = this.f15960j;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.f15963m - 1)];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C5777b mo15409d() {
        return this.f15961k;
    }

    public String toString() {
        return "GF(0x" + Integer.toHexString(this.f15964n) + ',' + this.f15963m + ')';
    }
}
