package p101d.p129g.p159f.p167c;

import java.util.Arrays;

/* renamed from: d.g.f.c.b */
public final class C5775b implements Cloneable {

    /* renamed from: a */
    private final int f15947a;

    /* renamed from: b */
    private final int f15948b;

    /* renamed from: c */
    private final int f15949c;

    /* renamed from: d */
    private final int[] f15950d;

    public C5775b(int i) {
        this(i, i);
    }

    public C5775b(int i, int i2) {
        if (i < 1 || i2 < 1) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f15947a = i;
        this.f15948b = i2;
        this.f15949c = (i + 31) / 32;
        this.f15950d = new int[(this.f15949c * i2)];
    }

    private C5775b(int i, int i2, int i3, int[] iArr) {
        this.f15947a = i;
        this.f15948b = i2;
        this.f15949c = i3;
        this.f15950d = iArr;
    }

    /* renamed from: a */
    public C5772a mo15383a(int i, C5772a aVar) {
        if (aVar == null || aVar.mo15378f() < this.f15947a) {
            aVar = new C5772a(this.f15947a);
        } else {
            aVar.mo15374d();
        }
        int i2 = i * this.f15949c;
        for (int i3 = 0; i3 < this.f15949c; i3++) {
            aVar.mo15368a(i3 * 32, this.f15950d[i2 + i3]);
        }
        return aVar;
    }

    /* renamed from: a */
    public String mo15384a(String str, String str2) {
        return mo15385a(str, str2, "\n");
    }

    @Deprecated
    /* renamed from: a */
    public String mo15385a(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(this.f15948b * (this.f15947a + 1));
        for (int i = 0; i < this.f15948b; i++) {
            for (int i2 = 0; i2 < this.f15947a; i2++) {
                sb.append(mo15389b(i2, i) ? str : str2);
            }
            sb.append(str3);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public void mo15386a(int i, int i2) {
        int i3 = (i2 * this.f15949c) + (i / 32);
        int[] iArr = this.f15950d;
        iArr[i3] = (1 << (i & 31)) ^ iArr[i3];
    }

    /* renamed from: a */
    public void mo15387a(int i, int i2, int i3, int i4) {
        if (i2 < 0 || i < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        } else if (i4 < 1 || i3 < 1) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        } else {
            int i5 = i3 + i;
            int i6 = i4 + i2;
            if (i6 > this.f15948b || i5 > this.f15947a) {
                throw new IllegalArgumentException("The region must fit inside the matrix");
            }
            while (i2 < i6) {
                int i7 = this.f15949c * i2;
                for (int i8 = i; i8 < i5; i8++) {
                    int[] iArr = this.f15950d;
                    int i9 = (i8 / 32) + i7;
                    iArr[i9] = iArr[i9] | (1 << (i8 & 31));
                }
                i2++;
            }
        }
    }

    /* renamed from: b */
    public void mo15388b(int i, C5772a aVar) {
        int[] e = aVar.mo15376e();
        int[] iArr = this.f15950d;
        int i2 = this.f15949c;
        System.arraycopy(e, 0, iArr, i * i2, i2);
    }

    /* renamed from: b */
    public boolean mo15389b(int i, int i2) {
        return ((this.f15950d[(i2 * this.f15949c) + (i / 32)] >>> (i & 31)) & 1) != 0;
    }

    /* renamed from: c */
    public void mo15390c(int i, int i2) {
        int i3 = (i2 * this.f15949c) + (i / 32);
        int[] iArr = this.f15950d;
        iArr[i3] = (1 << (i & 31)) | iArr[i3];
    }

    public C5775b clone() {
        return new C5775b(this.f15947a, this.f15948b, this.f15949c, (int[]) this.f15950d.clone());
    }

    /* renamed from: d */
    public int[] mo15392d() {
        int length = this.f15950d.length - 1;
        while (length >= 0 && this.f15950d[length] == 0) {
            length--;
        }
        if (length < 0) {
            return null;
        }
        int i = this.f15949c;
        int i2 = length / i;
        int i3 = (length % i) * 32;
        int i4 = 31;
        while ((this.f15950d[length] >>> i4) == 0) {
            i4--;
        }
        return new int[]{i3 + i4, i2};
    }

    /* renamed from: e */
    public int[] mo15393e() {
        int i = this.f15947a;
        int i2 = -1;
        int i3 = this.f15948b;
        int i4 = -1;
        int i5 = i;
        int i6 = 0;
        while (i6 < this.f15948b) {
            int i7 = i4;
            int i8 = i2;
            int i9 = i5;
            int i10 = 0;
            while (true) {
                int i11 = this.f15949c;
                if (i10 >= i11) {
                    break;
                }
                int i12 = this.f15950d[(i11 * i6) + i10];
                if (i12 != 0) {
                    if (i6 < i3) {
                        i3 = i6;
                    }
                    if (i6 > i7) {
                        i7 = i6;
                    }
                    int i13 = i10 * 32;
                    int i14 = 31;
                    if (i13 < i9) {
                        int i15 = 0;
                        while ((i12 << (31 - i15)) == 0) {
                            i15++;
                        }
                        int i16 = i15 + i13;
                        if (i16 < i9) {
                            i9 = i16;
                        }
                    }
                    if (i13 + 31 > i8) {
                        while ((i12 >>> i14) == 0) {
                            i14--;
                        }
                        int i17 = i13 + i14;
                        if (i17 > i8) {
                            i8 = i17;
                        }
                    }
                }
                i10++;
            }
            i6++;
            i5 = i9;
            i2 = i8;
            i4 = i7;
        }
        int i18 = i2 - i5;
        int i19 = i4 - i3;
        if (i18 < 0 || i19 < 0) {
            return null;
        }
        return new int[]{i5, i3, i18, i19};
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5775b)) {
            return false;
        }
        C5775b bVar = (C5775b) obj;
        return this.f15947a == bVar.f15947a && this.f15948b == bVar.f15948b && this.f15949c == bVar.f15949c && Arrays.equals(this.f15950d, bVar.f15950d);
    }

    /* renamed from: f */
    public int mo15395f() {
        return this.f15948b;
    }

    /* renamed from: g */
    public int[] mo15396g() {
        int i = 0;
        while (true) {
            int[] iArr = this.f15950d;
            if (i >= iArr.length || iArr[i] != 0) {
                int[] iArr2 = this.f15950d;
            } else {
                i++;
            }
        }
        int[] iArr22 = this.f15950d;
        if (i == iArr22.length) {
            return null;
        }
        int i2 = this.f15949c;
        int i3 = i / i2;
        int i4 = (i % i2) * 32;
        int i5 = iArr22[i];
        int i6 = 0;
        while ((i5 << (31 - i6)) == 0) {
            i6++;
        }
        return new int[]{i4 + i6, i3};
    }

    /* renamed from: h */
    public int mo15397h() {
        return this.f15947a;
    }

    public int hashCode() {
        int i = this.f15947a;
        return (((((((i * 31) + i) * 31) + this.f15948b) * 31) + this.f15949c) * 31) + Arrays.hashCode(this.f15950d);
    }

    /* renamed from: i */
    public void mo15399i() {
        int h = mo15397h();
        int f = mo15395f();
        C5772a aVar = new C5772a(h);
        C5772a aVar2 = new C5772a(h);
        for (int i = 0; i < (f + 1) / 2; i++) {
            aVar = mo15383a(i, aVar);
            int i2 = (f - 1) - i;
            aVar2 = mo15383a(i2, aVar2);
            aVar.mo15379g();
            aVar2.mo15379g();
            mo15388b(i, aVar2);
            mo15388b(i2, aVar);
        }
    }

    public String toString() {
        return mo15384a("X ", "  ");
    }
}
