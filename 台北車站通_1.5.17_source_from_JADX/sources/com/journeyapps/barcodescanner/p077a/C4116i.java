package com.journeyapps.barcodescanner.p077a;

import android.util.Log;

/* renamed from: com.journeyapps.barcodescanner.a.i */
class C4116i implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C4118k f12210a;

    C4116i(C4118k kVar) {
        this.f12210a = kVar;
    }

    public void run() {
        try {
            Log.d(C4118k.f12212a, "Starting preview");
            this.f12210a.f12215d.mo11630a(this.f12210a.f12214c);
            this.f12210a.f12215d.mo11641i();
        } catch (Exception e) {
            this.f12210a.m16429a(e);
            Log.e(C4118k.f12212a, "Failed to start preview", e);
        }
    }
}
