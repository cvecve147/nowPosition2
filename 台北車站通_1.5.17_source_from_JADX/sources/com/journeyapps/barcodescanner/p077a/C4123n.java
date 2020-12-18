package com.journeyapps.barcodescanner.p077a;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Build;
import android.view.SurfaceHolder;

/* renamed from: com.journeyapps.barcodescanner.a.n */
public class C4123n {

    /* renamed from: a */
    private SurfaceHolder f12255a;

    /* renamed from: b */
    private SurfaceTexture f12256b;

    public C4123n(SurfaceTexture surfaceTexture) {
        if (surfaceTexture != null) {
            this.f12256b = surfaceTexture;
            return;
        }
        throw new IllegalArgumentException("surfaceTexture may not be null");
    }

    public C4123n(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != null) {
            this.f12255a = surfaceHolder;
            return;
        }
        throw new IllegalArgumentException("surfaceHolder may not be null");
    }

    /* renamed from: a */
    public void mo11655a(Camera camera) {
        SurfaceHolder surfaceHolder = this.f12255a;
        if (surfaceHolder != null) {
            camera.setPreviewDisplay(surfaceHolder);
        } else if (Build.VERSION.SDK_INT >= 11) {
            camera.setPreviewTexture(this.f12256b);
        } else {
            throw new IllegalStateException("SurfaceTexture not supported.");
        }
    }
}
