package com.openlife.checkme.activity.scanner.p089a;

import android.view.SurfaceView;
import android.view.ViewTreeObserver;

/* renamed from: com.openlife.checkme.activity.scanner.a.b */
class C4761b implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ SurfaceView f13736a;

    /* renamed from: b */
    final /* synthetic */ C4763d f13737b;

    C4761b(C4763d dVar, SurfaceView surfaceView) {
        this.f13737b = dVar;
        this.f13736a = surfaceView;
    }

    public void onGlobalLayout() {
        this.f13737b.m18802e();
        this.f13737b.mo13195a();
        C4763d.m18796b(this.f13736a, this);
    }
}
