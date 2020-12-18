package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.C1779k;

/* renamed from: com.google.android.gms.ads.internal.q */
final class C1795q implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AdOverlayInfoParcel f5881a;

    /* renamed from: b */
    private final /* synthetic */ C1793p f5882b;

    C1795q(C1793p pVar, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f5882b = pVar;
        this.f5881a = adOverlayInfoParcel;
    }

    public final void run() {
        C1697X.m7696c();
        C1779k.m8016a(this.f5882b.f5879e.f5648f.f5616c, this.f5881a, true);
    }
}
