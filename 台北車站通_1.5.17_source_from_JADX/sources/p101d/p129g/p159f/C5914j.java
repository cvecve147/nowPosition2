package p101d.p129g.p159f;

/* renamed from: d.g.f.j */
public final class C5914j extends C5813g {

    /* renamed from: c */
    private final byte[] f16347c;

    /* renamed from: d */
    private final int f16348d;

    /* renamed from: e */
    private final int f16349e;

    /* renamed from: f */
    private final int f16350f;

    /* renamed from: g */
    private final int f16351g;

    public C5914j(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        super(i5, i6);
        if (i3 + i5 > i || i4 + i6 > i2) {
            throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
        }
        this.f16347c = bArr;
        this.f16348d = i;
        this.f16349e = i2;
        this.f16350f = i3;
        this.f16351g = i4;
        if (z) {
            m22400a(i5, i6);
        }
    }

    /* renamed from: a */
    private void m22400a(int i, int i2) {
        byte[] bArr = this.f16347c;
        int i3 = (this.f16351g * this.f16348d) + this.f16350f;
        int i4 = 0;
        while (i4 < i2) {
            int i5 = (i / 2) + i3;
            int i6 = (i3 + i) - 1;
            int i7 = i3;
            while (i7 < i5) {
                byte b = bArr[i7];
                bArr[i7] = bArr[i6];
                bArr[i6] = b;
                i7++;
                i6--;
            }
            i4++;
            i3 += this.f16348d;
        }
    }

    /* renamed from: a */
    public byte[] mo15478a(int i, byte[] bArr) {
        if (i < 0 || i >= mo15477a()) {
            throw new IllegalArgumentException("Requested row is outside the image: " + i);
        }
        int c = mo15480c();
        if (bArr == null || bArr.length < c) {
            bArr = new byte[c];
        }
        System.arraycopy(this.f16347c, ((i + this.f16351g) * this.f16348d) + this.f16350f, bArr, 0, c);
        return bArr;
    }

    /* renamed from: b */
    public byte[] mo15479b() {
        int c = mo15480c();
        int a = mo15477a();
        if (c == this.f16348d && a == this.f16349e) {
            return this.f16347c;
        }
        int i = c * a;
        byte[] bArr = new byte[i];
        int i2 = this.f16351g;
        int i3 = this.f16348d;
        int i4 = (i2 * i3) + this.f16350f;
        if (c == i3) {
            System.arraycopy(this.f16347c, i4, bArr, 0, i);
            return bArr;
        }
        byte[] bArr2 = this.f16347c;
        for (int i5 = 0; i5 < a; i5++) {
            System.arraycopy(bArr2, i4, bArr, i5 * c, c);
            i4 += this.f16348d;
        }
        return bArr;
    }
}
