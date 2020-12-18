package p101d.p129g.p131b.p132a.p137e.p139b;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: d.g.b.a.e.b.j */
final class C5498j extends WeakReference<Throwable> {

    /* renamed from: a */
    private final int f15407a;

    public C5498j(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        if (th != null) {
            this.f15407a = System.identityHashCode(th);
            return;
        }
        throw new NullPointerException("The referent cannot be null");
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == C5498j.class) {
            if (this == obj) {
                return true;
            }
            C5498j jVar = (C5498j) obj;
            return this.f15407a == jVar.f15407a && get() == jVar.get();
        }
    }

    public final int hashCode() {
        return this.f15407a;
    }
}
