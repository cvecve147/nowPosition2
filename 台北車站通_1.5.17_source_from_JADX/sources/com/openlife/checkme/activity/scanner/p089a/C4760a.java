package com.openlife.checkme.activity.scanner.p089a;

import android.view.SurfaceHolder;

/* renamed from: com.openlife.checkme.activity.scanner.a.a */
class C4760a implements SurfaceHolder.Callback {

    /* renamed from: a */
    final /* synthetic */ C4763d f13735a;

    C4760a(C4763d dVar) {
        this.f13735a = dVar;
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        boolean unused = this.f13735a.f13750l = true;
        C4763d dVar = this.f13735a;
        dVar.m18790a(dVar.f13744f, this.f13735a.f13746h, this.f13735a.f13745g);
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        boolean unused = this.f13735a.f13750l = false;
        this.f13735a.mo13200d();
        surfaceHolder.removeCallback(this);
    }
}
