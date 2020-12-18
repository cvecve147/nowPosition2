package p101d.p122f.p123a.p126c;

import java.util.concurrent.Callable;
import p208e.p209a.p210a.p211a.C6199f;

/* renamed from: d.f.a.c.l */
class C5427l implements Callable<T> {

    /* renamed from: a */
    final /* synthetic */ Callable f15293a;

    /* renamed from: b */
    final /* synthetic */ C5429m f15294b;

    C5427l(C5429m mVar, Callable callable) {
        this.f15294b = mVar;
        this.f15293a = callable;
    }

    public T call() {
        try {
            return this.f15293a.call();
        } catch (Exception e) {
            C6199f.m23420f().mo16266b("CrashlyticsCore", "Failed to execute task.", e);
            return null;
        }
    }
}
