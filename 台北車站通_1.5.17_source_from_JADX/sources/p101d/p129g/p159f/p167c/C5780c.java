package p101d.p129g.p159f.p167c;

/* renamed from: d.g.f.c.c */
public final class C5780c {

    /* renamed from: a */
    private final byte[] f15969a;

    /* renamed from: b */
    private int f15970b;

    /* renamed from: c */
    private int f15971c;

    public C5780c(byte[] bArr) {
        this.f15969a = bArr;
    }

    /* renamed from: a */
    public int mo15421a() {
        return ((this.f15969a.length - this.f15970b) * 8) - this.f15971c;
    }

    /* renamed from: a */
    public int mo15422a(int i) {
        byte b;
        if (i < 1 || i > 32 || i > mo15421a()) {
            throw new IllegalArgumentException(String.valueOf(i));
        }
        int i2 = this.f15971c;
        if (i2 > 0) {
            int i3 = 8 - i2;
            int i4 = i < i3 ? i : i3;
            int i5 = i3 - i4;
            byte[] bArr = this.f15969a;
            int i6 = this.f15970b;
            b = (((255 >> (8 - i4)) << i5) & bArr[i6]) >> i5;
            i -= i4;
            this.f15971c += i4;
            if (this.f15971c == 8) {
                this.f15971c = 0;
                this.f15970b = i6 + 1;
            }
        } else {
            b = 0;
        }
        if (i <= 0) {
            return b;
        }
        while (i >= 8) {
            byte[] bArr2 = this.f15969a;
            int i7 = this.f15970b;
            b = (b << 8) | (bArr2[i7] & 255);
            this.f15970b = i7 + 1;
            i -= 8;
        }
        if (i <= 0) {
            return b;
        }
        int i8 = 8 - i;
        int i9 = (b << i) | ((((255 >> i8) << i8) & this.f15969a[this.f15970b]) >> i8);
        this.f15971c += i;
        return i9;
    }

    /* renamed from: b */
    public int mo15423b() {
        return this.f15971c;
    }

    /* renamed from: c */
    public int mo15424c() {
        return this.f15970b;
    }
}
