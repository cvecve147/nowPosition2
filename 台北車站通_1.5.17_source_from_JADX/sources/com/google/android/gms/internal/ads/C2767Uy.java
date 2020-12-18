package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.C2061y;

/* renamed from: com.google.android.gms.internal.ads.Uy */
public final class C2767Uy extends C3291mg<C3452ry> {

    /* renamed from: e */
    private final Object f8419e = new Object();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C2482Le<C3452ry> f8420f;

    /* renamed from: g */
    private boolean f8421g;

    /* renamed from: h */
    private int f8422h;

    public C2767Uy(C2482Le<C3452ry> le) {
        this.f8420f = le;
        this.f8421g = false;
        this.f8422h = 0;
    }

    /* renamed from: f */
    private final void m11386f() {
        synchronized (this.f8419e) {
            C2061y.m9077b(this.f8422h >= 0);
            if (!this.f8421g || this.f8422h != 0) {
                C2857Yd.m11615f("There are still references to the engine. Not destroying.");
            } else {
                C2857Yd.m11615f("No reference is left (including root). Cleaning up engine.");
                mo9535a(new C2851Xy(this), new C3234kg());
            }
        }
    }

    /* renamed from: c */
    public final C2653Qy mo8941c() {
        C2653Qy qy = new C2653Qy(this);
        synchronized (this.f8419e) {
            mo9535a(new C2796Vy(this, qy), new C2823Wy(this, qy));
            C2061y.m9077b(this.f8422h >= 0);
            this.f8422h++;
        }
        return qy;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo8942d() {
        synchronized (this.f8419e) {
            C2061y.m9077b(this.f8422h > 0);
            C2857Yd.m11615f("Releasing 1 reference for JS Engine");
            this.f8422h--;
            m11386f();
        }
    }

    /* renamed from: e */
    public final void mo8943e() {
        synchronized (this.f8419e) {
            C2061y.m9077b(this.f8422h >= 0);
            C2857Yd.m11615f("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.f8421g = true;
            m11386f();
        }
    }
}
