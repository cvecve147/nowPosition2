package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.No */
public final class C2552No extends C2237Co<C2552No> {

    /* renamed from: c */
    public String f7661c = null;

    public C2552No() {
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
            if (d == 10) {
                this.f7661c = yoVar.mo10242c();
            } else if (!super.mo7936a(yoVar, d)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo7848a(C2180Ao ao) {
        String str = this.f7661c;
        if (str != null) {
            ao.mo7834a(1, str);
        }
        super.mo7848a(ao);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo7849c() {
        int c = super.mo7849c();
        String str = this.f7661c;
        return str != null ? c + C2180Ao.m9375b(1, str) : c;
    }
}
