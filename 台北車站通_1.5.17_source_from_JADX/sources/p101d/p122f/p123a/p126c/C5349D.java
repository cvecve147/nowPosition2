package p101d.p122f.p123a.p126c;

import java.util.concurrent.Callable;
import p208e.p209a.p210a.p211a.C6199f;
import p208e.p209a.p210a.p211a.C6211p;

/* renamed from: d.f.a.c.D */
class C5349D implements Callable<Boolean> {

    /* renamed from: a */
    final /* synthetic */ C5351F f15121a;

    C5349D(C5351F f) {
        this.f15121a = f;
    }

    public Boolean call() {
        try {
            boolean c = this.f15121a.f15125i.mo14770c();
            C6211p f = C6199f.m23420f();
            f.mo16269d("CrashlyticsCore", "Initialization marker file removed: " + c);
            return Boolean.valueOf(c);
        } catch (Exception e) {
            C6199f.m23420f().mo16266b("CrashlyticsCore", "Problem encountered deleting Crashlytics initialization marker.", e);
            return false;
        }
    }
}
