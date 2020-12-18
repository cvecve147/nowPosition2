package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.Rv */
final class C2680Rv implements C2187Av {

    /* renamed from: a */
    private final /* synthetic */ View f8224a;

    /* renamed from: b */
    private final /* synthetic */ C2650Qv f8225b;

    C2680Rv(C2650Qv qv, View view) {
        this.f8225b = qv;
        this.f8224a = view;
    }

    /* renamed from: a */
    public final void mo7851a() {
        this.f8225b.onClick(this.f8224a);
    }

    /* renamed from: a */
    public final void mo7852a(MotionEvent motionEvent) {
        this.f8225b.onTouch((View) null, motionEvent);
    }
}
