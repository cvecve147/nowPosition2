package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.f */
public final class C3840f implements Cloneable {

    /* renamed from: a */
    private static final C3844g f11446a = new C3844g();

    /* renamed from: b */
    private boolean f11447b;

    /* renamed from: c */
    private int[] f11448c;

    /* renamed from: d */
    private C3844g[] f11449d;

    /* renamed from: e */
    private int f11450e;

    C3840f() {
        this(10);
    }

    private C3840f(int i) {
        this.f11447b = false;
        int c = m15440c(i);
        this.f11448c = new int[c];
        this.f11449d = new C3844g[c];
        this.f11450e = 0;
    }

    /* renamed from: c */
    private static int m15440c(int i) {
        int i2 = i << 2;
        int i3 = 4;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        return i2 / 4;
    }

    /* renamed from: d */
    private final int m15441d(int i) {
        int i2 = this.f11450e - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            int i5 = this.f11448c[i4];
            if (i5 < i) {
                i3 = i4 + 1;
            } else if (i5 <= i) {
                return i4;
            } else {
                i2 = i4 - 1;
            }
        }
        return ~i3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C3844g mo10719a(int i) {
        int d = m15441d(i);
        if (d < 0) {
            return null;
        }
        C3844g[] gVarArr = this.f11449d;
        if (gVarArr[d] == f11446a) {
            return null;
        }
        return gVarArr[d];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo10720a(int i, C3844g gVar) {
        int d = m15441d(i);
        if (d >= 0) {
            this.f11449d[d] = gVar;
            return;
        }
        int i2 = ~d;
        if (i2 < this.f11450e) {
            C3844g[] gVarArr = this.f11449d;
            if (gVarArr[i2] == f11446a) {
                this.f11448c[i2] = i;
                gVarArr[i2] = gVar;
                return;
            }
        }
        int i3 = this.f11450e;
        if (i3 >= this.f11448c.length) {
            int c = m15440c(i3 + 1);
            int[] iArr = new int[c];
            C3844g[] gVarArr2 = new C3844g[c];
            int[] iArr2 = this.f11448c;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            C3844g[] gVarArr3 = this.f11449d;
            System.arraycopy(gVarArr3, 0, gVarArr2, 0, gVarArr3.length);
            this.f11448c = iArr;
            this.f11449d = gVarArr2;
        }
        int i4 = this.f11450e;
        if (i4 - i2 != 0) {
            int[] iArr3 = this.f11448c;
            int i5 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i5, i4 - i2);
            C3844g[] gVarArr4 = this.f11449d;
            System.arraycopy(gVarArr4, i2, gVarArr4, i5, this.f11450e - i2);
        }
        this.f11448c[i2] = i;
        this.f11449d[i2] = gVar;
        this.f11450e++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C3844g mo10721b(int i) {
        return this.f11449d[i];
    }

    public final /* synthetic */ Object clone() {
        int i = this.f11450e;
        C3840f fVar = new C3840f(i);
        System.arraycopy(this.f11448c, 0, fVar.f11448c, 0, i);
        for (int i2 = 0; i2 < i; i2++) {
            C3844g[] gVarArr = this.f11449d;
            if (gVarArr[i2] != null) {
                fVar.f11449d[i2] = (C3844g) gVarArr[i2].clone();
            }
        }
        fVar.f11450e = i;
        return fVar;
    }

    /* renamed from: d */
    public final boolean mo10723d() {
        return this.f11450e == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final int mo10724e() {
        return this.f11450e;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3840f)) {
            return false;
        }
        C3840f fVar = (C3840f) obj;
        int i = this.f11450e;
        if (i != fVar.f11450e) {
            return false;
        }
        int[] iArr = this.f11448c;
        int[] iArr2 = fVar.f11448c;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                z = true;
                break;
            } else if (iArr[i2] != iArr2[i2]) {
                z = false;
                break;
            } else {
                i2++;
            }
        }
        if (z) {
            C3844g[] gVarArr = this.f11449d;
            C3844g[] gVarArr2 = fVar.f11449d;
            int i3 = this.f11450e;
            int i4 = 0;
            while (true) {
                if (i4 >= i3) {
                    z2 = true;
                    break;
                } else if (!gVarArr[i4].equals(gVarArr2[i4])) {
                    z2 = false;
                    break;
                } else {
                    i4++;
                }
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 17;
        for (int i2 = 0; i2 < this.f11450e; i2++) {
            i = (((i * 31) + this.f11448c[i2]) * 31) + this.f11449d[i2].hashCode();
        }
        return i;
    }
}
