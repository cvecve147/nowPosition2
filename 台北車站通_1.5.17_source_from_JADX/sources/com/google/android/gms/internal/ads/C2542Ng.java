package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import java.util.concurrent.TimeUnit;

@TargetApi(14)
@C2478La
/* renamed from: com.google.android.gms.internal.ads.Ng */
public final class C2542Ng {

    /* renamed from: a */
    private final long f7648a = TimeUnit.MILLISECONDS.toNanos(((Long) C3390pt.m13458f().mo8515a(C2558Nu.f7746H)).longValue());

    /* renamed from: b */
    private long f7649b;

    /* renamed from: c */
    private boolean f7650c = true;

    C2542Ng() {
    }

    /* renamed from: a */
    public final void mo8565a() {
        this.f7650c = true;
    }

    /* renamed from: a */
    public final void mo8566a(SurfaceTexture surfaceTexture, C2257Dg dg) {
        if (dg != null) {
            long timestamp = surfaceTexture.getTimestamp();
            if (this.f7650c || Math.abs(timestamp - this.f7649b) >= this.f7648a) {
                this.f7650c = false;
                this.f7649b = timestamp;
                C3114ge.f9351a.post(new C2571Og(this, dg));
            }
        }
    }
}
