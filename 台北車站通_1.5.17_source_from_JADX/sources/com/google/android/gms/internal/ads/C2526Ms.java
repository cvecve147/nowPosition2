package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ms */
public final class C2526Ms extends C2237Co<C2526Ms> {

    /* renamed from: c */
    public Integer f7620c = null;

    /* renamed from: d */
    public Integer f7621d = null;

    /* renamed from: e */
    public Integer f7622e = null;

    public C2526Ms() {
        this.f6812b = null;
        this.f7295a = -1;
    }

    /* renamed from: a */
    public final /* synthetic */ C2408Io mo7847a(C3641yo yoVar) {
        while (true) {
            int d = yoVar.mo10243d();
            if (d == 0) {
                return this;
            }
            if (d == 8) {
                this.f7620c = Integer.valueOf(yoVar.mo10249h());
            } else if (d == 16) {
                this.f7621d = Integer.valueOf(yoVar.mo10249h());
            } else if (d == 24) {
                this.f7622e = Integer.valueOf(yoVar.mo10249h());
            } else if (!super.mo7936a(yoVar, d)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo7848a(C2180Ao ao) {
        Integer num = this.f7620c;
        if (num != null) {
            ao.mo7837b(1, num.intValue());
        }
        Integer num2 = this.f7621d;
        if (num2 != null) {
            ao.mo7837b(2, num2.intValue());
        }
        Integer num3 = this.f7622e;
        if (num3 != null) {
            ao.mo7837b(3, num3.intValue());
        }
        super.mo7848a(ao);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo7849c() {
        int c = super.mo7849c();
        Integer num = this.f7620c;
        if (num != null) {
            c += C2180Ao.m9380c(1, num.intValue());
        }
        Integer num2 = this.f7621d;
        if (num2 != null) {
            c += C2180Ao.m9380c(2, num2.intValue());
        }
        Integer num3 = this.f7622e;
        return num3 != null ? c + C2180Ao.m9380c(3, num3.intValue()) : c;
    }
}
