package p101d.p129g.p131b.p132a.p137e.p139b;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: d.g.b.a.e.b.i */
final class C5497i {

    /* renamed from: a */
    private final ConcurrentHashMap<C5498j, List<Throwable>> f15405a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b */
    private final ReferenceQueue<Throwable> f15406b = new ReferenceQueue<>();

    C5497i() {
    }

    /* renamed from: a */
    public final List<Throwable> mo14945a(Throwable th, boolean z) {
        while (true) {
            Reference<? extends Throwable> poll = this.f15406b.poll();
            if (poll == null) {
                break;
            }
            this.f15405a.remove(poll);
        }
        List<Throwable> list = this.f15405a.get(new C5498j(th, (ReferenceQueue<Throwable>) null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> putIfAbsent = this.f15405a.putIfAbsent(new C5498j(th, this.f15406b), vector);
        return putIfAbsent == null ? vector : putIfAbsent;
    }
}
