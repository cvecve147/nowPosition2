package p299tw.navin.navinmap.map;

import android.os.Message;
import p267i.p268a.p269a.C6684c;
import p267i.p268a.p269a.p271b.C6681d;
import p267i.p274b.p277b.p278a.p279a.C6705b;

/* renamed from: tw.navin.navinmap.map.t */
class C7142t implements C6681d.C6682a {

    /* renamed from: a */
    final /* synthetic */ C7143u f19714a;

    C7142t(C7143u uVar) {
        this.f19714a = uVar;
    }

    /* renamed from: a */
    public void mo17129a(C6705b.C6706a aVar) {
        Message message = new Message();
        message.what = C6684c.refresh_token_failed;
        message.obj = aVar;
        this.f19714a.f19727m.sendMessage(message);
    }

    /* renamed from: a */
    public void mo17130a(String str) {
        Message message = new Message();
        message.what = C6684c.refresh_token_success;
        message.obj = str;
        this.f19714a.f19727m.sendMessage(message);
    }
}
