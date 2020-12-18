package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Eo */
public final class C2294Eo implements Cloneable {

    /* renamed from: a */
    private static final C2322Fo f6956a = new C2322Fo();

    /* renamed from: b */
    private boolean f6957b;

    /* renamed from: c */
    private int[] f6958c;

    /* renamed from: d */
    private C2322Fo[] f6959d;

    /* renamed from: e */
    private int f6960e;

    C2294Eo() {
        this(10);
    }

    private C2294Eo(int i) {
        this.f6957b = false;
        int c = m9720c(i);
        this.f6958c = new int[c];
        this.f6959d = new C2322Fo[c];
        this.f6960e = 0;
    }

    /* renamed from: c */
    private static int m9720c(int i) {
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
    private final int m9721d(int i) {
        int i2 = this.f6960e - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            int i5 = this.f6958c[i4];
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
    public final C2322Fo mo8044a(int i) {
        int d = m9721d(i);
        if (d < 0) {
            return null;
        }
        C2322Fo[] foArr = this.f6959d;
        if (foArr[d] == f6956a) {
            return null;
        }
        return foArr[d];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo8045a(int i, C2322Fo fo) {
        int d = m9721d(i);
        if (d >= 0) {
            this.f6959d[d] = fo;
            return;
        }
        int i2 = ~d;
        if (i2 < this.f6960e) {
            C2322Fo[] foArr = this.f6959d;
            if (foArr[i2] == f6956a) {
                this.f6958c[i2] = i;
                foArr[i2] = fo;
                return;
            }
        }
        int i3 = this.f6960e;
        if (i3 >= this.f6958c.length) {
            int c = m9720c(i3 + 1);
            int[] iArr = new int[c];
            C2322Fo[] foArr2 = new C2322Fo[c];
            int[] iArr2 = this.f6958c;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            C2322Fo[] foArr3 = this.f6959d;
            System.arraycopy(foArr3, 0, foArr2, 0, foArr3.length);
            this.f6958c = iArr;
            this.f6959d = foArr2;
        }
        int i4 = this.f6960e;
        if (i4 - i2 != 0) {
            int[] iArr3 = this.f6958c;
            int i5 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i5, i4 - i2);
            C2322Fo[] foArr4 = this.f6959d;
            System.arraycopy(foArr4, i2, foArr4, i5, this.f6960e - i2);
        }
        this.f6958c[i2] = i;
        this.f6959d[i2] = fo;
        this.f6960e++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C2322Fo mo8046b(int i) {
        return this.f6959d[i];
    }

    public final /* synthetic */ Object clone() {
        int i = this.f6960e;
        C2294Eo eo = new C2294Eo(i);
        System.arraycopy(this.f6958c, 0, eo.f6958c, 0, i);
        for (int i2 = 0; i2 < i; i2++) {
            C2322Fo[] foArr = this.f6959d;
            if (foArr[i2] != null) {
                eo.f6959d[i2] = (C2322Fo) foArr[i2].clone();
            }
        }
        eo.f6960e = i;
        return eo;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final int mo8048d() {
        return this.f6960e;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2294Eo)) {
            return false;
        }
        C2294Eo eo = (C2294Eo) obj;
        int i = this.f6960e;
        if (i != eo.f6960e) {
            return false;
        }
        int[] iArr = this.f6958c;
        int[] iArr2 = eo.f6958c;
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
            C2322Fo[] foArr = this.f6959d;
            C2322Fo[] foArr2 = eo.f6959d;
            int i3 = this.f6960e;
            int i4 = 0;
            while (true) {
                if (i4 >= i3) {
                    z2 = true;
                    break;
                } else if (!foArr[i4].equals(foArr2[i4])) {
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
        for (int i2 = 0; i2 < this.f6960e; i2++) {
            i = (((i * 31) + this.f6958c[i2]) * 31) + this.f6959d[i2].hashCode();
        }
        return i;
    }
}
