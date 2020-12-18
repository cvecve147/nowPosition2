package p101d.p129g.p159f.p167c;

import java.util.Arrays;
import org.apache.http.message.TokenParser;

/* renamed from: d.g.f.c.a */
public final class C5772a implements Cloneable {

    /* renamed from: a */
    private int[] f15938a;

    /* renamed from: b */
    private int f15939b;

    public C5772a() {
        this.f15939b = 0;
        this.f15938a = new int[1];
    }

    public C5772a(int i) {
        this.f15939b = i;
        this.f15938a = m21783e(i);
    }

    C5772a(int[] iArr, int i) {
        this.f15938a = iArr;
        this.f15939b = i;
    }

    /* renamed from: e */
    private static int[] m21783e(int i) {
        return new int[((i + 31) / 32)];
    }

    /* renamed from: a */
    public void mo15368a(int i, int i2) {
        this.f15938a[i / 32] = i2;
    }

    /* renamed from: a */
    public boolean mo15369a(int i) {
        return ((1 << (i & 31)) & this.f15938a[i / 32]) != 0;
    }

    /* renamed from: a */
    public boolean mo15370a(int i, int i2, boolean z) {
        int i3;
        if (i2 < i) {
            throw new IllegalArgumentException();
        } else if (i2 == i) {
            return true;
        } else {
            int i4 = i2 - 1;
            int i5 = i / 32;
            int i6 = i4 / 32;
            int i7 = i5;
            while (i7 <= i6) {
                int i8 = i7 > i5 ? 0 : i & 31;
                int i9 = i7 < i6 ? 31 : i4 & 31;
                if (i8 == 0 && i9 == 31) {
                    i3 = -1;
                } else {
                    i3 = 0;
                    while (i8 <= i9) {
                        i3 |= 1 << i8;
                        i8++;
                    }
                }
                int i10 = this.f15938a[i7] & i3;
                if (!z) {
                    i3 = 0;
                }
                if (i10 != i3) {
                    return false;
                }
                i7++;
            }
            return true;
        }
    }

    /* renamed from: b */
    public int mo15371b(int i) {
        int i2 = this.f15939b;
        if (i >= i2) {
            return i2;
        }
        int i3 = i / 32;
        int i4 = (~((1 << (i & 31)) - 1)) & this.f15938a[i3];
        while (i4 == 0) {
            i3++;
            int[] iArr = this.f15938a;
            if (i3 == iArr.length) {
                return this.f15939b;
            }
            i4 = iArr[i3];
        }
        int numberOfTrailingZeros = (i3 * 32) + Integer.numberOfTrailingZeros(i4);
        int i5 = this.f15939b;
        return numberOfTrailingZeros > i5 ? i5 : numberOfTrailingZeros;
    }

    /* renamed from: c */
    public int mo15372c(int i) {
        int i2 = this.f15939b;
        if (i >= i2) {
            return i2;
        }
        int i3 = i / 32;
        int i4 = (~((1 << (i & 31)) - 1)) & (~this.f15938a[i3]);
        while (i4 == 0) {
            i3++;
            int[] iArr = this.f15938a;
            if (i3 == iArr.length) {
                return this.f15939b;
            }
            i4 = ~iArr[i3];
        }
        int numberOfTrailingZeros = (i3 * 32) + Integer.numberOfTrailingZeros(i4);
        int i5 = this.f15939b;
        return numberOfTrailingZeros > i5 ? i5 : numberOfTrailingZeros;
    }

    public C5772a clone() {
        return new C5772a((int[]) this.f15938a.clone(), this.f15939b);
    }

    /* renamed from: d */
    public void mo15374d() {
        int length = this.f15938a.length;
        for (int i = 0; i < length; i++) {
            this.f15938a[i] = 0;
        }
    }

    /* renamed from: d */
    public void mo15375d(int i) {
        int[] iArr = this.f15938a;
        int i2 = i / 32;
        iArr[i2] = (1 << (i & 31)) | iArr[i2];
    }

    /* renamed from: e */
    public int[] mo15376e() {
        return this.f15938a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5772a)) {
            return false;
        }
        C5772a aVar = (C5772a) obj;
        return this.f15939b == aVar.f15939b && Arrays.equals(this.f15938a, aVar.f15938a);
    }

    /* renamed from: f */
    public int mo15378f() {
        return this.f15939b;
    }

    /* renamed from: g */
    public void mo15379g() {
        int[] iArr = new int[this.f15938a.length];
        int i = (this.f15939b - 1) / 32;
        int i2 = i + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            long j = (long) this.f15938a[i3];
            long j2 = ((j & 1431655765) << 1) | ((j >> 1) & 1431655765);
            long j3 = ((j2 & 858993459) << 2) | ((j2 >> 2) & 858993459);
            long j4 = ((j3 & 252645135) << 4) | ((j3 >> 4) & 252645135);
            long j5 = ((j4 & 16711935) << 8) | ((j4 >> 8) & 16711935);
            iArr[i - i3] = (int) (((j5 & 65535) << 16) | ((j5 >> 16) & 65535));
        }
        int i4 = this.f15939b;
        int i5 = i2 * 32;
        if (i4 != i5) {
            int i6 = i5 - i4;
            int i7 = 1;
            for (int i8 = 0; i8 < 31 - i6; i8++) {
                i7 = (i7 << 1) | 1;
            }
            int i9 = (iArr[0] >> i6) & i7;
            for (int i10 = 1; i10 < i2; i10++) {
                int i11 = iArr[i10];
                iArr[i10 - 1] = i9 | (i11 << (32 - i6));
                i9 = (i11 >> i6) & i7;
            }
            iArr[i2 - 1] = i9;
        }
        this.f15938a = iArr;
    }

    public int hashCode() {
        return (this.f15939b * 31) + Arrays.hashCode(this.f15938a);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(this.f15939b);
        for (int i = 0; i < this.f15939b; i++) {
            if ((i & 7) == 0) {
                sb.append(TokenParser.f19315SP);
            }
            sb.append(mo15369a(i) ? 'X' : '.');
        }
        return sb.toString();
    }
}
