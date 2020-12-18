package p101d.p129g.p131b.p132a.p137e.p140c;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: d.g.b.a.e.c.f */
final class C5507f extends WeakReference<Throwable> {

    /* renamed from: a */
    private final int f15417a;

    public C5507f(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        if (th != null) {
            this.f15417a = System.identityHashCode(th);
            return;
        }
        throw new NullPointerException("The referent cannot be null");
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == C5507f.class) {
            if (this == obj) {
                return true;
            }
            C5507f fVar = (C5507f) obj;
            return this.f15417a == fVar.f15417a && get() == fVar.get();
        }
    }

    public final int hashCode() {
        return this.f15417a;
    }
}
