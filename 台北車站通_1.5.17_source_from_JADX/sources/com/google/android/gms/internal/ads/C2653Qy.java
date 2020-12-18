package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Qy */
public final class C2653Qy extends C3291mg<C2934_y> {

    /* renamed from: e */
    private final Object f8193e = new Object();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C2767Uy f8194f;

    /* renamed from: g */
    private boolean f8195g;

    public C2653Qy(C2767Uy uy) {
        this.f8194f = uy;
    }

    /* renamed from: c */
    public final void mo8770c() {
        synchronized (this.f8193e) {
            if (!this.f8195g) {
                this.f8195g = true;
                mo9535a(new C2683Ry(this), new C3234kg());
                mo9535a(new C2711Sy(this), new C2740Ty(this));
            }
        }
    }
}
