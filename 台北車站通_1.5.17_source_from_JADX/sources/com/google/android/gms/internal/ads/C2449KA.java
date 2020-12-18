package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.C1781m;

/* renamed from: com.google.android.gms.internal.ads.KA */
final class C2449KA implements C1781m {

    /* renamed from: a */
    private final /* synthetic */ zzzv f7412a;

    C2449KA(zzzv zzzv) {
        this.f7412a = zzzv;
    }

    public final void onPause() {
        C2227Cf.m9532b("AdMobCustomTabsAdapter overlay is paused.");
    }

    public final void onResume() {
        C2227Cf.m9532b("AdMobCustomTabsAdapter overlay is resumed.");
    }

    /* renamed from: xb */
    public final void mo6896xb() {
        C2227Cf.m9532b("Opening AdMobCustomTabsAdapter overlay.");
        this.f7412a.f10929b.mo7089e(this.f7412a);
    }

    /* renamed from: yb */
    public final void mo6897yb() {
        C2227Cf.m9532b("AdMobCustomTabsAdapter overlay is closed.");
        this.f7412a.f10929b.mo7088d(this.f7412a);
    }
}
