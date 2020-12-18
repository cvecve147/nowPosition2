package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ws */
public final class C3589ws extends C2237Co<C3589ws> {

    /* renamed from: c */
    private String f10469c = null;

    /* renamed from: d */
    private C3561vs[] f10470d = C3561vs.m14295d();

    /* renamed from: e */
    private Integer f10471e = null;

    public C3589ws() {
        this.f6812b = null;
        this.f7295a = -1;
    }

    /* renamed from: b */
    private final C3589ws m14385b(C3641yo yoVar) {
        while (true) {
            int d = yoVar.mo10243d();
            if (d == 0) {
                return this;
            }
            if (d == 10) {
                this.f10469c = yoVar.mo10242c();
            } else if (d == 18) {
                int a = C2494Lo.m10548a(yoVar, 18);
                C3561vs[] vsVarArr = this.f10470d;
                int length = vsVarArr == null ? 0 : vsVarArr.length;
                C3561vs[] vsVarArr2 = new C3561vs[(a + length)];
                if (length != 0) {
                    System.arraycopy(this.f10470d, 0, vsVarArr2, 0, length);
                }
                while (length < vsVarArr2.length - 1) {
                    vsVarArr2[length] = new C3561vs();
                    yoVar.mo10236a((C2408Io) vsVarArr2[length]);
                    yoVar.mo10243d();
                    length++;
                }
                vsVarArr2[length] = new C3561vs();
                yoVar.mo10236a((C2408Io) vsVarArr2[length]);
                this.f10470d = vsVarArr2;
            } else if (d == 24) {
                int a2 = yoVar.mo10234a();
                try {
                    int h = yoVar.mo10249h();
                    C3503ts.m13941a(h);
                    this.f10471e = Integer.valueOf(h);
                } catch (IllegalArgumentException unused) {
                    yoVar.mo10246e(a2);
                    mo7936a(yoVar, d);
                }
            } else if (!super.mo7936a(yoVar, d)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final /* synthetic */ C2408Io mo7847a(C3641yo yoVar) {
        m14385b(yoVar);
        return this;
    }

    /* renamed from: a */
    public final void mo7848a(C2180Ao ao) {
        String str = this.f10469c;
        if (str != null) {
            ao.mo7834a(1, str);
        }
        C3561vs[] vsVarArr = this.f10470d;
        if (vsVarArr != null && vsVarArr.length > 0) {
            int i = 0;
            while (true) {
                C3561vs[] vsVarArr2 = this.f10470d;
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
        Integer num = this.f10471e;
        if (num != null) {
            ao.mo7837b(3, num.intValue());
        }
        super.mo7848a(ao);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo7849c() {
        int c = super.mo7849c();
        String str = this.f10469c;
        if (str != null) {
            c += C2180Ao.m9375b(1, str);
        }
        C3561vs[] vsVarArr = this.f10470d;
        if (vsVarArr != null && vsVarArr.length > 0) {
            int i = 0;
            while (true) {
                C3561vs[] vsVarArr2 = this.f10470d;
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
        Integer num = this.f10471e;
        return num != null ? c + C2180Ao.m9380c(3, num.intValue()) : c;
    }
}
