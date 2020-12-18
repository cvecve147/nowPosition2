package p101d.p129g.p159f.p167c.p169b;

/* renamed from: d.g.f.c.b.b */
final class C5777b {

    /* renamed from: a */
    private final C5776a f15966a;

    /* renamed from: b */
    private final int[] f15967b;

    C5777b(C5776a aVar, int[] iArr) {
        if (iArr.length != 0) {
            this.f15966a = aVar;
            int length = iArr.length;
            if (length <= 1 || iArr[0] != 0) {
                this.f15967b = iArr;
                return;
            }
            int i = 1;
            while (i < length && iArr[i] == 0) {
                i++;
            }
            if (i == length) {
                this.f15967b = new int[]{0};
                return;
            }
            this.f15967b = new int[(length - i)];
            int[] iArr2 = this.f15967b;
            System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
            return;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo15411a() {
        return this.f15967b.length - 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo15412a(int i) {
        if (i == 0) {
            return mo15415b(0);
        }
        int[] iArr = this.f15967b;
        int length = iArr.length;
        if (i == 1) {
            int i2 = 0;
            for (int a : iArr) {
                i2 = C5776a.m21815a(i2, a);
            }
            return i2;
        }
        int i3 = iArr[0];
        for (int i4 = 1; i4 < length; i4++) {
            i3 = C5776a.m21815a(this.f15966a.mo15408c(i, i3), this.f15967b[i4]);
        }
        return i3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C5777b mo15413a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f15966a.mo15409d();
        } else {
            int length = this.f15967b.length;
            int[] iArr = new int[(i + length)];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = this.f15966a.mo15408c(this.f15967b[i3], i2);
            }
            return new C5777b(this.f15966a, iArr);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C5777b mo15414a(C5777b bVar) {
        if (!this.f15966a.equals(bVar.f15966a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (mo15417b()) {
            return bVar;
        } else {
            if (bVar.mo15417b()) {
                return this;
            }
            int[] iArr = this.f15967b;
            int[] iArr2 = bVar.f15967b;
            if (iArr.length > iArr2.length) {
                int[] iArr3 = iArr;
                iArr = iArr2;
                iArr2 = iArr3;
            }
            int[] iArr4 = new int[iArr2.length];
            int length = iArr2.length - iArr.length;
            System.arraycopy(iArr2, 0, iArr4, 0, length);
            for (int i = length; i < iArr2.length; i++) {
                iArr4[i] = C5776a.m21815a(iArr[i - length], iArr2[i]);
            }
            return new C5777b(this.f15966a, iArr4);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo15415b(int i) {
        int[] iArr = this.f15967b;
        return iArr[(iArr.length - 1) - i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C5777b mo15416b(C5777b bVar) {
        if (!this.f15966a.equals(bVar.f15966a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (mo15417b() || bVar.mo15417b()) {
            return this.f15966a.mo15409d();
        } else {
            int[] iArr = this.f15967b;
            int length = iArr.length;
            int[] iArr2 = bVar.f15967b;
            int length2 = iArr2.length;
            int[] iArr3 = new int[((length + length2) - 1)];
            for (int i = 0; i < length; i++) {
                int i2 = iArr[i];
                for (int i3 = 0; i3 < length2; i3++) {
                    int i4 = i + i3;
                    iArr3[i4] = C5776a.m21815a(iArr3[i4], this.f15966a.mo15408c(i2, iArr2[i3]));
                }
            }
            return new C5777b(this.f15966a, iArr3);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo15417b() {
        return this.f15967b[0] == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C5777b mo15418c(int i) {
        if (i == 0) {
            return this.f15966a.mo15409d();
        }
        if (i == 1) {
            return this;
        }
        int length = this.f15967b.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = this.f15966a.mo15408c(this.f15967b[i2], i);
        }
        return new C5777b(this.f15966a, iArr);
    }

    public String toString() {
        char c;
        StringBuilder sb = new StringBuilder(mo15411a() * 8);
        for (int a = mo15411a(); a >= 0; a--) {
            int b = mo15415b(a);
            if (b != 0) {
                if (b < 0) {
                    sb.append(" - ");
                    b = -b;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (a == 0 || b != 1) {
                    int c2 = this.f15966a.mo15407c(b);
                    if (c2 == 0) {
                        c = '1';
                    } else if (c2 == 1) {
                        c = 'a';
                    } else {
                        sb.append("a^");
                        sb.append(c2);
                    }
                    sb.append(c);
                }
                if (a != 0) {
                    if (a == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(a);
                    }
                }
            }
        }
        return sb.toString();
    }
}
