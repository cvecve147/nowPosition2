package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.internal.C1697X;
import com.google.android.gms.internal.ads.C2478La;
import com.google.android.gms.internal.ads.C2845Xs;
import com.google.android.gms.internal.ads.C3454s;
import p101d.p129g.p131b.p132a.p134b.C5464b;

@C2478La
/* renamed from: com.google.android.gms.ads.internal.overlay.r */
public final class C1786r extends C3454s {

    /* renamed from: a */
    private AdOverlayInfoParcel f5866a;

    /* renamed from: b */
    private Activity f5867b;

    /* renamed from: c */
    private boolean f5868c = false;

    /* renamed from: d */
    private boolean f5869d = false;

    public C1786r(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f5866a = adOverlayInfoParcel;
        this.f5867b = activity;
    }

    /* renamed from: bc */
    private final synchronized void m8021bc() {
        if (!this.f5869d) {
            if (this.f5866a.f5813c != null) {
                this.f5866a.f5813c.mo6897yb();
            }
            this.f5869d = true;
        }
    }

    /* renamed from: Aa */
    public final boolean mo6988Aa() {
        return false;
    }

    /* renamed from: Ma */
    public final void mo6989Ma() {
    }

    /* renamed from: Ua */
    public final void mo6990Ua() {
    }

    /* renamed from: e */
    public final void mo6997e(Bundle bundle) {
        C1781m mVar;
        boolean z = false;
        if (bundle != null) {
            z = bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f5866a;
        if (adOverlayInfoParcel != null && !z) {
            if (bundle == null) {
                C2845Xs xs = adOverlayInfoParcel.f5812b;
                if (xs != null) {
                    xs.mo6490f();
                }
                if (!(this.f5867b.getIntent() == null || !this.f5867b.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) || (mVar = this.f5866a.f5813c) == null)) {
                    mVar.mo6896xb();
                }
            }
            C1697X.m7695b();
            Activity activity = this.f5867b;
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.f5866a;
            if (!C1769a.m7989a((Context) activity, adOverlayInfoParcel2.f5811a, adOverlayInfoParcel2.f5819i)) {
                this.f5867b.finish();
                return;
            }
            return;
        }
        this.f5867b.finish();
    }

    /* renamed from: fa */
    public final void mo6999fa() {
    }

    /* renamed from: h */
    public final void mo7002h(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f5868c);
    }

    /* renamed from: h */
    public final void mo7003h(C5464b bVar) {
    }

    /* renamed from: k */
    public final void mo7005k() {
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
    }

    public final void onDestroy() {
        if (this.f5867b.isFinishing()) {
            m8021bc();
        }
    }

    public final void onPause() {
        C1781m mVar = this.f5866a.f5813c;
        if (mVar != null) {
            mVar.onPause();
        }
        if (this.f5867b.isFinishing()) {
            m8021bc();
        }
    }

    public final void onResume() {
        if (this.f5868c) {
            this.f5867b.finish();
            return;
        }
        this.f5868c = true;
        C1781m mVar = this.f5866a.f5813c;
        if (mVar != null) {
            mVar.onResume();
        }
    }

    /* renamed from: p */
    public final void mo7010p() {
        if (this.f5867b.isFinishing()) {
            m8021bc();
        }
    }
}
