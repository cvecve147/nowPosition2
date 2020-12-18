package p101d.p129g.p159f.p180h.p181a.p182a;

/* renamed from: d.g.f.h.a.a.c */
final class C5866c {

    /* renamed from: a */
    private final C5865b f16228a;

    /* renamed from: b */
    private final int[] f16229b;

    C5866c(C5865b bVar, int[] iArr) {
        if (iArr.length != 0) {
            this.f16228a = bVar;
            int length = iArr.length;
            if (length <= 1 || iArr[0] != 0) {
                this.f16229b = iArr;
                return;
            }
            int i = 1;
            while (i < length && iArr[i] == 0) {
                i++;
            }
            if (i == length) {
                this.f16229b = new int[]{0};
                return;
            }
            this.f16229b = new int[(length - i)];
            int[] iArr2 = this.f16229b;
            System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
            return;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo15583a() {
        return this.f16229b.length - 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo15584a(int i) {
        if (i == 0) {
            return mo15587b(0);
        }
        int[] iArr = this.f16229b;
        int length = iArr.length;
        if (i == 1) {
            int i2 = 0;
            for (int a : iArr) {
                i2 = this.f16228a.mo15574a(i2, a);
            }
            return i2;
        }
        int i3 = iArr[0];
        for (int i4 = 1; i4 < length; i4++) {
            C5865b bVar = this.f16228a;
            i3 = bVar.mo15574a(bVar.mo15580c(i, i3), this.f16229b[i4]);
        }
        return i3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C5866c mo15585a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f16228a.mo15581c();
        } else {
            int length = this.f16229b.length;
            int[] iArr = new int[(i + length)];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = this.f16228a.mo15580c(this.f16229b[i3], i2);
            }
            return new C5866c(this.f16228a, iArr);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C5866c mo15586a(C5866c cVar) {
        if (!this.f16228a.equals(cVar.f16228a)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        } else if (mo15589b()) {
            return cVar;
        } else {
            if (cVar.mo15589b()) {
                return this;
            }
            int[] iArr = this.f16229b;
            int[] iArr2 = cVar.f16229b;
            if (iArr.length > iArr2.length) {
                int[] iArr3 = iArr;
                iArr = iArr2;
                iArr2 = iArr3;
            }
            int[] iArr4 = new int[iArr2.length];
            int length = iArr2.length - iArr.length;
            System.arraycopy(iArr2, 0, iArr4, 0, length);
            for (int i = length; i < iArr2.length; i++) {
                iArr4[i] = this.f16228a.mo15574a(iArr[i - length], iArr2[i]);
            }
            return new C5866c(this.f16228a, iArr4);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo15587b(int i) {
        int[] iArr = this.f16229b;
        return iArr[(iArr.length - 1) - i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C5866c mo15588b(C5866c cVar) {
        if (!this.f16228a.equals(cVar.f16228a)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        } else if (mo15589b() || cVar.mo15589b()) {
            return this.f16228a.mo15581c();
        } else {
            int[] iArr = this.f16229b;
            int length = iArr.length;
            int[] iArr2 = cVar.f16229b;
            int length2 = iArr2.length;
            int[] iArr3 = new int[((length + length2) - 1)];
            for (int i = 0; i < length; i++) {
                int i2 = iArr[i];
                for (int i3 = 0; i3 < length2; i3++) {
                    int i4 = i + i3;
                    C5865b bVar = this.f16228a;
                    iArr3[i4] = bVar.mo15574a(iArr3[i4], bVar.mo15580c(i2, iArr2[i3]));
                }
            }
            return new C5866c(this.f16228a, iArr3);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo15589b() {
        return this.f16229b[0] == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C5866c mo15590c() {
        int length = this.f16229b.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = this.f16228a.mo15582d(0, this.f16229b[i]);
        }
        return new C5866c(this.f16228a, iArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C5866c mo15591c(int i) {
        if (i == 0) {
            return this.f16228a.mo15581c();
        }
        if (i == 1) {
            return this;
        }
        int length = this.f16229b.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = this.f16228a.mo15580c(this.f16229b[i2], i);
        }
        return new C5866c(this.f16228a, iArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C5866c mo15592c(C5866c cVar) {
        if (this.f16228a.equals(cVar.f16228a)) {
            return cVar.mo15589b() ? this : mo15586a(cVar.mo15590c());
        }
        throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(mo15583a() * 8);
        for (int a = mo15583a(); a >= 0; a--) {
            int b = mo15587b(a);
            if (b != 0) {
                if (b < 0) {
                    sb.append(" - ");
                    b = -b;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (a == 0 || b != 1) {
                    sb.append(b);
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
