package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Zy */
final /* synthetic */ class C2906Zy implements Runnable {

    /* renamed from: a */
    private final C2851Xy f8727a;

    /* renamed from: b */
    private final C3452ry f8728b;

    C2906Zy(C2851Xy xy, C3452ry ryVar) {
        this.f8727a = xy;
        this.f8728b = ryVar;
    }

    public final void run() {
        C2851Xy xy = this.f8727a;
        C3452ry ryVar = this.f8728b;
        xy.f8633a.f8420f.mo8112a(ryVar);
        ryVar.destroy();
    }
}
