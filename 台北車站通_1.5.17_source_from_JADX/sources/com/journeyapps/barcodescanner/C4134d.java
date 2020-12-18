package com.journeyapps.barcodescanner;

import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* renamed from: com.journeyapps.barcodescanner.d */
class C4134d implements TextureView.SurfaceTextureListener {

    /* renamed from: a */
    final /* synthetic */ C4140j f12275a;

    C4134d(C4140j jVar) {
        this.f12275a = jVar;
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        C4101C unused = this.f12275a.f12298q = new C4101C(i, i2);
        this.f12275a.m16531l();
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
