package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.zg */
final class C3662zg implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ int f10646a;

    /* renamed from: b */
    private final /* synthetic */ int f10647b;

    /* renamed from: c */
    private final /* synthetic */ C3462sg f10648c;

    C3662zg(C3462sg sgVar, int i, int i2) {
        this.f10648c = sgVar;
        this.f10646a = i;
        this.f10647b = i2;
    }

    public final void run() {
        if (this.f10648c.f10199r != null) {
            this.f10648c.f10199r.mo7982a(this.f10646a, this.f10647b);
        }
    }
}
