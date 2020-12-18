package p101d.p129g.p159f.p180h.p181a.p182a;

/* renamed from: d.g.f.h.a.a.b */
public final class C5865b {

    /* renamed from: a */
    public static final C5865b f16222a = new C5865b(929, 3);

    /* renamed from: b */
    private final int[] f16223b;

    /* renamed from: c */
    private final int[] f16224c;

    /* renamed from: d */
    private final C5866c f16225d;

    /* renamed from: e */
    private final C5866c f16226e;

    /* renamed from: f */
    private final int f16227f;

    private C5865b(int i, int i2) {
        this.f16227f = i;
        this.f16223b = new int[i];
        this.f16224c = new int[i];
        int i3 = 1;
        for (int i4 = 0; i4 < i; i4++) {
            this.f16223b[i4] = i3;
            i3 = (i3 * i2) % i;
        }
        for (int i5 = 0; i5 < i - 1; i5++) {
            this.f16224c[this.f16223b[i5]] = i5;
        }
        this.f16225d = new C5866c(this, new int[]{0});
        this.f16226e = new C5866c(this, new int[]{1});
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo15573a(int i) {
        return this.f16223b[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo15574a(int i, int i2) {
        return (i + i2) % this.f16227f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C5866c mo15575a() {
        return this.f16226e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo15576b() {
        return this.f16227f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo15577b(int i) {
        if (i != 0) {
            return this.f16223b[(this.f16227f - this.f16224c[i]) - 1];
        }
        throw new ArithmeticException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C5866c mo15578b(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f16225d;
        } else {
            int[] iArr = new int[(i + 1)];
            iArr[0] = i2;
            return new C5866c(this, iArr);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo15579c(int i) {
        if (i != 0) {
            return this.f16224c[i];
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo15580c(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.f16223b;
        int[] iArr2 = this.f16224c;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.f16227f - 1)];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C5866c mo15581c() {
        return this.f16225d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo15582d(int i, int i2) {
        int i3 = this.f16227f;
        return ((i + i3) - i2) % i3;
    }
}
