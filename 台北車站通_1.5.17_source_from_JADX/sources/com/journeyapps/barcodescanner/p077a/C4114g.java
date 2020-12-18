package com.journeyapps.barcodescanner.p077a;

import android.util.Log;

/* renamed from: com.journeyapps.barcodescanner.a.g */
class C4114g implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C4118k f12208a;

    C4114g(C4118k kVar) {
        this.f12208a = kVar;
    }

    public void run() {
        try {
            Log.d(C4118k.f12212a, "Opening camera");
            this.f12208a.f12215d.mo11640h();
        } catch (Exception e) {
            this.f12208a.m16429a(e);
            Log.e(C4118k.f12212a, "Failed to open camera", e);
        }
    }
}
