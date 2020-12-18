package android.support.constraint.p005a;

import java.util.Arrays;

/* renamed from: android.support.constraint.a.a */
public class C0046a {

    /* renamed from: a */
    int f203a = 0;

    /* renamed from: b */
    private final C0063b f204b;

    /* renamed from: c */
    private final C0064c f205c;

    /* renamed from: d */
    private int f206d = 8;

    /* renamed from: e */
    private C0069h f207e = null;

    /* renamed from: f */
    private int[] f208f;

    /* renamed from: g */
    private int[] f209g;

    /* renamed from: h */
    private float[] f210h;

    /* renamed from: i */
    private int f211i;

    /* renamed from: j */
    private int f212j;

    /* renamed from: k */
    private boolean f213k;

    C0046a(C0063b bVar, C0064c cVar) {
        int i = this.f206d;
        this.f208f = new int[i];
        this.f209g = new int[i];
        this.f210h = new float[i];
        this.f211i = -1;
        this.f212j = -1;
        this.f213k = false;
        this.f204b = bVar;
        this.f205c = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C0069h mo99a(int i) {
        int i2 = this.f211i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f203a) {
            if (i3 == i) {
                return this.f205c.f362c[this.f208f[i2]];
            }
            i2 = this.f209g[i2];
            i3++;
        }
        return null;
    }

    /* renamed from: a */
    public final void mo100a() {
        this.f211i = -1;
        this.f212j = -1;
        this.f213k = false;
        this.f203a = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo101a(float f) {
        int i = this.f211i;
        int i2 = 0;
        while (i != -1 && i2 < this.f203a) {
            float[] fArr = this.f210h;
            fArr[i] = fArr[i] / f;
            i = this.f209g[i];
            i2++;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo102a(C0063b bVar) {
        int i = this.f211i;
        int i2 = 0;
        while (i != -1 && i2 < this.f203a) {
            this.f205c.f362c[this.f208f[i]].mo263a(bVar);
            i = this.f209g[i];
            i2++;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo103a(C0063b bVar, C0063b bVar2) {
        int i = this.f211i;
        while (true) {
            int i2 = 0;
            while (i != -1 && i2 < this.f203a) {
                int i3 = this.f208f[i];
                C0069h hVar = bVar2.f355a;
                if (i3 == hVar.f382b) {
                    float f = this.f210h[i];
                    mo111c(hVar);
                    C0046a aVar = bVar2.f358d;
                    int i4 = aVar.f211i;
                    int i5 = 0;
                    while (i4 != -1 && i5 < aVar.f203a) {
                        mo105a(this.f205c.f362c[aVar.f208f[i4]], aVar.f210h[i4] * f);
                        i4 = aVar.f209g[i4];
                        i5++;
                    }
                    bVar.f356b += bVar2.f356b * f;
                    bVar2.f355a.mo266b(bVar);
                    i = this.f211i;
                } else {
                    i = this.f209g[i];
                    i2++;
                }
            }
            return;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo104a(C0063b bVar, C0063b[] bVarArr) {
        int i = this.f211i;
        while (true) {
            int i2 = 0;
            while (i != -1 && i2 < this.f203a) {
                C0069h hVar = this.f205c.f362c[this.f208f[i]];
                if (hVar.f383c != -1) {
                    float f = this.f210h[i];
                    mo111c(hVar);
                    C0063b bVar2 = bVarArr[hVar.f383c];
                    if (!bVar2.f359e) {
                        C0046a aVar = bVar2.f358d;
                        int i3 = aVar.f211i;
                        int i4 = 0;
                        while (i3 != -1 && i4 < aVar.f203a) {
                            mo105a(this.f205c.f362c[aVar.f208f[i3]], aVar.f210h[i3] * f);
                            i3 = aVar.f209g[i3];
                            i4++;
                        }
                    }
                    bVar.f356b += bVar2.f356b * f;
                    bVar2.f355a.mo266b(bVar);
                    i = this.f211i;
                } else {
                    i = this.f209g[i];
                    i2++;
                }
            }
            return;
        }
    }

    /* renamed from: a */
    public final void mo105a(C0069h hVar, float f) {
        if (f != 0.0f) {
            int i = this.f211i;
            if (i == -1) {
                this.f211i = 0;
                float[] fArr = this.f210h;
                int i2 = this.f211i;
                fArr[i2] = f;
                this.f208f[i2] = hVar.f382b;
                this.f209g[i2] = -1;
                this.f203a++;
                if (!this.f213k) {
                    this.f212j++;
                    return;
                }
                return;
            }
            int i3 = 0;
            int i4 = -1;
            while (i != -1 && i3 < this.f203a) {
                int[] iArr = this.f208f;
                int i5 = iArr[i];
                int i6 = hVar.f382b;
                if (i5 == i6) {
                    float[] fArr2 = this.f210h;
                    fArr2[i] = fArr2[i] + f;
                    if (fArr2[i] == 0.0f) {
                        if (i == this.f211i) {
                            this.f211i = this.f209g[i];
                        } else {
                            int[] iArr2 = this.f209g;
                            iArr2[i4] = iArr2[i];
                        }
                        this.f205c.f362c[i5].mo266b(this.f204b);
                        if (this.f213k) {
                            this.f212j = i;
                        }
                        this.f203a--;
                        return;
                    }
                    return;
                }
                if (iArr[i] < i6) {
                    i4 = i;
                }
                i = this.f209g[i];
                i3++;
            }
            int i7 = this.f212j;
            int i8 = i7 + 1;
            if (this.f213k) {
                int[] iArr3 = this.f208f;
                if (iArr3[i7] != -1) {
                    i7 = iArr3.length;
                }
            } else {
                i7 = i8;
            }
            int[] iArr4 = this.f208f;
            if (i7 >= iArr4.length && this.f203a < iArr4.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr5 = this.f208f;
                    if (i9 >= iArr5.length) {
                        break;
                    } else if (iArr5[i9] == -1) {
                        i7 = i9;
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            int[] iArr6 = this.f208f;
            if (i7 >= iArr6.length) {
                i7 = iArr6.length;
                this.f206d *= 2;
                this.f213k = false;
                this.f212j = i7 - 1;
                this.f210h = Arrays.copyOf(this.f210h, this.f206d);
                this.f208f = Arrays.copyOf(this.f208f, this.f206d);
                this.f209g = Arrays.copyOf(this.f209g, this.f206d);
            }
            this.f208f[i7] = hVar.f382b;
            this.f210h[i7] = f;
            if (i4 != -1) {
                int[] iArr7 = this.f209g;
                iArr7[i7] = iArr7[i4];
                iArr7[i4] = i7;
            } else {
                this.f209g[i7] = this.f211i;
                this.f211i = i7;
            }
            this.f203a++;
            if (!this.f213k) {
                this.f212j++;
            }
            int i10 = this.f212j;
            int[] iArr8 = this.f208f;
            if (i10 >= iArr8.length) {
                this.f213k = true;
                this.f212j = iArr8.length - 1;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo106a(C0069h hVar) {
        int i = this.f211i;
        if (i == -1) {
            return false;
        }
        int i2 = 0;
        while (i != -1 && i2 < this.f203a) {
            if (this.f208f[i] == hVar.f382b) {
                return true;
            }
            i = this.f209g[i];
            i2++;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final float mo107b(int i) {
        int i2 = this.f211i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f203a) {
            if (i3 == i) {
                return this.f210h[i2];
            }
            i2 = this.f209g[i2];
            i3++;
        }
        return 0.0f;
    }

    /* renamed from: b */
    public final float mo108b(C0069h hVar) {
        int i = this.f211i;
        int i2 = 0;
        while (i != -1 && i2 < this.f203a) {
            if (this.f208f[i] == hVar.f382b) {
                return this.f210h[i];
            }
            i = this.f209g[i];
            i2++;
        }
        return 0.0f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo109b() {
        int i = this.f211i;
        int i2 = 0;
        while (i != -1 && i2 < this.f203a) {
            float[] fArr = this.f210h;
            fArr[i] = fArr[i] * -1.0f;
            i = this.f209g[i];
            i2++;
        }
    }

    /* renamed from: b */
    public final void mo110b(C0069h hVar, float f) {
        if (f == 0.0f) {
            mo111c(hVar);
            return;
        }
        int i = this.f211i;
        if (i == -1) {
            this.f211i = 0;
            float[] fArr = this.f210h;
            int i2 = this.f211i;
            fArr[i2] = f;
            this.f208f[i2] = hVar.f382b;
            this.f209g[i2] = -1;
            this.f203a++;
            if (!this.f213k) {
                this.f212j++;
                return;
            }
            return;
        }
        int i3 = 0;
        int i4 = -1;
        while (i != -1 && i3 < this.f203a) {
            int[] iArr = this.f208f;
            int i5 = iArr[i];
            int i6 = hVar.f382b;
            if (i5 == i6) {
                this.f210h[i] = f;
                return;
            }
            if (iArr[i] < i6) {
                i4 = i;
            }
            i = this.f209g[i];
            i3++;
        }
        int i7 = this.f212j;
        int i8 = i7 + 1;
        if (this.f213k) {
            int[] iArr2 = this.f208f;
            if (iArr2[i7] != -1) {
                i7 = iArr2.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr3 = this.f208f;
        if (i7 >= iArr3.length && this.f203a < iArr3.length) {
            int i9 = 0;
            while (true) {
                int[] iArr4 = this.f208f;
                if (i9 >= iArr4.length) {
                    break;
                } else if (iArr4[i9] == -1) {
                    i7 = i9;
                    break;
                } else {
                    i9++;
                }
            }
        }
        int[] iArr5 = this.f208f;
        if (i7 >= iArr5.length) {
            i7 = iArr5.length;
            this.f206d *= 2;
            this.f213k = false;
            this.f212j = i7 - 1;
            this.f210h = Arrays.copyOf(this.f210h, this.f206d);
            this.f208f = Arrays.copyOf(this.f208f, this.f206d);
            this.f209g = Arrays.copyOf(this.f209g, this.f206d);
        }
        this.f208f[i7] = hVar.f382b;
        this.f210h[i7] = f;
        if (i4 != -1) {
            int[] iArr6 = this.f209g;
            iArr6[i7] = iArr6[i4];
            iArr6[i4] = i7;
        } else {
            this.f209g[i7] = this.f211i;
            this.f211i = i7;
        }
        this.f203a++;
        if (!this.f213k) {
            this.f212j++;
        }
        if (this.f203a >= this.f208f.length) {
            this.f213k = true;
        }
    }

    /* renamed from: c */
    public final float mo111c(C0069h hVar) {
        if (this.f207e == hVar) {
            this.f207e = null;
        }
        int i = this.f211i;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f203a) {
            int i4 = this.f208f[i];
            if (i4 == hVar.f382b) {
                if (i == this.f211i) {
                    this.f211i = this.f209g[i];
                } else {
                    int[] iArr = this.f209g;
                    iArr[i3] = iArr[i];
                }
                this.f205c.f362c[i4].mo266b(this.f204b);
                this.f203a--;
                this.f208f[i] = -1;
                if (this.f213k) {
                    this.f212j = i;
                }
                return this.f210h[i];
            }
            i2++;
            i3 = i;
            i = this.f209g[i];
        }
        return 0.0f;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0053 A[SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.support.constraint.p005a.C0069h mo112c() {
        /*
            r9 = this;
            int r0 = r9.f211i
            r1 = 0
            r2 = 0
            r3 = r1
        L_0x0005:
            r4 = -1
            if (r0 == r4) goto L_0x005a
            int r4 = r9.f203a
            if (r2 >= r4) goto L_0x005a
            float[] r4 = r9.f210h
            r5 = r4[r0]
            r6 = 981668463(0x3a83126f, float:0.001)
            r7 = 0
            int r8 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r8 >= 0) goto L_0x0022
            r6 = -1165815185(0xffffffffba83126f, float:-0.001)
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x0029
            r4[r0] = r7
            goto L_0x0028
        L_0x0022:
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 >= 0) goto L_0x0029
            r4[r0] = r7
        L_0x0028:
            r5 = r7
        L_0x0029:
            int r4 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x0053
            android.support.constraint.a.c r4 = r9.f205c
            android.support.constraint.a.h[] r4 = r4.f362c
            int[] r6 = r9.f208f
            r6 = r6[r0]
            r4 = r4[r6]
            android.support.constraint.a.h$a r6 = r4.f387g
            android.support.constraint.a.h$a r8 = android.support.constraint.p005a.C0069h.C0070a.UNRESTRICTED
            if (r6 != r8) goto L_0x0046
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 >= 0) goto L_0x0042
            return r4
        L_0x0042:
            if (r3 != 0) goto L_0x0053
            r3 = r4
            goto L_0x0053
        L_0x0046:
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 >= 0) goto L_0x0053
            if (r1 == 0) goto L_0x0052
            int r5 = r4.f384d
            int r6 = r1.f384d
            if (r5 >= r6) goto L_0x0053
        L_0x0052:
            r1 = r4
        L_0x0053:
            int[] r4 = r9.f209g
            r0 = r4[r0]
            int r2 = r2 + 1
            goto L_0x0005
        L_0x005a:
            if (r3 == 0) goto L_0x005d
            return r3
        L_0x005d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.p005a.C0046a.mo112c():android.support.constraint.a.h");
    }

    public String toString() {
        int i = this.f211i;
        String str = "";
        int i2 = 0;
        while (i != -1 && i2 < this.f203a) {
            str = ((str + " -> ") + this.f210h[i] + " : ") + this.f205c.f362c[this.f208f[i]];
            i = this.f209g[i];
            i2++;
        }
        return str;
    }
}
