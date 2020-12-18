package android.support.p007v4.app;

import android.os.Handler;
import android.os.Message;

/* renamed from: android.support.v4.app.m */
class C0343m extends Handler {

    /* renamed from: a */
    final /* synthetic */ C0344n f1461a;

    C0343m(C0344n nVar) {
        this.f1461a = nVar;
    }

    public void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            C0344n nVar = this.f1461a;
            if (nVar.f1468g) {
                nVar.mo1428a(false);
            }
        } else if (i != 2) {
            super.handleMessage(message);
        } else {
            this.f1461a.mo1433f();
            this.f1461a.f1463b.mo1485j();
        }
    }
}
