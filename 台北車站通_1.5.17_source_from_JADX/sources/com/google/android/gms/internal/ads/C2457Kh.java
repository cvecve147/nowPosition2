package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.common.util.C2084f;
import java.util.HashMap;
import java.util.Map;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Kh */
public final class C2457Kh extends C3015cu {

    /* renamed from: a */
    private final C2749Ug f7445a;

    /* renamed from: b */
    private final Object f7446b = new Object();

    /* renamed from: c */
    private final boolean f7447c;

    /* renamed from: d */
    private final boolean f7448d;

    /* renamed from: e */
    private final float f7449e;

    /* renamed from: f */
    private int f7450f;

    /* renamed from: g */
    private C3073eu f7451g;

    /* renamed from: h */
    private boolean f7452h;

    /* renamed from: i */
    private boolean f7453i = true;

    /* renamed from: j */
    private float f7454j;

    /* renamed from: k */
    private float f7455k;

    /* renamed from: l */
    private boolean f7456l = true;

    /* renamed from: m */
    private boolean f7457m;

    /* renamed from: n */
    private boolean f7458n;

    public C2457Kh(C2749Ug ug, float f, boolean z, boolean z2) {
        this.f7445a = ug;
        this.f7449e = f;
        this.f7447c = z;
        this.f7448d = z2;
    }

    /* renamed from: a */
    private final void m10412a(String str, Map<String, String> map) {
        HashMap hashMap = map == null ? new HashMap() : new HashMap(map);
        hashMap.put("action", str);
        C2972bg.f8938a.execute(new C2485Lh(this, hashMap));
    }

    /* renamed from: Fa */
    public final int mo8400Fa() {
        int i;
        synchronized (this.f7446b) {
            i = this.f7450f;
        }
        return i;
    }

    /* renamed from: Ka */
    public final void mo8401Ka() {
        m10412a("play", (Map<String, String>) null);
    }

    /* renamed from: La */
    public final boolean mo8402La() {
        boolean z;
        synchronized (this.f7446b) {
            z = this.f7447c && this.f7457m;
        }
        return z;
    }

    /* renamed from: a */
    public final void mo8403a(float f, int i, boolean z, float f2) {
        boolean z2;
        int i2;
        synchronized (this.f7446b) {
            this.f7454j = f;
            z2 = this.f7453i;
            this.f7453i = z;
            i2 = this.f7450f;
            this.f7450f = i;
            float f3 = this.f7455k;
            this.f7455k = f2;
            if (Math.abs(this.f7455k - f3) > 1.0E-4f) {
                this.f7445a.getView().invalidate();
            }
        }
        C2972bg.f8938a.execute(new C2515Mh(this, i2, i, z2, z));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo8404a(int i, int i2, boolean z, boolean z2) {
        synchronized (this.f7446b) {
            boolean z3 = false;
            boolean z4 = i != i2;
            boolean z5 = !this.f7452h && i2 == 1;
            boolean z6 = z4 && i2 == 1;
            boolean z7 = z4 && i2 == 2;
            boolean z8 = z4 && i2 == 3;
            boolean z9 = z != z2;
            if (this.f7452h || z5) {
                z3 = true;
            }
            this.f7452h = z3;
            if (this.f7451g != null) {
                if (z5) {
                    try {
                        this.f7451g.mo9408Ga();
                    } catch (RemoteException e) {
                        C2227Cf.m9535c("Unable to call onVideoStart()", e);
                    }
                }
                if (z6) {
                    try {
                        this.f7451g.mo9409Ia();
                    } catch (RemoteException e2) {
                        C2227Cf.m9535c("Unable to call onVideoPlay()", e2);
                    }
                }
                if (z7) {
                    try {
                        this.f7451g.mo9412ha();
                    } catch (RemoteException e3) {
                        C2227Cf.m9535c("Unable to call onVideoPause()", e3);
                    }
                }
                if (z8) {
                    try {
                        this.f7451g.mo9410R();
                    } catch (RemoteException e4) {
                        C2227Cf.m9535c("Unable to call onVideoEnd()", e4);
                    }
                }
                if (z9) {
                    try {
                        this.f7451g.mo9411d(z2);
                    } catch (RemoteException e5) {
                        C2227Cf.m9535c("Unable to call onVideoMute()", e5);
                    }
                }
            } else {
                return;
            }
        }
        return;
    }

    /* renamed from: a */
    public final void mo8405a(C3073eu euVar) {
        synchronized (this.f7446b) {
            this.f7451g = euVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo8406a(Map map) {
        this.f7445a.mo8149a("pubVideoCmd", (Map<String, ?>) map);
    }

    /* renamed from: aa */
    public final boolean mo8407aa() {
        boolean z;
        boolean La = mo8402La();
        synchronized (this.f7446b) {
            if (!La) {
                try {
                    if (this.f7458n && this.f7448d) {
                        z = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            z = false;
        }
        return z;
    }

    /* renamed from: b */
    public final void mo8408b(zzmu zzmu) {
        synchronized (this.f7446b) {
            this.f7456l = zzmu.f10905a;
            this.f7457m = zzmu.f10906b;
            this.f7458n = zzmu.f10907c;
        }
        m10412a("initialState", C2084f.m9122a("muteStart", zzmu.f10905a ? "1" : "0", "customControlsRequested", zzmu.f10906b ? "1" : "0", "clickToExpandRequested", zzmu.f10907c ? "1" : "0"));
    }

    /* renamed from: ba */
    public final float mo8409ba() {
        float f;
        synchronized (this.f7446b) {
            f = this.f7455k;
        }
        return f;
    }

    /* renamed from: ca */
    public final C3073eu mo8410ca() {
        C3073eu euVar;
        synchronized (this.f7446b) {
            euVar = this.f7451g;
        }
        return euVar;
    }

    /* renamed from: g */
    public final void mo8411g(boolean z) {
        m10412a(z ? "mute" : "unmute", (Map<String, String>) null);
    }

    /* renamed from: ia */
    public final boolean mo8412ia() {
        boolean z;
        synchronized (this.f7446b) {
            z = this.f7453i;
        }
        return z;
    }

    public final void pause() {
        m10412a("pause", (Map<String, String>) null);
    }

    /* renamed from: qa */
    public final float mo8414qa() {
        return this.f7449e;
    }

    /* renamed from: va */
    public final float mo8415va() {
        float f;
        synchronized (this.f7446b) {
            f = this.f7454j;
        }
        return f;
    }
}
