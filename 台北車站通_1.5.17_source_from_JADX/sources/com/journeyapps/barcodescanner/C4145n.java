package com.journeyapps.barcodescanner;

import android.util.Log;

/* renamed from: com.journeyapps.barcodescanner.n */
class C4145n implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C4149r f12312a;

    C4145n(C4149r rVar) {
        this.f12312a = rVar;
    }

    public void run() {
        Log.d(C4149r.f12316a, "Finishing due to inactivity");
        this.f12312a.m16560i();
    }
}
