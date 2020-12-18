package p267i.p274b.p277b.p280b.p281a;

import android.os.CountDownTimer;

/* renamed from: i.b.b.b.a.h */
class C6727h extends CountDownTimer {

    /* renamed from: a */
    final /* synthetic */ C6729j f18691a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C6727h(C6729j jVar, long j, long j2) {
        super(j, j2);
        this.f18691a = jVar;
    }

    public void onFinish() {
        if (this.f18691a.m25505g()) {
            if (this.f18691a.f18696c != null) {
                this.f18691a.f18696c.mo17213g();
            }
            this.f18691a.m25508j();
        }
    }

    public void onTick(long j) {
    }
}
