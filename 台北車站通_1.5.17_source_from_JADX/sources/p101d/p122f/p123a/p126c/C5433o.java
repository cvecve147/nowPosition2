package p101d.p122f.p123a.p126c;

import java.util.concurrent.Callable;
import p208e.p209a.p210a.p211a.C6199f;
import p208e.p209a.p210a.p211a.p212a.p220g.C6182q;

/* renamed from: d.f.a.c.o */
class C5433o implements Callable<Boolean> {

    /* renamed from: a */
    final /* synthetic */ C6182q f15305a;

    /* renamed from: b */
    final /* synthetic */ C5446y f15306b;

    C5433o(C5446y yVar, C6182q qVar) {
        this.f15306b = yVar;
        this.f15305a = qVar;
    }

    public Boolean call() {
        if (this.f15306b.mo14904g()) {
            C6199f.m23420f().mo16269d("CrashlyticsCore", "Skipping session finalization because a crash has already occurred.");
            return Boolean.FALSE;
        }
        C6199f.m23420f().mo16269d("CrashlyticsCore", "Finalizing previously open sessions.");
        this.f15306b.m20879a(this.f15305a, true);
        C6199f.m23420f().mo16269d("CrashlyticsCore", "Closed all previously open sessions");
        return Boolean.TRUE;
    }
}
