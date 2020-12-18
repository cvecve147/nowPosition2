package com.journeyapps.barcodescanner.p077a;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: com.journeyapps.barcodescanner.a.o */
class C4124o {

    /* renamed from: a */
    private static C4124o f12257a;

    /* renamed from: b */
    private Handler f12258b;

    /* renamed from: c */
    private HandlerThread f12259c;

    /* renamed from: d */
    private int f12260d = 0;

    /* renamed from: e */
    private final Object f12261e = new Object();

    private C4124o() {
    }

    /* renamed from: b */
    public static C4124o m16481b() {
        if (f12257a == null) {
            f12257a = new C4124o();
        }
        return f12257a;
    }

    /* renamed from: c */
    private void m16482c() {
        synchronized (this.f12261e) {
            if (this.f12258b == null) {
                if (this.f12260d > 0) {
                    this.f12259c = new HandlerThread("CameraThread");
                    this.f12259c.start();
                    this.f12258b = new Handler(this.f12259c.getLooper());
                } else {
                    throw new IllegalStateException("CameraThread is not open");
                }
            }
        }
    }

    /* renamed from: d */
    private void m16483d() {
        synchronized (this.f12261e) {
            this.f12259c.quit();
            this.f12259c = null;
            this.f12258b = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11656a() {
        synchronized (this.f12261e) {
            this.f12260d--;
            if (this.f12260d == 0) {
                m16483d();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11657a(Runnable runnable) {
        synchronized (this.f12261e) {
            m16482c();
            this.f12258b.post(runnable);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo11658b(Runnable runnable) {
        synchronized (this.f12261e) {
            this.f12260d++;
            mo11657a(runnable);
        }
    }
}
