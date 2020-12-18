package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C1697X;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.C1779k;

/* renamed from: com.google.android.gms.internal.ads.LA */
final class C2477LA implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AdOverlayInfoParcel f7487a;

    /* renamed from: b */
    private final /* synthetic */ zzzv f7488b;

    C2477LA(zzzv zzzv, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f7488b = zzzv;
        this.f7487a = adOverlayInfoParcel;
    }

    public final void run() {
        C1697X.m7696c();
        C1779k.m8016a(this.f7488b.f10928a, this.f7487a, true);
    }
}
