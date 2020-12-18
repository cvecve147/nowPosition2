package android.arch.lifecycle;

import android.arch.lifecycle.C0026d;

public class CompositeGeneratedAdaptersObserver implements GenericLifecycleObserver {

    /* renamed from: a */
    private final C0025c[] f102a;

    /* renamed from: a */
    public void mo37a(C0030f fVar, C0026d.C0027a aVar) {
        C0035j jVar = new C0035j();
        for (C0025c a : this.f102a) {
            a.mo51a(fVar, aVar, false, jVar);
        }
        for (C0025c a2 : this.f102a) {
            a2.mo51a(fVar, aVar, true, jVar);
        }
    }
}
