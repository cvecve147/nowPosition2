package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioManager;

@TargetApi(14)
@C2478La
/* renamed from: com.google.android.gms.internal.ads.Xg */
public final class C2832Xg implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a */
    private final AudioManager f8608a;

    /* renamed from: b */
    private final C2888Zg f8609b;

    /* renamed from: c */
    private boolean f8610c;

    /* renamed from: d */
    private boolean f8611d;

    /* renamed from: e */
    private boolean f8612e;

    /* renamed from: f */
    private float f8613f = 1.0f;

    public C2832Xg(Context context, C2888Zg zg) {
        this.f8608a = (AudioManager) context.getSystemService("audio");
        this.f8609b = zg;
    }

    /* renamed from: d */
    private final void m11563d() {
        boolean z;
        boolean z2;
        boolean z3 = false;
        boolean z4 = this.f8611d && !this.f8612e && this.f8613f > 0.0f;
        if (z4 && !(z2 = this.f8610c)) {
            AudioManager audioManager = this.f8608a;
            if (audioManager != null && !z2) {
                if (audioManager.requestAudioFocus(this, 3, 2) == 1) {
                    z3 = true;
                }
                this.f8610c = z3;
            }
            this.f8609b.mo8027a();
        } else if (!z4 && (z = this.f8610c)) {
            AudioManager audioManager2 = this.f8608a;
            if (audioManager2 != null && z) {
                if (audioManager2.abandonAudioFocus(this) == 0) {
                    z3 = true;
                }
                this.f8610c = z3;
            }
            this.f8609b.mo8027a();
        }
    }

    /* renamed from: a */
    public final float mo9029a() {
        float f = this.f8612e ? 0.0f : this.f8613f;
        if (this.f8610c) {
            return f;
        }
        return 0.0f;
    }

    /* renamed from: a */
    public final void mo9030a(float f) {
        this.f8613f = f;
        m11563d();
    }

    /* renamed from: a */
    public final void mo9031a(boolean z) {
        this.f8612e = z;
        m11563d();
    }

    /* renamed from: b */
    public final void mo9032b() {
        this.f8611d = true;
        m11563d();
    }

    /* renamed from: c */
    public final void mo9033c() {
        this.f8611d = false;
        m11563d();
    }

    public final void onAudioFocusChange(int i) {
        this.f8610c = i > 0;
        this.f8609b.mo8027a();
    }
}
