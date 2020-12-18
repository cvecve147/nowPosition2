package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ys */
public final class C3645ys extends C2237Co<C3645ys> {

    /* renamed from: c */
    private Integer f10606c = null;

    /* renamed from: d */
    private C2498Ls f10607d = null;

    /* renamed from: e */
    private C2498Ls f10608e = null;

    /* renamed from: f */
    private C2498Ls f10609f = null;

    /* renamed from: g */
    private C2498Ls[] f10610g = C2498Ls.m10558d();

    /* renamed from: h */
    private Integer f10611h = null;

    public C3645ys() {
        this.f6812b = null;
        this.f7295a = -1;
    }

    /* renamed from: a */
    public final /* synthetic */ C2408Io mo7847a(C3641yo yoVar) {
        C2498Ls ls;
        while (true) {
            int d = yoVar.mo10243d();
            if (d == 0) {
                return this;
            }
            if (d != 8) {
                if (d == 18) {
                    if (this.f10607d == null) {
                        this.f10607d = new C2498Ls();
                    }
                    ls = this.f10607d;
                } else if (d == 26) {
                    if (this.f10608e == null) {
                        this.f10608e = new C2498Ls();
                    }
                    ls = this.f10608e;
                } else if (d == 34) {
                    if (this.f10609f == null) {
                        this.f10609f = new C2498Ls();
                    }
                    ls = this.f10609f;
                } else if (d == 42) {
                    int a = C2494Lo.m10548a(yoVar, 42);
                    C2498Ls[] lsArr = this.f10610g;
                    int length = lsArr == null ? 0 : lsArr.length;
                    C2498Ls[] lsArr2 = new C2498Ls[(a + length)];
                    if (length != 0) {
                        System.arraycopy(this.f10610g, 0, lsArr2, 0, length);
                    }
                    while (length < lsArr2.length - 1) {
                        lsArr2[length] = new C2498Ls();
                        yoVar.mo10236a((C2408Io) lsArr2[length]);
                        yoVar.mo10243d();
                        length++;
                    }
                    lsArr2[length] = new C2498Ls();
                    yoVar.mo10236a((C2408Io) lsArr2[length]);
                    this.f10610g = lsArr2;
                } else if (d == 48) {
                    this.f10611h = Integer.valueOf(yoVar.mo10249h());
                } else if (!super.mo7936a(yoVar, d)) {
                    return this;
                }
                yoVar.mo10236a((C2408Io) ls);
            } else {
                this.f10606c = Integer.valueOf(yoVar.mo10249h());
            }
        }
    }

    /* renamed from: a */
    public final void mo7848a(C2180Ao ao) {
        Integer num = this.f10606c;
        if (num != null) {
            ao.mo7837b(1, num.intValue());
        }
        C2498Ls ls = this.f10607d;
        if (ls != null) {
            ao.mo7833a(2, (C2408Io) ls);
        }
        C2498Ls ls2 = this.f10608e;
        if (ls2 != null) {
            ao.mo7833a(3, (C2408Io) ls2);
        }
        C2498Ls ls3 = this.f10609f;
        if (ls3 != null) {
            ao.mo7833a(4, (C2408Io) ls3);
        }
        C2498Ls[] lsArr = this.f10610g;
        if (lsArr != null && lsArr.length > 0) {
            int i = 0;
            while (true) {
                C2498Ls[] lsArr2 = this.f10610g;
                if (i >= lsArr2.length) {
                    break;
                }
                C2498Ls ls4 = lsArr2[i];
                if (ls4 != null) {
                    ao.mo7833a(5, (C2408Io) ls4);
                }
                i++;
            }
        }
        Integer num2 = this.f10611h;
        if (num2 != null) {
            ao.mo7837b(6, num2.intValue());
        }
        super.mo7848a(ao);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo7849c() {
        int c = super.mo7849c();
        Integer num = this.f10606c;
        if (num != null) {
            c += C2180Ao.m9380c(1, num.intValue());
        }
        C2498Ls ls = this.f10607d;
        if (ls != null) {
            c += C2180Ao.m9374b(2, (C2408Io) ls);
        }
        C2498Ls ls2 = this.f10608e;
        if (ls2 != null) {
            c += C2180Ao.m9374b(3, (C2408Io) ls2);
        }
        C2498Ls ls3 = this.f10609f;
        if (ls3 != null) {
            c += C2180Ao.m9374b(4, (C2408Io) ls3);
        }
        C2498Ls[] lsArr = this.f10610g;
        if (lsArr != null && lsArr.length > 0) {
            int i = 0;
            while (true) {
                C2498Ls[] lsArr2 = this.f10610g;
                if (i >= lsArr2.length) {
                    break;
                }
                C2498Ls ls4 = lsArr2[i];
                if (ls4 != null) {
                    c += C2180Ao.m9374b(5, (C2408Io) ls4);
                }
                i++;
            }
        }
        Integer num2 = this.f10611h;
        return num2 != null ? c + C2180Ao.m9380c(6, num2.intValue()) : c;
    }
}
