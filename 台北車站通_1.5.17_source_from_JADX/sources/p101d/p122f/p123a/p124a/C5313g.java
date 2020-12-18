package p101d.p122f.p123a.p124a;

import p101d.p122f.p123a.p124a.C5301B;
import p208e.p209a.p210a.p211a.C6199f;

/* renamed from: d.f.a.a.g */
class C5313g implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C5301B.C5302a f15038a;

    /* renamed from: b */
    final /* synthetic */ boolean f15039b;

    /* renamed from: c */
    final /* synthetic */ C5314h f15040c;

    C5313g(C5314h hVar, C5301B.C5302a aVar, boolean z) {
        this.f15040c = hVar;
        this.f15038a = aVar;
        this.f15039b = z;
    }

    public void run() {
        try {
            this.f15040c.f15047g.mo14710a(this.f15038a);
            if (this.f15039b) {
                this.f15040c.f15047g.mo14712b();
            }
        } catch (Exception e) {
            C6199f.m23420f().mo16266b("Answers", "Failed to process event", e);
        }
    }
}
