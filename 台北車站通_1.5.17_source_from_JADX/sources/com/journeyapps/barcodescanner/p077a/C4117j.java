package com.journeyapps.barcodescanner.p077a;

import android.util.Log;

/* renamed from: com.journeyapps.barcodescanner.a.j */
class C4117j implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C4118k f12211a;

    C4117j(C4118k kVar) {
        this.f12211a = kVar;
    }

    public void run() {
        try {
            Log.d(C4118k.f12212a, "Closing camera");
            this.f12211a.f12215d.mo11642j();
            this.f12211a.f12215d.mo11634b();
        } catch (Exception e) {
            Log.e(C4118k.f12212a, "Failed to close camera", e);
        }
        this.f12211a.f12213b.mo11656a();
    }
}
