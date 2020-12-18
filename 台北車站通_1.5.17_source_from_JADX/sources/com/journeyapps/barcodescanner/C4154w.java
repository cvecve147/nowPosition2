package com.journeyapps.barcodescanner;

import com.journeyapps.barcodescanner.p077a.C4129t;
import p101d.p129g.p159f.p163b.p164a.C5766l;

/* renamed from: com.journeyapps.barcodescanner.w */
class C4154w implements C4129t {

    /* renamed from: a */
    final /* synthetic */ C4155x f12333a;

    C4154w(C4155x xVar) {
        this.f12333a = xVar;
    }

    /* renamed from: a */
    public void mo11666a(C4102D d) {
        synchronized (this.f12333a.f12342i) {
            if (this.f12333a.f12341h) {
                this.f12333a.f12337d.obtainMessage(C5766l.zxing_decode, d).sendToTarget();
            }
        }
    }

    /* renamed from: a */
    public void mo11667a(Exception exc) {
        synchronized (this.f12333a.f12342i) {
            if (this.f12333a.f12341h) {
                this.f12333a.f12337d.obtainMessage(C5766l.zxing_preview_failed).sendToTarget();
            }
        }
    }
}
