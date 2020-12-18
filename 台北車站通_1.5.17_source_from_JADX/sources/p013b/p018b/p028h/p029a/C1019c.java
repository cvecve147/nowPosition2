package p013b.p018b.p028h.p029a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: b.b.h.a.c */
class C1019c extends Handler {

    /* renamed from: a */
    final /* synthetic */ C1020d f3914a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1019c(C1020d dVar, Looper looper) {
        super(looper);
        this.f3914a = dVar;
    }

    public void handleMessage(Message message) {
        if (message.what != 1) {
            super.handleMessage(message);
        } else {
            this.f3914a.m5431a();
        }
    }
}
