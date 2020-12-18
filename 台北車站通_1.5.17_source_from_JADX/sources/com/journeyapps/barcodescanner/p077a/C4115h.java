package com.journeyapps.barcodescanner.p077a;

import android.util.Log;
import p101d.p129g.p159f.p163b.p164a.C5766l;

/* renamed from: com.journeyapps.barcodescanner.a.h */
class C4115h implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C4118k f12209a;

    C4115h(C4118k kVar) {
        this.f12209a = kVar;
    }

    public void run() {
        try {
            Log.d(C4118k.f12212a, "Configuring camera");
            this.f12209a.f12215d.mo11635c();
            if (this.f12209a.f12216e != null) {
                this.f12209a.f12216e.obtainMessage(C5766l.zxing_prewiew_size_ready, this.f12209a.m16434h()).sendToTarget();
            }
        } catch (Exception e) {
            this.f12209a.m16429a(e);
            Log.e(C4118k.f12212a, "Failed to configure camera", e);
        }
    }
}
