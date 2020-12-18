package android.support.constraint.p005a;

import android.support.constraint.p005a.C0069h;

/* renamed from: android.support.constraint.a.b */
public class C0063b {

    /* renamed from: a */
    C0069h f355a = null;

    /* renamed from: b */
    float f356b = 0.0f;

    /* renamed from: c */
    boolean f357c = false;

    /* renamed from: d */
    final C0046a f358d;

    /* renamed from: e */
    boolean f359e = false;

    public C0063b(C0064c cVar) {
        this.f358d = new C0046a(this, cVar);
    }

    /* renamed from: a */
    public C0063b mo219a(float f, float f2, float f3, C0069h hVar, int i, C0069h hVar2, int i2, C0069h hVar3, int i3, C0069h hVar4, int i4) {
        if (f2 == 0.0f || f == f3) {
            this.f356b = (float) (((-i) - i2) + i3 + i4);
            this.f358d.mo110b(hVar, 1.0f);
            this.f358d.mo110b(hVar2, -1.0f);
            this.f358d.mo110b(hVar4, 1.0f);
            this.f358d.mo110b(hVar3, -1.0f);
        } else {
            float f4 = (f / f2) / (f3 / f2);
            this.f356b = ((float) ((-i) - i2)) + (((float) i3) * f4) + (((float) i4) * f4);
            this.f358d.mo110b(hVar, 1.0f);
            this.f358d.mo110b(hVar2, -1.0f);
            this.f358d.mo110b(hVar4, f4);
            this.f358d.mo110b(hVar3, -f4);
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0063b mo220a(C0069h hVar, int i) {
        this.f358d.mo110b(hVar, (float) i);
        return this;
    }

    /* renamed from: a */
    public C0063b mo221a(C0069h hVar, C0069h hVar2) {
        this.f358d.mo110b(hVar, 1.0f);
        this.f358d.mo110b(hVar2, -1.0f);
        return this;
    }

    /* renamed from: a */
    public C0063b mo222a(C0069h hVar, C0069h hVar2, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f356b = (float) i;
        }
        if (!z) {
            this.f358d.mo110b(hVar, -1.0f);
            this.f358d.mo110b(hVar2, 1.0f);
        } else {
            this.f358d.mo110b(hVar, 1.0f);
            this.f358d.mo110b(hVar2, -1.0f);
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0063b mo223a(C0069h hVar, C0069h hVar2, int i, float f, C0069h hVar3, C0069h hVar4, int i2) {
        float f2;
        if (hVar2 == hVar3) {
            this.f358d.mo110b(hVar, 1.0f);
            this.f358d.mo110b(hVar4, 1.0f);
            this.f358d.mo110b(hVar2, -2.0f);
            return this;
        }
        if (f == 0.5f) {
            this.f358d.mo110b(hVar, 1.0f);
            this.f358d.mo110b(hVar2, -1.0f);
            this.f358d.mo110b(hVar3, -1.0f);
            this.f358d.mo110b(hVar4, 1.0f);
            if (i > 0 || i2 > 0) {
                f2 = (float) ((-i) + i2);
            }
            return this;
        } else if (f <= 0.0f) {
            this.f358d.mo110b(hVar, -1.0f);
            this.f358d.mo110b(hVar2, 1.0f);
            f2 = (float) i;
        } else if (f >= 1.0f) {
            this.f358d.mo110b(hVar3, -1.0f);
            this.f358d.mo110b(hVar4, 1.0f);
            f2 = (float) i2;
        } else {
            float f3 = 1.0f - f;
            this.f358d.mo110b(hVar, f3 * 1.0f);
            this.f358d.mo110b(hVar2, f3 * -1.0f);
            this.f358d.mo110b(hVar3, -1.0f * f);
            this.f358d.mo110b(hVar4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                f2 = (((float) (-i)) * f3) + (((float) i2) * f);
            }
            return this;
        }
        this.f356b = f2;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0063b mo224a(C0069h hVar, C0069h hVar2, C0069h hVar3, float f) {
        this.f358d.mo110b(hVar, -1.0f);
        this.f358d.mo110b(hVar2, 1.0f - f);
        this.f358d.mo110b(hVar3, f);
        return this;
    }

    /* renamed from: a */
    public C0063b mo225a(C0069h hVar, C0069h hVar2, C0069h hVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f356b = (float) i;
        }
        if (!z) {
            this.f358d.mo110b(hVar, -1.0f);
            this.f358d.mo110b(hVar2, 1.0f);
            this.f358d.mo110b(hVar3, 1.0f);
        } else {
            this.f358d.mo110b(hVar, 1.0f);
            this.f358d.mo110b(hVar2, -1.0f);
            this.f358d.mo110b(hVar3, -1.0f);
        }
        return this;
    }

    /* renamed from: a */
    public C0063b mo226a(C0069h hVar, C0069h hVar2, C0069h hVar3, C0069h hVar4, float f) {
        this.f358d.mo110b(hVar, -1.0f);
        this.f358d.mo110b(hVar2, 1.0f);
        this.f358d.mo110b(hVar3, f);
        this.f358d.mo110b(hVar4, -f);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo227a() {
        float f = this.f356b;
        if (f < 0.0f) {
            this.f356b = f * -1.0f;
            this.f358d.mo109b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo228a(C0063b bVar) {
        this.f358d.mo103a(this, bVar);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo229a(C0069h hVar) {
        return this.f358d.mo106a(hVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0063b mo230b(C0069h hVar, int i) {
        this.f355a = hVar;
        float f = (float) i;
        hVar.f385e = f;
        this.f356b = f;
        this.f359e = true;
        return this;
    }

    /* renamed from: b */
    public C0063b mo231b(C0069h hVar, C0069h hVar2, C0069h hVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f356b = (float) i;
        }
        if (!z) {
            this.f358d.mo110b(hVar, -1.0f);
            this.f358d.mo110b(hVar2, 1.0f);
            this.f358d.mo110b(hVar3, -1.0f);
        } else {
            this.f358d.mo110b(hVar, 1.0f);
            this.f358d.mo110b(hVar2, -1.0f);
            this.f358d.mo110b(hVar3, 1.0f);
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo232b(C0069h hVar) {
        C0069h hVar2 = this.f355a;
        if (hVar2 != null) {
            this.f358d.mo110b(hVar2, -1.0f);
            this.f355a = null;
        }
        float c = this.f358d.mo111c(hVar) * -1.0f;
        this.f355a = hVar;
        if (c != 1.0f) {
            this.f356b /= c;
            this.f358d.mo101a(c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo233b() {
        C0069h hVar = this.f355a;
        return hVar != null && (hVar.f387g == C0069h.C0070a.UNRESTRICTED || this.f356b >= 0.0f);
    }

    /* renamed from: c */
    public C0063b mo234c(C0069h hVar, int i) {
        C0046a aVar;
        float f;
        if (i < 0) {
            this.f356b = (float) (i * -1);
            aVar = this.f358d;
            f = 1.0f;
        } else {
            this.f356b = (float) i;
            aVar = this.f358d;
            f = -1.0f;
        }
        aVar.mo110b(hVar, f);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo235c() {
        C0069h c = this.f358d.mo112c();
        if (c != null) {
            mo232b(c);
        }
        if (this.f358d.f203a == 0) {
            this.f359e = true;
        }
    }

    /* renamed from: d */
    public void mo236d() {
        this.f355a = null;
        this.f358d.mo100a();
        this.f356b = 0.0f;
        this.f359e = false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b3  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo237e() {
        /*
            r9 = this;
            android.support.constraint.a.h r0 = r9.f355a
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0014
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "0"
            r0.append(r1)
            goto L_0x0021
        L_0x0014:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            android.support.constraint.a.h r1 = r9.f355a
            r0.append(r1)
        L_0x0021:
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " = "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r1 = r9.f356b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0052
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r9.f356b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = r4
            goto L_0x0053
        L_0x0052:
            r1 = r3
        L_0x0053:
            android.support.constraint.a.a r5 = r9.f358d
            int r5 = r5.f203a
        L_0x0057:
            if (r3 >= r5) goto L_0x00ce
            android.support.constraint.a.a r6 = r9.f358d
            android.support.constraint.a.h r6 = r6.mo99a((int) r3)
            if (r6 != 0) goto L_0x0062
            goto L_0x00cb
        L_0x0062:
            android.support.constraint.a.a r7 = r9.f358d
            float r7 = r7.mo107b((int) r3)
            java.lang.String r6 = r6.toString()
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L_0x007f
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x00a7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "- "
            goto L_0x009f
        L_0x007f:
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x0095
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " + "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x00a7
        L_0x0095:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " - "
        L_0x009f:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r7 = r7 * r8
        L_0x00a7:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x00b3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            goto L_0x00c0
        L_0x00b3:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
        L_0x00c0:
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            r1 = r4
        L_0x00cb:
            int r3 = r3 + 1
            goto L_0x0057
        L_0x00ce:
            if (r1 != 0) goto L_0x00e1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0.0"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x00e1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.p005a.C0063b.mo237e():java.lang.String");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo238f() {
        this.f358d.mo102a(this);
    }

    public String toString() {
        return mo237e();
    }
}
