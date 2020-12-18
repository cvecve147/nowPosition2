package com.journeyapps.barcodescanner;

import android.util.Log;
import android.view.SurfaceHolder;

/* renamed from: com.journeyapps.barcodescanner.e */
class C4135e implements SurfaceHolder.Callback {

    /* renamed from: a */
    final /* synthetic */ C4140j f12276a;

    C4135e(C4140j jVar) {
        this.f12276a = jVar;
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        if (surfaceHolder == null) {
            Log.e(C4140j.f12281a, "*** WARNING *** surfaceChanged() gave us a null surface!");
            return;
        }
        C4101C unused = this.f12276a.f12298q = new C4101C(i2, i3);
        this.f12276a.m16531l();
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C4101C unused = this.f12276a.f12298q = null;
    }
}
