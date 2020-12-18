package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.Uv */
final class C2764Uv implements C2187Av {

    /* renamed from: a */
    private final /* synthetic */ View f8416a;

    /* renamed from: b */
    private final /* synthetic */ C2708Sv f8417b;

    C2764Uv(C2708Sv sv, View view) {
        this.f8417b = sv;
        this.f8416a = view;
    }

    /* renamed from: a */
    public final void mo7851a() {
        if (this.f8417b.m11220a(C2708Sv.f8310a)) {
            this.f8417b.onClick(this.f8416a);
        }
    }

    /* renamed from: a */
    public final void mo7852a(MotionEvent motionEvent) {
        this.f8417b.onTouch((View) null, motionEvent);
    }
}
