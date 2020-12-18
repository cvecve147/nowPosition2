package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.ye */
public final class C3631ye {

    /* renamed from: a */
    private boolean f10556a = false;

    /* renamed from: b */
    private float f10557b = 1.0f;

    /* renamed from: a */
    public static float m14576a(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return 0.0f;
        }
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamVolume = audioManager.getStreamVolume(3);
        if (streamMaxVolume == 0) {
            return 0.0f;
        }
        return ((float) streamVolume) / ((float) streamMaxVolume);
    }

    /* renamed from: c */
    private final synchronized boolean m14577c() {
        return this.f10557b >= 0.0f;
    }

    /* renamed from: a */
    public final synchronized float mo10229a() {
        if (!m14577c()) {
            return 1.0f;
        }
        return this.f10557b;
    }

    /* renamed from: a */
    public final synchronized void mo10230a(float f) {
        this.f10557b = f;
    }

    /* renamed from: a */
    public final synchronized void mo10231a(boolean z) {
        this.f10556a = z;
    }

    /* renamed from: b */
    public final synchronized boolean mo10232b() {
        return this.f10556a;
    }
}
