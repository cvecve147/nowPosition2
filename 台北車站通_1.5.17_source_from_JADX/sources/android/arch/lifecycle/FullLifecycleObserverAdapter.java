package android.arch.lifecycle;

import android.arch.lifecycle.C0026d;

class FullLifecycleObserverAdapter implements GenericLifecycleObserver {

    /* renamed from: a */
    private final FullLifecycleObserver f103a;

    /* renamed from: a */
    public void mo37a(C0030f fVar, C0026d.C0027a aVar) {
        switch (C0024b.f120a[aVar.ordinal()]) {
            case 1:
                this.f103a.mo41d(fVar);
                return;
            case 2:
                this.f103a.mo38a(fVar);
                return;
            case 3:
                this.f103a.mo42e(fVar);
                return;
            case 4:
                this.f103a.mo39b(fVar);
                return;
            case 5:
                this.f103a.mo43f(fVar);
                return;
            case 6:
                this.f103a.mo40c(fVar);
                return;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
            default:
                return;
        }
    }
}
