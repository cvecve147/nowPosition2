package p267i.p274b.p277b.p280b.p281a;

import android.os.Handler;
import android.os.Message;

/* renamed from: i.b.b.b.a.d */
class C6723d extends Handler {

    /* renamed from: a */
    final /* synthetic */ C6729j f18685a;

    C6723d(C6729j jVar) {
        this.f18685a = jVar;
    }

    public void handleMessage(Message message) {
        C6729j jVar = this.f18685a;
        int unused = jVar.f18709p = jVar.f18709p + 1;
        if (this.f18685a.f18709p >= 5 && this.f18685a.m25505g()) {
            if (this.f18685a.f18696c != null) {
                this.f18685a.f18696c.mo17212b();
            }
            this.f18685a.m25508j();
        }
    }
}
