package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.internal.C2061y;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.df */
public final class C3028df {

    /* renamed from: a */
    private HandlerThread f9060a = null;

    /* renamed from: b */
    private Handler f9061b = null;

    /* renamed from: c */
    private int f9062c = 0;

    /* renamed from: d */
    private final Object f9063d = new Object();

    /* renamed from: a */
    public final Handler mo9308a() {
        return this.f9061b;
    }

    /* renamed from: b */
    public final Looper mo9309b() {
        Looper looper;
        synchronized (this.f9063d) {
            if (this.f9062c != 0) {
                C2061y.m9068a(this.f9060a, (Object) "Invalid state: mHandlerThread should already been initialized.");
            } else if (this.f9060a == null) {
                C2857Yd.m11615f("Starting the looper thread.");
                this.f9060a = new HandlerThread("LooperProvider");
                this.f9060a.start();
                this.f9061b = new Handler(this.f9060a.getLooper());
                C2857Yd.m11615f("Looper thread started.");
            } else {
                C2857Yd.m11615f("Resuming the looper thread");
                this.f9063d.notifyAll();
            }
            this.f9062c++;
            looper = this.f9060a.getLooper();
        }
        return looper;
    }
}
