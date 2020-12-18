package p101d.p122f.p123a.p124a;

import p208e.p209a.p210a.p211a.C6199f;

/* renamed from: d.f.a.a.d */
class C5310d implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C5314h f15035a;

    C5310d(C5314h hVar) {
        this.f15035a = hVar;
    }

    public void run() {
        try {
            this.f15035a.f15047g.mo14709a();
        } catch (Exception e) {
            C6199f.m23420f().mo16266b("Answers", "Failed to send events files", e);
        }
    }
}
