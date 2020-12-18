package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2577Om;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.eo */
public final class C3067eo {

    /* renamed from: a */
    private static final C3067eo f9110a = new C3067eo(0, new int[0], new Object[0], false);

    /* renamed from: b */
    private int f9111b;

    /* renamed from: c */
    private int[] f9112c;

    /* renamed from: d */
    private Object[] f9113d;

    /* renamed from: e */
    private int f9114e;

    /* renamed from: f */
    private boolean f9115f;

    private C3067eo() {
        this(0, new int[8], new Object[8], true);
    }

    private C3067eo(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f9114e = -1;
        this.f9111b = i;
        this.f9112c = iArr;
        this.f9113d = objArr;
        this.f9115f = z;
    }

    /* renamed from: a */
    static C3067eo m12289a(C3067eo eoVar, C3067eo eoVar2) {
        int i = eoVar.f9111b + eoVar2.f9111b;
        int[] copyOf = Arrays.copyOf(eoVar.f9112c, i);
        System.arraycopy(eoVar2.f9112c, 0, copyOf, eoVar.f9111b, eoVar2.f9111b);
        Object[] copyOf2 = Arrays.copyOf(eoVar.f9113d, i);
        System.arraycopy(eoVar2.f9113d, 0, copyOf2, eoVar.f9111b, eoVar2.f9111b);
        return new C3067eo(i, copyOf, copyOf2, true);
    }

    /* renamed from: a */
    private static void m12290a(int i, Object obj, C3613xo xoVar) {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            xoVar.mo10190d(i2, ((Long) obj).longValue());
        } else if (i3 == 1) {
            xoVar.mo10187c(i2, ((Long) obj).longValue());
        } else if (i3 == 2) {
            xoVar.mo10171a(i2, (C3150hm) obj);
        } else if (i3 != 3) {
            if (i3 == 5) {
                xoVar.mo10192e(i2, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(C2755Um.m11352f());
        } else if (xoVar.mo10165a() == C2577Om.C2582e.f8058l) {
            xoVar.mo10179b(i2);
            ((C3067eo) obj).mo9403b(xoVar);
            xoVar.mo10166a(i2);
        } else {
            xoVar.mo10166a(i2);
            ((C3067eo) obj).mo9403b(xoVar);
            xoVar.mo10179b(i2);
        }
    }

    /* renamed from: c */
    public static C3067eo m12291c() {
        return f9110a;
    }

    /* renamed from: d */
    static C3067eo m12292d() {
        return new C3067eo();
    }

    /* renamed from: a */
    public final void mo9398a() {
        this.f9115f = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo9399a(int i, Object obj) {
        if (this.f9115f) {
            int i2 = this.f9111b;
            if (i2 == this.f9112c.length) {
                int i3 = this.f9111b + (i2 < 4 ? 8 : i2 >> 1);
                this.f9112c = Arrays.copyOf(this.f9112c, i3);
                this.f9113d = Arrays.copyOf(this.f9113d, i3);
            }
            int[] iArr = this.f9112c;
            int i4 = this.f9111b;
            iArr[i4] = i;
            this.f9113d[i4] = obj;
            this.f9111b = i4 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo9400a(C3613xo xoVar) {
        if (xoVar.mo10165a() == C2577Om.C2582e.f8059m) {
            for (int i = this.f9111b - 1; i >= 0; i--) {
                xoVar.mo10172a(this.f9112c[i] >>> 3, this.f9113d[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.f9111b; i2++) {
            xoVar.mo10172a(this.f9112c[i2] >>> 3, this.f9113d[i2]);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo9401a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f9111b; i2++) {
            C3584wn.m14382a(sb, i, String.valueOf(this.f9112c[i2] >>> 3), this.f9113d[i2]);
        }
    }

    /* renamed from: b */
    public final int mo9402b() {
        int i;
        int i2 = this.f9114e;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f9111b; i4++) {
            int i5 = this.f9112c[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 == 0) {
                i = C3525um.m14098e(i6, ((Long) this.f9113d[i4]).longValue());
            } else if (i7 == 1) {
                i = C3525um.m14106g(i6, ((Long) this.f9113d[i4]).longValue());
            } else if (i7 == 2) {
                i = C3525um.m14091c(i6, (C3150hm) this.f9113d[i4]);
            } else if (i7 == 3) {
                i = (C3525um.m14097e(i6) << 1) + ((C3067eo) this.f9113d[i4]).mo9402b();
            } else if (i7 == 5) {
                i = C3525um.m14113i(i6, ((Integer) this.f9113d[i4]).intValue());
            } else {
                throw new IllegalStateException(C2755Um.m11352f());
            }
            i3 += i;
        }
        this.f9114e = i3;
        return i3;
    }

    /* renamed from: b */
    public final void mo9403b(C3613xo xoVar) {
        if (this.f9111b != 0) {
            if (xoVar.mo10165a() == C2577Om.C2582e.f8058l) {
                for (int i = 0; i < this.f9111b; i++) {
                    m12290a(this.f9112c[i], this.f9113d[i], xoVar);
                }
                return;
            }
            for (int i2 = this.f9111b - 1; i2 >= 0; i2--) {
                m12290a(this.f9112c[i2], this.f9113d[i2], xoVar);
            }
        }
    }

    /* renamed from: e */
    public final int mo9404e() {
        int i = this.f9114e;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f9111b; i3++) {
            i2 += C3525um.m14095d(this.f9112c[i3] >>> 3, (C3150hm) this.f9113d[i3]);
        }
        this.f9114e = i2;
        return i2;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C3067eo)) {
            return false;
        }
        C3067eo eoVar = (C3067eo) obj;
        int i = this.f9111b;
        if (i == eoVar.f9111b) {
            int[] iArr = this.f9112c;
            int[] iArr2 = eoVar.f9112c;
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
                Object[] objArr = this.f9113d;
                Object[] objArr2 = eoVar.f9113d;
                int i3 = this.f9111b;
                int i4 = 0;
                while (true) {
                    if (i4 >= i3) {
                        z2 = true;
                        break;
                    } else if (!objArr[i4].equals(objArr2[i4])) {
                        z2 = false;
                        break;
                    } else {
                        i4++;
                    }
                }
                return z2;
            }
        }
    }

    public final int hashCode() {
        int i = this.f9111b;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f9112c;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f9113d;
        int i7 = this.f9111b;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }
}
