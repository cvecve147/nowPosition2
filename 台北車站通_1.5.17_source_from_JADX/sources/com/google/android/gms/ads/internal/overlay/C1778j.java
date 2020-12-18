package com.google.android.gms.ads.internal.overlay;

import android.graphics.drawable.Drawable;

/* renamed from: com.google.android.gms.ads.internal.overlay.j */
final class C1778j implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ Drawable f5857a;

    /* renamed from: b */
    private final /* synthetic */ C1777i f5858b;

    C1778j(C1777i iVar, Drawable drawable) {
        this.f5858b = iVar;
        this.f5857a = drawable;
    }

    public final void run() {
        this.f5858b.f5856d.f5828b.getWindow().setBackgroundDrawable(this.f5857a);
    }
}
