package p299tw.navin.navinmap.map;

import android.os.Handler;
import android.os.Message;
import p267i.p268a.p269a.C6684c;
import p267i.p274b.p277b.p278a.p279a.C6705b;

/* renamed from: tw.navin.navinmap.map.oa */
class C7134oa extends Handler {

    /* renamed from: a */
    final /* synthetic */ C7139qa f19700a;

    C7134oa(C7139qa qaVar) {
        this.f19700a = qaVar;
    }

    public void handleMessage(Message message) {
        int i = message.what;
        if (i == C6684c.request_user_trace_success) {
            this.f19700a.m26858c();
        } else if (i == C6684c.request_user_trace_failed) {
            this.f19700a.m26859c((C6705b.C6706a) message.obj);
        }
    }
}
