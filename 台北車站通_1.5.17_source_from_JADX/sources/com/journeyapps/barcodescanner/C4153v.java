package com.journeyapps.barcodescanner;

import android.os.Handler;
import android.os.Message;
import p101d.p129g.p159f.p163b.p164a.C5766l;

/* renamed from: com.journeyapps.barcodescanner.v */
class C4153v implements Handler.Callback {

    /* renamed from: a */
    final /* synthetic */ C4155x f12332a;

    C4153v(C4155x xVar) {
        this.f12332a = xVar;
    }

    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i == C5766l.zxing_decode) {
            this.f12332a.m16586b((C4102D) message.obj);
            return true;
        } else if (i != C5766l.zxing_preview_failed) {
            return true;
        } else {
            this.f12332a.m16587c();
            return true;
        }
    }
}
