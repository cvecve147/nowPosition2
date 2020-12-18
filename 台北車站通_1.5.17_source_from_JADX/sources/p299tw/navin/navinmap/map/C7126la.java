package p299tw.navin.navinmap.map;

import android.os.Handler;
import android.os.Message;
import p267i.p268a.p269a.C6684c;
import p267i.p274b.p277b.p278a.p279a.C6705b;

/* renamed from: tw.navin.navinmap.map.la */
class C7126la extends Handler {

    /* renamed from: a */
    final /* synthetic */ C7132na f19673a;

    C7126la(C7132na naVar) {
        this.f19673a = naVar;
    }

    public void handleMessage(Message message) {
        int i = message.what;
        if (i == C6684c.refresh_token_success) {
            this.f19673a.mo21217a((String) message.obj);
        } else if (i == C6684c.refresh_token_failed) {
            this.f19673a.mo21220b((C6705b.C6706a) message.obj);
        }
    }
}
