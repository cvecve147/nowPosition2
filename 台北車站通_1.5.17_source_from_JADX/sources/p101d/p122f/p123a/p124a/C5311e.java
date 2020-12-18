package p101d.p122f.p123a.p124a;

import p208e.p209a.p210a.p211a.C6199f;
import p208e.p209a.p210a.p211a.p212a.p217d.C6138e;

/* renamed from: d.f.a.a.e */
class C5311e implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C5314h f15036a;

    C5311e(C5314h hVar) {
        this.f15036a = hVar;
    }

    public void run() {
        try {
            C5304C a = this.f15036a.f15044d.mo14673a();
            C5330w a2 = this.f15036a.f15043c.mo14692a();
            a2.mo16162a((C6138e) this.f15036a);
            this.f15036a.f15047g = new C5323p(this.f15036a.f15041a, this.f15036a.f15042b, this.f15036a.f15046f, a2, this.f15036a.f15045e, a);
        } catch (Exception e) {
            C6199f.m23420f().mo16266b("Answers", "Failed to enable events", e);
        }
    }
}
