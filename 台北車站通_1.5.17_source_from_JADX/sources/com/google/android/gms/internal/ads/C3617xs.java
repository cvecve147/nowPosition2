package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.xs */
public final class C3617xs extends C2237Co<C3617xs> {

    /* renamed from: c */
    private String f10538c = null;

    /* renamed from: d */
    private C3561vs[] f10539d = C3561vs.m14295d();

    /* renamed from: e */
    private Integer f10540e = null;

    /* renamed from: f */
    private Integer f10541f = null;

    /* renamed from: g */
    private Integer f10542g = null;

    public C3617xs() {
        this.f6812b = null;
        this.f7295a = -1;
    }

    /* renamed from: b */
    private final C3617xs m14533b(C3641yo yoVar) {
        int i;
        while (true) {
            int d = yoVar.mo10243d();
            if (d == 0) {
                return this;
            }
            if (d == 10) {
                this.f10538c = yoVar.mo10242c();
            } else if (d == 18) {
                int a = C2494Lo.m10548a(yoVar, 18);
                C3561vs[] vsVarArr = this.f10539d;
                int length = vsVarArr == null ? 0 : vsVarArr.length;
                C3561vs[] vsVarArr2 = new C3561vs[(a + length)];
                if (length != 0) {
                    System.arraycopy(this.f10539d, 0, vsVarArr2, 0, length);
                }
                while (length < vsVarArr2.length - 1) {
                    vsVarArr2[length] = new C3561vs();
                    yoVar.mo10236a((C2408Io) vsVarArr2[length]);
                    yoVar.mo10243d();
                    length++;
                }
                vsVarArr2[length] = new C3561vs();
                yoVar.mo10236a((C2408Io) vsVarArr2[length]);
                this.f10539d = vsVarArr2;
            } else if (d == 24) {
                i = yoVar.mo10234a();
                int h = yoVar.mo10249h();
                C3503ts.m13941a(h);
                this.f10540e = Integer.valueOf(h);
            } else if (d == 32) {
                i = yoVar.mo10234a();
                int h2 = yoVar.mo10249h();
                C3503ts.m13941a(h2);
                this.f10541f = Integer.valueOf(h2);
            } else if (d == 40) {
                i = yoVar.mo10234a();
                try {
                    int h3 = yoVar.mo10249h();
                    C3503ts.m13941a(h3);
                    this.f10542g = Integer.valueOf(h3);
                } catch (IllegalArgumentException unused) {
                    yoVar.mo10246e(i);
                    mo7936a(yoVar, d);
                }
            } else if (!super.mo7936a(yoVar, d)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final /* synthetic */ C2408Io mo7847a(C3641yo yoVar) {
        m14533b(yoVar);
        return this;
    }

    /* renamed from: a */
    public final void mo7848a(C2180Ao ao) {
        String str = this.f10538c;
        if (str != null) {
            ao.mo7834a(1, str);
        }
        C3561vs[] vsVarArr = this.f10539d;
        if (vsVarArr != null && vsVarArr.length > 0) {
            int i = 0;
            while (true) {
                C3561vs[] vsVarArr2 = this.f10539d;
                if (i >= vsVarArr2.length) {
                    break;
                }
                C3561vs vsVar = vsVarArr2[i];
                if (vsVar != null) {
                    ao.mo7833a(2, (C2408Io) vsVar);
                }
                i++;
            }
        }
        Integer num = this.f10540e;
        if (num != null) {
            ao.mo7837b(3, num.intValue());
        }
        Integer num2 = this.f10541f;
        if (num2 != null) {
            ao.mo7837b(4, num2.intValue());
        }
        Integer num3 = this.f10542g;
        if (num3 != null) {
            ao.mo7837b(5, num3.intValue());
        }
        super.mo7848a(ao);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo7849c() {
        int c = super.mo7849c();
        String str = this.f10538c;
        if (str != null) {
            c += C2180Ao.m9375b(1, str);
        }
        C3561vs[] vsVarArr = this.f10539d;
        if (vsVarArr != null && vsVarArr.length > 0) {
            int i = 0;
            while (true) {
                C3561vs[] vsVarArr2 = this.f10539d;
                if (i >= vsVarArr2.length) {
                    break;
                }
                C3561vs vsVar = vsVarArr2[i];
                if (vsVar != null) {
                    c += C2180Ao.m9374b(2, (C2408Io) vsVar);
                }
                i++;
            }
        }
        Integer num = this.f10540e;
        if (num != null) {
            c += C2180Ao.m9380c(3, num.intValue());
        }
        Integer num2 = this.f10541f;
        if (num2 != null) {
            c += C2180Ao.m9380c(4, num2.intValue());
        }
        Integer num3 = this.f10542g;
        return num3 != null ? c + C2180Ao.m9380c(5, num3.intValue()) : c;
    }
}
