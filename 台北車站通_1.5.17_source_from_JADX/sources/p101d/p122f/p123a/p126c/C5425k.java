package p101d.p122f.p123a.p126c;

import p208e.p209a.p210a.p211a.C6199f;

/* renamed from: d.f.a.c.k */
class C5425k implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Runnable f15291a;

    /* renamed from: b */
    final /* synthetic */ C5429m f15292b;

    C5425k(C5429m mVar, Runnable runnable) {
        this.f15292b = mVar;
        this.f15291a = runnable;
    }

    public void run() {
        try {
            this.f15291a.run();
        } catch (Exception e) {
            C6199f.m23420f().mo16266b("CrashlyticsCore", "Failed to execute task.", e);
        }
    }
}
