package p013b.p018b.p028h.p037f;

import android.os.Handler;
import android.os.Message;

/* renamed from: b.b.h.f.g */
class C1063g implements Handler.Callback {

    /* renamed from: a */
    final /* synthetic */ C1067k f3993a;

    C1063g(C1067k kVar) {
        this.f3993a = kVar;
    }

    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            this.f3993a.m5577a();
            return true;
        } else if (i != 1) {
            return true;
        } else {
            this.f3993a.m5580a((Runnable) message.obj);
            return true;
        }
    }
}
