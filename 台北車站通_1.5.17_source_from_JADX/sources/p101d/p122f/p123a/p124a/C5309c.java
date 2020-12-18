package p101d.p122f.p123a.p124a;

import p208e.p209a.p210a.p211a.C6199f;

/* renamed from: d.f.a.a.c */
class C5309c implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C5314h f15034a;

    C5309c(C5314h hVar) {
        this.f15034a = hVar;
    }

    public void run() {
        try {
            C5333z zVar = this.f15034a.f15047g;
            this.f15034a.f15047g = new C5322o();
            zVar.mo14714d();
        } catch (Exception e) {
            C6199f.m23420f().mo16266b("Answers", "Failed to disable events", e);
        }
    }
}
