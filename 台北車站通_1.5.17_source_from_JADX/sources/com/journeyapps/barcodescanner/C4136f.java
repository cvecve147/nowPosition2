package com.journeyapps.barcodescanner;

import android.os.Handler;
import android.os.Message;
import p101d.p129g.p159f.p163b.p164a.C5766l;

/* renamed from: com.journeyapps.barcodescanner.f */
class C4136f implements Handler.Callback {

    /* renamed from: a */
    final /* synthetic */ C4140j f12277a;

    C4136f(C4140j jVar) {
        this.f12277a = jVar;
    }

    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i == C5766l.zxing_prewiew_size_ready) {
            this.f12277a.m16522b((C4101C) message.obj);
            return true;
        } else if (i != C5766l.zxing_camera_error) {
            return false;
        } else {
            Exception exc = (Exception) message.obj;
            if (!this.f12277a.mo11693c()) {
                return false;
            }
            this.f12277a.mo11556e();
            this.f12277a.f12282A.mo11599a(exc);
            return false;
        }
    }
}
